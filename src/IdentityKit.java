/* Class_ai - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class IdentityKit extends CacheableNode {
	public boolean disabled = false;
	static FileStore field_d_86;
	public static int field_z_87;
	public static NodeCache field_y_88 = new NodeCache(64);
	public int bodyPartIndex = 251733839;
	int[] bodyModels;
	short[] retex_d;
	short[] retex_s;
	short[] recol_d;
	public static final int field_ed_94 = 184;
	int[] headModels = { -1, -1, -1, -1, -1 };
	short[] recol_s;
	public static final int field_bv_97 = 28;
	static Rasterizer2D[] headicons_hint;
	static final int field_t_99 = 25;
	static int field_oa_100;
	public static final int field_ae_101 = 95;
	public static final int field_aq_102 = 108;
	static Class_hd b12Full;
	static FileStore field_n_104;

	void method_y_void(final Buffer rsbytebuffer, final int i, final int i_0_) {
		try {
			if (i == 1) {
				bodyPartIndex = rsbytebuffer.get() * -251733839;
			} else if (i == 2) {
				final int i_1_ = rsbytebuffer.get();
				this.bodyModels = new int[i_1_];
				for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
					this.bodyModels[i_2_] = rsbytebuffer.getShort();
				}
			} else if (i == 3) {
				disabled = true;
			} else if (i == 40) {
				final int i_3_ = rsbytebuffer.get();
				this.recol_s = new short[i_3_];
				this.recol_d = new short[i_3_];
				for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
					this.recol_s[i_4_] = (short) rsbytebuffer.getShort();
					this.recol_d[i_4_] = (short) rsbytebuffer.getShort();
				}
			} else if (i == 41) {
				final int i_5_ = rsbytebuffer.get();
				this.retex_s = new short[i_5_];
				this.retex_d = new short[i_5_];
				for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
					this.retex_s[i_6_] = (short) rsbytebuffer.getShort();
					this.retex_d[i_6_] = (short) rsbytebuffer.getShort();
				}
			} else if ((i >= 60) && (i < 70)) {
				this.headModels[i - 60] = rsbytebuffer.getShort();
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ai.y()");
		}
	}

	public OffScreenModel method_m_cy(final int i) {
		OffScreenModel rsmodel;
		try {
			final OffScreenModel[] rsmodels = new OffScreenModel[5];
			int i_7_ = 0;
			for (int i_8_ = 0; i_8_ < 5; i_8_++) {
				if (this.headModels[i_8_] != -1) {
					rsmodels[i_7_++] = OffScreenModel.getModel(field_d_86, (this.headModels[i_8_]), 0);
				}
			}
			final OffScreenModel rsmodel_9_ = new OffScreenModel(rsmodels, i_7_);
			if (this.recol_s != null) {
				for (int i_10_ = 0; i_10_ < this.recol_s.length; i_10_++) {
					rsmodel_9_.recolor((this.recol_s[i_10_]), (this.recol_d[i_10_]));
				}
			}
			if (this.retex_s != null) {
				for (int i_11_ = 0; i_11_ < this.retex_s.length; i_11_++) {
					rsmodel_9_.retexture((this.retex_s[i_11_]), (this.retex_d[i_11_]));
				}
			}
			rsmodel = rsmodel_9_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ai.m()");
		}
		return rsmodel;
	}

	public boolean method_e_boolean(final int i) {
		boolean bool;
		try {
			if (this.bodyModels == null) {
				return true;
			}
			boolean bool_12_ = true;
			for (int i_13_ = 0; i_13_ < this.bodyModels.length; i_13_++) {
				if (!field_d_86.method_e_boolean((this.bodyModels[i_13_]), 0, 393562583)) {
					bool_12_ = false;
				}
			}
			bool = bool_12_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ai.e()");
		}
		return bool;
	}

	public OffScreenModel method_g_cy(final int i) {
		OffScreenModel rsmodel;
		try {
			if (this.bodyModels == null) {
				return null;
			}
			final OffScreenModel[] rsmodels = new OffScreenModel[this.bodyModels.length];
			for (int i_14_ = 0; i_14_ < this.bodyModels.length; i_14_++) {
				rsmodels[i_14_] = OffScreenModel.getModel(field_d_86, this.bodyModels[i_14_], 0);
			}
			OffScreenModel rsmodel_15_;
			if (rsmodels.length == 1) {
				rsmodel_15_ = rsmodels[0];
			} else {
				rsmodel_15_ = new OffScreenModel(rsmodels, rsmodels.length);
			}
			if (this.recol_s != null) {
				for (int i_16_ = 0; i_16_ < this.recol_s.length; i_16_++) {
					rsmodel_15_.recolor((this.recol_s[i_16_]), (this.recol_d[i_16_]));
				}
			}
			if (this.retex_s != null) {
				for (int i_17_ = 0; i_17_ < this.retex_s.length; i_17_++) {
					rsmodel_15_.retexture((this.retex_s[i_17_]), (this.retex_d[i_17_]));
				}
			}
			rsmodel = rsmodel_15_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ai.g()");
		}
		return rsmodel;
	}

	public boolean method_f_boolean(final byte i) {
		boolean bool;
		try {
			boolean bool_18_ = true;
			for (int i_19_ = 0; i_19_ < 5; i_19_++) {
				if ((this.headModels[i_19_] != -1) && !field_d_86.method_e_boolean((this.headModels[i_19_]), 0, 1833539029)) {
					bool_18_ = false;
				}
			}
			bool = bool_18_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ai.f()");
		}
		return bool;
	}

	void method_z_void(final Buffer rsbytebuffer, final byte i) {
		try {
			for (;;) {
				final int i_20_ = rsbytebuffer.get();
				if (i_20_ == 0) {
					break;
				}
				method_y_void(rsbytebuffer, i_20_, 1225416810);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ai.z()");
		}
	}

	IdentityKit() {
		/* empty */
	}

	static void method_z_void(final int i, final String string, final String string_21_, final String string_22_, final int i_23_) {
		try {
			Class_i class_i = Class_l.field_n_1130.get(i);
			if (class_i == null) {
				class_i = new Class_i();
				Class_l.field_n_1130.put(i, class_i);
			}
			final GameMessage gamemessage = class_i.method_n_as(i, string, string_21_, string_22_, 955202307);
			Class_l.gameMessagesTable.add(gamemessage, (gamemessage.field_n_307) * -1471797213);
			Class_l.field_z_1131.method_d_void(gamemessage);
			client.field_kc_2879 = client.field_kj_2850 * -2145280325;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ai.z()");
		}
	}
}
