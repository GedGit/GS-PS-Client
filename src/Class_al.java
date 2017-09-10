/* Class_al - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_al {
	public static final int field_be_174 = 155;
	static final Class_al field_n_175 = new Class_al();
	static final Class_al field_z_176 = new Class_al();
	static final Class_al field_y_177 = new Class_al();
	static boolean field_aw_178;
	public static int field_ce_179;
	static final Class_al field_d_180 = new Class_al();
	public static final int field_bz_181 = 113;
	static int[] field_w_182;
	static Widget field_l_183;
	public static final int field_fn_184 = 3;
	static Rasterizer2D[] background;
	static final int field_q_186 = 4096;
	static int field_nw_187;

	public static int method_y_int(int i, final byte i_0_) {
		int i_1_;
		try {
			int i_2_ = 0;
			if ((i < 0) || (i >= 65536)) {
				i >>>= 16;
				i_2_ += 16;
			}
			if (i >= 256) {
				i >>>= 8;
				i_2_ += 8;
			}
			if (i >= 16) {
				i >>>= 4;
				i_2_ += 4;
			}
			if (i >= 4) {
				i >>>= 2;
				i_2_ += 2;
			}
			if (i >= 1) {
				i >>>= 1;
				i_2_++;
			}
			i_1_ = i + i_2_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "al.y()");
		}
		return i_1_;
	}

	Class_al() {
		/* empty */
	}
}
