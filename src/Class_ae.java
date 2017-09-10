/* Class_ae - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_ae {
	public static final int field_dy_47 = 31;
	int field_d_48;
	int field_z_49;
	int field_y_50;
	String field_e_51;
	int field_n_52;
	static SceneGraph sceneGraph;
	static final int field_cj_54 = 100;
	public static final int field_h_55 = 27;
	static final int field_bl_56 = 14;
	static int field_bx_57;

	Class_ae() {
		/* empty */
	}

	public static Class_db method_d_db(final int i, final int i_0_) {
		try {
			final Class_db[] class_dbs = VarpBit.method_n_dbArray(1506813271);
			for (final Class_db class_db : class_dbs) {
				if (i == (class_db.field_y_1565 * -2094882735)) {
					return class_db;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ae.d()");
		}
		return null;
	}

	static final int method_u_int(final int i, final int i_2_, final int i_3_, final int i_4_, final int i_5_) {
		int i_6_;
		try {
			final int i_7_ = (65536 - Rasterizer3D.COSINE[(i_3_ * 1024) / i_4_]) >> 1;
			i_6_ = ((i_7_ * i_2_) >> 16) + ((i * (65536 - i_7_)) >> 16);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ae.u()");
		}
		return i_6_;
	}

	static final void method_ba_void(final int i, final int i_8_, final int i_9_, final int i_10_, final int i_11_, final int i_12_) {
		try {
			if (((SpotAnim.regionX * -248192841) != i) || ((-1598931295 * Region.regionY) != i_8_) || ((i_9_ != (544143533 * client.field_cs_2739)) && client.field_u_2784)) {
				SpotAnim.regionX = i * -1689256697;
				Region.regionY = 231286113 * i_8_;
				client.field_cs_2739 = i_9_ * 504703781;
				if (!client.field_u_2784) {
					client.field_cs_2739 = 0;
				}
				Socket.method_h_void(25, -1794630047);
				Class_l.method_aq_void(MenuText.LOADING_PLEASE_WAIT, true, 1482961482);
				int i_13_ = Class_q.originX * 1693061403;
				int i_14_ = Class_gf.originY * -1593604783;
				Class_q.originX = (i - 6) * 1917257880;
				Class_gf.originY = 1238834568 * (i_8_ - 6);
				final int i_15_ = (Class_q.originX * 1693061403) - i_13_;
				final int i_16_ = (Class_gf.originY * -1593604783) - i_14_;
				i_13_ = 1693061403 * Class_q.originX;
				i_14_ = -1593604783 * Class_gf.originY;
				for (int i_17_ = 0; i_17_ < 32768; i_17_++) {
					final Npc npc = client.npcs[i_17_];
					if (npc != null) {
						for (int i_18_ = 0; i_18_ < 10; i_18_++) {
							npc.walkQueueX[i_18_] -= i_15_;
							npc.walkQueueY[i_18_] -= i_16_;
						}
						npc.worldPosX -= -1905293184 * i_15_;
						npc.worldPosY -= i_16_ * -1233132928;
					}
				}
				for (int i_19_ = 0; i_19_ < 2048; i_19_++) {
					final Player player = client.localPlayers[i_19_];
					if (player != null) {
						for (int i_20_ = 0; i_20_ < 10; i_20_++) {
							player.walkQueueX[i_20_] -= i_15_;
							player.walkQueueY[i_20_] -= i_16_;
						}
						player.worldPosX -= i_15_ * -1905293184;
						player.worldPosY -= i_16_ * -1233132928;
					}
				}
				Class_ed.plane = i_9_ * 1830352175;
				Class_ci.myPlayer.move(i_10_, i_11_, false);
				int i_21_ = 0;
				int i_22_ = 104;
				int i_23_ = 1;
				if (i_15_ < 0) {
					i_21_ = 103;
					i_22_ = -1;
					i_23_ = -1;
				}
				int i_24_ = 0;
				int i_25_ = 104;
				int i_26_ = 1;
				if (i_16_ < 0) {
					i_24_ = 103;
					i_25_ = -1;
					i_26_ = -1;
				}
				for (int i_27_ = i_21_; i_22_ != i_27_; i_27_ += i_23_) {
					for (int i_28_ = i_24_; i_28_ != i_25_; i_28_ += i_26_) {
						final int i_29_ = i_15_ + i_27_;
						final int i_30_ = i_28_ + i_16_;
						for (int i_31_ = 0; i_31_ < 4; i_31_++) {
							if ((i_29_ >= 0) && (i_30_ >= 0) && (i_29_ < 104) && (i_30_ < 104)) {
								client.groundItemsDeque[i_31_][i_27_][i_28_] = (client.groundItemsDeque[i_31_][i_29_][i_30_]);
							} else {
								client.groundItemsDeque[i_31_][i_27_][i_28_] = null;
							}
						}
					}
				}
				for (Class_r class_r = (Class_r) client.field_hv_2821.method_f_ga(); class_r != null; class_r = (Class_r) client.field_hv_2821.method_a_ga()) {
					class_r.field_y_1326 -= i_15_ * 1154806149;
					class_r.field_e_1327 -= -1091731455 * i_16_;
					if (((class_r.field_y_1326 * -201892019) < 0) || ((-2129494015 * class_r.field_e_1327) < 0) || ((class_r.field_y_1326 * -201892019) >= 104) || ((class_r.field_e_1327 * -2129494015) >= 104)) {
						class_r.removeLink();
					}
				}
				if ((851978955 * client.field_mk_2923) != 0) {
					client.field_mk_2923 -= i_15_ * -652317981;
					client.field_mn_2924 -= i_16_ * -1028068353;
				}
				client.field_nb_2931 = 0;
				client.field_nf_2937 = false;
				client.field_ml_2809 = -1558655015;
				client.field_ha_2823.method_n_void();
				client.activeProjectiles.method_n_void();
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ae.ba()");
		}
	}
}
