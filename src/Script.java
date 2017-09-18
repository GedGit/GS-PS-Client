
/* Class_n - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Script extends Node {
	Widget parent;
	Object[] parameters;
	static String currentWorldAddress;
	Widget field_f_1195;
	int field_e_1196;
	int field_g_1197;
	int field_y_1198;
	int keyCode;
	int keyChar;
	String field_h_1201;
	public static final int field_o_1202 = 19136770;
	public static final int field_ez_1203 = 28;
	static byte[][] mapDataBuffer;
	static final int field_r_1205 = 16;
	int field_l_1206;
	public static final int field_dl_1207 = 246;
	static final int field_ao_1208 = 36;
	boolean field_d_1209;

	public static byte[] toByteArray(final Object object, final boolean bool, final byte i) {
		try {
			if (object == null) {
				return null;
			}
			if (object instanceof byte[]) {
				final byte[] is = (byte[]) object;
				return bool ? MillisecondTimer.arraycopy(is, (byte) 14) : is;
			}
			if (object instanceof AbstractBuffer) {
				final AbstractBuffer class_dk = (AbstractBuffer) object;
				return class_dk.get();
			}
			throw new IllegalArgumentException();
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "n.h()");
		}
	}

	static final void method_eu_void(final String string, final byte i) {
		try {
			if (string != null) {
				final String string_0_ = Class_bg.method_d_String(string, Class_fd.field_h_2308, 2021495347);
				if (string_0_ != null) {
					for (int i_1_ = 0; i_1_ < (1944416787 * client.friendListSize); i_1_++) {
						final Friend class_j = client.friends[i_1_];
						final String string_2_ = class_j.name;
						final String string_3_ = Class_bg.method_d_String(string_2_, Class_fd.field_h_2308, 107332561);
						boolean bool;
						if ((string != null) && (string_2_ != null)) {
							if (!string.startsWith("#") && !string_2_.startsWith("#")) {
								bool = string_0_.equals(string_3_);
							} else {
								bool = string.equals(string_2_);
							}
						} else {
							bool = false;
						}
						if (bool) {
							client.friendListSize -= 241051675;
							for (int i_4_ = i_1_; i_4_ < (1944416787 * client.friendListSize); i_4_++) {
								client.friends[i_4_] = client.friends[1 + i_4_];
							}
							client.field_ka_2880 = -62874977 * client.field_kj_2850;
							client.encryptedBuffer.writeOpcode(49);
							client.encryptedBuffer.put(Class_cl.getStringLength(string, (byte) 1));
							client.encryptedBuffer.putNT0String(string, (byte) 15);
							break;
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "n.eu()");
		}
	}

	Script() {
		/* empty */
	}

	static void handleClientState() {
		try {
			if ((client.state * -604037911) == 0) {
				Class_ae.sceneGraph = new SceneGraph(4, 104, 104, Region.heightMaps);
				for (int i_5_ = 0; i_5_ < 4; i_5_++) {
					client.collisionMaps[i_5_] = new CollisionMap(104, 104);
				}
				Class_a.field_mp_793 = new Rasterizer2D(512, 512);
				Class_ax.updateStatusText = MenuText.STARTING_ENGINE;
				Class_ax.field_as_430 = 1481767055;
				client.state = -804936972;
			} else if ((-604037911 * client.state) == 20) {
				final int[] is = new int[9];
				for (int i_6_ = 0; i_6_ < 9; i_6_++) {
					final int i_7_ = 15 + (i_6_ * 32) + 128;
					final int i_8_ = (i_7_ * 3) + 600;
					final int i_9_ = Rasterizer3D.SINE[i_7_];
					is[i_6_] = (i_8_ * i_9_) >> 16;
				}
				SceneGraph.method_ac_void(is, 500, 800, 512, 334);
				Class_ax.updateStatusText = MenuText.VISIBILITY_MAP_PREPARED;
				Class_ax.field_as_430 = -1331433186;
				client.state = 940078190;
			} else if ((-604037911 * client.state) == 30) {
				Class_s.skeletonIndex = Class_gg.newIndex(0, false, true, true);
				Class_dr.skinIndex = Class_gg.newIndex(1, false, true, true);
				GameObject.configIndex = Class_gg.newIndex(2, true, false, true);
				Class_k.widgetIndex = Class_gg.newIndex(3, false, true, true);
				Class_dw.soundFXIndex1 = Class_gg.newIndex(4, false, true, true);
				ItemContainer.terrainIndex = Class_gg.newIndex(5, true, true, true);
				World.musicIndex1 = Class_gg.newIndex(6, true, true, false);
				Class_fb.modelIndex = Class_gg.newIndex(7, false, true, true);
				Class_cj.spriteIndex = Class_gg.newIndex(8, false, true, true);
				GameMessage.textureIndex = Class_gg.newIndex(9, false, true, true);
				Class_cr.huffmanIndex = Class_gg.newIndex(10, false, true, true);
				Class_gt.musicIndex2 = Class_gg.newIndex(11, false, true, true);
				Class_gh.cs2Index = Class_gg.newIndex(12, false, true, true);
				Projectile.fontIndex = Class_gg.newIndex(13, true, false, true);
				Region.soundFXIndex2 = Class_gg.newIndex(14, false, true, false);
				Class_ab.soundFXIndex3 = Class_gg.newIndex(15, false, true, true);
				Class_ax.updateStatusText = MenuText.CONNECTING_USERVER;
				Class_ax.field_as_430 = 1632100924;
				client.state = -1609873944;
			} else if ((-604037911 * client.state) == 40) {
				final int i_10_ = 0;
				int i_11_ = i_10_ + ((Class_s.skeletonIndex.method_ch_int((byte) -112) * 4) / 100);
				i_11_ += ((Class_dr.skinIndex.method_ch_int((byte) -72) * 4) / 100);
				i_11_ += (GameObject.configIndex.method_ch_int((byte) -49) * 2) / 100;
				i_11_ += ((Class_k.widgetIndex.method_ch_int((byte) -5) * 2) / 100);
				i_11_ += ((Class_dw.soundFXIndex1.method_ch_int((byte) -31) * 6) / 100);
				i_11_ += ((ItemContainer.terrainIndex.method_ch_int((byte) -83) * 4) / 100);
				i_11_ += ((World.musicIndex1.method_ch_int((byte) 0) * 2) / 100);
				i_11_ += ((Class_fb.modelIndex.method_ch_int((byte) -62) * 60) / 100);
				i_11_ += ((Class_cj.spriteIndex.method_ch_int((byte) -111) * 2) / 100);
				i_11_ += ((GameMessage.textureIndex.method_ch_int((byte) -62) * 2) / 100);
				i_11_ += ((Class_cr.huffmanIndex.method_ch_int((byte) -128) * 2) / 100);
				i_11_ += ((Class_gt.musicIndex2.method_ch_int((byte) -82) * 2) / 100);
				i_11_ += ((Class_gh.cs2Index.method_ch_int((byte) -113) * 2) / 100);
				i_11_ += ((Projectile.fontIndex.method_ch_int((byte) -78) * 2) / 100);
				i_11_ += ((Region.soundFXIndex2.method_ch_int((byte) -5) * 2) / 100);
				i_11_ += ((Class_ab.soundFXIndex3.method_ch_int((byte) -56) * 2) / 100);
				if (i_11_ != 100) {
					if (i_11_ != 0) {
						Class_ax.updateStatusText = new StringBuilder(MenuText.CHECKING_FOR_UPDATES).append(i_11_)
								.append("%").toString();
					}
					Class_ax.field_as_430 = 300667738;
				} else {
					Class_ax.updateStatusText = MenuText.UPDATE_LIST_LOADED;
					Class_ax.field_as_430 = 300667738;
					client.state = 1410117285;
				}
			} else if ((-604037911 * client.state) == 45) {
				Class_o.method_s_void(22050, !client.field_u_2784, 2, 786703410);
				final Class_fg class_fg = new Class_fg();
				class_fg.method_k_void(9, 128, (byte) -50);
				Class_fq.field_nt_2444 = Buffer.method_v_av(SpotAnim.daemon, ObjectComposite.canvas, 0, 22050,
						-487598080);
				Class_fq.field_nt_2444.method_c_void(class_fg, 1541601199);
				final Index class_fx = Class_ab.soundFXIndex3;
				final Index class_fx_12_ = Region.soundFXIndex2;
				final Index class_fx_13_ = Class_dw.soundFXIndex1;
				Class_fa.field_n_2277 = class_fx;
				Class_fa.field_d_2275 = class_fx_12_;
				Class_fa.field_z_2274 = class_fx_13_;
				Class_fa.field_y_2276 = class_fg;
				Class_de.field_nn_1594 = Buffer.method_v_av(SpotAnim.daemon, ObjectComposite.canvas, 1, 2048,
						-646964413);
				Class_bg.field_na_553 = new Class_au();
				Class_de.field_nn_1594.method_c_void(Class_bg.field_na_553, 1096014487);
				Class_v.field_ny_1445 = new Class_bh(22050, -1281893659 * NpcDefinitions.audioSampleRate);
				Class_ax.updateStatusText = MenuText.field_v_1968;
				Class_ax.field_as_430 = 1782434793;
				client.state = 135141218;
			} else if ((-604037911 * client.state) == 50) {
				int i_14_ = 0;
				if (client.p11Full == null) {
					final Index class_fx = Class_cj.spriteIndex;
					final Index class_fx_15_ = Projectile.fontIndex;
					final int i_16_ = class_fx.getByName("p11_full");
					final int i_17_ = class_fx.getFileIndex(i_16_, "");
					final Class_hd class_hd = Class_bh.method_z_hd(class_fx, class_fx_15_, i_16_, i_17_, 2011941404);
					client.p11Full = class_hd;
				} else {
					i_14_++;
				}
				if (Class_ay.p12Full == null) {
					final Index class_fx = Class_cj.spriteIndex;
					final Index class_fx_18_ = Projectile.fontIndex;
					final int i_19_ = class_fx.getByName("p12_full");
					final int i_20_ = class_fx.getFileIndex(i_19_, "");
					final Class_hd class_hd = Class_bh.method_z_hd(class_fx, class_fx_18_, i_19_, i_20_, 2109628577);
					Class_ay.p12Full = class_hd;
				} else {
					i_14_++;
				}
				if (IdentityKit.b12Full == null) {
					final Index sprites = Class_cj.spriteIndex;
					final Index fonts = Projectile.fontIndex;
					final int i_22_ = sprites.getByName("b12_full");
					final int i_23_ = sprites.getFileIndex(i_22_, "");
					final Class_hd class_hd = Class_bh.method_z_hd(sprites, fonts, i_22_, i_23_, 1904783033);
					IdentityKit.b12Full = class_hd;
				} else {
					i_14_++;
				}
				if (i_14_ < 3) {
					Class_ax.updateStatusText = new StringBuilder(MenuText.LOADING_FONTS).append((100 * i_14_) / 3)
							.append("%").toString();
					Class_ax.field_as_430 = -1030765448;
				} else {
					Varp.machineInformation = new MachineInformationNode(true);
					Class_ax.updateStatusText = MenuText.LOADED_FONTS;
					Class_ax.field_as_430 = -1030765448;
					client.state = 1880156380;
				}
			} else if ((client.state * -604037911) == 60) {
				final Index huffman = Class_cr.huffmanIndex;
				final Index sprites = Class_cj.spriteIndex;
				int i_25_ = 0;
				if (huffman.exists("title.jpg", "", -1219544029)) {
					i_25_++;
				}
				if (sprites.exists("logo", "", 1171105818)) {
					i_25_++;
				}
				if (sprites.exists("titlebox", "", 1069083243)) {
					i_25_++;
				}
				if (sprites.exists("titlebutton", "", -1500449606)) {
					i_25_++;
				}
				if (sprites.exists("runes", "", -922882140)) {
					i_25_++;
				}
				if (sprites.exists("title_mute", "", -785523188)) {
					i_25_++;
				}
				if (sprites.method_o_boolean("options_radio_buttons,0", -2075549916)) {
					i_25_++;
				}
				if (sprites.method_o_boolean("options_radio_buttons,2", -2058195289)) {
					i_25_++;
				}
				sprites.exists("sl_back", "", -1172764346);
				sprites.exists("sl_flags", "", -1620157072);
				sprites.exists("sl_arrows", "", -816928663);
				sprites.exists("sl_stars", "", -293147077);
				sprites.exists("sl_button", "", -338724235);
				final int i_26_ = 8;
				if (i_25_ < i_26_) {
					Class_ax.updateStatusText = new StringBuilder(MenuText.LOADING_TITLE_SCREEN)
							.append((i_25_ * 100) / i_26_).append("%").toString();
					Class_ax.field_as_430 = 1932768662;
				} else {
					Class_ax.updateStatusText = MenuText.LOADED_TITLE_SCREEN;
					Class_ax.field_as_430 = 1932768662;
					Socket.method_h_void(5, -1743845769);
					client.state = -669795754;
				}
			} else if ((-604037911 * client.state) == 70) {
				if (!GameObject.configIndex.method_f_boolean()) {
					Class_ax.updateStatusText = new StringBuilder(MenuText.LOADING_CONFIG)
							.append(GameObject.configIndex.getCompletion(1244249856)).append("%").toString();
					Class_ax.field_as_430 = 601335476;
				} else {
					final Index class_fx = GameObject.configIndex;
					FloorUnderlay.field_n_73 = class_fx;
					NpcComposite.method_n_void(GameObject.configIndex, -2031953831);
					Class_ey.method_n_void(GameObject.configIndex, Class_fb.modelIndex, 2044945787);
					Class_av.method_n_void(GameObject.configIndex, Class_fb.modelIndex, client.field_u_2784,
							1694308703);
					final Index class_fx_27_ = GameObject.configIndex;
					final Index class_fx_28_ = Class_fb.modelIndex;
					NpcComposite.field_n_479 = class_fx_27_;
					NpcComposite.field_d_464 = class_fx_28_;
					GameObject.method_n_void((GameObject.configIndex), Class_fb.modelIndex, client.onMembersWorld,
							client.p11Full, (byte) 127);
					final Index class_fx_29_ = GameObject.configIndex;
					final Index class_fx_30_ = Class_s.skeletonIndex;
					final Index class_fx_31_ = Class_dr.skinIndex;
					AnimationSequence.field_n_198 = class_fx_29_;
					AnimationSequence.field_d_195 = class_fx_30_;
					Class_dg.field_z_1613 = class_fx_31_;
					final Index class_fx_32_ = GameObject.configIndex;
					final Index class_fx_33_ = Class_fb.modelIndex;
					SpotAnim.field_n_396 = class_fx_32_;
					SpotAnim.field_d_394 = class_fx_33_;
					final Index class_fx_34_ = GameObject.configIndex;
					Class_hc.field_n_3064 = class_fx_34_;
					ItemComposite.method_n_void(GameObject.configIndex, -1878845709);
					Region.method_n_void(Class_k.widgetIndex, Class_fb.modelIndex, Class_cj.spriteIndex,
							Projectile.fontIndex, -2138993355);
					final Index class_fx_35_ = GameObject.configIndex;
					Class_cw.field_n_1407 = class_fx_35_;
					final Index class_fx_36_ = GameObject.configIndex;
					Class_ay.field_n_459 = class_fx_36_;
					Class_ax.updateStatusText = MenuText.LOADED_CONFIG;
					Class_ax.field_as_430 = 601335476;
					client.state = 1075219408;
				}
			} else if ((-604037911 * client.state) != 80) {
				if ((client.state * -604037911) == 90) {
					if (!GameMessage.textureIndex.method_f_boolean()) {
						Class_ax.updateStatusText = new StringBuilder(MenuText.LOADING_TEXTURES)
								.append(GameMessage.textureIndex.getCompletion(1244249856)).append("%").toString();
						Class_ax.field_as_430 = 902003214;
					} else {
						final Class_cc class_cc = new Class_cc(GameMessage.textureIndex, Class_cj.spriteIndex, 20, 0.8,
								client.field_u_2784 ? 64 : 128);
						Rasterizer3D.method_e_void(class_cc);
						Rasterizer3D.method_g_void(0.8);
						Class_ax.updateStatusText = MenuText.field_ae_1818;
						Class_ax.field_as_430 = 902003214;
						client.state = 2015297598;
					}
				} else if ((-604037911 * client.state) == 110) {
					client.field_b_2778 = new Class_q();
					SpotAnim.daemon.method_g_es(client.field_b_2778, 10, 1708639563);
					Class_ax.updateStatusText = MenuText.LOADED_INPUT_HANDLER;
					Class_ax.field_as_430 = 2087416858;
					client.state = -534654536;
				} else if ((-604037911 * client.state) == 120) {
					if (!Class_cr.huffmanIndex.exists("huffman", "", 369864647)) {
						Class_ax.updateStatusText = new StringBuilder(MenuText.LOADING_WORDPACK).append(0).append("%")
								.toString();
						Class_ax.field_as_430 = -1614843616;
					} else {
						final Class_dt class_dt = new Class_dt(
								Class_cr.huffmanIndex.method_c_byteArray("huffman", "", 704920486));
						Class_hk.field_n_3080 = class_dt;
						Class_ax.updateStatusText = MenuText.LOADED_WORDPACK;
						Class_ax.field_as_430 = -1614843616;
						client.state = 1210360626;
					}
				} else if ((client.state * -604037911) == 130) {
					if (!Class_k.widgetIndex.method_f_boolean()) {
						Class_ax.updateStatusText = new StringBuilder(MenuText.LOADING_INTERFACES)
								.append((Class_k.widgetIndex.getCompletion(1244249856) * 4) / 5).append("%").toString();
						Class_ax.field_as_430 = -429429972;
					} else if (!Class_gh.cs2Index.method_f_boolean()) {
						Class_ax.updateStatusText = new StringBuilder(MenuText.LOADING_INTERFACES)
								.append(80 + (Class_gh.cs2Index.getCompletion(1244249856) / 6)).append("%").toString();
						Class_ax.field_as_430 = -429429972;
					} else if (!Projectile.fontIndex.method_f_boolean()) {
						Class_ax.updateStatusText = new StringBuilder(MenuText.LOADING_INTERFACES)
								.append(96 + (Projectile.fontIndex.getCompletion(1244249856) / 20)).append("%")
								.toString();
						Class_ax.field_as_430 = -429429972;
					} else {
						Class_ax.updateStatusText = MenuText.LOADED_INTERFACES;
						Class_ax.field_as_430 = -429429972;
						client.state = -1339591508;
					}
				} else if ((client.state * -604037911) == 140) {
					Socket.method_h_void(10, -1806171434);
				}
			} else {
				int i_37_ = 0;
				if (AnimationSequence.compass == null) {
					AnimationSequence.compass = World.method_f_bx(Class_cj.spriteIndex, "compass", "", (byte) -19);
				} else {
					i_37_++;
				}
				if (Class_de.mapedge == null) {
					Class_de.mapedge = World.method_f_bx(Class_cj.spriteIndex, "mapedge", "", (byte) 33);
				} else {
					i_37_++;
				}
				if (Class_et.mapscene == null) {
					Class_et.mapscene = Class_w.getSpriteArray(Class_cj.spriteIndex, "mapscene", "");
				} else {
					i_37_++;
				}
				i_37_++;
//				if (Class_ed.mapfunction == null) {
//					Class_ed.mapfunction = Class_df.getSpriteArray(Class_cj.spriteIndex, "mapfunction", "", 2136794212);
//				} else {
//					i_37_++;
//				}
				if (Class_cp.hitmarks == null) {
					Class_cp.hitmarks = Class_df.getSpriteArray(Class_cj.spriteIndex, "hitmarks", "", 1741925324);
				} else {
					i_37_++;
				}
				if (Class_cq.headicons_pk == null) {
					Class_cq.headicons_pk = Class_df.getSpriteArray(Class_cj.spriteIndex, "headicons_pk", "", 1847414006);
				} else {
					i_37_++;
				}
				if (Class_d.headicons_prayer == null) { 
					Class_d.headicons_prayer = Class_df.getSpriteArray(Class_cj.spriteIndex, "headicons_prayer", "", 2012775269);
				} else {
					i_37_++;
				}
				if (IdentityKit.headicons_hint == null) {
					IdentityKit.headicons_hint = Class_df.getSpriteArray(Class_cj.spriteIndex, "headicons_hint", "", 2145997107);
				} else {
					i_37_++;
				}
				if (Class_ey.mapmarker == null) {
					Class_ey.mapmarker = Class_df.getSpriteArray(Class_cj.spriteIndex, "mapmarker", "", 2038156673);
				} else {
					i_37_++;
				}
				if (client.cross == null) {
					client.cross = Class_df.getSpriteArray(Class_cj.spriteIndex, "cross", "", 1814976600);
				} else {
					i_37_++;
				}
				if (Class_eo.mapdots == null) {
					Class_eo.mapdots = Class_df.getSpriteArray(Class_cj.spriteIndex, "mapdots", "", 1940588631);
				} else {
					i_37_++;
				}
				if (ClientScript.scrollbar == null) {
					ClientScript.scrollbar = Class_w.getSpriteArray(Class_cj.spriteIndex, "scrollbar", "");
				} else {
					i_37_++;
				}
				if (Player.mod_icons == null) {
					Player.mod_icons = Class_w.getSpriteArray(Class_cj.spriteIndex, "mod_icons", "");
					if (Player.mod_icons != null) {
						String[] var24 = ClientLoaderOLD.chat_icons;
						Sprite[] icons = new Sprite[Player.mod_icons.length + var24.length];
						System.arraycopy(Player.mod_icons, 0, icons, 0, Player.mod_icons.length);
						try {
							for (int var27 = 1; var27 < var24.length; ++var27)
								icons[icons.length - var27] = ClientLoaderOLD.loadSprite(var24[var27 - 1] + ".png");
						} catch (Throwable t) {
							t.printStackTrace();
						}
						Player.mod_icons = icons;
					}
				} else {
					i_37_++;
				}
				if (i_37_ < 13) {
					Class_ax.updateStatusText = new StringBuilder(MenuText.LOADING_SPRITES).append((i_37_ * 100) / 13)
							.append("%").toString();
					Class_ax.field_as_430 = -730097710;
				} else {
					int int_1;
					int int_2;
					int int_3;
					int int_4;
					TypeFace.crowns = Player.mod_icons;
					Class_de.mapedge.method_y_void();
					int_1 = (int) (Math.random() * 21.0D) - 10;
					int_2 = (int) (Math.random() * 21.0D) - 10;
					int_3 = (int) (Math.random() * 21.0D) - 10;
					int_4 = (int) (Math.random() * 41.0D) - 20;
					
					//int_4 + int_1, int_4 + int_2, int_4 + int_3
					Class_et.mapscene[0].method_d_void(int_4 + int_1, int_4 + int_2, int_4 + int_3);
//					final int i_38_ = (int) (Math.random() * 21.0) - 10;
//					final int i_39_ = (int) (Math.random() * 21.0) - 10;
//					final int i_40_ = (int) (Math.random() * 21.0) - 10;
//					final int i_41_ = (int) (Math.random() * 41.0) - 20;
//					for (final Rasterizer2D element : Class_ed.mapfunction) {
//						element.method_z_void(i_41_ + i_38_, i_41_ + i_39_, i_40_ + i_41_);
//					}
				//	Class_et.mapscene[0].method_d_void(i_41_ + i_38_, i_41_ + i_39_, i_41_ + i_40_);
					Class_ax.updateStatusText = MenuText.LOADED_SPRITES;
					Class_ax.field_as_430 = -730097710;
					client.state = -1474732726;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "n.k()");
		}
	}

	public static void method_y_void(final int i) {
		do {
			try {
				try {
					if ((Class_fa.field_e_2278 * -858508631) == 1) {
						int i_43_ = Class_fa.field_y_2276.method_d_int((byte) 53);
						if ((i_43_ > 0) && Class_fa.field_y_2276.method_q_boolean(-2147483643)) {
							i_43_ -= Class_de.field_h_1599 * -406390935;
							if (i_43_ < 0) {
								i_43_ = 0;
							}
							Class_fa.field_y_2276.method_n_void(i_43_, -664614798);
						} else {
							Class_fa.field_y_2276.method_u_void(594002162);
							Class_fa.field_y_2276.method_e_void((byte) -108);
							if (Region.field_g_1012 != null) {
								Class_fa.field_e_2278 = -1808194766;
							} else {
								Class_fa.field_e_2278 = 0;
							}
							Bindable.field_u_1706 = null;
							Class_i.field_q_1074 = null;
						}
					}
				} catch (final Exception exception) {
					exception.printStackTrace();
					Class_fa.field_y_2276.method_u_void(2120641885);
					Class_fa.field_e_2278 = 0;
					Bindable.field_u_1706 = null;
					Class_i.field_q_1074 = null;
					Region.field_g_1012 = null;
					break;
				}
				break;
			} catch (final RuntimeException runtimeexception) {
				throw GameCanvas.error(runtimeexception, "n.y()");
			}
		} while (false);
	}
}
