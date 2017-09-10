/* Class_hc - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Comparator;

@SuppressWarnings("rawtypes")
final class Class_hc implements Comparator {
	public static FileStore field_n_3064;

	int method_n_int(final Class_gg class_gg, final Class_gg class_gg_0_, final int i) {
		int i_1_;
		try {
			i_1_ = (((class_gg.field_n_3000 * 1411512875) < (class_gg_0_.field_n_3000 * 1411512875)) ? -1 : ((class_gg.field_n_3000 * 1411512875) == (1411512875 * class_gg_0_.field_n_3000)) ? 0 : 1);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "hc.n()");
		}
		return i_1_;
	}

	@Override
	public int compare(final Object object, final Object object_2_) {
		int i;
		try {
			i = method_n_int((Class_gg) object, (Class_gg) object_2_, 1859574436);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "hc.compare()");
		}
		return i;
	}

	@Override
	public boolean equals(final Object object) {
		boolean bool;
		try {
			bool = super.equals(object);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "hc.equals()");
		}
		return bool;
	}
}
