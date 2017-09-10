/* Class_bl - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_bl extends Node {
	static final int field_y_587 = 3;
	static final int field_d_588 = 1;
	static final int field_z_589 = 2;
	int[] field_a_590;
	int field_e_591;
	boolean field_g_592;
	static final int field_n_593 = 0;
	int[] field_m_594;
	int field_u_595;
	int[] field_f_596;
	int field_l_597;
	int[] field_h_598;
	int[] field_q_599;
	boolean field_k_600 = false;
	static int[] field_x_601;

	Class_bl(final Buffer rsbytebuffer) {
		this.field_e_591 = rsbytebuffer.getShort();
		this.field_g_592 = rsbytebuffer.get() == 1;
		final int i = rsbytebuffer.get();
		if ((i >= 1) && (i <= 4)) {
			this.field_f_596 = new int[i];
			for (int i_0_ = 0; i_0_ < i; i_0_++) {
				this.field_f_596[i_0_] = rsbytebuffer.getShort();
			}
			if (i > 1) {
				this.field_m_594 = new int[i - 1];
				for (int i_1_ = 0; i_1_ < (i - 1); i_1_++) {
					this.field_m_594[i_1_] = rsbytebuffer.get();
				}
			}
			if (i > 1) {
				this.field_a_590 = new int[i - 1];
				for (int i_2_ = 0; i_2_ < (i - 1); i_2_++) {
					this.field_a_590[i_2_] = rsbytebuffer.get();
				}
			}
			this.field_h_598 = new int[i];
			for (int i_3_ = 0; i_3_ < i; i_3_++) {
				this.field_h_598[i_3_] = rsbytebuffer.getInt();
			}
			this.field_l_597 = rsbytebuffer.get();
			this.field_u_595 = rsbytebuffer.get();
			this.field_q_599 = null;
		} else {
			throw new RuntimeException();
		}
	}

	boolean method_n_boolean(final double d, final int i, final FileStore class_fs) {
		for (final int element : this.field_f_596) {
			if (class_fs.method_h_byteArray((element), -1331086201) == null) {
				return false;
			}
		}
		final int i_5_ = i * i;
		this.field_q_599 = new int[i_5_];
		for (int i_6_ = 0; i_6_ < this.field_f_596.length; i_6_++) {
			final Sprite class_be = Friend.method_m_be(class_fs, this.field_f_596[i_6_], (byte) -62);
			class_be.method_n_void();
			final byte[] is = class_be.field_n_531;
			final int[] is_7_ = class_be.field_d_538;
			final int i_8_ = this.field_h_598[i_6_];
			if ((i_8_ & ~0xffffff) != 16777216) {
				/* empty */
			}
			if ((i_8_ & ~0xffffff) != 33554432) {
				/* empty */
			}
			if ((i_8_ & ~0xffffff) == 50331648) {
				final int i_9_ = i_8_ & 0xff00ff;
				final int i_10_ = (i_8_ >> 8) & 0xff;
		for (int i_11_ = 0; i_11_ < is_7_.length; i_11_++) {
			int i_12_ = is_7_[i_11_];
			if ((i_12_ & 0xffff) == (i_12_ >> 8)) {
				i_12_ &= 0xff;
				is_7_[i_11_] = ((((i_9_ * i_12_) >> 8) & 0xff00ff) | ((i_10_ * i_12_) & 0xff00));
			}
		}
			}
			for (int i_13_ = 0; i_13_ < is_7_.length; i_13_++) {
				is_7_[i_13_] = Rasterizer3D.adjustBrightnessRGB(is_7_[i_13_], d);
			}
			int i_14_;
			if (i_6_ == 0) {
				i_14_ = 0;
			} else {
				i_14_ = this.field_m_594[i_6_ - 1];
			}
			if (i_6_ != 0) {
				/* empty */
			}
			if (i_14_ == 0) {
				if (class_be.field_z_533 == i) {
					for (int i_15_ = 0; i_15_ < i_5_; i_15_++) {
						this.field_q_599[i_15_] = is_7_[is[i_15_] & 0xff];
					}
				} else if ((class_be.field_z_533 == 64) && (i == 128)) {
					int i_16_ = 0;
					for (int i_17_ = 0; i_17_ < i; i_17_++) {
						for (int i_18_ = 0; i_18_ < i; i_18_++) {
							this.field_q_599[i_16_++] = is_7_[(is[(i_18_ >> 1) + ((i_17_ >> 1) << 6)] & 0xff)];
						}
					}
				} else {
					if ((class_be.field_z_533 != 128) || (i != 64)) {
						throw new RuntimeException();
					}
					int i_19_ = 0;
					for (int i_20_ = 0; i_20_ < i; i_20_++) {
						for (int i_21_ = 0; i_21_ < i; i_21_++) {
							this.field_q_599[i_19_++] = is_7_[(is[(i_21_ << 1) + (i_20_ << 1 << 7)] & 0xff)];
						}
					}
				}
			}
			if (i_14_ != 1) {
				/* empty */
			}
			if (i_14_ != 2) {
				/* empty */
			}
			if (i_14_ != 3) {
				/* empty */
			}
		}
		return true;
	}

	void method_d_void() {
		this.field_q_599 = null;
	}

	void method_z_void(final int i) {
		if (this.field_q_599 != null) {
			if ((this.field_l_597 == 1) || (this.field_l_597 == 3)) {
				if ((field_x_601 == null) || (field_x_601.length < this.field_q_599.length)) {
					field_x_601 = new int[this.field_q_599.length];
				}
				int i_22_;
				if (this.field_q_599.length == 4096) {
					i_22_ = 64;
				} else {
					i_22_ = 128;
				}
				final int i_23_ = this.field_q_599.length;
				int i_24_ = i_22_ * i * this.field_u_595;
				final int i_25_ = i_23_ - 1;
				if (this.field_l_597 == 1) {
					i_24_ = -i_24_;
				}
				for (int i_26_ = 0; i_26_ < i_23_; i_26_++) {
					final int i_27_ = (i_26_ + i_24_) & i_25_;
					field_x_601[i_26_] = this.field_q_599[i_27_];
				}
				final int[] is = this.field_q_599;
				this.field_q_599 = field_x_601;
				field_x_601 = is;
			}
			if ((this.field_l_597 == 2) || (this.field_l_597 == 4)) {
				if ((field_x_601 == null) || (field_x_601.length < this.field_q_599.length)) {
					field_x_601 = new int[this.field_q_599.length];
				}
				int i_28_;
				if (this.field_q_599.length == 4096) {
					i_28_ = 64;
				} else {
					i_28_ = 128;
				}
				final int i_29_ = this.field_q_599.length;
				int i_30_ = i * this.field_u_595;
				final int i_31_ = i_28_ - 1;
				if (this.field_l_597 == 2) {
					i_30_ = -i_30_;
				}
				for (int i_32_ = 0; i_32_ < i_29_; i_32_ += i_28_) {
					for (int i_33_ = 0; i_33_ < i_28_; i_33_++) {
						final int i_34_ = i_32_ + i_33_;
						final int i_35_ = i_32_ + ((i_33_ + i_30_) & i_31_);
						field_x_601[i_34_] = this.field_q_599[i_35_];
					}
				}
				final int[] is = this.field_q_599;
				this.field_q_599 = field_x_601;
				field_x_601 = is;
			}
		}
	}
}
