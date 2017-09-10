/* Player - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Player extends Actor {
	boolean spotAnimating = false;
	PlayerComposite composite;
	int prayerIcon = 1515526543;
	String name;
	int combatLevel = 0;
	int totalLevel = 0;
	int field_f_1550;
	int field_m_1551 = 0;
	int field_r_1552;
	int field_h_1553;
	int field_x_1554;
	int field_u_1555;
	Model screenModel;
    String[] tags = new String[3];
	boolean field_s_1557 = false;
	int skullIcon = 66253867;
	static Sprite[] mod_icons;
	int field_j_1560;
	int field_v_1561 = 0;
	int field_l_1562;
	int field_k_1563;
	int field_a_1564 = 0;

	Player() {
        for(int var1 = 0; var1 < 3; ++var1) {
            this.tags[var1] = "";
        }
	}

	/**
	 * hmm
	 * oh i see we can just write 0 if we dont want to handkle all the extra stuff (i know how to handle it i wrote a full impl o the player app on 666) ill just skip it for now
	 * @param buffer
	 * @param i
	 */
	final void decodeAppearance(final Buffer buffer, final int i) {
		try {
			buffer.position = 0;
			final int i_0_ = buffer.get();//gender
			this.prayerIcon = buffer.getSigned() * -1515526543;
			this.skullIcon = buffer.getSigned() * -66253867;
			int i_1_ = -1;
			this.field_v_1561 = 0;
			final int[] equipment = new int[12];//i don't see that loop through 4 on here do you? on server its handled as it isnt a loop but i think that was cause they didnt know how
			for (int slot = 0; slot < 12; slot++) {
				final int equipId = buffer.get();
				if (equipId == 0) {
					equipment[slot] = 0;
				} else {
					final int i_4_ = buffer.get();
					equipment[slot] = (equipId << 8) + i_4_;
					if ((slot == 0) && (65535 == equipment[0])) {
						i_1_ = buffer.getShort();
						break;
					}
					if (equipment[slot] >= 512) {// sec i think we need to change 32768 to512 but try this firs
						final int i_5_ = ((ItemDefinitions.getItemComposite(equipment[slot] - 512).team) * 1157784391);
						if (i_5_ != 0) {
							this.field_v_1561 = i_5_ * 120117975;
						}
					}
				}
			}
			final int[] colors = new int[5];
			for (int index = 0; index < 5; index++) {
				int color = buffer.get();
				if ((color < 0) || (color >= PlayerComposite.bodyColors[index].length)) {
					color = 0;// black
				}
				colors[index] = color;
			}
			this.standAnimation = buffer.getShort() * -352271247;
			if ((this.standAnimation * -385188719) == 65535) {
				this.standAnimation = 352271247;
			}
			this.standTurnAnimation = buffer.getShort() * 1998558783;
			if ((this.standTurnAnimation * -1123198529) == 65535) {
				this.standTurnAnimation = -1998558783;
			}
			this.field_ak_222 = this.standTurnAnimation * -68883371;
			this.field_ae_223 = buffer.getShort() * -1153167937;
			if (65535 == (761455167 * this.field_ae_223)) {
				this.field_ae_223 = 1153167937;
			}
			this.turnAnimation = buffer.getShort() * 1404002103;
			if ((-306018681 * this.turnAnimation) == 65535) {
				this.turnAnimation = -1404002103;
			}
			this.walkAnimation = buffer.getShort() * -1466693131;
			if ((-143680931 * this.walkAnimation) == 65535) {
				this.walkAnimation = 1466693131;
			}
			this.turn180 = buffer.getShort() * 12151339;
			if ((-983432061 * this.turn180) == 65535) {
				this.turn180 = -12151339;
			}
			this.turnCW90 = buffer.getShort() * 472722265;
			if (65535 == (-1339396887 * this.turnCW90)) {
				this.turnCW90 = -472722265;
			}
			this.name = buffer.getString();
			if (this == Class_ci.myPlayer) {
				ClientError.field_d_2207 = this.name;
			}
			this.combatLevel = buffer.get() * -928185683;//ffs man u fucked me now i have to do it all again, thats not right multiplier
			this.totalLevel = buffer.getShort() * 484566369;
			this.spotAnimating = buffer.get() == 1;
			if (((1548930135 * client.game_mode) == 0) && ((-1069253877 * client.myPermissions) >= 2)) {
				this.spotAnimating = false;
			}
			if (this.composite == null) {
				this.composite = new PlayerComposite();
			}
			this.composite.method_n_void(equipment, colors, i_0_ == 1, i_1_, 366488991);//you notice this is sending some different shit yeah?
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "z.n()");
		}
	}

	static void reset(final int i) {
		try {
			client.field_o_2696 = 5304554967186568315L;
			client.field_ad_2700 = 1839599337;
			client.field_b_2778.field_z_1255 = 0;
			Class_gf.field_rd_2987 = true;
			client.clientFocused = true;
			client.field_md_2728 = 6369859318950303639L;
			Class_ab.method_n_void((byte) 8);
			client.encryptedBuffer.position = 0;
			client.inbound.position = 0;
			client.currentOpcode = -1807560939;
			client.field_ch_2872 = -1296510753;
			client.field_cx_2735 = 43136633;
			client.field_cy_2736 = -905582649;
			client.field_cc_2731 = 0;
			client.field_ax_2703 = 0;
			client.field_cv_2733 = 0;
			client.hintMarkerType = 0;
			client.currentMenuSize = 0;
			client.isMenuOpen = false;
			MouseInputListener.field_d_2150 = 0;
			Class_l.field_n_1130.clear();
			Class_l.gameMessagesTable.method_z_void();
			Class_l.field_z_1131.method_n_void();
			Class_l.gameMessageCounter = 0;
			client.selectedOptionType = 0;
			client.isOptionSelected = false;
			client.field_nb_2931 = 0;
			client.field_dz_2755 = ((int) (Math.random() * 100.0) - 50) * 1597761359;
			client.field_du_2751 = ((int) (Math.random() * 110.0) - 55) * -1014609403;
			client.field_dx_2753 = ((int) (Math.random() * 80.0) - 40) * 1834981777;
			client.miniMapOffset = ((int) (Math.random() * 120.0) - 60) * -978315773;
			client.miniMapScale = ((int) (Math.random() * 30.0) - 20) * -1899281495;
			client.miniMapAngle = (((int) (Math.random() * 20.0) - 10) & 0x7ff) * -1179748115;
			client.field_nk_2925 = 0;
			client.field_ml_2809 = -1558655015;
			client.field_mk_2923 = 0;
			client.field_mn_2924 = 0;
			client.field_ai_2895 = Class_v.field_n_1442;
			client.localPlayerCount = 0;
			client.localNpcCount = 0;
			for (int i_9_ = 0; i_9_ < 2048; i_9_++) {
				client.localPlayers[i_9_] = null;
				client.APPEARANCES[i_9_] = null;
			}
			for (int i_10_ = 0; i_10_ < 32768; i_10_++) {
				client.npcs[i_10_] = null;
			}
			Class_ci.myPlayer = client.localPlayers[2047] = new Player();
			client.field_hm_2819 = -1926064935;
			client.activeProjectiles.method_n_void();
			client.field_ha_2823.method_n_void();
			for (int i_11_ = 0; i_11_ < 4; i_11_++) {
				for (int i_12_ = 0; i_12_ < 104; i_12_++) {
					for (int i_13_ = 0; i_13_ < 104; i_13_++) {
						client.groundItemsDeque[i_11_][i_12_][i_13_] = null;
					}
				}
			}
			client.field_hv_2821 = new NodeDeque();
			client.field_ol_2957 = 0;
			client.friendListSize = 0;
			client.field_pa_2851 = 0;
			for (int i_14_ = 0; i_14_ < (-1642299653 * NpcDefinitions.totalConfigFiles); i_14_++) {
				final Varp class_ag = AnimationSequence.getVarp(i_14_);
				if (class_ag != null) {
					Class_fv.configValues[i_14_] = 0;
					Class_fv.configs[i_14_] = 0;
				}
			}
			for (int i_15_ = 0; i_15_ < client.field_kd_2885.length; i_15_++) {
				client.field_kd_2885[i_15_] = -1;
			}
			client.field_jo_2954 = -1825533571;
			if ((client.rootInterfaceId * -374264803) != -1) {
				Class_ev.method_e_void(client.rootInterfaceId * -374264803, -1031879225);
			}
			for (Menu interfacepositionnode = ((Menu) client.menuTable.method_y_ga()); interfacepositionnode != null; interfacepositionnode = ((Menu) client.menuTable.method_e_ga())) {
				client.method_db_void(interfacepositionnode, true);
			}
			client.rootInterfaceId = -642184757;
			client.menuTable = new NodeMultiSet(8);
			client.field_jd_2762 = null;
			client.isMenuOpen = false;
			client.currentMenuSize = 0;
			client.playerDesignComposite.method_n_void(null, new int[5], false, -1, 928402750);
			for (int i_16_ = 0; i_16_ < 8; i_16_++) {
				client.playerOptions[i_16_] = null;
				client.field_hf_2706[i_16_] = false;
			}
			Bindable.method_e_void((byte) -60);
			client.field_c_2747 = true;
			for (int i_17_ = 0; i_17_ < 100; i_17_++) {
				client.field_li_2835[i_17_] = true;
			}
			Class_a.method_aa_void(84265199);
			client.channelName = null;
			Class_ci.clanSize = 0;
			Class_dd.field_mq_1588 = null;
			for (int i_18_ = 0; i_18_ < 8; i_18_++) {
				client.field_pb_2965[i_18_] = new Class_hl();
			}
			Npc.field_pe_292 = null;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "z.j()");
		}
	}

	@Override
	final boolean method_z_boolean(final int i) {
		boolean bool;
		try {
			if (this.composite != null) {
				return true;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "z.z()");
		}
		return bool;
	}

	@Override
	protected final Model getModel() {
		Model onscreenmodel;
		try {
			if (this.composite == null) {
				return null;
			}
			AnimationSequence class_an;
			if (((1529361367 * this.animation) != -1) && ((1103217729 * this.animationDelay) == 0)) {
				class_an = OnDemandNode.getAnimationSequence(1529361367 * (this.animation));
			} else {
				class_an = null;
			}
			final AnimationSequence class_an_19_ = class_an;
			if (((this.field_af_226 * -1720610647) != -1) && !this.field_s_1557 && (((-1720610647 * this.field_af_226) != (this.standAnimation * -385188719)) || (class_an_19_ == null))) {
				class_an = OnDemandNode.getAnimationSequence((this.field_af_226 * -1720610647));
			} else {
				class_an = null;
			}
			final AnimationSequence class_an_20_ = class_an;
			Model onscreenmodel_21_ = (this.composite.getAnimatedModel(class_an_19_, -1957976047 * this.field_bo_247, class_an_20_, -1837165359 * this.field_au_244, 139410778));
			if (onscreenmodel_21_ == null) {
				return null;
			}
			onscreenmodel_21_.method_m_void();
			this.field_bf_215 = onscreenmodel_21_.modelHeight * 324762945;
			if (!this.field_s_1557 && ((this.gfxId * 1625440903) != -1) && ((-426120347 * this.field_br_239) != -1)) {
				final Model onscreenmodel_22_ = (Class_l.getSpotAnimation(1625440903 * this.gfxId).method_y_cg(this.field_br_239 * -426120347, 1279711460));
				if (onscreenmodel_22_ != null) {
					onscreenmodel_22_.method_s_void(0, -(1207713105 * (this.field_bu_255)), 0);
					final Model[] onscreenmodels = { onscreenmodel_21_, onscreenmodel_22_ };
					onscreenmodel_21_ = new Model(onscreenmodels, 2);
				}
			}
			if (!this.field_s_1557 && (this.screenModel != null)) {
				if ((303796053 * client.currentCycle) >= (1882146187 * this.field_a_1564)) {
					this.screenModel = null;
				}
				if (((303796053 * client.currentCycle) >= (this.field_m_1551 * -250776255)) && ((client.currentCycle * 303796053) < (1882146187 * this.field_a_1564))) {
					final Model onscreenmodel_23_ = this.screenModel;
					onscreenmodel_23_.method_s_void(((this.field_h_1553 * 715247789) - (-2103184911 * this.worldPosX)), ((this.field_l_1562 * 1890483989) - (this.field_f_1550 * 1113448717)), ((368705817 * this.field_u_1555) - (2088773389 * this.worldPosY)));
					if ((414328519 * this.orientation) == 512) {
						onscreenmodel_23_.method_k_void();
						onscreenmodel_23_.method_k_void();
						onscreenmodel_23_.method_k_void();
					} else if ((this.orientation * 414328519) == 1024) {
						onscreenmodel_23_.method_k_void();
						onscreenmodel_23_.method_k_void();
					} else if ((414328519 * this.orientation) == 1536) {
						onscreenmodel_23_.method_k_void();
					}
					final Model[] onscreenmodels = { onscreenmodel_21_, onscreenmodel_23_ };
					onscreenmodel_21_ = new Model(onscreenmodels, 2);
					if ((414328519 * this.orientation) == 512) {
						onscreenmodel_23_.method_k_void();
					} else if ((414328519 * this.orientation) == 1024) {
						onscreenmodel_23_.method_k_void();
						onscreenmodel_23_.method_k_void();
					} else if ((414328519 * this.orientation) == 1536) {
						onscreenmodel_23_.method_k_void();
						onscreenmodel_23_.method_k_void();
						onscreenmodel_23_.method_k_void();
					}
					onscreenmodel_23_.method_s_void(((-2103184911 * this.worldPosX) - (715247789 * this.field_h_1553)), ((1113448717 * this.field_f_1550) - (this.field_l_1562 * 1890483989)), ((this.worldPosY * 2088773389) - (368705817 * this.field_u_1555)));
				}
			}
			onscreenmodel_21_.field_ad_893 = true;
			onscreenmodel = onscreenmodel_21_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "z.d()");
		}
		return onscreenmodel;
	}

	public static int method_n_int(int i, int i_24_, final int i_25_) {
		int i_26_;
		try {
			if (i_24_ > i) {
				final int i_27_ = i;
				i = i_24_;
				i_24_ = i_27_;
			}
			int i_28_;
			for (/**/; i_24_ != 0; i_24_ = i_28_) {
				i_28_ = i % i_24_;
				i = i_24_;
			}
			i_26_ = i;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "z.n()");
		}
		return i_26_;
	}
}
