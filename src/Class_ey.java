/* Class_ey - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_ey {
	public static final int field_n_2259 = 25;
	public static final boolean[] field_d_2260 = { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };
	public static int[] field_z_2261 = new int[99];
	static Sprite field_bo_2262;
	static Rasterizer2D[] mapmarker;
	public static final int field_u_2264 = 64;
	public static final int field_au_2265 = 7;

	static {
		int i = 0;
		for (int i_0_ = 0; i_0_ < 99; i_0_++) {
			final int i_1_ = 1 + i_0_;
			final int i_2_ = (int) (i_1_ + (300.0 * Math.pow(2.0, i_1_ / 7.0)));
			i += i_2_;
			field_z_2261[i_0_] = i / 4;
		}
	}

	public static void method_n_void(final FileStore class_fs, final FileStore class_fs_3_, final int i) {
		try {
			IdentityKit.field_n_104 = class_fs;
			IdentityKit.field_d_86 = class_fs_3_;
			IdentityKit.field_z_87 = (IdentityKit.field_n_104.method_q_int(3, -1936714414) * 1656681679);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ey.n()");
		}
	}

	static final void method_cq_void(final int i, final int i_4_, int i_5_, final int i_6_, final String string, final String string_7_, final int i_8_, final int i_9_, final int i_10_) {
		try {
			if (i_5_ >= 2000) {
				i_5_ -= 2000;
			}
			if (i_5_ == 31) {
				client.encryptedBuffer.writeOpcode(176);
				client.encryptedBuffer.putInt(i_4_);
				client.encryptedBuffer.putShort(i_6_);
				client.encryptedBuffer.putInt1((-969794605 * Class_ed.field_ix_2071), 816188595);
				client.encryptedBuffer.putLEShortA((-1792623669 * ImageColorModel.field_iu_542), -1818428366);
				client.encryptedBuffer.putShortA(Npc.field_iz_299 * -692921713, (byte) -33);
				client.encryptedBuffer.putShortA(i, (byte) -62);
				client.field_gq_2796 = 0;
				Class_cr.field_gw_1242 = Class_en.getWidgetByUID(i_4_, (short) 9943);
				client.field_gn_2797 = 1469016909 * i;
			}
			if (i_5_ == 17) {
				client.field_go_2792 = -1692845097 * i_8_;
				client.field_gj_2793 = 1577151013 * i_9_;
				client.field_gv_2795 = -1030191458;
				client.field_gi_2856 = 0;
				client.field_mk_2923 = -652317981 * i;
				client.field_mn_2924 = i_4_ * -1028068353;
				client.encryptedBuffer.writeOpcode(74);
				client.encryptedBuffer.putByteC((KeyFocusListener.field_cn_1676[82] ? 1 : 0));
				client.encryptedBuffer.putInt((-1782496813 * Class_cc.field_iw_779));
				client.encryptedBuffer.putLEShort((client.field_if_2843 * -1524676247), (byte) 2);
				client.encryptedBuffer.putLEShort(((1693061403 * Class_q.originX) + i), (byte) 2);
				client.encryptedBuffer.putShort(((-1593604783 * Class_gf.originY) + i_4_));
				client.encryptedBuffer.putShortA(i_6_, (byte) -54);
			}
			if (i_5_ == 28) {
				client.encryptedBuffer.writeOpcode(78);
				client.encryptedBuffer.putInt(i_4_);
				final Widget widget = Class_en.getWidgetByUID(i_4_, (short) 18193);
				if ((widget.opcodes != null) && (widget.opcodes[0][0] == 5)) {
					final int i_11_ = widget.opcodes[0][1];
					Class_fv.configs[i_11_] = 1 - Class_fv.configs[i_11_];
					Class_cw.handleConfig(i_11_);
				}
			}
			if (i_5_ == 8) {
				final Npc npc = client.npcs[i_6_];
				if (npc != null) {
					client.field_go_2792 = i_8_ * -1692845097;
					client.field_gj_2793 = i_9_ * 1577151013;
					client.field_gv_2795 = -1030191458;
					client.field_gi_2856 = 0;
					client.field_mk_2923 = i * -652317981;
					client.field_mn_2924 = -1028068353 * i_4_;
					client.encryptedBuffer.writeOpcode(121);
					client.encryptedBuffer.putByteA((KeyFocusListener.field_cn_1676[82]) ? 1 : 0);
					client.encryptedBuffer.putLEInt((-1782496813 * (Class_cc.field_iw_779)), (byte) -106);
					client.encryptedBuffer.putLEShort(i_6_, (byte) 2);
					client.encryptedBuffer.putShort((-1524676247 * (client.field_if_2843)));
				}
			}
			if (i_5_ == 51) {
				final Player player = client.localPlayers[i_6_];
				if (player != null) {
					client.field_go_2792 = i_8_ * -1692845097;
					client.field_gj_2793 = i_9_ * 1577151013;
					client.field_gv_2795 = -1030191458;
					client.field_gi_2856 = 0;
					client.field_mk_2923 = -652317981 * i;
					client.field_mn_2924 = -1028068353 * i_4_;
					client.encryptedBuffer.writeOpcode(144);
					client.encryptedBuffer.putShortA(i_6_, (byte) -89);
					client.encryptedBuffer.put((KeyFocusListener.field_cn_1676[82]) ? 1 : 0);
				}
			}
			if (i_5_ == 32) {
				client.encryptedBuffer.writeOpcode(44);
				client.encryptedBuffer.putBEInt(i_4_, 1802683306);
				client.encryptedBuffer.putShort((-1524676247 * client.field_if_2843));
				client.encryptedBuffer.putLEShort(i, (byte) 2);
				client.encryptedBuffer.putShort(i_6_);
				client.encryptedBuffer.putBEInt((-1782496813 * Class_cc.field_iw_779), 1950394754);
				client.field_gq_2796 = 0;
				Class_cr.field_gw_1242 = Class_en.getWidgetByUID(i_4_, (short) 32303);
				client.field_gn_2797 = 1469016909 * i;
			}
			if (i_5_ == 1004) {
				client.field_go_2792 = i_8_ * -1692845097;
				client.field_gj_2793 = 1577151013 * i_9_;
				client.field_gv_2795 = -1030191458;
				client.field_gi_2856 = 0;
				client.encryptedBuffer.writeOpcode(116);
				client.encryptedBuffer.putLEShort(i_6_, (byte) 2);
			}
			if ((i_5_ == 57) || (i_5_ == 1007)) {
				final Widget widget = Class_ge.method_z_fy(i_4_, i, (byte) 7);
				if (widget != null) {
					final int i_12_ = widget.itemId * 1464571113;
					final Widget widget_13_ = Class_ge.method_z_fy(i_4_, i, (byte) -55);
					if (widget_13_ != null) {
						if (widget_13_.field_dl_2642 != null) {
							final Script class_n = new Script();
							class_n.parent = widget_13_;
							class_n.field_g_1197 = i_6_ * 1450847035;
							class_n.field_h_1201 = string_7_;
							class_n.parameters = widget_13_.field_dl_2642;
							Menu.handleCS2Script(class_n, 200000);
						}
						boolean bool = true;
						if ((-1489583413 * widget_13_.contentType) > 0) {
							bool = Buffer.method_ds_boolean(widget_13_, 220708043);
						}
						if (bool && (Class_e.method_d_boolean(Class_db.method_en_int(widget_13_, -1931483958), i_6_ - 1, (byte) 6))) {
							if (i_6_ == 1) {
								client.encryptedBuffer.writeOpcode(255);
								client.encryptedBuffer.putInt(i_4_);
								client.encryptedBuffer.putShort(i);
								client.encryptedBuffer.putShort(i_12_);
							}
							if (i_6_ == 2) {
								client.encryptedBuffer.writeOpcode(149);
								client.encryptedBuffer.putInt(i_4_);
								client.encryptedBuffer.putShort(i);
								client.encryptedBuffer.putShort(i_12_);
							}
							if (i_6_ == 3) {
								client.encryptedBuffer.writeOpcode(194);
								client.encryptedBuffer.putInt(i_4_);
								client.encryptedBuffer.putShort(i);
								client.encryptedBuffer.putShort(i_12_);
							}
							if (i_6_ == 4) {
								client.encryptedBuffer.writeOpcode(159);
								client.encryptedBuffer.putInt(i_4_);
								client.encryptedBuffer.putShort(i);
								client.encryptedBuffer.putShort(i_12_);
							}
							if (i_6_ == 5) {
								client.encryptedBuffer.writeOpcode(148);
								client.encryptedBuffer.putInt(i_4_);
								client.encryptedBuffer.putShort(i);
								client.encryptedBuffer.putShort(i_12_);
							}
							if (i_6_ == 6) {
								client.encryptedBuffer.writeOpcode(0);
								client.encryptedBuffer.putInt(i_4_);
								client.encryptedBuffer.putShort(i);
								client.encryptedBuffer.putShort(i_12_);
							}
							if (i_6_ == 7) {
								client.encryptedBuffer.writeOpcode(245);
								client.encryptedBuffer.putInt(i_4_);
								client.encryptedBuffer.putShort(i);
								client.encryptedBuffer.putShort(i_12_);
							}
							if (i_6_ == 8) {
								client.encryptedBuffer.writeOpcode(77);
								client.encryptedBuffer.putInt(i_4_);
								client.encryptedBuffer.putShort(i);
								client.encryptedBuffer.putShort(i_12_);
							}
							if (i_6_ == 9) {
								client.encryptedBuffer.writeOpcode(153);
								client.encryptedBuffer.putInt(i_4_);
								client.encryptedBuffer.putShort(i);
								client.encryptedBuffer.putShort(i_12_);
							}
							if (i_6_ == 10) {
								client.encryptedBuffer.writeOpcode(46);
								client.encryptedBuffer.putInt(i_4_);
								client.encryptedBuffer.putShort(i);
								client.encryptedBuffer.putShort(i_12_);
							}
						}
					}
				}
			}
			if (i_5_ == 45) {
				final Player player = client.localPlayers[i_6_];
				if (player != null) {
					client.field_go_2792 = -1692845097 * i_8_;
					client.field_gj_2793 = i_9_ * 1577151013;
					client.field_gv_2795 = -1030191458;
					client.field_gi_2856 = 0;
					client.field_mk_2923 = i * -652317981;
					client.field_mn_2924 = -1028068353 * i_4_;
					client.encryptedBuffer.writeOpcode(39);
					client.encryptedBuffer.putShort(i_6_);
					client.encryptedBuffer.put((KeyFocusListener.field_cn_1676[82]) ? 1 : 0);
				}
			}
			if (i_5_ == 38) {
				client.method_co_void(-645576834);
				final Widget widget = Class_en.getWidgetByUID(i_4_, (short) 14072);
				client.selectedOptionType = -1936951357;
				ImageColorModel.field_iu_542 = i * 1286410723;
				Class_ed.field_ix_2071 = -1412828069 * i_4_;
				Npc.field_iz_299 = i_6_ * -1159265169;
				Daemon.method_dn_void(widget, (byte) -24);
				client.field_it_2841 = new StringBuilder(Class_r.colorString(16748608)).append(ItemDefinitions.getItemComposite(i_6_).name).append(Class_r.colorString(16777215)).toString();
				if (client.field_it_2841 == null) {
					client.field_it_2841 = "null";
				}
			} else {
				if (i_5_ == 1) {
					client.field_go_2792 = i_8_ * -1692845097;
					client.field_gj_2793 = 1577151013 * i_9_;
					client.field_gv_2795 = -1030191458;
					client.field_gi_2856 = 0;
					client.field_mk_2923 = -652317981 * i;
					client.field_mn_2924 = i_4_ * -1028068353;
					client.encryptedBuffer.writeOpcode(238);
					client.encryptedBuffer.putShortA(i_4_ + (Class_gf.originY * -1593604783), (byte) -38);
					client.encryptedBuffer.putShort((-692921713 * Npc.field_iz_299));
					client.encryptedBuffer.putByteS((KeyFocusListener.field_cn_1676[82]) ? 1 : 0, 1755661352);
					client.encryptedBuffer.putShortA(i + (1693061403 * Class_q.originX), (byte) -54);
					client.encryptedBuffer.putLEShortA((i_6_ >> 14) & 0x7fff, 635296816);
					client.encryptedBuffer.putShort((ImageColorModel.field_iu_542 * -1792623669));
					client.encryptedBuffer.putInt((-969794605 * (Class_ed.field_ix_2071)));
				}
				if (i_5_ == 21) {
					client.field_go_2792 = i_8_ * -1692845097;
					client.field_gj_2793 = i_9_ * 1577151013;
					client.field_gv_2795 = -1030191458;
					client.field_gi_2856 = 0;
					client.field_mk_2923 = -652317981 * i;
					client.field_mn_2924 = i_4_ * -1028068353;
					client.encryptedBuffer.writeOpcode(7);
					client.encryptedBuffer.putLEShort((Class_q.originX * 1693061403) + i, (byte) 2);
					client.encryptedBuffer.put((KeyFocusListener.field_cn_1676[82]) ? 1 : 0);
					client.encryptedBuffer.putLEShort(i_4_ + (-1593604783 * Class_gf.originY), (byte) 2);
					client.encryptedBuffer.putShort(i_6_);
				}
				if (i_5_ == 4) {
					client.field_go_2792 = -1692845097 * i_8_;
					client.field_gj_2793 = i_9_ * 1577151013;
					client.field_gv_2795 = -1030191458;
					client.field_gi_2856 = 0;
					client.field_mk_2923 = -652317981 * i;
					client.field_mn_2924 = -1028068353 * i_4_;
					client.encryptedBuffer.writeOpcode(188);//7 trueee.
					client.encryptedBuffer.putByteC((KeyFocusListener.field_cn_1676[82]) ? 1 : 0);
					client.encryptedBuffer.putLEShort((1693061403 * Class_q.originX) + i, (byte) 2);
					client.encryptedBuffer.putShortA(i_4_ + (-1593604783 * Class_gf.originY), (byte) -80);
					client.encryptedBuffer.putShort((i_6_ >> 14) & 0x7fff);
				}
				if (i_5_ == 34) {
					client.encryptedBuffer.writeOpcode(32);
					client.encryptedBuffer.putInt(i_4_);//want me to just print values from osrs? sure
					client.encryptedBuffer.putLEShortA(i_6_, 73936334);
					client.encryptedBuffer.putLEShort(i, (byte) 2);
					client.field_gq_2796 = 0;
					Class_cr.field_gw_1242 = Class_en.getWidgetByUID(i_4_, (short) 16700);
					client.field_gn_2797 = 1469016909 * i;
				}
				if (i_5_ == 14) {
					final Player player = client.localPlayers[i_6_];
					if (player != null) {
						client.field_go_2792 = i_8_ * -1692845097;
						client.field_gj_2793 = i_9_ * 1577151013;
						client.field_gv_2795 = -1030191458;
						client.field_gi_2856 = 0;
						client.field_mk_2923 = -652317981 * i;
						client.field_mn_2924 = -1028068353 * i_4_;
						client.encryptedBuffer.writeOpcode(170);
						client.encryptedBuffer.putShortA(-1792623669 * ImageColorModel.field_iu_542, (byte) -32);
						client.encryptedBuffer.putBEInt(-969794605 * Class_ed.field_ix_2071, -993225781);
						client.encryptedBuffer.putLEShortA(-692921713 * Npc.field_iz_299, 936957024);
						client.encryptedBuffer.putShortA(i_6_, (byte) -65);
						client.encryptedBuffer.putByteA((KeyFocusListener.field_cn_1676[82]) ? 1 : 0);
					}
				}
				if (i_5_ == 22) {
					client.field_go_2792 = -1692845097 * i_8_;
					client.field_gj_2793 = 1577151013 * i_9_;
					client.field_gv_2795 = -1030191458;
					client.field_gi_2856 = 0;
					client.field_mk_2923 = -652317981 * i;
					client.field_mn_2924 = -1028068353 * i_4_;
					client.encryptedBuffer.writeOpcode(1);
					client.encryptedBuffer.putLEShortA((1693061403 * Class_q.originX) + i, -851766572);
					client.encryptedBuffer.putShort(i_4_ + (-1593604783 * Class_gf.originY));
					client.encryptedBuffer.putShortA(i_6_, (byte) -3);
					client.encryptedBuffer.putByteA((KeyFocusListener.field_cn_1676[82]) ? 1 : 0);
				}
				if (i_5_ == 42) {
					client.encryptedBuffer.writeOpcode(215);
					client.encryptedBuffer.putLEShortA(i, -1494651207);
					client.encryptedBuffer.putLEInt(i_4_, (byte) -17);
					client.encryptedBuffer.putShort(i_6_);
					client.field_gq_2796 = 0;
					Class_cr.field_gw_1242 = Class_en.getWidgetByUID(i_4_, (short) 9662);
					client.field_gn_2797 = i * 1469016909;
				}
				if (i_5_ == 13) {
					final Npc npc = client.npcs[i_6_];
					if (npc != null) {
						client.field_go_2792 = -1692845097 * i_8_;
						client.field_gj_2793 = 1577151013 * i_9_;
						client.field_gv_2795 = -1030191458;
						client.field_gi_2856 = 0;
						client.field_mk_2923 = i * -652317981;
						client.field_mn_2924 = i_4_ * -1028068353;
						client.encryptedBuffer.writeOpcode(208);
						client.encryptedBuffer.putShort(i_6_);
						client.encryptedBuffer.put((KeyFocusListener.field_cn_1676[82]) ? 1 : 0);
					}
				}
				if (i_5_ == 1002) {
					client.field_go_2792 = -1692845097 * i_8_;
					client.field_gj_2793 = i_9_ * 1577151013;
					client.field_gv_2795 = -1030191458;
					client.field_gi_2856 = 0;
					client.encryptedBuffer.writeOpcode(101);
					client.encryptedBuffer.putLEShort((i_6_ >> 14) & 0x7fff, (byte) 2);
				}
				if (i_5_ == 1005) {
					final Widget widget = Class_en.getWidgetByUID(i_4_, (short) 24188);
					if ((widget != null) && (widget.itemAmts[i] >= 100000)) {
						GameStub.sendMessage(27, "", new StringBuilder(String.valueOf(widget.itemAmts[i])).append(" x ").append(ItemDefinitions.getItemComposite(i_6_).name).toString());
					} else {
						client.encryptedBuffer.writeOpcode(116);
						client.encryptedBuffer.putLEShort(i_6_, (byte) 2);
					}
					client.field_gq_2796 = 0;
					Class_cr.field_gw_1242 = Class_en.getWidgetByUID(i_4_, (short) 1526);
					client.field_gn_2797 = 1469016909 * i;
				}
				if (i_5_ == 46) {
					final Player player = client.localPlayers[i_6_];
					if (player != null) {
						client.field_go_2792 = i_8_ * -1692845097;
						client.field_gj_2793 = 1577151013 * i_9_;
						client.field_gv_2795 = -1030191458;
						client.field_gi_2856 = 0;
						client.field_mk_2923 = -652317981 * i;
						client.field_mn_2924 = -1028068353 * i_4_;
						client.encryptedBuffer.writeOpcode(239);
						client.encryptedBuffer.putLEShort(i_6_, (byte) 2);
						client.encryptedBuffer.putByteC((KeyFocusListener.field_cn_1676[82]) ? 1 : 0);
					}
				}
				if (i_5_ == 24) {
					final Widget widget = Class_en.getWidgetByUID(i_4_, (short) 7932);
					boolean bool = true;
					if ((-1489583413 * widget.contentType) > 0) {
						bool = Buffer.method_ds_boolean(widget, 116605595);
					}
					if (bool) {
						client.encryptedBuffer.writeOpcode(78);
						client.encryptedBuffer.putInt(i_4_);
					}
				}
				if (i_5_ == 18) {
					client.field_go_2792 = i_8_ * -1692845097;
					client.field_gj_2793 = i_9_ * 1577151013;
					client.field_gv_2795 = -1030191458;
					client.field_gi_2856 = 0;
					client.field_mk_2923 = i * -652317981;
					client.field_mn_2924 = i_4_ * -1028068353;
					client.encryptedBuffer.writeOpcode(249);
					client.encryptedBuffer.putShortA((1693061403 * Class_q.originX) + i, (byte) -104);
					client.encryptedBuffer.put((KeyFocusListener.field_cn_1676[82]) ? 1 : 0);
					client.encryptedBuffer.putShort((-1593604783 * Class_gf.originY) + i_4_);
					client.encryptedBuffer.putLEShortA(i_6_, 1029241364);
				}
				if (i_5_ == 11) {
					final Npc npc = client.npcs[i_6_];
					if (npc != null) {
						client.field_go_2792 = -1692845097 * i_8_;
						client.field_gj_2793 = i_9_ * 1577151013;
						client.field_gv_2795 = -1030191458;
						client.field_gi_2856 = 0;
						client.field_mk_2923 = i * -652317981;
						client.field_mn_2924 = -1028068353 * i_4_;
						client.encryptedBuffer.writeOpcode(52);
						client.encryptedBuffer.putLEShort(i_6_, (byte) 2);
						client.encryptedBuffer.putByteC((KeyFocusListener.field_cn_1676[82]) ? 1 : 0);
					}
				}
				if (i_5_ == 39) {
					client.encryptedBuffer.writeOpcode(114);
					client.encryptedBuffer.putInt1(i_4_, -1576741707);
					client.encryptedBuffer.putShortA(i_6_, (byte) -39);
					client.encryptedBuffer.putLEShortA(i, -1903357394);
					client.field_gq_2796 = 0;
					Class_cr.field_gw_1242 = Class_en.getWidgetByUID(i_4_, (short) 7035);
					client.field_gn_2797 = 1469016909 * i;
				}
				if (i_5_ == 29) {
					client.encryptedBuffer.writeOpcode(78);
					client.encryptedBuffer.putInt(i_4_);
					final Widget widget = Class_en.getWidgetByUID(i_4_, (short) 3749);
					if ((widget.opcodes != null) && (widget.opcodes[0][0] == 5)) {
						final int i_14_ = widget.opcodes[0][1];
						if (widget.conditionValues[0] != Class_fv.configs[i_14_]) {
							Class_fv.configs[i_14_] = widget.conditionValues[0];
							Class_cw.handleConfig(i_14_);
						}
					}
				}
				if (i_5_ == 36) {
					client.encryptedBuffer.writeOpcode(73);
					client.encryptedBuffer.putLEInt(i_4_, (byte) -117);
					client.encryptedBuffer.putLEShort(i, (byte) 2);
					client.encryptedBuffer.putLEShortA(i_6_, 817143417);
					client.field_gq_2796 = 0;
					Class_cr.field_gw_1242 = Class_en.getWidgetByUID(i_4_, (short) 7646);
					client.field_gn_2797 = i * 1469016909;
				}
				if (i_5_ == 10) {
					final Npc npc = client.npcs[i_6_];
					if (npc != null) {
						client.field_go_2792 = i_8_ * -1692845097;
						client.field_gj_2793 = i_9_ * 1577151013;
						client.field_gv_2795 = -1030191458;
						client.field_gi_2856 = 0;
						client.field_mk_2923 = -652317981 * i;
						client.field_mn_2924 = i_4_ * -1028068353;
						client.encryptedBuffer.writeOpcode(45);
						client.encryptedBuffer.putByteS((KeyFocusListener.field_cn_1676[82]) ? 1 : 0, -2127224119);
						client.encryptedBuffer.putShortA(i_6_, (byte) -111);
					}
				}
				if (i_5_ == 40) {
					client.encryptedBuffer.writeOpcode(158);
					client.encryptedBuffer.putShortA(i_6_, (byte) -17);
					client.encryptedBuffer.putShortA(i, (byte) -18);
					client.encryptedBuffer.putInt(i_4_);
					client.field_gq_2796 = 0;
					Class_cr.field_gw_1242 = Class_en.getWidgetByUID(i_4_, (short) 18111);
					client.field_gn_2797 = 1469016909 * i;
				}
				if (i_5_ == 35) {
					client.encryptedBuffer.writeOpcode(72);
					client.encryptedBuffer.putInt(i_4_);
					client.encryptedBuffer.putShort(i);
					client.encryptedBuffer.putShort(i_6_);
					client.field_gq_2796 = 0;
					Class_cr.field_gw_1242 = Class_en.getWidgetByUID(i_4_, (short) 2577);
					client.field_gn_2797 = 1469016909 * i;
				}
				if (i_5_ == 19) {
					client.field_go_2792 = -1692845097 * i_8_;
					client.field_gj_2793 = 1577151013 * i_9_;
					client.field_gv_2795 = -1030191458;
					client.field_gi_2856 = 0;
					client.field_mk_2923 = i * -652317981;
					client.field_mn_2924 = i_4_ * -1028068353;
					client.encryptedBuffer.writeOpcode(165);
					client.encryptedBuffer.putShort(i + ((Class_q.originX) * 1693061403));
					client.encryptedBuffer.putByteA((KeyFocusListener.field_cn_1676[82]) ? 1 : 0);
					client.encryptedBuffer.putShortA(i_4_ + (Class_gf.originY * -1593604783), (byte) -35);
					client.encryptedBuffer.putLEShort(i_6_, (byte) 2);
				}
				if (i_5_ == 47) {
					final Player player = client.localPlayers[i_6_];
					if (player != null) {
						client.field_go_2792 = -1692845097 * i_8_;
						client.field_gj_2793 = 1577151013 * i_9_;
						client.field_gv_2795 = -1030191458;
						client.field_gi_2856 = 0;
						client.field_mk_2923 = i * -652317981;
						client.field_mn_2924 = -1028068353 * i_4_;
						client.encryptedBuffer.writeOpcode(111);
						client.encryptedBuffer.putShortA(i_6_, (byte) -16);
						client.encryptedBuffer.putByteC((KeyFocusListener.field_cn_1676[82]) ? 1 : 0);
					}
				}
				if (i_5_ == 9) {
					final Npc npc = client.npcs[i_6_];
					if (npc != null) {
						client.field_go_2792 = i_8_ * -1692845097;
						client.field_gj_2793 = i_9_ * 1577151013;
						client.field_gv_2795 = -1030191458;
						client.field_gi_2856 = 0;
						client.field_mk_2923 = i * -652317981;
						client.field_mn_2924 = -1028068353 * i_4_;
						client.encryptedBuffer.writeOpcode(136);
						client.encryptedBuffer.putByteC((KeyFocusListener.field_cn_1676[82]) ? 1 : 0);
						client.encryptedBuffer.putShort(i_6_);
					}
				}
				if (i_5_ == 12) {
					final Npc npc = client.npcs[i_6_];
					if (npc != null) {
						client.field_go_2792 = i_8_ * -1692845097;
						client.field_gj_2793 = i_9_ * 1577151013;
						client.field_gv_2795 = -1030191458;
						client.field_gi_2856 = 0;
						client.field_mk_2923 = i * -652317981;
						client.field_mn_2924 = -1028068353 * i_4_;
						client.encryptedBuffer.writeOpcode(212);
						client.encryptedBuffer.putShortA(i_6_, (byte) -90);
						client.encryptedBuffer.putByteS((KeyFocusListener.field_cn_1676[82]) ? 1 : 0, 1341852209);
					}
				}
				if (i_5_ == 7) {
					final Npc npc = client.npcs[i_6_];
					if (npc != null) {
						client.field_go_2792 = i_8_ * -1692845097;
						client.field_gj_2793 = 1577151013 * i_9_;
						client.field_gv_2795 = -1030191458;
						client.field_gi_2856 = 0;
						client.field_mk_2923 = -652317981 * i;
						client.field_mn_2924 = i_4_ * -1028068353;
						client.encryptedBuffer.writeOpcode(232);
						client.encryptedBuffer.putInt(((Class_ed.field_ix_2071) * -969794605));
                        client.encryptedBuffer.putLEShortA(-692921713 * Npc.field_iz_299, -2024956006);
						client.encryptedBuffer.putByteC((KeyFocusListener.field_cn_1676[82]) ? 1 : 0);
						client.encryptedBuffer.putLEShort(i_6_, (byte) 2);
						client.encryptedBuffer.putLEShortA(-1792623669 * ImageColorModel.field_iu_542, 67218396);
					}
				}
				if (i_5_ == 1003) {
					client.field_go_2792 = -1692845097 * i_8_;
					client.field_gj_2793 = 1577151013 * i_9_;
					client.field_gv_2795 = -1030191458;
					client.field_gi_2856 = 0;
					final Npc npc = client.npcs[i_6_];
					if (npc != null) {
						NpcComposite npcdef = npc.composite;
						if (npcdef.childrenIds != null) {
							npcdef = npcdef.method_f_az(2042532144);
						}
						if (npcdef != null) {
							client.encryptedBuffer.writeOpcode(202);
							client.encryptedBuffer.putLEShort((npcdef.id * 384781917), (byte) 2);
						}
					}
				}
				if (i_5_ == 37) {
					client.encryptedBuffer.writeOpcode(183);
					client.encryptedBuffer.putLEShort(i_6_, (byte) 2);
					client.encryptedBuffer.putLEShort(i, (byte) 2);
					client.encryptedBuffer.putInt(i_4_);
					client.field_gq_2796 = 0;
					Class_cr.field_gw_1242 = Class_en.getWidgetByUID(i_4_, (short) 29680);
					client.field_gn_2797 = i * 1469016909;
				}
				if (i_5_ == 26) {
					client.encryptedBuffer.writeOpcode(199);
					for (Menu interfacepositionnode = ((Menu) client.menuTable.method_y_ga()); interfacepositionnode != null; interfacepositionnode = ((Menu) client.menuTable.method_e_ga())) {
						if ((((interfacepositionnode.field_d_1534) * 1041023801) == 0) || (((interfacepositionnode.field_d_1534) * 1041023801) == 3)) {
							client.method_db_void(interfacepositionnode, true);
						}
					}
					if (client.field_jd_2762 != null) {
						Daemon.method_dn_void(client.field_jd_2762, (byte) -2);
						client.field_jd_2762 = null;
					}
				}
				if (i_5_ == 43) {
					client.encryptedBuffer.writeOpcode(48);
					client.encryptedBuffer.putLEShortA(i_6_, 2132871943);
					client.encryptedBuffer.putInt1(i_4_, -70596258);
					client.encryptedBuffer.putLEShortA(i, -840449837);
					client.field_gq_2796 = 0;
					Class_cr.field_gw_1242 = Class_en.getWidgetByUID(i_4_, (short) 23959);
					client.field_gn_2797 = 1469016909 * i;
				}
				if (i_5_ == 2) {
					client.field_go_2792 = -1692845097 * i_8_;
					client.field_gj_2793 = 1577151013 * i_9_;
					client.field_gv_2795 = -1030191458;
					client.field_gi_2856 = 0;
					client.field_mk_2923 = i * -652317981;
					client.field_mn_2924 = i_4_ * -1028068353;
					client.encryptedBuffer.writeOpcode(156);
					client.encryptedBuffer.putInt1((Class_cc.field_iw_779 * -1782496813), -146682722);
					client.encryptedBuffer.putShort((i_6_ >> 14) & 0x7fff);
					client.encryptedBuffer.putByteS((KeyFocusListener.field_cn_1676[82]) ? 1 : 0, -1830584840);
					client.encryptedBuffer.putShortA(i + (1693061403 * Class_q.originX), (byte) -80);
					client.encryptedBuffer.putLEShort((Class_gf.originY * -1593604783) + i_4_, (byte) 2);
					client.encryptedBuffer.putLEShort((-1524676247 * (client.field_if_2843)), (byte) 2);
				}
				if (i_5_ == 1001) {
					client.field_go_2792 = -1692845097 * i_8_;
					client.field_gj_2793 = i_9_ * 1577151013;
					client.field_gv_2795 = -1030191458;
					client.field_gi_2856 = 0;
					client.field_mk_2923 = i * -652317981;
					client.field_mn_2924 = -1028068353 * i_4_;
					client.encryptedBuffer.writeOpcode(66);
					client.encryptedBuffer.putByteA((KeyFocusListener.field_cn_1676[82]) ? 1 : 0);
					client.encryptedBuffer.putShort(i_4_ + ((Class_gf.originY) * -1593604783));
					client.encryptedBuffer.putShortA((i_6_ >> 14) & 0x7fff, (byte) -98);
					client.encryptedBuffer.putLEShort(i + (1693061403 * Class_q.originX), (byte) 2);
				}
				if (i_5_ == 15) {
					final Player player = client.localPlayers[i_6_];
					if (player != null) {
						client.field_go_2792 = -1692845097 * i_8_;
						client.field_gj_2793 = 1577151013 * i_9_;
						client.field_gv_2795 = -1030191458;
						client.field_gi_2856 = 0;
						client.field_mk_2923 = i * -652317981;
						client.field_mn_2924 = -1028068353 * i_4_;
						client.encryptedBuffer.writeOpcode(150);
						client.encryptedBuffer.putShort(-1524676247 * client.field_if_2843);
						client.encryptedBuffer.put((KeyFocusListener.field_cn_1676[82]) ? 1 : 0);
						client.encryptedBuffer.putLEInt(-1782496813 * Class_cc.field_iw_779, (byte) -11);
						client.encryptedBuffer.putShortA(i_6_, (byte) -19);
					}
				}
				if (i_5_ == 50) {
					final Player player = client.localPlayers[i_6_];
					if (player != null) {
						client.field_go_2792 = i_8_ * -1692845097;
						client.field_gj_2793 = 1577151013 * i_9_;
						client.field_gv_2795 = -1030191458;
						client.field_gi_2856 = 0;
						client.field_mk_2923 = i * -652317981;
						client.field_mn_2924 = -1028068353 * i_4_;
						client.encryptedBuffer.writeOpcode(137);
						client.encryptedBuffer.putShort(i_6_);
						client.encryptedBuffer.putByteS((KeyFocusListener.field_cn_1676[82]) ? 1 : 0, -222091218);
					}
				}
				if (i_5_ == 41) {
					client.encryptedBuffer.writeOpcode(122);
					client.encryptedBuffer.putShort(i);
					client.encryptedBuffer.putBEInt(i_4_, 439834086);
					client.encryptedBuffer.putLEShortA(i_6_, 459749897);
					client.field_gq_2796 = 0;
					Class_cr.field_gw_1242 = Class_en.getWidgetByUID(i_4_, (short) 4364);
					client.field_gn_2797 = i * 1469016909;
				}
				if (i_5_ == 44) {
					final Player player = client.localPlayers[i_6_];
					if (player != null) {
						client.field_go_2792 = -1692845097 * i_8_;
						client.field_gj_2793 = 1577151013 * i_9_;
						client.field_gv_2795 = -1030191458;
						client.field_gi_2856 = 0;
						client.field_mk_2923 = -652317981 * i;
						client.field_mn_2924 = -1028068353 * i_4_;
						client.encryptedBuffer.writeOpcode(250);
						client.encryptedBuffer.putByteS((KeyFocusListener.field_cn_1676[82]) ? 1 : 0, -1515893602);
						client.encryptedBuffer.putLEShortA(i_6_, 416398721);
					}
				}
				if (i_5_ == 23) {
					Class_ae.sceneGraph.method_at_void(Class_ed.plane * 250114511, i, i_4_);
				}
				if (i_5_ == 6) {
					client.field_go_2792 = -1692845097 * i_8_;
					client.field_gj_2793 = 1577151013 * i_9_;
					client.field_gv_2795 = -1030191458;
					client.field_gi_2856 = 0;
					client.field_mk_2923 = i * -652317981;
					client.field_mn_2924 = i_4_ * -1028068353;
					client.encryptedBuffer.writeOpcode(184);
					client.encryptedBuffer.putShortA(i_4_ + (-1593604783 * Class_gf.originY), (byte) -87);
					client.encryptedBuffer.putByteA((KeyFocusListener.field_cn_1676[82]) ? 1 : 0);
					client.encryptedBuffer.putShortA((i_6_ >> 14) & 0x7fff, (byte) -104);
					client.encryptedBuffer.putShortA((1693061403 * Class_q.originX) + i, (byte) -63);
				}
				if (i_5_ == 3) {
					client.field_go_2792 = i_8_ * -1692845097;
					client.field_gj_2793 = 1577151013 * i_9_;
					client.field_gv_2795 = -1030191458;
					client.field_gi_2856 = 0;
					client.field_mk_2923 = -652317981 * i;
					client.field_mn_2924 = -1028068353 * i_4_;
					client.encryptedBuffer.writeOpcode(166);
					client.encryptedBuffer.putShort(i + (1693061403 * Class_q.originX));
					client.encryptedBuffer.putShort(i_4_ + ((Class_gf.originY) * -1593604783));
					client.encryptedBuffer.putByteS((KeyFocusListener.field_cn_1676[82]) ? 1 : 0, 11091951);
					client.encryptedBuffer.putLEShort((i_6_ >> 14) & 0x7fff, (byte) 2);
				}
				if (i_5_ == 49) {
					final Player player = client.localPlayers[i_6_];
					if (player != null) {
						client.field_go_2792 = i_8_ * -1692845097;
						client.field_gj_2793 = i_9_ * 1577151013;
						client.field_gv_2795 = -1030191458;
						client.field_gi_2856 = 0;
						client.field_mk_2923 = -652317981 * i;
						client.field_mn_2924 = i_4_ * -1028068353;
						client.encryptedBuffer.writeOpcode(28);
						client.encryptedBuffer.putByteS((KeyFocusListener.field_cn_1676[82]) ? 1 : 0, -315619865);
						client.encryptedBuffer.putShortA(i_6_, (byte) -37);
					}
				}
				if (i_5_ == 48) {
					final Player player = client.localPlayers[i_6_];
					if (player != null) {
						client.field_go_2792 = i_8_ * -1692845097;
						client.field_gj_2793 = 1577151013 * i_9_;
						client.field_gv_2795 = -1030191458;
						client.field_gi_2856 = 0;
						client.field_mk_2923 = -652317981 * i;
						client.field_mn_2924 = -1028068353 * i_4_;
						client.encryptedBuffer.writeOpcode(65);
						client.encryptedBuffer.putLEShort(i_6_, (byte) 2);
						client.encryptedBuffer.putByteC((KeyFocusListener.field_cn_1676[82]) ? 1 : 0);
					}
				}
				if (i_5_ == 16) {
					client.field_go_2792 = i_8_ * -1692845097;
					client.field_gj_2793 = i_9_ * 1577151013;
					client.field_gv_2795 = -1030191458;
					client.field_gi_2856 = 0;
					client.field_mk_2923 = -652317981 * i;
					client.field_mn_2924 = i_4_ * -1028068353;
					client.encryptedBuffer.writeOpcode(62);
					client.encryptedBuffer.putBEInt((-969794605 * (Class_ed.field_ix_2071)), -1012270545);
					client.encryptedBuffer.putLEShortA((1693061403 * Class_q.originX) + i, -704284921);
					client.encryptedBuffer.putShort(i_6_);
					client.encryptedBuffer.putLEShortA((ImageColorModel.field_iu_542 * -1792623669), 1672556389);
					client.encryptedBuffer.putShort(i_4_ + (-1593604783 * Class_gf.originY));
					client.encryptedBuffer.putLEShortA((Npc.field_iz_299 * -692921713), 499370383);
					client.encryptedBuffer.putByteC((KeyFocusListener.field_cn_1676[82]) ? 1 : 0);
				}
				if ((i_5_ == 30) && (client.field_jd_2762 == null)) {
					Class_ge.method_cn_void(i_4_, i, 1224999023);
					client.field_jd_2762 = Class_ge.method_z_fy(i_4_, i, (byte) 60);
					Daemon.method_dn_void(client.field_jd_2762, (byte) -42);
				}
				if (i_5_ == 25) {
					final Widget widget = Class_ge.method_z_fy(i_4_, i, (byte) -46);
					if (widget != null) {
						client.method_co_void(-645576834);
						final int i_15_ = (WidgetNode.method_z_int(Class_db.method_en_int(widget, -1490829437), -1977245782));
						final int i_16_ = 1464571113 * widget.itemId;
						final Widget widget_17_ = Class_ge.method_z_fy(i_4_, i, (byte) -101);
						if ((widget_17_ != null) && (widget_17_.field_ck_2633 != null)) {
							final Script class_n = new Script();
							class_n.parent = widget_17_;
							class_n.parameters = widget_17_.field_ck_2633;
							Menu.handleCS2Script(class_n, 200000);
						}
						client.field_ig_2844 = i_16_ * 1854851085;
						client.isOptionSelected = true;
						Class_cc.field_iw_779 = i_4_ * -1176388005;
						client.field_if_2843 = i * 261478105;
						GameCanvas.field_ib_2231 = i_15_ * -1776853031;
						Daemon.method_dn_void(widget_17_, (byte) -3);
						client.selectedOptionType = 0;
						client.field_in_2845 = Class_bg.method_el_String(widget, (byte) -119);
						if (client.field_in_2845 == null) {
							client.field_in_2845 = "Null";
						}
						if (widget.interactive) {
							client.selectedOption = new StringBuilder(widget.interactionOption).append(Class_r.colorString(16777215)).toString();
						} else {
							client.selectedOption = new StringBuilder(Class_r.colorString(65280)).append(widget.field_de_2658).append(Class_r.colorString(16777215)).toString();
						}
					}
				} else {
					if (i_5_ == 33) {
						client.encryptedBuffer.writeOpcode(198);
						
						//System.out.println(i_4_+", "+i_6_+" VALUES, "+(i_4_ >> 16)+", "+(i_4_ & 0xFFFF) + ", i" + i);
						client.encryptedBuffer.putShortA(i_6_, (byte) -114);
						client.encryptedBuffer.putInt1(i_4_, 803465117);
						client.encryptedBuffer.putShort(i);
						client.field_gq_2796 = 0;
						Class_cr.field_gw_1242 = Class_en.getWidgetByUID(i_4_, (short) 16855);
						client.field_gn_2797 = 1469016909 * i;
					}
					if (i_5_ == 58) {
						final Widget widget = Class_ge.method_z_fy(i_4_, i, (byte) -30);
						if (widget != null) {
							client.encryptedBuffer.writeOpcode(224);
							client.encryptedBuffer.putShort((widget.itemId * 1464571113));
							client.encryptedBuffer.putLEShortA(i, 1807395374);
							client.encryptedBuffer.putInt1(-1782496813 * Class_cc.field_iw_779, -341464322);
							client.encryptedBuffer.putLEShortA(client.field_if_2843 * -1524676247, 2114290591);
							client.encryptedBuffer.putLEShort(1669252805 * client.field_ig_2844, (byte) 2);
							client.encryptedBuffer.putInt(i_4_);
						}
					}
					if (i_5_ == 5) {
						client.field_go_2792 = i_8_ * -1692845097;
						client.field_gj_2793 = 1577151013 * i_9_;
						client.field_gv_2795 = -1030191458;
						client.field_gi_2856 = 0;
						client.field_mk_2923 = -652317981 * i;
						client.field_mn_2924 = -1028068353 * i_4_;
						client.encryptedBuffer.writeOpcode(218);
						client.encryptedBuffer.putLEShortA((i_6_ >> 14) & 0x7fff, -358818429);
						client.encryptedBuffer.putShortA((1693061403 * Class_q.originX) + i, (byte) -98);
						client.encryptedBuffer.put((KeyFocusListener.field_cn_1676[82]) ? 1 : 0);
						client.encryptedBuffer.putLEShortA((Class_gf.originY * -1593604783) + i_4_, 943412224);
					}
					if (i_5_ == 20) {
						client.field_go_2792 = -1692845097 * i_8_;
						client.field_gj_2793 = 1577151013 * i_9_;
						client.field_gv_2795 = -1030191458;
						client.field_gi_2856 = 0;
						client.field_mk_2923 = -652317981 * i;
						client.field_mn_2924 = i_4_ * -1028068353;
						client.encryptedBuffer.writeOpcode(5);
						client.encryptedBuffer.putShortA(i_6_, (byte) -1);
						client.encryptedBuffer.putLEShortA((1693061403 * Class_q.originX) + i, 419510236);
						client.encryptedBuffer.put((KeyFocusListener.field_cn_1676[82]) ? 1 : 0);
						client.encryptedBuffer.putShort(i_4_ + (Class_gf.originY * -1593604783));
					}
					if ((-1595363093 * client.selectedOptionType) != 0) {
						client.selectedOptionType = 0;
						Daemon.method_dn_void(Class_en.getWidgetByUID((Class_ed.field_ix_2071 * -969794605), (short) 16374), (byte) 65);
					}
					if (client.isOptionSelected) {
						client.method_co_void(-645576834);
					}
					if ((Class_cr.field_gw_1242 != null) && ((client.field_gq_2796 * -421146009) == 0)) {
						Daemon.method_dn_void(Class_cr.field_gw_1242, (byte) 100);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ey.cq()");
		}
	}

	Class_ey() throws Throwable {
		throw new Error();
	}
}
