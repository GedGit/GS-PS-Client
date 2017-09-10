/* Class_gx - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

@SuppressWarnings("rawtypes")
public class Class_gx implements Iterator {
	IterableHashTable field_n_3056;
	Node field_y_3057 = null;
	int field_z_3058;
	Node field_d_3059;

	void method_n_void() {
		this.field_d_3059 = (this.field_n_3056.buckets[0].next);
		this.field_z_3058 = 1;
		this.field_y_3057 = null;
	}

	Class_gx(final IterableHashTable iterablehashtable) {
		this.field_n_3056 = iterablehashtable;
		method_n_void();
	}

	@Override
	public boolean hasNext() {
		if (this.field_d_3059 != (this.field_n_3056.buckets[this.field_z_3058 - 1])) {
			return true;
		}
		while (this.field_z_3058 < (this.field_n_3056.field_n_3053)) {
			if ((this.field_n_3056.buckets[this.field_z_3058++].next) != (this.field_n_3056.buckets[this.field_z_3058 - 1])) {
				this.field_d_3059 = (this.field_n_3056.buckets[this.field_z_3058 - 1].next);
				return true;
			}
			this.field_d_3059 = (this.field_n_3056.buckets[this.field_z_3058 - 1]);
		}
		return false;
	}

	@Override
	public void remove() {
		if (this.field_y_3057 == null) {
			throw new IllegalStateException();
		}
		this.field_y_3057.removeLink();
		this.field_y_3057 = null;
	}

	@Override
	public Object next() {
		if (this.field_d_3059 != (this.field_n_3056.buckets[this.field_z_3058 - 1])) {
			final Node node = this.field_d_3059;
			this.field_d_3059 = node.next;
			this.field_y_3057 = node;
			return node;
		}
		Node node;
		do {
			if (this.field_z_3058 >= (this.field_n_3056.field_n_3053)) {
				return null;
			}
			node = (this.field_n_3056.buckets[this.field_z_3058++].next);
		} while (node == (this.field_n_3056.buckets[this.field_z_3058 - 1]));
		this.field_d_3059 = node.next;
		this.field_y_3057 = node;
		return node;
	}
}
