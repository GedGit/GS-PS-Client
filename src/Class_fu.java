/* Class_fu - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_fu extends Node {
	NodeMultiSet field_n_2500;
	byte[] field_d_2501;

	public static Class_fu method_n_fu(final FileStore class_fs, final int i, final int i_0_) {
		final byte[] is = class_fs.getArchive(i, i_0_);
		return is == null ? null : new Class_fu(new Buffer(is));
	}

	Class_fu(final Buffer rsbytebuffer) {
		rsbytebuffer.position = (rsbytebuffer.buffer.length - 3) * -685856689;
		final int i = rsbytebuffer.get();
		final int i_1_ = rsbytebuffer.getShort();
		int i_2_ = 14 + (i * 10);
		rsbytebuffer.position = 0;
		int i_3_ = 0;
		int i_4_ = 0;
		int i_5_ = 0;
		int i_6_ = 0;
		int i_7_ = 0;
		int i_8_ = 0;
		int i_9_ = 0;
		int i_10_ = 0;
		int i_11_ = 0;
		while (i_11_ < i) {
			int i_12_ = -1;
			for (;;) {
				final int i_13_ = rsbytebuffer.get();
				if (i_13_ != i_12_) {
					i_2_++;
				}
				i_12_ = i_13_ & 0xf;
				if (i_13_ == 7) {
					i_11_++;
					break;
				}
				if (i_13_ == 23) {
					i_3_++;
				} else if (i_12_ == 0) {
					i_5_++;
				} else if (i_12_ == 1) {
					i_6_++;
				} else if (i_12_ == 2) {
					i_4_++;
				} else if (i_12_ == 3) {
					i_7_++;
				} else if (i_12_ == 4) {
					i_8_++;
				} else if (i_12_ == 5) {
					i_9_++;
				} else {
					if (i_12_ != 6) {
						throw new RuntimeException();
					}
					i_10_++;
				}
			}
		}
		i_2_ += 5 * i_3_;
		i_2_ += 2 * (i_5_ + i_6_ + i_4_ + i_7_ + i_9_);
		i_2_ += i_8_ + i_10_;
		i_11_ = rsbytebuffer.position * -1485345105;
		final int i_14_ = i + i_3_ + i_4_ + i_5_ + i_6_ + i_7_ + i_8_ + i_9_ + i_10_;
		for (int i_15_ = 0; i_15_ < i_14_; i_15_++) {
			rsbytebuffer.method_ab_int(1670041244);
		}
		i_2_ += (rsbytebuffer.position * -1485345105) - i_11_;
		int i_16_ = rsbytebuffer.position * -1485345105;
		int i_17_ = 0;
		int i_18_ = 0;
		int i_19_ = 0;
		int i_20_ = 0;
		int i_21_ = 0;
		int i_22_ = 0;
		int i_23_ = 0;
		int i_24_ = 0;
		int i_25_ = 0;
		int i_26_ = 0;
		int i_27_ = 0;
		int i_28_ = 0;
		int i_29_ = 0;
		for (int i_30_ = 0; i_30_ < i_4_; i_30_++) {
			i_29_ = (i_29_ + rsbytebuffer.get()) & 0x7f;
			if ((i_29_ != 0) && (i_29_ != 32)) {
				if (i_29_ == 1) {
					i_17_++;
				} else if (i_29_ == 33) {
					i_18_++;
				} else if (i_29_ == 7) {
					i_19_++;
				} else if (i_29_ == 39) {
					i_20_++;
				} else if (i_29_ == 10) {
					i_21_++;
				} else if (i_29_ == 42) {
					i_22_++;
				} else if (i_29_ == 99) {
					i_23_++;
				} else if (i_29_ == 98) {
					i_24_++;
				} else if (i_29_ == 101) {
					i_25_++;
				} else if (i_29_ == 100) {
					i_26_++;
				} else if ((i_29_ != 64) && (i_29_ != 65) && (i_29_ != 120) && (i_29_ != 121) && (i_29_ != 123)) {
					i_28_++;
				} else {
					i_27_++;
				}
			} else {
				i_10_++;
			}
		}
		int i_31_ = 0;
		int i_32_ = rsbytebuffer.position * -1485345105;
		rsbytebuffer.position += i_27_ * -685856689;
		int i_33_ = rsbytebuffer.position * -1485345105;
		rsbytebuffer.position += i_9_ * -685856689;
		int i_34_ = rsbytebuffer.position * -1485345105;
		rsbytebuffer.position += i_8_ * -685856689;
		int i_35_ = rsbytebuffer.position * -1485345105;
		rsbytebuffer.position += i_7_ * -685856689;
		int i_36_ = rsbytebuffer.position * -1485345105;
		rsbytebuffer.position += i_17_ * -685856689;
		int i_37_ = rsbytebuffer.position * -1485345105;
		rsbytebuffer.position += i_19_ * -685856689;
		int i_38_ = rsbytebuffer.position * -1485345105;
		rsbytebuffer.position += i_21_ * -685856689;
		int i_39_ = rsbytebuffer.position * -1485345105;
		rsbytebuffer.position += (i_5_ + i_6_ + i_9_) * -685856689;
		int i_40_ = rsbytebuffer.position * -1485345105;
		rsbytebuffer.position += i_5_ * -685856689;
		int i_41_ = rsbytebuffer.position * -1485345105;
		rsbytebuffer.position += i_28_ * -685856689;
		int i_42_ = rsbytebuffer.position * -1485345105;
		rsbytebuffer.position += i_6_ * -685856689;
		int i_43_ = rsbytebuffer.position * -1485345105;
		rsbytebuffer.position += i_18_ * -685856689;
		int i_44_ = rsbytebuffer.position * -1485345105;
		rsbytebuffer.position += i_20_ * -685856689;
		int i_45_ = rsbytebuffer.position * -1485345105;
		rsbytebuffer.position += i_22_ * -685856689;
		int i_46_ = rsbytebuffer.position * -1485345105;
		rsbytebuffer.position += i_10_ * -685856689;
		int i_47_ = rsbytebuffer.position * -1485345105;
		rsbytebuffer.position += i_7_ * -685856689;
		int i_48_ = rsbytebuffer.position * -1485345105;
		rsbytebuffer.position += i_23_ * -685856689;
		int i_49_ = rsbytebuffer.position * -1485345105;
		rsbytebuffer.position += i_24_ * -685856689;
		int i_50_ = rsbytebuffer.position * -1485345105;
		rsbytebuffer.position += i_25_ * -685856689;
		int i_51_ = rsbytebuffer.position * -1485345105;
		rsbytebuffer.position += i_26_ * -685856689;
		int i_52_ = rsbytebuffer.position * -1485345105;
		rsbytebuffer.position += i_3_ * -2057570067;
		this.field_d_2501 = new byte[i_2_];
		final Buffer rsbytebuffer_53_ = new Buffer(this.field_d_2501);
		rsbytebuffer_53_.putInt(1297377380);
		rsbytebuffer_53_.putInt(6);
		rsbytebuffer_53_.putShort(i > 1 ? 1 : 0);
		rsbytebuffer_53_.putShort(i);
		rsbytebuffer_53_.putShort(i_1_);
		rsbytebuffer.position = i_11_ * -685856689;
		int i_54_ = 0;
		int i_55_ = 0;
		int i_56_ = 0;
		int i_57_ = 0;
		int i_58_ = 0;
		int i_59_ = 0;
		int i_60_ = 0;
		final int[] is = new int[128];
		i_29_ = 0;
		int i_61_ = 0;
		while (i_61_ < i) {
			rsbytebuffer_53_.putInt(1297379947);
			rsbytebuffer_53_.position += 1551540540;
			final int i_62_ = rsbytebuffer_53_.position * -1485345105;
			int i_63_ = -1;
			for (;;) {
				final int i_64_ = rsbytebuffer.method_ab_int(1670041244);
				rsbytebuffer_53_.method_s_void(i_64_, (byte) 30);
				final int i_65_ = rsbytebuffer.buffer[i_31_++] & 0xff;
				final boolean bool = i_65_ != i_63_;
				i_63_ = i_65_ & 0xf;
				if (i_65_ == 7) {
					if (bool) {
						rsbytebuffer_53_.put(255);
					}
					rsbytebuffer_53_.put(47);
					rsbytebuffer_53_.put(0);
					rsbytebuffer_53_.method_k_void(((rsbytebuffer_53_.position) * -1485345105) - i_62_, -401069342);
					i_61_++;
					break;
				}
				if (i_65_ == 23) {
					if (bool) {
						rsbytebuffer_53_.put(255);
					}
					rsbytebuffer_53_.put(81);
					rsbytebuffer_53_.put(3);
					rsbytebuffer_53_.put((rsbytebuffer.buffer[i_52_++]));
					rsbytebuffer_53_.put((rsbytebuffer.buffer[i_52_++]));
					rsbytebuffer_53_.put((rsbytebuffer.buffer[i_52_++]));
				} else {
					i_54_ ^= i_65_ >> 4;
		if (i_63_ == 0) {
			if (bool) {
				rsbytebuffer_53_.put(144 + i_54_);
			}
			i_55_ += rsbytebuffer.buffer[i_39_++];
			i_56_ += rsbytebuffer.buffer[i_40_++];
			rsbytebuffer_53_.put(i_55_ & 0x7f);
			rsbytebuffer_53_.put(i_56_ & 0x7f);
		} else if (i_63_ == 1) {
			if (bool) {
				rsbytebuffer_53_.put(128 + i_54_);
			}
			i_55_ += rsbytebuffer.buffer[i_39_++];
			i_57_ += rsbytebuffer.buffer[i_42_++];
			rsbytebuffer_53_.put(i_55_ & 0x7f);
			rsbytebuffer_53_.put(i_57_ & 0x7f);
		} else if (i_63_ == 2) {
			if (bool) {
				rsbytebuffer_53_.put(176 + i_54_);
			}
			i_29_ = ((i_29_ + rsbytebuffer.buffer[i_16_++]) & 0x7f);
			rsbytebuffer_53_.put(i_29_);
			int i_66_;
			if ((i_29_ != 0) && (i_29_ != 32)) {
				if (i_29_ == 1) {
					i_66_ = rsbytebuffer.buffer[i_36_++];
				} else if (i_29_ == 33) {
					i_66_ = rsbytebuffer.buffer[i_43_++];
				} else if (i_29_ == 7) {
					i_66_ = rsbytebuffer.buffer[i_37_++];
				} else if (i_29_ == 39) {
					i_66_ = rsbytebuffer.buffer[i_44_++];
				} else if (i_29_ == 10) {
					i_66_ = rsbytebuffer.buffer[i_38_++];
				} else if (i_29_ == 42) {
					i_66_ = rsbytebuffer.buffer[i_45_++];
				} else if (i_29_ == 99) {
					i_66_ = rsbytebuffer.buffer[i_48_++];
				} else if (i_29_ == 98) {
					i_66_ = rsbytebuffer.buffer[i_49_++];
				} else if (i_29_ == 101) {
					i_66_ = rsbytebuffer.buffer[i_50_++];
				} else if (i_29_ == 100) {
					i_66_ = rsbytebuffer.buffer[i_51_++];
				} else if ((i_29_ != 64) && (i_29_ != 65) && (i_29_ != 120) && (i_29_ != 121) && (i_29_ != 123)) {
					i_66_ = rsbytebuffer.buffer[i_41_++];
				} else {
					i_66_ = rsbytebuffer.buffer[i_32_++];
				}
			} else {
				i_66_ = rsbytebuffer.buffer[i_46_++];
			}
			final int i_67_ = i_66_ + is[i_29_];
			is[i_29_] = i_67_;
			rsbytebuffer_53_.put(i_67_ & 0x7f);
		} else if (i_63_ == 3) {
			if (bool) {
				rsbytebuffer_53_.put(224 + i_54_);
			}
			i_58_ += rsbytebuffer.buffer[i_47_++];
			i_58_ += rsbytebuffer.buffer[i_35_++] << 7;
			rsbytebuffer_53_.put(i_58_ & 0x7f);
			rsbytebuffer_53_.put((i_58_ >> 7) & 0x7f);
		} else if (i_63_ == 4) {
			if (bool) {
				rsbytebuffer_53_.put(208 + i_54_);
			}
			i_59_ += rsbytebuffer.buffer[i_34_++];
			rsbytebuffer_53_.put(i_59_ & 0x7f);
		} else if (i_63_ == 5) {
			if (bool) {
				rsbytebuffer_53_.put(160 + i_54_);
			}
			i_55_ += rsbytebuffer.buffer[i_39_++];
			i_60_ += rsbytebuffer.buffer[i_33_++];
			rsbytebuffer_53_.put(i_55_ & 0x7f);
			rsbytebuffer_53_.put(i_60_ & 0x7f);
		} else {
			if (i_63_ != 6) {
				throw new RuntimeException();
			}
			if (bool) {
				rsbytebuffer_53_.put(192 + i_54_);
			}
			rsbytebuffer_53_.put((rsbytebuffer.buffer[i_46_++]));
		}
				}
			}
		}
	}

	void method_z_void() {
		this.field_n_2500 = null;
	}

	void method_d_void() {
		if (this.field_n_2500 == null) {
			this.field_n_2500 = new NodeMultiSet(16);
			final int[] is = new int[16];
			final int[] is_68_ = new int[16];
			is_68_[9] = 128;
			is[9] = 128;
			final Class_fr class_fr = new Class_fr(this.field_d_2501);
			final int i = class_fr.method_y_int();
			for (int i_69_ = 0; i_69_ < i; i_69_++) {
				class_fr.method_e_void(i_69_);
				class_fr.method_m_void(i_69_);
				class_fr.method_g_void(i_69_);
			}
			for (;;) {
				final int i_70_ = class_fr.method_q_int();
				final int i_71_ = class_fr.field_e_2463[i_70_];
				while (class_fr.field_e_2463[i_70_] == i_71_) {
					class_fr.method_e_void(i_70_);
					final int i_72_ = class_fr.method_a_int(i_70_);
					if (i_72_ == 1) {
						class_fr.method_f_void();
						class_fr.method_g_void(i_70_);
						if (!class_fr.method_k_boolean()) {
							break;
						}
						return;
					}
					final int i_73_ = i_72_ & 0xf0;
					if (i_73_ == 176) {
						final int i_74_ = i_72_ & 0xf;
						final int i_75_ = (i_72_ >> 8) & 0x7f;
						final int i_76_ = (i_72_ >> 16) & 0x7f;
						if (i_75_ == 0) {
							is[i_74_] = (is[i_74_] & ~0x1fc000) + (i_76_ << 14);
						}
						if (i_75_ == 32) {
							is[i_74_] = (is[i_74_] & ~0x3f80) + (i_76_ << 7);
						}
					}
					if (i_73_ == 192) {
						final int i_77_ = i_72_ & 0xf;
						final int i_78_ = (i_72_ >> 8) & 0x7f;
						is_68_[i_77_] = is[i_77_] + i_78_;
					}
					if (i_73_ == 144) {
						final int i_79_ = i_72_ & 0xf;
						final int i_80_ = (i_72_ >> 8) & 0x7f;
						final int i_81_ = (i_72_ >> 16) & 0x7f;
						if (i_81_ > 0) {
							final int i_82_ = is_68_[i_79_];
							Class_gi class_gi = (Class_gi) this.field_n_2500.method_n_ga(i_82_);
							if (class_gi == null) {
								class_gi = new Class_gi(new byte[128]);
								this.field_n_2500.method_d_void(class_gi, i_82_);
							}
							class_gi.field_n_3010[i_80_] = (byte) 1;
						}
					}
					class_fr.method_m_void(i_70_);
					class_fr.method_g_void(i_70_);
				}
			}
		}
	}
}
