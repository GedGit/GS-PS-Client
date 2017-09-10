/* Class_bz - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_bz extends Node {
	static Class_bq[] field_q_716;
	int field_p_717;
	int field_z_718;
	int field_y_719;
	static Class_bv[] field_u_720;
	boolean field_g_721;
	float[] field_v_722;
	static int field_m_723;
	static float[] field_ae_724;
	int field_e_725;
	static int field_l_726;
	static Class_bp[] field_x_727;
	static boolean field_s_728 = false;
	static Class_bm[] field_k_729;
	int field_d_730;
	static boolean[] field_r_731;
	static int[] field_j_732;
	int field_as_733;
	static byte[] field_f_734;
	boolean field_o_735;
	static int field_a_736;
	byte[][] field_n_737;
	static float[] field_b_738;
	static float[] field_t_739;
	static float[] field_w_740;
	static float[] field_i_741;
	static float[] field_ad_742;
	static float[] field_ak_743;
	int field_c_744;
	static int[] field_ax_745;
	static int[] field_al_746;
	byte[] field_ar_747;
	static int field_h_748;
	int field_ab_749;

	static void method_d_void(final byte[] is, final int i) {
		field_f_734 = is;
		field_m_723 = i;
		field_a_736 = 0;
	}

	static int method_z_int() {
		final int i = (field_f_734[field_m_723] >> field_a_736) & 0x1;
		field_a_736++;
		field_m_723 += field_a_736 >> 3;
		field_a_736 &= 0x7;
		return i;
	}

	static int method_y_int(int i) {
		int i_0_ = 0;
		int i_1_ = 0;
		int i_2_;
		for (/**/; i >= (8 - field_a_736); i -= i_2_) {
			i_2_ = 8 - field_a_736;
			final int i_3_ = (1 << i_2_) - 1;
			i_0_ += ((field_f_734[field_m_723] >> field_a_736) & i_3_) << i_1_;
			field_a_736 = 0;
			field_m_723++;
			i_1_ += i_2_;
		}
		if (i > 0) {
			i_2_ = (1 << i) - 1;
			i_0_ += ((field_f_734[field_m_723] >> field_a_736) & i_2_) << i_1_;
			field_a_736 += i;
		}
		return i_0_;
	}

	void method_e_void(final byte[] is) {
		final Buffer rsbytebuffer = new Buffer(is);
		this.field_d_730 = rsbytebuffer.getInt();
		this.field_z_718 = rsbytebuffer.getInt();
		this.field_y_719 = rsbytebuffer.getInt();
		this.field_e_725 = rsbytebuffer.getInt();
		if (this.field_e_725 < 0) {
			this.field_e_725 = this.field_e_725 ^ 0xffffffff;
			this.field_g_721 = true;
		}
		final int i = rsbytebuffer.getInt();
		this.field_n_737 = new byte[i][];
		for (int i_4_ = 0; i_4_ < i; i_4_++) {
			int i_5_ = 0;
			int i_6_;
			do {
				i_6_ = rsbytebuffer.get();
				i_5_ += i_6_;
			} while (i_6_ >= 255);
			final byte[] is_7_ = new byte[i_5_];
			rsbytebuffer.method_ax_void(is_7_, 0, i_5_);
			this.field_n_737[i_4_] = is_7_;
		}
	}

	static boolean method_m_boolean(final FileStore class_fs) {
		if (!field_s_728) {
			final byte[] is = class_fs.getArchive(0, 0);
			if (is == null) {
				return false;
			}
			method_g_void(is);
			field_s_728 = true;
		}
		return true;
	}

	static float method_n_float(final int i) {
		int i_8_ = i & 0x1fffff;
		final int i_9_ = i & ~0x7fffffff;
		final int i_10_ = (i & 0x7fe00000) >> 21;
		if (i_9_ != 0) {
			i_8_ = -i_8_;
		}
		return (float) (i_8_ * Math.pow(2.0, i_10_ - 788));
	}

	float[] method_f_floatArray(final int i) {
		method_d_void(this.field_n_737[i], 0);
		method_z_int();
		final int i_11_ = method_y_int(Class_al.method_y_int(field_j_732.length - 1, (byte) -97));
		final boolean bool = field_r_731[i_11_];
		final int i_12_ = bool ? field_l_726 : field_h_748;
		boolean bool_13_ = false;
		boolean bool_14_ = false;
		if (bool) {
			bool_13_ = method_z_int() != 0;
			bool_14_ = method_z_int() != 0;
		}
		final int i_15_ = i_12_ >> 1;
			int i_16_;
			int i_17_;
			int i_18_;
			if (bool && !bool_13_) {
				i_16_ = (i_12_ >> 2) - (field_h_748 >> 2);
				i_17_ = (i_12_ >> 2) + (field_h_748 >> 2);
				i_18_ = field_h_748 >> 1;
			} else {
				i_16_ = 0;
				i_17_ = i_15_;
				i_18_ = i_12_ >> 1;
			}
			int i_19_;
			int i_20_;
			int i_21_;
			if (bool && !bool_14_) {
				i_19_ = i_12_ - (i_12_ >> 2) - (field_h_748 >> 2);
				i_20_ = (i_12_ - (i_12_ >> 2)) + (field_h_748 >> 2);
				i_21_ = field_h_748 >> 1;
			} else {
				i_19_ = i_15_;
				i_20_ = i_12_;
				i_21_ = i_12_ >> 1;
			}
			final Class_bp class_bp = field_x_727[field_j_732[i_11_]];
			final int i_22_ = class_bp.field_d_616;
			int i_23_ = class_bp.field_z_615[i_22_];
			final boolean bool_24_ = !field_q_716[i_23_].method_g_boolean();
			final boolean bool_25_ = bool_24_;
			for (i_23_ = 0; i_23_ < class_bp.field_n_614; i_23_++) {
				final Class_bm class_bm = field_k_729[class_bp.field_y_617[i_23_]];
				final float[] fs = field_b_738;
				class_bm.method_n_void(fs, i_12_ >> 1, bool_25_);
			}
			if (!bool_24_) {
				i_23_ = class_bp.field_d_616;
				final int i_26_ = class_bp.field_z_615[i_23_];
				field_q_716[i_26_].method_f_void(field_b_738, i_12_ >> 1);
			}
			if (bool_24_) {
				for (i_23_ = i_12_ >> 1; i_23_ < i_12_; i_23_++) {
					field_b_738[i_23_] = 0.0F;
				}
			} else {
				i_23_ = i_12_ >> 1;
				final int i_27_ = i_12_ >> 2;
				final int i_28_ = i_12_ >> 3;
				final float[] fs = field_b_738;
				for (int i_29_ = 0; i_29_ < i_23_; i_29_++) {
					fs[i_29_] *= 0.5F;
				}
				for (int i_30_ = i_23_; i_30_ < i_12_; i_30_++) {
					fs[i_30_] = -fs[i_12_ - i_30_ - 1];
				}
				final float[] fs_31_ = bool ? field_ad_742 : field_t_739;
				final float[] fs_32_ = bool ? field_ak_743 : field_w_740;
				final float[] fs_33_ = bool ? field_ae_724 : field_i_741;
				final int[] is = bool ? field_al_746 : field_ax_745;
				for (int i_34_ = 0; i_34_ < i_27_; i_34_++) {
					final float f = fs[4 * i_34_] - fs[i_12_ - (4 * i_34_) - 1];
					final float f_35_ = fs[(4 * i_34_) + 2] - fs[i_12_ - (4 * i_34_) - 3];
					final float f_36_ = fs_31_[2 * i_34_];
					final float f_37_ = fs_31_[(2 * i_34_) + 1];
					fs[i_12_ - (4 * i_34_) - 1] = (f * f_36_) - (f_35_ * f_37_);
					fs[i_12_ - (4 * i_34_) - 3] = (f * f_37_) + (f_35_ * f_36_);
				}
				for (int i_38_ = 0; i_38_ < i_28_; i_38_++) {
					final float f = fs[i_23_ + 3 + (4 * i_38_)];
					final float f_39_ = fs[i_23_ + 1 + (4 * i_38_)];
					final float f_40_ = fs[(4 * i_38_) + 3];
					final float f_41_ = fs[(4 * i_38_) + 1];
					fs[i_23_ + 3 + (4 * i_38_)] = f + f_40_;
					fs[i_23_ + 1 + (4 * i_38_)] = f_39_ + f_41_;
					final float f_42_ = fs_31_[i_23_ - 4 - (4 * i_38_)];
					final float f_43_ = fs_31_[i_23_ - 3 - (4 * i_38_)];
					fs[(4 * i_38_) + 3] = ((f - f_40_) * f_42_) - ((f_39_ - f_41_) * f_43_);
					fs[(4 * i_38_) + 1] = ((f_39_ - f_41_) * f_42_) + ((f - f_40_) * f_43_);
				}
				final int i_44_ = Class_al.method_y_int(i_12_ - 1, (byte) -97);
				for (int i_45_ = 0; i_45_ < (i_44_ - 3); i_45_++) {
					final int i_46_ = i_12_ >> (i_45_ + 2);
				final int i_47_ = 8 << i_45_;
				for (int i_48_ = 0; i_48_ < (2 << i_45_); i_48_++) {
					final int i_49_ = i_12_ - (i_46_ * 2 * i_48_);
					final int i_50_ = i_12_ - (i_46_ * ((2 * i_48_) + 1));
					for (int i_51_ = 0; i_51_ < (i_12_ >> (i_45_ + 4)); i_51_++) {
						final int i_52_ = 4 * i_51_;
						final float f = fs[i_49_ - 1 - i_52_];
						final float f_53_ = fs[i_49_ - 3 - i_52_];
						final float f_54_ = fs[i_50_ - 1 - i_52_];
						final float f_55_ = fs[i_50_ - 3 - i_52_];
						fs[i_49_ - 1 - i_52_] = f + f_54_;
						fs[i_49_ - 3 - i_52_] = f_53_ + f_55_;
						final float f_56_ = fs_31_[i_51_ * i_47_];
						final float f_57_ = fs_31_[(i_51_ * i_47_) + 1];
						fs[i_50_ - 1 - i_52_] = ((f - f_54_) * f_56_) - ((f_53_ - f_55_) * f_57_);
						fs[i_50_ - 3 - i_52_] = ((f_53_ - f_55_) * f_56_) + ((f - f_54_) * f_57_);
					}
				}
				}
				for (int i_58_ = 1; i_58_ < (i_28_ - 1); i_58_++) {
					final int i_59_ = is[i_58_];
					if (i_58_ < i_59_) {
						final int i_60_ = 8 * i_58_;
						final int i_61_ = 8 * i_59_;
						float f = fs[i_60_ + 1];
						fs[i_60_ + 1] = fs[i_61_ + 1];
						fs[i_61_ + 1] = f;
						f = fs[i_60_ + 3];
						fs[i_60_ + 3] = fs[i_61_ + 3];
						fs[i_61_ + 3] = f;
						f = fs[i_60_ + 5];
						fs[i_60_ + 5] = fs[i_61_ + 5];
						fs[i_61_ + 5] = f;
						f = fs[i_60_ + 7];
						fs[i_60_ + 7] = fs[i_61_ + 7];
						fs[i_61_ + 7] = f;
					}
				}
				for (int i_62_ = 0; i_62_ < i_23_; i_62_++) {
					fs[i_62_] = fs[(2 * i_62_) + 1];
				}
				for (int i_63_ = 0; i_63_ < i_28_; i_63_++) {
					fs[i_12_ - 1 - (2 * i_63_)] = fs[4 * i_63_];
					fs[i_12_ - 2 - (2 * i_63_)] = fs[(4 * i_63_) + 1];
					fs[i_12_ - i_27_ - 1 - (2 * i_63_)] = fs[(4 * i_63_) + 2];
					fs[i_12_ - i_27_ - 2 - (2 * i_63_)] = fs[(4 * i_63_) + 3];
				}
				for (int i_64_ = 0; i_64_ < i_28_; i_64_++) {
					final float f = fs_33_[2 * i_64_];
					final float f_65_ = fs_33_[(2 * i_64_) + 1];
					final float f_66_ = fs[i_23_ + (2 * i_64_)];
					final float f_67_ = fs[i_23_ + (2 * i_64_) + 1];
					final float f_68_ = fs[i_12_ - 2 - (2 * i_64_)];
					final float f_69_ = fs[i_12_ - 1 - (2 * i_64_)];
					float f_70_ = (f_65_ * (f_66_ - f_68_)) + (f * (f_67_ + f_69_));
					fs[i_23_ + (2 * i_64_)] = (f_66_ + f_68_ + f_70_) * 0.5F;
					fs[i_12_ - 2 - (2 * i_64_)] = ((f_66_ + f_68_) - f_70_) * 0.5F;
					f_70_ = (f_65_ * (f_67_ + f_69_)) - (f * (f_66_ - f_68_));
					fs[i_23_ + (2 * i_64_) + 1] = ((f_67_ - f_69_) + f_70_) * 0.5F;
					fs[i_12_ - 1 - (2 * i_64_)] = (-f_67_ + f_69_ + f_70_) * 0.5F;
				}
				for (int i_71_ = 0; i_71_ < i_27_; i_71_++) {
					fs[i_71_] = ((fs[(2 * i_71_) + i_23_] * fs_32_[2 * i_71_]) + (fs[(2 * i_71_) + 1 + i_23_] * fs_32_[(2 * i_71_) + 1]));
					fs[i_23_ - 1 - i_71_] = ((fs[(2 * i_71_) + i_23_] * fs_32_[(2 * i_71_) + 1]) - (fs[(2 * i_71_) + 1 + i_23_] * fs_32_[2 * i_71_]));
				}
				for (int i_72_ = 0; i_72_ < i_27_; i_72_++) {
					fs[(i_12_ - i_27_) + i_72_] = -fs[i_72_];
				}
				for (int i_73_ = 0; i_73_ < i_27_; i_73_++) {
					fs[i_73_] = fs[i_27_ + i_73_];
				}
				for (int i_74_ = 0; i_74_ < i_27_; i_74_++) {
					fs[i_27_ + i_74_] = -fs[i_27_ - i_74_ - 1];
				}
				for (int i_75_ = 0; i_75_ < i_27_; i_75_++) {
					fs[i_23_ + i_75_] = fs[i_12_ - i_75_ - 1];
				}
				for (int i_76_ = i_16_; i_76_ < i_17_; i_76_++) {
					final float f = (float) Math.sin(((i_76_ - i_16_ + 0.5) / i_18_) * 0.5 * 3.141592653589793);
					field_b_738[i_76_] *= (float) Math.sin(1.5707963267948966 * f * f);
				}
				for (int i_77_ = i_19_; i_77_ < i_20_; i_77_++) {
					final float f = (float) Math.sin((((i_77_ - i_19_ + 0.5) / i_21_) * 0.5 * 3.141592653589793) + 1.5707963267948966);
					field_b_738[i_77_] *= (float) Math.sin(1.5707963267948966 * f * f);
				}
			}
			float[] fs = null;
			if (this.field_c_744 > 0) {
				final int i_78_ = (this.field_c_744 + i_12_) >> 2;
				fs = new float[i_78_];
				if (!this.field_o_735) {
					for (int i_79_ = 0; i_79_ < this.field_p_717; i_79_++) {
						final int i_80_ = (this.field_c_744 >> 1) + i_79_;
						fs[i_79_] += this.field_v_722[i_80_];
					}
				}
				if (!bool_24_) {
					for (int i_81_ = i_16_; i_81_ < (i_12_ >> 1); i_81_++) {
						final int i_82_ = (fs.length - (i_12_ >> 1)) + i_81_;
						fs[i_82_] += field_b_738[i_81_];
					}
				}
			}
			final float[] fs_83_ = this.field_v_722;
			this.field_v_722 = field_b_738;
			field_b_738 = fs_83_;
			this.field_c_744 = i_12_;
			this.field_p_717 = i_20_ - (i_12_ >> 1);
			this.field_o_735 = bool_24_;
			return fs;
	}

	Class_bz(final byte[] is) {
		method_e_void(is);
	}

	Class_ba method_h_ba(final int[] is) {
		if ((is != null) && (is[0] <= 0)) {
			return null;
		}
		if (this.field_ar_747 == null) {
			this.field_c_744 = 0;
			this.field_v_722 = new float[field_l_726];
			this.field_ar_747 = new byte[this.field_z_718];
			this.field_as_733 = 0;
			this.field_ab_749 = 0;
		}
		for (/**/; (this.field_ab_749 < this.field_n_737.length); this.field_ab_749++) {
			if ((is != null) && (is[0] <= 0)) {
				return null;
			}
			final float[] fs = method_f_floatArray(this.field_ab_749);
			if (fs != null) {
				int i = this.field_as_733;
				int i_84_ = fs.length;
				if (i_84_ > (this.field_z_718 - i)) {
					i_84_ = this.field_z_718 - i;
				}
				for (int i_85_ = 0; i_85_ < i_84_; i_85_++) {
					int i_86_ = (int) (128.0F + (fs[i_85_] * 128.0F));
					if ((i_86_ & ~0xff) != 0) {
						i_86_ = (i_86_ ^ 0xffffffff) >> 31;
					}
					this.field_ar_747[i++] = (byte) (i_86_ - 128);
				}
				if (is != null) {
					is[0] -= i - this.field_as_733;
				}
				this.field_as_733 = i;
			}
		}
		this.field_v_722 = null;
		final byte[] is_87_ = this.field_ar_747;
		this.field_ar_747 = null;
		return new Class_ba(this.field_d_730, is_87_, this.field_y_719, this.field_e_725, this.field_g_721);
	}

	static void method_g_void(final byte[] is) {
		method_d_void(is, 0);
		field_h_748 = 1 << method_y_int(4);
		field_l_726 = 1 << method_y_int(4);
		field_b_738 = new float[field_l_726];
		for (int i = 0; i < 2; i++) {
			final int i_88_ = i != 0 ? field_l_726 : field_h_748;
			final int i_89_ = i_88_ >> 1;
		final int i_90_ = i_88_ >> 2;
		final int i_91_ = i_88_ >> 3;
		final float[] fs = new float[i_89_];
		for (int i_92_ = 0; i_92_ < i_90_; i_92_++) {
			fs[2 * i_92_] = (float) Math.cos((4 * i_92_ * 3.141592653589793) / i_88_);
			fs[(2 * i_92_) + 1] = -(float) Math.sin((4 * i_92_ * 3.141592653589793) / i_88_);
		}
		final float[] fs_93_ = new float[i_89_];
		for (int i_94_ = 0; i_94_ < i_90_; i_94_++) {
			fs_93_[2 * i_94_] = (float) Math.cos((((2 * i_94_) + 1) * 3.141592653589793) / (2 * i_88_));
			fs_93_[(2 * i_94_) + 1] = (float) Math.sin((((2 * i_94_) + 1) * 3.141592653589793) / (2 * i_88_));
		}
		final float[] fs_95_ = new float[i_90_];
		for (int i_96_ = 0; i_96_ < i_91_; i_96_++) {
			fs_95_[2 * i_96_] = (float) Math.cos((((4 * i_96_) + 2) * 3.141592653589793) / i_88_);
			fs_95_[(2 * i_96_) + 1] = -(float) Math.sin((((4 * i_96_) + 2) * 3.141592653589793) / i_88_);
		}
		final int[] is_97_ = new int[i_91_];
		final int i_98_ = Class_al.method_y_int(i_91_ - 1, (byte) -52);
		for (int i_99_ = 0; i_99_ < i_91_; i_99_++) {
			is_97_[i_99_] = Class_ay.method_e_int(i_99_, i_98_, -401037369);
		}
		if (i != 0) {
			field_ad_742 = fs;
			field_ak_743 = fs_93_;
			field_ae_724 = fs_95_;
			field_al_746 = is_97_;
		} else {
			field_t_739 = fs;
			field_w_740 = fs_93_;
			field_i_741 = fs_95_;
			field_ax_745 = is_97_;
		}
		}
		final int i = method_y_int(8) + 1;
		field_u_720 = new Class_bv[i];
		for (int i_100_ = 0; i_100_ < i; i_100_++) {
			field_u_720[i_100_] = new Class_bv();
		}
		int i_101_ = method_y_int(6) + 1;
		for (int i_102_ = 0; i_102_ < i_101_; i_102_++) {
			method_y_int(16);
		}
		i_101_ = method_y_int(6) + 1;
		field_q_716 = new Class_bq[i_101_];
		for (int i_103_ = 0; i_103_ < i_101_; i_103_++) {
			field_q_716[i_103_] = new Class_bq();
		}
		final int i_104_ = method_y_int(6) + 1;
		field_k_729 = new Class_bm[i_104_];
		for (int i_105_ = 0; i_105_ < i_104_; i_105_++) {
			field_k_729[i_105_] = new Class_bm();
		}
		final int i_106_ = method_y_int(6) + 1;
		field_x_727 = new Class_bp[i_106_];
		for (int i_107_ = 0; i_107_ < i_106_; i_107_++) {
			field_x_727[i_107_] = new Class_bp();
		}
		final int i_108_ = method_y_int(6) + 1;
		field_r_731 = new boolean[i_108_];
		field_j_732 = new int[i_108_];
		for (int i_109_ = 0; i_109_ < i_108_; i_109_++) {
			field_r_731[i_109_] = method_z_int() != 0;
			method_y_int(16);
			method_y_int(16);
			field_j_732[i_109_] = method_y_int(8);
		}
	}

	static Class_bz method_a_bz(final FileStore class_fs, final int i, final int i_110_) {
		if (!method_m_boolean(class_fs)) {
			class_fs.method_e_boolean(i, i_110_, 1104130489);
			return null;
		}
		final byte[] is = class_fs.getArchive(i, i_110_);
		return is == null ? null : new Class_bz(is);
	}
}
