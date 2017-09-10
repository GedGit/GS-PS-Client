/* Class_ab - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.IOException;
import java.util.Calendar;

public class Class_ab {
	static Index soundFXIndex3;
	public static final int field_bj_15 = 71;
	static int field_x_16 = 0;
	static int[][] field_g_17 = new int[5][5000];
	static int[] intStack = new int[1000];  
	static String[] strStack = new String[1000];
	static int field_a_20 = 0;
	static Class_k[] field_h_21 = new Class_k[50];
	static final Calendar CALENDAR = Calendar.getInstance();
	static final String[] MONTHS = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
	public static final int field_bg_24 = 74;
	static final int field_d_25 = 2000000;
	static int[] cs2Integers;
	static final int field_ct_27 = 102;
	static final int field_aa_28 = 40;
	static int[] field_e_29 = new int[5];

	Class_ab() throws Throwable {
		throw new Error();
	}

	public static SeekableFile getSeekableFile(final String string, final String string_0_, final boolean bool, final byte i) {
		try {
			final File file = new File(Class_am.field_e_191, new StringBuilder("preferences").append(string).append(".dat").toString());
			do {
				if (file.exists()) {
					SeekableFile class_hh;
					try {
						final SeekableFile class_hh_1_ = new SeekableFile(file, "rw", 10000L);
						class_hh = class_hh_1_;
					} catch (final IOException ioexception) {
						break;
					}
					return class_hh;
				}
			} while (false);
			String string_2_ = "";
			if ((Class_dg.buildExtensionId * 1132367107) == 33) {
				string_2_ = "_rc";
			} else if ((1132367107 * Class_dg.buildExtensionId) == 34) {
				string_2_ = "_wip";
			}
			final File file_3_ = new File(Class_ed.cache_dir, new StringBuilder("salve_").append(string_0_).append("_preferences").append(string).append(string_2_).append(".dat").toString());
			do {
				if (!bool && file_3_.exists()) {
					SeekableFile class_hh;
					try {
						final SeekableFile class_hh_4_ = new SeekableFile(file_3_, "rw", 10000L);
						class_hh = class_hh_4_;
					} catch (final IOException ioexception) {
						break;
					}
					return class_hh;
				}
			} while (false);
			SeekableFile class_hh;
			try {
				final SeekableFile class_hh_5_ = new SeekableFile(file, "rw", 10000L);
				class_hh = class_hh_5_;
			} catch (final IOException ioexception) {
				throw new RuntimeException();
			}
			return class_hh;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ab.y()");
		}
	}

	static final boolean method_dt_boolean(final Widget widget, final int i) {
		try {
			if (widget.conditionType == null) {
				return false;
			}
			for (int i_6_ = 0; i_6_ < widget.conditionType.length; i_6_++) {
				final int i_7_ = Friend.method_dj_int(widget, i_6_, 62831281);
				final int i_8_ = widget.conditionValues[i_6_];
				if (widget.conditionType[i_6_] == 2) {
					if (i_7_ >= i_8_) {
						return false;
					}
				} else if (widget.conditionType[i_6_] == 3) {
					if (i_7_ <= i_8_) {
						return false;
					}
				} else if (widget.conditionType[i_6_] == 4) {
					if (i_8_ == i_7_) {
						return false;
					}
				} else if (i_8_ != i_7_) {
					return false;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ab.dt()");
		}
		return true;
	}

	public static int method_z_int(final int i, final int i_9_, int i_10_, int i_11_, int i_12_, final int i_13_, final int i_14_) {
		int i_15_;
		try {
			if ((i_13_ & 0x1) == 1) {
				final int i_16_ = i_11_;
				i_11_ = i_12_;
				i_12_ = i_16_;
			}
			i_10_ &= 0x3;
			i_15_ = (i_10_ == 0 ? i : i_10_ == 1 ? i_9_ : i_10_ == 2 ? 7 - i - (i_11_ - 1) : 7 - i_9_ - (i_12_ - 1));
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ab.z()");
		}
		return i_15_;
	}

	public static void method_n_void(final byte i) {
		try {
			Class_gt.field_n_3046 = new Class_gz();
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ab.n()");
		}
	}

	static void method_z_void(final int i, final int i_17_, final int i_18_, final ObjectComposite objectdef, final int i_19_, final int i_20_) {
		try {
			final Class_o class_o = new Class_o();
			class_o.field_d_1226 = -1481876209 * i;
			class_o.field_y_1223 = i_17_ * 775706752;
			class_o.field_e_1224 = 1246951552 * i_18_;
			int i_21_ = objectdef.width * 211338481;
			int i_22_ = 1201809627 * objectdef.length;
			if ((i_19_ == 1) || (i_19_ == 3)) {
				i_21_ = objectdef.length * 1201809627;
				i_22_ = objectdef.width * 211338481;
			}
			class_o.field_z_1225 = -207850880 * (i_17_ + i_21_);
			class_o.field_g_1229 = -335137664 * (i_18_ + i_22_);
			class_o.field_m_1228 = -1627648747 * objectdef.field_am_338;
			class_o.field_f_1231 = -2113800576 * objectdef.field_aj_340;
			class_o.field_h_1230 = -1005334193 * objectdef.field_ag_360;
			class_o.field_l_1221 = 987667539 * objectdef.field_ap_361;
			class_o.field_u_1227 = objectdef.field_af_362;
			if (objectdef.childrenIds != null) {
				class_o.field_x_1235 = objectdef;
				class_o.method_d_void(-223978771);
			}
			Class_o.field_n_1232.add(class_o);
			if (class_o.field_u_1227 != null) {
				class_o.field_q_1233 = ((-590944531 * class_o.field_h_1230) + (int) (Math.random() * ((class_o.field_l_1221 * 398192145) - (class_o.field_h_1230 * -590944531)))) * -1915527009;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ab.z()");
		}
	}
}
