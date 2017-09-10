/* Class_Class_do - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.Inflater;

public class ZipInflater {
	public static final int field_dg_1661 = 106;
	static final int field_p_1662 = 1048576;
	public static final int field_c_1663 = 133;
	Inflater field_n_1664;
	public static final int field_cj_1665 = 137;
	public static final int field_gw_1666 = 128;

	public static Bindable newBindable() {
		do {
			try {
				MouseScrollListener class_el;
				try {
					class_el = new MouseScrollListener();
				} catch (final Throwable throwable) {
					break;
				}
				return class_el;
			} catch (final RuntimeException runtimeexception) {
				throw GameCanvas.error(runtimeexception, "do.n()");
			}
		} while (false);
		return null;
	}

	ZipInflater(final int i, final int i_0_, final int i_1_) {
		/* empty */
	}

	public ZipInflater() {
		this(-1, 1000000, 1000000);
	}

	public void inflate(final Buffer buffer, final byte[] is) {
		try {
			if (((buffer.buffer[-1485345105 * buffer.position]) == 31) && ((buffer.buffer[(-1485345105 * buffer.position) + 1]) == -117)) {
				if (this.field_n_1664 == null) {
					this.field_n_1664 = new Inflater(true);
				}
				try {
					this.field_n_1664.setInput(buffer.buffer, (-1485345105 * buffer.position) + 10, (buffer.buffer.length - (8 + (-1485345105 * buffer.position) + 10)));
					this.field_n_1664.inflate(is);
				} catch (final Exception exception) {
					this.field_n_1664.reset();
					throw new RuntimeException("");
				}
				this.field_n_1664.reset();
			} else {
				throw new RuntimeException("");
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "do.n()");
		}
	}

	static void method_d_void(final int i) {
		try {
			Bindable.field_y_1701 = null;
			Region.field_e_994 = null;
			Class_df.field_g_1610 = null;
			ClanMember.field_f_808 = null;
			Friend.field_x_1092 = null;
			Region.field_m_1007 = null;
			Class_ge.field_a_2977 = null;
			Npc.field_h_291 = null;
			Region.field_l_1006 = null;
			Class_bh.field_u_558 = null;
			Class_cw.field_q_1412 = null;
			Class_bh.field_k_564 = null;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "do.d()");
		}
	}

	static int method_y_int(final int i, final int i_2_, final int i_3_) {
		int i_4_;
		try {
			final long l = i_2_ + (i << 16);
			i_4_ = (((Class_ev.field_k_2235 != null) && (l == Class_ev.field_k_2235.id)) ? 1 + ((-1020277331 * Class_fq.field_r_2434.position) / (Class_fq.field_r_2434.buffer.length - (Class_ev.field_k_2235.field_z_2321))) : 0);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "do.y()");
		}
		return i_4_;
	}

	static void method_dc_void(final int i, final int i_5_, final int i_6_) {
		try {
			Ignore.method_cu_void(Class_l.field_ie_1132, i, i_5_, 586243738);
			Class_l.field_ie_1132 = null;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "do.dc()");
		}
	}
}
