/* Widget - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Widget extends Node {
	public Object[] field_di_2535;
	public Widget root = null;
	static FileStore field_y_2537;
	static NodeCache field_f_2538 = new NodeCache(200);
	static NodeCache field_m_2539 = new NodeCache(50);
	static NodeCache field_a_2540 = new NodeCache(20);
	static NodeCache field_h_2541 = new NodeCache(8);
	public static boolean field_l_2542 = false;
	public boolean interactive = false;
	public int field_k_2544 = -1256091933;
	public int uid = 1348490677; 
	public int[] itemIds;
	public static Widget[][] widgets;
	public int contentType = 0;
	public int field_s_2549 = 0;
	public int field_v_2550 = 0;
	public int field_c_2551 = 0;
	public String[] field_cz_2552;
	public boolean field_ej_2553;
	public int y = 0;
	public int field_br_2555 = -944371393;
	public int field_ax_2556 = 1548321363;
	public int onScreenX = 0;
	public int onScreenY = 0;
	public int onScreenWidth = 0;
	public int onScreenHeight = 0;
	public int disabledSpriteId = 1581632181;
	public int field_ed_2562;
	public int parentId = -204643143;
	public boolean isHidden = false;
	public int field_ab_2565 = 0;
	public int verticalScrollPos = 0;
	public int field_ac_2567 = 0;
	public int field_az_2568 = 0;
	public int field_eh_2569;
	public Object[] field_df_2570;
	public int field_an_2571 = 0;
	public int field_aw_2572 = 0;
	public boolean field_ai_2573 = false;
	public int alpha = 0;
	public Object[] field_dw_2575;
	public boolean field_ay_2576 = false;
	public int field_aa_2577 = 0;
	public int field_aj_2578 = 1218445549;
	public int field_ag_2579 = 0;
	public boolean field_ap_2580 = false;
	public int field_af_2581 = 0;
	public int field_au_2582 = 0;
	public boolean field_av_2583;
	public boolean field_bs_2584;
	public int mediaType = 1215472543;
	public int mediaId = -1030350029;
	int field_bm_2587 = -1985264801;
	int field_bj_2588 = 1783253747;
	public int field_ba_2589 = -931705809;
	public int field_bq_2590 = 0;
	public int field_bd_2591 = 0;
	public Object[] field_cy_2592;
	public Object[] field_dj_2593;
	public Object[] field_dc_2594;
	public int field_bp_2595 = 0;
	public int field_bt_2596 = -2082350668;
	public boolean field_el_2597;
	public int field_by_2598 = 0;
	public Object[] field_cg_2599;
	public int field_bv_2600 = -854857254;
	public int field_bh_2601 = -488789145;
	public String defaultText = "";
	public String field_bk_2603 = "";
	public int field_bi_2604 = 0;
	public int field_bx_2605 = 0;
	public int field_bc_2606 = 0;
	public int x = 0;
	public int[] field_dg_2608;
	public int itemContainerColumnPadding = 0;
	public int[] field_cj_2610;
	public int[] field_cb_2611;
	public int[] field_ct_2612;
	public Object[] field_dq_2613;
	public int field_es_2614;
	public String interactionOption = "";
	public String[] actions;
	public int field_at_2617 = 0;
	public int field_cn_2618 = 0;
	public int field_cf_2619 = 0;
	public boolean field_ex_2620;
	public int[][] opcodes;
	public int field_p_2622 = 0;
	public Object[] field_cv_2623;
	public Object[] field_ch_2624;
	public Object[] field_cx_2625;
	public int type;
	public Object[] field_cm_2627;
	public int[] field_dt_2628;
	public Object[] field_ci_2629;
	public Object[] field_cp_2630;
	public int itemContainerRowPadding = 0;
	public Object[] field_cr_2632;
	public Object[] field_ck_2633;
	public Object[] field_cl_2634;
	public Object[] field_cs_2635;
	public int field_ee_2636;
	public int field_bz_2637 = 0;
	public int height = 0;
	public Object[] field_do_2639;
	public int[] field_dy_2640;
	public int field_bn_2641 = 0;
	public Object[] field_dl_2642;
	public int field_ew_2643;
	public Object[] field_dm_2644;
	public int field_al_2645 = -568312671;
	public Object[] field_dn_2646;
	public boolean field_be_2647 = false;
	public Object[] field_dk_2648;
	public Object[] field_dr_2649;
	public int field_cu_2650 = 0;
	public Object[] field_da_2651;
	public boolean scripted = false;
	public Object[] field_db_2653;
	public int field_aq_2654 = -78721693;
	public int[] conditionType;
	public int[] conditionValues;
	public int field_du_2657 = -1293807931;
	public String field_de_2658 = "";
	public String action;
	public int actionType = 0;
	public int[] itemAmts;
	public int itemId;
	public int field_ek_2663;
	public int field_eq_2664;
	public int field_en_2665;
	static FileStore field_z_2666;
	public Object[] field_dd_2667;
	public boolean field_bg_2668 = false;
	public Widget[] components;
	public int field_bu_2670 = 0;
	public int width = 0;
	public boolean field_ce_2672 = false;
	public String field_cc_2673 = "";
	public Object[] field_cd_2674;
	public int field_er_2675;

	void method_g_void(final Buffer rsbytebuffer, final int i) {
		try {
			interactive = false;
			type = rsbytebuffer.get() * 381451273;
			actionType = rsbytebuffer.get() * 1476153597;
			contentType = rsbytebuffer.getShort() * -1218637085;
			x = rsbytebuffer.getShort((byte) -35) * 92497491;
			y = rsbytebuffer.getShort((byte) -38) * 1473849385;
			width = rsbytebuffer.getShort() * 815176681;
			height = rsbytebuffer.getShort() * 531456857;
			alpha = rsbytebuffer.get() * -521870011;
			parentId = rsbytebuffer.getShort() * 204643143;
			
			if ((parentId * -1405313417) == 65535) {
				parentId = -204643143;
			} else {
				parentId = (((uid * -560181405) & ~0xffff) + (-1405313417 * parentId)) * 204643143;
			}
			field_du_2657 = rsbytebuffer.getShort() * 1293807931;
			if (65535 == (-952385549 * field_du_2657)) {
				field_du_2657 = -1293807931;
			}
			final int conditionCount = rsbytebuffer.get();
			if (conditionCount > 0) {
				conditionType = new int[conditionCount];
				conditionValues = new int[conditionCount];
				for (int i_1_ = 0; i_1_ < conditionCount; i_1_++) {
					conditionType[i_1_] = rsbytebuffer.get();
					conditionValues[i_1_] = rsbytebuffer.getShort();
				}
			}
			final int i_2_ = rsbytebuffer.get();
			if (i_2_ > 0) {
				opcodes = new int[i_2_][];
				for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
					final int i_4_ = rsbytebuffer.getShort();
					opcodes[i_3_] = new int[i_4_];
					for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
						opcodes[i_3_][i_5_] = rsbytebuffer.getShort();
						if (opcodes[i_3_][i_5_] == 65535) {
							opcodes[i_3_][i_5_] = -1;
						}
					}
				}
			}
			if ((type * 876728889) == 0) {
				field_az_2568 = rsbytebuffer.getShort() * 1355221571;
				isHidden = rsbytebuffer.get() == 1;
			}
			if ((876728889 * type) == 1) {
				rsbytebuffer.getShort();
				rsbytebuffer.get();
			}
			if ((type * 876728889) == 2) {
				itemIds = new int[(width * 1744956505 * height * -280578839)];
				itemAmts = new int[(1744956505 * width * -280578839 * height)];
				final int i_6_ = rsbytebuffer.get();
				if (i_6_ == 1) {
					field_cu_2650 = -130941591 * ((1810784985 * field_cu_2650) | 0x10000000);
				}
				final int i_7_ = rsbytebuffer.get();
				if (i_7_ == 1) {
					field_cu_2650 = -130941591 * ((field_cu_2650 * 1810784985) | 0x40000000);
				}
				final int i_8_ = rsbytebuffer.get();
				if (i_8_ == 1) {
					field_cu_2650 = (((1810784985 * field_cu_2650) | ~0x7fffffff) * -130941591);
				}
				final int i_9_ = rsbytebuffer.get();
				if (i_9_ == 1) {
					field_cu_2650 = (((1810784985 * field_cu_2650) | 0x20000000) * -130941591);
				}
				itemContainerRowPadding = rsbytebuffer.get() * -1975892033;
				itemContainerColumnPadding = rsbytebuffer.get() * 1880604633;
				field_cj_2610 = new int[20];
				field_cb_2611 = new int[20];
				field_ct_2612 = new int[20];
				for (int i_10_ = 0; i_10_ < 20; i_10_++) {
					final int i_11_ = rsbytebuffer.get();
					if (i_11_ == 1) {
						field_cj_2610[i_10_] = rsbytebuffer.getShort((byte) 84);
						field_cb_2611[i_10_] = rsbytebuffer.getShort((byte) -90);
						field_ct_2612[i_10_] = rsbytebuffer.getInt();
					} else {
						field_ct_2612[i_10_] = -1;
					}
				}
				field_cz_2552 = new String[5];
				for (int i_12_ = 0; i_12_ < 5; i_12_++) {
					final String string = rsbytebuffer.getString();
					if (string.length() > 0) {
						field_cz_2552[i_12_] = string;
						field_cu_2650 = -130941591 * ((1810784985 * field_cu_2650) | (1 << (23 + i_12_)));
					}
				}
			}
			if ((type * 876728889) == 3) {
				field_ai_2573 = rsbytebuffer.get() == 1;
			}
			if (((876728889 * type) == 4) || ((876728889 * type) == 1)) {
				field_bx_2605 = rsbytebuffer.get() * -909926385;
				field_bc_2606 = rsbytebuffer.get() * -1542011721;
				field_bi_2604 = rsbytebuffer.get() * 1887238417;
				field_bh_2601 = rsbytebuffer.getShort() * 488789145;
				if ((field_bh_2601 * -1409761367) == 65535) {
					field_bh_2601 = -488789145;
				}
				field_be_2647 = rsbytebuffer.get() == 1;
			}
			if ((876728889 * type) == 4) {
				defaultText = rsbytebuffer.getString();
				field_bk_2603 = rsbytebuffer.getString();
			}
			if (((876728889 * type) == 1) || ((type * 876728889) == 3) || ((type * 876728889) == 4)) {
				field_at_2617 = rsbytebuffer.getInt() * 1917719447;
			}
			if (((876728889 * type) == 3) || ((876728889 * type) == 4)) {
				field_aa_2577 = rsbytebuffer.getInt() * 872571283;
				field_an_2571 = rsbytebuffer.getInt() * -771273273;
				field_aw_2572 = rsbytebuffer.getInt() * 1345692057;
			}
			if ((type * 876728889) == 5) {
				disabledSpriteId = rsbytebuffer.getInt() * -1581632181;
				field_aj_2578 = rsbytebuffer.getInt() * -1218445549;
			}
			if ((876728889 * type) == 6) {
				mediaType = 1215472543;
				mediaId = rsbytebuffer.getShort() * 1030350029;
				if (65535 == (mediaId * -907499515)) {
					mediaId = -1030350029;
				}
				this.field_bm_2587 = -1985264801;
				this.field_bj_2588 = rsbytebuffer.getShort() * -1783253747;
				if (65535 == (1860772293 * this.field_bj_2588)) {
					this.field_bj_2588 = 1783253747;
				}
				field_ba_2589 = rsbytebuffer.getShort() * 931705809;
				if (65535 == (field_ba_2589 * 793412913)) {
					field_ba_2589 = -931705809;
				}
				field_br_2555 = rsbytebuffer.getShort() * 944371393;
				if ((-679503551 * field_br_2555) == 65535) {
					field_br_2555 = -944371393;
				}
				field_bt_2596 = rsbytebuffer.getShort() * 1396515701;
				field_bu_2670 = rsbytebuffer.getShort() * 584534109;
				field_bq_2590 = rsbytebuffer.getShort() * 1360083929;
			}
			if ((type * 876728889) == 7) {
				itemIds = new int[(width * 1744956505 * height * -280578839)];
				itemAmts = new int[(1744956505 * width * height * -280578839)];
				field_bx_2605 = rsbytebuffer.get() * -909926385;
				field_bh_2601 = rsbytebuffer.getShort() * 488789145;
				if (65535 == (field_bh_2601 * -1409761367)) {
					field_bh_2601 = -488789145;
				}
				field_be_2647 = rsbytebuffer.get() == 1;
				field_at_2617 = rsbytebuffer.getInt() * 1917719447;
				itemContainerRowPadding = rsbytebuffer.getShort((byte) -37) * -1975892033;
				itemContainerColumnPadding = rsbytebuffer.getShort((byte) 40) * 1880604633;
				final int i_13_ = rsbytebuffer.get();
				if (i_13_ == 1) {
					field_cu_2650 = -130941591 * ((field_cu_2650 * 1810784985) | 0x40000000);
				}
				field_cz_2552 = new String[5];
				for (int i_14_ = 0; i_14_ < 5; i_14_++) {
					final String string = rsbytebuffer.getString();
					if (string.length() > 0) {
						field_cz_2552[i_14_] = string;
						field_cu_2650 = ((field_cu_2650 * 1810784985) | (1 << (23 + i_14_))) * -130941591;
					}
				}
			}
			if ((type * 876728889) == 8) {
				defaultText = rsbytebuffer.getString();
			}
			if (((actionType * 1816546389) == 2) || ((type * 876728889) == 2)) {
				field_cc_2673 = rsbytebuffer.getString();
				field_de_2658 = rsbytebuffer.getString();
				final int i_15_ = rsbytebuffer.getShort() & 0x3f;
				field_cu_2650 = ((field_cu_2650 * 1810784985) | (i_15_ << 11)) * -130941591;
			}
			if (((actionType * 1816546389) == 1) || ((1816546389 * actionType) == 4) || ((actionType * 1816546389) == 5) || ((1816546389 * actionType) == 6)) {
				action = rsbytebuffer.getString();
				if (action.length() == 0) {
					if ((1816546389 * actionType) == 1) {
						action = MenuText.OK;
					}
					if ((actionType * 1816546389) == 4) {
						action = MenuText.SELECT;
					}
					if ((actionType * 1816546389) == 5) {
						action = MenuText.SELECT;
					}
					if ((1816546389 * actionType) == 6) {
						action = MenuText.CONTINUE;
					}
				}
			}
			if (((actionType * 1816546389) == 1) || ((1816546389 * actionType) == 4) || ((1816546389 * actionType) == 5)) {
				field_cu_2650 = ((field_cu_2650 * 1810784985) | 0x400000) * -130941591;
			}
			if ((1816546389 * actionType) == 6) {
				field_cu_2650 = ((field_cu_2650 * 1810784985) | 0x1) * -130941591;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fy.g()");
		}
	}

	int[] method_a_intArray(final Buffer rsbytebuffer, final byte i) {
		int[] is;
		try {
			final int i_16_ = rsbytebuffer.get();
			if (i_16_ == 0) {
				return null;
			}
			final int[] is_17_ = new int[i_16_];
			for (int i_18_ = 0; i_18_ < i_16_; i_18_++) {
				is_17_[i_18_] = rsbytebuffer.getInt();
			}
			is = is_17_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fy.a()");
		}
		return is;
	}

	public void method_h_void(final int i, final int i_19_, final int i_20_) {
		try {
			int i_21_ = itemIds[i_19_];
			itemIds[i_19_] = itemIds[i];
			itemIds[i] = i_21_;
			i_21_ = itemAmts[i_19_];
			itemAmts[i_19_] = itemAmts[i];
			itemAmts[i] = i_21_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fy.h()");
		}
	}

	public Rasterizer2D method_l_bx(final boolean bool, final byte i) {
		Rasterizer2D class_bx;
		try {
			field_l_2542 = false;
			int i_22_;
			if (bool) {
				i_22_ = field_aj_2578 * 1150133019;
			} else {
				i_22_ = 288205923 * disabledSpriteId;
			}
			if (i_22_ == -1) {
				return null;
			}
			final long l = (((field_av_2583 ? 1L : 0L) << 38) + i_22_ + ((long) (field_af_2581 * 2073162049) << 36) + ((field_bs_2584 ? 1L : 0L) << 39) + ((long) (14646663 * field_au_2582) << 40));
			final Rasterizer2D class_bx_23_ = (Rasterizer2D) field_f_2538.method_n_gb(l);
			if (class_bx_23_ != null) {
				return class_bx_23_;
			}
			final FileStore class_fs = Varp.field_e_65;
			Rasterizer2D class_bx_24_;
			if (!Region.method_h_boolean(class_fs, i_22_, 0, 1079958178)) {
				class_bx_24_ = null;
			} else {
				final Rasterizer2D class_bx_25_ = new Rasterizer2D();
				class_bx_25_.field_g_683 = GameCanvas.field_d_2228 * -1808307607;
				class_bx_25_.field_f_678 = Class_bk.field_z_584 * -1626806585;
				class_bx_25_.field_y_682 = Class_bk.field_y_579[0];
				class_bx_25_.field_e_680 = Class_bk.field_e_580[0];
				class_bx_25_.field_d_679 = Class_fv.field_g_2506[0];
				class_bx_25_.field_z_685 = Class_bk.field_f_581[0];
				final int i_26_ = class_bx_25_.field_z_685 * class_bx_25_.field_d_679;
				final byte[] is = Class_bk.field_a_585[0];
				class_bx_25_.field_n_681 = new int[i_26_];
				for (int i_27_ = 0; i_27_ < i_26_; i_27_++) {
					class_bx_25_.field_n_681[i_27_] = Class_l.field_m_1134[is[i_27_] & 0xff];
				}
				ItemComposite.method_u_void(-1231170034);
				class_bx_24_ = class_bx_25_;
			}
			if (class_bx_24_ == null) {
				field_l_2542 = true;
				return null;
			}
			if (field_av_2583) {
				class_bx_24_.method_f_void();
			}
			if (field_bs_2584) {
				class_bx_24_.method_g_void();
			}
			if ((2073162049 * field_af_2581) > 0) {
				class_bx_24_.method_e_void(field_af_2581 * 2073162049);
			}
			if ((field_af_2581 * 2073162049) >= 1) {
				class_bx_24_.method_m_void(1);
			}
			if ((2073162049 * field_af_2581) >= 2) {
				class_bx_24_.method_m_void(16777215);
			}
			if ((14646663 * field_au_2582) != 0) {
				class_bx_24_.method_a_void(field_au_2582 * 14646663);
			}
			field_f_2538.method_z_void(class_bx_24_, l);
			class_bx = class_bx_24_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fy.l()");
		}
		return class_bx;
	}

	public Class_hd method_u_hd(final int i) {
		Class_hd class_hd;
		try {
			field_l_2542 = false;
			if ((-1409761367 * field_bh_2601) == -1) {
				return null;
			}
			Class_hd class_hd_28_ = (Class_hd) field_a_2540.method_n_gb(field_bh_2601 * -1409761367);
			if (class_hd_28_ != null) {
				return class_hd_28_;
			}
			class_hd_28_ = Class_bh.method_z_hd(Varp.field_e_65, Class_db.field_g_1566, field_bh_2601 * -1409761367, 0, 1745894664);
			if (class_hd_28_ != null) {
				field_a_2540.method_z_void(class_hd_28_, -1409761367 * field_bh_2601);
			} else {
				field_l_2542 = true;
			}
			class_hd = class_hd_28_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fy.u()");
		}
		return class_hd;
	}

	public Rasterizer2D method_q_bx(final int i, final byte i_29_) {
		do {
			Rasterizer2D class_bx;
			try {
				field_l_2542 = false;
				if ((i < 0) || (i >= field_ct_2612.length)) {
					break;
				}
				final int i_30_ = field_ct_2612[i];
				if (i_30_ == -1) {
					return null;
				}
				final Rasterizer2D class_bx_31_ = (Rasterizer2D) field_f_2538.method_n_gb(i_30_);
				if (class_bx_31_ != null) {
					return class_bx_31_;
				}
				final FileStore class_fs = Varp.field_e_65;
				Rasterizer2D class_bx_32_;
				if (!Region.method_h_boolean(class_fs, i_30_, 0, 1079958178)) {
					class_bx_32_ = null;
				} else {
					final Rasterizer2D class_bx_33_ = new Rasterizer2D();
					class_bx_33_.field_g_683 = -1808307607 * GameCanvas.field_d_2228;
					class_bx_33_.field_f_678 = -1626806585 * Class_bk.field_z_584;
					class_bx_33_.field_y_682 = Class_bk.field_y_579[0];
					class_bx_33_.field_e_680 = Class_bk.field_e_580[0];
					class_bx_33_.field_d_679 = Class_fv.field_g_2506[0];
					class_bx_33_.field_z_685 = Class_bk.field_f_581[0];
					final int i_34_ = class_bx_33_.field_z_685 * class_bx_33_.field_d_679;
					final byte[] is = Class_bk.field_a_585[0];
					class_bx_33_.field_n_681 = new int[i_34_];
					for (int i_35_ = 0; i_35_ < i_34_; i_35_++) {
						class_bx_33_.field_n_681[i_35_] = Class_l.field_m_1134[is[i_35_] & 0xff];
					}
					ItemComposite.method_u_void(-1231170034);
					class_bx_32_ = class_bx_33_;
				}
				if (class_bx_32_ != null) {
					field_f_2538.method_z_void(class_bx_32_, i_30_);
				} else {
					field_l_2542 = true;
				}
				class_bx = class_bx_32_;
			} catch (final RuntimeException runtimeexception) {
				throw GameCanvas.error(runtimeexception, "fy.q()");
			}
			return class_bx;
		} while (false);
		return null;
	}

	public Class_fp method_x_fp(final byte i) {
		Class_fp class_fp;
		try {
			final long l = (((long) (uid * -560181405) << 32) | (-2038048459 * field_k_2544 & 0xffffffffL));
			Class_fp class_fp_36_ = (Class_fp) field_h_2541.method_n_gb(l);
			if (class_fp_36_ != null) {
				if ((class_fp_36_.field_e_2428 * 1333584219) != (288205923 * disabledSpriteId)) {
					field_h_2541.method_d_void(l);
					class_fp_36_ = null;
				}
				if (class_fp_36_ != null) {
					return class_fp_36_;
				}
			}
			final Rasterizer2D class_bx = method_l_bx(false, (byte) 125);
			if (class_bx == null) {
				return null;
			}
			final int[] is = new int[class_bx.field_z_685];
			final int[] is_37_ = new int[class_bx.field_z_685];
			for (int i_38_ = 0; i_38_ < class_bx.field_z_685; i_38_++) {
				int i_39_ = 0;
				int i_40_ = class_bx.field_d_679;
				int i_41_ = 0;
				while_0_: do {
					for (;;) {
						if (i_41_ >= class_bx.field_d_679) {
							break while_0_;
						}
						if ((class_bx.field_n_681[i_41_ + (class_bx.field_d_679 * i_38_)]) == 0) {
							break;
						}
						i_41_++;
					}
					i_39_ = i_41_;
				} while (false);
				for (i_41_ = class_bx.field_d_679 - 1; i_41_ >= i_39_; i_41_--) {
					if ((class_bx.field_n_681[i_41_ + (i_38_ * class_bx.field_d_679)]) == 0) {
						i_40_ = 1 + i_41_;
						break;
					}
				}
				is[i_38_] = i_39_;
				is_37_[i_38_] = i_40_ - i_39_;
			}
			class_fp_36_ = new Class_fp(class_bx.field_d_679, class_bx.field_z_685, is_37_, is, 288205923 * disabledSpriteId);
			field_h_2541.method_z_void(class_fp_36_, l);
			class_fp = class_fp_36_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fy.x()");
		}
		return class_fp;
	}

	public void method_j_void(final int i, final String string, final int i_42_) {
		try {
			if ((actions == null) || (actions.length <= i)) {
				final String[] strings = new String[1 + i];
				if (actions != null) {
					for (int i_43_ = 0; i_43_ < actions.length; i_43_++) {
						strings[i_43_] = actions[i_43_];
					}
				}
				actions = strings;
			}
			actions[i] = string;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fy.j()");
		}
	}

	Object[] method_m_ObjectArray(final Buffer rsbytebuffer, final byte i) {
		Object[] objects;
		try {
			final int i_44_ = rsbytebuffer.get();
			if (i_44_ == 0) {
				return null;
			}
			final Object[] objects_45_ = new Object[i_44_];
			for (int i_46_ = 0; i_46_ < i_44_; i_46_++) {
				final int i_47_ = rsbytebuffer.get();
				if (i_47_ == 0) {
					objects_45_[i_46_] = new Integer(rsbytebuffer.getInt());
				} else if (i_47_ == 1) {
					objects_45_[i_46_] = rsbytebuffer.getString();
				}
			}
			scripted = true;
			objects = objects_45_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fy.m()");
		}
		return objects;
	}

	public Widget() {
		action = MenuText.OK;
		itemId = -1368818521;
		field_ek_2663 = 0;
		field_eq_2664 = 0;
		field_en_2665 = 0;
		field_ej_2553 = false;
		field_el_2597 = false;
		field_es_2614 = -791124777;
		field_ee_2636 = 0;
		field_er_2675 = 0;
		field_ed_2562 = 0;
		field_eh_2569 = -1081320417;
		field_ew_2643 = -616677017;
		field_ex_2620 = false;
	}

	void method_f_void(final Buffer rsbytebuffer, final int i) {
		try {
			rsbytebuffer.get();
			interactive = true;
			type = rsbytebuffer.get() * 381451273;
			contentType = rsbytebuffer.getShort() * -1218637085;
			x = rsbytebuffer.getShort((byte) 30) * 92497491;
			y = rsbytebuffer.getShort((byte) 17) * 1473849385;
			width = rsbytebuffer.getShort() * 815176681;
			if ((876728889 * type) == 9) {
				height = rsbytebuffer.getShort((byte) 4) * 531456857;
			} else {
				height = rsbytebuffer.getShort() * 531456857;
			}
			field_c_2551 = rsbytebuffer.getSigned() * -1560126681;
			field_p_2622 = rsbytebuffer.getSigned() * -1313646431;
			field_s_2549 = rsbytebuffer.getSigned() * 1336778791;
			field_v_2550 = rsbytebuffer.getSigned() * 1794210161;
			parentId = rsbytebuffer.getShort() * 204643143;
			if ((parentId * -1405313417) == 65535) {
				parentId = -204643143;
			} else {
				parentId = ((-1405313417 * parentId) + ((uid * -560181405) & ~0xffff)) * 204643143;
			}
			isHidden = rsbytebuffer.get() == 1;
			if ((876728889 * type) == 0) {
				field_ac_2567 = rsbytebuffer.getShort() * -320303819;
				field_az_2568 = rsbytebuffer.getShort() * 1355221571;
				field_ex_2620 = rsbytebuffer.get() == 1;
			}
			if ((876728889 * type) == 5) {
				disabledSpriteId = rsbytebuffer.getInt() * -1581632181;
				field_ag_2579 = rsbytebuffer.getShort() * 384222729;
				field_ap_2580 = rsbytebuffer.get() == 1;
				alpha = rsbytebuffer.get() * -521870011;
				field_af_2581 = rsbytebuffer.get() * -1940676927;
				field_au_2582 = rsbytebuffer.getInt() * -52053961;
				field_av_2583 = rsbytebuffer.get() == 1;
				field_bs_2584 = rsbytebuffer.get() == 1;
			}
			if ((type * 876728889) == 6) {
				mediaType = 1215472543;
				mediaId = rsbytebuffer.getShort() * 1030350029;
				if (65535 == (-907499515 * mediaId)) {
					mediaId = -1030350029;
				}
				field_bd_2591 = rsbytebuffer.getShort((byte) -26) * 296936143;
				field_bn_2641 = rsbytebuffer.getShort((byte) 49) * -2114506549;
				field_bu_2670 = rsbytebuffer.getShort() * 584534109;
				field_bq_2590 = rsbytebuffer.getShort() * 1360083929;
				field_bp_2595 = rsbytebuffer.getShort() * -1572194549;
				field_bt_2596 = rsbytebuffer.getShort() * 1396515701;
				field_ba_2589 = rsbytebuffer.getShort() * 931705809;
				if (65535 == (793412913 * field_ba_2589)) {
					field_ba_2589 = -931705809;
				}
				field_bg_2668 = rsbytebuffer.get() == 1;
				rsbytebuffer.getShort();
				if ((-963156841 * field_c_2551) != 0) {
					field_bz_2637 = rsbytebuffer.getShort() * 432164509;
				}
				if ((field_p_2622 * 644647777) != 0) {
					rsbytebuffer.getShort();
				}
			}
			if ((type * 876728889) == 4) {
				field_bh_2601 = rsbytebuffer.getShort() * 488789145;
				if (65535 == (field_bh_2601 * -1409761367)) {
					field_bh_2601 = -488789145;
				}
				defaultText = rsbytebuffer.getString();
				field_bi_2604 = rsbytebuffer.get() * 1887238417;
				field_bx_2605 = rsbytebuffer.get() * -909926385;
				field_bc_2606 = rsbytebuffer.get() * -1542011721;
				field_be_2647 = rsbytebuffer.get() == 1;
				field_at_2617 = rsbytebuffer.getInt() * 1917719447;
			}
			if ((type * 876728889) == 3) {
				field_at_2617 = rsbytebuffer.getInt() * 1917719447;
				field_ai_2573 = rsbytebuffer.get() == 1;
				alpha = rsbytebuffer.get() * -521870011;
			}
			if ((type * 876728889) == 9) {
				field_aq_2654 = rsbytebuffer.get() * -78721693;
				field_at_2617 = rsbytebuffer.getInt() * 1917719447;
				field_ay_2576 = rsbytebuffer.get() == 1;
			}
			field_cu_2650 = rsbytebuffer.getMediumInt(-1106807585) * -130941591;
			interactionOption = rsbytebuffer.getString();
			final int i_48_ = rsbytebuffer.get();
			if (i_48_ > 0) {
				actions = new String[i_48_];
				for (int i_49_ = 0; i_49_ < i_48_; i_49_++) {
					actions[i_49_] = rsbytebuffer.getString();
				}
			}
			field_cn_2618 = rsbytebuffer.get() * 879151757;
			field_cf_2619 = rsbytebuffer.get() * -528271109;
			field_ce_2672 = rsbytebuffer.get() == 1;
			field_cc_2673 = rsbytebuffer.getString();
			field_cv_2623 = method_m_ObjectArray(rsbytebuffer, (byte) -11);
			field_cd_2674 = method_m_ObjectArray(rsbytebuffer, (byte) -101);
			field_cp_2630 = method_m_ObjectArray(rsbytebuffer, (byte) -64);
			field_cl_2634 = method_m_ObjectArray(rsbytebuffer, (byte) -98);
			field_ck_2633 = method_m_ObjectArray(rsbytebuffer, (byte) 4);
			field_cs_2635 = method_m_ObjectArray(rsbytebuffer, (byte) -20);
			field_dj_2593 = method_m_ObjectArray(rsbytebuffer, (byte) -101);
			field_do_2639 = method_m_ObjectArray(rsbytebuffer, (byte) -64);
			field_di_2535 = method_m_ObjectArray(rsbytebuffer, (byte) -18);
			field_dl_2642 = method_m_ObjectArray(rsbytebuffer, (byte) -20);
			field_ci_2629 = method_m_ObjectArray(rsbytebuffer, (byte) -126);
			field_ch_2624 = method_m_ObjectArray(rsbytebuffer, (byte) -9);
			field_cx_2625 = method_m_ObjectArray(rsbytebuffer, (byte) -97);
			field_cy_2592 = method_m_ObjectArray(rsbytebuffer, (byte) -120);
			field_cm_2627 = method_m_ObjectArray(rsbytebuffer, (byte) -122);
			field_cg_2599 = method_m_ObjectArray(rsbytebuffer, (byte) -119);
			field_cr_2632 = method_m_ObjectArray(rsbytebuffer, (byte) -105);
			field_dq_2613 = method_m_ObjectArray(rsbytebuffer, (byte) -1);
			field_dt_2628 = method_a_intArray(rsbytebuffer, (byte) 91);
			field_dg_2608 = method_a_intArray(rsbytebuffer, (byte) -34);
			field_dy_2640 = method_a_intArray(rsbytebuffer, (byte) -18);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fy.f()");
		}
	}

	public Model method_k_cg(final AnimationSequence class_an, final int i, final boolean bool, final PlayerComposite playercomposite, final int i_50_) {
		Model onscreenmodel;
		try {
			field_l_2542 = false;
			int i_51_;
			int i_52_;
			if (bool) {
				i_51_ = 936892575 * this.field_bm_2587;
				i_52_ = this.field_bj_2588 * 1860772293;
			} else {
				i_51_ = mediaType * -1572489121;
				i_52_ = mediaId * -907499515;
			}
			if (i_51_ == 0) {
				return null;
			}
			if ((i_51_ == 1) && (i_52_ == -1)) {
				return null;
			}
			Model onscreenmodel_53_ = ((Model) field_m_2539.method_n_gb(i_52_ + (i_51_ << 16)));
			if (onscreenmodel_53_ == null) {
				if (i_51_ == 1) {
					final OffScreenModel rsmodel = OffScreenModel.getModel(field_y_2537, i_52_, 0);
					if (rsmodel == null) {
						field_l_2542 = true;
						return null;
					}
					onscreenmodel_53_ = rsmodel.method_ad_cg(64, 768, -50, -10, -50);
				}
				if (i_51_ == 2) {
					final OffScreenModel rsmodel = NpcDefinitions.getNpcComposite(i_52_).method_g_cy((short) 8526);
					if (rsmodel == null) {
						field_l_2542 = true;
						return null;
					}
					onscreenmodel_53_ = rsmodel.method_ad_cg(64, 768, -50, -10, -50);
				}
				if (i_51_ == 3) {
					if (playercomposite == null) {
						return null;
					}
					final OffScreenModel rsmodel = playercomposite.method_m_cy(-1031041632);
					if (rsmodel == null) {
						field_l_2542 = true;
						return null;
					}
					onscreenmodel_53_ = rsmodel.method_ad_cg(64, 768, -50, -10, -50);
				}
				if (i_51_ == 4) {
					final ItemComposite itemdef = ItemDefinitions.getItemComposite(i_52_);
					final OffScreenModel rsmodel = itemdef.method_m_cy(10, -633599491);
					if (rsmodel == null) {
						field_l_2542 = true;
						return null;
					}
					onscreenmodel_53_ = rsmodel.method_ad_cg(64 + (itemdef.ambience * 678590029), (itemdef.contrast * 1220754895) + 768, -50, -10, -50);
				}
				field_m_2539.method_z_void(onscreenmodel_53_, (i_51_ << 16) + i_52_);
			}
			if (class_an != null) {
				onscreenmodel_53_ = class_an.method_a_cg(onscreenmodel_53_, i, (short) -4893);
			}
			onscreenmodel = onscreenmodel_53_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fy.k()");
		}
		return onscreenmodel;
	}

	static final int method_k_int(final int i, final int i_54_, final int i_55_) {
		int i_56_;
		try {
			int i_57_ = (i_54_ * 57) + i;
			i_57_ ^= i_57_ << 13;
			final int i_58_ = (((((i_57_ * i_57_ * 15731) + 789221) * i_57_) + 1376312589) & 0x7fffffff);
			i_56_ = (i_58_ >> 19) & 0xff;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fy.k()");
		}
		return i_56_;
	}

	static int method_f_int(final World worldinfo, final World worldinfo_59_, final int i, final boolean bool, final int i_60_) {
		int i_61_;
		try {
			if (i == 1) {
				int i_62_ = -318332813 * worldinfo.players;
				int i_63_ = -318332813 * worldinfo_59_.players;
				if (!bool) {
					if (i_62_ == -1) {
						i_62_ = 2001;
					}
					if (i_63_ == -1) {
						i_63_ = 2001;
					}
				}
				return i_62_ - i_63_;
			}
			i_61_ = (i == 2 ? ((worldinfo.country * 1232511885) - (1232511885 * worldinfo_59_.country)) : i == 3 ? (worldinfo.activity.equals("-") ? (worldinfo_59_.activity.equals("-") ? 0 : bool ? -1 : 1) : worldinfo_59_.activity.equals("-") ? bool ? 1 : -1 : (worldinfo.activity
					.compareTo(worldinfo_59_.activity))) : i == 4 ? (worldinfo.method_q_boolean() ? worldinfo_59_.method_q_boolean() ? 0 : 1 : worldinfo_59_.method_q_boolean() ? -1 : 0) : i == 5 ? (worldinfo.method_l_boolean(1314113840) ? worldinfo_59_.method_l_boolean(1619629508) ? 0 : 1 : worldinfo_59_.method_l_boolean(-545856306) ? -1 : 0)
							: i == 6 ? (worldinfo.method_u_boolean(-948456112) ? worldinfo_59_.method_u_boolean(-847911589) ? 0 : 1 : worldinfo_59_.method_u_boolean(-1897102626) ? -1 : 0) : i == 7 ? (worldinfo.isMembers() ? worldinfo_59_.isMembers() ? 0 : 1 : worldinfo_59_.isMembers() ? -1 : 0)
									: ((-1909124507 * worldinfo.id) - (worldinfo_59_.id * -1909124507)));
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fy.f()");
		}
		return i_61_;
	}
}
