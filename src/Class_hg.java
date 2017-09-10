/* Class_hg - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Comparator;

@SuppressWarnings("rawtypes")
final class Class_hg implements Comparator {
	int method_n_int(final Class_gg class_gg, final Class_gg class_gg_0_, final int i) {
		int i_1_;
		try {
			i_1_ = (((7907452213849456665L * class_gg.field_d_2998) < (class_gg_0_.field_d_2998 * 7907452213849456665L)) ? -1 : ((7907452213849456665L * class_gg.field_d_2998) == (class_gg_0_.field_d_2998 * 7907452213849456665L)) ? 0 : 1);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "hg.n()");
		}
		return i_1_;
	}

	@Override
	public int compare(final Object object, final Object object_2_) {
		int i;
		try {
			i = method_n_int((Class_gg) object, (Class_gg) object_2_, -1124116480);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "hg.compare()");
		}
		return i;
	}

	@Override
	public boolean equals(final Object object) {
		boolean bool;
		try {
			bool = super.equals(object);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "hg.equals()");
		}
		return bool;
	}
}
