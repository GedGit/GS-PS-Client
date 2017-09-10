/* Class_ez - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_ez implements Identifiable {
	public final int field_e_2266;
	public static final Class_ez field_d_2267 = new Class_ez(2, 1);
	public static final Class_ez field_n_2268 = new Class_ez(1, 0);
	public static final Class_ez field_y_2269 = new Class_ez(0, 3);
	final int id;
	public static final Class_ez field_z_2271 = new Class_ez(3, 2);
	static int[] field_w_2272;
	static final int field_a_2273 = 4;

	@Override
	public int getId() {
		int i_0_;
		try {
			i_0_ = this.id * 963386827;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ez.d()");
		}
		return i_0_;
	}

	Class_ez(final int i, final int i_1_) {
		field_e_2266 = i * -1144456771;
		id = i_1_ * 131211235;
	}
}
