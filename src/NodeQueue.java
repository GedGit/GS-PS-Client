/* Class_gd - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class NodeQueue {
	CacheableNode head = new CacheableNode();

	public void method_n_void(final CacheableNode nodesub) {
		if (nodesub.next != null) {
			nodesub.update();
		}
		nodesub.next = this.head.next;
		nodesub.prev = this.head;
		nodesub.next.prev = nodesub;
		nodesub.prev.next = nodesub;
	}

	public void update(final CacheableNode nodesub) {
		if (nodesub.next != null) {
			nodesub.update();
		}
		nodesub.next = this.head;
		nodesub.prev = this.head.prev;
		nodesub.next.prev = nodesub;
		nodesub.prev.next = nodesub;
	}

	CacheableNode tail() {
		final CacheableNode nodesub = this.head.prev;
		if (nodesub == this.head) {
			return null;
		}
		nodesub.update();
		return nodesub;
	}

	public CacheableNode head() {
		final CacheableNode nodesub = this.head.prev;
		return nodesub == this.head ? null : nodesub;
	}

	void method_e_void() {
		for (;;) {
			final CacheableNode nodesub = this.head.prev;
			if (nodesub == this.head) {
				break;
			}
			nodesub.update();
		}
	}

	public NodeQueue() {
		this.head.prev = this.head;
		this.head.next = this.head;
	}
}
