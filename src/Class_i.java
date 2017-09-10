/* Class_i - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_i {
	static boolean field_y_1073;
	public static Class_bw field_q_1074;
	int length;
	static final int field_n_1076 = 100;
	GameMessage[] field_d_1077 = new GameMessage[100];
	static Sprite[] flags;
	static final int field_bo_1079 = 1002;
	public static final int field_at_1080 = 200;
	public static final int field_ci_1081 = 14;

	static final void method_ak_void(final int i) {
		try {
			final int i_0_ = ((-2103184911 * Class_ci.myPlayer.worldPosX) + (client.field_dz_2755 * -390279249));
			final int i_1_ = ((client.field_du_2751 * -1641779) + (Class_ci.myPlayer.worldPosY * 2088773389));
			if ((((643409593 * Vector3.field_fv_755) - i_0_) < -500) || (((643409593 * Vector3.field_fv_755) - i_0_) > 500) || (((Renderable.field_fn_764 * 1257968957) - i_1_) < -500) || (((1257968957 * Renderable.field_fn_764) - i_1_) > 500)) {
				Vector3.field_fv_755 = i_0_ * -623870071;
				Renderable.field_fn_764 = i_1_ * 785148437;
			}
			if ((643409593 * Vector3.field_fv_755) != i_0_) {
				Vector3.field_fv_755 += (((i_0_ - (643409593 * Vector3.field_fv_755)) / 16) * -623870071);
			}
			if ((Renderable.field_fn_764 * 1257968957) != i_1_) {
				Renderable.field_fn_764 += (((i_1_ - (Renderable.field_fn_764 * 1257968957)) / 16) * 785148437);
			}
			if (((2143958423 * MouseInputListener.field_f_2155) == 4) && Class_al.field_aw_178) {
				final int i_2_ = ((MouseInputListener.field_a_2157 * -2089478689) - (client.field_fp_2966 * 614164729));
				client.field_fy_2883 = -881315382 * i_2_;
				client.field_fp_2966 = ((i_2_ != -1) && (i_2_ != 1) ? ((MouseInputListener.field_a_2157 * -2089478689) + (614164729 * client.field_fp_2966)) / 2 : -2089478689 * MouseInputListener.field_a_2157) * -229320375;
				final int i_3_ = ((client.field_fc_2773 * 799740639) - (1515107729 * MouseInputListener.field_m_2156));
				client.field_ff_2771 = i_3_ * 1049116410;
				client.field_fc_2773 = ((i_3_ != -1) && (i_3_ != 1) ? ((799740639 * client.field_fc_2773) + (MouseInputListener.field_m_2156 * 1515107729)) / 2 : MouseInputListener.field_m_2156 * 1515107729) * 1864182047;
			} else {
				if (KeyFocusListener.field_cn_1676[96]) {
					client.field_ff_2771 += (((-24 - (client.field_ff_2771 * 19698133)) / 2) * -1622925443);
				} else if (KeyFocusListener.field_cn_1676[97]) {
					client.field_ff_2771 += (((24 - (19698133 * client.field_ff_2771)) / 2) * -1622925443);
				} else {
					client.field_ff_2771 = ((client.field_ff_2771 * 19698133) / 2) * -1622925443;
				}
				if (KeyFocusListener.field_cn_1676[98]) {
					client.field_fy_2883 += (((12 - (client.field_fy_2883 * -908204819)) / 2) * 1706825957);
				} else if (KeyFocusListener.field_cn_1676[99]) {
					client.field_fy_2883 += (1706825957 * ((-12 - (client.field_fy_2883 * -908204819)) / 2));
				} else {
					client.field_fy_2883 = ((-908204819 * client.field_fy_2883) / 2) * 1706825957;
				}
				client.field_fp_2966 = -1223081065 * MouseInputListener.field_a_2157;
				client.field_fc_2773 = -83282545 * MouseInputListener.field_m_2156;
			}
			client.miniMapAngle = ((((client.field_ff_2771 * 19698133) / 2) + (-2037472027 * client.miniMapAngle)) & 0x7ff) * -1179748115;
			client.field_ft_2707 += ((client.field_fy_2883 * -908204819) / 2) * 1142925941;
			if ((client.field_ft_2707 * 212686301) < 128) {
				client.field_ft_2707 = 265632384;
			}
			if ((212686301 * client.field_ft_2707) > 383) {
				client.field_ft_2707 = -346028789;
			}
			final int i_4_ = (Vector3.field_fv_755 * 643409593) >> 7;
			final int i_5_ = (1257968957 * Renderable.field_fn_764) >> 7;
			final int i_6_ = Class_q.getTileHeight(643409593 * Vector3.field_fv_755, 1257968957 * Renderable.field_fn_764, Class_ed.plane * 250114511);
			int i_7_ = 0;
			if ((i_4_ > 3) && (i_5_ > 3) && (i_4_ < 100) && (i_5_ < 100)) {
				for (int i_8_ = i_4_ - 4; i_8_ <= (4 + i_4_); i_8_++) {
					for (int i_9_ = i_5_ - 4; i_9_ <= (i_5_ + 4); i_9_++) {
						int i_10_ = Class_ed.plane * 250114511;
						if ((i_10_ < 3) && ((Region.sceneFlags[1][i_8_][i_9_] & 0x2) == 2)) {
							i_10_++;
						}
						final int i_11_ = i_6_ - Region.heightMaps[i_10_][i_8_][i_9_];
						if (i_11_ > i_7_) {
							i_7_ = i_11_;
						}
					}
				}
			}
			int i_12_ = i_7_ * 192;
			if (i_12_ > 98048) {
				i_12_ = 98048;
			}
			if (i_12_ < 32768) {
				i_12_ = 32768;
			}
			if (i_12_ > (652979521 * client.field_fu_2777)) {
				client.field_fu_2777 += (((i_12_ - (client.field_fu_2777 * 652979521)) / 24) * 2124407489);
			} else if (i_12_ < (client.field_fu_2777 * 652979521)) {
				client.field_fu_2777 += 2124407489 * ((i_12_ - (652979521 * client.field_fu_2777)) / 80);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "i.ak()");
		}
	}

	GameMessage method_n_as(final int i, final String string, final String string_13_, final String string_14_, final int i_15_) {
		GameMessage gamemessage;
		try {
			GameMessage gamemessage_16_ = this.field_d_1077[99];
			for (int i_17_ = -1220477329 * this.length; i_17_ > 0; i_17_--) {
				if (i_17_ != 100) {
					this.field_d_1077[i_17_] = this.field_d_1077[i_17_ - 1];
				}
			}
			if (gamemessage_16_ == null) {
				gamemessage_16_ = new GameMessage(i, string, string_14_, string_13_);
			} else {
				gamemessage_16_.removeLink();
				gamemessage_16_.update();
				gamemessage_16_.method_n_void(i, string, string_14_, string_13_, (byte) 11);
			}
			this.field_d_1077[0] = gamemessage_16_;
			if ((-1220477329 * this.length) < 100) {
				this.length += -1654906737;
			}
			gamemessage = gamemessage_16_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "i.n()");
		}
		return gamemessage;
	}

	GameMessage method_d_as(final int i, final int i_18_) {
		GameMessage gamemessage;
		try {
			gamemessage = ((i >= 0) && (i < (this.length * -1220477329)) ? this.field_d_1077[i] : null);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "i.d()");
		}
		return gamemessage;
	}

	int length() {
		int i_19_;
		try {
			i_19_ = -1220477329 * this.length;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "i.z()");
		}
		return i_19_;
	}

	Class_i() {
		/* empty */
	}

	static int method_z_int(final char c, final int i, final byte i_20_) {
		int i_21_;
		try {
			int i_22_ = c << 4;
			if (java.lang.Character.isUpperCase(c) || java.lang.Character.isTitleCase(c)) {
				final int i_23_ = java.lang.Character.toLowerCase(c);
				i_22_ = 1 + (i_23_ << 4);
			}
			i_21_ = i_22_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "i.z()");
		}
		return i_21_;
	}
}
