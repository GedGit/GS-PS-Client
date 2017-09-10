/* Class_hd - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class_hd extends TypeFace {
	@Override
	final void method_o_void(final byte[] is, int i, int i_0_, int i_1_, int i_2_, final int i_3_) {
		int i_4_ = i + (i_0_ * width);
		int i_5_ = width - i_1_;
		int i_6_ = 0;
		int i_7_ = 0;
		if (i_0_ < field_r_512) {
			final int i_8_ = field_r_512 - i_0_;
			i_2_ -= i_8_;
			i_0_ = field_r_512;
			i_7_ += i_8_ * i_1_;
			i_4_ += i_8_ * width;
		}
		if ((i_0_ + i_2_) > field_j_513) {
			i_2_ -= (i_0_ + i_2_) - field_j_513;
		}
		if (i < field_s_514) {
			final int i_9_ = field_s_514 - i;
			i_1_ -= i_9_;
			i = field_s_514;
			i_7_ += i_9_;
			i_4_ += i_9_;
			i_6_ += i_9_;
			i_5_ += i_9_;
		}
		if ((i + i_1_) > field_v_509) {
			final int i_10_ = (i + i_1_) - field_v_509;
			i_1_ -= i_10_;
			i_6_ += i_10_;
			i_5_ += i_10_;
		}
		if ((i_1_ > 0) && (i_2_ > 0)) {
			method_w_void(pixels, is, i_3_, i_7_, i_4_, i_1_, i_2_, i_5_, i_6_);
		}
	}

	@Override
	final void method_b_void(final byte[] is, int i, int i_11_, int i_12_, int i_13_, final int i_14_, final int i_15_) {
		int i_16_ = i + (i_11_ * width);
		int i_17_ = width - i_12_;
		int i_18_ = 0;
		int i_19_ = 0;
		if (i_11_ < field_r_512) {
			final int i_20_ = field_r_512 - i_11_;
			i_13_ -= i_20_;
			i_11_ = field_r_512;
			i_19_ += i_20_ * i_12_;
			i_16_ += i_20_ * width;
		}
		if ((i_11_ + i_13_) > field_j_513) {
			i_13_ -= (i_11_ + i_13_) - field_j_513;
		}
		if (i < field_s_514) {
			final int i_21_ = field_s_514 - i;
			i_12_ -= i_21_;
			i = field_s_514;
			i_19_ += i_21_;
			i_16_ += i_21_;
			i_18_ += i_21_;
			i_17_ += i_21_;
		}
		if ((i + i_12_) > field_v_509) {
			final int i_22_ = (i + i_12_) - field_v_509;
			i_12_ -= i_22_;
			i_18_ += i_22_;
			i_17_ += i_22_;
		}
		if ((i_12_ > 0) && (i_13_ > 0)) {
			method_ad_void(pixels, is, i_14_, i_19_, i_16_, i_12_, i_13_, i_17_, i_18_, i_15_);
		}
	}

	public Class_hd(final byte[] is) {
		super(is);
	}

	public Class_hd(final byte[] is, final int[] is_23_, final int[] is_24_, final int[] is_25_, final int[] is_26_, final int[] is_27_, final byte[][] is_28_) {
		super(is, is_23_, is_24_, is_25_, is_26_, is_27_, is_28_);
	}
}
