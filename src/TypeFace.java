/* Class_ht - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public abstract class TypeFace extends Rasterizer {
	static int field_o_3095 = -1;
	byte[][] field_n_3096;
	int[] field_z_3097;
	static int alpha = 256;
	int field_m_3099;
	int[] field_g_3100;
	public int field_f_3101;
	static int field_u_3102 = -1;
	int field_a_3103;
	public static Sprite[] crowns;
	byte[] field_l_3105;
	int[] field_d_3106;
	static int field_c_3107 = -1;
	static int field_p_3108 = -1;
	int[] field_e_3109;
	static int field_b_3110 = 0;
	static int field_t_3111 = 0;
	int[] field_y_3112;
	static int field_i_3113 = 0;
	static int field_ad_3114 = 0;
	static Random field_ak_3115 = new Random();
	static String[] text = new String[100];

	static void method_t_void(final byte[] is, int i, int i_0_, int i_1_, int i_2_, final int i_3_) {
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

	void method_n_void(final byte[] is) {
		this.field_d_3106 = new int[256];
		if (is.length == 257) {
			for (int i = 0; i < this.field_d_3106.length; i++) {
				this.field_d_3106[i] = is[i] & 0xff;
			}
			field_f_3101 = is[256] & 0xff;
		} else {
			int i = 0;
			for (int i_11_ = 0; i_11_ < 256; i_11_++) {
				this.field_d_3106[i_11_] = is[i++] & 0xff;
			}
			final int[] is_12_ = new int[256];
			final int[] is_13_ = new int[256];
			for (int i_14_ = 0; i_14_ < 256; i_14_++) {
				is_12_[i_14_] = is[i++] & 0xff;
			}
			for (int i_15_ = 0; i_15_ < 256; i_15_++) {
				is_13_[i_15_] = is[i++] & 0xff;
			}
			final byte[][] is_16_ = new byte[256][];
			for (int i_17_ = 0; i_17_ < 256; i_17_++) {
				is_16_[i_17_] = new byte[is_12_[i_17_]];
				byte i_18_ = 0;
				for (int i_19_ = 0; i_19_ < is_16_[i_17_].length; i_19_++) {
					i_18_ += is[i++];
					is_16_[i_17_][i_19_] = i_18_;
				}
			}
			final byte[][] is_20_ = new byte[256][];
			for (int i_21_ = 0; i_21_ < 256; i_21_++) {
				is_20_[i_21_] = new byte[is_12_[i_21_]];
				byte i_22_ = 0;
				for (int i_23_ = 0; i_23_ < is_20_[i_21_].length; i_23_++) {
					i_22_ += is[i++];
					is_20_[i_21_][i_23_] = i_22_;
				}
			}
			this.field_l_3105 = new byte[65536];
			for (int i_24_ = 0; i_24_ < 256; i_24_++) {
				if ((i_24_ != 32) && (i_24_ != 160)) {
					for (int i_25_ = 0; i_25_ < 256; i_25_++) {
						if ((i_25_ != 32) && (i_25_ != 160)) {
							this.field_l_3105[((i_24_ << 8) + i_25_)] = (byte) method_d_int(is_16_, is_20_, is_13_, (this.field_d_3106), is_12_, i_24_, i_25_);
						}
					}
				}
			}
			field_f_3101 = is_13_[32] + is_12_[32];
		}
	}

	public int getTextWidth(final String string) {
		if (string == null) {
			return 0;
		}
		int i = -1;
		int i_26_ = -1;
		int i_27_ = 0;
		for (int i_28_ = 0; i_28_ < string.length(); i_28_++) {
			char c = string.charAt(i_28_);
			if (c == 60) {
				i = i_28_;
			} else {
				if ((c == 62) && (i != -1)) {
					final String string_29_ = string.substring(i + 1, i_28_);
					i = -1;
					if (string_29_.equals("lt")) {
						c = '<';
					} else {
						if (!string_29_.equals("gt")) {
							if (string_29_.startsWith("img=")) {
								try {
									final String string_30_ = string_29_.substring(4);
									final int i_31_ = Class_w.method_y_int(string_30_, 10, true, (byte) 108);
									i_27_ += crowns[i_31_].spriteWidth;
									i_26_ = -1;
								} catch (final Exception exception) {
									/* empty */
								}
							}
							continue;
						}
						c = '>';
					}
				}
				if (c == 160) {
					c = ' ';
				}
				if (i == -1) {
					i_27_ += (this.field_d_3106[(char) (MachineInformationNode.method_n_byte(c, (byte) -48) & 0xff)]);
					if ((this.field_l_3105 != null) && (i_26_ != -1)) {
						i_27_ += (this.field_l_3105[(i_26_ << 8) + c]);
					}
					i_26_ = c;
				}
			}
		}
		return i_27_;
	}

	public int method_g_int(final String string, final int i) {
		final int i_32_ = method_e_int(string, new int[] { i }, text);
		int i_33_ = 0;
		for (int i_34_ = 0; i_34_ < i_32_; i_34_++) {
			final int i_35_ = getTextWidth(text[i_34_]);
			if (i_35_ > i_33_) {
				i_33_ = i_35_;
			}
		}
		return i_33_;
	}

	public int method_f_int(final String string, final int i) {
		return method_e_int(string, new int[] { i }, text);
	}

	public static String method_m_String(final String string) {
		final int i = string.length();
		int i_36_ = 0;
		for (int i_37_ = 0; i_37_ < i; i_37_++) {
			final char c = string.charAt(i_37_);
			if ((c == '<') || (c == '>')) {
				i_36_ += 3;
			}
		}
		final StringBuilder stringbuilder = new StringBuilder(i + i_36_);
		for (int i_38_ = 0; i_38_ < i; i_38_++) {
			final char c = string.charAt(i_38_);
			if (c == '<') {
				stringbuilder.append("<lt>");
			} else if (c == '>') {
				stringbuilder.append("<gt>");
			} else {
				stringbuilder.append(c);
			}
		}
		return stringbuilder.toString();
	}

	public void method_a_void(final String string, final int i, final int i_39_, final int i_40_, final int i_41_) {
		if (string != null) {
			setColorShadow(i_40_, i_41_);
			drawBasicString(string, i, i_39_);
		}
	}

	public void drawStringRight(final String string, final int i, final int i_42_, final int i_43_, final int i_44_) {
		if (string != null) {
			setColorShadow(i_43_, i_44_);
			drawBasicString(string, i - getTextWidth(string), i_42_);
		}
	}
	
	public void drawAlphaStringRight(String message, int x, int y, int var4, int var5, int alpha) {
		if(message != null) {
			this.setColorShadow(var4, var5);
			this.setAlpha(alpha);
			this.drawBasicString(message, x - this.getTextWidth(message), y);
		}
	}

	@SuppressWarnings("static-access")
	private void setAlpha(int alpha) {
		this.alpha = alpha;
	}

	public void drawCenteredString(String string, final int i, final int i_45_, final int i_46_, final int i_47_) {
		if (string != null) {
			setColorShadow(i_46_, i_47_);
			drawBasicString(string, i - (getTextWidth(string) / 2), i_45_);
		}
	}

	public int method_u_int(final String string, final int i, final int i_48_, final int i_49_, final int i_50_, final int i_51_, final int i_52_, final int i_53_, int i_54_, int i_55_) {
		if (string == null) {
			return 0;
		}
		setColorShadow(i_51_, i_52_);
		if (i_55_ == 0) {
			i_55_ = field_f_3101;
		}
		int[] is = { i_49_ };
		if ((i_50_ < (this.field_m_3099 + this.field_a_3103 + i_55_)) && (i_50_ < (i_55_ + i_55_))) {
			is = null;
		}
		final int i_56_ = method_e_int(string, is, text);
		if ((i_54_ == 3) && (i_56_ == 1)) {
			i_54_ = 1;
		}
		int i_57_;
		if (i_54_ == 0) {
			i_57_ = i_48_ + this.field_m_3099;
		} else if (i_54_ == 1) {
			i_57_ = (i_48_ + this.field_m_3099 + ((i_50_ - this.field_m_3099 - this.field_a_3103 - ((i_56_ - 1) * i_55_)) / 2));
		} else if (i_54_ == 2) {
			i_57_ = ((i_48_ + i_50_) - this.field_a_3103 - ((i_56_ - 1) * i_55_));
		} else {
			int i_58_ = ((i_50_ - this.field_m_3099 - this.field_a_3103 - ((i_56_ - 1) * i_55_)) / (i_56_ + 1));
			if (i_58_ < 0) {
				i_58_ = 0;
			}
			i_57_ = i_48_ + this.field_m_3099 + i_58_;
			i_55_ += i_58_;
		}
		for (int i_59_ = 0; i_59_ < i_56_; i_59_++) {
			if (i_53_ == 0) {
				drawBasicString(text[i_59_], i, i_57_);
			} else if (i_53_ == 1) {// align center
				drawBasicString(text[i_59_], i + ((i_49_ - getTextWidth(text[i_59_])) / 2), i_57_);
			} else if (i_53_ == 2) {// align right
				drawBasicString(text[i_59_], i + (i_49_ - getTextWidth(text[i_59_])), i_57_);
			} else if (i_59_ == (i_56_ - 1)) {
				drawBasicString(text[i_59_], i, i_57_);
			} else {
				method_v_void(text[i_59_], i_49_);
				drawBasicString(text[i_59_], i, i_57_);
				field_i_3113 = 0;
			}
			i_57_ += i_55_;
		}
		return i_56_;
	}

	public void method_q_void(final String string, final int i, final int i_60_, final int i_61_, final int i_62_, final int i_63_) {
		if (string != null) {
			setColorShadow(i_61_, i_62_);
			final int[] is = new int[string.length()];
			for (int i_64_ = 0; i_64_ < string.length(); i_64_++) {
				is[i_64_] = (int) (Math.sin((i_64_ / 2.0) + (i_63_ / 5.0)) * 5.0);
			}
			method_p_void(string, i - (getTextWidth(string) / 2), i_60_, null, is);
		}
	}

	public void method_k_void(final String string, final int i, final int i_65_, final int i_66_, final int i_67_, final int i_68_) {
		if (string != null) {
			setColorShadow(i_66_, i_67_);
			final int[] is = new int[string.length()];
			final int[] is_69_ = new int[string.length()];
			for (int i_70_ = 0; i_70_ < string.length(); i_70_++) {
				is[i_70_] = (int) (Math.sin((i_70_ / 5.0) + (i_68_ / 5.0)) * 5.0);
				is_69_[i_70_] = (int) (Math.sin((i_70_ / 3.0) + (i_68_ / 5.0)) * 5.0);
			}
			method_p_void(string, i - (getTextWidth(string) / 2), i_65_, is, is_69_);
		}
	}

	abstract void method_o_void(byte[] is, int i, int i_71_, int i_72_, int i_73_, int i_74_);

	public void drawString(final String string, final int i, final int i_75_, final int i_76_, final int i_77_, final int i_78_) {
		if (string != null) {
			setColorShadow(i_76_, i_77_);
			field_ak_3115.setSeed(i_78_);
			alpha = 192 + (field_ak_3115.nextInt() & 0x1f);
			final int[] is = new int[string.length()];
			int i_79_ = 0;
			for (int i_80_ = 0; i_80_ < string.length(); i_80_++) {
				is[i_80_] = i_79_;
				if ((field_ak_3115.nextInt() & 0x3) == 0) {
					i_79_++;
				}
			}
			method_p_void(string, i, i_75_, is, null);
		}
	}

	void setColorShadow(final int i, final int i_81_) {
		field_u_3102 = -1;
		field_c_3107 = -1;
		field_p_3108 = i_81_;
		field_o_3095 = i_81_;
		field_b_3110 = i;
		field_t_3111 = i;
		alpha = 256;
		field_i_3113 = 0;
		field_ad_3114 = 0;
	}

	void method_v_void(final String string, final int i) {
		int i_82_ = 0;
		boolean bool = false;
		for (int i_83_ = 0; i_83_ < string.length(); i_83_++) {
			final char c = string.charAt(i_83_);
			if (c == '<') {
				bool = true;
			} else if (c == '>') {
				bool = false;
			} else if (!bool && (c == ' ')) {
				i_82_++;
			}
		}
		if (i_82_ > 0) {
			field_i_3113 = ((i - getTextWidth(string)) << 8) / i_82_;
		}
	}

	void drawBasicString(String string, int i, int i_84_) {
		i_84_ -= field_f_3101;
		int i_85_ = -1;
		int i_86_ = -1;
		for (int i_87_ = 0; i_87_ < string.length(); i_87_++) {
			if (string.charAt(i_87_) != 0) {
				int i_88_ = (char) (MachineInformationNode.method_n_byte(string.charAt(i_87_), (byte) 24) & 0xff);
				if (i_88_ == 60) {
					i_85_ = i_87_;
				} else {
					if ((i_88_ == 62) && (i_85_ != -1)) {
						final String string_89_ = string.substring(i_85_ + 1, i_87_);
						i_85_ = -1;
						if (string_89_.equals("lt")) {
							i_88_ = 60;
						} else {
							if (!string_89_.equals("gt")) {
								if (string_89_.startsWith("img=")) {
									try {
										final String string_90_ = string_89_.substring(4);
										final int i_91_ = Class_w.method_y_int(string_90_, 10, true, (byte) 96);
										final Sprite class_be = crowns[i_91_];
										class_be.render(i, ((i_84_ + field_f_3101) - class_be.spriteHeight));
										i += class_be.spriteWidth;
										i_86_ = -1;
									} catch (final Exception exception) {
										/* empty */
									}
								} else {
									method_s_void(string_89_);
								}
								continue;
							}
							i_88_ = 62;
						}
					}
					if (i_88_ == 160) {
						i_88_ = 32;
					}
					if (i_85_ == -1) {
						if ((this.field_l_3105 != null) && (i_86_ != -1)) {
							i += (this.field_l_3105[(i_86_ << 8) + i_88_]);
						}
						final int i_92_ = this.field_z_3097[i_88_];
						final int i_93_ = this.field_y_3112[i_88_];
						if (i_88_ != 32) {
							if (alpha == 256) {
								if (field_o_3095 != -1) {
									method_t_void((this.field_n_3096[i_88_]), i + (this.field_e_3109[i_88_]) + 1, i_84_ + (this.field_g_3100[i_88_]) + 1, i_92_, i_93_, field_o_3095);
								}
								method_o_void((this.field_n_3096[i_88_]), i + (this.field_e_3109[i_88_]), i_84_ + (this.field_g_3100[i_88_]), i_92_, i_93_, field_t_3111);
							} else {
								if (field_o_3095 != -1) {
									method_i_void((this.field_n_3096[i_88_]), i + (this.field_e_3109[i_88_]) + 1, i_84_ + (this.field_g_3100[i_88_]) + 1, i_92_, i_93_, field_o_3095, alpha);
								}
								method_b_void((this.field_n_3096[i_88_]), i + (this.field_e_3109[i_88_]), i_84_ + (this.field_g_3100[i_88_]), i_92_, i_93_, field_t_3111, alpha);
							}
						} else if (field_i_3113 > 0) {
							field_ad_3114 += field_i_3113;
							i += field_ad_3114 >> 8;
							field_ad_3114 &= 0xff;
						}
						final int i_94_ = this.field_d_3106[i_88_];
						if (field_u_3102 != -1) {
							drawHorizontalLine(i, i_84_ + (int) (field_f_3101 * 0.7), i_94_, field_u_3102);
						}
						if (field_c_3107 != -1) {
							drawHorizontalLine(i, i_84_ + field_f_3101 + 1, i_94_, field_c_3107);
						}
						i += i_94_;
						i_86_ = i_88_;
					}
				}
			}
		}
	}

	void method_p_void(final String string, int i, int i_95_, final int[] is, final int[] is_96_) {
		i_95_ -= field_f_3101;
		int i_97_ = -1;
		int i_98_ = -1;
		int i_99_ = 0;
		for (int i_100_ = 0; i_100_ < string.length(); i_100_++) {
			if (string.charAt(i_100_) != 0) {
				int i_101_ = (char) (MachineInformationNode.method_n_byte(string.charAt(i_100_), (byte) 110) & 0xff);
				if (i_101_ == 60) {
					i_97_ = i_100_;
				} else {
					if ((i_101_ == 62) && (i_97_ != -1)) {
						final String string_102_ = string.substring(i_97_ + 1, i_100_);
						i_97_ = -1;
						if (string_102_.equals("lt")) {
							i_101_ = 60;
						} else {
							if (!string_102_.equals("gt")) {
								if (string_102_.startsWith("img=")) {
									try {
										int i_103_;
										if (is != null) {
											i_103_ = is[i_99_];
										} else {
											i_103_ = 0;
										}
										int i_104_;
										if (is_96_ != null) {
											i_104_ = is_96_[i_99_];
										} else {
											i_104_ = 0;
										}
										i_99_++;
										final String string_105_ = string_102_.substring(4);
										final int i_106_ = Class_w.method_y_int(string_105_, 10, true, (byte) -16);
										final Sprite class_be = crowns[i_106_];
										class_be.render(i + i_103_, (((i_95_ + field_f_3101) - class_be.spriteHeight) + i_104_));
										i += class_be.spriteWidth;
										i_98_ = -1;
									} catch (final Exception exception) {
										/* empty */
									}
								} else {
									method_s_void(string_102_);
								}
								continue;
							}
							i_101_ = 62;
						}
					}
					if (i_101_ == 160) {
						i_101_ = 32;
					}
					if (i_97_ == -1) {
						if ((this.field_l_3105 != null) && (i_98_ != -1)) {
							i += (this.field_l_3105[(i_98_ << 8) + i_101_]);
						}
						final int i_107_ = this.field_z_3097[i_101_];
						final int i_108_ = this.field_y_3112[i_101_];
						int i_109_;
						if (is != null) {
							i_109_ = is[i_99_];
						} else {
							i_109_ = 0;
						}
						int i_110_;
						if (is_96_ != null) {
							i_110_ = is_96_[i_99_];
						} else {
							i_110_ = 0;
						}
						i_99_++;
						if (i_101_ != 32) {
							if (alpha == 256) {
								if (field_o_3095 != -1) {
									method_t_void((this.field_n_3096[i_101_]), i + (this.field_e_3109[i_101_]) + 1 + i_109_, (i_95_ + (this.field_g_3100[i_101_]) + 1 + i_110_), i_107_, i_108_, field_o_3095);
								}
								method_o_void((this.field_n_3096[i_101_]), i + (this.field_e_3109[i_101_]) + i_109_, i_95_ + (this.field_g_3100[i_101_]) + i_110_, i_107_, i_108_, field_t_3111);
							} else {
								if (field_o_3095 != -1) {
									method_i_void((this.field_n_3096[i_101_]), i + (this.field_e_3109[i_101_]) + 1 + i_109_, (i_95_ + (this.field_g_3100[i_101_]) + 1 + i_110_), i_107_, i_108_, field_o_3095, alpha);
								}
								method_b_void((this.field_n_3096[i_101_]), i + (this.field_e_3109[i_101_]) + i_109_, i_95_ + (this.field_g_3100[i_101_]) + i_110_, i_107_, i_108_, field_t_3111, alpha);
							}
						} else if (field_i_3113 > 0) {
							field_ad_3114 += field_i_3113;
							i += field_ad_3114 >> 8;
							field_ad_3114 &= 0xff;
						}
						final int i_111_ = this.field_d_3106[i_101_];
						if (field_u_3102 != -1) {
							drawHorizontalLine(i, i_95_ + (int) (field_f_3101 * 0.7), i_111_, field_u_3102);
						}
						if (field_c_3107 != -1) {
							drawHorizontalLine(i, i_95_ + field_f_3101, i_111_, field_c_3107);
						}
						i += i_111_;
						i_98_ = i_101_;
					}
				}
			}
		}
	}

	static void method_ad_void(final int[] is, final byte[] is_112_, int i, int i_113_, int i_114_, final int i_115_, final int i_116_, final int i_117_, final int i_118_, int i_119_) {
		i = ((((i & 0xff00ff) * i_119_) & ~0xff00ff) + (((i & 0xff00) * i_119_) & 0xff0000)) >> 8;
			i_119_ = 256 - i_119_;
			for (int i_120_ = -i_116_; i_120_ < 0; i_120_++) {
				for (int i_121_ = -i_115_; i_121_ < 0; i_121_++) {
					if (is_112_[i_113_++] != 0) {
						final int i_122_ = is[i_114_];
						is[i_114_++] = (((((i_122_ & 0xff00ff) * i_119_) & ~0xff00ff) + (((i_122_ & 0xff00) * i_119_) & 0xff0000)) >> 8) + i;
					} else {
						i_114_++;
					}
				}
				i_114_ += i_117_;
				i_113_ += i_118_;
			}
	}

	int method_z_int(char c) {
		if (c == '\u00a0') {
			c = ' ';
		}
		return (this.field_d_3106[MachineInformationNode.method_n_byte(c, (byte) 45) & 0xff]);
	}

	static void method_w_void(final int[] is, final byte[] is_123_, final int i, int i_124_, int i_125_, int i_126_, final int i_127_, final int i_128_, final int i_129_) {
		final int i_130_ = -(i_126_ >> 2);
		i_126_ = -(i_126_ & 0x3);
		for (int i_131_ = -i_127_; i_131_ < 0; i_131_++) {
			for (int i_132_ = i_130_; i_132_ < 0; i_132_++) {
				if (is_123_[i_124_++] != 0) {
					is[i_125_++] = i;
				} else {
					i_125_++;
				}
				if (is_123_[i_124_++] != 0) {
					is[i_125_++] = i;
				} else {
					i_125_++;
				}
				if (is_123_[i_124_++] != 0) {
					is[i_125_++] = i;
				} else {
					i_125_++;
				}
				if (is_123_[i_124_++] != 0) {
					is[i_125_++] = i;
				} else {
					i_125_++;
				}
			}
			for (int i_133_ = i_126_; i_133_ < 0; i_133_++) {
				if (is_123_[i_124_++] != 0) {
					is[i_125_++] = i;
				} else {
					i_125_++;
				}
			}
			i_125_ += i_128_;
			i_124_ += i_129_;
		}
	}

	static void method_i_void(final byte[] is, int i, int i_134_, int i_135_, int i_136_, final int i_137_, final int i_138_) {
		int i_139_ = i + (i_134_ * width);
		int i_140_ = width - i_135_;
		int i_141_ = 0;
		int i_142_ = 0;
		if (i_134_ < field_r_512) {
			final int i_143_ = field_r_512 - i_134_;
			i_136_ -= i_143_;
			i_134_ = field_r_512;
			i_142_ += i_143_ * i_135_;
			i_139_ += i_143_ * width;
		}
		if ((i_134_ + i_136_) > field_j_513) {
			i_136_ -= (i_134_ + i_136_) - field_j_513;
		}
		if (i < field_s_514) {
			final int i_144_ = field_s_514 - i;
			i_135_ -= i_144_;
			i = field_s_514;
			i_142_ += i_144_;
			i_139_ += i_144_;
			i_141_ += i_144_;
			i_140_ += i_144_;
		}
		if ((i + i_135_) > field_v_509) {
			final int i_145_ = (i + i_135_) - field_v_509;
			i_135_ -= i_145_;
			i_141_ += i_145_;
			i_140_ += i_145_;
		}
		if ((i_135_ > 0) && (i_136_ > 0)) {
			method_ad_void(pixels, is, i_137_, i_142_, i_139_, i_135_, i_136_, i_140_, i_141_, i_138_);
		}
	}

	abstract void method_b_void(byte[] is, int i, int i_146_, int i_147_, int i_148_, int i_149_, int i_150_);

	int method_e_int(final String string, final int[] is, final String[] strings) {
		if (string == null) {
			return 0;
		}
		int i = 0;
		int i_151_ = 0;
		final StringBuilder stringbuilder = new StringBuilder(100);
		int i_152_ = -1;
		int i_153_ = 0;
		int i_154_ = 0;
		int i_155_ = -1;
		int i_156_ = 0;
		int i_157_ = 0;
		final int i_158_ = string.length();
		for (int i_159_ = 0; i_159_ < i_158_; i_159_++) {
			char c = string.charAt(i_159_);
			if (c == 60) {
				i_155_ = i_159_;
			} else {
				if ((c == 62) && (i_155_ != -1)) {
					final String string_160_ = string.substring(i_155_ + 1, i_159_);
					i_155_ = -1;
					stringbuilder.append('<');
					stringbuilder.append(string_160_);
					stringbuilder.append('>');
					if (string_160_.equals("br")) {
						strings[i_157_] = stringbuilder.toString().substring(i_151_, stringbuilder.length());
						i_157_++;
						i_151_ = stringbuilder.length();
						i = 0;
						i_152_ = -1;
						i_156_ = 0;
					} else if (string_160_.equals("lt")) {
						i += method_z_int('<');
						if ((this.field_l_3105 != null) && (i_156_ != -1)) {
							i += (this.field_l_3105[(i_156_ << 8) + 60]);
						}
						i_156_ = 60;
					} else if (string_160_.equals("gt")) {
						i += method_z_int('>');
						if ((this.field_l_3105 != null) && (i_156_ != -1)) {
							i += (this.field_l_3105[(i_156_ << 8) + 62]);
						}
						i_156_ = 62;
					} else if (string_160_.startsWith("img=")) {
						try {
							final String string_161_ = string_160_.substring(4);
							final int i_162_ = Class_w.method_y_int(string_161_, 10, true, (byte) -24);
							i += crowns[i_162_].spriteWidth;
							i_156_ = 0;
						} catch (final Exception exception) {
							/* empty */
						}
					}
					c = '\0';
				}
				if (i_155_ == -1) {
					if (c != 0) {
						stringbuilder.append(c);
						i += method_z_int(c);
						if ((this.field_l_3105 != null) && (i_156_ != -1)) {
							i += (this.field_l_3105[(i_156_ << 8) + c]);
						}
						i_156_ = c;
					}
					if (c == 32) {
						i_152_ = stringbuilder.length();
						i_153_ = i;
						i_154_ = 1;
					}
					if ((is != null) && (i > is[i_157_ < is.length ? i_157_ : is.length - 1]) && (i_152_ >= 0)) {
						strings[i_157_] = stringbuilder.toString().substring(i_151_, i_152_ - i_154_);
						i_157_++;
						i_151_ = i_152_;
						i_152_ = -1;
						i -= i_153_;
						i_156_ = 0;
					}
					if (c == 45) {
						i_152_ = stringbuilder.length();
						i_153_ = i;
						i_154_ = 0;
					}
				}
			}
		}
		final String string_163_ = stringbuilder.toString();
		if (string_163_.length() > i_151_) {
			strings[i_157_++] = string_163_.substring(i_151_, string_163_.length());
		}
		return i_157_;
	}

	public void method_x_void(final String string, final int i, final int i_164_, final int i_165_, final int i_166_, final int i_167_, final int i_168_) {
		if (string != null) {
			setColorShadow(i_165_, i_166_);
			double d = 7.0 - (i_168_ / 8.0);
			if (d < 0.0) {
				d = 0.0;
			}
			final int[] is = new int[string.length()];
			for (int i_169_ = 0; i_169_ < string.length(); i_169_++) {
				is[i_169_] = (int) (Math.sin((i_169_ / 1.5) + (i_167_ / 1.0)) * d);
			}
			method_p_void(string, i - (getTextWidth(string) / 2), i_164_, null, is);
		}
	}

	void method_s_void(final String string) {
		try {
			if (string.startsWith("col=")) {
				field_t_3111 = Actor.method_z_int(string.substring(4), 16, (byte) 89);
			} else if (string.equals("/col")) {
				field_t_3111 = field_b_3110;
			} else if (string.startsWith("str=")) {
				field_u_3102 = Actor.method_z_int(string.substring(4), 16, (byte) 10);
			} else if (string.equals("str")) {
				field_u_3102 = 8388608;
			} else if (string.equals("/str")) {
				field_u_3102 = -1;
			} else if (string.startsWith("u=")) {
				field_c_3107 = Actor.method_z_int(string.substring(2), 16, (byte) 118);
			} else if (string.equals("u")) {
				field_c_3107 = 0;
			} else if (string.equals("/u")) {
				field_c_3107 = -1;
			} else if (string.startsWith("shad=")) {
				field_o_3095 = Actor.method_z_int(string.substring(5), 16, (byte) 119);
			} else if (string.equals("shad")) {
				field_o_3095 = 0;
			} else if (string.equals("/shad")) {
				field_o_3095 = field_p_3108;
			} else if (string.equals("br")) {
				setColorShadow(field_b_3110, field_p_3108);
			}
		} catch (final Exception exception) {
			/* empty */
		}
	}

	TypeFace(final byte[] is, final int[] is_170_, final int[] is_171_, final int[] is_172_, final int[] is_173_, final int[] is_174_, final byte[][] is_175_) {
		this.field_n_3096 = new byte[256][];
		field_f_3101 = 0;
		this.field_e_3109 = is_170_;
		this.field_g_3100 = is_171_;
		this.field_z_3097 = is_172_;
		this.field_y_3112 = is_173_;
		method_n_void(is);
		this.field_n_3096 = is_175_;
		int i = 2147483647;
		int i_176_ = -2147483648;
		for (int i_177_ = 0; i_177_ < 256; i_177_++) {
			if ((this.field_g_3100[i_177_] < i) && (this.field_y_3112[i_177_] != 0)) {
				i = this.field_g_3100[i_177_];
			}
			if ((this.field_g_3100[i_177_] + this.field_y_3112[i_177_]) > i_176_) {
				i_176_ = (this.field_g_3100[i_177_] + this.field_y_3112[i_177_]);
			}
		}
		this.field_m_3099 = field_f_3101 - i;
		this.field_a_3103 = i_176_ - field_f_3101;
	}

	static int method_d_int(final byte[][] is, final byte[][] is_178_, final int[] is_179_, final int[] is_180_, final int[] is_181_, final int i, final int i_182_) {
		final int i_183_ = is_179_[i];
		final int i_184_ = i_183_ + is_181_[i];
		final int i_185_ = is_179_[i_182_];
		final int i_186_ = i_185_ + is_181_[i_182_];
		int i_187_ = i_183_;
		if (i_185_ > i_183_) {
			i_187_ = i_185_;
		}
		int i_188_ = i_184_;
		if (i_186_ < i_184_) {
			i_188_ = i_186_;
		}
		int i_189_ = is_180_[i];
		if (is_180_[i_182_] < i_189_) {
			i_189_ = is_180_[i_182_];
		}
		final byte[] is_190_ = is_178_[i];
		final byte[] is_191_ = is[i_182_];
		int i_192_ = i_187_ - i_183_;
		int i_193_ = i_187_ - i_185_;
		for (int i_194_ = i_187_; i_194_ < i_188_; i_194_++) {
			final int i_195_ = is_190_[i_192_++] + is_191_[i_193_++];
			if (i_195_ < i_189_) {
				i_189_ = i_195_;
			}
		}
		return -i_189_;
	}

	TypeFace(final byte[] is) {
		this.field_n_3096 = new byte[256][];
		field_f_3101 = 0;
		method_n_void(is);
	}
}
