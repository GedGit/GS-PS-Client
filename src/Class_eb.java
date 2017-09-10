/* Class_eb - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_eb {
	public static int field_f_1772;
	public static final int field_n_1773 = 0;
	public static final int field_z_1774 = 2;
	public static final int field_y_1775 = 3;
	public static final int field_e_1776 = 4;
	public static final int field_g_1777 = 5;
	static int field_ni_1778;
	public static final int field_d_1779 = 1;
	public static final int field_l_1780 = 30;
	public static final int field_u_1781 = 31;

	static Integer method_n_Integer(final Buffer rsbytebuffer, final short i) {
		try {
			int i_0_ = 0;
			boolean bool = false;
			for (;;) {
				final int i_1_ = rsbytebuffer.get();
				if (i_1_ == 255) {
					return bool ? Integer.valueOf(i_0_) : null;
				}
				if (i_1_ != 0) {
					throw new IllegalStateException("");
				}
				for (;;) {
					final int i_2_ = rsbytebuffer.get();
					if (i_2_ == 255) {
						break;
					}
					rsbytebuffer.position -= -685856689;
					if (rsbytebuffer.getShort() != 0) {
						throw new IllegalStateException("");
					}
					if (bool) {
						throw new IllegalStateException("");
					}
					i_0_ = rsbytebuffer.getInt();
					bool = true;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "eb.n()");
		}
	}

	Class_eb() throws Throwable {
		throw new Error();
	}
}
