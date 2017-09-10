/* ObjectDef - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

public class ObjectComposite extends CacheableNode {
	static OffScreenModel[] field_m_313 = new OffScreenModel[4];
	public int field_p_314 = 604236509;
	static FileStore field_z_315;
	public String[] actions = new String[5];
	public static NodeCache field_e_317 = new NodeCache(500);
	public static NodeCache field_g_318 = new NodeCache(30);
	public static NodeCache field_f_319 = new NodeCache(30);
	short[] recol_s;
	public int id;
	int[] field_h_322;
	int[] field_l_323;
	public String name = "null";
	public int length = -1659530413;
	short[] recol_d;
	int field_ad_327 = 0;
	public int field_v_328 = -608801926;
	int field_aa_329 = 0;
	public int width = -367416303;
	int field_ak_331 = 0;
	public static final int field_gv_332 = 49;
	short[] retex_d;
	public boolean field_as_334 = true;
	boolean field_b_335 = false;
	public boolean field_t_336 = false;
	public int field_w_337 = 1156460963;
	public int field_am_338 = -502797515;
	public int field_i_339 = 1566737424;
	public int field_aj_340 = 0;
	public boolean field_c_341 = true;
	public int field_ax_342 = 244642875;
	public int field_al_343 = 1079631953;
	boolean field_ar_344 = false;
	public static final NodeCache OBJECTS = new NodeCache(64);
	int field_ab_346 = 1879094400;
	static boolean field_n_347 = false;
	int field_ac_348 = -1272581760;
	int field_az_349 = 0;
	int field_at_350 = 0;
	int field_o_351 = 214720057;
	public boolean field_an_352 = false;
	boolean field_aw_353 = false;
	public int field_ai_354 = 821824011;
	public int[] childrenIds;
	int field_aq_356 = -1251577451;
	int field_ay_357 = 350508015;
	int field_ao_358 = 1448134272;
	short[] retex_s;
	public int field_ag_360 = 0;
	public int field_ap_361 = 0;
	public int[] field_af_362;
	int surroundings;
	public static Canvas canvas;
	public static final int field_fj_364 = 101;
	static FileStore configArchiveRef;
	public static final int field_by_366 = 59;

	void method_z_void(final short i) {
		try {
			if ((154452619 * field_p_314) == -1) {
				field_p_314 = 0;
				if ((this.field_h_322 != null) && ((this.field_l_323 == null) || (this.field_l_323[0] == 10))) {
					field_p_314 = -604236509;
				}
				for (int i_0_ = 0; i_0_ < 5; i_0_++) {
					if (actions[i_0_] != null) {
						field_p_314 = -604236509;
					}
				}
			}
			if ((700665437 * field_ai_354) == -1) {
				field_ai_354 = -821824011 * ((field_v_328 * -812798571) != 0 ? 1 : 0);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "at.z()");
		}
	}

	void readOpcode(final Buffer rsbytebuffer, final int i, final byte i_1_) {
		try {
			if (i == 1) {
				final int i_2_ = rsbytebuffer.get();
				if (i_2_ > 0) {
					if ((this.field_h_322 != null) && !field_n_347) {
						rsbytebuffer.position += i_2_ * -2057570067;
					} else {
						this.field_l_323 = new int[i_2_];
						this.field_h_322 = new int[i_2_];
						for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
							this.field_h_322[i_3_] = rsbytebuffer.getShort();
							this.field_l_323[i_3_] = rsbytebuffer.get();
						}
					}
				}
			} else if (i == 2) {
				name = rsbytebuffer.getString();
			} else if (i == 5) {
				final int i_4_ = rsbytebuffer.get();
				if (i_4_ > 0) {
					if ((this.field_h_322 != null) && !field_n_347) {
						rsbytebuffer.position += -1371713378 * i_4_;
					} else {
						this.field_l_323 = null;
						this.field_h_322 = new int[i_4_];
						for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
							this.field_h_322[i_5_] = rsbytebuffer.getShort();
						}
					}
				}
			} else if (i == 14) {
				width = rsbytebuffer.get() * -367416303;
			} else if (i == 15) {
				length = rsbytebuffer.get() * -1659530413;
			} else if (i == 17) {
				field_v_328 = 0;
				field_c_341 = false;
			} else if (i == 18) {
				field_c_341 = false;
			} else if (i == 19) {
				field_p_314 = rsbytebuffer.get() * -604236509;
			} else if (i == 21) {
				this.field_o_351 = 0;
			} else if (i == 22) {
				this.field_b_335 = true;
			} else if (i == 23) {
				field_t_336 = true;
			} else if (i == 24) {
				field_w_337 = rsbytebuffer.getShort() * -1156460963;
				if ((field_w_337 * -353798667) == 65535) {
					field_w_337 = 1156460963;
				}
			} else if (i == 27) {
				field_v_328 = -304400963;
			} else if (i == 28) {
				field_i_339 = rsbytebuffer.get() * 1976969281;
			} else if (i == 29) {
				this.field_ad_327 = rsbytebuffer.getSigned() * -1564819845;
			} else if (i == 39) {
				this.field_ak_331 = rsbytebuffer.getSigned() * -1345642373;
			} else if ((i >= 30) && (i < 35)) {
				actions[i - 30] = rsbytebuffer.getString();
				if (actions[i - 30].equalsIgnoreCase(MenuText.HIDDEN)) {
					actions[i - 30] = null;
				}
			} else if (i == 40) {
				final int i_6_ = rsbytebuffer.get();
				this.recol_s = new short[i_6_];
				this.recol_d = new short[i_6_];
				for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
					this.recol_s[i_7_] = (short) rsbytebuffer.getShort();
					this.recol_d[i_7_] = (short) rsbytebuffer.getShort();
				}
			} else if (i == 41) {
				final int i_8_ = rsbytebuffer.get();
				this.retex_s = new short[i_8_];
				this.retex_d = new short[i_8_];
				for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
					this.retex_s[i_9_] = (short) rsbytebuffer.getShort();
					this.retex_d[i_9_] = (short) rsbytebuffer.getShort();
				}
			} else if (i == 60) {
				field_ax_342 = rsbytebuffer.getShort() * -244642875;
			} else if (i == 62) {
				this.field_ar_344 = true;
			} else if (i == 64) {
				field_as_334 = false;
			} else if (i == 65) {
				this.field_ab_346 = rsbytebuffer.getShort() * -320863895;
			} else if (i == 66) {
				this.field_ao_358 = rsbytebuffer.getShort() * -290676339;
			} else if (i == 67) {
				this.field_ac_348 = rsbytebuffer.getShort() * 1466452963;
			} else if (i == 68) {
				field_al_343 = rsbytebuffer.getShort() * -1079631953;
			} else if (i == 69) {
				surroundings = rsbytebuffer.get();
			} else if (i == 70) {
				this.field_az_349 = rsbytebuffer.getShort((byte) 31) * 888779119;
			} else if (i == 71) {
				this.field_at_350 = rsbytebuffer.getShort((byte) -74) * 88676261;
			} else if (i == 72) {
				this.field_aa_329 = rsbytebuffer.getShort((byte) -84) * -2726519;
			} else if (i == 73) {
				field_an_352 = true;
			} else if (i == 74) {
				this.field_aw_353 = true;
			} else if (i == 75) {
				field_ai_354 = rsbytebuffer.get() * -821824011;
			} else if (i == 77) {
				this.field_aq_356 = rsbytebuffer.getShort() * 1251577451;
				if ((this.field_aq_356 * 466202179) == 65535) {
					this.field_aq_356 = -1251577451;
				}
				this.field_ay_357 = rsbytebuffer.getShort() * -350508015;
				if ((1440138481 * this.field_ay_357) == 65535) {
					this.field_ay_357 = 350508015;
				}
				final int i_10_ = rsbytebuffer.get();
				childrenIds = new int[1 + i_10_];
				for (int i_11_ = 0; i_11_ <= i_10_; i_11_++) {
					childrenIds[i_11_] = rsbytebuffer.getShort();
					if (childrenIds[i_11_] == 65535) {
						childrenIds[i_11_] = -1;
					}
				}
			} else if (i == 78) {
				field_am_338 = rsbytebuffer.getShort() * 502797515;
				field_aj_340 = rsbytebuffer.get() * 1127501975;
			} else if (i == 79) {
				field_ag_360 = rsbytebuffer.getShort() * 282521483;
				field_ap_361 = rsbytebuffer.getShort() * -1890755797;
				field_aj_340 = rsbytebuffer.get() * 1127501975;
				final int i_12_ = rsbytebuffer.get();
				field_af_362 = new int[i_12_];
				for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
					field_af_362[i_13_] = rsbytebuffer.getShort();
				}
			} else if (i == 81) {
				this.field_o_351 = rsbytebuffer.get() * 866240256;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "at.e()");
		}
	}

	public final boolean method_g_boolean(final int i, final int i_14_) {
		boolean bool;
		try {
			if (this.field_l_323 != null) {
				for (int i_15_ = 0; i_15_ < this.field_l_323.length; i_15_++) {
					if (i == this.field_l_323[i_15_]) {
						return field_z_315.method_e_boolean((this.field_h_322[i_15_]) & 0xffff, 0, 817087340);
					}
				}
				return true;
			}
			if (this.field_h_322 == null) {
				return true;
			}
			if (i != 10) {
				return true;
			}
			boolean bool_16_ = true;
			for (final int element : this.field_h_322) {
				bool_16_ &= field_z_315.method_e_boolean(((element) & 0xffff), 0, 1045888126);
			}
			bool = bool_16_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "at.g()");
		}
		return bool;
	}

	public final Model method_h_cg(final int i, final int i_18_, final int[][] is, final int i_19_, final int i_20_, final int i_21_, final AnimationSequence class_an, final int i_22_, final int i_23_) {
		Model onscreenmodel;
		try {
			long l;
			if (this.field_l_323 == null) {
				l = ((id * 267197795) << 10) + i_18_;
			} else {
				l = ((id * 267197795) << 10) + (i << 3) + i_18_;
			}
			Model onscreenmodel_24_ = (Model) field_f_319.method_n_gb(l);
			if (onscreenmodel_24_ == null) {
				final OffScreenModel rsmodel = method_l_cy(i, i_18_, 1203003036);
				if (rsmodel == null) {
					return null;
				}
				onscreenmodel_24_ = (rsmodel.method_ad_cg(64 + (1813344435 * this.field_ad_327), 768 + (this.field_ak_331 * 323067771), -50, -10, -50));
				field_f_319.method_z_void(onscreenmodel_24_, l);
			}
			if ((class_an == null) && ((this.field_o_351 * -878063625) == -1)) {
				return onscreenmodel_24_;
			}
			if (class_an != null) {
				onscreenmodel_24_ = class_an.method_g_cg(onscreenmodel_24_, i_22_, i_18_, -1651891001);
			} else {
				onscreenmodel_24_ = onscreenmodel_24_.method_z_cg(true);
			}
			if ((this.field_o_351 * -878063625) >= 0) {
				onscreenmodel_24_ = onscreenmodel_24_.method_n_cg(is, i_19_, i_20_, i_21_, false, ((this.field_o_351) * -878063625));
			}
			onscreenmodel = onscreenmodel_24_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "at.h()");
		}
		return onscreenmodel;
	}

	final OffScreenModel method_l_cy(final int i, int i_25_, final int i_26_) {
		OffScreenModel rsmodel;
		try {
			OffScreenModel rsmodel_27_ = null;
			if (this.field_l_323 == null) {
				if (i != 10) {
					return null;
				}
				if (this.field_h_322 == null) {
					return null;
				}
				boolean bool = this.field_ar_344;
				if ((i == 2) && (i_25_ > 3)) {
					bool = !bool;
				}
				final int i_28_ = this.field_h_322.length;
				for (int i_29_ = 0; i_29_ < i_28_; i_29_++) {
					int i_30_ = this.field_h_322[i_29_];
					if (bool) {
						i_30_ += 65536;
					}
					rsmodel_27_ = (OffScreenModel) field_e_317.method_n_gb(i_30_);
					if (rsmodel_27_ == null) {
						rsmodel_27_ = OffScreenModel.getModel(field_z_315, i_30_ & 0xffff, 0);
						if (rsmodel_27_ == null) {
							return null;
						}
						if (bool) {
							rsmodel_27_.method_s_void();
						}
						field_e_317.method_z_void(rsmodel_27_, i_30_);
					}
					if (i_28_ > 1) {
						field_m_313[i_29_] = rsmodel_27_;
					}
				}
				if (i_28_ > 1) {
					rsmodel_27_ = new OffScreenModel(field_m_313, i_28_);
				}
			} else {
				int i_31_ = -1;
				for (int i_32_ = 0; i_32_ < this.field_l_323.length; i_32_++) {
					if (this.field_l_323[i_32_] == i) {
						i_31_ = i_32_;
						break;
					}
				}
				if (i_31_ == -1) {
					return null;
				}
				int i_33_ = this.field_h_322[i_31_];
				final boolean bool = this.field_ar_344 ^ (i_25_ > 3);
				if (bool) {
					i_33_ += 65536;
				}
				rsmodel_27_ = (OffScreenModel) field_e_317.method_n_gb(i_33_);
				if (rsmodel_27_ == null) {
					rsmodel_27_ = OffScreenModel.getModel(field_z_315, i_33_ & 0xffff, 0);
					if (rsmodel_27_ == null) {
						return null;
					}
					if (bool) {
						rsmodel_27_.method_s_void();
					}
					field_e_317.method_z_void(rsmodel_27_, i_33_);
				}
			}
			boolean bool;
			if (((this.field_ab_346 * 1665179353) == 128) && ((this.field_ao_358 * -770406075) == 128) && ((this.field_ac_348 * -488418869) == 128)) {
				bool = false;
			} else {
				bool = true;
			}
			boolean bool_34_;
			if (((this.field_az_349 * 1234226575) == 0) && ((-636225491 * this.field_at_350) == 0) && ((-33316679 * this.field_aa_329) == 0)) {
				bool_34_ = false;
			} else {
				bool_34_ = true;
			}
			final OffScreenModel rsmodel_35_ = new OffScreenModel(rsmodel_27_, (i_25_ == 0) && !bool && !bool_34_, this.recol_s == null, this.retex_s == null, true);
			if ((i == 4) && (i_25_ > 3)) {
				rsmodel_35_.method_k_void(256);
				rsmodel_35_.method_x_void(45, 0, -45);
			}
			i_25_ &= 0x3;
			if (i_25_ == 1) {
				rsmodel_35_.method_l_void();
			} else if (i_25_ == 2) {
				rsmodel_35_.method_u_void();
			} else if (i_25_ == 3) {
				rsmodel_35_.method_q_void();
			}
			if (this.recol_s != null) {
				for (int i_36_ = 0; i_36_ < this.recol_s.length; i_36_++) {
					rsmodel_35_.recolor((this.recol_s[i_36_]), (this.recol_d[i_36_]));
				}
			}
			if (this.retex_s != null) {
				for (int i_37_ = 0; i_37_ < this.retex_s.length; i_37_++) {
					rsmodel_35_.retexture((this.retex_s[i_37_]), (this.retex_d[i_37_]));
				}
			}
			if (bool) {
				rsmodel_35_.method_v_void(1665179353 * this.field_ab_346, this.field_ao_358 * -770406075, this.field_ac_348 * -488418869);
			}
			if (bool_34_) {
				rsmodel_35_.method_x_void(1234226575 * this.field_az_349, -636225491 * this.field_at_350, this.field_aa_329 * -33316679);
			}
			rsmodel = rsmodel_35_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "at.l()");
		}
		return rsmodel;
	}

	public boolean method_q_boolean(final byte i) {
		try {
			if (childrenIds == null) {
				if (((1592701155 * field_am_338) == -1) && (field_af_362 == null)) {
					return false;
				}
				return true;
			}
			for (final int childrenId : childrenIds) {
				if (childrenId != -1) {
					final ObjectComposite objectdef_39_ = Class_cj.getObjectComposite(childrenId);
					if (((objectdef_39_.field_am_338 * 1592701155) != -1) || (objectdef_39_.field_af_362 != null)) {
						return true;
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "at.q()");
		}
		return false;
	}

	void decode(final Buffer rsbytebuffer, final int i) {
		try {
			for (;;) {
				final int i_40_ = rsbytebuffer.get();
				if (i_40_ == 0) {
					break;
				}
				readOpcode(rsbytebuffer, i_40_, (byte) -103);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "at.y()");
		}
	}

	public final ObjectComposite method_u_at(final byte i) {
		ObjectComposite objectdef_41_;
		try {
			int i_42_ = -1;
			if ((this.field_aq_356 * 466202179) != -1) {
				i_42_ = Class_s.method_n_int((this.field_aq_356 * 466202179), (byte) -14);
			} else if ((this.field_ay_357 * 1440138481) != -1) {
				i_42_ = (Class_fv.configs[1440138481 * this.field_ay_357]);
			}
			objectdef_41_ = (((i_42_ >= 0) && (i_42_ < childrenIds.length) && (childrenIds[i_42_] != -1)) ? Class_cj.getObjectComposite(childrenIds[i_42_]) : null);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "at.u()");
		}
		return objectdef_41_;
	}

	ObjectComposite() {
		/* empty */
	}

	public final Renderable method_m_cb(final int i, final int i_43_, final int[][] is, final int i_44_, final int i_45_, final int i_46_, final byte i_47_) {
		Renderable renderable;
		try {
			long l;
			if (this.field_l_323 == null) {
				l = ((267197795 * id) << 10) + i_43_;
			} else {
				l = (i << 3) + ((id * 267197795) << 10) + i_43_;
			}
			Renderable renderable_48_ = (Renderable) field_g_318.method_n_gb(l);
			if (renderable_48_ == null) {
				final OffScreenModel rsmodel = method_l_cy(i, i_43_, 977610070);
				if (rsmodel == null) {
					return null;
				}
				if (!this.field_b_335) {
					renderable_48_ = (rsmodel.method_ad_cg(64 + (this.field_ad_327 * 1813344435), (this.field_ak_331 * 323067771) + 768, -50, -10, -50));
				} else {
					rsmodel.field_ao_1482 = (short) (64 + (this.field_ad_327 * 1813344435));
					rsmodel.field_ac_1483 = (short) (768 + (323067771 * this.field_ak_331));
					rsmodel.method_c_void();
					renderable_48_ = rsmodel;
				}
				field_g_318.method_z_void(renderable_48_, l);
			}
			if (this.field_b_335) {
				renderable_48_ = ((OffScreenModel) renderable_48_).method_m_cy();
			}
			if ((-878063625 * this.field_o_351) >= 0) {
				if (renderable_48_ instanceof Model) {
					renderable_48_ = (((Model) renderable_48_).method_n_cg(is, i_44_, i_45_, i_46_, true, -878063625 * this.field_o_351));
				} else if (renderable_48_ instanceof OffScreenModel) {
					renderable_48_ = (((OffScreenModel) renderable_48_).method_a_cy(is, i_44_, i_45_, i_46_, true, this.field_o_351 * -878063625));
				}
			}
			renderable = renderable_48_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "at.m()");
		}
		return renderable;
	}

	public final Model method_a_cg(final int i, final int i_49_, final int[][] is, final int i_50_, final int i_51_, final int i_52_, final int i_53_) {
		Model onscreenmodel;
		try {
			long l;
			if (this.field_l_323 == null) {
				l = ((id * 267197795) << 10) + i_49_;
			} else {
				l = i_49_ + (i << 3) + ((id * 267197795) << 10);
			}
			Model onscreenmodel_54_ = (Model) field_f_319.method_n_gb(l);
			if (onscreenmodel_54_ == null) {
				final OffScreenModel rsmodel = method_l_cy(i, i_49_, 2110396206);
				if (rsmodel == null) {
					return null;
				}
				onscreenmodel_54_ = rsmodel.method_ad_cg((this.field_ad_327 * 1813344435) + 64, (323067771 * (this.field_ak_331)) + 768, -50, -10, -50);
				field_f_319.method_z_void(onscreenmodel_54_, l);
			}
			if ((-878063625 * this.field_o_351) >= 0) {
				onscreenmodel_54_ = onscreenmodel_54_.method_n_cg(is, i_50_, i_51_, i_52_, true, (-878063625 * (this.field_o_351)));
			}
			onscreenmodel = onscreenmodel_54_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "at.a()");
		}
		return onscreenmodel;
	}

	public final boolean method_f_boolean(final int i) {
		boolean bool;
		try {
			if (this.field_h_322 == null) {
				return true;
			}
			boolean bool_55_ = true;
			for (final int element : this.field_h_322) {
				bool_55_ &= field_z_315.method_e_boolean(((element) & 0xffff), 0, 1849590909);
			}
			bool = bool_55_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "at.f()");
		}
		return bool;
	}

	static final void method_ay_void(int i, int i_57_, int i_58_, int i_59_, final boolean bool, final byte i_60_) {
		try {
			if (i_58_ < 1) {
				i_58_ = 1;
			}
			if (i_59_ < 1) {
				i_59_ = 1;
			}
			int i_61_ = i_59_ - 334;
			if (i_61_ < 0) {
				i_61_ = 0;
			} else if (i_61_ > 100) {
				i_61_ = 100;
			}
			int i_62_ = ((((client.field_on_2785 - client.field_og_2866) * i_61_) / 100) + client.field_og_2866);
			final int i_63_ = (i_59_ * i_62_ * 512) / (334 * i_58_);
			if (i_63_ < client.field_oy_2949) {
				final int i_64_ = client.field_oy_2949;
				i_62_ = (334 * i_58_ * i_64_) / (512 * i_59_);
				if (i_62_ > client.field_os_2948) {
					i_62_ = client.field_os_2948;
					final int i_65_ = (i_62_ * i_59_ * 512) / (i_64_ * 334);
					final int i_66_ = (i_58_ - i_65_) / 2;
					if (bool) {
						Rasterizer.method_cf_void();
						Rasterizer.fillRect(i, i_57_, i_66_, i_59_, -16777216);
						Rasterizer.fillRect((i_58_ + i) - i_66_, i_57_, i_66_, i_59_, -16777216);
					}
					i += i_66_;
					i_58_ -= i_66_ * 2;
				}
			} else if (i_63_ > client.field_ob_2813) {
				final int i_67_ = client.field_ob_2813;
				i_62_ = (i_58_ * i_67_ * 334) / (512 * i_59_);// gotta find this stuff in #93 and compare usages of th
				if (i_62_ < client.field_ot_2715) {
					i_62_ = client.field_ot_2715;
					final int i_68_ = (334 * i_67_ * i_58_) / (512 * i_62_);
					final int i_69_ = (i_59_ - i_68_) / 2;
					if (bool) {
						Rasterizer.method_cf_void();
						Rasterizer.fillRect(i, i_57_, i_58_, i_69_, -16777216);
						Rasterizer.fillRect(i, (i_59_ + i_57_) - i_69_, i_58_, i_69_, -16777216);
					}
					i_57_ += i_69_;
					i_59_ -= i_69_ * 2;
				}
			}
			//client.field_ow_2955 = -698410443 * (((i_62_ * i_59_) / 334) << 1);
			int scale = i_61_ * (client.field_oc_2946 - client.field_oq_2945) / 100 + client.field_oq_2945;//  
			client.viewportScale = -698410443 * ((i_62_ * i_59_ * scale / 85504) << 1);// implemented for 88
			
			if ((i_58_ != (659941927 * client.field_om_2953)) || (i_59_ != (client.field_ou_2820 * 549621553))) {
				final int[] is = new int[9];
				for (int i_70_ = 0; i_70_ < 9; i_70_++) {
					final int i_71_ = 143 + (i_70_ * 32);
					final int i_72_ = (i_71_ * 3) + 600;
					final int i_73_ = Rasterizer3D.SINE[i_71_];
					is[i_70_] = (i_73_ * i_72_) >> 16;
				}
				SceneGraph.method_ac_void(is, 500, 800, i_58_, i_59_);
			}
			client.field_ov_2951 = i * 767009247;
			client.field_op_2816 = i_57_ * 996597763;
			client.field_om_2953 = i_58_ * 1072883095;
			client.field_ou_2820 = i_59_ * 734947793;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "at.ay()");
		}
	}

	static Sprite[] method_a_beArray(final int i) {
		Sprite[] class_bes;
		try {
			final Sprite[] class_bes_74_ = new Sprite[Class_bk.field_n_583 * 298614355];
			for (int i_75_ = 0; i_75_ < (Class_bk.field_n_583 * 298614355); i_75_++) {
				final Sprite class_be = class_bes_74_[i_75_] = new Sprite();
				class_be.spriteWidth = -1808307607 * GameCanvas.field_d_2228;
				class_be.spriteHeight = Class_bk.field_z_584 * -1626806585;
				class_be.field_e_535 = Class_bk.field_y_579[i_75_];
				class_be.field_g_537 = Class_bk.field_e_580[i_75_];
				class_be.field_z_533 = Class_fv.field_g_2506[i_75_];
				class_be.field_y_534 = Class_bk.field_f_581[i_75_];
				class_be.field_d_538 = Class_l.field_m_1134;
				class_be.field_n_531 = Class_bk.field_a_585[i_75_];
			}
			ItemComposite.method_u_void(-1231170034);
			class_bes = class_bes_74_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "at.a()");
		}
		return class_bes;
	}

	public static Build method_d_ex(final int i, final int i_76_) {
		try {
			final Build[] class_exes = Class_q.method_n_exArray((byte) 110);
			for (final Build class_ex : class_exes) {
				if (i == (-1243898935 * class_ex.id)) {
					return class_ex;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "at.d()");
		}
		return null;
	}
}
