/* GameMessage - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.datatransfer.Clipboard;

public class GameMessage extends CacheableNode {
	String message2;
	int field_d_301;
	int type;
	static Clipboard field_pl_303;
	public static final int field_f_304 = 6;
	String message;
	static Index textureIndex;
	int field_n_307 = Varp.method_n_int((byte) 24) * 491243403;
	static int cameraY;
	static final int field_k_309 = 2;
	public static final int field_ep_310 = 144; 
	String owner;
	static int[] loadedRegionIds;

	void method_n_void(final int i, final String string, final String string_0_, final String string_1_, final byte i_2_) {
		try {
			this.field_n_307 = Varp.method_n_int((byte) -15) * 491243403;
			this.field_d_301 = 2062756609 * client.currentCycle;
			this.type = i * -2006860791;
			this.owner = string;
			this.message2 = string_0_;
			this.message = string_1_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "as.n()");
		}
	}

	public static String method_n_String(final int i, final int i_3_) {
		String string;
		try {
			string = new StringBuilder(String.valueOf((i >> 24) & 0xff)).append(".").append((i >> 16) & 0xff).append(".").append((i >> 8) & 0xff).append(".").append(i & 0xff).toString();
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "as.n()");
		}
		return string;
	}

	static final void method_g_void(final Buffer rsbytebuffer, final int i, final int i_4_, final int i_5_, final int i_6_, final int i_7_, final int i_8_, final int i_9_) {
		try {
			if ((i_4_ >= 0) && (i_4_ < 104) && (i_5_ >= 0) && (i_5_ < 104)) {
				Region.sceneFlags[i][i_4_][i_5_] = (byte) 0;
				for (;;) {
					final int i_10_ = rsbytebuffer.get();
					if (i_10_ == 0) {
						if (i == 0) {
							Region.heightMaps[0][i_4_][i_5_] = -(GroundDecoration.method_h_int(i_6_ + 932731 + i_4_, 556238 + i_5_ + i_7_, 1820161512)) * 8;
						} else {
							Region.heightMaps[i][i_4_][i_5_] = Region.heightMaps[i - 1][i_4_][i_5_] - 240;
						}
						break;
					}
					if (i_10_ == 1) {
						int i_11_ = rsbytebuffer.get();
						if (i_11_ == 1) {
							i_11_ = 0;
						}
						if (i == 0) {
							Region.heightMaps[0][i_4_][i_5_] = -i_11_ * 8;
						} else {
							Region.heightMaps[i][i_4_][i_5_] = (Region.heightMaps[i - 1][i_4_][i_5_] - (8 * i_11_));
						}
						break;
					}
					if (i_10_ <= 49) {
						Region.field_e_994[i][i_4_][i_5_] = rsbytebuffer.getSigned();
						Class_df.field_g_1610[i][i_4_][i_5_] = (byte) ((i_10_ - 2) / 4);
						ClanMember.field_f_808[i][i_4_][i_5_] = (byte) (((i_10_ - 2) + i_8_) & 0x3);
					} else if (i_10_ <= 81) {
						Region.sceneFlags[i][i_4_][i_5_] = (byte) (i_10_ - 49);
					} else {
						Bindable.field_y_1701[i][i_4_][i_5_] = (byte) (i_10_ - 81);
					}
				}
			} else {
				for (;;) {
					final int i_12_ = rsbytebuffer.get();
					if (i_12_ == 0) {
						break;
					}
					if (i_12_ == 1) {
						rsbytebuffer.get();
						break;
					}
					if (i_12_ <= 49) {
						rsbytebuffer.get();
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "as.g()");
		}
	}

	static void method_y_void(final int i) {
		try {
			Class_ax.username = Class_ax.username.trim();
			if (Class_ax.username.length() == 0) {
				Class_fl.method_g_void(MenuText.SALVE_1, MenuText.SALVE_2, MenuText.SALVE_3, -712585541);
			} else {
				final long l = Buffer.method_n_long(-2051782246);
				int returnCode;
				if (0L == l) {
					returnCode = 5;
				} else {
					returnCode = Class_fh.getLoginCode(l, Class_ax.username, -899193403);
				}
				switch (returnCode) {
				case 2:
					Class_fl.method_g_void(MenuText.EMPTY, MenuText.PAGE_OPENED, MenuText.field_ii_1999, -1158942808);
					Class_ax.loginScreenStatus = 590892270;
					break;
				case 3:
					Class_fl.method_g_void(MenuText.field_it_1823, MenuText.ERROR_CONNECTING, MenuText.EMPTY_, 915006457);
					break;
				case 4:
					Class_fl.method_g_void(MenuText.field_iy_2012, MenuText.field_iu_1915, MenuText.field_ij_2036, 1605122832);
					break;
				case 5:
					Class_fl.method_g_void(MenuText.SALVE_1, MenuText.SALVE_2, MenuText.SALVE_3, 267210041);
					break;
				case 6:
					Class_fl.method_g_void(MenuText.field_ib_2040, MenuText.field_in_2041, MenuText.field_jy_2042, -1425756928);
					break;
				case 7:
					Class_fl.method_g_void(MenuText.field_jg_2043, MenuText.field_jx_1920, MenuText.field_js_1964, 1808118154);
					break;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "as.y()");
		}
	}

	GameMessage(final int i, final String string, final String string_14_, final String string_15_) {
		this.field_d_301 = client.currentCycle * 2062756609;
		this.type = i * -2006860791;
		this.owner = string;
		this.message2 = string_14_;
		this.message = string_15_;
	}

	public static boolean method_f_boolean(final char c, final int i) {
		boolean bool;
		try {
			if (((c < '0') || (c > '9')) && ((c < 'A') || (c > 'Z')) && ((c < 'a') || (c > 'z'))) {
				return false;
			}
			bool = true;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "as.f()");
		}
		return bool;
	}

	public static String method_e_String(final byte[] is, final int i, final int i_16_, final int i_17_) {
		String string;
		try {
			final char[] cs = new char[i_16_];
			int i_18_ = 0;
			for (int i_19_ = 0; i_19_ < i_16_; i_19_++) {
				int i_20_ = is[i + i_19_] & 0xff;
				if (i_20_ != 0) {
					if ((i_20_ >= 128) && (i_20_ < 160)) {
						int i_21_ = Class_ev.field_n_2237[i_20_ - 128];
						if (i_21_ == 0) {
							i_21_ = 63;
						}
						i_20_ = i_21_;
					}
					cs[i_18_++] = (char) i_20_;
				}
			}
			string = new String(cs, 0, i_18_);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "as.e()");
		}
		return string;
	}
}
