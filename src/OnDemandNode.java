/* Class_ff - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class OnDemandNode extends CacheableNode {
	public static final int field_fv_2319 = 78;
	int field_d_2320;
	byte field_z_2321;
	static final String META_FILE_NAME = "main_file_cache.idx255";
	Index field_n_2323;
	public static final int field_fl_2324 = 72;
	static final int field_cg_2325 = 104;
	public static final int field_bc_2326 = 20;
	public static final int field_cx_2327 = 178;

	public static AnimationSequence getAnimationSequence(final int i) {
		AnimationSequence class_an;
		try {
			AnimationSequence class_an_1_ = (AnimationSequence) AnimationSequence.field_y_196.method_n_gb(i);
			if (class_an_1_ != null) {
				return class_an_1_;
			}
			final byte[] is = AnimationSequence.field_n_198.getArchive(12, i);
			class_an_1_ = new AnimationSequence();
			if (is != null) {
				class_an_1_.method_d_void(new Buffer(is), (byte) 42);
			}
			class_an_1_.method_y_void(-1695364340);
			AnimationSequence.field_y_196.method_z_void(class_an_1_, i);
			class_an = class_an_1_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ff.n()");
		}
		return class_an;
	}

	public static boolean method_n_boolean(final int i, final byte i_2_) {
		boolean bool;
		try {
			if ((i & 0x1) != 0) {
				return true;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ff.n()");
		}
		return bool;
	}

	static final void method_as_void(final Actor character, final int i) {
		try {
			character.field_af_226 = character.standAnimation * -377014871;
			if ((character.queueXPos * 1937318741) == 0) {
				character.field_cj_272 = 0;
			} else {
				if (((character.animation * 1529361367) != -1) && ((1103217729 * character.animationDelay) == 0)) {
					final AnimationSequence class_an = getAnimationSequence((character.animation * 1529361367));
					if (((1995532921 * character.queueYPos) > 0) && ((82293647 * class_an.field_j_202) == 0)) {
						character.field_cj_272 += 155434367;
						return;
					}
					if (((character.queueYPos * 1995532921) <= 0) && ((class_an.field_s_210 * -1255306539) == 0)) {
						character.field_cj_272 += 155434367;
						return;
					}
				}
				final int i_3_ = -2103184911 * character.worldPosX;
				final int i_4_ = 2088773389 * character.worldPosY;
				final int i_5_ = (((character.walkQueueX[((1937318741 * character.queueXPos) - 1)]) * 128) + (-1401454912 * character.size));
				final int i_6_ = ((128 * (character.walkQueueY[(character.queueXPos * 1937318741) - 1])) + (-1401454912 * character.size));
				if (((i_5_ - i_3_) <= 256) && ((i_5_ - i_3_) >= -256) && ((i_6_ - i_4_) <= 256) && ((i_6_ - i_4_) >= -256)) {
					if (i_3_ < i_5_) {
						if (i_4_ < i_6_) {
							character.orientation = -744041728;
						} else if (i_4_ > i_6_) {
							character.orientation = -182664960;
						} else {
							character.orientation = 1684130304;
						}
					} else if (i_3_ > i_5_) {
						if (i_4_ < i_6_) {
							character.orientation = -1305418496;
						} else if (i_4_ > i_6_) {
							character.orientation = -1866795264;
						} else {
							character.orientation = 561376768;
						}
					} else if (i_4_ < i_6_) {
						character.orientation = 1122753536;
					} else if (i_4_ > i_6_) {
						character.orientation = 0;
					}
					int i_7_ = (((character.orientation * 414328519) - (character.field_b_217 * -2023015971)) & 0x7ff);
					if (i_7_ > 1024) {
						i_7_ -= 2048;
					}
					int i_8_ = character.turnAnimation * -306018681;
					if ((i_7_ >= -256) && (i_7_ <= 256)) {
						i_8_ = 761455167 * character.field_ae_223;
					} else if ((i_7_ >= 256) && (i_7_ < 768)) {
						i_8_ = (-983432061 * character.turn180);
					} else if ((i_7_ >= -768) && (i_7_ <= -256)) {
						i_8_ = (character.walkAnimation * -143680931);
					}
					if (i_8_ == -1) {
						i_8_ = 761455167 * character.field_ae_223;
					}
					character.field_af_226 = i_8_ * -1128000615;
					int i_9_ = 4;
					boolean bool = true;
					if (character instanceof Npc) {
						bool = ((Npc) character).composite.field_ao_497;
					}
					if (bool) {
						if (((414328519 * character.orientation) != (-2023015971 * character.field_b_217)) && ((character.interactingIndex * -313868667) == -1) && ((-2063870277 * character.field_bx_249) != 0)) {
							i_9_ = 2;
						}
						if ((character.queueXPos * 1937318741) > 2) {
							i_9_ = 6;
						}
						if ((1937318741 * character.queueXPos) > 3) {
							i_9_ = 8;
						}
						if (((-384433537 * character.field_cj_272) > 0) && ((character.queueXPos * 1937318741) > 1)) {
							i_9_ = 8;
							character.field_cj_272 -= 155434367;
						}
					} else {
						if ((character.queueXPos * 1937318741) > 1) {
							i_9_ = 6;
						}
						if ((1937318741 * character.queueXPos) > 2) {
							i_9_ = 8;
						}
						if (((character.field_cj_272 * -384433537) > 0) && ((1937318741 * character.queueXPos) > 1)) {
							i_9_ = 8;
							character.field_cj_272 -= 155434367;
						}
					}
					if (character.field_bl_245[((1937318741 * character.queueXPos) - 1)]) {
						i_9_ <<= 1;
					}
					if ((i_9_ >= 8) && ((-1720610647 * character.field_af_226) == (761455167 * character.field_ae_223)) && ((character.turnCW90 * -1339396887) != -1)) {
						character.field_af_226 = (-304848319 * character.turnCW90);
					}
					if (i_3_ < i_5_) {
						character.worldPosX += i_9_ * -585310447;
						if ((-2103184911 * character.worldPosX) > i_5_) {
							character.worldPosX = -585310447 * i_5_;
						}
					} else if (i_3_ > i_5_) {
						character.worldPosX -= i_9_ * -585310447;
						if ((-2103184911 * character.worldPosX) < i_5_) {
							character.worldPosX = i_5_ * -585310447;
						}
					}
					if (i_4_ < i_6_) {
						character.worldPosY += 359464901 * i_9_;
						if ((2088773389 * character.worldPosY) > i_6_) {
							character.worldPosY = 359464901 * i_6_;
						}
					} else if (i_4_ > i_6_) {
						character.worldPosY -= 359464901 * i_9_;
						if ((2088773389 * character.worldPosY) < i_6_) {
							character.worldPosY = i_6_ * 359464901;
						}
					}
					if (((character.worldPosX * -2103184911) == i_5_) && ((character.worldPosY * 2088773389) == i_6_)) {
						character.queueXPos -= 1628553725;
						if ((character.queueYPos * 1995532921) > 0) {
							character.queueYPos -= 693428169;
						}
					}
				} else {
					character.worldPosX = i_5_ * -585310447;
					character.worldPosY = 359464901 * i_6_;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ff.as()");
		}
	}

	OnDemandNode() {
		/* empty */
	}
}
