/* Class_dz - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;

import netscape.javascript.JSObject;

public class Class_dz {
	public static void method_n_void(final Applet applet, final String string, final int i) throws Throwable {
		try {
			JSObject.getWindow(applet).eval(string);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dz.n()");
		}
	}

	public static Object method_d_Object(final Applet applet, final String string, final Object[] objects, final int i) throws Throwable {
		Object object;
		try {
			object = JSObject.getWindow(applet).call(string, objects);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dz.d()");
		}
		return object;
	}

	Class_dz() throws Throwable {
		throw new Error();
	}
}
