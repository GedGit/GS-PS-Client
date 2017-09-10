/* PlayerComposite - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class PlayerComposite {
	public static NodeCache field_u_2309 = new NodeCache(260);
	int[] appearance;
	int npcTrans;
	int[] looks;
	long field_g_2313;
	long field_e_2314;
	public static short[][] bodyColors;
	static final int[] field_l_2316 = { 8, 11, 4, 6, 9, 7, 10 };
	public boolean male;
	public static final int field_ct_2318 = 29;

	public void method_n_void(int[] is, final int[] is_0_, final boolean bool, final int i, final int i_1_) {
		try {
			if (is == null) {
				is = new int[12];
				for (int i_2_ = 0; i_2_ < 7; i_2_++) {
					for (int i_3_ = 0; i_3_ < (IdentityKit.field_z_87 * -1103261137); i_3_++) {
						final IdentityKit class_ai = ClientScript.getIdentityKit(i_3_);
						if ((class_ai != null) && !class_ai.disabled && (((bool ? 7 : 0) + i_2_) == (class_ai.bodyPartIndex * 1838182481))) {
							is[field_l_2316[i_2_]] = i_3_ + 256;
							break;
						}
					}
				}
			}
			this.looks = is;
			this.appearance = is_0_;
			male = bool;
			this.npcTrans = i * -1370301097;
			method_g_void((byte) -83);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fe.n()");
		}
	}

	public void method_d_void(final int i, final boolean bool, final int i_4_) {
		do {
			try {
				if ((i != 1) || !male) {
					int i_5_ = this.looks[field_l_2316[i]];
					if (i_5_ == 0) {
						break;
					}
					i_5_ -= 256;
					for (;;) {
						if (!bool) {
							if (--i_5_ < 0) {
								i_5_ = (-1103261137 * IdentityKit.field_z_87) - 1;
							}
						} else if (++i_5_ >= (-1103261137 * IdentityKit.field_z_87)) {
							i_5_ = 0;
						}
						final IdentityKit kit = ClientScript.getIdentityKit(i_5_);
						if ((kit != null) && !kit.disabled) {
							final int i_6_ = kit.bodyPartIndex * 1838182481;
							int i_7_;
							if (male) {
								i_7_ = 7;
							} else {
								i_7_ = 0;
							}
							if (i_6_ == (i_7_ + i)) {
								break;
							}
						}
					}
					this.looks[field_l_2316[i]] = i_5_ + 256;
					method_g_void((byte) -6);
				}
			} catch (final RuntimeException runtimeexception) {
				throw GameCanvas.error(runtimeexception, "fe.d()");
			}
			break;
		} while (false);
	}

	public void method_z_void(final int i, final boolean bool, final int i_8_) {
		try {
			int i_9_ = this.appearance[i];
			if (!bool) {
				do {
					if (--i_9_ < 0) {
						i_9_ = bodyColors[i].length - 1;
					}
				} while (!Class_dr.method_n_boolean(i, i_9_, -1805502109));
			} else {
				do {
					if (++i_9_ >= bodyColors[i].length) {
						i_9_ = 0;
					}
				} while (!Class_dr.method_n_boolean(i, i_9_, -1201772672));
			}
			this.appearance[i] = i_9_;
			method_g_void((byte) -117);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fe.z()");
		}
	}

	public void method_y_void(final boolean bool, final int i) {
		try {
			if (bool != male) {
				method_n_void(null, this.appearance, bool, -1, 1325865494);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fe.y()");
		}
	}

	public void method_e_void(final Buffer rsbytebuffer, final short i) {
		try {
			rsbytebuffer.put(male ? 1 : 0);
			for (int i_10_ = 0; i_10_ < 7; i_10_++) {
				final int i_11_ = this.looks[field_l_2316[i_10_]];
				if (i_11_ == 0) {
					rsbytebuffer.put(-1);
				} else {
					rsbytebuffer.put(i_11_ - 256);
				}
			}
			for (int i_12_ = 0; i_12_ < 5; i_12_++) {
				rsbytebuffer.put((this.appearance[i_12_]));
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fe.e()");
		}
	}

	void method_g_void(final byte i) {
		try {
			final long l = this.field_e_2314 * 1844270304793307615L;
			final int i_13_ = this.looks[5];
			final int i_14_ = this.looks[9];
			this.looks[5] = i_14_;
			this.looks[9] = i_13_;
			this.field_e_2314 = 0L;
			for (int i_15_ = 0; i_15_ < 12; i_15_++) {
				this.field_e_2314 = (-1076338480562482657L * ((1844270304793307615L * this.field_e_2314) << 4));
				if (this.looks[i_15_] >= 256) {
					this.field_e_2314 += (-1076338480562482657L * (this.looks[i_15_] - 256));
				}
			}
			if (this.looks[0] >= 256) {
				this.field_e_2314 += (((this.looks[0] - 256) >> 4) * -1076338480562482657L);
			}
			if (this.looks[1] >= 256) {
				this.field_e_2314 += (((this.looks[1] - 256) >> 8) * -1076338480562482657L);
			}
			for (int i_16_ = 0; i_16_ < 5; i_16_++) {
				this.field_e_2314 = (-1076338480562482657L * ((1844270304793307615L * this.field_e_2314) << 3));
				this.field_e_2314 += (-1076338480562482657L * this.appearance[i_16_]);
			}
			this.field_e_2314 = ((1844270304793307615L * this.field_e_2314) << 1) * -1076338480562482657L;
			final PlayerComposite playercomposite_17_ = this;
			playercomposite_17_.field_e_2314 = (playercomposite_17_.field_e_2314 + (-1076338480562482657L * (male ? 1 : 0)));
			this.looks[5] = i_13_;
			this.looks[9] = i_14_;
			if ((0L != l) && ((this.field_e_2314 * 1844270304793307615L) != l)) {
				field_u_2309.method_d_void(l);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fe.g()");
		}
	}

	OffScreenModel method_m_cy(final int i) {
		OffScreenModel rsmodel;
		try {
			if ((this.npcTrans * 718626407) != -1) {
				return NpcDefinitions.getNpcComposite(this.npcTrans * 718626407).method_g_cy((short) -5329);
			}
			boolean bool = false;
			for (int i_18_ = 0; i_18_ < 12; i_18_++) {
				final int i_19_ = this.looks[i_18_];
				if ((i_19_ >= 256) && (i_19_ < 512) && !ClientScript.getIdentityKit(i_19_ - 256).method_f_boolean((byte) 21)) {
					bool = true;
				}
				if ((i_19_ >= 512) && !ItemDefinitions.getItemComposite(i_19_ - 512).method_k_boolean(male, -2115050561)) {
					bool = true;
				}
			}
			if (bool) {
				return null;
			}
			final OffScreenModel[] rsmodels = new OffScreenModel[12];
			int i_20_ = 0;
			for (int i_21_ = 0; i_21_ < 12; i_21_++) {
				final int i_22_ = this.looks[i_21_];
				if ((i_22_ >= 256) && (i_22_ < 512)) {
					final OffScreenModel rsmodel_23_ = ClientScript.getIdentityKit(i_22_ - 256).method_m_cy(1735495426);
					if (rsmodel_23_ != null) {
						rsmodels[i_20_++] = rsmodel_23_;
					}
				}
				if (i_22_ >= 512) {
					final OffScreenModel rsmodel_24_ = ItemDefinitions.getItemComposite(i_22_ - 512).method_x_cy(male, (byte) -12);
					if (rsmodel_24_ != null) {
						rsmodels[i_20_++] = rsmodel_24_;
					}
				}
			}
			final OffScreenModel rsmodel_25_ = new OffScreenModel(rsmodels, i_20_);
			for (int i_26_ = 0; i_26_ < 5; i_26_++) {
				if (this.appearance[i_26_] < bodyColors[i_26_].length) {
					rsmodel_25_.recolor(Class_dt.field_f_1714[i_26_], (bodyColors[i_26_][(this.appearance[i_26_])]));
				}
				if (this.appearance[i_26_] < ClientScript.field_h_843[i_26_].length) {
					rsmodel_25_.recolor(Class_s.field_a_1360[i_26_], (ClientScript.field_h_843[i_26_][(this.appearance[i_26_])]));
				}
			}
			rsmodel = rsmodel_25_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fe.m()");
		}
		return rsmodel;
	}

	public int method_a_int(final short i) {
		int i_27_;
		try {
			i_27_ = ((this.npcTrans * 718626407) == -1 ? ((this.appearance[0] << 25)
					+ (this.appearance[4] << 20)
					+ (this.looks[0] << 15)
					+ (this.looks[8] << 10) + (this.looks[11] << 5) + this.looks[1])
					: (305419896 + ((NpcDefinitions.getNpcComposite(
							718626407 * this.npcTrans).id) * 384781917)));
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fe.a()");
		}
		return i_27_;
	}

	public Model getAnimatedModel(final AnimationSequence class_an, final int i, final AnimationSequence class_an_28_, final int i_29_, final int i_30_) {
		Model onscreenmodel;
		try {
			if ((this.npcTrans * 718626407) != -1) {
				return (NpcDefinitions.getNpcComposite(this.npcTrans * 718626407).method_e_cg(class_an, i, class_an_28_, i_29_, -896271800));
			}
			long l = 1844270304793307615L * this.field_e_2314;
			int[] is = this.looks;
			if ((class_an != null) && (((class_an.field_k_206 * 689804899) >= 0) || ((-1621012051 * class_an.field_x_207) >= 0))) {
				is = new int[12];
				for (int i_31_ = 0; i_31_ < 12; i_31_++) {
					is[i_31_] = this.looks[i_31_];
				}
				if ((class_an.field_k_206 * 689804899) >= 0) {
					l += ((class_an.field_k_206 * 689804899) - this.looks[5]) << 40;
					is[5] = class_an.field_k_206 * 689804899;
				}
				if ((class_an.field_x_207 * -1621012051) >= 0) {
					l += ((-1621012051 * class_an.field_x_207) - this.looks[3]) << 48;
					is[3] = -1621012051 * class_an.field_x_207;
				}
			}
			Model onscreenmodel_32_ = (Model) field_u_2309.method_n_gb(l);
			if (onscreenmodel_32_ == null) {
				boolean bool = false;
				for (int i_33_ = 0; i_33_ < 12; i_33_++) {
					final int i_34_ = is[i_33_];
					if ((i_34_ >= 256) && (i_34_ < 512) && !ClientScript.getIdentityKit(i_34_ - 256).method_e_boolean(1294543985)) {
						bool = true;
					}
					if ((i_34_ >= 512) && !ItemDefinitions.getItemComposite(i_34_ - 512).method_u_boolean(male, -2144811069)) {
						bool = true;
					}
				}
				if (bool) {
					if (-1L != (2499540234100887231L * this.field_g_2313)) {
						onscreenmodel_32_ = ((Model) (field_u_2309.method_n_gb(this.field_g_2313 * 2499540234100887231L)));
					}
					if (onscreenmodel_32_ == null) {
						return null;
					}
				}
				if (onscreenmodel_32_ == null) {
					final OffScreenModel[] rsmodels = new OffScreenModel[12];
					int i_35_ = 0;
					for (int i_36_ = 0; i_36_ < 12; i_36_++) {
						final int i_37_ = is[i_36_];
						if ((i_37_ >= 256) && (i_37_ < 512)) {
							final OffScreenModel rsmodel = ClientScript.getIdentityKit(i_37_ - 256).method_g_cy(-1634835308);
							if (rsmodel != null) {
								rsmodels[i_35_++] = rsmodel;
							}
						}
						if (i_37_ >= 512) {
							final OffScreenModel rsmodel = ItemDefinitions.getItemComposite(i_37_ - 512).method_q_cy(male, -1226262297);
							if (rsmodel != null) {
								rsmodels[i_35_++] = rsmodel;
							}
						}
					}
					final OffScreenModel rsmodel = new OffScreenModel(rsmodels, i_35_);
					for (int i_38_ = 0; i_38_ < 5; i_38_++) {
						if (this.appearance[i_38_] < bodyColors[i_38_].length) {
							rsmodel.recolor(Class_dt.field_f_1714[i_38_], (bodyColors[i_38_][(this.appearance[i_38_])]));
						}
						if (this.appearance[i_38_] < ClientScript.field_h_843[i_38_].length) {
							rsmodel.recolor(Class_s.field_a_1360[i_38_], (ClientScript.field_h_843[i_38_][(this.appearance[i_38_])]));
						}
					}
					onscreenmodel_32_ = rsmodel.method_ad_cg(64, 850, -30, -50, -30);
					field_u_2309.method_z_void(onscreenmodel_32_, l);
					this.field_g_2313 = l * -6788691009902927553L;
				}
			}
			if ((class_an == null) && (class_an_28_ == null)) {
				return onscreenmodel_32_;
			}
			Model onscreenmodel_39_;
			if ((class_an != null) && (class_an_28_ != null)) {
				onscreenmodel_39_ = class_an.method_m_cg(onscreenmodel_32_, i, class_an_28_, i_29_, (byte) 98);
			} else if (class_an != null) {
				onscreenmodel_39_ = class_an.method_e_cg(onscreenmodel_32_, i, 1690254063);
			} else {
				onscreenmodel_39_ = class_an_28_.method_e_cg(onscreenmodel_32_, i_29_, 867649532);
			}
			onscreenmodel = onscreenmodel_39_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fe.f()");
		}
		return onscreenmodel;
	}
}
