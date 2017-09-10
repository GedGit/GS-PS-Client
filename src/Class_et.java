/* Class_et - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class_et {
	public static final int field_dd_2222 = 77;
	static Sprite[] mapscene;
	public static Socket connection;
	static final int field_d_2225 = 2;
	public static final int field_ay_2226 = 167;
	public static final int field_ax_2227 = 239;

	public static void method_e_void(final int i) {
		try {
			FloorUnderlay.field_d_69.method_y_void();
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "et.e()");
		}
	}

	Class_et() throws Throwable {
		throw new Error();
	}

	static void method_d_void(final int i, final int i_0_) {
		try {
			if ((i != -1) && Class_fz.loadWidget(i, 213706979)) {
				final Widget[] widgets = Widget.widgets[i];
				for (final Widget widget : widgets) {
					if (widget.field_cv_2623 != null) {
						final Script class_n = new Script();
						class_n.parent = widget;
						class_n.parameters = widget.field_cv_2623;
						Menu.handleCS2Script(class_n, 2000000);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "et.d()");
		}
	}
}
