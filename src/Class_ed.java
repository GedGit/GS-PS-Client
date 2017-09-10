/* Class_ed - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_ed {
	static Rasterizer2D[] mapfunction;
	static final int field_d_2058 = 1048576;
	static final String field_z_2059 = "rw";
	static final String field_f_2060 = "main_file_cache.dat2";
	static int plane;
	public static CacheFile mainDatFile = null; 
	public static CacheFile metaFile = null;
	public static CacheFile[] cacheIndices;
	static String[] field_j_2065;
	static final int field_n_2066 = 1048576000;
	public static String field_c_2067;
	static String cache_dir;
	static CacheFile field_l_2069 = null;
	public static final int field_eg_2070 = 198;
	static int field_ix_2071;
	static final int field_v_2072 = 1;

	Class_ed() throws Throwable {
		throw new Error();
	}

	static final void method_cb_void(final int i, final int i_0_, final byte i_1_) {
		try {
			int i_2_ = IdentityKit.b12Full.getTextWidth(MenuText.field_eg_1936);
			for (int i_3_ = 0; i_3_ < (-224642011 * client.currentMenuSize); i_3_++) {
				final Class_hd class_hd = IdentityKit.b12Full;
				String string;
				if (client.menuOptions[i_3_].length() > 0) {
					string = new StringBuilder(client.menuActions[i_3_]).append(MenuText.field_fq_1943).append(client.menuOptions[i_3_]).toString();
				} else {
					string = client.menuActions[i_3_];
				}
				final int i_4_ = class_hd.getTextWidth(string);
				if (i_4_ > i_2_) {
					i_2_ = i_4_;
				}
			}
			i_2_ += 8;
			final int i_5_ = 22 + (client.currentMenuSize * 925337131);
			int i_6_ = i - (i_2_ / 2);
			if ((i_2_ + i_6_) > (Boundary.clientWidth * -1236640339)) {
				i_6_ = (Boundary.clientWidth * -1236640339) - i_2_;
			}
			if (i_6_ < 0) {
				i_6_ = 0;
			}
			int i_7_ = i_0_;
			if ((i_0_ + i_5_) > (Projectile.clientHeight * -1483492575)) {
				i_7_ = (-1483492575 * Projectile.clientHeight) - i_5_;
			}
			if (i_7_ < 0) {
				i_7_ = 0;
			}
			client.isMenuOpen = true;
			Class_fm.menuX = 1404601127 * i_6_;
			Class_dw.menuY = i_7_ * 1674404369;
			Class_eh.menuWidth = i_2_ * 581011069;
			Class_ev.menuHeight = -1985607674 + (client.currentMenuSize * -2042243293);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ed.cb()");
		}
	}

	public static int method_g_int(final int i, final int i_8_, final int i_9_) {
		int i_10_;
		try {
			final int i_11_ = i >>> 31;
			i_10_ = ((i_11_ + i) / i_8_) - i_11_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ed.g()");
		}
		return i_10_;
	}
}
