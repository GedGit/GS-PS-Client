/* Class_dg - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_dg {
	static long field_n_1611;
	public static final int field_bv_1612 = 208;
	public static FileStore field_z_1613;
	static int buildExtensionId; 
	public static final int field_br_1615 = 192;
	static long field_d_1616;

	public static String method_n_String(final byte[] is, final int i, final int i_0_, final int i_1_) {
		String string;
		try {
			final StringBuilder stringbuilder = new StringBuilder();
			for (int i_2_ = i; i_2_ < (i_0_ + i); i_2_ += 3) {
				final int i_3_ = is[i_2_] & 0xff;
				stringbuilder.append(Class_ep.field_n_2194[i_3_ >>> 2]);
				if (i_2_ < (i_0_ - 1)) {
					final int i_4_ = is[1 + i_2_] & 0xff;
					stringbuilder.append(Class_ep.field_n_2194[((i_3_ & 0x3) << 4) | (i_4_ >>> 4)]);
					if (i_2_ < (i_0_ - 2)) {
						final int i_5_ = is[i_2_ + 2] & 0xff;
						stringbuilder.append(Class_ep.field_n_2194[((i_4_ & 0xf) << 2) | (i_5_ >>> 6)]).append(Class_ep.field_n_2194[i_5_ & 0x3f]);
					} else {
						stringbuilder.append(Class_ep.field_n_2194[(i_4_ & 0xf) << 2]).append("=");
					}
				} else {
					stringbuilder.append(Class_ep.field_n_2194[(i_3_ & 0x3) << 4]).append("==");
				}
			}
			string = stringbuilder.toString();
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dg.n()");
		}
		return string;
	}

	Class_dg() throws Throwable {
		throw new Error();
	}

	static final void method_di_void(final Widget[] widgets, final int i, final int i_6_) {
		try {
			int i_7_ = 0;
			for (/**/; i_7_ < widgets.length; i_7_++) {
				final Widget widget = widgets[i_7_];
				if (widget != null) {
					if ((876728889 * widget.type) == 0) {
						if (widget.components != null) {
							method_di_void(widget.components, i, 1419649106);
						}
						final Menu interfacepositionnode = ((Menu) (client.menuTable.method_n_ga(-560181405 * widget.uid)));
						if (interfacepositionnode != null) {
							final int i_8_ = (44103667 * interfacepositionnode.interfaceId);
							if (Class_fz.loadWidget(i_8_, -792118191)) {
								method_di_void(Widget.widgets[i_8_], i, 432885544);
							}
						}
					}
					if ((i == 0) && (widget.field_dr_2649 != null)) {
						final Script class_n = new Script();
						class_n.parent = widget;
						class_n.parameters = widget.field_dr_2649;
						Menu.handleCS2Script(class_n, 200000);
					}
					if ((i == 1) && (widget.field_dw_2575 != null)) {
						if ((widget.field_k_2544 * -2038048459) >= 0) {
							final Widget widget_9_ = Class_en.getWidgetByUID((widget.uid * -560181405), (short) 4932);
							if ((widget_9_ == null) || (widget_9_.components == null) || ((widget.field_k_2544 * -2038048459) >= widget_9_.components.length) || ((widget_9_.components[widget.field_k_2544 * -2038048459]) != widget)) {
								continue;
							}
						}
						final Script class_n = new Script();
						class_n.parent = widget;
						class_n.parameters = widget.field_dw_2575;
						Menu.handleCS2Script(class_n, 200000);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dg.di()");
		}
	}
}
