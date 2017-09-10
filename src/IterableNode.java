/* Class_gq - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class IterableNode implements Iterable<CacheableNode> {
	public CacheableNode field_n_3036 = new CacheableNode();

	public void method_d_void(final CacheableNode nodesub) {
		if (nodesub.next != null) {
			nodesub.update();
		}
		nodesub.next = field_n_3036.next;
		nodesub.prev = field_n_3036;
		nodesub.next.prev = nodesub;
		nodesub.prev.next = nodesub;
	}

	public void method_n_void() {
		while (field_n_3036.prev != field_n_3036) {
			field_n_3036.prev.update();
		}
	}

	@Override
	public Iterator<CacheableNode> iterator() {
		return new NodeIterator(this);
	}

	public IterableNode() {
		field_n_3036.prev = field_n_3036;
		field_n_3036.next = field_n_3036;
	}
}
