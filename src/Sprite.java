/* Class_be - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Sprite extends Rasterizer {
	
	public byte[] field_n_531;
	public int spriteWidth;
	public int field_z_533;
	public int field_y_534;
	public int field_e_535;
	public int spriteHeight;
	public int field_g_537;
	public int[] field_d_538;

	public void method_n_void() {
		if ((field_z_533 != spriteWidth) || (field_y_534 != spriteHeight)) {
			final byte[] is = new byte[spriteWidth * spriteHeight];
			int i = 0;
			for (int i_0_ = 0; i_0_ < field_y_534; i_0_++) {
				for (int i_1_ = 0; i_1_ < field_z_533; i_1_++) {
					is[i_1_ + field_e_535 + ((i_0_ + field_g_537) * spriteWidth)] = field_n_531[i++];
				}
			}
			field_n_531 = is;
			field_z_533 = spriteWidth;
			field_y_534 = spriteHeight;
			field_e_535 = 0;
			field_g_537 = 0;
		}
	}

	public void render(int i, int i_2_) {
		i += field_e_535;
		i_2_ += field_g_537;
		int i_3_ = i + (i_2_ * width);
		int i_4_ = 0;
		int i_5_ = field_y_534;
		int i_6_ = field_z_533;
		int i_7_ = width - i_6_;
		int i_8_ = 0;
		if (i_2_ < field_r_512) {
			final int i_9_ = field_r_512 - i_2_;
			i_5_ -= i_9_;
			i_2_ = field_r_512;
			i_4_ += i_9_ * i_6_;
			i_3_ += i_9_ * width;
		}
		if ((i_2_ + i_5_) > field_j_513) {
			i_5_ -= (i_2_ + i_5_) - field_j_513;
		}
		if (i < field_s_514) {
			final int i_10_ = field_s_514 - i;
			i_6_ -= i_10_;
			i = field_s_514;
			i_4_ += i_10_;
			i_3_ += i_10_;
			i_8_ += i_10_;
			i_7_ += i_10_;
		}
		if ((i + i_6_) > field_v_509) {
			final int i_11_ = (i + i_6_) - field_v_509;
			i_6_ -= i_11_;
			i_8_ += i_11_;
			i_7_ += i_11_;
		}
		if ((i_6_ > 0) && (i_5_ > 0)) {
			rasterize(pixels, field_n_531, field_d_538, i_4_, i_3_, i_6_, i_5_, i_7_, i_8_);
		}
	}

	static void rasterize(final int[] is, final byte[] is_12_, final int[] is_13_, int i, int i_14_, int i_15_,
			final int i_16_, final int i_17_, final int i_18_) {
		final int i_19_ = -(i_15_ >> 2);
		i_15_ = -(i_15_ & 0x3);
		for (int i_20_ = -i_16_; i_20_ < 0; i_20_++) {
			for (int i_21_ = i_19_; i_21_ < 0; i_21_++) {
				int i_22_ = is_12_[i++];
				if (i_22_ != 0) {
					is[i_14_++] = is_13_[i_22_ & 0xff];
				} else {
					i_14_++;
				}
				i_22_ = is_12_[i++];
				if (i_22_ != 0) {
					is[i_14_++] = is_13_[i_22_ & 0xff];
				} else {
					i_14_++;
				}
				i_22_ = is_12_[i++];
				if (i_22_ != 0) {
					is[i_14_++] = is_13_[i_22_ & 0xff];
				} else {
					i_14_++;
				}
				i_22_ = is_12_[i++];
				if (i_22_ != 0) {
					is[i_14_++] = is_13_[i_22_ & 0xff];
				} else {
					i_14_++;
				}
			}
			for (int i_23_ = i_15_; i_23_ < 0; i_23_++) {
				final int i_24_ = is_12_[i++];
				if (i_24_ != 0) {
					is[i_14_++] = is_13_[i_24_ & 0xff];
				} else {
					i_14_++;
				}
			}
			i_14_ += i_17_;
			i += i_18_;
		}
	}

	public void method_d_void(final int i, final int i_25_, final int i_26_) {
		for (int i_27_ = 0; i_27_ < field_d_538.length; i_27_++) {
			int i_28_ = (field_d_538[i_27_] >> 16) & 0xff;
			i_28_ += i;
			if (i_28_ < 0) {
				i_28_ = 0;
			} else if (i_28_ > 255) {
				i_28_ = 255;
			}
			int i_29_ = (field_d_538[i_27_] >> 8) & 0xff;
			i_29_ += i_25_;
			if (i_29_ < 0) {
				i_29_ = 0;
			} else if (i_29_ > 255) {
				i_29_ = 255;
			}
			int i_30_ = field_d_538[i_27_] & 0xff;
			i_30_ += i_26_;
			if (i_30_ < 0) {
				i_30_ = 0;
			} else if (i_30_ > 255) {
				i_30_ = 255;
			}
			field_d_538[i_27_] = (i_28_ << 16) + (i_29_ << 8) + i_30_;
		}
	}

	Sprite() {
		/* empty */
	}
}
