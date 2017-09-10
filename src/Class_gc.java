/* Class_gc - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_gc {
	Class_gc field_y_2974;
	Class_gc field_e_2975;

	protected Class_gc() {
		/* empty */
	}

	public void update() {
		if (this.field_e_2975 != null) {
			this.field_e_2975.field_y_2974 = this.field_y_2974;
			this.field_y_2974.field_e_2975 = this.field_e_2975;
			this.field_y_2974 = null;
			this.field_e_2975 = null;
		}
	}
}
