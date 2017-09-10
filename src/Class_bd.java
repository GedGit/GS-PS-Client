/* Class_bd - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_bd extends Class_bu {
	int field_z_516;
	int field_x_517;
	int field_a_518;
	int field_y_519;
	int field_e_520;
	int field_g_521;
	int field_f_522;
	int field_m_523;
	int field_k_524;
	int field_h_525;
	int field_d_526;
	int field_u_527;
	int field_q_528;
	boolean field_l_529;
	int field_n_530;

	@Override
	int method_ay_int() {
		int i = (this.field_e_520 * 3) >> 6;
		i = (i ^ (i >> 31)) + (i >>> 31);
		if (this.field_m_523 == 0) {
			i -= ((i * this.field_n_530) / ((((Class_ba) this.field_s_659).field_d_506).length << 8));
		} else if (this.field_m_523 >= 0) {
			i -= ((i * this.field_a_518) / (((Class_ba) this.field_s_659).field_d_506).length);
		}
		return i > 255 ? 255 : i;
	}

	Class_bd(final Class_ba class_ba, final int i, final int i_0_) {
		this.field_s_659 = class_ba;
		this.field_a_518 = class_ba.field_z_504;
		this.field_h_525 = class_ba.field_y_503;
		this.field_l_529 = class_ba.field_e_507;
		this.field_d_526 = i;
		this.field_z_516 = i_0_;
		this.field_y_519 = 8192;
		this.field_n_530 = 0;
		method_e_void();
	}

	Class_bd(final Class_ba class_ba, final int i, final int i_1_, final int i_2_) {
		this.field_s_659 = class_ba;
		this.field_a_518 = class_ba.field_z_504;
		this.field_h_525 = class_ba.field_y_503;
		this.field_l_529 = class_ba.field_e_507;
		this.field_d_526 = i;
		this.field_z_516 = i_1_;
		this.field_y_519 = i_2_;
		this.field_n_530 = 0;
		method_e_void();
	}

	public static Class_bd method_z_bd(final Class_ba class_ba, final int i, final int i_3_) {
		return (((class_ba.field_d_506 != null) && (class_ba.field_d_506.length != 0)) ? new Class_bd(class_ba, (int) ((class_ba.field_n_505 * 256L * i) / (NpcDefinitions.audioSampleRate * 659652980)), i_3_ << 6) : null);
	}

	void method_e_void() {
		this.field_e_520 = this.field_z_516;
		this.field_g_521 = method_n_int(this.field_z_516, this.field_y_519);
		this.field_f_522 = method_d_int(this.field_z_516, this.field_y_519);
	}

	public synchronized void method_h_void(final int i) {
		this.field_m_523 = i;
	}

	public synchronized void method_u_void(final int i) {
		method_k_void(i << 6, method_r_int());
	}

	synchronized void method_q_void(final int i) {
		method_k_void(i, method_r_int());
	}

	public synchronized int method_x_int() {
		return (this.field_z_516 == -2147483648 ? 0 : this.field_z_516);
	}

	public synchronized int method_r_int() {
		return (this.field_y_519 < 0 ? -1 : this.field_y_519);
	}

	void method_v_void() {
		if (this.field_u_527 != 0) {
			if (this.field_z_516 == -2147483648) {
				this.field_z_516 = 0;
			}
			this.field_u_527 = 0;
			method_e_void();
		}
	}

	public synchronized void method_c_void(final int i, final int i_4_) {
		method_p_void(i, i_4_, method_r_int());
	}

	public synchronized void method_p_void(int i, final int i_5_, final int i_6_) {
		if (i == 0) {
			method_k_void(i_5_, i_6_);
		} else {
			final int i_7_ = method_n_int(i_5_, i_6_);
			final int i_8_ = method_d_int(i_5_, i_6_);
			if ((this.field_g_521 == i_7_) && (this.field_f_522 == i_8_)) {
				this.field_u_527 = 0;
			} else {
				int i_9_ = i_5_ - this.field_e_520;
				if ((this.field_e_520 - i_5_) > i_9_) {
					i_9_ = this.field_e_520 - i_5_;
				}
				if ((i_7_ - this.field_g_521) > i_9_) {
					i_9_ = i_7_ - this.field_g_521;
				}
				if ((this.field_g_521 - i_7_) > i_9_) {
					i_9_ = this.field_g_521 - i_7_;
				}
				if ((i_8_ - this.field_f_522) > i_9_) {
					i_9_ = i_8_ - this.field_f_522;
				}
				if ((this.field_f_522 - i_8_) > i_9_) {
					i_9_ = this.field_f_522 - i_8_;
				}
				if (i > i_9_) {
					i = i_9_;
				}
				this.field_u_527 = i;
				this.field_z_516 = i_5_;
				this.field_y_519 = i_6_;
				this.field_q_528 = (i_5_ - this.field_e_520) / i;
				this.field_k_524 = (i_7_ - this.field_g_521) / i;
				this.field_x_517 = (i_8_ - this.field_f_522) / i;
			}
		}
	}

	public synchronized void method_o_void(int i) {
		if (i == 0) {
			method_q_void(0);
			removeLink();
		} else if ((this.field_g_521 == 0) && (this.field_f_522 == 0)) {
			this.field_u_527 = 0;
			this.field_z_516 = 0;
			this.field_e_520 = 0;
			removeLink();
		} else {
			int i_10_ = -this.field_e_520;
			if (this.field_e_520 > i_10_) {
				i_10_ = this.field_e_520;
			}
			if (-this.field_g_521 > i_10_) {
				i_10_ = -this.field_g_521;
			}
			if (this.field_g_521 > i_10_) {
				i_10_ = this.field_g_521;
			}
			if (-this.field_f_522 > i_10_) {
				i_10_ = -this.field_f_522;
			}
			if (this.field_f_522 > i_10_) {
				i_10_ = this.field_f_522;
			}
			if (i > i_10_) {
				i = i_10_;
			}
			this.field_u_527 = i;
			this.field_z_516 = -2147483648;
			this.field_q_528 = -this.field_e_520 / i;
			this.field_k_524 = -this.field_g_521 / i;
			this.field_x_517 = -this.field_f_522 / i;
		}
	}

	public synchronized int method_t_int() {
		return (this.field_d_526 < 0 ? -this.field_d_526 : this.field_d_526);
	}

	public boolean method_w_boolean() {
		if ((this.field_n_530 >= 0) && (this.field_n_530 < ((((Class_ba) this.field_s_659).field_d_506).length << 8))) {
			return false;
		}
		return true;
	}

	@Override
	protected Class_bu method_g_bu() {
		return null;
	}

	@Override
	protected Class_bu method_f_bu() {
		return null;
	}

	@Override
	protected int method_m_int() {
		return (((this.field_z_516 == 0) && (this.field_u_527 == 0)) ? 0 : 1);
	}

	int method_an_int(final int[] is, int i, final int i_11_, final int i_12_, final int i_13_) {
		while_20_: do {
			do {
				if (this.field_u_527 <= 0) {
					break while_20_;
				}
				int i_14_ = i + this.field_u_527;
				if (i_14_ > i_12_) {
					i_14_ = i_12_;
				}
				this.field_u_527 += i;
				if ((this.field_d_526 == 256) && ((this.field_n_530 & 0xff) == 0)) {
					if (Class_i.field_y_1073) {
						i = method_bo_int(0, (((Class_ba) this.field_s_659).field_d_506), is, this.field_n_530, i, this.field_g_521, this.field_f_522, this.field_k_524, this.field_x_517, 0, i_14_, i_11_, this);
					} else {
						i = method_bs_int((((Class_ba) this.field_s_659).field_d_506), is, this.field_n_530, i, this.field_e_520, this.field_q_528, 0, i_14_, i_11_, this);
					}
				} else if (Class_i.field_y_1073) {
					i = method_ba_int(0, 0, (((Class_ba) this.field_s_659).field_d_506), is, this.field_n_530, i, this.field_g_521, this.field_f_522, this.field_k_524, this.field_x_517, 0, i_14_, i_11_, this, this.field_d_526, i_13_);
				} else {
					i = method_bj_int(0, 0, (((Class_ba) this.field_s_659).field_d_506), is, this.field_n_530, i, this.field_e_520, this.field_q_528, 0, i_14_, i_11_, this, this.field_d_526, i_13_);
				}
				this.field_u_527 -= i;
				if (this.field_u_527 != 0) {
					return i;
				}
			} while (!method_ah_boolean());
			return i_12_;
		} while (false);
	if ((this.field_d_526 == 256) && ((this.field_n_530 & 0xff) == 0)) {
		if (Class_i.field_y_1073) {
			return method_am_int(0, (((Class_ba) this.field_s_659).field_d_506), is, this.field_n_530, i, this.field_g_521, this.field_f_522, 0, i_12_, i_11_, this);
		}
		return method_aq_int((((Class_ba) this.field_s_659).field_d_506), is, this.field_n_530, i, this.field_e_520, 0, i_12_, i_11_, this);
	}
	if (Class_i.field_y_1073) {
		return method_af_int(0, 0, (((Class_ba) this.field_s_659).field_d_506), is, this.field_n_530, i, this.field_g_521, this.field_f_522, 0, i_12_, i_11_, this, this.field_d_526, i_13_);
	}
	return method_ap_int(0, 0, (((Class_ba) this.field_s_659).field_d_506), is, this.field_n_530, i, this.field_e_520, 0, i_12_, i_11_, this, this.field_d_526, i_13_);
	}

	int method_aw_int(final int[] is, int i, final int i_15_, final int i_16_, final int i_17_) {
		while_21_: do {
			do {
				if (this.field_u_527 <= 0) {
					break while_21_;
				}
				int i_18_ = i + this.field_u_527;
				if (i_18_ > i_16_) {
					i_18_ = i_16_;
				}
				this.field_u_527 += i;
				if ((this.field_d_526 == -256) && ((this.field_n_530 & 0xff) == 0)) {
					if (Class_i.field_y_1073) {
						i = method_bm_int(0, (((Class_ba) this.field_s_659).field_d_506), is, this.field_n_530, i, this.field_g_521, this.field_f_522, this.field_k_524, this.field_x_517, 0, i_18_, i_15_, this);
					} else {
						i = method_bw_int((((Class_ba) this.field_s_659).field_d_506), is, this.field_n_530, i, this.field_e_520, this.field_q_528, 0, i_18_, i_15_, this);
					}
				} else if (Class_i.field_y_1073) {
					i = method_bd_int(0, 0, (((Class_ba) this.field_s_659).field_d_506), is, this.field_n_530, i, this.field_g_521, this.field_f_522, this.field_k_524, this.field_x_517, 0, i_18_, i_15_, this, this.field_d_526, i_17_);
				} else {
					i = method_br_int(0, 0, (((Class_ba) this.field_s_659).field_d_506), is, this.field_n_530, i, this.field_e_520, this.field_q_528, 0, i_18_, i_15_, this, this.field_d_526, i_17_);
				}
				this.field_u_527 -= i;
				if (this.field_u_527 != 0) {
					return i;
				}
			} while (!method_ah_boolean());
			return i_16_;
		} while (false);
	if ((this.field_d_526 == -256) && ((this.field_n_530 & 0xff) == 0)) {
		if (Class_i.field_y_1073) {
			return method_ag_int(0, (((Class_ba) this.field_s_659).field_d_506), is, this.field_n_530, i, this.field_g_521, this.field_f_522, 0, i_16_, i_15_, this);
		}
		return method_aj_int((((Class_ba) this.field_s_659).field_d_506), is, this.field_n_530, i, this.field_e_520, 0, i_16_, i_15_, this);
	}
	if (Class_i.field_y_1073) {
		return method_av_int(0, 0, (((Class_ba) this.field_s_659).field_d_506), is, this.field_n_530, i, this.field_g_521, this.field_f_522, 0, i_16_, i_15_, this, this.field_d_526, i_17_);
	}
	return method_au_int(0, 0, (((Class_ba) this.field_s_659).field_d_506), is, this.field_n_530, i, this.field_e_520, 0, i_16_, i_15_, this, this.field_d_526, i_17_);
	}

	static int method_am_int(final int i, final byte[] is, final int[] is_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, final int i_25_, int i_26_, final Class_bd class_bd) {
		i_20_ >>= 8;
		i_26_ >>= 8;
		i_22_ <<= 2;
		i_23_ <<= 2;
		if ((i_24_ = (i_21_ + i_26_) - i_20_) > i_25_) {
			i_24_ = i_25_;
		}
		i_21_ <<= 1;
		i_24_ <<= 1;
		i_24_ -= 6;
		while (i_21_ < i_24_) {
			int i_27_ = is[i_20_++];
			int i_28_ = i_21_++;
			is_19_[i_28_] += i_27_ * i_22_;
			i_28_ = i_21_++;
			is_19_[i_28_] += i_27_ * i_23_;
			i_27_ = is[i_20_++];
			i_28_ = i_21_++;
			is_19_[i_28_] += i_27_ * i_22_;
			i_28_ = i_21_++;
			is_19_[i_28_] += i_27_ * i_23_;
			i_27_ = is[i_20_++];
			i_28_ = i_21_++;
			is_19_[i_28_] += i_27_ * i_22_;
			i_28_ = i_21_++;
			is_19_[i_28_] += i_27_ * i_23_;
			i_27_ = is[i_20_++];
			i_28_ = i_21_++;
			is_19_[i_28_] += i_27_ * i_22_;
			i_28_ = i_21_++;
			is_19_[i_28_] += i_27_ * i_23_;
		}
		i_24_ += 6;
		while (i_21_ < i_24_) {
			final int i_29_ = is[i_20_++];
			int i_30_ = i_21_++;
			is_19_[i_30_] += i_29_ * i_22_;
			i_30_ = i_21_++;
			is_19_[i_30_] += i_29_ * i_23_;
		}
		class_bd.field_n_530 = i_20_ << 8;
		return i_21_ >> 1;
	}

	static int method_n_int(final int i, final int i_31_) {
		return (i_31_ < 0 ? i : (int) ((i * Math.sqrt((16384 - i_31_) * 1.220703125E-4)) + 0.5));
	}

	static int method_aj_int(final byte[] is, final int[] is_32_, int i, int i_33_, int i_34_, int i_35_, final int i_36_, int i_37_, final Class_bd class_bd) {
		i >>= 8;
		i_37_ >>= 8;
		i_34_ <<= 2;
		if ((i_35_ = (i_33_ + i) - (i_37_ - 1)) > i_36_) {
			i_35_ = i_36_;
		}
		i_35_ -= 3;
		while (i_33_ < i_35_) {
			int i_38_ = i_33_++;
			is_32_[i_38_] += is[i--] * i_34_;
			i_38_ = i_33_++;
			is_32_[i_38_] += is[i--] * i_34_;
			i_38_ = i_33_++;
			is_32_[i_38_] += is[i--] * i_34_;
			i_38_ = i_33_++;
			is_32_[i_38_] += is[i--] * i_34_;
		}
		i_35_ += 3;
		while (i_33_ < i_35_) {
			final int i_39_ = i_33_++;
			is_32_[i_39_] += is[i--] * i_34_;
		}
		class_bd.field_n_530 = i << 8;
		return i_33_;
	}

	static int method_ag_int(final int i, final byte[] is, final int[] is_40_, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_, final int i_46_, int i_47_, final Class_bd class_bd) {
		i_41_ >>= 8;
		i_47_ >>= 8;
		i_43_ <<= 2;
		i_44_ <<= 2;
		if ((i_45_ = (i_42_ + i_41_) - (i_47_ - 1)) > i_46_) {
			i_45_ = i_46_;
		}
		i_42_ <<= 1;
		i_45_ <<= 1;
		i_45_ -= 6;
		while (i_42_ < i_45_) {
			int i_48_ = is[i_41_--];
			int i_49_ = i_42_++;
			is_40_[i_49_] += i_48_ * i_43_;
			i_49_ = i_42_++;
			is_40_[i_49_] += i_48_ * i_44_;
			i_48_ = is[i_41_--];
			i_49_ = i_42_++;
			is_40_[i_49_] += i_48_ * i_43_;
			i_49_ = i_42_++;
			is_40_[i_49_] += i_48_ * i_44_;
			i_48_ = is[i_41_--];
			i_49_ = i_42_++;
			is_40_[i_49_] += i_48_ * i_43_;
			i_49_ = i_42_++;
			is_40_[i_49_] += i_48_ * i_44_;
			i_48_ = is[i_41_--];
			i_49_ = i_42_++;
			is_40_[i_49_] += i_48_ * i_43_;
			i_49_ = i_42_++;
			is_40_[i_49_] += i_48_ * i_44_;
		}
		i_45_ += 6;
		while (i_42_ < i_45_) {
			final int i_50_ = is[i_41_--];
			int i_51_ = i_42_++;
			is_40_[i_51_] += i_50_ * i_43_;
			i_51_ = i_42_++;
			is_40_[i_51_] += i_50_ * i_44_;
		}
		class_bd.field_n_530 = i_41_ << 8;
		return i_42_ >> 1;
	}

	static int method_ap_int(final int i, int i_52_, final byte[] is, final int[] is_53_, int i_54_, int i_55_, final int i_56_, int i_57_, final int i_58_, final int i_59_, final Class_bd class_bd, final int i_60_, final int i_61_) {
		if ((i_60_ == 0) || ((i_57_ = i_55_ + ((((i_59_ - i_54_) + i_60_) - 257) / i_60_)) > i_58_)) {
			i_57_ = i_58_;
		}
		while (i_55_ < i_57_) {
			i_52_ = i_54_ >> 8;
		final int i_62_ = is[i_52_];
		final int i_63_ = i_55_++;
		is_53_[i_63_] += (((i_62_ << 8) + ((is[i_52_ + 1] - i_62_) * (i_54_ & 0xff))) * i_56_) >> 6;
		i_54_ += i_60_;
		}
		if ((i_60_ == 0) || ((i_57_ = i_55_ + ((((i_59_ - i_54_) + i_60_) - 1) / i_60_)) > i_58_)) {
			i_57_ = i_58_;
		}
		i_52_ = i_61_;
		while (i_55_ < i_57_) {
			final int i_64_ = is[i_54_ >> 8];
			final int i_65_ = i_55_++;
			is_53_[i_65_] += ((((i_64_ << 8) + ((i_52_ - i_64_) * (i_54_ & 0xff))) * i_56_) >> 6);
			i_54_ += i_60_;
		}
		class_bd.field_n_530 = i_54_;
		return i_55_;
	}

	static int method_au_int(int i, int i_66_, final byte[] is, final int[] is_67_, int i_68_, int i_69_, final int i_70_, int i_71_, final int i_72_, final int i_73_, final Class_bd class_bd, final int i_74_, final int i_75_) {
		if ((i_74_ == 0) || ((i_71_ = i_69_ + ((((i_73_ + 256) - i_68_) + i_74_) / i_74_)) > i_72_)) {
			i_71_ = i_72_;
		}
		while (i_69_ < i_71_) {
			i_66_ = i_68_ >> 8;
		final int i_76_ = is[i_66_ - 1];
		final int i_77_ = i_69_++;
		is_67_[i_77_] += (((i_76_ << 8) + ((is[i_66_] - i_76_) * (i_68_ & 0xff))) * i_70_) >> 6;
		i_68_ += i_74_;
		}
		if ((i_74_ == 0) || ((i_71_ = i_69_ + (((i_73_ - i_68_) + i_74_) / i_74_)) > i_72_)) {
			i_71_ = i_72_;
		}
		i = i_75_;
		i_66_ = i_74_;
		while (i_69_ < i_71_) {
			final int i_78_ = i_69_++;
			is_67_[i_78_] += ((((i << 8) + ((is[i_68_ >> 8] - i) * (i_68_ & 0xff))) * i_70_) >> 6);
			i_68_ += i_66_;
		}
		class_bd.field_n_530 = i_68_;
		return i_69_;
	}

	static int method_av_int(int i, int i_79_, final byte[] is, final int[] is_80_, int i_81_, int i_82_, final int i_83_, final int i_84_, int i_85_, final int i_86_, final int i_87_, final Class_bd class_bd, final int i_88_, final int i_89_) {
		if ((i_88_ == 0) || ((i_85_ = i_82_ + ((((i_87_ + 256) - i_81_) + i_88_) / i_88_)) > i_86_)) {
			i_85_ = i_86_;
		}
		i_82_ <<= 1;
		i_85_ <<= 1;
		while (i_82_ < i_85_) {
			i_79_ = i_81_ >> 8;
		final int i_90_ = is[i_79_ - 1];
		i = (i_90_ << 8) + ((is[i_79_] - i_90_) * (i_81_ & 0xff));
		int i_91_ = i_82_++;
		is_80_[i_91_] += (i * i_83_) >> 6;
		i_91_ = i_82_++;
		is_80_[i_91_] += (i * i_84_) >> 6;
		i_81_ += i_88_;
		}
		if ((i_88_ == 0) || ((i_85_ = (i_82_ >> 1) + (((i_87_ - i_81_) + i_88_) / i_88_)) > i_86_)) {
			i_85_ = i_86_;
		}
		i_85_ <<= 1;
		i_79_ = i_89_;
		while (i_82_ < i_85_) {
			i = (i_79_ << 8) + ((is[i_81_ >> 8] - i_79_) * (i_81_ & 0xff));
			int i_92_ = i_82_++;
			is_80_[i_92_] += (i * i_83_) >> 6;
		i_92_ = i_82_++;
		is_80_[i_92_] += (i * i_84_) >> 6;
		i_81_ += i_88_;
		}
		class_bd.field_n_530 = i_81_;
		return i_82_ >> 1;
	}

	static int method_bm_int(final int i, final byte[] is, final int[] is_93_, int i_94_, int i_95_, int i_96_, int i_97_, int i_98_, int i_99_, int i_100_, final int i_101_, int i_102_, final Class_bd class_bd) {
		i_94_ >>= 8;
		i_102_ >>= 8;
		i_96_ <<= 2;
		i_97_ <<= 2;
		i_98_ <<= 2;
		i_99_ <<= 2;
		if ((i_100_ = (i_95_ + i_94_) - (i_102_ - 1)) > i_101_) {
			i_100_ = i_101_;
		}
		class_bd.field_e_520 += class_bd.field_q_528 * (i_100_ - i_95_);
		i_95_ <<= 1;
		i_100_ <<= 1;
		i_100_ -= 6;
		while (i_95_ < i_100_) {
			int i_103_ = is[i_94_--];
			int i_104_ = i_95_++;
			is_93_[i_104_] += i_103_ * i_96_;
			i_96_ += i_98_;
			i_104_ = i_95_++;
			is_93_[i_104_] += i_103_ * i_97_;
			i_97_ += i_99_;
			i_103_ = is[i_94_--];
			i_104_ = i_95_++;
			is_93_[i_104_] += i_103_ * i_96_;
			i_96_ += i_98_;
			i_104_ = i_95_++;
			is_93_[i_104_] += i_103_ * i_97_;
			i_97_ += i_99_;
			i_103_ = is[i_94_--];
			i_104_ = i_95_++;
			is_93_[i_104_] += i_103_ * i_96_;
			i_96_ += i_98_;
			i_104_ = i_95_++;
			is_93_[i_104_] += i_103_ * i_97_;
			i_97_ += i_99_;
			i_103_ = is[i_94_--];
			i_104_ = i_95_++;
			is_93_[i_104_] += i_103_ * i_96_;
			i_96_ += i_98_;
			i_104_ = i_95_++;
			is_93_[i_104_] += i_103_ * i_97_;
			i_97_ += i_99_;
		}
		i_100_ += 6;
		while (i_95_ < i_100_) {
			final int i_105_ = is[i_94_--];
			int i_106_ = i_95_++;
			is_93_[i_106_] += i_105_ * i_96_;
			i_96_ += i_98_;
			i_106_ = i_95_++;
			is_93_[i_106_] += i_105_ * i_97_;
			i_97_ += i_99_;
		}
		class_bd.field_g_521 = i_96_ >> 2;
		class_bd.field_f_522 = i_97_ >> 2;
		class_bd.field_n_530 = i_94_ << 8;
		return i_95_ >> 1;
	}

	static int method_bj_int(final int i, int i_107_, final byte[] is, final int[] is_108_, int i_109_, int i_110_, int i_111_, final int i_112_, int i_113_, final int i_114_, final int i_115_, final Class_bd class_bd, final int i_116_, final int i_117_) {
		class_bd.field_g_521 -= class_bd.field_k_524 * i_110_;
		class_bd.field_f_522 -= class_bd.field_x_517 * i_110_;
		if ((i_116_ == 0) || ((i_113_ = i_110_ + ((((i_115_ - i_109_) + i_116_) - 257) / i_116_)) > i_114_)) {
			i_113_ = i_114_;
		}
		while (i_110_ < i_113_) {
			i_107_ = i_109_ >> 8;
		final int i_118_ = is[i_107_];
		final int i_119_ = i_110_++;
		is_108_[i_119_] += (((i_118_ << 8) + ((is[i_107_ + 1] - i_118_) * (i_109_ & 0xff))) * i_111_) >> 6;
		i_111_ += i_112_;
		i_109_ += i_116_;
		}
		if ((i_116_ == 0) || ((i_113_ = i_110_ + ((((i_115_ - i_109_) + i_116_) - 1) / i_116_)) > i_114_)) {
			i_113_ = i_114_;
		}
		i_107_ = i_117_;
		while (i_110_ < i_113_) {
			final int i_120_ = is[i_109_ >> 8];
			final int i_121_ = i_110_++;
			is_108_[i_121_] += (((i_120_ << 8) + ((i_107_ - i_120_) * (i_109_ & 0xff))) * i_111_) >> 6;
			i_111_ += i_112_;
			i_109_ += i_116_;
		}
		class_bd.field_g_521 += class_bd.field_k_524 * i_110_;
		class_bd.field_f_522 += class_bd.field_x_517 * i_110_;
		class_bd.field_e_520 = i_111_;
		class_bd.field_n_530 = i_109_;
		return i_110_;
	}

	static int method_ba_int(int i, int i_122_, final byte[] is, final int[] is_123_, int i_124_, int i_125_, int i_126_, int i_127_, final int i_128_, final int i_129_, int i_130_, final int i_131_, final int i_132_, final Class_bd class_bd, final int i_133_, final int i_134_) {
		class_bd.field_e_520 -= class_bd.field_q_528 * i_125_;
		if ((i_133_ == 0) || ((i_130_ = i_125_ + ((((i_132_ - i_124_) + i_133_) - 257) / i_133_)) > i_131_)) {
			i_130_ = i_131_;
		}
		i_125_ <<= 1;
		i_130_ <<= 1;
		while (i_125_ < i_130_) {
			i_122_ = i_124_ >> 8;
		final int i_135_ = is[i_122_];
		i = (i_135_ << 8) + ((is[i_122_ + 1] - i_135_) * (i_124_ & 0xff));
		int i_136_ = i_125_++;
		is_123_[i_136_] += (i * i_126_) >> 6;
		i_126_ += i_128_;
		i_136_ = i_125_++;
		is_123_[i_136_] += (i * i_127_) >> 6;
		i_127_ += i_129_;
		i_124_ += i_133_;
		}
		if ((i_133_ == 0) || ((i_130_ = (i_125_ >> 1) + ((((i_132_ - i_124_) + i_133_) - 1) / i_133_)) > i_131_)) {
			i_130_ = i_131_;
		}
		i_130_ <<= 1;
		i_122_ = i_134_;
		while (i_125_ < i_130_) {
			final int i_137_ = is[i_124_ >> 8];
			i = (i_137_ << 8) + ((i_122_ - i_137_) * (i_124_ & 0xff));
			int i_138_ = i_125_++;
			is_123_[i_138_] += (i * i_126_) >> 6;
			i_126_ += i_128_;
			i_138_ = i_125_++;
			is_123_[i_138_] += (i * i_127_) >> 6;
		i_127_ += i_129_;
		i_124_ += i_133_;
		}
		i_125_ >>= 1;
		class_bd.field_e_520 += class_bd.field_q_528 * i_125_;
		class_bd.field_g_521 = i_126_;
		class_bd.field_f_522 = i_127_;
		class_bd.field_n_530 = i_124_;
		return i_125_;
	}

	static int method_br_int(int i, int i_139_, final byte[] is, final int[] is_140_, int i_141_, int i_142_, int i_143_, final int i_144_, int i_145_, final int i_146_, final int i_147_, final Class_bd class_bd, final int i_148_, final int i_149_) {
		class_bd.field_g_521 -= class_bd.field_k_524 * i_142_;
		class_bd.field_f_522 -= class_bd.field_x_517 * i_142_;
		if ((i_148_ == 0) || ((i_145_ = i_142_ + ((((i_147_ + 256) - i_141_) + i_148_) / i_148_)) > i_146_)) {
			i_145_ = i_146_;
		}
		while (i_142_ < i_145_) {
			i_139_ = i_141_ >> 8;
		final int i_150_ = is[i_139_ - 1];
		final int i_151_ = i_142_++;
		is_140_[i_151_] += (((i_150_ << 8) + ((is[i_139_] - i_150_) * (i_141_ & 0xff))) * i_143_) >> 6;
		i_143_ += i_144_;
		i_141_ += i_148_;
		}
		if ((i_148_ == 0) || ((i_145_ = i_142_ + (((i_147_ - i_141_) + i_148_) / i_148_)) > i_146_)) {
			i_145_ = i_146_;
		}
		i = i_149_;
		i_139_ = i_148_;
		while (i_142_ < i_145_) {
			final int i_152_ = i_142_++;
			is_140_[i_152_] += (((i << 8) + ((is[i_141_ >> 8] - i) * (i_141_ & 0xff))) * i_143_) >> 6;
		i_143_ += i_144_;
		i_141_ += i_139_;
		}
		class_bd.field_g_521 += class_bd.field_k_524 * i_142_;
		class_bd.field_f_522 += class_bd.field_x_517 * i_142_;
		class_bd.field_e_520 = i_143_;
		class_bd.field_n_530 = i_141_;
		return i_142_;
	}

	static int method_bd_int(int i, int i_153_, final byte[] is, final int[] is_154_, int i_155_, int i_156_, int i_157_, int i_158_, final int i_159_, final int i_160_, int i_161_, final int i_162_, final int i_163_, final Class_bd class_bd, final int i_164_, final int i_165_) {
		class_bd.field_e_520 -= class_bd.field_q_528 * i_156_;
		if ((i_164_ == 0) || ((i_161_ = i_156_ + ((((i_163_ + 256) - i_155_) + i_164_) / i_164_)) > i_162_)) {
			i_161_ = i_162_;
		}
		i_156_ <<= 1;
		i_161_ <<= 1;
		while (i_156_ < i_161_) {
			i_153_ = i_155_ >> 8;
		final int i_166_ = is[i_153_ - 1];
		i = (i_166_ << 8) + ((is[i_153_] - i_166_) * (i_155_ & 0xff));
		int i_167_ = i_156_++;
		is_154_[i_167_] += (i * i_157_) >> 6;
		i_157_ += i_159_;
		i_167_ = i_156_++;
		is_154_[i_167_] += (i * i_158_) >> 6;
		i_158_ += i_160_;
		i_155_ += i_164_;
		}
		if ((i_164_ == 0) || ((i_161_ = (i_156_ >> 1) + (((i_163_ - i_155_) + i_164_) / i_164_)) > i_162_)) {
			i_161_ = i_162_;
		}
		i_161_ <<= 1;
		i_153_ = i_165_;
		while (i_156_ < i_161_) {
			i = (i_153_ << 8) + ((is[i_155_ >> 8] - i_153_) * (i_155_ & 0xff));
			int i_168_ = i_156_++;
			is_154_[i_168_] += (i * i_157_) >> 6;
		i_157_ += i_159_;
		i_168_ = i_156_++;
		is_154_[i_168_] += (i * i_158_) >> 6;
		i_158_ += i_160_;
		i_155_ += i_164_;
		}
		i_156_ >>= 1;
		class_bd.field_e_520 += class_bd.field_q_528 * i_156_;
		class_bd.field_g_521 = i_157_;
		class_bd.field_f_522 = i_158_;
		class_bd.field_n_530 = i_155_;
		return i_156_;
	}

	static int method_bs_int(final byte[] is, final int[] is_169_, int i, int i_170_, int i_171_, int i_172_, int i_173_, final int i_174_, int i_175_, final Class_bd class_bd) {
		i >>= 8;
		i_175_ >>= 8;
		i_171_ <<= 2;
		i_172_ <<= 2;
		if ((i_173_ = (i_170_ + i_175_) - i) > i_174_) {
			i_173_ = i_174_;
		}
		class_bd.field_g_521 += class_bd.field_k_524 * (i_173_ - i_170_);
		class_bd.field_f_522 += class_bd.field_x_517 * (i_173_ - i_170_);
		i_173_ -= 3;
		while (i_170_ < i_173_) {
			int i_176_ = i_170_++;
			is_169_[i_176_] += is[i++] * i_171_;
			i_171_ += i_172_;
			i_176_ = i_170_++;
			is_169_[i_176_] += is[i++] * i_171_;
			i_171_ += i_172_;
			i_176_ = i_170_++;
			is_169_[i_176_] += is[i++] * i_171_;
			i_171_ += i_172_;
			i_176_ = i_170_++;
			is_169_[i_176_] += is[i++] * i_171_;
			i_171_ += i_172_;
		}
		i_173_ += 3;
		while (i_170_ < i_173_) {
			final int i_177_ = i_170_++;
			is_169_[i_177_] += is[i++] * i_171_;
			i_171_ += i_172_;
		}
		class_bd.field_e_520 = i_171_ >> 2;
		class_bd.field_n_530 = i << 8;
		return i_170_;
	}

	static int method_bo_int(final int i, final byte[] is, final int[] is_178_, int i_179_, int i_180_, int i_181_, int i_182_, int i_183_, int i_184_, int i_185_, final int i_186_, int i_187_, final Class_bd class_bd) {
		i_179_ >>= 8;
		i_187_ >>= 8;
		i_181_ <<= 2;
		i_182_ <<= 2;
		i_183_ <<= 2;
		i_184_ <<= 2;
		if ((i_185_ = (i_180_ + i_187_) - i_179_) > i_186_) {
			i_185_ = i_186_;
		}
		class_bd.field_e_520 += class_bd.field_q_528 * (i_185_ - i_180_);
		i_180_ <<= 1;
		i_185_ <<= 1;
		i_185_ -= 6;
		while (i_180_ < i_185_) {
			int i_188_ = is[i_179_++];
			int i_189_ = i_180_++;
			is_178_[i_189_] += i_188_ * i_181_;
			i_181_ += i_183_;
			i_189_ = i_180_++;
			is_178_[i_189_] += i_188_ * i_182_;
			i_182_ += i_184_;
			i_188_ = is[i_179_++];
			i_189_ = i_180_++;
			is_178_[i_189_] += i_188_ * i_181_;
			i_181_ += i_183_;
			i_189_ = i_180_++;
			is_178_[i_189_] += i_188_ * i_182_;
			i_182_ += i_184_;
			i_188_ = is[i_179_++];
			i_189_ = i_180_++;
			is_178_[i_189_] += i_188_ * i_181_;
			i_181_ += i_183_;
			i_189_ = i_180_++;
			is_178_[i_189_] += i_188_ * i_182_;
			i_182_ += i_184_;
			i_188_ = is[i_179_++];
			i_189_ = i_180_++;
			is_178_[i_189_] += i_188_ * i_181_;
			i_181_ += i_183_;
			i_189_ = i_180_++;
			is_178_[i_189_] += i_188_ * i_182_;
			i_182_ += i_184_;
		}
		i_185_ += 6;
		while (i_180_ < i_185_) {
			final int i_190_ = is[i_179_++];
			int i_191_ = i_180_++;
			is_178_[i_191_] += i_190_ * i_181_;
			i_181_ += i_183_;
			i_191_ = i_180_++;
			is_178_[i_191_] += i_190_ * i_182_;
			i_182_ += i_184_;
		}
		class_bd.field_g_521 = i_181_ >> 2;
		class_bd.field_f_522 = i_182_ >> 2;
		class_bd.field_n_530 = i_179_ << 8;
		return i_180_ >> 1;
	}

	public boolean method_i_boolean() {
		if (this.field_u_527 != 0) {
			return true;
		}
		return false;
	}

	public static Class_bd method_y_bd(final Class_ba class_ba, final int i, final int i_192_, final int i_193_) {
		return (((class_ba.field_d_506 != null) && (class_ba.field_d_506.length != 0)) ? new Class_bd(class_ba, i, i_192_, i_193_) : null);
	}

	public synchronized void method_b_void(final int i) {
		if (this.field_d_526 < 0) {
			this.field_d_526 = -i;
		} else {
			this.field_d_526 = i;
		}
	}

	public synchronized void method_s_void(final boolean bool) {
		this.field_d_526 = ((this.field_d_526 ^ (this.field_d_526 >> 31)) + (this.field_d_526 >>> 31));
		if (bool) {
			this.field_d_526 = -this.field_d_526;
		}
	}

	public synchronized void method_j_void(int i) {
		final int i_194_ = (((Class_ba) this.field_s_659).field_d_506.length << 8);
		if (i < -1) {
			i = -1;
		}
		if (i > i_194_) {
			i = i_194_;
		}
		this.field_n_530 = i;
	}

	static int method_bw_int(final byte[] is, final int[] is_195_, int i, int i_196_, int i_197_, int i_198_, int i_199_, final int i_200_, int i_201_, final Class_bd class_bd) {
		i >>= 8;
		i_201_ >>= 8;
		i_197_ <<= 2;
		i_198_ <<= 2;
		if ((i_199_ = (i_196_ + i) - (i_201_ - 1)) > i_200_) {
			i_199_ = i_200_;
		}
		class_bd.field_g_521 += class_bd.field_k_524 * (i_199_ - i_196_);
		class_bd.field_f_522 += class_bd.field_x_517 * (i_199_ - i_196_);
		i_199_ -= 3;
		while (i_196_ < i_199_) {
			int i_202_ = i_196_++;
			is_195_[i_202_] += is[i--] * i_197_;
			i_197_ += i_198_;
			i_202_ = i_196_++;
			is_195_[i_202_] += is[i--] * i_197_;
			i_197_ += i_198_;
			i_202_ = i_196_++;
			is_195_[i_202_] += is[i--] * i_197_;
			i_197_ += i_198_;
			i_202_ = i_196_++;
			is_195_[i_202_] += is[i--] * i_197_;
			i_197_ += i_198_;
		}
		i_199_ += 3;
		while (i_196_ < i_199_) {
			final int i_203_ = i_196_++;
			is_195_[i_203_] += is[i--] * i_197_;
			i_197_ += i_198_;
		}
		class_bd.field_e_520 = i_197_ >> 2;
		class_bd.field_n_530 = i << 8;
		return i_196_;
	}

	@Override
	public synchronized void method_a_void(final int[] is, final int i, int i_204_) {
		if ((this.field_z_516 == 0) && (this.field_u_527 == 0)) {
			method_l_void(i_204_);
		} else {
			final Class_ba class_ba = (Class_ba) this.field_s_659;
			final int i_205_ = this.field_a_518 << 8;
			final int i_206_ = this.field_h_525 << 8;
			final int i_207_ = class_ba.field_d_506.length << 8;
			final int i_208_ = i_206_ - i_205_;
			if (i_208_ <= 0) {
				this.field_m_523 = 0;
			}
			int i_209_ = i;
			i_204_ += i;
			if (this.field_n_530 < 0) {
				if (this.field_d_526 <= 0) {
					method_v_void();
					removeLink();
					return;
				}
				this.field_n_530 = 0;
			}
			if (this.field_n_530 >= i_207_) {
				if (this.field_d_526 >= 0) {
					method_v_void();
					removeLink();
					return;
				}
				this.field_n_530 = i_207_ - 1;
			}
			if (this.field_m_523 < 0) {
				if (this.field_l_529) {
					if (this.field_d_526 < 0) {
						i_209_ = method_aw_int(is, i, i_205_, i_204_, (class_ba.field_d_506[this.field_a_518]));
						if (this.field_n_530 >= i_205_) {
							return;
						}
						this.field_n_530 = ((i_205_ + i_205_) - 1 - this.field_n_530);
						this.field_d_526 = -this.field_d_526;
					}
					for (;;) {
						i_209_ = method_an_int(is, i_209_, i_206_, i_204_, (class_ba.field_d_506[(this.field_h_525 - 1)]));
						if (this.field_n_530 < i_206_) {
							break;
						}
						this.field_n_530 = ((i_206_ + i_206_) - 1 - this.field_n_530);
						this.field_d_526 = -this.field_d_526;
						i_209_ = method_aw_int(is, i_209_, i_205_, i_204_, (class_ba.field_d_506[this.field_a_518]));
						if (this.field_n_530 >= i_205_) {
							break;
						}
						this.field_n_530 = ((i_205_ + i_205_) - 1 - this.field_n_530);
						this.field_d_526 = -this.field_d_526;
					}
				} else if (this.field_d_526 < 0) {
					for (;;) {
						i_209_ = method_aw_int(is, i_209_, i_205_, i_204_, (class_ba.field_d_506[(this.field_h_525 - 1)]));
						if (this.field_n_530 >= i_205_) {
							break;
						}
						this.field_n_530 = i_206_ - 1 - ((i_206_ - 1 - this.field_n_530) % i_208_);
					}
				} else {
					for (;;) {
						i_209_ = method_an_int(is, i_209_, i_206_, i_204_, (class_ba.field_d_506[this.field_a_518]));
						if (this.field_n_530 < i_206_) {
							break;
						}
						this.field_n_530 = i_205_ + ((this.field_n_530 - i_205_) % i_208_);
					}
				}
			} else {
				do {
					if (this.field_m_523 > 0) {
						if (this.field_l_529) {
							if (this.field_d_526 < 0) {
								i_209_ = method_aw_int(is, i, i_205_, i_204_, (class_ba.field_d_506[(this.field_a_518)]));
								if (this.field_n_530 >= i_205_) {
									return;
								}
								this.field_n_530 = ((i_205_ + i_205_) - 1 - this.field_n_530);
								this.field_d_526 = -this.field_d_526;
								if (--this.field_m_523 == 0) {
									break;
								}
							}
							do {
								i_209_ = method_an_int(is, i_209_, i_206_, i_204_, (class_ba.field_d_506[(this.field_h_525) - 1]));
								if (this.field_n_530 < i_206_) {
									return;
								}
								this.field_n_530 = ((i_206_ + i_206_) - 1 - this.field_n_530);
								this.field_d_526 = -this.field_d_526;
								if (--this.field_m_523 == 0) {
									break;
								}
								i_209_ = method_aw_int(is, i_209_, i_205_, i_204_, (class_ba.field_d_506[(this.field_a_518)]));
								if (this.field_n_530 >= i_205_) {
									return;
								}
								this.field_n_530 = ((i_205_ + i_205_) - 1 - this.field_n_530);
								this.field_d_526 = -this.field_d_526;
							} while (--this.field_m_523 != 0);
						} else if (this.field_d_526 < 0) {
							for (;;) {
								i_209_ = method_aw_int(is, i_209_, i_205_, i_204_, (class_ba.field_d_506[(this.field_h_525) - 1]));
								if (this.field_n_530 >= i_205_) {
									return;
								}
								final int i_210_ = ((i_206_ - 1 - this.field_n_530) / i_208_);
								if (i_210_ >= this.field_m_523) {
									this.field_n_530 += (i_208_ * this.field_m_523);
									this.field_m_523 = 0;
									break;
								}
								this.field_n_530 += i_208_ * i_210_;
								this.field_m_523 -= i_210_;
							}
						} else {
							for (;;) {
								i_209_ = method_an_int(is, i_209_, i_206_, i_204_, (class_ba.field_d_506[(this.field_a_518)]));
								if (this.field_n_530 < i_206_) {
									return;
								}
								final int i_211_ = ((this.field_n_530 - i_205_) / i_208_);
								if (i_211_ >= this.field_m_523) {
									this.field_n_530 -= (i_208_ * this.field_m_523);
									this.field_m_523 = 0;
									break;
								}
								this.field_n_530 -= i_208_ * i_211_;
								this.field_m_523 -= i_211_;
							}
						}
					}
				} while (false);
				if (this.field_d_526 < 0) {
					method_aw_int(is, i_209_, 0, i_204_, 0);
					if (this.field_n_530 < 0) {
						this.field_n_530 = -1;
						method_v_void();
						removeLink();
					}
				} else {
					method_an_int(is, i_209_, i_207_, i_204_, 0);
					if (this.field_n_530 >= i_207_) {
						this.field_n_530 = i_207_;
						method_v_void();
						removeLink();
					}
				}
			}
		}
	}

	static int method_d_int(final int i, final int i_212_) {
		return (i_212_ < 0 ? -i : (int) ((i * Math.sqrt(i_212_ * 1.220703125E-4)) + 0.5));
	}

	boolean method_ah_boolean() {
		int i = this.field_z_516;
		int i_213_;
		int i_214_;
		if (i == -2147483648) {
			i_214_ = 0;
			i_213_ = 0;
			i = 0;
		} else {
			i_213_ = method_n_int(i, this.field_y_519);
			i_214_ = method_d_int(i, this.field_y_519);
		}
		if ((this.field_e_520 == i) && (this.field_g_521 == i_213_) && (this.field_f_522 == i_214_)) {
			if (this.field_z_516 == -2147483648) {
				this.field_z_516 = 0;
				this.field_f_522 = 0;
				this.field_g_521 = 0;
				this.field_e_520 = 0;
				removeLink();
				return true;
			}
			method_e_void();
			return false;
		}
		if (this.field_e_520 < i) {
			this.field_q_528 = 1;
			this.field_u_527 = i - this.field_e_520;
		} else if (this.field_e_520 > i) {
			this.field_q_528 = -1;
			this.field_u_527 = this.field_e_520 - i;
		} else {
			this.field_q_528 = 0;
		}
		if (this.field_g_521 < i_213_) {
			this.field_k_524 = 1;
			if ((this.field_u_527 == 0) || (this.field_u_527 > (i_213_ - this.field_g_521))) {
				this.field_u_527 = i_213_ - this.field_g_521;
			}
		} else if (this.field_g_521 > i_213_) {
			this.field_k_524 = -1;
			if ((this.field_u_527 == 0) || (this.field_u_527 > (this.field_g_521 - i_213_))) {
				this.field_u_527 = this.field_g_521 - i_213_;
			}
		} else {
			this.field_k_524 = 0;
		}
		if (this.field_f_522 < i_214_) {
			this.field_x_517 = 1;
			if ((this.field_u_527 == 0) || (this.field_u_527 > (i_214_ - this.field_f_522))) {
				this.field_u_527 = i_214_ - this.field_f_522;
			}
		} else if (this.field_f_522 > i_214_) {
			this.field_x_517 = -1;
			if ((this.field_u_527 == 0) || (this.field_u_527 > (this.field_f_522 - i_214_))) {
				this.field_u_527 = this.field_f_522 - i_214_;
			}
		} else {
			this.field_x_517 = 0;
		}
		return false;
	}

	@Override
	public synchronized void method_l_void(int i) {
		if (this.field_u_527 > 0) {
			if (i >= this.field_u_527) {
				if (this.field_z_516 == -2147483648) {
					this.field_z_516 = 0;
					this.field_f_522 = 0;
					this.field_g_521 = 0;
					this.field_e_520 = 0;
					removeLink();
					i = this.field_u_527;
				}
				this.field_u_527 = 0;
				method_e_void();
			} else {
				this.field_e_520 += this.field_q_528 * i;
				this.field_g_521 += this.field_k_524 * i;
				this.field_f_522 += this.field_x_517 * i;
				this.field_u_527 -= i;
			}
		}
		final Class_ba class_ba = (Class_ba) this.field_s_659;
		final int i_215_ = this.field_a_518 << 8;
		final int i_216_ = this.field_h_525 << 8;
		final int i_217_ = class_ba.field_d_506.length << 8;
		final int i_218_ = i_216_ - i_215_;
		if (i_218_ <= 0) {
			this.field_m_523 = 0;
		}
		if (this.field_n_530 < 0) {
			if (this.field_d_526 <= 0) {
				method_v_void();
				removeLink();
				return;
			}
			this.field_n_530 = 0;
		}
		if (this.field_n_530 >= i_217_) {
			if (this.field_d_526 >= 0) {
				method_v_void();
				removeLink();
				return;
			}
			this.field_n_530 = i_217_ - 1;
		}
		this.field_n_530 += this.field_d_526 * i;
		if (this.field_m_523 < 0) {
			if (!this.field_l_529) {
				if (this.field_d_526 < 0) {
					if (this.field_n_530 < i_215_) {
						this.field_n_530 = i_216_ - 1 - ((i_216_ - 1 - this.field_n_530) % i_218_);
					}
				} else if (this.field_n_530 >= i_216_) {
					this.field_n_530 = i_215_ + ((this.field_n_530 - i_215_) % i_218_);
				}
			} else {
				if (this.field_d_526 < 0) {
					if (this.field_n_530 >= i_215_) {
						return;
					}
					this.field_n_530 = (i_215_ + i_215_) - 1 - this.field_n_530;
					this.field_d_526 = -this.field_d_526;
				}
				while (this.field_n_530 >= i_216_) {
					this.field_n_530 = (i_216_ + i_216_) - 1 - this.field_n_530;
					this.field_d_526 = -this.field_d_526;
					if (this.field_n_530 >= i_215_) {
						break;
					}
					this.field_n_530 = (i_215_ + i_215_) - 1 - this.field_n_530;
					this.field_d_526 = -this.field_d_526;
				}
			}
		} else {
			do {
				if (this.field_m_523 > 0) {
					if (this.field_l_529) {
						if (this.field_d_526 < 0) {
							if (this.field_n_530 >= i_215_) {
								return;
							}
							this.field_n_530 = ((i_215_ + i_215_) - 1 - this.field_n_530);
							this.field_d_526 = -this.field_d_526;
							if (--this.field_m_523 == 0) {
								break;
							}
						}
						do {
							if (this.field_n_530 < i_216_) {
								return;
							}
							this.field_n_530 = ((i_216_ + i_216_) - 1 - this.field_n_530);
							this.field_d_526 = -this.field_d_526;
							if (--this.field_m_523 == 0) {
								break;
							}
							if (this.field_n_530 >= i_215_) {
								return;
							}
							this.field_n_530 = ((i_215_ + i_215_) - 1 - this.field_n_530);
							this.field_d_526 = -this.field_d_526;
						} while (--this.field_m_523 != 0);
					} else {
						if (this.field_d_526 < 0) {
							if (this.field_n_530 < i_215_) {
								final int i_219_ = ((i_216_ - 1 - this.field_n_530) / i_218_);
								if (i_219_ >= this.field_m_523) {
									this.field_n_530 += (i_218_ * this.field_m_523);
									this.field_m_523 = 0;
									break;
								}
								this.field_n_530 += i_218_ * i_219_;
								this.field_m_523 -= i_219_;
							}
						} else if (this.field_n_530 >= i_216_) {
							final int i_220_ = ((this.field_n_530 - i_215_) / i_218_);
							if (i_220_ >= this.field_m_523) {
								this.field_n_530 -= i_218_ * this.field_m_523;
								this.field_m_523 = 0;
								break;
							}
							this.field_n_530 -= i_218_ * i_220_;
							this.field_m_523 -= i_220_;
						}
						return;
					}
				}
			} while (false);
			if (this.field_d_526 < 0) {
				if (this.field_n_530 < 0) {
					this.field_n_530 = -1;
					method_v_void();
					removeLink();
				}
			} else if (this.field_n_530 >= i_217_) {
				this.field_n_530 = i_217_;
				method_v_void();
				removeLink();
			}
		}
	}

	static int method_aq_int(final byte[] is, final int[] is_221_, int i, int i_222_, int i_223_, int i_224_, final int i_225_, int i_226_, final Class_bd class_bd) {
		i >>= 8;
			i_226_ >>= 8;
		i_223_ <<= 2;
		if ((i_224_ = (i_222_ + i_226_) - i) > i_225_) {
			i_224_ = i_225_;
		}
		i_224_ -= 3;
		while (i_222_ < i_224_) {
			int i_227_ = i_222_++;
			is_221_[i_227_] += is[i++] * i_223_;
			i_227_ = i_222_++;
			is_221_[i_227_] += is[i++] * i_223_;
			i_227_ = i_222_++;
			is_221_[i_227_] += is[i++] * i_223_;
			i_227_ = i_222_++;
			is_221_[i_227_] += is[i++] * i_223_;
		}
		i_224_ += 3;
		while (i_222_ < i_224_) {
			final int i_228_ = i_222_++;
			is_221_[i_228_] += is[i++] * i_223_;
		}
		class_bd.field_n_530 = i << 8;
		return i_222_;
	}

	synchronized void method_k_void(final int i, final int i_229_) {
		this.field_z_516 = i;
		this.field_y_519 = i_229_;
		this.field_u_527 = 0;
		method_e_void();
	}

	static int method_af_int(int i, int i_230_, final byte[] is, final int[] is_231_, int i_232_, int i_233_, final int i_234_, final int i_235_, int i_236_, final int i_237_, final int i_238_, final Class_bd class_bd, final int i_239_, final int i_240_) {
		if ((i_239_ == 0) || ((i_236_ = i_233_ + ((((i_238_ - i_232_) + i_239_) - 257) / i_239_)) > i_237_)) {
			i_236_ = i_237_;
		}
		i_233_ <<= 1;
		i_236_ <<= 1;
		while (i_233_ < i_236_) {
			i_230_ = i_232_ >> 8;
		final int i_241_ = is[i_230_];
		i = (i_241_ << 8) + ((is[i_230_ + 1] - i_241_) * (i_232_ & 0xff));
		int i_242_ = i_233_++;
		is_231_[i_242_] += (i * i_234_) >> 6;
		i_242_ = i_233_++;
		is_231_[i_242_] += (i * i_235_) >> 6;
		i_232_ += i_239_;
		}
		if ((i_239_ == 0) || ((i_236_ = (i_233_ >> 1) + ((((i_238_ - i_232_) + i_239_) - 1) / i_239_)) > i_237_)) {
			i_236_ = i_237_;
		}
		i_236_ <<= 1;
		i_230_ = i_240_;
		while (i_233_ < i_236_) {
			final int i_243_ = is[i_232_ >> 8];
			i = (i_243_ << 8) + ((i_230_ - i_243_) * (i_232_ & 0xff));
			int i_244_ = i_233_++;
			is_231_[i_244_] += (i * i_234_) >> 6;
			i_244_ = i_233_++;
			is_231_[i_244_] += (i * i_235_) >> 6;
		i_232_ += i_239_;
		}
		class_bd.field_n_530 = i_232_;
		return i_233_ >> 1;
	}
}
