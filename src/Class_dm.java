/* Class_dm - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_dm {
	static final int field_lf_1638 = 2160;
	static int field_n_1639 = 0;
	static int field_z_1640 = 0;
	static byte[][] field_y_1641 = new byte[1000][];
	static byte[][] field_e_1642 = new byte[250][];
	static byte[][] field_g_1643 = new byte[50][];
	static int field_d_1644 = 0;
	static final int field_bi_1645 = 90;
	static final int field_r_1646 = 585;
	public static final int field_ex_1647 = 238;
	static final int field_l_1648 = 6;

	static synchronized byte[] method_n_byteArray(final int i, final byte i_0_) {
		byte[] is;
		try {
			if ((i == 100) && ((1667847641 * field_n_1639) > 0)) {
				final byte[] is_1_ = field_y_1641[(field_n_1639 -= -124134807) * 1667847641];
				field_y_1641[1667847641 * field_n_1639] = null;
				return is_1_;
			}
			if ((i == 5000) && ((-1989095485 * field_d_1644) > 0)) {
				final byte[] is_2_ = (field_e_1642[(field_d_1644 -= -1245898517) * -1989095485]);
				field_e_1642[field_d_1644 * -1989095485] = null;
				return is_2_;
			}
			if ((i == 30000) && ((field_z_1640 * 1919535431) > 0)) {
				final byte[] is_3_ = field_g_1643[(field_z_1640 -= 961089655) * 1919535431];
				field_g_1643[field_z_1640 * 1919535431] = null;
				return is_3_;
			}
			is = new byte[i];
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dm.n()");
		}
		return is;
	}

	static final int method_m_int(final int i, final int i_4_, final int i_5_, final int i_6_) {
		int i_7_;
		try {
			final int i_8_ = 256 - i_5_;
			i_7_ = ((((i_5_ * (i_4_ & 0xff00ff)) + (i_8_ * (i & 0xff00ff))) & ~0xff00ff) + (((i_8_ * (i & 0xff00)) + ((i_4_ & 0xff00) * i_5_)) & 0xff0000)) >> 8;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dm.m()");
		}
		return i_7_;
	}

	Class_dm() throws Throwable {
		throw new Error();
	}

	static World method_m_t(final short i) {
		World worldinfo;
		try {
			World.field_f_1392 = 0;
			worldinfo = MouseInputListener.method_a_t(1596376622);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dm.m()");
		}
		return worldinfo;
	}
}
