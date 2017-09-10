/* OnScreenModel - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 *
 */
//
public class Model extends Renderable {
	int[] field_t_864;
	static byte[] field_d_865 = new byte[1];
	int[] vertexY;
	static byte[] field_y_867 = new byte[1];
	int verticeCount = 0;
	int[] vertexX;
	static Model field_z_870 = new Model();
	int field_ax_871;
	int triangleCount = 0;
	int[] triangleA;
	int[] triangleB;
	int[] triangleC;
	static int[] field_an_876 = new int[4096];
	int[] triangleColors;
	int[] texMapY;
	byte[] texMapZ;
	static boolean[] field_ao_880 = new boolean[4096];
	static final int field_ai_881 = 1600;
	static int[] field_bp_882 = Rasterizer3D.field_ax_1155;
	byte field_c_883 = 0;
	public static boolean field_bm_884 = false;
	static int[] field_ap_885 = new int[12];
	int[] field_b_886;
	static int[] field_aw_887 = new int[4096];
	int[][] field_w_888;
	int[][] field_i_889;
	short[] field_v_890;
	int field_ak_891;
	int[] texMapX;
	public boolean field_ad_893 = false;
	int field_al_894;
	int field_ar_895;
	static final int field_as_896 = 4096;
	static boolean[] field_ab_897 = new boolean[4096];
	int[] field_o_898;
	int field_p_899 = 0;
	static int[] field_az_900 = new int[4096];
	static int[] field_aj_901 = new int[2000];
	static int[] field_aa_902 = new int[4096];
	public static int field_bj_903 = 0;
	int field_ae_904;
	int[] vertexZ;
	static int[] field_ah_906 = new int[1600];
	static int[][] field_aq_907 = new int[1600][512];
	static int[] field_ay_908 = new int[12];
	byte[] field_j_909;
	static int[][] field_am_910 = new int[12][2000];
	static int[] field_ag_911 = new int[2000];
	public static int[] field_bd_912 = new int[1000];
	static int[] field_af_913 = new int[10];
	byte[] field_s_914;
	static int[] field_av_915 = new int[10];
	static int field_bs_916;
	static int field_bo_917;
	static int field_bw_918;
	static int[] field_au_919 = new int[10];
	static int[] field_at_920 = new int[4096];
	public static int field_ba_921 = 0;
	public static int field_br_922 = 0;
	static int[] field_ac_923 = new int[4096];
	static int[] field_bn_924 = Rasterizer3D.SINE;
	static int[] field_bu_925 = Rasterizer3D.COSINE;
	static int[] field_bq_926 = Rasterizer3D.field_ad_1156;
	static Model field_n_927 = new Model();
	static final int field_bt_928 = 50;
	static final int field_bz_929 = 3500;

	public Model method_n_cg(final int[][] is, final int i, final int i_0_, final int i_1_, final boolean bool, final int i_2_) {
		method_m_void();
		int i_3_ = i - this.field_ax_871;
		int i_4_ = i + this.field_ax_871;
		int i_5_ = i_1_ - this.field_ax_871;
		int i_6_ = i_1_ + this.field_ax_871;
		if ((i_3_ >= 0) && (((i_4_ + 128) >> 7) < is.length) && (i_5_ >= 0) && (((i_6_ + 128) >> 7) < is[0].length)) {
			i_3_ >>= 7;
		i_4_ = (i_4_ + 127) >> 7;
		i_5_ >>= 7;
		i_6_ = (i_6_ + 127) >> 7;
		if ((is[i_3_][i_5_] == i_0_) && (is[i_4_][i_5_] == i_0_) && (is[i_3_][i_6_] == i_0_) && (is[i_4_][i_6_] == i_0_)) {
			return this;
		}
		Model onscreenmodel_7_;
		if (bool) {
			onscreenmodel_7_ = new Model();
			onscreenmodel_7_.verticeCount = this.verticeCount;
			onscreenmodel_7_.triangleCount = this.triangleCount;
			onscreenmodel_7_.field_p_899 = this.field_p_899;
			onscreenmodel_7_.vertexX = this.vertexX;
			onscreenmodel_7_.vertexY = this.vertexY;
			onscreenmodel_7_.triangleA = this.triangleA;
			onscreenmodel_7_.triangleB = this.triangleB;
			onscreenmodel_7_.triangleC = this.triangleC;
			onscreenmodel_7_.triangleColors = this.triangleColors;
			onscreenmodel_7_.texMapX = this.texMapX;
			onscreenmodel_7_.texMapY = this.texMapY;
			onscreenmodel_7_.texMapZ = this.texMapZ;
			onscreenmodel_7_.field_j_909 = this.field_j_909;
			onscreenmodel_7_.field_s_914 = this.field_s_914;
			onscreenmodel_7_.field_v_890 = this.field_v_890;
			onscreenmodel_7_.field_c_883 = this.field_c_883;
			onscreenmodel_7_.field_o_898 = this.field_o_898;
			onscreenmodel_7_.field_b_886 = this.field_b_886;
			onscreenmodel_7_.field_t_864 = this.field_t_864;
			onscreenmodel_7_.field_w_888 = this.field_w_888;
			onscreenmodel_7_.field_i_889 = this.field_i_889;
			onscreenmodel_7_.field_ad_893 = field_ad_893;
			onscreenmodel_7_.vertexZ = new int[onscreenmodel_7_.verticeCount];
		} else {
			onscreenmodel_7_ = this;
		}
		if (i_2_ == 0) {
			for (int i_8_ = 0; i_8_ < onscreenmodel_7_.verticeCount; i_8_++) {
				final int i_9_ = this.vertexX[i_8_] + i;
				final int i_10_ = this.vertexY[i_8_] + i_1_;
				final int i_11_ = i_9_ & 0x7f;
				final int i_12_ = i_10_ & 0x7f;
				final int i_13_ = i_9_ >> 7;
			final int i_14_ = i_10_ >> 7;
			final int i_15_ = (((is[i_13_][i_14_] * (128 - i_11_)) + (is[i_13_ + 1][i_14_] * i_11_)) >> 7);
			final int i_16_ = (((is[i_13_][i_14_ + 1] * (128 - i_11_)) + (is[i_13_ + 1][i_14_ + 1] * i_11_)) >> 7);
			final int i_17_ = ((i_15_ * (128 - i_12_)) + (i_16_ * i_12_)) >> 7;
			onscreenmodel_7_.vertexZ[i_8_] = (this.vertexZ[i_8_] + i_17_) - i_0_;
			}
		} else {
			for (int i_18_ = 0; i_18_ < onscreenmodel_7_.verticeCount; i_18_++) {
				final int i_19_ = ((-this.vertexZ[i_18_] << 16) / (modelHeight * -1707560315));
				if (i_19_ < i_2_) {
					final int i_20_ = this.vertexX[i_18_] + i;
					final int i_21_ = this.vertexY[i_18_] + i_1_;
					final int i_22_ = i_20_ & 0x7f;
					final int i_23_ = i_21_ & 0x7f;
					final int i_24_ = i_20_ >> 7;
				final int i_25_ = i_21_ >> 7;
				final int i_26_ = (((is[i_24_][i_25_] * (128 - i_22_)) + (is[i_24_ + 1][i_25_] * i_22_)) >> 7);
				final int i_27_ = (((is[i_24_][i_25_ + 1] * (128 - i_22_)) + (is[i_24_ + 1][i_25_ + 1] * i_22_)) >> 7);
				final int i_28_ = ((i_26_ * (128 - i_23_)) + (i_27_ * i_23_)) >> 7;
				onscreenmodel_7_.vertexZ[i_18_] = (this.vertexZ[i_18_] + (((i_28_ - i_0_) * (i_2_ - i_19_)) / i_2_));
				}
			}
		}
		onscreenmodel_7_.field_ak_891 = 0;
		return onscreenmodel_7_;
		}
		return this;
	}

	public void method_s_void(final int i, final int i_29_, final int i_30_) {
		for (int i_31_ = 0; i_31_ < this.verticeCount; i_31_++) {
			this.vertexX[i_31_] += i;
			this.vertexZ[i_31_] += i_29_;
			this.vertexY[i_31_] += i_30_;
		}
		this.field_ak_891 = 0;
	}

	Model method_e_cg(final boolean bool, final Model onscreenmodel_32_, final byte[] is) {
		onscreenmodel_32_.verticeCount = this.verticeCount;
		onscreenmodel_32_.triangleCount = this.triangleCount;
		onscreenmodel_32_.field_p_899 = this.field_p_899;
		if ((onscreenmodel_32_.vertexX == null) || (onscreenmodel_32_.vertexX.length < this.verticeCount)) {
			onscreenmodel_32_.vertexX = new int[this.verticeCount + 100];
			onscreenmodel_32_.vertexZ = new int[this.verticeCount + 100];
			onscreenmodel_32_.vertexY = new int[this.verticeCount + 100];
		}
		for (int i = 0; i < this.verticeCount; i++) {
			onscreenmodel_32_.vertexX[i] = this.vertexX[i];
			onscreenmodel_32_.vertexZ[i] = this.vertexZ[i];
			onscreenmodel_32_.vertexY[i] = this.vertexY[i];
		}
		if (bool) {
			onscreenmodel_32_.field_j_909 = this.field_j_909;
		} else {
			onscreenmodel_32_.field_j_909 = is;
			if (this.field_j_909 == null) {
				for (int i = 0; i < this.triangleCount; i++) {
					onscreenmodel_32_.field_j_909[i] = (byte) 0;
				}
			} else {
				for (int i = 0; i < this.triangleCount; i++) {
					onscreenmodel_32_.field_j_909[i] = this.field_j_909[i];
				}
			}
		}
		onscreenmodel_32_.triangleA = this.triangleA;
		onscreenmodel_32_.triangleB = this.triangleB;
		onscreenmodel_32_.triangleC = this.triangleC;
		onscreenmodel_32_.triangleColors = this.triangleColors;
		onscreenmodel_32_.texMapX = this.texMapX;
		onscreenmodel_32_.texMapY = this.texMapY;
		onscreenmodel_32_.texMapZ = this.texMapZ;
		onscreenmodel_32_.field_s_914 = this.field_s_914;
		onscreenmodel_32_.field_v_890 = this.field_v_890;
		onscreenmodel_32_.field_c_883 = this.field_c_883;
		onscreenmodel_32_.field_o_898 = this.field_o_898;
		onscreenmodel_32_.field_b_886 = this.field_b_886;
		onscreenmodel_32_.field_t_864 = this.field_t_864;
		onscreenmodel_32_.field_w_888 = this.field_w_888;
		onscreenmodel_32_.field_i_889 = this.field_i_889;
		onscreenmodel_32_.field_ad_893 = field_ad_893;
		onscreenmodel_32_.field_ak_891 = 0;
		return onscreenmodel_32_;
	}

	public void method_m_void() {
		if (this.field_ak_891 != 1) {
			this.field_ak_891 = 1;
			modelHeight = 0;
			this.field_ae_904 = 0;
			this.field_ax_871 = 0;
			for (int i = 0; i < this.verticeCount; i++) {
				final int i_33_ = this.vertexX[i];
				final int i_34_ = this.vertexZ[i];
				final int i_35_ = this.vertexY[i];
				if (-i_34_ > (modelHeight * -1707560315)) {
					modelHeight = -i_34_ * -891980211;
				}
				if (i_34_ > this.field_ae_904) {
					this.field_ae_904 = i_34_;
				}
				final int i_36_ = (i_33_ * i_33_) + (i_35_ * i_35_);
				if (i_36_ > this.field_ax_871) {
					this.field_ax_871 = i_36_;
				}
			}
			this.field_ax_871 = (int) (Math.sqrt(this.field_ax_871) + 0.99);
			this.field_ar_895 = (int) (Math.sqrt(((this.field_ax_871) * (this.field_ax_871)) + (modelHeight * -1707560315 * modelHeight * -1707560315)) + 0.99);
			this.field_al_894 = (this.field_ar_895 + (int) (Math.sqrt(((this.field_ax_871) * (this.field_ax_871)) + ((this.field_ae_904) * (this.field_ae_904))) + 0.99));
		}
	}

	void method_a_void() {
		if (this.field_ak_891 != 2) {
			this.field_ak_891 = 2;
			this.field_ax_871 = 0;
			for (int i = 0; i < this.verticeCount; i++) {
				final int i_37_ = this.vertexX[i];
				final int i_38_ = this.vertexZ[i];
				final int i_39_ = this.vertexY[i];
				final int i_40_ = (i_37_ * i_37_) + (i_39_ * i_39_) + (i_38_ * i_38_);
				if (i_40_ > this.field_ax_871) {
					this.field_ax_871 = i_40_;
				}
			}
			this.field_ax_871 = (int) (Math.sqrt(this.field_ax_871) + 0.99);
			this.field_ar_895 = this.field_ax_871;
			this.field_al_894 = (this.field_ax_871 + this.field_ax_871);
		}
	}

	public int method_h_int() {
		method_m_void();
		return this.field_ax_871;
	}

	public void method_u_void(final Class_ci class_ci, final int i, final Class_ci class_ci_41_, final int i_42_, final int[] is) {
		if (i != -1) {
			if ((is != null) && (i_42_ != -1)) {
				final Skeleton class_cu = class_ci.skeletons[i];
				final Skeleton class_cu_43_ = class_ci_41_.skeletons[i_42_];
				final WidgetNode class_cd = class_cu.field_e_1344;
				field_bs_916 = 0;
				field_bo_917 = 0;
				field_bw_918 = 0;
				int i_44_ = 0;
				int i_45_ = i_44_ + 1;
				int i_46_ = is[i_44_];
				for (int i_47_ = 0; i_47_ < class_cu.field_g_1346; i_47_++) {
					int i_48_;
					for (i_48_ = class_cu.field_f_1341[i_47_]; i_48_ > i_46_; i_46_ = is[i_45_++]) {
						/* empty */
					}
					if ((i_48_ != i_46_) || (class_cd.field_z_801[i_48_] == 0)) {
						method_q_void(class_cd.field_z_801[i_48_], class_cd.field_y_799[i_48_], class_cu.field_m_1348[i_47_], class_cu.field_a_1345[i_47_], class_cu.field_h_1349[i_47_]);
					}
				}
				field_bs_916 = 0;
				field_bo_917 = 0;
				field_bw_918 = 0;
				i_44_ = 0;
				i_45_ = i_44_ + 1;
				i_46_ = is[i_44_];
				for (int i_49_ = 0; i_49_ < class_cu_43_.field_g_1346; i_49_++) {
					int i_50_;
					for (i_50_ = class_cu_43_.field_f_1341[i_49_]; i_50_ > i_46_; i_46_ = is[i_45_++]) {
						/* empty */
					}
					if ((i_50_ == i_46_) || (class_cd.field_z_801[i_50_] == 0)) {
						method_q_void(class_cd.field_z_801[i_50_], class_cd.field_y_799[i_50_], class_cu_43_.field_m_1348[i_49_], class_cu_43_.field_a_1345[i_49_], class_cu_43_.field_h_1349[i_49_]);
					}
				}
				this.field_ak_891 = 0;
			} else {
				method_l_void(class_ci, i);
			}
		}
	}

	void method_q_void(final int i, final int[] is, final int i_51_, final int i_52_, final int i_53_) {
		final int i_54_ = is.length;
		if (i == 0) {
			int i_55_ = 0;
			field_bs_916 = 0;
			field_bo_917 = 0;
			field_bw_918 = 0;
			for (int i_56_ = 0; i_56_ < i_54_; i_56_++) {
				final int i_57_ = is[i_56_];
				if (i_57_ < this.field_w_888.length) {
					final int[] is_58_ = this.field_w_888[i_57_];
					for (final int i_60_ : is_58_) {
						field_bs_916 += this.vertexX[i_60_];
						field_bo_917 += this.vertexZ[i_60_];
						field_bw_918 += this.vertexY[i_60_];
						i_55_++;
					}
				}
			}
			if (i_55_ > 0) {
				field_bs_916 = (field_bs_916 / i_55_) + i_51_;
				field_bo_917 = (field_bo_917 / i_55_) + i_52_;
				field_bw_918 = (field_bw_918 / i_55_) + i_53_;
			} else {
				field_bs_916 = i_51_;
				field_bo_917 = i_52_;
				field_bw_918 = i_53_;
			}
		} else if (i == 1) {
			for (int i_61_ = 0; i_61_ < i_54_; i_61_++) {
				final int i_62_ = is[i_61_];
				if (i_62_ < this.field_w_888.length) {
					final int[] is_63_ = this.field_w_888[i_62_];
					for (final int element : is_63_) {
						final int i_65_ = element;
						this.vertexX[i_65_] += i_51_;
						this.vertexZ[i_65_] += i_52_;
						this.vertexY[i_65_] += i_53_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_66_ = 0; i_66_ < i_54_; i_66_++) {
				final int i_67_ = is[i_66_];
				if (i_67_ < this.field_w_888.length) {
					final int[] is_68_ = this.field_w_888[i_67_];
					for (final int element : is_68_) {
						final int i_70_ = element;
						this.vertexX[i_70_] -= field_bs_916;
						this.vertexZ[i_70_] -= field_bo_917;
						this.vertexY[i_70_] -= field_bw_918;
						final int i_71_ = (i_51_ & 0xff) * 8;
						final int i_72_ = (i_52_ & 0xff) * 8;
						final int i_73_ = (i_53_ & 0xff) * 8;
						if (i_73_ != 0) {
							final int i_74_ = field_bn_924[i_73_];
							final int i_75_ = field_bu_925[i_73_];
							final int i_76_ = (((this.vertexZ[i_70_] * i_74_) + (this.vertexX[i_70_] * i_75_)) >> 16);
							this.vertexZ[i_70_] = ((this.vertexZ[i_70_] * i_75_) - (this.vertexX[i_70_] * i_74_)) >> 16;
				this.vertexX[i_70_] = i_76_;
						}
						if (i_71_ != 0) {
							final int i_77_ = field_bn_924[i_71_];
							final int i_78_ = field_bu_925[i_71_];
							final int i_79_ = (((this.vertexZ[i_70_] * i_78_) - (this.vertexY[i_70_] * i_77_)) >> 16);
							this.vertexY[i_70_] = ((this.vertexZ[i_70_] * i_77_) + (this.vertexY[i_70_] * i_78_)) >> 16;
		this.vertexZ[i_70_] = i_79_;
						}
						if (i_72_ != 0) {
							final int i_80_ = field_bn_924[i_72_];
							final int i_81_ = field_bu_925[i_72_];
							final int i_82_ = (((this.vertexY[i_70_] * i_80_) + (this.vertexX[i_70_] * i_81_)) >> 16);
							this.vertexY[i_70_] = ((this.vertexY[i_70_] * i_81_) - (this.vertexX[i_70_] * i_80_)) >> 16;
							this.vertexX[i_70_] = i_82_;
						}
						this.vertexX[i_70_] += field_bs_916;
						this.vertexZ[i_70_] += field_bo_917;
						this.vertexY[i_70_] += field_bw_918;
					}
				}
			}
		} else if (i == 3) {
			for (int i_83_ = 0; i_83_ < i_54_; i_83_++) {
				final int i_84_ = is[i_83_];
				if (i_84_ < this.field_w_888.length) {
					final int[] is_85_ = this.field_w_888[i_84_];
					for (final int element : is_85_) {
						final int i_87_ = element;
						this.vertexX[i_87_] -= field_bs_916;
						this.vertexZ[i_87_] -= field_bo_917;
						this.vertexY[i_87_] -= field_bw_918;
						this.vertexX[i_87_] = ((this.vertexX[i_87_] * i_51_) / 128);
						this.vertexZ[i_87_] = ((this.vertexZ[i_87_] * i_52_) / 128);
						this.vertexY[i_87_] = ((this.vertexY[i_87_] * i_53_) / 128);
						this.vertexX[i_87_] += field_bs_916;
						this.vertexZ[i_87_] += field_bo_917;
						this.vertexY[i_87_] += field_bw_918;
					}
				}
			}
		} else if ((i == 5) && (this.field_i_889 != null) && (this.field_j_909 != null)) {
			for (int i_88_ = 0; i_88_ < i_54_; i_88_++) {
				final int i_89_ = is[i_88_];
				if (i_89_ < this.field_i_889.length) {
					final int[] is_90_ = this.field_i_889[i_89_];
					for (final int element : is_90_) {
						final int i_92_ = element;
						int i_93_ = ((this.field_j_909[i_92_] & 0xff) + (i_51_ * 8));
						if (i_93_ < 0) {
							i_93_ = 0;
						} else if (i_93_ > 255) {
							i_93_ = 255;
						}
						this.field_j_909[i_92_] = (byte) i_93_;
					}
				}
			}
		}
	}

	public void method_k_void() {
		for (int i = 0; i < this.verticeCount; i++) {
			final int i_94_ = this.vertexX[i];
			this.vertexX[i] = this.vertexY[i];
			this.vertexY[i] = -i_94_;
		}
		this.field_ak_891 = 0;
	}

	public void method_x_void() {
		for (int i = 0; i < this.verticeCount; i++) {
			this.vertexX[i] = -this.vertexX[i];
			this.vertexY[i] = -this.vertexY[i];
		}
		this.field_ak_891 = 0;
	}

	public void method_j_void(final int i) {
		final int i_95_ = field_bn_924[i];
		final int i_96_ = field_bu_925[i];
		for (int i_97_ = 0; i_97_ < this.verticeCount; i_97_++) {
			final int i_98_ = (((this.vertexZ[i_97_] * i_96_) - (this.vertexY[i_97_] * i_95_)) >> 16);
			this.vertexY[i_97_] = ((this.vertexZ[i_97_] * i_95_) + (this.vertexY[i_97_] * i_96_)) >> 16;
		this.vertexZ[i_97_] = i_98_;
		}
		this.field_ak_891 = 0;
	}

	public void method_r_void() {
		for (int i = 0; i < this.verticeCount; i++) {
			final int i_99_ = this.vertexY[i];
			this.vertexY[i] = this.vertexX[i];
			this.vertexX[i] = -i_99_;
		}
		this.field_ak_891 = 0;
	}

	public void method_v_void(final int i, final int i_100_, final int i_101_) {
		for (int i_102_ = 0; i_102_ < this.verticeCount; i_102_++) {
			this.vertexX[i_102_] = (this.vertexX[i_102_] * i) / 128;
			this.vertexZ[i_102_] = (this.vertexZ[i_102_] * i_100_) / 128;
			this.vertexY[i_102_] = (this.vertexY[i_102_] * i_101_) / 128;
		}
		this.field_ak_891 = 0;
	}

	public final void method_c_void(final int i, final int i_103_, final int i_104_, final int i_105_, final int i_106_, final int i_107_, final int i_108_) {
		field_ah_906[0] = -1;
		if ((this.field_ak_891 != 2) && (this.field_ak_891 != 1)) {
			method_a_void();
		}
		final int i_109_ = Rasterizer3D.field_l_1147;
		final int i_110_ = Rasterizer3D.field_u_1148;
		final int i_111_ = field_bn_924[i];
		final int i_112_ = field_bu_925[i];
		final int i_113_ = field_bn_924[i_103_];
		final int i_114_ = field_bu_925[i_103_];
		final int i_115_ = field_bn_924[i_104_];
		final int i_116_ = field_bu_925[i_104_];
		final int i_117_ = field_bn_924[i_105_];
		final int i_118_ = field_bu_925[i_105_];
		final int i_119_ = ((i_107_ * i_117_) + (i_108_ * i_118_)) >> 16;
		for (int i_120_ = 0; i_120_ < this.verticeCount; i_120_++) {
			int i_121_ = this.vertexX[i_120_];
			int i_122_ = this.vertexZ[i_120_];
			int i_123_ = this.vertexY[i_120_];
			if (i_104_ != 0) {
				final int i_124_ = ((i_122_ * i_115_) + (i_121_ * i_116_)) >> 16;
		i_122_ = ((i_122_ * i_116_) - (i_121_ * i_115_)) >> 16;
				i_121_ = i_124_;
			}
			if (i != 0) {
				final int i_125_ = ((i_122_ * i_112_) - (i_123_ * i_111_)) >> 16;
				i_123_ = ((i_122_ * i_111_) + (i_123_ * i_112_)) >> 16;
				i_122_ = i_125_;
			}
			if (i_103_ != 0) {
				final int i_126_ = ((i_123_ * i_113_) + (i_121_ * i_114_)) >> 16;
				i_123_ = ((i_123_ * i_114_) - (i_121_ * i_113_)) >> 16;
				i_121_ = i_126_;
			}
			i_121_ += i_106_;
			i_122_ += i_107_;
			i_123_ += i_108_;
			final int i_127_ = ((i_122_ * i_118_) - (i_123_ * i_117_)) >> 16;
			i_123_ = ((i_122_ * i_117_) + (i_123_ * i_118_)) >> 16;
			field_at_920[i_120_] = i_123_ - i_119_;
			field_ac_923[i_120_] = i_109_ + ((i_121_ * Rasterizer3D.field_h_1146) / i_123_);
			field_az_900[i_120_] = i_110_ + ((i_127_ * Rasterizer3D.field_h_1146) / i_123_);
			if (this.field_p_899 > 0) {
				field_aa_902[i_120_] = i_121_;
				field_an_876[i_120_] = i_127_;
				field_aw_887[i_120_] = i_123_;
			}
		}
		try {
			method_w_void(false, false, 0);
		} catch (final Exception exception) {
			/* empty */
		}
	}

	public final void method_p_void(final int i, final int i_128_, final int i_129_, final int i_130_, final int i_131_, final int i_132_, final int i_133_, final int i_134_) {
		field_ah_906[0] = -1;
		if ((this.field_ak_891 != 2) && (this.field_ak_891 != 1)) {
			method_a_void();
		}
		final int i_135_ = Rasterizer3D.field_l_1147;
		final int i_136_ = Rasterizer3D.field_u_1148;
		final int i_137_ = field_bn_924[i];
		final int i_138_ = field_bu_925[i];
		final int i_139_ = field_bn_924[i_128_];
		final int i_140_ = field_bu_925[i_128_];
		final int i_141_ = field_bn_924[i_129_];
		final int i_142_ = field_bu_925[i_129_];
		final int i_143_ = field_bn_924[i_130_];
		final int i_144_ = field_bu_925[i_130_];
		final int i_145_ = ((i_132_ * i_143_) + (i_133_ * i_144_)) >> 16;
		for (int i_146_ = 0; i_146_ < this.verticeCount; i_146_++) {
			int i_147_ = this.vertexX[i_146_];
			int i_148_ = this.vertexZ[i_146_];
			int i_149_ = this.vertexY[i_146_];
			if (i_129_ != 0) {
				final int i_150_ = ((i_148_ * i_141_) + (i_147_ * i_142_)) >> 16;
		i_148_ = ((i_148_ * i_142_) - (i_147_ * i_141_)) >> 16;
		i_147_ = i_150_;
			}
			if (i != 0) {
				final int i_151_ = ((i_148_ * i_138_) - (i_149_ * i_137_)) >> 16;
				i_149_ = ((i_148_ * i_137_) + (i_149_ * i_138_)) >> 16;
				i_148_ = i_151_;
			}
			if (i_128_ != 0) {
				final int i_152_ = ((i_149_ * i_139_) + (i_147_ * i_140_)) >> 16;
				i_149_ = ((i_149_ * i_140_) - (i_147_ * i_139_)) >> 16;
				i_147_ = i_152_;
			}
			i_147_ += i_131_;
			i_148_ += i_132_;
			i_149_ += i_133_;
			final int i_153_ = ((i_148_ * i_144_) - (i_149_ * i_143_)) >> 16;
			i_149_ = ((i_148_ * i_143_) + (i_149_ * i_144_)) >> 16;
			field_at_920[i_146_] = i_149_ - i_145_;
			field_ac_923[i_146_] = i_135_ + ((i_147_ * Rasterizer3D.field_h_1146) / i_134_);
			field_az_900[i_146_] = i_136_ + ((i_153_ * Rasterizer3D.field_h_1146) / i_134_);
			if (this.field_p_899 > 0) {
				field_aa_902[i_146_] = i_147_;
				field_an_876[i_146_] = i_153_;
				field_aw_887[i_146_] = i_149_;
			}
		}
		try {
			method_w_void(false, false, 0);
		} catch (final Exception exception) {
			/* empty */
		}
	}

	@Override
	void method_o_void(final int i, final int i_154_, final int i_155_, final int i_156_, final int i_157_, final int i_158_, final int i_159_, final int i_160_, final int i_161_) {
		field_ah_906[0] = -1;
		if (this.field_ak_891 != 1) {
			method_m_void();
		}
		final int i_162_ = ((i_160_ * i_157_) - (i_158_ * i_156_)) >> 16;
		final int i_163_ = ((i_159_ * i_154_) + (i_162_ * i_155_)) >> 16;
		final int i_164_ = (this.field_ax_871 * i_155_) >> 16;
		final int i_165_ = i_163_ + i_164_;
		if ((i_165_ > 50) && (i_163_ < 3500)) {
			final int i_166_ = ((i_160_ * i_156_) + (i_158_ * i_157_)) >> 16;
		int i_167_ = ((i_166_ - this.field_ax_871) * Rasterizer3D.field_h_1146);
		if ((i_167_ / i_165_) < Rasterizer3D.field_b_1137) {
			int i_168_ = ((i_166_ + this.field_ax_871) * Rasterizer3D.field_h_1146);
			if ((i_168_ / i_165_) > Rasterizer3D.field_o_1159) {
				final int i_169_ = ((i_159_ * i_155_) - (i_162_ * i_154_)) >> 16;
				final int i_170_ = (this.field_ax_871 * i_154_) >> 16;
				int i_171_ = (i_169_ + i_170_) * Rasterizer3D.field_h_1146;
				if ((i_171_ / i_165_) > Rasterizer3D.field_t_1153) {
					final int i_172_ = (i_170_ + ((modelHeight * -1707560315 * i_155_) >> 16));
					int i_173_ = (i_169_ - i_172_) * Rasterizer3D.field_h_1146;
					if ((i_173_ / i_165_) < Rasterizer3D.field_w_1154) {
						final int i_174_ = i_164_ + ((modelHeight * -1707560315 * i_154_) >> 16);
						boolean bool = false;
						boolean bool_175_ = false;
						if ((i_163_ - i_174_) <= 50) {
							bool_175_ = true;
						}
						final boolean bool_176_ = (bool_175_ || (this.field_p_899 > 0));
						boolean bool_177_ = false;
						if ((i_161_ > 0) && field_bm_884) {
							int i_178_ = i_163_ - i_164_;
							if (i_178_ <= 50) {
								i_178_ = 50;
							}
							if (i_166_ > 0) {
								i_167_ /= i_165_;
								i_168_ /= i_178_;
							} else {
								i_168_ /= i_165_;
								i_167_ /= i_178_;
							}
							if (i_169_ > 0) {
								i_173_ /= i_165_;
								i_171_ /= i_178_;
							} else {
								i_171_ /= i_165_;
								i_173_ /= i_178_;
							}
							final int i_179_ = field_bj_903 - Rasterizer3D.field_l_1147;
							final int i_180_ = field_ba_921 - Rasterizer3D.field_u_1148;
							if ((i_179_ > i_167_) && (i_179_ < i_168_) && (i_180_ > i_173_) && (i_180_ < i_171_)) {
								if (field_ad_893) {
									field_bd_912[field_br_922++] = i_161_;
								} else {
									bool_177_ = true;
								}
							}
						}
						final int i_181_ = Rasterizer3D.field_l_1147;
						final int i_182_ = Rasterizer3D.field_u_1148;
						int i_183_ = 0;
						int i_184_ = 0;
						if (i != 0) {
							i_183_ = field_bn_924[i];
							i_184_ = field_bu_925[i];
						}
						for (int i_185_ = 0; i_185_ < this.verticeCount; i_185_++) {
							int i_186_ = this.vertexX[i_185_];
							int i_187_ = this.vertexZ[i_185_];
							int i_188_ = this.vertexY[i_185_];
							if (i != 0) {
								final int i_189_ = (((i_188_ * i_183_) + (i_186_ * i_184_)) >> 16);
								i_188_ = (((i_188_ * i_184_) - (i_186_ * i_183_)) >> 16);
								i_186_ = i_189_;
							}
							i_186_ += i_158_;
							i_187_ += i_159_;
							i_188_ += i_160_;
							int i_190_ = ((i_188_ * i_156_) + (i_186_ * i_157_)) >> 16;
							i_188_ = ((i_188_ * i_157_) - (i_186_ * i_156_)) >> 16;
							i_186_ = i_190_;
							i_190_ = ((i_187_ * i_155_) - (i_188_ * i_154_)) >> 16;
							i_188_ = ((i_187_ * i_154_) + (i_188_ * i_155_)) >> 16;
							field_at_920[i_185_] = i_188_ - i_163_;
							if (i_188_ >= 50) {
								field_ac_923[i_185_] = i_181_ + ((i_186_ * Rasterizer3D.field_h_1146) / i_188_);
								field_az_900[i_185_] = i_182_ + ((i_190_ * Rasterizer3D.field_h_1146) / i_188_);
							} else {
								field_ac_923[i_185_] = -5000;
								bool = true;
							}
							if (bool_176_) {
								field_aa_902[i_185_] = i_186_;
								field_an_876[i_185_] = i_190_;
								field_aw_887[i_185_] = i_188_;
							}
						}
						try {
							method_w_void(bool, bool_177_, i_161_);
						} catch (final Exception exception) {
							/* empty */
						}
					}
				}
			}
		}
		}
	}

	final void method_w_void(final boolean bool, boolean bool_191_, final int i) {
		if (this.field_al_894 < 1600) {
			for (int i_192_ = 0; i_192_ < this.field_al_894; i_192_++) {
				field_ah_906[i_192_] = 0;
			}
			for (int i_193_ = 0; i_193_ < this.triangleCount; i_193_++) {
				if (this.texMapY[i_193_] != -2) {
					final int i_194_ = this.triangleA[i_193_];
					final int i_195_ = this.triangleB[i_193_];
					final int i_196_ = this.triangleC[i_193_];
					final int i_197_ = field_ac_923[i_194_];
					final int i_198_ = field_ac_923[i_195_];
					final int i_199_ = field_ac_923[i_196_];
					if (bool && ((i_197_ == -5000) || (i_198_ == -5000) || (i_199_ == -5000))) {
						int i_200_ = field_aa_902[i_194_];
						final int i_201_ = field_aa_902[i_195_];
						int i_202_ = field_aa_902[i_196_];
						int i_203_ = field_an_876[i_194_];
						final int i_204_ = field_an_876[i_195_];
						int i_205_ = field_an_876[i_196_];
						int i_206_ = field_aw_887[i_194_];
						final int i_207_ = field_aw_887[i_195_];
						int i_208_ = field_aw_887[i_196_];
						i_200_ -= i_201_;
						i_202_ -= i_201_;
						i_203_ -= i_204_;
						i_205_ -= i_204_;
						i_206_ -= i_207_;
						i_208_ -= i_207_;
						final int i_209_ = (i_203_ * i_208_) - (i_206_ * i_205_);
						final int i_210_ = (i_206_ * i_202_) - (i_200_ * i_208_);
						final int i_211_ = (i_200_ * i_205_) - (i_203_ * i_202_);
						if (((i_201_ * i_209_) + (i_204_ * i_210_) + (i_207_ * i_211_)) > 0) {
							field_ao_880[i_193_] = true;
							final int i_212_ = (((field_at_920[i_194_] + field_at_920[i_195_] + field_at_920[i_196_]) / 3) + this.field_ar_895);
							field_aq_907[i_212_][field_ah_906[i_212_]++] = i_193_;
						}
					} else {
						if (bool_191_ && method_ak_boolean(field_bj_903, field_ba_921, field_az_900[i_194_], field_az_900[i_195_], field_az_900[i_196_], i_197_, i_198_, i_199_)) {
							field_bd_912[field_br_922++] = i;
							bool_191_ = false;
						}
						if ((((i_197_ - i_198_) * (field_az_900[i_196_] - field_az_900[i_195_])) - ((field_az_900[i_194_] - field_az_900[i_195_]) * (i_199_ - i_198_))) > 0) {
							field_ao_880[i_193_] = false;
							if ((i_197_ >= 0) && (i_198_ >= 0) && (i_199_ >= 0) && (i_197_ <= Rasterizer3D.field_c_1151) && (i_198_ <= Rasterizer3D.field_c_1151) && (i_199_ <= Rasterizer3D.field_c_1151)) {
								field_ab_897[i_193_] = false;
							} else {
								field_ab_897[i_193_] = true;
							}
							final int i_213_ = (((field_at_920[i_194_] + field_at_920[i_195_] + field_at_920[i_196_]) / 3) + this.field_ar_895);
							field_aq_907[i_213_][field_ah_906[i_213_]++] = i_193_;
						}
					}
				}
			}
			if (this.texMapZ == null) {
				for (int i_214_ = this.field_al_894 - 1; i_214_ >= 0; i_214_--) {
					final int i_215_ = field_ah_906[i_214_];
					if (i_215_ > 0) {
						final int[] is = field_aq_907[i_214_];
						for (int i_216_ = 0; i_216_ < i_215_; i_216_++) {
							method_i_void(is[i_216_]);
						}
					}
				}
			} else {
				for (int i_217_ = 0; i_217_ < 12; i_217_++) {
					field_ay_908[i_217_] = 0;
					field_ap_885[i_217_] = 0;
				}
				for (int i_218_ = this.field_al_894 - 1; i_218_ >= 0; i_218_--) {
					final int i_219_ = field_ah_906[i_218_];
					if (i_219_ > 0) {
						final int[] is = field_aq_907[i_218_];
						for (int i_220_ = 0; i_220_ < i_219_; i_220_++) {
							final int i_221_ = is[i_220_];
							final byte i_222_ = this.texMapZ[i_221_];
							final int i_223_ = field_ay_908[i_222_]++;
							field_am_910[i_222_][i_223_] = i_221_;
							if (i_222_ < 10) {
								field_ap_885[i_222_] += i_218_;
							} else if (i_222_ == 10) {
								field_aj_901[i_223_] = i_218_;
							} else {
								field_ag_911[i_223_] = i_218_;
							}
						}
					}
				}
				int i_224_ = 0;
				if ((field_ay_908[1] > 0) || (field_ay_908[2] > 0)) {
					i_224_ = ((field_ap_885[1] + field_ap_885[2]) / (field_ay_908[1] + field_ay_908[2]));
				}
				int i_225_ = 0;
				if ((field_ay_908[3] > 0) || (field_ay_908[4] > 0)) {
					i_225_ = ((field_ap_885[3] + field_ap_885[4]) / (field_ay_908[3] + field_ay_908[4]));
				}
				int i_226_ = 0;
				if ((field_ay_908[6] > 0) || (field_ay_908[8] > 0)) {
					i_226_ = ((field_ap_885[6] + field_ap_885[8]) / (field_ay_908[6] + field_ay_908[8]));
				}
				int i_227_ = 0;
				int i_228_ = field_ay_908[10];
				int[] is = field_am_910[10];
				int[] is_229_ = field_aj_901;
				if (i_227_ == i_228_) {
					i_227_ = 0;
					i_228_ = field_ay_908[11];
					is = field_am_910[11];
					is_229_ = field_ag_911;
				}
				int i_230_;
				if (i_227_ < i_228_) {
					i_230_ = is_229_[i_227_];
				} else {
					i_230_ = -1000;
				}
				for (int i_231_ = 0; i_231_ < 10; i_231_++) {
					while (i_231_ == 0) {
						if (i_230_ <= i_224_) {
							break;
						}
						method_i_void(is[i_227_++]);
						if ((i_227_ == i_228_) && (is != field_am_910[11])) {
							i_227_ = 0;
							i_228_ = field_ay_908[11];
							is = field_am_910[11];
							is_229_ = field_ag_911;
						}
						if (i_227_ < i_228_) {
							i_230_ = is_229_[i_227_];
						} else {
							i_230_ = -1000;
						}
					}
					while (i_231_ == 3) {
						if (i_230_ <= i_225_) {
							break;
						}
						method_i_void(is[i_227_++]);
						if ((i_227_ == i_228_) && (is != field_am_910[11])) {
							i_227_ = 0;
							i_228_ = field_ay_908[11];
							is = field_am_910[11];
							is_229_ = field_ag_911;
						}
						if (i_227_ < i_228_) {
							i_230_ = is_229_[i_227_];
						} else {
							i_230_ = -1000;
						}
					}
					while ((i_231_ == 5) && (i_230_ > i_226_)) {
						method_i_void(is[i_227_++]);
						if ((i_227_ == i_228_) && (is != field_am_910[11])) {
							i_227_ = 0;
							i_228_ = field_ay_908[11];
							is = field_am_910[11];
							is_229_ = field_ag_911;
						}
						if (i_227_ < i_228_) {
							i_230_ = is_229_[i_227_];
						} else {
							i_230_ = -1000;
						}
					}
					final int i_232_ = field_ay_908[i_231_];
					final int[] is_233_ = field_am_910[i_231_];
					for (int i_234_ = 0; i_234_ < i_232_; i_234_++) {
						method_i_void(is_233_[i_234_]);
					}
				}
				while (i_230_ != -1000) {
					method_i_void(is[i_227_++]);
					if ((i_227_ == i_228_) && (is != field_am_910[11])) {
						i_227_ = 0;
						is = field_am_910[11];
						i_228_ = field_ay_908[11];
						is_229_ = field_ag_911;
					}
					if (i_227_ < i_228_) {
						i_230_ = is_229_[i_227_];
					} else {
						i_230_ = -1000;
					}
				}
			}
		}
	}

	final void method_i_void(final int i) {
		if (field_ao_880[i]) {
			method_ad_void(i);
		} else {
			final int i_235_ = this.triangleA[i];
			final int i_236_ = this.triangleB[i];
			final int i_237_ = this.triangleC[i];
			Rasterizer3D.field_n_1143 = field_ab_897[i];
			if (this.field_j_909 == null) {
				Rasterizer3D.field_e_1141 = 0;
			} else {
				Rasterizer3D.field_e_1141 = this.field_j_909[i] & 0xff;
			}
			if ((this.field_v_890 != null) && (this.field_v_890[i] != -1)) {
				int i_238_;
				int i_239_;
				int i_240_;
				if ((this.field_s_914 != null) && (this.field_s_914[i] != -1)) {
					final int i_241_ = this.field_s_914[i] & 0xff;
					i_238_ = this.field_o_898[i_241_];
					i_239_ = this.field_b_886[i_241_];
					i_240_ = this.field_t_864[i_241_];
				} else {
					i_238_ = i_235_;
					i_239_ = i_236_;
					i_240_ = i_237_;
				}
				if (this.texMapY[i] == -1) {
					Rasterizer3D.method_k_void(field_az_900[i_235_], field_az_900[i_236_], field_az_900[i_237_], field_ac_923[i_235_], field_ac_923[i_236_], field_ac_923[i_237_], this.triangleColors[i], this.triangleColors[i], this.triangleColors[i], field_aa_902[i_238_], field_aa_902[i_239_], field_aa_902[i_240_], field_an_876[i_238_], field_an_876[i_239_], field_an_876[i_240_],
							field_aw_887[i_238_], field_aw_887[i_239_], field_aw_887[i_240_], this.field_v_890[i]);
				} else {
					Rasterizer3D.method_k_void(field_az_900[i_235_], field_az_900[i_236_], field_az_900[i_237_], field_ac_923[i_235_], field_ac_923[i_236_], field_ac_923[i_237_], this.triangleColors[i], this.texMapX[i], this.texMapY[i], field_aa_902[i_238_], field_aa_902[i_239_], field_aa_902[i_240_], field_an_876[i_238_], field_an_876[i_239_], field_an_876[i_240_], field_aw_887[i_238_],
							field_aw_887[i_239_], field_aw_887[i_240_], this.field_v_890[i]);
				}
			} else if (this.texMapY[i] == -1) {
				Rasterizer3D.method_u_void(field_az_900[i_235_], field_az_900[i_236_], field_az_900[i_237_], field_ac_923[i_235_], field_ac_923[i_236_], field_ac_923[i_237_], field_bq_926[(this.triangleColors[i])]);
			} else {
				Rasterizer3D.method_h_void(field_az_900[i_235_], field_az_900[i_236_], field_az_900[i_237_], field_ac_923[i_235_], field_ac_923[i_236_], field_ac_923[i_237_], (this.triangleColors[i]), this.texMapX[i], this.texMapY[i]);
			}
		}
	}

	final boolean method_ak_boolean(final int i, final int i_242_, final int i_243_, final int i_244_, final int i_245_, final int i_246_, final int i_247_, final int i_248_) {
		return ((i_242_ < i_243_) && (i_242_ < i_244_) && (i_242_ < i_245_) ? false : (i_242_ > i_243_) && (i_242_ > i_244_) && (i_242_ > i_245_) ? false : (i < i_246_) && (i < i_247_) && (i < i_248_) ? false : (i <= i_246_) || (i <= i_247_) || (i <= i_248_));
	}

	public Model method_z_cg(final boolean bool) {
		if (!bool && (field_d_865.length < this.triangleCount)) {
			field_d_865 = new byte[this.triangleCount + 100];
		}
		return method_e_cg(bool, field_n_927, field_d_865);
	}

	public Model(final Model[] onscreenmodels, final int i) {
		boolean bool = false;
		boolean bool_249_ = false;
		boolean bool_250_ = false;
		boolean bool_251_ = false;
		this.verticeCount = 0;
		this.triangleCount = 0;
		this.field_p_899 = 0;
		this.field_c_883 = (byte) -1;
		for (int i_252_ = 0; i_252_ < i; i_252_++) {
			final Model onscreenmodel_253_ = onscreenmodels[i_252_];
			if (onscreenmodel_253_ != null) {
				this.verticeCount += onscreenmodel_253_.verticeCount;
				this.triangleCount += onscreenmodel_253_.triangleCount;
				this.field_p_899 += onscreenmodel_253_.field_p_899;
				if (onscreenmodel_253_.texMapZ != null) {
					bool = true;
				} else {
					if (this.field_c_883 == -1) {
						this.field_c_883 = onscreenmodel_253_.field_c_883;
					}
					if (this.field_c_883 != onscreenmodel_253_.field_c_883) {
						bool = true;
					}
				}
				bool_249_ = bool_249_ | ((onscreenmodel_253_.field_j_909) != null);
				bool_250_ = bool_250_ | ((onscreenmodel_253_.field_v_890) != null);
				bool_251_ = bool_251_ | ((onscreenmodel_253_.field_s_914) != null);
			}
		}
		this.vertexX = new int[this.verticeCount];
		this.vertexZ = new int[this.verticeCount];
		this.vertexY = new int[this.verticeCount];
		this.triangleA = new int[this.triangleCount];
		this.triangleB = new int[this.triangleCount];
		this.triangleC = new int[this.triangleCount];
		this.triangleColors = new int[this.triangleCount];
		this.texMapX = new int[this.triangleCount];
		this.texMapY = new int[this.triangleCount];
		if (bool) {
			this.texMapZ = new byte[this.triangleCount];
		}
		if (bool_249_) {
			this.field_j_909 = new byte[this.triangleCount];
		}
		if (bool_250_) {
			this.field_v_890 = new short[this.triangleCount];
		}
		if (bool_251_) {
			this.field_s_914 = new byte[this.triangleCount];
		}
		if (this.field_p_899 > 0) {
			this.field_o_898 = new int[this.field_p_899];
			this.field_b_886 = new int[this.field_p_899];
			this.field_t_864 = new int[this.field_p_899];
		}
		this.verticeCount = 0;
		this.triangleCount = 0;
		this.field_p_899 = 0;
		for (int i_254_ = 0; i_254_ < i; i_254_++) {
			final Model onscreenmodel_255_ = onscreenmodels[i_254_];
			if (onscreenmodel_255_ != null) {
				for (int i_256_ = 0; (i_256_ < onscreenmodel_255_.triangleCount); i_256_++) {
					this.triangleA[(this.triangleCount)] = (onscreenmodel_255_.triangleA[i_256_]) + this.verticeCount;
					this.triangleB[(this.triangleCount)] = (onscreenmodel_255_.triangleB[i_256_]) + this.verticeCount;
					this.triangleC[(this.triangleCount)] = (onscreenmodel_255_.triangleC[i_256_]) + this.verticeCount;
					this.triangleColors[this.triangleCount] = (onscreenmodel_255_.triangleColors[i_256_]);
					this.texMapX[(this.triangleCount)] = (onscreenmodel_255_.texMapX[i_256_]);
					this.texMapY[(this.triangleCount)] = (onscreenmodel_255_.texMapY[i_256_]);
					if (bool) {
						if (onscreenmodel_255_.texMapZ != null) {
							this.texMapZ[this.triangleCount] = (onscreenmodel_255_.texMapZ[i_256_]);
						} else {
							this.texMapZ[this.triangleCount] = (onscreenmodel_255_.field_c_883);
						}
					}
					if (bool_249_ && (onscreenmodel_255_.field_j_909 != null)) {
						this.field_j_909[this.triangleCount] = (onscreenmodel_255_.field_j_909[i_256_]);
					}
					if (bool_250_) {
						if (onscreenmodel_255_.field_v_890 != null) {
							this.field_v_890[this.triangleCount] = (onscreenmodel_255_.field_v_890[i_256_]);
						} else {
							this.field_v_890[this.triangleCount] = (short) -1;
						}
					}
					if (bool_251_) {
						if ((onscreenmodel_255_.field_s_914 != null) && ((onscreenmodel_255_.field_s_914[i_256_]) != -1)) {
							this.field_s_914[this.triangleCount] = (byte) ((onscreenmodel_255_.field_s_914[i_256_]) + (this.field_p_899));
						} else {
							this.field_s_914[this.triangleCount] = (byte) -1;
						}
					}
					this.triangleCount++;
				}
				for (int i_257_ = 0; i_257_ < onscreenmodel_255_.field_p_899; i_257_++) {
					this.field_o_898[(this.field_p_899)] = (onscreenmodel_255_.field_o_898[i_257_]) + this.verticeCount;
					this.field_b_886[(this.field_p_899)] = (onscreenmodel_255_.field_b_886[i_257_]) + this.verticeCount;
					this.field_t_864[(this.field_p_899)] = (onscreenmodel_255_.field_t_864[i_257_]) + this.verticeCount;
					this.field_p_899++;
				}
				for (int i_258_ = 0; (i_258_ < onscreenmodel_255_.verticeCount); i_258_++) {
					this.vertexX[(this.verticeCount)] = onscreenmodel_255_.vertexX[i_258_];
					this.vertexZ[(this.verticeCount)] = onscreenmodel_255_.vertexZ[i_258_];
					this.vertexY[(this.verticeCount)] = onscreenmodel_255_.vertexY[i_258_];
					this.verticeCount++;
				}
			}
		}
	}

	public void method_l_void(final Class_ci class_ci, final int i) {
		if ((this.field_w_888 != null) && (i != -1)) {
			final Skeleton class_cu = class_ci.skeletons[i];
			final WidgetNode class_cd = class_cu.field_e_1344;
			field_bs_916 = 0;
			field_bo_917 = 0;
			field_bw_918 = 0;
			for (int i_259_ = 0; i_259_ < class_cu.field_g_1346; i_259_++) {
				final int i_260_ = class_cu.field_f_1341[i_259_];
				method_q_void(class_cd.field_z_801[i_260_], class_cd.field_y_799[i_260_], class_cu.field_m_1348[i_259_], class_cu.field_a_1345[i_259_], class_cu.field_h_1349[i_259_]);
			}
			this.field_ak_891 = 0;
		}
	}

	Model() {
		/* empty */
	}

	public Model method_y_cg(final boolean bool) {
		if (!bool && (field_y_867.length < this.triangleCount)) {
			field_y_867 = new byte[this.triangleCount + 100];
		}
		return method_e_cg(bool, field_z_870, field_y_867);
	}

	final void method_ad_void(final int i) {
		final int i_261_ = Rasterizer3D.field_l_1147;
		final int i_262_ = Rasterizer3D.field_u_1148;
		int i_263_ = 0;
		final int i_264_ = this.triangleA[i];
		final int i_265_ = this.triangleB[i];
		final int i_266_ = this.triangleC[i];
		final int i_267_ = field_aw_887[i_264_];
		final int i_268_ = field_aw_887[i_265_];
		final int i_269_ = field_aw_887[i_266_];
		if (this.field_j_909 == null) {
			Rasterizer3D.field_e_1141 = 0;
		} else {
			Rasterizer3D.field_e_1141 = this.field_j_909[i] & 0xff;
		}
		if (i_267_ >= 50) {
			field_af_913[i_263_] = field_ac_923[i_264_];
			field_au_919[i_263_] = field_az_900[i_264_];
			field_av_915[i_263_++] = this.triangleColors[i];
		} else {
			final int i_270_ = field_aa_902[i_264_];
			final int i_271_ = field_an_876[i_264_];
			final int i_272_ = this.triangleColors[i];
			if (i_269_ >= 50) {
				final int i_273_ = (50 - i_267_) * field_bp_882[i_269_ - i_267_];
				field_af_913[i_263_] = i_261_ + (((i_270_ + (((field_aa_902[i_266_] - i_270_) * i_273_) >> 16)) * Rasterizer3D.field_h_1146) / 50);
				field_au_919[i_263_] = i_262_ + (((i_271_ + (((field_an_876[i_266_] - i_271_) * i_273_) >> 16)) * Rasterizer3D.field_h_1146) / 50);
				field_av_915[i_263_++] = i_272_ + (((this.texMapY[i] - i_272_) * i_273_) >> 16);
			}
			if (i_268_ >= 50) {
				final int i_274_ = (50 - i_267_) * field_bp_882[i_268_ - i_267_];
				field_af_913[i_263_] = i_261_ + (((i_270_ + (((field_aa_902[i_265_] - i_270_) * i_274_) >> 16)) * Rasterizer3D.field_h_1146) / 50);
				field_au_919[i_263_] = i_262_ + (((i_271_ + (((field_an_876[i_265_] - i_271_) * i_274_) >> 16)) * Rasterizer3D.field_h_1146) / 50);
				field_av_915[i_263_++] = i_272_ + (((this.texMapX[i] - i_272_) * i_274_) >> 16);
			}
		}
		if (i_268_ >= 50) {
			field_af_913[i_263_] = field_ac_923[i_265_];
			field_au_919[i_263_] = field_az_900[i_265_];
			field_av_915[i_263_++] = this.texMapX[i];
		} else {
			final int i_275_ = field_aa_902[i_265_];
			final int i_276_ = field_an_876[i_265_];
			final int i_277_ = this.texMapX[i];
			if (i_267_ >= 50) {
				final int i_278_ = (50 - i_268_) * field_bp_882[i_267_ - i_268_];
				field_af_913[i_263_] = i_261_ + (((i_275_ + (((field_aa_902[i_264_] - i_275_) * i_278_) >> 16)) * Rasterizer3D.field_h_1146) / 50);
				field_au_919[i_263_] = i_262_ + (((i_276_ + (((field_an_876[i_264_] - i_276_) * i_278_) >> 16)) * Rasterizer3D.field_h_1146) / 50);
				field_av_915[i_263_++] = i_277_ + (((this.triangleColors[i] - i_277_) * i_278_) >> 16);
			}
			if (i_269_ >= 50) {
				final int i_279_ = (50 - i_268_) * field_bp_882[i_269_ - i_268_];
				field_af_913[i_263_] = i_261_ + (((i_275_ + (((field_aa_902[i_266_] - i_275_) * i_279_) >> 16)) * Rasterizer3D.field_h_1146) / 50);
				field_au_919[i_263_] = i_262_ + (((i_276_ + (((field_an_876[i_266_] - i_276_) * i_279_) >> 16)) * Rasterizer3D.field_h_1146) / 50);
				field_av_915[i_263_++] = i_277_ + (((this.texMapY[i] - i_277_) * i_279_) >> 16);
			}
		}
		if (i_269_ >= 50) {
			field_af_913[i_263_] = field_ac_923[i_266_];
			field_au_919[i_263_] = field_az_900[i_266_];
			field_av_915[i_263_++] = this.texMapY[i];
		} else {
			final int i_280_ = field_aa_902[i_266_];
			final int i_281_ = field_an_876[i_266_];
			final int i_282_ = this.texMapY[i];
			if (i_268_ >= 50) {
				final int i_283_ = (50 - i_269_) * field_bp_882[i_268_ - i_269_];
				field_af_913[i_263_] = i_261_ + (((i_280_ + (((field_aa_902[i_265_] - i_280_) * i_283_) >> 16)) * Rasterizer3D.field_h_1146) / 50);
				field_au_919[i_263_] = i_262_ + (((i_281_ + (((field_an_876[i_265_] - i_281_) * i_283_) >> 16)) * Rasterizer3D.field_h_1146) / 50);
				field_av_915[i_263_++] = i_282_ + (((this.texMapX[i] - i_282_) * i_283_) >> 16);
			}
			if (i_267_ >= 50) {
				final int i_284_ = (50 - i_269_) * field_bp_882[i_267_ - i_269_];
				field_af_913[i_263_] = i_261_ + (((i_280_ + (((field_aa_902[i_264_] - i_280_) * i_284_) >> 16)) * Rasterizer3D.field_h_1146) / 50);
				field_au_919[i_263_] = i_262_ + (((i_281_ + (((field_an_876[i_264_] - i_281_) * i_284_) >> 16)) * Rasterizer3D.field_h_1146) / 50);
				field_av_915[i_263_++] = i_282_ + (((this.triangleColors[i] - i_282_) * i_284_) >> 16);
			}
		}
		final int i_285_ = field_af_913[0];
		final int i_286_ = field_af_913[1];
		final int i_287_ = field_af_913[2];
		final int i_288_ = field_au_919[0];
		final int i_289_ = field_au_919[1];
		final int i_290_ = field_au_919[2];
		Rasterizer3D.field_n_1143 = false;
		if (i_263_ == 3) {
			if ((i_285_ < 0) || (i_286_ < 0) || (i_287_ < 0) || (i_285_ > Rasterizer3D.field_c_1151) || (i_286_ > Rasterizer3D.field_c_1151) || (i_287_ > Rasterizer3D.field_c_1151)) {
				Rasterizer3D.field_n_1143 = true;
			}
			if ((this.field_v_890 != null) && (this.field_v_890[i] != -1)) {
				int i_291_;
				int i_292_;
				int i_293_;
				if ((this.field_s_914 != null) && (this.field_s_914[i] != -1)) {
					final int i_294_ = this.field_s_914[i] & 0xff;
					i_291_ = this.field_o_898[i_294_];
					i_292_ = this.field_b_886[i_294_];
					i_293_ = this.field_t_864[i_294_];
				} else {
					i_291_ = i_264_;
					i_292_ = i_265_;
					i_293_ = i_266_;
				}
				if (this.texMapY[i] == -1) {
					Rasterizer3D.method_k_void(i_288_, i_289_, i_290_, i_285_, i_286_, i_287_, this.triangleColors[i], this.triangleColors[i], this.triangleColors[i], field_aa_902[i_291_], field_aa_902[i_292_], field_aa_902[i_293_], field_an_876[i_291_], field_an_876[i_292_], field_an_876[i_293_], field_aw_887[i_291_], field_aw_887[i_292_], field_aw_887[i_293_], this.field_v_890[i]);
				} else {
					Rasterizer3D.method_k_void(i_288_, i_289_, i_290_, i_285_, i_286_, i_287_, field_av_915[0], field_av_915[1], field_av_915[2], field_aa_902[i_291_], field_aa_902[i_292_], field_aa_902[i_293_], field_an_876[i_291_], field_an_876[i_292_], field_an_876[i_293_], field_aw_887[i_291_], field_aw_887[i_292_], field_aw_887[i_293_], this.field_v_890[i]);
				}
			} else if (this.texMapY[i] == -1) {
				Rasterizer3D.method_u_void(i_288_, i_289_, i_290_, i_285_, i_286_, i_287_, field_bq_926[(this.triangleColors[i])]);
			} else {
				Rasterizer3D.method_h_void(i_288_, i_289_, i_290_, i_285_, i_286_, i_287_, field_av_915[0], field_av_915[1], field_av_915[2]);
			}
		}
		if (i_263_ == 4) {
			if ((i_285_ < 0) || (i_286_ < 0) || (i_287_ < 0) || (i_285_ > Rasterizer3D.field_c_1151) || (i_286_ > Rasterizer3D.field_c_1151) || (i_287_ > Rasterizer3D.field_c_1151) || (field_af_913[3] < 0) || (field_af_913[3] > Rasterizer3D.field_c_1151)) {
				Rasterizer3D.field_n_1143 = true;
			}
			if ((this.field_v_890 != null) && (this.field_v_890[i] != -1)) {
				int i_295_;
				int i_296_;
				int i_297_;
				if ((this.field_s_914 != null) && (this.field_s_914[i] != -1)) {
					final int i_298_ = this.field_s_914[i] & 0xff;
					i_295_ = this.field_o_898[i_298_];
					i_296_ = this.field_b_886[i_298_];
					i_297_ = this.field_t_864[i_298_];
				} else {
					i_295_ = i_264_;
					i_296_ = i_265_;
					i_297_ = i_266_;
				}
				final short i_299_ = this.field_v_890[i];
				if (this.texMapY[i] == -1) {
					Rasterizer3D.method_k_void(i_288_, i_289_, i_290_, i_285_, i_286_, i_287_, this.triangleColors[i], this.triangleColors[i], this.triangleColors[i], field_aa_902[i_295_], field_aa_902[i_296_], field_aa_902[i_297_], field_an_876[i_295_], field_an_876[i_296_], field_an_876[i_297_], field_aw_887[i_295_], field_aw_887[i_296_], field_aw_887[i_297_], i_299_);
					Rasterizer3D.method_k_void(i_288_, i_290_, field_au_919[3], i_285_, i_287_, field_af_913[3], this.triangleColors[i], this.triangleColors[i], this.triangleColors[i], field_aa_902[i_295_], field_aa_902[i_296_], field_aa_902[i_297_], field_an_876[i_295_], field_an_876[i_296_], field_an_876[i_297_], field_aw_887[i_295_], field_aw_887[i_296_], field_aw_887[i_297_], i_299_);
				} else {
					Rasterizer3D.method_k_void(i_288_, i_289_, i_290_, i_285_, i_286_, i_287_, field_av_915[0], field_av_915[1], field_av_915[2], field_aa_902[i_295_], field_aa_902[i_296_], field_aa_902[i_297_], field_an_876[i_295_], field_an_876[i_296_], field_an_876[i_297_], field_aw_887[i_295_], field_aw_887[i_296_], field_aw_887[i_297_], i_299_);
					Rasterizer3D.method_k_void(i_288_, i_290_, field_au_919[3], i_285_, i_287_, field_af_913[3], field_av_915[0], field_av_915[2], field_av_915[3], field_aa_902[i_295_], field_aa_902[i_296_], field_aa_902[i_297_], field_an_876[i_295_], field_an_876[i_296_], field_an_876[i_297_], field_aw_887[i_295_], field_aw_887[i_296_], field_aw_887[i_297_], i_299_);
				}
			} else if (this.texMapY[i] == -1) {
				final int i_300_ = field_bq_926[this.triangleColors[i]];
				Rasterizer3D.method_u_void(i_288_, i_289_, i_290_, i_285_, i_286_, i_287_, i_300_);
				Rasterizer3D.method_u_void(i_288_, i_290_, field_au_919[3], i_285_, i_287_, field_af_913[3], i_300_);
			} else {
				Rasterizer3D.method_h_void(i_288_, i_289_, i_290_, i_285_, i_286_, i_287_, field_av_915[0], field_av_915[1], field_av_915[2]);
				Rasterizer3D.method_h_void(i_288_, i_290_, field_au_919[3], i_285_, i_287_, field_af_913[3], field_av_915[0], field_av_915[2], field_av_915[3]);
			}
		}
	}
}
