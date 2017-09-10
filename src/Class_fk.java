/* Class_fk - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_fk extends Node {
	public Class_du field_z_2383;
	public byte[] field_d_2384;
	int field_n_2385;
	public Index field_y_2386;
	static boolean field_g_2387;

	static final boolean method_ct_boolean(final int i, final byte i_0_) {
		boolean bool;
		try {
			if (i < 0) {
				return false;
			}
			int i_1_ = client.field_ik_2832[i];
			if (i_1_ >= 2000) {
				i_1_ -= 2000;
			}
			if (i_1_ == 1007) {
				return true;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fk.ct()");
		}
		return bool;
	}

	Class_fk() {
		/* empty */
	}
}
