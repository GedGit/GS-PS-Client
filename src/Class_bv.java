/* Class_bv - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_bv {
	float[][] field_e_661;
	int field_d_662;
	int field_n_663;
	int[] field_y_664;
	int[] field_z_665;
	int[] field_g_666;

	Class_bv() {
		Class_bz.method_y_int(24);
		this.field_n_663 = Class_bz.method_y_int(16);
		this.field_d_662 = Class_bz.method_y_int(24);
		this.field_z_665 = new int[this.field_d_662];
		final boolean bool = Class_bz.method_z_int() != 0;
		if (bool) {
			int i = 0;
			int i_0_ = Class_bz.method_y_int(5) + 1;
			while (i < this.field_d_662) {
				final int i_1_ = Class_bz.method_y_int(Class_al.method_y_int(this.field_d_662 - i, (byte) -36));
				for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
					this.field_z_665[i++] = i_0_;
				}
				i_0_++;
			}
		} else {
			final boolean bool_3_ = Class_bz.method_z_int() != 0;
			for (int i = 0; i < this.field_d_662; i++) {
				if (bool_3_ && (Class_bz.method_z_int() == 0)) {
					this.field_z_665[i] = 0;
				} else {
					this.field_z_665[i] = Class_bz.method_y_int(5) + 1;
				}
			}
		}
		method_d_void();
		final int i = Class_bz.method_y_int(4);
		if (i > 0) {
			final float f = Class_bz.method_n_float(Class_bz.method_y_int(32));
			final float f_4_ = Class_bz.method_n_float(Class_bz.method_y_int(32));
			final int i_5_ = Class_bz.method_y_int(4) + 1;
			final boolean bool_6_ = Class_bz.method_z_int() != 0;
			int i_7_;
			if (i == 1) {
				i_7_ = method_n_int(this.field_d_662, this.field_n_663);
			} else {
				i_7_ = (this.field_d_662 * this.field_n_663);
			}
			this.field_y_664 = new int[i_7_];
			for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
				this.field_y_664[i_8_] = Class_bz.method_y_int(i_5_);
			}
			this.field_e_661 = (new float[this.field_d_662][this.field_n_663]);
			if (i == 1) {
				for (int i_9_ = 0; i_9_ < this.field_d_662; i_9_++) {
					float f_10_ = 0.0F;
					int i_11_ = 1;
					for (int i_12_ = 0; i_12_ < this.field_n_663; i_12_++) {
						final int i_13_ = (i_9_ / i_11_) % i_7_;
						final float f_14_ = ((this.field_y_664[i_13_] * f_4_) + f + f_10_);
						this.field_e_661[i_9_][i_12_] = f_14_;
						if (bool_6_) {
							f_10_ = f_14_;
						}
						i_11_ *= i_7_;
					}
				}
			} else {
				for (int i_15_ = 0; i_15_ < this.field_d_662; i_15_++) {
					float f_16_ = 0.0F;
					int i_17_ = i_15_ * this.field_n_663;
					for (int i_18_ = 0; i_18_ < this.field_n_663; i_18_++) {
						final float f_19_ = ((this.field_y_664[i_17_] * f_4_) + f + f_16_);
						this.field_e_661[i_15_][i_18_] = f_19_;
						if (bool_6_) {
							f_16_ = f_19_;
						}
						i_17_++;
					}
				}
			}
		}
	}

	void method_d_void() {
		final int[] is = new int[this.field_d_662];
		final int[] is_20_ = new int[33];
		for (int i = 0; i < this.field_d_662; i++) {
			final int i_21_ = this.field_z_665[i];
			if (i_21_ != 0) {
				final int i_22_ = 1 << (32 - i_21_);
				final int i_23_ = is_20_[i_21_];
				is[i] = i_23_;
				int i_24_;
				if ((i_23_ & i_22_) != 0) {
					i_24_ = is_20_[i_21_ - 1];
				} else {
					i_24_ = i_23_ | i_22_;
					for (int i_25_ = i_21_ - 1; i_25_ >= 1; i_25_--) {
						final int i_26_ = is_20_[i_25_];
						if (i_26_ != i_23_) {
							break;
						}
						final int i_27_ = 1 << (32 - i_25_);
						if ((i_26_ & i_27_) != 0) {
							is_20_[i_25_] = is_20_[i_25_ - 1];
							break;
						}
						is_20_[i_25_] = i_26_ | i_27_;
					}
				}
				is_20_[i_21_] = i_24_;
				for (int i_28_ = i_21_ + 1; i_28_ <= 32; i_28_++) {
					final int i_29_ = is_20_[i_28_];
					if (i_29_ == i_23_) {
						is_20_[i_28_] = i_24_;
					}
				}
			}
		}
		this.field_g_666 = new int[8];
		int i = 0;
		for (int i_30_ = 0; i_30_ < this.field_d_662; i_30_++) {
			final int i_31_ = this.field_z_665[i_30_];
			if (i_31_ != 0) {
				final int i_32_ = is[i_30_];
				int i_33_ = 0;
				for (int i_34_ = 0; i_34_ < i_31_; i_34_++) {
					int i_35_ = -2147483648 >>> i_34_;
		if ((i_32_ & i_35_) != 0) {
			if (this.field_g_666[i_33_] == 0) {
				this.field_g_666[i_33_] = i;
			}
			i_33_ = this.field_g_666[i_33_];
		} else {
			i_33_++;
		}
		if (i_33_ >= this.field_g_666.length) {
			final int[] is_36_ = (new int[this.field_g_666.length * 2]);
			for (int i_37_ = 0; i_37_ < this.field_g_666.length; i_37_++) {
				is_36_[i_37_] = this.field_g_666[i_37_];
			}
			this.field_g_666 = is_36_;
		}
		i_35_ >>>= 1;
				}
				this.field_g_666[i_33_] = i_30_ ^ 0xffffffff;
				if (i_33_ >= i) {
					i = i_33_ + 1;
				}
			}
		}
	}

	int method_z_int() {
		int i;
		for (i = 0; this.field_g_666[i] >= 0; i = (Class_bz.method_z_int() != 0 ? this.field_g_666[i] : i + 1)) {
			/* empty */
		}
		return this.field_g_666[i] ^ 0xffffffff;
	}

	float[] method_y_floatArray() {
		return this.field_e_661[method_z_int()];
	}

	static int method_n_int(final int i, final int i_38_) {
		int i_39_ = (int) Math.pow(i, 1.0 / i_38_) + 1;
		for (;;) {
			int i_40_ = i_39_;
			int i_41_ = i_38_;
			int i_42_ = 1;
			for (/**/; i_41_ > 1; i_41_ >>= 1) {
				if ((i_41_ & 0x1) != 0) {
					i_42_ *= i_40_;
				}
				i_40_ *= i_40_;
			}
			int i_43_;
			if (i_41_ == 1) {
				i_43_ = i_42_ * i_40_;
			} else {
				i_43_ = i_42_;
			}
			if (i_43_ <= i) {
				return i_39_;
			}
			i_39_--;
		}
	}
}
