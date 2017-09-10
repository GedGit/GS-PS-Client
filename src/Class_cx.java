/* Class_cx - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class_cx {
	Renderable field_g_1426;
	int field_d_1427;
	int field_n_1428;
	Renderable field_z_1429;
	Renderable field_e_1430;
	static Class_db field_lj_1431;
	int field_m_1432;
	int field_f_1433;
	protected static int field_qp_1434;
	int field_y_1435;
	static Socket connection;
	public static final int field_v_1437 = 4;
	public static final int field_go_1438 = 233;
	public static final int field_p_1439 = 16777216;

	Class_cx() {
		/* empty */
	}

	public static String method_n_String(final Buffer rsbytebuffer, final int i) {
		String string;
		try {
			String string_0_;
			try {
				int i_1_ = rsbytebuffer.getSmart((byte) 27);
				if (i_1_ > 32767) {
					i_1_ = 32767;
				}
				final byte[] is = new byte[i_1_];
				rsbytebuffer.position += (Class_hk.field_n_3080.method_d_int(rsbytebuffer.buffer, rsbytebuffer.position * -1485345105, is, 0, i_1_, 491968161)) * -685856689;
				final String string_2_ = GameMessage.method_e_String(is, 0, i_1_, 294594846);
				string_0_ = string_2_;
			} catch (final Exception exception) {
				string_0_ = "Cabbage";
			}
			string = string_0_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "cx.n()");
		}
		return string;
	}

	static final void method_y_void(final byte[] is, final int i, final int i_3_, final int i_4_, final int i_5_, final CollisionMap[] collisionmaps, final int i_6_) {
		try {
			for (int i_7_ = 0; i_7_ < 4; i_7_++) {
				for (int i_8_ = 0; i_8_ < 64; i_8_++) {
					for (int i_9_ = 0; i_9_ < 64; i_9_++) {
						if (((i + i_8_) > 0) && ((i_8_ + i) < 103) && ((i_9_ + i_3_) > 0) && ((i_3_ + i_9_) < 103)) {
							collisionmaps[i_7_].flags[i_8_ + i][i_3_ + i_9_] &= ~0x1000000;
						}
					}
				}
			}
			final Buffer rsbytebuffer = new Buffer(is);
			for (int i_10_ = 0; i_10_ < 4; i_10_++) {
				for (int i_11_ = 0; i_11_ < 64; i_11_++) {
					for (int i_12_ = 0; i_12_ < 64; i_12_++) {
						GameMessage.method_g_void(rsbytebuffer, i_10_, i + i_11_, i_12_ + i_3_, i_4_, i_5_, 0, -429249933);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "cx.y()");
		}
	}

	public static void method_m_void(final int i) {
		do {
			try {
				try {
					Class_ed.mainDatFile.method_n_void((byte) 4);
					for (int i_13_ = 0; i_13_ < (Class_ep.indexAmount * 22018805); i_13_++) {
						Class_ed.cacheIndices[i_13_].method_n_void((byte) 4);
					}
					Class_ed.metaFile.method_n_void((byte) 4);
					Class_ed.field_l_2069.method_n_void((byte) 4);
				} catch (final Exception exception) {
					break;
				}
				break;
			} catch (final RuntimeException runtimeexception) {
				throw GameCanvas.error(runtimeexception, "cx.m()");
			}
		} while (false);
	}
}
