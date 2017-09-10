/* Class_cq - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

public final class Class_cq {
	static Rasterizer2D[] headicons_pk;
	int field_d_1211;
	int field_z_1212;
	int field_n_1213;
	boolean field_g_1214 = true;
	int field_e_1215;
	int field_f_1216;
	static final int field_kk_1217 = 32;
	int field_y_1218;
	public static final int field_gj_1219 = 51;
	static final int field_j_1220 = 65536;

	public static String method_z_String(final CharSequence charsequence, final byte i) {
		String string;
		try {
			long l = 0L;
			final int i_0_ = charsequence.length();
			for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
				l *= 37L;
				final char c = charsequence.charAt(i_1_);
				if ((c >= 'A') && (c <= 'Z')) {
					l += (c + '\001') - 'A';
				} else if ((c >= 'a') && (c <= 'z')) {
					l += (c + '\001') - 'a';
				} else if ((c >= '0') && (c <= '9')) {
					l += ('\033' + c) - '0';
				}
				if (l >= 177917621779460413L) {
					break;
				}
			}
			for (/**/; (0L == (l % 37L)) && (0L != l); l /= 37L) {
				/* empty */
			}
			String string_2_ = Class_dt.method_d_String(l);
			if (string_2_ == null) {
				string_2_ = "";
			}
			string = string_2_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "cq.z()");
		}
		return string;
	}

	static final void method_dw_void(final Widget[] widgets, final int i, final int i_3_) {
		try {
			int i_4_ = 0;
			for (/**/; i_4_ < widgets.length; i_4_++) {
				final Widget widget = widgets[i_4_];
				if ((widget != null) && (i == (-1405313417 * widget.parentId)) && (!widget.interactive || !FileStore.method_em_boolean(widget, -77764527))) {
					if ((876728889 * widget.type) == 0) {
						if (!widget.interactive && FileStore.method_em_boolean(widget, -54189529) && (Menu.field_im_1543 != widget)) {
							continue;
						}
						method_dw_void(widgets, widget.uid * -560181405, 1261617728);
						if (widget.components != null) {
							method_dw_void(widget.components, -560181405 * widget.uid, -796478537);
						}
						final Menu interfacepositionnode = ((Menu) (client.menuTable.method_n_ga(widget.uid * -560181405)));
						if (interfacepositionnode != null) {
							final int i_5_ = (44103667 * interfacepositionnode.interfaceId);
							if (Class_fz.loadWidget(i_5_, 887423176)) {
								method_dw_void(Widget.widgets[i_5_], -1, -1068946231);
							}
						}
					}
					if ((widget.type * 876728889) == 6) {
						if (((793412913 * widget.field_ba_2589) != -1) || ((widget.field_br_2555 * -679503551) != -1)) {
							final boolean bool = Class_ab.method_dt_boolean(widget, -1515422074);
							int i_6_;
							if (bool) {
								i_6_ = -679503551 * widget.field_br_2555;
							} else {
								i_6_ = widget.field_ba_2589 * 793412913;
							}
							if (i_6_ != -1) {
								final AnimationSequence class_an = OnDemandNode.getAnimationSequence(i_6_);
								widget.field_en_2665 += -239347213 * client.field_ej_2761;
								while ((-1185351251 * widget.field_en_2665) > (class_an.frames[(widget.field_eq_2664 * 974863009)])) {
									widget.field_en_2665 -= (class_an.frames[(widget.field_eq_2664 * 974863009)]) * 824496677;
									widget.field_eq_2664 += 1584081249;
									if ((974863009 * widget.field_eq_2664) >= class_an.cycle.length) {
										widget.field_eq_2664 -= (1020019019 * class_an.field_h_199);
										if (((974863009 * widget.field_eq_2664) < 0) || ((widget.field_eq_2664 * 974863009) >= (class_an.cycle).length)) {
											widget.field_eq_2664 = 0;
										}
									}
									Daemon.method_dn_void(widget, (byte) 106);
								}
							}
						}
						if (((-1043345671 * widget.field_by_2598) != 0) && !widget.interactive) {
							int i_7_ = (-1043345671 * widget.field_by_2598) >> 16;
							int i_8_ = (((-1043345671 * widget.field_by_2598) << 16) >> 16);
							i_7_ *= client.field_ej_2761 * -1720212425;
							i_8_ *= client.field_ej_2761 * -1720212425;
							widget.field_bu_2670 = ((i_7_ + (646892533 * widget.field_bu_2670)) & 0x7ff) * 584534109;
							widget.field_bq_2590 = ((i_8_ + (-1210215319 * widget.field_bq_2590)) & 0x7ff) * 1360083929;
							Daemon.method_dn_void(widget, (byte) -37);
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "cq.dw()");
		}
	}

	public static int method_d_int(int i, final int i_9_) {
		int i_10_;
		try {
			i = ((i >>> 1) & 0x55555555) + (i & 0x55555555);
			i = (i & 0x33333333) + ((i >>> 2) & 0x33333333);
			i = (i + (i >>> 4)) & 0xf0f0f0f;
			i += i >>> 8;
			i += i >>> 16;
			i_10_ = i & 0xff;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "cq.d()");
		}
		return i_10_;
	}

	static final void method_au_void(final int i, final int i_11_, final int i_12_, final int i_13_, final byte i_14_) {
		try {
			client.field_fb_2897 = 0;
			boolean bool = false;
			int i_15_ = -1;
			for (int i_16_ = -1; i_16_ < ((client.localNpcCount * 1308149425) + (client.localPlayerCount * 2000365659)); i_16_++) {
				Actor character;
				if (i_16_ == -1) {
					character = Class_ci.myPlayer;
				} else if (i_16_ < (client.localPlayerCount * 2000365659)) {
					character = client.localPlayers[client.playerIndexArray[i_16_]];
					if (client.playerIndexArray[i_16_] == (-519351145 * client.field_hm_2819)) {
						bool = true;
						i_15_ = i_16_;
						continue;
					}
				} else {
					character = client.npcs[(client.npcIndexArray[i_16_ - (client.localPlayerCount * 2000365659)])];
				}
				WidgetNode.method_af_void(character, i_16_, i, i_11_, i_12_, i_13_, (byte) -30);
			}
			if (bool) {
				WidgetNode.method_af_void((client.localPlayers[-519351145 * client.field_hm_2819]), i_15_, i, i_11_, i_12_, i_13_, (byte) 9);
			}
			for (int i_17_ = 0; i_17_ < (client.field_fb_2897 * -1231218743); i_17_++) {
				final int i_18_ = client.field_fa_2867[i_17_];
				int i_19_ = client.field_fg_2781[i_17_];
				final int i_20_ = client.field_fj_2783[i_17_];
				final int i_21_ = client.field_fo_2782[i_17_];
				boolean bool_22_ = true;
				while (bool_22_) {
					bool_22_ = false;
					for (int i_23_ = 0; i_23_ < i_17_; i_23_++) {
						if (((2 + i_19_) > (client.field_fg_2781[i_23_] - client.field_fo_2782[i_23_])) && ((i_19_ - i_21_) < (client.field_fg_2781[i_23_] + 2)) && ((i_18_ - i_20_) < (client.field_fa_2867[i_23_] + client.field_fj_2783[i_23_])) && ((i_20_ + i_18_) > (client.field_fa_2867[i_23_] - client.field_fj_2783[i_23_])) && ((client.field_fg_2781[i_23_] - client.field_fo_2782[i_23_]) < i_19_)) {
							i_19_ = (client.field_fg_2781[i_23_] - client.field_fo_2782[i_23_]);
							bool_22_ = true;
						}
					}
				}
				client.field_gp_2790 = client.field_fa_2867[i_17_] * -587570793;
				client.field_gx_2704 = (client.field_fg_2781[i_17_] = i_19_) * 58397871;
				final String string = client.field_fi_2787[i_17_];
				if ((client.field_js_2849 * 1726505983) == 0) {
					int i_24_ = 16776960;
					if (client.field_fm_2718[i_17_] < 6) {
						i_24_ = (client.field_lp_2906[client.field_fm_2718[i_17_]]);
					}
					if (client.field_fm_2718[i_17_] == 6) {
						i_24_ = (((-381545033 * client.field_gl_2789) % 20) < 10 ? 16711680 : 16776960);
					}
					if (client.field_fm_2718[i_17_] == 7) {
						i_24_ = (((-381545033 * client.field_gl_2789) % 20) < 10 ? 255 : 65535);
					}
					if (client.field_fm_2718[i_17_] == 8) {
						i_24_ = (((client.field_gl_2789 * -381545033) % 20) < 10 ? 45056 : 8454016);
					}
					if (client.field_fm_2718[i_17_] == 9) {
						final int i_25_ = 150 - client.field_fd_2786[i_17_];
						if (i_25_ < 50) {
							i_24_ = (i_25_ * 1280) + 16711680;
						} else if (i_25_ < 100) {
							i_24_ = 16776960 - ((i_25_ - 50) * 327680);
						} else if (i_25_ < 150) {
							i_24_ = ((i_25_ - 100) * 5) + 65280;
						}
					}
					if (client.field_fm_2718[i_17_] == 10) {
						final int i_26_ = 150 - client.field_fd_2786[i_17_];
						if (i_26_ < 50) {
							i_24_ = (5 * i_26_) + 16711680;
						} else if (i_26_ < 100) {
							i_24_ = 16711935 - (327680 * (i_26_ - 50));
						} else if (i_26_ < 150) {
							i_24_ = ((((i_26_ - 100) * 327680) + 255) - ((i_26_ - 100) * 5));
						}
					}
					if (client.field_fm_2718[i_17_] == 11) {
						final int i_27_ = 150 - client.field_fd_2786[i_17_];
						if (i_27_ < 50) {
							i_24_ = 16777215 - (i_27_ * 327685);
						} else if (i_27_ < 100) {
							i_24_ = 65280 + ((i_27_ - 50) * 327685);
						} else if (i_27_ < 150) {
							i_24_ = 16777215 - (327680 * (i_27_ - 100));
						}
					}
					if (client.field_fw_2765[i_17_] == 0) {
						IdentityKit.b12Full.drawCenteredString(string, (client.field_gp_2790 * 813575719) + i, (client.field_gx_2704 * 1411957327) + i_11_, i_24_, 0);
					}
					if (client.field_fw_2765[i_17_] == 1) {
						IdentityKit.b12Full.method_q_void(string, (813575719 * client.field_gp_2790) + i, i_11_ + (client.field_gx_2704 * 1411957327), i_24_, 0, client.field_gl_2789 * -381545033);
					}
					if (client.field_fw_2765[i_17_] == 2) {
						IdentityKit.b12Full.method_k_void(string, (813575719 * client.field_gp_2790) + i, i_11_ + (client.field_gx_2704 * 1411957327), i_24_, 0, client.field_gl_2789 * -381545033);
					}
					if (client.field_fw_2765[i_17_] == 3) {
						IdentityKit.b12Full.method_x_void(string, (client.field_gp_2790 * 813575719) + i, (1411957327 * client.field_gx_2704) + i_11_, i_24_, 0, client.field_gl_2789 * -381545033, 150 - client.field_fd_2786[i_17_]);
					}
					if (client.field_fw_2765[i_17_] == 4) {
						final int i_28_ = (((150 - client.field_fd_2786[i_17_]) * (IdentityKit.b12Full.getTextWidth(string) + 100)) / 150);
						Rasterizer.method_cc_void((i + (client.field_gp_2790 * 813575719)) - 50, i_11_, (client.field_gp_2790 * 813575719) + i + 50, i_11_ + i_13_);
						IdentityKit.b12Full.method_a_void(string, (50 + i + (813575719 * client.field_gp_2790)) - i_28_, (client.field_gx_2704 * 1411957327) + i_11_, i_24_, 0);
						Rasterizer.method_ce_void(i, i_11_, i + i_12_, i_11_ + i_13_);
					}
					if (client.field_fw_2765[i_17_] == 5) {
						final int i_29_ = 150 - client.field_fd_2786[i_17_];
						int i_30_ = 0;
						if (i_29_ < 25) {
							i_30_ = i_29_ - 25;
						} else if (i_29_ > 125) {
							i_30_ = i_29_ - 125;
						}
						Rasterizer.method_cc_void(i, (((client.field_gx_2704 * 1411957327) + i_11_) - IdentityKit.b12Full.field_f_3101 - 1), i_12_ + i, i_11_ + (client.field_gx_2704 * 1411957327) + 5);
						IdentityKit.b12Full.drawCenteredString(string, (client.field_gp_2790 * 813575719) + i, i_30_ + i_11_ + (1411957327 * client.field_gx_2704), i_24_, 0);
						Rasterizer.method_ce_void(i, i_11_, i_12_ + i, i_13_ + i_11_);
					}
				} else {
					IdentityKit.b12Full.drawCenteredString(string, (813575719 * client.field_gp_2790) + i, (client.field_gx_2704 * 1411957327) + i_11_, 16776960, 0);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "cq.au()");
		}
	}

	Class_cq(final int i, final int i_31_, final int i_32_, final int i_33_, final int i_34_, final int i_35_, final boolean bool) {
		this.field_n_1213 = 1362618683 * i;
		this.field_d_1211 = i_31_ * 1640800555;
		this.field_z_1212 = 1376168441 * i_32_;
		this.field_y_1218 = i_33_ * -280559975;
		this.field_e_1215 = i_34_ * -396398197;
		this.field_f_1216 = i_35_ * -1960098767;
		this.field_g_1214 = bool;
	}

	static void method_n_void(final File file, final short i) {
		try {
			Class_de.field_d_1595 = file;
			if (!Class_de.field_d_1595.exists()) {
				throw new RuntimeException("");
			}
			Class_de.field_n_1596 = true;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "cq.n()");
		}
	}

	static void method_dm_void(final int i, final byte i_36_) {
		try {
			Class_l.field_ie_1132 = new Class_ae();
			Class_l.field_ie_1132.field_n_52 = client.field_is_2830[i] * 68233975;
			Class_l.field_ie_1132.field_d_48 = client.field_io_2831[i] * 4722891;
			Class_l.field_ie_1132.field_z_49 = 2089838947 * client.field_ik_2832[i];
			Class_l.field_ie_1132.field_y_50 = -359245763 * client.field_il_2833[i];
			Class_l.field_ie_1132.field_e_51 = client.menuActions[i];
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "cq.dm()");
		}
	}

	public static int method_n_int(final byte[] is, final int i, final short i_37_) {
		int i_38_;
		try {
			int i_39_ = -1;
			for (int i_40_ = 0; i_40_ < i; i_40_++) {
				i_39_ = (i_39_ >>> 8) ^ (Buffer.field_z_1630[(i_39_ ^ is[i_40_]) & 0xff]);
			}
						i_39_ ^= 0xffffffff;
						i_38_ = i_39_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "cq.n()");
		}
		return i_38_;
	}
}
