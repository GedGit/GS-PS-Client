/* Class_fm - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_fm extends Node {
	int field_a_2389;
	Class_fb field_d_2390;
	Class_ba field_z_2391;
	int field_h_2392;
	int field_o_2393;
	int field_g_2394;
	int field_f_2395;
	Class_fo field_y_2396;
	int field_e_2397;
	int field_m_2398;
	int field_l_2399;
	int field_u_2400;
	int field_n_2401;
	int field_k_2402;
	int field_q_2403;
	int field_r_2404;
	int field_x_2405;
	int field_s_2406;
	Class_bd field_v_2407;
	int field_c_2408;
	int field_j_2409;
	static int menuX;

	static final void translateToCamera(int i, int i_0_, final int i_1_) {
		try {
			if ((i >= 128) && (i_0_ >= 128) && (i <= 13056) && (i_0_ <= 13056)) {
				int z = (Class_q.getTileHeight(i, i_0_, 250114511 * Class_ed.plane) - i_1_);
				i -= 548221253 * Menu.cameraX;
				z -= Class_d.cameraZ * 424565779;
				i_0_ -= 1900802031 * GameMessage.cameraY;
				final int i_4_ = (Rasterizer3D.SINE[633664789 * World.cameraPitch]);
				final int i_5_ = (Rasterizer3D.COSINE[633664789 * World.cameraPitch]);
				final int i_6_ = Rasterizer3D.SINE[FloorOverlay.cameraYaw * -467172345];
				final int i_7_ = Rasterizer3D.COSINE[-467172345 * FloorOverlay.cameraYaw];
				int i_8_ = ((i_7_ * i) + (i_0_ * i_6_)) >> 16;
			i_0_ = ((i_0_ * i_7_) - (i_6_ * i)) >> 16;
			i = i_8_;
			i_8_ = ((i_5_ * z) - (i_4_ * i_0_)) >> 16;
			i_0_ = ((i_5_ * i_0_) + (z * i_4_)) >> 16;
			if (i_0_ >= 50) {// had to do this method in my bot lol
				client.field_gp_2790 = ((((i * client.viewportScale * -388831203) / i_0_) + ((659941927 * client.field_om_2953) / 2)) * -587570793);
				client.field_gx_2704 = ((((549621553 * client.field_ou_2820) / 2) + ((-388831203 * client.viewportScale * i_8_) / i_0_)) * 58397871);
			} else {
				client.field_gp_2790 = 587570793;
				client.field_gx_2704 = -58397871;
			}
			} else {
				client.field_gp_2790 = 587570793;
				client.field_gx_2704 = -58397871;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fm.bw()");
		}
	}

	Class_fm() {
		/* empty */
	}

	void method_n_void(final byte i) {
		try {
			this.field_d_2390 = null;
			this.field_z_2391 = null;
			this.field_y_2396 = null;
			this.field_v_2407 = null;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fm.n()");
		}
	}
}
