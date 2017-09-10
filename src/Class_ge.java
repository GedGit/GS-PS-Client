
/* Class_ge - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.util.Comparator;

@SuppressWarnings("rawtypes")
final class Class_ge implements Comparator {
	static int[][] field_a_2977;
	static final int field_cb_2978 = 101;
	static File field_y_2979;
	static boolean[] isInterfaceLoaded;
	static final int field_e_2981 = 2;

	@Override
	public boolean equals(final Object object) {
		boolean bool;
		try {
			bool = super.equals(object);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ge.equals()");
		}
		return bool;
	}

	int method_n_int(final Class_gg class_gg, final Class_gg class_gg_0_, final int i) {
		int i_1_;
		try {
			i_1_ = class_gg.method_n_String(790454613).compareTo(class_gg_0_.method_n_String(1811125291));
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ge.n()");
		}
		return i_1_;
	}

	@Override
	public int compare(final Object object, final Object object_2_) {
		int i;
		try {
			i = method_n_int((Class_gg) object, (Class_gg) object_2_, -758567955);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ge.compare()");
		}
		return i;
	}

	static void method_cn_void(final int i, final int i_3_, final int i_4_) {
		try {
			client.encryptedBuffer.writeOpcode(3);
			client.encryptedBuffer.putLEShort(i_3_, (byte) 2);
			client.encryptedBuffer.putInt1(i, 607620027);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ge.cn()");
		}
	}

	public static Widget method_z_fy(final int i, final int i_5_, final byte i_6_) {
		Widget widget;
		try {
			final Widget widget_7_ = Class_en.getWidgetByUID(i, (short) 20971);
			widget = (i_5_ == -1 ? widget_7_
					: ((widget_7_ != null) && (widget_7_.components != null) && (i_5_ < widget_7_.components.length))
							? widget_7_.components[i_5_] : null);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ge.z()");
		}
		return widget;
	}
}
