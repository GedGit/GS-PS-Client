/* Class_bm - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_bm {
	int[] field_f_602;
	int field_n_608 = Class_bz.method_y_int(16);
	int field_d_603 = Class_bz.method_y_int(24);
	int field_z_604 = Class_bz.method_y_int(24);
	int field_y_605 = Class_bz.method_y_int(24) + 1;
	int field_e_606 = Class_bz.method_y_int(6) + 1;
	int field_g_607 = Class_bz.method_y_int(8);

	Class_bm() {
		final int[] is = new int[this.field_e_606];
		for (int i = 0; i < this.field_e_606; i++) {
			int i_0_ = 0;
			final int i_1_ = Class_bz.method_y_int(3);
			final boolean bool = Class_bz.method_z_int() != 0;
			if (bool) {
				i_0_ = Class_bz.method_y_int(5);
			}
			is[i] = (i_0_ << 3) | i_1_;
		}
		this.field_f_602 = new int[this.field_e_606 * 8];
		for (int i = 0; i < (this.field_e_606 * 8); i++) {
			this.field_f_602[i] = ((is[i >> 3] & (1 << (i & 0x7))) != 0 ? Class_bz.method_y_int(8) : -1);
		}
	}

	void method_n_void(final float[] fs, final int i, final boolean bool) {
		for (int i_2_ = 0; i_2_ < i; i_2_++) {
			fs[i_2_] = 0.0F;
		}
		if (!bool) {
			final int i_3_ = (Class_bz.field_u_720[this.field_g_607].field_n_663);
			final int i_4_ = (this.field_z_604 - this.field_d_603);
			final int i_5_ = i_4_ / this.field_y_605;
			final int[] is = new int[i_5_];
			for (int i_6_ = 0; i_6_ < 8; i_6_++) {
				int i_7_ = 0;
				while (i_7_ < i_5_) {
					if (i_6_ == 0) {
						int i_8_ = Class_bz.field_u_720[this.field_g_607].method_z_int();
						for (int i_9_ = i_3_ - 1; i_9_ >= 0; i_9_--) {
							if ((i_7_ + i_9_) < i_5_) {
								is[i_7_ + i_9_] = i_8_ % this.field_e_606;
							}
							i_8_ /= this.field_e_606;
						}
					}
					for (int i_10_ = 0; i_10_ < i_3_; i_10_++) {
						final int i_11_ = is[i_7_];
						final int i_12_ = this.field_f_602[(i_11_ * 8) + i_6_];
						if (i_12_ >= 0) {
							final int i_13_ = (this.field_d_603 + (i_7_ * this.field_y_605));
							final Class_bv class_bv = Class_bz.field_u_720[i_12_];
							if (this.field_n_608 == 0) {
								final int i_14_ = (this.field_y_605 / class_bv.field_n_663);
								for (int i_15_ = 0; i_15_ < i_14_; i_15_++) {
									final float[] fs_16_ = class_bv.method_y_floatArray();
									for (int i_17_ = 0; (i_17_ < class_bv.field_n_663); i_17_++) {
										fs[i_13_ + i_15_ + (i_17_ * i_14_)] += fs_16_[i_17_];
									}
								}
							} else {
								int i_18_ = 0;
								while (i_18_ < this.field_y_605) {
									final float[] fs_19_ = class_bv.method_y_floatArray();
									for (int i_20_ = 0; (i_20_ < class_bv.field_n_663); i_20_++) {
										fs[i_13_ + i_18_] += fs_19_[i_20_];
										i_18_++;
									}
								}
							}
						}
						if (++i_7_ >= i_5_) {
							break;
						}
					}
				}
			}
		}
	}
}
