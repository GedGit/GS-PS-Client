
/* Character - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Graphics;

public abstract class Actor extends Renderable {
	int field_bf_215 = 2061958696;
	int worldPosY;
	int field_b_217;
	int[] walkQueueX = new int[10];
	int size = 622503219;
	int standAnimation = 352271247;
	int standTurnAnimation = -1998558783;
	int field_ak_222 = -1092286187;
	int field_ae_223 = 1153167937;
	int turnAnimation = -1404002103;
	int maxHp;
	int field_af_226 = 1128000615;
	int focalX = 0;
	int focalY = 0;
	boolean isAutoTalking;
	boolean field_ac_230 = false;
	int field_az_231 = -1262432292;
	int field_at_232 = 0;
	int field_aa_233 = 0;
	int[] field_aw_234 = new int[4];
	int[] field_ai_235 = new int[4];
	int[] field_ah_236 = new int[4];
	int hpBarExpire = 2060681592;
	int currentHp;
	int field_br_239 = 0;
	int interactingIndex = -2044561997;
	int walkAnimation = 1466693131;
	int turnCW90 = -472722265;
	int orientation;
	int field_au_244 = 0;
	boolean[] field_bl_245 = new boolean[10];
	int animation = 1176932377;
	int field_bo_247 = 0;
	int field_bw_248 = 0;
	int field_bx_249 = -1669345696;
	int field_bj_250 = 0;
	int gfxId = -166388535;
	int animationDelay = 0;
	int forcedSecondY;
	int field_bn_254;
	int field_bu_255;
	int forcedFirstX;
	int forcedSecondX;
	int forcedFirstY;
	int turn180 = -12151339;
	int forcedToSpeed;
	int forcedReturnSpeed;
	int forcedDirection;
	int cycle = 0;
	int field_bd_264 = 0;
	String speech = null;
	int field_bi_266 = 0;
	boolean field_t_267 = false;
	int queueXPos = 0;
	public static final int field_eh_269 = 66;
	int[] walkQueueY = new int[10];
	int field_av_271 = 0;
	int field_cj_272 = 0;
	int queueYPos = 0;
	protected static final int field_qn_274 = 32;
	public static final int field_dx_275 = 1;
	int worldPosX;

	public static GameComposite[] getGames(final int i) {
		GameComposite[] class_eas;
		try {
			class_eas = (new GameComposite[] { GameComposite.GAME4, GameComposite.RUNESCAPE, GameComposite.OLDSCAPE,
					GameComposite.GAME5, GameComposite.GAME3, GameComposite.STELLAR_DAWN });
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ao.n()");
		}
		return class_eas;
	}

	final void move(final int x, final int y, final boolean changingZones) {
		try {
			if (((1529361367 * this.animation) != -1)
					&& (((OnDemandNode.getAnimationSequence(this.animation * 1529361367).field_s_210)
							* -1255306539) == 1)) {
				this.animation = 1176932377;
			}
			if (!changingZones) {
				final int i_2_ = x - this.walkQueueX[0];
				final int i_3_ = y - this.walkQueueY[0];
				if ((i_2_ >= -8) && (i_2_ <= 8) && (i_3_ >= -8) && (i_3_ <= 8)) {
					if ((1937318741 * this.queueXPos) < 9) {
						this.queueXPos += 1628553725;
					}
					for (int i_4_ = 1937318741 * this.queueXPos; i_4_ > 0; i_4_--) {
						this.walkQueueX[i_4_] = this.walkQueueX[i_4_ - 1];
						this.walkQueueY[i_4_] = this.walkQueueY[i_4_ - 1];
						this.field_bl_245[i_4_] = this.field_bl_245[i_4_ - 1];
					}
					this.walkQueueX[0] = x;
					this.walkQueueY[0] = y;
					this.field_bl_245[0] = false;
					return;
				}
			}
			this.queueXPos = 0;
			this.queueYPos = 0;
			this.field_cj_272 = 0;
			this.walkQueueX[0] = x;
			this.walkQueueY[0] = y;
			this.worldPosX = ((this.walkQueueX[0] * -1905293184) + (this.size * 676899520));
			this.worldPosY = ((this.walkQueueY[0] * -1233132928) + (-130692672 * this.size));
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ao.h()");
		}
	}

	final void moveInDirection(final int dir, final boolean bool) {
		try {
			int i_6_ = this.walkQueueX[0];
			int i_7_ = this.walkQueueY[0];
			if (dir == 0) {
				i_6_--;
				i_7_++;
			}
			if (dir == 1) {
				i_7_++;
			}
			if (dir == 2) {
				i_6_++;
				i_7_++;
			}
			if (dir == 3) {
				i_6_--;
			}
			if (dir == 4) {
				i_6_++;
			}
			if (dir == 5) {
				i_6_--;
				i_7_--;
			}
			if (dir == 6) {
				i_7_--;
			}
			if (dir == 7) {
				i_6_++;
				i_7_--;
			}
			if (((this.animation * 1529361367) != -1)
					&& (((OnDemandNode.getAnimationSequence(1529361367 * this.animation).field_s_210)
							* -1255306539) == 1)) {
				this.animation = 1176932377;
			}
			if ((this.queueXPos * 1937318741) < 9) {
				this.queueXPos += 1628553725;
			}
			for (int i_8_ = this.queueXPos * 1937318741; i_8_ > 0; i_8_--) {
				this.walkQueueX[i_8_] = this.walkQueueX[i_8_ - 1];
				this.walkQueueY[i_8_] = this.walkQueueY[i_8_ - 1];
				this.field_bl_245[i_8_] = this.field_bl_245[i_8_ - 1];
			}
			this.walkQueueX[0] = i_6_;
			this.walkQueueY[0] = i_7_;
			this.field_bl_245[0] = bool;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ao.l()");
		}
	}

	boolean method_z_boolean(final int i) {
		return false;
	}

	final void method_q_void(final int i, final int i_9_, final int i_10_, final int i_11_) {
		try {
			for (int i_12_ = 0; i_12_ < 4; i_12_++) {
				if (this.field_ah_236[i_12_] <= i_10_) {
					this.field_aw_234[i_12_] = i;
					this.field_ai_235[i_12_] = i_9_;
					this.field_ah_236[i_12_] = i_10_ + 70;
					break;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ao.q()");
		}
	}

	Actor() {
		/* empty */
	}

	final void resetQueuePositions() {
		try {
			this.queueXPos = 0;
			this.queueYPos = 0;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ao.u()");
		}
	}

	static void method_cc_void() {
		try {
			for (int i_13_ = 0; i_13_ < (-224642011 * client.currentMenuSize); i_13_++) {
				if (Class_cc.method_ca_boolean(client.field_ik_2832[i_13_], (byte) 0)) {
					if (i_13_ < ((client.currentMenuSize * -224642011) - 1)) {
						for (int i_14_ = i_13_; i_14_ < ((-224642011 * client.currentMenuSize) - 1); i_14_++) {
							client.menuActions[i_14_] = client.menuActions[1 + i_14_];
							client.menuOptions[i_14_] = client.menuOptions[i_14_ + 1];
							client.field_ik_2832[i_14_] = client.field_ik_2832[1 + i_14_];
							client.field_il_2833[i_14_] = client.field_il_2833[1 + i_14_];
							client.field_is_2830[i_14_] = client.field_is_2830[i_14_ + 1];
							client.field_io_2831[i_14_] = client.field_io_2831[i_14_ + 1];
						}
					}
					client.currentMenuSize -= -1850638419;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ao.cc()");
		}
	}

	static void renderLoginScreen(final Class_hd class_hd, final Class_hd class_hd_15_, final Class_hd class_hd_16_,
			final boolean bool) {
		try {
			if (bool) {
				Class_ax.field_d_415 = 2101785865
						* (((Boundary.clientWidth * -1236640339) - (client.field_lm_2904 * -144968977)) / 2);
				Class_ax.field_r_440 = (1408190063 * Class_ax.field_d_415) + 60243526;
			}
			if (Class_ax.field_ap_443) {
				if (Class_al.background == null) {
					Class_al.background = Class_df.getSpriteArray(Class_cj.spriteIndex, "sl_back", "", 1742365633);
				}
				if (Class_i.flags == null) {
					Class_i.flags = Class_w.getSpriteArray(Class_cj.spriteIndex, "sl_flags", "");
				}
				if (Class_a.arrows == null) {
					Class_a.arrows = Class_w.getSpriteArray(Class_cj.spriteIndex, "sl_arrows", "");
				}
				if (Class_ax.stars == null) {
					Class_ax.stars = Class_w.getSpriteArray(Class_cj.spriteIndex, "sl_stars", "");
				}
				Rasterizer.fillRect(1815701817 * Class_ax.field_d_415, 23, 765, 480, 0);
				Rasterizer.method_cm_void(1815701817 * Class_ax.field_d_415, 0, 125, 23, 12425273, 9135624);
				Rasterizer.method_cm_void(((1815701817 * Class_ax.field_d_415) + 125), 0, 640, 23, 5197647, 2697513);
				class_hd.drawCenteredString(MenuText.field_ju_2017, 62 + (1815701817 * Class_ax.field_d_415), 15, 0,
						-1);
				if (Class_ax.stars != null) {
					Class_ax.stars[1].render((Class_ax.field_d_415 * 1815701817) + 140, 1);
					class_hd_15_.method_a_void(MenuText.field_jd_1991, (Class_ax.field_d_415 * 1815701817) + 152, 10,
							16777215, -1);
					Class_ax.stars[0].render(140 + (1815701817 * Class_ax.field_d_415), 12);
					class_hd_15_.method_a_void(MenuText.field_jh_2046, (1815701817 * Class_ax.field_d_415) + 152, 21,
							16777215, -1);
				}
				if (Class_a.arrows != null) {
					final int i_17_ = (1815701817 * Class_ax.field_d_415) + 280;
					if ((World.field_a_1394[0] == 0) && (World.field_m_1393[0] == 0)) {
						Class_a.arrows[2].render(i_17_, 4);
					} else {
						Class_a.arrows[0].render(i_17_, 4);
					}
					if ((World.field_a_1394[0] == 0) && (World.field_m_1393[0] == 1)) {
						Class_a.arrows[3].render(i_17_ + 15, 4);
					} else {
						Class_a.arrows[1].render(15 + i_17_, 4);
					}
					class_hd.method_a_void(MenuText.field_jb_2049, i_17_ + 32, 17, 16777215, -1);
					final int i_18_ = 390 + (1815701817 * Class_ax.field_d_415);
					if ((World.field_a_1394[0] == 1) && (World.field_m_1393[0] == 0)) {
						Class_a.arrows[2].render(i_18_, 4);
					} else {
						Class_a.arrows[0].render(i_18_, 4);
					}
					if ((World.field_a_1394[0] == 1) && (World.field_m_1393[0] == 1)) {
						Class_a.arrows[3].render(i_18_ + 15, 4);
					} else {
						Class_a.arrows[1].render(15 + i_18_, 4);
					}
					class_hd.method_a_void(MenuText.field_je_2050, 32 + i_18_, 17, 16777215, -1);
					final int i_19_ = (Class_ax.field_d_415 * 1815701817) + 500;
					if ((World.field_a_1394[0] == 2) && (World.field_m_1393[0] == 0)) {
						Class_a.arrows[2].render(i_19_, 4);
					} else {
						Class_a.arrows[0].render(i_19_, 4);
					}
					if ((World.field_a_1394[0] == 2) && (World.field_m_1393[0] == 1)) {
						Class_a.arrows[3].render(15 + i_19_, 4);
					} else {
						Class_a.arrows[1].render(15 + i_19_, 4);
					}
					class_hd.method_a_void(MenuText.field_jo_1850, i_19_ + 32, 17, 16777215, -1);
					final int i_20_ = (Class_ax.field_d_415 * 1815701817) + 610;
					if ((World.field_a_1394[0] == 3) && (World.field_m_1393[0] == 0)) {
						Class_a.arrows[2].render(i_20_, 4);
					} else {
						Class_a.arrows[0].render(i_20_, 4);
					}
					if ((World.field_a_1394[0] == 3) && (World.field_m_1393[0] == 1)) {
						Class_a.arrows[3].render(i_20_ + 15, 4);
					} else {
						Class_a.arrows[1].render(i_20_ + 15, 4);
					}
					class_hd.method_a_void(MenuText.TYPE, 32 + i_20_, 17, 16777215, -1);
				}
				Rasterizer.fillRect((708 + (1815701817 * Class_ax.field_d_415)), 4, 50, 16, 0);
				class_hd_15_.drawCenteredString(MenuText.CANCEL, ((Class_ax.field_d_415 * 1815701817) + 708 + 25), 16,
						16777215, -1);
				int i_21_ = 0;
				final int i_22_ = 33554432;
				final int i_23_ = (-1483883627 * client.currentWorldMask) & i_22_;
				for (int i_24_ = 0; i_24_ < (1998006609 * World.totalWorlds); i_24_++) {
					final World worldinfo = World.worlds[i_24_];
					if ((i_23_ == ((-1273754019 * worldinfo.mask) & i_22_))
							|| (((-1273754019 * worldinfo.mask) & i_22_) == 0)) {
						i_21_++;
					}
				}
				Class_ax.field_bw_445 = -1206921623;
				if (Class_al.background != null) {
					final int i_25_ = 88;
					final int i_26_ = 19;
					int i_27_ = 765 / (i_25_ + 1);
					int i_28_ = 480 / (i_26_ + 1);
					int i_29_;
					int i_30_;
					do {
						i_29_ = i_28_;
						i_30_ = i_27_;
						if (((i_27_ - 1) * i_28_) >= i_21_) {
							i_27_--;
						}
						if ((i_27_ * (i_28_ - 1)) >= i_21_) {
							i_28_--;
						}
						if ((i_27_ * (i_28_ - 1)) >= i_21_) {
							i_28_--;
						}
					} while ((i_28_ != i_29_) || (i_30_ != i_27_));
					i_29_ = (765 - (i_27_ * i_25_)) / (i_27_ + 1);
					if (i_29_ > 5) {
						i_29_ = 5;
					}
					i_30_ = (480 - (i_26_ * i_28_)) / (1 + i_28_);
					if (i_30_ > 5) {
						i_30_ = 5;
					}
					final int i_31_ = (765 - (i_25_ * i_27_) - (i_29_ * (i_27_ - 1))) / 2;
					final int i_32_ = (480 - (i_28_ * i_26_) - (i_30_ * (i_28_ - 1))) / 2;
					int i_33_ = i_32_ + 23;
					int i_34_ = (1815701817 * Class_ax.field_d_415) + i_31_;
					int i_35_ = 0;
					boolean bool_36_ = false;
					for (int i_37_ = 0; i_37_ < (1998006609 * World.totalWorlds); i_37_++) {
						final World worldinfo = World.worlds[i_37_];
						if ((i_23_ == ((worldinfo.mask * -1273754019) & i_22_))
								|| (((worldinfo.mask * -1273754019) & i_22_) == 0)) {
							boolean bool_38_ = true;
							String string = Integer.toString((worldinfo.players) * -318332813);
							if ((-318332813 * worldinfo.players) == -1) {
								string = MenuText.field_jk_2053;
								bool_38_ = false;
							} else if ((-318332813 * worldinfo.players) > 1980) {
								string = MenuText.field_ja_2054;
								bool_38_ = false;
							}
							int i_39_;
							if (worldinfo.method_u_boolean(-1111385856)) {
								if (worldinfo.isMembers()) {
									i_39_ = 3;
								} else {
									i_39_ = 2;
								}
							} else if (worldinfo.isMembers()) {
								i_39_ = 1;
							} else {
								i_39_ = 0;
							}
							if (((1515107729 * MouseInputListener.field_m_2156) >= i_34_)
									&& ((MouseInputListener.field_a_2157 * -2089478689) >= i_33_)
									&& ((1515107729 * MouseInputListener.field_m_2156) < (i_25_ + i_34_))
									&& ((-2089478689 * MouseInputListener.field_a_2157) < (i_33_ + i_26_))
									&& bool_38_) {
								Class_ax.field_bw_445 = i_37_ * 1206921623;
								Class_al.background[i_39_].method_r_void(i_34_, i_33_, 128, 16777215);
								bool_36_ = true;
							} else {
								Class_al.background[i_39_].method_h_void(i_34_, i_33_);
							}
							if (Class_i.flags != null) {
								Class_i.flags[((worldinfo.isMembers() ? 8 : 0) + (worldinfo.country * 1232511885))]
										.render(29 + i_34_, i_33_);
							}
							class_hd.drawCenteredString(Integer.toString(-1909124507 * (worldinfo.id)), 15 + i_34_,
									(i_26_ / 2) + i_33_ + 5, 0, -1);
							class_hd_15_.drawCenteredString(string, 60 + i_34_, 5 + i_33_ + (i_26_ / 2), 268435455, -1);
							i_33_ += i_26_ + i_30_;
							if (++i_35_ >= i_28_) {
								i_33_ = i_32_ + 23;
								i_34_ += i_29_ + i_25_;
								i_35_ = 0;
							}
						}
					}
					if (bool_36_) {
						final int i_40_ = ((class_hd_15_
								.getTextWidth((World.worlds[1289020967 * Class_ax.field_bw_445]).activity)) + 6);
						final int i_41_ = class_hd_15_.field_f_3101 + 8;
						Rasterizer.fillRect((MouseInputListener.field_m_2156 * 1515107729) - (i_40_ / 2),
								(MouseInputListener.field_a_2157 * -2089478689) + 20 + 5, i_40_, i_41_, 16777120);
						Rasterizer.drawRect((MouseInputListener.field_m_2156 * 1515107729) - (i_40_ / 2),
								25 + (-2089478689 * MouseInputListener.field_a_2157), i_40_, i_41_, 0);
						class_hd_15_.drawCenteredString(((World.worlds[1289020967 * Class_ax.field_bw_445]).activity),
								MouseInputListener.field_m_2156 * 1515107729,
								(20 + (-2089478689 * MouseInputListener.field_a_2157) + 5 + class_hd_15_.field_f_3101
										+ 4),
								0, -1);
					}
				}
				try {
					final Graphics graphics = ObjectComposite.canvas.getGraphics();
					Class_s.field_qj_1361.drawGraphics(graphics, 0, 0, (byte) 1);
				} catch (final Exception exception) {
					ObjectComposite.canvas.repaint();
				}
			} else {
				if (bool) {// fire
					Class_v.field_g_1446.method_h_void(Class_ax.field_d_415 * 1815701817, 0);
					ImageColorModel.field_f_541.method_h_void((382 + (Class_ax.field_d_415 * 1815701817)), 0);

					// LOGO
					Class_ax.field_m_419.render(
							((382 + (1815701817 * Class_ax.field_d_415)) - (Class_ax.field_m_419.field_z_533 / 2)), 18);
				}
				if (((824045845 * client.status) == 0) || ((client.status * 824045845) == 5)) {
					final int i_42_ = 20;
					class_hd.drawCenteredString(MenuText.field_hq_1993, 180 + (Class_ax.field_r_440 * 1952440023),
							245 - i_42_, 16777215, -1);
					final int i_43_ = 253 - i_42_;
					Rasterizer.drawRect((((Class_ax.field_r_440 * 1952440023) + 180) - 152), i_43_, 304, 34, 9179409);
					Rasterizer.drawRect((180 + (Class_ax.field_r_440 * 1952440023)) - 151, i_43_ + 1, 302, 32, 0);
					Rasterizer.fillRect((180 + (Class_ax.field_r_440 * 1952440023)) - 150, 2 + i_43_,
							Class_ax.field_as_430 * 1368539265, 30, 9179409);
					Rasterizer.fillRect(
							((1368539265 * Class_ax.field_as_430)
									+ (((1952440023 * Class_ax.field_r_440) + 180) - 150)),
							2 + i_43_, 300 - (1368539265 * Class_ax.field_as_430), 30, 0);
					class_hd.drawCenteredString(Class_ax.updateStatusText, ((1952440023 * Class_ax.field_r_440) + 180),
							276 - i_42_, 16777215, -1);
				}
				if ((824045845 * client.status) == 20) {
					Class_ax.field_z_427.render(
							((180 + (1952440023 * Class_ax.field_r_440)) - (Class_ax.field_z_427.field_z_533 / 2)),
							271 - (Class_ax.field_z_427.field_y_534 / 2));
					final int i_44_ = 211;
					class_hd.drawCenteredString(Class_ax.loginResponseMessage,
							180 + (Class_ax.field_r_440 * 1952440023), i_44_, 16776960, 0);
					int i_45_ = i_44_ + 15;
					class_hd.drawCenteredString(Class_ax.loginResponseMessage1,
							((1952440023 * Class_ax.field_r_440) + 180), i_45_, 16776960, 0);
					i_45_ += 15;
					class_hd.drawCenteredString(Class_ax.loginResponseMessage2,
							180 + (Class_ax.field_r_440 * 1952440023), i_45_, 16776960, 0);
					i_45_ += 15;
					i_45_ += 10;
					if ((Class_ax.loginScreenStatus * -1292322347) != 4) {
						class_hd.method_a_void(MenuText.field_he_1849,
								(((1952440023 * Class_ax.field_r_440) + 180) - 110), i_45_, 16777215, 0);
						final int i_46_ = 200;
						String string;
						for (string = Class_ax.username; class_hd.getTextWidth(string) > i_46_; string = string
								.substring(0, string.length() - 1)) {
							/* empty */
						}
						class_hd.method_a_void(TypeFace.method_m_String(string),
								((1952440023 * Class_ax.field_r_440) + 180) - 70, i_45_, 16777215, 0);
						i_45_ += 15;
						class_hd.method_a_void(
								new StringBuilder(MenuText.field_hi_2013)
										.append(Class_o.method_a_String(Class_ax.password, 702509539)).toString(),
								((1952440023 * Class_ax.field_r_440) + 180) - 108, i_45_, 16777215, 0);
						i_45_ += 15;
					}
				}
				if (((824045845 * client.status) == 10) || ((client.status * 824045845) == 11)) {
					Class_ax.field_z_427.render(Class_ax.field_r_440 * 1952440023, 171);
					if ((-1292322347 * Class_ax.loginScreenStatus) == 0) {
						final int i_47_ = 251;
						class_hd.drawCenteredString(MenuText.WELCOME_TEXT, 180 + (1952440023 * Class_ax.field_r_440),
								i_47_, 16776960, 0);
						int i_49_ = ((Class_ax.field_r_440 * 1952440023) + 180) - 80;
						final int i_50_ = 291;
						Class_ax.field_y_416.render(i_49_ - 73, i_50_ - 20);
						class_hd.method_u_int(MenuText.field_ic_2016, i_49_ - 73, i_50_ - 20, 144, 40, 16777215, 0, 1,
								1, 0);
						i_49_ = 260 + (1952440023 * Class_ax.field_r_440);
						Class_ax.field_y_416.render(i_49_ - 73, i_50_ - 20);
						class_hd.method_u_int(MenuText.field_iz_1997, i_49_ - 73, i_50_ - 20, 144, 40, 16777215, 0, 1,
								1, 0);
					} else if ((-1292322347 * Class_ax.loginScreenStatus) == 1) {
						class_hd.drawCenteredString(MenuText.field_hw_1814, (Class_ax.field_r_440 * 1952440023) + 180,
								211, 16776960, 0);
						final int i_51_ = 236;
						class_hd.drawCenteredString(Class_ax.loginResponseMessage,
								(1952440023 * Class_ax.field_r_440) + 180, i_51_, 16777215, 0);
						int i_52_ = i_51_ + 15;
						class_hd.drawCenteredString(Class_ax.loginResponseMessage1,
								(1952440023 * Class_ax.field_r_440) + 180, i_52_, 16777215, 0);
						i_52_ += 15;
						class_hd.drawCenteredString(Class_ax.loginResponseMessage2,
								180 + (1952440023 * Class_ax.field_r_440), i_52_, 16777215, 0);
						i_52_ += 15;
						int i_53_ = ((Class_ax.field_r_440 * 1952440023) + 180) - 80;
						final int i_54_ = 321;
						Class_ax.field_y_416.render(i_53_ - 73, i_54_ - 20);
						class_hd.drawCenteredString(MenuText.CONTINUE, i_53_, i_54_ + 5, 16777215, 0);
						i_53_ = 260 + (1952440023 * Class_ax.field_r_440);
						Class_ax.field_y_416.render(i_53_ - 73, i_54_ - 20);
						class_hd.drawCenteredString(MenuText.CANCEL, i_53_, i_54_ + 5, 16777215, 0);
					} else if ((-1292322347 * Class_ax.loginScreenStatus) == 2) {
						int i_55_ = 211;
						class_hd.drawCenteredString(Class_ax.loginResponseMessage,
								(Class_ax.field_r_440 * 1952440023) + 180, i_55_, 16776960, 0);
						int i_56_ = i_55_ + 15;
						class_hd.drawCenteredString(Class_ax.loginResponseMessage1,
								(Class_ax.field_r_440 * 1952440023) + 180, i_56_, 16776960, 0);
						i_56_ += 15;
						class_hd.drawCenteredString(Class_ax.loginResponseMessage2,
								180 + (1952440023 * Class_ax.field_r_440), i_56_, 16776960, 0);
						i_56_ += 15;
						i_56_ += 10;
						class_hd.method_a_void(MenuText.field_he_1849,
								((180 + (1952440023 * Class_ax.field_r_440)) - 110), i_56_, 16777215, 0);
						final int i_57_ = 200;
						String string;
						for (string = Class_ax.username; class_hd.getTextWidth(string) > i_57_; string = string
								.substring(1)) {
							/* empty */
						}
						class_hd.method_a_void(
								new StringBuilder(TypeFace.method_m_String(string))
										.append((((Class_ax.loginScreenSelectedFieldId * 169801349) == 0)
												& (((303796053 * client.currentCycle) % 40) < 20))
														? new StringBuilder(Class_r.colorString(16776960))
																.append(Class_d.field_z_856).toString()
														: "")
										.toString(),
								((1952440023 * Class_ax.field_r_440) + 180) - 70, i_56_, 16777215, 0);
						i_56_ += 15;
						class_hd.method_a_void(
								new StringBuilder(MenuText.field_hi_2013)
										.append(Class_o.method_a_String(Class_ax.password, 1381008393))
										.append((((169801349 * Class_ax.loginScreenSelectedFieldId) == 1)
												& (((client.currentCycle * 303796053) % 40) < 20))
														? new StringBuilder(Class_r.colorString(16776960))
																.append(Class_d.field_z_856).toString()
														: "")
										.toString(),
								((Class_ax.field_r_440 * 1952440023) + 180) - 108, i_56_, 16777215, 0);
						i_56_ += 15;
						int i_58_ = ((1952440023 * Class_ax.field_r_440) + 180) - 80;
						final int i_59_ = 321;
						Class_ax.field_y_416.render(i_58_ - 73, i_59_ - 20);
						class_hd.drawCenteredString(MenuText.field_ih_2018, i_58_, i_59_ + 5, 16777215, 0);
						i_58_ = 260 + (Class_ax.field_r_440 * 1952440023);
						Class_ax.field_y_416.render(i_58_ - 73, i_59_ - 20);
						class_hd.drawCenteredString(MenuText.CANCEL, i_58_, i_59_ + 5, 16777215, 0);
						i_55_ = 357;
						class_hd_15_.drawCenteredString(MenuText.field_io_2020,
								180 + (1952440023 * (Class_ax.field_r_440)), i_55_, 16776960, 0);
					} else if ((Class_ax.loginScreenStatus * -1292322347) == 4) {
						class_hd.drawCenteredString(MenuText.field_hu_2007, 180 + (Class_ax.field_r_440 * 1952440023),
								211, 16776960, 0);
						final int i_60_ = 236;
						class_hd.drawCenteredString(Class_ax.loginResponseMessage,
								(Class_ax.field_r_440 * 1952440023) + 180, i_60_, 16777215, 0);
						int i_61_ = i_60_ + 15;
						class_hd.drawCenteredString(Class_ax.loginResponseMessage1,
								180 + (Class_ax.field_r_440 * 1952440023), i_61_, 16777215, 0);
						i_61_ += 15;
						class_hd.drawCenteredString(Class_ax.loginResponseMessage2,
								180 + (1952440023 * Class_ax.field_r_440), i_61_, 16777215, 0);
						i_61_ += 15;
						class_hd.method_a_void(
								new StringBuilder(MenuText.field_hp_1948)
										.append(Class_o.method_a_String((Class_p.field_ah_1247), -1255105596)).append(
												((client.currentCycle * 303796053) % 40) < 20
														? new StringBuilder(Class_r.colorString(16776960))
																.append(Class_d.field_z_856).toString()
														: "")
										.toString(),
								(180 + (1952440023 * Class_ax.field_r_440)) - 108, i_61_, 16777215, 0);
						i_61_ -= 8;
						class_hd.method_a_void(MenuText.TRUST_THIS_COMPUTER,
								(180 + (Class_ax.field_r_440 * 1952440023)) - 9, i_61_, 16776960, 0);
						i_61_ += 15;
						class_hd.method_a_void(MenuText.FOR_THIRTY_DAYS,
								(180 + (Class_ax.field_r_440 * 1952440023)) - 9, i_61_, 16776960, 0);
						final int i_62_ = ((((Class_ax.field_r_440 * 1952440023) + 180) - 9)
								+ class_hd.getTextWidth(MenuText.FOR_THIRTY_DAYS) + 15);
						final int i_63_ = i_61_ - class_hd.field_f_3101;
						Sprite class_be;
						if (Class_ax.field_aq_439) {
							class_be = Friend.field_l_1095;
						} else {
							class_be = Class_ax.field_h_421;
						}
						class_be.render(i_62_, i_63_);
						i_61_ += 15;
						int i_64_ = (180 + (Class_ax.field_r_440 * 1952440023)) - 80;
						final int i_65_ = 321;
						Class_ax.field_y_416.render(i_64_ - 73, i_65_ - 20);
						class_hd.drawCenteredString(MenuText.CONTINUE, i_64_, i_65_ + 5, 16777215, 0);
						i_64_ = 180 + (Class_ax.field_r_440 * 1952440023) + 80;
						Class_ax.field_y_416.render(i_64_ - 73, i_65_ - 20);
						class_hd.drawCenteredString(MenuText.CANCEL, i_64_, i_65_ + 5, 16777215, 0);
						class_hd_15_.drawCenteredString(MenuText.field_hj_2008,
								180 + (1952440023 * (Class_ax.field_r_440)), 36 + i_65_, 255, 0);
					} else if ((-1292322347 * Class_ax.loginScreenStatus) == 5) {
						class_hd.drawCenteredString(MenuText.field_ik_2037, (1952440023 * Class_ax.field_r_440) + 180,
								201, 16776960, 0);
						final int i_66_ = 221;
						class_hd_16_.drawCenteredString(Class_ax.loginResponseMessage,
								180 + (1952440023 * Class_ax.field_r_440), i_66_, 16776960, 0);
						int i_67_ = i_66_ + 15;
						class_hd_16_.drawCenteredString(Class_ax.loginResponseMessage1,
								(1952440023 * Class_ax.field_r_440) + 180, i_67_, 16776960, 0);
						i_67_ += 15;
						class_hd_16_.drawCenteredString((Class_ax.loginResponseMessage2),
								(Class_ax.field_r_440 * 1952440023) + 180, i_67_, 16776960, 0);
						i_67_ += 15;
						i_67_ += 14;
						class_hd.method_a_void(MenuText.field_il_2022,
								((180 + (1952440023 * Class_ax.field_r_440)) - 145), i_67_, 16777215, 0);
						final int i_68_ = 174;
						String string;
						for (string = Class_ax.username; class_hd.getTextWidth(string) > i_68_; string = string
								.substring(1)) {
							/* empty */
						}
						class_hd.method_a_void(
								new StringBuilder(TypeFace.method_m_String(string))
										.append(((303796053 * client.currentCycle) % 40) < 20
												? new StringBuilder(Class_r.colorString(16776960))
														.append(Class_d.field_z_856).toString()
												: "")
										.toString(),
								((1952440023 * Class_ax.field_r_440) + 180) - 34, i_67_, 16777215, 0);
						i_67_ += 15;
						int i_69_ = (180 + (1952440023 * Class_ax.field_r_440)) - 80;
						final int i_70_ = 321;
						Class_ax.field_y_416.render(i_69_ - 73, i_70_ - 20);
						class_hd.drawCenteredString(MenuText.field_ip_2023, i_69_, 5 + i_70_, 16777215, 0);
						i_69_ = 80 + (1952440023 * Class_ax.field_r_440) + 180;
						Class_ax.field_y_416.render(i_69_ - 73, i_70_ - 20);
						class_hd.drawCenteredString(MenuText.field_iq_2024, i_69_, i_70_ + 5, 16777215, 0);
					} else if ((Class_ax.loginScreenStatus * -1292322347) == 6) {
						final int i_71_ = 211;
						class_hd.drawCenteredString(Class_ax.loginResponseMessage,
								(1952440023 * Class_ax.field_r_440) + 180, i_71_, 16776960, 0);
						int i_72_ = i_71_ + 15;
						class_hd.drawCenteredString(Class_ax.loginResponseMessage1,
								(1952440023 * Class_ax.field_r_440) + 180, i_72_, 16776960, 0);
						i_72_ += 15;
						class_hd.drawCenteredString(Class_ax.loginResponseMessage2,
								180 + (Class_ax.field_r_440 * 1952440023), i_72_, 16776960, 0);
						i_72_ += 15;
						final int i_73_ = (1952440023 * Class_ax.field_r_440) + 180;
						final int i_74_ = 321;
						Class_ax.field_y_416.render(i_73_ - 73, i_74_ - 20);
						class_hd.drawCenteredString(MenuText.field_iq_2024, i_73_, i_74_ + 5, 16777215, 0);
					}
				}
				if ((779184457 * Class_ax.field_al_429) > 0) {
					/*
					 * final int i_75_ = Class_ax.field_al_429 * 779184457; final int i_76_ = 256;
					 * Class_ax.field_ae_422 += -1931566720 * i_75_; if ((-510544021 *
					 * Class_ax.field_ae_422) > Class_al.field_w_182.length) { Class_ax.field_ae_422
					 * -= -1424376509 * Class_al.field_w_182.length; final int i_77_ = (int)
					 * (Math.random() * 12.0); Class_ei.method_f_void(Class_eg.field_e_2114[i_77_],
					 * (byte) 36); } int i_78_ = 0; final int i_79_ = 128 * i_75_; final int i_80_ =
					 * 128 * (i_76_ - i_75_); for (int i_81_ = 0; i_81_ < i_80_; i_81_++) { int
					 * i_82_ = (Class_o.field_ad_1236[i_79_ + i_78_] - ((i_75_ *
					 * (Class_al.field_w_182[((i_78_ + (Class_ax.field_ae_422 * -510544021)) &
					 * (Class_al.field_w_182.length - 1))])) / 6)); if (i_82_ < 0) { i_82_ = 0; }
					 * Class_o.field_ad_1236[i_78_++] = i_82_; } for (int i_83_ = i_76_ - i_75_;
					 * i_83_ < i_76_; i_83_++) { final int i_84_ = 128 * i_83_; for (int i_85_ = 0;
					 * i_85_ < 128; i_85_++) { final int i_86_ = (int) (Math.random() * 100.0); if
					 * ((i_86_ < 50) && (i_85_ > 10) && (i_85_ < 118)) { Class_o.field_ad_1236[i_84_
					 * + i_85_] = 255; } else { Class_o.field_ad_1236[i_85_ + i_84_] = 0; } } } if
					 * ((Class_ax.field_b_426 * -1235366567) > 0) { Class_ax.field_b_426 -= i_75_ *
					 * 334408612; } if ((-1845415271 * Class_ax.field_t_417) > 0) {
					 * Class_ax.field_t_417 -= i_75_ * 65799844; } if (((-1235366567 *
					 * Class_ax.field_b_426) == 0) && ((Class_ax.field_t_417 * -1845415271) == 0)) {
					 * final int i_87_ = (int) (Math.random() * (2000 / i_75_)); if (i_87_ == 0) {
					 * Class_ax.field_b_426 = -290741248; } if (i_87_ == 1) { Class_ax.field_t_417 =
					 * -335109120; } } for (int i_88_ = 0; i_88_ < (i_76_ - i_75_); i_88_++) {
					 * Class_ax.field_s_423[i_88_] = Class_ax.field_s_423[i_88_ + i_75_]; } for (int
					 * i_89_ = i_76_ - i_75_; i_89_ < i_76_; i_89_++) { Class_ax.field_s_423[i_89_]
					 * = (int) ((Math.sin(-891736089 * (Class_ax.field_ar_444) / 14.0) * 16.0) +
					 * (Math.sin(Class_ax.field_ar_444 * -891736089 / 15.0) * 14.0) +
					 * (Math.sin(-891736089 * (Class_ax.field_ar_444) / 16.0) * 12.0));
					 * Class_ax.field_ar_444 += 30176215; } Class_ax.field_ax_425 += i_75_ *
					 * -256811247; final int i_90_ = (((client.currentCycle * 303796053) & 0x1) +
					 * i_75_) / 2; if (i_90_ > 0) { for (int i_91_ = 0; i_91_ < (-666336732 *
					 * Class_ax.field_ax_425); i_91_++) { final int i_92_ = (int) (Math.random() *
					 * 124.0) + 2; final int i_93_ = (int) (Math.random() * 128.0) + 128;
					 * Class_o.field_ad_1236[(i_93_ << 7) + i_92_] = 192; } Class_ax.field_ax_425 =
					 * 0; for (int i_94_ = 0; i_94_ < i_76_; i_94_++) { int i_95_ = 0; final int
					 * i_96_ = 128 * i_94_; for (int i_97_ = -i_90_; i_97_ < 128; i_97_++) { if
					 * ((i_90_ + i_97_) < 128) { i_95_ += (Class_o.field_ad_1236[i_96_ + i_97_ +
					 * i_90_]); } if ((i_97_ - (1 + i_90_)) >= 0) { i_95_ -=
					 * (Class_o.field_ad_1236[(i_96_ + i_97_) - (1 + i_90_)]); } if (i_97_ >= 0) {
					 * Class_h.field_ak_1026[i_96_ + i_97_] = i_95_ / ((2 * i_90_) + 1); } } } for
					 * (int i_98_ = 0; i_98_ < 128; i_98_++) { int i_99_ = 0; for (int i_100_ =
					 * -i_90_; i_100_ < i_76_; i_100_++) { final int i_101_ = 128 * i_100_; if
					 * ((i_100_ + i_90_) < i_76_) { i_99_ += (Class_h.field_ak_1026[(i_90_ * 128) +
					 * i_101_ + i_98_]); } if ((i_100_ - (i_90_ + 1)) >= 0) { i_99_ -=
					 * (Class_h.field_ak_1026[((i_101_ + i_98_) - ((i_90_ + 1) * 128))]); } if
					 * (i_100_ >= 0) { Class_o.field_ad_1236[i_101_ + i_98_] = i_99_ / (1 + (2 *
					 * i_90_)); } } } } Class_ax.field_al_429 = 0;
					 */
				}
				final int i_102_ = 256;
				if ((Class_ax.field_b_426 * -1235366567) > 0) {
					for (int i_103_ = 0; i_103_ < 256; i_103_++) {
						if ((-1235366567 * Class_ax.field_b_426) > 768) {
							Menu.field_v_1537[i_103_] = (Class_dm.method_m_int(Class_du.field_c_1720[i_103_],
									Item.field_p_43[i_103_], 1024 - (-1235366567 * Class_ax.field_b_426), 58930602));
						} else if ((Class_ax.field_b_426 * -1235366567) > 256) {
							Menu.field_v_1537[i_103_] = Item.field_p_43[i_103_];
						} else {
							Menu.field_v_1537[i_103_] = (Class_dm.method_m_int(Item.field_p_43[i_103_],
									Class_du.field_c_1720[i_103_], 256 - (-1235366567 * Class_ax.field_b_426),
									648459012));
						}
					}
				} else if ((-1845415271 * Class_ax.field_t_417) > 0) {
					for (int i_104_ = 0; i_104_ < 256; i_104_++) {
						if ((Class_ax.field_t_417 * -1845415271) > 768) {
							Menu.field_v_1537[i_104_] = (Class_dm.method_m_int(Class_du.field_c_1720[i_104_],
									ISAACCipher.field_o_1659[i_104_], 1024 - (-1845415271 * Class_ax.field_t_417),
									-313787679));
						} else if ((Class_ax.field_t_417 * -1845415271) > 256) {
							Menu.field_v_1537[i_104_] = ISAACCipher.field_o_1659[i_104_];
						} else {
							Menu.field_v_1537[i_104_] = (Class_dm.method_m_int(ISAACCipher.field_o_1659[i_104_],
									Class_du.field_c_1720[i_104_], 256 - (-1845415271 * Class_ax.field_t_417),
									371790826));
						}
					}
				} else {
					for (int i_105_ = 0; i_105_ < 256; i_105_++) {
						Menu.field_v_1537[i_105_] = Class_du.field_c_1720[i_105_];
					}
				}
				Rasterizer.method_ce_void(Class_ax.field_d_415 * 1815701817, 9,
						((Class_ax.field_d_415 * 1815701817) + 128), 7 + i_102_);
				Class_v.field_g_1446.method_h_void(1815701817 * Class_ax.field_d_415, 0);
				Rasterizer.method_cf_void();
				int i_106_ = 0;
				int i_107_ = ((-1526721023 * Class_s.field_qj_1361.width) + (1815701817 * Class_ax.field_d_415));
				for (int i_108_ = 1; i_108_ < (i_102_ - 1); i_108_++) {
					final int i_109_ = (((i_102_ - i_108_) * Class_ax.field_s_423[i_108_]) / i_102_);
					int i_110_ = 22 + i_109_;
					if (i_110_ < 0) {
						i_110_ = 0;
					}
					i_106_ += i_110_;
					for (int i_111_ = i_110_; i_111_ < 128; i_111_++) {
						int i_112_ = Class_o.field_ad_1236[i_106_++];
						if (i_112_ != 0) {
							final int i_113_ = i_112_;
							final int i_114_ = 256 - i_112_;
							i_112_ = Menu.field_v_1537[i_112_];
							final int i_115_ = Class_s.field_qj_1361.pixels[i_107_];
							Class_s.field_qj_1361.pixels[i_107_++] = (((((i_112_ & 0xff00) * i_113_)
									+ (i_114_ * (i_115_ & 0xff00))) & 0xff0000)
									+ (((i_114_ * (i_115_ & 0xff00ff)) + (i_113_ * (i_112_ & 0xff00ff)))
											& ~0xff00ff)) >> 8;
						} else {
							i_107_++;
						}
					}
					i_107_ += (((Class_s.field_qj_1361.width * -2078510023) + i_110_) - 128);
				}
				Rasterizer.method_ce_void((765 + (1815701817 * Class_ax.field_d_415)) - 128, 9,
						(Class_ax.field_d_415 * 1815701817) + 765, i_102_ + 7);
				ImageColorModel.field_f_541.method_h_void(382 + (1815701817 * Class_ax.field_d_415), 0);
				Rasterizer.method_cf_void();
				i_106_ = 0;
				i_107_ = ((1815701817 * Class_ax.field_d_415) + 637 + 24 + (-1526721023 * Class_s.field_qj_1361.width));
				for (int i_116_ = 1; i_116_ < (i_102_ - 1); i_116_++) {
					final int i_117_ = ((Class_ax.field_s_423[i_116_] * (i_102_ - i_116_)) / i_102_);
					final int i_118_ = 103 - i_117_;
					i_107_ += i_117_;
					for (int i_119_ = 0; i_119_ < i_118_; i_119_++) {
						int i_120_ = Class_o.field_ad_1236[i_106_++];
						if (i_120_ != 0) {
							final int i_121_ = i_120_;
							final int i_122_ = 256 - i_120_;
							i_120_ = Menu.field_v_1537[i_120_];
							final int i_123_ = Class_s.field_qj_1361.pixels[i_107_];
							Class_s.field_qj_1361.pixels[i_107_++] = ((((i_122_ * (i_123_ & 0xff00))
									+ ((i_120_ & 0xff00) * i_121_)) & 0xff0000)
									+ ((((i_120_ & 0xff00ff) * i_121_) + (i_122_ * (i_123_ & 0xff00ff)))
											& ~0xff00ff)) >> 8;
						} else {
							i_107_++;
						}
					}
					i_106_ += 128 - i_118_;
					i_107_ += ((Class_s.field_qj_1361.width * -2078510023) - i_118_ - i_117_);
				}
				Class_ax.field_a_420[Class_w.field_pz_1501.field_y_783 ? 1 : 0]
						.render(((Class_ax.field_d_415 * 1815701817) + 765) - 40, 463);
				if (((client.status * 824045845) > 5) && ((client.hideWorldList * -1485158959) == 0)) {
					if (Class_ey.field_bo_2262 != null) {
						final int i_124_ = (Class_ax.field_d_415 * 1815701817) + 5;
						final int i_125_ = 463;
						final int i_126_ = 100;
						final int i_127_ = 35;
						Class_ey.field_bo_2262.render(i_124_, i_125_);
						class_hd.drawCenteredString(
								new StringBuilder(MenuText.field_fv_1845).append(" ")
										.append(client.currentWorld * 1536832127).toString(),
								i_124_ + (i_126_ / 2), (i_125_ + (i_127_ / 2)) - 2, 16777215, 0);
						if (Class_fp.field_h_2429 != null) {
							class_hd_15_.drawCenteredString(MenuText.field_jm_2055, (i_126_ / 2) + i_124_,
									(12 + (i_127_ / 2) + i_125_), 16777215, 0);
						} else {
							class_hd_15_.drawCenteredString(MenuText.field_jt_2056, i_124_ + (i_126_ / 2),
									(12 + (i_127_ / 2) + i_125_), 16777215, 0);
						}
					} else {
						Class_ey.field_bo_2262 = Class_ft.method_e_be(Class_cj.spriteIndex, "sl_button", "", 650361358);
					}
				}
				try {
					final Graphics graphics = ObjectComposite.canvas.getGraphics();
					Class_s.field_qj_1361.drawGraphics(graphics, 0, 0, (byte) 1);
				} catch (final Exception exception) {
					ObjectComposite.canvas.repaint();
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ao.e()");
		}
	}

	public static int method_z_int(final CharSequence charsequence, final int i, final byte i_128_) {
		int i_129_;
		try {
			i_129_ = Class_w.method_y_int(charsequence, i, true, (byte) -11);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ao.z()");
		}
		return i_129_;
	}

	static void method_e_void(final int i, final int i_130_, final int i_131_, final boolean bool, final int i_132_,
			final boolean bool_133_, final short i_134_) {
		try {
			if (i < i_130_) {
				final int i_135_ = (i_130_ + i) / 2;
				int i_136_ = i;
				final World worldinfo = World.worlds[i_135_];
				World.worlds[i_135_] = World.worlds[i_130_];
				World.worlds[i_130_] = worldinfo;
				for (int i_137_ = i; i_137_ < i_130_; i_137_++) {
					if (Region.method_g_int(World.worlds[i_137_], worldinfo, i_131_, bool, i_132_, bool_133_,
							-1638097860) <= 0) {
						final World worldinfo_138_ = World.worlds[i_137_];
						World.worlds[i_137_] = World.worlds[i_136_];
						World.worlds[i_136_++] = worldinfo_138_;
					}
				}
				World.worlds[i_130_] = World.worlds[i_136_];
				World.worlds[i_136_] = worldinfo;
				method_e_void(i, i_136_ - 1, i_131_, bool, i_132_, bool_133_, (short) -18540);
				method_e_void(1 + i_136_, i_130_, i_131_, bool, i_132_, bool_133_, (short) 11313);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ao.e()");
		}
	}
}
