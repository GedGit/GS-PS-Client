/* SceneGraph - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class SceneGraph {
	static int field_bj_1262;
	int field_d_1263;
	int field_z_1264;
	int field_y_1265;
	int[][][] field_e_1266;
	SceneTile[][][] groundTiles;
	int field_f_1268 = 0;
	int field_m_1269 = 0;
	SceneObject[] sceneObjects = new SceneObject[5000];
	int[][][] field_h_1271;
	static final int field_l_1272 = 128;
	static int field_o_1273;
	static final int[] field_ag_1274 = { 76, 8, 137, 4, 0, 1, 38, 2, 19 };
	static final int field_k_1275 = 50;
	static int field_x_1276 = 0;
	static int field_r_1277 = 0;
	static final int field_q_1278 = 25;
	static final int[] field_av_1279 = { 1, 1, 0, 0, 0, 8, 0, 0, 8 };
	static int field_v_1280;
	static int field_c_1281;
	static int field_p_1282;
	public static int field_ac_1283 = -1;
	static int field_b_1284;
	static int field_t_1285;
	static int field_w_1286;
	static int field_j_1287;
	static int field_ad_1288;
	static final int field_aa_1289 = 128;
	static int field_ae_1290;
	static int field_ax_1291;
	static SceneObject[] field_al_1292 = new SceneObject[100];
	static int field_i_1293;
	static int field_as_1294 = 0;
	static int field_ab_1295 = 0;
	static int field_ao_1296 = 0;
	static int field_ah_1297 = 0;
	public static int field_az_1298 = -1;
	static final int field_at_1299 = 32;
	static int field_br_1300;
	static int field_an_1301 = 4;
	int[][] field_bo_1302 = { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };
	static Class_cp[][] field_ai_1303 = new Class_cp[field_an_1301][500];
	static final int field_u_1304 = 64;
	static Class_cp[] field_aq_1305 = new Class_cp[500];
	static NodeDeque field_ay_1306 = new NodeDeque();
	static final int[] field_am_1307 = { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
	static final int[] field_aj_1308 = { 160, 192, 80, 96, 0, 144, 80, 48, 160 };
	static boolean field_ar_1309 = false;
	static final int[] field_ap_1310 = { 0, 0, 2, 0, 0, 2, 1, 1, 0 };
	static int field_bn_1311;
	static final int[] field_au_1312 = { 0, 4, 4, 8, 0, 0, 8, 0, 0 };
	static int field_s_1313;
	int[][] field_bs_1314 = { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };
	static final int[] field_af_1315 = { 2, 0, 0, 2, 0, 0, 0, 4, 4 };
	static boolean[][][][] field_bw_1316 = new boolean[8][32][51][51];
	static boolean[][] field_bm_1317;
	static int[] field_aw_1318 = new int[field_an_1301];
	static int field_ba_1319;
	public static boolean field_n_1320 = true;
	static int field_bd_1321;
	static int field_ak_1322;
	static int field_bu_1323;

	public void method_n_void() {
		for (int i = 0; i < this.field_d_1263; i++) {
			for (int i_0_ = 0; i_0_ < this.field_z_1264; i_0_++) {
				for (int i_1_ = 0; i_1_ < this.field_y_1265; i_1_++) {
					this.groundTiles[i][i_0_][i_1_] = null;
				}
			}
		}
		for (int i = 0; i < field_an_1301; i++) {
			for (int i_2_ = 0; i_2_ < field_aw_1318[i]; i_2_++) {
				field_ai_1303[i][i_2_] = null;
			}
			field_aw_1318[i] = 0;
		}
		for (int i = 0; i < this.field_m_1269; i++) {
			this.sceneObjects[i] = null;
		}
		this.field_m_1269 = 0;
		for (int i = 0; i < field_al_1292.length; i++) {
			field_al_1292[i] = null;
		}
	}

	public void method_d_void(final int i) {
		this.field_f_1268 = i;
		for (int i_3_ = 0; i_3_ < this.field_z_1264; i_3_++) {
			for (int i_4_ = 0; i_4_ < this.field_y_1265; i_4_++) {
				if (this.groundTiles[i][i_3_][i_4_] == null) {
					this.groundTiles[i][i_3_][i_4_] = new SceneTile(i, i_3_, i_4_);
				}
			}
		}
	}

	public void drawModel(final int i, final int i_5_, final int i_6_, final int i_7_, final Renderable renderable, final int i_8_, final Renderable renderable_9_, final Renderable renderable_10_) {
		final Class_cx class_cx = new Class_cx();
		class_cx.field_z_1429 = renderable;
		class_cx.field_d_1427 = (i_5_ * -1443607936) + -721803968;
		class_cx.field_y_1435 = (i_6_ * 718462592) + -1788252352;
		class_cx.field_n_1428 = i_7_ * 1559200941;
		class_cx.field_f_1433 = i_8_ * -2061654535;
		class_cx.field_e_1430 = renderable_9_;
		class_cx.field_g_1426 = renderable_10_;
		int i_11_ = 0;
		final SceneTile groundtile = this.groundTiles[i][i_5_][i_6_];
		if (groundtile != null) {
			for (int i_12_ = 0; i_12_ < (groundtile.field_l_1107 * 780605197); i_12_++) {
				if (((((groundtile.interactableObjects[i_12_].config) * 177863451) & 0x100) == 256) && ((groundtile.interactableObjects[i_12_].renderable) instanceof Model)) {
					final Model onscreenmodel = ((Model) (groundtile.interactableObjects[i_12_].renderable));
					onscreenmodel.method_m_void();
					if ((onscreenmodel.modelHeight * -1707560315) > i_11_) {
						i_11_ = onscreenmodel.modelHeight * -1707560315;
					}
				}
			}
		}
		class_cx.field_m_1432 = i_11_ * -1742630157;
		if (this.groundTiles[i][i_5_][i_6_] == null) {
			this.groundTiles[i][i_5_][i_6_] = new SceneTile(i, i_5_, i_6_);
		}
		this.groundTiles[i][i_5_][i_6_].field_h_1109 = class_cx;
	}

	public static void method_y_void(final int i, final int i_13_, final int i_14_, final int i_15_, final int i_16_, final int i_17_, final int i_18_, final int i_19_) {
		final Class_cp class_cp = new Class_cp();
		class_cp.field_n_1173 = (i_14_ / 128) * 1728326201;
		class_cp.field_d_1169 = (i_15_ / 128) * 169282509;
		class_cp.field_z_1171 = (i_16_ / 128) * -713981241;
		class_cp.field_y_1168 = (i_17_ / 128) * 514162351;
		class_cp.field_e_1172 = i_13_ * -1634070659;
		class_cp.field_g_1176 = i_14_ * 728911903;
		class_cp.field_f_1174 = i_15_ * 1776878483;
		class_cp.field_m_1175 = i_16_ * 1994594691;
		class_cp.field_a_1190 = i_17_ * 1710349685;
		class_cp.field_h_1177 = i_18_ * -1557369849;
		class_cp.field_l_1178 = i_19_ * -1812907033;
		field_ai_1303[i][field_aw_1318[i]++] = class_cp;
	}

	public void method_e_void(final int i, final int i_20_, final int i_21_, final int i_22_) {
		final SceneTile groundtile = this.groundTiles[i][i_20_][i_21_];
		if (groundtile != null) {
			this.groundTiles[i][i_20_][i_21_].field_x_1111 = i_22_ * 1301402995;
		}
	}

	void method_ay_void() {
		final int i = field_aw_1318[field_r_1277];
		final Class_cp[] class_cps = field_ai_1303[field_r_1277];
		field_ah_1297 = 0;
		for (int i_23_ = 0; i_23_ < i; i_23_++) {
			final Class_cp class_cp = class_cps[i_23_];
			if ((class_cp.field_e_1172 * 834281941) == 1) {
				final int i_24_ = (((class_cp.field_n_1173 * 1547609097) - field_o_1273) + 25);
				if ((i_24_ >= 0) && (i_24_ <= 50)) {
					int i_25_ = (((class_cp.field_z_1171 * -1256415497) - field_b_1284) + 25);
					if (i_25_ < 0) {
						i_25_ = 0;
					}
					int i_26_ = (((class_cp.field_y_1168 * 824875087) - field_b_1284) + 25);
					if (i_26_ > 50) {
						i_26_ = 50;
					}
					boolean bool = false;
					while (i_25_ <= i_26_) {
						if (field_bm_1317[i_24_][i_25_++]) {
							bool = true;
							break;
						}
					}
					if (bool) {
						int i_27_ = (field_t_1285 - (class_cp.field_g_1176 * 19475423));
						if (i_27_ > 32) {
							class_cp.field_u_1179 = -335764393;
						} else {
							if (i_27_ >= -32) {
								continue;
							}
							class_cp.field_u_1179 = -671528786;
							i_27_ = -i_27_;
						}
						class_cp.field_x_1182 = ((((class_cp.field_m_1175 * 2077736235) - field_i_1293) << 8) / i_27_) * -2039150091;
						class_cp.field_r_1183 = ((((class_cp.field_a_1190 * 1299204829) - field_i_1293) << 8) / i_27_) * 507590389;
						class_cp.field_j_1184 = ((((class_cp.field_h_1177 * 996622775) - field_w_1286) << 8) / i_27_) * -1103530331;
						class_cp.field_s_1185 = ((((class_cp.field_l_1178 * -1196054569) - field_w_1286) << 8) / i_27_) * 1875517849;
						field_aq_1305[field_ah_1297++] = class_cp;
					}
				}
			} else if ((class_cp.field_e_1172 * 834281941) == 2) {
				final int i_28_ = (((class_cp.field_z_1171 * -1256415497) - field_b_1284) + 25);
				if ((i_28_ >= 0) && (i_28_ <= 50)) {
					int i_29_ = (((class_cp.field_n_1173 * 1547609097) - field_o_1273) + 25);
					if (i_29_ < 0) {
						i_29_ = 0;
					}
					int i_30_ = (((class_cp.field_d_1169 * 45930757) - field_o_1273) + 25);
					if (i_30_ > 50) {
						i_30_ = 50;
					}
					boolean bool = false;
					while (i_29_ <= i_30_) {
						if (field_bm_1317[i_29_++][i_28_]) {
							bool = true;
							break;
						}
					}
					if (bool) {
						int i_31_ = (field_i_1293 - (class_cp.field_m_1175 * 2077736235));
						if (i_31_ > 32) {
							class_cp.field_u_1179 = -1007293179;
						} else {
							if (i_31_ >= -32) {
								continue;
							}
							class_cp.field_u_1179 = -1343057572;
							i_31_ = -i_31_;
						}
						class_cp.field_q_1180 = ((((class_cp.field_g_1176 * 19475423) - field_t_1285) << 8) / i_31_) * -123510415;
						class_cp.field_k_1181 = ((((class_cp.field_f_1174 * -751070565) - field_t_1285) << 8) / i_31_) * 622442149;
						class_cp.field_j_1184 = ((((class_cp.field_h_1177 * 996622775) - field_w_1286) << 8) / i_31_) * -1103530331;
						class_cp.field_s_1185 = ((((class_cp.field_l_1178 * -1196054569) - field_w_1286) << 8) / i_31_) * 1875517849;
						field_aq_1305[field_ah_1297++] = class_cp;
					}
				}
			} else if ((class_cp.field_e_1172 * 834281941) == 4) {
				final int i_32_ = ((class_cp.field_h_1177 * 996622775) - field_w_1286);
				if (i_32_ > 128) {
					int i_33_ = (((class_cp.field_z_1171 * -1256415497) - field_b_1284) + 25);
					if (i_33_ < 0) {
						i_33_ = 0;
					}
					int i_34_ = (((class_cp.field_y_1168 * 824875087) - field_b_1284) + 25);
					if (i_34_ > 50) {
						i_34_ = 50;
					}
					if (i_33_ <= i_34_) {
						int i_35_ = (((class_cp.field_n_1173 * 1547609097) - field_o_1273) + 25);
						if (i_35_ < 0) {
							i_35_ = 0;
						}
						int i_36_ = (((class_cp.field_d_1169 * 45930757) - field_o_1273) + 25);
						if (i_36_ > 50) {
							i_36_ = 50;
						}
						boolean bool = false;
						while_14_: for (int i_37_ = i_35_; i_37_ <= i_36_; i_37_++) {
							for (int i_38_ = i_33_; i_38_ <= i_34_; i_38_++) {
								if (field_bm_1317[i_37_][i_38_]) {
									bool = true;
									break while_14_;
								}
							}
						}
						if (bool) {
							class_cp.field_u_1179 = -1678821965;
							class_cp.field_q_1180 = ((((class_cp.field_g_1176 * 19475423) - field_t_1285) << 8) / i_32_) * -123510415;
							class_cp.field_k_1181 = ((((class_cp.field_f_1174 * -751070565) - field_t_1285) << 8) / i_32_) * 622442149;
							class_cp.field_x_1182 = ((((class_cp.field_m_1175 * 2077736235) - field_i_1293) << 8) / i_32_) * -2039150091;
							class_cp.field_r_1183 = ((((class_cp.field_a_1190 * 1299204829) - field_i_1293) << 8) / i_32_) * 507590389;
							field_aq_1305[field_ah_1297++] = class_cp;
						}
					}
				}
			}
		}
	}

	public void method_f_void(final int i, final int i_39_, final int i_40_, final int i_41_, final Renderable renderable, final int i_42_, final int i_43_) {
		if (renderable != null) {
			final GroundDecoration grounddecoration = new GroundDecoration();
			grounddecoration.renderable = renderable;
			grounddecoration.field_d_851 = (i_39_ * 1647810688) + -1323578304;
			grounddecoration.field_y_847 = (i_40_ * -338722176) + -169361088;
			grounddecoration.field_n_850 = i_41_ * 1143303293;
			grounddecoration.uid = i_42_ * 1253705471;
			grounddecoration.config = i_43_ * 637884175;
			if (this.groundTiles[i][i_39_][i_40_] == null) {
				this.groundTiles[i][i_39_][i_40_] = new SceneTile(i, i_39_, i_40_);
			}
			this.groundTiles[i][i_39_][i_40_].playerUpdateBlockHandler = grounddecoration;
		}
	}

	public void method_a_void(final int i, final int i_44_, final int i_45_, final int i_46_, final Renderable renderable, final Renderable renderable_47_, final int i_48_, final int i_49_, final int i_50_, final int i_51_) {
		if ((renderable != null) || (renderable_47_ != null)) {
			final Boundary boundaryobject = new Boundary();
			boundaryobject.uid = i_50_ * 964393617;
			boundaryobject.config = i_51_ * 1305108939;
			boundaryobject.field_d_1513 = (i_44_ * -1636194944) + 1329386176;
			boundaryobject.field_y_1518 = (i_45_ * 1521734528) + -1386616384;
			boundaryobject.field_n_1519 = i_46_ * -90164977;
			boundaryobject.renderable1 = renderable;
			boundaryobject.renderable2 = renderable_47_;
			boundaryobject.field_z_1515 = i_48_ * 1045555237;
			boundaryobject.field_e_1516 = i_49_ * -666464937;
			for (int i_52_ = i; i_52_ >= 0; i_52_--) {
				if (this.groundTiles[i_52_][i_44_][i_45_] == null) {
					this.groundTiles[i_52_][i_44_][i_45_] = new SceneTile(i_52_, i_44_, i_45_);
				}
			}
			this.groundTiles[i][i_44_][i_45_].boundaryObject = boundaryobject;
		}
	}

	public void method_h_void(final int i, final int i_53_, final int i_54_, final int i_55_, final Renderable renderable, final Renderable renderable_56_, final int i_57_, final int i_58_, final int i_59_, final int i_60_, final int i_61_, final int i_62_) {
		if (renderable != null) {
			final WallDecoration walldecoration = new WallDecoration();
			walldecoration.uid = i_61_ * -454923239;
			walldecoration.config = i_62_ * -1775354825;
			walldecoration.field_d_816 = (i_53_ * -1788188288) + 1253389504;
			walldecoration.field_y_815 = (i_54_ * 158814848) + -2068076224;
			walldecoration.field_n_823 = i_55_ * 1848750569;
			walldecoration.renderable2 = renderable;
			walldecoration.renderable1 = renderable_56_;
			walldecoration.field_z_818 = i_57_ * -315712047;
			walldecoration.field_e_822 = i_58_ * -1451415503;
			walldecoration.field_g_820 = i_59_ * -2088748623;
			walldecoration.field_f_821 = i_60_ * -126387801;
			for (int i_63_ = i; i_63_ >= 0; i_63_--) {
				if (this.groundTiles[i_63_][i_53_][i_54_] == null) {
					this.groundTiles[i_63_][i_53_][i_54_] = new SceneTile(i_63_, i_53_, i_54_);
				}
			}
			this.groundTiles[i][i_53_][i_54_].wallDecoration = walldecoration;
		}
	}

	public boolean method_l_boolean(final int i, final int i_64_, final int i_65_, final int i_66_, final int i_67_, final int i_68_, final Renderable renderable, final int i_69_, final int i_70_, final int i_71_) {
		if (renderable == null) {
			return true;
		}
		final int i_72_ = (i_64_ * 128) + (64 * i_67_);
		final int i_73_ = (i_65_ * 128) + (64 * i_68_);
		return method_k_boolean(i, i_64_, i_65_, i_67_, i_68_, i_72_, i_73_, i_66_, renderable, i_69_, false, i_70_, i_71_);
	}

	public boolean method_u_boolean(final int i, final int i_74_, final int i_75_, final int i_76_, final int i_77_, final Renderable renderable, final int i_78_, final int i_79_, final boolean bool) {
		if (renderable == null) {
			return true;
		}
		int i_80_ = i_74_ - i_77_;
		int i_81_ = i_75_ - i_77_;
		int i_82_ = i_74_ + i_77_;
		int i_83_ = i_75_ + i_77_;
		if (bool) {
			if ((i_78_ > 640) && (i_78_ < 1408)) {
				i_83_ += 128;
			}
			if ((i_78_ > 1152) && (i_78_ < 1920)) {
				i_82_ += 128;
			}
			if ((i_78_ > 1664) || (i_78_ < 384)) {
				i_81_ -= 128;
			}
			if ((i_78_ > 128) && (i_78_ < 896)) {
				i_80_ -= 128;
			}
		}
		i_80_ /= 128;
		i_81_ /= 128;
		i_82_ /= 128;
		i_83_ /= 128;
		return method_k_boolean(i, i_80_, i_81_, (i_82_ - i_80_) + 1, (i_83_ - i_81_) + 1, i_74_, i_75_, i_76_, renderable, i_78_, true, i_79_, 0);
	}

	public boolean method_q_boolean(final int i, final int i_84_, final int i_85_, final int i_86_, final int i_87_, final Renderable renderable, final int i_88_, final int i_89_, final int i_90_, final int i_91_, final int i_92_, final int i_93_) {
		return (renderable == null ? true : method_k_boolean(i, i_90_, i_91_, (i_92_ - i_90_) + 1, (i_93_ - i_91_) + 1, i_84_, i_85_, i_86_, renderable, i_88_, true, i_89_, 0));
	}

	boolean method_k_boolean(final int i, final int i_94_, final int i_95_, final int i_96_, final int i_97_, final int i_98_, final int i_99_, final int i_100_, final Renderable renderable, final int i_101_, final boolean bool, final int i_102_, final int i_103_) {
		for (int i_104_ = i_94_; i_104_ < (i_94_ + i_96_); i_104_++) {
			for (int i_105_ = i_95_; i_105_ < (i_95_ + i_97_); i_105_++) {
				if ((i_104_ < 0) || (i_105_ < 0) || (i_104_ >= this.field_z_1264) || (i_105_ >= this.field_y_1265)) {
					return false;
				}
				final SceneTile groundtile = this.groundTiles[i][i_104_][i_105_];
				if ((groundtile != null) && ((groundtile.field_l_1107 * 780605197) >= 5)) {
					return false;
				}
			}
		}
		final SceneObject interactableobject = new SceneObject();
		interactableobject.uid = i_102_ * 391691073;
		interactableobject.config = i_103_ * 1774708499;
		interactableobject.plane = i * -1882541963;
		interactableobject.gridX = i_98_ * -1179717949;
		interactableobject.gridY = i_99_ * -1722818837;
		interactableobject.height = i_100_ * 1703565563;
		interactableobject.renderable = renderable;
		interactableobject.orientation = i_101_ * -334587421;
		interactableobject.x = i_94_ * -1213821599;
		interactableobject.y = i_95_ * 837365751;
		interactableobject.maxLocX = ((i_94_ + i_96_) - 1) * -1699066675;
		interactableobject.maxLocY = ((i_95_ + i_97_) - 1) * 1587345001;
		for (int i_106_ = i_94_; i_106_ < (i_94_ + i_96_); i_106_++) {
			for (int i_107_ = i_95_; i_107_ < (i_95_ + i_97_); i_107_++) {
				int i_108_ = 0;
				if (i_106_ > i_94_) {
					i_108_++;
				}
				if (i_106_ < ((i_94_ + i_96_) - 1)) {
					i_108_ += 4;
				}
				if (i_107_ > i_95_) {
					i_108_ += 8;
				}
				if (i_107_ < ((i_95_ + i_97_) - 1)) {
					i_108_ += 2;
				}
				for (int i_109_ = i; i_109_ >= 0; i_109_--) {
					if (this.groundTiles[i_109_][i_106_][i_107_] == null) {
						this.groundTiles[i_109_][i_106_][i_107_] = new SceneTile(i_109_, i_106_, i_107_);
					}
				}
				final SceneTile groundtile = this.groundTiles[i][i_106_][i_107_];
				groundtile.interactableObjects[groundtile.field_l_1107 * 780605197] = interactableobject;
				groundtile.field_q_1115[groundtile.field_l_1107 * 780605197] = i_108_;
				groundtile.field_k_1110 = ((groundtile.field_k_1110 * -422367583) | i_108_) * -1261161119;
				groundtile.field_l_1107 += -770207803;
			}
		}
		if (bool) {
			this.sceneObjects[this.field_m_1269++] = interactableobject;
		}
		return true;
	}

	void method_r_void(final SceneObject interactableobject) {
		for (int i = interactableobject.x * 491968161; i <= (interactableobject.maxLocX * 600735749); i++) {
			for (int i_110_ = (interactableobject.y * -295550521); i_110_ <= (interactableobject.maxLocY * 1143994841); i_110_++) {
				final SceneTile groundtile = (this.groundTiles[(interactableobject.plane * -484859939)][i][i_110_]);
				if (groundtile != null) {
					for (int i_111_ = 0; i_111_ < (groundtile.field_l_1107 * 780605197); i_111_++) {
						if ((groundtile.interactableObjects[i_111_]) == interactableobject) {
							groundtile.field_l_1107 -= -770207803;
							for (int i_112_ = i_111_; (i_112_ < (groundtile.field_l_1107 * 780605197)); i_112_++) {
								groundtile.interactableObjects[i_112_] = (groundtile.interactableObjects[i_112_ + 1]);
								groundtile.field_q_1115[i_112_] = (groundtile.field_q_1115[i_112_ + 1]);
							}
							groundtile.interactableObjects[(groundtile.field_l_1107 * 780605197)] = null;
							break;
						}
					}
					groundtile.field_k_1110 = 0;
					for (int i_113_ = 0; i_113_ < (groundtile.field_l_1107 * 780605197); i_113_++) {
						groundtile.field_k_1110 = ((groundtile.field_k_1110 * -422367583) | (groundtile.field_q_1115[i_113_])) * -1261161119;
					}
				}
			}
		}
	}

	public void method_s_void(final int i, final int i_114_, final int i_115_) {
		final SceneTile groundtile = this.groundTiles[i][i_114_][i_115_];
		if (groundtile != null) {
			groundtile.boundaryObject = null;
		}
	}

	public void method_c_void(final int i, final int i_116_, final int i_117_) {
		final SceneTile groundtile = this.groundTiles[i][i_116_][i_117_];
		if (groundtile != null) {
			for (int i_118_ = 0; i_118_ < (groundtile.field_l_1107 * 780605197); i_118_++) {
				final SceneObject interactableobject = groundtile.interactableObjects[i_118_];
				if (((((interactableobject.uid * -1513499455) >> 29) & 0x3) == 2) && ((interactableobject.x * 491968161) == i_116_) && ((interactableobject.y * -295550521) == i_117_)) {
					method_r_void(interactableobject);
					break;
				}
			}
		}
	}

	public void method_p_void(final int i, final int i_119_, final int i_120_) {
		final SceneTile groundtile = this.groundTiles[i][i_119_][i_120_];
		if (groundtile != null) {
			groundtile.playerUpdateBlockHandler = null;
		}
	}

	public Boundary getBoundaryAt(final int i, final int i_121_, final int i_122_) {
		final SceneTile groundtile = this.groundTiles[i][i_121_][i_122_];
		return (groundtile == null ? null : groundtile.boundaryObject);
	}

	public WallDecoration getWallAt(final int i, final int i_123_, final int i_124_) {
		final SceneTile groundtile = this.groundTiles[i][i_123_][i_124_];
		return (groundtile == null ? null : groundtile.wallDecoration);
	}

	public SceneObject getSceneObject(final int i, final int i_125_, final int i_126_) {
		final SceneTile groundtile = this.groundTiles[i][i_125_][i_126_];
		if (groundtile == null) {
			return null;
		}
		for (int i_127_ = 0; i_127_ < (groundtile.field_l_1107 * 780605197); i_127_++) {
			final SceneObject interactableobject = groundtile.interactableObjects[i_127_];
			if (((((interactableobject.uid * -1513499455) >> 29) & 0x3) == 2) && ((interactableobject.x * 491968161) == i_125_) && ((interactableobject.y * -295550521) == i_126_)) {
				return interactableobject;
			}
		}
		return null;
	}

	public GroundDecoration getGroundObject(final int i, final int i_128_, final int i_129_) {
		final SceneTile groundtile = this.groundTiles[i][i_128_][i_129_];
		return (((groundtile != null) && (groundtile.playerUpdateBlockHandler != null)) ? groundtile.playerUpdateBlockHandler : null);
	}

	public int method_ad_int(final int i, final int i_130_, final int i_131_) {
		final SceneTile groundtile = this.groundTiles[i][i_130_][i_131_];
		return (((groundtile != null) && (groundtile.boundaryObject != null)) ? groundtile.boundaryObject.uid * -832076175 : 0);
	}

	public int method_ak_int(final int i, final int i_132_, final int i_133_) {
		final SceneTile groundtile = this.groundTiles[i][i_132_][i_133_];
		return (((groundtile != null) && (groundtile.wallDecoration != null)) ? groundtile.wallDecoration.uid * -298307543 : 0);
	}

	public int method_ae_int(final int i, final int i_134_, final int i_135_) {
		final SceneTile groundtile = this.groundTiles[i][i_134_][i_135_];
		if (groundtile == null) {
			return 0;
		}
		for (int i_136_ = 0; i_136_ < (groundtile.field_l_1107 * 780605197); i_136_++) {
			final SceneObject interactableobject = groundtile.interactableObjects[i_136_];
			if (((((interactableobject.uid * -1513499455) >> 29) & 0x3) == 2) && ((interactableobject.x * 491968161) == i_134_) && ((interactableobject.y * -295550521) == i_135_)) {
				return interactableobject.uid * -1513499455;
			}
		}
		return 0;
	}

	boolean method_ap_boolean(final int i, final int i_137_, final int i_138_, final int i_139_, final int i_140_, final int i_141_) {
		if ((i_137_ == i_138_) && (i_139_ == i_140_)) {
			if (!method_am_boolean(i, i_137_, i_139_)) {
				return false;
			}
			final int i_142_ = i_137_ << 7;
			final int i_143_ = i_139_ << 7;
			if (method_af_boolean(i_142_ + 1, (this.field_e_1266[i][i_137_][i_139_]) - i_141_, i_143_ + 1) && method_af_boolean((i_142_ + 128) - 1, (this.field_e_1266[i][i_137_ + 1][i_139_]) - i_141_, i_143_ + 1) && method_af_boolean((i_142_ + 128) - 1, (this.field_e_1266[i][i_137_ + 1][i_139_ + 1]) - i_141_, (i_143_ + 128) - 1)
					&& method_af_boolean(i_142_ + 1, (this.field_e_1266[i][i_137_][i_139_ + 1]) - i_141_, (i_143_ + 128) - 1)) {
				return true;
			}
			return false;
		}
		for (int i_144_ = i_137_; i_144_ <= i_138_; i_144_++) {
			for (int i_145_ = i_139_; i_145_ <= i_140_; i_145_++) {
				if (this.field_h_1271[i][i_144_][i_145_] == -field_j_1287) {
					return false;
				}
			}
		}
		final int i_146_ = (i_137_ << 7) + 1;
		final int i_147_ = (i_139_ << 7) + 2;
		final int i_148_ = this.field_e_1266[i][i_137_][i_139_] - i_141_;
		if (!method_af_boolean(i_146_, i_148_, i_147_)) {
			return false;
		}
		final int i_149_ = (i_138_ << 7) - 1;
		if (!method_af_boolean(i_149_, i_148_, i_147_)) {
			return false;
		}
		final int i_150_ = (i_140_ << 7) - 1;
		if (!method_af_boolean(i_146_, i_148_, i_150_)) {
			return false;
		}
		if (!method_af_boolean(i_149_, i_148_, i_150_)) {
			return false;
		}
		return true;
	}

	public void method_ar_void(final int i, final int i_151_, final int i_152_) {
		for (int i_153_ = 0; i_153_ < this.field_d_1263; i_153_++) {
			for (int i_154_ = 0; i_154_ < this.field_z_1264; i_154_++) {
				for (int i_155_ = 0; i_155_ < this.field_y_1265; i_155_++) {
					final SceneTile groundtile = (this.groundTiles[i_153_][i_154_][i_155_]);
					if (groundtile != null) {
						final Boundary boundaryobject = groundtile.boundaryObject;
						if ((boundaryobject != null) && (boundaryobject.renderable1 instanceof OffScreenModel)) {
							final OffScreenModel rsmodel = (OffScreenModel) boundaryobject.renderable1;
							method_ab_void(rsmodel, i_153_, i_154_, i_155_, 1, 1);
							if (boundaryobject.renderable2 instanceof OffScreenModel) {
								final OffScreenModel rsmodel_156_ = (OffScreenModel) boundaryobject.renderable2;
								method_ab_void(rsmodel_156_, i_153_, i_154_, i_155_, 1, 1);
								OffScreenModel.method_i_void(rsmodel, rsmodel_156_, 0, 0, 0, false);
								boundaryobject.renderable2 = (rsmodel_156_.method_ad_cg(rsmodel_156_.field_ao_1482, rsmodel_156_.field_ac_1483, i, i_151_, i_152_));
							}
							boundaryobject.renderable1 = rsmodel.method_ad_cg(rsmodel.field_ao_1482, rsmodel.field_ac_1483, i, i_151_, i_152_);
						}
						for (int i_157_ = 0; i_157_ < (groundtile.field_l_1107 * 780605197); i_157_++) {
							final SceneObject interactableobject = (groundtile.interactableObjects[i_157_]);
							if ((interactableobject != null) && (interactableobject.renderable instanceof OffScreenModel)) {
								final OffScreenModel rsmodel = (OffScreenModel) interactableobject.renderable;
								method_ab_void(rsmodel, i_153_, i_154_, i_155_, (((interactableobject.maxLocX * 600735749) - (interactableobject.x * 491968161)) + 1), (((interactableobject.maxLocY * 1143994841) - (interactableobject.y * -295550521)) + 1));
								interactableobject.renderable = rsmodel.method_ad_cg((rsmodel.field_ao_1482), (rsmodel.field_ac_1483), i, i_151_, i_152_);
							}
						}
						final GroundDecoration grounddecoration = groundtile.playerUpdateBlockHandler;
						if ((grounddecoration != null) && (grounddecoration.renderable instanceof OffScreenModel)) {
							final OffScreenModel rsmodel = (OffScreenModel) grounddecoration.renderable;
							method_as_void(rsmodel, i_153_, i_154_, i_155_);
							grounddecoration.renderable = rsmodel.method_ad_cg(rsmodel.field_ao_1482, rsmodel.field_ac_1483, i, i_151_, i_152_);
						}
					}
				}
			}
		}
	}

	void method_as_void(final OffScreenModel rsmodel, final int i, final int i_158_, final int i_159_) {
		if (i_158_ < this.field_z_1264) {
			final SceneTile groundtile = this.groundTiles[i][i_158_ + 1][i_159_];
			if ((groundtile != null) && (groundtile.playerUpdateBlockHandler != null) && (groundtile.playerUpdateBlockHandler.renderable instanceof OffScreenModel)) {
				final OffScreenModel rsmodel_160_ = ((OffScreenModel) groundtile.playerUpdateBlockHandler.renderable);
				OffScreenModel.method_i_void(rsmodel, rsmodel_160_, 128, 0, 0, true);
			}
		}
		if (i_159_ < this.field_z_1264) {
			final SceneTile groundtile = this.groundTiles[i][i_158_][i_159_ + 1];
			if ((groundtile != null) && (groundtile.playerUpdateBlockHandler != null) && (groundtile.playerUpdateBlockHandler.renderable instanceof OffScreenModel)) {
				final OffScreenModel rsmodel_161_ = ((OffScreenModel) groundtile.playerUpdateBlockHandler.renderable);
				OffScreenModel.method_i_void(rsmodel, rsmodel_161_, 0, 0, 128, true);
			}
		}
		if ((i_158_ < this.field_z_1264) && (i_159_ < this.field_y_1265)) {
			final SceneTile groundtile = this.groundTiles[i][i_158_ + 1][i_159_ + 1];
			if ((groundtile != null) && (groundtile.playerUpdateBlockHandler != null) && (groundtile.playerUpdateBlockHandler.renderable instanceof OffScreenModel)) {
				final OffScreenModel rsmodel_162_ = ((OffScreenModel) groundtile.playerUpdateBlockHandler.renderable);
				OffScreenModel.method_i_void(rsmodel, rsmodel_162_, 128, 0, 128, true);
			}
		}
		if ((i_158_ < this.field_z_1264) && (i_159_ > 0)) {
			final SceneTile groundtile = this.groundTiles[i][i_158_ + 1][i_159_ - 1];
			if ((groundtile != null) && (groundtile.playerUpdateBlockHandler != null) && (groundtile.playerUpdateBlockHandler.renderable instanceof OffScreenModel)) {
				final OffScreenModel rsmodel_163_ = ((OffScreenModel) groundtile.playerUpdateBlockHandler.renderable);
				OffScreenModel.method_i_void(rsmodel, rsmodel_163_, 128, 0, -128, true);
			}
		}
	}

	public void method_j_void(final int i, final int i_164_, final int i_165_, final int i_166_) {
		final SceneTile groundtile = this.groundTiles[i][i_164_][i_165_];
		if (groundtile != null) {
			final WallDecoration walldecoration = groundtile.wallDecoration;
			if (walldecoration != null) {
				walldecoration.field_g_820 = (((walldecoration.field_g_820 * 1384804177 * i_166_) / 16) * -2088748623);
				walldecoration.field_f_821 = (((walldecoration.field_f_821 * -1774608873 * i_166_) / 16) * -126387801);
			}
		}
	}

	static boolean method_az_boolean(final int i, final int i_167_, final int i_168_) {
		final int i_169_ = ((i_168_ * field_ae_1290) + (i * field_ax_1291)) >> 16;
		final int i_170_ = ((i_168_ * field_ax_1291) - (i * field_ae_1290)) >> 16;
		final int i_171_ = ((i_167_ * field_ad_1288) + (i_170_ * field_ak_1322)) >> 16;
						final int i_172_ = ((i_167_ * field_ak_1322) - (i_170_ * field_ad_1288)) >> 16;
			if ((i_171_ >= 50) && (i_171_ <= 3500)) {
				final int i_173_ = field_bj_1262 + ((i_169_ * Rasterizer3D.field_h_1146) / i_171_);
				final int i_174_ = field_ba_1319 + ((i_172_ * Rasterizer3D.field_h_1146) / i_171_);
				if ((i_173_ >= field_br_1300) && (i_173_ <= field_bn_1311) && (i_174_ >= field_bd_1321) && (i_174_ <= field_bu_1323)) {
					return true;
				}
				return false;
			}
			return false;
	}

	public void method_at_void(final int i, final int i_175_, final int i_176_) {
		field_ar_1309 = true;
		field_as_1294 = i;
		field_ab_1295 = i_175_;
		field_ao_1296 = i_176_;
		field_ac_1283 = -1;
		field_az_1298 = -1;
	}

	public void method_aa_void(int i, final int i_177_, int i_178_, final int i_179_, final int i_180_, final int i_181_) {
		if (i < 0) {
			i = 0;
		} else if (i >= (this.field_z_1264 * 128)) {
			i = (this.field_z_1264 * 128) - 1;
		}
		if (i_178_ < 0) {
			i_178_ = 0;
		} else if (i_178_ >= (this.field_y_1265 * 128)) {
			i_178_ = (this.field_y_1265 * 128) - 1;
		}
		field_j_1287++;
		field_ad_1288 = Rasterizer3D.SINE[i_179_];
		field_ak_1322 = Rasterizer3D.COSINE[i_179_];
		field_ae_1290 = Rasterizer3D.SINE[i_180_];
		field_ax_1291 = Rasterizer3D.COSINE[i_180_];
		field_bm_1317 = field_bw_1316[(i_179_ - 128) / 32][i_180_ / 64];
		field_t_1285 = i;
		field_w_1286 = i_177_;
		field_i_1293 = i_178_;
		field_o_1273 = i / 128;
		field_b_1284 = i_178_ / 128;
		field_r_1277 = i_181_;
		field_s_1313 = field_o_1273 - 25;
		if (field_s_1313 < 0) {
			field_s_1313 = 0;
		}
		field_c_1281 = field_b_1284 - 25;
		if (field_c_1281 < 0) {
			field_c_1281 = 0;
		}
		field_v_1280 = field_o_1273 + 25;
		if (field_v_1280 > this.field_z_1264) {
			field_v_1280 = this.field_z_1264;
		}
		field_p_1282 = field_b_1284 + 25;
		if (field_p_1282 > this.field_y_1265) {
			field_p_1282 = this.field_y_1265;
		}
		method_ay_void();
		field_x_1276 = 0;
		for (int i_182_ = this.field_f_1268; i_182_ < this.field_d_1263; i_182_++) {
			final SceneTile[][] groundtiles = this.groundTiles[i_182_];
			for (int i_183_ = field_s_1313; i_183_ < field_v_1280; i_183_++) {
				for (int i_184_ = field_c_1281; i_184_ < field_p_1282; i_184_++) {
					final SceneTile groundtile = groundtiles[i_183_][i_184_];
					if (groundtile != null) {
						if (((groundtile.field_x_1111 * -1986701381) <= i_181_) && ((field_bm_1317[(i_183_ - field_o_1273) + 25][(i_184_ - field_b_1284) + 25]) || (((this.field_e_1266[i_182_][i_183_][i_184_]) - i_177_) >= 2000))) {
							groundtile.field_r_1116 = true;
							groundtile.field_j_1113 = true;
							if ((groundtile.field_l_1107 * 780605197) > 0) {
								groundtile.field_s_1106 = true;
							} else {
								groundtile.field_s_1106 = false;
							}
							field_x_1276++;
						} else {
							groundtile.field_r_1116 = false;
							groundtile.field_j_1113 = false;
							groundtile.field_v_1108 = 0;
						}
					}
				}
			}
		}
		for (int i_185_ = this.field_f_1268; i_185_ < this.field_d_1263; i_185_++) {
			final SceneTile[][] groundtiles = this.groundTiles[i_185_];
			for (int i_186_ = -25; i_186_ <= 0; i_186_++) {
				final int i_187_ = field_o_1273 + i_186_;
				final int i_188_ = field_o_1273 - i_186_;
				if ((i_187_ >= field_s_1313) || (i_188_ < field_v_1280)) {
					for (int i_189_ = -25; i_189_ <= 0; i_189_++) {
						final int i_190_ = field_b_1284 + i_189_;
						final int i_191_ = field_b_1284 - i_189_;
						if (i_187_ >= field_s_1313) {
							if (i_190_ >= field_c_1281) {
								final SceneTile groundtile = groundtiles[i_187_][i_190_];
								if ((groundtile != null) && groundtile.field_r_1116) {
									method_an_void(groundtile, true);
								}
							}
							if (i_191_ < field_p_1282) {
								final SceneTile groundtile = groundtiles[i_187_][i_191_];
								if ((groundtile != null) && groundtile.field_r_1116) {
									method_an_void(groundtile, true);
								}
							}
						}
						if (i_188_ < field_v_1280) {
							if (i_190_ >= field_c_1281) {
								final SceneTile groundtile = groundtiles[i_188_][i_190_];
								if ((groundtile != null) && groundtile.field_r_1116) {
									method_an_void(groundtile, true);
								}
							}
							if (i_191_ < field_p_1282) {
								final SceneTile groundtile = groundtiles[i_188_][i_191_];
								if ((groundtile != null) && groundtile.field_r_1116) {
									method_an_void(groundtile, true);
								}
							}
						}
						if (field_x_1276 == 0) {
							field_ar_1309 = false;
							return;
						}
					}
				}
			}
		}
		for (int i_192_ = this.field_f_1268; i_192_ < this.field_d_1263; i_192_++) {
			final SceneTile[][] groundtiles = this.groundTiles[i_192_];
			for (int i_193_ = -25; i_193_ <= 0; i_193_++) {
				final int i_194_ = field_o_1273 + i_193_;
				final int i_195_ = field_o_1273 - i_193_;
				if ((i_194_ >= field_s_1313) || (i_195_ < field_v_1280)) {
					for (int i_196_ = -25; i_196_ <= 0; i_196_++) {
						final int i_197_ = field_b_1284 + i_196_;
						final int i_198_ = field_b_1284 - i_196_;
						if (i_194_ >= field_s_1313) {
							if (i_197_ >= field_c_1281) {
								final SceneTile groundtile = groundtiles[i_194_][i_197_];
								if ((groundtile != null) && groundtile.field_r_1116) {
									method_an_void(groundtile, false);
								}
							}
							if (i_198_ < field_p_1282) {
								final SceneTile groundtile = groundtiles[i_194_][i_198_];
								if ((groundtile != null) && groundtile.field_r_1116) {
									method_an_void(groundtile, false);
								}
							}
						}
						if (i_195_ < field_v_1280) {
							if (i_197_ >= field_c_1281) {
								final SceneTile groundtile = groundtiles[i_195_][i_197_];
								if ((groundtile != null) && groundtile.field_r_1116) {
									method_an_void(groundtile, false);
								}
							}
							if (i_198_ < field_p_1282) {
								final SceneTile groundtile = groundtiles[i_195_][i_198_];
								if ((groundtile != null) && groundtile.field_r_1116) {
									method_an_void(groundtile, false);
								}
							}
						}
						if (field_x_1276 == 0) {
							field_ar_1309 = false;
							return;
						}
					}
				}
			}
		}
		field_ar_1309 = false;
	}

	void method_an_void(final SceneTile groundtile, boolean bool) {
		field_ay_1306.add(groundtile);
		while_17_: for (;;) {
			final SceneTile groundtile_199_ = (SceneTile) field_ay_1306.method_e_ga();
			if (groundtile_199_ == null) {
				break;
			}
			if (groundtile_199_.field_j_1113) {
				final int i = groundtile_199_.field_d_1098 * -245357165;
				final int i_200_ = groundtile_199_.field_y_1119 * -827428721;
				final int i_201_ = (groundtile_199_.field_n_1101 * -2098477277);
				final int i_202_ = groundtile_199_.field_z_1100 * 2028330459;
				final SceneTile[][] groundtiles = this.groundTiles[i_201_];
				if (groundtile_199_.field_r_1116) {
					if (bool) {
						if (i_201_ > 0) {
							final SceneTile groundtile_203_ = (this.groundTiles[i_201_ - 1][i][i_200_]);
							if ((groundtile_203_ != null) && groundtile_203_.field_j_1113) {
								continue;
							}
						}
						if ((i <= field_o_1273) && (i > field_s_1313)) {
							final SceneTile groundtile_204_ = groundtiles[i - 1][i_200_];
							if ((groundtile_204_ != null) && groundtile_204_.field_j_1113 && (groundtile_204_.field_r_1116 || ((((groundtile_199_.field_k_1110) * -422367583) & 0x1) == 0))) {
								continue;
							}
						}
						if ((i >= field_o_1273) && (i < (field_v_1280 - 1))) {
							final SceneTile groundtile_205_ = groundtiles[i + 1][i_200_];
							if ((groundtile_205_ != null) && groundtile_205_.field_j_1113 && (groundtile_205_.field_r_1116 || ((((groundtile_199_.field_k_1110) * -422367583) & 0x4) == 0))) {
								continue;
							}
						}
						if ((i_200_ <= field_b_1284) && (i_200_ > field_c_1281)) {
							final SceneTile groundtile_206_ = groundtiles[i][i_200_ - 1];
							if ((groundtile_206_ != null) && groundtile_206_.field_j_1113 && (groundtile_206_.field_r_1116 || ((((groundtile_199_.field_k_1110) * -422367583) & 0x8) == 0))) {
								continue;
							}
						}
						if ((i_200_ >= field_b_1284) && (i_200_ < (field_p_1282 - 1))) {
							final SceneTile groundtile_207_ = groundtiles[i][i_200_ + 1];
							if ((groundtile_207_ != null) && groundtile_207_.field_j_1113 && (groundtile_207_.field_r_1116 || ((((groundtile_199_.field_k_1110) * -422367583) & 0x2) == 0))) {
								continue;
							}
						}
					} else {
						bool = true;
					}
					groundtile_199_.field_r_1116 = false;
					if (groundtile_199_.floorDecoration != null) {
						final SceneTile groundtile_208_ = groundtile_199_.floorDecoration;
						if (groundtile_208_.field_e_1097 != null) {
							if (!method_am_boolean(0, i, i_200_)) {
								method_aw_void((groundtile_208_.field_e_1097), 0, field_ad_1288, field_ak_1322, field_ae_1290, field_ax_1291, i, i_200_);
							}
						} else if ((groundtile_208_.boundary != null) && !method_am_boolean(0, i, i_200_)) {
							method_ai_void((groundtile_208_.boundary), field_ad_1288, field_ak_1322, field_ae_1290, field_ax_1291, i, i_200_);
						}
						final Boundary boundaryobject = groundtile_208_.boundaryObject;
						if (boundaryobject != null) {
							boundaryobject.renderable1.method_o_void(0, field_ad_1288, field_ak_1322, field_ae_1290, field_ax_1291, ((boundaryobject.field_d_1513) * 1353547363) - field_t_1285, ((boundaryobject.field_n_1519) * -1679516177) - field_w_1286, ((boundaryobject.field_y_1518) * -1775972329) - field_i_1293, boundaryobject.uid * -832076175);
						}
						for (int i_209_ = 0; (i_209_ < (groundtile_208_.field_l_1107 * 780605197)); i_209_++) {
							final SceneObject interactableobject = (groundtile_208_.interactableObjects[i_209_]);
							if (interactableobject != null) {
								interactableobject.renderable.method_o_void((interactableobject.orientation) * 2004448203, field_ad_1288, field_ak_1322, field_ae_1290, field_ax_1291, ((interactableobject.gridX) * 938652139) - field_t_1285, (interactableobject.height * -309726669) - field_w_1286, (interactableobject.gridY * -946021949) - field_i_1293, interactableobject.uid
										* -1513499455);
							}
						}
					}
					boolean bool_210_ = false;
					if (groundtile_199_.field_e_1097 != null) {
						if (!method_am_boolean(i_202_, i, i_200_)) {
							bool_210_ = true;
							if ((((groundtile_199_.field_e_1097).field_z_1212 * 763873353) != 12345678) || (field_ar_1309 && (i_201_ <= field_as_1294))) {
								method_aw_void((groundtile_199_.field_e_1097), i_202_, field_ad_1288, field_ak_1322, field_ae_1290, field_ax_1291, i, i_200_);
							}
						}
					} else if ((groundtile_199_.boundary != null) && !method_am_boolean(i_202_, i, i_200_)) {
						bool_210_ = true;
						method_ai_void((groundtile_199_.boundary), field_ad_1288, field_ak_1322, field_ae_1290, field_ax_1291, i, i_200_);
					}
					int i_211_ = 0;
					int i_212_ = 0;
					final Boundary boundaryobject = groundtile_199_.boundaryObject;
					final WallDecoration walldecoration = groundtile_199_.wallDecoration;
					if ((boundaryobject != null) || (walldecoration != null)) {
						if (field_o_1273 == i) {
							i_211_++;
						} else if (field_o_1273 < i) {
							i_211_ += 2;
						}
						if (field_b_1284 == i_200_) {
							i_211_ += 3;
						} else if (field_b_1284 > i_200_) {
							i_211_ += 6;
						}
						i_212_ = field_am_1307[i_211_];
						groundtile_199_.field_o_1118 = field_ag_1274[i_211_] * -2062049535;
					}
					if (boundaryobject != null) {
						if (((boundaryobject.field_z_1515 * 179303341) & field_aj_1308[i_211_]) != 0) {
							if ((boundaryobject.field_z_1515 * 179303341) == 16) {
								groundtile_199_.field_v_1108 = 1800683889;
								groundtile_199_.field_c_1117 = field_ap_1310[i_211_] * -621354257;
								groundtile_199_.field_p_1114 = (373624299 - ((groundtile_199_.field_c_1117) * -2140180073));
							} else if (((boundaryobject.field_z_1515) * 179303341) == 32) {
								groundtile_199_.field_v_1108 = -693599518;
								groundtile_199_.field_c_1117 = field_af_1315[i_211_] * -621354257;
								groundtile_199_.field_p_1114 = (747248598 - ((groundtile_199_.field_c_1117) * -2140180073));
							} else if (((boundaryobject.field_z_1515) * 179303341) == 64) {
								groundtile_199_.field_v_1108 = -1387199036;
								groundtile_199_.field_c_1117 = field_au_1312[i_211_] * -621354257;
								groundtile_199_.field_p_1114 = (1494497196 - ((groundtile_199_.field_c_1117) * -2140180073));
							} else {
								groundtile_199_.field_v_1108 = 1107084371;
								groundtile_199_.field_c_1117 = field_av_1279[i_211_] * -621354257;
								groundtile_199_.field_p_1114 = (1120872897 - ((groundtile_199_.field_c_1117) * -2140180073));
							}
						} else {
							groundtile_199_.field_v_1108 = 0;
						}
						if ((((boundaryobject.field_z_1515 * 179303341) & i_212_) != 0) && !method_aj_boolean(i_202_, i, i_200_, (boundaryobject.field_z_1515) * 179303341)) {
							boundaryobject.renderable1.method_o_void(0, field_ad_1288, field_ak_1322, field_ae_1290, field_ax_1291, ((boundaryobject.field_d_1513) * 1353547363) - field_t_1285, ((boundaryobject.field_n_1519) * -1679516177) - field_w_1286, ((boundaryobject.field_y_1518) * -1775972329) - field_i_1293, boundaryobject.uid * -832076175);
						}
						if ((((boundaryobject.field_e_1516 * 827633255) & i_212_) != 0) && !method_aj_boolean(i_202_, i, i_200_, (boundaryobject.field_e_1516) * 827633255)) {
							boundaryobject.renderable2.method_o_void(0, field_ad_1288, field_ak_1322, field_ae_1290, field_ax_1291, ((boundaryobject.field_d_1513) * 1353547363) - field_t_1285, ((boundaryobject.field_n_1519) * -1679516177) - field_w_1286, ((boundaryobject.field_y_1518) * -1775972329) - field_i_1293, boundaryobject.uid * -832076175);
						}
					}
					if ((walldecoration != null) && !method_ag_boolean(i_202_, i, i_200_, (walldecoration.renderable2.modelHeight) * -1707560315)) {
						if (((walldecoration.field_z_818 * -764224719) & i_212_) != 0) {
							walldecoration.renderable2.method_o_void(0, field_ad_1288, field_ak_1322, field_ae_1290, field_ax_1291, ((((walldecoration.field_d_816) * 808231771) - field_t_1285) + ((walldecoration.field_g_820) * 1384804177)), (walldecoration.field_n_823 * 174208601) - field_w_1286,
									((((walldecoration.field_y_815) * 519260461) - field_i_1293) + ((walldecoration.field_f_821) * -1774608873)), walldecoration.uid * -298307543);
						} else if ((walldecoration.field_z_818 * -764224719) == 256) {
							final int i_213_ = (((walldecoration.field_d_816) * 808231771) - field_t_1285);
							final int i_214_ = (((walldecoration.field_n_823) * 174208601) - field_w_1286);
							final int i_215_ = (((walldecoration.field_y_815) * 519260461) - field_i_1293);
							final int i_216_ = ((walldecoration.field_e_822) * 1687761105);
							int i_217_;
							if ((i_216_ != 1) && (i_216_ != 2)) {
								i_217_ = i_213_;
							} else {
								i_217_ = -i_213_;
							}
							int i_218_;
							if ((i_216_ != 2) && (i_216_ != 3)) {
								i_218_ = i_215_;
							} else {
								i_218_ = -i_215_;
							}
							if (i_218_ < i_217_) {
								walldecoration.renderable2.method_o_void(0, field_ad_1288, field_ak_1322, field_ae_1290, field_ax_1291, (i_213_ + ((walldecoration.field_g_820) * 1384804177)), i_214_, (i_215_ + ((walldecoration.field_f_821) * -1774608873)), walldecoration.uid * -298307543);
							} else if (walldecoration.renderable1 != null) {
								walldecoration.renderable1.method_o_void(0, field_ad_1288, field_ak_1322, field_ae_1290, field_ax_1291, i_213_, i_214_, i_215_, walldecoration.uid * -298307543);
							}
						}
					}
					if (bool_210_) {
						final GroundDecoration grounddecoration = groundtile_199_.playerUpdateBlockHandler;
						if (grounddecoration != null) {
							grounddecoration.renderable.method_o_void(0, field_ad_1288, field_ak_1322, field_ae_1290, field_ax_1291, ((grounddecoration.field_d_851) * 1545636305) - field_t_1285, ((grounddecoration.field_n_850) * 855141589) - field_w_1286, ((grounddecoration.field_y_847) * 1320506829) - field_i_1293, grounddecoration.uid * 840235263);
						}
						final Class_cx class_cx = groundtile_199_.field_h_1109;
						if ((class_cx != null) && ((class_cx.field_m_1432 * -974858693) == 0)) {
							if (class_cx.field_e_1430 != null) {
								class_cx.field_e_1430.method_o_void(0, field_ad_1288, field_ak_1322, field_ae_1290, field_ax_1291, (class_cx.field_d_1427 * -542924099) - field_t_1285, (class_cx.field_n_1428 * -86999259) - field_w_1286, (class_cx.field_y_1435 * -1684882027) - field_i_1293, (class_cx.field_f_1433 * -1109128119));
							}
							if (class_cx.field_g_1426 != null) {
								class_cx.field_g_1426.method_o_void(0, field_ad_1288, field_ak_1322, field_ae_1290, field_ax_1291, (class_cx.field_d_1427 * -542924099) - field_t_1285, (class_cx.field_n_1428 * -86999259) - field_w_1286, (class_cx.field_y_1435 * -1684882027) - field_i_1293, (class_cx.field_f_1433 * -1109128119));
							}
							if (class_cx.field_z_1429 != null) {
								class_cx.field_z_1429.method_o_void(0, field_ad_1288, field_ak_1322, field_ae_1290, field_ax_1291, (class_cx.field_d_1427 * -542924099) - field_t_1285, (class_cx.field_n_1428 * -86999259) - field_w_1286, (class_cx.field_y_1435 * -1684882027) - field_i_1293, (class_cx.field_f_1433 * -1109128119));
							}
						}
					}
					final int i_219_ = (groundtile_199_.field_k_1110 * -422367583);
					if (i_219_ != 0) {
						if ((i < field_o_1273) && ((i_219_ & 0x4) != 0)) {
							final SceneTile groundtile_220_ = groundtiles[i + 1][i_200_];
							if ((groundtile_220_ != null) && groundtile_220_.field_j_1113) {
								field_ay_1306.add(groundtile_220_);
							}
						}
						if ((i_200_ < field_b_1284) && ((i_219_ & 0x2) != 0)) {
							final SceneTile groundtile_221_ = groundtiles[i][i_200_ + 1];
							if ((groundtile_221_ != null) && groundtile_221_.field_j_1113) {
								field_ay_1306.add(groundtile_221_);
							}
						}
						if ((i > field_o_1273) && ((i_219_ & 0x1) != 0)) {
							final SceneTile groundtile_222_ = groundtiles[i - 1][i_200_];
							if ((groundtile_222_ != null) && groundtile_222_.field_j_1113) {
								field_ay_1306.add(groundtile_222_);
							}
						}
						if ((i_200_ > field_b_1284) && ((i_219_ & 0x8) != 0)) {
							final SceneTile groundtile_223_ = groundtiles[i][i_200_ - 1];
							if ((groundtile_223_ != null) && groundtile_223_.field_j_1113) {
								field_ay_1306.add(groundtile_223_);
							}
						}
					}
				}
				if ((groundtile_199_.field_v_1108 * 1167793843) != 0) {
					boolean bool_224_ = true;
					for (int i_225_ = 0; i_225_ < (groundtile_199_.field_l_1107 * 780605197); i_225_++) {
						if ((((groundtile_199_.interactableObjects[i_225_]).field_u_946 * -398916401) != field_j_1287) && (((groundtile_199_.field_q_1115[i_225_]) & (groundtile_199_.field_v_1108 * 1167793843)) == (groundtile_199_.field_c_1117 * 2003995663))) {
							bool_224_ = false;
							break;
						}
					}
					if (bool_224_) {
						final Boundary boundaryobject = groundtile_199_.boundaryObject;
						if (!method_aj_boolean(i_202_, i, i_200_, (boundaryobject.field_z_1515 * 179303341))) {
							boundaryobject.renderable1.method_o_void(0, field_ad_1288, field_ak_1322, field_ae_1290, field_ax_1291, ((boundaryobject.field_d_1513) * 1353547363) - field_t_1285, ((boundaryobject.field_n_1519) * -1679516177) - field_w_1286, ((boundaryobject.field_y_1518) * -1775972329) - field_i_1293, boundaryobject.uid * -832076175);
						}
						groundtile_199_.field_v_1108 = 0;
					}
				}
				do {
					if (groundtile_199_.field_s_1106) {
						try {
							final int i_226_ = (groundtile_199_.field_l_1107 * 780605197);
							groundtile_199_.field_s_1106 = false;
							int i_227_ = 0;
							while_16_: for (int i_228_ = 0; i_228_ < i_226_; i_228_++) {
								final SceneObject interactableobject = (groundtile_199_.interactableObjects[i_228_]);
								if (((interactableobject.field_u_946) * -398916401) != field_j_1287) {
									for (int i_229_ = (interactableobject.x * 491968161); i_229_ <= ((interactableobject.maxLocX) * 600735749); i_229_++) {
										for (int i_230_ = (interactableobject.y * -295550521); i_230_ <= ((interactableobject.maxLocY) * 1143994841); i_230_++) {
											final SceneTile groundtile_231_ = groundtiles[i_229_][i_230_];
											if (groundtile_231_.field_r_1116) {
												groundtile_199_.field_s_1106 = true;
												continue while_16_;
											}
											if (((groundtile_231_.field_v_1108) * 1167793843) != 0) {
												int i_232_ = 0;
												if (i_229_ > (interactableobject.x * 491968161)) {
													i_232_++;
												}
												if (i_229_ < ((interactableobject.maxLocX) * 600735749)) {
													i_232_ += 4;
												}
												if (i_230_ > (interactableobject.y * -295550521)) {
													i_232_ += 8;
												}
												if (i_230_ < ((interactableobject.maxLocY) * 1143994841)) {
													i_232_ += 2;
												}
												if ((i_232_ & ((groundtile_231_.field_v_1108) * 1167793843)) == ((groundtile_199_.field_p_1114) * -104654775)) {
													groundtile_199_.field_s_1106 = true;
													continue while_16_;
												}
											}
										}
									}
									field_al_1292[i_227_++] = interactableobject;
									int i_233_ = field_o_1273 - ((interactableobject.x) * 491968161);
									final int i_234_ = ((interactableobject.maxLocX * 600735749) - field_o_1273);
									if (i_234_ > i_233_) {
										i_233_ = i_234_;
									}
									final int i_235_ = field_b_1284 - ((interactableobject.y) * -295550521);
									final int i_236_ = ((interactableobject.maxLocY * 1143994841) - field_b_1284);
									if (i_236_ > i_235_) {
										interactableobject.field_l_938 = (i_233_ + i_236_) * -1226945155;
									} else {
										interactableobject.field_l_938 = (i_233_ + i_235_) * -1226945155;
									}
								}
							}
							while (i_227_ > 0) {
								int i_237_ = -50;
								int i_238_ = -1;
								for (int i_239_ = 0; i_239_ < i_227_; i_239_++) {
									final SceneObject interactableobject = field_al_1292[i_239_];
									if ((interactableobject.field_u_946 * -398916401) != field_j_1287) {
										if ((interactableobject.field_l_938 * -1984801835) > i_237_) {
											i_237_ = (interactableobject.field_l_938) * -1984801835;
											i_238_ = i_239_;
										} else if (((interactableobject.field_l_938) * -1984801835) == i_237_) {
											final int i_240_ = (((interactableobject.gridX) * 938652139) - field_t_1285);
											final int i_241_ = (((interactableobject.gridY) * -946021949) - field_i_1293);
											final int i_242_ = (((field_al_1292[i_238_].gridX) * 938652139) - field_t_1285);
											final int i_243_ = (((field_al_1292[i_238_].gridY) * -946021949) - field_i_1293);
											if (((i_240_ * i_240_) + (i_241_ * i_241_)) > ((i_242_ * i_242_) + (i_243_ * i_243_))) {
												i_238_ = i_239_;
											}
										}
									}
								}
								if (i_238_ == -1) {
									break;
								}
								final SceneObject interactableobject = field_al_1292[i_238_];
								interactableobject.field_u_946 = field_j_1287 * -113671633;
								if (!method_ap_boolean(i_202_, (interactableobject.x * 491968161), (interactableobject.maxLocX) * 600735749, (interactableobject.y * -295550521), (interactableobject.maxLocY) * 1143994841, ((interactableobject.renderable.modelHeight) * -1707560315))) {
									interactableobject.renderable.method_o_void((interactableobject.orientation * 2004448203), field_ad_1288, field_ak_1322, field_ae_1290, field_ax_1291, (interactableobject.gridX * 938652139) - field_t_1285, (interactableobject.height * -309726669) - field_w_1286, (interactableobject.gridY * -946021949) - field_i_1293, interactableobject.uid
											* -1513499455);
								}
								for (int i_244_ = (interactableobject.x * 491968161); i_244_ <= (interactableobject.maxLocX * 600735749); i_244_++) {
									for (int i_245_ = (interactableobject.y * -295550521); i_245_ <= ((interactableobject.maxLocY) * 1143994841); i_245_++) {
										final SceneTile groundtile_246_ = groundtiles[i_244_][i_245_];
										if (((groundtile_246_.field_v_1108) * 1167793843) != 0) {
											field_ay_1306.add(groundtile_246_);
										} else if (((i_244_ != i) || (i_245_ != i_200_)) && (groundtile_246_.field_j_1113)) {
											field_ay_1306.add(groundtile_246_);
										}
									}
								}
							}
							if (!groundtile_199_.field_s_1106) {
								break;
							}
						} catch (final Exception exception) {
							groundtile_199_.field_s_1106 = false;
							break;
						}
						continue while_17_;
					}
				} while (false);
				if (groundtile_199_.field_j_1113 && ((groundtile_199_.field_v_1108 * 1167793843) == 0)) {
					if ((i <= field_o_1273) && (i > field_s_1313)) {
						final SceneTile groundtile_247_ = groundtiles[i - 1][i_200_];
						if ((groundtile_247_ != null) && groundtile_247_.field_j_1113) {
							continue;
						}
					}
					if ((i >= field_o_1273) && (i < (field_v_1280 - 1))) {
						final SceneTile groundtile_248_ = groundtiles[i + 1][i_200_];
						if ((groundtile_248_ != null) && groundtile_248_.field_j_1113) {
							continue;
						}
					}
					if ((i_200_ <= field_b_1284) && (i_200_ > field_c_1281)) {
						final SceneTile groundtile_249_ = groundtiles[i][i_200_ - 1];
						if ((groundtile_249_ != null) && groundtile_249_.field_j_1113) {
							continue;
						}
					}
					if ((i_200_ >= field_b_1284) && (i_200_ < (field_p_1282 - 1))) {
						final SceneTile groundtile_250_ = groundtiles[i][i_200_ + 1];
						if ((groundtile_250_ != null) && groundtile_250_.field_j_1113) {
							continue;
						}
					}
					groundtile_199_.field_j_1113 = false;
					field_x_1276--;
					final Class_cx class_cx = groundtile_199_.field_h_1109;
					if ((class_cx != null) && ((class_cx.field_m_1432 * -974858693) != 0)) {
						if (class_cx.field_e_1430 != null) {
							class_cx.field_e_1430.method_o_void(0, field_ad_1288, field_ak_1322, field_ae_1290, field_ax_1291, (class_cx.field_d_1427 * -542924099) - field_t_1285, ((class_cx.field_n_1428 * -86999259) - field_w_1286 - (class_cx.field_m_1432 * -974858693)), (class_cx.field_y_1435 * -1684882027) - field_i_1293, (class_cx.field_f_1433 * -1109128119));
						}
						if (class_cx.field_g_1426 != null) {
							class_cx.field_g_1426.method_o_void(0, field_ad_1288, field_ak_1322, field_ae_1290, field_ax_1291, (class_cx.field_d_1427 * -542924099) - field_t_1285, ((class_cx.field_n_1428 * -86999259) - field_w_1286 - (class_cx.field_m_1432 * -974858693)), (class_cx.field_y_1435 * -1684882027) - field_i_1293, (class_cx.field_f_1433 * -1109128119));
						}
						if (class_cx.field_z_1429 != null) {
							class_cx.field_z_1429.method_o_void(0, field_ad_1288, field_ak_1322, field_ae_1290, field_ax_1291, (class_cx.field_d_1427 * -542924099) - field_t_1285, ((class_cx.field_n_1428 * -86999259) - field_w_1286 - (class_cx.field_m_1432 * -974858693)), (class_cx.field_y_1435 * -1684882027) - field_i_1293, (class_cx.field_f_1433 * -1109128119));
						}
					}
					if ((groundtile_199_.field_o_1118 * -1867947775) != 0) {
						final WallDecoration walldecoration = groundtile_199_.wallDecoration;
						if ((walldecoration != null) && !method_ag_boolean(i_202_, i, i_200_, ((walldecoration.renderable2.modelHeight) * -1707560315))) {
							if (((walldecoration.field_z_818 * -764224719) & (groundtile_199_.field_o_1118 * -1867947775)) != 0) {
								walldecoration.renderable2.method_o_void(0, field_ad_1288, field_ak_1322, field_ae_1290, field_ax_1291, ((((walldecoration.field_d_816) * 808231771) - field_t_1285) + ((walldecoration.field_g_820) * 1384804177)), ((walldecoration.field_n_823) * 174208601) - field_w_1286,
										((((walldecoration.field_y_815) * 519260461) - field_i_1293) + ((walldecoration.field_f_821) * -1774608873)), walldecoration.uid * -298307543);
							} else if (((walldecoration.field_z_818) * -764224719) == 256) {
								final int i_251_ = (((walldecoration.field_d_816) * 808231771) - field_t_1285);
								final int i_252_ = (((walldecoration.field_n_823) * 174208601) - field_w_1286);
								final int i_253_ = (((walldecoration.field_y_815) * 519260461) - field_i_1293);
								final int i_254_ = (walldecoration.field_e_822) * 1687761105;
								int i_255_;
								if ((i_254_ != 1) && (i_254_ != 2)) {
									i_255_ = i_251_;
								} else {
									i_255_ = -i_251_;
								}
								int i_256_;
								if ((i_254_ != 2) && (i_254_ != 3)) {
									i_256_ = i_253_;
								} else {
									i_256_ = -i_253_;
								}
								if (i_256_ >= i_255_) {
									walldecoration.renderable2.method_o_void(0, field_ad_1288, field_ak_1322, field_ae_1290, field_ax_1291, (i_251_ + ((walldecoration.field_g_820) * 1384804177)), i_252_, (i_253_ + ((walldecoration.field_f_821) * -1774608873)), walldecoration.uid * -298307543);
								} else if (walldecoration.renderable1 != null) {
									walldecoration.renderable1.method_o_void(0, field_ad_1288, field_ak_1322, field_ae_1290, field_ax_1291, i_251_, i_252_, i_253_, walldecoration.uid * -298307543);
								}
							}
						}
						final Boundary boundaryobject = groundtile_199_.boundaryObject;
						if (boundaryobject != null) {
							if (((((boundaryobject.field_e_1516) * 827633255) & (groundtile_199_.field_o_1118 * -1867947775)) != 0) && !method_aj_boolean(i_202_, i, i_200_, ((boundaryobject.field_e_1516) * 827633255))) {
								boundaryobject.renderable2.method_o_void(0, field_ad_1288, field_ak_1322, field_ae_1290, field_ax_1291, (((boundaryobject.field_d_1513) * 1353547363) - field_t_1285), (((boundaryobject.field_n_1519) * -1679516177) - field_w_1286), (((boundaryobject.field_y_1518) * -1775972329) - field_i_1293), boundaryobject.uid * -832076175);
							}
							if (((((boundaryobject.field_z_1515) * 179303341) & (groundtile_199_.field_o_1118 * -1867947775)) != 0) && !method_aj_boolean(i_202_, i, i_200_, ((boundaryobject.field_z_1515) * 179303341))) {
								boundaryobject.renderable1.method_o_void(0, field_ad_1288, field_ak_1322, field_ae_1290, field_ax_1291, (((boundaryobject.field_d_1513) * 1353547363) - field_t_1285), (((boundaryobject.field_n_1519) * -1679516177) - field_w_1286), (((boundaryobject.field_y_1518) * -1775972329) - field_i_1293), boundaryobject.uid * -832076175);
							}
						}
					}
					if (i_201_ < (this.field_d_1263 - 1)) {
						final SceneTile groundtile_257_ = (this.groundTiles[i_201_ + 1][i][i_200_]);
						if ((groundtile_257_ != null) && groundtile_257_.field_j_1113) {
							field_ay_1306.add(groundtile_257_);
						}
					}
					if (i < field_o_1273) {
						final SceneTile groundtile_258_ = groundtiles[i + 1][i_200_];
						if ((groundtile_258_ != null) && groundtile_258_.field_j_1113) {
							field_ay_1306.add(groundtile_258_);
						}
					}
					if (i_200_ < field_b_1284) {
						final SceneTile groundtile_259_ = groundtiles[i][i_200_ + 1];
						if ((groundtile_259_ != null) && groundtile_259_.field_j_1113) {
							field_ay_1306.add(groundtile_259_);
						}
					}
					if (i > field_o_1273) {
						final SceneTile groundtile_260_ = groundtiles[i - 1][i_200_];
						if ((groundtile_260_ != null) && groundtile_260_.field_j_1113) {
							field_ay_1306.add(groundtile_260_);
						}
					}
					if (i_200_ > field_b_1284) {
						final SceneTile groundtile_261_ = groundtiles[i][i_200_ - 1];
						if ((groundtile_261_ != null) && groundtile_261_.field_j_1113) {
							field_ay_1306.add(groundtile_261_);
						}
					}
				}
			}
		}
	}

	public void method_ao_void(final int[] is, int i, final int i_262_, final int i_263_, final int i_264_, final int i_265_) {
		final SceneTile groundtile = this.groundTiles[i_263_][i_264_][i_265_];
		if (groundtile != null) {
			final Class_cq class_cq = groundtile.field_e_1097;
			if (class_cq != null) {
				final int i_266_ = class_cq.field_f_1216 * -2028890927;
				if (i_266_ != 0) {
					for (int i_267_ = 0; i_267_ < 4; i_267_++) {
						is[i] = i_266_;
						is[i + 1] = i_266_;
						is[i + 2] = i_266_;
						is[i + 3] = i_266_;
						i += i_262_;
					}
				}
			} else {
				final Class_cv class_cv = groundtile.boundary;
				if (class_cv != null) {
					final int i_268_ = class_cv.field_u_1376;
					final int i_269_ = class_cv.field_q_1377;
					final int i_270_ = class_cv.field_k_1378;
					final int i_271_ = class_cv.field_x_1379;
					final int[] is_272_ = this.field_bs_1314[i_268_];
					final int[] is_273_ = this.field_bo_1302[i_269_];
					int i_274_ = 0;
					if (i_270_ != 0) {
						for (int i_275_ = 0; i_275_ < 4; i_275_++) {
							is[i] = (is_272_[is_273_[i_274_++]] == 0 ? i_270_ : i_271_);
							is[i + 1] = (is_272_[is_273_[i_274_++]] == 0 ? i_270_ : i_271_);
							is[i + 2] = (is_272_[is_273_[i_274_++]] == 0 ? i_270_ : i_271_);
							is[i + 3] = (is_272_[is_273_[i_274_++]] == 0 ? i_270_ : i_271_);
							i += i_262_;
						}
					} else {
						for (int i_276_ = 0; i_276_ < 4; i_276_++) {
							if (is_272_[is_273_[i_274_++]] != 0) {
								is[i] = i_271_;
							}
							if (is_272_[is_273_[i_274_++]] != 0) {
								is[i + 1] = i_271_;
							}
							if (is_272_[is_273_[i_274_++]] != 0) {
								is[i + 2] = i_271_;
							}
							if (is_272_[is_273_[i_274_++]] != 0) {
								is[i + 3] = i_271_;
							}
							i += i_262_;
						}
					}
				}
			}
		}
	}

	static final int method_ah_int(final int i, int i_277_) {
		i_277_ = (i_277_ * (i & 0x7f)) >> 7;
						if (i_277_ < 2) {
							i_277_ = 2;
						} else if (i_277_ > 126) {
							i_277_ = 126;
						}
						return (i & 0xff80) + i_277_;
	}

	boolean method_aq_boolean(final int i, final int i_278_, final int i_279_, final int i_280_, final int i_281_, final int i_282_, final int i_283_, final int i_284_) {
		if ((i_278_ < i_279_) && (i_278_ < i_280_) && (i_278_ < i_281_)) {
			return false;
		}
		if ((i_278_ > i_279_) && (i_278_ > i_280_) && (i_278_ > i_281_)) {
			return false;
		}
		if ((i < i_282_) && (i < i_283_) && (i < i_284_)) {
			return false;
		}
		if ((i > i_282_) && (i > i_283_) && (i > i_284_)) {
			return false;
		}
		final int i_285_ = (((i_278_ - i_279_) * (i_283_ - i_282_)) - ((i - i_282_) * (i_280_ - i_279_)));
		final int i_286_ = (((i_278_ - i_281_) * (i_282_ - i_284_)) - ((i - i_284_) * (i_279_ - i_281_)));
		final int i_287_ = (((i_278_ - i_280_) * (i_284_ - i_283_)) - ((i - i_283_) * (i_281_ - i_280_)));
		if (((i_285_ * i_287_) > 0) && ((i_287_ * i_286_) > 0)) {
			return true;
		}
		return false;
	}

	public int method_ax_int(final int i, final int i_288_, final int i_289_) {
		final SceneTile groundtile = this.groundTiles[i][i_288_][i_289_];
		return (((groundtile != null) && (groundtile.playerUpdateBlockHandler != null)) ? groundtile.playerUpdateBlockHandler.uid * 840235263 : 0);
	}

	public void method_x_void() {
		for (int i = 0; i < this.field_m_1269; i++) {
			final SceneObject interactableobject = this.sceneObjects[i];
			method_r_void(interactableobject);
			this.sceneObjects[i] = null;
		}
		this.field_m_1269 = 0;
	}

	boolean method_aj_boolean(final int i, final int i_290_, final int i_291_, final int i_292_) {
		if (!method_am_boolean(i, i_290_, i_291_)) {
			return false;
		}
		final int i_293_ = i_290_ << 7;
		final int i_294_ = i_291_ << 7;
		final int i_295_ = this.field_e_1266[i][i_290_][i_291_] - 1;
		final int i_296_ = i_295_ - 120;
		final int i_297_ = i_295_ - 230;
		final int i_298_ = i_295_ - 238;
		if (i_292_ < 16) {
			if (i_292_ == 1) {
				if (i_293_ > field_t_1285) {
					if (!method_af_boolean(i_293_, i_295_, i_294_)) {
						return false;
					}
					if (!method_af_boolean(i_293_, i_295_, i_294_ + 128)) {
						return false;
					}
				}
				if (i > 0) {
					if (!method_af_boolean(i_293_, i_296_, i_294_)) {
						return false;
					}
					if (!method_af_boolean(i_293_, i_296_, i_294_ + 128)) {
						return false;
					}
				}
				if (!method_af_boolean(i_293_, i_297_, i_294_)) {
					return false;
				}
				if (!method_af_boolean(i_293_, i_297_, i_294_ + 128)) {
					return false;
				}
				return true;
			}
			if (i_292_ == 2) {
				if (i_294_ < field_i_1293) {
					if (!method_af_boolean(i_293_, i_295_, i_294_ + 128)) {
						return false;
					}
					if (!method_af_boolean(i_293_ + 128, i_295_, i_294_ + 128)) {
						return false;
					}
				}
				if (i > 0) {
					if (!method_af_boolean(i_293_, i_296_, i_294_ + 128)) {
						return false;
					}
					if (!method_af_boolean(i_293_ + 128, i_296_, i_294_ + 128)) {
						return false;
					}
				}
				if (!method_af_boolean(i_293_, i_297_, i_294_ + 128)) {
					return false;
				}
				if (!method_af_boolean(i_293_ + 128, i_297_, i_294_ + 128)) {
					return false;
				}
				return true;
			}
			if (i_292_ == 4) {
				if (i_293_ < field_t_1285) {
					if (!method_af_boolean(i_293_ + 128, i_295_, i_294_)) {
						return false;
					}
					if (!method_af_boolean(i_293_ + 128, i_295_, i_294_ + 128)) {
						return false;
					}
				}
				if (i > 0) {
					if (!method_af_boolean(i_293_ + 128, i_296_, i_294_)) {
						return false;
					}
					if (!method_af_boolean(i_293_ + 128, i_296_, i_294_ + 128)) {
						return false;
					}
				}
				if (!method_af_boolean(i_293_ + 128, i_297_, i_294_)) {
					return false;
				}
				if (!method_af_boolean(i_293_ + 128, i_297_, i_294_ + 128)) {
					return false;
				}
				return true;
			}
			if (i_292_ == 8) {
				if (i_294_ > field_i_1293) {
					if (!method_af_boolean(i_293_, i_295_, i_294_)) {
						return false;
					}
					if (!method_af_boolean(i_293_ + 128, i_295_, i_294_)) {
						return false;
					}
				}
				if (i > 0) {
					if (!method_af_boolean(i_293_, i_296_, i_294_)) {
						return false;
					}
					if (!method_af_boolean(i_293_ + 128, i_296_, i_294_)) {
						return false;
					}
				}
				if (!method_af_boolean(i_293_, i_297_, i_294_)) {
					return false;
				}
				if (!method_af_boolean(i_293_ + 128, i_297_, i_294_)) {
					return false;
				}
				return true;
			}
		}
		return (!method_af_boolean(i_293_ + 64, i_298_, i_294_ + 64) ? false : i_292_ == 16 ? method_af_boolean(i_293_, i_297_, i_294_ + 128) : i_292_ == 32 ? method_af_boolean(i_293_ + 128, i_297_, i_294_ + 128) : i_292_ == 64 ? method_af_boolean(i_293_ + 128, i_297_, i_294_) : i_292_ == 128 ? method_af_boolean(i_293_, i_297_, i_294_) : true);
	}

	boolean method_ag_boolean(final int i, final int i_299_, final int i_300_, final int i_301_) {
		if (!method_am_boolean(i, i_299_, i_300_)) {
			return false;
		}
		final int i_302_ = i_299_ << 7;
		final int i_303_ = i_300_ << 7;
		if (method_af_boolean(i_302_ + 1, (this.field_e_1266[i][i_299_][i_300_]) - i_301_, i_303_ + 1) && method_af_boolean((i_302_ + 128) - 1, (this.field_e_1266[i][i_299_ + 1][i_300_]) - i_301_, i_303_ + 1) && method_af_boolean((i_302_ + 128) - 1, (this.field_e_1266[i][i_299_ + 1][i_300_ + 1]) - i_301_, (i_303_ + 128) - 1)
				&& method_af_boolean(i_302_ + 1, (this.field_e_1266[i][i_299_][i_300_ + 1]) - i_301_, (i_303_ + 128) - 1)) {
			return true;
		}
		return false;
	}

	boolean method_af_boolean(final int i, final int i_304_, final int i_305_) {
		for (int i_306_ = 0; i_306_ < field_ah_1297; i_306_++) {
			final Class_cp class_cp = field_aq_1305[i_306_];
			if ((class_cp.field_u_1179 * -1798273177) == 1) {
				final int i_307_ = (class_cp.field_g_1176 * 19475423) - i;
				if (i_307_ > 0) {
					final int i_308_ = ((class_cp.field_m_1175 * 2077736235) + ((class_cp.field_x_1182 * 1556519517 * i_307_) >> 8));
					final int i_309_ = ((class_cp.field_a_1190 * 1299204829) + ((class_cp.field_r_1183 * 1596147037 * i_307_) >> 8));
					final int i_310_ = ((class_cp.field_h_1177 * 996622775) + ((class_cp.field_j_1184 * -518422227 * i_307_) >> 8));
					final int i_311_ = ((class_cp.field_l_1178 * -1196054569) + ((class_cp.field_s_1185 * -959077719 * i_307_) >> 8));
					if ((i_305_ >= i_308_) && (i_305_ <= i_309_) && (i_304_ >= i_310_) && (i_304_ <= i_311_)) {
						return true;
					}
				}
			} else if ((class_cp.field_u_1179 * -1798273177) == 2) {
				final int i_312_ = i - (class_cp.field_g_1176 * 19475423);
				if (i_312_ > 0) {
					final int i_313_ = ((class_cp.field_m_1175 * 2077736235) + ((class_cp.field_x_1182 * 1556519517 * i_312_) >> 8));
					final int i_314_ = ((class_cp.field_a_1190 * 1299204829) + ((class_cp.field_r_1183 * 1596147037 * i_312_) >> 8));
					final int i_315_ = ((class_cp.field_h_1177 * 996622775) + ((class_cp.field_j_1184 * -518422227 * i_312_) >> 8));
					final int i_316_ = ((class_cp.field_l_1178 * -1196054569) + ((class_cp.field_s_1185 * -959077719 * i_312_) >> 8));
					if ((i_305_ >= i_313_) && (i_305_ <= i_314_) && (i_304_ >= i_315_) && (i_304_ <= i_316_)) {
						return true;
					}
				}
			} else if ((class_cp.field_u_1179 * -1798273177) == 3) {
				final int i_317_ = (class_cp.field_m_1175 * 2077736235) - i_305_;
				if (i_317_ > 0) {
					final int i_318_ = ((class_cp.field_g_1176 * 19475423) + ((class_cp.field_q_1180 * -525647983 * i_317_) >> 8));
					final int i_319_ = ((class_cp.field_f_1174 * -751070565) + ((class_cp.field_k_1181 * -1765850835 * i_317_) >> 8));
					final int i_320_ = ((class_cp.field_h_1177 * 996622775) + ((class_cp.field_j_1184 * -518422227 * i_317_) >> 8));
					final int i_321_ = ((class_cp.field_l_1178 * -1196054569) + ((class_cp.field_s_1185 * -959077719 * i_317_) >> 8));
					if ((i >= i_318_) && (i <= i_319_) && (i_304_ >= i_320_) && (i_304_ <= i_321_)) {
						return true;
					}
				}
			} else if ((class_cp.field_u_1179 * -1798273177) == 4) {
				final int i_322_ = i_305_ - (class_cp.field_m_1175 * 2077736235);
				if (i_322_ > 0) {
					final int i_323_ = ((class_cp.field_g_1176 * 19475423) + ((class_cp.field_q_1180 * -525647983 * i_322_) >> 8));
					final int i_324_ = ((class_cp.field_f_1174 * -751070565) + ((class_cp.field_k_1181 * -1765850835 * i_322_) >> 8));
					final int i_325_ = ((class_cp.field_h_1177 * 996622775) + ((class_cp.field_j_1184 * -518422227 * i_322_) >> 8));
					final int i_326_ = ((class_cp.field_l_1178 * -1196054569) + ((class_cp.field_s_1185 * -959077719 * i_322_) >> 8));
					if ((i >= i_323_) && (i <= i_324_) && (i_304_ >= i_325_) && (i_304_ <= i_326_)) {
						return true;
					}
				}
			} else if ((class_cp.field_u_1179 * -1798273177) == 5) {
				final int i_327_ = i_304_ - (class_cp.field_h_1177 * 996622775);
				if (i_327_ > 0) {
					final int i_328_ = ((class_cp.field_g_1176 * 19475423) + ((class_cp.field_q_1180 * -525647983 * i_327_) >> 8));
					final int i_329_ = ((class_cp.field_f_1174 * -751070565) + ((class_cp.field_k_1181 * -1765850835 * i_327_) >> 8));
					final int i_330_ = ((class_cp.field_m_1175 * 2077736235) + ((class_cp.field_x_1182 * 1556519517 * i_327_) >> 8));
					final int i_331_ = ((class_cp.field_a_1190 * 1299204829) + ((class_cp.field_r_1183 * 1596147037 * i_327_) >> 8));
					if ((i >= i_328_) && (i <= i_329_) && (i_305_ >= i_330_) && (i_305_ <= i_331_)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public void method_g_void(final int i, final int i_332_, final int i_333_, final int i_334_, final int i_335_, final int i_336_, final int i_337_, final int i_338_, final int i_339_, final int i_340_, final int i_341_, final int i_342_, final int i_343_, final int i_344_, final int i_345_, final int i_346_, final int i_347_, final int i_348_, final int i_349_, final int i_350_) {
		if (i_334_ == 0) {
			final Class_cq class_cq = new Class_cq(i_341_, i_342_, i_343_, i_344_, -1, i_349_, false);
			for (int i_351_ = i; i_351_ >= 0; i_351_--) {
				if (this.groundTiles[i_351_][i_332_][i_333_] == null) {
					this.groundTiles[i_351_][i_332_][i_333_] = new SceneTile(i_351_, i_332_, i_333_);
				}
			}
			this.groundTiles[i][i_332_][i_333_].field_e_1097 = class_cq;
		} else if (i_334_ != 1) {
			final Class_cv class_cv = new Class_cv(i_334_, i_335_, i_336_, i_332_, i_333_, i_337_, i_338_, i_339_, i_340_, i_341_, i_342_, i_343_, i_344_, i_345_, i_346_, i_347_, i_348_, i_349_, i_350_);
			for (int i_352_ = i; i_352_ >= 0; i_352_--) {
				if (this.groundTiles[i_352_][i_332_][i_333_] == null) {
					this.groundTiles[i_352_][i_332_][i_333_] = new SceneTile(i_352_, i_332_, i_333_);
				}
			}
			this.groundTiles[i][i_332_][i_333_].boundary = class_cv;
		} else {
			final Class_cq class_cq = new Class_cq(i_345_, i_346_, i_347_, i_348_, i_336_, i_350_, ((i_337_ == i_338_) && (i_337_ == i_339_) && (i_337_ == i_340_)));
			for (int i_353_ = i; i_353_ >= 0; i_353_--) {
				if (this.groundTiles[i_353_][i_332_][i_333_] == null) {
					this.groundTiles[i_353_][i_332_][i_333_] = new SceneTile(i_353_, i_332_, i_333_);
				}
			}
			this.groundTiles[i][i_332_][i_333_].field_e_1097 = class_cq;
		}
	}

	public static void method_ac_void(final int[] is, final int i, final int i_354_, final int i_355_, final int i_356_) {
		field_br_1300 = 0;
		field_bd_1321 = 0;
		field_bn_1311 = i_355_;
		field_bu_1323 = i_356_;
		field_bj_1262 = i_355_ / 2;
		field_ba_1319 = i_356_ / 2;
		final boolean[][][][] bools = new boolean[9][32][53][53];
		for (int i_357_ = 128; i_357_ <= 384; i_357_ += 32) {
			for (int i_358_ = 0; i_358_ < 2048; i_358_ += 64) {
				field_ad_1288 = Rasterizer3D.SINE[i_357_];
				field_ak_1322 = Rasterizer3D.COSINE[i_357_];
				field_ae_1290 = Rasterizer3D.SINE[i_358_];
				field_ax_1291 = Rasterizer3D.COSINE[i_358_];
				final int i_359_ = (i_357_ - 128) / 32;
				final int i_360_ = i_358_ / 64;
				for (int i_361_ = -26; i_361_ <= 26; i_361_++) {
					for (int i_362_ = -26; i_362_ <= 26; i_362_++) {
						final int i_363_ = i_361_ * 128;
						final int i_364_ = i_362_ * 128;
						boolean bool = false;
						int i_365_ = -i;
						while_18_: do {
							for (;;) {
								if (i_365_ > i_354_) {
									break while_18_;
								}
								if (method_az_boolean(i_363_, is[i_359_] + i_365_, i_364_)) {
									break;
								}
								i_365_ += 128;
							}
							bool = true;
						} while (false);
						bools[i_359_][i_360_][i_361_ + 25 + 1][i_362_ + 25 + 1] = bool;
					}
				}
			}
		}
		for (int i_366_ = 0; i_366_ < 8; i_366_++) {
			for (int i_367_ = 0; i_367_ < 32; i_367_++) {
				for (int i_368_ = -25; i_368_ < 25; i_368_++) {
					for (int i_369_ = -25; i_369_ < 25; i_369_++) {
						boolean bool = false;
						int i_370_ = -1;
						while_19_: while (i_370_ <= 1) {
							int i_371_ = -1;
							for (;;) {
								if (i_371_ > 1) {
									i_370_++;
									break;
								}
								if (bools[i_366_][i_367_][i_368_ + i_370_ + 25 + 1][i_369_ + i_371_ + 25 + 1]) {
									bool = true;
									break while_19_;
								}
								if (bools[i_366_][(i_367_ + 1) % 31][i_368_ + i_370_ + 25 + 1][i_369_ + i_371_ + 25 + 1]) {
									bool = true;
									break while_19_;
								}
								if (bools[i_366_ + 1][i_367_][i_368_ + i_370_ + 25 + 1][i_369_ + i_371_ + 25 + 1]) {
									bool = true;
									break while_19_;
								}
								if (bools[i_366_ + 1][(i_367_ + 1) % 31][i_368_ + i_370_ + 25 + 1][i_369_ + i_371_ + 25 + 1]) {
									bool = true;
									break while_19_;
								}
								i_371_++;
							}
						}
						field_bw_1316[i_366_][i_367_][i_368_ + 25][i_369_ + 25] = bool;
					}
				}
			}
		}
	}

	public void method_z_void(final int i, final int i_372_) {
		final SceneTile groundtile = this.groundTiles[0][i][i_372_];
		for (int i_373_ = 0; i_373_ < 3; i_373_++) {
			final SceneTile groundtile_374_ = (this.groundTiles[i_373_][i][i_372_] = this.groundTiles[i_373_ + 1][i][i_372_]);
			if (groundtile_374_ != null) {
				groundtile_374_.field_n_1101 -= -147349365;
				for (int i_375_ = 0; i_375_ < (groundtile_374_.field_l_1107 * 780605197); i_375_++) {
					final SceneObject interactableobject = (groundtile_374_.interactableObjects[i_375_]);
					if (((((interactableobject.uid * -1513499455) >> 29) & 0x3) == 2) && ((interactableobject.x * 491968161) == i) && ((interactableobject.y * -295550521) == i_372_)) {
						interactableobject.plane -= -1882541963;
					}
				}
			}
		}
		if (this.groundTiles[0][i][i_372_] == null) {
			this.groundTiles[0][i][i_372_] = new SceneTile(0, i, i_372_);
		}
		this.groundTiles[0][i][i_372_].floorDecoration = groundtile;
		this.groundTiles[3][i][i_372_] = null;
	}

	void method_aw_void(final Class_cq class_cq, final int i, final int i_376_, final int i_377_, final int i_378_, final int i_379_, final int i_380_, final int i_381_) {
		int i_383_;
		int i_382_ = i_383_ = (i_380_ << 7) - field_t_1285;
		int i_385_;
		int i_384_ = i_385_ = (i_381_ << 7) - field_i_1293;
		int i_387_;
		int i_386_ = i_387_ = i_382_ + 128;
		int i_389_;
		int i_388_ = i_389_ = i_384_ + 128;
		int i_390_ = (this.field_e_1266[i][i_380_][i_381_] - field_w_1286);
		int i_391_ = (this.field_e_1266[i][i_380_ + 1][i_381_] - field_w_1286);
		int i_392_ = (this.field_e_1266[i][i_380_ + 1][i_381_ + 1] - field_w_1286);
		final int i_393_ = (this.field_e_1266[i][i_380_][i_381_ + 1] - field_w_1286);
		int i_394_ = ((i_384_ * i_378_) + (i_382_ * i_379_)) >> 16;
		i_384_ = ((i_384_ * i_379_) - (i_382_ * i_378_)) >> 16;
		i_382_ = i_394_;
		i_394_ = ((i_390_ * i_377_) - (i_384_ * i_376_)) >> 16;
					i_384_ = ((i_390_ * i_376_) + (i_384_ * i_377_)) >> 16;
			i_390_ = i_394_;
			if (i_384_ >= 50) {
				i_394_ = ((i_385_ * i_378_) + (i_386_ * i_379_)) >> 16;
			i_385_ = ((i_385_ * i_379_) - (i_386_ * i_378_)) >> 16;
						i_386_ = i_394_;
						i_394_ = ((i_391_ * i_377_) - (i_385_ * i_376_)) >> 16;
						i_385_ = ((i_391_ * i_376_) + (i_385_ * i_377_)) >> 16;
						i_391_ = i_394_;
						if (i_385_ >= 50) {
							i_394_ = ((i_388_ * i_378_) + (i_387_ * i_379_)) >> 16;
						i_388_ = ((i_388_ * i_379_) - (i_387_ * i_378_)) >> 16;
						i_387_ = i_394_;
						i_394_ = ((i_392_ * i_377_) - (i_388_ * i_376_)) >> 16;
			i_388_ = ((i_392_ * i_376_) + (i_388_ * i_377_)) >> 16;
		i_392_ = i_394_;
		if (i_388_ >= 50) {
			i_394_ = ((i_389_ * i_378_) + (i_383_ * i_379_)) >> 16;
		i_389_ = ((i_389_ * i_379_) - (i_383_ * i_378_)) >> 16;
			i_383_ = i_394_;
			i_394_ = ((i_393_ * i_377_) - (i_389_ * i_376_)) >> 16;
			i_389_ = ((i_393_ * i_376_) + (i_389_ * i_377_)) >> 16;
			if (i_389_ >= 50) {
				final int i_395_ = (Rasterizer3D.field_l_1147 + ((i_382_ * Rasterizer3D.field_h_1146) / i_384_));
				final int i_396_ = (Rasterizer3D.field_u_1148 + ((i_390_ * Rasterizer3D.field_h_1146) / i_384_));
				final int i_397_ = (Rasterizer3D.field_l_1147 + ((i_386_ * Rasterizer3D.field_h_1146) / i_385_));
				final int i_398_ = (Rasterizer3D.field_u_1148 + ((i_391_ * Rasterizer3D.field_h_1146) / i_385_));
				final int i_399_ = (Rasterizer3D.field_l_1147 + ((i_387_ * Rasterizer3D.field_h_1146) / i_388_));
				final int i_400_ = (Rasterizer3D.field_u_1148 + ((i_392_ * Rasterizer3D.field_h_1146) / i_388_));
				final int i_401_ = (Rasterizer3D.field_l_1147 + ((i_383_ * Rasterizer3D.field_h_1146) / i_389_));
				final int i_402_ = (Rasterizer3D.field_u_1148 + ((i_394_ * Rasterizer3D.field_h_1146) / i_389_));
				Rasterizer3D.field_e_1141 = 0;
				if ((((i_399_ - i_401_) * (i_398_ - i_402_)) - ((i_400_ - i_402_) * (i_397_ - i_401_))) > 0) {
					Rasterizer3D.field_n_1143 = false;
					if ((i_399_ < 0) || (i_401_ < 0) || (i_397_ < 0) || (i_399_ > Rasterizer3D.field_c_1151) || (i_401_ > Rasterizer3D.field_c_1151) || (i_397_ > Rasterizer3D.field_c_1151)) {
						Rasterizer3D.field_n_1143 = true;
					}
					if (field_ar_1309 && method_aq_boolean(field_ab_1295, field_ao_1296, i_400_, i_402_, i_398_, i_399_, i_401_, i_397_)) {
						field_ac_1283 = i_380_;
						field_az_1298 = i_381_;
					}
					if ((class_cq.field_e_1215 * -835342813) == -1) {
						if ((class_cq.field_z_1212 * 763873353) != 12345678) {
							Rasterizer3D.method_h_void(i_400_, i_402_, i_398_, i_399_, i_401_, i_397_, (class_cq.field_z_1212 * 763873353), (class_cq.field_y_1218 * -1346996823), (class_cq.field_d_1211 * 1857230211));
						}
					} else if (!field_n_1320) {
						if (class_cq.field_g_1214) {
							Rasterizer3D.method_r_void(i_400_, i_402_, i_398_, i_399_, i_401_, i_397_, (class_cq.field_z_1212 * 763873353), (class_cq.field_y_1218 * -1346996823), (class_cq.field_d_1211 * 1857230211), i_382_, i_386_, i_383_, i_390_, i_391_, i_394_, i_384_, i_385_, i_389_, (class_cq.field_e_1215 * -835342813));
						} else {
							Rasterizer3D.method_r_void(i_400_, i_402_, i_398_, i_399_, i_401_, i_397_, (class_cq.field_z_1212 * 763873353), (class_cq.field_y_1218 * -1346996823), (class_cq.field_d_1211 * 1857230211), i_387_, i_383_, i_386_, i_392_, i_394_, i_391_, i_388_, i_389_, i_385_, (class_cq.field_e_1215 * -835342813));
						}
					} else {
						final int i_403_ = (Rasterizer3D.field_ak_1157.method_d_int((class_cq.field_e_1215 * -835342813), -1621034666));
						Rasterizer3D.method_h_void(i_400_, i_402_, i_398_, i_399_, i_401_, i_397_, method_ah_int(i_403_, ((class_cq.field_z_1212) * 763873353)), method_ah_int(i_403_, ((class_cq.field_y_1218) * -1346996823)), method_ah_int(i_403_, ((class_cq.field_d_1211) * 1857230211)));
					}
				}
				if ((((i_395_ - i_397_) * (i_402_ - i_398_)) - ((i_396_ - i_398_) * (i_401_ - i_397_))) > 0) {
					Rasterizer3D.field_n_1143 = false;
					if ((i_395_ < 0) || (i_397_ < 0) || (i_401_ < 0) || (i_395_ > Rasterizer3D.field_c_1151) || (i_397_ > Rasterizer3D.field_c_1151) || (i_401_ > Rasterizer3D.field_c_1151)) {
						Rasterizer3D.field_n_1143 = true;
					}
					if (field_ar_1309 && method_aq_boolean(field_ab_1295, field_ao_1296, i_396_, i_398_, i_402_, i_395_, i_397_, i_401_)) {
						field_ac_1283 = i_380_;
						field_az_1298 = i_381_;
					}
					if ((class_cq.field_e_1215 * -835342813) == -1) {
						if ((class_cq.field_n_1213 * -2133391373) != 12345678) {
							Rasterizer3D.method_h_void(i_396_, i_398_, i_402_, i_395_, i_397_, i_401_, (class_cq.field_n_1213 * -2133391373), (class_cq.field_d_1211 * 1857230211), (class_cq.field_y_1218 * -1346996823));
						}
					} else if (!field_n_1320) {
						Rasterizer3D.method_r_void(i_396_, i_398_, i_402_, i_395_, i_397_, i_401_, (class_cq.field_n_1213 * -2133391373), (class_cq.field_d_1211 * 1857230211), (class_cq.field_y_1218 * -1346996823), i_382_, i_386_, i_383_, i_390_, i_391_, i_394_, i_384_, i_385_, i_389_, (class_cq.field_e_1215 * -835342813));
					} else {
						final int i_404_ = (Rasterizer3D.field_ak_1157.method_d_int((class_cq.field_e_1215 * -835342813), -1143377249));
						Rasterizer3D.method_h_void(i_396_, i_398_, i_402_, i_395_, i_397_, i_401_, method_ah_int(i_404_, ((class_cq.field_n_1213) * -2133391373)), method_ah_int(i_404_, ((class_cq.field_d_1211) * 1857230211)), method_ah_int(i_404_, ((class_cq.field_y_1218) * -1346996823)));
					}
				}
			}
		}
						}
			}
	}

	void method_ab_void(final OffScreenModel rsmodel, final int i, final int i_405_, final int i_406_, final int i_407_, final int i_408_) {
		boolean bool = true;
		int i_409_ = i_405_;
		final int i_410_ = i_405_ + i_407_;
		final int i_411_ = i_406_ - 1;
		final int i_412_ = i_406_ + i_408_;
		for (int i_413_ = i; i_413_ <= (i + 1); i_413_++) {
			if (i_413_ != this.field_d_1263) {
				for (int i_414_ = i_409_; i_414_ <= i_410_; i_414_++) {
					if ((i_414_ >= 0) && (i_414_ < this.field_z_1264)) {
						for (int i_415_ = i_411_; i_415_ <= i_412_; i_415_++) {
							if ((i_415_ >= 0) && (i_415_ < this.field_y_1265) && (!bool || (i_414_ >= i_410_) || (i_415_ >= i_412_) || ((i_415_ < i_406_) && (i_414_ != i_405_)))) {
								final SceneTile groundtile = (this.groundTiles[i_413_][i_414_][i_415_]);
								if (groundtile != null) {
									final int i_416_ = ((((this.field_e_1266[i_413_][i_414_][i_415_]) + (this.field_e_1266[i_413_][i_414_ + 1][i_415_]) + (this.field_e_1266[i_413_][i_414_][i_415_ + 1]) + (this.field_e_1266[i_413_][i_414_ + 1][i_415_ + 1])) / 4) - (((this.field_e_1266[i][i_405_][i_406_]) + (this.field_e_1266[i][i_405_ + 1][i_406_]) + (this.field_e_1266[i][i_405_][i_406_ + 1]) + (this.field_e_1266[i][i_405_ + 1][i_406_ + 1])) / 4));
									final Boundary boundaryobject = (groundtile.boundaryObject);
									if (boundaryobject != null) {
										if (boundaryobject.renderable1 instanceof OffScreenModel) {
											final OffScreenModel rsmodel_417_ = ((OffScreenModel) boundaryobject.renderable1);
											OffScreenModel.method_i_void(rsmodel, rsmodel_417_, (((i_414_ - i_405_) * 128) + ((1 - i_407_) * 64)), i_416_, (((i_415_ - i_406_) * 128) + ((1 - i_408_) * 64)), bool);
										}
										if (boundaryobject.renderable2 instanceof OffScreenModel) {
											final OffScreenModel rsmodel_418_ = ((OffScreenModel) boundaryobject.renderable2);
											OffScreenModel.method_i_void(rsmodel, rsmodel_418_, (((i_414_ - i_405_) * 128) + ((1 - i_407_) * 64)), i_416_, (((i_415_ - i_406_) * 128) + ((1 - i_408_) * 64)), bool);
										}
									}
									for (int i_419_ = 0; i_419_ < ((groundtile.field_l_1107) * 780605197); i_419_++) {
										final SceneObject interactableobject = (groundtile.interactableObjects[i_419_]);
										if ((interactableobject != null) && (interactableobject.renderable instanceof OffScreenModel)) {
											final OffScreenModel rsmodel_420_ = (OffScreenModel) (interactableobject.renderable);
											final int i_421_ = ((((interactableobject.maxLocX) * 600735749) - (interactableobject.x * 491968161)) + 1);
											final int i_422_ = ((((interactableobject.maxLocY) * 1143994841) - (interactableobject.y * -295550521)) + 1);
											OffScreenModel.method_i_void(rsmodel, rsmodel_420_, ((((interactableobject.x * 491968161) - i_405_) * 128) + ((i_421_ - i_407_) * 64)), i_416_, ((((interactableobject.y * -295550521) - i_406_) * 128) + ((i_422_ - i_408_) * 64)), bool);
										}
									}
								}
							}
						}
					}
				}
				i_409_--;
				bool = false;
			}
		}
	}

	public void method_o_void(final int i, final int i_423_, final int i_424_) {
		final SceneTile groundtile = this.groundTiles[i][i_423_][i_424_];
		if (groundtile != null) {
			groundtile.field_h_1109 = null;
		}
	}

	public SceneGraph(final int i, final int i_425_, final int i_426_, final int[][][] is) {
		this.field_d_1263 = i;
		this.field_z_1264 = i_425_;
		this.field_y_1265 = i_426_;
		this.groundTiles = new SceneTile[i][i_425_][i_426_];
		this.field_h_1271 = new int[i][i_425_ + 1][i_426_ + 1];
		this.field_e_1266 = is;
		method_n_void();
	}

	public void method_v_void(final int i, final int i_427_, final int i_428_) {
		final SceneTile groundtile = this.groundTiles[i][i_427_][i_428_];
		if (groundtile != null) {
			groundtile.wallDecoration = null;
		}
	}

	public int method_al_int(final int i, final int i_429_, final int i_430_, final int i_431_) {
		final SceneTile groundtile = this.groundTiles[i][i_429_][i_430_];
		if (groundtile == null) {
			return -1;
		}
		if ((groundtile.boundaryObject != null) && ((groundtile.boundaryObject.uid * -832076175) == i_431_)) {
			return ((groundtile.boundaryObject.config) * 483703779) & 0xff;
		}
		if ((groundtile.wallDecoration != null) && ((groundtile.wallDecoration.uid * -298307543) == i_431_)) {
			return ((groundtile.wallDecoration.config) * -1334167161) & 0xff;
		}
		if ((groundtile.playerUpdateBlockHandler != null) && ((groundtile.playerUpdateBlockHandler.uid * 840235263) == i_431_)) {
			return (((groundtile.playerUpdateBlockHandler).config * 330872815) & 0xff);
		}
		for (int i_432_ = 0; i_432_ < (groundtile.field_l_1107 * 780605197); i_432_++) {
			if ((groundtile.interactableObjects[i_432_].uid * -1513499455) == i_431_) {
				return ((((groundtile.interactableObjects[i_432_]).config) * 177863451) & 0xff);
			}
		}
		return -1;
	}

	void method_ai_void(final Class_cv class_cv, final int i, final int i_433_, final int i_434_, final int i_435_, final int i_436_, final int i_437_) {
		int i_438_ = class_cv.field_n_1370.length;
		for (int i_439_ = 0; i_439_ < i_438_; i_439_++) {
			int i_440_ = class_cv.field_n_1370[i_439_] - field_t_1285;
			final int i_441_ = class_cv.field_d_1365[i_439_] - field_w_1286;
			int i_442_ = class_cv.field_z_1367[i_439_] - field_i_1293;
			int i_443_ = ((i_442_ * i_434_) + (i_440_ * i_435_)) >> 16;
		i_442_ = ((i_442_ * i_435_) - (i_440_ * i_434_)) >> 16;
									i_440_ = i_443_;
									i_443_ = ((i_441_ * i_433_) - (i_442_ * i)) >> 16;
		i_442_ = ((i_441_ * i) + (i_442_ * i_433_)) >> 16;
		if (i_442_ < 50) {
			return;
		}
		if (class_cv.field_h_1383 != null) {
			Class_cv.field_s_1382[i_439_] = i_440_;
			Class_cv.field_v_1372[i_439_] = i_443_;
			Class_cv.field_c_1384[i_439_] = i_442_;
		}
		Class_cv.field_r_1380[i_439_] = (Rasterizer3D.field_l_1147 + ((i_440_ * Rasterizer3D.field_h_1146) / i_442_));
		Class_cv.field_j_1381[i_439_] = (Rasterizer3D.field_u_1148 + ((i_443_ * Rasterizer3D.field_h_1146) / i_442_));
		}
		Rasterizer3D.field_e_1141 = 0;
		i_438_ = class_cv.field_f_1386.length;
		for (int i_444_ = 0; i_444_ < i_438_; i_444_++) {
			final int i_445_ = class_cv.field_f_1386[i_444_];
			final int i_446_ = class_cv.field_m_1374[i_444_];
			final int i_447_ = class_cv.field_a_1373[i_444_];
			final int i_448_ = Class_cv.field_r_1380[i_445_];
			final int i_449_ = Class_cv.field_r_1380[i_446_];
			final int i_450_ = Class_cv.field_r_1380[i_447_];
			final int i_451_ = Class_cv.field_j_1381[i_445_];
			final int i_452_ = Class_cv.field_j_1381[i_446_];
			final int i_453_ = Class_cv.field_j_1381[i_447_];
			if ((((i_448_ - i_449_) * (i_453_ - i_452_)) - ((i_451_ - i_452_) * (i_450_ - i_449_))) > 0) {
				Rasterizer3D.field_n_1143 = false;
				if ((i_448_ < 0) || (i_449_ < 0) || (i_450_ < 0) || (i_448_ > Rasterizer3D.field_c_1151) || (i_449_ > Rasterizer3D.field_c_1151) || (i_450_ > Rasterizer3D.field_c_1151)) {
					Rasterizer3D.field_n_1143 = true;
				}
				if (field_ar_1309 && method_aq_boolean(field_ab_1295, field_ao_1296, i_451_, i_452_, i_453_, i_448_, i_449_, i_450_)) {
					field_ac_1283 = i_436_;
					field_az_1298 = i_437_;
				}
				if ((class_cv.field_h_1383 != null) && (class_cv.field_h_1383[i_444_] != -1)) {
					if (!field_n_1320) {
						if (class_cv.field_l_1375) {
							Rasterizer3D.method_r_void(i_451_, i_452_, i_453_, i_448_, i_449_, i_450_, class_cv.field_y_1368[i_444_], class_cv.field_e_1369[i_444_], class_cv.field_g_1366[i_444_], Class_cv.field_s_1382[0], Class_cv.field_s_1382[1], Class_cv.field_s_1382[3], Class_cv.field_v_1372[0], Class_cv.field_v_1372[1], Class_cv.field_v_1372[3], Class_cv.field_c_1384[0], Class_cv.field_c_1384[1],
									Class_cv.field_c_1384[3], class_cv.field_h_1383[i_444_]);
						} else {
							Rasterizer3D.method_r_void(i_451_, i_452_, i_453_, i_448_, i_449_, i_450_, class_cv.field_y_1368[i_444_], class_cv.field_e_1369[i_444_], class_cv.field_g_1366[i_444_], Class_cv.field_s_1382[i_445_], Class_cv.field_s_1382[i_446_], Class_cv.field_s_1382[i_447_], Class_cv.field_v_1372[i_445_], Class_cv.field_v_1372[i_446_], Class_cv.field_v_1372[i_447_],
									Class_cv.field_c_1384[i_445_], Class_cv.field_c_1384[i_446_], Class_cv.field_c_1384[i_447_], class_cv.field_h_1383[i_444_]);
						}
					} else {
						final int i_454_ = (Rasterizer3D.field_ak_1157.method_d_int(class_cv.field_h_1383[i_444_], -255444401));
						Rasterizer3D.method_h_void(i_451_, i_452_, i_453_, i_448_, i_449_, i_450_, method_ah_int(i_454_, (class_cv.field_y_1368[i_444_])), method_ah_int(i_454_, (class_cv.field_e_1369[i_444_])), method_ah_int(i_454_, (class_cv.field_g_1366[i_444_])));
					}
				} else if (class_cv.field_y_1368[i_444_] != 12345678) {
					Rasterizer3D.method_h_void(i_451_, i_452_, i_453_, i_448_, i_449_, i_450_, class_cv.field_y_1368[i_444_], class_cv.field_e_1369[i_444_], class_cv.field_g_1366[i_444_]);
				}
			}
		}
	}

	boolean method_am_boolean(final int i, final int i_455_, final int i_456_) {
		final int i_457_ = this.field_h_1271[i][i_455_][i_456_];
		if (i_457_ == -field_j_1287) {
			return false;
		}
		if (i_457_ == field_j_1287) {
			return true;
		}
		final int i_458_ = i_455_ << 7;
		final int i_459_ = i_456_ << 7;
		if (method_af_boolean(i_458_ + 1, (this.field_e_1266[i][i_455_][i_456_]), i_459_ + 1) && method_af_boolean((i_458_ + 128) - 1, (this.field_e_1266[i][i_455_ + 1][i_456_]), i_459_ + 1) && method_af_boolean((i_458_ + 128) - 1, (this.field_e_1266[i][i_455_ + 1][i_456_ + 1]), (i_459_ + 128) - 1) && method_af_boolean(i_458_ + 1, (this.field_e_1266[i][i_455_][i_456_ + 1]), (i_459_ + 128) - 1)) {
			this.field_h_1271[i][i_455_][i_456_] = field_j_1287;
			return true;
		}
		this.field_h_1271[i][i_455_][i_456_] = -field_j_1287;
		return false;
	}
}
