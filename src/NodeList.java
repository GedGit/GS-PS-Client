/* Class_go - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class NodeList {
	Class_gc field_n_3029 = new Class_gc();
	Class_gc field_d_3030;

	public NodeList() {
		this.field_n_3029.field_y_2974 = this.field_n_3029;
		this.field_n_3029.field_e_2975 = this.field_n_3029;
	}

	public Class_gc method_z_gc() {
		final Class_gc class_gc = this.field_d_3030;
		if (class_gc == this.field_n_3029) {
			this.field_d_3030 = null;
			return null;
		}
		this.field_d_3030 = class_gc.field_y_2974;
		return class_gc;
	}

	public void add(final Class_gc class_gc) {
		if (class_gc.field_e_2975 != null) {
			class_gc.update();
		}
		class_gc.field_e_2975 = this.field_n_3029.field_e_2975;
		class_gc.field_y_2974 = this.field_n_3029;
		class_gc.field_e_2975.field_y_2974 = class_gc;
		class_gc.field_y_2974.field_e_2975 = class_gc;
	}

	public Class_gc method_d_gc() {
		final Class_gc class_gc = this.field_n_3029.field_y_2974;
		if (class_gc == this.field_n_3029) {
			this.field_d_3030 = null;
			return null;
		}
		this.field_d_3030 = class_gc.field_y_2974;
		return class_gc;
	}
}
