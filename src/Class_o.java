/* Class_o - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Image;

public final class Class_o extends Node {
	int field_l_1221;
	Class_bd field_a_1222;
	int field_y_1223;
	int field_e_1224;
	int field_z_1225;
	int field_d_1226;
	int[] field_u_1227;
	int field_m_1228;
	int field_g_1229;
	int field_h_1230;
	int field_f_1231;
	static NodeDeque field_n_1232 = new NodeDeque();
	int field_q_1233;
	Class_bd field_k_1234;
	ObjectComposite field_x_1235;
	static int[] field_ad_1236;
	protected static Image field_qm_1237;
	static final int field_bz_1238 = 86;
	public static final int field_gq_1239 = 235;

	Class_o() {
		/* empty */
	}

	void method_d_void(final int i) {
		try {
			final int i_0_ = this.field_m_1228 * -840141801;
			final ObjectComposite objectdef = this.field_x_1235.method_u_at((byte) 1);
			if (objectdef != null) {
				this.field_m_1228 = -1627648747 * objectdef.field_am_338;
				this.field_f_1231 = objectdef.field_aj_340 * -2113800576;
				this.field_h_1230 = objectdef.field_ag_360 * -1005334193;
				this.field_l_1221 = objectdef.field_ap_361 * 987667539;
				this.field_u_1227 = objectdef.field_af_362;
			} else {
				this.field_m_1228 = 801373273;
				this.field_f_1231 = 0;
				this.field_h_1230 = 0;
				this.field_l_1221 = 0;
				this.field_u_1227 = null;
			}
			if ((i_0_ != (-840141801 * this.field_m_1228)) && (this.field_a_1222 != null)) {
				Class_bg.field_na_553.method_d_void(this.field_a_1222);
				this.field_a_1222 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "o.d()");
		}
	}

	public static String method_a_String(final CharSequence charsequence, final int i) {
		String string;
		try {
			final int i_1_ = charsequence.length();
			final char[] cs = new char[i_1_];
			for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
				cs[i_2_] = '*';
			}
			final String string_3_ = new String(cs);
			string = string_3_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "o.a()");
		}
		return string;
	}

	static final void sleep(final long l) {
		do {
			try {
				try {
					Thread.sleep(l);
				} catch (final InterruptedException interruptedexception) {
					break;
				}
				break;
			} catch (final RuntimeException runtimeexception) {
				throw GameCanvas.error(runtimeexception, "o.d()");
			}
		} while (false);
	}

	static void method_z_void(final int i, final int i_4_, final int i_5_, final int i_6_, final int i_7_) {
		try {
			ItemContainer itemcontainer = ((ItemContainer) ItemContainer.itemContainerTable.method_n_ga(i));
			if (itemcontainer == null) {
				itemcontainer = new ItemContainer();
				ItemContainer.itemContainerTable.method_d_void(itemcontainer, i);
			}
			if (itemcontainer.ids.length <= i_4_) {
				final int[] is = new int[i_4_ + 1];
				final int[] is_8_ = new int[i_4_ + 1];
				for (int i_9_ = 0; i_9_ < itemcontainer.ids.length; i_9_++) {
					is[i_9_] = itemcontainer.ids[i_9_];
					is_8_[i_9_] = itemcontainer.amts[i_9_];
				}
				for (int i_10_ = itemcontainer.ids.length; i_10_ < i_4_; i_10_++) {
					is[i_10_] = -1;
					is_8_[i_10_] = 0;
				}
				itemcontainer.ids = is;
				itemcontainer.amts = is_8_;
			}
			itemcontainer.ids[i_4_] = i_5_;
			itemcontainer.amts[i_4_] = i_6_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "o.z()");
		}
	}

	public static final void method_s_void(final int i, final boolean bool, final int i_11_, final int i_12_) {
		try {
			if ((i >= 8000) && (i <= 48000)) {
				NpcDefinitions.audioSampleRate = i * 692671213;
				Class_i.field_y_1073 = bool;
				Class_av.field_e_388 = 998153643 * i_11_;
			} else {
				throw new IllegalArgumentException();
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "o.s()");
		}
	}

	static final void method_cy_void(final Widget[] widgets, final int i, final int i_13_, final int i_14_, final int i_15_, final int i_16_, final int i_17_, final int i_18_, final int i_19_, final int i_20_) {
		try {
			Rasterizer.method_ce_void(i_13_, i_14_, i_15_, i_16_);
			Rasterizer3D.method_n_void();
			int i_21_ = 0;
			for (/**/; i_21_ < widgets.length; i_21_++) {
				final Widget widget = widgets[i_21_];
				if ((widget != null) && ((i == (widget.parentId * -1405313417)) || ((-1412584499 == i) && (client.field_jt_2801 == widget)))) {
					int i_22_;
					if (i_19_ == -1) {
						client.field_lw_2960[client.field_lx_2892 * 998139771] = i_17_ + (widget.onScreenX * -948813497);
						client.field_lq_2898[998139771 * client.field_lx_2892] = i_18_ + (-1698637507 * widget.onScreenY);
						client.field_lc_2941[998139771 * client.field_lx_2892] = widget.onScreenWidth * 1367496319;
						client.field_le_2900[client.field_lx_2892 * 998139771] = widget.onScreenHeight * -1643237919;
						i_22_ = ((client.field_lx_2892 += -1451925581) * 998139771) - 1;
					} else {
						i_22_ = i_19_;
					}
					widget.field_eh_2569 = 1081320417 * i_22_;
					widget.field_ew_2643 = 1240383437 * client.currentCycle;
					if (!widget.interactive || !FileStore.method_em_boolean(widget, 1488795038)) {
						if ((-1489583413 * widget.contentType) > 0) {
							final int i_23_ = -1489583413 * widget.contentType;
							if (i_23_ == 324) {
								if ((-785798649 * client.field_pu_2963) == -1) {
									client.field_pu_2963 = 921846725 * widget.disabledSpriteId;
									client.field_ps_2964 = widget.field_aj_2578 * 625638023;
								}
								if (client.playerDesignComposite.male) {
									widget.disabledSpriteId = -679591155 * client.field_pu_2963;
								} else {
									widget.disabledSpriteId = -1647526385 * client.field_ps_2964;
								}
							} else if (i_23_ == 325) {
								if ((-785798649 * client.field_pu_2963) == -1) {
									client.field_pu_2963 = widget.disabledSpriteId * 921846725;
									client.field_ps_2964 = 625638023 * widget.field_aj_2578;
								}
								if (client.playerDesignComposite.male) {
									widget.disabledSpriteId = client.field_ps_2964 * -1647526385;
								} else {
									widget.disabledSpriteId = client.field_pu_2963 * -679591155;
								}
							} else if (i_23_ == 327) {
								widget.field_bu_2670 = 1780770430;
								widget.field_bq_2590 = ((int) (Math.sin((client.currentCycle) * 303796053 / 40.0) * 256.0) & 0x7ff) * 1360083929;
								widget.mediaType = 1782395419;
								widget.mediaId = 0;
							} else if (i_23_ == 328) {
								widget.field_bu_2670 = 1780770430;
								widget.field_bq_2590 = ((int) (Math.sin((client.currentCycle) * 303796053 / 40.0) * 256.0) & 0x7ff) * 1360083929;
								widget.mediaType = 1782395419;
								widget.mediaId = 1030350029;
							}
						}
						int i_24_ = (-948813497 * widget.onScreenX) + i_17_;
						int i_25_ = i_18_ + (-1698637507 * widget.onScreenY);
						int i_26_ = -1452546675 * widget.alpha;
						if (widget == client.field_jt_2801) {
							if ((i != -1412584499) && !widget.field_ce_2672) {
								Region.field_ke_1008 = widgets;
								Class_a.field_kl_795 = i_17_ * -1903049335;
								Region.field_kx_1013 = 1839619323 * i_18_;
								continue;
							}
							if (client.field_jz_2871 && client.field_ji_2766) {
								int i_27_ = 1515107729 * MouseInputListener.field_m_2156;
								int i_28_ = -2089478689 * MouseInputListener.field_a_2157;
								i_27_ -= -47430253 * client.field_jr_2862;
								i_28_ -= 1314055393 * client.field_jn_2863;
								if (i_27_ < (client.field_jv_2938 * 1377090055)) {
									i_27_ = client.field_jv_2938 * 1377090055;
								}
								if ((i_27_ + (widget.onScreenWidth * 1367496319)) > ((client.field_jj_2861.onScreenWidth * 1367496319) + (1377090055 * client.field_jv_2938))) {
									i_27_ = (((client.field_jv_2938 * 1377090055) + ((client.field_jj_2861.onScreenWidth) * 1367496319)) - (1367496319 * widget.onScreenWidth));
								}
								if (i_28_ < (1248838539 * client.field_jw_2886)) {
									i_28_ = client.field_jw_2886 * 1248838539;
								}
								if (((widget.onScreenHeight * -1643237919) + i_28_) > ((-1643237919 * client.field_jj_2861.onScreenHeight) + (client.field_jw_2886 * 1248838539))) {
									i_28_ = (((1248838539 * client.field_jw_2886) + (-1643237919 * (client.field_jj_2861.onScreenHeight))) - (widget.onScreenHeight * -1643237919));
								}
								i_24_ = i_27_;
								i_25_ = i_28_;
							}
							if (!widget.field_ce_2672) {
								i_26_ = 128;
							}
						}
						int i_29_;
						int i_30_;
						int i_31_;
						int i_32_;
						if ((widget.type * 876728889) == 2) {
							i_29_ = i_13_;
							i_30_ = i_14_;
							i_31_ = i_15_;
							i_32_ = i_16_;
						} else if ((876728889 * widget.type) == 9) {
							int i_33_ = i_24_;
							int i_34_ = i_25_;
							int i_35_ = (widget.onScreenWidth * 1367496319) + i_24_;
							int i_36_ = i_25_ + (widget.onScreenHeight * -1643237919);
							if (i_35_ < i_24_) {
								i_33_ = i_35_;
								i_35_ = i_24_;
							}
							if (i_36_ < i_25_) {
								i_34_ = i_36_;
								i_36_ = i_25_;
							}
							i_35_++;
							i_36_++;
							i_29_ = i_33_ > i_13_ ? i_33_ : i_13_;
							i_30_ = i_34_ > i_14_ ? i_34_ : i_14_;
							i_31_ = i_35_ < i_15_ ? i_35_ : i_15_;
							i_32_ = i_36_ < i_16_ ? i_36_ : i_16_;
						} else {
							final int i_37_ = (widget.onScreenWidth * 1367496319) + i_24_;
							final int i_38_ = (widget.onScreenHeight * -1643237919) + i_25_;
							i_29_ = i_24_ > i_13_ ? i_24_ : i_13_;
							i_30_ = i_25_ > i_14_ ? i_25_ : i_14_;
							i_31_ = i_37_ < i_15_ ? i_37_ : i_15_;
							i_32_ = i_38_ < i_16_ ? i_38_ : i_16_;
						}
						if (!widget.interactive || ((i_29_ < i_31_) && (i_30_ < i_32_))) {
							if ((-1489583413 * widget.contentType) != 0) {
								if ((-1489583413 * widget.contentType) == 1336) {
									if (client.field_ae_2702) {
										i_25_ += 15;
										Class_ay.p12Full.drawStringRight(new StringBuilder("Fps:").append(GameStub.field_qd_2138 * -169749831).toString(), i_24_ + (1367496319 * widget.onScreenWidth), i_25_, 16776960, -1);
										i_25_ += 15;
										final Runtime runtime = Runtime.getRuntime();
										final int i_39_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
										int i_40_ = 16776960;
										if ((i_39_ > 32768) && client.field_u_2784) {
											i_40_ = 16711680;
										}
										if ((i_39_ > 65536) && !client.field_u_2784) {
											i_40_ = 16711680;
										}
										Class_ay.p12Full.drawStringRight(new StringBuilder("Mem:").append(i_39_).append("k").toString(), i_24_ + (1367496319 * widget.onScreenWidth), i_25_, i_40_, -1);
										i_25_ += 15;
									}
									continue;
								}
								if ((-1489583413 * widget.contentType) == 1337) {
									client.field_id_2836 = 2014421019 * i_24_;
									client.field_iv_2837 = 735544561 * i_25_;
									int i_41_ = widget.onScreenWidth * 1367496319;
									int i_42_ = -1643237919 * widget.onScreenHeight;
									client.field_gl_2789 += 840554503;
									Class_s.method_am_void((Class_al.field_n_175), (byte) -7);
									boolean bool = false;
									if ((client.field_hm_2819 * -519351145) >= 0) {
										for (int i_43_ = 0; i_43_ < (client.localPlayerCount * 2000365659); i_43_++) {
											if (client.playerIndexArray[i_43_] == (client.field_hm_2819 * -519351145)) {
												bool = true;
												break;
											}
										}
									}
									if (bool) {
										Class_s.method_am_void((Class_al.field_d_180), (byte) -22);
									}
									SceneObject.method_aj_void(true, (byte) -13);
									Class_s.method_am_void((bool ? (Class_al.field_y_177) : (Class_al.field_z_176)), (byte) -9);
									SceneObject.method_aj_void(false, (byte) -98);
									for (Projectile projectileGraphic = (Projectile) client.activeProjectiles.method_f_ga(); projectileGraphic != null; projectileGraphic = (Projectile) client.activeProjectiles.method_a_ga()) {
										if (((projectileGraphic.field_d_971 * 1870230107) == (250114511 * Class_ed.plane)) && ((303796053 * client.currentCycle) <= (-1151487549 * (projectileGraphic.field_m_959)))) {
											if ((client.currentCycle * 303796053) >= ((projectileGraphic.field_f_979) * -298089123)) {
												if (((projectileGraphic.field_l_962) * -1321802319) > 0) {
													final Npc npc = (client.npcs[(((projectileGraphic.field_l_962) * -1321802319) - 1)]);
													if ((npc != null) && (((npc.worldPosX) * -2103184911) >= 0) && (((npc.worldPosX) * -2103184911) < 13312) && ((2088773389 * (npc.worldPosY)) >= 0) && (((npc.worldPosY) * 2088773389) < 13312)) {
														projectileGraphic.method_n_void(((npc.worldPosX) * -2103184911), ((npc.worldPosY) * 2088773389), ((Class_q.getTileHeight(((npc.worldPosX) * -2103184911), ((npc.worldPosY) * 2088773389), ((projectileGraphic.field_d_971) * 1870230107))) - ((projectileGraphic.field_g_952) * 1283073795)),
																(303796053 * (client.currentCycle)), 1919806665);
													}
												}
												if (((projectileGraphic.field_l_962) * -1321802319) < 0) {
													final int i_44_ = (-(-1321802319 * (projectileGraphic.field_l_962)) - 1);
													Player player;
													if (i_44_ == ((client.myPlayerIndex) * -901432633)) {
														player = (Class_ci.myPlayer);
													} else {
														player = (client.localPlayers[i_44_]);
													}
													if ((player != null) && (((player.worldPosX) * -2103184911) >= 0) && (((player.worldPosX) * -2103184911) < 13312) && ((2088773389 * (player.worldPosY)) >= 0) && ((2088773389 * (player.worldPosY)) < 13312)) {
														projectileGraphic.method_n_void((-2103184911 * (player.worldPosX)), (2088773389 * (player.worldPosY)),
																((Class_q.getTileHeight((-2103184911 * (player.worldPosX)), ((player.worldPosY) * 2088773389), ((projectileGraphic.field_d_971) * 1870230107))) - (1283073795 * (projectileGraphic.field_g_952))), ((client.currentCycle) * 303796053), 1705369057);
													}
												}
												projectileGraphic.method_z_void((-1720212425 * client.field_ej_2761), -1383008830);
												Class_ae.sceneGraph.method_u_boolean((250114511 * Class_ed.plane), (int) (projectileGraphic.field_q_957), (int) (projectileGraphic.field_k_965), (int) (projectileGraphic.field_x_966), 60, projectileGraphic, (projectileGraphic.field_p_972) * 75268399, -1, false);
											}
										} else {
											projectileGraphic.removeLink();
										}
									}
									Class_cw.method_ag_void((byte) -79);
									ObjectComposite.method_ay_void(i_24_, i_25_, i_41_, i_42_, true, (byte) 126);
									final int i_45_ = client.field_ov_2951 * 293952031;
									final int i_46_ = client.field_op_2816 * -863843669;
									i_41_ = 659941927 * client.field_om_2953;
									i_42_ = client.field_ou_2820 * 549621553;
									Rasterizer.method_ce_void(i_45_, i_46_, i_45_ + i_41_, i_46_ + i_42_);
									Rasterizer3D.method_n_void();
									if (!client.field_nf_2937) {
										int i_47_ = client.field_ft_2707 * 212686301;
										if (((client.field_fu_2777 * 652979521) / 256) > i_47_) {
											i_47_ = ((652979521 * client.field_fu_2777) / 256);
										}
										if (client.field_od_2919[4] && ((client.field_oi_2940[4] + 128) > i_47_)) {
											i_47_ = (client.field_oi_2940[4] + 128);
										}
										final int i_48_ = (((-2037472027 * client.miniMapAngle) + (client.field_dx_2753 * 1993754481)) & 0x7ff);
										final int i_49_ = (Vector3.field_fv_755 * 643409593);
										final int i_50_ = ((Class_q.getTileHeight((-2103184911 * (Class_ci.myPlayer.worldPosX)), (2088773389 * (Class_ci.myPlayer.worldPosY)), Class_ed.plane * 250114511)) - 50);
										final int i_51_ = (Renderable.field_fn_764 * 1257968957);
										final int i_52_ = 600 + (i_47_ * 3);
										final int i_53_ = (2048 - i_47_) & 0x7ff;
										final int i_54_ = (2048 - i_48_) & 0x7ff;
										int i_55_ = 0;
										int i_56_ = 0;
										int i_57_ = i_52_;
										if (i_53_ != 0) {
											final int i_58_ = (Rasterizer3D.SINE[i_53_]);
											final int i_59_ = (Rasterizer3D.COSINE[i_53_]);
											final int i_60_ = (((i_59_ * i_56_) - (i_52_ * i_58_)) >> 16);
											i_57_ = ((i_56_ * i_58_) + (i_52_ * i_59_)) >> 16;
			i_56_ = i_60_;
										}
										if (i_54_ != 0) {
											final int i_61_ = (Rasterizer3D.SINE[i_54_]);
											final int i_62_ = (Rasterizer3D.COSINE[i_54_]);
											final int i_63_ = (((i_55_ * i_62_) + (i_57_ * i_61_)) >> 16);
											i_57_ = ((i_57_ * i_62_) - (i_55_ * i_61_)) >> 16;
											i_55_ = i_63_;
										}
										Menu.cameraX = -1316111987 * (i_49_ - i_55_);
										Class_d.cameraZ = 963104283 * (i_50_ - i_56_);
										GameMessage.cameraY = -563011825 * (i_51_ - i_57_);
										World.cameraPitch = i_47_ * -1018842563;
										FloorOverlay.cameraYaw = 732473783 * i_48_;
									}
									int i_64_;
									if (!client.field_nf_2937) {
										i_64_ = Class_dt.method_ap_int(2101035383);
									} else {
										int i_65_;
										if (Class_w.field_pz_1501.hideRoofTops) {
											i_65_ = 250114511 * Class_ed.plane;
										} else {
											final int i_66_ = (Class_q.getTileHeight((548221253 * (Menu.cameraX)), (GameMessage.cameraY * 1900802031), Class_ed.plane * 250114511));
											if (((i_66_ - (Class_d.cameraZ * 424565779)) < 800) && (((Region.sceneFlags[(250114511 * Class_ed.plane)][(((Menu.cameraX) * 548221253) >> 7)][(GameMessage.cameraY * 1900802031) >> 7]) & 0x4) != 0)) {
												i_65_ = (Class_ed.plane * 250114511);
											} else {
												i_65_ = 3;
											}
										}
										i_64_ = i_65_;
									}
									final int i_67_ = (548221253 * Menu.cameraX);
									final int i_68_ = 424565779 * Class_d.cameraZ;
									final int i_69_ = GameMessage.cameraY * 1900802031;
									final int i_70_ = World.cameraPitch * 633664789;
									final int i_71_ = FloorOverlay.cameraYaw * -467172345;
									for (int i_72_ = 0; i_72_ < 5; i_72_++) {
										if (client.field_od_2919[i_72_]) {
											final int i_73_ = (int) (((Math.random() * (((client.field_oe_2692[i_72_]) * 2) + 1)) - (client.field_oe_2692[i_72_])) + ((Math.sin((client.field_ok_2907[i_72_]) * ((client.field_of_2902[i_72_]) / 100.0))) * (client.field_oi_2940[i_72_])));
											if (i_72_ == 0) {
												Menu.cameraX += i_73_ * -1316111987;
											}
											if (i_72_ == 1) {
												Class_d.cameraZ += i_73_ * 963104283;
											}
											if (i_72_ == 2) {
												GameMessage.cameraY += i_73_ * -563011825;
											}
											if (i_72_ == 3) {
												FloorOverlay.cameraYaw = (((FloorOverlay.cameraYaw * -467172345) + i_73_) & 0x7ff) * 732473783;
											}
											if (i_72_ == 4) {
												World.cameraPitch += i_73_ * -1018842563;
												if ((World.cameraPitch * 633664789) < 128) {
													World.cameraPitch = -1562829184;
												}
												if ((World.cameraPitch * 633664789) > 383) {
													World.cameraPitch = 625322307;
												}
											}
										}
									}
									int i_74_ = 1515107729 * MouseInputListener.field_m_2156;
									int i_75_ = MouseInputListener.field_a_2157 * -2089478689;
									if ((MouseInputListener.field_q_2162 * 1159182273) != 0) {
										i_74_ = (2117517719 * MouseInputListener.field_k_2164);
										i_75_ = (MouseInputListener.field_x_2158 * 1750309931);
									}
									if ((i_74_ >= i_45_) && (i_74_ < (i_41_ + i_45_)) && (i_75_ >= i_46_) && (i_75_ < (i_46_ + i_42_))) {
										Model.field_bm_884 = true;
										Model.field_br_922 = 0;
										Model.field_bj_903 = i_74_ - i_45_;
										Model.field_ba_921 = i_75_ - i_46_;
									} else {
										Model.field_bm_884 = false;
										Model.field_br_922 = 0;
									}
									Class_db.method_p_void(996785827);
									Rasterizer.fillRect(i_45_, i_46_, i_41_, i_42_, 0);
									Class_db.method_p_void(996785827);
									final int i_76_ = Rasterizer3D.field_h_1146;
									Rasterizer3D.field_h_1146 = -388831203 * client.viewportScale;
									Class_ae.sceneGraph.method_aa_void((548221253 * Menu.cameraX), 424565779 * Class_d.cameraZ, 1900802031 * GameMessage.cameraY, World.cameraPitch * 633664789, FloorOverlay.cameraYaw * -467172345, i_64_);
									Rasterizer3D.field_h_1146 = i_76_;
									Class_db.method_p_void(996785827);
									Class_ae.sceneGraph.method_x_void();
									Class_cq.method_au_void(i_45_, i_46_, i_41_, i_42_, (byte) 1);
									if ((client.hintMarkerType * 237348707) == 2) {
										Class_fm.translateToCamera(((client.field_az_2710 * -242724851) + (((-116696535 * client.field_ab_2772) - (Class_q.originX * 1693061403)) << 7)), ((((client.field_ao_2942 * 429657167) - (Class_gf.originY * -1593604783)) << 7) + (-1344472453 * client.field_at_2711)), 1149769430 * client.field_ac_2812);
										if (((813575719 * client.field_gp_2790) > -1) && (((client.currentCycle * 303796053) % 20) < 10)) {
											IdentityKit.headicons_hint[0].rasterize((i_45_ + (client.field_gp_2790 * 813575719)) - 12, ((i_46_ + (1411957327 * client.field_gx_2704)) - 28));
										}
									}
									((Class_cc) Rasterizer3D.field_ak_1157).method_s_void(-1720212425 * client.field_ej_2761, 100090960);
									Class_av.method_bs_void(i_45_, i_46_, i_41_, i_42_, (byte) 27);
									Menu.cameraX = i_67_ * -1316111987;
									Class_d.cameraZ = i_68_ * 963104283;
									GameMessage.cameraY = i_69_ * -563011825;
									World.cameraPitch = -1018842563 * i_70_;
									FloorOverlay.cameraYaw = i_71_ * 732473783;
									if (client.field_c_2747 && (Ignore.method_e_int(true, false, (short) 32767) == 0)) {
										client.field_c_2747 = false;
									}
									if (client.field_c_2747) {
										Rasterizer.fillRect(i_45_, i_46_, i_41_, i_42_, 0);
										Class_l.method_aq_void((MenuText.LOADING_PLEASE_WAIT), false, 1173597121);
									}
									client.field_li_2835[(widget.field_eh_2569 * 1477697569)] = true;
									Rasterizer.method_ce_void(i_13_, i_14_, i_15_, i_16_);
									continue;
								}
								if ((widget.contentType * -1489583413) == 1338) {
									Class_cw.method_dz_void(widget, i_24_, i_25_, i_22_, -1202092826);
									Rasterizer.method_ce_void(i_13_, i_14_, i_15_, i_16_);
									continue;
								}
								if ((-1489583413 * widget.contentType) == 1339) {
									Friend.method_dh_void(widget, i_24_, i_25_, i_22_, 1785277968);
									Rasterizer.method_ce_void(i_13_, i_14_, i_15_, i_16_);
									continue;
								}
							}
							if ((widget.type * 876728889) == 0) {
								if (!widget.interactive && FileStore.method_em_boolean(widget, 1086447150) && (Menu.field_im_1543 != widget)) {
									continue;
								}
								if (!widget.interactive) {
									if ((-854204745 * widget.verticalScrollPos) > ((2133987947 * widget.field_az_2568) - (widget.onScreenHeight * -1643237919))) {
										widget.verticalScrollPos = ((-2065615379 * widget.field_az_2568) - (widget.onScreenHeight * 483442727));
									}
									if ((widget.verticalScrollPos * -854204745) < 0) {
										widget.verticalScrollPos = 0;
									}
								}
								method_cy_void(widgets, -560181405 * widget.uid, i_29_, i_30_, i_31_, i_32_, i_24_ - (440856551 * widget.field_ab_2565), (i_25_ - (widget.verticalScrollPos * -854204745)), i_22_, -379100767);
								if (widget.components != null) {
									method_cy_void(widget.components, -560181405 * widget.uid, i_29_, i_30_, i_31_, i_32_, (i_24_ - (440856551 * widget.field_ab_2565)), i_25_ - (-854204745 * widget.verticalScrollPos), i_22_, -379100767);
								}
								final Menu interfacepositionnode = ((Menu) (client.menuTable.method_n_ga(widget.uid * -560181405)));
								if (interfacepositionnode != null) {
									final int i_77_ = 44103667 * (interfacepositionnode.interfaceId);
									if (!Class_fz.loadWidget(i_77_, -1817340707)) {
										if (i_22_ != -1) {
											client.field_li_2835[i_22_] = true;
										} else {
											for (int i_78_ = 0; i_78_ < 100; i_78_++) {
												client.field_li_2835[i_78_] = true;
											}
										}
									} else {
										Region.field_ke_1008 = null;
										method_cy_void(Widget.widgets[i_77_], -1, i_29_, i_30_, i_31_, i_32_, i_24_, i_25_, i_22_, -379100767);
										if (Region.field_ke_1008 != null) {
											method_cy_void(Region.field_ke_1008, -1412584499, i_29_, i_30_, i_31_, i_32_, (1100366009 * Class_a.field_kl_795), (Region.field_kx_1013 * -236630477), i_22_, -379100767);
											Region.field_ke_1008 = null;
										}
									}
								}
								Rasterizer.method_ce_void(i_13_, i_14_, i_15_, i_16_);
								Rasterizer3D.method_n_void();
							}
							if (client.field_ll_2903 || client.field_lg_2939[i_22_] || ((-1787689871 * client.field_lv_2901) > 1)) {
								if (((widget.type * 876728889) == 0) && !widget.interactive && ((widget.field_az_2568 * 2133987947) > (widget.onScreenHeight * -1643237919))) {
									final int i_79_ = ((1367496319 * widget.onScreenWidth) + i_24_);
									final int i_80_ = (widget.verticalScrollPos * -854204745);
									final int i_81_ = -1643237919 * widget.onScreenHeight;
									final int i_82_ = widget.field_az_2568 * 2133987947;
									ClientScript.scrollbar[0].render(i_79_, i_25_);
									ClientScript.scrollbar[1].render(i_79_, (i_81_ + i_25_) - 16);
									Rasterizer.fillRect(i_79_, 16 + i_25_, 16, i_81_ - 32, 865749163 * client.field_ez_2693);
									int i_83_ = ((i_81_ - 32) * i_81_) / i_82_;
									if (i_83_ < 8) {
										i_83_ = 8;
									}
									final int i_84_ = ((i_80_ * (i_81_ - 32 - i_83_)) / (i_82_ - i_81_));
									Rasterizer.fillRect(i_79_, 16 + i_25_ + i_84_, 16, i_83_, -1217932155 * client.field_ef_2764);
									Rasterizer.drawVerticalLine(i_79_, i_84_ + 16 + i_25_, i_83_, client.field_ei_2952 * -1759676165);
									Rasterizer.drawVerticalLine(1 + i_79_, i_84_ + i_25_ + 16, i_83_, -1759676165 * client.field_ei_2952);
									Rasterizer.drawHorizontalLine(i_79_, i_84_ + 16 + i_25_, 16, client.field_ei_2952 * -1759676165);
									Rasterizer.drawHorizontalLine(i_79_, i_84_ + 17 + i_25_, 16, -1759676165 * client.field_ei_2952);
									Rasterizer.drawVerticalLine(i_79_ + 15, 16 + i_25_ + i_84_, i_83_, -1880923303 * client.field_ep_2891);
									Rasterizer.drawVerticalLine(14 + i_79_, i_84_ + 17 + i_25_, i_83_ - 1, ((client.field_ep_2891) * -1880923303));
									Rasterizer.drawHorizontalLine(i_79_, i_84_ + i_25_ + 15 + i_83_, 16, client.field_ep_2891 * -1880923303);
									Rasterizer.drawHorizontalLine(i_79_ + 1, 14 + i_25_ + i_84_ + i_83_, 15, client.field_ep_2891 * -1880923303);
								}
								if ((widget.type * 876728889) != 1) {
									if ((widget.type * 876728889) == 2) {
										int i_85_ = 0;
										for (int i_86_ = 0; i_86_ < (widget.height * -280578839); i_86_++) {
											for (int i_87_ = 0; (i_87_ < (1744956505 * widget.width)); i_87_++) {
												int i_88_ = (i_24_ + ((32 + (-533878721 * (widget.itemContainerRowPadding))) * i_87_));
												int i_89_ = (i_25_ + ((32 + (305320041 * (widget.itemContainerColumnPadding))) * i_86_));
												if (i_85_ < 20) {
													i_88_ += (widget.field_cj_2610[i_85_]);
													i_89_ += (widget.field_cb_2611[i_85_]);
												}
												if (widget.itemIds[i_85_] > 0) {
													final int i_91_ = (widget.itemIds[i_85_]) - 1;
													if ((((i_88_ + 32) > i_13_) && (i_88_ < i_15_) && ((32 + i_89_) > i_14_) && (i_89_ < i_16_)) || ((widget == (Class_a.field_gz_794)) && ((-1138033625 * (client.field_gb_2798)) == i_85_))) {
														Rasterizer2D class_bx;
														if ((((client.selectedOptionType) * -1595363093) == 1) && ((-1792623669 * (ImageColorModel.field_iu_542)) == i_85_) && (((widget.uid) * -560181405) == (-969794605 * (Class_ed.field_ix_2071)))) {
															class_bx = (GameObject.method_l_bx(i_91_, (widget.itemAmts[i_85_]), 2, 0, 2, false, (byte) 100));
														} else {
															class_bx = (GameObject.method_l_bx(i_91_, (widget.itemAmts[i_85_]), 1, 3153952, 2, false, (byte) 42));
														}
														if (class_bx != null) {
															if (((Class_a.field_gz_794) == widget) && (i_85_ == ((client.field_gb_2798) * -1138033625))) {
																int i_92_ = (((MouseInputListener.field_m_2156) * 1515107729) - (1510902421 * client.field_gu_2799));
																int i_93_ = (((MouseInputListener.field_a_2157) * -2089478689) - (-1214524079 * client.field_gm_2800));
																if ((i_92_ < 5) && (i_92_ > -5)) {
																	i_92_ = 0;
																}
																if ((i_93_ < 5) && (i_93_ > -5)) {
																	i_93_ = 0;
																}
																if (((client.field_gy_2803) * -1831296683) < 5) {//5 -> 10
																	i_92_ = 0;
																	i_93_ = 0;
																}
																class_bx.method_s_void((i_88_ + i_92_), (i_89_ + i_93_), 128);
																if (i != -1) {
																	final Widget widget_94_ = (widgets[i & 0xffff]);
																	if (((i_89_ + i_93_) < (Rasterizer.field_r_512)) && ((widget_94_.verticalScrollPos * -854204745) > 0)) {
																		int i_95_ = ((client.field_ej_2761 * -1720212425 * (Rasterizer.field_r_512 - i_89_ - i_93_)) / 3);
																		if (i_95_ > (client.field_ej_2761 * -22255066)) {
																			i_95_ = client.field_ej_2761 * -22255066;
																		}
																		if (i_95_ > (widget_94_.verticalScrollPos * -854204745)) {
																			i_95_ = -854204745 * widget_94_.verticalScrollPos;
																		}
																		widget_94_.verticalScrollPos -= -1907925241 * i_95_;
																		client.field_gm_2800 += i_95_ * 1417974705;
																		Daemon.method_dn_void(widget_94_, (byte) 100);
																	}
																	if (((32 + i_89_ + i_93_) > (Rasterizer.field_j_513)) && ((widget_94_.verticalScrollPos * -854204745) < ((widget_94_.field_az_2568 * 2133987947) - (-1643237919 * widget_94_.onScreenHeight)))) {
																		int i_96_ = ((-1720212425 * client.field_ej_2761 * ((32 + i_89_ + i_93_) - Rasterizer.field_j_513)) / 3);
																		if (i_96_ > (client.field_ej_2761 * -22255066)) {
																			i_96_ = -22255066 * client.field_ej_2761;
																		}
																		if (i_96_ > ((2133987947 * widget_94_.field_az_2568) - (-1643237919 * widget_94_.onScreenHeight) - (-854204745 * widget_94_.verticalScrollPos))) {
																			i_96_ = (2133987947 * widget_94_.field_az_2568) - (-1643237919 * widget_94_.onScreenHeight) - (-854204745 * widget_94_.verticalScrollPos);
																		}
																		widget_94_.verticalScrollPos += i_96_ * -1907925241;
																		client.field_gm_2800 -= i_96_ * 1417974705;
																		Daemon.method_dn_void(widget_94_, (byte) -53);
																	}
																}
															} else if (((Class_cr.field_gw_1242) == widget) && ((85443973 * client.field_gn_2797) == i_85_)) {
																class_bx.method_s_void(i_88_, i_89_, 128);
															} else {
																class_bx.rasterize(i_88_, i_89_);
															}
														} else {
															Daemon.method_dn_void(widget, (byte) -118);
														}
													}
												} else if (((widget.field_ct_2612) != null) && (i_85_ < 20)) {
													final Rasterizer2D class_bx = (widget.method_q_bx(i_85_, (byte) 39));
													if (class_bx != null) {
														class_bx.rasterize(i_88_, i_89_);
													} else if (Widget.field_l_2542) {
														Daemon.method_dn_void(widget, (byte) 15);
													}
												}
												i_85_++;
											}
										}
									} else if ((widget.type * 876728889) == 3) {
										int i_97_;
										if (Class_ab.method_dt_boolean(widget, 1824176009)) {
											i_97_ = (-155655013 * widget.field_aa_2577);
											if (((Menu.field_im_1543) == widget) && ((widget.field_aw_2572 * 259138217) != 0)) {
												i_97_ = (widget.field_aw_2572 * 259138217);
											}
										} else {
											i_97_ = (widget.field_at_2617 * -2003985369);
											if (((Menu.field_im_1543) == widget) && ((-1189059593 * widget.field_an_2571) != 0)) {
												i_97_ = (widget.field_an_2571 * -1189059593);
											}
										}
										if (i_26_ == 0) {
											if (widget.field_ai_2573) {
												Rasterizer.fillRect(i_24_, i_25_, (1367496319 * widget.onScreenWidth), (-1643237919 * widget.onScreenHeight), i_97_);
											} else {
												Rasterizer.drawRect(i_24_, i_25_, (widget.onScreenWidth * 1367496319), (-1643237919 * widget.onScreenHeight), i_97_);
											}
										} else if (widget.field_ai_2573) {
											Rasterizer.fillAlphaRect(i_24_, i_25_, (1367496319 * widget.onScreenWidth), (widget.onScreenHeight * -1643237919), i_97_, 256 - (i_26_ & 0xff));
										} else {
											Rasterizer.method_ci_void(i_24_, i_25_, (widget.onScreenWidth * 1367496319), (-1643237919 * widget.onScreenHeight), i_97_, 256 - (i_26_ & 0xff));
										}
									} else if ((876728889 * widget.type) == 4) {
										final Class_hd class_hd = widget.method_u_hd(-52053961);
										if (class_hd == null) {
											if (Widget.field_l_2542) {
												Daemon.method_dn_void(widget, (byte) -57);
											}
										} else {
											String string = widget.defaultText;
											int i_98_;
											if (Class_ab.method_dt_boolean(widget, 75232791)) {
												i_98_ = (widget.field_aa_2577 * -155655013);
												if (((Menu.field_im_1543) == widget) && ((259138217 * (widget.field_aw_2572)) != 0)) {
													i_98_ = (widget.field_aw_2572 * 259138217);
												}
												if (widget.field_bk_2603.length() > 0) {
													string = widget.field_bk_2603;
												}
											} else {
												i_98_ = (-2003985369 * widget.field_at_2617);
												if ((widget == (Menu.field_im_1543)) && ((-1189059593 * (widget.field_an_2571)) != 0)) {
													i_98_ = (-1189059593 * (widget.field_an_2571));
												}
											}
											if (widget.interactive && ((widget.itemId * 1464571113) != -1)) {
												final ItemComposite itemdef = (ItemDefinitions.getItemComposite((1464571113 * widget.itemId)));
												string = itemdef.name;
												if (string == null) {
													string = "null";
												}
												if ((((itemdef.stackable * 1537303969) == 1) || ((1425564359 * (widget.field_ek_2663)) != 1)) && ((widget.field_ek_2663 * 1425564359) != -1)) {
													string = new StringBuilder(Class_r.colorString(16748608)).append(string).append(Class_d.field_m_861).append(" ").append('x').append(Projectile.method_cd_String(((widget.field_ek_2663) * 1425564359), -113266526)).toString();
												}
											}
											if (widget == client.field_jd_2762) {
												string = MenuText.field_fk_1941;
												i_98_ = (-2003985369 * widget.field_at_2617);
											}
											if (!widget.interactive) {
												string = (Menu.method_cm_String(string, widget, (byte) 31));
											}
											class_hd.method_u_int(string, i_24_, i_25_, (widget.onScreenWidth * 1367496319), (-1643237919 * widget.onScreenHeight), i_98_, widget.field_be_2647 ? 0 : -1, (-1244180753 * widget.field_bx_2605), (widget.field_bc_2606 * 602626311), (widget.field_bi_2604 * 946411505));
										}
									} else if ((876728889 * widget.type) == 5) {
										if (!widget.interactive) {
											final Rasterizer2D class_bx = (widget.method_l_bx((Class_ab.method_dt_boolean(widget, 542280732)), (byte) 51));
											if (class_bx != null) {
												class_bx.rasterize(i_24_, i_25_);
											} else if (Widget.field_l_2542) {
												Daemon.method_dn_void(widget, (byte) 47);
											}
										} else {
											Rasterizer2D class_bx;
											if ((1464571113 * widget.itemId) != -1) {
												class_bx = (GameObject.method_l_bx((widget.itemId * 1464571113), (1425564359 * (widget.field_ek_2663)), (2073162049 * (widget.field_af_2581)), (14646663 * (widget.field_au_2582)), (widget.field_bv_2600 * 478578917), false, (byte) 108));
											} else {
												class_bx = (widget.method_l_bx(false, (byte) 28));
											}
											if (class_bx == null) {
												if (Widget.field_l_2542) {
													Daemon.method_dn_void(widget, (byte) -37);
												}
											} else {
												final int i_99_ = class_bx.field_g_683;
												final int i_100_ = class_bx.field_f_678;
												if (!widget.field_ap_2580) {
													final int i_101_ = ((627568640 * (widget.onScreenWidth)) / i_99_);
													if ((963160121 * (widget.field_ag_2579)) != 0) {
														class_bx.method_w_void((((widget.onScreenWidth) * 1367496319) / 2) + i_24_, (((widget.onScreenHeight) * -1643237919) / 2) + i_25_, ((widget.field_ag_2579) * 963160121), i_101_);
													} else if (i_26_ != 0) {
														class_bx.method_c_void(i_24_, i_25_, ((widget.onScreenWidth) * 1367496319), (-1643237919 * (widget.onScreenHeight)), 256 - (i_26_ & 0xff));
													} else if ((i_99_ == ((widget.onScreenWidth) * 1367496319)) && ((-1643237919 * (widget.onScreenHeight)) == i_100_)) {
														class_bx.rasterize(i_24_, i_25_);
													} else {
														class_bx.method_k_void(i_24_, i_25_, (1367496319 * (widget.onScreenWidth)), (-1643237919 * (widget.onScreenHeight)));
													}
												} else {
													Rasterizer.method_cc_void(i_24_, i_25_, ((widget.onScreenWidth * 1367496319) + i_24_), (i_25_ + (-1643237919 * (widget.onScreenHeight))));
													final int i_102_ = (((i_99_ - 1) + ((widget.onScreenWidth) * 1367496319)) / i_99_);
													final int i_103_ = ((-1643237919 * (widget.onScreenHeight)) + (i_100_ - 1)) / i_100_;
													for (int i_104_ = 0; i_104_ < i_102_; i_104_++) {
														for (int i_105_ = 0; i_105_ < i_103_; i_105_++) {
															if (((widget.field_ag_2579) * 963160121) != 0) {
																class_bx.method_w_void(((i_99_ / 2) + (i_99_ * i_104_) + i_24_), (i_25_ + (i_100_ * i_105_) + (i_100_ / 2)), ((widget.field_ag_2579) * 963160121), 4096);
															} else if (i_26_ != 0) {
																class_bx.method_s_void(((i_104_ * i_99_) + i_24_), ((i_105_ * i_100_) + i_25_), (256 - (i_26_ & 0xff)));
															} else {
																class_bx.rasterize(((i_99_ * i_104_) + i_24_), ((i_100_ * i_105_) + i_25_));
															}
														}
													}
													Rasterizer.method_ce_void(i_13_, i_14_, i_15_, i_16_);
												}
											}
										}
									} else if ((widget.type * 876728889) == 6) {
										final boolean bool = (Class_ab.method_dt_boolean(widget, -1406473270));
										int i_106_;
										if (bool) {
											i_106_ = (-679503551 * widget.field_br_2555);
										} else {
											i_106_ = (793412913 * widget.field_ba_2589);
										}
										Model onscreenmodel = null;
										int i_107_ = 0;
										if ((widget.itemId * 1464571113) != -1) {
											ItemComposite itemdef = (ItemDefinitions.getItemComposite(1464571113 * widget.itemId));
											if (itemdef != null) {
												itemdef = (itemdef.method_h_aj((1425564359 * (widget.field_ek_2663)), 130947767));
												onscreenmodel = (itemdef.method_a_cg(1, -967174320));
												if (onscreenmodel != null) {
													onscreenmodel.method_m_void();
													i_107_ = (((onscreenmodel.modelHeight) * -1707560315) / 2);
												} else {
													Daemon.method_dn_void(widget, (byte) 62);
												}
											}
										} else if ((-1572489121 * widget.mediaType) == 5) {
											if ((widget.mediaId * -907499515) == 0) {
												onscreenmodel = (client.playerDesignComposite.getAnimatedModel(null, -1, null, -1, -1878222581));
											} else {
												onscreenmodel = (Class_ci.myPlayer.getModel());
											}
										} else if (i_106_ == -1) {
											onscreenmodel = (widget.method_k_cg(null, -1, bool, (Class_ci.myPlayer.composite), -1512238967));
											if ((onscreenmodel == null) && Widget.field_l_2542) {
												Daemon.method_dn_void(widget, (byte) -4);
											}
										} else {
											final AnimationSequence class_an = (OnDemandNode.getAnimationSequence(i_106_));
											onscreenmodel = (widget.method_k_cg(class_an, (widget.field_eq_2664 * 974863009), bool, (Class_ci.myPlayer.composite), -2134149155));
											if ((onscreenmodel == null) && Widget.field_l_2542) {
												Daemon.method_dn_void(widget, (byte) -4);
											}
										}
										Rasterizer3D.method_y_void(((1367496319 * widget.onScreenWidth) / 2) + i_24_, i_25_ + ((-1643237919 * widget.onScreenHeight) / 2));
										final int i_108_ = ((-42052387 * widget.field_bt_2596 * (Rasterizer3D.SINE[(646892533 * widget.field_bu_2670)])) >> 16);
										final int i_109_ = (-42052387 * widget.field_bt_2596 * (Rasterizer3D.COSINE[(widget.field_bu_2670 * 646892533)])) >> 16;
										if (onscreenmodel != null) {
											if (!widget.interactive) {
												onscreenmodel.method_c_void(0, (-1210215319 * widget.field_bq_2590), 0, (646892533 * widget.field_bu_2670), 0, i_108_, i_109_);
											} else {
												onscreenmodel.method_m_void();
												if (widget.field_bg_2668) {
													onscreenmodel.method_p_void(0, (-1210215319 * (widget.field_bq_2590)), (457530531 * (widget.field_bp_2595)), (widget.field_bu_2670 * 646892533), (widget.field_bd_2591 * -648485841), (i_107_ + i_108_ + ((widget.field_bn_2641) * -1620855581)), ((-1620855581 * (widget.field_bn_2641)) + i_109_), (-42052387 * (widget.field_bt_2596)));
												} else {
													onscreenmodel.method_c_void(0, (widget.field_bq_2590 * -1210215319), (widget.field_bp_2595 * 457530531), (widget.field_bu_2670 * 646892533), (widget.field_bd_2591 * -648485841), (i_108_ + i_107_ + (-1620855581 * (widget.field_bn_2641))), (i_109_ + (-1620855581 * (widget.field_bn_2641))));
												}
											}
										}
										Rasterizer3D.method_z_void();
									} else {
										if ((876728889 * widget.type) == 7) {
											final Class_hd class_hd = widget.method_u_hd(-52053961);
											if (class_hd == null) {
												if (Widget.field_l_2542) {
													Daemon.method_dn_void(widget, (byte) 45);
												}
												continue;
											}
											int i_110_ = 0;
											for (int i_111_ = 0; (i_111_ < (-280578839 * widget.height)); i_111_++) {
												for (int i_112_ = 0; (i_112_ < (1744956505 * (widget.width))); i_112_++) {
													if (widget.itemIds[i_110_] > 0) {
														final ItemComposite itemdef = (ItemDefinitions.getItemComposite((widget.itemIds[i_110_]) - 1));
														String string;
														if ((((itemdef.stackable) * 1537303969) != 1) && ((widget.itemAmts[i_110_]) == 1)) {
															string = new StringBuilder(Class_r.colorString(16748608)).append(itemdef.name).append(Class_d.field_m_861).toString();
														} else {
															string = new StringBuilder(Class_r.colorString(16748608)).append(itemdef.name).append(Class_d.field_m_861).append(" ").append('x').append(Projectile.method_cd_String((widget.itemAmts[i_110_]), -836096293)).toString();
														}
														final int i_113_ = (i_24_ + (i_112_ * ((-533878721 * (widget.itemContainerRowPadding)) + 115)));
														final int i_114_ = (i_25_ + ((12 + (305320041 * (widget.itemContainerColumnPadding))) * i_111_));
														if ((-1244180753 * (widget.field_bx_2605)) == 0) {
															class_hd.method_a_void(string, i_113_, i_114_, ((widget.field_at_2617) * -2003985369), ((widget.field_be_2647) ? 0 : -1));
														} else if ((-1244180753 * (widget.field_bx_2605)) == 1) {
															class_hd.drawCenteredString(string, (i_113_ + (((widget.onScreenWidth) * 1367496319) / 2)), i_114_, (-2003985369 * (widget.field_at_2617)), ((widget.field_be_2647) ? 0 : -1));
														} else {
															class_hd.drawStringRight(string, ((((widget.onScreenWidth) * 1367496319) + i_113_) - 1), i_114_, ((widget.field_at_2617) * -2003985369), ((widget.field_be_2647) ? 0 : -1));
														}
													}
													i_110_++;
												}
											}
										}
										if (((876728889 * widget.type) == 8) && (widget == (GameObject.field_ir_1414)) && ((-1231548557 * client.field_ii_2838) == (client.field_ia_2839 * 584133131))) {
											int i_115_ = 0;
											int i_116_ = 0;
											final Class_hd class_hd = Class_ay.p12Full;
											String string = widget.defaultText;
											string = (Menu.method_cm_String(string, widget, (byte) 31));
											while (string.length() > 0) {
												final int i_117_ = (string.indexOf(Class_d.field_f_860));
												String string_118_;
												if (i_117_ != -1) {
													string_118_ = (string.substring(0, i_117_));
													string = (string.substring(4 + i_117_));
												} else {
													string_118_ = string;
													string = "";
												}
												final int i_119_ = (class_hd.getTextWidth(string_118_));
												if (i_119_ > i_115_) {
													i_115_ = i_119_;
												}
												i_116_ += 1 + (class_hd.field_f_3101);
											}
											i_115_ += 6;
											i_116_ += 7;
											int i_120_ = ((i_24_ + (widget.onScreenWidth * 1367496319)) - 5 - i_115_);
											int i_121_ = ((-1643237919 * widget.onScreenHeight) + i_25_ + 5);
											if (i_120_ < (i_24_ + 5)) {
												i_120_ = i_24_ + 5;
											}
											if ((i_115_ + i_120_) > i_15_) {
												i_120_ = i_15_ - i_115_;
											}
											if ((i_121_ + i_116_) > i_16_) {
												i_121_ = i_16_ - i_116_;
											}
											Rasterizer.fillRect(i_120_, i_121_, i_115_, i_116_, 16777120);
											Rasterizer.drawRect(i_120_, i_121_, i_115_, i_116_, 0);
											string = widget.defaultText;
											int i_122_ = (class_hd.field_f_3101 + i_121_ + 2);
											string = (Menu.method_cm_String(string, widget, (byte) 31));
											while (string.length() > 0) {
												final int i_123_ = (string.indexOf(Class_d.field_f_860));
												String string_124_;
												if (i_123_ != -1) {
													string_124_ = (string.substring(0, i_123_));
													string = (string.substring(i_123_ + 4));
												} else {
													string_124_ = string;
													string = "";
												}
												class_hd.method_a_void(string_124_, 3 + i_120_, i_122_, 0, -1);
												i_122_ += 1 + (class_hd.field_f_3101);
											}
										}
										if ((widget.type * 876728889) == 9) {
											if ((1085348939 * widget.field_aq_2654) == 1) {
												int i_125_;
												int i_126_;
												int i_127_;
												int i_128_;
												if (widget.field_ay_2576) {
													i_125_ = i_24_;
													i_126_ = (i_25_ + (-1643237919 * (widget.onScreenHeight)));
													i_127_ = (i_24_ + (1367496319 * (widget.onScreenWidth)));
													i_128_ = i_25_;
												} else {
													i_125_ = i_24_;
													i_126_ = i_25_;
													i_127_ = (((widget.onScreenWidth) * 1367496319) + i_24_);
													i_128_ = (((widget.onScreenHeight) * -1643237919) + i_25_);
												}
												Rasterizer.method_cl_void(i_125_, i_126_, i_127_, i_128_, (widget.field_at_2617 * -2003985369));
											} else {
												final int i_129_ = ((widget.onScreenWidth * 1367496319) >= 0 ? (1367496319 * (widget.onScreenWidth)) : -(widget.onScreenWidth * 1367496319));
												final int i_130_ = (((-1643237919 * (widget.onScreenHeight)) >= 0) ? (-1643237919 * (widget.onScreenHeight)) : -(-1643237919 * (widget.onScreenHeight)));
												int i_131_ = i_129_;
												if (i_129_ < i_130_) {
													i_131_ = i_130_;
												}
												if (i_131_ != 0) {
													int i_132_ = ((1367496319 * (widget.onScreenWidth)) << 16) / i_131_;
													int i_133_ = ((((widget.onScreenHeight) * -1643237919) << 16) / i_131_);
													if (i_133_ <= i_132_) {
														i_132_ = -i_132_;
													} else {
														i_133_ = -i_133_;
													}
													final int i_134_ = (widget.field_aq_2654 * 1085348939 * i_133_) >> 17;
													final int i_135_ = (((i_133_ * (widget.field_aq_2654) * 1085348939) + 1) >> 17);
													final int i_136_ = ((1085348939 * (widget.field_aq_2654) * i_132_) >> 17);
													final int i_137_ = ((i_132_ * 1085348939 * (widget.field_aq_2654)) + 1) >> 17;
													final int i_138_ = i_24_ + i_134_;
													final int i_139_ = i_24_ - i_135_;
													final int i_140_ = ((i_24_ + (1367496319 * (widget.onScreenWidth))) - i_135_);
													final int i_141_ = (i_134_ + i_24_ + ((widget.onScreenWidth) * 1367496319));
													final int i_142_ = i_136_ + i_25_;
													final int i_143_ = i_25_ - i_137_;
													final int i_144_ = (((-1643237919 * (widget.onScreenHeight)) + i_25_) - i_137_);
													final int i_145_ = (i_136_ + (-1643237919 * (widget.onScreenHeight)) + i_25_);
													Rasterizer3D.method_a_void(i_138_, i_139_, i_140_);
													Rasterizer3D.method_u_void(i_142_, i_143_, i_144_, i_138_, i_139_, i_140_, (-2003985369 * (widget.field_at_2617)));
													Rasterizer3D.method_a_void(i_138_, i_140_, i_141_);
													Rasterizer3D.method_u_void(i_142_, i_144_, i_145_, i_138_, i_140_, i_141_, (widget.field_at_2617 * -2003985369));
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "o.cy()");
		}
	}

	static char method_d_char(final char c, final int i, final int i_146_) {
		char c_147_;
		try {
			if ((c >= '\u00c0') && (c <= '\u00ff')) {
				if ((c >= '\u00c0') && (c <= '\u00c6')) {
					return 'A';
				}
				if (c == '\u00c7') {
					return 'C';
				}
				if ((c >= '\u00c8') && (c <= '\u00cb')) {
					return 'E';
				}
				if ((c >= '\u00cc') && (c <= '\u00cf')) {
					return 'I';
				}
				if ((c >= '\u00d2') && (c <= '\u00d6')) {
					return 'O';
				}
				if ((c >= '\u00d9') && (c <= '\u00dc')) {
					return 'U';
				}
				if (c == '\u00dd') {
					return 'Y';
				}
				if (c == '\u00df') {
					return 's';
				}
				if ((c >= '\u00e0') && (c <= '\u00e6')) {
					return 'a';
				}
				if (c == '\u00e7') {
					return 'c';
				}
				if ((c >= '\u00e8') && (c <= '\u00eb')) {
					return 'e';
				}
				if ((c >= '\u00ec') && (c <= '\u00ef')) {
					return 'i';
				}
				if ((c >= '\u00f2') && (c <= '\u00f6')) {
					return 'o';
				}
				if ((c >= '\u00f9') && (c <= '\u00fc')) {
					return 'u';
				}
				if ((c == '\u00fd') || (c == '\u00ff')) {
					return 'y';
				}
			}
			c_147_ = (c == '\u0152' ? 'O' : c == '\u0153' ? 'o' : c == '\u0178' ? 'Y' : c);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "o.d()");
		}
		return c_147_;
	}

	static final void method_bd_void(final byte i) {
		try {
			Class_cl.method_br_void(false, -1120276745);
			client.field_dg_2740 = 0;
			boolean bool = true;
			for (int i_148_ = 0; i_148_ < Script.mapDataBuffer.length; i_148_++) {
				if ((Projectile.mapIndices[i_148_] != -1) && (Script.mapDataBuffer[i_148_] == null)) {
					Script.mapDataBuffer[i_148_] = (ItemContainer.terrainIndex.getArchive(Projectile.mapIndices[i_148_], 0));
					if (Script.mapDataBuffer[i_148_] == null) {
						bool = false;
						client.field_dg_2740 += 616090507;
					}
				}
				if ((ItemComposite.landscapeIndices[i_148_] != -1) && (Class_w.landscapeDataBuffer[i_148_] == null)) {
					Class_w.landscapeDataBuffer[i_148_] = (ItemContainer.terrainIndex.getArchiveData(ItemComposite.landscapeIndices[i_148_], 0, Class_dd.loaded_xteas[i_148_]));
					if (Class_w.landscapeDataBuffer[i_148_] == null) {
						bool = false;
						client.field_dg_2740 += 616090507;
					}
				}
			}
			if (!bool) {
				client.field_dl_2744 = 110076647;
			} else {
				client.field_dy_2742 = 0;
				bool = true;
				for (int i_149_ = 0; i_149_ < Script.mapDataBuffer.length; i_149_++) {
					final byte[] is = Class_w.landscapeDataBuffer[i_149_];
					if (is != null) {
						int i_150_ = (((GameMessage.loadedRegionIds[i_149_] >> 8) * 64) - (1693061403 * Class_q.originX));
						int i_151_ = ((64 * (GameMessage.loadedRegionIds[i_149_] & 0xff)) - (-1593604783 * Class_gf.originY));
						if (client.inDynamicRegion) {
							i_150_ = 10;
							i_151_ = 10;
						}
						boolean bool_152_ = true;
						final Buffer rsbytebuffer = new Buffer(is);
						int i_153_ = -1;
						for (;;) {
							final int i_154_ = rsbytebuffer.getSmart((byte) 114);
							if (i_154_ == 0) {
								bool &= bool_152_;
								break;
							}
							i_153_ += i_154_;
							int i_155_ = 0;
							boolean bool_156_ = false;
							for (;;) {
								if (!bool_156_) {
									final int i_157_ = rsbytebuffer.getSmart((byte) 51);
									if (i_157_ == 0) {
										break;
									}
									i_155_ += i_157_ - 1;
									final int i_158_ = i_155_ & 0x3f;
									final int i_159_ = (i_155_ >> 6) & 0x3f;
									final int i_160_ = (rsbytebuffer.get() >> 2);
									final int i_161_ = i_159_ + i_150_;
									final int i_162_ = i_158_ + i_151_;
									if ((i_161_ > 0) && (i_162_ > 0) && (i_161_ < 103) && (i_162_ < 103)) {
										final ObjectComposite objectdef = Class_cj.getObjectComposite(i_153_);
										if ((i_160_ != 22) || !client.field_u_2784 || ((objectdef.field_p_314 * 154452619) != 0) || ((objectdef.field_v_328 * -812798571) == 1) || objectdef.field_an_352) {
											if (!objectdef.method_f_boolean(857525786)) {
												client.field_dy_2742 += 1567372137;
												bool_152_ = false;
											}
											bool_156_ = true;
										}
									}
								} else {
									final int i_163_ = rsbytebuffer.getSmart((byte) 51);
									if (i_163_ == 0) {
										break;
									}
									rsbytebuffer.get();
								}
							}
						}
					}
				}
				if (!bool) {
					client.field_dl_2744 = 220153294;
				} else {
					if ((-1726328617 * client.field_dl_2744) != 0) {
						Class_l.method_aq_void(new StringBuilder(MenuText.LOADING_PLEASE_WAIT).append(Class_d.field_f_860).append(Class_d.field_y_857).append(100).append("%").append(Class_d.field_e_855).toString(), true, 1817667990);
					}
					Class_db.method_p_void(996785827);
					Class_q.method_c_void(1389332329);
					Class_db.method_p_void(996785827);
					Class_ae.sceneGraph.method_n_void();
					Class_db.method_p_void(996785827);
					System.gc();
					for (int i_164_ = 0; i_164_ < 4; i_164_++) {
						client.collisionMaps[i_164_].reset();
					}
					for (int i_165_ = 0; i_165_ < 4; i_165_++) {
						for (int i_166_ = 0; i_166_ < 104; i_166_++) {
							for (int i_167_ = 0; i_167_ < 104; i_167_++) {
								Region.sceneFlags[i_165_][i_166_][i_167_] = (byte) 0;
							}
						}
					}
					Class_db.method_p_void(996785827);
					SceneTile.method_n_void(-981815037);
					final int i_168_ = Script.mapDataBuffer.length;
					Class_bg.method_n_void(-2091620817);
					Class_cl.method_br_void(true, -1120276745);
					if (!client.inDynamicRegion) {
						for (int i_169_ = 0; i_169_ < i_168_; i_169_++) {
							final int i_170_ = (((GameMessage.loadedRegionIds[i_169_] >> 8) * 64) - (Class_q.originX * 1693061403));
							final int i_171_ = ((64 * (GameMessage.loadedRegionIds[i_169_] & 0xff)) - (Class_gf.originY * -1593604783));
							final byte[] is = Script.mapDataBuffer[i_169_];
							if (is != null) {
								Class_db.method_p_void(996785827);
								Class_cx.method_y_void(is, i_170_, i_171_, (-1985542728 * SpotAnim.regionX) - 48, (93451528 * Region.regionY) - 48, client.collisionMaps, -1782616410);
							}
						}
						for (int i_172_ = 0; i_172_ < i_168_; i_172_++) {
							final int i_173_ = (((GameMessage.loadedRegionIds[i_172_] >> 8) * 64) - (Class_q.originX * 1693061403));
							final int i_174_ = (((GameMessage.loadedRegionIds[i_172_] & 0xff) * 64) - (Class_gf.originY * -1593604783));
							final byte[] is = Script.mapDataBuffer[i_172_];
							if ((is == null) && ((Region.regionY * -1598931295) < 800)) {
								Class_db.method_p_void(996785827);
								Class_h.method_z_void(i_173_, i_174_, 64, 64, (byte) 105);
							}
						}
						Class_cl.method_br_void(true, -1120276745);
						for (int i_175_ = 0; i_175_ < i_168_; i_175_++) {
							final byte[] is = Class_w.landscapeDataBuffer[i_175_];
							if (is != null) {
								final int i_176_ = (((GameMessage.loadedRegionIds[i_175_] >> 8) * 64) - (Class_q.originX * 1693061403));
								final int i_177_ = ((64 * (GameMessage.loadedRegionIds[i_175_] & 0xff)) - (-1593604783 * Class_gf.originY));
								Class_db.method_p_void(996785827);
								Class_bk.method_f_void(is, i_176_, i_177_, Class_ae.sceneGraph, client.collisionMaps, 1270925851);
							}
						}
					}
					if (client.inDynamicRegion) {
						for (int i_178_ = 0; i_178_ < 4; i_178_++) {
							Class_db.method_p_void(996785827);
							for (int i_179_ = 0; i_179_ < 13; i_179_++) {
								for (int i_180_ = 0; i_180_ < 13; i_180_++) {
									boolean bool_181_ = false;
									final int i_182_ = (client.copiedRegionChunks[i_178_][i_179_][i_180_]);
									if (i_182_ != -1) {
										final int i_183_ = (i_182_ >> 24) & 0x3;
										final int i_184_ = (i_182_ >> 1) & 0x3;
										final int i_185_ = (i_182_ >> 14) & 0x3ff;
										final int i_186_ = (i_182_ >> 3) & 0x7ff;
										final int i_187_ = ((i_185_ / 8) << 8) + (i_186_ / 8);
										for (int i_188_ = 0; (i_188_ < (GameMessage.loadedRegionIds).length); i_188_++) {
											if ((i_187_ == (GameMessage.loadedRegionIds[i_188_])) && ((Script.mapDataBuffer[i_188_]) != null)) {
												Class_p.method_e_void((Script.mapDataBuffer[i_188_]), i_178_, 8 * i_179_, 8 * i_180_, i_183_, 8 * (i_185_ & 0x7), 8 * (i_186_ & 0x7), i_184_, client.collisionMaps, (byte) -83);
												bool_181_ = true;
												break;
											}
										}
									}
									if (!bool_181_) {
										final int i_189_ = i_178_;
										final int i_190_ = 8 * i_179_;
										final int i_191_ = 8 * i_180_;
										for (int i_192_ = 0; i_192_ < 8; i_192_++) {
											for (int i_193_ = 0; i_193_ < 8; i_193_++) {
												Region.heightMaps[i_189_][i_192_ + i_190_][i_193_ + i_191_] = 0;
											}
										}
										if (i_190_ > 0) {
											for (int i_194_ = 1; i_194_ < 8; i_194_++) {
												Region.heightMaps[i_189_][i_190_][i_191_ + i_194_] = (Region.heightMaps[i_189_][i_190_ - 1][i_194_ + i_191_]);
											}
										}
										if (i_191_ > 0) {
											for (int i_195_ = 1; i_195_ < 8; i_195_++) {
												Region.heightMaps[i_189_][i_190_ + i_195_][i_191_] = (Region.heightMaps[i_189_][i_195_ + i_190_][i_191_ - 1]);
											}
										}
										if ((i_190_ > 0) && ((Region.heightMaps[i_189_][i_190_ - 1][i_191_]) != 0)) {
											Region.heightMaps[i_189_][i_190_][i_191_] = (Region.heightMaps[i_189_][i_190_ - 1][i_191_]);
										} else if ((i_191_ > 0) && ((Region.heightMaps[i_189_][i_190_][i_191_ - 1]) != 0)) {
											Region.heightMaps[i_189_][i_190_][i_191_] = (Region.heightMaps[i_189_][i_190_][i_191_ - 1]);
										} else if ((i_190_ > 0) && (i_191_ > 0) && ((Region.heightMaps[i_189_][i_190_ - 1][i_191_ - 1]) != 0)) {
											Region.heightMaps[i_189_][i_190_][i_191_] = (Region.heightMaps[i_189_][i_190_ - 1][i_191_ - 1]);
										}
									}
								}
							}
						}
						for (int i_196_ = 0; i_196_ < 13; i_196_++) {
							for (int i_197_ = 0; i_197_ < 13; i_197_++) {
								final int i_198_ = (client.copiedRegionChunks[0][i_196_][i_197_]);
								if (i_198_ == -1) {
									Class_h.method_z_void(8 * i_196_, i_197_ * 8, 8, 8, (byte) 4);
								}
							}
						}
						Class_cl.method_br_void(true, -1120276745);
						for (int i_199_ = 0; i_199_ < 4; i_199_++) {
							Class_db.method_p_void(996785827);
							for (int i_200_ = 0; i_200_ < 13; i_200_++) {
								for (int i_201_ = 0; i_201_ < 13; i_201_++) {
									final int i_202_ = (client.copiedRegionChunks[i_199_][i_200_][i_201_]);
									if (i_202_ != -1) {
										final int i_203_ = (i_202_ >> 24) & 0x3;
										final int i_204_ = (i_202_ >> 1) & 0x3;
										final int i_205_ = (i_202_ >> 14) & 0x3ff;
										final int i_206_ = (i_202_ >> 3) & 0x7ff;
										final int i_207_ = (i_206_ / 8) + ((i_205_ / 8) << 8);
										for (int i_208_ = 0; (i_208_ < (GameMessage.loadedRegionIds).length); i_208_++) {
											if (((GameMessage.loadedRegionIds[i_208_]) == i_207_) && ((Class_w.landscapeDataBuffer[i_208_]) != null)) {
												final byte[] is = (Class_w.landscapeDataBuffer[i_208_]);
												final int i_209_ = i_200_ * 8;
												final int i_210_ = 8 * i_201_;
												final int i_211_ = 8 * (i_205_ & 0x7);
												final int i_212_ = 8 * (i_206_ & 0x7);
												final SceneGraph scenegraph = Class_ae.sceneGraph;
												final CollisionMap[] collisionmaps = client.collisionMaps;
												final Buffer rsbytebuffer = new Buffer(is);
												int i_213_ = -1;
												for (;;) {
													final int i_214_ = (rsbytebuffer.getSmart((byte) 87));
													if (i_214_ == 0) {
														break;
													}
													i_213_ += i_214_;
													int i_215_ = 0;
													for (;;) {
														final int i_216_ = (rsbytebuffer.getSmart((byte) 70));
														if (i_216_ == 0) {
															break;
														}
														i_215_ += i_216_ - 1;
														final int i_217_ = i_215_ & 0x3f;
														final int i_218_ = ((i_215_ >> 6) & 0x3f);
														final int i_219_ = i_215_ >> 12;
										final int i_220_ = (rsbytebuffer.get());
										final int i_221_ = i_220_ >> 2;
										final int i_222_ = i_220_ & 0x3;
										if ((i_219_ == i_203_) && (i_218_ >= i_211_) && (i_218_ < (8 + i_211_)) && (i_217_ >= i_212_) && (i_217_ < (i_212_ + 8))) {
											final ObjectComposite objectdef = (Class_cj.getObjectComposite(i_213_));
											final int i_223_ = (i_209_ + (Class_ab.method_z_int((i_218_ & 0x7), (i_217_ & 0x7), i_204_, (211338481 * (objectdef.width)), ((objectdef.length) * 1201809627), i_222_, -2113327320)));
											final int i_224_ = i_218_ & 0x7;
											final int i_225_ = i_217_ & 0x7;
											int i_226_ = ((objectdef.width) * 211338481);
											int i_227_ = ((objectdef.length) * 1201809627);
											if ((i_222_ & 0x1) == 1) {
												final int i_228_ = i_226_;
												i_226_ = i_227_;
												i_227_ = i_228_;
											}
											final int i_229_ = i_204_ & 0x3;
											int i_230_;
											if (i_229_ == 0) {
												i_230_ = i_225_;
											} else if (i_229_ == 1) {
												i_230_ = (7 - i_224_ - (i_226_ - 1));
											} else if (i_229_ == 2) {
												i_230_ = (7 - i_225_ - (i_227_ - 1));
											} else {
												i_230_ = i_224_;
											}
											final int i_231_ = (i_210_ + i_230_);
											if ((i_223_ > 0) && (i_231_ > 0) && (i_223_ < 103) && (i_231_ < 103)) {
												int i_232_ = i_199_;
												if (((Region.sceneFlags[1][i_223_][i_231_]) & 0x2) == 2) {
													i_232_ = (i_199_ - 1);
												}
												CollisionMap collisionmap = null;
												if (i_232_ >= 0) {
													collisionmap = (collisionmaps[i_232_]);
												}
												Class_d.method_m_void(i_199_, i_223_, i_231_, i_213_, ((i_204_ + i_222_) & 0x3), i_221_, scenegraph, collisionmap, -1527241213);
											}
										}
													}
												}
												break;
											}
										}
									}
								}
							}
						}
					}
					Class_cl.method_br_void(true, -1120276745);
					Class_q.method_c_void(1389332329);
					Class_db.method_p_void(996785827);
					Buffer.method_a_void(Class_ae.sceneGraph, client.collisionMaps, -396980972);
					Class_cl.method_br_void(true, -1120276745);
					int i_233_ = -470415013 * Region.field_z_993;
					if (i_233_ > (Class_ed.plane * 250114511)) {
						i_233_ = Class_ed.plane * 250114511;
					}
					if (i_233_ < ((250114511 * Class_ed.plane) - 1)) {
						i_233_ = (250114511 * Class_ed.plane) - 1;
					}
					if (client.field_u_2784) {
						Class_ae.sceneGraph.method_d_void(-470415013 * Region.field_z_993);
					} else {
						Class_ae.sceneGraph.method_d_void(0);
					}
					for (int i_234_ = 0; i_234_ < 104; i_234_++) {
						for (int i_235_ = 0; i_235_ < 104; i_235_++) {
							Npc.drawGroundItems(i_234_, i_235_, -463663247);
						}
					}
					Class_db.method_p_void(996785827);
					for (Class_r class_r = (Class_r) client.field_hv_2821.method_f_ga(); class_r != null; class_r = (Class_r) client.field_hv_2821.method_a_ga()) {
						if ((-621780465 * class_r.field_u_1335) == -1) {
							class_r.field_l_1334 = 0;
							Friend.method_bz_void(class_r, 159623365);
						} else {
							class_r.removeLink();
						}
					}
					ObjectComposite.field_e_317.method_y_void();
					if (Class_ci.field_qb_982 != null) {
						client.encryptedBuffer.writeOpcode(31);
						client.encryptedBuffer.putInt(1057001181);
					}
					if (!client.inDynamicRegion) {
						final int i_236_ = ((SpotAnim.regionX * -248192841) - 6) / 8;
						final int i_237_ = ((-248192841 * SpotAnim.regionX) + 6) / 8;
						final int i_238_ = ((Region.regionY * -1598931295) - 6) / 8;
						final int i_239_ = ((-1598931295 * Region.regionY) + 6) / 8;
						for (int i_240_ = i_236_ - 1; i_240_ <= (1 + i_237_); i_240_++) {
							for (int i_241_ = i_238_ - 1; i_241_ <= (i_239_ + 1); i_241_++) {
								if ((i_240_ < i_236_) || (i_240_ > i_237_) || (i_241_ < i_238_) || (i_241_ > i_239_)) {
									ItemContainer.terrainIndex.method_b_void(new StringBuilder("m").append(i_240_).append("_").append(i_241_).toString(), (byte) 90);
									ItemContainer.terrainIndex.method_b_void(new StringBuilder("l").append(i_240_).append("_").append(i_241_).toString(), (byte) 89);
								}
							}
						}
					}
					Socket.method_h_void(30, -1020936791);
					Class_db.method_p_void(996785827);
					ZipInflater.method_d_void(-237392320);
					client.encryptedBuffer.writeOpcode(117);
					Class_cw.method_rn_void(-868282151);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "o.bd()");
		}
	}
}
