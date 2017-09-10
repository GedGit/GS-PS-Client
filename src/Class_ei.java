/* Class_ei - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class_ei {
	static final char[] field_n_2127 = { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
	static final int field_cz_2128 = 103;
	public static final int field_x_2129 = 2;
	static final int field_au_2130 = 57;

	static final void method_f_void(final Sprite class_be, final byte i) {
		try {
			final int i_0_ = 256;
			for (int i_1_ = 0; i_1_ < Class_al.field_w_182.length; i_1_++) {
				Class_al.field_w_182[i_1_] = 0;
			}
			for (int i_2_ = 0; i_2_ < 5000; i_2_++) {
				final int i_3_ = (int) (Math.random() * 128.0 * i_0_);
				Class_al.field_w_182[i_3_] = (int) (Math.random() * 256.0);
			}
			for (int i_4_ = 0; i_4_ < 20; i_4_++) {
				for (int i_5_ = 1; i_5_ < (i_0_ - 1); i_5_++) {
					for (int i_6_ = 1; i_6_ < 127; i_6_++) {
						final int i_7_ = (i_5_ << 7) + i_6_;
						SceneTile.field_i_1122[i_7_] = (Class_al.field_w_182[128 + i_7_] + Class_al.field_w_182[i_7_ - 1] + Class_al.field_w_182[i_7_ + 1] + Class_al.field_w_182[i_7_ - 128]) / 4;
					}
				}
				final int[] is = Class_al.field_w_182;
				Class_al.field_w_182 = SceneTile.field_i_1122;
				SceneTile.field_i_1122 = is;
			}
			if (class_be != null) {
				int i_8_ = 0;
				for (int i_9_ = 0; i_9_ < class_be.field_y_534; i_9_++) {
					for (int i_10_ = 0; i_10_ < class_be.field_z_533; i_10_++) {
						if (class_be.field_n_531[i_8_++] != 0) {
							final int i_11_ = 16 + i_10_ + class_be.field_e_535;
							final int i_12_ = i_9_ + 16 + class_be.field_g_537;
							final int i_13_ = (i_12_ << 7) + i_11_;
							Class_al.field_w_182[i_13_] = 0;
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ei.f()");
		}
	}

	Class_ei() throws Throwable {
		throw new Error();
	}

	static final String[] method_dr_StringArray(final String[] strings, final byte i) {
		String[] strings_14_;
		try {
			final String[] strings_15_ = new String[5];
			for (int i_16_ = 0; i_16_ < 5; i_16_++) {
				strings_15_[i_16_] = new StringBuilder(String.valueOf(i_16_)).append(": ").toString();
				if ((strings != null) && (strings[i_16_] != null)) {
					strings_15_[i_16_] = new StringBuilder(strings_15_[i_16_]).append(strings[i_16_]).toString();
				}
			}
			strings_14_ = strings_15_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ei.dr()");
		}
		return strings_14_;
	}

	static final void method_w_void(final byte i) {
		try {
			for (int i_17_ = -1; i_17_ < (2000365659 * client.localPlayerCount); i_17_++) {
				int i_18_;
				if (i_17_ == -1) {
					i_18_ = 2047;
				} else {
					i_18_ = client.playerIndexArray[i_17_];
				}
				final Player player = client.localPlayers[i_18_];
				if ((player != null) && ((1533298799 * player.field_az_231) > 0)) {
					player.field_az_231 -= 73275023;
					if ((player.field_az_231 * 1533298799) == 0) {
						player.speech = null;
					}
				}
			}
			for (int i_19_ = 0; i_19_ < (client.localNpcCount * 1308149425); i_19_++) {
				final int i_20_ = client.npcIndexArray[i_19_];
				final Npc npc = client.npcs[i_20_];
				if ((npc != null) && ((1533298799 * npc.field_az_231) > 0)) {
					npc.field_az_231 -= 73275023;
					if ((1533298799 * npc.field_az_231) == 0) {
						npc.speech = null;
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ei.w()");
		}
	}
}
