/* Class_eo - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_eo {
	public static final int field_f_2183 = 57;
	public static final int field_d_2184 = 32;
	static Rasterizer2D[] mapdots;
	public static final int field_e_2186 = 55;
	public static final int field_g_2187 = 56;
	public static final int field_n_2188 = 31;
	public static final int field_h_2189 = 256;
	public static final int field_y_2190 = 38;
	public static final int field_as_2191 = 205;
	public static final int field_bg_2192 = 93;

	Class_eo() throws Throwable {
		throw new Error();
	}

	static Rasterizer2D[] method_d_bxArray(final FileStore class_fs, final int i, final int i_0_, final int i_1_) {
		Rasterizer2D[] class_bxes;
		try {
			if (!Region.method_h_boolean(class_fs, i, i_0_, 1079958178)) {
				return null;
			}
			final Rasterizer2D[] class_bxes_2_ = new Rasterizer2D[298614355 * Class_bk.field_n_583];
			for (int i_3_ = 0; i_3_ < (298614355 * Class_bk.field_n_583); i_3_++) {
				final Rasterizer2D class_bx = class_bxes_2_[i_3_] = new Rasterizer2D();
				class_bx.field_g_683 = -1808307607 * GameCanvas.field_d_2228;
				class_bx.field_f_678 = Class_bk.field_z_584 * -1626806585;
				class_bx.field_y_682 = Class_bk.field_y_579[i_3_];
				class_bx.field_e_680 = Class_bk.field_e_580[i_3_];
				class_bx.field_d_679 = Class_fv.field_g_2506[i_3_];
				class_bx.field_z_685 = Class_bk.field_f_581[i_3_];
				final int i_4_ = class_bx.field_d_679 * class_bx.field_z_685;
				final byte[] is = Class_bk.field_a_585[i_3_];
				class_bx.field_n_681 = new int[i_4_];
				for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
					class_bx.field_n_681[i_5_] = Class_l.field_m_1134[is[i_5_] & 0xff];
				}
			}
			ItemComposite.method_u_void(-1231170034);
			class_bxes = class_bxes_2_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "eo.d()");
		}
		return class_bxes;
	}
}
