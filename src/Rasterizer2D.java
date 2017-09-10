/* Class_bx - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

public final class Rasterizer2D extends Rasterizer {
	public int field_f_678;
	public int field_d_679;
	public int field_e_680;
	public int[] field_n_681;
	public int field_y_682;
	public int field_g_683;
	static final int field_l_684 = 12;
	public int field_z_685;
	static final int field_a_686 = 15;
	static final int field_h_687 = 8;
	static final int field_m_688 = 4;
	static final int field_u_689 = 4095;

	public Rasterizer2D(final int i, final int i_0_) {
		field_n_681 = new int[i * i_0_];
		field_d_679 = field_g_683 = i;
		field_z_685 = field_f_678 = i_0_;
		field_e_680 = 0;
		field_y_682 = 0;
	}

	public void method_d_void() {
		init(field_n_681, field_d_679, field_z_685);
	}

	public void method_z_void(final int i, final int i_1_, final int i_2_) {
		for (int i_3_ = 0; i_3_ < field_n_681.length; i_3_++) {
			final int i_4_ = field_n_681[i_3_];
			if (i_4_ != 0) {
				int i_5_ = (i_4_ >> 16) & 0xff;
		i_5_ += i;
		if (i_5_ < 1) {
			i_5_ = 1;
		} else if (i_5_ > 255) {
			i_5_ = 255;
		}
		int i_6_ = (i_4_ >> 8) & 0xff;
		i_6_ += i_1_;
		if (i_6_ < 1) {
			i_6_ = 1;
		} else if (i_6_ > 255) {
			i_6_ = 255;
		}
		int i_7_ = i_4_ & 0xff;
		i_7_ += i_2_;
		if (i_7_ < 1) {
			i_7_ = 1;
		} else if (i_7_ > 255) {
			i_7_ = 255;
		}
		field_n_681[i_3_] = (i_5_ << 16) + (i_6_ << 8) + i_7_;
			}
		}
	}

	public void method_y_void() {
		if ((field_d_679 != field_g_683) || (field_z_685 != field_f_678)) {
			final int[] is = new int[field_g_683 * field_f_678];
			for (int i = 0; i < field_z_685; i++) {
				for (int i_8_ = 0; i_8_ < field_d_679; i_8_++) {
					is[((i + field_e_680) * field_g_683) + i_8_ + field_y_682] = field_n_681[(i * field_d_679) + i_8_];
				}
			}
			field_n_681 = is;
			field_d_679 = field_g_683;
			field_z_685 = field_f_678;
			field_y_682 = 0;
			field_e_680 = 0;
		}
	}

	public void method_g_void() {
		final int[] is = new int[field_d_679 * field_z_685];
		int i = 0;
		for (int i_9_ = 0; i_9_ < field_z_685; i_9_++) {
			for (int i_10_ = field_d_679 - 1; i_10_ >= 0; i_10_--) {
				is[i++] = field_n_681[i_10_ + (i_9_ * field_d_679)];
			}
		}
		field_n_681 = is;
		field_y_682 = field_g_683 - field_d_679 - field_y_682;
	}

	public void method_f_void() {
		final int[] is = new int[field_d_679 * field_z_685];
		int i = 0;
		for (int i_11_ = field_z_685 - 1; i_11_ >= 0; i_11_--) {
			for (int i_12_ = 0; i_12_ < field_d_679; i_12_++) {
				is[i++] = field_n_681[i_12_ + (i_11_ * field_d_679)];
			}
		}
		field_n_681 = is;
		field_e_680 = field_f_678 - field_z_685 - field_e_680;
	}

	public Rasterizer2D() {
		/* empty */
	}

	public void method_a_void(final int i) {
		for (int i_13_ = field_z_685 - 1; i_13_ > 0; i_13_--) {
			final int i_14_ = i_13_ * field_d_679;
			for (int i_15_ = field_d_679 - 1; i_15_ > 0; i_15_--) {
				if ((field_n_681[i_15_ + i_14_] == 0) && (field_n_681[(i_15_ + i_14_) - 1 - field_d_679] != 0)) {
					field_n_681[i_15_ + i_14_] = i;
				}
			}
		}
	}

	public void method_h_void(int i, int i_16_) {
		i += field_y_682;
		i_16_ += field_e_680;
		int i_17_ = i + (i_16_ * width);
		int i_18_ = 0;
		int i_19_ = field_z_685;
		int i_20_ = field_d_679;
		int i_21_ = width - i_20_;
		int i_22_ = 0;
		if (i_16_ < field_r_512) {
			final int i_23_ = field_r_512 - i_16_;
			i_19_ -= i_23_;
			i_16_ = field_r_512;
			i_18_ += i_23_ * i_20_;
			i_17_ += i_23_ * width;
		}
		if ((i_16_ + i_19_) > field_j_513) {
			i_19_ -= (i_16_ + i_19_) - field_j_513;
		}
		if (i < field_s_514) {
			final int i_24_ = field_s_514 - i;
			i_20_ -= i_24_;
			i = field_s_514;
			i_18_ += i_24_;
			i_17_ += i_24_;
			i_22_ += i_24_;
			i_21_ += i_24_;
		}
		if ((i + i_20_) > field_v_509) {
			final int i_25_ = (i + i_20_) - field_v_509;
			i_20_ -= i_25_;
			i_22_ += i_25_;
			i_21_ += i_25_;
		}
		if ((i_20_ > 0) && (i_19_ > 0)) {
			method_l_void(pixels, field_n_681, i_18_, i_17_, i_20_, i_19_, i_21_, i_22_);
		}
	}

	static void method_l_void(final int[] is, final int[] is_26_, int i, int i_27_, final int i_28_, final int i_29_, final int i_30_, final int i_31_) {
		for (int i_32_ = -i_29_; i_32_ < 0; i_32_++) {
			int i_33_ = (i_27_ + i_28_) - 3;
			while (i_27_ < i_33_) {
				is[i_27_++] = is_26_[i++];
				is[i_27_++] = is_26_[i++];
				is[i_27_++] = is_26_[i++];
				is[i_27_++] = is_26_[i++];
			}
			i_33_ += 3;
			while (i_27_ < i_33_) {
				is[i_27_++] = is_26_[i++];
			}
			i_27_ += i_30_;
			i += i_31_;
		}
	}

	static void method_q_void(final int[] is, final int[] is_34_, int i, int i_35_, int i_36_, int i_37_, final int i_38_, final int i_39_, final int i_40_) {
		final int i_41_ = -(i_37_ >> 2);
		i_37_ = -(i_37_ & 0x3);
		for (int i_42_ = -i_38_; i_42_ < 0; i_42_++) {
			for (int i_43_ = i_41_; i_43_ < 0; i_43_++) {
				i = is_34_[i_35_++];
				if (i != 0) {
					is[i_36_++] = i;
				} else {
					i_36_++;
				}
				i = is_34_[i_35_++];
				if (i != 0) {
					is[i_36_++] = i;
				} else {
					i_36_++;
				}
				i = is_34_[i_35_++];
				if (i != 0) {
					is[i_36_++] = i;
				} else {
					i_36_++;
				}
				i = is_34_[i_35_++];
				if (i != 0) {
					is[i_36_++] = i;
				} else {
					i_36_++;
				}
			}
			for (int i_44_ = i_37_; i_44_ < 0; i_44_++) {
				i = is_34_[i_35_++];
				if (i != 0) {
					is[i_36_++] = i;
				} else {
					i_36_++;
				}
			}
			i_36_ += i_39_;
			i_35_ += i_40_;
		}
	}

	static void method_x_void(final int[] is, final int[] is_45_, int i, int i_46_, int i_47_, int i_48_, final int i_49_, final int i_50_, final int i_51_, final int i_52_, final int i_53_, final int i_54_) {
		final int i_55_ = i_46_;
		for (int i_56_ = -i_51_; i_56_ < 0; i_56_++) {
			final int i_57_ = (i_47_ >> 16) * i_54_;
			for (int i_58_ = -i_50_; i_58_ < 0; i_58_++) {
				i = is_45_[(i_46_ >> 16) + i_57_];
				if (i != 0) {
					is[i_48_++] = i;
				} else {
					i_48_++;
				}
				i_46_ += i_52_;
			}
			i_47_ += i_53_;
			i_46_ = i_55_;
			i_48_ += i_49_;
		}
	}

	public void method_r_void(int i, int i_59_, final int i_60_, final int i_61_) {
		i += field_y_682;
		i_59_ += field_e_680;
		int i_62_ = i + (i_59_ * width);
		int i_63_ = 0;
		int i_64_ = field_z_685;
		int i_65_ = field_d_679;
		int i_66_ = width - i_65_;
		int i_67_ = 0;
		if (i_59_ < field_r_512) {
			final int i_68_ = field_r_512 - i_59_;
			i_64_ -= i_68_;
			i_59_ = field_r_512;
			i_63_ += i_68_ * i_65_;
			i_62_ += i_68_ * width;
		}
		if ((i_59_ + i_64_) > field_j_513) {
			i_64_ -= (i_59_ + i_64_) - field_j_513;
		}
		if (i < field_s_514) {
			final int i_69_ = field_s_514 - i;
			i_65_ -= i_69_;
			i = field_s_514;
			i_63_ += i_69_;
			i_62_ += i_69_;
			i_67_ += i_69_;
			i_66_ += i_69_;
		}
		if ((i + i_65_) > field_v_509) {
			final int i_70_ = (i + i_65_) - field_v_509;
			i_65_ -= i_70_;
			i_67_ += i_70_;
			i_66_ += i_70_;
		}
		if ((i_65_ > 0) && (i_64_ > 0)) {
			method_j_void(pixels, field_n_681, 0, i_63_, i_62_, i_65_, i_64_, i_66_, i_67_, i_60_, i_61_);
		}
	}

	public void rasterize(int i, int i_71_) {
		i += field_y_682;
		i_71_ += field_e_680;
		int i_72_ = i + (i_71_ * width);
		int i_73_ = 0;
		int i_74_ = field_z_685;
		int i_75_ = field_d_679;
		int i_76_ = width - i_75_;
		int i_77_ = 0;
		if (i_71_ < field_r_512) {
			final int i_78_ = field_r_512 - i_71_;
			i_74_ -= i_78_;
			i_71_ = field_r_512;
			i_73_ += i_78_ * i_75_;
			i_72_ += i_78_ * width;
		}
		if ((i_71_ + i_74_) > field_j_513) {
			i_74_ -= (i_71_ + i_74_) - field_j_513;
		}
		if (i < field_s_514) {
			final int i_79_ = field_s_514 - i;
			i_75_ -= i_79_;
			i = field_s_514;
			i_73_ += i_79_;
			i_72_ += i_79_;
			i_77_ += i_79_;
			i_76_ += i_79_;
		}
		if ((i + i_75_) > field_v_509) {
			final int i_80_ = (i + i_75_) - field_v_509;
			i_75_ -= i_80_;
			i_77_ += i_80_;
			i_76_ += i_80_;
		}
		if ((i_75_ > 0) && (i_74_ > 0)) {
			method_q_void(pixels, field_n_681, 0, i_73_, i_72_, i_75_, i_74_, i_76_, i_77_);
		}
	}

	static void method_v_void(final int[] is, final int[] is_81_, int i, int i_82_, int i_83_, final int i_84_, final int i_85_, final int i_86_, final int i_87_, final int i_88_) {
		final int i_89_ = 256 - i_88_;
		for (int i_90_ = -i_85_; i_90_ < 0; i_90_++) {
			for (int i_91_ = -i_84_; i_91_ < 0; i_91_++) {
				i = is_81_[i_82_++];
				if (i != 0) {
					final int i_92_ = is[i_83_];
					is[i_83_++] = (((((i & 0xff00ff) * i_88_) + ((i_92_ & 0xff00ff) * i_89_)) & ~0xff00ff) + ((((i & 0xff00) * i_88_) + ((i_92_ & 0xff00) * i_89_)) & 0xff0000)) >> 8;
				} else {
					i_83_++;
				}
			}
			i_83_ += i_86_;
			i_82_ += i_87_;
		}
	}

	public void method_c_void(int i, int i_93_, int i_94_, int i_95_, final int i_96_) {
		if ((i_94_ > 0) && (i_95_ > 0)) {
			final int i_97_ = field_d_679;
			final int i_98_ = field_z_685;
			int i_99_ = 0;
			int i_100_ = 0;
			final int i_101_ = field_g_683;
			final int i_102_ = field_f_678;
			final int i_103_ = (i_101_ << 16) / i_94_;
			final int i_104_ = (i_102_ << 16) / i_95_;
			if (field_y_682 > 0) {
				final int i_105_ = (((field_y_682 << 16) + i_103_) - 1) / i_103_;
				i += i_105_;
				i_99_ += (i_105_ * i_103_) - (field_y_682 << 16);
			}
			if (field_e_680 > 0) {
				final int i_106_ = (((field_e_680 << 16) + i_104_) - 1) / i_104_;
				i_93_ += i_106_;
				i_100_ += (i_106_ * i_104_) - (field_e_680 << 16);
			}
			if (i_97_ < i_101_) {
				i_94_ = ((((i_97_ << 16) - i_99_) + i_103_) - 1) / i_103_;
			}
			if (i_98_ < i_102_) {
				i_95_ = ((((i_98_ << 16) - i_100_) + i_104_) - 1) / i_104_;
			}
			int i_107_ = i + (i_93_ * width);
			int i_108_ = width - i_94_;
			if ((i_93_ + i_95_) > field_j_513) {
				i_95_ -= (i_93_ + i_95_) - field_j_513;
			}
			if (i_93_ < field_r_512) {
				final int i_109_ = field_r_512 - i_93_;
				i_95_ -= i_109_;
				i_107_ += i_109_ * width;
				i_100_ += i_104_ * i_109_;
			}
			if ((i + i_94_) > field_v_509) {
				final int i_110_ = (i + i_94_) - field_v_509;
				i_94_ -= i_110_;
				i_108_ += i_110_;
			}
			if (i < field_s_514) {
				final int i_111_ = field_s_514 - i;
				i_94_ -= i_111_;
				i_107_ += i_111_;
				i_99_ += i_103_ * i_111_;
				i_108_ += i_111_;
			}
			method_p_void(pixels, field_n_681, 0, i_99_, i_100_, i_107_, i_108_, i_94_, i_95_, i_103_, i_104_, i_97_, i_96_);
		}
	}

	static void method_p_void(final int[] is, final int[] is_112_, int i, int i_113_, int i_114_, int i_115_, final int i_116_, final int i_117_, final int i_118_, final int i_119_, final int i_120_, final int i_121_, final int i_122_) {
		final int i_123_ = 256 - i_122_;
		final int i_124_ = i_113_;
		for (int i_125_ = -i_118_; i_125_ < 0; i_125_++) {
			final int i_126_ = (i_114_ >> 16) * i_121_;
			for (int i_127_ = -i_117_; i_127_ < 0; i_127_++) {
				i = is_112_[(i_113_ >> 16) + i_126_];
				if (i != 0) {
					final int i_128_ = is[i_115_];
					is[i_115_++] = (((((i & 0xff00ff) * i_122_) + ((i_128_ & 0xff00ff) * i_123_)) & ~0xff00ff) + ((((i & 0xff00) * i_122_) + ((i_128_ & 0xff00) * i_123_)) & 0xff0000)) >> 8;
				} else {
					i_115_++;
				}
				i_113_ += i_119_;
			}
			i_114_ += i_120_;
			i_113_ = i_124_;
			i_115_ += i_116_;
		}
	}

	public void method_o_void(final int i, final int i_129_, final int i_130_, final int i_131_, final int i_132_, final int i_133_, final int[] is, final int[] is_134_) {
		final int i_135_ = i_129_ < 0 ? -i_129_ : 0;
		final int i_136_ = (i_129_ + field_z_685) <= i_133_ ? field_z_685 : i_133_ - i_129_;
		final int i_137_ = i < 0 ? -i : 0;
		if ((i + field_d_679) <= i_132_) {
		} else {
		}
		int i_140_ = i_130_ + i + i_137_ + ((i_131_ + i_129_ + i_135_) * width);
		int i_141_ = i_129_ + i_135_;
		for (int i_142_ = i_135_; i_142_ < i_136_; i_142_++) {
			final int i_143_ = is[i_141_];
			final int i_144_ = is_134_[i_141_++];
			int i_145_ = i_140_;
			int i_146_;
			if (i < i_143_) {
				i_146_ = i_143_ - i;
				i_145_ = i_140_ + (i_146_ - i_137_);
			} else {
				i_146_ = i_137_;
			}
			int i_147_;
			if ((i + field_d_679) <= (i_143_ + i_144_)) {
				i_147_ = field_d_679;
			} else {
				i_147_ = (i_143_ + i_144_) - i;
			}
			for (int i_148_ = i_146_; i_148_ < i_147_; i_148_++) {
				final int i_149_ = field_n_681[i_148_ + (i_142_ * field_d_679)];
				if (i_149_ != 0) {
					pixels[i_145_++] = i_149_;
				} else {
					i_145_++;
				}
			}
			i_140_ += width;
		}
	}

	public void method_t_void(int i, int i_150_, final int i_151_, final int i_152_, final int i_153_, final int i_154_, final double d, final int i_155_) {
		try {
			final int i_156_ = -i_151_ / 2;
			final int i_157_ = -i_152_ / 2;
			int i_158_ = (int) (Math.sin(d) * 65536.0);
			int i_159_ = (int) (Math.cos(d) * 65536.0);
			i_158_ = (i_158_ * i_155_) >> 8;
			i_159_ = (i_159_ * i_155_) >> 8;
			int i_160_ = (i_153_ << 16) + (i_157_ * i_158_) + (i_156_ * i_159_);
			int i_161_ = (i_154_ << 16) + ((i_157_ * i_159_) - (i_156_ * i_158_));
			int i_162_ = i + (i_150_ * width);
			for (i_150_ = 0; i_150_ < i_152_; i_150_++) {
				int i_163_ = i_162_;
				int i_164_ = i_160_;
				int i_165_ = i_161_;
				for (i = -i_151_; i < 0; i++) {
					final int i_166_ = (field_n_681[(i_164_ >> 16) + ((i_165_ >> 16) * field_d_679)]);
					if (i_166_ != 0) {
						pixels[i_163_++] = i_166_;
					} else {
						i_163_++;
					}
					i_164_ += i_159_;
					i_165_ -= i_158_;
				}
				i_160_ += i_158_;
				i_161_ += i_159_;
				i_162_ += width;
			}
		} catch (final Exception exception) {
			/* empty */
		}
	}

	void method_i_void(int i, int i_167_, final int i_168_, final int i_169_, final int i_170_, final int i_171_) {
		if (i_171_ != 0) {
			i -= field_y_682 << 4;
			i_167_ -= field_e_680 << 4;
			final double d = (i_170_ & 0xffff) * 9.587379924285257E-5;
			final int i_172_ = (int) Math.floor((Math.sin(d) * i_171_) + 0.5);
			final int i_173_ = (int) Math.floor((Math.cos(d) * i_171_) + 0.5);
			final int i_174_ = (-i * i_173_) + (-i_167_ * i_172_);
			final int i_175_ = (--i * i_172_) + (-i_167_ * i_173_);
			final int i_176_ = (((field_d_679 << 4) - i) * i_173_) + (-i_167_ * i_172_);
			final int i_177_ = (-((field_d_679 << 4) - i) * i_172_) + (-i_167_ * i_173_);
			final int i_178_ = (-i * i_173_) + (((field_z_685 << 4) - i_167_) * i_172_);
			final int i_179_ = (--i * i_172_) + (((field_z_685 << 4) - i_167_) * i_173_);
			final int i_180_ = ((((field_d_679 << 4) - i) * i_173_) + (((field_z_685 << 4) - i_167_) * i_172_));
			final int i_181_ = ((-((field_d_679 << 4) - i) * i_172_) + (((field_z_685 << 4) - i_167_) * i_173_));
			int i_182_;
			int i_183_;
			if (i_174_ < i_176_) {
				i_182_ = i_174_;
				i_183_ = i_176_;
			} else {
				i_182_ = i_176_;
				i_183_ = i_174_;
			}
			if (i_178_ < i_182_) {
				i_182_ = i_178_;
			}
			if (i_180_ < i_182_) {
				i_182_ = i_180_;
			}
			if (i_178_ > i_183_) {
				i_183_ = i_178_;
			}
			if (i_180_ > i_183_) {
				i_183_ = i_180_;
			}
			int i_184_;
			int i_185_;
			if (i_175_ < i_177_) {
				i_184_ = i_175_;
				i_185_ = i_177_;
			} else {
				i_184_ = i_177_;
				i_185_ = i_175_;
			}
			if (i_179_ < i_184_) {
				i_184_ = i_179_;
			}
			if (i_181_ < i_184_) {
				i_184_ = i_181_;
			}
			if (i_179_ > i_185_) {
				i_185_ = i_179_;
			}
			if (i_181_ > i_185_) {
				i_185_ = i_181_;
			}
			i_182_ >>= 12;
			i_183_ = (i_183_ + 4095) >> 12;
			i_184_ >>= 12;
			i_185_ = (i_185_ + 4095) >> 12;
			i_182_ += i_168_;
			i_183_ += i_168_;
			i_184_ += i_169_;
			i_185_ += i_169_;
			i_182_ >>= 4;
			i_183_ = (i_183_ + 15) >> 4;
			i_184_ >>= 4;
			i_185_ = (i_185_ + 15) >> 4;
			if (i_182_ < field_s_514) {
				i_182_ = field_s_514;
			}
			if (i_183_ > field_v_509) {
				i_183_ = field_v_509;
			}
			if (i_184_ < field_r_512) {
				i_184_ = field_r_512;
			}
			if (i_185_ > field_j_513) {
				i_185_ = field_j_513;
			}
			i_183_ = i_182_ - i_183_;
			if (i_183_ < 0) {
				i_185_ = i_184_ - i_185_;
				if (i_185_ < 0) {
					int i_186_ = (i_184_ * width) + i_182_;
					final double d_187_ = 1.6777216E7 / i_171_;
					final int i_188_ = (int) Math.floor((Math.sin(d) * d_187_) + 0.5);
					final int i_189_ = (int) Math.floor((Math.cos(d) * d_187_) + 0.5);
					final int i_190_ = ((i_182_ << 4) + 8) - i_168_;
					final int i_191_ = ((i_184_ << 4) + 8) - i_169_;
					int i_192_ = (i << 8) - ((i_191_ * i_188_) >> 4);
					int i_193_ = (i_167_ << 8) + ((i_191_ * i_189_) >> 4);
					if (i_189_ == 0) {
						if (i_188_ == 0) {
							int i_194_ = i_185_;
							while (i_194_ < 0) {
								int i_195_ = i_186_;
								final int i_196_ = i_192_;
								final int i_197_ = i_193_;
								int i_198_ = i_183_;
								if ((i_192_ >= 0) && (i_193_ >= 0) && ((i_192_ - (field_d_679 << 12)) < 0) && ((i_193_ - (field_z_685 << 12)) < 0)) {
									for (/**/; i_198_ < 0; i_198_++) {
										final int i_199_ = (field_n_681[(((i_197_ >> 12) * field_d_679) + (i_196_ >> 12))]);
										if (i_199_ != 0) {
											pixels[i_195_++] = i_199_;
										} else {
											i_195_++;
										}
									}
								}
								i_194_++;
								i_186_ += width;
							}
						} else if (i_188_ < 0) {
							int i_200_ = i_185_;
							while (i_200_ < 0) {
								int i_201_ = i_186_;
								final int i_202_ = i_192_;
								int i_203_ = i_193_ + ((i_190_ * i_188_) >> 4);
								int i_204_ = i_183_;
								if ((i_192_ >= 0) && ((i_192_ - (field_d_679 << 12)) < 0)) {
									int i_205_;
									if ((i_205_ = i_203_ - (field_z_685 << 12)) >= 0) {
										i_205_ = (i_188_ - i_205_) / i_188_;
										i_204_ = i_183_ + i_205_;
										i_203_ += i_188_ * i_205_;
										i_201_ = i_186_ + i_205_;
									}
									if ((i_205_ = (i_203_ - i_188_) / i_188_) > i_204_) {
										i_204_ = i_205_;
									}
									for (/**/; i_204_ < 0; i_204_++) {
										final int i_206_ = (field_n_681[(((i_203_ >> 12) * field_d_679) + (i_202_ >> 12))]);
										if (i_206_ != 0) {
											pixels[i_201_++] = i_206_;
										} else {
											i_201_++;
										}
										i_203_ += i_188_;
									}
								}
								i_200_++;
								i_192_ -= i_188_;
								i_186_ += width;
							}
						} else {
							int i_207_ = i_185_;
							while (i_207_ < 0) {
								int i_208_ = i_186_;
								final int i_209_ = i_192_;
								int i_210_ = i_193_ + ((i_190_ * i_188_) >> 4);
								int i_211_ = i_183_;
								if ((i_192_ >= 0) && ((i_192_ - (field_d_679 << 12)) < 0)) {
									if (i_210_ < 0) {
										final int i_212_ = (i_188_ - 1 - i_210_) / i_188_;
										i_211_ = i_183_ + i_212_;
										i_210_ += i_188_ * i_212_;
										i_208_ = i_186_ + i_212_;
									}
									int i_213_;
									if ((i_213_ = ((1 + i_210_) - (field_z_685 << 12) - i_188_) / i_188_) > i_211_) {
										i_211_ = i_213_;
									}
									for (/**/; i_211_ < 0; i_211_++) {
										final int i_214_ = (field_n_681[(((i_210_ >> 12) * field_d_679) + (i_209_ >> 12))]);
										if (i_214_ != 0) {
											pixels[i_208_++] = i_214_;
										} else {
											i_208_++;
										}
										i_210_ += i_188_;
									}
								}
								i_207_++;
								i_192_ -= i_188_;
								i_186_ += width;
							}
						}
					} else if (i_189_ < 0) {
						if (i_188_ == 0) {
							int i_215_ = i_185_;
							while (i_215_ < 0) {
								int i_216_ = i_186_;
								int i_217_ = i_192_ + ((i_190_ * i_189_) >> 4);
								final int i_218_ = i_193_;
								int i_219_ = i_183_;
								if ((i_193_ >= 0) && ((i_193_ - (field_z_685 << 12)) < 0)) {
									int i_220_;
									if ((i_220_ = i_217_ - (field_d_679 << 12)) >= 0) {
										i_220_ = (i_189_ - i_220_) / i_189_;
										i_219_ = i_183_ + i_220_;
										i_217_ += i_189_ * i_220_;
										i_216_ = i_186_ + i_220_;
									}
									if ((i_220_ = (i_217_ - i_189_) / i_189_) > i_219_) {
										i_219_ = i_220_;
									}
									for (/**/; i_219_ < 0; i_219_++) {
										final int i_221_ = (field_n_681[(((i_218_ >> 12) * field_d_679) + (i_217_ >> 12))]);
										if (i_221_ != 0) {
											pixels[i_216_++] = i_221_;
										} else {
											i_216_++;
										}
										i_217_ += i_189_;
									}
								}
								i_215_++;
								i_193_ += i_189_;
								i_186_ += width;
							}
						} else if (i_188_ < 0) {
							int i_222_ = i_185_;
							while (i_222_ < 0) {
								int i_223_ = i_186_;
								int i_224_ = i_192_ + ((i_190_ * i_189_) >> 4);
								int i_225_ = i_193_ + ((i_190_ * i_188_) >> 4);
								int i_226_ = i_183_;
								int i_227_;
								if ((i_227_ = i_224_ - (field_d_679 << 12)) >= 0) {
									i_227_ = (i_189_ - i_227_) / i_189_;
									i_226_ = i_183_ + i_227_;
									i_224_ += i_189_ * i_227_;
									i_225_ += i_188_ * i_227_;
									i_223_ = i_186_ + i_227_;
								}
								if ((i_227_ = (i_224_ - i_189_) / i_189_) > i_226_) {
									i_226_ = i_227_;
								}
								if ((i_227_ = i_225_ - (field_z_685 << 12)) >= 0) {
									i_227_ = (i_188_ - i_227_) / i_188_;
									i_226_ += i_227_;
									i_224_ += i_189_ * i_227_;
									i_225_ += i_188_ * i_227_;
									i_223_ += i_227_;
								}
								if ((i_227_ = (i_225_ - i_188_) / i_188_) > i_226_) {
									i_226_ = i_227_;
								}
								for (/**/; i_226_ < 0; i_226_++) {
									final int i_228_ = (field_n_681[(((i_225_ >> 12) * field_d_679) + (i_224_ >> 12))]);
									if (i_228_ != 0) {
										pixels[i_223_++] = i_228_;
									} else {
										i_223_++;
									}
									i_224_ += i_189_;
									i_225_ += i_188_;
								}
								i_222_++;
								i_192_ -= i_188_;
								i_193_ += i_189_;
								i_186_ += width;
							}
						} else {
							int i_229_ = i_185_;
							while (i_229_ < 0) {
								int i_230_ = i_186_;
								int i_231_ = i_192_ + ((i_190_ * i_189_) >> 4);
								int i_232_ = i_193_ + ((i_190_ * i_188_) >> 4);
								int i_233_ = i_183_;
								int i_234_;
								if ((i_234_ = i_231_ - (field_d_679 << 12)) >= 0) {
									i_234_ = (i_189_ - i_234_) / i_189_;
									i_233_ = i_183_ + i_234_;
									i_231_ += i_189_ * i_234_;
									i_232_ += i_188_ * i_234_;
									i_230_ = i_186_ + i_234_;
								}
								if ((i_234_ = (i_231_ - i_189_) / i_189_) > i_233_) {
									i_233_ = i_234_;
								}
								if (i_232_ < 0) {
									i_234_ = (i_188_ - 1 - i_232_) / i_188_;
									i_233_ += i_234_;
									i_231_ += i_189_ * i_234_;
									i_232_ += i_188_ * i_234_;
									i_230_ += i_234_;
								}
								if ((i_234_ = ((1 + i_232_) - (field_z_685 << 12) - i_188_) / i_188_) > i_233_) {
									i_233_ = i_234_;
								}
								for (/**/; i_233_ < 0; i_233_++) {
									final int i_235_ = (field_n_681[(((i_232_ >> 12) * field_d_679) + (i_231_ >> 12))]);
									if (i_235_ != 0) {
										pixels[i_230_++] = i_235_;
									} else {
										i_230_++;
									}
									i_231_ += i_189_;
									i_232_ += i_188_;
								}
								i_229_++;
								i_192_ -= i_188_;
								i_193_ += i_189_;
								i_186_ += width;
							}
						}
					} else if (i_188_ == 0) {
						int i_236_ = i_185_;
						while (i_236_ < 0) {
							int i_237_ = i_186_;
							int i_238_ = i_192_ + ((i_190_ * i_189_) >> 4);
							final int i_239_ = i_193_;
							int i_240_ = i_183_;
							if ((i_193_ >= 0) && ((i_193_ - (field_z_685 << 12)) < 0)) {
								if (i_238_ < 0) {
									final int i_241_ = (i_189_ - 1 - i_238_) / i_189_;
									i_240_ = i_183_ + i_241_;
									i_238_ += i_189_ * i_241_;
									i_237_ = i_186_ + i_241_;
								}
								int i_242_;
								if ((i_242_ = ((1 + i_238_) - (field_d_679 << 12) - i_189_) / i_189_) > i_240_) {
									i_240_ = i_242_;
								}
								for (/**/; i_240_ < 0; i_240_++) {
									final int i_243_ = (field_n_681[(((i_239_ >> 12) * field_d_679) + (i_238_ >> 12))]);
									if (i_243_ != 0) {
										pixels[i_237_++] = i_243_;
									} else {
										i_237_++;
									}
									i_238_ += i_189_;
								}
							}
							i_236_++;
							i_193_ += i_189_;
							i_186_ += width;
						}
					} else if (i_188_ < 0) {
						int i_244_ = i_185_;
						while (i_244_ < 0) {
							int i_245_ = i_186_;
							int i_246_ = i_192_ + ((i_190_ * i_189_) >> 4);
							int i_247_ = i_193_ + ((i_190_ * i_188_) >> 4);
							int i_248_ = i_183_;
							if (i_246_ < 0) {
								final int i_249_ = (i_189_ - 1 - i_246_) / i_189_;
								i_248_ = i_183_ + i_249_;
								i_246_ += i_189_ * i_249_;
								i_247_ += i_188_ * i_249_;
								i_245_ = i_186_ + i_249_;
							}
							int i_250_;
							if ((i_250_ = ((1 + i_246_) - (field_d_679 << 12) - i_189_) / i_189_) > i_248_) {
								i_248_ = i_250_;
							}
							if ((i_250_ = i_247_ - (field_z_685 << 12)) >= 0) {
								i_250_ = (i_188_ - i_250_) / i_188_;
								i_248_ += i_250_;
								i_246_ += i_189_ * i_250_;
								i_247_ += i_188_ * i_250_;
								i_245_ += i_250_;
							}
							if ((i_250_ = (i_247_ - i_188_) / i_188_) > i_248_) {
								i_248_ = i_250_;
							}
							for (/**/; i_248_ < 0; i_248_++) {
								final int i_251_ = field_n_681[(((i_247_ >> 12) * field_d_679) + (i_246_ >> 12))];
								if (i_251_ != 0) {
									pixels[i_245_++] = i_251_;
								} else {
									i_245_++;
								}
								i_246_ += i_189_;
								i_247_ += i_188_;
							}
							i_244_++;
							i_192_ -= i_188_;
							i_193_ += i_189_;
							i_186_ += width;
						}
					} else {
						int i_252_ = i_185_;
						while (i_252_ < 0) {
							int i_253_ = i_186_;
							int i_254_ = i_192_ + ((i_190_ * i_189_) >> 4);
							int i_255_ = i_193_ + ((i_190_ * i_188_) >> 4);
							int i_256_ = i_183_;
							if (i_254_ < 0) {
								final int i_257_ = (i_189_ - 1 - i_254_) / i_189_;
								i_256_ = i_183_ + i_257_;
								i_254_ += i_189_ * i_257_;
								i_255_ += i_188_ * i_257_;
								i_253_ = i_186_ + i_257_;
							}
							int i_258_;
							if ((i_258_ = ((1 + i_254_) - (field_d_679 << 12) - i_189_) / i_189_) > i_256_) {
								i_256_ = i_258_;
							}
							if (i_255_ < 0) {
								i_258_ = (i_188_ - 1 - i_255_) / i_188_;
								i_256_ += i_258_;
								i_254_ += i_189_ * i_258_;
								i_255_ += i_188_ * i_258_;
								i_253_ += i_258_;
							}
							if ((i_258_ = ((1 + i_255_) - (field_z_685 << 12) - i_188_) / i_188_) > i_256_) {
								i_256_ = i_258_;
							}
							for (/**/; i_256_ < 0; i_256_++) {
								final int i_259_ = field_n_681[(((i_255_ >> 12) * field_d_679) + (i_254_ >> 12))];
								if (i_259_ != 0) {
									pixels[i_253_++] = i_259_;
								} else {
									i_253_++;
								}
								i_254_ += i_189_;
								i_255_ += i_188_;
							}
							i_252_++;
							i_192_ -= i_188_;
							i_193_ += i_189_;
							i_186_ += width;
						}
					}
				}
			}
		}
	}

	public void method_m_void(final int i) {
		final int[] is = new int[field_d_679 * field_z_685];
		int i_260_ = 0;
		for (int i_261_ = 0; i_261_ < field_z_685; i_261_++) {
			for (int i_262_ = 0; i_262_ < field_d_679; i_262_++) {
				int i_263_ = field_n_681[i_260_];
				if (i_263_ == 0) {
					if ((i_262_ > 0) && (field_n_681[i_260_ - 1] != 0)) {
						i_263_ = i;
					} else if ((i_261_ > 0) && (field_n_681[i_260_ - field_d_679] != 0)) {
						i_263_ = i;
					} else if ((i_262_ < (field_d_679 - 1)) && (field_n_681[i_260_ + 1] != 0)) {
						i_263_ = i;
					} else if ((i_261_ < (field_z_685 - 1)) && (field_n_681[i_260_ + field_d_679] != 0)) {
						i_263_ = i;
					}
				}
				is[i_260_++] = i_263_;
			}
		}
		field_n_681 = is;
	}

	public Rasterizer2D method_n_bx() {
		final Rasterizer2D class_bx_264_ = new Rasterizer2D(field_d_679, field_z_685);
		class_bx_264_.field_g_683 = field_g_683;
		class_bx_264_.field_f_678 = field_f_678;
		class_bx_264_.field_y_682 = field_g_683 - field_d_679 - field_y_682;
		class_bx_264_.field_e_680 = field_e_680;
		for (int i = 0; i < field_z_685; i++) {
			for (int i_265_ = 0; i_265_ < field_d_679; i_265_++) {
				class_bx_264_.field_n_681[(i * field_d_679) + i_265_] = field_n_681[((i * field_d_679) + field_d_679) - 1 - i_265_];
			}
		}
		return class_bx_264_;
	}

	public void method_k_void(int i, int i_266_, int i_267_, int i_268_) {
		if ((i_267_ > 0) && (i_268_ > 0)) {
			final int i_269_ = field_d_679;
			final int i_270_ = field_z_685;
			int i_271_ = 0;
			int i_272_ = 0;
			final int i_273_ = field_g_683;
			final int i_274_ = field_f_678;
			final int i_275_ = (i_273_ << 16) / i_267_;
			final int i_276_ = (i_274_ << 16) / i_268_;
			if (field_y_682 > 0) {
				final int i_277_ = (((field_y_682 << 16) + i_275_) - 1) / i_275_;
				i += i_277_;
				i_271_ += (i_277_ * i_275_) - (field_y_682 << 16);
			}
			if (field_e_680 > 0) {
				final int i_278_ = (((field_e_680 << 16) + i_276_) - 1) / i_276_;
				i_266_ += i_278_;
				i_272_ += (i_278_ * i_276_) - (field_e_680 << 16);
			}
			if (i_269_ < i_273_) {
				i_267_ = ((((i_269_ << 16) - i_271_) + i_275_) - 1) / i_275_;
			}
			if (i_270_ < i_274_) {
				i_268_ = ((((i_270_ << 16) - i_272_) + i_276_) - 1) / i_276_;
			}
			int i_279_ = i + (i_266_ * width);
			int i_280_ = width - i_267_;
			if ((i_266_ + i_268_) > field_j_513) {
				i_268_ -= (i_266_ + i_268_) - field_j_513;
			}
			if (i_266_ < field_r_512) {
				final int i_281_ = field_r_512 - i_266_;
				i_268_ -= i_281_;
				i_279_ += i_281_ * width;
				i_272_ += i_276_ * i_281_;
			}
			if ((i + i_267_) > field_v_509) {
				final int i_282_ = (i + i_267_) - field_v_509;
				i_267_ -= i_282_;
				i_280_ += i_282_;
			}
			if (i < field_s_514) {
				final int i_283_ = field_s_514 - i;
				i_267_ -= i_283_;
				i_279_ += i_283_;
				i_271_ += i_275_ * i_283_;
				i_280_ += i_283_;
			}
			method_x_void(pixels, field_n_681, 0, i_271_, i_272_, i_279_, i_280_, i_267_, i_268_, i_275_, i_276_, i_269_);
		}
	}

	public void method_b_void(int i, int i_284_, final int i_285_, final int i_286_, final int i_287_, final int i_288_, final int i_289_, final int i_290_, final int[] is, final int[] is_291_) {
		try {
			final int i_292_ = -i_285_ / 2;
			final int i_293_ = -i_286_ / 2;
			int i_294_ = (int) (Math.sin(i_289_ / 326.11) * 65536.0);
			int i_295_ = (int) (Math.cos(i_289_ / 326.11) * 65536.0);
			i_294_ = (i_294_ * i_290_) >> 8;
			i_295_ = (i_295_ * i_290_) >> 8;
			int i_296_ = (i_287_ << 16) + (i_293_ * i_294_) + (i_292_ * i_295_);
			int i_297_ = (i_288_ << 16) + ((i_293_ * i_295_) - (i_292_ * i_294_));
			int i_298_ = i + (i_284_ * width);
			for (i_284_ = 0; i_284_ < i_286_; i_284_++) {
				final int i_299_ = is[i_284_];
				int i_300_ = i_298_ + i_299_;
				int i_301_ = i_296_ + (i_295_ * i_299_);
				int i_302_ = i_297_ - (i_294_ * i_299_);
				for (i = -is_291_[i_284_]; i < 0; i++) {
					pixels[i_300_++] = (field_n_681[(i_301_ >> 16) + ((i_302_ >> 16) * field_d_679)]);
					i_301_ += i_295_;
					i_302_ -= i_294_;
				}
				i_296_ += i_294_;
				i_297_ += i_295_;
				i_298_ += width;
			}
		} catch (final Exception exception) {
			/* empty */
		}
	}

	public void method_w_void(final int i, final int i_303_, final int i_304_, final int i_305_) {
		method_i_void(field_g_683 << 3, field_f_678 << 3, i << 4, i_303_ << 4, i_304_, i_305_);
	}

	public Rasterizer2D(final byte[] is, final Component component) {
		try {
			final Image image = Toolkit.getDefaultToolkit().createImage(is);
			final MediaTracker mediatracker = new MediaTracker(component);
			mediatracker.addImage(image, 0);
			mediatracker.waitForAll();
			field_d_679 = image.getWidth(component);
			field_z_685 = image.getHeight(component);
			field_g_683 = field_d_679;
			field_f_678 = field_z_685;
			field_y_682 = 0;
			field_e_680 = 0;
			field_n_681 = new int[field_d_679 * field_z_685];
			final PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, field_d_679, field_z_685, field_n_681, 0, field_d_679);
			pixelgrabber.grabPixels();
		} catch (final InterruptedException interruptedexception) {
			/* empty */
		}
	}

	public void method_e_void(final int i) {
		if ((field_d_679 != field_g_683) || (field_z_685 != field_f_678)) {
			int i_306_ = i;
			if (i > field_y_682) {
				i_306_ = field_y_682;
			}
			int i_307_ = i;
			if ((i + field_y_682 + field_d_679) > field_g_683) {
				i_307_ = field_g_683 - field_y_682 - field_d_679;
			}
			int i_308_ = i;
			if (i > field_e_680) {
				i_308_ = field_e_680;
			}
			int i_309_ = i;
			if ((i + field_e_680 + field_z_685) > field_f_678) {
				i_309_ = field_f_678 - field_e_680 - field_z_685;
			}
			final int i_310_ = field_d_679 + i_306_ + i_307_;
			final int i_311_ = field_z_685 + i_308_ + i_309_;
			final int[] is = new int[i_310_ * i_311_];
			for (int i_312_ = 0; i_312_ < field_z_685; i_312_++) {
				for (int i_313_ = 0; i_313_ < field_d_679; i_313_++) {
					is[((i_312_ + i_308_) * i_310_) + i_313_ + i_306_] = field_n_681[(i_312_ * field_d_679) + i_313_];
				}
			}
			field_n_681 = is;
			field_d_679 = i_310_;
			field_z_685 = i_311_;
			field_y_682 -= i_306_;
			field_e_680 -= i_308_;
		}
	}

	public void method_s_void(int i, int i_314_, final int i_315_) {
		i += field_y_682;
		i_314_ += field_e_680;
		int i_316_ = i + (i_314_ * width);
		int i_317_ = 0;
		int i_318_ = field_z_685;
		int i_319_ = field_d_679;
		int i_320_ = width - i_319_;
		int i_321_ = 0;
		if (i_314_ < field_r_512) {
			final int i_322_ = field_r_512 - i_314_;
			i_318_ -= i_322_;
			i_314_ = field_r_512;
			i_317_ += i_322_ * i_319_;
			i_316_ += i_322_ * width;
		}
		if ((i_314_ + i_318_) > field_j_513) {
			i_318_ -= (i_314_ + i_318_) - field_j_513;
		}
		if (i < field_s_514) {
			final int i_323_ = field_s_514 - i;
			i_319_ -= i_323_;
			i = field_s_514;
			i_317_ += i_323_;
			i_316_ += i_323_;
			i_321_ += i_323_;
			i_320_ += i_323_;
		}
		if ((i + i_319_) > field_v_509) {
			final int i_324_ = (i + i_319_) - field_v_509;
			i_319_ -= i_324_;
			i_321_ += i_324_;
			i_320_ += i_324_;
		}
		if ((i_319_ > 0) && (i_318_ > 0)) {
			method_v_void(pixels, field_n_681, 0, i_317_, i_316_, i_319_, i_318_, i_320_, i_321_, i_315_);
		}
	}

	static void method_j_void(final int[] is, final int[] is_325_, int i, int i_326_, int i_327_, final int i_328_, final int i_329_, final int i_330_, final int i_331_, final int i_332_, int i_333_) {
		final int i_334_ = 256 - i_332_;
		int i_335_ = ((i_333_ & 0xff00ff) * i_334_) & ~0xff00ff;
		int i_336_ = ((i_333_ & 0xff00) * i_334_) & 0xff0000;
		i_333_ = (i_335_ | i_336_) >>> 8;
		for (int i_337_ = -i_329_; i_337_ < 0; i_337_++) {
			for (int i_338_ = -i_328_; i_338_ < 0; i_338_++) {
				i = is_325_[i_326_++];
				if (i != 0) {
					i_335_ = ((i & 0xff00ff) * i_332_) & ~0xff00ff;
					i_336_ = ((i & 0xff00) * i_332_) & 0xff0000;
					is[i_327_++] = ((i_335_ | i_336_) >>> 8) + i_333_;
				} else {
					i_327_++;
				}
			}
			i_327_ += i_330_;
			i_326_ += i_331_;
		}
	}
}
