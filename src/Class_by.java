/* Class_by - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class_by {
	int[] field_h_690 = new int[5];
	Class_bs field_d_691;
	Class_bs field_z_692;
	Class_bs field_y_693;
	Class_bs field_e_694;
	Class_bs field_g_695;
	Class_bs field_f_696;
	Class_bs field_m_697;
	Class_br field_k_698;
	Class_bs field_n_699;
	int[] field_l_700 = new int[5];
	int field_u_701 = 0;
	static int[] field_c_702;
	int field_q_703 = 100;
	static int[] field_w_704;
	int field_r_705 = 500;
	int field_j_706 = 0;
	static int[] field_s_707;
	static int[] field_v_708 = new int[32768];
	Class_bs field_x_709;
	static final double field_p_710 = 1.0057929410678534;
	static int[] field_o_711;
	static int[] field_b_712;
	static int[] field_t_713;
	int[] field_a_714 = new int[5];
	static int[] field_i_715;

	static {
		final Random random = new Random(0L);
		for (int i = 0; i < 32768; i++) {
			field_v_708[i] = (random.nextInt() & 0x2) - 1;
		}
		field_c_702 = new int[32768];
		for (int i = 0; i < 32768; i++) {
			field_c_702[i] = (int) (Math.sin(i / 5215.1903) * 16384.0);
		}
		field_s_707 = new int[220500];
		field_o_711 = new int[5];
		field_b_712 = new int[5];
		field_t_713 = new int[5];
		field_w_704 = new int[5];
		field_i_715 = new int[5];
	}

	final int[] method_n_intArray(final int i, final int i_0_) {
		Class_dq.method_h_void(field_s_707, 0, i);
		if (i_0_ < 10) {
			return field_s_707;
		}
		final double d = i / (i_0_ + 0.0);
		this.field_n_699.method_z_void();
		this.field_d_691.method_z_void();
		int i_1_ = 0;
		int i_2_ = 0;
		int i_3_ = 0;
		if (this.field_z_692 != null) {
			this.field_z_692.method_z_void();
			this.field_y_693.method_z_void();
			i_1_ = (int) ((((this.field_z_692.field_g_646) - (this.field_z_692).field_e_643) * 32.768) / d);
			i_2_ = (int) (((this.field_z_692.field_e_643) * 32.768) / d);
		}
		int i_4_ = 0;
		int i_5_ = 0;
		int i_6_ = 0;
		if (this.field_e_694 != null) {
			this.field_e_694.method_z_void();
			this.field_g_695.method_z_void();
			i_4_ = (int) ((((this.field_e_694.field_g_646) - (this.field_e_694).field_e_643) * 32.768) / d);
			i_5_ = (int) (((this.field_e_694.field_e_643) * 32.768) / d);
		}
		for (int i_7_ = 0; i_7_ < 5; i_7_++) {
			if (this.field_a_714[i_7_] != 0) {
				field_o_711[i_7_] = 0;
				field_b_712[i_7_] = (int) (this.field_l_700[i_7_] * d);
				field_t_713[i_7_] = (this.field_a_714[i_7_] << 14) / 100;
				field_w_704[i_7_] = (int) ((((this.field_n_699).field_g_646 - (this.field_n_699.field_e_643)) * 32.768 * Math.pow(1.0057929410678534, (this.field_h_690[i_7_]))) / d);
				field_i_715[i_7_] = (int) (((this.field_n_699).field_e_643 * 32.768) / d);
			}
		}
		for (int i_8_ = 0; i_8_ < i; i_8_++) {
			int i_9_ = this.field_n_699.method_y_int(i);
			int i_10_ = this.field_d_691.method_y_int(i);
			if (this.field_z_692 != null) {
				final int i_11_ = this.field_z_692.method_y_int(i);
				final int i_12_ = this.field_y_693.method_y_int(i);
				i_9_ += method_d_int(i_3_, i_12_, (this.field_z_692.field_f_642)) >> 1;
		i_3_ += ((i_11_ * i_1_) >> 16) + i_2_;
			}
			if (this.field_e_694 != null) {
				final int i_13_ = this.field_e_694.method_y_int(i);
				final int i_14_ = this.field_g_695.method_y_int(i);
				i_10_ = (i_10_ * ((method_d_int(i_6_, i_14_, (this.field_e_694.field_f_642)) >> 1) + 32768)) >> 15;
		i_6_ += ((i_13_ * i_4_) >> 16) + i_5_;
			}
			for (int i_15_ = 0; i_15_ < 5; i_15_++) {
				if (this.field_a_714[i_15_] != 0) {
					final int i_16_ = i_8_ + field_b_712[i_15_];
					if (i_16_ < i) {
						field_s_707[i_16_] += method_d_int(field_o_711[i_15_], (i_10_ * field_t_713[i_15_]) >> 15, (this.field_n_699.field_f_642));
						field_o_711[i_15_] += ((i_9_ * field_w_704[i_15_]) >> 16) + field_i_715[i_15_];
					}
				}
			}
		}
		if (this.field_f_696 != null) {
			this.field_f_696.method_z_void();
			this.field_m_697.method_z_void();
			int i_17_ = 0;
			boolean bool_18_ = true;
			for (int i_19_ = 0; i_19_ < i; i_19_++) {
				final int i_20_ = this.field_f_696.method_y_int(i);
				final int i_21_ = this.field_m_697.method_y_int(i);
				int i_22_;
				if (bool_18_) {
					i_22_ = ((this.field_f_696.field_e_643) + ((((this.field_f_696.field_g_646) - (this.field_f_696.field_e_643)) * i_20_) >> 8));
				} else {
					i_22_ = ((this.field_f_696.field_e_643) + ((((this.field_f_696.field_g_646) - (this.field_f_696.field_e_643)) * i_21_) >> 8));
				}
				i_17_ += 256;
				if (i_17_ >= i_22_) {
					i_17_ = 0;
					bool_18_ = !bool_18_;
				}
				if (bool_18_) {
					field_s_707[i_19_] = 0;
				}
			}
		}
		if ((this.field_u_701 > 0) && (this.field_q_703 > 0)) {
			final int i_23_ = (int) (this.field_u_701 * d);
			for (int i_24_ = i_23_; i_24_ < i; i_24_++) {
				field_s_707[i_24_] += ((field_s_707[i_24_ - i_23_] * this.field_q_703) / 100);
			}
		}
		if ((this.field_k_698.field_n_639[0] > 0) || (this.field_k_698.field_n_639[1] > 0)) {
			this.field_x_709.method_z_void();
			int i_25_ = this.field_x_709.method_y_int(i + 1);
			int i_26_ = this.field_k_698.method_y_int(0, i_25_ / 65536.0F);
			int i_27_ = this.field_k_698.method_y_int(1, i_25_ / 65536.0F);
			if (i >= (i_26_ + i_27_)) {
				int i_28_ = 0;
				int i_29_ = i_27_;
				if (i_27_ > (i - i_26_)) {
					i_29_ = i - i_26_;
				}
				for (/**/; i_28_ < i_29_; i_28_++) {
					int i_30_ = (int) (((long) field_s_707[i_28_ + i_26_] * (long) Class_br.field_a_638) >> 16);
					for (int i_31_ = 0; i_31_ < i_26_; i_31_++) {
						i_30_ += (int) (((long) (field_s_707[(i_28_ + i_26_) - 1 - i_31_]) * (long) Class_br.field_f_636[0][i_31_]) >> 16);
					}
					for (int i_32_ = 0; i_32_ < i_28_; i_32_++) {
						i_30_ -= (int) (((long) field_s_707[i_28_ - 1 - i_32_] * (long) Class_br.field_f_636[1][i_32_]) >> 16);
					}
					field_s_707[i_28_] = i_30_;
					i_25_ = this.field_x_709.method_y_int(i + 1);
				}
				i_29_ = 128;
				for (;;) {
					if (i_29_ > (i - i_26_)) {
						i_29_ = i - i_26_;
					}
					for (/**/; i_28_ < i_29_; i_28_++) {
						int i_33_ = (int) (((long) field_s_707[i_28_ + i_26_] * (long) Class_br.field_a_638) >> 16);
						for (int i_34_ = 0; i_34_ < i_26_; i_34_++) {
							i_33_ += (int) (((long) field_s_707[((i_28_ + i_26_) - 1 - i_34_)] * (long) (Class_br.field_f_636[0][i_34_])) >> 16);
						}
						for (int i_35_ = 0; i_35_ < i_27_; i_35_++) {
							i_33_ -= (int) (((long) (field_s_707[i_28_ - 1 - i_35_]) * (long) (Class_br.field_f_636[1][i_35_])) >> 16);
						}
						field_s_707[i_28_] = i_33_;
						i_25_ = this.field_x_709.method_y_int(i + 1);
					}
					if (i_28_ >= (i - i_26_)) {
						for (/**/; i_28_ < i; i_28_++) {
							int i_36_ = 0;
							for (int i_37_ = (i_28_ + i_26_) - i; i_37_ < i_26_; i_37_++) {
								i_36_ += (int) (((long) field_s_707[((i_28_ + i_26_) - 1 - i_37_)] * (long) (Class_br.field_f_636[0][i_37_])) >> 16);
							}
							for (int i_38_ = 0; i_38_ < i_27_; i_38_++) {
								i_36_ -= (int) (((long) (field_s_707[i_28_ - 1 - i_38_]) * (long) (Class_br.field_f_636[1][i_38_])) >> 16);
							}
							field_s_707[i_28_] = i_36_;
							this.field_x_709.method_y_int(i + 1);
						}
						break;
					}
					i_26_ = this.field_k_698.method_y_int(0, i_25_ / 65536.0F);
					i_27_ = this.field_k_698.method_y_int(1, i_25_ / 65536.0F);
					i_29_ += 128;
				}
			}
		}
		for (int i_39_ = 0; i_39_ < i; i_39_++) {
			if (field_s_707[i_39_] < -32768) {
				field_s_707[i_39_] = -32768;
			}
			if (field_s_707[i_39_] > 32767) {
				field_s_707[i_39_] = 32767;
			}
		}
		return field_s_707;
	}

	final void method_z_void(final Buffer rsbytebuffer) {
		this.field_n_699 = new Class_bs();
		this.field_n_699.method_n_void(rsbytebuffer);
		this.field_d_691 = new Class_bs();
		this.field_d_691.method_n_void(rsbytebuffer);
		int i = rsbytebuffer.get();
		if (i != 0) {
			rsbytebuffer.position -= -685856689;
			this.field_z_692 = new Class_bs();
			this.field_z_692.method_n_void(rsbytebuffer);
			this.field_y_693 = new Class_bs();
			this.field_y_693.method_n_void(rsbytebuffer);
		}
		i = rsbytebuffer.get();
		if (i != 0) {
			rsbytebuffer.position -= -685856689;
			this.field_e_694 = new Class_bs();
			this.field_e_694.method_n_void(rsbytebuffer);
			this.field_g_695 = new Class_bs();
			this.field_g_695.method_n_void(rsbytebuffer);
		}
		i = rsbytebuffer.get();
		if (i != 0) {
			rsbytebuffer.position -= -685856689;
			this.field_f_696 = new Class_bs();
			this.field_f_696.method_n_void(rsbytebuffer);
			this.field_m_697 = new Class_bs();
			this.field_m_697.method_n_void(rsbytebuffer);
		}
		for (int i_40_ = 0; i_40_ < 10; i_40_++) {
			final int i_41_ = rsbytebuffer.getSmart((byte) 110);
			if (i_41_ == 0) {
				break;
			}
			this.field_a_714[i_40_] = i_41_;
			this.field_h_690[i_40_] = rsbytebuffer.method_al_int((byte) -34);
			this.field_l_700[i_40_] = rsbytebuffer.getSmart((byte) 100);
		}
		this.field_u_701 = rsbytebuffer.getSmart((byte) 66);
		this.field_q_703 = rsbytebuffer.getSmart((byte) 71);
		this.field_r_705 = rsbytebuffer.getShort();
		this.field_j_706 = rsbytebuffer.getShort();
		this.field_k_698 = new Class_br();
		this.field_x_709 = new Class_bs();
		this.field_k_698.method_e_void(rsbytebuffer, this.field_x_709);
	}

	Class_by() {
		/* empty */
	}

	final int method_d_int(final int i, final int i_42_, final int i_43_) {
		return (i_43_ == 1 ? (i & 0x7fff) < 16384 ? i_42_ : -i_42_ : i_43_ == 2 ? (field_c_702[i & 0x7fff] * i_42_) >> 14 : i_43_ == 3 ? (((i & 0x7fff) * i_42_) >> 14) - i_42_ : i_43_ == 4 ? field_v_708[(i / 2607) & 0x7fff] * i_42_ : 0);
	}
}
