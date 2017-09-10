/* Class_dv - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;

public class Class_dv {
	public static String field_d_1726 = null;
	public static final int field_cm_1727 = 194;
	public static Applet field_n_1728 = null;
	static final int field_g_1729 = 3;
	static final int field_u_1730 = 202;
	public static final int field_a_1731 = 9;
	static final int field_ao_1732 = 40;
	static final int field_z_1733 = 0;
	static final int field_y_1734 = 8;

	Class_dv() throws Throwable {
		throw new Error();
	}

	static int method_n_int(final int i, final int i_0_, final int i_1_) {
		int i_2_;
		try {
			final ItemContainer itemcontainer = ((ItemContainer) ItemContainer.itemContainerTable.method_n_ga(i));
			i_2_ = (itemcontainer == null ? -1 : ((i_0_ >= 0) && (i_0_ < itemcontainer.ids.length)) ? itemcontainer.ids[i_0_] : -1);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dv.n()");
		}
		return i_2_;
	}

	static boolean method_z_boolean(final String string, final int i, final byte i_3_) {
		boolean bool;
		try {
			bool = Region.method_y_boolean(string, i, "openjs", 1814382310);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dv.z()");
		}
		return bool;
	}
}
