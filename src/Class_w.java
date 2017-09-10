/* Class_w - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_w {
	static final int field_an_1495 = 49;
	static final int field_d_1496 = 2;
	static final int field_e_1497 = 5;
	static final int field_f_1498 = 7;
	static final int field_a_1499 = 9;
	static final int field_h_1500 = 10;
	static Class_a field_pz_1501;
	static final int field_ad_1502 = 28;
	static final int field_ab_1503 = 35;
	static byte[][] landscapeDataBuffer;
	static final int field_n_1505 = 1;
	static final int field_x_1506 = 15;
	static final int field_y_1507 = 1;
	public static final int field_z_1508 = 37;
	static final int field_ax_1509 = 31;
	public static final int field_di_1510 = 129;
	public static final int field_m_1511 = 12;

	Class_w() throws Throwable {
		throw new Error();
	}

	public static void method_s_void(final boolean bool, final byte i) {
		try {
			if (Class_fk.field_g_2387 != bool) {
				ISAACCipher.method_r_void(-1473801907);
				Class_fk.field_g_2387 = bool;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "w.s()");
		}
	}

	static final void method_ar_void(final Actor character, final byte i) {
		try {
			if (((976491907 * character.forcedReturnSpeed) == (client.currentCycle * 303796053)) || ((character.animation * 1529361367) == -1) || ((1103217729 * character.animationDelay) != 0)
					|| ((1 + (character.field_bw_248 * 44363807)) > (OnDemandNode.getAnimationSequence(character.animation * 1529361367).frames[(character.field_bo_247 * -1957976047)]))) {
				final int rs = ((976491907 * character.forcedReturnSpeed) - (character.forcedToSpeed * -408703439));
				final int ts = ((303796053 * client.currentCycle) - (-408703439 * character.forcedToSpeed));
				final int ffx = ((-2135025024 * character.forcedFirstX) + (-1401454912 * character.size));
				final int ffy = ((-1401454912 * character.size) + (1555031168 * character.forcedFirstY));
				final int fsx = ((character.forcedSecondX * 1526931072) + (character.size * -1401454912));
				final int fsy = ((1032721024 * character.forcedSecondY) + (character.size * -1401454912));
				character.worldPosX = -585310447 * (((fsx * ts) + (ffx * (rs - ts))) / rs);
				character.worldPosY = 359464901 * (((ffy * (rs - ts)) + (fsy * ts)) / rs);
			}
			character.field_cj_272 = 0;
			if ((character.forcedDirection * -900700599) == 0) {
				character.orientation = 1122753536;
			}
			if ((character.forcedDirection * -900700599) == 1) {
				character.orientation = 1684130304;
			}
			if ((character.forcedDirection * -900700599) == 2) {
				character.orientation = 0;
			}
			if ((character.forcedDirection * -900700599) == 3) {
				character.orientation = 561376768;
			}
			character.field_b_217 = 1344832243 * character.orientation;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "w.ar()");
		}
	}

	public static Sprite[] getSpriteArray(final FileStore class_fs, final String string, final String string_6_) {
		Sprite[] class_bes;
		try {
			final int i_7_ = class_fs.getByName(string);
			final int i_8_ = class_fs.getFileIndex(i_7_, string_6_);

			class_bes = Class_bg.method_n_beArray(class_fs, i_7_, i_8_, -1202472728);

//			if (string.equals("mod_icons")) {
//				final int i = class_fs.getByName("pewp");
//				final int j = class_fs.getFileIndex(i, string_6_);
//
//				Sprite[] sprites = Class_bg.method_n_beArray(class_fs, i, j, -1202472728);
//
//				Sprite[] newSprites = new Sprite[class_bes.length + sprites.length];
//
//				int index = 0;
//				for (; index < class_bes.length; index++) {
//					newSprites[index] = class_bes[index];
//				}
//
//				for (int f = 0; f < sprites.length; f++) {
//					newSprites[index + f] = sprites[f];
//				}
//				return newSprites;
//			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "w.y()");
		}
		return class_bes;
	}

	public static int method_y_int(final CharSequence charsequence, final int i, final boolean bool, final byte i_9_) {
		try {
			if ((i >= 2) && (i <= 36)) {
				boolean bool_10_ = false;
				boolean bool_11_ = false;
				int i_12_ = 0;
				final int i_13_ = charsequence.length();
				for (int i_14_ = 0; i_14_ < i_13_; i_14_++) {
					final int i_15_ = charsequence.charAt(i_14_);
					if (i_14_ == 0) {
						if (i_15_ == 45) {
							bool_10_ = true;
							continue;
						}
						if ((i_15_ == 43) && bool) {
							continue;
						}
					}
					int i_16_;
					if ((i_15_ >= 48) && (i_15_ <= 57)) {
						i_16_ = i_15_ - 48;
					} else if ((i_15_ >= 65) && (i_15_ <= 90)) {
						i_16_ = i_15_ - 55;
					} else {
						if ((i_15_ < 97) || (i_15_ > 122)) {
							throw new NumberFormatException();
						}
						i_16_ = i_15_ - 87;
					}
					if (i_16_ >= i) {
						throw new NumberFormatException();
					}
					if (bool_10_) {
						i_16_ = -i_16_;
					}
					final int i_17_ = (i * i_12_) + i_16_;
					if ((i_17_ / i) != i_12_) {
						throw new NumberFormatException();
					}
					i_12_ = i_17_;
					bool_11_ = true;
				}
				if (!bool_11_) {
					throw new NumberFormatException();
				}
				return i_12_;
			}
			throw new IllegalArgumentException("");
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "w.y()");
		}
	}
}
