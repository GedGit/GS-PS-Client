
/* Class_s - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

public class Class_s {
	static final int field_av_1352 = 58;
	int field_n_1353;
	DataInputStream input;
	byte[] field_y_1355 = new byte[4];
	int field_e_1356;
	byte[] field_g_1357;
	int field_f_1358;
	long field_m_1359;
	public static short[] field_a_1360;
	public static Class_bi field_qj_1361;
	Class_es field_d_1362;
	static int field_qv_1363;
	static Index skeletonIndex;

	public static int method_g_int(final CharSequence charsequence, final int i) {
		int i_0_;
		try {
			final int i_1_ = charsequence.length();
			int i_2_ = 0;
			for (int i_3_ = 0; i_3_ < i_1_; i_3_++) {
				i_2_ = ((i_2_ << 5) - i_2_) + charsequence.charAt(i_3_);
			}
			i_0_ = i_2_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "s.g()");
		}
		return i_0_;
	}

	static void method_df_void() {
		try {
			for (Menu interfacepositionnode = ((Menu) client.menuTable
					.method_y_ga()); interfacepositionnode != null; interfacepositionnode = ((Menu) client.menuTable
							.method_e_ga())) {
				final int i_4_ = ((interfacepositionnode.interfaceId) * 44103667);
				if (Class_fz.loadWidget(i_4_, -780684164)) {
					boolean interactive = true;
					final Widget[] widgets = Widget.widgets[i_4_];
					for (final Widget widget : widgets) {
						if (widget != null) {
							interactive = widget.interactive;
							break;
						}
					}
					if (!interactive) {
						final int i_6_ = (int) interfacepositionnode.id;
						final Widget widget = Class_en.getWidgetByUID(i_6_, (short) 7783);
						if (widget != null) {
							Daemon.method_dn_void(widget, (byte) -82);
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "s.df()");
		}
	}

	static final void method_am_void(final Class_al class_al, final byte i) {
		try {
			if (((client.field_mk_2923 * 851978955) == ((-2103184911 * Class_ci.myPlayer.worldPosX) >> 7))
					&& ((1672942591 * client.field_mn_2924) == ((2088773389 * Class_ci.myPlayer.worldPosY) >> 7))) {
				client.field_mk_2923 = 0;
			}
			int i_7_ = 2000365659 * client.localPlayerCount;
			if ((class_al == Class_al.field_n_175) || (Class_al.field_d_180 == class_al)) {
				i_7_ = 1;
			}
			int i_8_ = 0;
			for (/**/; i_8_ < i_7_; i_8_++) {
				Player player;
				int i_9_;
				if (Class_al.field_n_175 == class_al) {
					player = Class_ci.myPlayer;
					i_9_ = 33538048;
				} else if (class_al == Class_al.field_d_180) {
					player = client.localPlayers[-519351145 * client.field_hm_2819];
					i_9_ = (-519351145 * client.field_hm_2819) << 14;
				} else {
					player = client.localPlayers[client.playerIndexArray[i_8_]];
					i_9_ = client.playerIndexArray[i_8_] << 14;
					if ((Class_al.field_y_177 == class_al)
							&& ((-519351145 * client.field_hm_2819) == client.playerIndexArray[i_8_])) {
						continue;
					}
				}
				if ((player != null) && player.method_z_boolean(1877662443) && !player.spotAnimating) {
					player.field_s_1557 = false;
					if (((client.field_u_2784 && ((2000365659 * client.localPlayerCount) > 50))
							|| ((client.localPlayerCount * 2000365659) > 200)) && (class_al != Class_al.field_n_175)
							&& ((-385188719 * player.standAnimation) == (player.field_af_226 * -1720610647))) {
						player.field_s_1557 = true;
					}
					final int i_10_ = (-2103184911 * player.worldPosX) >> 7;
					final int i_11_ = (2088773389 * player.worldPosY) >> 7;
					if ((i_10_ >= 0) && (i_10_ < 104) && (i_11_ >= 0) && (i_11_ < 104)) {
						if ((player.screenModel != null)
								&& ((303796053 * client.currentCycle) >= (-250776255 * player.field_m_1551))
								&& ((client.currentCycle * 303796053) < (1882146187 * player.field_a_1564))) {
							player.field_s_1557 = false;
							player.field_f_1550 = ((Class_q.getTileHeight(-2103184911 * player.worldPosX,
									player.worldPosY * 2088773389, Class_ed.plane * 250114511)) * 1661654469);
							Class_ae.sceneGraph.method_q_boolean(Class_ed.plane * 250114511,
									-2103184911 * player.worldPosX, player.worldPosY * 2088773389,
									1113448717 * player.field_f_1550, 60, player, player.field_b_217 * -2023015971,
									i_9_, 207385965 * player.field_k_1563, player.field_x_1554 * 1795064935,
									player.field_r_1552 * 359736917, 1225122831 * player.field_j_1560);
						} else {
							if ((((player.worldPosX * -2103184911) & 0x7f) == 64)
									&& (((2088773389 * player.worldPosY) & 0x7f) == 64)) {
								if ((-381545033 * client.field_gl_2789) == client.field_fz_2788[i_10_][i_11_]) {
									continue;
								}
								client.field_fz_2788[i_10_][i_11_] = -381545033 * client.field_gl_2789;
							}
							player.field_f_1550 = ((Class_q.getTileHeight(player.worldPosX * -2103184911,
									2088773389 * player.worldPosY, 250114511 * Class_ed.plane)) * 1661654469);
							Class_ae.sceneGraph.method_u_boolean(Class_ed.plane * 250114511,
									-2103184911 * player.worldPosX, player.worldPosY * 2088773389,
									player.field_f_1550 * 1113448717, 60, player, -2023015971 * player.field_b_217,
									i_9_, player.field_t_267);
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "s.am()");
		}
	}

	Class_s(final Daemon class_dx, final URL url) {
		this.field_d_1362 = class_dx.method_m_es(url, (byte) -1);
		this.field_n_1353 = 0;
		this.field_m_1359 = (Renderable.getCurrentTime(1185888817) + 30000L) * -6800839611572366219L;
	}

	byte[] getWorldList() throws IOException {
		do {
			byte[] is;
			try {
				if (Renderable.getCurrentTime(398816454) > (this.field_m_1359 * 1109077838540397533L)) {
					throw new IOException();
				} // hmm need to do this method, aka find out what its doing.
					// print city.
				if ((this.field_n_1353 * -401345013) == 0) {// this field is 0
															// for us xd
					if (this.field_d_1362.field_e_2217 == 2) {// well for some
																// reason this
																// is 2
						throw new IOException();
					}
					if (this.field_d_1362.field_e_2217 == 1) {
						this.input = ((DataInputStream) this.field_d_1362.field_a_2213);
						this.field_n_1353 = 749233571;
					}
				}
				if ((-401345013 * this.field_n_1353) == 1) {
					int i_12_ = this.input.available();
					if (i_12_ > 0) {
						if ((i_12_ + (this.field_e_1356 * -209335235)) > 4) {
							i_12_ = 4 - (this.field_e_1356 * -209335235);
						}
						this.field_e_1356 += (this.input.read(this.field_y_1355, -209335235 * this.field_e_1356, i_12_))
								* 1930963733;
						if ((this.field_e_1356 * -209335235) == 4) {
							final int i_13_ = new Buffer(this.field_y_1355).getInt();
							this.field_g_1357 = new byte[i_13_];
							this.field_n_1353 = 1498467142;
						}
					}
				}
				if ((this.field_n_1353 * -401345013) != 2) {
					break;
				}
				int i_14_ = this.input.available();
				if (i_14_ <= 0) {
					break;
				}
				if ((i_14_ + (2119280281 * this.field_f_1358)) > this.field_g_1357.length) {
					i_14_ = (this.field_g_1357.length - (this.field_f_1358 * 2119280281));
				}
				this.field_f_1358 += this.input.read((this.field_g_1357), ((this.field_f_1358) * 2119280281), i_14_)
						* -1408938583;
				if ((this.field_f_1358 * 2119280281) != this.field_g_1357.length) {
					break;
				}
				is = this.field_g_1357;
			} catch (final RuntimeException runtimeexception) {
				throw GameCanvas.error(runtimeexception, "s.n()");
			}
			return is;
		} while (false);
		return null;
	}

	public static int method_n_int(final int i, final byte i_15_) {
		int i_16_;
		try {
			final VarpBit class_aq = Class_de.getVarpBit(i);
			final int i_17_ = -1163604713 * class_aq.config;
			final int i_18_ = -376031909 * class_aq.leastSignificant;
			final int i_19_ = 1426513595 * class_aq.mostSignificant;
			final int i_20_ = Class_fv.field_n_2508[i_19_ - i_18_];
			i_16_ = (Class_fv.configs[i_17_] >> i_18_) & i_20_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "s.n()");
		}
		return i_16_;
	}

	static final void method_bb_void(final int i, final int i_21_, final int i_22_, final int i_23_, final int i_24_) {
		try {
			for (int i_25_ = 0; i_25_ < (client.field_lx_2892 * 998139771); i_25_++) {
				if (((client.field_lw_2960[i_25_] + client.field_lc_2941[i_25_]) > i)
						&& (client.field_lw_2960[i_25_] < (i_22_ + i))
						&& ((client.field_lq_2898[i_25_] + client.field_le_2900[i_25_]) > i_21_)
						&& (client.field_lq_2898[i_25_] < (i_23_ + i_21_))) {
					client.field_li_2835[i_25_] = true;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "s.bb()");
		}
	}
}
