/* Class_cw - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.DataInputStream;
import java.net.URL;

public class Class_cw {
	public static final int field_k_1406 = 91;
	public static FileStore field_n_1407;
	public static final int field_be_1408 = 97;
	protected static int field_qu_1409;
	static final String field_m_1410 = "main_file_cache.idx";
	static final int field_f_1411 = 11;
	static int[] field_q_1412;

	public static void method_n_void(final String string, final Throwable throwable, final int i) {
		do {
			try {
				try {
					String string_0_ = "";
					if (throwable != null) {
						string_0_ = GameObject.method_z_String(throwable, (byte) -14);
					}
					if (string != null) {
						if (throwable != null) {
							string_0_ = new StringBuilder(string_0_).append(" | ").toString();
						}
						string_0_ = new StringBuilder(string_0_).append(string).toString();
					}
					System.out.println(new StringBuilder("Error: ").append(string_0_).toString());
					string_0_ = string_0_.replace(':', '.');
					string_0_ = string_0_.replace('@', '_');
					string_0_ = string_0_.replace('&', '_');
					string_0_ = string_0_.replace('#', '_');
					if (ClientError.field_n_2205 != null) {
						final URL url = new URL(ClientError.field_n_2205.getCodeBase(), new StringBuilder("clienterror.ws?c=").append(ClientError.clientVersion * -1739520877).append("&u=").append(ClientError.field_d_2207).append("&v1=").append(Daemon.operatingSystem).append("&v2=").append(Class_hm.field_d_3087).append("&e=").append(string_0_).toString());
						final DataInputStream datainputstream = new DataInputStream(url.openStream());
						datainputstream.read();
						datainputstream.close();
					}
				} catch (final Exception exception) {
					break;
				}
				break;
			} catch (final RuntimeException runtimeexception) {
				throw GameCanvas.error(runtimeexception, "cw.n()");
			}
		} while (false);
	}

	static final void method_ag_void(final byte i) {
		try {
			for (GroundItem class_ak = (GroundItem) client.field_ha_2823.method_f_ga(); class_ak != null; class_ak = (GroundItem) client.field_ha_2823.method_a_ga()) {
				if (((1217077651 * class_ak.y) == (Class_ed.plane * 250114511)) && !class_ak.nonStackable) {
					if ((client.currentCycle * 303796053) >= (978357843 * class_ak.field_d_160)) {
						class_ak.method_n_void((client.field_ej_2761 * -1720212425), 1163399541);
						if (class_ak.nonStackable) {
							class_ak.removeLink();
						} else {
							Class_ae.sceneGraph.method_u_boolean((class_ak.y * 1217077651), (-319963781 * class_ak.duration), (-187692091 * class_ak.field_f_163), (-1169008443 * class_ak.field_z_164), 60, class_ak, 0, -1, false);
						}
					}
				} else {
					class_ak.removeLink();
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "cw.ag()");
		}
	}

	static final void method_ae_void(final int i) {
		try {
			for (int i_1_ = 0; i_1_ < (1308149425 * client.localNpcCount); i_1_++) {
				final int i_2_ = client.npcIndexArray[i_1_];
				final Npc npc = client.npcs[i_2_];
				if (npc != null) {
					Class_cp.method_ax_void(npc, (npc.composite.occupiedTiles * 1087045297), (byte) -24);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "cw.ae()");
		}
	}

	protected static final void method_rn_void(final int i) {
		try {
			Class_cp.timer.reset();
			for (int i_3_ = 0; i_3_ < 32; i_3_++) {
				GameStub.field_qo_2131[i_3_] = 0L;
			}
			for (int i_4_ = 0; i_4_ < 32; i_4_++) {
				GameStub.field_qh_2140[i_4_] = 0L;
			}
			SceneObject.field_pf_950 = 0;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "cw.rn()");
		}
	}

	public static boolean method_y_boolean(final int i, final byte i_5_) {
		boolean bool;
		try {
			if (((i >> 20) & 0x1) != 0) {
				return true;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "cw.y()");
		}
		return bool;
	}

	static void method_a_void(final GameStub class_ej, final int i) {
		do {
			try {
				if (((1159182273 * MouseInputListener.field_q_2162) != 1) && (Class_al.field_aw_178 || ((MouseInputListener.field_q_2162 * 1159182273) != 4))) {
					break;
				}
				final int i_6_ = (Class_ax.field_d_415 * 1815701817) + 280;
				if (((MouseInputListener.field_k_2164 * 2117517719) >= i_6_) && ((MouseInputListener.field_k_2164 * 2117517719) <= (14 + i_6_)) && ((MouseInputListener.field_x_2158 * 1750309931) >= 4) && ((1750309931 * MouseInputListener.field_x_2158) <= 18)) {
					Class_d.method_d_void(0, 0, -587612912);
				} else if (((2117517719 * MouseInputListener.field_k_2164) >= (i_6_ + 15)) && ((MouseInputListener.field_k_2164 * 2117517719) <= (i_6_ + 80)) && ((1750309931 * MouseInputListener.field_x_2158) >= 4) && ((MouseInputListener.field_x_2158 * 1750309931) <= 18)) {
					Class_d.method_d_void(0, 1, -361911572);
				} else {
					final int i_7_ = (Class_ax.field_d_415 * 1815701817) + 390;
					if (((MouseInputListener.field_k_2164 * 2117517719) >= i_7_) && ((MouseInputListener.field_k_2164 * 2117517719) <= (14 + i_7_)) && ((MouseInputListener.field_x_2158 * 1750309931) >= 4) && ((MouseInputListener.field_x_2158 * 1750309931) <= 18)) {
						Class_d.method_d_void(1, 0, -1392757363);
					} else if (((MouseInputListener.field_k_2164 * 2117517719) >= (15 + i_7_)) && ((2117517719 * MouseInputListener.field_k_2164) <= (80 + i_7_)) && ((MouseInputListener.field_x_2158 * 1750309931) >= 4) && ((1750309931 * MouseInputListener.field_x_2158) <= 18)) {
						Class_d.method_d_void(1, 1, -474638588);
					} else {
						final int i_8_ = (Class_ax.field_d_415 * 1815701817) + 500;
						if (((MouseInputListener.field_k_2164 * 2117517719) >= i_8_) && ((MouseInputListener.field_k_2164 * 2117517719) <= (14 + i_8_)) && ((1750309931 * MouseInputListener.field_x_2158) >= 4) && ((1750309931 * MouseInputListener.field_x_2158) <= 18)) {
							Class_d.method_d_void(2, 0, -1315083617);
						} else if (((2117517719 * MouseInputListener.field_k_2164) >= (i_8_ + 15)) && ((MouseInputListener.field_k_2164 * 2117517719) <= (80 + i_8_)) && ((1750309931 * MouseInputListener.field_x_2158) >= 4) && ((MouseInputListener.field_x_2158 * 1750309931) <= 18)) {
							Class_d.method_d_void(2, 1, -391902409);
						} else {
							final int i_9_ = (1815701817 * Class_ax.field_d_415) + 610;
							if (((2117517719 * MouseInputListener.field_k_2164) >= i_9_) && ((MouseInputListener.field_k_2164 * 2117517719) <= (i_9_ + 14)) && ((1750309931 * MouseInputListener.field_x_2158) >= 4) && ((MouseInputListener.field_x_2158 * 1750309931) <= 18)) {
								Class_d.method_d_void(3, 0, -1280604180);
							} else if (((MouseInputListener.field_k_2164 * 2117517719) >= (15 + i_9_)) && ((MouseInputListener.field_k_2164 * 2117517719) <= (80 + i_9_)) && ((MouseInputListener.field_x_2158 * 1750309931) >= 4) && ((1750309931 * MouseInputListener.field_x_2158) <= 18)) {
								Class_d.method_d_void(3, 1, -1252359861);
							} else if (((MouseInputListener.field_k_2164 * 2117517719) >= (708 + (Class_ax.field_d_415 * 1815701817))) && ((1750309931 * MouseInputListener.field_x_2158) >= 4) && ((MouseInputListener.field_k_2164 * 2117517719) <= (758 + (Class_ax.field_d_415 * 1815701817))) && ((1750309931 * MouseInputListener.field_x_2158) <= 20)) {
								Class_ax.field_ap_443 = false;
								Class_v.field_g_1446.method_h_void(Class_ax.field_d_415 * 1815701817, 0);
								ImageColorModel.field_f_541.method_h_void((Class_ax.field_d_415 * 1815701817) + 382, 0);
								//Class_ax.field_m_419.render(((382 + (1815701817 * Class_ax.field_d_415)) - (Class_ax.field_m_419.field_z_533 / 2)), 18);
							} else {
								if ((Class_ax.field_bw_445 * 1289020967) == -1) {
									break;
								}
								final World worldinfo = (World.worlds[Class_ax.field_bw_445 * 1289020967]);
								if (worldinfo.isMembers() != client.onMembersWorld) {
									client.onMembersWorld = worldinfo.isMembers();
									Class_w.method_s_void(worldinfo.isMembers(), (byte) 80);
								}
								Script.currentWorldAddress = worldinfo.address;
								client.currentWorld = (723566875 * worldinfo.id);
								client.currentWorldMask = (-761260631 * worldinfo.mask);
								Class_cc.port = Settings.PORT * 254347017;/*(254347017 * ((client.game_mode * 1548930135) == 0 ? 43594 : (worldinfo.id * -1909124507) + 40000));*/
								Class_ae.field_bx_57 = ((1548930135 * client.game_mode) == 0 ? 443 : ((-1909124507 * worldinfo.id) + 50000)) * 480351963;
								Friend.field_bc_1094 = Class_cc.port * 1057325665;
								Class_ax.field_ap_443 = false;
								Class_v.field_g_1446.method_h_void(1815701817 * Class_ax.field_d_415, 0);
								ImageColorModel.field_f_541.method_h_void(382 + (Class_ax.field_d_415 * 1815701817), 0);
								//Class_ax.field_m_419.render(((382 + (1815701817 * Class_ax.field_d_415)) - (Class_ax.field_m_419.field_z_533 / 2)), 18);
							}
						}
					}
				}
			} catch (final RuntimeException runtimeexception) {
				throw GameCanvas.error(runtimeexception, "cw.a()");
			}
			break;
		} while (false);
	}

	static final void method_dz_void(final Widget widget, final int i, final int i_10_, final int i_11_, final int i_12_) {
		try {
			Class_db.method_p_void(996785827);
			final Class_fp class_fp = widget.method_x_fp((byte) -22);
			if (class_fp != null) {
				Rasterizer.method_ce_void(i, i_10_, (class_fp.field_n_2427 * -821941733) + i, ((1159260577 * class_fp.field_d_2424) + i_10_));
				if (((client.field_nk_2925 * 345141143) != 2) && ((345141143 * client.field_nk_2925) != 5)) {
					final int i_13_ = (((-2037472027 * client.miniMapAngle) + (client.miniMapOffset * 1814938795)) & 0x7ff);
					final int i_14_ = 48 + ((Class_ci.myPlayer.worldPosX * -2103184911) / 32);
					final int i_15_ = 464 - ((2088773389 * Class_ci.myPlayer.worldPosY) / 32);
					Class_a.field_mp_793.method_b_void(i, i_10_, -821941733 * class_fp.field_n_2427, 1159260577 * class_fp.field_d_2424, i_14_, i_15_, i_13_, (-1606807399 * client.miniMapScale) + 256, class_fp.field_y_2430, class_fp.field_z_2426);
					for (int i_16_ = 0; i_16_ < (client.field_mm_2717 * 916003575); i_16_++) {
						final int i_17_ = (((client.field_mu_2920[i_16_] * 4) + 2) - ((-2103184911 * Class_ci.myPlayer.worldPosX) / 32));
						final int i_18_ = ((2 + (client.field_mr_2921[i_16_] * 4)) - ((Class_ci.myPlayer.worldPosY * 2088773389) / 32));
						ItemDefinitions.method_de_void(i, i_10_, i_17_, i_18_, client.field_mi_2922[i_16_], class_fp, 1212140944);
					}
					for (int i_19_ = 0; i_19_ < 104; i_19_++) {
						for (int i_20_ = 0; i_20_ < 104; i_20_++) {
							final NodeDeque deque = (client.groundItemsDeque[250114511 * Class_ed.plane][i_19_][i_20_]);
							if (deque != null) {
								final int i_21_ = ((2 + (4 * i_19_)) - ((-2103184911 * (Class_ci.myPlayer.worldPosX)) / 32));
								final int i_22_ = (((i_20_ * 4) + 2) - ((2088773389 * (Class_ci.myPlayer.worldPosY)) / 32));
								ItemDefinitions.method_de_void(i, i_10_, i_21_, i_22_, (Class_eo.mapdots[0]), class_fp, -1558391074);
							}
						}
					}
					for (int i_23_ = 0; i_23_ < (1308149425 * client.localNpcCount); i_23_++) {
						final Npc npc = client.npcs[client.npcIndexArray[i_23_]];
						if ((npc != null) && npc.method_z_boolean(1256188780)) {
							NpcComposite npcdef = npc.composite;
							if ((npcdef != null) && (npcdef.childrenIds != null)) {
								npcdef = npcdef.method_f_az(836773472);
							}
							if ((npcdef != null) && npcdef.field_o_494 && npcdef.field_ab_496) {
								final int i_24_ = (((-2103184911 * npc.worldPosX) / 32) - ((-2103184911 * (Class_ci.myPlayer.worldPosX)) / 32));
								final int i_25_ = (((npc.worldPosY * 2088773389) / 32) - ((2088773389 * (Class_ci.myPlayer.worldPosY)) / 32));
								ItemDefinitions.method_de_void(i, i_10_, i_24_, i_25_, (Class_eo.mapdots[1]), class_fp, 534721532);
							}
						}
					}
					for (int i_26_ = 0; i_26_ < (2000365659 * client.localPlayerCount); i_26_++) {
						final Player player = client.localPlayers[client.playerIndexArray[i_26_]];
						if ((player != null) && player.method_z_boolean(1232624884) && !player.spotAnimating) {
							final int i_27_ = (((-2103184911 * player.worldPosX) / 32) - ((-2103184911 * Class_ci.myPlayer.worldPosX) / 32));
							final int i_28_ = (((2088773389 * player.worldPosY) / 32) - ((2088773389 * Class_ci.myPlayer.worldPosY) / 32));
							boolean bool = false;
							if (GameStub.method_dx_boolean((player.name), true, 1684246173)) {
								bool = true;
							}
							boolean bool_29_ = false;
							for (int i_30_ = 0; i_30_ < (Class_ci.clanSize * -603301767); i_30_++) {
								if (player.name.equals(Class_dd.field_mq_1588[i_30_].name)) {
									bool_29_ = true;
									break;
								}
							}
							boolean bool_31_ = false;
							if (((-1226262297 * (Class_ci.myPlayer.field_v_1561)) != 0) && ((player.field_v_1561 * -1226262297) != 0) && ((-1226262297 * (Class_ci.myPlayer.field_v_1561)) == (-1226262297 * player.field_v_1561))) {
								bool_31_ = true;
							}
							if (bool) {
								ItemDefinitions.method_de_void(i, i_10_, i_27_, i_28_, (Class_eo.mapdots[3]), class_fp, 1249945423);
							} else if (bool_31_) {
								ItemDefinitions.method_de_void(i, i_10_, i_27_, i_28_, (Class_eo.mapdots[4]), class_fp, -840981702);
							} else if (bool_29_) {
								ItemDefinitions.method_de_void(i, i_10_, i_27_, i_28_, (Class_eo.mapdots[5]), class_fp, 937210049);
							} else {
								ItemDefinitions.method_de_void(i, i_10_, i_27_, i_28_, (Class_eo.mapdots[2]), class_fp, 1314644269);
							}
						}
					}
					if (((client.hintMarkerType * 237348707) != 0) && (((client.currentCycle * 303796053) % 20) < 10)) {
						if (((client.hintMarkerType * 237348707) == 1) && ((-1218882453 * client.hintMarkerNpcIndex) >= 0) && ((client.hintMarkerNpcIndex * -1218882453) < client.npcs.length)) {
							final Npc npc = (client.npcs[-1218882453 * client.hintMarkerNpcIndex]);
							if (npc != null) {// marker on npc
								final int i_32_ = (((npc.worldPosX * -2103184911) / 32) - ((-2103184911 * (Class_ci.myPlayer.worldPosX)) / 32));
								final int i_33_ = (((npc.worldPosY * 2088773389) / 32) - (((Class_ci.myPlayer.worldPosY) * 2088773389) / 32));
								GameStub.method_du_void(i, i_10_, i_32_, i_33_, (Class_ey.mapmarker[1]), class_fp, (short) -15605);
							}
						}
						if ((client.hintMarkerType * 237348707) == 2) {// marker on minimap
							final int i_34_ = ((((client.field_ab_2772 * -466786140) - (Class_q.originX * -1817688980)) + 2) - ((-2103184911 * Class_ci.myPlayer.worldPosX) / 32));
							final int i_35_ = ((2 + ((1718628668 * client.field_ao_2942) - (Class_gf.originY * -2079451836))) - ((Class_ci.myPlayer.worldPosY * 2088773389) / 32));
							GameStub.method_du_void(i, i_10_, i_34_, i_35_, Class_ey.mapmarker[1], class_fp, (short) -13135);
						}
						if (((237348707 * client.hintMarkerType) == 10) && ((client.hintMarkerPlayerIndex * -618750031) >= 0) && ((-618750031 * client.hintMarkerPlayerIndex) < client.localPlayers.length)) {
							final Player player = (client.localPlayers[-618750031 * client.hintMarkerPlayerIndex]);
							if (player != null) {// marker on player
								final int i_36_ = (((player.worldPosX * -2103184911) / 32) - ((-2103184911 * (Class_ci.myPlayer.worldPosX)) / 32));
								final int i_37_ = (((2088773389 * player.worldPosY) / 32) - (((Class_ci.myPlayer.worldPosY) * 2088773389) / 32));
								GameStub.method_du_void(i, i_10_, i_36_, i_37_, (Class_ey.mapmarker[1]), class_fp, (short) -2054);
							}
						}
					}
					if ((client.field_mk_2923 * 851978955) != 0) {//object?
						final int i_38_ = ((2 + (client.field_mk_2923 * -887051476)) - ((-2103184911 * Class_ci.myPlayer.worldPosX) / 32));
						final int i_39_ = ((2 + (-1898164228 * client.field_mn_2924)) - ((Class_ci.myPlayer.worldPosY * 2088773389) / 32));//maybe marker on location
						ItemDefinitions.method_de_void(i, i_10_, i_38_, i_39_, Class_ey.mapmarker[0], class_fp, -1413682087);
					}
					if (!Class_ci.myPlayer.spotAnimating) {
						Rasterizer.fillRect((i + ((-821941733 * class_fp.field_n_2427) / 2)) - 1, (i_10_ + ((class_fp.field_d_2424 * 1159260577) / 2)) - 1, 3, 3, 16777215);
					}
				} else {
					Rasterizer.method_cs_void(i, i_10_, 0, class_fp.field_y_2430, class_fp.field_z_2426);
				}
				client.field_lt_2719[i_11_] = true;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "cw.dz()");
		}
	}

	Class_cw() {
		/* empty */
	}

	static final void handleConfig(final int config) {
		try {
			Class_s.method_df_void();
			for (Class_o class_o = (Class_o) Class_o.field_n_1232.method_f_ga(); class_o != null; class_o = (Class_o) Class_o.field_n_1232.method_a_ga()) {
				if (class_o.field_x_1235 != null) {
					class_o.method_d_void(647357509);
				}
			}
			final int i_41_ = AnimationSequence.getVarp(config).value * 544212227;
			if (i_41_ != 0) {
				final int i_42_ = Class_fv.configs[config];
				if (i_41_ == 1) {
					if (i_42_ == 1) {
						Rasterizer3D.method_g_void(0.9);
						((Class_cc) Rasterizer3D.field_ak_1157).method_r_void(0.9);
					}
					if (i_42_ == 2) {
						Rasterizer3D.method_g_void(0.8);
						((Class_cc) Rasterizer3D.field_ak_1157).method_r_void(0.8);
					}
					if (i_42_ == 3) {
						Rasterizer3D.method_g_void(0.7);
						((Class_cc) Rasterizer3D.field_ak_1157).method_r_void(0.7);
					}
					if (i_42_ == 4) {
						Rasterizer3D.method_g_void(0.6);
						((Class_cc) Rasterizer3D.field_ak_1157).method_r_void(0.6);
					}
					Npc.method_j_void((byte) 10);
				}
				if (i_41_ == 3) {
					int i_43_ = 0;
					if (i_42_ == 0) {
						i_43_ = 255;
					}
					if (i_42_ == 1) {
						i_43_ = 192;
					}
					if (i_42_ == 2) {
						i_43_ = 128;
					}
					if (i_42_ == 3) {
						i_43_ = 64;
					}
					if (i_42_ == 4) {
						i_43_ = 0;
					}
					if ((client.field_ne_2926 * 1614344149) != i_43_) {
						if (((client.field_ne_2926 * 1614344149) == 0) && ((client.field_nh_2927 * 1897970477) != -1)) {
							Index.method_d_void(World.musicIndex1, (1897970477 * client.field_nh_2927), 0, i_43_, false, 824045845);
							client.field_np_2928 = false;
						} else if (i_43_ == 0) {
							Class_dw.method_z_void((byte) 30);
							client.field_np_2928 = false;
						} else if ((-858508631 * Class_fa.field_e_2278) != 0) {
							Class_eh.field_a_2122 = -1099365411 * i_43_;
						} else {
							Class_fa.field_y_2276.method_n_void(i_43_, -931129597);
						}
						client.field_ne_2926 = i_43_ * -540094083;
					}
				}
				if (i_41_ == 4) {
					if (i_42_ == 0) {
						client.field_ng_2929 = 1720522077;
					}
					if (i_42_ == 1) {
						client.field_ng_2929 = -1168208608;
					}
					if (i_42_ == 2) {
						client.field_ng_2929 = 2084505792;
					}
					if (i_42_ == 3) {
						client.field_ng_2929 = 1042252896;
					}
					if (i_42_ == 4) {
						client.field_ng_2929 = 0;
					}
				}
				if (i_41_ == 5) {
					client.field_hs_2855 = i_42_ * -855877785;
				}
				if (i_41_ == 6) {
					client.field_js_2849 = i_42_ * -234382337;
				}
				if (i_41_ == 9) {
					client.field_ju_2697 = i_42_ * -531634345;
				}
				if (i_41_ == 10) {
					if (i_42_ == 0) {
						client.field_nm_2918 = -2100482847;
					}
					if (i_42_ == 1) {
						client.field_nm_2918 = -1181942880;
					}
					if (i_42_ == 2) {
						client.field_nm_2918 = -787961920;
					}
					if (i_42_ == 3) {
						client.field_nm_2918 = -393980960;
					}
					if (i_42_ == 4) {
						client.field_nm_2918 = 0;
					}
				}
				if (i_41_ == 17) {
					client.field_jo_2954 = (i_42_ & 0xffff) * 1825533571;
				}
				if (i_41_ == 18) {
					client.field_ai_2895 = (Class_v) (Friend.identify(Renderable.method_n_vArray(-189240855), i_42_));
					if (client.field_ai_2895 == null) {
						client.field_ai_2895 = Class_v.field_n_1442;
					}
				}
				if (i_41_ == 19) {
					if (i_42_ == -1) {
						client.field_hm_2819 = -1926064935;
					} else {
						client.field_hm_2819 = (i_42_ & 0x7ff) * 1926064935;
					}
				}

                if (i_41_ == 22) {
                    client.aClass87_2963 = (Class_v) (Friend.identify(Renderable.method_n_vArray(-189240855), i_42_));
                    if (client.aClass87_2963 == null) {
                        client.aClass87_2963 = Class_v.field_n_1442;
                    }
                }
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "cw.da()");
		}
	}
}
