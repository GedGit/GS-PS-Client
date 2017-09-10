/* Class_ep - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_ep {
	static int[] field_z_2193;
	static char[] field_n_2194 = new char[64];
	public static final int field_bf_2195 = 39;
	static int indexAmount;
	static char[] field_d_2197;

	static {
		for (int i = 0; i < 26; i++) {
			field_n_2194[i] = (char) (65 + i);
		}
		for (int i = 26; i < 52; i++) {
			field_n_2194[i] = (char) ((97 + i) - 26);
		}
		for (int i = 52; i < 62; i++) {
			field_n_2194[i] = (char) ((i + 48) - 52);
		}
		field_n_2194[62] = '+';
		field_n_2194[63] = '/';
		field_d_2197 = new char[64];
		for (int i = 0; i < 26; i++) {
			field_d_2197[i] = (char) (i + 65);
		}
		for (int i = 26; i < 52; i++) {
			field_d_2197[i] = (char) ((97 + i) - 26);
		}
		for (int i = 52; i < 62; i++) {
			field_d_2197[i] = (char) ((48 + i) - 52);
		}
		field_d_2197[62] = '*';
		field_d_2197[63] = '-';
		field_z_2193 = new int[128];
		for (int i = 0; i < field_z_2193.length; i++) {
			field_z_2193[i] = -1;
		}
		for (int i = 65; i <= 90; i++) {
			field_z_2193[i] = i - 65;
		}
		for (int i = 97; i <= 122; i++) {
			field_z_2193[i] = (i - 97) + 26;
		}
		for (int i = 48; i <= 57; i++) {
			field_z_2193[i] = 52 + (i - 48);
		}
		final int[] is = field_z_2193;
		field_z_2193[43] = 62;
		is[42] = 62;
		final int[] is_0_ = field_z_2193;
		field_z_2193[47] = 63;
		is_0_[45] = 63;
	}

	Class_ep() throws Throwable {
		throw new Error();
	}

	static Widget method_dk_fy(final Widget widget, final byte i) {
		Widget widget_1_;
		try {
			Widget widget_2_ = widget;
			final int i_3_ = Class_db.method_en_int(widget, -1508054031);
			final int i_4_ = (i_3_ >> 17) & 0x7;
			final int i_5_ = i_4_;
			Widget widget_6_;
			if (i_4_ == 0) {
				widget_6_ = null;
			} else {
				int i_7_ = 0;
				for (;;) {
					if (i_7_ >= i_5_) {
						widget_6_ = widget_2_;
						break;
					}
					widget_2_ = Class_en.getWidgetByUID((-1405313417 * widget_2_.parentId), (short) 23952);
					if (widget_2_ == null) {
						widget_6_ = null;
						break;
					}
					i_7_++;
				}
			}
			Widget widget_8_ = widget_6_;
			if (widget_6_ == null) {
				widget_8_ = widget.root;
			}
			widget_1_ = widget_8_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ep.dk()");
		}
		return widget_1_;
	}

	static void method_cl_void(final Widget widget, final int i, final int i_9_, final int i_10_) {
		try {
			if ((widget.field_s_2549 * -1433284713) == 0) {
				widget.onScreenX = -1859634995 * widget.x;
			} else if ((-1433284713 * widget.field_s_2549) == 1) {
				widget.onScreenX = 680728695 * (((i - (1367496319 * widget.onScreenWidth)) / 2) + (widget.x * 517852635));
			} else if ((-1433284713 * widget.field_s_2549) == 2) {
				widget.onScreenX = 680728695 * (i - (widget.onScreenWidth * 1367496319) - (widget.x * 517852635));
			} else if ((-1433284713 * widget.field_s_2549) == 3) {
				widget.onScreenX = 680728695 * ((i * 517852635 * widget.x) >> 14);
			} else if ((widget.field_s_2549 * -1433284713) == 4) {
				widget.onScreenX = 680728695 * (((i - (1367496319 * widget.onScreenWidth)) / 2) + ((widget.x * 517852635 * i) >> 14));
			} else {
				widget.onScreenX = 680728695 * (i - (widget.onScreenWidth * 1367496319) - ((517852635 * widget.x * i) >> 14));
			}
			if ((widget.field_v_2550 * 307898257) == 0) {
				widget.onScreenY = widget.y * -1666687987;
			} else if ((widget.field_v_2550 * 307898257) == 1) {
				widget.onScreenY = (((widget.y * -437980135) + ((i_9_ - (-1643237919 * widget.onScreenHeight)) / 2)) * -681720299);
			} else if ((widget.field_v_2550 * 307898257) == 2) {
				widget.onScreenY = (i_9_ - (widget.onScreenHeight * -1643237919) - (widget.y * -437980135)) * -681720299;
			} else if ((307898257 * widget.field_v_2550) == 3) {
				widget.onScreenY = -681720299 * ((i_9_ * -437980135 * widget.y) >> 14);
			} else if ((widget.field_v_2550 * 307898257) == 4) {
				widget.onScreenY = (-681720299 * (((i_9_ * widget.y * -437980135) >> 14) + ((i_9_ - (-1643237919 * widget.onScreenHeight)) / 2)));
			} else {
				widget.onScreenY = -681720299 * (i_9_ - (-1643237919 * widget.onScreenHeight) - ((i_9_ * -437980135 * widget.y) >> 14));
			}
			if (client.field_jk_2857 && ((876728889 * widget.type) == 0)) {
				if ((widget.onScreenX * -948813497) < 0) {
					widget.onScreenX = 0;
				} else if (((widget.onScreenWidth * 1367496319) + (widget.onScreenX * -948813497)) > i) {
					widget.onScreenX = (i - (1367496319 * widget.onScreenWidth)) * 680728695;
				}
				if ((-1698637507 * widget.onScreenY) < 0) {
					widget.onScreenY = 0;
				} else if (((widget.onScreenY * -1698637507) + (-1643237919 * widget.onScreenHeight)) > i_9_) {
					widget.onScreenY = -681720299 * (i_9_ - (widget.onScreenHeight * -1643237919));
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ep.cl()");
		}
	}
}
