/* Class_gf - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_gf {
	final String field_l_2982;
	static final Class_gf field_d_2983 = new Class_gf(1, 1, "", "");
	public static final Class_gf field_n_2984 = new Class_gf(6, 0, "", "");
	static final Class_gf field_y_2985 = new Class_gf(7, 3, "", "");
	static final Class_gf field_e_2986 = new Class_gf(8, 4, "", "");
	protected static boolean field_rd_2987;
	static final Class_gf field_f_2988 = new Class_gf(0, 6, "", "");
	static final Class_gf field_z_2990 = new Class_gf(4, 2, "", "");
	public static final Class_gf field_a_2989 = new Class_gf(5, -1, "", "", true, new Class_gf[] { field_n_2984, field_d_2983, field_z_2990, field_e_2986, field_y_2985 });
	public final int field_h_2991;
	static final Class_gf field_g_2992 = new Class_gf(3, 5, "", "");
	static int originY;
	static final Class_gf field_m_2994 = new Class_gf(2, 7, "", "");
	static final int field_pw_2995 = 400;
	public static final int field_bt_2996 = 186;

	Class_gf(final int i, final int i_0_, final String string, final String string_1_) {
		field_h_2991 = 1840350935 * i;
		field_l_2982 = string_1_;
	}

	Class_gf(final int i, final int i_2_, final String string, final String string_3_, final boolean bool, final Class_gf[] class_gfs) {
		field_h_2991 = i * 1840350935;
		field_l_2982 = string_3_;
	}

	@Override
	public String toString() {
		String string;
		try {
			string = this.field_l_2982;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "gf.toString()");
		}
		return string;
	}
}
