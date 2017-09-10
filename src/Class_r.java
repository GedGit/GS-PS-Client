/* Class_r - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.IOException;

public final class Class_r extends Node {
	int field_h_1324;
	int field_d_1325;
	int field_y_1326;
	int field_e_1327;
	int field_z_1328;
	int field_g_1329;
	static final int field_lo_1330 = 100;
	int field_m_1331;
	int field_f_1332;
	public static final int field_w_1333 = 26;
	int field_l_1334 = 0;
	int field_u_1335 = -336088303;
	static int field_ox_1336;
	int field_a_1337;
	int plane;
	public static final int field_eu_1339 = 136;
	public static final int field_t_1340 = 19136800;

	Class_r() {
		/* empty */
	}

	static boolean isIgnored(final String string) {
		try {
			if (string == null) {
				return false;
			}
			final String string_0_ = Class_bg.method_d_String(string, Class_fd.field_h_2308, 1293117927);
			for (int i_1_ = 0; i_1_ < (-1756810877 * client.field_pa_2851); i_1_++) {
				final Ignore class_m = client.ignores[i_1_];
				if (string_0_.equalsIgnoreCase(Class_bg.method_d_String(class_m.name, Class_fd.field_h_2308, -525722303))) {
					return true;
				}
				if (string_0_.equalsIgnoreCase(Class_bg.method_d_String(class_m.previousName, Class_fd.field_h_2308, 697966119))) {
					return true;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "r.dp()");
		}
		return false;
	}

	static String method_ej_String(final Widget widget, final int i, final byte i_2_) {
		String string;
		try {
			string = (!(Class_e.method_d_boolean(Class_db.method_en_int(widget, -1663863829), i, (byte) 6)) && (widget.field_dl_2642 == null) ? null : ((widget.actions != null) && (widget.actions.length > i) && (widget.actions[i] != null) && (widget.actions[i].trim().length() != 0)) ? widget.actions[i] : null);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "r.ej()");
		}
		return string;
	}

	public static void initCacheDirectory(final String string, final String string_3_, final int i, final int i_4_, final int i_5_) throws IOException {
		try {
			Class_ep.indexAmount = i_4_ * 1167024477;
			Class_dg.buildExtensionId = i * -1227733589; 
			try {
				Class_cr.field_p_1240 = System.getProperty("os.name");
			} catch (final Exception exception) {
				Class_cr.field_p_1240 = "Unknown";
			}
			Class_ed.field_c_2067 = Class_cr.field_p_1240.toLowerCase();
			try {
				Class_ed.cache_dir = System.getProperty("user.home");
				if (Class_ed.cache_dir != null) {
					Class_ed.cache_dir = new StringBuilder(Class_ed.cache_dir).append("/").toString();
				}
			} catch (final Exception exception) { 
				/* empty */
			}
			try {
				if (Class_ed.field_c_2067.startsWith("win")) {
					if (Class_ed.cache_dir == null) {
						Class_ed.cache_dir = System.getenv("USERPROFILE");
					}
				} else if (Class_ed.cache_dir == null) {
					Class_ed.cache_dir = System.getenv("HOME");
				}
				if (Class_ed.cache_dir != null) {
					Class_ed.cache_dir = new StringBuilder(Class_ed.cache_dir).append("/").toString();
				}
			} catch (final Exception exception) {
				/* empty */
			}
			if (Class_ed.cache_dir == null) {
				Class_ed.cache_dir = "~/";
			}
			Bindable.field_r_1704 = new String[] { Class_ed.cache_dir+"/Salve-PS/"};
			Class_ed.field_j_2065 = (new String[] { Class_ed.cache_dir+"/Salve-PS/"});
			int i_6_ = 0;
			while_5_: while (i_6_ < 4) {
				final String string_7_ = (i_6_ == 0 ? "" : new StringBuilder().append(i_6_).toString());
				Class_ge.field_y_2979 = new File(Class_ed.cache_dir, new StringBuilder("salve_").append(string).append("_").append(string_3_).append(string_7_).append(".dat").toString());
				String string_8_ = null;
				String string_9_ = null;
				boolean bool = false;
				if (Class_ge.field_y_2979.exists()) {
					try {
						final SeekableFile class_hh = new SeekableFile(Class_ge.field_y_2979, "rw", 10000L);
						int i_10_;
						Buffer rsbytebuffer;
						for (rsbytebuffer = new Buffer((int) class_hh.length()); ((-1485345105 * rsbytebuffer.position) < rsbytebuffer.buffer.length); rsbytebuffer.position += i_10_ * -685856689) {
							i_10_ = (class_hh.read(rsbytebuffer.buffer, -1485345105 * rsbytebuffer.position, (rsbytebuffer.buffer.length - (rsbytebuffer.position * -1485345105))));
							if (i_10_ == -1) {
								throw new IOException();
							}
						}
						rsbytebuffer.position = 0;
						i_10_ = rsbytebuffer.get();
						if ((i_10_ < 1) || (i_10_ > 3)) {
							throw new IOException(new StringBuilder().append(i_10_).toString());
						}
						int i_11_ = 0;
						if (i_10_ > 1) {
							i_11_ = rsbytebuffer.get();
						}
						if (i_10_ <= 2) {
							string_8_ = rsbytebuffer.method_ak_String(-1266582048);
							if (i_11_ == 1) {
								string_9_ = rsbytebuffer.method_ak_String(-1616505076);
							}
						} else {
							string_8_ = System.getProperty("user.home")+"/Salve-PS/oldschool/LIVE";
							if (i_11_ == 1) {
								string_9_ = rsbytebuffer.method_ae_String((byte) -6);
							}
						}
						class_hh.close();
					} catch (final IOException ioexception) {
						ioexception.printStackTrace();
					}
					if (string_8_ != null) {
						final File file = new File(string_8_);
						//System.out.println(file.getAbsolutePath());
						if (!file.exists()) {
							string_8_ = null;
						}
					}
					if (string_8_ != null) {
						final File file = new File(string_8_, "test.dat");
						if (!FloorUnderlay.method_z_boolean(file, true, 1753241089)) {
							string_8_ = null;
						}
					}
				}
				if ((string_8_ == null) && (i_6_ == 0)) {
					while_4_: for (int i_12_ = 0; i_12_ < Class_ed.field_j_2065.length; i_12_++) {
						for (int i_13_ = 0; i_13_ < Bindable.field_r_1704.length; i_13_++) {
							final File file = new File(new StringBuilder(Bindable.field_r_1704[i_13_]).append(Class_ed.field_j_2065[i_12_]).append(File.separatorChar).append(string).append(File.separatorChar).toString());
							//System.out.println(file.getAbsolutePath());
							if (file.exists() && (FloorUnderlay.method_z_boolean(new File(file, "test.dat"), true, 1753241089))) {
								string_8_ = file.toString();
								bool = true;
								break while_4_;
							}
						}
					}
				}
				if (string_8_ == null) {
					string_8_ = new StringBuilder(Class_ed.cache_dir).append(File.separatorChar).append("Salve-PS").append(string_7_).append(File.separatorChar).append(string).append(File.separatorChar).append(string_3_).append(File.separatorChar).toString();
					bool = true;
				}
				if (string_9_ != null) {
					final File file = new File(string_9_);
					final File file_14_ = new File(string_8_);
					try {
						final File[] files = file.listFiles();
						final File[] files_15_ = files;
						for (final File file_17_ : files_15_) {
							final File file_18_ = new File(file_14_, file_17_.getName());
							final boolean bool_19_ = file_17_.renameTo(file_18_);
							if (!bool_19_) {
								throw new IOException();
							}
						}
					} catch (final Exception exception) {
						exception.printStackTrace();
					}
					bool = true;
				}
				if (bool) {
					GroundItem.method_d_void(new File(string_8_), null, 720991244);
				}
				final File file = new File(string_8_);
				Class_am.field_e_191 = file;
				if (!Class_am.field_e_191.exists()) {
					Class_am.field_e_191.mkdirs();
				}
				final File[] files = Class_am.field_e_191.listFiles();
				if (files == null) {
					break;
				}
				final File[] files_20_ = files;
				int i_21_ = 0;
				for (;;) {
					if (i_21_ >= files_20_.length) {
						break while_5_;
					}
					final File file_22_ = files_20_[i_21_];
					if (!FloorUnderlay.method_z_boolean(file_22_, false, 1753241089)) {
						i_6_++;
						break;
					}
					i_21_++;
				}
			}
			Class_cq.method_n_void(Class_am.field_e_191, (short) 16753);
			SceneTile.method_e_void(1915061120);
			Class_ed.mainDatFile = (new CacheFile(new SeekableFile(Class_dd.openFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0));
			Class_ed.metaFile = new CacheFile(new SeekableFile((Class_dd.openFile("main_file_cache.idx255")), "rw", 1048576L), 6000, 0);
			Class_ed.cacheIndices = new CacheFile[Class_ep.indexAmount * 22018805];
			for (i_6_ = 0; i_6_ < (22018805 * Class_ep.indexAmount); i_6_++) {
				Class_ed.cacheIndices[i_6_] = new CacheFile(new SeekableFile((Class_dd.openFile(new StringBuilder("main_file_cache.idx").append(i_6_).toString())), "rw", 1048576L), 6000, 0);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "r.n()");
		}
	}

	static String colorString(final int i) {
		String string;
		try {
			string = new StringBuilder("<col=").append(Integer.toHexString(i)).append(">").toString();
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "r.n()");
		}
		return string;
	}
}
