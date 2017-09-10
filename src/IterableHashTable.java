/* IterableHashTable - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

@SuppressWarnings("rawtypes")
public final class IterableHashTable implements Iterable {
	Node field_z_3051;
	Node[] buckets;
	int field_n_3053;

	@Override
	public Iterator iterator() {
		return new Class_gx(this);
	}

	public void add(final Node node, final long l) {
		if (node.prev != null) {
			node.removeLink();
		}
		final Node node_0_ = (this.buckets[(int) (l & this.field_n_3053 - 1)]);
		node.prev = node_0_.prev;
		node.next = node_0_;
		node.prev.next = node;
		node.next.prev = node;
		node.id = l;
	}

	public void method_z_void() {
		int i = 0;
		while (i < this.field_n_3053) {
			final Node node = this.buckets[i];
			for (;;) {
				final Node node_1_ = node.next;
				if (node_1_ == node) {
					i++;
					break;
				}
				node_1_.removeLink();
			}
		}
		this.field_z_3051 = null;
	}

	public Node method_n_ga(final long l) {
		final Node node = (this.buckets[(int) (l & this.field_n_3053 - 1)]);
		for (this.field_z_3051 = node.next; this.field_z_3051 != node; this.field_z_3051 = this.field_z_3051.next) {
			if (this.field_z_3051.id == l) {
				final Node node_2_ = this.field_z_3051;
				this.field_z_3051 = this.field_z_3051.next;
				return node_2_;
			}
		}
		this.field_z_3051 = null;
		return null;
	}

	public IterableHashTable(final int i) {
		this.field_n_3053 = i;
		this.buckets = new Node[i];
		for (int i_3_ = 0; i_3_ < i; i_3_++) {
			final Node node = this.buckets[i_3_] = new Node();
			node.next = node;
			node.prev = node;
		}
	}
}
