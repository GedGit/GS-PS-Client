/* Class_gz - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

@SuppressWarnings("rawtypes")
public class Class_gz implements Iterable {
	Node field_n_3063 = new Node();

	@Override
	public Iterator iterator() {
		return new Class_gu(this);
	}

	public Node method_d_ga() {
		return method_z_ga(null);
	}

	Node method_z_ga(final Node node) {
		Node node_0_;
		if (node == null) {
			node_0_ = this.field_n_3063.next;
		} else {
			node_0_ = node;
		}
		return node_0_ == this.field_n_3063 ? null : node_0_;
	}

	public Class_gz() {
		this.field_n_3063.next = this.field_n_3063;
		this.field_n_3063.prev = this.field_n_3063;
	}

	public void method_n_void(final Node node) {
		if (node.prev != null) {
			node.removeLink();
		}
		node.prev = this.field_n_3063.prev;
		node.next = this.field_n_3063;
		node.prev.next = node;
		node.next.prev = node;
	}
}
