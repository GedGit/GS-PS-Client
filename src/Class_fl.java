/* Class_fl - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_fl {
	static final String field_h_2388 = "random.dat";

	Class_fl() throws Throwable {
		throw new Error();
	}

	static final void method_dl_void(final Widget widget, final int i, final int i_0_, final int i_1_) {
		try {
			if ((client.field_jt_2801 == null) && !client.isMenuOpen && (widget != null) && (Class_ep.method_dk_fy(widget, (byte) -117) != null)) {
				client.field_jt_2801 = widget;
				client.field_jj_2861 = Class_ep.method_dk_fy(widget, (byte) -94);
				client.field_jr_2862 = i * 1009950875;
				client.field_jn_2863 = i_0_ * -1350475999;
				SceneObject.field_kn_935 = 0;
				client.field_jz_2871 = false;
				if ((-224642011 * client.currentMenuSize) > 0) {
					Class_cq.method_dm_void((client.currentMenuSize * -224642011) - 1, (byte) 1);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fl.dl()");
		}
	}

	static void method_g_void(final String string, final String string_2_, final String string_3_, final int i) {
		try {
			Class_ax.loginResponseMessage = string;
			Class_ax.loginResponseMessage1 = string_2_;
			Class_ax.loginResponseMessage2 = string_3_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fl.g()");
		}
	}
}
