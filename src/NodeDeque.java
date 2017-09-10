/* Deque - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class NodeDeque {
	public Node tail = new Node();
	Node front;

	public Node method_a_ga() {
		final Node node = this.front;
		if (node == tail) {
			this.front = null;
			return null;
		}
		this.front = node.next;
		return node;
	}

	public void add(final Node node) {
		if (node.prev != null) {
			node.removeLink();
		}
		node.prev = tail.prev;
		node.next = tail;
		node.prev.next = node;
		node.next.prev = node;
	}

	public void method_z_void(final Node node) {
		if (node.prev != null) {
			node.removeLink();
		}
		node.prev = tail;
		node.next = tail.next;
		node.prev.next = node;
		node.next.prev = node;
	}

	public static void method_y_void(final Node node, final Node node_0_) {
		if (node.prev != null) {
			node.removeLink();
		}
		node.prev = node_0_.prev;
		node.next = node_0_;
		node.prev.next = node;
		node.next.prev = node;
	}

	public Node method_e_ga() {
		final Node node = tail.next;
		if (node == tail) {
			return null;
		}
		node.removeLink();
		return node;
	}

	public Node method_g_ga() {
		final Node node = tail.prev;
		if (node == tail) {
			return null;
		}
		node.removeLink();
		return node;
	}

	public NodeDeque() {
		tail.next = tail;
		tail.prev = tail;
	}

	public Node method_m_ga() {
		final Node node = tail.prev;
		if (node == tail) {
			this.front = null;
			return null;
		}
		this.front = node.prev;
		return node;
	}

	public void method_n_void() {
		for (;;) {
			final Node node = tail.next;
			if (node == tail) {
				this.front = null;
				break;
			}
			node.removeLink();
		}
	}

	public Node method_h_ga() {
		final Node node = this.front;
		if (node == tail) {
			this.front = null;
			return null;
		}
		this.front = node.prev;
		return node;
	}

	public Node method_f_ga() {
		final Node node = tail.next;
		if (node == tail) {
			this.front = null;
			return null;
		}
		this.front = node.next;
		return node;
	}
}
