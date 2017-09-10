
/* Npc - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Npc extends Actor {
	static final int field_l_290 = 9;
	static int[] field_h_291;
	static Class_hq field_pe_292;
	static final int field_x_293 = 200;
	NpcComposite composite;
	public static final int field_dw_295 = 0;
	public static final int field_ee_296 = 188;
	public static final int field_gi_297 = 171;
	public static int field_m_298;
	static int field_iz_299;

	@Override
	protected final Model getModel() {
		Model onscreenmodel;
		try {
			if (this.composite == null) {
				return null;
			}
			AnimationSequence class_an;
			if (((1529361367 * this.animation) != -1) && ((this.animationDelay * 1103217729) == 0)) {
				class_an = OnDemandNode.getAnimationSequence((this.animation * 1529361367));
			} else {
				class_an = null;
			}
			final AnimationSequence class_an_0_ = class_an;
			if (((-1720610647 * this.field_af_226) != -1) && (((-385188719 * this.standAnimation) != (this.field_af_226 * -1720610647)) || (class_an_0_ == null))) {
				class_an = OnDemandNode.getAnimationSequence((-1720610647 * this.field_af_226));
			} else {
				class_an = null;
			}
			final AnimationSequence class_an_1_ = class_an;
			Model onscreenmodel_2_ = (this.composite.method_e_cg(class_an_0_, -1957976047 * this.field_bo_247, class_an_1_, -1837165359 * this.field_au_244, -896271800));
			if (onscreenmodel_2_ == null) {
				return null;
			}
			onscreenmodel_2_.method_m_void();
			this.field_bf_215 = 324762945 * onscreenmodel_2_.modelHeight;
			if (((1625440903 * this.gfxId) != -1) && ((-426120347 * this.field_br_239) != -1)) {
				final Model onscreenmodel_3_ = (Class_l.getSpotAnimation(1625440903 * this.gfxId).method_y_cg(this.field_br_239 * -426120347, 2104868624));
				if (onscreenmodel_3_ != null) {
					onscreenmodel_3_.method_s_void(0, -(1207713105 * (this.field_bu_255)), 0);
					final Model[] onscreenmodels = { onscreenmodel_2_, onscreenmodel_3_ };
					onscreenmodel_2_ = new Model(onscreenmodels, 2);
				}
			}
			if ((this.composite.occupiedTiles * 1087045297) == 1) {
				onscreenmodel_2_.field_ad_893 = true;
			}
			onscreenmodel = onscreenmodel_2_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ar.d()");
		}
		return onscreenmodel;
	} 

	@Override
	final boolean method_z_boolean(final int i) {
		boolean bool;
		try {
			if (this.composite != null) {
				return true;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ar.z()");
		}
		return bool;
	}

	static final void drawGroundItems(final int i, final int i_4_, final int i_5_) {
		try {
			final NodeDeque deque = client.groundItemsDeque[250114511 * Class_ed.plane][i][i_4_];
			if (deque == null) {
				Class_ae.sceneGraph.method_o_void(250114511 * Class_ed.plane, i, i_4_);
			} else {
				long l = -99999999L;
				Item grounditem = null;
				for (Item grounditem_6_ = (Item) deque.method_f_ga(); grounditem_6_ != null; grounditem_6_ = (Item) deque.method_a_ga()) {
					final ItemComposite itemdef = ItemDefinitions.getItemComposite((grounditem_6_.id * 1499483327));
					long l_7_ = -1548814399 * itemdef.cost;
					if ((1537303969 * itemdef.stackable) == 1) {
						l_7_ *= 1 + (899943275 * (grounditem_6_.amount));
					}
					if (l_7_ > l) {
						l = l_7_;
						grounditem = grounditem_6_;
					}
				}
				if (grounditem == null) {
					Class_ae.sceneGraph.method_o_void(250114511 * Class_ed.plane, i, i_4_);
				} else {
					deque.method_z_void(grounditem);
					Item grounditem_8_ = null;
					Item grounditem_9_ = null;
					for (Item grounditem_10_ = (Item) deque.method_f_ga(); grounditem_10_ != null; grounditem_10_ = (Item) deque.method_a_ga()) {
						if ((1499483327 * grounditem_10_.id) != (1499483327 * grounditem.id)) {
							if (grounditem_8_ == null) {
								grounditem_8_ = grounditem_10_;
							}
							if (((grounditem_8_.id * 1499483327) != (1499483327 * grounditem_10_.id)) && (grounditem_9_ == null)) {
								grounditem_9_ = grounditem_10_;
							}
						}
					}
					final int i_11_ = (i_4_ << 7) + i + 1610612736;
					Class_ae.sceneGraph.drawModel(250114511 * Class_ed.plane, i, i_4_, Class_q.getTileHeight((128 * i) + 64, (128 * i_4_) + 64, 250114511 * Class_ed.plane), grounditem, i_11_, grounditem_8_, grounditem_9_);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ar.bg()");
		}
	}

	public static void method_j_void(final byte i) {
		try {
			ItemComposite.field_h_112.method_y_void();
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ar.j()");
		}
	}

	Npc() {
		/* empty */
	}
}
