
/* client - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class client extends GameStub {

	private static final long serialVersionUID = 1L;
	static int loginStage = 0;
	static client instance; 
	static boolean field_z_2685 = true;
	static int currentWorld = 886017407;
	static int currentWorldMask = 0;
	static int game_mode = 0;
	static GameComposite game;
	static boolean onMembersWorld = false;
	static String[] menuActions = new String[500];
	static int[] field_oe_2692 = new int[5];
	static int field_ez_2693 = 1981441617;
	static int state = 0;
	static int currentCycle = 0;
	static long field_o_2696 = 5304554967186568315L; 
	static int field_ju_2697 = 0;
	static int field_t_2698 = -1107983301;
	static boolean field_jq_2699 = false;
	static int field_ad_2700 = 1839599337;
	static boolean clientFocused = true;
	static boolean field_ae_2702 = false;
	public static boolean shiftDown = false;
	static int field_ax_2703 = 0;
	static int field_gx_2704 = -58397871;
	static int hintMarkerNpcIndex = 0;
	static boolean[] field_hf_2706 = new boolean[8];
	static int field_ft_2707 = 265632384;
	static int[] field_ko_2708 = new int[32];
	static int field_ag_2709 = 0;
	static int field_az_2710 = 0;
	static int field_at_2711 = 0;
	static int[][][] copiedRegionChunks = new int[4][13][13];
	static Class_es field_an_2713;
	static final String GAME_NAME = "oldschool";
	static short field_ot_2715 = 1;
	static NodeMultiSet widgetOptionTable = new NodeMultiSet(512);
	static int field_mm_2717 = 0;
	static int field_fr_2876 = -696803882;
	static int[] field_fm_2718 = new int[field_fr_2876 * 1700484107];
	static boolean[] field_lt_2719 = new boolean[100];
	static int field_i_2720 = -728713983;
	static int field_bv_2721 = 0;
	static int field_bh_2722 = 0;
	static Npc[] npcs = new Npc[32768];
	static int localNpcCount = 0;
	static int field_ly_2725 = 0;
	static int field_ca_2726 = 0;
	static SecureBuffer loginBuffer = new SecureBuffer(5000);
	static long field_md_2728 = 6369859318950303639L;
	static int current_packet_size = 0;
	static int currentOpcode = 0;
	static int field_cc_2731 = 0;
	static String channelName = null;
	static int field_cv_2733 = 0;
	static int field_jl_2734 = 1676196239;
	static int field_cx_2735 = 0;
	static int field_cy_2736 = 0;
	static boolean field_cm_2737 = false;
	static Class_hd p11Full;
	static int field_cs_2739 = 0;
	static int field_dg_2740 = 0;
	static int field_do_2741 = -1071062537;
	static int field_dy_2742 = 0;
	static int field_di_2743 = 1760762443;
	static int field_dl_2744 = 0;
	static int localEntityAmount = 0;
	static final int field_s_2746 = 512;
	static boolean field_c_2747 = true;
	static final int[] objectTypes = { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
	static Buffer field_aa_2749 = new Buffer(new byte[5000]);
	static int field_dh_2750 = -1907944578;
	static int field_du_2751 = 0;
	static int field_de_2752 = 278234674;
	static int field_dx_2753 = 0;
	static int field_dp_2754 = -748341163;
	static int field_dz_2755 = 0;
	static int miniMapOffset = 0;
	static int field_ek_2757 = 388327594;
	static int miniMapScale = 0;
	static int field_kb_2759 = 0;
	static int field_em_2760 = 0;
	static int field_ej_2761 = 0;
	static Widget field_jd_2762 = null;
	static int currentMenuSize = 0; 
	static int field_ef_2764 = 475706711;
	static int[] field_fw_2765 = new int[field_fr_2876 * 1700484107];
	static boolean field_ji_2766 = false;
	static boolean field_et_2767 = false;
	static int field_bz_2768 = 0;
	static int hideWorldList = 0;
	static int miniMapAngle = 0;
	static int field_ff_2771 = 0;
	static int field_ab_2772 = 0;
	static int field_fc_2773 = 0;
	static final int field_f_2774 = 5;
	static int field_fh_2775 = 0;
	static boolean field_fe_2776 = false;
	static int field_fu_2777 = 0;
	static Class_q field_b_2778;
	static String[] field_kz_2779 = new String[1000];
	static int field_ki_2780 = 0;
	static int[] field_fg_2781 = new int[field_fr_2876 * 1700484107];
	static int[] field_fo_2782 = new int[field_fr_2876 * 1700484107];
	static int[] field_fj_2783 = new int[field_fr_2876 * 1700484107];
	static boolean field_u_2784 = false;
	static short field_on_2785 = 205;
	static int[] field_fd_2786 = new int[field_fr_2876 * 1700484107];
	static String[] field_fi_2787 = new String[field_fr_2876 * 1700484107];
	static int[][] field_fz_2788 = new int[104][104];
	static int field_gl_2789 = 0;
	static int field_gp_2790 = 587570793;
	static int field_en_2791 = 1060994119;
	static int field_go_2792 = 0;
	static int field_gj_2793 = 0;
	static int field_dv_2794 = 0;
	static int field_gv_2795 = 0;
	static int field_gq_2796 = 0;
	static int field_gn_2797 = 0;
	static int field_gb_2798 = 0;
	static int field_gu_2799 = 0;
	static int field_gm_2800 = 0;
	static Widget field_jt_2801 = null;
	static boolean field_ga_2802 = false;
	static int field_gy_2803 = 0;
	static int field_gk_2804 = 0;
	static Player[] localPlayers = new Player[2048];
	static int localPlayerCount = 0;
	static NodeDeque field_kr_2807 = new NodeDeque();
	static int field_gr_2808 = 0;
	static int field_ml_2809 = -1558655015;
	static final Buffer[] APPEARANCES = new Buffer[2048];
	static int myPlayerIndex = 1896913161;
	static int field_ac_2812 = 0;
	static short field_ob_2813 = 32767;
	static int[] localPlayerIndices = new int[1000];
	static final int[] field_ho_2815 = { 44, 45, 46, 47, 48, 49, 50, 51 };
	static int field_op_2816 = 0;
	static Rasterizer2D[] cross;
	static int[] DIRECTIONS = { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
	static int field_hm_2819 = -1926064935;
	static int field_ou_2820 = 0;
	static NodeDeque field_hv_2821 = new NodeDeque();
	static int weight = 0;
	static NodeDeque field_ha_2823 = new NodeDeque();
	static int[] playerStatsCurrentLevel = new int[25];
	static int[] playerStatsLevel = new int[25];
	static int[] playerStatsExp = new int[25]; 
	static Widget field_jp_2827 = null;
	static boolean isMenuOpen = false;
	static int field_eg_2829 = 0;
	static int[] field_is_2830 = new int[500];
	static int[] field_io_2831 = new int[500];
	static int[] field_ik_2832 = new int[500];
	static int[] field_il_2833 = new int[500];
	static int field_jf_2834 = 1435729929;
	static boolean[] field_li_2835 = new boolean[100];
	static int field_id_2836 = -2014421019;
	static int field_iv_2837 = -735544561;
	static int field_ii_2838 = 0;
	static int field_ia_2839 = -876056106;
	static NodeDeque[][][] groundItemsDeque = new NodeDeque[4][104][104];
	static String field_it_2841 = null;
	static String[] menuOptions = new String[500];
	static int field_if_2843 = -261478105;
	static int field_ig_2844 = -1854851085;
	static String field_in_2845 = null;
	static String selectedOption = null;
	static int rootInterfaceId = -642184757;
	static NodeMultiSet menuTable = new NodeMultiSet(8);
	static int field_js_2849 = 0;
	static int field_kj_2850 = 2025329793;
	static int field_pa_2851 = 0;
	static int runEnergy = 0;
	static int[] playerIndexArray = new int[2048];
	static int myPermissions = 0;
	static int field_hs_2855 = 0;
	static int field_gi_2856 = 0;
	static boolean field_jk_2857 = false;
	static boolean field_ja_2858 = false; 
	static int hintMarkerPlayerIndex = 0;
	static boolean inDynamicRegion = false;
	static Widget field_jj_2861 = null;
	static int field_jr_2862 = 0;
	static int field_jn_2863 = 0;
	static int field_kh_2864 = 0;
	static int[] field_kt_2865 = new int[32];
	static short field_og_2866 = 256;
	static int[] field_fa_2867 = new int[1700484107 * field_fr_2876];
	static boolean field_jc_2868 = false; 
	static Widget field_jm_2869 = null;
	static String[] playerOptions = new String[8];
	static boolean field_jz_2871 = false;
	static int field_ch_2872 = 0;
	static int field_hq_2873 = 0;
	static int field_aj_2874 = 0;
	static int[] field_km_2875 = new int[32];
	static int hintMarkerType = 0;
	static CollisionMap[] collisionMaps = new CollisionMap[4];
	static int field_kc_2879 = 0;
	static int field_ka_2880 = 0;
	static int field_ku_2881 = 0;
	static int field_kv_2882 = 0;
	static int field_fy_2883 = 0;
	static int field_kw_2884 = 0;
	static int[] field_kd_2885 = new int[2000];
	static int field_jw_2886 = -1197558819;
	static int field_kg_2887 = 0;
	static NodeDeque field_kp_2888 = new NodeDeque();
	static NodeDeque field_kf_2889 = new NodeDeque();
	static boolean isOptionSelected = false;
	static int field_ep_2891 = 851581613;
	static int field_lx_2892 = 0;
	static int field_la_2893 = -983679434;
	static int[] npcIndexArray = new int[32768];
	static Class_v field_ai_2895 = Class_v.field_n_1442;
	static int field_bg_2896 = 0;
	static int field_fb_2897 = 0;
	static int[] field_lq_2898 = new int[100];
	static int status = 0;
	static int[] field_le_2900 = new int[100];
	static int field_lv_2901 = 0;
	static int[] field_of_2902 = new int[5];
	static boolean field_ll_2903 = true;
	static int field_lm_2904 = -1793738541;
	static int[] playersNeedUpdating = new int[2048];
	static int[] field_lp_2906 = { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
	static int[] field_ok_2907 = new int[5];
	static int field_lh_2908 = 0;
	static String field_ln_2909 = "";
	static long[] field_mw_2910 = new long[100];
	static int field_mh_2911 = 0;
	static int field_mg_2912 = 0;
	static int[] field_ma_2913 = new int[128];
	static int[] field_mc_2914 = new int[128];
	static int selectedOptionType = 0;
	static NodeDeque activeProjectiles = new NodeDeque();
	static String clanOwner = null;
	static int field_nm_2918 = -2100482847;
	static boolean[] field_od_2919 = new boolean[5];
	static int[] field_mu_2920 = new int[1000];
	static int[] field_mr_2921 = new int[1000];
	static Rasterizer2D[] field_mi_2922 = new Rasterizer2D[1000];
	static int field_mk_2923 = 0;
	static int field_mn_2924 = 0;
	static int field_nk_2925 = 0;
	static int field_ne_2926 = -285037693;
	static int field_nh_2927 = -1433291941;
	static boolean field_np_2928 = false;
	static int field_ng_2929 = 1720522077;
	static SecureBuffer inbound = new SecureBuffer(5000);
	static int field_nb_2931 = 0;
	static int[] field_nq_2932 = new int[50];
	static int[] field_nx_2933 = new int[50];
	static SecureBuffer encryptedBuffer = new SecureBuffer(5000);
	static int[] field_nu_2935 = new int[50];
	static Class_bo[] field_no_2936 = new Class_bo[50];
	static boolean field_nf_2937 = false;
	static int field_jv_2938 = 579103817;
	static boolean[] field_lg_2939 = new boolean[100];
	static int[] field_oi_2940 = new int[5];
	static int[] field_lc_2941 = new int[100];
	static int field_ao_2942 = 0;
	static int field_kq_2943 = 0;
	static int field_gc_2944 = 0;
	
	// Zooms
	static short field_oq_2945 = 256; 
	static short field_oc_2946 = 320;
	
	static long field_lk_2947 = 0L;
	static short field_os_2948 = 32767;
	static short field_oy_2949 = 1;
	static int field_lb_2950 = -83142035;
	static int field_ov_2951 = 0;
	static int field_ei_2952 = -532985156;
	static int field_om_2953 = 0;
	static int field_jo_2954 = -1825533571;
	static int viewportScale = 0;
	static int friendListSize = 0;
	static int field_ol_2957 = 0;
	static Friend[] friends = new Friend[400];
	static NodeList friendsListWidgets = new NodeList();
	static int[] field_lw_2960 = new int[100];
	static Ignore[] ignores = new Ignore[400];
	static PlayerComposite playerDesignComposite = new PlayerComposite();
	static int field_pu_2963 = -1663280055;
	static int field_ps_2964 = 307457787;
	static Class_hl[] field_pb_2965 = new Class_hl[8];
	static int field_fp_2966 = 0;
	static int[] field_nj_2967 = new int[50];
	public static final List<XPDrop> DROPS = new ArrayList<XPDrop>();
	static final int field_bk_2968 = 89;
	public static Class_v aClass87_2963 = Class_v.field_n_1442;
	
	@SuppressWarnings("unused")
	private static boolean drawGroundItemNames = true;

	@Override
	protected final void method_z_void(final byte i) {
		/* empty */
	}

	static final boolean parsePacket() {
		try {
			if (Class_cx.connection == null) {
				return false;
			}
			try {
				int avail = Class_cx.connection.available((byte) -48);
				if (avail == 0) {
					return false;
				}
				int op = currentOpcode * 2043934659;
				if (op == -1) {
					Class_cx.connection.read((inbound.buffer), 0, 1);
					inbound.position = 0;
					currentOpcode = inbound.getSecureByte(750601531) * 1807560939;
					op = currentOpcode * 2043934659;
					current_packet_size = (Class_fw.PACKET_SIZES[currentOpcode * 2043934659]) * 2062865803;
					avail--;
				}
				if ((current_packet_size * 1815751203) == -1) {// var bit
					if (avail <= 0) {
						return false;
					}
					Class_cx.connection.read((inbound.buffer), 0, 1);
					current_packet_size = 2062865803 * (inbound.buffer[0] & 0xff);
					avail--;
					// System.out.println("Var Byte Packet: " + op + " Size: " +
					// 1815751203 * current_packet_size);
				}
				if ((current_packet_size * 1815751203) == -2) {// var short
					if (avail <= 1) {
						return false;
					}
					Class_cx.connection.read((inbound.buffer), 0, 2);
					inbound.position = 0;
					current_packet_size = inbound.getShort() * 2062865803;
					avail -= 2;
				}
				if (avail < (1815751203 * current_packet_size))
					return false;
				inbound.position = 0;
				Class_cx.connection.read(inbound.buffer, 0, 1815751203 * current_packet_size);
				field_cc_2731 = 0;
				field_cy_2736 = -675381185 * field_cx_2735;
				field_cx_2735 = field_ch_2872 * -702305369;
				field_ch_2872 = -52118237 * currentOpcode;

				if (op == 244) {
					field_ol_2957 = -1552564015;
					field_ka_2880 = field_kj_2850 * -62874977;
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 66) {// send interface
					final int i_1_ = inbound.getShort();
					final int i_2_ = inbound.getInt1();
					final int i_3_ = inbound.getByteS();
					final Menu menu = ((Menu) menuTable.method_n_ga(i_2_));
					if (menu != null) {
						method_db_void(menu, (i_1_ != (44103667 * (menu.interfaceId))));
					}
					// StringBuilder sb = new StringBuilder("Widget: "+i_1_+"
					// {\n");
					// sb.append("\tWalkable: "+(i_3_ == 1)+"\n")
					// .append("\tParent information: root "+(i_2_ >> 16)+",
					// child "+(i_2_ & 0xFFFF));
					// System.out.println(sb.toString());
					Class_e.method_dd_y(i_2_, i_1_, i_3_, 141241788);
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 196) { // sendAMask?
					int i_4_ = inbound.getLEShortA();
					if (65535 == i_4_) {
						i_4_ = -1;
					}
					int i_5_ = inbound.getShort();
					if (65535 == i_5_) {
						i_5_ = -1;
					}
					final int i_6_ = inbound.getInt2((byte) -84);
					final int i_7_ = inbound.getInt1();
					// System.out.println("i4: " + i_4_+", i5:" + i_5_+", i6: "
					// + i_6_+", i7: " + i_7_);//guessnot.
					for (int i_8_ = i_4_; i_8_ <= i_5_; i_8_++) {
						final long l = i_8_ + ((long) i_7_ << 32);
						final Node node = widgetOptionTable.method_n_ga(l);
						if (node != null) {
							node.removeLink();
						}
						widgetOptionTable.method_d_void(new WidgetOptionNode(i_6_), l);
					}
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 192) {// interface animation
					final int i_9_ = inbound.getShort((byte) 69);
					final int i_10_ = inbound.getInt();
					final Widget widget = Class_en.getWidgetByUID(i_10_, (short) 9482);
					if (((widget.field_ba_2589 * 793412913) != i_9_) || (i_9_ == -1)) {
						widget.field_ba_2589 = i_9_ * 931705809;
						widget.field_eq_2664 = 0;
						widget.field_en_2665 = 0;
						Daemon.method_dn_void(widget, (byte) -26);
					}
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 179) {// reset all local entity animations
					for (int i_11_ = 0; i_11_ < localPlayers.length; i_11_++) {
						if (localPlayers[i_11_] != null) {
							localPlayers[i_11_].animation = 1176932377;
						}
					}
					for (int i_12_ = 0; i_12_ < npcs.length; i_12_++) {
						if (npcs[i_12_] != null) {
							npcs[i_12_].animation = 1176932377;
						}
					}
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 134) {
					int i_13_ = inbound.getLEShortA();
					final int i_14_ = inbound.getInt1();
					final Widget widget = Class_en.getWidgetByUID(i_14_, (short) 21507);
					if ((widget != null) && ((widget.type * 876728889) == 0)) {
						if (i_13_ > ((widget.field_az_2568 * 2133987947) - (widget.onScreenHeight * -1643237919))) {
							i_13_ = ((2133987947 * widget.field_az_2568) - (-1643237919 * widget.onScreenHeight));
						}
						if (i_13_ < 0) {
							i_13_ = 0;
						}
						if (i_13_ != (widget.verticalScrollPos * -854204745)) {
							widget.verticalScrollPos = i_13_ * -1907925241;
							Daemon.method_dn_void(widget, (byte) 94);
						}
					}
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 131) {// playerOptions
					final int onTop = inbound.getByteC();
					String option = inbound.getString();
					final int slot = inbound.getByteS();
					if ((slot >= 1) && (slot <= 8)) {
						if (option.equalsIgnoreCase("null")) {
							option = null;
						}
						playerOptions[slot - 1] = option;
						field_hf_2706[slot - 1] = onTop == 0;
					}
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 55) {
					final int i_17_ = inbound.getShort();
					final int i_18_ = inbound.getInt();
					final int i_19_ = inbound.getShort();
					final int i_20_ = inbound.getShortA();
					final Widget widget = Class_en.getWidgetByUID(i_18_, (short) 11866);
					if (((widget.field_bu_2670 * 646892533) != i_20_) || (i_17_ != (widget.field_bq_2590 * -1210215319))
							|| (i_19_ != (-42052387 * widget.field_bt_2596))) {
						widget.field_bu_2670 = 584534109 * i_20_;
						widget.field_bq_2590 = 1360083929 * i_17_;
						widget.field_bt_2596 = 1396515701 * i_19_;
						Daemon.method_dn_void(widget, (byte) -73);
					}
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 139) {// Hop worlds.
					final World worldinfo = new World();
					worldinfo.address = inbound.getString();
					worldinfo.id = inbound.getShort() * 1597132653;
					final int i_21_ = inbound.getInt();
					worldinfo.mask = i_21_ * 1507407349;
					Socket.method_h_void(45, -2066741709);
					Class_cx.connection.close(1128925465);
					Class_cx.connection = null;
					if (worldinfo.isMembers() != onMembersWorld) {
						onMembersWorld = worldinfo.isMembers();
						Class_w.method_s_void(worldinfo.isMembers(), (byte) 51);
					}
					Script.currentWorldAddress = worldinfo.address;
					currentWorld = worldinfo.id * 723566875;
					currentWorldMask = -761260631 * worldinfo.mask;
					Class_cc.port = ((game_mode * 1548930135) == 0 ? Settings.PORT
							: 40000 + (-1909124507 * (worldinfo.id))) * 254347017;
					Class_ae.field_bx_57 = 480351963
							* ((1548930135 * game_mode) == 0 ? 443 : (worldinfo.id * -1909124507) + 50000);
					Friend.field_bc_1094 = Class_cc.port * 1057325665;
					currentOpcode = -1807560939;
					return false;
				}
				if (op == 14) {// skills
					Class_s.method_df_void();
					final int i_22_ = inbound.get();// current level
					final int i_23_ = inbound.getByteA();// stat id
					final int i_24_ = inbound.getLEInt();// xp
					playerStatsExp[i_23_] = i_24_;
					playerStatsCurrentLevel[i_23_] = i_22_;
					playerStatsLevel[i_23_] = 1;
					for (int i_25_ = 0; i_25_ < 98; i_25_++) {
						if (i_24_ >= Class_ey.field_z_2261[i_25_])
							playerStatsLevel[i_23_] = 2 + i_25_;
					}
					field_kt_2865[(((field_kq_2943 += -1998254881) * -1888899297) - 1) & 0x1f] = i_23_;
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 147) {
					field_nf_2937 = false;
					for (int i_26_ = 0; i_26_ < 5; i_26_++)
						field_od_2919[i_26_] = false;
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 113) {
					field_nf_2937 = true;
					Boundary.field_nv_1523 = (inbound.get() * -1158353783);
					Class_eb.field_ni_1778 = inbound.get() * -1704743187;
					GameCanvas.field_nc_2233 = inbound.getShort() * -60762645;
					Varp.field_nz_66 = inbound.get() * 440181597;
					Class_bw.field_nd_677 = inbound.get() * 104996491;
					if ((Class_bw.field_nd_677 * -1351165661) >= 100) {
						Menu.cameraX = ((Boundary.field_nv_1523 * -1390022016) + 1668178752);
						GameMessage.cameraY = (-1673018432 + (-530238080 * Class_eb.field_ni_1778));
						Class_d.cameraZ = (((Class_q.getTileHeight(548221253 * Menu.cameraX,
								1900802031 * GameMessage.cameraY, Class_ed.plane * 250114511))
								- (-1244812605 * GameCanvas.field_nc_2233)) * 963104283);
					}
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 194) {
					final int i_27_ = inbound.getInt();
					int i_28_ = inbound.getShort();
					if (i_27_ < -70000) {
						i_28_ += 32768;
					}
					Widget widget;
					if (i_27_ >= 0) {
						widget = Class_en.getWidgetByUID(i_27_, (short) 6760);
					} else {
						widget = null;
					}
					while ((inbound.position * -1485345105) < (1815751203 * current_packet_size)) {
						final int i_29_ = inbound.getSmart((byte) 26);
						final int i_30_ = inbound.getShort();
						int i_31_ = 0;
						if (i_30_ != 0) {
							i_31_ = inbound.get();
							if (i_31_ == 255) {
								i_31_ = inbound.getInt();
							}
						}
						if ((widget != null) && (i_29_ >= 0) && (i_29_ < widget.itemIds.length)) {
							widget.itemIds[i_29_] = i_30_;
							widget.itemAmts[i_29_] = i_31_;
						}
						Class_o.method_z_void(i_28_, i_29_, i_30_ - 1, i_31_, -596286361);
					}
					if (widget != null) {
						Daemon.method_dn_void(widget, (byte) 62);
					}
					Class_s.method_df_void();
					field_km_2875[(((field_kh_2864 += -144176309) * 582198883) - 1) & 0x1f] = i_28_ & 0x7fff;
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 20) {// reset all configs with a file
					for (int file = 0; file < (-1642299653 * NpcDefinitions.totalConfigFiles); file++) {
						final Varp config = AnimationSequence.getVarp(file);
						if (config != null) {
							Class_fv.configValues[file] = 0;
							Class_fv.configs[file] = 0;
						}
					}
					Class_s.method_df_void();
					field_kb_2759 += -400800544;
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 10) {// npc head
					final int i_33_ = inbound.getLEShortA();
					final int i_34_ = inbound.getInt();
					final Widget widget = Class_en.getWidgetByUID(i_34_, (short) 32357);
					if (((-1572489121 * widget.mediaType) != 2) || ((widget.mediaId * -907499515) != i_33_)) {
						widget.mediaType = -1864022210;
						widget.mediaId = i_33_ * 1030350029;
						Daemon.method_dn_void(widget, (byte) -2);
					}
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 93) {
					final String string = inbound.getString();
					final int i_35_ = inbound.getShort();
					final byte i_36_ = inbound.getSigned();
					boolean bool = false;
					if (i_36_ == -128) {
						bool = true;
					}
					if (bool) {
						if ((-603301767 * Class_ci.clanSize) == 0) {
							currentOpcode = -1807560939;
							return true;
						}
						int i_38_;
						for (i_38_ = 0; ((i_38_ < (-603301767 * Class_ci.clanSize))
								&& (!Class_dd.field_mq_1588[i_38_].name.equals(string) || ((1232440621
										* ((Class_dd.field_mq_1588[i_38_]).world)) != i_35_))); i_38_++) {
							/* empty */
						}
						if (i_38_ < (Class_ci.clanSize * -603301767)) {
							for (/**/; (i_38_ < ((Class_ci.clanSize * -603301767) - 1)); i_38_++) {
								Class_dd.field_mq_1588[i_38_] = Class_dd.field_mq_1588[i_38_ + 1];
							}
							Class_ci.clanSize -= 887394761;
							Class_dd.field_mq_1588[(-603301767 * Class_ci.clanSize)] = null;
						}
					} else {
						inbound.getString();
						final ClanMember class_b = new ClanMember();
						class_b.name = string;
						class_b.formattedName = Class_bg.method_d_String((class_b.name), Class_fd.field_h_2308,
								-1106545823);
						class_b.world = -1539224923 * i_35_;
						class_b.rank = i_36_;
						int i_39_;
						for (i_39_ = (Class_ci.clanSize * -603301767) - 1; i_39_ >= 0; i_39_--) {
							final int i_40_ = (Class_dd.field_mq_1588[i_39_].formattedName
									.compareTo(class_b.formattedName));
							if (i_40_ == 0) {
								Class_dd.field_mq_1588[i_39_].world = i_35_ * -1539224923;
								Class_dd.field_mq_1588[i_39_].rank = i_36_;
								if (string.equals(Class_ci.myPlayer.name)) {
									SpotAnim.myClanRank = i_36_;
								}
								field_ku_2881 = 1247926085 * field_kj_2850;
								currentOpcode = -1807560939;
								return true;
							}
							if (i_40_ < 0) {
								break;
							}
						}
						if ((-603301767 * Class_ci.clanSize) >= Class_dd.field_mq_1588.length) {
							currentOpcode = -1807560939;
							return true;
						}
						for (int i_41_ = (Class_ci.clanSize * -603301767) - 1; i_41_ > i_39_; i_41_--) {
							Class_dd.field_mq_1588[i_41_ + 1] = Class_dd.field_mq_1588[i_41_];
						}
						if ((-603301767 * Class_ci.clanSize) == 0) {
							Class_dd.field_mq_1588 = new ClanMember[100];
						}
						Class_dd.field_mq_1588[i_39_ + 1] = class_b;
						Class_ci.clanSize += 887394761;
						if (string.equals(Class_ci.myPlayer.name)) {
							SpotAnim.myClanRank = i_36_;
						}
					}
					field_ku_2881 = 1247926085 * field_kj_2850;
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 168) {
					AbstractBuffer.closeSession();
					currentOpcode = -1807560939;
					return false;
				}
				if (op == 154) {
					Class_bi.localCoordinateX = inbound.getByteS() * -117815337;
					NpcComposite.localCoordinateY = inbound.getByteA() * -516214805;
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 250) {
					final int i_42_ = ((current_packet_size * 1815751203) + (inbound.position * -1485345105));// whats
																												// this
					final int i_43_ = inbound.getShort();
					int i_44_ = inbound.getShort();

					if (i_43_ != (-374264803 * rootInterfaceId)) {
						rootInterfaceId = 642184757 * i_43_;
						NpcComposite.method_ci_void(false, -1377035084);
						final int i_45_ = -374264803 * rootInterfaceId;
						if (Class_fz.loadWidget(i_45_, 136697355)) {
							final Widget[] widgets = Widget.widgets[i_45_];
							for (final Widget widget2 : widgets) {
								final Widget widget = widget2;
								if (widget != null) {
									widget.field_eq_2664 = 0;
									widget.field_en_2665 = 0;
								}
							}
						}
						Class_et.method_d_void(rootInterfaceId * -374264803, 446364759);
						for (int i_47_ = 0; i_47_ < 100; i_47_++) {
							field_li_2835[i_47_] = true;
						}
					}
					while (i_44_-- > 0) {
						final int i_48_ = inbound.getInt();
						final int i_49_ = inbound.getShort();
						final int i_50_ = inbound.get();
						Menu interfacepositionnode = ((Menu) menuTable.method_n_ga(i_48_));
						if ((interfacepositionnode != null)
								&& (i_49_ != (interfacepositionnode.interfaceId * 44103667))) {
							method_db_void(interfacepositionnode, true);
							interfacepositionnode = null;
						}
						if (interfacepositionnode == null) {
							interfacepositionnode = Class_e.method_dd_y(i_48_, i_49_, i_50_, 141241788);
						}
						interfacepositionnode.field_z_1535 = true;
					}
					for (Menu interfacepositionnode = ((Menu) menuTable
							.method_y_ga()); interfacepositionnode != null; interfacepositionnode = ((Menu) menuTable
									.method_e_ga())) {
						if (interfacepositionnode.field_z_1535) {
							interfacepositionnode.field_z_1535 = false;
						} else {
							method_db_void(interfacepositionnode, true);
						}
					}
					widgetOptionTable = new NodeMultiSet(512);
					while ((-1485345105 * inbound.position) < i_42_) {
						final int i_51_ = inbound.getInt();
						final int i_52_ = inbound.getShort();
						final int i_53_ = inbound.getShort();
						final int i_54_ = inbound.getInt();
						for (int i_55_ = i_52_; i_55_ <= i_53_; i_55_++) {
							final long l = i_55_ + ((long) i_51_ << 32);
							widgetOptionTable.method_d_void(new WidgetOptionNode(i_54_), l);
						}
					}
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 129) {// player updating
					localEntityAmount = 0;
					field_gr_2808 = 0;
					inbound.startBitMode();
					int index = inbound.getBits(1);
					if (index != 0) {
						final int moveType = inbound.getBits(2);
						if (moveType == 0) {// player never moved
							playersNeedUpdating[((field_gr_2808 += 990413737) * 2070991001) - 1] = 2047;
						} else if (moveType == 1) {// player walked in a
													// direction
							final int walkDir = inbound.getBits(3);
							Class_ci.myPlayer.moveInDirection(walkDir, false);
							final int updateRequiredBit = inbound.getBits(1);
							if (updateRequiredBit == 1) {
								playersNeedUpdating[((field_gr_2808 += 990413737) * 2070991001) - 1] = 2047;
							}
						} else if (moveType == 2) {// player ran in a direction
							final int walkDir = inbound.getBits(3);
							Class_ci.myPlayer.moveInDirection(walkDir, true);
							final int runDir = inbound.getBits(3);
							Class_ci.myPlayer.moveInDirection(runDir, true);
							final int updateRequiredBit = inbound.getBits(1);
							if (updateRequiredBit == 1) {
								playersNeedUpdating[((field_gr_2808 += 990413737) * 2070991001) - 1] = 2047;
							}
						} else if (moveType == 3) {// teleporting or region move
							final int teleportBit = inbound.getBits(1);
							final int lastLocalX = inbound.getBits(7);
							Class_ed.plane = (inbound.getBits(2) * 1830352175);
							final int updateRequiredBit = inbound.getBits(1);
							if (updateRequiredBit == 1) {
								playersNeedUpdating[((field_gr_2808 += 990413737) * 2070991001) - 1] = 2047;
							}
							final int lastLocalY = inbound.getBits(7);
							Class_ci.myPlayer.move(lastLocalX, lastLocalY, teleportBit == 1);
						}
					}
					NpcComposite.updateLocalPlayers(1515107729);
					while (inbound.availableBits((current_packet_size * 1815751203)) >= 11) {
						index = inbound.getBits(11);
						if (index == 2047) {
							break;
						}
						boolean newPlayer = false;
						if (localPlayers[index] == null) {
							localPlayers[index] = new Player();
							if (APPEARANCES[index] != null) {
								localPlayers[index].decodeAppearance((APPEARANCES[index]), -205085128);
							}
							newPlayer = true;
						}
						playerIndexArray[((localPlayerCount += -674379821) * 2000365659) - 1] = index;
						final Player player = localPlayers[index];
						player.cycle = currentCycle * 260564055;
						final int verifyIndex = inbound.getBits(1);
						if (verifyIndex == 1) {
							playersNeedUpdating[((field_gr_2808 += 990413737) * 2070991001) - 1] = index;
						}
						int dx = inbound.getBits(5);
						if (dx > 15) {
							dx -= 32;
						}
						final int i_69_ = (DIRECTIONS[inbound.getBits(3)]);
						if (newPlayer) {
							// System.out.println(newPlayer+", for a nigga goin
							// to "+i_69_);//rofl print this shit motherfucker.
							player.orientation = (player.field_b_217 = 1256908405 * i_69_) * -2133891525;
						}
						final int teleportBit = inbound.getBits(1);
						int dy = inbound.getBits(5);
						if (dy > 15) {
							dy -= 32;
						}
						player.move((Class_ci.myPlayer.walkQueueX[0]) + dx, (dy + (Class_ci.myPlayer.walkQueueY[0])),
								teleportBit == 1);
					}
					inbound.endBitMode();
					GroundDecoration.handlePlayerUpdateFlags(2000365659);
					for (index = 0; index < (localEntityAmount * -696223895); index++) {
						final int i_72_ = localPlayerIndices[index];
						if ((currentCycle * 303796053) != (-542884301 * localPlayers[i_72_].cycle)) {
							localPlayers[i_72_] = null;
						}
					}
					if ((inbound.position * -1485345105) != (1815751203 * current_packet_size)) {
						throw new RuntimeException(new StringBuilder(String.valueOf(-1485345105 * (inbound.position)))
								.append(Class_d.field_d_859).append(1815751203 * current_packet_size).toString());
					}
					for (index = 0; index < (localPlayerCount * 2000365659); index++) {
						if (localPlayers[playerIndexArray[index]] == null) {
							throw new RuntimeException(new StringBuilder(String.valueOf(index))
									.append(Class_d.field_d_859).append(localPlayerCount * 2000365659).toString());
						}
					}
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 206) {
					while ((-1485345105 * inbound.position) < (current_packet_size * 1815751203)) {
						final int i_73_ = inbound.get();
						final boolean bool = (i_73_ & 0x1) == 1;
						String name = inbound.getString();
						final String prevName = inbound.getString();
						inbound.getString();
						for (int i_75_ = 0; i_75_ < (-1756810877 * field_pa_2851); i_75_++) {
							final Ignore ignore = ignores[i_75_];
							if (bool) {
								if (prevName.equals(ignore.name)) {
									ignore.name = name;
									ignore.previousName = prevName;
									name = null;
									break;
								}
							} else if (name.equals(ignore.name)) {
								ignore.name = name;
								ignore.previousName = prevName;
								name = null;
								break;
							}
						}
						if ((name != null) && ((-1756810877 * field_pa_2851) < 400)) {
							final Ignore ignore = new Ignore();
							ignores[-1756810877 * field_pa_2851] = ignore;
							ignore.name = name;
							ignore.previousName = prevName;
							field_pa_2851 += -177969877;
						}
					}
					field_ka_2880 = field_kj_2850 * -62874977;
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 30) {
					final int i_76_ = inbound.getInt();
					final int i_77_ = inbound.getShort();
					final Widget widget = Class_en.getWidgetByUID(i_76_, (short) 18835);
					if (((widget.mediaType * -1572489121) != 1) || ((-907499515 * widget.mediaId) != i_77_)) {
						widget.mediaType = 1215472543;
						widget.mediaId = 1030350029 * i_77_;
						Daemon.method_dn_void(widget, (byte) -6);
					}
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 43) {// (?)
					final boolean bool = inbound.get() == 1;
					if (bool) {
						FileStore.field_pr_2492 = ((Renderable.getCurrentTime(856674336) - inbound.getLong())
								* 583342431420517259L);
						Npc.field_pe_292 = new Class_hq(inbound, true);
					} else {
						Npc.field_pe_292 = null;
					}
					field_ki_2780 = field_kj_2850 * -1864399093;
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 56) { // sendConfig1
					final int id = inbound.getLEShort();
					final int value = inbound.getSigned();
					Class_fv.configValues[id] = value;
					if (value != Class_fv.configs[id]) {
						Class_fv.configs[id] = value;
						Class_cw.handleConfig(id);
					}
					field_ko_2708[(((field_kb_2759 += -1086266841) * -502239849) - 1) & 0x1f] = id;
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 29) {
					for (int i_80_ = 0; i_80_ < Class_fv.configs.length; i_80_++) {
						if (Class_fv.configValues[i_80_] != Class_fv.configs[i_80_]) {
							Class_fv.configs[i_80_] = Class_fv.configValues[i_80_];
							Class_cw.handleConfig(i_80_);
							field_ko_2708[(((field_kb_2759 += -1086266841) * -502239849) - 1) & 0x1f] = i_80_;
						}
					}
					currentOpcode = -1807560939;
					return true;
				}
				if ((op == 116) || (op == 127) || (op == 95) || (op == 239) || (op == 49) || (op == 83) || (op == 205)
						|| (op == 25) || (op == 241) || (op == 215)) {
					SpotAnim.parseCoordPackets(-1695123151);
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 117) {
					ClanMember.renderRegion(true, 1764034957);
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 136) {
					final int i_81_ = inbound.getInt2((byte) 34);
					final int i_82_ = inbound.getLEInt();
					final Menu interfacepositionnode = ((Menu) menuTable.method_n_ga(i_81_));
					final Menu interfacepositionnode_83_ = ((Menu) menuTable.method_n_ga(i_82_));
					if (interfacepositionnode_83_ != null) {
						method_db_void(interfacepositionnode_83_,
								((interfacepositionnode == null)
										|| ((44103667 * (interfacepositionnode.interfaceId)) != (44103667
												* (interfacepositionnode_83_.interfaceId)))));
					}
					if (interfacepositionnode != null) {
						interfacepositionnode.removeLink();
						menuTable.method_d_void(interfacepositionnode, i_82_);
					}
					Widget widget = Class_en.getWidgetByUID(i_81_, (short) 11503);
					if (widget != null) {
						Daemon.method_dn_void(widget, (byte) 28);
					}
					widget = Class_en.getWidgetByUID(i_82_, (short) 5593);
					if (widget != null) {
						Daemon.method_dn_void(widget, (byte) 10);
						Class_bk.method_cg_void((Widget.widgets[((-560181405 * widget.uid) >>> 16)]), widget, true,
								8526479);
					}
					if ((rootInterfaceId * -374264803) != -1) {
						final int i_84_ = rootInterfaceId * -374264803;
						if (Class_fz.loadWidget(i_84_, 607580920)) {
							Class_dg.method_di_void(Widget.widgets[i_84_], 1, 617451744);
						}
					}
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 224) {// item on interface
					final int i_85_ = inbound.getInt();
					int i_86_ = inbound.getLEShortA();
					if (65535 == i_86_) {
						i_86_ = -1;
					}
					final int i_87_ = inbound.getLEInt();
					final Widget widget = Class_en.getWidgetByUID(i_85_, (short) 22697);
					if (!widget.interactive) {
						if (i_86_ == -1) {
							widget.mediaType = 0;
							currentOpcode = -1807560939;
							return true;
						}
						final ItemComposite itemdef = ItemDefinitions.getItemComposite(i_86_);
						widget.mediaType = 566922876;
						widget.mediaId = i_86_ * 1030350029;
						widget.field_bu_2670 = 1466122583 * itemdef.xan2d;
						widget.field_bq_2590 = 1771307895 * itemdef.yan2d;
						widget.field_bt_2596 = 1396515701 * ((-2035292644 * itemdef.field_v_120) / i_87_);
						Daemon.method_dn_void(widget, (byte) -15);
					} else {
						widget.itemId = i_86_ * 1368818521;
						widget.field_ek_2663 = i_87_ * -1280327945;
						final ItemComposite itemdef = ItemDefinitions.getItemComposite(i_86_);
						widget.field_bu_2670 = itemdef.xan2d * 1466122583;
						widget.field_bq_2590 = itemdef.yan2d * 1771307895;
						widget.field_bp_2595 = 1002987503 * itemdef.zan2d;
						widget.field_bd_2591 = 215587999 * itemdef.xOf2d;
						widget.field_bn_2641 = 25019051 * itemdef.yOf2d;
						widget.field_bt_2596 = -1996568661 * itemdef.field_v_120;
						if ((1537303969 * itemdef.stackable) == 1) {
							widget.field_bv_2600 = 1720055021;
						} else {
							widget.field_bv_2600 = -854857254;
						}
						if ((-20011083 * widget.field_bz_2637) > 0) {
							widget.field_bt_2596 = (((-1345676384 * widget.field_bt_2596)
									/ (widget.field_bz_2637 * -20011083)) * 1396515701);
						} else if ((widget.width * 1744956505) > 0) {
							widget.field_bt_2596 = (1396515701
									* ((-1345676384 * widget.field_bt_2596) / (widget.width * 1744956505)));
						}
						Daemon.method_dn_void(widget, (byte) 17);
					}
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 178) {// NPC Updating
					Class_hw.method_bf_void(false, (byte) 6);
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 16) {
					final int i_88_ = inbound.getShort();
					final int i_89_ = inbound.getInt();
					final int i_90_ = (i_88_ >> 10) & 0x1f;
					final int i_91_ = (i_88_ >> 5) & 0x1f;
					final int i_92_ = i_88_ & 0x1f;
					final int i_93_ = (i_91_ << 11) + (i_90_ << 19) + (i_92_ << 3);
					final Widget widget = Class_en.getWidgetByUID(i_89_, (short) 14515);
					if ((-2003985369 * widget.field_at_2617) != i_93_) {
						widget.field_at_2617 = 1917719447 * i_93_;
						Daemon.method_dn_void(widget, (byte) -5);
					}
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 200) {
					Class_bi.localCoordinateX = inbound.get() * -117815337;
					NpcComposite.localCoordinateY = inbound.get() * -516214805;
					for (int i_94_ = Class_bi.localCoordinateX
							* -1687774233; i_94_ < ((Class_bi.localCoordinateX * -1687774233) + 8); i_94_++) {
						for (int i_95_ = -6324029 * NpcComposite.localCoordinateY; i_95_ < (8
								+ (NpcComposite.localCoordinateY * -6324029)); i_95_++) {
							if ((groundItemsDeque[250114511 * Class_ed.plane][i_94_][i_95_]) != null) {
								groundItemsDeque[Class_ed.plane * 250114511][i_94_][i_95_] = null;
								Npc.drawGroundItems(i_94_, i_95_, -2029677096);
							}
						}
					}
					for (Class_r class_r = (Class_r) field_hv_2821
							.method_f_ga(); class_r != null; class_r = (Class_r) field_hv_2821.method_a_ga()) {
						if (((-201892019 * class_r.field_y_1326) >= (-1687774233 * Class_bi.localCoordinateX))
								&& ((-201892019 * class_r.field_y_1326) < ((Class_bi.localCoordinateX * -1687774233)
										+ 8))
								&& ((class_r.field_e_1327 * -2129494015) >= (NpcComposite.localCoordinateY * -6324029))
								&& ((-2129494015 * class_r.field_e_1327) < (8
										+ (NpcComposite.localCoordinateY * -6324029)))
								&& ((Class_ed.plane * 250114511) == (-227080595 * class_r.plane))) {
							class_r.field_u_1335 = 0;
						}
					}
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 153) {
					Class_s.method_df_void();
					weight = inbound.getShort((byte) 29) * -1346213073;
					field_kw_2884 = field_kj_2850 * 1688583221;
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 246) {
					final boolean bool = inbound.getByteA() == 1;
					final int i_96_ = inbound.getInt2((byte) 23);
					final Widget widget = Class_en.getWidgetByUID(i_96_, (short) 29950);
					if (widget.isHidden != bool) {
						widget.isHidden = bool;
						Daemon.method_dn_void(widget, (byte) 22);
					}
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 140) {// send run energy
					Class_s.method_df_void();
					runEnergy = inbound.get() * -1357967217;
					field_kw_2884 = field_kj_2850 * 1688583221;
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 202) {
					final int i_97_ = inbound.getInt();
					final int i_98_ = inbound.method_ba_int(2128159573);
					final int i_99_ = inbound.method_bj_int((byte) 1);
					final Widget widget = Class_en.getWidgetByUID(i_97_, (short) 19138);
					if (((widget.x * 517852635) != i_98_) || (i_99_ != (-437980135 * widget.y))
							|| ((-1433284713 * widget.field_s_2549) != 0) || ((widget.field_v_2550 * 307898257) != 0)) {
						widget.x = 92497491 * i_98_;
						widget.y = i_99_ * 1473849385;
						widget.field_s_2549 = 0;
						widget.field_v_2550 = 0;
						Daemon.method_dn_void(widget, (byte) -36);
						Class_dd.method_cp_void(widget, -685856689);
						if ((widget.type * 876728889) == 0) {
							Class_bk.method_cg_void((Widget.widgets[i_97_ >> 16]), widget, false, -412026802);
						}
					}
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 184) {
					final int i_100_ = inbound.getShort();
					final ItemContainer itemcontainer = (ItemContainer) ItemContainer.itemContainerTable
							.method_n_ga(i_100_);
					if (itemcontainer != null) {
						itemcontainer.removeLink();
					}
					field_km_2875[(((field_kh_2864 += -144176309) * 582198883) - 1) & 0x1f] = i_100_ & 0x7fff;
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 230) {
					final int i_101_ = inbound.get();
					final int i_102_ = inbound.get();
					final int i_103_ = inbound.getByteS();
					Class_ed.plane = 1830352175 * (i_102_ >> 1);
					Class_ci.myPlayer.move(i_103_, i_101_, (i_102_ & 0x1) == 1);
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 7) {
					final int i_104_ = inbound.getInt();
					final Widget widget = Class_en.getWidgetByUID(i_104_, (short) 30533);
					for (int i_105_ = 0; i_105_ < widget.itemIds.length; i_105_++) {
						widget.itemIds[i_105_] = -1;
						widget.itemIds[i_105_] = 0;
					}
					Daemon.method_dn_void(widget, (byte) -37);
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 65) {
					final int i_106_ = inbound.getInt();
					final Menu interfacepositionnode = ((Menu) menuTable.method_n_ga(i_106_));
					if (interfacepositionnode != null) {
						method_db_void(interfacepositionnode, true);
					}
					if (field_jd_2762 != null) {
						Daemon.method_dn_void(field_jd_2762, (byte) 109);
						field_jd_2762 = null;
					}
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 160) {
					int i_107_ = inbound.getLEShortA();
					if (65535 == i_107_) {
						i_107_ = -1;
					}
					Socket.method_b_void(i_107_, 1491137007);
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 88) {
					inbound.getMediumInt(143214181);
					int i_109_ = inbound.getLEShort();
					if (65535 == i_109_) {
						i_109_ = -1;
					}
					if (((1614344149 * field_ne_2926) != 0) && (i_109_ != -1)) {
						Index.method_d_void(Class_gt.musicIndex2, i_109_, 0, field_ne_2926 * 1614344149, false,
								824045845);
						field_np_2928 = true;
					}
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 31) {
					final int i_110_ = inbound.getInt1();
					final Widget widget = Class_en.getWidgetByUID(i_110_, (short) 5672);
					widget.mediaType = -648549667;
					widget.mediaId = Class_ci.myPlayer.composite.method_a_int((short) 2400) * 1030350029;
					Daemon.method_dn_void(widget, (byte) 96);
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 175) {
					final int i_111_ = inbound.getLEShortA();
					final int i_112_ = inbound.getShort();
					final int i_113_ = inbound.getLEInt();
					final Widget widget = Class_en.getWidgetByUID(i_113_, (short) 16598);
					widget.field_by_2598 = 525177673 * (i_112_ + (i_111_ << 16));
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 137) { // hinticons?
					hintMarkerType = inbound.get() * 737219147;

					if ((237348707 * hintMarkerType) == 1) {// npc
						hintMarkerNpcIndex = (inbound.getShort() * 425113667);
					}
					if (((237348707 * hintMarkerType) >= 2) && ((hintMarkerType * 237348707) <= 6)) {// object?
						if ((hintMarkerType * 237348707) == 2) {
							field_az_2710 = 555725120;
							field_at_2711 = 1601514688;
						}
						if ((hintMarkerType * 237348707) == 3) {
							field_az_2710 = 0;
							field_at_2711 = 1601514688;
						}
						if ((237348707 * hintMarkerType) == 4) {
							field_az_2710 = 1111450240;
							field_at_2711 = 1601514688;
						}
						if ((hintMarkerType * 237348707) == 5) {
							field_az_2710 = 555725120;
							field_at_2711 = 0;
						}
						if ((hintMarkerType * 237348707) == 6) {
							field_az_2710 = 555725120;
							field_at_2711 = -1091937920;
						}
						hintMarkerType = 1474438294;
						field_ab_2772 = (inbound.getShort() * -2022907367);
						field_ao_2942 = (inbound.getShort() * -738227537);// this
																			// is
						field_ac_2812 = (inbound.get() * -1439774397);
					}
					if ((237348707 * hintMarkerType) == 10) {// player
						hintMarkerPlayerIndex = (inbound.getShort() * 1403406673);
					}
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 162) {
					final int i_114_ = inbound.get();
					if (inbound.get() == 0) {
						field_pb_2965[i_114_] = new Class_hl();
						inbound.position += 539481486;
					} else {
						inbound.position -= -685856689;
						field_pb_2965[i_114_] = new Class_hl(inbound, false);
					}
					field_kv_2882 = -436290107 * field_kj_2850;
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 138) {
					// System.out.println(rootInterfaceId * -374264803);
					if ((rootInterfaceId * -374264803) != -1) {
						final int i_115_ = rootInterfaceId * -374264803;
						if (Class_fz.loadWidget(i_115_, 566730899)) {
							Class_dg.method_di_void(Widget.widgets[i_115_], 0, 1508266691);
						}
					}
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 167) {
					final String string = inbound.getString();
					final Object[] objects = new Object[string.length() + 1];
					// System.out.println(string);
					for (int i_116_ = string.length() - 1; i_116_ >= 0; i_116_--) {
						if (string.charAt(i_116_) == 's') {
							objects[1 + i_116_] = inbound.getString();
						} else {
							objects[i_116_ + 1] = new Integer(inbound.getInt());
						}
					}
					objects[0] = new Integer(inbound.getInt());
					final Script class_n = new Script();
					class_n.parameters = objects;
					Menu.handleCS2Script(class_n, 200000);
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 204) { // receive message?
					final String name = inbound.getString();
					final long mystery = inbound.getLong();
					final long l_117_ = inbound.getShort();
					final long l_118_ = inbound.getMediumInt(-246443038);
					final Permissions class_ew = ((Permissions) (Friend.identify(Permissions.getPrivileges(),
							inbound.get())));
					final long l_119_ = l_118_ + (l_117_ << 32);
					boolean ignored = false;
					for (int i_120_ = 0; i_120_ < 100; i_120_++) {
						if (l_119_ == field_mw_2910[i_120_]) {
							ignored = true;
							break;
						}
					}
					if (class_ew.ignorable && Class_r.isIgnored(name)) {
						ignored = true;
					}
					if (!ignored && ((-801822035 * field_gk_2804) == 0)) {
						field_mw_2910[field_mh_2911 * 841344173] = l_119_;
						field_mh_2911 = -691462363 * ((1 + (841344173 * field_mh_2911)) % 100);
						final String string_121_ = (TypeFace.method_m_String(
								Class_l.method_m_String(Class_cx.method_n_String(inbound, -1698271246), 573901825)));
						if ((class_ew.ordinal * 1941325631) != -1) {
							final int i_122_ = 1941325631 * class_ew.ordinal;
							final String string_123_ = new StringBuilder("<img=").append(i_122_).append(">").toString();
							IdentityKit.method_z_void(9, new StringBuilder(string_123_).append(name).toString(),
									string_121_, Class_dt.method_d_String(mystery), -1957976047);
						} else {
							IdentityKit.method_z_void(9, name, string_121_, Class_dt.method_d_String(mystery),
									-1957976047);
						}
					}
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 9) {
					final int i_124_ = inbound.get();
					final int i_125_ = inbound.get();
					final int i_126_ = inbound.get();
					final int i_127_ = inbound.get();
					field_od_2919[i_124_] = true;
					field_oe_2692[i_124_] = i_125_;
					field_oi_2940[i_124_] = i_126_;
					field_of_2902[i_124_] = i_127_;
					field_ok_2907[i_124_] = 0;
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 5) {
					inbound.position += -2024118108;
					if (inbound.method_aw_boolean((byte) 5)) {
						ClientScript.method_f_void(inbound, (inbound.position * -1485345105) - 28, (byte) -74);
					}
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 53) {
					field_mk_2923 = inbound.get() * -652317981;
					if ((field_mk_2923 * 851978955) == 255) {
						field_mk_2923 = 0;
					}
					field_mn_2924 = inbound.get() * -1028068353;
					if ((field_mn_2924 * 1672942591) == 255) {
						field_mn_2924 = 0;
					}
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 216) {
					final int i_128_ = inbound.getInt();
					field_an_2713 = SpotAnim.daemon.method_f_es(i_128_, (short) -171);
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 59) {// send message
					final String string = inbound.getString();
					final long someHash = inbound.getShort();
					final long l_129_ = inbound.getMediumInt(1069376779);
					final Permissions class_ew = ((Permissions) (Friend.identify(Permissions.getPrivileges(),
							inbound.get())));
					final long l_130_ = l_129_ + (someHash << 32);
					boolean bool = false;
					for (int i_131_ = 0; i_131_ < 100; i_131_++) {
						if (field_mw_2910[i_131_] == l_130_) {
							bool = true;
							break;
						}
					}
					if (Class_r.isIgnored(string)) {
						bool = true;
					}
					if (!bool && ((field_gk_2804 * -801822035) == 0)) {
						field_mw_2910[field_mh_2911 * 841344173] = l_130_;
						field_mh_2911 = -691462363 * (((841344173 * field_mh_2911) + 1) % 100);
						final String string_132_ = (TypeFace.method_m_String(
								Class_l.method_m_String(Class_cx.method_n_String(inbound, -1444711387), 573901825)));
						int i_133_ = 7; // Fixes an odd bug
						// if (class_ew.field_m_2246) {
						// i_133_ = 7;
						// } else {
						// i_133_ = 3;
						// }
						if ((class_ew.ordinal * 1941325631) != -1) {
							final int i_134_ = class_ew.ordinal * 1941325631;
							final String string_135_ = new StringBuilder("<img=").append(i_134_).append(">").toString();
							GameStub.sendMessage(i_133_, new StringBuilder(string_135_).append(string).toString(),
									string_132_);
						} else {
							GameStub.sendMessage(i_133_, string, string_132_);
						}
					}
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 186) {// rotate camera (?)
					field_nf_2937 = true;
					Class_al.field_nw_187 = inbound.get() * 1059251417;
					Class_a.field_nl_785 = inbound.get() * 1930623945;
					Class_db.field_or_1573 = inbound.getShort() * -561925985;
					Class_r.field_ox_1336 = (inbound.get() * -1809470387);
					IdentityKit.field_oa_100 = inbound.get() * 1251255971;
					if ((IdentityKit.field_oa_100 * 1727544587) >= 100) {
						final int i_136_ = 64 + (-676481920 * Class_al.field_nw_187);
						final int i_137_ = (-1727579008 * Class_a.field_nl_785) + 64;
						final int i_138_ = (Class_q.getTileHeight(i_136_, i_137_, (250114511 * Class_ed.plane))
								- (-1697420449 * Class_db.field_or_1573));
						final int i_139_ = (i_136_ - (Menu.cameraX * 548221253));
						final int i_140_ = i_138_ - (Class_d.cameraZ * 424565779);
						final int i_141_ = i_137_ - (GameMessage.cameraY * 1900802031);
						final int i_142_ = (int) Math.sqrt((i_139_ * i_139_) + (i_141_ * i_141_));
						World.cameraPitch = ((int) (Math.atan2(i_140_, i_142_) * 325.949) & 0x7ff) * -1018842563;
						FloorOverlay.cameraYaw = ((int) (Math.atan2(i_139_, i_141_) * -325.949) & 0x7ff) * 732473783;
						if ((World.cameraPitch * 633664789) < 128) {
							World.cameraPitch = -1562829184;
						}
						if ((633664789 * World.cameraPitch) > 383) {
							World.cameraPitch = 625322307;
						}
					}
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 249) { // sendConfig2
					final int value = inbound.getInt1();
					final int id = inbound.getShortA();
					Class_fv.configValues[id] = value;
					if (Class_fv.configs[id] != value) {
						Class_fv.configs[id] = value;
						Class_cw.handleConfig(id);
					}
					field_ko_2708[(((field_kb_2759 += -1086266841) * -502239849) - 1) & 0x1f] = id;
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 108) {
					final int i_145_ = inbound.getLEShortA();
					rootInterfaceId = i_145_ * 642184757;
					NpcComposite.method_ci_void(false, 1672255128);
					if (Class_fz.loadWidget(i_145_, -1523481427)) {
						final Widget[] widgets = Widget.widgets[i_145_];
						for (final Widget widget2 : widgets) {
							final Widget widget = widget2;
							if (widget != null) {
								widget.field_eq_2664 = 0;
								widget.field_en_2665 = 0;
							}
						}
					}
					Class_et.method_d_void(-374264803 * rootInterfaceId, 1442836821);
					for (int i_147_ = 0; i_147_ < 100; i_147_++) {
						field_li_2835[i_147_] = true;
					}
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 39) {// change client settings
					final String string = inbound.getString();
					Class_q.clientSettings = string;
					try {
						final String string_148_ = instance.getParameter(Settings.field_q_2363.key);
						final String string_149_ = instance.getParameter(Settings.field_k_2370.key);
						String cookie = new StringBuilder(string_148_).append("settings=").append(string)
								.append("; version=1; path=/; domain=").append(string_149_).toString();
						if (string.length() == 0) {
							cookie = new StringBuilder(cookie)
									.append("; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0").toString();
						} else {
							cookie = new StringBuilder(cookie).append("; Expires=")
									.append(Friend.formatDate(Renderable.getCurrentTime(1025884574) + 94608000000L))
									.append("; Max-Age=").append(94608000L).toString();
						}
						Class_dz.method_n_void(instance,
								new StringBuilder("document.cookie=\"").append(cookie).append("\"").toString(),
								657156011);
					} catch (final Throwable throwable) {
						/* empty */
					}
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 64) {
					Class_ft.method_y_void(inbound, 1815751203 * current_packet_size, (short) -526);
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 114) {
					field_ly_2725 = inbound.get() * 10021629;
					field_lh_2908 = inbound.get() * -317796335;
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 208) {
					field_ku_2881 = 1247926085 * field_kj_2850;
					if ((1815751203 * current_packet_size) == 0) {
						channelName = null;
						clanOwner = null;
						Class_ci.clanSize = 0;
						Class_dd.field_mq_1588 = null;
						currentOpcode = -1807560939;
						return true;
					}
					clanOwner = inbound.getString();
					final long clanNameLong = inbound.getLong();
					channelName = Class_cl.stringToLong(clanNameLong);
					ItemContainer.inChannelFlag = inbound.getSigned();
					final int size = inbound.get();
					if (size == 255) {
						currentOpcode = -1807560939;
						return true;
					}
					Class_ci.clanSize = 887394761 * size;
					final ClanMember[] members = new ClanMember[100];
					for (int i_152_ = 0; i_152_ < (Class_ci.clanSize * -603301767); i_152_++) {
						members[i_152_] = new ClanMember();
						members[i_152_].name = inbound.getString();
						members[i_152_].formattedName = Class_bg.method_d_String((members[i_152_].name),
								Class_fd.field_h_2308, -446299978);
						members[i_152_].world = (inbound.getShort() * -1539224923);
						members[i_152_].rank = inbound.getSigned();
						inbound.getString();
						if (members[i_152_].name.equals(Class_ci.myPlayer.name)) {
							SpotAnim.myClanRank = members[i_152_].rank;
						}
					}
					boolean bool = false;
					int i_153_ = Class_ci.clanSize * -603301767;
					while (i_153_ > 0) {
						bool = true;
						i_153_--;
						for (int index = 0; index < i_153_; index++) {
							if ((members[index].formattedName.compareTo(members[index + 1].formattedName)) > 0) {
								final ClanMember class_b = members[index];
								members[index] = members[1 + index];
								members[index + 1] = class_b;
								bool = false;
							}
						}
						if (bool) {
							break;
						}
					}
					Class_dd.field_mq_1588 = members;
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 201) {// Possible send update?
					field_ax_2703 = (inbound.getLEShortA() * 2127563426);
					field_kw_2884 = 1688583221 * field_kj_2850;
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 6) { // Friends
					while ((inbound.position * -1485345105) < (1815751203 * current_packet_size)) {
						final boolean hasDisplayName = inbound.get() == 1;
						String friendName = inbound.getString();
						final String friendDisplayName = inbound.getString();
						final int worldStatus = inbound.getShort();
						final int clanRank = inbound.get();
						final int flag = inbound.get();
						final boolean bool_159_ = (flag & 0x2) != 0;
						final boolean bool_160_ = (flag & 0x1) != 0;
						if (worldStatus > 0) {
							inbound.getString();
							inbound.get();
							inbound.getInt();
						}
						inbound.getString();
						for (int index = 0; index < (1944416787 * friendListSize); index++) {
							final Friend friend = friends[index];
							if (!hasDisplayName) {
								if (friendName.equals(friend.name)) {
									if (worldStatus != (-533307325 * (friend.world))) {
										boolean isOnline = true;
										for (FriendWidget friendWidget = ((FriendWidget) friendsListWidgets
												.method_d_gc()); friendWidget != null; friendWidget = ((FriendWidget) friendsListWidgets
														.method_z_gc())) {
											if (friendWidget.username.equals(friendName)) {
												if ((worldStatus != 0) && ((friendWidget.worldStatus) == 0)) {
													friendWidget.update();
													isOnline = false;
												} else if ((worldStatus == 0) && ((friendWidget.worldStatus) != 0)) {
													friendWidget.update();
													isOnline = false;
												}
											}
										}
										if (isOnline) {
											friendsListWidgets.add(new FriendWidget(friendName, worldStatus));
										}
										friend.world = 1356393579 * worldStatus;
									}
									friend.displayName = friendDisplayName;
									friend.clanRank = -2004693643 * clanRank;
									friend.field_e_1091 = bool_159_;
									friend.field_g_1096 = bool_160_;
									friendName = null;
									break;
								}
							} else if (friendDisplayName.equals(friend.name)) {
								friend.name = friendName;
								friend.displayName = friendDisplayName;
								friendName = null;
								break;
							}
						}
						if ((friendName != null) && ((1944416787 * friendListSize) < 400)) {
							final Friend class_j = new Friend();
							friends[friendListSize * 1944416787] = class_j;
							class_j.name = friendName;
							class_j.displayName = friendDisplayName;
							class_j.world = worldStatus * 1356393579;
							class_j.clanRank = clanRank * -2004693643;
							class_j.field_e_1091 = bool_159_;
							class_j.field_g_1096 = bool_160_;
							friendListSize += 241051675;
						}
					}
					field_ol_2957 = 1189839266;
					field_ka_2880 = -62874977 * field_kj_2850;
					boolean bool = false;
					int i_163_ = 1944416787 * friendListSize;
					while (i_163_ > 0) {
						bool = true;
						i_163_--;
						for (int i = 0; i < i_163_; i++) {
							boolean rearrange = false;
							final Friend curr = friends[i];
							final Friend next = friends[i + 1];
							if (((-533307325 * curr.world) != (1536832127 * currentWorld))
									&& ((1536832127 * currentWorld) == (next.world * -533307325))) {
								rearrange = true;
							}
							if (!rearrange && ((curr.world * -533307325) == 0) && ((-533307325 * (next.world)) != 0)) {
								rearrange = true;
							}
							if (!rearrange && !curr.field_e_1091 && next.field_e_1091) {
								rearrange = true;
							}
							if (!rearrange && !curr.field_g_1096 && next.field_g_1096) {
								rearrange = true;
							}
							if (rearrange) {
								final Friend tmp = friends[i];
								friends[i] = friends[1 + i];
								friends[i + 1] = tmp;
								bool = false;
							}
						}
						if (bool) {
							break;
						}
					}
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 79) {
					final int i_168_ = inbound.getSmart((byte) 33);
					final boolean bool = inbound.get() == 1;
					String string = "";
					boolean bool_169_ = false;
					if (bool) {
						string = inbound.getString();
						if (Class_r.isIgnored(string)) {
							bool_169_ = true;
						}
					}
					final String string_170_ = inbound.getString();
					if (!bool_169_) {
						GameStub.sendMessage(i_168_, string, string_170_);
					}
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 38) {
					final int i_171_ = inbound.getShort();
					final int i_172_ = inbound.get();
					final int i_173_ = inbound.getShort();
					if (((field_ng_2929 * 1804964747) != 0) && (i_172_ != 0) && ((-1735289853 * field_nb_2931) < 50)) {
						field_nq_2932[-1735289853 * field_nb_2931] = i_171_;
						field_nx_2933[-1735289853 * field_nb_2931] = i_172_;
						field_nj_2967[field_nb_2931 * -1735289853] = i_173_;
						field_no_2936[-1735289853 * field_nb_2931] = null;
						field_nu_2935[field_nb_2931 * -1735289853] = 0;
						field_nb_2931 += -405227861;
					}
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 155) {
					field_nk_2925 = inbound.get() * -973668313;
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 35) {
					final String string = inbound.getString();
					final String string_174_ = (TypeFace.method_m_String(
							Class_l.method_m_String(Class_cx.method_n_String(inbound, -1244178319), 573901825)));
					GameStub.sendMessage(6, string, string_174_);
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 229) { // sendobject
					Class_bi.localCoordinateX = inbound.get() * -117815337;
					NpcComposite.localCoordinateY = inbound.getByteS() * -516214805;
					while ((-1485345105 * inbound.position) < (1815751203 * current_packet_size)) {
						currentOpcode = (inbound.get() * 1807560939);
						SpotAnim.parseCoordPackets(-1695123151);// i meant when
																// u do new
																// GameObjet
					}
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 133) {
					ClanMember.renderRegion(false, -242315182);
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 171) {
					new RobotKey(inbound.get());
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 170) {
					Class_cx.field_lj_1431 = Class_ae.method_d_db(inbound.get(), 327238364);
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 47) { // npc update for larger viewports
					Class_hw.method_bf_void(true, (byte) -7);
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 157) {// Send String
					final int uid = inbound.getInt();
					final String text = inbound.getString();// Message
					final Widget widget = Class_en.getWidgetByUID(uid, (short) 7520);

					// System.out.println(string+","+widget.defaultText);
					if (!text.equals(widget.defaultText)) {
						widget.defaultText = text;
						Daemon.method_dn_void(widget, (byte) -7);
					}
					currentOpcode = -1807560939;
					return true;
				}
				if (op == 33) {// refresh range of items on interface starting
								// from 0 to x
					// String var72 = inbound.getString();
					final int uid = inbound.getInt();
					int type = inbound.getShort();
					if (uid < -70000) {
						type += 32768;
					}
					Widget widget;
					if (uid >= 0) {
						widget = Class_en.getWidgetByUID(uid, (short) 17985);
					} else {
						widget = null;
					}
					if (widget != null) {
						for (int i_178_ = 0; i_178_ < widget.itemIds.length; i_178_++) {
							widget.itemIds[i_178_] = 0;
							widget.itemAmts[i_178_] = 0;
						}
					}
					Class_cp.method_y_void(type, -836529772);
					final int i_179_ = inbound.getShort();
					for (int i_180_ = 0; i_180_ < i_179_; i_180_++) {
						final int i_181_ = inbound.getLEShortA();
						int i_182_ = inbound.getByteA();
						if (i_182_ == 255) {
							i_182_ = inbound.getInt();
						}
						if ((widget != null) && (i_180_ < widget.itemIds.length)) {
							widget.itemIds[i_180_] = i_181_;
							widget.itemAmts[i_180_] = i_182_;
						}
						Class_o.method_z_void(type, i_180_, i_181_ - 1, i_182_, -596286361);
					}
					if (widget != null) {
						Daemon.method_dn_void(widget, (byte) 19);
					}

					Class_s.method_df_void();
					field_km_2875[(((field_kh_2864 += -144176309) * 582198883) - 1) & 0x1f] = type & 0x7fff;
					currentOpcode = -1807560939;
					return true;
				}
				Class_cw.method_n_void(new StringBuilder().append(2043934659 * currentOpcode)
						.append(Class_d.field_d_859).append(1789242423 * field_cx_2735).append(Class_d.field_d_859)
						.append(field_cy_2736 * -761113079).append(Class_d.field_d_859)
						.append(1815751203 * current_packet_size).toString(), null, 1085705537);
				AbstractBuffer.closeSession();
			} catch (final IOException ioexception) {
				ioexception.printStackTrace();
				if ((field_cv_2733 * -874319047) > 0) {
					AbstractBuffer.closeSession();
				} else {
					Socket.method_h_void(40, -1993358342);
					WidgetNode.field_cq_796 = Class_cx.connection;
					Class_cx.connection = null;
				}
			} catch (final Exception exception) {
				exception.printStackTrace();
				String string = new StringBuilder().append(2043934659 * currentOpcode).append(Class_d.field_d_859)
						.append(1789242423 * field_cx_2735).append(Class_d.field_d_859)
						.append(field_cy_2736 * -761113079).append(Class_d.field_d_859)
						.append(current_packet_size * 1815751203).append(Class_d.field_d_859)
						.append(Class_ci.myPlayer.walkQueueX[0] + (1693061403 * Class_q.originX))
						.append(Class_d.field_d_859)
						.append((Class_gf.originY * -1593604783) + Class_ci.myPlayer.walkQueueY[0])
						.append(Class_d.field_d_859).toString();
				for (int i_183_ = 0; (i_183_ < (current_packet_size * 1815751203)) && (i_183_ < 50); i_183_++) {
					string = new StringBuilder(string).append(inbound.buffer[i_183_]).append(Class_d.field_d_859)
							.toString();
				}
				Class_cw.method_n_void(string, exception, 1308439565);
				AbstractBuffer.closeSession();
			}
		} catch (final RuntimeException runtimeexception) {
			runtimeexception.printStackTrace();
			throw GameCanvas.error(runtimeexception, "client.bq()");
		}
		return true;
	}

	static String ipAddress;

	@Override
	public final void init() {
		try {
			if (isValidHost()) {
				final Settings[] parameters = MouseInputListener.getClientParameters();
				for (final Settings parameter : parameters) {
					final String value = getParameter(parameter.key);
					if (value != null) {
						switch (Integer.parseInt(parameter.key)) {
						case 1:
							Class_dd.field_j_1591 = Integer.parseInt(value) * -920691465;
							break;
						case 2:
							Varp.field_s_62 = Integer.parseInt(value) * 1578728501;
							break;
						case 3:
							// ipAddress = value;
							ItemContainer.WORLD_LIST_URL = "http://127.0.0.1:8080";// value
																					// 80/worldlist.ws
							break;
						case 4:
							currentWorldMask = Integer.parseInt(value) * -722356291;
							break;
						case 5:
							hideWorldList = /**
											 * Integer.parseInt(value) *
											 * -1229966543
											 */
									ClientLoaderOLD.WORLD_LIST;
							/* fall through */
						default:
							break;
						case 7:
							ClientError.build = ObjectComposite.method_d_ex(Integer.parseInt(value), 682414447);
							break;
						case 8:
							if (value.equalsIgnoreCase(Class_d.field_n_854)) {
								/* empty */
							}
							break;
						case 9:
							game = ((GameComposite) (Friend.identify(Actor.getGames(-612798455),
									Integer.parseInt(value))));
							if (game == GameComposite.OLDSCAPE) {
								Class_fd.field_h_2308 = Class_gf.field_n_2984;
							} else {
								Class_fd.field_h_2308 = Class_gf.field_a_2989;
							}
							break;
						case 12:
							currentWorld = Integer.parseInt(value) * 886017407;
							break;
						case 13:
							Class_q.clientSettings = value;
							break;
						case 14:
							if (value.equalsIgnoreCase(Class_d.field_n_854)) {
								onMembersWorld = true;
							} else {
								onMembersWorld = false;
							}
							break;
						case 15:
							game_mode = Integer.parseInt(value) * 1825628007;
						}
					}
				}
				method_e_void(1417274129);
				Script.currentWorldAddress = ClientLoaderOLD.IP;
				final String buildType = ClientError.build.type;
				try {
					Class_r.initCacheDirectory("oldschool", buildType, 0, 16, -1731688087);
				} catch (final Exception exception) {
					Class_cw.method_n_void(null, exception, -156514687);
				}
				instance = this;
				setDimensions(765, 503, 83);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "client.init()");
		}
	}

	@Override
	protected final void method_g_void(final int i) {
		try {
			Class_cc.port = 254347017
					* ((1548930135 * game_mode) == 0 ? Settings.PORT : 40000);
			Class_ae.field_bx_57 = 480351963
					* ((game_mode * 1548930135) == 0 ? 443 : (currentWorld * 1536832127) + 50000);
			Friend.field_bc_1094 = Class_cc.port * 1057325665;
			Class_dt.field_f_1714 = Class_fc.field_n_2304;
			PlayerComposite.bodyColors = Class_fc.field_d_2299;
			Class_s.field_a_1360 = Class_fc.field_z_2300;
			ClientScript.field_h_843 = Class_fc.field_y_2301;
			if (Daemon.operatingSystem.toLowerCase().indexOf("microsoft") != -1) {
				KeyFocusListener.field_cr_1683[186] = 57;
				KeyFocusListener.field_cr_1683[187] = 27;
				KeyFocusListener.field_cr_1683[188] = 71;
				KeyFocusListener.field_cr_1683[189] = 26;
				KeyFocusListener.field_cr_1683[190] = 72;
				KeyFocusListener.field_cr_1683[191] = 73;
				KeyFocusListener.field_cr_1683[192] = 58;
				KeyFocusListener.field_cr_1683[219] = 42;
				KeyFocusListener.field_cr_1683[220] = 74;
				KeyFocusListener.field_cr_1683[221] = 43;
				KeyFocusListener.field_cr_1683[222] = 59;
				KeyFocusListener.field_cr_1683[223] = 28;
			} else {
				KeyFocusListener.field_cr_1683[44] = 71;
				KeyFocusListener.field_cr_1683[45] = 26;
				KeyFocusListener.field_cr_1683[46] = 72;
				KeyFocusListener.field_cr_1683[47] = 73;
				KeyFocusListener.field_cr_1683[59] = 57;
				KeyFocusListener.field_cr_1683[61] = 27;
				KeyFocusListener.field_cr_1683[91] = 42;
				KeyFocusListener.field_cr_1683[92] = 74;
				KeyFocusListener.field_cr_1683[93] = 43;
				KeyFocusListener.field_cr_1683[192] = 28;
				KeyFocusListener.field_cr_1683[222] = 58;
				KeyFocusListener.field_cr_1683[520] = 59;
			}
			final Canvas canvas = ObjectComposite.canvas;
			canvas.setFocusTraversalKeysEnabled(false);
			canvas.addKeyListener(KeyFocusListener.instance);
			canvas.addFocusListener(KeyFocusListener.instance);
			final Canvas canvas_184_ = ObjectComposite.canvas;
			canvas_184_.addMouseListener(MouseInputListener.instance);
			canvas_184_.addMouseMotionListener(MouseInputListener.instance);
			canvas_184_.addFocusListener(MouseInputListener.instance);
			FloorOverlay.field_ky_8 = ZipInflater.newBindable();
			if (FloorOverlay.field_ky_8 != null) {
				FloorOverlay.field_ky_8.bind(ObjectComposite.canvas);
			}
			FloorUnderlay.field_po_84 = new Class_du(255, Class_ed.mainDatFile, Class_ed.metaFile, 500000);
			SeekableFile seekable = null;
			Class_a class_a = new Class_a();
			try {
				seekable = Class_ab.getSeekableFile("", game.codename, false, (byte) -28);
				final byte[] is = new byte[(int) seekable.length()];
				int i_185_;
				for (int index = 0; index < is.length; index += i_185_) {
					i_185_ = seekable.read(is, index, is.length - index);
					if (i_185_ == -1) {
						throw new IOException();
					}
				}
				class_a = new Class_a(new Buffer(is));
			} catch (final Exception exception) {
				/* empty */
			}
			try {
				if (seekable != null) {
					seekable.close();
				}
			} catch (final Exception exception) {
				/* empty */
			}
			Class_w.field_pz_1501 = class_a;
			GameMessage.field_pl_303 = getToolkit().getSystemClipboard();
			final String string = Class_cl.field_qk_1086;
			Class_dv.field_n_1728 = this;
			Class_dv.field_d_1726 = string;
			if ((1548930135 * game_mode) != 0) {
				field_ae_2702 = true;
			}
			ItemContainer.method_az_void((-483902041 * (Class_w.field_pz_1501.field_e_792)), 1181120793);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "client.g()");
		}
	}

	@Override
	protected final void method_m_void(final int i) {
		try {
			boolean bool;
			while_1_: do {
				do {
					try {
						if ((-858508631 * Class_fa.field_e_2278) != 2) {
							break;
						}
						if (Bindable.field_u_1706 == null) {
							Bindable.field_u_1706 = Class_fu.method_n_fu(Region.field_g_1012,
									(-97495723 * (Class_eb.field_f_1772)), (Npc.field_m_298 * -219759041));
							if (Bindable.field_u_1706 == null) {
								bool = false;
								break while_1_;
							}
						}
						if (Class_i.field_q_1074 == null) {
							Class_i.field_q_1074 = new Class_bw(Class_fa.field_z_2274, Class_fa.field_d_2275);
						}
						if (!Class_fa.field_y_2276.method_z_boolean(Bindable.field_u_1706, Class_fa.field_n_2277,
								Class_i.field_q_1074, 22050, 1087297190)) {
							break;
						}
						Class_fa.field_y_2276.method_y_void(337465828);
						Class_fa.field_y_2276.method_n_void(((Class_eh.field_a_2122) * 1884318837), -1531581542);
						Class_fa.field_y_2276.method_h_void((Bindable.field_u_1706), (Class_e.field_l_932), 1814581341);
						Class_fa.field_e_2278 = 0;
						Bindable.field_u_1706 = null;
						Class_i.field_q_1074 = null;
						Region.field_g_1012 = null;
						bool = true;
					} catch (final Exception exception) {
						exception.printStackTrace();
						Class_fa.field_y_2276.method_u_void(465622017);
						Class_fa.field_e_2278 = 0;
						Bindable.field_u_1706 = null;
						Class_i.field_q_1074 = null;
						Region.field_g_1012 = null;
						break;
					}
					break while_1_;
				} while (false);
				bool = false;
			} while (false);
			if (bool && field_np_2928 && (Class_fq.field_nt_2444 != null)) {
				Class_fq.field_nt_2444.method_b_void(148484145);
			}
			if (((status * 824045845) == 10) || ((824045845 * status) == 20) || ((824045845 * status) == 30)) {
				if ((0L != (field_lk_2947 * -5319700451755324533L))
						&& (Renderable.getCurrentTime(1596568979) > (-5319700451755324533L * field_lk_2947))) {
					ItemContainer.method_az_void(Class_dj.method_ac_int((byte) 125), -1540223029);
				} else if (field_qr_2146) {
					SceneObject.method_at_void(1812474966);
				}
			}
			final Dimension dimension = method_rl_Dimension(-1491852126);
			if ((dimension.width != (Class_dw.field_qf_1737 * -1364750405))
					|| (dimension.height != (526016489 * Renderable.field_qa_763)) || field_qt_2134) {
				Class_fj.method_an_void(1177041841);
				field_lk_2947 = ((Renderable.getCurrentTime(-349643229) + 500L) * -6994944606884772829L);
				field_qt_2134 = false;
			}
			boolean bool_187_ = false;
			if (field_qq_2143) {
				field_qq_2143 = false;
				bool_187_ = true;
				for (int i_188_ = 0; i_188_ < 100; i_188_++) {
					field_li_2835[i_188_] = true;
				}
			}
			if (bool_187_) {
				Class_de.method_ai_void(-1246697462);
			}
			if ((824045845 * status) == 0) {
				final int i_189_ = Class_ax.field_as_430 * 456179755;
				final String string = Class_ax.updateStatusText;
				Color color = null;
				do {
					try {
						final Graphics graphics = ObjectComposite.canvas.getGraphics();
						if (Class_h.field_qz_1029 == null) {
							Class_h.field_qz_1029 = new Font("Helvetica", 1, 13);
							SceneObject.field_bf_949 = ObjectComposite.canvas.getFontMetrics(Class_h.field_qz_1029);
						}
						if (bool_187_) {
							graphics.setColor(Color.black);
							graphics.fillRect(0, 0, (Boundary.clientWidth * -1236640339),
									(-1483492575 * Projectile.clientHeight));
						}
						if (color == null) {
							color = new Color(140, 17, 17);
						}
						try {
							if (Class_o.field_qm_1237 == null) {
								Class_o.field_qm_1237 = ObjectComposite.canvas.createImage(304, 34);
							}
							final Graphics graphics_190_ = Class_o.field_qm_1237.getGraphics();
							graphics_190_.setColor(color);
							graphics_190_.drawRect(0, 0, 303, 33);
							graphics_190_.fillRect(2, 2, 3 * i_189_, 30);
							graphics_190_.setColor(Color.black);
							graphics_190_.drawRect(1, 1, 301, 31);
							graphics_190_.fillRect((i_189_ * 3) + 2, 2, 300 - (3 * i_189_), 30);
							graphics_190_.setFont(Class_h.field_qz_1029);
							graphics_190_.setColor(Color.white);
							graphics_190_.drawString(string, (304 - SceneObject.field_bf_949.stringWidth(string)) / 2,
									22);
							graphics.drawImage(Class_o.field_qm_1237, ((-1236640339 * Boundary.clientWidth) / 2) - 152,
									((Projectile.clientHeight * -1483492575) / 2) - 18, null);
						} catch (final Exception exception) {
							final int i_191_ = (((-1236640339 * Boundary.clientWidth) / 2) - 152);
							final int i_192_ = ((Projectile.clientHeight * -1483492575) / 2) - 18;
							graphics.setColor(color);
							graphics.drawRect(i_191_, i_192_, 303, 33);
							graphics.fillRect(2 + i_191_, i_192_ + 2, i_189_ * 3, 30);
							graphics.setColor(Color.black);
							graphics.drawRect(1 + i_191_, i_192_ + 1, 301, 31);
							graphics.fillRect((3 * i_189_) + 2 + i_191_, i_192_ + 2, 300 - (i_189_ * 3), 30);
							graphics.setFont(Class_h.field_qz_1029);
							graphics.setColor(Color.white);
							graphics.drawString(string,
									i_191_ + ((304 - SceneObject.field_bf_949.stringWidth(string)) / 2), i_192_ + 22);
							break;
						}
						break;
					} catch (final Exception exception) {
						ObjectComposite.canvas.repaint();
						break;
					}
				} while (false);
			} else if ((status * 824045845) == 5) {
				Actor.renderLoginScreen(IdentityKit.b12Full, p11Full, Class_ay.p12Full, bool_187_);
			} else if (((status * 824045845) != 10) && ((824045845 * status) != 11)) {
				if ((824045845 * status) == 20) {
					Actor.renderLoginScreen(IdentityKit.b12Full, p11Full, Class_ay.p12Full, bool_187_);
				} else if ((status * 824045845) == 25) {
					if ((field_dl_2744 * -1726328617) == 1) {
						if ((1885996067 * field_dg_2740) > (1747201991 * field_do_2741)) {
							field_do_2741 = -1989885755 * field_dg_2740;
						}
						final int i_193_ = (((field_do_2741 * 1460753630) - (-189477162 * field_dg_2740))
								/ (1747201991 * field_do_2741));
						Class_l.method_aq_void(new StringBuilder(MenuText.LOADING_PLEASE_WAIT)
								.append(Class_d.field_f_860).append(Class_d.field_y_857).append(i_193_).append("%")
								.append(Class_d.field_e_855).toString(), false, 1852296769);
					} else if ((-1726328617 * field_dl_2744) == 2) {
						if ((-747402023 * field_dy_2742) > (field_di_2743 * -1261346973)) {
							field_di_2743 = field_dy_2742 * -1994175085;
						}
						final int i_194_ = ((((field_di_2743 * 1357160790) - (field_dy_2742 * 1284604514))
								/ (-1261346973 * field_di_2743)) + 50);
						Class_l.method_aq_void(new StringBuilder(MenuText.LOADING_PLEASE_WAIT)
								.append(Class_d.field_f_860).append(Class_d.field_y_857).append(i_194_).append("%")
								.append(Class_d.field_e_855).toString(), false, 1803775846);
					} else {
						Class_l.method_aq_void(MenuText.LOADING_PLEASE_WAIT, false, 847072399);
					}
				} else if ((status * 824045845) == 30) {
					Class_h.method_ah_void(-470721387);
				} else if ((824045845 * status) == 40) {
					Class_l.method_aq_void(new StringBuilder(MenuText.field_u_1859).append(Class_d.field_f_860)
							.append(MenuText.field_q_1846).toString(), false, 898299634);
				} else if ((status * 824045845) == 45) {
					Class_l.method_aq_void(MenuText.field_fk_1941, false, 1824978135);
				}
			} else {
				Actor.renderLoginScreen(IdentityKit.b12Full, p11Full, Class_ay.p12Full, bool_187_);
			}
			if (((status * 824045845) == 30) && ((-1787689871 * field_lv_2901) == 0) && !bool_187_) {
				try {
					final Graphics graphics = ObjectComposite.canvas.getGraphics();
					for (int i_195_ = 0; i_195_ < (field_lx_2892 * 998139771); i_195_++) {
						if (field_lt_2719[i_195_]) {
							Class_s.field_qj_1361.method_z_void(graphics, field_lw_2960[i_195_], field_lq_2898[i_195_],
									field_lc_2941[i_195_], field_le_2900[i_195_], 1505727884);
							field_lt_2719[i_195_] = false;
						}
					}
				} catch (final Exception exception) {
					ObjectComposite.canvas.repaint();
				}
			} else if ((824045845 * status) > 0) {
				try {
					final Graphics graphics = ObjectComposite.canvas.getGraphics();
					Class_s.field_qj_1361.drawGraphics(graphics, 0, 0, (byte) 1);
					for (int i_196_ = 0; i_196_ < (field_lx_2892 * 998139771); i_196_++) {
						field_lt_2719[i_196_] = false;
					}
				} catch (final Exception exception) {
					ObjectComposite.canvas.repaint();
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "client.m()");
		}
	}

	@Override
	protected final void method_a_void(final byte i) {
		try {
			if (field_b_2778 != null) {
				field_b_2778.field_n_1261 = false;
			}
			field_b_2778 = null;
			if (Class_cx.connection != null) {
				Class_cx.connection.close(-10940990);
				Class_cx.connection = null;
			}
			Class_d.method_d_void(-1002372719);
			if (MouseInputListener.instance != null) {
				final MouseInputListener class_ek = MouseInputListener.instance;
				synchronized (class_ek) {
					MouseInputListener.instance = null;
				}
			}
			FloorOverlay.field_ky_8 = null;
			if (Class_fq.field_nt_2444 != null) {
				Class_fq.field_nt_2444.method_t_void(-2136084371);
			}
			if (Class_de.field_nn_1594 != null) {
				Class_de.field_nn_1594.method_t_void(-2136084371);
			}
			if (Class_et.connection != null) {
				Class_et.connection.close(316082134);
			}
			final Object object = Class_ft.field_y_2498;
			synchronized (object) {
				if ((-1646797879 * Class_ft.field_z_2496) != 0) {
					Class_ft.field_z_2496 = -1759302023;
					try {
						Class_ft.field_y_2498.wait();
					} catch (final InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
			Class_cx.method_m_void(131613570);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "client.a()");
		}
	}

	void method_l_void(final int i) {
		try {
			if ((status * 824045845) != 1000) {
				final boolean bool = Class_bi.method_n_boolean(2034188018);
				if (!bool) {
					method_u_void((byte) -88);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "client.l()");
		}
	}

	void method_u_void(final byte i) {
		try {
			if ((Class_fq.field_b_2431 * -145352247) >= 4) {
				error("js5crc");
				status = -814424504;
			} else {
				if ((Class_fq.field_t_2451 * -163444075) >= 4) {
					if ((824045845 * status) <= 5) {
						error("js5io");
						status = -814424504;
						return;
					}
					field_ag_2709 = -522529336;
					Class_fq.field_t_2451 = -1078177225;
				}
				if ((((field_ag_2709 -= 881725775) * -1450023505) + 1) <= 0) {
					try {
						if ((797562323 * field_aj_2874) == 0) {
							Menu.field_ay_1542 = (SpotAnim.daemon.method_e_es(Script.currentWorldAddress,
									Friend.field_bc_1094 * 1192104921, 1904770124));
							field_aj_2874 += -70890917;
						}
						if ((field_aj_2874 * 797562323) == 1) {
							if ((Menu.field_ay_1542.field_e_2217) == 2) {
								method_q_void(-1, (short) -858);
								return;
							}
							if ((Menu.field_ay_1542.field_e_2217) == 1) {
								field_aj_2874 += -70890917;
							}
						}
						if ((797562323 * field_aj_2874) == 2) {
							Class_av.field_am_392 = new Socket(((java.net.Socket) (Menu.field_ay_1542.field_a_2213)),
									SpotAnim.daemon);
							final Buffer rsbytebuffer = new Buffer(5);
							rsbytebuffer.put(15);
							rsbytebuffer.putInt(83); // 83
							Class_av.field_am_392.put(rsbytebuffer.buffer, 0, 5, 93957415);
							field_aj_2874 += -70890917;
							Class_bw.field_ap_671 = (Renderable.getCurrentTime(1486007814) * 7041165572443151499L);
						}
						if ((797562323 * field_aj_2874) == 3) {
							if (((824045845 * status) > 5) && (Class_av.field_am_392.available((byte) -32) <= 0)) {
								if ((Renderable.getCurrentTime(1104145786)
										- (Class_bw.field_ap_671 * 1052771332561005347L)) > 30000L) {
									method_q_void(-2, (short) -31293);
									return;
								}
							} else {
								final int i_197_ = Class_av.field_am_392.read(-77263149);
								if (i_197_ != 0) {
									method_q_void(i_197_, (short) -6428);
									return;
								}
								field_aj_2874 += -70890917;
							}
						}
						if ((797562323 * field_aj_2874) == 4) {
							final Socket socket = Class_av.field_am_392;
							final boolean bool = (824045845 * status) > 20;
							if (Class_et.connection != null) {
								try {
									Class_et.connection.close(-1651094883);
								} catch (final Exception exception) {
									/* empty */
								}
								Class_et.connection = null;
							}
							Class_et.connection = socket;
							GroundItem.method_d_void(bool, 1608132909);
							Class_fq.js5Buffer.position = 0;
							Class_ev.field_k_2235 = null;
							Class_fq.field_r_2434 = null;
							Class_fq.field_j_2439 = 0;
							for (;;) {
								OnDemandNode class_ff = ((OnDemandNode) Class_fq.priorityRequests.method_y_ga());
								if (class_ff == null) {
									for (;;) {
										class_ff = (OnDemandNode) Class_fq.field_l_2440.method_y_ga();
										if (class_ff == null) {
											if (Class_fq.field_o_2449 != 0) {
												try {
													final Buffer rsbytebuffer = new Buffer(4);
													rsbytebuffer.put(4);
													rsbytebuffer.put(Class_fq.field_o_2449);
													rsbytebuffer.putShort(0);

													Class_et.connection.put((rsbytebuffer.buffer), 0, 4, 93957415);
												} catch (final IOException ioexception) {
													try {
														Class_et.connection.close(-1065198920);
													} catch (final Exception exception) {
														/* empty */
													}
													Class_fq.field_t_2451 += 1072263357;
													Class_et.connection = null;
												}
											}
											Class_fq.field_d_2433 = 0;
											Class_fq.field_z_2432 = ((Renderable.getCurrentTime(902934575))
													* 7406610225566820167L);
											Menu.field_ay_1542 = null;
											Class_av.field_am_392 = null;
											field_aj_2874 = 0;
											field_bz_2768 = 0;
											break;
										}
										Class_fq.field_m_2437.update(class_ff);
										Class_fq.field_a_2438.method_d_void(class_ff, class_ff.id);
										Class_fq.field_h_2448 += 879161649;
										Class_fq.delayedRequests -= 1578477811;
									}
									break;
								}
								Class_fq.field_y_2445.method_d_void(class_ff, class_ff.id);
								Class_fq.field_e_2456 += 1175813235;
								Class_fq.urgentRequests -= -275785585;
							}
						}
					} catch (final IOException ioexception) {
						method_q_void(-3, (short) -16789);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "client.u()");
		}
	}

	void method_q_void(final int i, final short i_198_) {
		try {
			Menu.field_ay_1542 = null;
			Class_av.field_am_392 = null;
			field_aj_2874 = 0;
			if ((Friend.field_bc_1094 * 1192104921) == (-593053895 * Class_cc.port)) {
				Friend.field_bc_1094 = -917597429 * Class_ae.field_bx_57;
			} else {
				Friend.field_bc_1094 = Class_cc.port * 1057325665;
			}
			field_bz_2768 += -88460619;
			if (((842050461 * field_bz_2768) >= 2) && ((i == 7) || (i == 9))) {
				if ((status * 824045845) <= 5) {
					error("js5connect_full");
					status = -814424504;
				} else {
					field_ag_2709 = -522529336;
				}
			} else if (((842050461 * field_bz_2768) >= 2) && (i == 6)) {
				error("js5connect_outofdate");
				status = -814424504;
			} else if ((field_bz_2768 * 842050461) >= 4) {
				if ((status * 824045845) <= 5) {
					error("js5connect");
					status = -814424504;
				} else {
					field_ag_2709 = -522529336;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "client.q()");
		}
	}

	static void method_co_void(final int i) {
		try {
			if (isOptionSelected) {
				final Widget widget = Class_ge.method_z_fy(-1782496813 * Class_cc.field_iw_779,
						-1524676247 * field_if_2843, (byte) -47);
				if ((widget != null) && (widget.field_cl_2634 != null)) {
					final Script class_n = new Script();
					class_n.parent = widget;
					class_n.parameters = widget.field_cl_2634;
					Menu.handleCS2Script(class_n, 200000);
				}
				isOptionSelected = false;
				Daemon.method_dn_void(widget, (byte) -25);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "client.co()");
		}
	}

	@SuppressWarnings("unused")
	@Override
	protected final void process() {
		try {
			currentCycle += -365169155;
			method_l_void(749039919);
			for (;;) {
				final NodeDeque deque = Class_ft.field_n_2495;
				Class_fk class_fk;
				synchronized (deque) {
					class_fk = (Class_fk) Class_ft.field_d_2497.method_e_ga();
				}
				if (class_fk == null) {
					Script.method_y_void(-94678407);
					Class_db.method_p_void(996785827);
					final KeyFocusListener class_dp = KeyFocusListener.instance;
					synchronized (class_dp) {
						KeyFocusListener.field_cg_1694 += -1999858871;
						KeyFocusListener.field_cd_1691 = KeyFocusListener.field_cp_1677 * -1784932443;
						KeyFocusListener.field_cm_1688 = 0;
						if ((KeyFocusListener.field_cv_1686 * -587710701) < 0) {
							for (int i_199_ = 0; i_199_ < 112; i_199_++) {
								KeyFocusListener.field_cn_1676[i_199_] = false;
							}
							KeyFocusListener.field_cv_1686 = KeyFocusListener.field_ca_1687 * -1006140889;
						} else {
							while ((KeyFocusListener.field_cv_1686 * -587710701) != (KeyFocusListener.field_ca_1687
									* -10599963)) {
								final int i_200_ = (KeyFocusListener.field_cc_1689[KeyFocusListener.field_ca_1687
										* -10599963]);
								KeyFocusListener.field_ca_1687 = (((-10599963 * KeyFocusListener.field_ca_1687) + 1)
										& 0x7f) * -1041951763;
								if (i_200_ < 0) {
									KeyFocusListener.field_cn_1676[i_200_ ^ 0xffffffff] = false;
								} else {
									if (!KeyFocusListener.field_cn_1676[i_200_] && ((KeyFocusListener.field_cm_1688
											* -108425419) < (KeyFocusListener.field_cy_1695.length - 1))) {
										KeyFocusListener.field_cy_1695[((KeyFocusListener.field_cm_1688 += -131757283)
												* -108425419) - 1] = i_200_;
									}
									KeyFocusListener.field_cn_1676[i_200_] = true;
								}
							}
						}
						KeyFocusListener.field_cp_1677 = KeyFocusListener.field_ci_1680 * -669804055;
					}
					Region.method_d_void((byte) -3);
					if (FloorOverlay.field_ky_8 != null) {
						final int i_201_ = FloorOverlay.field_ky_8.method_y_int();
						field_kg_2887 = 858603927 * i_201_;
					}
					if ((status * 824045845) == 0) {
						Script.handleClientState();
						Class_cw.method_rn_void(-868282151);
					} else if ((824045845 * status) == 5) {
						SceneObject.method_z_void(this, 1723626087);
						Script.handleClientState();
						Class_cp.timer.reset();
						for (int i_202_ = 0; i_202_ < 32; i_202_++) {
							field_qo_2131[i_202_] = 0L;
						}
						for (int i_203_ = 0; i_203_ < 32; i_203_++) {
							field_qh_2140[i_203_] = 0L;
						}
						SceneObject.field_pf_950 = 0;
					} else if (((824045845 * status) != 10) && ((824045845 * status) != 11)) {
						if ((status * 824045845) == 20) {
							SceneObject.method_z_void(this, -242612091);
							Boundary.method_r_void((byte) -40);
						} else if ((status * 824045845) == 25) {
							Class_o.method_bd_void((byte) 1);
						}
					} else {
						SceneObject.method_z_void(this, -822775475);
					}
					if ((824045845 * status) == 30) {
						if ((field_ax_2703 * 1027594079) > 1) {
							field_ax_2703 -= -1503902561;
						}
						if ((field_cv_2733 * -874319047) > 0) {
							field_cv_2733 -= -14546167;
						}
						if (field_cm_2737) {
							field_cm_2737 = false;
							if ((field_cv_2733 * -874319047) > 0) {
								AbstractBuffer.closeSession();
							} else {
								Socket.method_h_void(40, -1312672078);
								WidgetNode.field_cq_796 = Class_cx.connection;
								Class_cx.connection = null;
							}
						} else {
							if (!isMenuOpen) {
								menuActions[0] = MenuText.CANCEL;
								menuOptions[0] = "";
								field_ik_2832[0] = 1006;
								currentMenuSize = -1850638419;
							}
							for (int packet = 0; (packet < 100) && parsePacket(); packet++) {

							}
							if ((824045845 * status) == 30) {
								while (Varp.method_d_boolean((byte) 1)) {
									encryptedBuffer.writeOpcode(246);
									encryptedBuffer.put(0);
									final int i_205_ = (-1485345105 * encryptedBuffer.position);
									Class_ev.method_z_void(encryptedBuffer, (short) -82);
									encryptedBuffer.putByteAt((encryptedBuffer.position * -1485345105) - i_205_,
											(byte) -22);
								}
								final Object object = field_b_2778.field_d_1254;
								synchronized (object) {
									if (field_z_2685) {
										if (((1159182273 * MouseInputListener.field_q_2162) != 0)
												|| (((field_b_2778.field_z_1255) * 1219764211) >= 40)) {
											// encryptedBuffer.writeOpcode(118);
											// encryptedBuffer.put(0);
											final int i_206_ = (encryptedBuffer.position * -1485345105);
											int i_207_ = 0;
											for (int i_208_ = 0; ((i_208_ < (1219764211 * (field_b_2778.field_z_1255)))
													&& ((((encryptedBuffer.position) * -1485345105)
															- i_206_) < 240)); i_208_++) {
												i_207_++;
												int i_209_ = (field_b_2778.field_e_1257[i_208_]);
												if (i_209_ < 0) {
													i_209_ = 0;
												} else if (i_209_ > 502) {
													i_209_ = 502;
												}
												int i_210_ = (field_b_2778.field_y_1259[i_208_]);
												if (i_210_ < 0) {
													i_210_ = 0;
												} else if (i_210_ > 764) {
													i_210_ = 764;
												}
												int i_211_ = (765 * i_209_) + i_210_;
												if (((field_b_2778.field_e_1257[i_208_]) == -1)
														&& ((field_b_2778.field_y_1259[i_208_]) == -1)) {
													i_210_ = -1;
													i_209_ = -1;
													i_211_ = 524287;
												}
												if (((11619085 * field_t_2698) == i_210_)
														&& (i_209_ == (-1047022337 * field_i_2720))) {
													if ((field_ad_2700 * 1276794535) < 2047) {
														field_ad_2700 += -1839599337;
													}
												} else {
													int i_212_ = (i_210_ - (11619085 * field_t_2698));
													field_t_2698 = 1107983301 * i_210_;
													int i_213_ = (i_209_ - (-1047022337 * field_i_2720));
													field_i_2720 = i_209_ * 728713983;
													if (((field_ad_2700 * 1276794535) < 8) && (i_212_ >= -32)
															&& (i_212_ <= 31) && (i_213_ >= -32) && (i_213_ <= 31)) {
														i_212_ += 32;
														i_213_ += 32;
														// encryptedBuffer.putShort((i_213_
														// + (i_212_ << 6) +
														// ((field_ad_2700 *
														// 1276794535) << 12)));
														field_ad_2700 = 0;
													} else if ((field_ad_2700 * 1276794535) < 8) {
														// encryptedBuffer.putMedium((8388608
														// + ((1276794535 *
														// field_ad_2700) << 19)
														// + i_211_),
														// 1835278567);
														field_ad_2700 = 0;
													} else {
														// encryptedBuffer.putInt((i_211_
														// + -1073741824 +
														// ((field_ad_2700 *
														// 1276794535) << 19)));
														field_ad_2700 = 0;
													}
												}
											}
											// encryptedBuffer.putByteAt(((-1485345105
											// * (encryptedBuffer.position)) -
											// i_206_), (byte) -6);
											if (i_207_ >= ((field_b_2778.field_z_1255) * 1219764211)) {
												field_b_2778.field_z_1255 = 0;
											} else {
												field_b_2778.field_z_1255 -= i_207_ * -1559457477;
												for (int i_214_ = 0; (i_214_ < (1219764211
														* (field_b_2778.field_z_1255))); i_214_++) {
													field_b_2778.field_y_1259[i_214_] = (field_b_2778.field_y_1259[i_214_
															+ i_207_]);
													field_b_2778.field_e_1257[i_214_] = (field_b_2778.field_e_1257[i_207_
															+ i_214_]);
												}
											}
										}
									} else {
										field_b_2778.field_z_1255 = 0;
									}
								}
								if (((1159182273 * MouseInputListener.field_q_2162) == 1)
										|| (!Class_al.field_aw_178
												&& ((MouseInputListener.field_q_2162 * 1159182273) == 4))
										|| ((MouseInputListener.field_q_2162 * 1159182273) == 2)) {
									long l = (((MouseInputListener.field_r_2151 * 3763232195432349079L)
											- (field_o_2696 * -320794609077275315L)) / 50L);
									if (l > 4095L) {
										l = 4095L;
									}
									field_o_2696 = (MouseInputListener.field_r_2151 * 1374957111361125491L);
									int i_215_ = MouseInputListener.field_x_2158 * 1750309931;
									if (i_215_ < 0) {
										i_215_ = 0;
									} else if (i_215_ > (-1483492575 * Projectile.clientHeight)) {
										i_215_ = (Projectile.clientHeight * -1483492575);
									}
									int i_216_ = 2117517719 * MouseInputListener.field_k_2164;
									if (i_216_ < 0) {
										i_216_ = 0;
									} else if (i_216_ > (-1236640339 * (Boundary.clientWidth))) {
										i_216_ = (Boundary.clientWidth * -1236640339);
									}
									final int i_217_ = (int) l;
									encryptedBuffer.writeOpcode(89);
									encryptedBuffer
											.putShort((((MouseInputListener.field_q_2162 * 1159182273) == 2) ? 1 : 0)
													+ (i_217_ << 1));
									encryptedBuffer.putShort(i_216_);
									encryptedBuffer.putShort(i_215_);
								}
								if ((KeyFocusListener.field_cm_1688 * -108425419) > 0) {
									encryptedBuffer.writeOpcode(83);
									encryptedBuffer.putShort(0);
									final int i_218_ = (encryptedBuffer.position * -1485345105);
									final long l = Renderable.getCurrentTime(-497399717);
									for (int i_219_ = 0; i_219_ < (KeyFocusListener.field_cm_1688
											* -108425419); i_219_++) {
										long l_220_ = l - (2070005315929286617L * field_md_2728);
										if (l_220_ > 16777215L) {
											l_220_ = 16777215L;
										}
										field_md_2728 = l * -6369859318950303639L;
										encryptedBuffer.method_br_void((int) l_220_, 233788621);
										encryptedBuffer.put(KeyFocusListener.field_cy_1695[i_219_]);
									}
									encryptedBuffer.writeShortAt((encryptedBuffer.position * -1485345105) - i_218_,
											155054767);
								}
								if ((-681061567 * field_fh_2775) > 0) {
									field_fh_2775 -= 873905345;
								}
								if (KeyFocusListener.field_cn_1676[96] || KeyFocusListener.field_cn_1676[97]
										|| KeyFocusListener.field_cn_1676[98] || KeyFocusListener.field_cn_1676[99]) {
									field_fe_2776 = true;
								}
								if (field_fe_2776 && ((field_fh_2775 * -681061567) <= 0)) {
									field_fh_2775 = 298237716;
									field_fe_2776 = false;
									encryptedBuffer.writeOpcode(88);
									encryptedBuffer.putShort(-2037472027 * miniMapAngle);
									encryptedBuffer.putLEShortA((field_ft_2707 * 212686301), 255484697);
								}
								if (Class_gf.field_rd_2987 && !clientFocused) {
									clientFocused = true;
									encryptedBuffer.writeOpcode(106);
									encryptedBuffer.put(1);
								}
								if (!Class_gf.field_rd_2987 && clientFocused) {
									clientFocused = false;
									encryptedBuffer.writeOpcode(106);
									encryptedBuffer.put(0);
								}
								if (field_u_2784 && ((field_cs_2739 * 544143533) != (250114511 * Class_ed.plane))) {
									Class_ae.method_ba_void(-248192841 * SpotAnim.regionX, Region.regionY * -1598931295,
											Class_ed.plane * 250114511, (Class_ci.myPlayer.walkQueueX[0]),
											(Class_ci.myPlayer.walkQueueY[0]), -1817073127);
								} else if ((field_ml_2809 * -275824745) != (250114511 * Class_ed.plane)) {
									field_ml_2809 = -259447159 * Class_ed.plane;
									Class_l.method_bn_void((Class_ed.plane * 250114511), -1059294280);
								}
								if ((status * 824045845) == 30) {
									for (Class_r class_r = ((Class_r) field_hv_2821
											.method_f_ga()); class_r != null; class_r = ((Class_r) field_hv_2821
													.method_a_ga())) {
										if ((-621780465 * (class_r.field_u_1335)) > 0) {
											class_r.field_u_1335 -= 336088303;
										}
										if ((class_r.field_u_1335 * -621780465) == 0) {
											if ((1701791221 * (class_r.field_z_1328)) >= 0) {
												final int id = ((class_r.field_z_1328) * 1701791221);
												int i_222_ = (-201033313 * (class_r.field_f_1332));
												final ObjectComposite objectdef = (Class_cj.getObjectComposite(id));
												if (i_222_ == 11) {
													i_222_ = 10;
												}
												if ((i_222_ >= 5) && (i_222_ <= 8)) {
													i_222_ = 4;
												}
												final boolean bool = (objectdef.method_g_boolean(i_222_, 1862363353));
												if (!bool) {
													continue;
												}
											}
											Class_l.method_by_void((class_r.plane) * -227080595,
													(class_r.field_d_1325) * 1901552375,
													(class_r.field_y_1326) * -201892019,
													(class_r.field_e_1327) * -2129494015,
													(class_r.field_z_1328) * 1701791221,
													(807625101 * (class_r.field_g_1329)),
													(-201033313 * (class_r.field_f_1332)), (byte) -39);
											class_r.removeLink();
										} else {
											if (((class_r.field_l_1334) * 440917563) > 0) {
												class_r.field_l_1334 -= 384912115;
											}
											if ((((class_r.field_l_1334) * 440917563) == 0)
													&& ((-201892019 * (class_r.field_y_1326)) >= 1)
													&& ((-2129494015 * (class_r.field_e_1327)) >= 1)
													&& (((class_r.field_y_1326) * -201892019) <= 102)
													&& ((-2129494015 * (class_r.field_e_1327)) <= 102)) {
												if (((class_r.field_m_1331) * 1278552913) >= 0) {
													final int i_223_ = ((class_r.field_m_1331) * 1278552913);
													int i_224_ = (-460643835 * (class_r.field_h_1324));
													final ObjectComposite objectdef = (Class_cj
															.getObjectComposite(i_223_));
													if (i_224_ == 11) {
														i_224_ = 10;
													}
													if ((i_224_ >= 5) && (i_224_ <= 8)) {
														i_224_ = 4;
													}
													final boolean bool = (objectdef.method_g_boolean(i_224_,
															1862363353));
													if (!bool) {
														continue;
													}
												}
												Class_l.method_by_void((-227080595 * (class_r.plane)),
														(1901552375 * (class_r.field_d_1325)),
														((class_r.field_y_1326) * -201892019),
														(-2129494015 * (class_r.field_e_1327)),
														((class_r.field_m_1331) * 1278552913),
														((class_r.field_a_1337) * 1459182841),
														((class_r.field_h_1324) * -460643835), (byte) -113);
												class_r.field_l_1334 = -384912115;
												if ((((class_r.field_z_1328) * 1701791221) == (1278552913
														* (class_r.field_m_1331)))
														&& (((class_r.field_z_1328) * 1701791221) == -1)) {
													class_r.removeLink();
												} else if ((((class_r.field_m_1331) * 1278552913) == (1701791221
														* (class_r.field_z_1328)))
														&& ((1459182841
																* (class_r.field_a_1337)) == ((class_r.field_g_1329)
																		* 807625101))
														&& ((-460643835 * (class_r.field_h_1324)) == (-201033313
																* (class_r.field_f_1332)))) {
													class_r.removeLink();
												}
											}
										}
									}
									for (int i_225_ = 0; i_225_ < (-1735289853 * field_nb_2931); i_225_++) {
										field_nj_2967[i_225_]--;
										if (field_nj_2967[i_225_] < -10) {
											field_nb_2931 -= -405227861;
											for (int i_226_ = i_225_; i_226_ < (field_nb_2931
													* -1735289853); i_226_++) {
												field_nq_2932[i_226_] = (field_nq_2932[i_226_ + 1]);
												field_no_2936[i_226_] = (field_no_2936[i_226_ + 1]);
												field_nx_2933[i_226_] = (field_nx_2933[1 + i_226_]);
												field_nj_2967[i_226_] = (field_nj_2967[1 + i_226_]);
												field_nu_2935[i_226_] = (field_nu_2935[i_226_ + 1]);
											}
											i_225_--;
										} else {
											Class_bo class_bo = field_no_2936[i_225_];
											if (class_bo == null) {
												class_bo = (Class_bo.method_n_bo(Class_dw.soundFXIndex1,
														field_nq_2932[i_225_], 0));
												if (class_bo == null) {
													continue;
												}
												field_nj_2967[i_225_] += class_bo.method_z_int();
												field_no_2936[i_225_] = class_bo;
											}
											if (field_nj_2967[i_225_] < 0) {
												int i_228_;
												if (field_nu_2935[i_225_] != 0) {
													final int i_229_ = (((field_nu_2935[i_225_]) & 0xff) * 128);
													final int i_230_ = (((field_nu_2935[i_225_]) >> 16) & 0xff);
													int i_231_ = ((64 + (i_230_ * 128))
															- (-2103184911 * ((Class_ci.myPlayer).worldPosX)));
													if (i_231_ < 0) {
														i_231_ = -i_231_;
													}
													final int i_232_ = (((field_nu_2935[i_225_]) >> 8) & 0xff);
													int i_233_ = ((64 + (128 * i_232_))
															- (2088773389 * ((Class_ci.myPlayer).worldPosY)));
													if (i_233_ < 0) {
														i_233_ = -i_233_;
													}
													int i_234_ = ((i_233_ + i_231_) - 128);
													if (i_234_ > i_229_) {
														field_nj_2967[i_225_] = -100;
														continue;
													}
													if (i_234_ < 0) {
														i_234_ = 0;
													}
													i_228_ = (((i_229_ - i_234_) * -630818465 * field_nm_2918)
															/ i_229_);
												} else {
													i_228_ = (field_ng_2929 * 1804964747);
												}
												if (i_228_ > 0) {
													final Class_ba class_ba = (class_bo.method_d_ba()
															.method_n_ba(Class_v.field_ny_1445));
													final Class_bd class_bd = (Class_bd.method_z_bd(class_ba, 100,
															i_228_));
													class_bd.method_h_void(field_nx_2933[i_225_] - 1);
													Class_bg.field_na_553.method_n_void(class_bd);
												}
												field_nj_2967[i_225_] = -100;
											}
										}
									}
									if (field_np_2928) {
										boolean bool;
										if ((-858508631 * Class_fa.field_e_2278) != 0) {
											bool = true;
										} else {
											bool = (Class_fa.field_y_2276.method_q_boolean(-2147483641));
										}
										if (!bool) {
											if (((field_ne_2926 * 1614344149) != 0)
													&& ((1897970477 * field_nh_2927) != -1)) {
												Index.method_d_void(World.musicIndex1, (1897970477 * field_nh_2927), 0,
														(field_ne_2926 * 1614344149), false, 824045845);
											}
											field_np_2928 = false;
										}
									}
									field_cc_2731 += 827457061;
									if ((field_cc_2731 * 526642605) > 750) {
										if ((field_cv_2733 * -874319047) > 0) {
											AbstractBuffer.closeSession();
										} else {
											Socket.method_h_void(40, -1248836867);
											WidgetNode.field_cq_796 = Class_cx.connection;
											Class_cx.connection = null;
										}
									} else {
										for (int i_235_ = -1; (i_235_ < (localPlayerCount * 2000365659)); i_235_++) {
											int i_236_;
											if (i_235_ == -1) {
												i_236_ = 2047;
											} else {
												i_236_ = playerIndexArray[i_235_];
											}
											final Player player = localPlayers[i_236_];
											if (player != null) {
												Class_cp.method_ax_void(player, 1, (byte) -14);
											}
										}
										Class_cw.method_ae_void(-375081050);
										Class_ei.method_w_void((byte) 28);
										field_ej_2761 += -584756857;
										if ((-521735249 * field_gv_2795) != 0) {
											field_gi_2856 += 1830237100;
											if ((field_gi_2856 * 497183439) >= 400) {
												field_gv_2795 = 0;
											}
										}
										if (Class_cr.field_gw_1242 != null) {
											field_gq_2796 += 458565975;
											if ((-421146009 * field_gq_2796) >= 15) {
												Daemon.method_dn_void(Class_cr.field_gw_1242, (byte) 26);
												Class_cr.field_gw_1242 = null;
											}
										}
										final Widget widget = (Menu.field_im_1543);
										final Widget widget_237_ = GameObject.field_ir_1414;
										Menu.field_im_1543 = null;
										GameObject.field_ir_1414 = null;
										field_jp_2827 = null;
										field_jc_2868 = false;
										field_ji_2766 = false;
										field_mg_2912 = 0;
										while (Class_dd.method_z_boolean(14870222)
												&& ((-853560137 * field_mg_2912) < 128)) {
											if (((-1069253877 * myPermissions) >= 2)
													&& KeyFocusListener.field_cn_1676[82]
													&& ((221079961 * Class_al.field_ce_179) == 66)) {
												final String string = (MillisecondTimer.method_f_String((byte) 21));
												GameMessage.field_pl_303.setContents((new StringSelection(string)),
														null);
											} else {
												field_mc_2914[(field_mg_2912 * -853560137)] = (221079961
														* (Class_al.field_ce_179));
												field_ma_2913[(field_mg_2912 * -853560137)] = Bindable.field_cf_1703;
												field_mg_2912 += -267032313;
											}
										}
										final int i_238_ = rootInterfaceId * -374264803;
										final int i_239_ = (-1236640339 * Boundary.clientWidth);
										final int i_240_ = (Projectile.clientHeight * -1483492575);
										if (Class_fz.loadWidget(i_238_, -525854068)) {
											Friend.method_dy_void(Widget.widgets[i_238_], -1, 0, 0, i_239_, i_240_, 0,
													0, -723764309);
										}
										field_kj_2850 += 2025329793;
										for (;;) {
											Script class_n = (Script) field_kf_2889.method_e_ga();
											if (class_n == null) {
												for (;;) {
													class_n = ((Script) field_kr_2807.method_e_ga());
													if (class_n == null) {
														for (;;) {
															class_n = ((Script) (field_kp_2888.method_e_ga()));
															if (class_n == null) {
																Class_a.method_cj_void((byte) 0);
																if (field_jt_2801 != null) {
																	Varp.method_dq_void((byte) -14);
																}
																if ((Class_a.field_gz_794) != null) {
																	Daemon.method_dn_void((Class_a.field_gz_794),
																			(byte) 35);
																	field_gy_2803 += -1657646083;
																	if (((MouseInputListener.field_f_2155)
																			* 2143958423) == 0) {
																		if (field_ga_2802) {
																			if ((Class_a.field_gz_794 == Class_fn.field_gd_2411)
																					&& ((-1138033625
																							* field_gb_2798) != (801088777
																									* field_gc_2944))) {
																				final Widget widget_241_ = Class_a.field_gz_794;
																				int i_242_ = 0;
																				if (((-1583483801 * field_ju_2697) == 1)
																						&& ((widget_241_.contentType
																								* -1489583413) == 206)) {
																					i_242_ = 1;
																				}
																				if (widget_241_.itemIds[801088777
																						* field_gc_2944] <= 0) {
																					i_242_ = 0;
																				}
																				if (Class_cj.method_g_boolean(
																						Class_db.method_en_int(
																								widget_241_,
																								-1295607331),
																						(byte) 5)) {
																					final int i_243_ = field_gb_2798
																							* -1138033625;
																					final int i_244_ = 801088777
																							* field_gc_2944;
																					widget_241_.itemIds[i_244_] = widget_241_.itemIds[i_243_];
																					widget_241_.itemAmts[i_244_] = widget_241_.itemAmts[i_243_];
																					widget_241_.itemIds[i_243_] = -1;
																					widget_241_.itemAmts[i_243_] = 0;
																				} else if (i_242_ == 1) {
																					int i_245_ = field_gb_2798
																							* -1138033625;
																					final int i_246_ = 801088777
																							* field_gc_2944;
																					while (i_245_ != i_246_) {
																						if (i_245_ > i_246_) {
																							widget_241_.method_h_void(
																									i_245_ - 1, i_245_,
																									1879670807);
																							i_245_--;
																						} else if (i_245_ < i_246_) {
																							widget_241_.method_h_void(
																									1 + i_245_, i_245_,
																									1839826938);
																							i_245_++;
																						}
																					}
																				} else {
																					widget_241_.method_h_void(
																							801088777 * field_gc_2944,
																							field_gb_2798 * -1138033625,
																							1786884459);
																				}
																				encryptedBuffer.writeOpcode(6);
																				encryptedBuffer.putShortA(
																						field_gb_2798 * -1138033625,
																						(byte) -49);
																				encryptedBuffer.putShort(
																						field_gc_2944 * 801088777);
																				encryptedBuffer.putByteA(i_242_);
																				encryptedBuffer.putInt1(
																						-560181405
																								* Class_a.field_gz_794.uid,
																						-111119079);
																			}
																		} else if ((((field_hs_2855 * -367274921) == 1)
																				|| Class_fk.method_ct_boolean(
																						(-224642011 * currentMenuSize)
																								- 1,
																						(byte) -55))
																				&& ((currentMenuSize
																						* -224642011) > 2)) {
																			Class_ed.method_cb_void(
																					1510902421 * field_gu_2799,
																					-1214524079 * field_gm_2800,
																					(byte) 1);
																		} else if ((currentMenuSize * -224642011) > 0) {
																			ZipInflater.method_dc_void(
																					field_gu_2799 * 1510902421,
																					field_gm_2800 * -1214524079,
																					1004282298);
																		}
																		field_gq_2796 = 290692454;
																		MouseInputListener.field_q_2162 = 0;
																		Class_a.field_gz_794 = null;
																	} else if (((-1831296683 * field_gy_2803) >= 5)// 5
																													// ->
																													// 10
																			&& (((1515107729
																					* MouseInputListener.field_m_2156) > (5
																							+ (1510902421
																									* field_gu_2799)))
																					|| ((MouseInputListener.field_m_2156
																							* 1515107729) < ((1510902421
																									* field_gu_2799)
																									- 5))
																					|| ((MouseInputListener.field_a_2157
																							* -2089478689) > (5
																									+ (-1214524079
																											* field_gm_2800)))
																					|| ((-2089478689
																							* MouseInputListener.field_a_2157) < ((field_gm_2800
																									* -1214524079)
																									- 5)))) {
																		field_ga_2802 = true;
																	}
																}
																if ((SceneGraph.field_ac_1283) != -1) {
																	final int i_247_ = (SceneGraph.field_ac_1283);
																	final int i_248_ = (SceneGraph.field_az_1298);
																	encryptedBuffer.writeOpcode(177);
																	encryptedBuffer.put(5);
																	encryptedBuffer.putShort((i_248_
																			+ (Class_gf.originY * -1593604783)));
																	encryptedBuffer.putLEShortA(
																			(((Class_q.originX) * 1693061403) + i_247_),
																			-1796750464);
																	encryptedBuffer.putByteA(
																			((KeyFocusListener.field_cn_1676[82])
																					? (KeyFocusListener.field_cn_1676[81]
																							? 2 : 1)
																					: 0));
																	SceneGraph.field_ac_1283 = -1;
																	field_go_2792 = ((MouseInputListener.field_k_2164)
																			* -212245807);
																	field_gj_2793 = ((MouseInputListener.field_x_2158)
																			* 418013239);
																	field_gv_2795 = -515095729;
																	field_gi_2856 = 0;
																	field_mk_2923 = (i_247_ * -652317981);
																	field_mn_2924 = (-1028068353 * i_248_);
																}
																if ((Menu.field_im_1543) != widget) {
																	if (widget != null) {
																		Daemon.method_dn_void(widget, (byte) -30);
																	}
																	if ((Menu.field_im_1543) != null) {
																		Daemon.method_dn_void(Menu.field_im_1543,
																				(byte) -45);
																	}
																}
																if (((GameObject.field_ir_1414) != widget_237_)
																		&& ((field_ia_2839
																				* 584133131) == (field_ii_2838
																						* -1231548557))) {
																	if (widget_237_ != null) {
																		Daemon.method_dn_void(widget_237_, (byte) -3);
																	}
																	if ((GameObject.field_ir_1414) != null) {
																		Daemon.method_dn_void(GameObject.field_ir_1414,
																				(byte) -41);
																	}
																}
																if ((GameObject.field_ir_1414) != null) {
																	if ((field_ii_2838 * -1231548557) < (field_ia_2839
																			* 584133131)) {
																		field_ii_2838 += -627790405;
																		if ((-1231548557 * field_ii_2838) == (584133131
																				* field_ia_2839)) {
																			Daemon.method_dn_void(
																					GameObject.field_ir_1414,
																					(byte) -4);
																		}
																	}
																} else if ((field_ii_2838 * -1231548557) > 0) {
																	field_ii_2838 -= -627790405;
																}
																Class_i.method_ak_void(1608193619);
																if (field_nf_2937) {
																	VarpBit.method_ad_void(2109617611);
																}
																for (int i_249_ = 0; (i_249_ < 5); i_249_++) {
																	field_ok_2907[i_249_]++;
																}
																final int i_250_ = (Class_df.method_z_int(1718843244));
																final int i_251_ = (1048628985
																		* (KeyFocusListener.field_cg_1694));
																if ((i_250_ > 15000) && (i_251_ > 15000)) {
																	field_cv_2733 = 658425546;
																	MouseInputListener.field_d_2150 = 936417468;
																	encryptedBuffer.writeOpcode(95);
																}
																field_dv_2794 += -1343819351;
																if ((-221494631 * field_dv_2794) > 500) {
																	field_dv_2794 = 0;
																	final int i_252_ = (int) (Math.random() * 8.0);
																	if ((i_252_ & 0x1) == 1) {
																		field_dz_2755 += field_dh_2750 * 1456891505;
																	}
																	if ((i_252_ & 0x2) == 2) {
																		field_du_2751 += 445736909 * field_de_2752;
																	}
																	if ((i_252_ & 0x4) == 4) {
																		field_dx_2753 += field_dp_2754 * -864090035;
																	}
																}
																if ((field_dz_2755 * -390279249) < -50) {
																	field_dh_2750 = -1907944578;
																}
																if ((field_dz_2755 * -390279249) > 50) {
																	field_dh_2750 = 1907944578;
																}
																if ((-1641779 * field_du_2751) < -55) {
																	field_de_2752 = 278234674;
																}
																if ((-1641779 * field_du_2751) > 55) {
																	field_de_2752 = -278234674;
																}
																if ((field_dx_2753 * 1993754481) < -40) {
																	field_dp_2754 = -748341163;
																}
																if ((field_dx_2753 * 1993754481) > 40) {
																	field_dp_2754 = 748341163;
																}
																field_em_2760 += 637580993;
																if ((552130881 * field_em_2760) > 500) {
																	field_em_2760 = 0;
																	final int i_253_ = (int) (Math.random() * 8.0);
																	if ((i_253_ & 0x1) == 1) {
																		miniMapOffset += 577485047 * field_ek_2757;
																	}
																	if ((i_253_ & 0x2) == 2) {
																		miniMapScale += -262510449 * field_en_2791;
																	}
																}
																if ((miniMapOffset * 1814938795) < -60) {
																	field_ek_2757 = 388327594;
																}
																if ((1814938795 * miniMapOffset) > 60) {
																	field_ek_2757 = -388327594;
																}
																if ((miniMapScale * -1606807399) < -20) {
																	field_en_2791 = 1060994119;
																}
																if ((miniMapScale * -1606807399) > 10) {
																	field_en_2791 = -1060994119;
																}
																for (FriendWidget friendWidget = ((FriendWidget) friendsListWidgets
																		.method_d_gc()); (friendWidget != null); friendWidget = ((FriendWidget) friendsListWidgets
																				.method_z_gc())) {
																	if (1266375527
																			* friendWidget.field_n_34 < ((Renderable
																					.getCurrentTime(552112061) / 1000L)
																					- 5L)) {
																		if (friendWidget.worldStatus > 0) {
																			GameStub.sendMessage(5, "",
																					new StringBuilder(
																							friendWidget.username)
																									.append(MenuText.FRIEND_LOGGED_IN)
																									.toString());
																		}
																		if (friendWidget.worldStatus == 0) {
																			GameStub.sendMessage(5, "",
																					new StringBuilder(
																							friendWidget.username)
																									.append(MenuText.FRIEND_LOGGED_OUT)
																									.toString());
																		}
																		friendWidget.update();
																	}
																}
																field_ca_2726 += -365264899;
																if ((2068763989 * field_ca_2726) > 50) {
																	encryptedBuffer.writeOpcode(132);
																}
																do {
																	try {
																		if ((Class_cx.connection == null)
																				|| ((encryptedBuffer.position
																						* -1485345105) <= 0)) {
																			break;
																		}
																		Class_cx.connection.put(encryptedBuffer.buffer,
																				0,
																				encryptedBuffer.position * -1485345105,
																				93957415);
																		encryptedBuffer.position = 0;
																		field_ca_2726 = 0;
																	} catch (final IOException ioexception) {
																		if ((-874319047 * field_cv_2733) > 0) {
																			AbstractBuffer.closeSession();
																		} else {
																			Socket.method_h_void(40, -2072609229);
																			WidgetNode.field_cq_796 = Class_cx.connection;
																			Class_cx.connection = null;
																		}
																	}
																	break;
																} while (false);
																break;
															}
															final Widget widget_254_ = (class_n.parent);
															if ((-2038048459 * (widget_254_.field_k_2544)) >= 0) {
																final Widget widget_255_ = (Class_en.getWidgetByUID(
																		(-1405313417 * (widget_254_.parentId)),
																		(short) 17221));
																if ((widget_255_ == null)
																		|| ((widget_255_.components) == null)
																		|| (((widget_254_.field_k_2544)
																				* -2038048459) >= (widget_255_.components).length)
																		|| (widget_254_ != (widget_255_.components[-2038048459
																				* widget_254_.field_k_2544]))) {
																	continue;
																}
															}
															Menu.handleCS2Script(class_n, 200000);
														}
														break;
													}
													final Widget widget_256_ = (class_n.parent);
													if (((widget_256_.field_k_2544) * -2038048459) >= 0) {
														final Widget widget_257_ = (Class_en.getWidgetByUID(
																(-1405313417 * (widget_256_.parentId)), (short) 8649));
														if ((widget_257_ == null) || ((widget_257_.components) == null)
																|| ((-2038048459
																		* (widget_256_.field_k_2544)) >= (widget_257_.components).length)
																|| (widget_256_ != (widget_257_.components[((widget_256_.field_k_2544)
																		* -2038048459)]))) {
															continue;
														}
													}
													Menu.handleCS2Script(class_n, 200000);
												}
												break;
											}
											final Widget widget_258_ = (class_n.parent);
											if ((widget_258_.field_k_2544 * -2038048459) >= 0) {
												final Widget widget_259_ = (Class_en.getWidgetByUID(
														(widget_258_.parentId * -1405313417), (short) 23366));
												if ((widget_259_ == null) || (widget_259_.components == null)
														|| (((widget_258_.field_k_2544)
																* -2038048459) >= (widget_259_.components).length)
														|| ((widget_259_.components[((widget_258_.field_k_2544)
																* -2038048459)]) != widget_258_)) {
													continue;
												}
											}
											Menu.handleCS2Script(class_n, 200000);
										}
									}
								}
							}
						}
					} else if (((status * 824045845) == 40) || ((824045845 * status) == 45)) {
						Boundary.method_r_void((byte) -11);
					}
					break;
				}
				class_fk.field_y_2386.method_cm_void(class_fk.field_z_2383, (int) class_fk.id, class_fk.field_d_2384,
						false, -1759706490);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "client.f()");
		}
	}

	static final void method_e_void(final int i) {
		try {
			SceneGraph.field_n_1320 = false;
			field_u_2784 = false;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "client.e()");
		}
	}

	static final void method_db_void(final Menu interfacepositionnode, final boolean bool) {
		try {
			final int i_260_ = (interfacepositionnode.interfaceId * 44103667);
			final int i_261_ = (int) interfacepositionnode.id;
			interfacepositionnode.removeLink();
			if (bool) {
				Class_ev.method_e_void(i_260_, -1031879225);
			}
			for (WidgetOptionNode widgetoptionmasknode = ((WidgetOptionNode) widgetOptionTable
					.method_y_ga()); widgetoptionmasknode != null; widgetoptionmasknode = ((WidgetOptionNode) widgetOptionTable
							.method_e_ga())) {
				if (((widgetoptionmasknode.id >> 48) & 0xffffL) == i_260_) {
					widgetoptionmasknode.removeLink();
				}
			}
			final Widget widget = Class_en.getWidgetByUID(i_261_, (short) 8649);
			if (widget != null) {
				Daemon.method_dn_void(widget, (byte) 26);
			}
			for (int i_262_ = 0; i_262_ < (-224642011 * currentMenuSize); i_262_++) {
				if (Class_cc.method_ca_boolean(field_ik_2832[i_262_], (byte) 0)) {
					if (i_262_ < ((currentMenuSize * -224642011) - 1)) {
						for (int i_263_ = i_262_; i_263_ < ((currentMenuSize * -224642011) - 1); i_263_++) {
							menuActions[i_263_] = menuActions[1 + i_263_];
							menuOptions[i_263_] = menuOptions[1 + i_263_];
							field_ik_2832[i_263_] = field_ik_2832[1 + i_263_];
							field_il_2833[i_263_] = field_il_2833[i_263_ + 1];
							field_is_2830[i_263_] = field_is_2830[i_263_ + 1];
							field_io_2831[i_263_] = field_io_2831[i_263_ + 1];
						}
					}
					currentMenuSize -= -1850638419;
				}
			}
			if ((rootInterfaceId * -374264803) != -1) {
				final int i_264_ = -374264803 * rootInterfaceId;
				if (Class_fz.loadWidget(i_264_, 2047849869)) {
					Class_dg.method_di_void(Widget.widgets[i_264_], 1, 1559916764);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "client.db()");
		}
	}
}
