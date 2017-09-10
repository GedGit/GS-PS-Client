/* Class_bc - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Rasterizer extends CacheableNode {
	protected static int field_v_509 = 0;
	public static int width;
	public static int height;
	public static int field_r_512 = 0;
	public static int field_j_513 = 0;
	protected static int field_s_514 = 0;
	public static int[] pixels;

	public static void method_cc_void(final int i, final int i_0_, final int i_1_, final int i_2_) {
		if (field_s_514 < i) {
			field_s_514 = i;
		}
		if (field_r_512 < i_0_) {
			field_r_512 = i_0_;
		}
		if (field_v_509 > i_1_) {
			field_v_509 = i_1_;
		}
		if (field_j_513 > i_2_) {
			field_j_513 = i_2_;
		}
	}

	public static void method_ca_void(final int[] is) {
		is[0] = field_s_514;
		is[1] = field_r_512;
		is[2] = field_v_509;
		is[3] = field_j_513;
	}

	public static void method_cv_void(final int[] is) {
		field_s_514 = is[0];
		field_r_512 = is[1];
		field_v_509 = is[2];
		field_j_513 = is[3];
	}

	public static void fillAlphaRect(int drawX, int drawY, int boxWidth, int boxHeight, int color, final int alpha) {
		if (drawX < field_s_514) {
			boxWidth -= field_s_514 - drawX;
			drawX = field_s_514;
		}
		if (drawY < field_r_512) {
			boxHeight -= field_r_512 - drawY;
			drawY = field_r_512;
		}
		if ((drawX + boxWidth) > field_v_509) {
			boxWidth = field_v_509 - drawX;
		}
		if ((drawY + boxHeight) > field_j_513) {
			boxHeight = field_j_513 - drawY;
		}
		color = (((((color & 0xff00ff) * alpha) >> 8) & 0xff00ff) + ((((color & 0xff00) * alpha) >> 8) & 0xff00));
		final int i_8_ = 256 - alpha;
		final int i_9_ = width - boxWidth;
		int i_10_ = drawX + (drawY * width);
		for (int i_11_ = 0; i_11_ < boxHeight; i_11_++) {
			for (int i_12_ = -boxWidth; i_12_ < 0; i_12_++) {
				int i_13_ = pixels[i_10_];
				i_13_ = (((((i_13_ & 0xff00ff) * i_8_) >> 8) & 0xff00ff) + ((((i_13_ & 0xff00) * i_8_) >> 8) & 0xff00));
				pixels[i_10_++] = color + i_13_;
			}
			i_10_ += i_9_;
		}
	}

	public static void fillRect(int drawX, int drawY, int boxWidth, int boxHeight, final int color) {
		if (drawX < field_s_514) {
			boxWidth -= field_s_514 - drawX;
			drawX = field_s_514;
		}
		if (drawY < field_r_512) {
			boxHeight -= field_r_512 - drawY;
			drawY = field_r_512;
		}
		if ((drawX + boxWidth) > field_v_509) {
			boxWidth = field_v_509 - drawX;
		}
		if ((drawY + boxHeight) > field_j_513) {
			boxHeight = field_j_513 - drawY;
		}
		final int i_18_ = width - boxWidth;
		int i_19_ = drawX + (drawY * width);
		for (int i_20_ = -boxHeight; i_20_ < 0; i_20_++) {
			for (int i_21_ = -boxWidth; i_21_ < 0; i_21_++) {
				pixels[i_19_++] = color;
			}
			i_19_ += i_18_;
		}
	}

	public static void method_cm_void(int i, int i_22_, int i_23_, int i_24_, final int i_25_, final int i_26_) {
		int i_27_ = 0;
		final int i_28_ = 65536 / i_24_;
		if (i < field_s_514) {
			i_23_ -= field_s_514 - i;
			i = field_s_514;
		}
		if (i_22_ < field_r_512) {
			i_27_ += (field_r_512 - i_22_) * i_28_;
			i_24_ -= field_r_512 - i_22_;
			i_22_ = field_r_512;
		}
		if ((i + i_23_) > field_v_509) {
			i_23_ = field_v_509 - i;
		}
		if ((i_22_ + i_24_) > field_j_513) {
			i_24_ = field_j_513 - i_22_;
		}
		final int i_29_ = width - i_23_;
		int i_30_ = i + (i_22_ * width);
		for (int i_31_ = -i_24_; i_31_ < 0; i_31_++) {
			final int i_32_ = (65536 - i_27_) >> 8;
		final int i_33_ = i_27_ >> 8;
		final int i_34_ = ((((((i_25_ & 0xff00ff) * i_32_) + ((i_26_ & 0xff00ff) * i_33_)) & ~0xff00ff) + ((((i_25_ & 0xff00) * i_32_) + ((i_26_ & 0xff00) * i_33_)) & 0xff0000)) >>> 8);
		for (int i_35_ = -i_23_; i_35_ < 0; i_35_++) {
			pixels[i_30_++] = i_34_;
		}
		i_30_ += i_29_;
		i_27_ += i_28_;
		}
	}

	public static void drawRect(final int x, final int y, final int width, final int height, final int color) {
		drawHorizontalLine(x, y, width, color);
		drawHorizontalLine(x, (y + height) - 1, width, color);
		drawVerticalLine(x, y, height, color);
		drawVerticalLine((x + width) - 1, y, height, color);
	}

	public static void method_ci_void(final int i, final int i_40_, final int i_41_, final int i_42_, final int i_43_, final int i_44_) {
		method_cg_void(i, i_40_, i_41_, i_43_, i_44_);
		method_cg_void(i, (i_40_ + i_42_) - 1, i_41_, i_43_, i_44_);
		if (i_42_ >= 3) {
			method_ck_void(i, i_40_ + 1, i_42_ - 2, i_43_, i_44_);
			method_ck_void((i + i_41_) - 1, i_40_ + 1, i_42_ - 2, i_43_, i_44_);
		}
	}

	public static void init(final int[] is, final int i, final int i_45_) {
		pixels = is;
		width = i;
		height = i_45_;
		method_ce_void(0, 0, i, i_45_);
	}

	static void method_cg_void(int i, final int i_46_, int i_47_, final int i_48_, final int i_49_) {
		if ((i_46_ >= field_r_512) && (i_46_ < field_j_513)) {
			if (i < field_s_514) {
				i_47_ -= field_s_514 - i;
				i = field_s_514;
			}
			if ((i + i_47_) > field_v_509) {
				i_47_ = field_v_509 - i;
			}
			final int i_50_ = 256 - i_49_;
			final int i_51_ = ((i_48_ >> 16) & 0xff) * i_49_;
			final int i_52_ = ((i_48_ >> 8) & 0xff) * i_49_;
			final int i_53_ = (i_48_ & 0xff) * i_49_;
			int i_54_ = i + (i_46_ * width);
			for (int i_55_ = 0; i_55_ < i_47_; i_55_++) {
				final int i_56_ = ((pixels[i_54_] >> 16) & 0xff) * i_50_;
				final int i_57_ = ((pixels[i_54_] >> 8) & 0xff) * i_50_;
				final int i_58_ = (pixels[i_54_] & 0xff) * i_50_;
				final int i_59_ = ((((i_51_ + i_56_) >> 8) << 16) + (((i_52_ + i_57_) >> 8) << 8) + ((i_53_ + i_58_) >> 8));
				pixels[i_54_++] = i_59_;
			}
		}
	}

	static void method_ck_void(final int i, int i_60_, int i_61_, final int i_62_, final int i_63_) {
		if ((i >= field_s_514) && (i < field_v_509)) {
			if (i_60_ < field_r_512) {
				i_61_ -= field_r_512 - i_60_;
				i_60_ = field_r_512;
			}
			if ((i_60_ + i_61_) > field_j_513) {
				i_61_ = field_j_513 - i_60_;
			}
			final int i_64_ = 256 - i_63_;
			final int i_65_ = ((i_62_ >> 16) & 0xff) * i_63_;
			final int i_66_ = ((i_62_ >> 8) & 0xff) * i_63_;
			final int i_67_ = (i_62_ & 0xff) * i_63_;
			int i_68_ = i + (i_60_ * width);
			for (int i_69_ = 0; i_69_ < i_61_; i_69_++) {
				final int i_70_ = ((pixels[i_68_] >> 16) & 0xff) * i_64_;
				final int i_71_ = ((pixels[i_68_] >> 8) & 0xff) * i_64_;
				final int i_72_ = (pixels[i_68_] & 0xff) * i_64_;
				final int i_73_ = ((((i_65_ + i_70_) >> 8) << 16) + (((i_66_ + i_71_) >> 8) << 8) + ((i_67_ + i_72_) >> 8));
				pixels[i_68_] = i_73_;
				i_68_ += width;
			}
		}
	}

	public static void method_cl_void(int i, int i_74_, int i_75_, int i_76_, final int i_77_) {
		i_75_ -= i;
		i_76_ -= i_74_;
		if (i_76_ == 0) {
			if (i_75_ >= 0) {
				drawHorizontalLine(i, i_74_, i_75_ + 1, i_77_);
			} else {
				drawHorizontalLine(i + i_75_, i_74_, -i_75_ + 1, i_77_);
			}
		} else if (i_75_ == 0) {
			if (i_76_ >= 0) {
				drawVerticalLine(i, i_74_, i_76_ + 1, i_77_);
			} else {
				drawVerticalLine(i, i_74_ + i_76_, -i_76_ + 1, i_77_);
			}
		} else {
			if ((i_75_ + i_76_) < 0) {
				i += i_75_;
				i_75_ = -i_75_;
				i_74_ += i_76_;
				i_76_ = -i_76_;
			}
			if (i_75_ > i_76_) {
				i_74_ <<= 16;
				i_74_ += 32768;
				i_76_ <<= 16;
				final int i_78_ = (int) Math.floor(((double) i_76_ / (double) i_75_) + 0.5);
				i_75_ += i;
				if (i < field_s_514) {
					i_74_ += i_78_ * (field_s_514 - i);
					i = field_s_514;
				}
				if (i_75_ >= field_v_509) {
					i_75_ = field_v_509 - 1;
				}
				for (/**/; i <= i_75_; i++) {
					final int i_79_ = i_74_ >> 16;
				if ((i_79_ >= field_r_512) && (i_79_ < field_j_513)) {
					pixels[i + (i_79_ * width)] = i_77_;
				}
				i_74_ += i_78_;
				}
			} else {
				i <<= 16;
				i += 32768;
				i_75_ <<= 16;
				final int i_80_ = (int) Math.floor(((double) i_75_ / (double) i_76_) + 0.5);
				i_76_ += i_74_;
				if (i_74_ < field_r_512) {
					i += i_80_ * (field_r_512 - i_74_);
					i_74_ = field_r_512;
				}
				if (i_76_ >= field_j_513) {
					i_76_ = field_j_513 - 1;
				}
				for (/**/; i_74_ <= i_76_; i_74_++) {
					final int i_81_ = i >> 16;
				if ((i_81_ >= field_s_514) && (i_81_ < field_v_509)) {
					pixels[i_81_ + (i_74_ * width)] = i_77_;
				}
				i += i_80_;
				}
			}
		}
	}

	public static void method_cs_void(int i, int i_82_, final int i_83_, final int[] is, final int[] is_84_) {
		int i_85_ = i + (i_82_ * width);
		for (i_82_ = 0; i_82_ < is.length; i_82_++) {
			int i_86_ = i_85_ + is[i_82_];
			for (i = -is_84_[i_82_]; i < 0; i++) {
				pixels[i_86_++] = i_83_;
			}
			i_85_ += width;
		}
	}

	public static void drawVerticalLine(final int i, int i_87_, int i_88_, final int i_89_) {
		if ((i >= field_s_514) && (i < field_v_509)) {
			if (i_87_ < field_r_512) {
				i_88_ -= field_r_512 - i_87_;
				i_87_ = field_r_512;
			}
			if ((i_87_ + i_88_) > field_j_513) {
				i_88_ = field_j_513 - i_87_;
			}
			final int i_90_ = i + (i_87_ * width);
			for (int i_91_ = 0; i_91_ < i_88_; i_91_++) {
				pixels[i_90_ + (i_91_ * width)] = i_89_;
			}
		}
	}

	protected Rasterizer() {
		/* empty */
	}

	public static void method_ch_void() {
		int i = 0;
		int i_92_ = (width * height) - 7;
		while (i < i_92_) {
			pixels[i++] = 0;
			pixels[i++] = 0;
			pixels[i++] = 0;
			pixels[i++] = 0;
			pixels[i++] = 0;
			pixels[i++] = 0;
			pixels[i++] = 0;
			pixels[i++] = 0;
		}
		i_92_ += 7;
		while (i < i_92_) {
			pixels[i++] = 0;
		}
	}

	public static void drawHorizontalLine(int i, final int i_93_, int i_94_, final int i_95_) {
		if ((i_93_ >= field_r_512) && (i_93_ < field_j_513)) {
			if (i < field_s_514) {
				i_94_ -= field_s_514 - i;
				i = field_s_514;
			}
			if ((i + i_94_) > field_v_509) {
				i_94_ = field_v_509 - i;
			}
			final int i_96_ = i + (i_93_ * width);
			for (int i_97_ = 0; i_97_ < i_94_; i_97_++) {
				pixels[i_96_ + i_97_] = i_95_;
			}
		}
	}

	public static void method_ce_void(int i, int i_98_, int i_99_, int i_100_) {
		if (i < 0) {
			i = 0;
		}
		if (i_98_ < 0) {
			i_98_ = 0;
		}
		if (i_99_ > width) {
			i_99_ = width;
		}
		if (i_100_ > height) {
			i_100_ = height;
		}
		field_s_514 = i;
		field_r_512 = i_98_;
		field_v_509 = i_99_;
		field_j_513 = i_100_;
	}

	public static void method_cf_void() {
		field_s_514 = 0;
		field_r_512 = 0;
		field_v_509 = width;
		field_j_513 = height;
	}
}
