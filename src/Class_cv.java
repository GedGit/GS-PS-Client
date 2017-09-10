/* Class_cv - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class_cv {
	int[] field_d_1365;
	int[] field_g_1366;
	int[] field_z_1367;
	int[] field_y_1368;
	int[] field_e_1369;
	int[] field_n_1370;
	static final int[][] field_o_1371 = { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 },
		{ 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };
	static int[] field_v_1372 = new int[6];
	int[] field_a_1373;
	int[] field_m_1374;
	boolean field_l_1375 = true;
	int field_u_1376;
	int field_q_1377;
	int field_k_1378;
	int field_x_1379;
	static int[] field_r_1380 = new int[6];
	static int[] field_j_1381 = new int[6];
	static int[] field_s_1382 = new int[6];
	int[] field_h_1383;
	static int[] field_c_1384 = new int[6];
	static final int[][] field_p_1385 = { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };
	int[] field_f_1386;

	Class_cv(final int i, final int i_0_, final int i_1_, final int i_2_, final int i_3_, final int i_4_, final int i_5_, final int i_6_, final int i_7_, final int i_8_, final int i_9_, final int i_10_, final int i_11_, final int i_12_, final int i_13_, final int i_14_, final int i_15_, final int i_16_, final int i_17_) {
		if ((i_4_ != i_5_) || (i_4_ != i_6_) || (i_4_ != i_7_)) {
			this.field_l_1375 = false;
		}
		this.field_u_1376 = i;
		this.field_q_1377 = i_0_;
		this.field_k_1378 = i_16_;
		this.field_x_1379 = i_17_;
		final int i_18_ = 128;
		final int i_19_ = i_18_ / 2;
		final int i_20_ = i_18_ / 4;
		final int i_21_ = (i_18_ * 3) / 4;
		final int[] is = field_p_1385[i];
		final int i_22_ = is.length;
		this.field_n_1370 = new int[i_22_];
		this.field_d_1365 = new int[i_22_];
		this.field_z_1367 = new int[i_22_];
		final int[] is_23_ = new int[i_22_];
		final int[] is_24_ = new int[i_22_];
		final int i_25_ = i_2_ * i_18_;
		final int i_26_ = i_3_ * i_18_;
		for (int i_27_ = 0; i_27_ < i_22_; i_27_++) {
			int i_28_ = is[i_27_];
			if (((i_28_ & 0x1) == 0) && (i_28_ <= 8)) {
				i_28_ = ((i_28_ - i_0_ - i_0_ - 1) & 0x7) + 1;
			}
			if ((i_28_ > 8) && (i_28_ <= 12)) {
				i_28_ = ((i_28_ - 9 - i_0_) & 0x3) + 9;
			}
			if ((i_28_ > 12) && (i_28_ <= 16)) {
				i_28_ = ((i_28_ - 13 - i_0_) & 0x3) + 13;
			}
			int i_29_;
			int i_30_;
			int i_31_;
			int i_32_;
			int i_33_;
			if (i_28_ == 1) {
				i_29_ = i_25_;
				i_30_ = i_26_;
				i_31_ = i_4_;
				i_32_ = i_8_;
				i_33_ = i_12_;
			} else if (i_28_ == 2) {
				i_29_ = i_25_ + i_19_;
				i_30_ = i_26_;
				i_31_ = (i_4_ + i_5_) >> 1;
			i_32_ = (i_8_ + i_9_) >> 1;
			i_33_ = (i_12_ + i_13_) >> 1;
			} else if (i_28_ == 3) {
				i_29_ = i_25_ + i_18_;
				i_30_ = i_26_;
				i_31_ = i_5_;
				i_32_ = i_9_;
				i_33_ = i_13_;
			} else if (i_28_ == 4) {
				i_29_ = i_25_ + i_18_;
				i_30_ = i_26_ + i_19_;
				i_31_ = (i_5_ + i_6_) >> 1;
				i_32_ = (i_9_ + i_10_) >> 1;
				i_33_ = (i_13_ + i_14_) >> 1;
			} else if (i_28_ == 5) {
				i_29_ = i_25_ + i_18_;
				i_30_ = i_26_ + i_18_;
				i_31_ = i_6_;
				i_32_ = i_10_;
				i_33_ = i_14_;
			} else if (i_28_ == 6) {
				i_29_ = i_25_ + i_19_;
				i_30_ = i_26_ + i_18_;
				i_31_ = (i_6_ + i_7_) >> 1;
				i_32_ = (i_10_ + i_11_) >> 1;
				i_33_ = (i_14_ + i_15_) >> 1;
			} else if (i_28_ == 7) {
				i_29_ = i_25_;
				i_30_ = i_26_ + i_18_;
				i_31_ = i_7_;
				i_32_ = i_11_;
				i_33_ = i_15_;
			} else if (i_28_ == 8) {
				i_29_ = i_25_;
				i_30_ = i_26_ + i_19_;
				i_31_ = (i_7_ + i_4_) >> 1;
				i_32_ = (i_11_ + i_8_) >> 1;
				i_33_ = (i_15_ + i_12_) >> 1;
			} else if (i_28_ == 9) {
				i_29_ = i_25_ + i_19_;
				i_30_ = i_26_ + i_20_;
				i_31_ = (i_4_ + i_5_) >> 1;
				i_32_ = (i_8_ + i_9_) >> 1;
				i_33_ = (i_12_ + i_13_) >> 1;
			} else if (i_28_ == 10) {
				i_29_ = i_25_ + i_21_;
				i_30_ = i_26_ + i_19_;
				i_31_ = (i_5_ + i_6_) >> 1;
				i_32_ = (i_9_ + i_10_) >> 1;
				i_33_ = (i_13_ + i_14_) >> 1;
			} else if (i_28_ == 11) {
				i_29_ = i_25_ + i_19_;
				i_30_ = i_26_ + i_21_;
				i_31_ = (i_6_ + i_7_) >> 1;
				i_32_ = (i_10_ + i_11_) >> 1;
				i_33_ = (i_14_ + i_15_) >> 1;
			} else if (i_28_ == 12) {
				i_29_ = i_25_ + i_20_;
				i_30_ = i_26_ + i_19_;
				i_31_ = (i_7_ + i_4_) >> 1;
				i_32_ = (i_11_ + i_8_) >> 1;
				i_33_ = (i_15_ + i_12_) >> 1;
			} else if (i_28_ == 13) {
				i_29_ = i_25_ + i_20_;
				i_30_ = i_26_ + i_20_;
				i_31_ = i_4_;
				i_32_ = i_8_;
				i_33_ = i_12_;
			} else if (i_28_ == 14) {
				i_29_ = i_25_ + i_21_;
				i_30_ = i_26_ + i_20_;
				i_31_ = i_5_;
				i_32_ = i_9_;
				i_33_ = i_13_;
			} else if (i_28_ == 15) {
				i_29_ = i_25_ + i_21_;
				i_30_ = i_26_ + i_21_;
				i_31_ = i_6_;
				i_32_ = i_10_;
				i_33_ = i_14_;
			} else {
				i_29_ = i_25_ + i_20_;
				i_30_ = i_26_ + i_21_;
				i_31_ = i_7_;
				i_32_ = i_11_;
				i_33_ = i_15_;
			}
			this.field_n_1370[i_27_] = i_29_;
			this.field_d_1365[i_27_] = i_31_;
			this.field_z_1367[i_27_] = i_30_;
			is_23_[i_27_] = i_32_;
			is_24_[i_27_] = i_33_;
		}
		final int[] is_34_ = field_o_1371[i];
		final int i_35_ = is_34_.length / 4;
		this.field_f_1386 = new int[i_35_];
		this.field_m_1374 = new int[i_35_];
		this.field_a_1373 = new int[i_35_];
		this.field_y_1368 = new int[i_35_];
		this.field_e_1369 = new int[i_35_];
		this.field_g_1366 = new int[i_35_];
		if (i_1_ != -1) {
			this.field_h_1383 = new int[i_35_];
		}
		int i_36_ = 0;
		for (int i_37_ = 0; i_37_ < i_35_; i_37_++) {
			final int i_38_ = is_34_[i_36_];
			int i_39_ = is_34_[i_36_ + 1];
			int i_40_ = is_34_[i_36_ + 2];
			int i_41_ = is_34_[i_36_ + 3];
			i_36_ += 4;
			if (i_39_ < 4) {
				i_39_ = (i_39_ - i_0_) & 0x3;
			}
			if (i_40_ < 4) {
				i_40_ = (i_40_ - i_0_) & 0x3;
			}
			if (i_41_ < 4) {
				i_41_ = (i_41_ - i_0_) & 0x3;
			}
			this.field_f_1386[i_37_] = i_39_;
			this.field_m_1374[i_37_] = i_40_;
			this.field_a_1373[i_37_] = i_41_;
			if (i_38_ == 0) {
				this.field_y_1368[i_37_] = is_23_[i_39_];
				this.field_e_1369[i_37_] = is_23_[i_40_];
				this.field_g_1366[i_37_] = is_23_[i_41_];
				if (this.field_h_1383 != null) {
					this.field_h_1383[i_37_] = -1;
				}
			} else {
				this.field_y_1368[i_37_] = is_24_[i_39_];
				this.field_e_1369[i_37_] = is_24_[i_40_];
				this.field_g_1366[i_37_] = is_24_[i_41_];
				if (this.field_h_1383 != null) {
					this.field_h_1383[i_37_] = i_1_;
				}
			}
		}
		int i_42_ = i_4_;
		int i_43_ = i_5_;
		if (i_5_ < i_4_) {
			i_42_ = i_5_;
		}
		if (i_5_ > i_5_) {
			i_43_ = i_5_;
		}
		if (i_6_ < i_42_) {
			i_42_ = i_6_;
		}
		if (i_6_ > i_43_) {
			i_43_ = i_6_;
		}
		if (i_7_ < i_42_) {
			i_42_ = i_7_;
		}
		if (i_7_ > i_43_) {
			i_43_ = i_7_;
		}
		i_42_ /= 14;
		i_43_ /= 14;
	}
}
