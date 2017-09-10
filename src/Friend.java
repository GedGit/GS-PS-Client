/* Class_j - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Date;

public class Friend {
	String name;
	String displayName;
	int world;
	int clanRank;
	boolean field_e_1091;
	static int[][][] field_x_1092;
	static final int field_q_1093 = 171;
	static int field_bc_1094;
	static Sprite field_l_1095;
	boolean field_g_1096;

	static final int method_dj_int(final Widget widget, final int i, final int i_0_) {
		do {
			try {
				if ((widget.opcodes == null) || (i >= widget.opcodes.length)) {
					break;
				}
				try {
					final int[] is = widget.opcodes[i];
					int i_1_ = 0;
					int i_2_ = 0;
					int i_3_ = 0;
					for (;;) {
						final int i_4_ = is[i_2_++];
						int i_5_ = 0;
						int i_6_ = 0;
						if (i_4_ == 0) {
							return i_1_;
						}
						if (i_4_ == 1) {
							i_5_ = client.playerStatsCurrentLevel[is[i_2_++]];
						}
						if (i_4_ == 2) {
							i_5_ = client.playerStatsLevel[is[i_2_++]];
						}
						if (i_4_ == 3) {
							i_5_ = client.playerStatsExp[is[i_2_++]]; 
						}
						if (i_4_ == 4) {
							int i_7_ = is[i_2_++] << 16;
							i_7_ += is[i_2_++];
							final Widget widget_8_ = Class_en.getWidgetByUID(i_7_, (short) 8939);
							final int i_9_ = is[i_2_++];
							if ((i_9_ != -1) && (!(ItemDefinitions.getItemComposite(i_9_).members) || client.onMembersWorld)) {
								for (int i_10_ = 0; i_10_ < widget_8_.itemIds.length; i_10_++) {
									if ((i_9_ + 1) == widget_8_.itemIds[i_10_]) {
										i_5_ += widget_8_.itemAmts[i_10_];
									}
								}
							}
						}
						if (i_4_ == 5) {
							i_5_ = Class_fv.configs[is[i_2_++]];
						}
						if (i_4_ == 6) {
							i_5_ = (Class_ey.field_z_2261[client.playerStatsLevel[is[i_2_++]] - 1]);
						}
						if (i_4_ == 7) {
							i_5_ = (Class_fv.configs[is[i_2_++]] * 100) / 46875;
						}
						if (i_4_ == 8) {
							i_5_ = 2052698405 * (Class_ci.myPlayer.combatLevel);
						}
						if (i_4_ == 9) {
							for (int i_11_ = 0; i_11_ < 25; i_11_++) {
								if (Class_ey.field_d_2260[i_11_]) {
									i_5_ += client.playerStatsLevel[i_11_];
								}
							}
						}
						if (i_4_ == 10) {
							int i_12_ = is[i_2_++] << 16;
							i_12_ += is[i_2_++];
							final Widget widget_13_ = Class_en.getWidgetByUID(i_12_, (short) 28710);
							final int i_14_ = is[i_2_++];
							if ((i_14_ != -1) && (!(ItemDefinitions.getItemComposite(i_14_).members) || client.onMembersWorld)) {
								for (final int itemId : widget_13_.itemIds) {
									if ((i_14_ + 1) == itemId) {
										i_5_ = 999999999;
										break;
									}
								}
							}
						}
						if (i_4_ == 11) {
							i_5_ = client.runEnergy * 158338671;
						}
						if (i_4_ == 12) {
							i_5_ = client.weight * -1702839345;
						}
						if (i_4_ == 13) {
							final int i_16_ = Class_fv.configs[is[i_2_++]];
							final int i_17_ = is[i_2_++];
							i_5_ = (i_16_ & (1 << i_17_)) != 0 ? 1 : 0;
						}
						if (i_4_ == 14) {
							final int i_18_ = is[i_2_++];
							i_5_ = Class_s.method_n_int(i_18_, (byte) -102);
						}
						if (i_4_ == 15) {
							i_6_ = 1;
						}
						if (i_4_ == 16) {
							i_6_ = 2;
						}
						if (i_4_ == 17) {
							i_6_ = 3;
						}
						if (i_4_ == 18) {
							i_5_ = ((Class_q.originX * 1693061403) + ((-2103184911 * (Class_ci.myPlayer.worldPosX)) >> 7));
						}
						if (i_4_ == 19) {
							i_5_ = ((Class_gf.originY * -1593604783) + ((Class_ci.myPlayer.worldPosY * 2088773389) >> 7));
						}
						if (i_4_ == 20) {
							i_5_ = is[i_2_++];
						}
						if (i_6_ == 0) {
							if (i_3_ == 0) {
								i_1_ += i_5_;
							}
							if (i_3_ == 1) {
								i_1_ -= i_5_;
							}
							if ((i_3_ == 2) && (i_5_ != 0)) {
								i_1_ /= i_5_;
							}
							if (i_3_ == 3) {
								i_1_ *= i_5_;
							}
							i_3_ = 0;
						} else {
							i_3_ = i_6_;
						}
					}
				} catch (final Exception exception) {
					/* empty */
				}
			} catch (final RuntimeException runtimeexception) {
				throw GameCanvas.error(runtimeexception, "j.dj()");
			}
			return -1;
		} while (false);
		return -2;
	}

	static void interpretResponse(final int i, final int i_19_) {
		try {
			if (i == -3) {
				Class_fl.method_g_void(MenuText.CONN_TIMED_OUT, MenuText.TRY_DIFFERENT_WORLD, MenuText.field_ah_1824, 2065896119);
			} else if (i == -2) {
				Class_fl.method_g_void(MenuText.EMPTY___, MenuText.ERROR_CONNECTING_SRV, MenuText.EMPTY____, 1634693633);
			} else if (i == -1) {
				Class_fl.method_g_void(MenuText.NO_INC_RESPONSE, MenuText.TRY_DIFF_WORLD, MenuText.field_ap_1830, 1331760360);
			} else if (i == 3) {
				Class_fl.method_g_void(MenuText.field_af_1831, MenuText.INVALID_LOGIN_DETAILS, MenuText.field_av_1976, 703253238);
			} else if (i == 4) {
				Class_fl.method_g_void(MenuText.ACCOUNT_DISABLED, MenuText.CHECK_MESSAGE_CENTER, MenuText.field_bw_1836, 51830516);
			} else if (i == 5) {
				Class_fl.method_g_void(MenuText.ALREADY_LOGGED_IN, MenuText.RETRY_IN_60, MenuText.field_ba_1839, 1812179641);
			} else if (i == 6) {
				Class_fl.method_g_void(MenuText.field_br_1961, MenuText.field_bd_1886, MenuText.field_bn_1842, 1735616894);
			} else if (i == 7) {
				Class_fl.method_g_void(MenuText.field_bu_1843, MenuText.field_bq_2048, MenuText.field_bp_1951, 902852188);
			} else if (i == 8) {
				Class_fl.method_g_void(MenuText.field_bt_1838, MenuText.field_bz_1847, MenuText.field_by_1848, -1119122036);
			} else if (i == 9) {
				Class_fl.method_g_void(MenuText.LOGIN_LIMIT_EXCEEDED, MenuText.TOO_MANY_CONNECTIONS, MenuText.field_bh_1851, -673073149);
			} else if (i == 10) {
				Class_fl.method_g_void(MenuText.field_bf_1852, MenuText.field_bk_1853, MenuText.field_bi_1854, 715991584);
			} else if (i == 11) {
				Class_fl.method_g_void(MenuText.field_bx_1855, MenuText.field_bc_1914, MenuText.field_be_1857, 846466801);
			} else if (i == 12) {
				Class_fl.method_g_void(MenuText.field_bb_1858, MenuText.field_bl_2014, MenuText.field_cj_1860, -1703255355);
			} else if (i == 13) {
				Class_fl.method_g_void(MenuText.field_cb_1861, MenuText.field_ct_1862, MenuText.field_cz_1792, 853635227);
			} else if (i == 14) {
				Class_fl.method_g_void(MenuText.field_cu_1864, MenuText.field_cq_1865, MenuText.EMPTY__, 1168686878);
			} else if (i == 16) {
				Class_fl.method_g_void(MenuText.field_co_1867, MenuText.field_cn_1868, MenuText.field_cf_1869, -1413422408);
			} else if (i == 17) {
				Class_fl.method_g_void(MenuText.field_ce_1988, MenuText.field_cc_1871, MenuText.field_ca_1872, -1712802952);
			} else if (i == 18) {
				Class_fl.method_g_void(MenuText.field_cv_1873, MenuText.field_ch_1874, MenuText.field_cx_1994, -252504498);
			} else if (i == 19) {
				Class_fl.method_g_void(MenuText.field_cy_1876, MenuText.field_cm_1877, MenuText.field_cd_1878, 523444824);
			} else if (i == 20) {
				Class_fl.method_g_void(MenuText.field_ci_1879, MenuText.field_cp_2006, MenuText.field_cg_1881, 1539058630);
			} else if (i == 22) {
				Class_fl.method_g_void(MenuText.field_cr_1882, MenuText.field_ck_1863, MenuText.field_cl_1884, 1845716749);
			} else if (i == 23) {
				Class_fl.method_g_void(MenuText.field_cs_1885, MenuText.WAIT_1_MINUTE, MenuText.field_dj_2000, -1023694855);
			} else if (i == 24) {
				Class_fl.method_g_void(MenuText.field_dg_1888, MenuText.field_do_1889, MenuText.field_dy_1890, -740460224);
			} else if (i == 25) {
				Class_fl.method_g_void(MenuText.field_di_1828, MenuText.field_dl_1892, MenuText.field_dq_1893, -913003968);
			} else if (i == 26) {
				Class_fl.method_g_void(MenuText.field_dm_1989, MenuText.field_dc_1895, MenuText.field_dn_1896, 338213247);
			} else if (i == 27) {
				Class_fl.method_g_void(MenuText.field_df_1897, MenuText.field_dk_1898, MenuText.field_dr_1829, 2049536904);
			} else if (i == 31) {
				Class_fl.method_g_void(MenuText.field_dh_1906, MenuText.field_du_1942, MenuText.VIA_WEBSITE, -2124351787);
			} else if (i == 32) {
				Class_fl.method_g_void(MenuText.field_dx_1909, MenuText.field_dp_1910, MenuText.field_dv_1844, -596750757);
			} else if (i == 37) {
				Class_fl.method_g_void(MenuText.field_eu_1950, MenuText.field_ek_1925, MenuText.field_eq_1870, -1087881899);
			} else if (i == 38) {
				Class_fl.method_g_void(MenuText.field_en_1937, MenuText.field_em_1916, MenuText.field_ej_1917, -158799880);
			} else if (i == 55) {
				Class_fl.method_g_void(MenuText.field_el_1998, MenuText.field_es_1919, MenuText.PLAY_MAIN_GAME_INSTEAD, -1310917207);
			} else {
				if (i == 56) {
					Class_fl.method_g_void(MenuText.ENTER_CODE, MenuText.AUTH_APP, MenuText.field_eh_1923, 87173722);
					Socket.method_h_void(11, -1126702467);
					return;
				}
				if (i == 57) {
					Class_fl.method_g_void(MenuText.INCORRECT_CODE_ENTERED, MenuText.PLEASE_RETRY, MenuText.field_ea_1926, -587129434);
					Socket.method_h_void(11, -1507697416);
					return;
				}
				Class_fl.method_g_void(MenuText.UNEXPECTED_RESPONSE_SRV, MenuText.PLEASE_TRY_DIFF_WORLD, MenuText.field_ec_1929, -1331583149);
			}
			Socket.method_h_void(10, -1820997532);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "j.s()");
		}
	}

	static final void method_dh_void(final Widget widget, final int i, final int i_20_, final int i_21_, final int i_22_) {
		try {
			final Class_fp class_fp = widget.method_x_fp((byte) -74);
			if (class_fp != null) {
				if ((345141143 * client.field_nk_2925) < 3) {
					AnimationSequence.compass.method_b_void(i, i_20_, class_fp.field_n_2427 * -821941733, class_fp.field_d_2424 * 1159260577, 25, 25, -2037472027 * client.miniMapAngle, 256, class_fp.field_y_2430, class_fp.field_z_2426);
				} else {
					Rasterizer.method_cs_void(i, i_20_, 0, class_fp.field_y_2430, class_fp.field_z_2426);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "j.dh()");
		}
	}

	static void method_aw_void(final int i) {
		do {
			try {
				int i_23_ = -1236640339 * Boundary.clientWidth;
				int i_24_ = Projectile.clientHeight * -1483492575;
				if ((-1364750405 * Class_dw.field_qf_1737) < i_23_) {
					i_23_ = Class_dw.field_qf_1737 * -1364750405;
				}
				if ((526016489 * Renderable.field_qa_763) < i_24_) {
					i_24_ = Renderable.field_qa_763 * 526016489;
				}
				if (Class_w.field_pz_1501 != null) {
					try {
						Class_dz.method_d_Object(client.instance, "resize", new Object[] { Integer.valueOf(Class_dj.method_ac_int((byte) 28)) }, 2135089247);
					} catch (final Throwable throwable) {
						break;
					}
				}
				break;
			} catch (final RuntimeException runtimeexception) {
				throw GameCanvas.error(runtimeexception, "j.aw()");
			}
		} while (false);
	}

	public static String formatDate(final long l) {
		String string;
		try {
			Class_cl.field_z_1085.setTime(new Date(l));
			final int i = Class_cl.field_z_1085.get(7);
			final int i_25_ = Class_cl.field_z_1085.get(5);
			final int i_26_ = Class_cl.field_z_1085.get(2);
			final int i_27_ = Class_cl.field_z_1085.get(1);
			final int i_28_ = Class_cl.field_z_1085.get(11);
			final int i_29_ = Class_cl.field_z_1085.get(12);
			final int i_30_ = Class_cl.field_z_1085.get(13);
			string = new StringBuilder(Class_cl.field_d_1083[i - 1]).append(", ").append(i_25_ / 10).append(i_25_ % 10).append("-").append(Class_cl.field_n_1084[0][i_26_]).append("-").append(i_27_).append(" ").append(i_28_ / 10).append(i_28_ % 10).append(":").append(i_29_ / 10).append(i_29_ % 10).append(":").append(i_30_ / 10).append(i_30_ % 10).append(" GMT").toString();
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "j.n()");
		}
		return string;
	}

	Friend() {
		/* empty */
	}

	public static Sprite method_m_be(final FileStore class_fs, final int i, final byte i_31_) {
		Sprite class_be;
		try {
			final byte[] is = class_fs.method_m_byteArray(i, (short) 238);
			boolean bool;
			if (is == null) {
				bool = false;
			} else {
				Class_fj.method_l_void(is, (byte) 96);
				bool = true;
			}
			if (!bool) {
				return null;
			}
			final Sprite class_be_32_ = new Sprite();
			class_be_32_.spriteWidth = GameCanvas.field_d_2228 * -1808307607;
			class_be_32_.spriteHeight = Class_bk.field_z_584 * -1626806585;
			class_be_32_.field_e_535 = Class_bk.field_y_579[0];
			class_be_32_.field_g_537 = Class_bk.field_e_580[0];
			class_be_32_.field_z_533 = Class_fv.field_g_2506[0];
			class_be_32_.field_y_534 = Class_bk.field_f_581[0];
			class_be_32_.field_d_538 = Class_l.field_m_1134;
			class_be_32_.field_n_531 = Class_bk.field_a_585[0];
			ItemComposite.method_u_void(-1231170034);
			class_be = class_be_32_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "j.m()");
		}
		return class_be;
	}

	public static void method_r_void(final int i) {
		try {
			Widget.field_f_2538.method_y_void();
			Widget.field_m_2539.method_y_void();
			Widget.field_a_2540.method_y_void();
			Widget.field_h_2541.method_y_void();
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "j.r()");
		}
	}

	static Class_ci method_h_ci(final int i, final int i_33_) {
		Class_ci class_ci;
		try {
			final Class_ci class_ci_34_ = (Class_ci) AnimationSequence.field_e_197.method_n_gb(i);
			if (class_ci_34_ != null) {
				return class_ci_34_;
			}
			final FileStore class_fs = AnimationSequence.field_d_195;
			final FileStore class_fs_35_ = Class_dg.field_z_1613;
			boolean bool = true;
			final int[] is = class_fs.method_u_intArray(i, -1998551266);
			for (final int element : is) {
				final byte[] is_37_ = class_fs.getChildData(i, element);
				if (is_37_ == null) {
					bool = false;
				} else {
					final int i_38_ = ((is_37_[0] & 0xff) << 8) | (is_37_[1] & 0xff);
					final byte[] is_39_ = class_fs_35_.getChildData(i_38_, 0);
					if (is_39_ == null) {
						bool = false;
					}
				}
			}
			Class_ci class_ci_40_;
			if (!bool) {
				class_ci_40_ = null;
			} else {
				try {
					class_ci_40_ = new Class_ci(class_fs, class_fs_35_, i, false);
				} catch (final Exception exception) {
					class_ci_40_ = null;
				}
			}
			if (class_ci_40_ != null) {
				AnimationSequence.field_e_197.method_z_void(class_ci_40_, i);
			}
			class_ci = class_ci_40_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "j.h()");
		}
		return class_ci;
	}

	public static Identifiable identify(final Identifiable[] interface_cses, final int id) {
		try {
			final Identifiable[] interface_cses_42_ = interface_cses;
			for (final Identifiable interface_cs : interface_cses_42_) {
				if (id == interface_cs.getId()) {
					return interface_cs;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "j.n()");
		}
		return null;
	}

	static final void method_bz_void(final Class_r class_r, final int i) {
		try {
			int i_44_ = 0;
			int i_45_ = -1;
			int i_46_ = 0;
			int i_47_ = 0;
			if ((class_r.field_d_1325 * 1901552375) == 0) {
				i_44_ = (Class_ae.sceneGraph.method_ad_int(-227080595 * class_r.plane, class_r.field_y_1326 * -201892019, class_r.field_e_1327 * -2129494015));
			}
			if ((class_r.field_d_1325 * 1901552375) == 1) {
				i_44_ = (Class_ae.sceneGraph.method_ak_int(class_r.plane * -227080595, class_r.field_y_1326 * -201892019, -2129494015 * class_r.field_e_1327));
			}
			if ((class_r.field_d_1325 * 1901552375) == 2) {
				i_44_ = (Class_ae.sceneGraph.method_ae_int(class_r.plane * -227080595, -201892019 * class_r.field_y_1326, -2129494015 * class_r.field_e_1327));
			}
			if ((class_r.field_d_1325 * 1901552375) == 3) {
				i_44_ = (Class_ae.sceneGraph.method_ax_int(-227080595 * class_r.plane, class_r.field_y_1326 * -201892019, -2129494015 * class_r.field_e_1327));
			}
			if (i_44_ != 0) {
				final int i_48_ = (Class_ae.sceneGraph.method_al_int(class_r.plane * -227080595, -201892019 * class_r.field_y_1326, class_r.field_e_1327 * -2129494015, i_44_));
				i_45_ = (i_44_ >> 14) & 0x7fff;
				i_46_ = i_48_ & 0x1f;
				i_47_ = (i_48_ >> 6) & 0x3;
			}
			class_r.field_z_1328 = -579764643 * i_45_;
			class_r.field_f_1332 = 1060659807 * i_46_;
			class_r.field_g_1329 = i_47_ * 152815941;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "j.bz()");
		}
	}

	static final void method_dy_void(final Widget[] widgets, final int i, final int i_49_, final int i_50_, final int i_51_, final int i_52_, final int i_53_, final int i_54_, final int i_55_) {
		try {
			int i_56_ = 0;
			for (/**/; i_56_ < widgets.length; i_56_++) {
				final Widget widget = widgets[i_56_];
				if ((widget != null) && (!widget.interactive || ((876728889 * widget.type) == 0) || widget.scripted || (Class_db.method_en_int(widget, -1728683668) != 0) || (client.field_jj_2861 == widget) || ((-1489583413 * widget.contentType) == 1338)) && ((widget.parentId * -1405313417) == i) && (!widget.interactive || !FileStore.method_em_boolean(widget, -73545794))) {
					final int i_57_ = i_53_ + (-948813497 * widget.onScreenX);
					final int i_58_ = i_54_ + (widget.onScreenY * -1698637507);
					int i_59_;
					int i_60_;
					int i_61_;
					int i_62_;
					if ((widget.type * 876728889) == 2) {
						i_59_ = i_49_;
						i_60_ = i_50_;
						i_61_ = i_51_;
						i_62_ = i_52_;
					} else if ((widget.type * 876728889) == 9) {
						int i_63_ = i_57_;
						int i_64_ = i_58_;
						int i_65_ = (1367496319 * widget.onScreenWidth) + i_57_;
						int i_66_ = (-1643237919 * widget.onScreenHeight) + i_58_;
						if (i_65_ < i_57_) {
							i_63_ = i_65_;
							i_65_ = i_57_;
						}
						if (i_66_ < i_58_) {
							i_64_ = i_66_;
							i_66_ = i_58_;
						}
						i_65_++;
						i_66_++;
						i_59_ = i_63_ > i_49_ ? i_63_ : i_49_;
						i_60_ = i_64_ > i_50_ ? i_64_ : i_50_;
						i_61_ = i_65_ < i_51_ ? i_65_ : i_51_;
						i_62_ = i_66_ < i_52_ ? i_66_ : i_52_;
					} else {
						final int i_67_ = (1367496319 * widget.onScreenWidth) + i_57_;
						final int i_68_ = i_58_ + (widget.onScreenHeight * -1643237919);
						i_59_ = i_57_ > i_49_ ? i_57_ : i_49_;
						i_60_ = i_58_ > i_50_ ? i_58_ : i_50_;
						i_61_ = i_67_ < i_51_ ? i_67_ : i_51_;
						i_62_ = i_68_ < i_52_ ? i_68_ : i_52_;
					}
					if (widget == client.field_jt_2801) {
						client.field_jc_2868 = true;
						client.field_jf_2834 = -1435729929 * i_57_;
						client.field_jl_2734 = i_58_ * -1676196239;
					}
					if (!widget.interactive || ((i_59_ < i_61_) && (i_60_ < i_62_))) {
						int i_69_ = MouseInputListener.field_m_2156 * 1515107729;
						int i_70_ = MouseInputListener.field_a_2157 * -2089478689;
						if ((1159182273 * MouseInputListener.field_q_2162) != 0) {
							i_69_ = 2117517719 * MouseInputListener.field_k_2164;
							i_70_ = MouseInputListener.field_x_2158 * 1750309931;
						}
						if ((-1489583413 * widget.contentType) == 1337) {
							if (!client.field_c_2747 && !client.isMenuOpen && (i_69_ >= i_59_) && (i_70_ >= i_60_) && (i_69_ < i_61_) && (i_70_ < i_62_)) {
								if (((client.selectedOptionType * -1595363093) == 0) && !client.isOptionSelected) {
									Class_dr.method_ce_void((MenuText.field_fl_1938), "", 23, 0, i_69_ - i_59_, i_70_ - i_60_, 553431549);
								}
								int i_71_ = -1;
								int i_72_ = -1;
								for (int i_73_ = 0; i_73_ < Model.field_br_922; i_73_++) {
									final int i_74_ = Model.field_bd_912[i_73_];
									final int i_75_ = i_74_ & 0x7f;
									final int i_76_ = (i_74_ >> 7) & 0x7f;
									final int i_77_ = (i_74_ >> 29) & 0x3;
									final int i_78_ = (i_74_ >> 14) & 0x7fff;
									if (i_72_ != i_74_) {
										i_72_ = i_74_;
										if ((i_77_ == 2) && ((Class_ae.sceneGraph.method_al_int(Class_ed.plane * 250114511, i_75_, i_76_, i_74_)) >= 0)) {
											ObjectComposite objectdef = (Class_cj.getObjectComposite(i_78_));
											if (objectdef.childrenIds != null) {
												objectdef = (objectdef.method_u_at((byte) 1));
											}
											if (objectdef == null) {
												continue;
											}
											if ((client.selectedOptionType * -1595363093) == 1) {
												Class_dr.method_ce_void(MenuText.USE, new StringBuilder(client.field_it_2841).append(" ").append(Class_d.field_g_858).append(" ").append(Class_r.colorString(65535)).append(objectdef.name).toString(), 1, i_74_, i_75_, i_76_, 245715861);
											} else if (client.isOptionSelected) {
												if (((475607145 * GameCanvas.field_ib_2231) & 0x4) == 4) {
													Class_dr.method_ce_void(client.field_in_2845, new StringBuilder(client.selectedOption).append(" ").append(Class_d.field_g_858).append(" ").append(Class_r.colorString(65535)).append(objectdef.name).toString(), 2, i_74_, i_75_, i_76_, -1809602418);
												}
											} else {
												String[] strings = objectdef.actions;
												if (client.field_ja_2858) { 
													strings = (Class_ei.method_dr_StringArray(strings, (byte) -29));
												}
												if (strings != null) {
													for (int i_79_ = 4; i_79_ >= 0; i_79_--) {
														if (strings[i_79_] != null) {
															int i_80_ = 0;
															if (i_79_ == 0) {
																i_80_ = 3;
															}
															if (i_79_ == 1) {
																i_80_ = 4;
															}
															if (i_79_ == 2) {
																i_80_ = 5;
															}
															if (i_79_ == 3) {
																i_80_ = 6;
															}
															if (i_79_ == 4) {
																i_80_ = 1001;
															}
															Class_dr.method_ce_void((strings[i_79_]), new StringBuilder(Class_r.colorString(65535)).append(objectdef.name).toString(), i_80_, i_74_, i_75_, i_76_, -1940478971);
														}
													}
												}
												Class_dr.method_ce_void(MenuText.field_ei_1934, new StringBuilder(Class_r.colorString(65535)).append(objectdef.name).toString(), 1002, ((267197795 * objectdef.id) << 14), i_75_, i_76_, -1453999986);
											}
										}
										if (i_77_ == 1) {
											final Npc npc = client.npcs[i_78_];
											if (npc == null) {
												continue;
											}
											if (((1087045297 * (npc.composite.occupiedTiles)) == 1) && (((-2103184911 * npc.worldPosX) & 0x7f) == 64) && (((npc.worldPosY * 2088773389) & 0x7f) == 64)) {
												for (int i_81_ = 0; (i_81_ < (client.localNpcCount * 1308149425)); i_81_++) {
													final Npc npc_82_ = (client.npcs[(client.npcIndexArray[i_81_])]);
													if ((npc_82_ != null) && (npc_82_ != npc) && ((1087045297 * (npc_82_.composite.occupiedTiles)) == 1) && (((npc.worldPosX) * -2103184911) == ((npc_82_.worldPosX) * -2103184911)) && (((npc.worldPosY) * 2088773389) == (2088773389 * (npc_82_.worldPosY)))) {
														MenuText.method_cv_void((npc_82_.composite), (client.npcIndexArray[i_81_]), i_75_, i_76_, 304429066);
													}
												}
												for (int i_83_ = 0; (i_83_ < (2000365659 * (client.localPlayerCount))); i_83_++) {
													final Player player = (client.localPlayers[(client.playerIndexArray[i_83_])]);
													if ((player != null) && ((-2103184911 * (player.worldPosX)) == ((npc.worldPosX) * -2103184911)) && (((player.worldPosY) * 2088773389) == ((npc.worldPosY) * 2088773389))) {
														GameCanvas.method_ch_void(player, (client.playerIndexArray[i_83_]), i_75_, i_76_, (byte) 125);
													}
												}
											}
											MenuText.method_cv_void(npc.composite, i_78_, i_75_, i_76_, 304429066);
										}
										if (i_77_ == 0) {
											final Player player = client.localPlayers[i_78_];
											if (player == null) {
												continue;
											}
											if ((((player.worldPosX * -2103184911) & 0x7f) == 64) && ((((player.worldPosY) * 2088773389) & 0x7f) == 64)) {
												for (int i_84_ = 0; (i_84_ < (1308149425 * (client.localNpcCount))); i_84_++) {
													final Npc npc = (client.npcs[(client.npcIndexArray[i_84_])]);
													if ((npc != null) && (((npc.composite.occupiedTiles) * 1087045297) == 1) && ((-2103184911 * (player.worldPosX)) == (-2103184911 * (npc.worldPosX))) && (((npc.worldPosY) * 2088773389) == ((player.worldPosY) * 2088773389))) {
														MenuText.method_cv_void((npc.composite), (client.npcIndexArray[i_84_]), i_75_, i_76_, 304429066);
													}
												}
												for (int i_85_ = 0; (i_85_ < (client.localPlayerCount * 2000365659)); i_85_++) {
													final Player player_86_ = (client.localPlayers[(client.playerIndexArray[i_85_])]);
													if ((player_86_ != null) && (player_86_ != player) && (((player.worldPosX) * -2103184911) == ((player_86_.worldPosX) * -2103184911)) && ((2088773389 * (player.worldPosY)) == ((player_86_.worldPosY) * 2088773389))) {
														GameCanvas.method_ch_void(player_86_, (client.playerIndexArray[i_85_]), i_75_, i_76_, (byte) 118);
													}
												}
											}
											if (i_78_ != (-519351145 * client.field_hm_2819)) {
												GameCanvas.method_ch_void(player, i_78_, i_75_, i_76_, (byte) 125);
											} else {
												i_71_ = i_74_;
											}
										}
										if (i_77_ == 3) {
											final NodeDeque deque = (client.groundItemsDeque[250114511 * Class_ed.plane][i_75_][i_76_]);
											if (deque != null) {
												for (Item grounditem = ((Item) (deque.method_m_ga())); grounditem != null; grounditem = ((Item) (deque.method_h_ga()))) {
													final ItemComposite itemdef = (ItemDefinitions.getItemComposite((grounditem.id * 1499483327)));
													if ((-1595363093 * (client.selectedOptionType)) == 1) {
														Class_dr.method_ce_void((MenuText.USE), new StringBuilder(client.field_it_2841).append(" ").append(Class_d.field_g_858).append(" ").append(Class_r.colorString(16748608)).append(itemdef.name).toString(), 16, (grounditem.id * 1499483327), i_75_, i_76_, 60655686);
													} else if (client.isOptionSelected) {
														if (((475607145 * (GameCanvas.field_ib_2231)) & 0x1) == 1) {
															Class_dr.method_ce_void((client.field_in_2845), new StringBuilder(client.selectedOption).append(" ").append(Class_d.field_g_858).append(" ").append(Class_r.colorString(16748608)).append(itemdef.name).toString(), 17, ((grounditem.id) * 1499483327), i_75_, i_76_, -1888195253);
														}
													} else {
														String[] strings = (itemdef.groundOptions);
														if (client.field_ja_2858) {
															strings = (Class_ei.method_dr_StringArray(strings, (byte) -24));
														}
														for (int i_87_ = 4; i_87_ >= 0; i_87_--) {
															if ((strings != null) && ((strings[i_87_]) != null)) {
																int i_88_ = 0;
																if (i_87_ == 0) {
																	i_88_ = 18;
																}
																if (i_87_ == 1) {
																	i_88_ = 19;
																}
																if (i_87_ == 2) {
																	i_88_ = 20;
																}
																if (i_87_ == 3) {
																	i_88_ = 21;
																}
																if (i_87_ == 4) {
																	i_88_ = 22;
																}
																Class_dr.method_ce_void((strings[i_87_]), new StringBuilder(Class_r.colorString(16748608)).append(itemdef.name).toString(), i_88_, (1499483327 * (grounditem.id)), i_75_, i_76_, -383036975);
															} else if (i_87_ == 2) {
																Class_dr.method_ce_void((MenuText.TAKE), new StringBuilder(Class_r.colorString(16748608)).append(itemdef.name).toString(), 20, ((grounditem.id) * 1499483327), i_75_, i_76_, 1146549214);
															}
														}
														Class_dr.method_ce_void((MenuText.field_ei_1934), new StringBuilder(Class_r.colorString(16748608)).append(itemdef.name).toString(), 1004, (1499483327 * (grounditem.id)), i_75_, i_76_, 1520590317);
													}
												}
											}
										}
									}
								}
								if (i_71_ != -1) {
									final int i_89_ = i_71_ & 0x7f;
									final int i_90_ = (i_71_ >> 7) & 0x7f;
									final Player player = client.localPlayers[(client.field_hm_2819 * -519351145)];
									GameCanvas.method_ch_void(player, -519351145 * client.field_hm_2819, i_89_, i_90_, (byte) 120);
								}
							}
						} else if ((-1489583413 * widget.contentType) == 1338) {
							Class_df.method_t_void(widget, i_57_, i_58_, (short) -3933);
						} else {
							if (!client.isMenuOpen && (i_69_ >= i_59_) && (i_70_ >= i_60_) && (i_69_ < i_61_) && (i_70_ < i_62_)) {
								Class_dd.method_dg_void(widget, i_69_ - i_57_, i_70_ - i_58_, (byte) -15);
							}
							if ((widget.type * 876728889) == 0) {
								if (!widget.interactive && FileStore.method_em_boolean(widget, 170326786) && (widget != (Menu.field_im_1543))) {
									continue;
								}
								method_dy_void(widgets, -560181405 * widget.uid, i_59_, i_60_, i_61_, i_62_, i_57_ - (widget.field_ab_2565 * 440856551), (i_58_ - (-854204745 * widget.verticalScrollPos)), -923060196);
								if (widget.components != null) {
									method_dy_void(widget.components, widget.uid * -560181405, i_59_, i_60_, i_61_, i_62_, (i_57_ - (440856551 * widget.field_ab_2565)), i_58_ - (-854204745 * widget.verticalScrollPos), 220972221);
								}
								final Menu interfacepositionnode = ((Menu) (client.menuTable.method_n_ga(-560181405 * widget.uid)));
								if (interfacepositionnode != null) {
									if (((interfacepositionnode.field_d_1534 * 1041023801) == 0) && ((MouseInputListener.field_m_2156 * 1515107729) >= i_59_) && ((-2089478689 * MouseInputListener.field_a_2157) >= i_60_) && ((1515107729 * MouseInputListener.field_m_2156) < i_61_) && ((-2089478689 * MouseInputListener.field_a_2157) < i_62_) && !client.isMenuOpen && !client.field_jk_2857) {
										client.menuActions[0] = MenuText.CANCEL;
										client.menuOptions[0] = "";
										client.field_ik_2832[0] = 1006;
										client.currentMenuSize = -1850638419;
									}
									Class_cc.method_do_void(44103667 * (interfacepositionnode.interfaceId), i_59_, i_60_, i_61_, i_62_, i_57_, i_58_, 861531704);
								}
							}
							if (widget.interactive) {
								if (widget.field_ex_2620 && ((1515107729 * MouseInputListener.field_m_2156) >= i_59_) && ((-2089478689 * MouseInputListener.field_a_2157) >= i_60_) && ((MouseInputListener.field_m_2156 * 1515107729) < i_61_) && ((MouseInputListener.field_a_2157 * -2089478689) < i_62_)) {
									for (Script class_n = (Script) client.field_kp_2888.method_f_ga(); class_n != null; class_n = (Script) client.field_kp_2888.method_a_ga()) {
										if (class_n.field_d_1209) {
											class_n.removeLink();
											class_n.parent.field_ej_2553 = false;
										}
									}
									if ((-472669521 * SceneObject.field_kn_935) == 0) {
										client.field_jt_2801 = null;
										client.field_jj_2861 = null;
									}
									if (!client.isMenuOpen) {
										client.menuActions[0] = MenuText.CANCEL;
										client.menuOptions[0] = "";
										client.field_ik_2832[0] = 1006;
										client.currentMenuSize = -1850638419;
									}
								}
								boolean bool;
								if (((MouseInputListener.field_m_2156 * 1515107729) >= i_59_) && ((-2089478689 * MouseInputListener.field_a_2157) >= i_60_) && ((1515107729 * MouseInputListener.field_m_2156) < i_61_) && ((MouseInputListener.field_a_2157 * -2089478689) < i_62_)) {
									bool = true;
								} else {
									bool = false;
								}
								boolean bool_91_ = false;
								if ((((MouseInputListener.field_f_2155 * 2143958423) == 1) || (!Class_al.field_aw_178 && ((MouseInputListener.field_f_2155 * 2143958423) == 4))) && bool) {
									bool_91_ = true;
								}
								boolean bool_92_ = false;
								if ((((MouseInputListener.field_q_2162 * 1159182273) == 1) || (!Class_al.field_aw_178 && ((MouseInputListener.field_q_2162 * 1159182273) == 4))) && ((MouseInputListener.field_k_2164 * 2117517719) >= i_59_) && ((1750309931 * MouseInputListener.field_x_2158) >= i_60_) && ((2117517719 * MouseInputListener.field_k_2164) < i_61_) && ((MouseInputListener.field_x_2158 * 1750309931) < i_62_)) {
									bool_92_ = true;
								}
								if (bool_92_) {
									Class_fl.method_dl_void(widget, ((2117517719 * MouseInputListener.field_k_2164) - i_57_), ((MouseInputListener.field_x_2158 * 1750309931) - i_58_), 2050877876);
								}
								if ((client.field_jt_2801 != null) && (widget != client.field_jt_2801) && bool && (Class_cw.method_y_boolean(Class_db.method_en_int(widget, -1502171423), (byte) 27))) {
									client.field_jp_2827 = widget;
								}
								if (client.field_jj_2861 == widget) {
									client.field_ji_2766 = true;
									client.field_jv_2938 = -579103817 * i_57_;
									client.field_jw_2886 = i_58_ * 1197558819;
								}
								if (widget.scripted) {
									if (bool && ((client.field_kg_2887 * -1665577433) != 0) && (widget.field_dq_2613 != null)) {
										final Script class_n = new Script();
										class_n.field_d_1209 = true;
										class_n.parent = widget;
										class_n.field_e_1196 = client.field_kg_2887 * 561727953;
										class_n.parameters = widget.field_dq_2613;
										client.field_kp_2888.add(class_n);
									}
									if ((client.field_jt_2801 != null) || (Class_a.field_gz_794 != null) || client.isMenuOpen) {
										bool_92_ = false;
										bool_91_ = false;
										bool = false;
									}
									if (!widget.field_el_2597 && bool_92_) {
										widget.field_el_2597 = true;
										if (widget.field_ch_2624 != null) {
											final Script class_n = new Script();
											class_n.field_d_1209 = true;
											class_n.parent = widget;
											class_n.field_y_1198 = (-996127361 * ((MouseInputListener.field_k_2164 * 2117517719) - i_57_));
											class_n.field_e_1196 = (-1439458489 * ((MouseInputListener.field_x_2158 * 1750309931) - i_58_));
											class_n.parameters = widget.field_ch_2624;
											client.field_kp_2888.add(class_n);
										}
									}
									if (widget.field_el_2597 && bool_91_ && (widget.field_cx_2625 != null)) {
										final Script class_n = new Script();
										class_n.field_d_1209 = true;
										class_n.parent = widget;
										class_n.field_y_1198 = ((MouseInputListener.field_m_2156 * 1515107729) - i_57_) * -996127361;
										class_n.field_e_1196 = ((MouseInputListener.field_a_2157 * -2089478689) - i_58_) * -1439458489;
										class_n.parameters = widget.field_cx_2625;
										client.field_kp_2888.add(class_n);
									}
									if (widget.field_el_2597 && !bool_91_) {
										widget.field_el_2597 = false;
										if (widget.field_cy_2592 != null) {
											final Script class_n = new Script();
											class_n.field_d_1209 = true;
											class_n.parent = widget;
											class_n.field_y_1198 = ((MouseInputListener.field_m_2156 * 1515107729) - i_57_) * -996127361;
											class_n.field_e_1196 = (-1439458489 * ((-2089478689 * MouseInputListener.field_a_2157) - i_58_));
											class_n.parameters = widget.field_cy_2592;
											client.field_kr_2807.add(class_n);
										}
									}
									if (bool_91_ && (widget.field_cm_2627 != null)) {
										final Script class_n = new Script();
										class_n.field_d_1209 = true;
										class_n.parent = widget;
										class_n.field_y_1198 = ((MouseInputListener.field_m_2156 * 1515107729) - i_57_) * -996127361;
										class_n.field_e_1196 = (-1439458489 * ((MouseInputListener.field_a_2157 * -2089478689) - i_58_));
										class_n.parameters = widget.field_cm_2627;
										client.field_kp_2888.add(class_n);
									}
									if (!widget.field_ej_2553 && bool) {
										widget.field_ej_2553 = true;
										if (widget.field_cd_2674 != null) {
											final Script class_n = new Script();
											class_n.field_d_1209 = true;
											class_n.parent = widget;
											class_n.field_y_1198 = (-996127361 * ((MouseInputListener.field_m_2156 * 1515107729) - i_57_));
											class_n.field_e_1196 = ((-2089478689 * MouseInputListener.field_a_2157) - i_58_) * -1439458489;
											class_n.parameters = widget.field_cd_2674;
											client.field_kp_2888.add(class_n);
										}
									}
									if (widget.field_ej_2553 && bool && (widget.field_ci_2629 != null)) {
										final Script class_n = new Script();
										class_n.field_d_1209 = true;
										class_n.parent = widget;
										class_n.field_y_1198 = (-996127361 * ((1515107729 * MouseInputListener.field_m_2156) - i_57_));
										class_n.field_e_1196 = ((-2089478689 * MouseInputListener.field_a_2157) - i_58_) * -1439458489;
										class_n.parameters = widget.field_ci_2629;
										client.field_kp_2888.add(class_n);
									}
									if (widget.field_ej_2553 && !bool) {
										widget.field_ej_2553 = false;
										if (widget.field_cp_2630 != null) {
											final Script class_n = new Script();
											class_n.field_d_1209 = true;
											class_n.parent = widget;
											class_n.field_y_1198 = ((MouseInputListener.field_m_2156 * 1515107729) - i_57_) * -996127361;
											class_n.field_e_1196 = (-1439458489 * ((-2089478689 * MouseInputListener.field_a_2157) - i_58_));
											class_n.parameters = widget.field_cp_2630;
											client.field_kr_2807.add(class_n);
										}
									}
									if (widget.field_di_2535 != null) {
										final Script class_n = new Script();
										class_n.parent = widget;
										class_n.parameters = widget.field_di_2535;
										client.field_kf_2889.add(class_n);
									}
									if ((widget.field_cs_2635 != null) && ((-502239849 * client.field_kb_2759) > (1751469217 * widget.field_ee_2636))) {
										if ((widget.field_dt_2628 != null) && (((client.field_kb_2759 * -502239849) - (widget.field_ee_2636 * 1751469217)) <= 32)) {
											while_8_: for (int i_93_ = (1751469217 * (widget.field_ee_2636)); i_93_ < (client.field_kb_2759 * -502239849); i_93_++) {
												final int i_94_ = (client.field_ko_2708[i_93_ & 0x1f]);
												for (int i_95_ = 0; (i_95_ < (widget.field_dt_2628).length); i_95_++) {
													if (i_94_ == (widget.field_dt_2628[i_95_])) {
														final Script class_n = new Script();
														class_n.parent = widget;
														class_n.parameters = (widget.field_cs_2635);
														client.field_kp_2888.add(class_n);
														break while_8_;
													}
												}
											}
										} else {
											final Script class_n = new Script();
											class_n.parent = widget;
											class_n.parameters = widget.field_cs_2635;
											client.field_kp_2888.add(class_n);
										}
										widget.field_ee_2636 = (client.field_kb_2759 * -1814390985);
									}
									if ((widget.field_dj_2593 != null) && ((582198883 * client.field_kh_2864) > (widget.field_er_2675 * 566160057))) {
										if ((widget.field_dg_2608 != null) && (((client.field_kh_2864 * 582198883) - (widget.field_er_2675 * 566160057)) <= 32)) {
											while_9_: for (int i_96_ = (widget.field_er_2675 * 566160057); i_96_ < (client.field_kh_2864 * 582198883); i_96_++) {
												final int i_97_ = (client.field_km_2875[i_96_ & 0x1f]);
												for (int i_98_ = 0; (i_98_ < (widget.field_dg_2608).length); i_98_++) {
													if (i_97_ == (widget.field_dg_2608[i_98_])) {
														final Script class_n = new Script();
														class_n.parent = widget;
														class_n.parameters = (widget.field_dj_2593);
														client.field_kp_2888.add(class_n);
														break while_9_;
													}
												}
											}
										} else {
											final Script class_n = new Script();
											class_n.parent = widget;
											class_n.parameters = widget.field_dj_2593;
											client.field_kp_2888.add(class_n);
										}
										widget.field_er_2675 = (client.field_kh_2864 * 1322392571);
									}
									if ((widget.field_do_2639 != null) && ((-1888899297 * client.field_kq_2943) > (widget.field_ed_2562 * -1717496479))) {
										if ((widget.field_dy_2640 != null) && (((-1888899297 * client.field_kq_2943) - (widget.field_ed_2562 * -1717496479)) <= 32)) {
											while_10_: for (int i_99_ = (-1717496479 * (widget.field_ed_2562)); i_99_ < (client.field_kq_2943 * -1888899297); i_99_++) {
												final int i_100_ = (client.field_kt_2865[i_99_ & 0x1f]); 
												for (int i_101_ = 0; (i_101_ < (widget.field_dy_2640).length); i_101_++) {
													if ((widget.field_dy_2640[i_101_]) == i_100_) {
														final Script class_n = new Script();
														class_n.parent = widget;
														class_n.parameters = (widget.field_do_2639);
														client.field_kp_2888.add(class_n);
														break while_10_;
													}
												}
											}
										} else {
											final Script class_n = new Script();
											class_n.parent = widget;
											class_n.parameters = widget.field_do_2639;
											client.field_kp_2888.add(class_n);
										}
										widget.field_ed_2562 = (client.field_kq_2943 * 1185191039);
									}
									if (((client.field_kc_2879 * 1472168179) > (widget.field_es_2614 * -1713950439)) && (widget.field_dm_2644 != null)) {
										final Script class_n = new Script();
										class_n.parent = widget;
										class_n.parameters = widget.field_dm_2644;
										client.field_kp_2888.add(class_n);
									}
									if (((client.field_ka_2880 * -2046581281) > (-1713950439 * widget.field_es_2614)) && (widget.field_dn_2646 != null)) {
										final Script class_n = new Script();
										class_n.parent = widget;
										class_n.parameters = widget.field_dn_2646;
										client.field_kp_2888.add(class_n);
									}
									if (((-1321428723 * client.field_ku_2881) > (-1713950439 * widget.field_es_2614)) && (widget.field_df_2570 != null)) {
										final Script class_n = new Script();
										class_n.parent = widget;
										class_n.parameters = widget.field_df_2570;
										client.field_kp_2888.add(class_n);
									}
									if (((894922381 * client.field_kv_2882) > (widget.field_es_2614 * -1713950439)) && (widget.field_dd_2667 != null)) {
										final Script class_n = new Script();
										class_n.parent = widget;
										class_n.parameters = widget.field_dd_2667;
										client.field_kp_2888.add(class_n);
									}
									if (((-140296413 * client.field_ki_2780) > (-1713950439 * widget.field_es_2614)) && (widget.field_db_2653 != null)) {
										final Script class_n = new Script();
										class_n.parent = widget;
										class_n.parameters = widget.field_db_2653;
										client.field_kp_2888.add(class_n);
									}
									if (((client.field_kw_2884 * -95771747) > (-1713950439 * widget.field_es_2614)) && (widget.field_dk_2648 != null)) {
										final Script class_n = new Script();
										class_n.parent = widget;
										class_n.parameters = widget.field_dk_2648;
										client.field_kp_2888.add(class_n);
									}
									widget.field_es_2614 = -542043479 * client.field_kj_2850;
									if (widget.field_dc_2594 != null) {
										for (int i_102_ = 0; i_102_ < (client.field_mg_2912 * -853560137); i_102_++) {
											final Script class_n = new Script();
											class_n.parent = widget;
											class_n.keyCode = -1709071999 * (client.field_mc_2914[i_102_]);
											class_n.keyChar = 1001964117 * (client.field_ma_2913[i_102_]);
											class_n.parameters = widget.field_dc_2594;
											client.field_kp_2888.add(class_n);
										}
									}
								}
							}
							if (!widget.interactive && (client.field_jt_2801 == null) && (Class_a.field_gz_794 == null) && !client.isMenuOpen) {
								if ((((widget.field_du_2657 * -952385549) >= 0) || ((widget.field_an_2571 * -1189059593) != 0)) && ((1515107729 * MouseInputListener.field_m_2156) >= i_59_) && ((-2089478689 * MouseInputListener.field_a_2157) >= i_60_) && ((MouseInputListener.field_m_2156 * 1515107729) < i_61_) && ((-2089478689 * MouseInputListener.field_a_2157) < i_62_)) {
									if ((widget.field_du_2657 * -952385549) >= 0) {
										Menu.field_im_1543 = (widgets[(-952385549 * widget.field_du_2657)]);
									} else {
										Menu.field_im_1543 = widget;
									}
								}
								if (((876728889 * widget.type) == 8) && ((1515107729 * MouseInputListener.field_m_2156) >= i_59_) && ((-2089478689 * MouseInputListener.field_a_2157) >= i_60_) && ((1515107729 * MouseInputListener.field_m_2156) < i_61_) && ((-2089478689 * MouseInputListener.field_a_2157) < i_62_)) {
									GameObject.field_ir_1414 = widget;
								}
								if ((2133987947 * widget.field_az_2568) > (widget.onScreenHeight * -1643237919)) {
									VarpBit.method_cs_void(widget, (i_57_ + (widget.onScreenWidth * 1367496319)), i_58_, widget.onScreenHeight * -1643237919, 2133987947 * widget.field_az_2568, 1515107729 * MouseInputListener.field_m_2156, -2089478689 * MouseInputListener.field_a_2157, (byte) -127);
								}
							}
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "j.dy()");
		}
	}
}
