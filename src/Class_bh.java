/* Class_bh - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_bh {
	int field_y_556;
	static final int field_z_557 = 6;
	static int[] field_u_558;
	static final int field_d_559 = 7;
	int field_e_560;
	int[][] field_g_561;
	static final int field_n_562 = 14;
	static final int field_bx_563 = 91;
	static int[] field_k_564;
	public static final int field_fu_565 = 2;

	public Class_bh(int i, int i_0_) {
		if (i != i_0_) {
			final int i_1_ = Player.method_n_int(i, i_0_, 44599298);
			i /= i_1_;
			i_0_ /= i_1_;
			this.field_y_556 = i * -2104886601;
			this.field_e_560 = 97884107 * i_0_;
			this.field_g_561 = new int[i][14];
			for (int i_2_ = 0; i_2_ < i; i_2_++) {
				final int[] is = this.field_g_561[i_2_];
				final double d = ((double) i_2_ / (double) i) + 6.0;
				int i_3_ = (int) Math.floor(1.0 + (d - 7.0));
				if (i_3_ < 0) {
					i_3_ = 0;
				}
				int i_4_ = (int) Math.ceil(7.0 + d);
				if (i_4_ > 14) {
					i_4_ = 14;
				}
				final double d_5_ = (double) i_0_ / (double) i;
				for (/**/; i_3_ < i_4_; i_3_++) {
					final double d_6_ = (i_3_ - d) * 3.141592653589793;
					double d_7_ = d_5_;
					if ((d_6_ < -1.0E-4) || (d_6_ > 1.0E-4)) {
						d_7_ = d_5_ * (Math.sin(d_6_) / d_6_);
					}
					d_7_ *= 0.54 + (0.46 * Math.cos((i_3_ - d) * 0.2243994752564138));
					is[i_3_] = (int) Math.floor((d_7_ * 65536.0) + 0.5);
				}
			}
		}
	}

	byte[] method_n_byteArray(byte[] is, final int i) {
		byte[] is_8_;
		try {
			if (this.field_g_561 != null) {
				final int i_9_ = 14 + (int) (((long) is.length * (long) (this.field_e_560 * 706500067)) / (this.field_y_556 * -1878654201));
				final int[] is_10_ = new int[i_9_];
				int i_11_ = 0;
				int i_12_ = 0;
				for (final byte i_14_ : is) {
					final int[] is_15_ = this.field_g_561[i_12_];
					for (int i_16_ = 0; i_16_ < 14; i_16_++) {
						is_10_[i_16_ + i_11_] += i_14_ * is_15_[i_16_];
					}
					i_12_ += 706500067 * this.field_e_560;
					final int i_17_ = i_12_ / (-1878654201 * this.field_y_556);
					i_11_ += i_17_;
					i_12_ -= this.field_y_556 * -1878654201 * i_17_;
				}
				is = new byte[i_9_];
				for (int i_18_ = 0; i_18_ < i_9_; i_18_++) {
					final int i_19_ = (is_10_[i_18_] + 32768) >> 16;
				if (i_19_ < -128) {
					is[i_18_] = (byte) -128;
				} else if (i_19_ > 127) {
					is[i_18_] = (byte) 127;
				} else {
					is[i_18_] = (byte) i_19_;
				}
				}
			}
			is_8_ = is;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "bh.n()");
		}
		return is_8_;
	}

	int method_d_int(int i, final byte i_20_) {
		int i_21_;
		try {
			if (this.field_g_561 != null) {
				i = (int) (((long) i * (long) (706500067 * this.field_e_560)) / (this.field_y_556 * -1878654201));
			}
			i_21_ = i;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "bh.d()");
		}
		return i_21_;
	}

	int method_z_int(int i, final int i_22_) {
		int i_23_;
		try {
			if (this.field_g_561 != null) {
				i = 6 + (int) (((long) i * (long) (706500067 * this.field_e_560)) / (-1878654201 * this.field_y_556));
			}
			i_23_ = i;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "bh.z()");
		}
		return i_23_;
	}

	public static Class_hd method_z_hd(final FileStore class_fs, final FileStore class_fs_24_, final int i, final int i_25_, final int i_26_) {
		Class_hd class_hd;
		try {
			if (!Region.method_h_boolean(class_fs, i, i_25_, 1079958178)) {
				return null;
			}
			final byte[] is = class_fs_24_.getArchive(i, i_25_);
			Class_hd class_hd_27_;
			if (is == null) {
				class_hd_27_ = null;
			} else {
				final Class_hd class_hd_28_ = new Class_hd(is, Class_bk.field_y_579, Class_bk.field_e_580, Class_fv.field_g_2506, Class_bk.field_f_581, Class_l.field_m_1134, Class_bk.field_a_585);
				ItemComposite.method_u_void(-1231170034);
				class_hd_27_ = class_hd_28_;
			}
			class_hd = class_hd_27_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "bh.z()");
		}
		return class_hd;
	}

	static void method_z_void(final int i) {
		try {
			SeekableFile class_hh = null;
			try {
				class_hh = Class_ab.getSeekableFile("", client.game.codename, true, (byte) -30);
				final Buffer rsbytebuffer = Class_w.field_pz_1501.method_d_dl(681055610);
				class_hh.method_d_void(rsbytebuffer.buffer, 0, -1485345105 * rsbytebuffer.position, (byte) 6);
			} catch (final Exception exception) {
				/* empty */
			}
			try {
				if (class_hh != null) {
					class_hh.close();
				}
			} catch (final Exception exception) {
				/* empty */
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "bh.z()");
		}
	}
}
