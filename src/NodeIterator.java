/* Class_gm - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class NodeIterator implements Iterator<CacheableNode> {
	CacheableNode field_d_3025;
	IterableNode field_n_3026;
	CacheableNode field_z_3027 = null;

	@Override
	public CacheableNode next() {
		CacheableNode nodesub = this.field_d_3025;
		if (nodesub == this.field_n_3026.field_n_3036) {
			nodesub = null;
			this.field_d_3025 = null;
		} else {
			this.field_d_3025 = nodesub.prev;
		}
		this.field_z_3027 = nodesub;
		return nodesub;
	}

	@Override
	public boolean hasNext() {
		if (this.field_d_3025 != this.field_n_3026.field_n_3036) {
			return true;
		}
		return false;
	}

	@Override
	public void remove() {
		if (this.field_z_3027 == null) {
			throw new IllegalStateException();
		}
		this.field_z_3027.update();
		this.field_z_3027 = null;
	}

	NodeIterator(final IterableNode class_gq) {
		this.field_n_3026 = class_gq;
		this.field_d_3025 = this.field_n_3026.field_n_3036.prev;
		this.field_z_3027 = null;
	}
}
