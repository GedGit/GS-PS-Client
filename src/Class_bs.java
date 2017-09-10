/* Class_bs - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_bs {
	int field_f_642;
	int field_e_643;
	int field_l_644;
	int[] field_z_645 = new int[2];
	int field_g_646;
	int field_n_647 = 2;
	int field_m_648;
	int field_a_649;
	int field_h_650;
	int[] field_d_651 = new int[2];
	int field_y_652;

	final void method_d_void(final Buffer rsbytebuffer) {
		this.field_n_647 = rsbytebuffer.get();
		this.field_d_651 = new int[this.field_n_647];
		this.field_z_645 = new int[this.field_n_647];
		for (int i = 0; i < this.field_n_647; i++) {
			this.field_d_651[i] = rsbytebuffer.getShort();
			this.field_z_645[i] = rsbytebuffer.getShort();
		}
	}

	final void method_z_void() {
		this.field_m_648 = 0;
		this.field_a_649 = 0;
		this.field_h_650 = 0;
		this.field_l_644 = 0;
		this.field_y_652 = 0;
	}

	final int method_y_int(final int i) {
		if (this.field_y_652 >= this.field_m_648) {
			this.field_l_644 = (this.field_z_645[this.field_a_649++]) << 15;
			if (this.field_a_649 >= this.field_n_647) {
				this.field_a_649 = this.field_n_647 - 1;
			}
			this.field_m_648 = (int) (((this.field_d_651[this.field_a_649]) / 65536.0) * i);
			if (this.field_m_648 > this.field_y_652) {
				this.field_h_650 = ((((this.field_z_645[this.field_a_649]) << 15) - this.field_l_644) / (this.field_m_648 - this.field_y_652));
			}
		}
		this.field_l_644 += this.field_h_650;
		this.field_y_652++;
		return ((this.field_l_644 - this.field_h_650) >> 15);
	}

	final void method_n_void(final Buffer rsbytebuffer) {
		this.field_f_642 = rsbytebuffer.get();
		this.field_e_643 = rsbytebuffer.getInt();
		this.field_g_646 = rsbytebuffer.getInt();
		method_d_void(rsbytebuffer);
	}

	Class_bs() {
		this.field_d_651[0] = 0;
		this.field_d_651[1] = 65535;
		this.field_z_645[0] = 0;
		this.field_z_645[1] = 65535;
	}
}
