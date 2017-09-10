/* Class_ac - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class FriendWidget extends Class_gc {
	static final int field_gf_30 = 2047;
	String username;
	short worldStatus;
	static final int field_aw_33 = 50;
	int field_n_34 = (int) (Renderable.getCurrentTime(1375066840) / 1000L) * 482775127;
	public static final int field_bc_35 = 96;
	static final int field_af_36 = 64;
	public static final int field_fa_37 = 204;
	public static final int field_t_38 = 201;
	public static final int field_dn_39 = 149;

	FriendWidget(final String string, final int i) {
		this.username = string;
		this.worldStatus = (short) i;
	}

	static void method_ck_void(final Widget widget, final int i, final int i_0_, final boolean bool, final int i_1_) {
		try {
			final int i_2_ = widget.onScreenWidth * 1367496319;
			final int i_3_ = widget.onScreenHeight * -1643237919;
			if ((widget.field_c_2551 * -963156841) == 0) {
				widget.onScreenWidth = widget.width * 395297063;
			} else if ((widget.field_c_2551 * -963156841) == 1) {
				widget.onScreenWidth = (i - (1744956505 * widget.width)) * -123508353;
			} else if ((widget.field_c_2551 * -963156841) == 2) {
				widget.onScreenWidth = ((widget.width * 1744956505 * i) >> 14) * -123508353;
			}
			if ((644647777 * widget.field_p_2622) == 0) {
				widget.onScreenHeight = widget.height * -1749411831;
			} else if ((644647777 * widget.field_p_2622) == 1) {
				widget.onScreenHeight = (i_0_ - (widget.height * -280578839)) * 202561057;
			} else if ((widget.field_p_2622 * 644647777) == 2) {
				widget.onScreenHeight = (((-280578839 * widget.height * i_0_) >> 14) * 202561057);
			}
			if ((widget.field_c_2551 * -963156841) == 4) {
				widget.onScreenWidth = (((widget.field_ax_2556 * 66195931 * -1643237919 * widget.onScreenHeight) / (widget.field_al_2645 * 1220323169)) * -123508353);
			}
			if ((644647777 * widget.field_p_2622) == 4) {
				widget.onScreenHeight = (((1367496319 * widget.onScreenWidth * 1220323169 * widget.field_al_2645) / (66195931 * widget.field_ax_2556)) * 202561057);
			}
			if (client.field_jk_2857 && ((876728889 * widget.type) == 0)) {
				if (((widget.onScreenHeight * -1643237919) < 5) && ((1367496319 * widget.onScreenWidth) < 5)) {
					widget.onScreenHeight = 1012805285;
					widget.onScreenWidth = -617541765;
				} else {
					if ((widget.onScreenHeight * -1643237919) <= 0) {
						widget.onScreenHeight = 1012805285;
					}
					if ((widget.onScreenWidth * 1367496319) <= 0) {
						widget.onScreenWidth = -617541765;
					}
				}
			}
			if ((widget.contentType * -1489583413) == 1337) {
				client.field_jm_2869 = widget;
			}
			if (bool && (widget.field_da_2651 != null) && (((1367496319 * widget.onScreenWidth) != i_2_) || (i_3_ != (widget.onScreenHeight * -1643237919)))) {
				final Script class_n = new Script();
				class_n.parent = widget;
				class_n.parameters = widget.field_da_2651;
				client.field_kp_2888.add(class_n);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ac.ck()");
		}
	}
}
