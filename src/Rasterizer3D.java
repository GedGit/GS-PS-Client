/* Class_co - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Rasterizer3D extends Rasterizer {
	static int field_b_1137;
	static final int field_g_1138 = 50;
	static boolean field_z_1139 = false;
	public static boolean field_y_1140 = true;
	static int field_e_1141 = 0;
	static final int field_f_1142 = 3500;
	static boolean field_n_1143 = false;
	static final int field_m_1144 = 14;
	static int[] field_i_1145 = new int[1024];
	public static int field_h_1146 = 512;
	static int field_l_1147;
	static int field_u_1148;
	static int[] field_ae_1149 = new int[512];
	static int field_p_1150;
	static int field_c_1151;
	static boolean field_d_1152 = false;
	static int field_t_1153;
	static int field_w_1154;
	static int[] field_ax_1155 = new int[2048];
	public static int[] field_ad_1156 = new int[65536];
	public static Interface_cn field_ak_1157;
	static final int field_a_1158 = 3;
	static int field_o_1159;
	public static int[] SINE = new int[2048];
	public static int[] COSINE = new int[2048];

	static {
		for (int i = 1; i < 512; i++) {
			field_ae_1149[i] = 32768 / i;
		}
		for (int i = 1; i < 2048; i++) {
			field_ax_1155[i] = 65536 / i;
		}
		for (int i = 0; i < 2048; i++) {
			SINE[i] = (int) (65536.0 * Math.sin(i * 0.0030679615));
			COSINE[i] = (int) (65536.0 * Math.cos(i * 0.0030679615));
		}
	}

	public static final void method_z_void() {
		field_l_1147 = field_c_1151 / 2;
		field_u_1148 = field_p_1150 / 2;
		field_o_1159 = -field_l_1147;
		field_b_1137 = field_c_1151 - field_l_1147;
		field_t_1153 = -field_u_1148;
		field_w_1154 = field_p_1150 - field_u_1148;
	}

	public static final void method_y_void(final int i, final int i_0_) {
		final int i_1_ = field_i_1145[0];
		final int i_2_ = i_1_ / width;
		final int i_3_ = i_1_ - (i_2_ * width);
		field_l_1147 = i - i_3_;
		field_u_1148 = i_0_ - i_2_;
		field_o_1159 = -field_l_1147;
		field_b_1137 = field_c_1151 - field_l_1147;
		field_t_1153 = -field_u_1148;
		field_w_1154 = field_p_1150 - field_u_1148;
	}

	static final void method_f_void(double d, final int i, final int i_4_) {
		d += (Math.random() * 0.03) - 0.015;
		int i_5_ = i * 128;
		for (int i_6_ = i; i_6_ < i_4_; i_6_++) {
			final double d_7_ = ((i_6_ >> 3) / 64.0) + 0.0078125;
			final double d_8_ = ((i_6_ & 0x7) / 8.0) + 0.0625;
			for (int i_9_ = 0; i_9_ < 128; i_9_++) {
				final double d_10_ = i_9_ / 128.0;
				double d_11_ = d_10_;
				double d_12_ = d_10_;
				double d_13_ = d_10_;
				if (d_8_ != 0.0) {
					double d_14_;
					if (d_10_ < 0.5) {
						d_14_ = d_10_ * (1.0 + d_8_);
					} else {
						d_14_ = (d_10_ + d_8_) - (d_10_ * d_8_);
					}
					final double d_15_ = (2.0 * d_10_) - d_14_;
					double d_16_ = d_7_ + 0.3333333333333333;
					if (d_16_ > 1.0) {
						d_16_--;
					}
					double d_17_ = d_7_ - 0.3333333333333333;
					if (d_17_ < 0.0) {
						d_17_++;
					}
					if ((6.0 * d_16_) < 1.0) {
						d_11_ = d_15_ + ((d_14_ - d_15_) * 6.0 * d_16_);
					} else if ((2.0 * d_16_) < 1.0) {
						d_11_ = d_14_;
					} else if ((3.0 * d_16_) < 2.0) {
						d_11_ = d_15_ + ((d_14_ - d_15_) * (0.6666666666666666 - d_16_) * 6.0);
					} else {
						d_11_ = d_15_;
					}
					if ((6.0 * d_7_) < 1.0) {
						d_12_ = d_15_ + ((d_14_ - d_15_) * 6.0 * d_7_);
					} else if ((2.0 * d_7_) < 1.0) {
						d_12_ = d_14_;
					} else if ((3.0 * d_7_) < 2.0) {
						d_12_ = d_15_ + ((d_14_ - d_15_) * (0.6666666666666666 - d_7_) * 6.0);
					} else {
						d_12_ = d_15_;
					}
					if ((6.0 * d_17_) < 1.0) {
						d_13_ = d_15_ + ((d_14_ - d_15_) * 6.0 * d_17_);
					} else if ((2.0 * d_17_) < 1.0) {
						d_13_ = d_14_;
					} else if ((3.0 * d_17_) < 2.0) {
						d_13_ = d_15_ + ((d_14_ - d_15_) * (0.6666666666666666 - d_17_) * 6.0);
					} else {
						d_13_ = d_15_;
					}
				}
				final int i_18_ = (int) (d_11_ * 256.0);
				final int i_19_ = (int) (d_12_ * 256.0);
				final int i_20_ = (int) (d_13_ * 256.0);
				int i_21_ = (i_18_ << 16) + (i_19_ << 8) + i_20_;
				i_21_ = adjustBrightnessRGB(i_21_, d);
				if (i_21_ == 0) {
					i_21_ = 1;
				}
				field_ad_1156[i_5_++] = i_21_;
			}
		}
	}

	static int adjustBrightnessRGB(final int rbg, final double exponent) {
		double d_22_ = (rbg >> 16) / 256.0;
		double d_23_ = ((rbg >> 8) & 0xff) / 256.0;
		double d_24_ = (rbg & 0xff) / 256.0;
		d_22_ = Math.pow(d_22_, exponent);
		d_23_ = Math.pow(d_23_, exponent);
		d_24_ = Math.pow(d_24_, exponent);
		final int i_25_ = (int) (d_22_ * 256.0);
		final int i_26_ = (int) (d_23_ * 256.0);
		final int i_27_ = (int) (d_24_ * 256.0);
		return (i_25_ << 16) + (i_26_ << 8) + i_27_;
	}

	public static void method_a_void(final int i, final int i_28_, final int i_29_) {
		field_n_1143 = ((i < 0) || (i > field_c_1151) || (i_28_ < 0) || (i_28_ > field_c_1151) || (i_29_ < 0) || (i_29_ > field_c_1151));
	}

	public static final void method_g_void(final double d) {
		method_f_void(d, 0, 512);
	}

	static final void method_l_void(final int[] is, int i, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_, int i_35_) {
		if (field_n_1143) {
			if (i_33_ > field_c_1151) {
				i_33_ = field_c_1151;
			}
			if (i_32_ < 0) {
				i_32_ = 0;
			}
		}
		if (i_32_ < i_33_) {
			i += i_32_;
			i_34_ += i_35_ * i_32_;
			if (field_y_1140) {
				i_31_ = (i_33_ - i_32_) >> 2;
		i_35_ <<= 2;
		if (field_e_1141 == 0) {
			if (i_31_ > 0) {
				do {
					i_30_ = field_ad_1156[i_34_ >> 8];
					i_34_ += i_35_;
					is[i++] = i_30_;
					is[i++] = i_30_;
					is[i++] = i_30_;
					is[i++] = i_30_;
				} while (--i_31_ > 0);
			}
			i_31_ = (i_33_ - i_32_) & 0x3;
			if (i_31_ > 0) {
				i_30_ = field_ad_1156[i_34_ >> 8];
				do {
					is[i++] = i_30_;
				} while (--i_31_ > 0);
			}
		} else {
			final int i_36_ = field_e_1141;
			final int i_37_ = 256 - field_e_1141;
			if (i_31_ > 0) {
				do {
					i_30_ = field_ad_1156[i_34_ >> 8];
					i_34_ += i_35_;
					i_30_ = (((((i_30_ & 0xff00ff) * i_37_) >> 8) & 0xff00ff) + ((((i_30_ & 0xff00) * i_37_) >> 8) & 0xff00));
					int i_38_ = is[i];
					is[i++] = (i_30_ + ((((i_38_ & 0xff00ff) * i_36_) >> 8) & 0xff00ff) + ((((i_38_ & 0xff00) * i_36_) >> 8) & 0xff00));
					i_38_ = is[i];
					is[i++] = (i_30_ + ((((i_38_ & 0xff00ff) * i_36_) >> 8) & 0xff00ff) + ((((i_38_ & 0xff00) * i_36_) >> 8) & 0xff00));
					i_38_ = is[i];
					is[i++] = (i_30_ + ((((i_38_ & 0xff00ff) * i_36_) >> 8) & 0xff00ff) + ((((i_38_ & 0xff00) * i_36_) >> 8) & 0xff00));
					i_38_ = is[i];
					is[i++] = (i_30_ + ((((i_38_ & 0xff00ff) * i_36_) >> 8) & 0xff00ff) + ((((i_38_ & 0xff00) * i_36_) >> 8) & 0xff00));
				} while (--i_31_ > 0);
			}
			i_31_ = (i_33_ - i_32_) & 0x3;
			if (i_31_ > 0) {
				i_30_ = field_ad_1156[i_34_ >> 8];
				i_30_ = (((((i_30_ & 0xff00ff) * i_37_) >> 8) & 0xff00ff) + ((((i_30_ & 0xff00) * i_37_) >> 8) & 0xff00));
				do {
					final int i_39_ = is[i];
					is[i++] = (i_30_ + ((((i_39_ & 0xff00ff) * i_36_) >> 8) & 0xff00ff) + ((((i_39_ & 0xff00) * i_36_) >> 8) & 0xff00));
				} while (--i_31_ > 0);
			}
		}
			} else {
				i_31_ = i_33_ - i_32_;
				if (field_e_1141 == 0) {
					do {
						is[i++] = field_ad_1156[i_34_ >> 8];
						i_34_ += i_35_;
					} while (--i_31_ > 0);
				} else {
					final int i_40_ = field_e_1141;
					final int i_41_ = 256 - field_e_1141;
					do {
						i_30_ = field_ad_1156[i_34_ >> 8];
						i_34_ += i_35_;
						i_30_ = (((((i_30_ & 0xff00ff) * i_41_) >> 8) & 0xff00ff) + ((((i_30_ & 0xff00) * i_41_) >> 8) & 0xff00));
						final int i_42_ = is[i];
						is[i++] = (i_30_ + ((((i_42_ & 0xff00ff) * i_40_) >> 8) & 0xff00ff) + ((((i_42_ & 0xff00) * i_40_) >> 8) & 0xff00));
					} while (--i_31_ > 0);
				}
			}
		}
	}

	public static final void method_u_void(int i, int i_43_, int i_44_, int i_45_, int i_46_, int i_47_, final int i_48_) {
		int i_49_ = 0;
		if (i_43_ != i) {
			i_49_ = ((i_46_ - i_45_) << 14) / (i_43_ - i);
		}
		int i_50_ = 0;
		if (i_44_ != i_43_) {
			i_50_ = ((i_47_ - i_46_) << 14) / (i_44_ - i_43_);
		}
		int i_51_ = 0;
		if (i_44_ != i) {
			i_51_ = ((i_45_ - i_47_) << 14) / (i - i_44_);
		}
		if ((i <= i_43_) && (i <= i_44_)) {
			if (i < field_p_1150) {
				if (i_43_ > field_p_1150) {
					i_43_ = field_p_1150;
				}
				if (i_44_ > field_p_1150) {
					i_44_ = field_p_1150;
				}
				if (i_43_ < i_44_) {
					i_47_ = i_45_ <<= 14;
					if (i < 0) {
						i_47_ -= i_51_ * i;
						i_45_ -= i_49_ * i;
						i = 0;
					}
					i_46_ <<= 14;
					if (i_43_ < 0) {
						i_46_ -= i_50_ * i_43_;
						i_43_ = 0;
					}
					if (((i == i_43_) || (i_51_ >= i_49_)) && ((i != i_43_) || (i_51_ <= i_50_))) {
						i_44_ -= i_43_;
						i_43_ -= i;
						i = field_i_1145[i];
						for (;;) {
							if (--i_43_ < 0) {
								while (--i_44_ >= 0) {
									method_q_void(pixels, i, i_48_, 0, i_46_ >> 14, i_47_ >> 14);
									i_47_ += i_51_;
									i_46_ += i_50_;
									i += width;
								}
								break;
							}
							method_q_void(pixels, i, i_48_, 0, i_45_ >> 14, i_47_ >> 14);
							i_47_ += i_51_;
							i_45_ += i_49_;
							i += width;
						}
					} else {
						i_44_ -= i_43_;
						i_43_ -= i;
						i = field_i_1145[i];
						for (;;) {
							if (--i_43_ < 0) {
								while (--i_44_ >= 0) {
									method_q_void(pixels, i, i_48_, 0, i_47_ >> 14, i_46_ >> 14);
									i_47_ += i_51_;
									i_46_ += i_50_;
									i += width;
								}
								break;
							}
							method_q_void(pixels, i, i_48_, 0, i_47_ >> 14, i_45_ >> 14);
							i_47_ += i_51_;
							i_45_ += i_49_;
							i += width;
						}
					}
				} else {
					i_46_ = i_45_ <<= 14;
					if (i < 0) {
						i_46_ -= i_51_ * i;
						i_45_ -= i_49_ * i;
						i = 0;
					}
					i_47_ <<= 14;
					if (i_44_ < 0) {
						i_47_ -= i_50_ * i_44_;
						i_44_ = 0;
					}
					if (((i == i_44_) || (i_51_ >= i_49_)) && ((i != i_44_) || (i_50_ <= i_49_))) {
						i_43_ -= i_44_;
						i_44_ -= i;
						i = field_i_1145[i];
						for (;;) {
							if (--i_44_ < 0) {
								while (--i_43_ >= 0) {
									method_q_void(pixels, i, i_48_, 0, i_45_ >> 14, i_47_ >> 14);
									i_47_ += i_50_;
									i_45_ += i_49_;
									i += width;
								}
								break;
							}
							method_q_void(pixels, i, i_48_, 0, i_45_ >> 14, i_46_ >> 14);
							i_46_ += i_51_;
							i_45_ += i_49_;
							i += width;
						}
					} else {
						i_43_ -= i_44_;
						i_44_ -= i;
						i = field_i_1145[i];
						for (;;) {
							if (--i_44_ < 0) {
								while (--i_43_ >= 0) {
									method_q_void(pixels, i, i_48_, 0, i_47_ >> 14, i_45_ >> 14);
									i_47_ += i_50_;
									i_45_ += i_49_;
									i += width;
								}
								break;
							}
							method_q_void(pixels, i, i_48_, 0, i_46_ >> 14, i_45_ >> 14);
							i_46_ += i_51_;
							i_45_ += i_49_;
							i += width;
						}
					}
				}
			}
		} else if (i_43_ <= i_44_) {
			if (i_43_ < field_p_1150) {
				if (i_44_ > field_p_1150) {
					i_44_ = field_p_1150;
				}
				if (i > field_p_1150) {
					i = field_p_1150;
				}
				if (i_44_ < i) {
					i_45_ = i_46_ <<= 14;
					if (i_43_ < 0) {
						i_45_ -= i_49_ * i_43_;
						i_46_ -= i_50_ * i_43_;
						i_43_ = 0;
					}
					i_47_ <<= 14;
					if (i_44_ < 0) {
						i_47_ -= i_51_ * i_44_;
						i_44_ = 0;
					}
					if (((i_43_ == i_44_) || (i_49_ >= i_50_)) && ((i_43_ != i_44_) || (i_49_ <= i_51_))) {
						i -= i_44_;
						i_44_ -= i_43_;
						i_43_ = field_i_1145[i_43_];
						for (;;) {
							if (--i_44_ < 0) {
								while (--i >= 0) {
									method_q_void(pixels, i_43_, i_48_, 0, i_47_ >> 14, i_45_ >> 14);
									i_45_ += i_49_;
									i_47_ += i_51_;
									i_43_ += width;
								}
								break;
							}
							method_q_void(pixels, i_43_, i_48_, 0, i_46_ >> 14, i_45_ >> 14);
							i_45_ += i_49_;
							i_46_ += i_50_;
							i_43_ += width;
						}
					} else {
						i -= i_44_;
						i_44_ -= i_43_;
						i_43_ = field_i_1145[i_43_];
						for (;;) {
							if (--i_44_ < 0) {
								while (--i >= 0) {
									method_q_void(pixels, i_43_, i_48_, 0, i_45_ >> 14, i_47_ >> 14);
									i_45_ += i_49_;
									i_47_ += i_51_;
									i_43_ += width;
								}
								break;
							}
							method_q_void(pixels, i_43_, i_48_, 0, i_45_ >> 14, i_46_ >> 14);
							i_45_ += i_49_;
							i_46_ += i_50_;
							i_43_ += width;
						}
					}
				} else {
					i_47_ = i_46_ <<= 14;
					if (i_43_ < 0) {
						i_47_ -= i_49_ * i_43_;
						i_46_ -= i_50_ * i_43_;
						i_43_ = 0;
					}
					i_45_ <<= 14;
					if (i < 0) {
						i_45_ -= i_51_ * i;
						i = 0;
					}
					if (i_49_ < i_50_) {
						i_44_ -= i;
						i -= i_43_;
						i_43_ = field_i_1145[i_43_];
						for (;;) {
							if (--i < 0) {
								while (--i_44_ >= 0) {
									method_q_void(pixels, i_43_, i_48_, 0, i_45_ >> 14, i_46_ >> 14);
									i_45_ += i_51_;
									i_46_ += i_50_;
									i_43_ += width;
								}
								break;
							}
							method_q_void(pixels, i_43_, i_48_, 0, i_47_ >> 14, i_46_ >> 14);
							i_47_ += i_49_;
							i_46_ += i_50_;
							i_43_ += width;
						}
					} else {
						i_44_ -= i;
						i -= i_43_;
						i_43_ = field_i_1145[i_43_];
						for (;;) {
							if (--i < 0) {
								while (--i_44_ >= 0) {
									method_q_void(pixels, i_43_, i_48_, 0, i_46_ >> 14, i_45_ >> 14);
									i_45_ += i_51_;
									i_46_ += i_50_;
									i_43_ += width;
								}
								break;
							}
							method_q_void(pixels, i_43_, i_48_, 0, i_46_ >> 14, i_47_ >> 14);
							i_47_ += i_49_;
							i_46_ += i_50_;
							i_43_ += width;
						}
					}
				}
			}
		} else if (i_44_ < field_p_1150) {
			if (i > field_p_1150) {
				i = field_p_1150;
			}
			if (i_43_ > field_p_1150) {
				i_43_ = field_p_1150;
			}
			if (i < i_43_) {
				i_46_ = i_47_ <<= 14;
				if (i_44_ < 0) {
					i_46_ -= i_50_ * i_44_;
					i_47_ -= i_51_ * i_44_;
					i_44_ = 0;
				}
				i_45_ <<= 14;
				if (i < 0) {
					i_45_ -= i_49_ * i;
					i = 0;
				}
				if (i_50_ < i_51_) {
					i_43_ -= i;
					i -= i_44_;
					i_44_ = field_i_1145[i_44_];
					for (;;) {
						if (--i < 0) {
							while (--i_43_ >= 0) {
								method_q_void(pixels, i_44_, i_48_, 0, i_46_ >> 14, i_45_ >> 14);
								i_46_ += i_50_;
								i_45_ += i_49_;
								i_44_ += width;
							}
							break;
						}
						method_q_void(pixels, i_44_, i_48_, 0, i_46_ >> 14, i_47_ >> 14);
						i_46_ += i_50_;
						i_47_ += i_51_;
						i_44_ += width;
					}
				} else {
					i_43_ -= i;
					i -= i_44_;
					i_44_ = field_i_1145[i_44_];
					for (;;) {
						if (--i < 0) {
							while (--i_43_ >= 0) {
								method_q_void(pixels, i_44_, i_48_, 0, i_45_ >> 14, i_46_ >> 14);
								i_46_ += i_50_;
								i_45_ += i_49_;
								i_44_ += width;
							}
							break;
						}
						method_q_void(pixels, i_44_, i_48_, 0, i_47_ >> 14, i_46_ >> 14);
						i_46_ += i_50_;
						i_47_ += i_51_;
						i_44_ += width;
					}
				}
			} else {
				i_45_ = i_47_ <<= 14;
				if (i_44_ < 0) {
					i_45_ -= i_50_ * i_44_;
					i_47_ -= i_51_ * i_44_;
					i_44_ = 0;
				}
				i_46_ <<= 14;
				if (i_43_ < 0) {
					i_46_ -= i_49_ * i_43_;
					i_43_ = 0;
				}
				if (i_50_ < i_51_) {
					i -= i_43_;
					i_43_ -= i_44_;
					i_44_ = field_i_1145[i_44_];
					for (;;) {
						if (--i_43_ < 0) {
							while (--i >= 0) {
								method_q_void(pixels, i_44_, i_48_, 0, i_46_ >> 14, i_47_ >> 14);
								i_46_ += i_49_;
								i_47_ += i_51_;
								i_44_ += width;
							}
							break;
						}
						method_q_void(pixels, i_44_, i_48_, 0, i_45_ >> 14, i_47_ >> 14);
						i_45_ += i_50_;
						i_47_ += i_51_;
						i_44_ += width;
					}
				} else {
					i -= i_43_;
					i_43_ -= i_44_;
					i_44_ = field_i_1145[i_44_];
					for (;;) {
						if (--i_43_ < 0) {
							while (--i >= 0) {
								method_q_void(pixels, i_44_, i_48_, 0, i_47_ >> 14, i_46_ >> 14);
								i_46_ += i_49_;
								i_47_ += i_51_;
								i_44_ += width;
							}
							break;
						}
						method_q_void(pixels, i_44_, i_48_, 0, i_47_ >> 14, i_45_ >> 14);
						i_45_ += i_50_;
						i_47_ += i_51_;
						i_44_ += width;
					}
				}
			}
		}
	}

	static final void method_q_void(final int[] is, int i, int i_52_, int i_53_, int i_54_, int i_55_) {
		if (field_n_1143) {
			if (i_55_ > field_c_1151) {
				i_55_ = field_c_1151;
			}
			if (i_54_ < 0) {
				i_54_ = 0;
			}
		}
		if (i_54_ < i_55_) {
			i += i_54_;
			i_53_ = (i_55_ - i_54_) >> 2;
		if (field_e_1141 == 0) {
			for (;;) {
				if (--i_53_ < 0) {
					i_53_ = (i_55_ - i_54_) & 0x3;
					while (--i_53_ >= 0) {
						is[i++] = i_52_;
					}
					break;
				}
				is[i++] = i_52_;
				is[i++] = i_52_;
				is[i++] = i_52_;
				is[i++] = i_52_;
			}
		} else if (field_e_1141 == 254) {
			for (;;) {
				if (--i_53_ < 0) {
					i_53_ = (i_55_ - i_54_) & 0x3;
					while (--i_53_ >= 0) {
						is[i++] = is[i];
					}
					break;
				}
				is[i++] = is[i];
				is[i++] = is[i];
				is[i++] = is[i];
				is[i++] = is[i];
			}
		} else {
			final int i_56_ = field_e_1141;
			final int i_57_ = 256 - field_e_1141;
			i_52_ = (((((i_52_ & 0xff00ff) * i_57_) >> 8) & 0xff00ff) + ((((i_52_ & 0xff00) * i_57_) >> 8) & 0xff00));
			for (;;) {
				if (--i_53_ < 0) {
					i_53_ = (i_55_ - i_54_) & 0x3;
					while (--i_53_ >= 0) {
						final int i_58_ = is[i];
						is[i++] = (i_52_ + ((((i_58_ & 0xff00ff) * i_56_) >> 8) & 0xff00ff) + ((((i_58_ & 0xff00) * i_56_) >> 8) & 0xff00));
					}
					break;
				}
				int i_59_ = is[i];
				is[i++] = (i_52_ + ((((i_59_ & 0xff00ff) * i_56_) >> 8) & 0xff00ff) + ((((i_59_ & 0xff00) * i_56_) >> 8) & 0xff00));
				i_59_ = is[i];
				is[i++] = (i_52_ + ((((i_59_ & 0xff00ff) * i_56_) >> 8) & 0xff00ff) + ((((i_59_ & 0xff00) * i_56_) >> 8) & 0xff00));
				i_59_ = is[i];
				is[i++] = (i_52_ + ((((i_59_ & 0xff00ff) * i_56_) >> 8) & 0xff00ff) + ((((i_59_ & 0xff00) * i_56_) >> 8) & 0xff00));
				i_59_ = is[i];
				is[i++] = (i_52_ + ((((i_59_ & 0xff00ff) * i_56_) >> 8) & 0xff00ff) + ((((i_59_ & 0xff00) * i_56_) >> 8) & 0xff00));
			}
		}
		}
	}

	static final void method_d_void(final int i, final int i_60_, final int i_61_, final int i_62_) {
		field_c_1151 = i_61_ - i;
		field_p_1150 = i_62_ - i_60_;
		method_z_void();
		if (field_i_1145.length < field_p_1150) {
			field_i_1145 = new int[Class_bi.method_z_int(field_p_1150, 182160417)];
		}
		int i_63_ = (i_60_ * width) + i;
		for (int i_64_ = 0; i_64_ < field_p_1150; i_64_++) {
			field_i_1145[i_64_] = i_63_;
			i_63_ += width;
		}
	}

	static final void method_r_void(int i, int i_65_, int i_66_, int i_67_, int i_68_, int i_69_, int i_70_, int i_71_, int i_72_, final int i_73_, int i_74_, int i_75_, final int i_76_, int i_77_, int i_78_, final int i_79_, int i_80_, int i_81_, final int i_82_) {
		final int[] is = field_ak_1157.method_n_intArray(i_82_, 2055813669);
		if (is == null) {
			final int i_83_ = field_ak_1157.method_d_int(i_82_, -124544907);
			method_h_void(i, i_65_, i_66_, i_67_, i_68_, i_69_, method_s_int(i_83_, i_70_), method_s_int(i_83_, i_71_), method_s_int(i_83_, i_72_));
		} else {
			field_z_1139 = field_ak_1157.method_y_boolean(i_82_, 1160830629);
			field_d_1152 = field_ak_1157.method_z_boolean(i_82_, (short) 23000);
			final int i_84_ = i_68_ - i_67_;
			final int i_85_ = i_65_ - i;
			final int i_86_ = i_69_ - i_67_;
			final int i_87_ = i_66_ - i;
			final int i_88_ = i_71_ - i_70_;
			final int i_89_ = i_72_ - i_70_;
			int i_90_ = 0;
			if (i_65_ != i) {
				i_90_ = ((i_68_ - i_67_) << 14) / (i_65_ - i);
			}
			int i_91_ = 0;
			if (i_66_ != i_65_) {
				i_91_ = ((i_69_ - i_68_) << 14) / (i_66_ - i_65_);
			}
			int i_92_ = 0;
			if (i_66_ != i) {
				i_92_ = ((i_67_ - i_69_) << 14) / (i - i_66_);
			}
			final int i_93_ = (i_84_ * i_87_) - (i_86_ * i_85_);
			if (i_93_ != 0) {
				final int i_94_ = (((i_88_ * i_87_) - (i_89_ * i_85_)) << 9) / i_93_;
				final int i_95_ = (((i_89_ * i_84_) - (i_88_ * i_86_)) << 9) / i_93_;
				i_74_ = i_73_ - i_74_;
				i_77_ = i_76_ - i_77_;
				i_80_ = i_79_ - i_80_;
				i_75_ -= i_73_;
				i_78_ -= i_76_;
				i_81_ -= i_79_;
				int i_96_ = ((i_75_ * i_76_) - (i_78_ * i_73_)) << 14;
				final int i_97_ = (int) (((long) ((i_78_ * i_79_) - (i_81_ * i_76_)) << 14) / field_h_1146);
				final int i_98_ = (int) (((long) ((i_81_ * i_73_) - (i_75_ * i_79_)) << 14) / field_h_1146);
				int i_99_ = ((i_74_ * i_76_) - (i_77_ * i_73_)) << 14;
				final int i_100_ = (int) (((long) ((i_77_ * i_79_) - (i_80_ * i_76_)) << 14) / field_h_1146);
				final int i_101_ = (int) (((long) ((i_80_ * i_73_) - (i_74_ * i_79_)) << 14) / field_h_1146);
				int i_102_ = ((i_77_ * i_75_) - (i_74_ * i_78_)) << 14;
				final int i_103_ = (int) (((long) ((i_80_ * i_78_) - (i_77_ * i_81_)) << 14) / field_h_1146);
				final int i_104_ = (int) (((long) ((i_74_ * i_81_) - (i_80_ * i_75_)) << 14) / field_h_1146);
				if ((i <= i_65_) && (i <= i_66_)) {
					if (i < field_p_1150) {
						if (i_65_ > field_p_1150) {
							i_65_ = field_p_1150;
						}
						if (i_66_ > field_p_1150) {
							i_66_ = field_p_1150;
						}
						i_70_ = ((i_70_ << 9) - (i_94_ * i_67_)) + i_94_;
						if (i_65_ < i_66_) {
							i_69_ = i_67_ <<= 14;
							if (i < 0) {
								i_69_ -= i_92_ * i;
								i_67_ -= i_90_ * i;
								i_70_ -= i_95_ * i;
								i = 0;
							}
							i_68_ <<= 14;
							if (i_65_ < 0) {
								i_68_ -= i_91_ * i_65_;
								i_65_ = 0;
							}
							final int i_105_ = i - field_u_1148;
							i_96_ += i_98_ * i_105_;
							i_99_ += i_101_ * i_105_;
							i_102_ += i_104_ * i_105_;
							if (((i == i_65_) || (i_92_ >= i_90_)) && ((i != i_65_) || (i_92_ <= i_91_))) {
								i_66_ -= i_65_;
								i_65_ -= i;
								i = field_i_1145[i];
								for (;;) {
									if (--i_65_ < 0) {
										while (--i_66_ >= 0) {
											method_j_void(pixels, is, 0, 0, i, i_68_ >> 14, i_69_ >> 14, i_70_, i_94_, i_96_, i_99_, i_102_, i_97_, i_100_, i_103_);
											i_69_ += i_92_;
											i_68_ += i_91_;
											i_70_ += i_95_;
											i += width;
											i_96_ += i_98_;
											i_99_ += i_101_;
											i_102_ += i_104_;
										}
										break;
									}
									method_j_void(pixels, is, 0, 0, i, i_67_ >> 14, i_69_ >> 14, i_70_, i_94_, i_96_, i_99_, i_102_, i_97_, i_100_, i_103_);
									i_69_ += i_92_;
									i_67_ += i_90_;
									i_70_ += i_95_;
									i += width;
									i_96_ += i_98_;
									i_99_ += i_101_;
									i_102_ += i_104_;
								}
							} else {
								i_66_ -= i_65_;
								i_65_ -= i;
								i = field_i_1145[i];
								for (;;) {
									if (--i_65_ < 0) {
										while (--i_66_ >= 0) {
											method_j_void(pixels, is, 0, 0, i, i_69_ >> 14, i_68_ >> 14, i_70_, i_94_, i_96_, i_99_, i_102_, i_97_, i_100_, i_103_);
											i_69_ += i_92_;
											i_68_ += i_91_;
											i_70_ += i_95_;
											i += width;
											i_96_ += i_98_;
											i_99_ += i_101_;
											i_102_ += i_104_;
										}
										break;
									}
									method_j_void(pixels, is, 0, 0, i, i_69_ >> 14, i_67_ >> 14, i_70_, i_94_, i_96_, i_99_, i_102_, i_97_, i_100_, i_103_);
									i_69_ += i_92_;
									i_67_ += i_90_;
									i_70_ += i_95_;
									i += width;
									i_96_ += i_98_;
									i_99_ += i_101_;
									i_102_ += i_104_;
								}
							}
						} else {
							i_68_ = i_67_ <<= 14;
							if (i < 0) {
								i_68_ -= i_92_ * i;
								i_67_ -= i_90_ * i;
								i_70_ -= i_95_ * i;
								i = 0;
							}
							i_69_ <<= 14;
							if (i_66_ < 0) {
								i_69_ -= i_91_ * i_66_;
								i_66_ = 0;
							}
							final int i_106_ = i - field_u_1148;
							i_96_ += i_98_ * i_106_;
							i_99_ += i_101_ * i_106_;
							i_102_ += i_104_ * i_106_;
							if (((i == i_66_) || (i_92_ >= i_90_)) && ((i != i_66_) || (i_91_ <= i_90_))) {
								i_65_ -= i_66_;
								i_66_ -= i;
								i = field_i_1145[i];
								for (;;) {
									if (--i_66_ < 0) {
										while (--i_65_ >= 0) {
											method_j_void(pixels, is, 0, 0, i, i_67_ >> 14, i_69_ >> 14, i_70_, i_94_, i_96_, i_99_, i_102_, i_97_, i_100_, i_103_);
											i_69_ += i_91_;
											i_67_ += i_90_;
											i_70_ += i_95_;
											i += width;
											i_96_ += i_98_;
											i_99_ += i_101_;
											i_102_ += i_104_;
										}
										break;
									}
									method_j_void(pixels, is, 0, 0, i, i_67_ >> 14, i_68_ >> 14, i_70_, i_94_, i_96_, i_99_, i_102_, i_97_, i_100_, i_103_);
									i_68_ += i_92_;
									i_67_ += i_90_;
									i_70_ += i_95_;
									i += width;
									i_96_ += i_98_;
									i_99_ += i_101_;
									i_102_ += i_104_;
								}
							} else {
								i_65_ -= i_66_;
								i_66_ -= i;
								i = field_i_1145[i];
								for (;;) {
									if (--i_66_ < 0) {
										while (--i_65_ >= 0) {
											method_j_void(pixels, is, 0, 0, i, i_69_ >> 14, i_67_ >> 14, i_70_, i_94_, i_96_, i_99_, i_102_, i_97_, i_100_, i_103_);
											i_69_ += i_91_;
											i_67_ += i_90_;
											i_70_ += i_95_;
											i += width;
											i_96_ += i_98_;
											i_99_ += i_101_;
											i_102_ += i_104_;
										}
										break;
									}
									method_j_void(pixels, is, 0, 0, i, i_68_ >> 14, i_67_ >> 14, i_70_, i_94_, i_96_, i_99_, i_102_, i_97_, i_100_, i_103_);
									i_68_ += i_92_;
									i_67_ += i_90_;
									i_70_ += i_95_;
									i += width;
									i_96_ += i_98_;
									i_99_ += i_101_;
									i_102_ += i_104_;
								}
							}
						}
					}
				} else if (i_65_ <= i_66_) {
					if (i_65_ < field_p_1150) {
						if (i_66_ > field_p_1150) {
							i_66_ = field_p_1150;
						}
						if (i > field_p_1150) {
							i = field_p_1150;
						}
						i_71_ = ((i_71_ << 9) - (i_94_ * i_68_)) + i_94_;
						if (i_66_ < i) {
							i_67_ = i_68_ <<= 14;
							if (i_65_ < 0) {
								i_67_ -= i_90_ * i_65_;
								i_68_ -= i_91_ * i_65_;
								i_71_ -= i_95_ * i_65_;
								i_65_ = 0;
							}
							i_69_ <<= 14;
							if (i_66_ < 0) {
								i_69_ -= i_92_ * i_66_;
								i_66_ = 0;
							}
							final int i_107_ = i_65_ - field_u_1148;
							i_96_ += i_98_ * i_107_;
							i_99_ += i_101_ * i_107_;
							i_102_ += i_104_ * i_107_;
							if (((i_65_ == i_66_) || (i_90_ >= i_91_)) && ((i_65_ != i_66_) || (i_90_ <= i_92_))) {
								i -= i_66_;
								i_66_ -= i_65_;
								i_65_ = field_i_1145[i_65_];
								for (;;) {
									if (--i_66_ < 0) {
										while (--i >= 0) {
											method_j_void(pixels, is, 0, 0, i_65_, i_69_ >> 14, i_67_ >> 14, i_71_, i_94_, i_96_, i_99_, i_102_, i_97_, i_100_, i_103_);
											i_67_ += i_90_;
											i_69_ += i_92_;
											i_71_ += i_95_;
											i_65_ += width;
											i_96_ += i_98_;
											i_99_ += i_101_;
											i_102_ += i_104_;
										}
										break;
									}
									method_j_void(pixels, is, 0, 0, i_65_, i_68_ >> 14, i_67_ >> 14, i_71_, i_94_, i_96_, i_99_, i_102_, i_97_, i_100_, i_103_);
									i_67_ += i_90_;
									i_68_ += i_91_;
									i_71_ += i_95_;
									i_65_ += width;
									i_96_ += i_98_;
									i_99_ += i_101_;
									i_102_ += i_104_;
								}
							} else {
								i -= i_66_;
								i_66_ -= i_65_;
								i_65_ = field_i_1145[i_65_];
								for (;;) {
									if (--i_66_ < 0) {
										while (--i >= 0) {
											method_j_void(pixels, is, 0, 0, i_65_, i_67_ >> 14, i_69_ >> 14, i_71_, i_94_, i_96_, i_99_, i_102_, i_97_, i_100_, i_103_);
											i_67_ += i_90_;
											i_69_ += i_92_;
											i_71_ += i_95_;
											i_65_ += width;
											i_96_ += i_98_;
											i_99_ += i_101_;
											i_102_ += i_104_;
										}
										break;
									}
									method_j_void(pixels, is, 0, 0, i_65_, i_67_ >> 14, i_68_ >> 14, i_71_, i_94_, i_96_, i_99_, i_102_, i_97_, i_100_, i_103_);
									i_67_ += i_90_;
									i_68_ += i_91_;
									i_71_ += i_95_;
									i_65_ += width;
									i_96_ += i_98_;
									i_99_ += i_101_;
									i_102_ += i_104_;
								}
							}
						} else {
							i_69_ = i_68_ <<= 14;
							if (i_65_ < 0) {
								i_69_ -= i_90_ * i_65_;
								i_68_ -= i_91_ * i_65_;
								i_71_ -= i_95_ * i_65_;
								i_65_ = 0;
							}
							i_67_ <<= 14;
							if (i < 0) {
								i_67_ -= i_92_ * i;
								i = 0;
							}
							final int i_108_ = i_65_ - field_u_1148;
							i_96_ += i_98_ * i_108_;
							i_99_ += i_101_ * i_108_;
							i_102_ += i_104_ * i_108_;
							if (i_90_ < i_91_) {
								i_66_ -= i;
								i -= i_65_;
								i_65_ = field_i_1145[i_65_];
								for (;;) {
									if (--i < 0) {
										while (--i_66_ >= 0) {
											method_j_void(pixels, is, 0, 0, i_65_, i_67_ >> 14, i_68_ >> 14, i_71_, i_94_, i_96_, i_99_, i_102_, i_97_, i_100_, i_103_);
											i_67_ += i_92_;
											i_68_ += i_91_;
											i_71_ += i_95_;
											i_65_ += width;
											i_96_ += i_98_;
											i_99_ += i_101_;
											i_102_ += i_104_;
										}
										break;
									}
									method_j_void(pixels, is, 0, 0, i_65_, i_69_ >> 14, i_68_ >> 14, i_71_, i_94_, i_96_, i_99_, i_102_, i_97_, i_100_, i_103_);
									i_69_ += i_90_;
									i_68_ += i_91_;
									i_71_ += i_95_;
									i_65_ += width;
									i_96_ += i_98_;
									i_99_ += i_101_;
									i_102_ += i_104_;
								}
							} else {
								i_66_ -= i;
								i -= i_65_;
								i_65_ = field_i_1145[i_65_];
								for (;;) {
									if (--i < 0) {
										while (--i_66_ >= 0) {
											method_j_void(pixels, is, 0, 0, i_65_, i_68_ >> 14, i_67_ >> 14, i_71_, i_94_, i_96_, i_99_, i_102_, i_97_, i_100_, i_103_);
											i_67_ += i_92_;
											i_68_ += i_91_;
											i_71_ += i_95_;
											i_65_ += width;
											i_96_ += i_98_;
											i_99_ += i_101_;
											i_102_ += i_104_;
										}
										break;
									}
									method_j_void(pixels, is, 0, 0, i_65_, i_68_ >> 14, i_69_ >> 14, i_71_, i_94_, i_96_, i_99_, i_102_, i_97_, i_100_, i_103_);
									i_69_ += i_90_;
									i_68_ += i_91_;
									i_71_ += i_95_;
									i_65_ += width;
									i_96_ += i_98_;
									i_99_ += i_101_;
									i_102_ += i_104_;
								}
							}
						}
					}
				} else if (i_66_ < field_p_1150) {
					if (i > field_p_1150) {
						i = field_p_1150;
					}
					if (i_65_ > field_p_1150) {
						i_65_ = field_p_1150;
					}
					i_72_ = ((i_72_ << 9) - (i_94_ * i_69_)) + i_94_;
					if (i < i_65_) {
						i_68_ = i_69_ <<= 14;
						if (i_66_ < 0) {
							i_68_ -= i_91_ * i_66_;
							i_69_ -= i_92_ * i_66_;
							i_72_ -= i_95_ * i_66_;
							i_66_ = 0;
						}
						i_67_ <<= 14;
						if (i < 0) {
							i_67_ -= i_90_ * i;
							i = 0;
						}
						final int i_109_ = i_66_ - field_u_1148;
						i_96_ += i_98_ * i_109_;
						i_99_ += i_101_ * i_109_;
						i_102_ += i_104_ * i_109_;
						if (i_91_ < i_92_) {
							i_65_ -= i;
							i -= i_66_;
							i_66_ = field_i_1145[i_66_];
							for (;;) {
								if (--i < 0) {
									while (--i_65_ >= 0) {
										method_j_void(pixels, is, 0, 0, i_66_, i_68_ >> 14, i_67_ >> 14, i_72_, i_94_, i_96_, i_99_, i_102_, i_97_, i_100_, i_103_);
										i_68_ += i_91_;
										i_67_ += i_90_;
										i_72_ += i_95_;
										i_66_ += width;
										i_96_ += i_98_;
										i_99_ += i_101_;
										i_102_ += i_104_;
									}
									break;
								}
								method_j_void(pixels, is, 0, 0, i_66_, i_68_ >> 14, i_69_ >> 14, i_72_, i_94_, i_96_, i_99_, i_102_, i_97_, i_100_, i_103_);
								i_68_ += i_91_;
								i_69_ += i_92_;
								i_72_ += i_95_;
								i_66_ += width;
								i_96_ += i_98_;
								i_99_ += i_101_;
								i_102_ += i_104_;
							}
						} else {
							i_65_ -= i;
							i -= i_66_;
							i_66_ = field_i_1145[i_66_];
							for (;;) {
								if (--i < 0) {
									while (--i_65_ >= 0) {
										method_j_void(pixels, is, 0, 0, i_66_, i_67_ >> 14, i_68_ >> 14, i_72_, i_94_, i_96_, i_99_, i_102_, i_97_, i_100_, i_103_);
										i_68_ += i_91_;
										i_67_ += i_90_;
										i_72_ += i_95_;
										i_66_ += width;
										i_96_ += i_98_;
										i_99_ += i_101_;
										i_102_ += i_104_;
									}
									break;
								}
								method_j_void(pixels, is, 0, 0, i_66_, i_69_ >> 14, i_68_ >> 14, i_72_, i_94_, i_96_, i_99_, i_102_, i_97_, i_100_, i_103_);
								i_68_ += i_91_;
								i_69_ += i_92_;
								i_72_ += i_95_;
								i_66_ += width;
								i_96_ += i_98_;
								i_99_ += i_101_;
								i_102_ += i_104_;
							}
						}
					} else {
						i_67_ = i_69_ <<= 14;
						if (i_66_ < 0) {
							i_67_ -= i_91_ * i_66_;
							i_69_ -= i_92_ * i_66_;
							i_72_ -= i_95_ * i_66_;
							i_66_ = 0;
						}
						i_68_ <<= 14;
						if (i_65_ < 0) {
							i_68_ -= i_90_ * i_65_;
							i_65_ = 0;
						}
						final int i_110_ = i_66_ - field_u_1148;
						i_96_ += i_98_ * i_110_;
						i_99_ += i_101_ * i_110_;
						i_102_ += i_104_ * i_110_;
						if (i_91_ < i_92_) {
							i -= i_65_;
							i_65_ -= i_66_;
							i_66_ = field_i_1145[i_66_];
							for (;;) {
								if (--i_65_ < 0) {
									while (--i >= 0) {
										method_j_void(pixels, is, 0, 0, i_66_, i_68_ >> 14, i_69_ >> 14, i_72_, i_94_, i_96_, i_99_, i_102_, i_97_, i_100_, i_103_);
										i_68_ += i_90_;
										i_69_ += i_92_;
										i_72_ += i_95_;
										i_66_ += width;
										i_96_ += i_98_;
										i_99_ += i_101_;
										i_102_ += i_104_;
									}
									break;
								}
								method_j_void(pixels, is, 0, 0, i_66_, i_67_ >> 14, i_69_ >> 14, i_72_, i_94_, i_96_, i_99_, i_102_, i_97_, i_100_, i_103_);
								i_67_ += i_91_;
								i_69_ += i_92_;
								i_72_ += i_95_;
								i_66_ += width;
								i_96_ += i_98_;
								i_99_ += i_101_;
								i_102_ += i_104_;
							}
						} else {
							i -= i_65_;
							i_65_ -= i_66_;
							i_66_ = field_i_1145[i_66_];
							for (;;) {
								if (--i_65_ < 0) {
									while (--i >= 0) {
										method_j_void(pixels, is, 0, 0, i_66_, i_69_ >> 14, i_68_ >> 14, i_72_, i_94_, i_96_, i_99_, i_102_, i_97_, i_100_, i_103_);
										i_68_ += i_90_;
										i_69_ += i_92_;
										i_72_ += i_95_;
										i_66_ += width;
										i_96_ += i_98_;
										i_99_ += i_101_;
										i_102_ += i_104_;
									}
									break;
								}
								method_j_void(pixels, is, 0, 0, i_66_, i_69_ >> 14, i_67_ >> 14, i_72_, i_94_, i_96_, i_99_, i_102_, i_97_, i_100_, i_103_);
								i_67_ += i_91_;
								i_69_ += i_92_;
								i_72_ += i_95_;
								i_66_ += width;
								i_96_ += i_98_;
								i_99_ += i_101_;
								i_102_ += i_104_;
							}
						}
					}
				}
			}
		}
	}

	static final void method_j_void(final int[] is, final int[] is_111_, int i, int i_112_, int i_113_, int i_114_, int i_115_, int i_116_, int i_117_, int i_118_, int i_119_, int i_120_, final int i_121_, final int i_122_, final int i_123_) {
		if (field_n_1143) {
			if (i_115_ > field_c_1151) {
				i_115_ = field_c_1151;
			}
			if (i_114_ < 0) {
				i_114_ = 0;
			}
		}
		if (i_114_ < i_115_) {
			i_113_ += i_114_;
			i_116_ += i_117_ * i_114_;
			int i_124_ = i_115_ - i_114_;
			if (field_z_1139) {
				final int i_125_ = i_114_ - field_l_1147;
				i_118_ += i_121_ * i_125_;
				i_119_ += i_122_ * i_125_;
				i_120_ += i_123_ * i_125_;
				int i_126_ = i_120_ >> 12;
		int i_127_;
		int i_128_;
		if (i_126_ != 0) {
			i_127_ = i_118_ / i_126_;
			i_128_ = i_119_ / i_126_;
		} else {
			i_127_ = 0;
			i_128_ = 0;
		}
		i_118_ += i_121_ * i_124_;
		i_119_ += i_122_ * i_124_;
		i_120_ += i_123_ * i_124_;
		i_126_ = i_120_ >> 12;
		int i_129_;
		int i_130_;
		if (i_126_ != 0) {
			i_129_ = i_118_ / i_126_;
			i_130_ = i_119_ / i_126_;
		} else {
			i_129_ = 0;
			i_130_ = 0;
		}
		i = (i_127_ << 20) + i_128_;
		final int i_131_ = ((((i_129_ - i_127_) / i_124_) << 20) + ((i_130_ - i_128_) / i_124_));
		i_124_ >>= 3;
		i_117_ <<= 3;
		int i_132_ = i_116_ >> 8;
		if (field_d_1152) {
			if (i_124_ > 0) {
				do {
					i_112_ = is_111_[(i & 0xfc0) + (i >>> 26)];
					is[i_113_++] = (((((i_112_ & 0xff00ff) * i_132_) & ~0xff00ff) + (((i_112_ & 0xff00) * i_132_) & 0xff0000)) >> 8);
					i += i_131_;
					i_112_ = is_111_[(i & 0xfc0) + (i >>> 26)];
					is[i_113_++] = (((((i_112_ & 0xff00ff) * i_132_) & ~0xff00ff) + (((i_112_ & 0xff00) * i_132_) & 0xff0000)) >> 8);
					i += i_131_;
					i_112_ = is_111_[(i & 0xfc0) + (i >>> 26)];
					is[i_113_++] = (((((i_112_ & 0xff00ff) * i_132_) & ~0xff00ff) + (((i_112_ & 0xff00) * i_132_) & 0xff0000)) >> 8);
					i += i_131_;
					i_112_ = is_111_[(i & 0xfc0) + (i >>> 26)];
					is[i_113_++] = (((((i_112_ & 0xff00ff) * i_132_) & ~0xff00ff) + (((i_112_ & 0xff00) * i_132_) & 0xff0000)) >> 8);
					i += i_131_;
					i_112_ = is_111_[(i & 0xfc0) + (i >>> 26)];
					is[i_113_++] = (((((i_112_ & 0xff00ff) * i_132_) & ~0xff00ff) + (((i_112_ & 0xff00) * i_132_) & 0xff0000)) >> 8);
					i += i_131_;
					i_112_ = is_111_[(i & 0xfc0) + (i >>> 26)];
					is[i_113_++] = (((((i_112_ & 0xff00ff) * i_132_) & ~0xff00ff) + (((i_112_ & 0xff00) * i_132_) & 0xff0000)) >> 8);
					i += i_131_;
					i_112_ = is_111_[(i & 0xfc0) + (i >>> 26)];
					is[i_113_++] = (((((i_112_ & 0xff00ff) * i_132_) & ~0xff00ff) + (((i_112_ & 0xff00) * i_132_) & 0xff0000)) >> 8);
					i += i_131_;
					i_112_ = is_111_[(i & 0xfc0) + (i >>> 26)];
					is[i_113_++] = (((((i_112_ & 0xff00ff) * i_132_) & ~0xff00ff) + (((i_112_ & 0xff00) * i_132_) & 0xff0000)) >> 8);
					i += i_131_;
					i_116_ += i_117_;
					i_132_ = i_116_ >> 8;
				} while (--i_124_ > 0);
			}
			i_124_ = (i_115_ - i_114_) & 0x7;
			if (i_124_ > 0) {
				do {
					i_112_ = is_111_[(i & 0xfc0) + (i >>> 26)];
					is[i_113_++] = (((((i_112_ & 0xff00ff) * i_132_) & ~0xff00ff) + (((i_112_ & 0xff00) * i_132_) & 0xff0000)) >> 8);
					i += i_131_;
				} while (--i_124_ > 0);
			}
		} else {
			if (i_124_ > 0) {
				do {
					if ((i_112_ = is_111_[(i & 0xfc0) + (i >>> 26)]) != 0) {
						is[i_113_] = ((((i_112_ & 0xff00ff) * i_132_) & ~0xff00ff) + (((i_112_ & 0xff00) * i_132_) & 0xff0000)) >> 8;
					}
					i_113_++;
					i += i_131_;
					if ((i_112_ = is_111_[(i & 0xfc0) + (i >>> 26)]) != 0) {
						is[i_113_] = ((((i_112_ & 0xff00ff) * i_132_) & ~0xff00ff) + (((i_112_ & 0xff00) * i_132_) & 0xff0000)) >> 8;
					}
					i_113_++;
					i += i_131_;
					if ((i_112_ = is_111_[(i & 0xfc0) + (i >>> 26)]) != 0) {
						is[i_113_] = ((((i_112_ & 0xff00ff) * i_132_) & ~0xff00ff) + (((i_112_ & 0xff00) * i_132_) & 0xff0000)) >> 8;
					}
					i_113_++;
					i += i_131_;
					if ((i_112_ = is_111_[(i & 0xfc0) + (i >>> 26)]) != 0) {
						is[i_113_] = ((((i_112_ & 0xff00ff) * i_132_) & ~0xff00ff) + (((i_112_ & 0xff00) * i_132_) & 0xff0000)) >> 8;
					}
					i_113_++;
					i += i_131_;
					if ((i_112_ = is_111_[(i & 0xfc0) + (i >>> 26)]) != 0) {
						is[i_113_] = ((((i_112_ & 0xff00ff) * i_132_) & ~0xff00ff) + (((i_112_ & 0xff00) * i_132_) & 0xff0000)) >> 8;
					}
					i_113_++;
					i += i_131_;
					if ((i_112_ = is_111_[(i & 0xfc0) + (i >>> 26)]) != 0) {
						is[i_113_] = ((((i_112_ & 0xff00ff) * i_132_) & ~0xff00ff) + (((i_112_ & 0xff00) * i_132_) & 0xff0000)) >> 8;
					}
					i_113_++;
					i += i_131_;
					if ((i_112_ = is_111_[(i & 0xfc0) + (i >>> 26)]) != 0) {
						is[i_113_] = ((((i_112_ & 0xff00ff) * i_132_) & ~0xff00ff) + (((i_112_ & 0xff00) * i_132_) & 0xff0000)) >> 8;
					}
					i_113_++;
					i += i_131_;
					if ((i_112_ = is_111_[(i & 0xfc0) + (i >>> 26)]) != 0) {
						is[i_113_] = ((((i_112_ & 0xff00ff) * i_132_) & ~0xff00ff) + (((i_112_ & 0xff00) * i_132_) & 0xff0000)) >> 8;
					}
					i_113_++;
					i += i_131_;
					i_116_ += i_117_;
					i_132_ = i_116_ >> 8;
				} while (--i_124_ > 0);
			}
			i_124_ = (i_115_ - i_114_) & 0x7;
			if (i_124_ > 0) {
				do {
					if ((i_112_ = is_111_[(i & 0xfc0) + (i >>> 26)]) != 0) {
						is[i_113_] = ((((i_112_ & 0xff00ff) * i_132_) & ~0xff00ff) + (((i_112_ & 0xff00) * i_132_) & 0xff0000)) >> 8;
					}
					i_113_++;
					i += i_131_;
				} while (--i_124_ > 0);
			}
		}
			} else {
				final int i_133_ = i_114_ - field_l_1147;
				i_118_ += i_121_ * i_133_;
				i_119_ += i_122_ * i_133_;
				i_120_ += i_123_ * i_133_;
				int i_134_ = i_120_ >> 14;
				int i_135_;
				int i_136_;
				if (i_134_ != 0) {
					i_135_ = i_118_ / i_134_;
					i_136_ = i_119_ / i_134_;
				} else {
					i_135_ = 0;
					i_136_ = 0;
				}
				i_118_ += i_121_ * i_124_;
				i_119_ += i_122_ * i_124_;
				i_120_ += i_123_ * i_124_;
				i_134_ = i_120_ >> 14;
				int i_137_;
				int i_138_;
				if (i_134_ != 0) {
					i_137_ = i_118_ / i_134_;
					i_138_ = i_119_ / i_134_;
				} else {
					i_137_ = 0;
					i_138_ = 0;
				}
				i = (i_135_ << 18) + i_136_;
				final int i_139_ = ((((i_137_ - i_135_) / i_124_) << 18) + ((i_138_ - i_136_) / i_124_));
				i_124_ >>= 3;
				i_117_ <<= 3;
				int i_140_ = i_116_ >> 8;
				if (field_d_1152) {
					if (i_124_ > 0) {
						do {
							i_112_ = is_111_[(i & 0x3f80) + (i >>> 25)];
							is[i_113_++] = (((((i_112_ & 0xff00ff) * i_140_) & ~0xff00ff) + (((i_112_ & 0xff00) * i_140_) & 0xff0000)) >> 8);
							i += i_139_;
							i_112_ = is_111_[(i & 0x3f80) + (i >>> 25)];
							is[i_113_++] = (((((i_112_ & 0xff00ff) * i_140_) & ~0xff00ff) + (((i_112_ & 0xff00) * i_140_) & 0xff0000)) >> 8);
							i += i_139_;
							i_112_ = is_111_[(i & 0x3f80) + (i >>> 25)];
							is[i_113_++] = (((((i_112_ & 0xff00ff) * i_140_) & ~0xff00ff) + (((i_112_ & 0xff00) * i_140_) & 0xff0000)) >> 8);
							i += i_139_;
							i_112_ = is_111_[(i & 0x3f80) + (i >>> 25)];
							is[i_113_++] = (((((i_112_ & 0xff00ff) * i_140_) & ~0xff00ff) + (((i_112_ & 0xff00) * i_140_) & 0xff0000)) >> 8);
							i += i_139_;
							i_112_ = is_111_[(i & 0x3f80) + (i >>> 25)];
							is[i_113_++] = (((((i_112_ & 0xff00ff) * i_140_) & ~0xff00ff) + (((i_112_ & 0xff00) * i_140_) & 0xff0000)) >> 8);
							i += i_139_;
							i_112_ = is_111_[(i & 0x3f80) + (i >>> 25)];
							is[i_113_++] = (((((i_112_ & 0xff00ff) * i_140_) & ~0xff00ff) + (((i_112_ & 0xff00) * i_140_) & 0xff0000)) >> 8);
							i += i_139_;
							i_112_ = is_111_[(i & 0x3f80) + (i >>> 25)];
							is[i_113_++] = (((((i_112_ & 0xff00ff) * i_140_) & ~0xff00ff) + (((i_112_ & 0xff00) * i_140_) & 0xff0000)) >> 8);
							i += i_139_;
							i_112_ = is_111_[(i & 0x3f80) + (i >>> 25)];
							is[i_113_++] = (((((i_112_ & 0xff00ff) * i_140_) & ~0xff00ff) + (((i_112_ & 0xff00) * i_140_) & 0xff0000)) >> 8);
							i += i_139_;
							i_116_ += i_117_;
							i_140_ = i_116_ >> 8;
						} while (--i_124_ > 0);
					}
					i_124_ = (i_115_ - i_114_) & 0x7;
					if (i_124_ > 0) {
						do {
							i_112_ = is_111_[(i & 0x3f80) + (i >>> 25)];
							is[i_113_++] = (((((i_112_ & 0xff00ff) * i_140_) & ~0xff00ff) + (((i_112_ & 0xff00) * i_140_) & 0xff0000)) >> 8);
							i += i_139_;
						} while (--i_124_ > 0);
					}
				} else {
					if (i_124_ > 0) {
						do {
							if ((i_112_ = is_111_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_113_] = ((((i_112_ & 0xff00ff) * i_140_) & ~0xff00ff) + (((i_112_ & 0xff00) * i_140_) & 0xff0000)) >> 8;
							}
							i_113_++;
							i += i_139_;
							if ((i_112_ = is_111_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_113_] = ((((i_112_ & 0xff00ff) * i_140_) & ~0xff00ff) + (((i_112_ & 0xff00) * i_140_) & 0xff0000)) >> 8;
							}
							i_113_++;
							i += i_139_;
							if ((i_112_ = is_111_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_113_] = ((((i_112_ & 0xff00ff) * i_140_) & ~0xff00ff) + (((i_112_ & 0xff00) * i_140_) & 0xff0000)) >> 8;
							}
							i_113_++;
							i += i_139_;
							if ((i_112_ = is_111_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_113_] = ((((i_112_ & 0xff00ff) * i_140_) & ~0xff00ff) + (((i_112_ & 0xff00) * i_140_) & 0xff0000)) >> 8;
							}
							i_113_++;
							i += i_139_;
							if ((i_112_ = is_111_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_113_] = ((((i_112_ & 0xff00ff) * i_140_) & ~0xff00ff) + (((i_112_ & 0xff00) * i_140_) & 0xff0000)) >> 8;
							}
							i_113_++;
							i += i_139_;
							if ((i_112_ = is_111_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_113_] = ((((i_112_ & 0xff00ff) * i_140_) & ~0xff00ff) + (((i_112_ & 0xff00) * i_140_) & 0xff0000)) >> 8;
							}
							i_113_++;
							i += i_139_;
							if ((i_112_ = is_111_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_113_] = ((((i_112_ & 0xff00ff) * i_140_) & ~0xff00ff) + (((i_112_ & 0xff00) * i_140_) & 0xff0000)) >> 8;
							}
							i_113_++;
							i += i_139_;
							if ((i_112_ = is_111_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_113_] = ((((i_112_ & 0xff00ff) * i_140_) & ~0xff00ff) + (((i_112_ & 0xff00) * i_140_) & 0xff0000)) >> 8;
							}
							i_113_++;
							i += i_139_;
							i_116_ += i_117_;
							i_140_ = i_116_ >> 8;
						} while (--i_124_ > 0);
					}
					i_124_ = (i_115_ - i_114_) & 0x7;
					if (i_124_ > 0) {
						do {
							if ((i_112_ = is_111_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_113_] = ((((i_112_ & 0xff00ff) * i_140_) & ~0xff00ff) + (((i_112_ & 0xff00) * i_140_) & 0xff0000)) >> 8;
							}
							i_113_++;
							i += i_139_;
						} while (--i_124_ > 0);
					}
				}
			}
		}
	}

	public static final void method_e_void(final Interface_cn interface_cn) {
		field_ak_1157 = interface_cn;
	}

	public static final void method_n_void() {
		method_d_void(field_s_514, field_r_512, field_v_509, field_j_513);
	}

	Rasterizer3D() throws Throwable {
		throw new Error();
	}

	static final void method_h_void(int i, int i_141_, int i_142_, int i_143_, int i_144_, int i_145_, int i_146_, int i_147_, int i_148_) {
		final int i_149_ = i_144_ - i_143_;
		final int i_150_ = i_141_ - i;
		final int i_151_ = i_145_ - i_143_;
		final int i_152_ = i_142_ - i;
		final int i_153_ = i_147_ - i_146_;
		final int i_154_ = i_148_ - i_146_;
		int i_155_;
		if (i_142_ != i_141_) {
			i_155_ = ((i_145_ - i_144_) << 14) / (i_142_ - i_141_);
		} else {
			i_155_ = 0;
		}
		int i_156_;
		if (i_141_ != i) {
			i_156_ = (i_149_ << 14) / i_150_;
		} else {
			i_156_ = 0;
		}
		int i_157_;
		if (i_142_ != i) {
			i_157_ = (i_151_ << 14) / i_152_;
		} else {
			i_157_ = 0;
		}
		final int i_158_ = (i_149_ * i_152_) - (i_151_ * i_150_);
		if (i_158_ != 0) {
			final int i_159_ = (((i_153_ * i_152_) - (i_154_ * i_150_)) << 8) / i_158_;
			final int i_160_ = (((i_154_ * i_149_) - (i_153_ * i_151_)) << 8) / i_158_;
			if ((i <= i_141_) && (i <= i_142_)) {
				if (i < field_p_1150) {
					if (i_141_ > field_p_1150) {
						i_141_ = field_p_1150;
					}
					if (i_142_ > field_p_1150) {
						i_142_ = field_p_1150;
					}
					i_146_ = ((i_146_ << 8) - (i_159_ * i_143_)) + i_159_;
					if (i_141_ < i_142_) {
						i_145_ = i_143_ <<= 14;
						if (i < 0) {
							i_145_ -= i_157_ * i;
							i_143_ -= i_156_ * i;
							i_146_ -= i_160_ * i;
							i = 0;
						}
						i_144_ <<= 14;
						if (i_141_ < 0) {
							i_144_ -= i_155_ * i_141_;
							i_141_ = 0;
						}
						if (((i == i_141_) || (i_157_ >= i_156_)) && ((i != i_141_) || (i_157_ <= i_155_))) {
							i_142_ -= i_141_;
							i_141_ -= i;
							i = field_i_1145[i];
							for (;;) {
								if (--i_141_ < 0) {
									while (--i_142_ >= 0) {
										method_l_void(pixels, i, 0, 0, i_144_ >> 14, i_145_ >> 14, i_146_, i_159_);
										i_145_ += i_157_;
										i_144_ += i_155_;
										i_146_ += i_160_;
										i += width;
									}
									break;
								}
								method_l_void(pixels, i, 0, 0, i_143_ >> 14, i_145_ >> 14, i_146_, i_159_);
								i_145_ += i_157_;
								i_143_ += i_156_;
								i_146_ += i_160_;
								i += width;
							}
						} else {
							i_142_ -= i_141_;
							i_141_ -= i;
							i = field_i_1145[i];
							for (;;) {
								if (--i_141_ < 0) {
									while (--i_142_ >= 0) {
										method_l_void(pixels, i, 0, 0, i_145_ >> 14, i_144_ >> 14, i_146_, i_159_);
										i_145_ += i_157_;
										i_144_ += i_155_;
										i_146_ += i_160_;
										i += width;
									}
									break;
								}
								method_l_void(pixels, i, 0, 0, i_145_ >> 14, i_143_ >> 14, i_146_, i_159_);
								i_145_ += i_157_;
								i_143_ += i_156_;
								i_146_ += i_160_;
								i += width;
							}
						}
					} else {
						i_144_ = i_143_ <<= 14;
						if (i < 0) {
							i_144_ -= i_157_ * i;
							i_143_ -= i_156_ * i;
							i_146_ -= i_160_ * i;
							i = 0;
						}
						i_145_ <<= 14;
						if (i_142_ < 0) {
							i_145_ -= i_155_ * i_142_;
							i_142_ = 0;
						}
						if (((i == i_142_) || (i_157_ >= i_156_)) && ((i != i_142_) || (i_155_ <= i_156_))) {
							i_141_ -= i_142_;
							i_142_ -= i;
							i = field_i_1145[i];
							for (;;) {
								if (--i_142_ < 0) {
									while (--i_141_ >= 0) {
										method_l_void(pixels, i, 0, 0, i_143_ >> 14, i_145_ >> 14, i_146_, i_159_);
										i_145_ += i_155_;
										i_143_ += i_156_;
										i_146_ += i_160_;
										i += width;
									}
									break;
								}
								method_l_void(pixels, i, 0, 0, i_143_ >> 14, i_144_ >> 14, i_146_, i_159_);
								i_144_ += i_157_;
								i_143_ += i_156_;
								i_146_ += i_160_;
								i += width;
							}
						} else {
							i_141_ -= i_142_;
							i_142_ -= i;
							i = field_i_1145[i];
							for (;;) {
								if (--i_142_ < 0) {
									while (--i_141_ >= 0) {
										method_l_void(pixels, i, 0, 0, i_145_ >> 14, i_143_ >> 14, i_146_, i_159_);
										i_145_ += i_155_;
										i_143_ += i_156_;
										i_146_ += i_160_;
										i += width;
									}
									break;
								}
								method_l_void(pixels, i, 0, 0, i_144_ >> 14, i_143_ >> 14, i_146_, i_159_);
								i_144_ += i_157_;
								i_143_ += i_156_;
								i_146_ += i_160_;
								i += width;
							}
						}
					}
				}
			} else if (i_141_ <= i_142_) {
				if (i_141_ < field_p_1150) {
					if (i_142_ > field_p_1150) {
						i_142_ = field_p_1150;
					}
					if (i > field_p_1150) {
						i = field_p_1150;
					}
					i_147_ = ((i_147_ << 8) - (i_159_ * i_144_)) + i_159_;
					if (i_142_ < i) {
						i_143_ = i_144_ <<= 14;
						if (i_141_ < 0) {
							i_143_ -= i_156_ * i_141_;
							i_144_ -= i_155_ * i_141_;
							i_147_ -= i_160_ * i_141_;
							i_141_ = 0;
						}
						i_145_ <<= 14;
						if (i_142_ < 0) {
							i_145_ -= i_157_ * i_142_;
							i_142_ = 0;
						}
						if (((i_141_ == i_142_) || (i_156_ >= i_155_)) && ((i_141_ != i_142_) || (i_156_ <= i_157_))) {
							i -= i_142_;
							i_142_ -= i_141_;
							i_141_ = field_i_1145[i_141_];
							for (;;) {
								if (--i_142_ < 0) {
									while (--i >= 0) {
										method_l_void(pixels, i_141_, 0, 0, i_145_ >> 14, i_143_ >> 14, i_147_, i_159_);
										i_143_ += i_156_;
										i_145_ += i_157_;
										i_147_ += i_160_;
										i_141_ += width;
									}
									break;
								}
								method_l_void(pixels, i_141_, 0, 0, i_144_ >> 14, i_143_ >> 14, i_147_, i_159_);
								i_143_ += i_156_;
								i_144_ += i_155_;
								i_147_ += i_160_;
								i_141_ += width;
							}
						} else {
							i -= i_142_;
							i_142_ -= i_141_;
							i_141_ = field_i_1145[i_141_];
							for (;;) {
								if (--i_142_ < 0) {
									while (--i >= 0) {
										method_l_void(pixels, i_141_, 0, 0, i_143_ >> 14, i_145_ >> 14, i_147_, i_159_);
										i_143_ += i_156_;
										i_145_ += i_157_;
										i_147_ += i_160_;
										i_141_ += width;
									}
									break;
								}
								method_l_void(pixels, i_141_, 0, 0, i_143_ >> 14, i_144_ >> 14, i_147_, i_159_);
								i_143_ += i_156_;
								i_144_ += i_155_;
								i_147_ += i_160_;
								i_141_ += width;
							}
						}
					} else {
						i_145_ = i_144_ <<= 14;
						if (i_141_ < 0) {
							i_145_ -= i_156_ * i_141_;
							i_144_ -= i_155_ * i_141_;
							i_147_ -= i_160_ * i_141_;
							i_141_ = 0;
						}
						i_143_ <<= 14;
						if (i < 0) {
							i_143_ -= i_157_ * i;
							i = 0;
						}
						if (i_156_ < i_155_) {
							i_142_ -= i;
							i -= i_141_;
							i_141_ = field_i_1145[i_141_];
							for (;;) {
								if (--i < 0) {
									while (--i_142_ >= 0) {
										method_l_void(pixels, i_141_, 0, 0, i_143_ >> 14, i_144_ >> 14, i_147_, i_159_);
										i_143_ += i_157_;
										i_144_ += i_155_;
										i_147_ += i_160_;
										i_141_ += width;
									}
									break;
								}
								method_l_void(pixels, i_141_, 0, 0, i_145_ >> 14, i_144_ >> 14, i_147_, i_159_);
								i_145_ += i_156_;
								i_144_ += i_155_;
								i_147_ += i_160_;
								i_141_ += width;
							}
						} else {
							i_142_ -= i;
							i -= i_141_;
							i_141_ = field_i_1145[i_141_];
							for (;;) {
								if (--i < 0) {
									while (--i_142_ >= 0) {
										method_l_void(pixels, i_141_, 0, 0, i_144_ >> 14, i_143_ >> 14, i_147_, i_159_);
										i_143_ += i_157_;
										i_144_ += i_155_;
										i_147_ += i_160_;
										i_141_ += width;
									}
									break;
								}
								method_l_void(pixels, i_141_, 0, 0, i_144_ >> 14, i_145_ >> 14, i_147_, i_159_);
								i_145_ += i_156_;
								i_144_ += i_155_;
								i_147_ += i_160_;
								i_141_ += width;
							}
						}
					}
				}
			} else if (i_142_ < field_p_1150) {
				if (i > field_p_1150) {
					i = field_p_1150;
				}
				if (i_141_ > field_p_1150) {
					i_141_ = field_p_1150;
				}
				i_148_ = ((i_148_ << 8) - (i_159_ * i_145_)) + i_159_;
				if (i < i_141_) {
					i_144_ = i_145_ <<= 14;
					if (i_142_ < 0) {
						i_144_ -= i_155_ * i_142_;
						i_145_ -= i_157_ * i_142_;
						i_148_ -= i_160_ * i_142_;
						i_142_ = 0;
					}
					i_143_ <<= 14;
					if (i < 0) {
						i_143_ -= i_156_ * i;
						i = 0;
					}
					if (i_155_ < i_157_) {
						i_141_ -= i;
						i -= i_142_;
						i_142_ = field_i_1145[i_142_];
						for (;;) {
							if (--i < 0) {
								while (--i_141_ >= 0) {
									method_l_void(pixels, i_142_, 0, 0, i_144_ >> 14, i_143_ >> 14, i_148_, i_159_);
									i_144_ += i_155_;
									i_143_ += i_156_;
									i_148_ += i_160_;
									i_142_ += width;
								}
								break;
							}
							method_l_void(pixels, i_142_, 0, 0, i_144_ >> 14, i_145_ >> 14, i_148_, i_159_);
							i_144_ += i_155_;
							i_145_ += i_157_;
							i_148_ += i_160_;
							i_142_ += width;
						}
					} else {
						i_141_ -= i;
						i -= i_142_;
						i_142_ = field_i_1145[i_142_];
						for (;;) {
							if (--i < 0) {
								while (--i_141_ >= 0) {
									method_l_void(pixels, i_142_, 0, 0, i_143_ >> 14, i_144_ >> 14, i_148_, i_159_);
									i_144_ += i_155_;
									i_143_ += i_156_;
									i_148_ += i_160_;
									i_142_ += width;
								}
								break;
							}
							method_l_void(pixels, i_142_, 0, 0, i_145_ >> 14, i_144_ >> 14, i_148_, i_159_);
							i_144_ += i_155_;
							i_145_ += i_157_;
							i_148_ += i_160_;
							i_142_ += width;
						}
					}
				} else {
					i_143_ = i_145_ <<= 14;
					if (i_142_ < 0) {
						i_143_ -= i_155_ * i_142_;
						i_145_ -= i_157_ * i_142_;
						i_148_ -= i_160_ * i_142_;
						i_142_ = 0;
					}
					i_144_ <<= 14;
					if (i_141_ < 0) {
						i_144_ -= i_156_ * i_141_;
						i_141_ = 0;
					}
					if (i_155_ < i_157_) {
						i -= i_141_;
						i_141_ -= i_142_;
						i_142_ = field_i_1145[i_142_];
						for (;;) {
							if (--i_141_ < 0) {
								while (--i >= 0) {
									method_l_void(pixels, i_142_, 0, 0, i_144_ >> 14, i_145_ >> 14, i_148_, i_159_);
									i_144_ += i_156_;
									i_145_ += i_157_;
									i_148_ += i_160_;
									i_142_ += width;
								}
								break;
							}
							method_l_void(pixels, i_142_, 0, 0, i_143_ >> 14, i_145_ >> 14, i_148_, i_159_);
							i_143_ += i_155_;
							i_145_ += i_157_;
							i_148_ += i_160_;
							i_142_ += width;
						}
					} else {
						i -= i_141_;
						i_141_ -= i_142_;
						i_142_ = field_i_1145[i_142_];
						for (;;) {
							if (--i_141_ < 0) {
								while (--i >= 0) {
									method_l_void(pixels, i_142_, 0, 0, i_145_ >> 14, i_144_ >> 14, i_148_, i_159_);
									i_144_ += i_156_;
									i_145_ += i_157_;
									i_148_ += i_160_;
									i_142_ += width;
								}
								break;
							}
							method_l_void(pixels, i_142_, 0, 0, i_145_ >> 14, i_143_ >> 14, i_148_, i_159_);
							i_143_ += i_155_;
							i_145_ += i_157_;
							i_148_ += i_160_;
							i_142_ += width;
						}
					}
				}
			}
		}
	}

	static final void method_x_void(final int[] is, final int[] is_161_, int i, int i_162_, int i_163_, int i_164_, int i_165_, int i_166_, int i_167_, int i_168_, int i_169_, int i_170_, final int i_171_, final int i_172_, final int i_173_) {
		if (field_n_1143) {
			if (i_165_ > field_c_1151) {
				i_165_ = field_c_1151;
			}
			if (i_164_ < 0) {
				i_164_ = 0;
			}
		}
		if (i_164_ < i_165_) {
			i_163_ += i_164_;
			i_166_ += i_167_ * i_164_;
			int i_174_ = i_165_ - i_164_;
			if (field_z_1139) {
				final int i_175_ = i_164_ - field_l_1147;
				i_168_ += (i_171_ >> 3) * i_175_;
				i_169_ += (i_172_ >> 3) * i_175_;
				i_170_ += (i_173_ >> 3) * i_175_;
				int i_176_ = i_170_ >> 12;
				int i_177_;
				int i_178_;
				if (i_176_ != 0) {
					i_177_ = i_168_ / i_176_;
					i_178_ = i_169_ / i_176_;
					if (i_177_ < 0) {
						i_177_ = 0;
					} else if (i_177_ > 4032) {
						i_177_ = 4032;
					}
				} else {
					i_177_ = 0;
					i_178_ = 0;
				}
				i_168_ += i_171_;
				i_169_ += i_172_;
				i_170_ += i_173_;
				i_176_ = i_170_ >> 12;
				int i_179_;
				int i_180_;
				if (i_176_ != 0) {
					i_179_ = i_168_ / i_176_;
					i_180_ = i_169_ / i_176_;
					if (i_179_ < 0) {
						i_179_ = 0;
					} else if (i_179_ > 4032) {
						i_179_ = 4032;
					}
				} else {
					i_179_ = 0;
					i_180_ = 0;
				}
				i = (i_177_ << 20) + i_178_;
				int i_181_ = (((i_179_ - i_177_) >> 3) << 20) + ((i_180_ - i_178_) >> 3);
				i_174_ >>= 3;
				i_167_ <<= 3;
				int i_182_ = i_166_ >> 8;
				if (field_d_1152) {
					if (i_174_ > 0) {
						do {
							i_162_ = is_161_[(i & 0xfc0) + (i >>> 26)];
							is[i_163_++] = (((((i_162_ & 0xff00ff) * i_182_) & ~0xff00ff) + (((i_162_ & 0xff00) * i_182_) & 0xff0000)) >> 8);
							i += i_181_;
							i_162_ = is_161_[(i & 0xfc0) + (i >>> 26)];
							is[i_163_++] = (((((i_162_ & 0xff00ff) * i_182_) & ~0xff00ff) + (((i_162_ & 0xff00) * i_182_) & 0xff0000)) >> 8);
							i += i_181_;
							i_162_ = is_161_[(i & 0xfc0) + (i >>> 26)];
							is[i_163_++] = (((((i_162_ & 0xff00ff) * i_182_) & ~0xff00ff) + (((i_162_ & 0xff00) * i_182_) & 0xff0000)) >> 8);
							i += i_181_;
							i_162_ = is_161_[(i & 0xfc0) + (i >>> 26)];
							is[i_163_++] = (((((i_162_ & 0xff00ff) * i_182_) & ~0xff00ff) + (((i_162_ & 0xff00) * i_182_) & 0xff0000)) >> 8);
							i += i_181_;
							i_162_ = is_161_[(i & 0xfc0) + (i >>> 26)];
							is[i_163_++] = (((((i_162_ & 0xff00ff) * i_182_) & ~0xff00ff) + (((i_162_ & 0xff00) * i_182_) & 0xff0000)) >> 8);
							i += i_181_;
							i_162_ = is_161_[(i & 0xfc0) + (i >>> 26)];
							is[i_163_++] = (((((i_162_ & 0xff00ff) * i_182_) & ~0xff00ff) + (((i_162_ & 0xff00) * i_182_) & 0xff0000)) >> 8);
							i += i_181_;
							i_162_ = is_161_[(i & 0xfc0) + (i >>> 26)];
							is[i_163_++] = (((((i_162_ & 0xff00ff) * i_182_) & ~0xff00ff) + (((i_162_ & 0xff00) * i_182_) & 0xff0000)) >> 8);
							i += i_181_;
							i_162_ = is_161_[(i & 0xfc0) + (i >>> 26)];
							is[i_163_++] = (((((i_162_ & 0xff00ff) * i_182_) & ~0xff00ff) + (((i_162_ & 0xff00) * i_182_) & 0xff0000)) >> 8);
							i_177_ = i_179_;
							i_178_ = i_180_;
							i_168_ += i_171_;
							i_169_ += i_172_;
							i_170_ += i_173_;
							i_176_ = i_170_ >> 12;
							if (i_176_ != 0) {
								i_179_ = i_168_ / i_176_;
								i_180_ = i_169_ / i_176_;
								if (i_179_ < 0) {
									i_179_ = 0;
								} else if (i_179_ > 4032) {
									i_179_ = 4032;
								}
							} else {
								i_179_ = 0;
								i_180_ = 0;
							}
							i = (i_177_ << 20) + i_178_;
							i_181_ = ((((i_179_ - i_177_) >> 3) << 20) + ((i_180_ - i_178_) >> 3));
							i_166_ += i_167_;
							i_182_ = i_166_ >> 8;
						} while (--i_174_ > 0);
					}
					i_174_ = (i_165_ - i_164_) & 0x7;
					if (i_174_ > 0) {
						do {
							i_162_ = is_161_[(i & 0xfc0) + (i >>> 26)];
							is[i_163_++] = (((((i_162_ & 0xff00ff) * i_182_) & ~0xff00ff) + (((i_162_ & 0xff00) * i_182_) & 0xff0000)) >> 8);
							i += i_181_;
						} while (--i_174_ > 0);
					}
				} else {
					if (i_174_ > 0) {
						do {
							if ((i_162_ = is_161_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_163_] = ((((i_162_ & 0xff00ff) * i_182_) & ~0xff00ff) + (((i_162_ & 0xff00) * i_182_) & 0xff0000)) >> 8;
							}
							i_163_++;
							i += i_181_;
							if ((i_162_ = is_161_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_163_] = ((((i_162_ & 0xff00ff) * i_182_) & ~0xff00ff) + (((i_162_ & 0xff00) * i_182_) & 0xff0000)) >> 8;
							}
							i_163_++;
							i += i_181_;
							if ((i_162_ = is_161_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_163_] = ((((i_162_ & 0xff00ff) * i_182_) & ~0xff00ff) + (((i_162_ & 0xff00) * i_182_) & 0xff0000)) >> 8;
							}
							i_163_++;
							i += i_181_;
							if ((i_162_ = is_161_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_163_] = ((((i_162_ & 0xff00ff) * i_182_) & ~0xff00ff) + (((i_162_ & 0xff00) * i_182_) & 0xff0000)) >> 8;
							}
							i_163_++;
							i += i_181_;
							if ((i_162_ = is_161_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_163_] = ((((i_162_ & 0xff00ff) * i_182_) & ~0xff00ff) + (((i_162_ & 0xff00) * i_182_) & 0xff0000)) >> 8;
							}
							i_163_++;
							i += i_181_;
							if ((i_162_ = is_161_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_163_] = ((((i_162_ & 0xff00ff) * i_182_) & ~0xff00ff) + (((i_162_ & 0xff00) * i_182_) & 0xff0000)) >> 8;
							}
							i_163_++;
							i += i_181_;
							if ((i_162_ = is_161_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_163_] = ((((i_162_ & 0xff00ff) * i_182_) & ~0xff00ff) + (((i_162_ & 0xff00) * i_182_) & 0xff0000)) >> 8;
							}
							i_163_++;
							i += i_181_;
							if ((i_162_ = is_161_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_163_] = ((((i_162_ & 0xff00ff) * i_182_) & ~0xff00ff) + (((i_162_ & 0xff00) * i_182_) & 0xff0000)) >> 8;
							}
							i_163_++;
							i_177_ = i_179_;
							i_178_ = i_180_;
							i_168_ += i_171_;
							i_169_ += i_172_;
							i_170_ += i_173_;
							i_176_ = i_170_ >> 12;
							if (i_176_ != 0) {
								i_179_ = i_168_ / i_176_;
								i_180_ = i_169_ / i_176_;
								if (i_179_ < 0) {
									i_179_ = 0;
								} else if (i_179_ > 4032) {
									i_179_ = 4032;
								}
							} else {
								i_179_ = 0;
								i_180_ = 0;
							}
							i = (i_177_ << 20) + i_178_;
							i_181_ = ((((i_179_ - i_177_) >> 3) << 20) + ((i_180_ - i_178_) >> 3));
							i_166_ += i_167_;
							i_182_ = i_166_ >> 8;
						} while (--i_174_ > 0);
					}
					i_174_ = (i_165_ - i_164_) & 0x7;
					if (i_174_ > 0) {
						do {
							if ((i_162_ = is_161_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_163_] = ((((i_162_ & 0xff00ff) * i_182_) & ~0xff00ff) + (((i_162_ & 0xff00) * i_182_) & 0xff0000)) >> 8;
							}
							i_163_++;
							i += i_181_;
						} while (--i_174_ > 0);
					}
				}
			} else {
				final int i_185_ = i_164_ - field_l_1147;
				i_168_ += (i_171_ >> 3) * i_185_;
				i_169_ += (i_172_ >> 3) * i_185_;
				i_170_ += (i_173_ >> 3) * i_185_;
				int i_186_ = i_170_ >> 14;
				int i_187_;
				int i_188_;
				if (i_186_ != 0) {
					i_187_ = i_168_ / i_186_;
					i_188_ = i_169_ / i_186_;
					if (i_187_ < 0) {
						i_187_ = 0;
					} else if (i_187_ > 16256) {
						i_187_ = 16256;
					}
				} else {
					i_187_ = 0;
					i_188_ = 0;
				}
				i_168_ += i_171_;
				i_169_ += i_172_;
				i_170_ += i_173_;
				i_186_ = i_170_ >> 14;
				int i_189_;
				int i_190_;
				if (i_186_ != 0) {
					i_189_ = i_168_ / i_186_;
					i_190_ = i_169_ / i_186_;
					if (i_189_ < 0) {
						i_189_ = 0;
					} else if (i_189_ > 16256) {
						i_189_ = 16256;
					}
				} else {
					i_189_ = 0;
					i_190_ = 0;
				}
				i = (i_187_ << 18) + i_188_;
				int i_191_ = (((i_189_ - i_187_) >> 3) << 18) + ((i_190_ - i_188_) >> 3);
				i_174_ >>= 3;
				i_167_ <<= 3;
				int i_192_ = i_166_ >> 8;
				if (field_d_1152) {
					if (i_174_ > 0) {
						do {
							i_162_ = is_161_[(i & 0x3f80) + (i >>> 25)];
							is[i_163_++] = (((((i_162_ & 0xff00ff) * i_192_) & ~0xff00ff) + (((i_162_ & 0xff00) * i_192_) & 0xff0000)) >> 8);
							i += i_191_;
							i_162_ = is_161_[(i & 0x3f80) + (i >>> 25)];
							is[i_163_++] = (((((i_162_ & 0xff00ff) * i_192_) & ~0xff00ff) + (((i_162_ & 0xff00) * i_192_) & 0xff0000)) >> 8);
							i += i_191_;
							i_162_ = is_161_[(i & 0x3f80) + (i >>> 25)];
							is[i_163_++] = (((((i_162_ & 0xff00ff) * i_192_) & ~0xff00ff) + (((i_162_ & 0xff00) * i_192_) & 0xff0000)) >> 8);
							i += i_191_;
							i_162_ = is_161_[(i & 0x3f80) + (i >>> 25)];
							is[i_163_++] = (((((i_162_ & 0xff00ff) * i_192_) & ~0xff00ff) + (((i_162_ & 0xff00) * i_192_) & 0xff0000)) >> 8);
							i += i_191_;
							i_162_ = is_161_[(i & 0x3f80) + (i >>> 25)];
							is[i_163_++] = (((((i_162_ & 0xff00ff) * i_192_) & ~0xff00ff) + (((i_162_ & 0xff00) * i_192_) & 0xff0000)) >> 8);
							i += i_191_;
							i_162_ = is_161_[(i & 0x3f80) + (i >>> 25)];
							is[i_163_++] = (((((i_162_ & 0xff00ff) * i_192_) & ~0xff00ff) + (((i_162_ & 0xff00) * i_192_) & 0xff0000)) >> 8);
							i += i_191_;
							i_162_ = is_161_[(i & 0x3f80) + (i >>> 25)];
							is[i_163_++] = (((((i_162_ & 0xff00ff) * i_192_) & ~0xff00ff) + (((i_162_ & 0xff00) * i_192_) & 0xff0000)) >> 8);
							i += i_191_;
							i_162_ = is_161_[(i & 0x3f80) + (i >>> 25)];
							is[i_163_++] = (((((i_162_ & 0xff00ff) * i_192_) & ~0xff00ff) + (((i_162_ & 0xff00) * i_192_) & 0xff0000)) >> 8);
							i_187_ = i_189_;
							i_188_ = i_190_;
							i_168_ += i_171_;
							i_169_ += i_172_;
							i_170_ += i_173_;
							i_186_ = i_170_ >> 14;
							if (i_186_ != 0) {
								i_189_ = i_168_ / i_186_;
								i_190_ = i_169_ / i_186_;
								if (i_189_ < 0) {
									i_189_ = 0;
								} else if (i_189_ > 16256) {
									i_189_ = 16256;
								}
							} else {
								i_189_ = 0;
								i_190_ = 0;
							}
							i = (i_187_ << 18) + i_188_;
							i_191_ = ((((i_189_ - i_187_) >> 3) << 18) + ((i_190_ - i_188_) >> 3));
							i_166_ += i_167_;
							i_192_ = i_166_ >> 8;
						} while (--i_174_ > 0);
					}
					i_174_ = (i_165_ - i_164_) & 0x7;
					if (i_174_ > 0) {
						do {
							i_162_ = is_161_[(i & 0x3f80) + (i >>> 25)];
							is[i_163_++] = (((((i_162_ & 0xff00ff) * i_192_) & ~0xff00ff) + (((i_162_ & 0xff00) * i_192_) & 0xff0000)) >> 8);
							i += i_191_;
						} while (--i_174_ > 0);
					}
				} else {
					if (i_174_ > 0) {
						do {
							if ((i_162_ = is_161_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_163_] = ((((i_162_ & 0xff00ff) * i_192_) & ~0xff00ff) + (((i_162_ & 0xff00) * i_192_) & 0xff0000)) >> 8;
							}
							i_163_++;
							i += i_191_;
							if ((i_162_ = is_161_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_163_] = ((((i_162_ & 0xff00ff) * i_192_) & ~0xff00ff) + (((i_162_ & 0xff00) * i_192_) & 0xff0000)) >> 8;
							}
							i_163_++;
							i += i_191_;
							if ((i_162_ = is_161_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_163_] = ((((i_162_ & 0xff00ff) * i_192_) & ~0xff00ff) + (((i_162_ & 0xff00) * i_192_) & 0xff0000)) >> 8;
							}
							i_163_++;
							i += i_191_;
							if ((i_162_ = is_161_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_163_] = ((((i_162_ & 0xff00ff) * i_192_) & ~0xff00ff) + (((i_162_ & 0xff00) * i_192_) & 0xff0000)) >> 8;
							}
							i_163_++;
							i += i_191_;
							if ((i_162_ = is_161_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_163_] = ((((i_162_ & 0xff00ff) * i_192_) & ~0xff00ff) + (((i_162_ & 0xff00) * i_192_) & 0xff0000)) >> 8;
							}
							i_163_++;
							i += i_191_;
							if ((i_162_ = is_161_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_163_] = ((((i_162_ & 0xff00ff) * i_192_) & ~0xff00ff) + (((i_162_ & 0xff00) * i_192_) & 0xff0000)) >> 8;
							}
							i_163_++;
							i += i_191_;
							if ((i_162_ = is_161_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_163_] = ((((i_162_ & 0xff00ff) * i_192_) & ~0xff00ff) + (((i_162_ & 0xff00) * i_192_) & 0xff0000)) >> 8;
							}
							i_163_++;
							i += i_191_;
							if ((i_162_ = is_161_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_163_] = ((((i_162_ & 0xff00ff) * i_192_) & ~0xff00ff) + (((i_162_ & 0xff00) * i_192_) & 0xff0000)) >> 8;
							}
							i_163_++;
							i_187_ = i_189_;
							i_188_ = i_190_;
							i_168_ += i_171_;
							i_169_ += i_172_;
							i_170_ += i_173_;
							i_186_ = i_170_ >> 14;
							if (i_186_ != 0) {
								i_189_ = i_168_ / i_186_;
								i_190_ = i_169_ / i_186_;
								if (i_189_ < 0) {
									i_189_ = 0;
								} else if (i_189_ > 16256) {
									i_189_ = 16256;
								}
							} else {
								i_189_ = 0;
								i_190_ = 0;
							}
							i = (i_187_ << 18) + i_188_;
							i_191_ = ((((i_189_ - i_187_) >> 3) << 18) + ((i_190_ - i_188_) >> 3));
							i_166_ += i_167_;
							i_192_ = i_166_ >> 8;
						} while (--i_174_ > 0);
					}
					i_174_ = (i_165_ - i_164_) & 0x7;
					if (i_174_ > 0) {
						do {
							if ((i_162_ = is_161_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_163_] = ((((i_162_ & 0xff00ff) * i_192_) & ~0xff00ff) + (((i_162_ & 0xff00) * i_192_) & 0xff0000)) >> 8;
							}
							i_163_++;
							i += i_191_;
						} while (--i_174_ > 0);
					}
				}
			}
		}
	}

	static final void method_k_void(int i, int i_195_, int i_196_, int i_197_, int i_198_, int i_199_, int i_200_, int i_201_, int i_202_, final int i_203_, int i_204_, int i_205_, final int i_206_, int i_207_, int i_208_, final int i_209_, int i_210_, int i_211_, final int i_212_) {
		final int[] is = field_ak_1157.method_n_intArray(i_212_, 1281917278);
		if (is == null) {
			final int i_213_ = field_ak_1157.method_d_int(i_212_, 311521226);
			method_h_void(i, i_195_, i_196_, i_197_, i_198_, i_199_, method_s_int(i_213_, i_200_), method_s_int(i_213_, i_201_), method_s_int(i_213_, i_202_));
		} else {
			field_z_1139 = field_ak_1157.method_y_boolean(i_212_, 1513319491);
			field_d_1152 = field_ak_1157.method_z_boolean(i_212_, (short) 16091);
			final int i_214_ = i_198_ - i_197_;
			final int i_215_ = i_195_ - i;
			final int i_216_ = i_199_ - i_197_;
			final int i_217_ = i_196_ - i;
			final int i_218_ = i_201_ - i_200_;
			final int i_219_ = i_202_ - i_200_;
			int i_220_ = 0;
			if (i_195_ != i) {
				i_220_ = ((i_198_ - i_197_) << 14) / (i_195_ - i);
			}
			int i_221_ = 0;
			if (i_196_ != i_195_) {
				i_221_ = ((i_199_ - i_198_) << 14) / (i_196_ - i_195_);
			}
			int i_222_ = 0;
			if (i_196_ != i) {
				i_222_ = ((i_197_ - i_199_) << 14) / (i - i_196_);
			}
			final int i_223_ = (i_214_ * i_217_) - (i_216_ * i_215_);
			if (i_223_ != 0) {
				final int i_224_ = (((i_218_ * i_217_) - (i_219_ * i_215_)) << 9) / i_223_;
				final int i_225_ = (((i_219_ * i_214_) - (i_218_ * i_216_)) << 9) / i_223_;
				i_204_ = i_203_ - i_204_;
				i_207_ = i_206_ - i_207_;
				i_210_ = i_209_ - i_210_;
				i_205_ -= i_203_;
				i_208_ -= i_206_;
				i_211_ -= i_209_;
				int i_226_ = ((i_205_ * i_206_) - (i_208_ * i_203_)) << 14;
				final int i_227_ = (int) (((long) ((i_208_ * i_209_) - (i_211_ * i_206_)) << 3 << 14) / field_h_1146);
				final int i_228_ = (int) (((long) ((i_211_ * i_203_) - (i_205_ * i_209_)) << 14) / field_h_1146);
				int i_229_ = ((i_204_ * i_206_) - (i_207_ * i_203_)) << 14;
				final int i_230_ = (int) (((long) ((i_207_ * i_209_) - (i_210_ * i_206_)) << 3 << 14) / field_h_1146);
				final int i_231_ = (int) (((long) ((i_210_ * i_203_) - (i_204_ * i_209_)) << 14) / field_h_1146);
				int i_232_ = ((i_207_ * i_205_) - (i_204_ * i_208_)) << 14;
				final int i_233_ = (int) (((long) ((i_210_ * i_208_) - (i_207_ * i_211_)) << 3 << 14) / field_h_1146);
				final int i_234_ = (int) (((long) ((i_204_ * i_211_) - (i_210_ * i_205_)) << 14) / field_h_1146);
				if ((i <= i_195_) && (i <= i_196_)) {
					if (i < field_p_1150) {
						if (i_195_ > field_p_1150) {
							i_195_ = field_p_1150;
						}
						if (i_196_ > field_p_1150) {
							i_196_ = field_p_1150;
						}
						i_200_ = ((i_200_ << 9) - (i_224_ * i_197_)) + i_224_;
						if (i_195_ < i_196_) {
							i_199_ = i_197_ <<= 14;
							if (i < 0) {
								i_199_ -= i_222_ * i;
								i_197_ -= i_220_ * i;
								i_200_ -= i_225_ * i;
								i = 0;
							}
							i_198_ <<= 14;
							if (i_195_ < 0) {
								i_198_ -= i_221_ * i_195_;
								i_195_ = 0;
							}
							final int i_235_ = i - field_u_1148;
							i_226_ += i_228_ * i_235_;
							i_229_ += i_231_ * i_235_;
							i_232_ += i_234_ * i_235_;
							if (((i == i_195_) || (i_222_ >= i_220_)) && ((i != i_195_) || (i_222_ <= i_221_))) {
								i_196_ -= i_195_;
								i_195_ -= i;
								i = field_i_1145[i];
								for (;;) {
									if (--i_195_ < 0) {
										while (--i_196_ >= 0) {
											method_x_void(pixels, is, 0, 0, i, i_198_ >> 14, i_199_ >> 14, i_200_, i_224_, i_226_, i_229_, i_232_, i_227_, i_230_, i_233_);
											i_199_ += i_222_;
											i_198_ += i_221_;
											i_200_ += i_225_;
											i += width;
											i_226_ += i_228_;
											i_229_ += i_231_;
											i_232_ += i_234_;
										}
										break;
									}
									method_x_void(pixels, is, 0, 0, i, i_197_ >> 14, i_199_ >> 14, i_200_, i_224_, i_226_, i_229_, i_232_, i_227_, i_230_, i_233_);
									i_199_ += i_222_;
									i_197_ += i_220_;
									i_200_ += i_225_;
									i += width;
									i_226_ += i_228_;
									i_229_ += i_231_;
									i_232_ += i_234_;
								}
							} else {
								i_196_ -= i_195_;
								i_195_ -= i;
								i = field_i_1145[i];
								for (;;) {
									if (--i_195_ < 0) {
										while (--i_196_ >= 0) {
											method_x_void(pixels, is, 0, 0, i, i_199_ >> 14, i_198_ >> 14, i_200_, i_224_, i_226_, i_229_, i_232_, i_227_, i_230_, i_233_);
											i_199_ += i_222_;
											i_198_ += i_221_;
											i_200_ += i_225_;
											i += width;
											i_226_ += i_228_;
											i_229_ += i_231_;
											i_232_ += i_234_;
										}
										break;
									}
									method_x_void(pixels, is, 0, 0, i, i_199_ >> 14, i_197_ >> 14, i_200_, i_224_, i_226_, i_229_, i_232_, i_227_, i_230_, i_233_);
									i_199_ += i_222_;
									i_197_ += i_220_;
									i_200_ += i_225_;
									i += width;
									i_226_ += i_228_;
									i_229_ += i_231_;
									i_232_ += i_234_;
								}
							}
						} else {
							i_198_ = i_197_ <<= 14;
							if (i < 0) {
								i_198_ -= i_222_ * i;
								i_197_ -= i_220_ * i;
								i_200_ -= i_225_ * i;
								i = 0;
							}
							i_199_ <<= 14;
							if (i_196_ < 0) {
								i_199_ -= i_221_ * i_196_;
								i_196_ = 0;
							}
							final int i_236_ = i - field_u_1148;
							i_226_ += i_228_ * i_236_;
							i_229_ += i_231_ * i_236_;
							i_232_ += i_234_ * i_236_;
							if (((i == i_196_) || (i_222_ >= i_220_)) && ((i != i_196_) || (i_221_ <= i_220_))) {
								i_195_ -= i_196_;
								i_196_ -= i;
								i = field_i_1145[i];
								for (;;) {
									if (--i_196_ < 0) {
										while (--i_195_ >= 0) {
											method_x_void(pixels, is, 0, 0, i, i_197_ >> 14, i_199_ >> 14, i_200_, i_224_, i_226_, i_229_, i_232_, i_227_, i_230_, i_233_);
											i_199_ += i_221_;
											i_197_ += i_220_;
											i_200_ += i_225_;
											i += width;
											i_226_ += i_228_;
											i_229_ += i_231_;
											i_232_ += i_234_;
										}
										break;
									}
									method_x_void(pixels, is, 0, 0, i, i_197_ >> 14, i_198_ >> 14, i_200_, i_224_, i_226_, i_229_, i_232_, i_227_, i_230_, i_233_);
									i_198_ += i_222_;
									i_197_ += i_220_;
									i_200_ += i_225_;
									i += width;
									i_226_ += i_228_;
									i_229_ += i_231_;
									i_232_ += i_234_;
								}
							} else {
								i_195_ -= i_196_;
								i_196_ -= i;
								i = field_i_1145[i];
								for (;;) {
									if (--i_196_ < 0) {
										while (--i_195_ >= 0) {
											method_x_void(pixels, is, 0, 0, i, i_199_ >> 14, i_197_ >> 14, i_200_, i_224_, i_226_, i_229_, i_232_, i_227_, i_230_, i_233_);
											i_199_ += i_221_;
											i_197_ += i_220_;
											i_200_ += i_225_;
											i += width;
											i_226_ += i_228_;
											i_229_ += i_231_;
											i_232_ += i_234_;
										}
										break;
									}
									method_x_void(pixels, is, 0, 0, i, i_198_ >> 14, i_197_ >> 14, i_200_, i_224_, i_226_, i_229_, i_232_, i_227_, i_230_, i_233_);
									i_198_ += i_222_;
									i_197_ += i_220_;
									i_200_ += i_225_;
									i += width;
									i_226_ += i_228_;
									i_229_ += i_231_;
									i_232_ += i_234_;
								}
							}
						}
					}
				} else if (i_195_ <= i_196_) {
					if (i_195_ < field_p_1150) {
						if (i_196_ > field_p_1150) {
							i_196_ = field_p_1150;
						}
						if (i > field_p_1150) {
							i = field_p_1150;
						}
						i_201_ = ((i_201_ << 9) - (i_224_ * i_198_)) + i_224_;
						if (i_196_ < i) {
							i_197_ = i_198_ <<= 14;
							if (i_195_ < 0) {
								i_197_ -= i_220_ * i_195_;
								i_198_ -= i_221_ * i_195_;
								i_201_ -= i_225_ * i_195_;
								i_195_ = 0;
							}
							i_199_ <<= 14;
							if (i_196_ < 0) {
								i_199_ -= i_222_ * i_196_;
								i_196_ = 0;
							}
							final int i_237_ = i_195_ - field_u_1148;
							i_226_ += i_228_ * i_237_;
							i_229_ += i_231_ * i_237_;
							i_232_ += i_234_ * i_237_;
							if (((i_195_ == i_196_) || (i_220_ >= i_221_)) && ((i_195_ != i_196_) || (i_220_ <= i_222_))) {
								i -= i_196_;
								i_196_ -= i_195_;
								i_195_ = field_i_1145[i_195_];
								for (;;) {
									if (--i_196_ < 0) {
										while (--i >= 0) {
											method_x_void(pixels, is, 0, 0, i_195_, i_199_ >> 14, i_197_ >> 14, i_201_, i_224_, i_226_, i_229_, i_232_, i_227_, i_230_, i_233_);
											i_197_ += i_220_;
											i_199_ += i_222_;
											i_201_ += i_225_;
											i_195_ += width;
											i_226_ += i_228_;
											i_229_ += i_231_;
											i_232_ += i_234_;
										}
										break;
									}
									method_x_void(pixels, is, 0, 0, i_195_, i_198_ >> 14, i_197_ >> 14, i_201_, i_224_, i_226_, i_229_, i_232_, i_227_, i_230_, i_233_);
									i_197_ += i_220_;
									i_198_ += i_221_;
									i_201_ += i_225_;
									i_195_ += width;
									i_226_ += i_228_;
									i_229_ += i_231_;
									i_232_ += i_234_;
								}
							} else {
								i -= i_196_;
								i_196_ -= i_195_;
								i_195_ = field_i_1145[i_195_];
								for (;;) {
									if (--i_196_ < 0) {
										while (--i >= 0) {
											method_x_void(pixels, is, 0, 0, i_195_, i_197_ >> 14, i_199_ >> 14, i_201_, i_224_, i_226_, i_229_, i_232_, i_227_, i_230_, i_233_);
											i_197_ += i_220_;
											i_199_ += i_222_;
											i_201_ += i_225_;
											i_195_ += width;
											i_226_ += i_228_;
											i_229_ += i_231_;
											i_232_ += i_234_;
										}
										break;
									}
									method_x_void(pixels, is, 0, 0, i_195_, i_197_ >> 14, i_198_ >> 14, i_201_, i_224_, i_226_, i_229_, i_232_, i_227_, i_230_, i_233_);
									i_197_ += i_220_;
									i_198_ += i_221_;
									i_201_ += i_225_;
									i_195_ += width;
									i_226_ += i_228_;
									i_229_ += i_231_;
									i_232_ += i_234_;
								}
							}
						} else {
							i_199_ = i_198_ <<= 14;
							if (i_195_ < 0) {
								i_199_ -= i_220_ * i_195_;
								i_198_ -= i_221_ * i_195_;
								i_201_ -= i_225_ * i_195_;
								i_195_ = 0;
							}
							i_197_ <<= 14;
							if (i < 0) {
								i_197_ -= i_222_ * i;
								i = 0;
							}
							final int i_238_ = i_195_ - field_u_1148;
							i_226_ += i_228_ * i_238_;
							i_229_ += i_231_ * i_238_;
							i_232_ += i_234_ * i_238_;
							if (i_220_ < i_221_) {
								i_196_ -= i;
								i -= i_195_;
								i_195_ = field_i_1145[i_195_];
								for (;;) {
									if (--i < 0) {
										while (--i_196_ >= 0) {
											method_x_void(pixels, is, 0, 0, i_195_, i_197_ >> 14, i_198_ >> 14, i_201_, i_224_, i_226_, i_229_, i_232_, i_227_, i_230_, i_233_);
											i_197_ += i_222_;
											i_198_ += i_221_;
											i_201_ += i_225_;
											i_195_ += width;
											i_226_ += i_228_;
											i_229_ += i_231_;
											i_232_ += i_234_;
										}
										break;
									}
									method_x_void(pixels, is, 0, 0, i_195_, i_199_ >> 14, i_198_ >> 14, i_201_, i_224_, i_226_, i_229_, i_232_, i_227_, i_230_, i_233_);
									i_199_ += i_220_;
									i_198_ += i_221_;
									i_201_ += i_225_;
									i_195_ += width;
									i_226_ += i_228_;
									i_229_ += i_231_;
									i_232_ += i_234_;
								}
							} else {
								i_196_ -= i;
								i -= i_195_;
								i_195_ = field_i_1145[i_195_];
								for (;;) {
									if (--i < 0) {
										while (--i_196_ >= 0) {
											method_x_void(pixels, is, 0, 0, i_195_, i_198_ >> 14, i_197_ >> 14, i_201_, i_224_, i_226_, i_229_, i_232_, i_227_, i_230_, i_233_);
											i_197_ += i_222_;
											i_198_ += i_221_;
											i_201_ += i_225_;
											i_195_ += width;
											i_226_ += i_228_;
											i_229_ += i_231_;
											i_232_ += i_234_;
										}
										break;
									}
									method_x_void(pixels, is, 0, 0, i_195_, i_198_ >> 14, i_199_ >> 14, i_201_, i_224_, i_226_, i_229_, i_232_, i_227_, i_230_, i_233_);
									i_199_ += i_220_;
									i_198_ += i_221_;
									i_201_ += i_225_;
									i_195_ += width;
									i_226_ += i_228_;
									i_229_ += i_231_;
									i_232_ += i_234_;
								}
							}
						}
					}
				} else if (i_196_ < field_p_1150) {
					if (i > field_p_1150) {
						i = field_p_1150;
					}
					if (i_195_ > field_p_1150) {
						i_195_ = field_p_1150;
					}
					i_202_ = ((i_202_ << 9) - (i_224_ * i_199_)) + i_224_;
					if (i < i_195_) {
						i_198_ = i_199_ <<= 14;
						if (i_196_ < 0) {
							i_198_ -= i_221_ * i_196_;
							i_199_ -= i_222_ * i_196_;
							i_202_ -= i_225_ * i_196_;
							i_196_ = 0;
						}
						i_197_ <<= 14;
						if (i < 0) {
							i_197_ -= i_220_ * i;
							i = 0;
						}
						final int i_239_ = i_196_ - field_u_1148;
						i_226_ += i_228_ * i_239_;
						i_229_ += i_231_ * i_239_;
						i_232_ += i_234_ * i_239_;
						if (i_221_ < i_222_) {
							i_195_ -= i;
							i -= i_196_;
							i_196_ = field_i_1145[i_196_];
							for (;;) {
								if (--i < 0) {
									while (--i_195_ >= 0) {
										method_x_void(pixels, is, 0, 0, i_196_, i_198_ >> 14, i_197_ >> 14, i_202_, i_224_, i_226_, i_229_, i_232_, i_227_, i_230_, i_233_);
										i_198_ += i_221_;
										i_197_ += i_220_;
										i_202_ += i_225_;
										i_196_ += width;
										i_226_ += i_228_;
										i_229_ += i_231_;
										i_232_ += i_234_;
									}
									break;
								}
								method_x_void(pixels, is, 0, 0, i_196_, i_198_ >> 14, i_199_ >> 14, i_202_, i_224_, i_226_, i_229_, i_232_, i_227_, i_230_, i_233_);
								i_198_ += i_221_;
								i_199_ += i_222_;
								i_202_ += i_225_;
								i_196_ += width;
								i_226_ += i_228_;
								i_229_ += i_231_;
								i_232_ += i_234_;
							}
						} else {
							i_195_ -= i;
							i -= i_196_;
							i_196_ = field_i_1145[i_196_];
							for (;;) {
								if (--i < 0) {
									while (--i_195_ >= 0) {
										method_x_void(pixels, is, 0, 0, i_196_, i_197_ >> 14, i_198_ >> 14, i_202_, i_224_, i_226_, i_229_, i_232_, i_227_, i_230_, i_233_);
										i_198_ += i_221_;
										i_197_ += i_220_;
										i_202_ += i_225_;
										i_196_ += width;
										i_226_ += i_228_;
										i_229_ += i_231_;
										i_232_ += i_234_;
									}
									break;
								}
								method_x_void(pixels, is, 0, 0, i_196_, i_199_ >> 14, i_198_ >> 14, i_202_, i_224_, i_226_, i_229_, i_232_, i_227_, i_230_, i_233_);
								i_198_ += i_221_;
								i_199_ += i_222_;
								i_202_ += i_225_;
								i_196_ += width;
								i_226_ += i_228_;
								i_229_ += i_231_;
								i_232_ += i_234_;
							}
						}
					} else {
						i_197_ = i_199_ <<= 14;
						if (i_196_ < 0) {
							i_197_ -= i_221_ * i_196_;
							i_199_ -= i_222_ * i_196_;
							i_202_ -= i_225_ * i_196_;
							i_196_ = 0;
						}
						i_198_ <<= 14;
						if (i_195_ < 0) {
							i_198_ -= i_220_ * i_195_;
							i_195_ = 0;
						}
						final int i_240_ = i_196_ - field_u_1148;
						i_226_ += i_228_ * i_240_;
						i_229_ += i_231_ * i_240_;
						i_232_ += i_234_ * i_240_;
						if (i_221_ < i_222_) {
							i -= i_195_;
							i_195_ -= i_196_;
							i_196_ = field_i_1145[i_196_];
							for (;;) {
								if (--i_195_ < 0) {
									while (--i >= 0) {
										method_x_void(pixels, is, 0, 0, i_196_, i_198_ >> 14, i_199_ >> 14, i_202_, i_224_, i_226_, i_229_, i_232_, i_227_, i_230_, i_233_);
										i_198_ += i_220_;
										i_199_ += i_222_;
										i_202_ += i_225_;
										i_196_ += width;
										i_226_ += i_228_;
										i_229_ += i_231_;
										i_232_ += i_234_;
									}
									break;
								}
								method_x_void(pixels, is, 0, 0, i_196_, i_197_ >> 14, i_199_ >> 14, i_202_, i_224_, i_226_, i_229_, i_232_, i_227_, i_230_, i_233_);
								i_197_ += i_221_;
								i_199_ += i_222_;
								i_202_ += i_225_;
								i_196_ += width;
								i_226_ += i_228_;
								i_229_ += i_231_;
								i_232_ += i_234_;
							}
						} else {
							i -= i_195_;
							i_195_ -= i_196_;
							i_196_ = field_i_1145[i_196_];
							for (;;) {
								if (--i_195_ < 0) {
									while (--i >= 0) {
										method_x_void(pixels, is, 0, 0, i_196_, i_199_ >> 14, i_198_ >> 14, i_202_, i_224_, i_226_, i_229_, i_232_, i_227_, i_230_, i_233_);
										i_198_ += i_220_;
										i_199_ += i_222_;
										i_202_ += i_225_;
										i_196_ += width;
										i_226_ += i_228_;
										i_229_ += i_231_;
										i_232_ += i_234_;
									}
									break;
								}
								method_x_void(pixels, is, 0, 0, i_196_, i_199_ >> 14, i_197_ >> 14, i_202_, i_224_, i_226_, i_229_, i_232_, i_227_, i_230_, i_233_);
								i_197_ += i_221_;
								i_199_ += i_222_;
								i_202_ += i_225_;
								i_196_ += width;
								i_226_ += i_228_;
								i_229_ += i_231_;
								i_232_ += i_234_;
							}
						}
					}
				}
			}
		}
	}

	static final int method_s_int(final int i, int i_241_) {
		i_241_ = (i_241_ * (i & 0x7f)) >> 7;
		if (i_241_ < 2) {
			i_241_ = 2;
		} else if (i_241_ > 126) {
			i_241_ = 126;
		}
		return (i & 0xff80) + i_241_;
	}
}
