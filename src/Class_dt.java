/* Class_dt - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_dt {
	public static final int field_fi_1710 = 40;
	public static final int field_fs_1711 = 73;
	int[] field_n_1712;
	static final int field_ad_1713 = 2;
	public static short[] field_f_1714;
	public static final int field_fh_1715 = 199;
	byte[] field_d_1716;
	int[] field_z_1717;

	public int method_d_int(final byte[] is, final int i, final byte[] is_0_, int i_1_, int i_2_, final int i_3_) {
		int i_4_;
		try {
			if (i_2_ == 0) {
				return 0;
			}
			int i_5_ = 0;
			i_2_ += i_1_;
			int i_6_ = i;
			for (;;) {
				final byte i_7_ = is[i_6_];
				if (i_7_ < 0) {
					i_5_ = this.field_z_1717[i_5_];
				} else {
					i_5_++;
				}
				int i_8_;
				if ((i_8_ = this.field_z_1717[i_5_]) < 0) {
					is_0_[i_1_++] = (byte) (i_8_ ^ 0xffffffff);
					if (i_1_ >= i_2_) {
						break;
					}
					i_5_ = 0;
				}
				if ((i_7_ & 0x40) != 0) {
					i_5_ = this.field_z_1717[i_5_];
				} else {
					i_5_++;
				}
				if ((i_8_ = this.field_z_1717[i_5_]) < 0) {
					is_0_[i_1_++] = (byte) (i_8_ ^ 0xffffffff);
					if (i_1_ >= i_2_) {
						break;
					}
					i_5_ = 0;
				}
				if ((i_7_ & 0x20) != 0) {
					i_5_ = this.field_z_1717[i_5_];
				} else {
					i_5_++;
				}
				if ((i_8_ = this.field_z_1717[i_5_]) < 0) {
					is_0_[i_1_++] = (byte) (i_8_ ^ 0xffffffff);
					if (i_1_ >= i_2_) {
						break;
					}
					i_5_ = 0;
				}
				if ((i_7_ & 0x10) != 0) {
					i_5_ = this.field_z_1717[i_5_];
				} else {
					i_5_++;
				}
				if ((i_8_ = this.field_z_1717[i_5_]) < 0) {
					is_0_[i_1_++] = (byte) (i_8_ ^ 0xffffffff);
					if (i_1_ >= i_2_) {
						break;
					}
					i_5_ = 0;
				}
				if ((i_7_ & 0x8) != 0) {
					i_5_ = this.field_z_1717[i_5_];
				} else {
					i_5_++;
				}
				if ((i_8_ = this.field_z_1717[i_5_]) < 0) {
					is_0_[i_1_++] = (byte) (i_8_ ^ 0xffffffff);
					if (i_1_ >= i_2_) {
						break;
					}
					i_5_ = 0;
				}
				if ((i_7_ & 0x4) != 0) {
					i_5_ = this.field_z_1717[i_5_];
				} else {
					i_5_++;
				}
				if ((i_8_ = this.field_z_1717[i_5_]) < 0) {
					is_0_[i_1_++] = (byte) (i_8_ ^ 0xffffffff);
					if (i_1_ >= i_2_) {
						break;
					}
					i_5_ = 0;
				}
				if ((i_7_ & 0x2) != 0) {
					i_5_ = this.field_z_1717[i_5_];
				} else {
					i_5_++;
				}
				if ((i_8_ = this.field_z_1717[i_5_]) < 0) {
					is_0_[i_1_++] = (byte) (i_8_ ^ 0xffffffff);
					if (i_1_ >= i_2_) {
						break;
					}
					i_5_ = 0;
				}
				if ((i_7_ & 0x1) != 0) {
					i_5_ = this.field_z_1717[i_5_];
				} else {
					i_5_++;
				}
				if ((i_8_ = this.field_z_1717[i_5_]) < 0) {
					is_0_[i_1_++] = (byte) (i_8_ ^ 0xffffffff);
					if (i_1_ >= i_2_) {
						break;
					}
					i_5_ = 0;
				}
				i_6_++;
			}
			i_4_ = (1 + i_6_) - i;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dt.d()");
		}
		return i_4_;
	}

	static final int method_ap_int(final int i) {
		int i_9_;
		try {
			if (Class_w.field_pz_1501.hideRoofTops) {
				return 250114511 * Class_ed.plane;
			}
			int i_10_ = 3;
			if ((World.cameraPitch * 633664789) < 310) {
				int i_11_ = (Menu.cameraX * 548221253) >> 7;
			int i_12_ = (GameMessage.cameraY * 1900802031) >> 7;
			final int i_13_ = ((-2103184911 * Class_ci.myPlayer.worldPosX) >> 7);
			final int i_14_ = (2088773389 * Class_ci.myPlayer.worldPosY) >> 7;
			if (((Region.sceneFlags[250114511 * Class_ed.plane][i_11_][i_12_]) & 0x4) != 0) {
				i_10_ = 250114511 * Class_ed.plane;
			}
			int i_15_;
			if (i_13_ > i_11_) {
				i_15_ = i_13_ - i_11_;
			} else {
				i_15_ = i_11_ - i_13_;
			}
			int i_16_;
			if (i_14_ > i_12_) {
				i_16_ = i_14_ - i_12_;
			} else {
				i_16_ = i_12_ - i_14_;
			}
			if (i_15_ > i_16_) {
				final int i_17_ = (i_16_ * 65536) / i_15_;
				int i_18_ = 32768;
				while (i_13_ != i_11_) {
					if (i_11_ < i_13_) {
						i_11_++;
					} else if (i_11_ > i_13_) {
						i_11_--;
					}
					if (((Region.sceneFlags[250114511 * Class_ed.plane][i_11_][i_12_]) & 0x4) != 0) {
						i_10_ = 250114511 * Class_ed.plane;
					}
					i_18_ += i_17_;
					if (i_18_ >= 65536) {
						i_18_ -= 65536;
						if (i_12_ < i_14_) {
							i_12_++;
						} else if (i_12_ > i_14_) {
							i_12_--;
						}
						if (((Region.sceneFlags[Class_ed.plane * 250114511][i_11_][i_12_]) & 0x4) != 0) {
							i_10_ = Class_ed.plane * 250114511;
						}
					}
				}
			} else {
				final int i_19_ = (65536 * i_15_) / i_16_;
				int i_20_ = 32768;
				while (i_12_ != i_14_) {
					if (i_12_ < i_14_) {
						i_12_++;
					} else if (i_12_ > i_14_) {
						i_12_--;
					}
					if (((Region.sceneFlags[Class_ed.plane * 250114511][i_11_][i_12_]) & 0x4) != 0) {
						i_10_ = Class_ed.plane * 250114511;
					}
					i_20_ += i_19_;
					if (i_20_ >= 65536) {
						i_20_ -= 65536;
						if (i_11_ < i_13_) {
							i_11_++;
						} else if (i_11_ > i_13_) {
							i_11_--;
						}
						if (((Region.sceneFlags[250114511 * Class_ed.plane][i_11_][i_12_]) & 0x4) != 0) {
							i_10_ = 250114511 * Class_ed.plane;
						}
					}
				}
			}
			}
			if (((Region.sceneFlags[250114511 * Class_ed.plane][(Class_ci.myPlayer.worldPosX * -2103184911) >> 7][(Class_ci.myPlayer.worldPosY * 2088773389) >> 7]) & 0x4) != 0) {
				i_10_ = Class_ed.plane * 250114511;
			}
			i_9_ = i_10_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dt.ap()");
		}
		return i_9_;
	}

	public Class_dt(final byte[] is) {
		final int i = is.length;
		this.field_n_1712 = new int[i];
		this.field_d_1716 = is;
		final int[] is_21_ = new int[33];
		this.field_z_1717 = new int[8];
		int i_22_ = 0;
		for (int i_23_ = 0; i_23_ < i; i_23_++) {
			final int i_24_ = is[i_23_];
			if (i_24_ != 0) {
				final int i_25_ = 1 << (32 - i_24_);
				final int i_26_ = is_21_[i_24_];
				this.field_n_1712[i_23_] = i_26_;
				int i_27_;
				if ((i_26_ & i_25_) != 0) {
					i_27_ = is_21_[i_24_ - 1];
				} else {
					i_27_ = i_26_ | i_25_;
					for (int i_28_ = i_24_ - 1; i_28_ >= 1; i_28_--) {
						final int i_29_ = is_21_[i_28_];
						if (i_29_ != i_26_) {
							break;
						}
						final int i_30_ = 1 << (32 - i_28_);
						if ((i_29_ & i_30_) != 0) {
							is_21_[i_28_] = is_21_[i_28_ - 1];
							break;
						}
						is_21_[i_28_] = i_29_ | i_30_;
					}
				}
				is_21_[i_24_] = i_27_;
				for (int i_31_ = i_24_ + 1; i_31_ <= 32; i_31_++) {
					if (is_21_[i_31_] == i_26_) {
						is_21_[i_31_] = i_27_;
					}
				}
				int i_32_ = 0;
				for (int i_33_ = 0; i_33_ < i_24_; i_33_++) {
					int i_34_ = -2147483648 >>> i_33_;
				if ((i_26_ & i_34_) != 0) {
					if (this.field_z_1717[i_32_] == 0) {
						this.field_z_1717[i_32_] = i_22_;
					}
					i_32_ = this.field_z_1717[i_32_];
				} else {
					i_32_++;
				}
				if (i_32_ >= this.field_z_1717.length) {
					final int[] is_35_ = (new int[this.field_z_1717.length * 2]);
					for (int i_36_ = 0; i_36_ < this.field_z_1717.length; i_36_++) {
						is_35_[i_36_] = this.field_z_1717[i_36_];
					}
					this.field_z_1717 = is_35_;
				}
				i_34_ >>>= 1;
				}
				this.field_z_1717[i_32_] = i_23_ ^ 0xffffffff;
				if (i_32_ >= i_22_) {
					i_22_ = i_32_ + 1;
				}
			}
		}
	}

	public int method_n_int(final byte[] is, int i, int i_37_, final byte[] is_38_, final int i_39_, final int i_40_) {
		int i_41_;
		try {
			int i_42_ = 0;
			int i_43_ = i_39_ << 3;
			for (i_37_ += i; i < i_37_; i++) {
				final int i_44_ = is[i] & 0xff;
				final int i_45_ = this.field_n_1712[i_44_];
				final int i_46_ = this.field_d_1716[i_44_];
				if (i_46_ == 0) {
					throw new RuntimeException("");
				}
				int i_47_ = i_43_ >> 3;
			int i_48_ = i_43_ & 0x7;
			i_42_ &= -i_48_ >> 31;
			final int i_49_ = i_47_ + (((i_48_ + i_46_) - 1) >> 3);
			i_48_ += 24;
			is_38_[i_47_] = (byte) (i_42_ |= i_45_ >>> i_48_);
			if (i_47_ < i_49_) {
				i_47_++;
				i_48_ -= 8;
				is_38_[i_47_] = (byte) (i_42_ = i_45_ >>> i_48_);
				if (i_47_ < i_49_) {
					i_47_++;
					i_48_ -= 8;
					is_38_[i_47_] = (byte) (i_42_ = i_45_ >>> i_48_);
					if (i_47_ < i_49_) {
						i_47_++;
						i_48_ -= 8;
						is_38_[i_47_] = (byte) (i_42_ = i_45_ >>> i_48_);
						if (i_47_ < i_49_) {
							i_47_++;
							i_48_ -= 8;
							is_38_[i_47_] = (byte) (i_42_ = i_45_ << -i_48_);
						}
					}
				}
			}
			i_43_ += i_46_;
			}
			i_41_ = ((7 + i_43_) >> 3) - i_39_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dt.n()");
		}
		return i_41_;
	}

	public static String method_d_String(long l) {
		do {
			String string;
			try {
				if ((l <= 0L) || (l >= 6582952005840035281L)) {
					break;
				}
				if ((l % 37L) == 0L) {
					return null;
				}
				int i = 0;
				for (long l_50_ = l; 0L != l_50_; l_50_ /= 37L) {
					i++;
				}
				final StringBuilder stringbuilder = new StringBuilder(i);
				while (0L != l) {
					final long l_51_ = l;
					l /= 37L;
					char c = Class_ei.field_n_2127[(int) (l_51_ - (37L * l))];
					if (c == '_') {
						final int i_52_ = stringbuilder.length() - 1;
						stringbuilder.setCharAt(i_52_, java.lang.Character.toUpperCase(stringbuilder.charAt(i_52_)));
						c = '\u00a0';
					}
					stringbuilder.append(c);
				}
				stringbuilder.reverse();
				stringbuilder.setCharAt(0, java.lang.Character.toUpperCase(stringbuilder.charAt(0)));
				string = stringbuilder.toString();
			} catch (final RuntimeException runtimeexception) {
				throw GameCanvas.error(runtimeexception, "dt.d()");
			}
			return string;
		} while (false);
		return null;
	}
}
