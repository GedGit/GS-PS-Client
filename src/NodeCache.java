/* Cache - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class NodeCache {
	int field_d_3031;
	NodeMultiSet hashTable;
	int field_z_3033;
	CacheableNode field_n_3034 = new CacheableNode();
	NodeQueue field_e_3035 = new NodeQueue();

	public NodeCache(final int i) {
		this.field_d_3031 = i;
		this.field_z_3033 = i;
		int i_0_;
		for (i_0_ = 1; (i_0_ + i_0_) < i; i_0_ += i_0_) {
			/* empty */
		}
		this.hashTable = new NodeMultiSet(i_0_);
	}

	public CacheableNode method_n_gb(final long l) {
		final CacheableNode nodesub = (CacheableNode) this.hashTable.method_n_ga(l);
		if (nodesub != null) {
			this.field_e_3035.method_n_void(nodesub);
		}
		return nodesub;
	}

	public void method_y_void() {
		this.field_e_3035.method_e_void();
		this.hashTable.method_z_void();
		this.field_n_3034 = new CacheableNode();
		this.field_z_3033 = this.field_d_3031;
	}

	public void method_z_void(final CacheableNode nodesub, final long l) {
		if (this.field_z_3033 == 0) {
			CacheableNode nodesub_1_ = this.field_e_3035.tail();
			nodesub_1_.removeLink();
			nodesub_1_.update();
			if (nodesub_1_ == this.field_n_3034) {
				nodesub_1_ = this.field_e_3035.tail();
				nodesub_1_.removeLink();
				nodesub_1_.update();
			}
		} else {
			this.field_z_3033--;
		}
		this.hashTable.method_d_void(nodesub, l);
		this.field_e_3035.method_n_void(nodesub);
	}

	public void method_d_void(final long l) {
		final CacheableNode nodesub = (CacheableNode) this.hashTable.method_n_ga(l);
		if (nodesub != null) {
			nodesub.removeLink();
			nodesub.update();
			this.field_z_3033++;
		}
	}
}
