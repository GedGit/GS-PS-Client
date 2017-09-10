/* Class_bp - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_bp {
	int field_n_614;
	int[] field_z_615;
	int field_d_616;
	int[] field_y_617;

	Class_bp() {
		Class_bz.method_y_int(16);
		this.field_n_614 = Class_bz.method_z_int() != 0 ? Class_bz.method_y_int(4) + 1 : 1;
		if (Class_bz.method_z_int() != 0) {
			Class_bz.method_y_int(8);
		}
		Class_bz.method_y_int(2);
		if (this.field_n_614 > 1) {
			this.field_d_616 = Class_bz.method_y_int(4);
		}
		this.field_z_615 = new int[this.field_n_614];
		this.field_y_617 = new int[this.field_n_614];
		for (int i = 0; i < this.field_n_614; i++) {
			Class_bz.method_y_int(8);
			this.field_z_615[i] = Class_bz.method_y_int(8);
			this.field_y_617[i] = Class_bz.method_y_int(8);
		}
	}
}
