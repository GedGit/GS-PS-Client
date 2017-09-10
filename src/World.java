/* WorldInfo - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class World {
	int players;
	static final int field_z_1388 = 1;
	static final int field_y_1389 = 0;
	int mask;
	static int totalWorlds = 0;
	static int field_f_1392 = 0;
	static int[] field_m_1393 = { 1, 1, 1, 1 };
	static int[] field_a_1394 = { 0, 1, 2, 3 };
	static World[] worlds;
	public static final int field_gn_1396 = 55;
	static Index musicIndex1;
	String address;
	String activity;
	int country;
	static int cameraPitch;
	static final int field_ag_1402 = 8;
	static final int field_n_1403 = 3;
	int field_j_1404;
	int id;

	boolean method_q_boolean() {
		boolean bool;
		try {
			if ((0x8 & (this.mask * -1273754019)) != 0) {
				return true;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "t.q()");
		}
		return bool;
	}

	public static Rasterizer2D method_f_bx(final FileStore class_fs, final String string, final String string_0_, final byte i) {
		Rasterizer2D class_bx;
		try {
			final int i_1_ = class_fs.getByName(string);
			final int i_2_ = class_fs.getFileIndex(i_1_, string_0_);
			Rasterizer2D class_bx_3_;
			if (!Region.method_h_boolean(class_fs, i_1_, i_2_, 1079958178)) {
				class_bx_3_ = null;
			} else {
				final Rasterizer2D rasterizer = new Rasterizer2D();
				rasterizer.field_g_683 = -1808307607 * GameCanvas.field_d_2228;
				rasterizer.field_f_678 = -1626806585 * Class_bk.field_z_584;
				rasterizer.field_y_682 = Class_bk.field_y_579[0];
				rasterizer.field_e_680 = Class_bk.field_e_580[0];
				rasterizer.field_d_679 = Class_fv.field_g_2506[0];
				rasterizer.field_z_685 = Class_bk.field_f_581[0];
				final int i_5_ = rasterizer.field_z_685 * rasterizer.field_d_679;
				final byte[] is = Class_bk.field_a_585[0];
				rasterizer.field_n_681 = new int[i_5_];
				for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
					rasterizer.field_n_681[i_6_] = Class_l.field_m_1134[is[i_6_] & 0xff];
				}
				ItemComposite.method_u_void(-1231170034);
				class_bx_3_ = rasterizer;
			}
			class_bx = class_bx_3_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "t.f()");
		}
		return class_bx;
	}

	boolean isMembers() {
		boolean bool;
		try {
			if ((0x1 & (this.mask * -1273754019)) != 0) {
				return true;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "t.h()");
		}
		return bool;
	}

	World() {
		/* empty */
	}

	boolean method_l_boolean(final int i) {
		boolean bool;
		try {
			if ((0x2 & (this.mask * -1273754019)) != 0) {
				return true;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "t.l()");
		}
		return bool;
	}

	boolean method_u_boolean(final int i) {
		boolean bool;
		try {
			if ((0x4 & (this.mask * -1273754019)) != 0) {
				return true;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "t.u()");
		}
		return bool;
	}
}
