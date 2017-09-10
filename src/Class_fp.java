/* Class_fp - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_fp extends CacheableNode {
	public final int field_d_2424;
	public static final int field_cn_2425 = 114;
	public final int[] field_z_2426;
	public final int field_n_2427;
	final int field_e_2428;
	static Class_s field_h_2429;
	public final int[] field_y_2430;

	public boolean method_n_boolean(final int i, final int i_0_, final int i_1_) {
		do {
			try {
				if ((i_0_ < 0) || (i_0_ >= field_y_2430.length)) {
					break;
				}
				final int i_2_ = field_y_2430[i_0_];
				if ((i < i_2_) || (i > (i_2_ + field_z_2426[i_0_]))) {
					break;
				}
			} catch (final RuntimeException runtimeexception) {
				throw GameCanvas.error(runtimeexception, "fp.n()");
			}
			return true;
		} while (false);
		return false;
	}

	Class_fp(final int i, final int i_3_, final int[] is, final int[] is_4_, final int i_5_) {
		field_n_2427 = 569548819 * i;
		field_d_2424 = i_3_ * 1661024865;
		field_z_2426 = is;
		field_y_2430 = is_4_;
		field_e_2428 = i_5_ * 962094803;
	}

	static final void registerGameObject(final int z, final int i_6_, final int i_7_, final int i_8_, final int id, final int i_10_, final int i_11_, final int i_12_, final int i_13_, final byte i_14_) {
		try {
			Class_r class_r = null;
			for (Class_r class_r_15_ = (Class_r) client.field_hv_2821.method_f_ga(); class_r_15_ != null; class_r_15_ = (Class_r) client.field_hv_2821.method_a_ga()) {
				if (((-227080595 * class_r_15_.plane) == z) && (i_6_ == (-201892019 * class_r_15_.field_y_1326)) && ((class_r_15_.field_e_1327 * -2129494015) == i_7_) && (i_8_ == (class_r_15_.field_d_1325 * 1901552375))) {
					class_r = class_r_15_;
					break;
				}
			}
			if (class_r == null) {
				class_r = new Class_r();
				class_r.plane = z * 152433509;
				class_r.field_d_1325 = 1021836999 * i_8_;
				class_r.field_y_1326 = 1154806149 * i_6_;
				class_r.field_e_1327 = i_7_ * -1091731455;
				Friend.method_bz_void(class_r, 159623365);
				client.field_hv_2821.add(class_r);
			}
			class_r.field_m_1331 = id * -720437839;
			class_r.field_h_1324 = 706763469 * i_10_;
			class_r.field_a_1337 = -1615289015 * i_11_;
			class_r.field_l_1334 = i_12_ * 384912115;
			class_r.field_u_1335 = i_13_ * 336088303;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fp.bt()");
		}
	}
}
