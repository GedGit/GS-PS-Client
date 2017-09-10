/* NodeSub - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CacheableNode extends Node {
	public CacheableNode prev;
	public CacheableNode next;

	protected CacheableNode() {
		/* empty */
	}

	public void update() {
		if (next != null) {
			next.prev = prev;
			prev.next = next;
			prev = null;
			next = null;
		}
	}
}
