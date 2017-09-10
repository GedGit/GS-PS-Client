/* ItemDef - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ItemComposite extends CacheableNode {

	int field_ac_105;
	int field_al_106;
	static FileStore configArchiveRef;
	public String[] groundOptions; // TODO these are ground options
	public static int field_f_109;
	static final NodeCache ITEMS = new NodeCache(64);
	static NodeCache field_a_111 = new NodeCache(50);
	static NodeCache field_h_112 = new NodeCache(200);
	public int itemId;  
	int mesh;
	public int yOf2d = 0;
	short[] recol_s;
	short[] recol_d;
	short[] retex_s;
	short[] retex_d;
	public int field_v_120 = -674974160;
	public int xan2d = 0;
	public int yan2d = 0;
	public int zan2d = 0;
	public int xOf2d = 0;
	public int field_aq_125;
	public int contrast;
	public int cost = -1214703551;
	int sizeX;
	int[] field_ah_129;
	public String[] invOptions; 
	int field_ax_131;
	public int ambience;
	int field_ar_133;
	int field_as_134;
	public static final int field_d_135 = 1;
	int field_ao_136;
	public boolean members = false;
	int field_az_138;
	int field_at_139;
	int field_aa_140;
	int field_an_141;
	public String name = "null";
	int[] field_ai_143;
	int field_ab_144;
	int sizeY;
	public int field_ay_146;
	int sizeZ;
	public static final int field_z_148 = 2;
	public int stackable = 0;
	static FileStore field_e_150;
	public static final int field_dk_151 = 159;
	public int team;
	public boolean field_av_153;
	int field_bs_154;
	int field_bo_155;
	static int[] landscapeIndices;
	int field_aw_157;
	public static final int field_dr_158 = 148;

	void method_z_void(final int i) {
		/* empty */
	}

	void decode(final Buffer rsbytebuffer, final byte i) {
		try {
			for (;;) {
				final int i_0_ = rsbytebuffer.get();
				if (i_0_ == 0) {
					break;
				}
				method_e_void(rsbytebuffer, i_0_, -3311177);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "aj.y()");
		}
	}

	public final OffScreenModel method_x_cy(final boolean bool, final byte i) {
		OffScreenModel rsmodel;
		try {
			int i_1_ = this.field_at_139 * -168445487;
			int i_2_ = -1655391763 * this.field_aa_140;
			if (bool) {
				i_1_ = this.field_an_141 * -1314344987;
				i_2_ = this.field_aw_157 * 1986982635;
			}
			if (i_1_ == -1) {
				return null;
			}
			OffScreenModel rsmodel_3_ = OffScreenModel.getModel(field_e_150, i_1_, 0);
			if (i_2_ != -1) {
				final OffScreenModel rsmodel_4_ = OffScreenModel.getModel(field_e_150, i_2_, 0);
				final OffScreenModel[] rsmodels = { rsmodel_3_, rsmodel_4_ };
				rsmodel_3_ = new OffScreenModel(rsmodels, 2);
			}
			if (this.recol_s != null) {
				for (int i_5_ = 0; i_5_ < this.recol_s.length; i_5_++) {
					rsmodel_3_.recolor((this.recol_s[i_5_]), (this.recol_d[i_5_]));
				}
			}
			if (this.retex_s != null) {
				for (int i_6_ = 0; i_6_ < this.retex_s.length; i_6_++) {
					rsmodel_3_.retexture((this.retex_s[i_6_]), (this.retex_d[i_6_]));
				}
			}
			rsmodel = rsmodel_3_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "aj.x()");
		}
		return rsmodel;
	}

	void method_f_void(final ItemComposite itemdef_7_, final ItemComposite itemdef_8_, final int i) {
		try {
			this.mesh = itemdef_7_.mesh * 1;
			field_v_120 = 1 * itemdef_7_.field_v_120;
			xan2d = 1 * itemdef_7_.xan2d;
			yan2d = itemdef_7_.yan2d * 1;
			zan2d = 1 * itemdef_7_.zan2d;
			xOf2d = 1 * itemdef_7_.xOf2d;
			yOf2d = itemdef_7_.yOf2d * 1;
			this.recol_s = itemdef_8_.recol_s;
			this.recol_d = itemdef_8_.recol_d;
			this.retex_s = itemdef_8_.retex_s;
			this.retex_d = itemdef_8_.retex_d;
			name = itemdef_8_.name;
			members = itemdef_8_.members;
			stackable = 1 * itemdef_8_.stackable;
			this.field_ax_131 = 1 * itemdef_8_.field_ax_131;
			this.field_al_106 = 1 * itemdef_8_.field_al_106;
			this.field_ac_105 = itemdef_8_.field_ac_105 * 1;
			this.field_as_134 = itemdef_8_.field_as_134 * 1;
			this.field_ab_144 = itemdef_8_.field_ab_144 * 1;
			this.field_az_138 = 1 * itemdef_8_.field_az_138;
			this.field_at_139 = 1 * itemdef_8_.field_at_139;
			this.field_aa_140 = itemdef_8_.field_aa_140 * 1;
			this.field_an_141 = itemdef_8_.field_an_141 * 1;
			this.field_aw_157 = 1 * itemdef_8_.field_aw_157;
			team = 1 * itemdef_8_.team;
			groundOptions = itemdef_8_.groundOptions;
			invOptions = new String[5];
			if (itemdef_8_.invOptions != null) {
				for (int i_9_ = 0; i_9_ < 4; i_9_++) {
					invOptions[i_9_] = itemdef_8_.invOptions[i_9_];
				}
			}
			invOptions[4] = MenuText.DISCARD;
			cost = 0;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "aj.f()");
		}
	}

	public final OffScreenModel method_m_cy(final int i, final int i_10_) {
		OffScreenModel rsmodel;
		try {
			if ((this.field_ai_143 != null) && (i > 1)) {
				int i_11_ = -1;
				for (int i_12_ = 0; i_12_ < 10; i_12_++) {
					if ((i >= this.field_ah_129[i_12_]) && (this.field_ah_129[i_12_] != 0)) {
						i_11_ = this.field_ai_143[i_12_];
					}
				}
				if (i_11_ != -1) {
					return ItemDefinitions.getItemComposite(i_11_).method_m_cy(1, 411736019);
				}
			}
			final OffScreenModel rsmodel_13_ = OffScreenModel.getModel(field_e_150, this.mesh * 751244069, 0);
			if (rsmodel_13_ == null) {
				return null;
			}
			if (((this.sizeX * 667517773) != 128) || ((189336213 * this.sizeY) != 128)
					|| ((-762345343 * this.sizeZ) != 128)) {
				rsmodel_13_.method_v_void(this.sizeX * 667517773, 189336213 * this.sizeY, -762345343 * this.sizeZ);
			}
			if (this.recol_s != null) {
				for (int i_14_ = 0; i_14_ < this.recol_s.length; i_14_++) {
					rsmodel_13_.recolor((this.recol_s[i_14_]), (this.recol_d[i_14_]));
				}
			}
			if (this.retex_s != null) {
				for (int i_15_ = 0; i_15_ < this.retex_s.length; i_15_++) {
					rsmodel_13_.retexture((this.retex_s[i_15_]), (this.retex_d[i_15_]));
				}
			}
			rsmodel = rsmodel_13_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "aj.m()");
		}
		return rsmodel;
	}

	public final Model method_a_cg(final int i, final int i_16_) {
		Model onscreenmodel;
		try {
			if ((this.field_ai_143 != null) && (i > 1)) {
				int i_17_ = -1;
				for (int i_18_ = 0; i_18_ < 10; i_18_++) {
					if ((i >= this.field_ah_129[i_18_]) && (this.field_ah_129[i_18_] != 0)) {
						i_17_ = this.field_ai_143[i_18_];
					}
				}
				if (i_17_ != -1) {
					return ItemDefinitions.getItemComposite(i_17_).method_a_cg(1, -264194414);
				}
			}
			Model onscreenmodel_19_ = ((Model) field_a_111.method_n_gb(283343397 * itemId));
			if (onscreenmodel_19_ != null) {
				return onscreenmodel_19_;
			}
			final OffScreenModel rsmodel = OffScreenModel.getModel(field_e_150, 751244069 * this.mesh, 0);
			if (rsmodel == null) {
				return null;
			}
			if (((667517773 * this.sizeX) != 128) || ((this.sizeY * 189336213) != 128)
					|| ((-762345343 * this.sizeZ) != 128)) {
				rsmodel.method_v_void(667517773 * this.sizeX, 189336213 * this.sizeY, this.sizeZ * -762345343);
			}
			if (this.recol_s != null) {
				for (int i_20_ = 0; i_20_ < this.recol_s.length; i_20_++) {
					rsmodel.recolor(this.recol_s[i_20_], this.recol_d[i_20_]);
				}
			}
			if (this.retex_s != null) {
				for (int i_21_ = 0; i_21_ < this.retex_s.length; i_21_++) {
					rsmodel.retexture(this.retex_s[i_21_], this.retex_d[i_21_]);
				}
			}
			onscreenmodel_19_ = rsmodel.method_ad_cg(64 + (678590029 * ambience), 768 + (1220754895 * contrast), -50,
					-10, -50);
			onscreenmodel_19_.field_ad_893 = true;
			field_a_111.method_z_void(onscreenmodel_19_, 283343397 * itemId);
			onscreenmodel = onscreenmodel_19_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "aj.a()");
		}
		return onscreenmodel;
	}

	public ItemComposite method_h_aj(final int i, final int i_22_) {
		ItemComposite itemdef_23_;
		try {
			if ((this.field_ai_143 != null) && (i > 1)) {
				int i_24_ = -1;
				for (int i_25_ = 0; i_25_ < 10; i_25_++) {
					if ((i >= this.field_ah_129[i_25_]) && (this.field_ah_129[i_25_] != 0)) {
						i_24_ = this.field_ai_143[i_25_];
					}
				}
				if (i_24_ != -1) {
					return ItemDefinitions.getItemComposite(i_24_);
				}
			}
			itemdef_23_ = this;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "aj.h()");
		}
		return itemdef_23_;
	}

	public final boolean method_k_boolean(final boolean bool, final int i) {
		boolean bool_26_;
		try {
			int i_27_ = this.field_at_139 * -168445487;
			int i_28_ = -1655391763 * this.field_aa_140;
			if (bool) {
				i_27_ = -1314344987 * this.field_an_141;
				i_28_ = 1986982635 * this.field_aw_157;
			}
			if (i_27_ == -1) {
				return true;
			}
			boolean bool_29_ = true;
			if (!field_e_150.method_e_boolean(i_27_, 0, 1959214503)) {
				bool_29_ = false;
			}
			if ((i_28_ != -1) && !field_e_150.method_e_boolean(i_28_, 0, 1437691756)) {
				bool_29_ = false;
			}
			bool_26_ = bool_29_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "aj.k()");
		}
		return bool_26_;
	}

	void method_g_void(final ItemComposite itemDef, final ItemComposite itemDef2, final int i) {
		try {
			this.mesh = 1 * itemDef.mesh;
			field_v_120 = itemDef.field_v_120 * 1;
			xan2d = 1 * itemDef.xan2d;
			yan2d = itemDef.yan2d * 1;
			zan2d = itemDef.zan2d * 1;
			xOf2d = 1 * itemDef.xOf2d;
			yOf2d = itemDef.yOf2d * 1;
			this.recol_s = itemDef.recol_s;
			this.recol_d = itemDef.recol_d;
			this.retex_s = itemDef.retex_s;
			this.retex_d = itemDef.retex_d;
			name = itemDef2.name;
			members = itemDef2.members;
			cost = 1 * itemDef2.cost;
			stackable = 1351335521;

		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "aj.g()");
		}
	}

	void method_e_void(final Buffer rsbytebuffer, final int i, final int i_32_) {
		try {
			if (i == 1) {
				this.mesh = rsbytebuffer.getShort() * -1222455123;
			} else if (i == 2) {
				name = rsbytebuffer.getString();
			} else if (i == 4) {
				field_v_120 = rsbytebuffer.getShort() * 719069535;
			} else if (i == 5) {
				xan2d = rsbytebuffer.getShort() * -771477653;
			} else if (i == 6) {
				yan2d = rsbytebuffer.getShort() * -88314065;
			} else if (i == 7) {
				xOf2d = rsbytebuffer.getShort() * -1405953071;
				if ((-921084623 * xOf2d) > 32767) {
					xOf2d -= -607059968;
				}
			} else if (i == 8) {
				yOf2d = rsbytebuffer.getShort() * 2099333729;
				if ((1015339425 * yOf2d) > 32767) {
					yOf2d -= 1247870976;
				}
			} else if (i == 11) {
				stackable = 1351335521;
			} else if (i == 12) {
				cost = rsbytebuffer.getInt() * -1214703551;
			} else if (i == 16) {
				members = true;
			} else if (i == 23) {
				this.field_ax_131 = rsbytebuffer.getShort() * -1209958813;
				this.field_ar_133 = rsbytebuffer.get() * -574666235;
			} else if (i == 24) {
				this.field_al_106 = rsbytebuffer.getShort() * 223886119;
			} else if (i == 25) {
				this.field_as_134 = rsbytebuffer.getShort() * 667680035;
				this.field_ao_136 = rsbytebuffer.get() * -343178363;
			} else if (i == 26) {
				this.field_ab_144 = rsbytebuffer.getShort() * 1900178599;
			} else if ((i >= 30) && (i < 35)) {
				groundOptions[i - 30] = rsbytebuffer.getString();
				if (groundOptions[i - 30].equalsIgnoreCase(MenuText.HIDDEN)) {
					groundOptions[i - 30] = null;
				}
			} else if ((i >= 35) && (i < 40)) {
				invOptions[i - 35] = rsbytebuffer.getString();
			} else if (i == 40) {
				final int i_33_ = rsbytebuffer.get();
				this.recol_s = new short[i_33_];
				this.recol_d = new short[i_33_];
				for (int i_34_ = 0; i_34_ < i_33_; i_34_++) {
					this.recol_s[i_34_] = (short) rsbytebuffer.getShort();
					this.recol_d[i_34_] = (short) rsbytebuffer.getShort();
				}
			} else if (i == 41) {
				final int i_35_ = rsbytebuffer.get();
				this.retex_s = new short[i_35_];
				this.retex_d = new short[i_35_];
				for (int i_36_ = 0; i_36_ < i_35_; i_36_++) {
					this.retex_s[i_36_] = (short) rsbytebuffer.getShort();
					this.retex_d[i_36_] = (short) rsbytebuffer.getShort();
				}
			} else if (i == 65) {
				field_av_153 = true;
			} else if (i == 78) {
				this.field_ac_105 = rsbytebuffer.getShort() * 2031880605;
			} else if (i == 79) {
				this.field_az_138 = rsbytebuffer.getShort() * -1478946475;
			} else if (i == 90) {
				this.field_at_139 = rsbytebuffer.getShort() * 296566577;
			} else if (i == 91) {
				this.field_an_141 = rsbytebuffer.getShort() * 1586755053;
			} else if (i == 92) {
				this.field_aa_140 = rsbytebuffer.getShort() * 453676005;
			} else if (i == 93) {
				this.field_aw_157 = rsbytebuffer.getShort() * -1897716285;
			} else if (i == 95) {
				zan2d = rsbytebuffer.getShort() * -1960853851;
			} else if (i == 97) {
				field_aq_125 = rsbytebuffer.getShort() * 295624731;
			} else if (i == 98) {
				field_ay_146 = rsbytebuffer.getShort() * 1545753557;
			} else if ((i >= 100) && (i < 110)) {
				if (this.field_ai_143 == null) {
					this.field_ai_143 = new int[10];
					this.field_ah_129 = new int[10];
				}
				this.field_ai_143[i - 100] = rsbytebuffer.getShort();
				this.field_ah_129[i - 100] = rsbytebuffer.getShort();
			} else if (i == 110) {
				this.sizeX = rsbytebuffer.getShort() * 864251269;
			} else if (i == 111) {
				this.sizeY = rsbytebuffer.getShort() * -1842712387;
			} else if (i == 112) {
				this.sizeZ = rsbytebuffer.getShort() * -15157375;
			} else if (i == 113) {
				ambience = rsbytebuffer.getSigned() * -2132561275;
			} else if (i == 114) {
				contrast = rsbytebuffer.getSigned() * -1532932629;
			} else if (i == 115) {
				team = rsbytebuffer.get() * -1910090121;
			} else if (i == 139) {
				this.field_bs_154 = rsbytebuffer.getShort() * 722003971;
			} else if (i == 140) {
				this.field_bo_155 = rsbytebuffer.getShort() * 1329669965;
			} else if (i == 148) {
				rsbytebuffer.getShort();
			} else if (i == 149) {
				rsbytebuffer.getShort();
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "aj.e()");
		}
	}

	public static void method_n_void(final FileStore class_fs, final int i) {
		try {
			Varp.field_n_63 = class_fs;
			NpcDefinitions.totalConfigFiles = (Varp.field_n_63.method_q_int(16, -1724172285) * 1999232051);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "aj.n()");
		}
	}

	ItemComposite() {
		groundOptions = new String[] { null, null, MenuText.TAKE, null, null };
		invOptions = new String[] { null, null, null, null, MenuText.DROP };
		this.field_ax_131 = 1209958813;
		this.field_al_106 = -223886119;
		this.field_ar_133 = 0;
		this.field_as_134 = -667680035;
		this.field_ab_144 = -1900178599;
		this.field_ao_136 = 0;
		this.field_ac_105 = -2031880605;
		this.field_az_138 = 1478946475;
		this.field_at_139 = -296566577;
		this.field_aa_140 = -453676005;
		this.field_an_141 = -1586755053;
		this.field_aw_157 = 1897716285;
		field_aq_125 = -295624731;
		field_ay_146 = -1545753557;
		this.sizeX = -1044987264;
		this.sizeY = 356015744;
		this.sizeZ = -1940144000;
		ambience = 0;
		contrast = 0;
		team = 0;
		field_av_153 = false;
		this.field_bs_154 = -722003971;
		this.field_bo_155 = -1329669965;
	}

	public final OffScreenModel method_q_cy(final boolean bool, final int i) {
		OffScreenModel rsmodel;
		try {
			int i_37_ = -676793525 * this.field_ax_131;
			int i_38_ = 654541975 * this.field_al_106;
			int i_39_ = -356137803 * this.field_ac_105;
			if (bool) {
				i_37_ = this.field_as_134 * 2111314571;
				i_38_ = -955483369 * this.field_ab_144;
				i_39_ = this.field_az_138 * -777100291;
			}
			if (i_37_ == -1) {
				return null;
			}
			OffScreenModel rsmodel_40_ = OffScreenModel.getModel(field_e_150, i_37_, 0);
			if (i_38_ != -1) {
				final OffScreenModel rsmodel_41_ = OffScreenModel.getModel(field_e_150, i_38_, 0);
				if (i_39_ != -1) {
					final OffScreenModel rsmodel_42_ = OffScreenModel.getModel(field_e_150, i_39_, 0);
					final OffScreenModel[] rsmodels = { rsmodel_40_, rsmodel_41_, rsmodel_42_ };
					rsmodel_40_ = new OffScreenModel(rsmodels, 3);
				} else {
					final OffScreenModel[] rsmodels = { rsmodel_40_, rsmodel_41_ };
					rsmodel_40_ = new OffScreenModel(rsmodels, 2);
				}
			}
			if (!bool && ((1422258893 * this.field_ar_133) != 0)) {
				rsmodel_40_.method_x_void(0, (this.field_ar_133 * 1422258893), 0);
			}
			if (bool && ((this.field_ao_136 * -444334771) != 0)) {
				rsmodel_40_.method_x_void(0, (this.field_ao_136 * -444334771), 0);
			}
			if (this.recol_s != null) {
				for (int i_43_ = 0; i_43_ < this.recol_s.length; i_43_++) {
					rsmodel_40_.recolor((this.recol_s[i_43_]), (this.recol_d[i_43_]));
				}
			}
			if (this.retex_s != null) {
				for (int i_44_ = 0; i_44_ < this.retex_s.length; i_44_++) {
					rsmodel_40_.retexture((this.retex_s[i_44_]), (this.retex_d[i_44_]));
				}
			}
			rsmodel = rsmodel_40_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "aj.q()");
		}
		return rsmodel;
	}

	public static void method_u_void(final int i) {
		try {
			Class_bk.field_y_579 = null;
			Class_bk.field_e_580 = null;
			Class_fv.field_g_2506 = null;
			Class_bk.field_f_581 = null;
			Class_l.field_m_1134 = null;
			Class_bk.field_a_585 = null;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "aj.u()");
		}
	}

	static final void method_ad_void(final Class_bu class_bu, final int i) {
		try {
			class_bu.field_v_660 = false;
			if (class_bu.field_s_659 != null) {
				class_bu.field_s_659.field_g_609 = 0;
			}
			for (Class_bu class_bu_45_ = class_bu.method_g_bu(); class_bu_45_ != null; class_bu_45_ = class_bu
					.method_f_bu()) {
				method_ad_void(class_bu_45_, -1111376616);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "aj.ad()");
		}
	}

	public static void method_n_void(final String[] strings, final short[] is, final int i, final int i_46_,
			final byte i_47_) {
		try {
			if (i < i_46_) {
				final int i_48_ = (i_46_ + i) / 2;
				int i_49_ = i;
				final String string = strings[i_48_];
				strings[i_48_] = strings[i_46_];
				strings[i_46_] = string;
				final short i_50_ = is[i_48_];
				is[i_48_] = is[i_46_];
				is[i_46_] = i_50_;
				for (int i_51_ = i; i_51_ < i_46_; i_51_++) {
					if ((string == null)
							|| ((strings[i_51_] != null) && (strings[i_51_].compareTo(string) < (i_51_ & 0x1)))) {
						final String string_52_ = strings[i_51_];
						strings[i_51_] = strings[i_49_];
						strings[i_49_] = string_52_;
						final short i_53_ = is[i_51_];
						is[i_51_] = is[i_49_];
						is[i_49_++] = i_53_;
					}
				}
				strings[i_46_] = strings[i_49_];
				strings[i_49_] = string;
				is[i_46_] = is[i_49_];
				is[i_49_] = i_50_;
				method_n_void(strings, is, i, i_49_ - 1, (byte) -114);
				method_n_void(strings, is, 1 + i_49_, i_46_, (byte) -26);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "aj.n()");
		}
	}

	public final boolean method_u_boolean(final boolean bool, final int i) {
		boolean bool_54_;
		try {
			int i_55_ = -676793525 * this.field_ax_131;
			int i_56_ = this.field_al_106 * 654541975;
			int i_57_ = this.field_ac_105 * -356137803;
			if (bool) {
				i_55_ = 2111314571 * this.field_as_134;
				i_56_ = -955483369 * this.field_ab_144;
				i_57_ = this.field_az_138 * -777100291;
			}
			if (i_55_ == -1) {
				return true;
			}
			boolean bool_58_ = true;
			if (!field_e_150.method_e_boolean(i_55_, 0, 1655264762)) {
				bool_58_ = false;
			}
			if ((i_56_ != -1) && !field_e_150.method_e_boolean(i_56_, 0, 1892527874)) {
				bool_58_ = false;
			}
			if ((i_57_ != -1) && !field_e_150.method_e_boolean(i_57_, 0, 515412274)) {
				bool_58_ = false;
			}
			bool_54_ = bool_58_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "aj.u()");
		}
		return bool_54_;
	}
}
