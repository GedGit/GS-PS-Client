/* Class_hq - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Class_hq {
	@SuppressWarnings("rawtypes")
	public final List field_n_3089;
	@SuppressWarnings("rawtypes")
	public static Comparator field_e_3090;
	@SuppressWarnings("rawtypes")
	public static Comparator field_z_3091;
	@SuppressWarnings("rawtypes")
	public static Comparator field_y_3092;
	@SuppressWarnings("rawtypes")
	public static Comparator field_d_3093 = new Class_hg();
	static final int field_s_3094 = 19;

	static {
		new Class_hc();
		field_z_3091 = new Class_gh();
		field_y_3092 = new Class_ge();
		field_e_3090 = new NpcDefinitions();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void method_n_void(final Comparator comparator, final boolean bool, final int i) {
		try {
			if (bool) {
				Collections.sort(field_n_3089, comparator);
			} else {
				Collections.sort(field_n_3089, Collections.reverseOrder(comparator));
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "hq.n()");
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Class_hq(final Buffer rsbytebuffer, final boolean bool) {
		final int i = rsbytebuffer.getShort();
		final boolean bool_0_ = rsbytebuffer.get() == 1;
		byte i_1_;
		if (bool_0_) {
			i_1_ = (byte) 1;
		} else {
			i_1_ = (byte) 0;
		}
		final int i_2_ = rsbytebuffer.getShort();
		field_n_3089 = new ArrayList(i_2_);
		for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
			field_n_3089.add(new Class_gg(rsbytebuffer, i_1_, i));
		}
	}
}
