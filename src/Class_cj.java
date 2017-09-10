/* Class_cj - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_cj {
	int field_n_1014;
	int field_d_1015;
	int field_y_1016;
	static Index spriteIndex;
	static final int field_s_1018 = 0;
	public static final int field_ch_1019 = 56;
	public static final int field_de_1020 = 7;

	public static byte[] encodeRS2String(final CharSequence charsequence, final byte i) {
		byte[] is;
		try {
			final int i_0_ = charsequence.length();
			final byte[] is_1_ = new byte[i_0_];
			for (int i_2_ = 0; i_2_ < i_0_; i_2_++) {
				final char c = charsequence.charAt(i_2_);
				if (((c <= 0) || (c >= '\u0080')) && ((c < '\u00a0') || (c > '\u00ff'))) {
					if (c == '\u20ac') {
						is_1_[i_2_] = (byte) -128;
					} else if (c == '\u201a') {
						is_1_[i_2_] = (byte) -126;
					} else if (c == '\u0192') {
						is_1_[i_2_] = (byte) -125;
					} else if (c == '\u201e') {
						is_1_[i_2_] = (byte) -124;
					} else if (c == '\u2026') {
						is_1_[i_2_] = (byte) -123;
					} else if (c == '\u2020') {
						is_1_[i_2_] = (byte) -122;
					} else if (c == '\u2021') {
						is_1_[i_2_] = (byte) -121;
					} else if (c == '\u02c6') {
						is_1_[i_2_] = (byte) -120;
					} else if (c == '\u2030') {
						is_1_[i_2_] = (byte) -119;
					} else if (c == '\u0160') {
						is_1_[i_2_] = (byte) -118;
					} else if (c == '\u2039') {
						is_1_[i_2_] = (byte) -117;
					} else if (c == '\u0152') {
						is_1_[i_2_] = (byte) -116;
					} else if (c == '\u017d') {
						is_1_[i_2_] = (byte) -114;
					} else if (c == '\u2018') {
						is_1_[i_2_] = (byte) -111;
					} else if (c == '\u2019') {
						is_1_[i_2_] = (byte) -110;
					} else if (c == '\u201c') {
						is_1_[i_2_] = (byte) -109;
					} else if (c == '\u201d') {
						is_1_[i_2_] = (byte) -108;
					} else if (c == '\u2022') {
						is_1_[i_2_] = (byte) -107;
					} else if (c == '\u2013') {
						is_1_[i_2_] = (byte) -106;
					} else if (c == '\u2014') {
						is_1_[i_2_] = (byte) -105;
					} else if (c == '\u02dc') {
						is_1_[i_2_] = (byte) -104;
					} else if (c == '\u2122') {
						is_1_[i_2_] = (byte) -103;
					} else if (c == '\u0161') {
						is_1_[i_2_] = (byte) -102;
					} else if (c == '\u203a') {
						is_1_[i_2_] = (byte) -101;
					} else if (c == '\u0153') {
						is_1_[i_2_] = (byte) -100;
					} else if (c == '\u017e') {
						is_1_[i_2_] = (byte) -98;
					} else if (c == '\u0178') {
						is_1_[i_2_] = (byte) -97;
					} else {
						is_1_[i_2_] = (byte) 63;
					}
				} else {
					is_1_[i_2_] = (byte) c;
				}
			}
			is = is_1_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "cj.z()");
		}
		return is;
	}

	private static int[] items = new int[] { 6944, 7409, 4483, 11744, 11748, 24101, 24347, 25808, 26707, 27249, 27251,
			27264, 27253, 27291, 18491, 21301, 10058, 6943, 27718, 27719, 27720, 27721, 7478, 10060, 14886, 10562,
			28861 };

	public static ObjectComposite getObjectComposite(final int i) {
		ObjectComposite objectdef;
		try {
			ObjectComposite def = (ObjectComposite) ObjectComposite.OBJECTS.method_n_gb(i);
			if (def != null) {
				return def;
			}
			final byte[] is = ObjectComposite.configArchiveRef.getArchive(6, i);
			def = new ObjectComposite();
			def.id = i * 10832971;
			if (is != null) {
				def.decode(new Buffer(is), 1912276951);
			}
			if (i == 27271) {
				def.name = "Wilderness Chest (Easy)";
			}
			if (i == 27282) {
				def.name = "Wilderness Chest (Medium)";
			}
			if (i == 27284) {
				def.name = "Wilderness Chest (Hard)";
			}
			if (i == 27288) {
				def.name = "Wilderness Chest (Elite)";
			}
			if (i == 6552) {
				def.name = "Ancient Altar";
				def.actions[0] = "Pray";
			}
			if (i == 27029) {
				def.name = "The Font of Consumption";
				def.actions[0] = "Offer Unsired";
			}
			if (i == 7434) {
				def.name = "Clock of Enhancement";
				def.actions[0] = "View time";
			}
			if (i == 20331) {
				def.name = "Dagger Stall";// 85
				def.actions[0] = "Steal from";
			}
			if (i == 20332) {
				def.name = "Crafting Stall";// 20
				def.actions[0] = "Steal from";
			}
			if (i == 20344) {
				def.name = "Silk Stall";// 50.
				def.actions[0] = "Steal from";
			}
			if (i == 20345) {
				def.name = "Bakery Stall";// 1
				def.actions[0] = "Steal from";
			}
			if (i == 20346) {
				def.name = "Gem Stall";// 75
				def.actions[0] = "Steal from";
			}
			if (i == 12309) { // rfd chest
				def.actions[0] = "Open-bank";
				def.actions[1] = "Buy-items";
				def.actions[2] = "Buy-food";
				def.actions[3] = null;
				def.actions[4] = null;
			}
			if (i == 29150) { // home occult altar
				def.actions[0] = "Pray";
				def.actions[1] = null;
				def.actions[2] = null;
				def.actions[3] = null;
				def.actions[4] = null;
			}
			// actions[2] translates to option3 server-side
			int[] var3 = items;
			int var4 = var3.length;
			for (int var5 = 0; var5 < var4; ++var5) {
				int var6 = var3[var5];
				if (i == var6) {
					def.actions[2] = null;
				}
			}

			def.method_z_void((short) 2873);
			if (def.field_aw_353) {
				def.field_v_328 = 0;
				def.field_c_341 = false;
			}
			ObjectComposite.OBJECTS.method_z_void(def, i);
			objectdef = def;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "cj.d()");
		}
		return objectdef;
	}

	Class_cj() {
		/* empty */
	}

	public static boolean method_g_boolean(final int i, final byte i_5_) {
		boolean bool;
		try {
			if (((i >> 29) & 0x1) != 0) {
				return true;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "cj.g()");
		}
		return bool;
	}
}
