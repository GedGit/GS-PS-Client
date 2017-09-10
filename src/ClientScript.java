/* Class_c - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ClientScript extends CacheableNode {
	static Sprite[] scrollbar;
	int[] instructions;
	static final int field_aj_833 = 56;
	String[] strings;
	int field_f_835;
	int strLen;
	int field_m_837;
	static NodeCache field_n_838 = new NodeCache(128);
	static final int field_u_839 = 10;
	int intLen;
	public static final int field_bu_841 = 82;
	int[] intOp;
	public static short[][] field_h_843;
	static final int field_p_844 = 22;

	protected static final void method_ro_void(final int i) {
		try {
			Class_o.field_qm_1237 = null;
			Class_h.field_qz_1029 = null;
			SceneObject.field_bf_949 = null;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "c.ro()");
		}
	}

	ClientScript() {
		/* empty */
	}

	public static IdentityKit getIdentityKit(final int id) {
		IdentityKit class_ai;
		try {
			IdentityKit class_ai_1_ = (IdentityKit) IdentityKit.field_y_88.method_n_gb(id);
			if (class_ai_1_ != null) {
				return class_ai_1_;
			}
			final byte[] is = IdentityKit.field_n_104.getArchive(3, id);
			class_ai_1_ = new IdentityKit();
			if (is != null) {
				class_ai_1_.method_z_void(new Buffer(is), (byte) -50);
			}
			IdentityKit.field_y_88.method_z_void(class_ai_1_, id);
			class_ai = class_ai_1_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "c.d()");
		}
		return class_ai;
	}

	public static void method_f_void(final Buffer rsbytebuffer, final int i, final byte i_2_) {
		do {
			try {
				if (Class_ed.field_l_2069 != null) {
					try {
						Class_ed.field_l_2069.method_d_void(0L);
						Class_ed.field_l_2069.method_f_void((rsbytebuffer.buffer), i, 24, (byte) 82);
					} catch (final Exception exception) {
						break;
					}
				}
				break;
			} catch (final RuntimeException runtimeexception) {
				throw GameCanvas.error(runtimeexception, "c.f()");
			}
		} while (false);
	}

	static void method_cr_void(final Widget[] widgets, final int i, final int i_3_, final int i_4_, final boolean bool, final byte i_5_) {
		try {
			for (final Widget widget2 : widgets) {
				final Widget widget = widget2;
				if ((widget != null) && (i == (-1405313417 * widget.parentId))) {
					FriendWidget.method_ck_void(widget, i_3_, i_4_, bool, -947803451);
					Class_ep.method_cl_void(widget, i_3_, i_4_, 5824127);
					if ((widget.field_ab_2565 * 440856551) > ((-450552547 * widget.field_ac_2567) - (1367496319 * widget.onScreenWidth))) {
						widget.field_ab_2565 = ((-345982373 * widget.field_ac_2567) - (1271886249 * widget.onScreenWidth));
					}
					if ((widget.field_ab_2565 * 440856551) < 0) {
						widget.field_ab_2565 = 0;
					}
					if ((widget.verticalScrollPos * -854204745) > ((widget.field_az_2568 * 2133987947) - (-1643237919 * widget.onScreenHeight))) {
						widget.verticalScrollPos = ((-2065615379 * widget.field_az_2568) - (widget.onScreenHeight * 483442727));
					}
					if ((widget.verticalScrollPos * -854204745) < 0) {
						widget.verticalScrollPos = 0;
					}
					if ((876728889 * widget.type) == 0) {
						Class_bk.method_cg_void(widgets, widget, bool, -1167541888);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "c.cr()");
		}
	}
}
