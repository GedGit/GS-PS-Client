/* Class_cp - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class_cp {
	int field_y_1168;
	int field_d_1169;
	public static final int field_ba_1170 = 72;
	int field_z_1171;
	int field_e_1172;
	int field_n_1173;
	int field_f_1174;
	int field_m_1175;
	int field_g_1176;
	int field_h_1177;
	int field_l_1178;
	int field_u_1179;
	int field_q_1180;
	int field_k_1181;
	int field_x_1182;
	int field_r_1183;
	int field_j_1184;
	int field_s_1185;
	static final int field_i_1186 = 286331153;
	protected static Timer timer;
	public static final int field_ce_1188 = 170;
	public static final int field_cr_1189 = 129;
	int field_a_1190;
	static Rasterizer2D[] hitmarks;

	static final void method_ax_void(final Actor character, final int i, final byte i_0_) {
		try {
			if ((character.forcedToSpeed * -408703439) > (client.currentCycle * 303796053)) {
				Class_du.method_al_void(character, (short) 180);
			} else if ((976491907 * character.forcedReturnSpeed) >= (client.currentCycle * 303796053)) {
				Class_w.method_ar_void(character, (byte) -74);
			} else {
				OnDemandNode.method_as_void(character, -1087664758);
			}
			if (((-2103184911 * character.worldPosX) < 128) || ((character.worldPosY * 2088773389) < 128) || ((character.worldPosX * -2103184911) >= 13184) || ((2088773389 * character.worldPosY) >= 13184)) {
				character.animation = 1176932377;
				character.gfxId = -166388535;
				character.forcedToSpeed = 0;
				character.forcedReturnSpeed = 0;
				character.worldPosX = ((character.walkQueueX[0] * -1905293184) + (676899520 * character.size));
				character.worldPosY = ((character.size * -130692672) + (-1233132928 * character.walkQueueY[0]));
				character.resetQueuePositions();
			}
			if ((Class_ci.myPlayer == character) && (((-2103184911 * character.worldPosX) < 1536) || ((character.worldPosY * 2088773389) < 1536) || ((-2103184911 * character.worldPosX) >= 11776) || ((character.worldPosY * 2088773389) >= 11776))) {
				character.animation = 1176932377;
				character.gfxId = -166388535;
				character.forcedToSpeed = 0;
				character.forcedReturnSpeed = 0;
				character.worldPosX = ((676899520 * character.size) + (character.walkQueueX[0] * -1905293184));
				character.worldPosY = ((-130692672 * character.size) + (-1233132928 * character.walkQueueY[0]));
				character.resetQueuePositions();
			}
			Class_ay.method_ab_void(character, -384196829);
			character.field_t_267 = false;
			if ((-1720610647 * character.field_af_226) != -1) {
				final AnimationSequence class_an = OnDemandNode.getAnimationSequence((-1720610647 * (character.field_af_226)));
				if ((class_an != null) && (class_an.cycle != null)) {
					character.field_av_271 += 383042759;
					if (((-1837165359 * character.field_au_244) < class_an.cycle.length) && ((character.field_av_271 * -366166793) > (class_an.frames[(character.field_au_244 * -1837165359)]))) {
						character.field_av_271 = 383042759;
						character.field_au_244 += 825082929;
						ItemContainer.method_o_void(class_an, (character.field_au_244 * -1837165359), -2103184911 * character.worldPosX, 2088773389 * character.worldPosY, -2112016615);
					}
					if ((character.field_au_244 * -1837165359) >= class_an.cycle.length) {
						character.field_av_271 = 0;
						character.field_au_244 = 0;
						ItemContainer.method_o_void(class_an, (character.field_au_244 * -1837165359), character.worldPosX * -2103184911, character.worldPosY * 2088773389, -2107197721);
					}
				} else {
					character.field_af_226 = 1128000615;
				}
			}
			if (((character.gfxId * 1625440903) != -1) && ((303796053 * client.currentCycle) >= (character.field_bn_254 * 640586139))) {
				if ((character.field_br_239 * -426120347) < 0) {
					character.field_br_239 = 0;
				}
				final int i_1_ = (Class_l.getSpotAnimation(1625440903 * character.gfxId).field_f_399) * 1956440953;
				if (i_1_ != -1) {
					final AnimationSequence class_an = OnDemandNode.getAnimationSequence(i_1_);
					if ((class_an != null) && (class_an.cycle != null)) {
						character.field_bd_264 += -1783171855;
						if (((-426120347 * character.field_br_239) < class_an.cycle.length) && ((528841745 * character.field_bd_264) > (class_an.frames[(character.field_br_239 * -426120347)]))) {
							character.field_bd_264 = -1783171855;
							character.field_br_239 += -689549715;
							ItemContainer.method_o_void(class_an, (-426120347 * character.field_br_239), (character.worldPosX * -2103184911), (2088773389 * character.worldPosY), -2118452556);
						}
						if (((-426120347 * character.field_br_239) >= class_an.cycle.length) && (((character.field_br_239 * -426120347) < 0) || ((-426120347 * character.field_br_239) >= class_an.cycle.length))) {
							character.gfxId = -166388535;
						}
					} else {
						character.gfxId = -166388535;
					}
				} else {
					character.gfxId = -166388535;
				}
			}
			if (((1529361367 * character.animation) != -1) && ((1103217729 * character.animationDelay) <= 1)) {
				final AnimationSequence class_an = OnDemandNode.getAnimationSequence((1529361367 * (character.animation)));
				if (((82293647 * class_an.field_j_202) == 1) && ((1995532921 * character.queueYPos) > 0) && ((-408703439 * character.forcedToSpeed) <= (303796053 * client.currentCycle)) && ((character.forcedReturnSpeed * 976491907) < (303796053 * client.currentCycle))) {
					character.animationDelay = -1653847103;
					return;
				}
			}
			if (((character.animation * 1529361367) != -1) && ((1103217729 * character.animationDelay) == 0)) {
				final AnimationSequence class_an = OnDemandNode.getAnimationSequence((1529361367 * (character.animation)));
				if ((class_an != null) && (class_an.cycle != null)) {
					character.field_bw_248 += -1244754977;
					if (((character.field_bo_247 * -1957976047) < class_an.cycle.length) && ((character.field_bw_248 * 44363807) > (class_an.frames[(character.field_bo_247 * -1957976047)]))) {
						character.field_bw_248 = -1244754977;
						character.field_bo_247 += 1080183025;
						ItemContainer.method_o_void(class_an, (character.field_bo_247 * -1957976047), character.worldPosX * -2103184911, character.worldPosY * 2088773389, -2119671736);
					}
					if ((-1957976047 * character.field_bo_247) >= class_an.cycle.length) {
						character.field_bo_247 -= 51932795 * class_an.field_h_199;
						character.field_bj_250 += 1662558817;
						if ((character.field_bj_250 * -1072725599) >= (class_an.field_r_209 * -717926659)) {
							character.animation = 1176932377;
						} else if (((-1957976047 * character.field_bo_247) >= 0) && ((character.field_bo_247 * -1957976047) < class_an.cycle.length)) {
							ItemContainer.method_o_void(class_an, (-1957976047 * character.field_bo_247), (character.worldPosX * -2103184911), (2088773389 * character.worldPosY), -2144222104);
						} else {
							character.animation = 1176932377;
						}
					}
					character.field_t_267 = class_an.field_u_204;
				} else {
					character.animation = 1176932377;
				}
			}
			if ((character.animationDelay * 1103217729) > 0) {
				character.animationDelay -= -1653847103;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "cp.ax()");
		}
	}

	Class_cp() {
		/* empty */
	}

	static void method_y_void(final int i, final int i_2_) {
		try {
			final ItemContainer itemcontainer = ((ItemContainer) ItemContainer.itemContainerTable.method_n_ga(i));
			if (itemcontainer != null) {
				for (int i_3_ = 0; i_3_ < itemcontainer.ids.length; i_3_++) {
					itemcontainer.ids[i_3_] = -1;
					itemcontainer.amts[i_3_] = 0;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "cp.y()");
		}
	}
}
