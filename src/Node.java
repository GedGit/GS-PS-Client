/* Node - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node {
	public long id;
	public Node next;
	Node prev;

	protected Node() {
		/* empty */
	}

	public void removeLink() {
		if (this.prev != null) {
			this.prev.next = next;
			next.prev = this.prev;
			next = null;
			this.prev = null;
		}
	}

	public boolean hasPrev() {
		if (this.prev != null) {
			return true;
		}
		return false;
	}
}
