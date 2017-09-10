/* Class_bw - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_bw {
	NodeMultiSet field_y_667 = new NodeMultiSet(256);
	FileStore field_d_668;
	NodeMultiSet field_z_669 = new NodeMultiSet(256);
	FileStore field_n_670;
	static long field_ap_671;
	public static final int field_do_672 = 88;
	public static final int field_f_673 = 9;
	static final int field_u_674 = 4;
	public static final int field_cv_675 = 249;
	public static final int field_bb_676 = 244;
	static int field_nd_677;

	Class_ba method_n_ba(final int i, final int i_0_, final int[] is, final int i_1_) {
		Class_ba class_ba;
		try {
			int i_2_ = i_0_ ^ (((i << 4) & 0xffff) | (i >>> 12));
			i_2_ |= i << 16;
			final long l = i_2_;
			Class_ba class_ba_3_ = (Class_ba) this.field_y_667.method_n_ga(l);
			if (class_ba_3_ != null) {
				return class_ba_3_;
			}
			if ((is != null) && (is[0] <= 0)) {
				return null;
			}
			final Class_bo class_bo = Class_bo.method_n_bo(this.field_n_670, i, i_0_);
			if (class_bo == null) {
				return null;
			}
			class_ba_3_ = class_bo.method_d_ba();
			this.field_y_667.method_d_void(class_ba_3_, l);
			if (is != null) {
				is[0] -= class_ba_3_.field_d_506.length;
			}
			class_ba = class_ba_3_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "bw.n()");
		}
		return class_ba;
	}

	public Class_bw(final FileStore class_fs, final FileStore class_fs_4_) {
		this.field_n_670 = class_fs;
		this.field_d_668 = class_fs_4_;
	}

	public Class_ba method_y_ba(final int i, final int[] is, final int i_5_) {
		try {
			if (this.field_d_668.method_k_int((short) -17718) == 1) {
				return method_d_ba(0, i, is, -848864452);
			}
			if (this.field_d_668.method_q_int(i, -1445635870) == 1) {
				return method_d_ba(i, 0, is, -2020512560);
			}
			throw new RuntimeException();
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "bw.y()");
		}
	}

	Class_ba method_d_ba(final int i, final int i_6_, final int[] is, final int i_7_) {
		Class_ba class_ba;
		try {
			int i_8_ = i_6_ ^ (((i << 4) & 0xffff) | (i >>> 12));
			i_8_ |= i << 16;
			final long l = i_8_ ^ 0x100000000L;
			Class_ba class_ba_9_ = (Class_ba) this.field_y_667.method_n_ga(l);
			if (class_ba_9_ != null) {
				return class_ba_9_;
			}
			if ((is != null) && (is[0] <= 0)) {
				return null;
			}
			Class_bz class_bz = (Class_bz) this.field_z_669.method_n_ga(l);
			if (class_bz == null) {
				class_bz = Class_bz.method_a_bz(this.field_d_668, i, i_6_);
				if (class_bz == null) {
					return null;
				}
				this.field_z_669.method_d_void(class_bz, l);
			}
			class_ba_9_ = class_bz.method_h_ba(is);
			if (class_ba_9_ == null) {
				return null;
			}
			class_bz.removeLink();
			this.field_y_667.method_d_void(class_ba_9_, l);
			class_ba = class_ba_9_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "bw.d()");
		}
		return class_ba;
	}

	public Class_ba method_z_ba(final int i, final int[] is, final int i_10_) {
		try {
			if (this.field_n_670.method_k_int((short) -29434) == 1) {
				return method_n_ba(0, i, is, -1959440543);
			}
			if (this.field_n_670.method_q_int(i, -1411628784) == 1) {
				return method_n_ba(i, 0, is, -1987722188);
			}
			throw new RuntimeException();
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "bw.z()");
		}
	}
}
