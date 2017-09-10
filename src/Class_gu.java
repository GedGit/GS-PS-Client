/* Class_gu - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

@SuppressWarnings("rawtypes")
public class Class_gu implements Iterator {
	Node field_d_3048;
	Class_gz field_n_3049;
	Node field_z_3050 = null;

	Class_gu(final Class_gz class_gz) {
		this.field_n_3049 = class_gz;
		this.field_d_3048 = this.field_n_3049.field_n_3063.next;
		this.field_z_3050 = null;
	}

	@Override
	public Object next() {
		Node node = this.field_d_3048;
		if (node == this.field_n_3049.field_n_3063) {
			node = null;
			this.field_d_3048 = null;
		} else {
			this.field_d_3048 = node.next;
		}
		this.field_z_3050 = node;
		return node;
	}

	@Override
	public boolean hasNext() {
		if (this.field_d_3048 != this.field_n_3049.field_n_3063) {
			return true;
		}
		return false;
	}

	@Override
	public void remove() {
		if (this.field_z_3050 == null) {
			throw new IllegalStateException();
		}
		this.field_z_3050.removeLink();
		this.field_z_3050 = null;
	}
}
