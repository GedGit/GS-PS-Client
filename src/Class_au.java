/* Class_au - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_au extends Class_bu {
	NodeDeque field_n_367 = new NodeDeque();
	NodeDeque field_d_368 = new NodeDeque();
	int field_y_369 = -1;
	int field_z_370 = 0;

	public final synchronized void method_d_void(final Class_bu class_bu) {
		class_bu.removeLink();
	}

	void method_z_void() {
		if (this.field_z_370 > 0) {
			for (Class_bj class_bj = (Class_bj) this.field_d_368.method_f_ga(); class_bj != null; class_bj = (Class_bj) this.field_d_368.method_a_ga()) {
				class_bj.field_n_576 -= this.field_z_370;
			}
			this.field_y_369 -= this.field_z_370;
			this.field_z_370 = 0;
		}
	}

	void method_y_void(Node node, final Class_bj class_bj) {
		for (/**/; ((node != this.field_d_368.tail) && (((Class_bj) node).field_n_576 <= class_bj.field_n_576)); node = node.next) {
			/* empty */
		}
		NodeDeque.method_y_void(class_bj, node);
		this.field_y_369 = (((Class_bj) this.field_d_368.tail.next).field_n_576);
	}

	void method_e_void(final Class_bj class_bj) {
		class_bj.removeLink();
		class_bj.method_n_void();
		final Node node = this.field_d_368.tail.next;
		if (node == this.field_d_368.tail) {
			this.field_y_369 = -1;
		} else {
			this.field_y_369 = ((Class_bj) node).field_n_576;
		}
	}

	@Override
	protected int method_m_int() {
		return 0;
	}

	@Override
	public final synchronized void method_a_void(final int[] is, int i, int i_0_) {
		do {
			if (this.field_y_369 < 0) {
				method_h_void(is, i, i_0_);
				break;
			}
			if ((this.field_z_370 + i_0_) < this.field_y_369) {
				this.field_z_370 += i_0_;
				method_h_void(is, i, i_0_);
				break;
			}
			final int i_1_ = (this.field_y_369 - this.field_z_370);
			method_h_void(is, i, i_1_);
			i += i_1_;
			i_0_ -= i_1_;
			this.field_z_370 += i_1_;
			method_z_void();
			final Class_bj class_bj = (Class_bj) this.field_d_368.method_f_ga();
			synchronized (class_bj) {
				final int i_2_ = class_bj.method_d_int(this);
				if (i_2_ < 0) {
					class_bj.field_n_576 = 0;
					method_e_void(class_bj);
				} else {
					class_bj.field_n_576 = i_2_;
					method_y_void(class_bj.next, class_bj);
				}
			}
		} while (i_0_ != 0);
	}

	@Override
	public final synchronized void method_l_void(int i) {
		do {
			if (this.field_y_369 < 0) {
				method_u_void(i);
				break;
			}
			if ((this.field_z_370 + i) < this.field_y_369) {
				this.field_z_370 += i;
				method_u_void(i);
				break;
			}
			final int i_3_ = (this.field_y_369 - this.field_z_370);
			method_u_void(i_3_);
			i -= i_3_;
			this.field_z_370 += i_3_;
			method_z_void();
			final Class_bj class_bj = (Class_bj) this.field_d_368.method_f_ga();
			synchronized (class_bj) {
				final int i_4_ = class_bj.method_d_int(this);
				if (i_4_ < 0) {
					class_bj.field_n_576 = 0;
					method_e_void(class_bj);
				} else {
					class_bj.field_n_576 = i_4_;
					method_y_void(class_bj.next, class_bj);
				}
			}
		} while (i != 0);
	}

	@Override
	protected Class_bu method_g_bu() {
		return (Class_bu) this.field_n_367.method_f_ga();
	}

	public final synchronized void method_n_void(final Class_bu class_bu) {
		this.field_n_367.method_z_void(class_bu);
	}

	void method_h_void(final int[] is, final int i, final int i_5_) {
		for (Class_bu class_bu = (Class_bu) this.field_n_367.method_f_ga(); class_bu != null; class_bu = (Class_bu) this.field_n_367.method_a_ga()) {
			class_bu.method_fn_void(is, i, i_5_);
		}
	}

	void method_u_void(final int i) {
		for (Class_bu class_bu = (Class_bu) this.field_n_367.method_f_ga(); class_bu != null; class_bu = (Class_bu) this.field_n_367.method_a_ga()) {
			class_bu.method_l_void(i);
		}
	}

	@Override
	protected Class_bu method_f_bu() {
		return (Class_bu) this.field_n_367.method_a_ga();
	}
}
