/* HashTable - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class NodeMultiSet {
	int capacity;
	Node bottom;
	Node top;
	Node[] buckets;
	int position = 0;

	public Node method_n_ga(final long l) {
		final Node node = (this.buckets[(int) (l & this.capacity - 1)]);
		for (this.top = node.next; this.top != node; this.top = this.top.next) {
			if (this.top.id == l) {
				final Node node_0_ = this.top;
				this.top = this.top.next;
				return node_0_;
			}
		}
		this.top = null;
		return null;
	}

	public void method_d_void(final Node node, final long l) {
		if (node.prev != null) {
			node.removeLink();
		}
		final Node node_1_ = (this.buckets[(int) (l & this.capacity - 1)]);
		node.prev = node_1_.prev;
		node.next = node_1_;
		node.prev.next = node;
		node.next.prev = node;
		node.id = l;
	}

	void method_z_void() {
		int i = 0;
		while (i < this.capacity) {
			final Node node = this.buckets[i];
			for (;;) {
				final Node node_2_ = node.next;
				if (node_2_ == node) {
					i++;
					break;
				}
				node_2_.removeLink();
			}
		}
		this.top = null;
		this.bottom = null;
	}

	public Node method_y_ga() {
		this.position = 0;
		return method_e_ga();
	}

	public Node method_e_ga() {
		if ((this.position > 0) && (this.bottom != (this.buckets[this.position - 1]))) {
			final Node node = this.bottom;
			this.bottom = node.next;
			return node;
		}
		Node node;
		do {
			if (this.position >= this.capacity) {
				return null;
			}
			node = (this.buckets[this.position++].next);
		} while (node == (this.buckets[this.position - 1]));
		this.bottom = node.next;
		return node;
	}

	public NodeMultiSet(final int i) {
		this.capacity = i;
		this.buckets = new Node[i];
		for (int i_3_ = 0; i_3_ < i; i_3_++) {
			final Node node = this.buckets[i_3_] = new Node();
			node.next = node;
			node.prev = node;
		}
	}
}
