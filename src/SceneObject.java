/* InteractableObject - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Color;
import java.awt.FontMetrics;

public final class SceneObject {
	static int field_kn_935;
	int plane;
	int gridX;
	int field_l_938;
	public Renderable renderable;
	int orientation;
	int x;
	int gridY;
	int y;
	int maxLocY;
	int height;
	int field_u_946;
	public int uid = 0;
	int maxLocX;
	protected static FontMetrics field_bf_949;
	protected static int field_pf_950;
	int config = 0;

	static void method_z_void(final GameStub class_ej, final int i) {
		try {
			if (Class_ax.field_ap_443) {
				Class_cw.method_a_void(class_ej, 1380349810);
			} else {
				if ((((MouseInputListener.field_q_2162 * 1159182273) == 1) || (!Class_al.field_aw_178 && ((MouseInputListener.field_q_2162 * 1159182273) == 4))) && ((MouseInputListener.field_k_2164 * 2117517719) >= ((765 + (Class_ax.field_d_415 * 1815701817)) - 50)) && ((MouseInputListener.field_x_2158 * 1750309931) >= 453)) {
					Class_w.field_pz_1501.field_y_783 = !Class_w.field_pz_1501.field_y_783;
					Class_bh.method_z_void(-840141801);
					if (!Class_w.field_pz_1501.field_y_783) {
						Class_ax.playTune(World.musicIndex1, "scape main", "", 255, false, (byte) -42);
					} else {
						Class_dw.method_z_void((byte) 10);
					}
				}
				if ((client.status * 824045845) != 5) {
					Class_ax.field_al_429 += -1358702343;
					if (((824045845 * client.status) == 10) || ((824045845 * client.status) == 11)) {
						if ((-1485158959 * client.hideWorldList) == 0) {
							if (((MouseInputListener.field_q_2162 * 1159182273) == 1) || (!Class_al.field_aw_178 && ((1159182273 * MouseInputListener.field_q_2162) == 4))) {
								final int i_0_ = 5 + (1815701817 * Class_ax.field_d_415);
								final int i_1_ = 463;
								final int i_2_ = 100;
								final int i_3_ = 35;
								if (((2117517719 * MouseInputListener.field_k_2164) >= i_0_) && ((MouseInputListener.field_k_2164 * 2117517719) <= (i_0_ + i_2_)) && ((MouseInputListener.field_x_2158 * 1750309931) >= i_1_) && ((MouseInputListener.field_x_2158 * 1750309931) <= (i_1_ + i_3_))) {
									if (Menu.method_n_boolean(65280)) {
										Class_ax.field_ap_443 = true;
									}
									return;
								}
							}
							if ((Class_fp.field_h_2429 != null) && Menu.method_n_boolean(65280)) {
								Class_ax.field_ap_443 = true;
							}
						}
						int i_4_ = 1159182273 * MouseInputListener.field_q_2162;
						final int i_5_ = MouseInputListener.field_k_2164 * 2117517719;
						final int i_6_ = MouseInputListener.field_x_2158 * 1750309931;
						if (!Class_al.field_aw_178 && (i_4_ == 4)) {
							i_4_ = 1;
						}
						if ((-1292322347 * Class_ax.loginScreenStatus) == 0) {
							int i_7_ = ((1952440023 * Class_ax.field_r_440) + 180) - 80;
							final int i_8_ = 291;
							if ((i_4_ == 1) && (i_5_ >= (i_7_ - 75)) && (i_5_ <= (i_7_ + 75)) && (i_6_ >= (i_8_ - 20)) && (i_6_ <= (i_8_ + 20))) {
								//GameObject.browseURL(new StringBuilder(Item.getWebLink("secure", true)).append("m=account-creation/g=oldscape/create_account_funnel.ws").toString(), true, false, -1043454110);
								GameObject.browseURL("http://community.salve-ps.com/index.php?app=core&module=global&section=register", true, false, -1043454110);
							}
							i_7_ = (Class_ax.field_r_440 * 1952440023) + 180 + 80;
							if ((i_4_ == 1) && (i_5_ >= (i_7_ - 75)) && (i_5_ <= (i_7_ + 75)) && (i_6_ >= (i_8_ - 20)) && (i_6_ <= (i_8_ + 20))) {
								if (((client.currentWorldMask * -1483883627) & 0x4) != 0) {
									if (((-1483883627 * client.currentWorldMask) & 0x400) != 0) {
										Class_ax.loginResponseMessage = MenuText.HIGH_RISK_PVP_WORLD;
										Class_ax.loginResponseMessage1 = MenuText.PVP_ALMOST_EVERYWHERE;
										Class_ax.loginResponseMessage2 = MenuText.PROTECT_ITEM_WONT_WORK;
									} else {
										Class_ax.loginResponseMessage = MenuText.PVP_WORLD_FLAGGED;
										Class_ax.loginResponseMessage1 = MenuText.PVP_ALLOWED;
										Class_ax.loginResponseMessage2 = MenuText.ALMOST_EVERYWHERE;
									}
									Class_ax.loginScreenStatus = -2049001603;
									Class_ax.loginScreenSelectedFieldId = 0;
								} else if (((client.currentWorldMask * -1483883627) & 0x400) != 0) {
									Class_ax.loginResponseMessage = MenuText.HIGH_RISK_WORLD;
									Class_ax.loginResponseMessage1 = MenuText.PROTECT_ITEM_WILL;
									Class_ax.loginResponseMessage2 = MenuText.NOT_WORK;
									Class_ax.loginScreenStatus = -2049001603;
									Class_ax.loginScreenSelectedFieldId = 0;
								} else {
									Class_ax.loginResponseMessage = MenuText.EMPTY_____;
									Class_ax.loginResponseMessage1 = MenuText.ENTER_CREDENTIALS;
									Class_ax.loginResponseMessage2 = MenuText.EMPTY_______;
									Class_ax.loginScreenStatus = 196964090;
									Class_ax.loginScreenSelectedFieldId = 0;
								}
							}
						} else if ((Class_ax.loginScreenStatus * -1292322347) == 1) {
							while (Class_dd.method_z_boolean(352536065)) {
								if ((221079961 * Class_al.field_ce_179) == 84) {
									Class_ax.loginResponseMessage = MenuText.EMPTY_____;
									Class_ax.loginResponseMessage1 = MenuText.ENTER_CREDENTIALS;
									Class_ax.loginResponseMessage2 = MenuText.EMPTY_______;
									Class_ax.loginScreenStatus = 196964090;
									Class_ax.loginScreenSelectedFieldId = 0;
								} else if ((221079961 * Class_al.field_ce_179) == 13) {
									Class_ax.loginScreenStatus = 0;
								}
							}
							int i_9_ = (180 + (Class_ax.field_r_440 * 1952440023)) - 80;
							final int i_10_ = 321;
							if ((i_4_ == 1) && (i_5_ >= (i_9_ - 75)) && (i_5_ <= (i_9_ + 75)) && (i_6_ >= (i_10_ - 20)) && (i_6_ <= (20 + i_10_))) {
								Class_ax.loginResponseMessage = MenuText.EMPTY_____;
								Class_ax.loginResponseMessage1 = MenuText.ENTER_CREDENTIALS;
								Class_ax.loginResponseMessage2 = MenuText.EMPTY_______;
								Class_ax.loginScreenStatus = 196964090;
								Class_ax.loginScreenSelectedFieldId = 0;
							}
							i_9_ = 180 + (1952440023 * Class_ax.field_r_440) + 80;
							if ((i_4_ == 1) && (i_5_ >= (i_9_ - 75)) && (i_5_ <= (75 + i_9_)) && (i_6_ >= (i_10_ - 20)) && (i_6_ <= (20 + i_10_))) {
								Class_ax.loginScreenStatus = 0;
							}
						} else if ((Class_ax.loginScreenStatus * -1292322347) == 2) {
							int i_11_ = 231;
							int i_12_ = i_11_ + 30;
							if ((i_4_ == 1) && (i_6_ >= (i_12_ - 15)) && (i_6_ < i_12_)) {
								Class_ax.loginScreenSelectedFieldId = 0;
							}
							i_12_ += 15;
							if ((i_4_ == 1) && (i_6_ >= (i_12_ - 15)) && (i_6_ < i_12_)) {
								Class_ax.loginScreenSelectedFieldId = -1825009075;
							}
							i_12_ += 15;
							i_11_ = 361;
							if ((i_4_ == 1) && (i_6_ >= (i_11_ - 15)) && (i_6_ < i_11_)) {
								Class_fl.method_g_void(MenuText.SALVE_1, MenuText.SALVE_2, MenuText.SALVE_3, 250449867);
								Class_ax.loginScreenStatus = -1655073423;
							} else {
								int i_13_ = ((180 + (1952440023 * Class_ax.field_r_440)) - 80);
								final int i_14_ = 321;
								if ((i_4_ == 1) && (i_5_ >= (i_13_ - 75)) && (i_5_ <= (75 + i_13_)) && (i_6_ >= (i_14_ - 20)) && (i_6_ <= (20 + i_14_))) {
									Class_ax.username = Class_ax.username.trim();
									if (Class_ax.username.length() == 0) {
										Class_fl.method_g_void(MenuText.field_dw_1900, MenuText.field_da_1894, MenuText.field_dd_1902, 501741100);
									} else if (Class_ax.password.length() == 0) {
										Class_fl.method_g_void(MenuText.field_db_1810, MenuText.field_ds_1904, MenuText.field_dz_1905, -1689330748);
									} else {
										Class_fl.method_g_void(MenuText.field_hn_2009, MenuText.field_hs_2026, MenuText.field_hz_1945, 136882479);
										Class_ax.field_aw_438 = ((Class_w.field_pz_1501.typedUsername.containsKey(Integer.valueOf(Class_s.method_g_int(Class_ax.username, 850115284)))) ? Class_ez.field_n_2268 : Class_ez.field_z_2271);
										Socket.method_h_void(20, -1936411014);
									}
								} else {
									i_13_ = 180 + (Class_ax.field_r_440 * 1952440023) + 80;
									if ((i_4_ == 1) && (i_5_ >= (i_13_ - 75)) && (i_5_ <= (75 + i_13_)) && (i_6_ >= (i_14_ - 20)) && (i_6_ <= (i_14_ + 20))) {
										Class_ax.loginScreenStatus = 0;
										Class_ax.username = "";
										Class_ax.password = "";
										Class_am.field_ai_192 = 0;
										Class_p.field_ah_1247 = "";
										Class_ax.field_aq_439 = true;
									}
									while (Class_dd.method_z_boolean(495040157)) {
										boolean bool = false;
										for (int i_15_ = 0; i_15_ < Class_ax.field_am_428.length(); i_15_++) {
											if (Bindable.field_cf_1703 == Class_ax.field_am_428.charAt(i_15_)) {
												bool = true;
												break;
											}
										}
										if ((Class_al.field_ce_179 * 221079961) == 13) {
											Class_ax.loginScreenStatus = 0;
											Class_ax.username = "";
											Class_ax.password = "";
											Class_am.field_ai_192 = 0;
											Class_p.field_ah_1247 = "";
											Class_ax.field_aq_439 = true;
										} else if (((Class_ax.loginScreenSelectedFieldId) * 169801349) == 0) {
											if (((Class_al.field_ce_179 * 221079961) == 85) && (Class_ax.username.length() > 0)) {
												Class_ax.username = (Class_ax.username.substring(0, Class_ax.username.length() - 1));
											}
											if (((221079961 * Class_al.field_ce_179) == 84) || ((221079961 * Class_al.field_ce_179) == 80)) {
												Class_ax.loginScreenSelectedFieldId = -1825009075;
											}
											if (bool && (Class_ax.username.length() < 320)) {
												Class_ax.username = new StringBuilder(Class_ax.username).append(Bindable.field_cf_1703).toString();
											}
										} else if ((169801349 * (Class_ax.loginScreenSelectedFieldId)) == 1) {
											if (((Class_al.field_ce_179 * 221079961) == 85) && (Class_ax.password.length() > 0)) {
												Class_ax.password = (Class_ax.password.substring(0, Class_ax.password.length() - 1));
											}
											if (((Class_al.field_ce_179 * 221079961) == 84) || ((221079961 * Class_al.field_ce_179) == 80)) {
												Class_ax.loginScreenSelectedFieldId = 0;
											}
											if ((221079961 * Class_al.field_ce_179) == 84) {
												Class_ax.username = Class_ax.username.trim();
												if (Class_ax.username.length() == 0) {
													Class_fl.method_g_void((MenuText.field_dw_1900), (MenuText.field_da_1894), (MenuText.field_dd_1902), -1746261201);
												} else {
													if (Class_ax.password.length() == 0) {
														Class_fl.method_g_void((MenuText.field_db_1810), (MenuText.field_ds_1904), (MenuText.field_dz_1905), -1949391685);
													} else {
														Class_fl.method_g_void((MenuText.field_hn_2009), (MenuText.field_hs_2026), (MenuText.field_hz_1945), -476319339);
														Class_ax.field_aw_438 = (((Class_w.field_pz_1501).typedUsername.containsKey(Integer.valueOf(Class_s.method_g_int((Class_ax.username), 269794781)))) ? (Class_ez.field_n_2268) : (Class_ez.field_z_2271));
														Socket.method_h_void(20, -973371181);
														break;
													}
													break;
												}
												break;
											}
											if (bool && (Class_ax.password.length() < 20)) {
												Class_ax.password = new StringBuilder(Class_ax.password).append(Bindable.field_cf_1703).toString();
											}
										}
									}
								}
							}
						} else if ((Class_ax.loginScreenStatus * -1292322347) == 4) {
							int i_16_ = (180 + (Class_ax.field_r_440 * 1952440023)) - 80;
							final int i_17_ = 321;
							if ((i_4_ == 1) && (i_5_ >= (i_16_ - 75)) && (i_5_ <= (i_16_ + 75)) && (i_6_ >= (i_17_ - 20)) && (i_6_ <= (i_17_ + 20))) {
								Class_p.field_ah_1247.trim();
								if (Class_p.field_ah_1247.length() != 6) {
									Class_fl.method_g_void(MenuText.field_ao_1816, MenuText.field_ac_2045, MenuText.field_az_1967, 1373542153);
								} else {
									Class_am.field_ai_192 = (Integer.parseInt(Class_p.field_ah_1247) * -622610087);
									Class_p.field_ah_1247 = "";
									Class_ax.field_aw_438 = (Class_ax.field_aq_439 ? Class_ez.field_d_2267 : Class_ez.field_y_2269);
									Class_fl.method_g_void(MenuText.field_hn_2009, MenuText.field_hs_2026, MenuText.field_hz_1945, 690219366);
									Socket.method_h_void(20, -881465307);
								}
							} else {
								if ((i_4_ == 1) && (i_5_ >= (((Class_ax.field_r_440 * 1952440023) + 180) - 9)) && (i_5_ <= (130 + (1952440023 * Class_ax.field_r_440) + 180)) && (i_6_ >= 263) && (i_6_ <= 296)) {
									Class_ax.field_aq_439 = !Class_ax.field_aq_439;
								}
								if ((i_4_ == 1) && (i_5_ >= (((1952440023 * Class_ax.field_r_440) + 180) - 34)) && (i_5_ <= (180 + (1952440023 * Class_ax.field_r_440) + 34)) && (i_6_ >= 351) && (i_6_ <= 363)) {
									GameObject.browseURL(new StringBuilder(Item.getWebLink("secure", true)).append("m=totp-authenticator/disableTOTPRequest").toString(), true, false, -969277089);
								}
								i_16_ = (80 + (Class_ax.field_r_440 * 1952440023) + 180);
								if ((i_4_ == 1) && (i_5_ >= (i_16_ - 75)) && (i_5_ <= (75 + i_16_)) && (i_6_ >= (i_17_ - 20)) && (i_6_ <= (i_17_ + 20))) {
									Class_ax.loginScreenStatus = 0;
									Class_ax.username = "";
									Class_ax.password = "";
									Class_am.field_ai_192 = 0;
									Class_p.field_ah_1247 = "";
								}
								while (Class_dd.method_z_boolean(1562230096)) {
									boolean bool = false;
									for (int i_18_ = 0; (i_18_ < Class_ax.field_aj_442.length()); i_18_++) {
										if (Bindable.field_cf_1703 == Class_ax.field_aj_442.charAt(i_18_)) {
											bool = true;
											break;
										}
									}
									if ((Class_al.field_ce_179 * 221079961) == 13) {
										Class_ax.loginScreenStatus = 0;
										Class_ax.username = "";
										Class_ax.password = "";
										Class_am.field_ai_192 = 0;
										Class_p.field_ah_1247 = "";
									} else {
										if (((Class_al.field_ce_179 * 221079961) == 85) && (Class_p.field_ah_1247.length() > 0)) {
											Class_p.field_ah_1247 = (Class_p.field_ah_1247.substring(0, Class_p.field_ah_1247.length() - 1));
										}
										if ((Class_al.field_ce_179 * 221079961) == 84) {
											Class_p.field_ah_1247.trim();
											if (Class_p.field_ah_1247.length() != 6) {
												Class_fl.method_g_void(MenuText.field_ao_1816, MenuText.field_ac_2045, MenuText.field_az_1967, -272998939);
											} else {
												Class_am.field_ai_192 = ((Integer.parseInt(Class_p.field_ah_1247)) * -622610087);
												Class_p.field_ah_1247 = "";
												Class_ax.field_aw_438 = (Class_ax.field_aq_439 ? Class_ez.field_d_2267 : (Class_ez.field_y_2269));
												Class_fl.method_g_void(MenuText.field_hn_2009, MenuText.field_hs_2026, MenuText.field_hz_1945, 1941305740);
												Socket.method_h_void(20, -871346054);
												break;
											}
											break;
										}
										if (bool && (Class_p.field_ah_1247.length() < 6)) {
											Class_p.field_ah_1247 = new StringBuilder(Class_p.field_ah_1247).append(Bindable.field_cf_1703).toString();
										}
									}
								}
							}
						} else if ((-1292322347 * Class_ax.loginScreenStatus) == 5) {
							int i_19_ = (180 + (1952440023 * Class_ax.field_r_440)) - 80;
							final int i_20_ = 321;
							if ((i_4_ == 1) && (i_5_ >= (i_19_ - 75)) && (i_5_ <= (75 + i_19_)) && (i_6_ >= (i_20_ - 20)) && (i_6_ <= (20 + i_20_))) {
								GameMessage.method_y_void(-1465641406);
							} else {
								i_19_ = (80 + (1952440023 * Class_ax.field_r_440) + 180);
								if ((i_4_ == 1) && (i_5_ >= (i_19_ - 75)) && (i_5_ <= (75 + i_19_)) && (i_6_ >= (i_20_ - 20)) && (i_6_ <= (i_20_ + 20))) {
									Class_ax.loginResponseMessage = MenuText.EMPTY_____;
									Class_ax.loginResponseMessage1 = MenuText.ENTER_CREDENTIALS;
									Class_ax.loginResponseMessage2 = MenuText.EMPTY_______;
									Class_ax.loginScreenStatus = 196964090;
									Class_ax.loginScreenSelectedFieldId = 0;
									Class_ax.password = "";
								}
								while (Class_dd.method_z_boolean(1174341774)) {
									boolean bool = false;
									for (int i_21_ = 0; (i_21_ < Class_ax.field_am_428.length()); i_21_++) {
										if (Bindable.field_cf_1703 == Class_ax.field_am_428.charAt(i_21_)) {
											bool = true;
											break;
										}
									}
									if ((221079961 * Class_al.field_ce_179) == 13) {
										Class_ax.loginResponseMessage = MenuText.EMPTY_____;
										Class_ax.loginResponseMessage1 = MenuText.ENTER_CREDENTIALS;
										Class_ax.loginResponseMessage2 = MenuText.EMPTY_______;
										Class_ax.loginScreenStatus = 196964090;
										Class_ax.loginScreenSelectedFieldId = 0;
										Class_ax.password = "";
									} else {
										if (((Class_al.field_ce_179 * 221079961) == 85) && (Class_ax.username.length() > 0)) {
											Class_ax.username = (Class_ax.username.substring(0, (Class_ax.username.length() - 1)));
										}
										if ((221079961 * Class_al.field_ce_179) == 84) {
											GameMessage.method_y_void(-1465641406);
											break;
										}
										if (bool && (Class_ax.username.length() < 320)) {
											Class_ax.username = new StringBuilder(Class_ax.username).append(Bindable.field_cf_1703).toString();
										}
									}
								}
							}
						} else if ((-1292322347 * Class_ax.loginScreenStatus) == 6) {
							while (Class_dd.method_z_boolean(-291296473)) {
								if (((Class_al.field_ce_179 * 221079961) == 84) || ((Class_al.field_ce_179 * 221079961) == 13)) {
									Class_ax.loginResponseMessage = MenuText.EMPTY_____;
									Class_ax.loginResponseMessage1 = MenuText.ENTER_CREDENTIALS;
									Class_ax.loginResponseMessage2 = MenuText.EMPTY_______;
									Class_ax.loginScreenStatus = 196964090;
									Class_ax.loginScreenSelectedFieldId = 0;
									Class_ax.password = "";
								}
							}
							final int i_22_ = 321;
							if ((i_4_ == 1) && (i_6_ >= (i_22_ - 20)) && (i_6_ <= (20 + i_22_))) {
								Class_ax.loginResponseMessage = MenuText.EMPTY_____;
								Class_ax.loginResponseMessage1 = MenuText.ENTER_CREDENTIALS;
								Class_ax.loginResponseMessage2 = MenuText.EMPTY_______;
								Class_ax.loginScreenStatus = 196964090;
								Class_ax.loginScreenSelectedFieldId = 0;
								Class_ax.password = "";
							}
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ch.z()");
		}
	}

	static final int method_q_int(final int i, final int i_23_, final short i_24_) {
		int i_25_;
		try {
			final int i_26_ = (Widget.method_k_int(i - 1, i_23_ - 1, 1335908137) + Widget.method_k_int(i + 1, i_23_ - 1, -441185829) + Widget.method_k_int(i - 1, 1 + i_23_, 1119291252) + Widget.method_k_int(1 + i, 1 + i_23_, 1092532335));
			final int i_27_ = (Widget.method_k_int(i - 1, i_23_, -433814522) + Widget.method_k_int(1 + i, i_23_, -813249472) + Widget.method_k_int(i, i_23_ - 1, 272157713) + Widget.method_k_int(i, 1 + i_23_, -1184761937));
			final int i_28_ = Widget.method_k_int(i, i_23_, -1903178697);
			i_25_ = (i_28_ / 4) + (i_26_ / 16) + (i_27_ / 8);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ch.q()");
		}
		return i_25_;
	}

	static final void method_aj_void(final boolean bool, final byte i) {
		try {
			int i_29_ = 0;
			for (/**/; i_29_ < (client.localNpcCount * 1308149425); i_29_++) {
				final Npc npc = client.npcs[client.npcIndexArray[i_29_]];
				int i_30_ = (client.npcIndexArray[i_29_] << 14) + 536870912;
				if ((npc != null) && npc.method_z_boolean(1995428054) && (npc.composite.field_i_495 == bool) && npc.composite.method_m_boolean((byte) -98)) {
					final int i_31_ = (npc.worldPosX * -2103184911) >> 7;
				final int i_32_ = (2088773389 * npc.worldPosY) >> 7;
			if ((i_31_ >= 0) && (i_31_ < 104) && (i_32_ >= 0) && (i_32_ < 104)) {
				if (((npc.size * 45211131) == 1) && (((-2103184911 * npc.worldPosX) & 0x7f) == 64) && (((npc.worldPosY * 2088773389) & 0x7f) == 64)) {
					if ((client.field_gl_2789 * -381545033) == client.field_fz_2788[i_31_][i_32_]) {
						continue;
					}
					client.field_fz_2788[i_31_][i_32_] = client.field_gl_2789 * -381545033;
				}
				if (!npc.composite.field_ab_496) {
					i_30_ -= -2147483648;
				}
				Class_ae.sceneGraph.method_u_boolean(Class_ed.plane * 250114511, -2103184911 * npc.worldPosX, npc.worldPosY * 2088773389, (Class_q.getTileHeight((((npc.size * -1401454912) - 64) + (npc.worldPosX * -2103184911)), (((-1401454912 * npc.size) - 64) + (2088773389 * npc.worldPosY)), 250114511 * Class_ed.plane)),
						((-1401454912 * npc.size) - 64) + 60, npc, -2023015971 * npc.field_b_217, i_30_, npc.field_t_267);
			}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ch.aj()");
		}
	}

	static void method_y_void(final int i, final Class_du class_du, final Index class_fx, final int i_33_) {
		try {
			byte[] is = null;
			final NodeDeque deque = Class_ft.field_n_2495;
			synchronized (deque) {
				Class_fk class_fk = (Class_fk) Class_ft.field_n_2495.method_f_ga();
				while (class_fk != null) {
					if ((class_fk.id != i) || (class_du != class_fk.field_z_2383) || ((class_fk.field_n_2385 * -569870765) != 0)) {
						class_fk = (Class_fk) Class_ft.field_n_2495.method_a_ga();
					} else {
						is = class_fk.field_d_2384;
						break;
					}
				}
			}
			if (is != null) {
				class_fx.method_cm_void(class_du, i, is, true, -1048682980);
			} else {
				final byte[] is_34_ = class_du.read(i, (byte) -104);
				class_fx.method_cm_void(class_du, i, is_34_, true, 1723691353);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ch.y()");
		}
	}

	static void method_at_void(final int i) {
		try {
			Bindable.unbindKeyboard(ObjectComposite.canvas, 590202086);
			SecureBuffer.unbindMouse(ObjectComposite.canvas);
			if (FloorOverlay.field_ky_8 != null) {
				FloorOverlay.field_ky_8.unbind(ObjectComposite.canvas);
			}
			client.instance.method_ry_void((byte) 104);
			ObjectComposite.canvas.setBackground(Color.black);
			final Canvas canvas = ObjectComposite.canvas;
			canvas.setFocusTraversalKeysEnabled(false);
			canvas.addKeyListener(KeyFocusListener.instance);
			canvas.addFocusListener(KeyFocusListener.instance);
			final Canvas canvas_35_ = ObjectComposite.canvas;
			canvas_35_.addMouseListener(MouseInputListener.instance);
			canvas_35_.addMouseMotionListener(MouseInputListener.instance);
			canvas_35_.addFocusListener(MouseInputListener.instance);
			if (FloorOverlay.field_ky_8 != null) {
				FloorOverlay.field_ky_8.bind(ObjectComposite.canvas);
			}
			if ((-374264803 * client.rootInterfaceId) != -1) {
				NpcComposite.method_ci_void(false, -1228268899);
			}
			GameStub.field_qt_2134 = true;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ch.at()");
		}
	}

	static void method_e_void(final int i) {
		try {
			final Object object = Class_ft.field_y_2498;
			synchronized (object) {
				if ((-1646797879 * Class_ft.field_z_2496) == 0) {
					SpotAnim.daemon.method_g_es(new Class_ft(), 5, 2141583405);
				}
				Class_ft.field_z_2496 = 980741016;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ch.e()");
		}
	}

	SceneObject() {
		/* empty */
	}
}
