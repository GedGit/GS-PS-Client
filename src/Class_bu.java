/* Class_bu - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class_bu extends Node {
	int field_j_657;
	Class_bu field_r_658;
	Class_bn field_s_659;
	volatile boolean field_v_660 = true;

	final void method_fn_void(final int[] is, final int i, final int i_0_) {
		if (this.field_v_660) {
			method_a_void(is, i, i_0_);
		} else {
			method_l_void(i_0_);
		}
	}

	protected abstract Class_bu method_f_bu();

	protected abstract int method_m_int();

	int method_ay_int() {
		return 255;
	}

	protected abstract void method_a_void(int[] is, int i, int i_1_);

	protected abstract Class_bu method_g_bu();

	protected Class_bu() {
		/* empty */
	}

	protected abstract void method_l_void(int i);
}
