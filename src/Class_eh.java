/* Class_eh - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class_eh {
	public static final int field_e_2119 = 8;
	public static final int field_m_2120 = 10;
	static final int field_aa_2121 = 0;
	public static int field_a_2122;
	public static final int field_g_2123 = 15;
	public static final int field_cl_2124 = 83;
	public static final int field_z_2125 = 4;
	static int menuWidth;

	Class_eh() throws Throwable {
		throw new Error();
	}

	public static boolean method_h_boolean(final char c, final int i) {
		boolean bool;
		try {
			bool = ((c >= ' ') && (c <= '~') ? true : (c >= '\u00a0') && (c <= '\u00ff') ? true : ((c == '\u20ac') || (c == '\u0152') || (c == '\u2014') || (c == '\u0153') || (c == '\u0178')));
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "eh.h()");
		}
		return bool;
	}
}
