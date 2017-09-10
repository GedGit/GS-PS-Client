/* Class_fb - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_fb extends Node {
	static int field_pn_2281;
	Class_ba[] field_d_2282 = new Class_ba[128];
	short[] field_z_2283 = new short[128];
	int field_n_2284;
	public static final int field_u_2285 = 16;
	Class_fo[] field_g_2286 = new Class_fo[128];
	byte[] field_f_2287 = new byte[128];
	int[] field_m_2288 = new int[128];
	static final int field_l_2289 = 1024;
	public static final int field_av_2290 = 224;
	public static final int field_dc_2291 = 255;
	public static final int field_ef_2292 = 137;
	static final int field_br_2293 = 1007;
	static final int field_k_2294 = 360;
	byte[] field_e_2295 = new byte[128];
	static Index modelIndex;
	byte[] field_y_2297 = new byte[128];

	void method_z_void(final int i) {
		try {
			this.field_m_2288 = null;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fb.z()");
		}
	}

	Class_fb(final byte[] is) {
		final Buffer rsbytebuffer = new Buffer(is);
		int i;
		for (i = 0; ((rsbytebuffer.buffer[i + (-1485345105 * rsbytebuffer.position)]) != 0); i++) {
			/* empty */
		}
		final byte[] is_0_ = new byte[i];
		for (int i_1_ = 0; i_1_ < i; i_1_++) {
			is_0_[i_1_] = rsbytebuffer.getSigned();
		}
		rsbytebuffer.position += -685856689;
		i++;
		int i_2_ = -1485345105 * rsbytebuffer.position;
		rsbytebuffer.position += -685856689 * i;
		int i_3_;
		for (i_3_ = 0; ((rsbytebuffer.buffer[(rsbytebuffer.position * -1485345105) + i_3_]) != 0); i_3_++) {
			/* empty */
		}
		final byte[] is_4_ = new byte[i_3_];
		for (int i_5_ = 0; i_5_ < i_3_; i_5_++) {
			is_4_[i_5_] = rsbytebuffer.getSigned();
		}
		rsbytebuffer.position += -685856689;
		i_3_++;
		int i_6_ = rsbytebuffer.position * -1485345105;
		rsbytebuffer.position += i_3_ * -685856689;
		int i_7_;
		for (i_7_ = 0; ((rsbytebuffer.buffer[i_7_ + (-1485345105 * rsbytebuffer.position)]) != 0); i_7_++) {
			/* empty */
		}
		final byte[] is_8_ = new byte[i_7_];
		for (int i_9_ = 0; i_9_ < i_7_; i_9_++) {
			is_8_[i_9_] = rsbytebuffer.getSigned();
		}
		rsbytebuffer.position += -685856689;
		final byte[] is_10_ = new byte[++i_7_];
		int i_11_;
		if (i_7_ > 1) {
			is_10_[1] = (byte) 1;
			int i_12_ = 1;
			i_11_ = 2;
			for (int i_13_ = 2; i_13_ < i_7_; i_13_++) {
				int i_14_ = rsbytebuffer.get();
				if (i_14_ == 0) {
					i_12_ = i_11_++;
				} else {
					if (i_14_ <= i_12_) {
						i_14_--;
					}
					i_12_ = i_14_;
				}
				is_10_[i_13_] = (byte) i_12_;
			}
		} else {
			i_11_ = i_7_;
		}
		final Class_fo[] class_fos = new Class_fo[i_11_];
		for (int i_15_ = 0; i_15_ < class_fos.length; i_15_++) {
			final Class_fo class_fo = class_fos[i_15_] = new Class_fo();
			int i_16_ = rsbytebuffer.get();
			if (i_16_ > 0) {
				class_fo.field_n_2415 = new byte[i_16_ * 2];
			}
			i_16_ = rsbytebuffer.get();
			if (i_16_ > 0) {
				class_fo.field_d_2414 = new byte[2 + (i_16_ * 2)];
				class_fo.field_d_2414[1] = (byte) 64;
			}
		}
		int i_17_ = rsbytebuffer.get();
		final byte[] is_18_ = i_17_ > 0 ? new byte[i_17_ * 2] : null;
		i_17_ = rsbytebuffer.get();
		final byte[] is_19_ = i_17_ > 0 ? new byte[2 * i_17_] : null;
		int i_20_;
		for (i_20_ = 0; ((rsbytebuffer.buffer[i_20_ + (rsbytebuffer.position * -1485345105)]) != 0); i_20_++) {
			/* empty */
		}
		final byte[] is_21_ = new byte[i_20_];
		for (int i_22_ = 0; i_22_ < i_20_; i_22_++) {
			is_21_[i_22_] = rsbytebuffer.getSigned();
		}
		rsbytebuffer.position += -685856689;
		i_20_++;
		int i_23_ = 0;
		for (int i_24_ = 0; i_24_ < 128; i_24_++) {
			i_23_ += rsbytebuffer.get();
			this.field_z_2283[i_24_] = (short) i_23_;
		}
		i_23_ = 0;
		for (int i_25_ = 0; i_25_ < 128; i_25_++) {
			i_23_ += rsbytebuffer.get();
			this.field_z_2283[i_25_] = (short) (this.field_z_2283[i_25_] + (i_23_ << 8));
		}
		int i_26_ = 0;
		int i_27_ = 0;
		int i_28_ = 0;
		for (int i_29_ = 0; i_29_ < 128; i_29_++) {
			if (i_26_ == 0) {
				if (i_27_ < is_21_.length) {
					i_26_ = is_21_[i_27_++];
				} else {
					i_26_ = -1;
				}
				i_28_ = rsbytebuffer.method_ab_int(1670041244);
			}
			this.field_z_2283[i_29_] = (short) (this.field_z_2283[i_29_] + (((i_28_ - 1) & 0x2) << 14));
			this.field_m_2288[i_29_] = i_28_;
			i_26_--;
		}
		i_26_ = 0;
		i_27_ = 0;
		int i_30_ = 0;
		for (int i_31_ = 0; i_31_ < 128; i_31_++) {
			if (this.field_m_2288[i_31_] != 0) {
				if (i_26_ == 0) {
					if (i_27_ < is_0_.length) {
						i_26_ = is_0_[i_27_++];
					} else {
						i_26_ = -1;
					}
					i_30_ = rsbytebuffer.buffer[i_2_++] - 1;
				}
				this.field_f_2287[i_31_] = (byte) i_30_;
				i_26_--;
			}
		}
		i_26_ = 0;
		i_27_ = 0;
		int i_32_ = 0;
		for (int i_33_ = 0; i_33_ < 128; i_33_++) {
			if (this.field_m_2288[i_33_] != 0) {
				if (i_26_ == 0) {
					if (i_27_ < is_4_.length) {
						i_26_ = is_4_[i_27_++];
					} else {
						i_26_ = -1;
					}
					i_32_ = (rsbytebuffer.buffer[i_6_++] + 16) << 2;
				}
				this.field_e_2295[i_33_] = (byte) i_32_;
				i_26_--;
			}
		}
		i_26_ = 0;
		i_27_ = 0;
		Class_fo class_fo = null;
		for (int i_34_ = 0; i_34_ < 128; i_34_++) {
			if (this.field_m_2288[i_34_] != 0) {
				if (i_26_ == 0) {
					class_fo = class_fos[is_10_[i_27_]];
					if (i_27_ < is_8_.length) {
						i_26_ = is_8_[i_27_++];
					} else {
						i_26_ = -1;
					}
				}
				this.field_g_2286[i_34_] = class_fo;
				i_26_--;
			}
		}
		i_26_ = 0;
		i_27_ = 0;
		int i_35_ = 0;
		for (int i_36_ = 0; i_36_ < 128; i_36_++) {
			if (i_26_ == 0) {
				if (i_27_ < is_21_.length) {
					i_26_ = is_21_[i_27_++];
				} else {
					i_26_ = -1;
				}
				if (this.field_m_2288[i_36_] > 0) {
					i_35_ = rsbytebuffer.get() + 1;
				}
			}
			this.field_y_2297[i_36_] = (byte) i_35_;
			i_26_--;
		}
		this.field_n_2284 = (rsbytebuffer.get() + 1) * -612201117;
		for (int i_37_ = 0; i_37_ < i_11_; i_37_++) {
			final Class_fo class_fo_38_ = class_fos[i_37_];
			if (class_fo_38_.field_n_2415 != null) {
				for (int i_39_ = 1; i_39_ < class_fo_38_.field_n_2415.length; i_39_ += 2) {
					class_fo_38_.field_n_2415[i_39_] = rsbytebuffer.getSigned();
				}
			}
			if (class_fo_38_.field_d_2414 != null) {
				for (int i_40_ = 3; i_40_ < (class_fo_38_.field_d_2414.length - 2); i_40_ += 2) {
					class_fo_38_.field_d_2414[i_40_] = rsbytebuffer.getSigned();
				}
			}
		}
		if (is_18_ != null) {
			for (int i_41_ = 1; i_41_ < is_18_.length; i_41_ += 2) {
				is_18_[i_41_] = rsbytebuffer.getSigned();
			}
		}
		if (is_19_ != null) {
			for (int i_42_ = 1; i_42_ < is_19_.length; i_42_ += 2) {
				is_19_[i_42_] = rsbytebuffer.getSigned();
			}
		}
		for (int i_43_ = 0; i_43_ < i_11_; i_43_++) {
			final Class_fo class_fo_44_ = class_fos[i_43_];
			if (class_fo_44_.field_d_2414 != null) {
				i_23_ = 0;
				for (int i_45_ = 2; i_45_ < class_fo_44_.field_d_2414.length; i_45_ += 2) {
					i_23_ = i_23_ + 1 + rsbytebuffer.get();
					class_fo_44_.field_d_2414[i_45_] = (byte) i_23_;
				}
			}
		}
		for (int i_46_ = 0; i_46_ < i_11_; i_46_++) {
			final Class_fo class_fo_47_ = class_fos[i_46_];
			if (class_fo_47_.field_n_2415 != null) {
				i_23_ = 0;
				for (int i_48_ = 2; i_48_ < class_fo_47_.field_n_2415.length; i_48_ += 2) {
					i_23_ = 1 + i_23_ + rsbytebuffer.get();
					class_fo_47_.field_n_2415[i_48_] = (byte) i_23_;
				}
			}
		}
		if (is_18_ != null) {
			i_23_ = rsbytebuffer.get();
			is_18_[0] = (byte) i_23_;
			for (int i_49_ = 2; i_49_ < is_18_.length; i_49_ += 2) {
				i_23_ = 1 + i_23_ + rsbytebuffer.get();
				is_18_[i_49_] = (byte) i_23_;
			}
			int i_50_ = is_18_[0];
			int i_51_ = is_18_[1];
			for (int i_52_ = 0; i_52_ < i_50_; i_52_++) {
				this.field_y_2297[i_52_] = (byte) ((32 + (i_51_ * this.field_y_2297[i_52_])) >> 6);
			}
			for (int i_53_ = 2; i_53_ < is_18_.length; i_53_ += 2) {
				final int i_54_ = is_18_[i_53_];
				final int i_55_ = is_18_[i_53_ + 1];
				int i_56_ = ((i_54_ - i_50_) / 2) + (i_51_ * (i_54_ - i_50_));
				for (int i_57_ = i_50_; i_57_ < i_54_; i_57_++) {
					final int i_58_ = Class_ed.method_g_int(i_56_, i_54_ - i_50_, -8537319);
					this.field_y_2297[i_57_] = (byte) ((32 + (i_58_ * (this.field_y_2297[i_57_]))) >> 6);
					i_56_ += i_55_ - i_51_;
				}
				i_50_ = i_54_;
				i_51_ = i_55_;
			}
			for (int i_59_ = i_50_; i_59_ < 128; i_59_++) {
				this.field_y_2297[i_59_] = (byte) ((32 + (this.field_y_2297[i_59_] * i_51_)) >> 6);
			}
		}
		if (is_19_ != null) {
			i_23_ = rsbytebuffer.get();
			is_19_[0] = (byte) i_23_;
			for (int i_60_ = 2; i_60_ < is_19_.length; i_60_ += 2) {
				i_23_ = i_23_ + 1 + rsbytebuffer.get();
				is_19_[i_60_] = (byte) i_23_;
			}
			int i_61_ = is_19_[0];
			int i_62_ = is_19_[1] << 1;
			for (int i_63_ = 0; i_63_ < i_61_; i_63_++) {
				int i_64_ = i_62_ + (this.field_e_2295[i_63_] & 0xff);
				if (i_64_ < 0) {
					i_64_ = 0;
				}
				if (i_64_ > 128) {
					i_64_ = 128;
				}
				this.field_e_2295[i_63_] = (byte) i_64_;
			}
			for (int i_65_ = 2; i_65_ < is_19_.length; i_65_ += 2) {
				final int i_66_ = is_19_[i_65_];
				final int i_67_ = is_19_[1 + i_65_] << 1;
				int i_68_ = ((i_66_ - i_61_) * i_62_) + ((i_66_ - i_61_) / 2);
				for (int i_69_ = i_61_; i_69_ < i_66_; i_69_++) {
					final int i_70_ = Class_ed.method_g_int(i_68_, i_66_ - i_61_, -1288200428);
					int i_71_ = i_70_ + (this.field_e_2295[i_69_] & 0xff);
					if (i_71_ < 0) {
						i_71_ = 0;
					}
					if (i_71_ > 128) {
						i_71_ = 128;
					}
					this.field_e_2295[i_69_] = (byte) i_71_;
					i_68_ += i_67_ - i_62_;
				}
				i_61_ = i_66_;
				i_62_ = i_67_;
			}
			for (int i_72_ = i_61_; i_72_ < 128; i_72_++) {
				int i_73_ = (this.field_e_2295[i_72_] & 0xff) + i_62_;
				if (i_73_ < 0) {
					i_73_ = 0;
				}
				if (i_73_ > 128) {
					i_73_ = 128;
				}
				this.field_e_2295[i_72_] = (byte) i_73_;
			}
		}
		for (int i_74_ = 0; i_74_ < i_11_; i_74_++) {
			class_fos[i_74_].field_z_2418 = rsbytebuffer.get() * -1576902221;
		}
		for (int i_75_ = 0; i_75_ < i_11_; i_75_++) {
			final Class_fo class_fo_76_ = class_fos[i_75_];
			if (class_fo_76_.field_n_2415 != null) {
				class_fo_76_.field_y_2413 = rsbytebuffer.get() * -1798316025;
			}
			if (class_fo_76_.field_d_2414 != null) {
				class_fo_76_.field_e_2417 = rsbytebuffer.get() * 1751734915;
			}
			if ((class_fo_76_.field_z_2418 * 1348154747) > 0) {
				class_fo_76_.field_g_2420 = rsbytebuffer.get() * -1253038829;
			}
		}
		for (int i_77_ = 0; i_77_ < i_11_; i_77_++) {
			class_fos[i_77_].field_m_2416 = rsbytebuffer.get() * -256851311;
		}
		for (int i_78_ = 0; i_78_ < i_11_; i_78_++) {
			final Class_fo class_fo_79_ = class_fos[i_78_];
			if ((class_fo_79_.field_m_2416 * 1017855601) > 0) {
				class_fo_79_.field_f_2419 = rsbytebuffer.get() * -866699819;
			}
		}
		for (int i_80_ = 0; i_80_ < i_11_; i_80_++) {
			final Class_fo class_fo_81_ = class_fos[i_80_];
			if ((class_fo_81_.field_f_2419 * -1876403331) > 0) {
				class_fo_81_.field_a_2421 = rsbytebuffer.get() * -1339688021;
			}
		}
	}

	boolean method_d_boolean(final Class_bw class_bw, final byte[] is, final int[] is_82_, final int i) {
		boolean bool;
		try {
			boolean bool_83_ = true;
			int i_84_ = 0;
			Class_ba class_ba = null;
			for (int i_85_ = 0; i_85_ < 128; i_85_++) {
				if ((is == null) || (is[i_85_] != 0)) {
					int i_86_ = this.field_m_2288[i_85_];
					if (i_86_ != 0) {
						if (i_84_ != i_86_) {
							i_84_ = i_86_--;
							if ((i_86_ & 0x1) == 0) {
								class_ba = class_bw.method_z_ba(i_86_ >> 2, is_82_, 723903089);
							} else {
								class_ba = class_bw.method_y_ba(i_86_ >> 2, is_82_, -23665240);
							}
							if (class_ba == null) {
								bool_83_ = false;
							}
						}
						if (class_ba != null) {
							this.field_d_2282[i_85_] = class_ba;
							this.field_m_2288[i_85_] = 0;
						}
					}
				}
			}
			bool = bool_83_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fb.d()");
		}
		return bool;
	}
}
