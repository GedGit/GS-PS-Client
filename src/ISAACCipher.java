/* Class_dn - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class ISAACCipher {
	int field_m_1649;
	int[] field_g_1650 = new int[256];
	static final int field_z_1651 = 1020;
	int field_y_1652;
	int[] field_e_1653 = new int[256];
	static final int field_n_1654 = 8;
	int field_f_1655;
	static final int field_d_1656 = 256;
	int field_a_1657;
	static final int field_ah_1658 = 44;
	static int[] field_o_1659;
	static final int field_h_1660 = 5;

	final int next(final int i) {
		int i_0_;
		try {
			if ((((this.field_y_1652 -= 455675877) * -32729619) + 1) == 0) {
				method_d_void(-1093909800);
				this.field_y_1652 = 233231643;
			}
			i_0_ = (this.field_e_1653[-32729619 * this.field_y_1652]);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dn.n()");
		}
		return i_0_;
	}

	final void method_d_void(final int i) {
		try {
			this.field_m_1649 += (this.field_a_1657 += -980551791) * 1985599571;
			for (int i_1_ = 0; i_1_ < 256; i_1_++) {
				final int i_2_ = this.field_g_1650[i_1_];
				if ((i_1_ & 0x2) == 0) {
					if ((i_1_ & 0x1) == 0) {
						this.field_f_1655 = (2063125359 * ((this.field_f_1655 * 852816783) ^ ((this.field_f_1655 * 852816783) << 13)));
					} else {
						this.field_f_1655 = (2063125359 * ((this.field_f_1655 * 852816783) ^ ((852816783 * this.field_f_1655) >>> 6)));
					}
				} else if ((i_1_ & 0x1) == 0) {
					this.field_f_1655 = (2063125359 * ((852816783 * this.field_f_1655) ^ ((this.field_f_1655 * 852816783) << 2)));
				} else {
					this.field_f_1655 = ((this.field_f_1655 * 852816783) ^ ((this.field_f_1655 * 852816783) >>> 16)) * 2063125359;
				}
				this.field_f_1655 += (this.field_g_1650[(128 + i_1_) & 0xff] * 2063125359);
				int i_3_;
				this.field_g_1650[i_1_] = i_3_ = ((this.field_m_1649 * 451800747) + this.field_g_1650[(i_2_ & 0x3fc) >> 2] + (852816783 * this.field_f_1655));
				this.field_e_1653[i_1_] = (this.field_m_1649 = -1118659581 * ((this.field_g_1650[((i_3_ >> 8) & 0x3fc) >> 2]) + i_2_)) * 451800747;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dn.d()");
		}
	}

	final void method_z_void(final byte i) {
		try {
			int i_4_ = -1640531527;
			int i_5_ = -1640531527;
			int i_6_ = -1640531527;
			int i_7_ = -1640531527;
			int i_8_ = -1640531527;
			int i_9_ = -1640531527;
			int i_10_ = -1640531527;
			int i_11_ = -1640531527;
			for (int i_12_ = 0; i_12_ < 4; i_12_++) {
				i_11_ ^= i_10_ << 11;
				i_8_ += i_11_;
				i_10_ += i_9_;
				i_10_ ^= i_9_ >>> 2;
				i_7_ += i_10_;
				i_9_ += i_8_;
				i_9_ ^= i_8_ << 8;
				i_6_ += i_9_;
				i_8_ += i_7_;
				i_8_ ^= i_7_ >>> 16;
				i_5_ += i_8_;
				i_7_ += i_6_;
				i_7_ ^= i_6_ << 10;
				i_4_ += i_7_;
				i_6_ += i_5_;
				i_6_ ^= i_5_ >>> 4;
				i_11_ += i_6_;
				i_5_ += i_4_;
				i_5_ ^= i_4_ << 8;
				i_10_ += i_5_;
				i_4_ += i_11_;
				i_4_ ^= i_11_ >>> 9;
				i_9_ += i_4_;
				i_11_ += i_10_;
			}
			for (int i_13_ = 0; i_13_ < 256; i_13_ += 8) {
				i_11_ += this.field_e_1653[i_13_];
				i_10_ += this.field_e_1653[i_13_ + 1];
				i_9_ += this.field_e_1653[2 + i_13_];
				i_8_ += this.field_e_1653[3 + i_13_];
				i_7_ += this.field_e_1653[4 + i_13_];
				i_6_ += this.field_e_1653[5 + i_13_];
				i_5_ += this.field_e_1653[i_13_ + 6];
				i_4_ += this.field_e_1653[7 + i_13_];
				i_11_ ^= i_10_ << 11;
				i_8_ += i_11_;
				i_10_ += i_9_;
				i_10_ ^= i_9_ >>> 2;
				i_7_ += i_10_;
				i_9_ += i_8_;
				i_9_ ^= i_8_ << 8;
				i_6_ += i_9_;
				i_8_ += i_7_;
				i_8_ ^= i_7_ >>> 16;
				i_5_ += i_8_;
				i_7_ += i_6_;
				i_7_ ^= i_6_ << 10;
				i_4_ += i_7_;
				i_6_ += i_5_;
				i_6_ ^= i_5_ >>> 4;
				i_11_ += i_6_;
				i_5_ += i_4_;
				i_5_ ^= i_4_ << 8;
				i_10_ += i_5_;
				i_4_ += i_11_;
				i_4_ ^= i_11_ >>> 9;
				i_9_ += i_4_;
				i_11_ += i_10_;
				this.field_g_1650[i_13_] = i_11_;
				this.field_g_1650[1 + i_13_] = i_10_;
				this.field_g_1650[2 + i_13_] = i_9_;
				this.field_g_1650[i_13_ + 3] = i_8_;
				this.field_g_1650[i_13_ + 4] = i_7_;
				this.field_g_1650[i_13_ + 5] = i_6_;
				this.field_g_1650[6 + i_13_] = i_5_;
				this.field_g_1650[i_13_ + 7] = i_4_;
			}
			for (int i_14_ = 0; i_14_ < 256; i_14_ += 8) {
				i_11_ += this.field_g_1650[i_14_];
				i_10_ += this.field_g_1650[i_14_ + 1];
				i_9_ += this.field_g_1650[2 + i_14_];
				i_8_ += this.field_g_1650[i_14_ + 3];
				i_7_ += this.field_g_1650[4 + i_14_];
				i_6_ += this.field_g_1650[5 + i_14_];
				i_5_ += this.field_g_1650[6 + i_14_];
				i_4_ += this.field_g_1650[7 + i_14_];
				i_11_ ^= i_10_ << 11;
				i_8_ += i_11_;
				i_10_ += i_9_;
				i_10_ ^= i_9_ >>> 2;
				i_7_ += i_10_;
				i_9_ += i_8_;
				i_9_ ^= i_8_ << 8;
				i_6_ += i_9_;
				i_8_ += i_7_;
				i_8_ ^= i_7_ >>> 16;
				i_5_ += i_8_;
				i_7_ += i_6_;
				i_7_ ^= i_6_ << 10;
				i_4_ += i_7_;
				i_6_ += i_5_;
				i_6_ ^= i_5_ >>> 4;
				i_11_ += i_6_;
				i_5_ += i_4_;
				i_5_ ^= i_4_ << 8;
				i_10_ += i_5_;
				i_4_ += i_11_;
				i_4_ ^= i_11_ >>> 9;
				i_9_ += i_4_;
				i_11_ += i_10_;
				this.field_g_1650[i_14_] = i_11_;
				this.field_g_1650[1 + i_14_] = i_10_;
				this.field_g_1650[i_14_ + 2] = i_9_;
				this.field_g_1650[3 + i_14_] = i_8_;
				this.field_g_1650[4 + i_14_] = i_7_;
				this.field_g_1650[i_14_ + 5] = i_6_;
				this.field_g_1650[i_14_ + 6] = i_5_;
				this.field_g_1650[i_14_ + 7] = i_4_;
			}
			method_d_void(-595296277);
			this.field_y_1652 = 688907520;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dn.z()");
		}
	}

	ISAACCipher(final int[] is) {
		for (int i = 0; i < is.length; i++) {
			this.field_e_1653[i] = is[i];
		}
		method_z_void((byte) 13);
	}

	public static void method_r_void(final int i) {
		try {
			ItemComposite.ITEMS.method_y_void();
			ItemComposite.field_a_111.method_y_void();
			ItemComposite.field_h_112.method_y_void();
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dn.r()");
		}
	}
}
