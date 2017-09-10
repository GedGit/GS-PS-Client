/* Class_en - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_en {
	static final int field_bb_2178 = 32768;
	public static final int field_co_2179 = 206;
	public static final int field_n_2180 = 0;
	public static final int field_fw_2181 = 116;
	static final int field_nr_2182 = 50;

	public static Widget getWidgetByUID(final int i, final short i_0_) {
		Widget widget;
		try {
			final int i_1_ = i >> 16;
			final int i_2_ = i & 0xffff;
			if ((Widget.widgets[i_1_] == null) || (Widget.widgets[i_1_][i_2_] == null)) {
				final boolean bool = Class_fz.loadWidget(i_1_, 2042108958);
				if (!bool) {
					return null;
				}
			}
			widget = Widget.widgets[i_1_][i_2_];
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "en.d()");
		}
		return widget;
	}

	Class_en() throws Throwable {
		throw new Error();
	}

	@SuppressWarnings("rawtypes")
	static Class method_e_Class(final String string, final int i) throws ClassNotFoundException {
		Class var_class;
		try {
			var_class = (string
					.equals("B")
							? Byte.TYPE
							: string.equals("I") ? Integer.TYPE
									: string.equals("S") ? Short.TYPE
											: string.equals("J") ? Long.TYPE
													: string.equals("Z") ? Boolean.TYPE
															: string.equals("F") ? Float.TYPE
																	: string.equals("D") ? Double.TYPE
																			: string.equals("C")
																					? java.lang.Character.TYPE
																					: string.equals("void") ? Void.TYPE
																							: Class.forName(string));
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "en.e()");
		}
		return var_class;
	}
}
