/* Class_fz - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_fz {
	public static final int field_n_2676 = 7;
	public static final int field_z_2677 = 5;
	public static final int field_u_2678 = 1;
	public static final int field_y_2679 = 8;
	public static final int field_a_2680 = 3;
	public static final int field_e_2681 = 14;
	static final int field_co_2682 = 128;

	Class_fz() throws Throwable {
		throw new Error();
	}

	public static boolean loadWidget(final int i, final int i_0_) {
		try {
			if (Class_ge.isInterfaceLoaded[i]) {
				return true;
			}
			if (!Widget.field_z_2666.method_g_boolean(i, (byte) 8)) {
				return false;
			}
			final int i_1_ = Widget.field_z_2666.method_q_int(i, -1687862477);
			if (i_1_ == 0) {
				Class_ge.isInterfaceLoaded[i] = true;
				return true;
			}
			if (Widget.widgets[i] == null) {
				Widget.widgets[i] = new Widget[i_1_];
			}
			for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
				if (Widget.widgets[i][i_2_] == null) {
					final byte[] is = Widget.field_z_2666.getArchive(i, i_2_);
					if (is != null) {
						Widget.widgets[i][i_2_] = new Widget();
						Widget.widgets[i][i_2_].uid = -1348490677 * (i_2_ + (i << 16));
						if (is[0] == -1) {
							Widget.widgets[i][i_2_].method_f_void(new Buffer(is), -841131588);
						} else {
							Widget.widgets[i][i_2_].method_g_void(new Buffer(is), -849763892);
						}
					}
				}
			}
			Class_ge.isInterfaceLoaded[i] = true;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fz.y()");
		}
		return true;
	}
}
