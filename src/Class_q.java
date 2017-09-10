/* Class_q - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_q implements Runnable {
	static String clientSettings;
	Object field_d_1254 = new Object();
	int field_z_1255 = 0;
	static final int field_aq_1256 = 53;
	int[] field_e_1257 = new int[500];
	static int originX;
	int[] field_y_1259 = new int[500];
	static final int field_ah_1260 = 16;
	boolean field_n_1261 = true;

	static final void method_c_void(final int i) {
		try {
			Class_et.method_e_void(-655595731);
			FloorOverlay.field_d_1.method_y_void();
			IdentityKit.field_y_88.method_y_void();
			ObjectComposite.OBJECTS.method_y_void();
			ObjectComposite.field_e_317.method_y_void();
			ObjectComposite.field_g_318.method_y_void();
			ObjectComposite.field_f_319.method_y_void();
			NpcComposite.field_z_465.method_y_void();
			NpcComposite.field_y_466.method_y_void();
			ISAACCipher.method_r_void(-1473801907);
			AnimationSequence.field_y_196.method_y_void();
			AnimationSequence.field_e_197.method_y_void();
			SpotAnim.field_z_400.method_y_void();
			SpotAnim.field_y_401.method_y_void();
			VarpBit.field_d_282.method_y_void();
			Varp.field_z_61.method_y_void();
			PlayerComposite.field_u_2309.method_y_void();
			Friend.method_r_void(-1607575456);
			((Class_cc) Rasterizer3D.field_ak_1157).method_j_void(1180734072);
			ClientScript.field_n_838.method_y_void();
			Class_s.skeletonIndex.method_r_void(-257641985);
			Class_dr.skinIndex.method_r_void(-2133435811);
			Class_k.widgetIndex.method_r_void(508405414);
			Class_dw.soundFXIndex1.method_r_void(12099670);
			ItemContainer.terrainIndex.method_r_void(-1366232615);
			World.musicIndex1.method_r_void(219970244);
			Class_fb.modelIndex.method_r_void(-64855997);
			Class_cj.spriteIndex.method_r_void(996464900);
			GameMessage.textureIndex.method_r_void(564385871);
			Class_cr.huffmanIndex.method_r_void(-1744400409);
			Class_gt.musicIndex2.method_r_void(925532475);
			Class_gh.cs2Index.method_r_void(316412149);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "q.c()");
		}
	}

	Class_q() {
		/* empty */
	}

	static final int getTileHeight(final int i, final int i_0_, final int i_1_) {
		do {
			int i_3_;
			try {
				final int i_4_ = i >> 7;
				final int i_5_ = i_0_ >> 7;
				if ((i_4_ < 0) || (i_5_ < 0) || (i_4_ > 103) || (i_5_ > 103)) {
					break;
				}
				int i_6_ = i_1_;
				if ((i_1_ < 3) && ((Region.sceneFlags[1][i_4_][i_5_] & 0x2) == 2)) {
					i_6_ = i_1_ + 1;
				}
				final int i_7_ = i & 0x7f;
				final int i_8_ = i_0_ & 0x7f;
				final int i_9_ = (((Region.heightMaps[i_6_][i_4_][i_5_] * (128 - i_7_))
						+ (i_7_ * Region.heightMaps[i_6_][1 + i_4_][i_5_])) >> 7);
				final int i_10_ = (((Region.heightMaps[i_6_][i_4_][1 + i_5_] * (128 - i_7_))
						+ (i_7_ * Region.heightMaps[i_6_][i_4_ + 1][1 + i_5_])) >> 7);
				i_3_ = ((i_8_ * i_10_) + (i_9_ * (128 - i_8_))) >> 7;
			} catch (final RuntimeException runtimeexception) {
				throw GameCanvas.error(runtimeexception, "q.bm()");
			}
			return i_3_;
		} while (false);
		return 0;
	}

	static Build[] method_n_exArray(final byte i) {
		Build[] class_exes;
		try {
			class_exes = (new Build[] { Build.LIVE, Build.WIP, Build.RC, Build.BUILD_LIVE });
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "q.n()");
		}
		return class_exes;
	}

	@Override
	public void run() {
		try {
			while (this.field_n_1261) {
				final Object object = this.field_d_1254;
				synchronized (object) {
					if ((this.field_z_1255 * 1219764211) < 500) {
						this.field_y_1259[this.field_z_1255 * 1219764211] = 1515107729
								* MouseInputListener.field_m_2156;
						this.field_e_1257[this.field_z_1255 * 1219764211] = MouseInputListener.field_a_2157
								* -2089478689;
						this.field_z_1255 += -1559457477;
					}
				}
				Class_fc.sleep(50L);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "q.run()");
		}
	}
}
