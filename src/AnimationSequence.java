/* Class_an - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class AnimationSequence extends CacheableNode {
	public int field_q_194 = -1268856915;
	public static FileStore field_d_195;
	public static NodeCache field_y_196 = new NodeCache(64);
	public static NodeCache field_e_197 = new NodeCache(100);
	public static FileStore field_n_198;
	public int field_h_199 = 338083709;
	public int[] frames;
	public int[] field_a_201;
	public int field_j_202 = 686945425;
	int[] field_l_203;
	public boolean field_u_204 = false;
	public int[] cycle;
	public int field_k_206 = 3302581;
	public int field_x_207 = 840549851;
	public int field_v_208 = -959129506;
	public int field_r_209 = -2063820065;
	public int field_s_210 = -1126522493;
	static final int field_bs_211 = 1001;
	int[] field_f_212;
	public static final int field_bl_213 = 99;
	static Rasterizer2D compass;

	void method_d_void(final Buffer rsbytebuffer, final byte i) {
		try {
			for (;;) {
				final int i_0_ = rsbytebuffer.get();
				if (i_0_ == 0) {
					break;
				}
				method_z_void(rsbytebuffer, i_0_, (byte) 1);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "an.d()");
		}
	}

	void method_z_void(final Buffer rsbytebuffer, final int i, final byte i_1_) {
		try {
			if (i == 1) {
				final int i_2_ = rsbytebuffer.getShort();
				frames = new int[i_2_];
				for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
					frames[i_3_] = rsbytebuffer.getShort();
				}
				cycle = new int[i_2_];
				for (int i_4_ = 0; i_4_ < i_2_; i_4_++) {
					cycle[i_4_] = rsbytebuffer.getShort();
				}
				for (int i_5_ = 0; i_5_ < i_2_; i_5_++) {
					cycle[i_5_] += rsbytebuffer.getShort() << 16;
				}
			} else if (i == 2) {
				field_h_199 = rsbytebuffer.getShort() * -338083709;
			} else if (i == 3) {
				final int i_6_ = rsbytebuffer.get();
				this.field_l_203 = new int[1 + i_6_];
				for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
					this.field_l_203[i_7_] = rsbytebuffer.get();
				}
				this.field_l_203[i_6_] = 9999999;
			} else if (i == 4) {
				field_u_204 = true;
			} else if (i == 5) {
				field_q_194 = rsbytebuffer.get() * -253771383;
			} else if (i == 6) {
				field_k_206 = rsbytebuffer.getShort() * -3302581;
			} else if (i == 7) {
				field_x_207 = rsbytebuffer.getShort() * -840549851;
			} else if (i == 8) {
				field_r_209 = rsbytebuffer.get() * 326221397;
			} else if (i == 9) {
				field_j_202 = rsbytebuffer.get() * -686945425;
			} else if (i == 10) {
				field_s_210 = rsbytebuffer.get() * 1126522493;
			} else if (i == 11) {
				field_v_208 = rsbytebuffer.get() * 1667918895;
			} else if (i == 12) {
				final int i_8_ = rsbytebuffer.get();
				this.field_f_212 = new int[i_8_];
				for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
					this.field_f_212[i_9_] = rsbytebuffer.getShort();
				}
				for (int i_10_ = 0; i_10_ < i_8_; i_10_++) {
					this.field_f_212[i_10_] += rsbytebuffer.getShort() << 16;
				}
			} else if (i == 13) {
				final int i_11_ = rsbytebuffer.get();
				field_a_201 = new int[i_11_];
				for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
					field_a_201[i_12_] = rsbytebuffer.getMediumInt(-223209501);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "an.z()");
		}
	}

	void method_y_void(final int i) {
		try {
			if ((field_j_202 * 82293647) == -1) {
				if (this.field_l_203 != null) {
					field_j_202 = -1373890850;
				} else {
					field_j_202 = 0;
				}
			}
			if ((field_s_210 * -1255306539) == -1) {
				if (this.field_l_203 != null) {
					field_s_210 = -2041922310;
				} else {
					field_s_210 = 0;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "an.y()");
		}
	}

	public Model method_e_cg(final Model onscreenmodel, int i, final int i_13_) {
		Model onscreenmodel_14_;
		try {
			i = cycle[i];
			final Class_ci class_ci = Friend.method_h_ci(i >> 16, -252847057);
			i &= 0xffff;
			if (class_ci == null) {
				return onscreenmodel.method_z_cg(true);
			}
			final Model onscreenmodel_15_ = onscreenmodel.method_z_cg(!class_ci.method_n_boolean(i, -1240530580));
			onscreenmodel_15_.method_l_void(class_ci, i);
			onscreenmodel_14_ = onscreenmodel_15_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "an.e()");
		}
		return onscreenmodel_14_;
	}

	Model method_g_cg(final Model onscreenmodel, int i, int i_16_, final int i_17_) {
		Model onscreenmodel_18_;
		try {
			i = cycle[i];
			final Class_ci class_ci = Friend.method_h_ci(i >> 16, -1413729491);
			i &= 0xffff;
			if (class_ci == null) {
				return onscreenmodel.method_z_cg(true);
			}
			final Model onscreenmodel_19_ = onscreenmodel.method_z_cg(!class_ci.method_n_boolean(i, -400774638));
			i_16_ &= 0x3;
			if (i_16_ == 1) {
				onscreenmodel_19_.method_r_void();
			} else if (i_16_ == 2) {
				onscreenmodel_19_.method_x_void();
			} else if (i_16_ == 3) {
				onscreenmodel_19_.method_k_void();
			}
			onscreenmodel_19_.method_l_void(class_ci, i);
			if (i_16_ == 1) {
				onscreenmodel_19_.method_k_void();
			} else if (i_16_ == 2) {
				onscreenmodel_19_.method_x_void();
			} else if (i_16_ == 3) {
				onscreenmodel_19_.method_r_void();
			}
			onscreenmodel_18_ = onscreenmodel_19_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "an.g()");
		}
		return onscreenmodel_18_;
	}

	public Model method_m_cg(final Model onscreenmodel, int i, final AnimationSequence class_an_20_, int i_21_, final byte i_22_) {
		Model onscreenmodel_23_;
		try {
			i = cycle[i];
			final Class_ci class_ci = Friend.method_h_ci(i >> 16, -260500134);
			i &= 0xffff;
			if (class_ci == null) {
				return class_an_20_.method_e_cg(onscreenmodel, i_21_, 1134206453);
			}
			i_21_ = class_an_20_.cycle[i_21_];
			final Class_ci class_ci_24_ = Friend.method_h_ci(i_21_ >> 16, -1701248102);
			i_21_ &= 0xffff;
			if (class_ci_24_ == null) {
				final Model onscreenmodel_25_ = (onscreenmodel.method_z_cg(!class_ci.method_n_boolean(i, -1256964490)));
				onscreenmodel_25_.method_l_void(class_ci, i);
				return onscreenmodel_25_;
			}
			final Model onscreenmodel_26_ = (onscreenmodel.method_z_cg(!class_ci.method_n_boolean(i, -1271184792) & !class_ci_24_.method_n_boolean(i_21_, -1268543578)));
			onscreenmodel_26_.method_u_void(class_ci, i, class_ci_24_, i_21_, this.field_l_203);
			onscreenmodel_23_ = onscreenmodel_26_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "an.m()");
		}
		return onscreenmodel_23_;
	}

	public Model method_a_cg(final Model onscreenmodel, final int i, final short i_27_) {
		Model onscreenmodel_28_;
		try {
			int i_29_ = cycle[i];
			final Class_ci class_ci = Friend.method_h_ci(i_29_ >> 16, -85478825);
			i_29_ &= 0xffff;
			if (class_ci == null) {
				return onscreenmodel.method_z_cg(true);
			}
			Class_ci class_ci_30_ = null;
			int i_31_ = 0;
			if ((this.field_f_212 != null) && (i < this.field_f_212.length)) {
				i_31_ = this.field_f_212[i];
				class_ci_30_ = Friend.method_h_ci(i_31_ >> 16, -2089141299);
				i_31_ &= 0xffff;
			}
			if ((class_ci_30_ != null) && (i_31_ != 65535)) {
				final Model onscreenmodel_32_ = (onscreenmodel.method_z_cg(!class_ci.method_n_boolean(i_29_, 266559622) & !class_ci_30_.method_n_boolean(i_31_, -1562740855)));
				onscreenmodel_32_.method_l_void(class_ci, i_29_);
				onscreenmodel_32_.method_l_void(class_ci_30_, i_31_);
				return onscreenmodel_32_;
			}
			final Model onscreenmodel_33_ = (onscreenmodel.method_z_cg(!class_ci.method_n_boolean(i_29_, -1037581788)));
			onscreenmodel_33_.method_l_void(class_ci, i_29_);
			onscreenmodel_28_ = onscreenmodel_33_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "an.a()");
		}
		return onscreenmodel_28_;
	}

	Model method_f_cg(final Model onscreenmodel, int i, final byte i_34_) {
		Model onscreenmodel_35_;
		try {
			i = cycle[i];
			final Class_ci class_ci = Friend.method_h_ci(i >> 16, -2008993826);
			i &= 0xffff;
			if (class_ci == null) {
				return onscreenmodel.method_y_cg(true);
			}
			final Model onscreenmodel_36_ = onscreenmodel.method_y_cg(!class_ci.method_n_boolean(i, 374050760));
			onscreenmodel_36_.method_l_void(class_ci, i);
			onscreenmodel_35_ = onscreenmodel_36_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "an.f()");
		}
		return onscreenmodel_35_;
	}

	AnimationSequence() {
		/* empty */
	}

	public static Varp getVarp(final int i) {
		Varp class_ag;
		try {
			Varp class_ag_38_ = (Varp) Varp.field_z_61.method_n_gb(i);
			if (class_ag_38_ != null) {
				return class_ag_38_;
			}
			final byte[] is = Varp.field_n_63.getArchive(16, i);
			class_ag_38_ = new Varp();
			if (is != null) {
				class_ag_38_.method_z_void(new Buffer(is), 207825857);
			}
			Varp.field_z_61.method_z_void(class_ag_38_, i);
			class_ag = class_ag_38_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "an.d()");
		}
		return class_ag;
	}
}
