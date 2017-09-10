/* Class_dy - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class_dy {
	static Class_ck field_m_1754 = new Class_ck();
	static final int field_d_1755 = 16;
	static final int field_z_1756 = 23;
	static final int field_y_1757 = 0;
	static final int field_g_1758 = 6;
	static final int field_n_1759 = 4096;
	static final int field_e_1760 = 1;
	static final int field_f_1761 = 50;

	static void method_z_void(final Class_ck class_ck) {
		int i = 0;
		int[] is = null;
		int[] is_17_ = null;
		int[] is_18_ = null;
		class_ck.field_s_1059 = 1760626955;
		if (Class_ez.field_w_2272 == null) {
			Class_ez.field_w_2272 = new int[class_ck.field_s_1059 * -199165984];
		}
		boolean bool_19_ = true;
		while (bool_19_) {
			byte i_20_ = method_y_byte(class_ck);
			if (i_20_ == 23) {
				break;
			}
			i_20_ = method_y_byte(class_ck);
			i_20_ = method_y_byte(class_ck);
			i_20_ = method_y_byte(class_ck);
			i_20_ = method_y_byte(class_ck);
			i_20_ = method_y_byte(class_ck);
			i_20_ = method_y_byte(class_ck);
			i_20_ = method_y_byte(class_ck);
			i_20_ = method_y_byte(class_ck);
			i_20_ = method_y_byte(class_ck);
			i_20_ = method_e_byte(class_ck);
			if (i_20_ == 0) {
				/* empty */
			}
			class_ck.field_v_1050 = 0;
			int i_21_ = method_y_byte(class_ck);
			class_ck.field_v_1050 = (((class_ck.field_v_1050 * -39749465) << 8) | (i_21_ & 0xff)) * -547573993;
			i_21_ = method_y_byte(class_ck);
			class_ck.field_v_1050 = (((class_ck.field_v_1050 * -39749465) << 8) | (i_21_ & 0xff)) * -547573993;
			i_21_ = method_y_byte(class_ck);
			class_ck.field_v_1050 = (((class_ck.field_v_1050 * -39749465) << 8) | (i_21_ & 0xff)) * -547573993;
			for (int i_22_ = 0; i_22_ < 16; i_22_++) {
				i_20_ = method_e_byte(class_ck);
				if (i_20_ == 1) {
					class_ck.field_ak_1058[i_22_] = true;
				} else {
					class_ck.field_ak_1058[i_22_] = false;
				}
			}
			for (int i_23_ = 0; i_23_ < 256; i_23_++) {
				class_ck.field_ad_1057[i_23_] = false;
			}
			for (int i_24_ = 0; i_24_ < 16; i_24_++) {
				if (class_ck.field_ak_1058[i_24_]) {
					for (int i_25_ = 0; i_25_ < 16; i_25_++) {
						i_20_ = method_e_byte(class_ck);
						if (i_20_ == 1) {
							class_ck.field_ad_1057[((i_24_ * 16) + i_25_)] = true;
						}
					}
				}
			}
			method_f_void(class_ck);
			final int i_26_ = (class_ck.field_i_1071 * -1938165973) + 2;
			final int i_27_ = method_g_int(3, class_ck);
			final int i_28_ = method_g_int(15, class_ck);
			int i_29_ = 0;
			while (i_29_ < i_28_) {
				int i_30_ = 0;
				for (;;) {
					i_20_ = method_e_byte(class_ck);
					if (i_20_ == 0) {
						class_ck.field_as_1063[i_29_] = (byte) i_30_;
						i_29_++;
						break;
					}
					i_30_++;
				}
			}
			final byte[] is_31_ = new byte[6];
			byte i_32_ = 0;
			while (i_32_ < i_27_) {
				final byte[] is_33_ = is_31_;
				final int i_34_ = i_32_;
				final byte i_35_ = i_32_;
				i_32_ = (byte) (i_35_ + 1);
				is_33_[i_34_] = i_35_;
			}
			for (i_29_ = 0; i_29_ < i_28_; i_29_++) {
				i_32_ = class_ck.field_as_1063[i_29_];
				final byte i_36_ = is_31_[i_32_];
				for (/**/; i_32_ > 0; i_32_--) {
					is_31_[i_32_] = is_31_[i_32_ - 1];
				}
				is_31_[0] = i_36_;
				class_ck.field_ar_1062[i_29_] = i_36_;
			}
			for (int i_37_ = 0; i_37_ < i_27_; i_37_++) {
				int i_38_ = method_g_int(5, class_ck);
				i_29_ = 0;
				while (i_29_ < i_26_) {
					for (;;) {
						i_20_ = method_e_byte(class_ck);
						if (i_20_ == 0) {
							class_ck.field_ab_1064[i_37_][i_29_] = (byte) i_38_;
							i_29_++;
							break;
						}
						i_20_ = method_e_byte(class_ck);
						if (i_20_ == 0) {
							i_38_++;
						} else {
							i_38_--;
						}
					}
				}
			}
			for (int i_39_ = 0; i_39_ < i_27_; i_39_++) {
				int i_40_ = 32;
				byte i_41_ = 0;
				for (i_29_ = 0; i_29_ < i_26_; i_29_++) {
					if (class_ck.field_ab_1064[i_39_][i_29_] > i_41_) {
						i_41_ = (class_ck.field_ab_1064[i_39_][i_29_]);
					}
					if (class_ck.field_ab_1064[i_39_][i_29_] < i_40_) {
						i_40_ = (class_ck.field_ab_1064[i_39_][i_29_]);
					}
				}
				method_m_void(class_ck.field_ao_1065[i_39_], class_ck.field_ac_1066[i_39_], class_ck.field_az_1067[i_39_], class_ck.field_ab_1064[i_39_], i_40_, i_41_, i_26_);
				class_ck.field_at_1068[i_39_] = i_40_;
			}
			final int i_42_ = (class_ck.field_i_1071 * -1938165973) + 1;
			int i_43_ = -1;
			int i_44_ = 0;
			for (i_29_ = 0; i_29_ <= 255; i_29_++) {
				class_ck.field_o_1051[i_29_] = 0;
			}
			int i_45_ = 4095;
			for (int i_46_ = 15; i_46_ >= 0; i_46_--) {
				for (int i_47_ = 15; i_47_ >= 0; i_47_--) {
					class_ck.field_ax_1060[i_45_] = (byte) ((i_46_ * 16) + i_47_);
					i_45_--;
				}
				class_ck.field_al_1061[i_46_] = i_45_ + 1;
			}
			int i_48_ = 0;
			if (i_44_ == 0) {
				i_43_++;
				i_44_ = 50;
				final byte i_49_ = class_ck.field_ar_1062[i_43_];
				i = class_ck.field_at_1068[i_49_];
				is = class_ck.field_ao_1065[i_49_];
				is_18_ = class_ck.field_az_1067[i_49_];
				is_17_ = class_ck.field_ac_1066[i_49_];
			}
			int i_50_ = i_44_ - 1;
			int i_51_ = i;
			int i_52_;
			int i_53_;
			for (i_53_ = method_g_int(i, class_ck); i_53_ > is[i_51_]; i_53_ = (i_53_ << 1) | i_52_) {
				i_51_++;
				i_52_ = method_e_byte(class_ck);
			}
			int i_54_ = is_18_[i_53_ - is_17_[i_51_]];
			while (i_54_ != i_42_) {
				if ((i_54_ != 0) && (i_54_ != 1)) {
					int i_55_ = i_54_ - 1;
					if (i_55_ < 16) {
						final int i_56_ = class_ck.field_al_1061[0];
						i_20_ = (class_ck.field_ax_1060[i_56_ + i_55_]);
						for (/**/; i_55_ > 3; i_55_ -= 4) {
							final int i_57_ = i_56_ + i_55_;
							class_ck.field_ax_1060[i_57_] = (class_ck.field_ax_1060[i_57_ - 1]);
							class_ck.field_ax_1060[i_57_ - 1] = (class_ck.field_ax_1060[i_57_ - 2]);
							class_ck.field_ax_1060[i_57_ - 2] = (class_ck.field_ax_1060[i_57_ - 3]);
							class_ck.field_ax_1060[i_57_ - 3] = (class_ck.field_ax_1060[i_57_ - 4]);
						}
						for (/**/; i_55_ > 0; i_55_--) {
							class_ck.field_ax_1060[i_56_ + i_55_] = (class_ck.field_ax_1060[(i_56_ + i_55_) - 1]);
						}
						class_ck.field_ax_1060[i_56_] = i_20_;
					} else {
						int i_58_ = i_55_ / 16;
						final int i_59_ = i_55_ % 16;
						int i_60_ = (class_ck.field_al_1061[i_58_] + i_59_);
						i_20_ = class_ck.field_ax_1060[i_60_];
						for (/**/; (i_60_ > class_ck.field_al_1061[i_58_]); i_60_--) {
							class_ck.field_ax_1060[i_60_] = (class_ck.field_ax_1060[i_60_ - 1]);
						}
						class_ck.field_al_1061[i_58_]++;
						for (/**/; i_58_ > 0; i_58_--) {
							class_ck.field_al_1061[i_58_]--;
							class_ck.field_ax_1060[class_ck.field_al_1061[i_58_]] = (class_ck.field_ax_1060[((class_ck.field_al_1061[i_58_ - 1]) + 16) - 1]);
						}
						class_ck.field_al_1061[0]--;
						class_ck.field_ax_1060[class_ck.field_al_1061[0]] = i_20_;
						if (class_ck.field_al_1061[0] == 0) {
							i_45_ = 4095;
							for (int i_61_ = 15; i_61_ >= 0; i_61_--) {
								for (int i_62_ = 15; i_62_ >= 0; i_62_--) {
									class_ck.field_ax_1060[i_45_] = (class_ck.field_ax_1060[(class_ck.field_al_1061[i_61_]) + i_62_]);
									i_45_--;
								}
								class_ck.field_al_1061[i_61_] = i_45_ + 1;
							}
						}
					}
					class_ck.field_o_1051[(class_ck.field_ae_1072[i_20_ & 0xff] & 0xff)]++;
					Class_ez.field_w_2272[i_48_] = (class_ck.field_ae_1072[i_20_ & 0xff] & 0xff);
					i_48_++;
					if (i_50_ == 0) {
						i_43_++;
						i_50_ = 50;
						final byte i_63_ = class_ck.field_ar_1062[i_43_];
						i = class_ck.field_at_1068[i_63_];
						is = class_ck.field_ao_1065[i_63_];
						is_18_ = class_ck.field_az_1067[i_63_];
						is_17_ = class_ck.field_ac_1066[i_63_];
					}
					i_50_--;
					i_51_ = i;
					for (i_53_ = method_g_int(i, class_ck); i_53_ > is[i_51_]; i_53_ = (i_53_ << 1) | i_52_) {
						i_51_++;
						i_52_ = method_e_byte(class_ck);
					}
					i_54_ = is_18_[i_53_ - is_17_[i_51_]];
				} else {
					int i_64_ = -1;
					int i_65_ = 1;
					do {
						if (i_54_ == 0) {
							i_64_ += 1 * i_65_;
						} else if (i_54_ == 1) {
							i_64_ += 2 * i_65_;
						}
						i_65_ *= 2;
						if (i_50_ == 0) {
							i_43_++;
							i_50_ = 50;
							final byte i_66_ = class_ck.field_ar_1062[i_43_];
							i = class_ck.field_at_1068[i_66_];
							is = class_ck.field_ao_1065[i_66_];
							is_18_ = class_ck.field_az_1067[i_66_];
							is_17_ = class_ck.field_ac_1066[i_66_];
						}
						i_50_--;
						i_51_ = i;
						for (i_53_ = method_g_int(i, class_ck); i_53_ > is[i_51_]; i_53_ = (i_53_ << 1) | i_52_) {
							i_51_++;
							i_52_ = method_e_byte(class_ck);
						}
						i_54_ = is_18_[i_53_ - is_17_[i_51_]];
					} while ((i_54_ == 0) || (i_54_ == 1));
					i_64_++;
					i_21_ = (class_ck.field_ae_1072[((class_ck.field_ax_1060[class_ck.field_al_1061[0]]) & 0xff)]);
					class_ck.field_o_1051[i_21_ & 0xff] += i_64_;
					for (/**/; i_64_ > 0; i_64_--) {
						Class_ez.field_w_2272[i_48_] = i_21_ & 0xff;
						i_48_++;
					}
				}
			}
			class_ck.field_x_1046 = 0;
			class_ck.field_k_1045 = (byte) 0;
			class_ck.field_t_1055[0] = 0;
			for (i_29_ = 1; i_29_ <= 256; i_29_++) {
				class_ck.field_t_1055[i_29_] = class_ck.field_o_1051[i_29_ - 1];
			}
			for (i_29_ = 1; i_29_ <= 256; i_29_++) {
				class_ck.field_t_1055[i_29_] += class_ck.field_t_1055[i_29_ - 1];
			}
			for (i_29_ = 0; i_29_ < i_48_; i_29_++) {
				i_21_ = (byte) (Class_ez.field_w_2272[i_29_] & 0xff);
				Class_ez.field_w_2272[(class_ck.field_t_1055[i_21_ & 0xff])] |= i_29_ << 8;
				class_ck.field_t_1055[i_21_ & 0xff]++;
			}
			class_ck.field_c_1043 = ((Class_ez.field_w_2272[class_ck.field_v_1050 * -39749465]) >> 8) * 1364122751;
			class_ck.field_b_1054 = 0;
			class_ck.field_c_1043 = Class_ez.field_w_2272[(class_ck.field_c_1043 * 94692223)] * 1364122751;
			class_ck.field_p_1037 = (byte) ((class_ck.field_c_1043 * 94692223) & 0xff) * 1091585397;
			class_ck.field_c_1043 = (((class_ck.field_c_1043 * 94692223) >> 8) * 1364122751);
			class_ck.field_b_1054 += 427490513;
			class_ck.field_aa_1069 = i_48_ * -1041309543;
			method_d_void(class_ck);
			if (((class_ck.field_b_1054 * 261282865) == ((class_ck.field_aa_1069 * -1437502551) + 1)) && ((class_ck.field_x_1046 * 1946094677) == 0)) {
				bool_19_ = true;
			} else {
				bool_19_ = false;
			}
		}
	}

	Class_dy() throws Throwable {
		throw new Error();
	}

	static void method_d_void(final Class_ck class_ck) {
		byte i = class_ck.field_k_1045;
		int i_67_ = class_ck.field_x_1046 * 1946094677;
		int i_68_ = class_ck.field_b_1054 * 261282865;
		int i_69_ = class_ck.field_p_1037 * 1157669597;
		final int[] is = Class_ez.field_w_2272;
		int i_70_ = class_ck.field_c_1043 * 94692223;
		final byte[] is_71_ = class_ck.field_h_1047;
		int i_72_ = class_ck.field_l_1042 * -670140019;
		int i_73_ = class_ck.field_u_1041 * 1152640695;
		final int i_74_ = (class_ck.field_aa_1069 * -1437502551) + 1;
		while_33_: for (;;) {
			if (i_67_ > 0) {
				for (;;) {
					if (i_73_ == 0) {
						break while_33_;
					}
					if (i_67_ == 1) {
						if (i_73_ == 0) {
							i_67_ = 1;
						} else {
							is_71_[i_72_] = i;
							i_72_++;
							i_73_--;
							break;
						}
						break while_33_;
					}
					is_71_[i_72_] = i;
					i_67_--;
					i_72_++;
					i_73_--;
				}
			}
			boolean bool = true;
			while (bool) {
				bool = false;
				if (i_68_ == i_74_) {
					i_67_ = 0;
					break while_33_;
				}
				i = (byte) i_69_;
				i_70_ = is[i_70_];
				final int i_75_ = (byte) (i_70_ & 0xff);
				i_70_ >>= 8;
						i_68_++;
						if (i_75_ != i_69_) {
							i_69_ = i_75_;
							if (i_73_ == 0) {
								i_67_ = 1;
								break while_33_;
							}
							is_71_[i_72_] = i;
							i_72_++;
							i_73_--;
							bool = true;
						} else if (i_68_ == i_74_) {
							if (i_73_ == 0) {
								i_67_ = 1;
								break while_33_;
							}
							is_71_[i_72_] = i;
							i_72_++;
							i_73_--;
							bool = true;
						}
			}
			i_67_ = 2;
			i_70_ = is[i_70_];
			int i_76_ = (byte) (i_70_ & 0xff);
			i_70_ >>= 8;
					if (++i_68_ != i_74_) {
						if (i_76_ != i_69_) {
							i_69_ = i_76_;
						} else {
							i_67_ = 3;
							i_70_ = is[i_70_];
							i_76_ = (byte) (i_70_ & 0xff);
							i_70_ >>= 8;
			if (++i_68_ != i_74_) {
				if (i_76_ != i_69_) {
					i_69_ = i_76_;
				} else {
					i_70_ = is[i_70_];
					i_76_ = (byte) (i_70_ & 0xff);
					i_70_ >>= 8;
			i_68_++;
			i_67_ = (i_76_ & 0xff) + 4;
			i_70_ = is[i_70_];
			i_69_ = (byte) (i_70_ & 0xff);
			i_70_ >>= 8;
			i_68_++;
				}
			}
						}
					}
		}
		final int i_77_ = class_ck.field_q_1044 * 1442911695;
		class_ck.field_q_1044 += (i_73_ - i_73_) * 1808912687;
		if ((class_ck.field_q_1044 * 1442911695) >= i_77_) {
			/* empty */
		}
		class_ck.field_k_1045 = i;
		class_ck.field_x_1046 = i_67_ * -553807619;
		class_ck.field_b_1054 = i_68_ * 427490513;
		class_ck.field_p_1037 = i_69_ * 1091585397;
		Class_ez.field_w_2272 = is;
		class_ck.field_c_1043 = i_70_ * 1364122751;
		class_ck.field_h_1047 = is_71_;
		class_ck.field_l_1042 = i_72_ * 1354395973;
		class_ck.field_u_1041 = i_73_ * 1094178567;
	}

	public static int method_n_int(final byte[] is, int i, final byte[] is_78_, final int i_79_, final int i_80_) {
		final Class_ck class_ck = field_m_1754;
		synchronized (class_ck) {
			field_m_1754.field_f_1038 = is_78_;
			field_m_1754.field_m_1053 = i_80_ * -1222668371;
			field_m_1754.field_h_1047 = is;
			field_m_1754.field_l_1042 = 0;
			field_m_1754.field_u_1041 = i * 1094178567;
			field_m_1754.field_j_1048 = 0;
			field_m_1754.field_r_1032 = 0;
			field_m_1754.field_a_1040 = 0;
			field_m_1754.field_q_1044 = 0;
			method_z_void(field_m_1754);
			i -= field_m_1754.field_u_1041 * 1152640695;
			field_m_1754.field_f_1038 = null;
			field_m_1754.field_h_1047 = null;
			final int i_81_ = i;
			return i_81_;
		}
	}

	static byte method_y_byte(final Class_ck class_ck) {
		return (byte) method_g_int(8, class_ck);
	}

	static byte method_e_byte(final Class_ck class_ck) {
		return (byte) method_g_int(1, class_ck);
	}

	static int method_g_int(final int i, final Class_ck class_ck) {
		while ((class_ck.field_j_1048 * -41142715) < i) {
			class_ck.field_r_1032 = ((((class_ck.field_r_1032 * 55364539) << 8) | ((class_ck.field_f_1038[class_ck.field_m_1053 * 8956965]) & 0xff)) * 1794261363);
			class_ck.field_j_1048 += -1888787352;
			class_ck.field_m_1053 += -1222668371;
			class_ck.field_a_1040 += 2122481025;
			if ((class_ck.field_a_1040 * 1956889217) != 0) {
				/* empty */
			}
		}
		final int i_82_ = (((class_ck.field_r_1032 * 55364539) >> ((class_ck.field_j_1048 * -41142715) - i)) & ((1 << i) - 1));
		class_ck.field_j_1048 -= i * -236098419;
		return i_82_;
	}

	static void method_f_void(final Class_ck class_ck) {
		class_ck.field_i_1071 = 0;
		for (int i = 0; i < 256; i++) {
			if (class_ck.field_ad_1057[i]) {
				class_ck.field_ae_1072[class_ck.field_i_1071 * -1938165973] = (byte) i;
				class_ck.field_i_1071 += -428255357;
			}
		}
	}

	static void method_m_void(final int[] is, final int[] is_83_, final int[] is_84_, final byte[] is_85_, final int i, final int i_86_, final int i_87_) {
		int i_88_ = 0;
		for (int i_89_ = i; i_89_ <= i_86_; i_89_++) {
			for (int i_90_ = 0; i_90_ < i_87_; i_90_++) {
				if (is_85_[i_90_] == i_89_) {
					is_84_[i_88_] = i_90_;
					i_88_++;
				}
			}
		}
		for (int i_91_ = 0; i_91_ < 23; i_91_++) {
			is_83_[i_91_] = 0;
		}
		for (int i_92_ = 0; i_92_ < i_87_; i_92_++) {
			is_83_[is_85_[i_92_] + 1]++;
		}
		for (int i_93_ = 1; i_93_ < 23; i_93_++) {
			is_83_[i_93_] += is_83_[i_93_ - 1];
		}
		for (int i_94_ = 0; i_94_ < 23; i_94_++) {
			is[i_94_] = 0;
		}
		int i_95_ = 0;
		for (int i_96_ = i; i_96_ <= i_86_; i_96_++) {
			i_95_ += is_83_[i_96_ + 1] - is_83_[i_96_];
			is[i_96_] = i_95_ - 1;
			i_95_ <<= 1;
		}
		for (int i_97_ = i + 1; i_97_ <= i_86_; i_97_++) {
			is_83_[i_97_] = ((is[i_97_ - 1] + 1) << 1) - is_83_[i_97_];
		}
	}
}
