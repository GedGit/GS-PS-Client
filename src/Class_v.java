/* Class_v - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Desktop;
import java.net.URI;

public class Class_v implements Identifiable {
	static final int field_j_1440 = 1170;
	static final Class_v field_d_1441 = new Class_v(1);
	static final Class_v field_n_1442 = new Class_v(0);
	final int id;
	static final int field_mx_1444 = 1024;
	static Class_bh field_ny_1445;
	static Rasterizer2D field_g_1446;
	static final Class_v field_z_1447 = new Class_v(2);
    static final Class_v aClass87_957 = new Class_v(3);

	@Override
	public int getId() {
		int i_0_;
		try {
			i_0_ = this.id * -322200749;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "v.d()");
		}
		return i_0_;
	}

	static void openURL(final String string, final boolean bool, final String string_1_, final boolean bool_2_, final int i) {
		try {
			if (bool) {
				do {
					if (!bool_2_ && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
						try {
							Desktop.getDesktop().browse(new URI(string));
						} catch (final Exception exception) {
							break;
						}
						return;
					}
				} while (false);
				if (Class_dv.field_d_1726.startsWith("win") && !bool_2_) {
					Region.method_y_boolean(string, 0, "openjs", 2112005495);
				} else if (Class_dv.field_d_1726.startsWith("mac")) {
					Region.method_y_boolean(string, 1, string_1_, 1857627022);
				} else {
					Region.method_y_boolean(string, 2, "openjs", 2134106790);
				}
			} else {
				Class_dv.method_z_boolean(string, 3, (byte) -40);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "v.d()");
		}
	}

	Class_v(final int i) {
		id = i * -557752101;
	}
}
