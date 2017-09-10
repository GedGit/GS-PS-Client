/* Class_bk - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_bk {
	static final int field_u_577 = 12;
	static final int field_cr_578 = 104;
	public static int[] field_y_579;
	public static int[] field_e_580;
	public static int[] field_f_581;
	static final int field_s_582 = 20;
	static int field_n_583;
	public static int field_z_584;
	public static byte[][] field_a_585;
	public static final int field_r_586 = 16;

	Class_bk() throws Throwable {
		throw new Error();
	}

	static void method_cg_void(final Widget[] widgets, final Widget widget, final boolean bool, final int i) {
		do {
			try {
				final int i_0_ = ((widget.field_ac_2567 * -450552547) != 0 ? -450552547 * widget.field_ac_2567 : widget.onScreenWidth * 1367496319);
				final int i_1_ = ((widget.field_az_2568 * 2133987947) != 0 ? widget.field_az_2568 * 2133987947 : -1643237919 * widget.onScreenHeight);
				ClientScript.method_cr_void(widgets, widget.uid * -560181405, i_0_, i_1_, bool, (byte) -39);
				if (widget.components != null) {
					ClientScript.method_cr_void(widget.components, -560181405 * widget.uid, i_0_, i_1_, bool, (byte) 76);
				}
				final Menu interfacepositionnode = ((Menu) (client.menuTable.method_n_ga(widget.uid * -560181405)));
				if (interfacepositionnode != null) {
					final int i_2_ = 44103667 * interfacepositionnode.interfaceId;
					if (Class_fz.loadWidget(i_2_, -2020302255)) {
						ClientScript.method_cr_void(Widget.widgets[i_2_], -1, i_0_, i_1_, bool, (byte) -7);
					}
				}
				if ((-1489583413 * widget.contentType) != 1337) {
					break;
				}
			} catch (final RuntimeException runtimeexception) {
				throw GameCanvas.error(runtimeexception, "bk.cg()");
			}
		} while (false);
	}

	static char method_d_char(final char c, final int i) {
		char c_3_;
		try {
			c_3_ = ((c != '\u00b5') && (c != '\u0192') ? java.lang.Character.toTitleCase(c) : c);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "bk.d()");
		}
		return c_3_;
	}

	public static boolean method_f_boolean(final int i, final int i_4_) { 
		boolean bool;
		try {
			if (((i >> 30) & 0x1) != 0) {
				return true;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "bk.f()");
		}
		return bool;
	}

	static final void method_f_void(final byte[] is, final int i, final int i_5_, final SceneGraph scenegraph, final CollisionMap[] collisionmaps, final int i_6_) {
		try {
			final Buffer rsbytebuffer = new Buffer(is);
			int i_7_ = -1;
			for (;;) {
				final int i_8_ = rsbytebuffer.getSmart((byte) 116);
				if (i_8_ == 0) {
					break;
				}
				i_7_ += i_8_;
				int i_9_ = 0;
				for (;;) {
					final int i_10_ = rsbytebuffer.getSmart((byte) 79);
					if (i_10_ == 0) {
						break;
					}
					i_9_ += i_10_ - 1;
					final int i_11_ = i_9_ & 0x3f;
					final int i_12_ = (i_9_ >> 6) & 0x3f;
					final int i_13_ = i_9_ >> 12;
					final int i_14_ = rsbytebuffer.get();
					final int i_15_ = i_14_ >> 2;
					final int i_16_ = i_14_ & 0x3;
					final int i_17_ = i_12_ + i;
					final int i_18_ = i_5_ + i_11_;
					if ((i_17_ > 0) && (i_18_ > 0) && (i_17_ < 103) && (i_18_ < 103)) {
						int i_19_ = i_13_;
						if ((Region.sceneFlags[1][i_17_][i_18_] & 0x2) == 2) {
							i_19_ = i_13_ - 1;
						}
						CollisionMap collisionmap = null;
						if (i_19_ >= 0) {
							collisionmap = collisionmaps[i_19_];
						}
						Class_d.method_m_void(i_13_, i_17_, i_18_, i_7_, i_16_, i_15_, scenegraph, collisionmap, -2108014749);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "bk.f()");
		}
	}
}
