
/* Class_g - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Component;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.URL;

public final class Region {

	static byte[][][] sceneFlags = new byte[4][104][104];
	static int field_i_992 = ((int) (Math.random() * 33.0) - 16) * -782306289;
	static int field_z_993 = -1767863399;
	static byte[][][] field_e_994;
	static final int field_bj_995 = 1005;
	static final int[] field_o_996 = { 0, -1, 0, 1 };
	static final int[] field_v_997 = { 1, 2, 4, 8 };
	static final int[] field_c_998 = { 16, 32, 64, 128 };
	static final int[] field_p_999 = { 1, 0, -1, 0 };
	static int[][][] heightMaps = new int[4][105][105];
	static final int[] field_b_1001 = { 1, -1, -1, 1 };
	static final int[] field_t_1002 = { -1, -1, 1, 1 };
	static int field_w_1003 = ((int) (Math.random() * 17.0) - 8) * -1172707873;
	public static final int field_fg_1004 = 157;
	static Index soundFXIndex2;
	static int[] field_l_1006;
	static byte[][][] field_m_1007;
	static Widget[] field_ke_1008;
	public static final int field_y_1009 = 64;
	public static final int field_ai_1010 = 65;
	static int regionY;
	public static FileStore field_g_1012;
	static int field_kx_1013;

	public static boolean method_h_boolean(final FileStore class_fs, final int i, final int i_0_, final int i_1_) {
		try {
			final byte[] is = class_fs.getArchive(i, i_0_);
			if (is == null) {
				return false;
			}
			Class_fj.method_l_void(is, (byte) 117);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "g.h()");
		}
		return true;
	}

	Region() throws Throwable {
		throw new Error();
	}

	public static final byte[] readFileBytes(String s) {
		try {
			File file = new File(s);
			int i = (int) file.length();
			byte abyte0[] = new byte[i];
			DataInputStream datainputstream = new DataInputStream(new BufferedInputStream(new FileInputStream(s)));
			datainputstream.readFully(abyte0, 0, i);
			datainputstream.close();
			return abyte0;
		} catch (Exception exception) {
		}
		return null;
	}

	static void method_n_void(final Component component, final FileStore class_fs, final FileStore class_fs_2_,
			final boolean bool, final int i, final int i_3_) {
		try {
			if (Class_ax.field_n_441) {
				if (i == 4)
					Class_ax.loginScreenStatus = 393928180;
			} else {
				Class_ax.loginScreenStatus = i * -2049001603;
				Rasterizer.method_ch_void();
				final byte[] is = class_fs.method_c_byteArray("title.jpg", "", 704920486); // ClientLoader.loadBytes("background.png");
				
				// Loads and displays client's background
				Class_v.field_g_1446 = new Rasterizer2D(is, component);
				ImageColorModel.field_f_541 = Class_v.field_g_1446.method_n_bx();

				
				// Loads and displays the logo
				if (((client.currentWorldMask * -1483883627) & 0x20000000) != 0)
					Class_ax.field_m_419 = Class_ft.method_e_be(class_fs_2_, "logo_deadman_mode", "", 1191892685);
				else
					Class_ax.field_m_419 = Class_ft.method_e_be(class_fs_2_, "logo", "", 1191892685); // sprite
																										// 1228
																										// for
																										// dmm
																										// logo

				Class_ax.field_z_427 = Class_ft.method_e_be(class_fs_2_, "titlebox", "", 1001301573);
				Class_ax.field_y_416 = Class_ft.method_e_be(class_fs_2_, "titlebutton", "", 1910557995);
				Class_eg.field_e_2114 = Class_w.getSpriteArray(class_fs_2_, "runes", "");
				Class_ax.field_a_420 = Class_w.getSpriteArray(class_fs_2_, "title_mute", "");
				Class_ax.field_h_421 = Class_ft.method_e_be(class_fs_2_, "options_radio_buttons,0", "", 1898724354);
				Friend.field_l_1095 = Class_ft.method_e_be(class_fs_2_, "options_radio_buttons,2", "", 1200973580);
				Class_du.field_c_1720 = new int[256];
				for (int i_4_ = 0; i_4_ < 64; i_4_++) {
					Class_du.field_c_1720[i_4_] = i_4_ * 262144;
				}
				for (int i_5_ = 0; i_5_ < 64; i_5_++) {
					Class_du.field_c_1720[i_5_ + 64] = 16711680 + (1024 * i_5_);
				}
				for (int i_6_ = 0; i_6_ < 64; i_6_++) {
					Class_du.field_c_1720[i_6_ + 128] = (i_6_ * 4) + 16776960;
				}
				for (int i_7_ = 0; i_7_ < 64; i_7_++) {
					Class_du.field_c_1720[192 + i_7_] = 16777215;
				}
				Item.field_p_43 = new int[256];
				for (int i_8_ = 0; i_8_ < 64; i_8_++) {
					Item.field_p_43[i_8_] = i_8_ * 1024;
				}
				for (int i_9_ = 0; i_9_ < 64; i_9_++) {
					Item.field_p_43[i_9_ + 64] = 65280 + (i_9_ * 4);
				}
				for (int i_10_ = 0; i_10_ < 64; i_10_++) {
					Item.field_p_43[i_10_ + 128] = (i_10_ * 262144) + 65535;
				}
				for (int i_11_ = 0; i_11_ < 64; i_11_++) {
					Item.field_p_43[192 + i_11_] = 16777215;
				}
				ISAACCipher.field_o_1659 = new int[256];
				for (int i_12_ = 0; i_12_ < 64; i_12_++) {
					if (i_3_ <= -278573692) {
						return;
					}
					ISAACCipher.field_o_1659[i_12_] = 4 * i_12_;
				}
				for (int i_13_ = 0; i_13_ < 64; i_13_++) {
					ISAACCipher.field_o_1659[64 + i_13_] = 255 + (262144 * i_13_);
				}
				for (int i_14_ = 0; i_14_ < 64; i_14_++) {
					ISAACCipher.field_o_1659[128 + i_14_] = (i_14_ * 1024) + 16711935;
				}
				for (int i_15_ = 0; i_15_ < 64; i_15_++) {
					ISAACCipher.field_o_1659[i_15_ + 192] = 16777215;
				}
				Menu.field_v_1537 = new int[256];
				Class_al.field_w_182 = new int[32768];
				SceneTile.field_i_1122 = new int[32768];
				Class_ei.method_f_void(null, (byte) 38);
				Class_o.field_ad_1236 = new int[32768];
				Class_h.field_ak_1026 = new int[32768];
				if (bool) {
					Class_ax.username = "";
					Class_ax.password = "";
				}
				Class_am.field_ai_192 = 0;
				Class_p.field_ah_1247 = "";
				Class_ax.field_aq_439 = true;
				Class_ax.field_ap_443 = false;
				if (!Class_w.field_pz_1501.field_y_783) {
					final Index music = World.musicIndex1;
					final int i_16_ = music.getByName("scape main");
					final int i_17_ = music.getFileIndex(i_16_, "");
					Class_fa.field_e_2278 = 1243386265;
					field_g_1012 = music;
					Class_eb.field_f_1772 = 877461501 * i_16_;
					Npc.field_m_298 = 85078463 * i_17_;
					Class_eh.field_a_2122 = -1165305565;
					Class_e.field_l_932 = false;
					Class_de.field_h_1599 = 2049577394;
				} else {
					Class_fa.field_e_2278 = 1243386265;
					field_g_1012 = null;
					Class_eb.field_f_1772 = -877461501;
					Npc.field_m_298 = -85078463;
					Class_eh.field_a_2122 = 0;
					Class_e.field_l_932 = false;
					Class_de.field_h_1599 = 2049577394;
				}
				GroundItem.method_d_void(false, 440225066);
				Class_ax.field_n_441 = true;
				Class_ax.field_d_415 = (((-1236640339 * Boundary.clientWidth) - (-144968977 * client.field_lm_2904))
						/ 2) * 2101785865;
				Class_ax.field_r_440 = 60243526 + (1408190063 * Class_ax.field_d_415);
				Class_v.field_g_1446.method_h_void(Class_ax.field_d_415 * 1815701817, 0);
				ImageColorModel.field_f_541.method_h_void(382 + (Class_ax.field_d_415 * 1815701817), 0);
				// Class_ax.field_m_419.render(((382 + (1815701817 *
				// Class_ax.field_d_415)) - (Class_ax.field_m_419.field_z_533 /
				// 2)), 18);
				// Not sure what that line does :?
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "g.n()");
		}
	}

	static int method_g_int(final World worldinfo, final World worldinfo_18_, final int i, final boolean bool,
			final int i_19_, final boolean bool_20_, final int i_21_) {
		int i_22_;
		try {
			final int i_23_ = Widget.method_f_int(worldinfo, worldinfo_18_, i, bool, 2069253465);
			if (i_23_ != 0) {
				return bool ? -i_23_ : i_23_;
			}
			if (i_19_ == -1) {
				return 0;
			}
			final int i_24_ = Widget.method_f_int(worldinfo, worldinfo_18_, i_19_, bool_20_, 1940876225);
			i_22_ = bool_20_ ? -i_24_ : i_24_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "g.g()");
		}
		return i_22_;
	}

	public static void method_d_void(final byte i) {
		try {
			final MouseInputListener class_ek = MouseInputListener.instance;
			synchronized (class_ek) {
				MouseInputListener.field_f_2155 = MouseInputListener.field_z_2152 * -61334225;
				MouseInputListener.field_m_2156 = MouseInputListener.mouseX * 371163627;
				MouseInputListener.field_a_2157 = MouseInputListener.mouseY * 12016949;
				MouseInputListener.field_q_2162 = 507565025 * MouseInputListener.field_y_2165;
				MouseInputListener.field_k_2164 = MouseInputListener.pressX * -377652409;
				MouseInputListener.field_x_2158 = -1795612631 * MouseInputListener.pressY;
				MouseInputListener.field_r_2151 = 3211197806965298089L * MouseInputListener.lastClickTime;
				MouseInputListener.field_y_2165 = 0;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "g.d()");
		}
	}

	static boolean method_y_boolean(final String string, final int i, final String string_25_, final int i_26_) {
		try {
			if (i == 0) {
				try {
					if (!Class_dv.field_d_1726.startsWith("win")) {
						throw new Exception();
					}
					if (!string.startsWith("http://") && !string.startsWith("https://")) {
						throw new Exception();
					}
					final String string_27_ = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
					for (int i_28_ = 0; i_28_ < string.length(); i_28_++) {
						if (string_27_.indexOf(string.charAt(i_28_)) == -1) {
							throw new Exception();
						}
					}
					Runtime.getRuntime()
							.exec(new StringBuilder("cmd /c start \"j\" \"").append(string).append("\"").toString());
				} catch (final Throwable throwable) {
					return false;
				}
				return true;
			}
			if (i == 1) {
				boolean bool;
				try {
					final Object object = Class_dz.method_d_Object(Class_dv.field_n_1728, string_25_,
							(new Object[] { new URL(Class_dv.field_n_1728.getCodeBase(), string).toString() }),
							1992940455);
					if (object != null) {
						return true;
					}
					bool = false;
				} catch (final Throwable throwable) {
					return false;
				}
				return bool;
			}
			if (i == 2) {
				try {
					Class_dv.field_n_1728.getAppletContext()
							.showDocument(new URL(Class_dv.field_n_1728.getCodeBase(), string), "_blank");
				} catch (final Exception exception) {
					return false;
				}
				return true;
			}
			if (i == 3) {
				try {
					// Note sure what this does, but disabling it didn't affect
					// anything. XXX
					// final Applet applet = Class_dv.field_n_1728;
					// JSObject.getWindow(applet).call("loggedout", null);
				} catch (final Throwable throwable) {
					/* empty */
				}
				try {
					Class_dv.field_n_1728.getAppletContext()
							.showDocument(new URL(Class_dv.field_n_1728.getCodeBase(), string), "_top");
				} catch (final Exception exception) {
					return false;
				}
				return true;
			}
			throw new IllegalArgumentException();
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "g.y()");
		}
	}

	public static void method_n_void(final FileStore class_fs, final FileStore class_fs_29_,
			final FileStore class_fs_30_, final FileStore class_fs_31_, final int i) {
		try {
			Widget.field_z_2666 = class_fs;
			Widget.field_y_2537 = class_fs_29_;
			Varp.field_e_65 = class_fs_30_;
			Class_db.field_g_1566 = class_fs_31_;
			Widget.widgets = (new Widget[Widget.field_z_2666.method_k_int((short) -16202)][]);
			Class_ge.isInterfaceLoaded = (new boolean[Widget.field_z_2666.method_k_int((short) -25517)]);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "g.n()");
		}
	}
}
