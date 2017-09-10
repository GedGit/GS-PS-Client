/* RsByteBuffer - Decompiled by JODE
//life
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLConnection;

public class Buffer extends Node {
	public byte[] buffer;
	public int position;
	static int[] field_z_1630 = new int[256];
	static final int field_y_1631 = -306674912;
	public static final int field_g_1632 = 5000;
	public static final int field_ak_1633 = 127;
	public static final int field_ac_1634 = 215;
	public static final int field_ag_1635 = 55;
	public static final int field_gp_1636 = 180;
	static final int field_bw_1637 = 1003;

	static {
		for (int i = 0; i < 256; i++) {
			int i_0_ = i;
			for (int i_1_ = 0; i_1_ < 8; i_1_++) {
				if ((i_0_ & 0x1) == 1) {
					i_0_ = (i_0_ >>> 1) ^ ~0x12477cdf;
				} else {
					i_0_ >>>= 1;
				}
			}
			field_z_1630[i] = i_0_;
		}
	}

	public void put(final int i) {
		try {
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) i;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.d()");
		}
	}

	public void putShort(final int i) {
		try {
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) (i >> 8);
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) i;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.z()");
		}
	}

	public void getReverseA(final byte[] is, final int start, final int end,
			final int i_5_) {
		try {
			for (int index = (end + start) - 1; index >= start; index--) {
				is[index] = (byte) (buffer[((position += -685856689) * -1485345105) - 1] - 128);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.by()");
		}
	}

	public void putInt(final int i) {
		try {
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) (i >> 24);
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) (i >> 16);
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) (i >> 8);
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) i;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.e()");
		}
	}

	public void method_g_void(final long l) {
		try {
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) (int) (l >> 40);
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) (int) (l >> 32);
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) (int) (l >> 24);
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) (int) (l >> 16);
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) (int) (l >> 8);
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) (int) l;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.g()");
		}
	}

	public void putNT0String(final String string, final byte i) {
		try {
			final int i_8_ = string.indexOf('\0');
			if (i_8_ >= 0) {
				throw new IllegalArgumentException("");
			}
			position += MillisecondTimer.method_y_int(string, 0, string.length(), buffer, position * -1485345105, -2145418181) * -685856689;
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) 0;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.a()");
		}
	}

	public void putNT0String(final String string, final int i) {
		try {
			final int i_9_ = string.indexOf('\0');
			if (i_9_ >= 0) {
				throw new IllegalArgumentException("");
			}
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) 0;
			position += MillisecondTimer.method_y_int(string, 0, string.length(),
					buffer, position * -1485345105, -1794494444) * -685856689;
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) 0;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.l()");
		}
	}

	public int getShortA() {
		int i_10_;
		try {
			position += -1371713378;
			i_10_ = (((buffer[(-1485345105 * position) - 1] - 128) & 0xff) + ((buffer[(-1485345105 * position) - 2] & 0xff) << 8));
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.bw()");
		}
		return i_10_;
	}

	public void method_k_void(final int i, final int i_11_) {
		try {
			buffer[(position * -1485345105) - i - 4] = (byte) (i >> 24);
			buffer[(position * -1485345105) - i - 3] = (byte) (i >> 16);
			buffer[(position * -1485345105) - i - 2] = (byte) (i >> 8);
			buffer[(position * -1485345105) - i - 1] = (byte) i;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.k()");
		}
	}

	public void method_ax_void(final byte[] is, final int i, final int i_12_) {
		try {
			for (int i_14_ = i; i_14_ < (i + i_12_); i_14_++) {
				is[i_14_] = (buffer[((position += -685856689) * -1485345105) - 1]);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.ax()");
		}
	}

	public void putByteAt(final int i, final byte i_15_) {
		try {
			buffer[(-1485345105 * position) - i - 1] = (byte) i;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.r()");
		}
	}

	public void method_s_void(final int i, final byte i_16_) {
		try {
			if ((i & ~0x7f) != 0) {
				if ((i & ~0x3fff) != 0) {
					if ((i & ~0x1fffff) != 0) {
						if ((i & ~0xfffffff) != 0) {
							put((i >>> 28) | 0x80);
						}
						put((i >>> 21) | 0x80);
					}
					put((i >>> 14) | 0x80);
				}
				put((i >>> 7) | 0x80);
			}
			put(i & 0x7f);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.s()");
		}
	}

	public int get() {
		int i_17_;
		try {
			i_17_ = (buffer[((position += -685856689) * -1485345105) - 1] & 0xff);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.v()");
		}
		return i_17_;
	}

	public static final Class_av method_v_av(final Daemon class_dx,
			final Component component, final int i, int i_18_, final int i_19_) {
		try {
			if ((-1281893659 * NpcDefinitions.audioSampleRate) == 0) {
				throw new IllegalStateException();
			}
			if (i >= 0) {
				if (i_18_ < 256) {
					i_18_ = 256;
				}
				Class_bt class_bt;
				try {
					final Class_bt class_bt_20_ = new Class_bt();
					class_bt_20_.field_a_374 = new int[(Class_i.field_y_1073 ? 2
							: 1) * 256];
					class_bt_20_.field_k_379 = -271769967 * i_18_;
					class_bt_20_.method_n_void(component);
					class_bt_20_.field_q_378 = 524352779 * ((i_18_ & ~0x3ff) + 1024);
					if ((-650778973 * class_bt_20_.field_q_378) > 16384) {
						class_bt_20_.field_q_378 = 1061339136;
					}
					class_bt_20_.method_d_void((class_bt_20_.field_q_378)
							* -650778973);
					if (((-950045437 * Class_av.field_e_388) > 0)
							&& (Class_av.field_g_380 == null)) {
						Class_av.field_g_380 = new Class_bg();
						Class_av.field_g_380.field_n_547 = class_dx;
						class_dx.method_g_es(Class_av.field_g_380, -950045437
								* Class_av.field_e_388, 1614397639);
					}
					if (Class_av.field_g_380 != null) {
						if (Class_av.field_g_380.field_d_546[i] != null) {
							throw new IllegalArgumentException();
						}
						Class_av.field_g_380.field_d_546[i] = class_bt_20_;
					}
					class_bt = class_bt_20_;
				} catch (final Throwable throwable) {
					Class_af class_af;
					try {
						final Class_af class_af_21_ = new Class_af(class_dx, i);
						class_af_21_.field_a_374 = new int[(Class_i.field_y_1073 ? 2
								: 1) * 256];
						class_af_21_.field_k_379 = -271769967 * i_18_;
						class_af_21_.method_n_void(component);
						class_af_21_.field_q_378 = 1061339136;
						class_af_21_.method_d_void(-650778973
								* (class_af_21_.field_q_378));
						if (((Class_av.field_e_388 * -950045437) > 0)
								&& (Class_av.field_g_380 == null)) {
							Class_av.field_g_380 = new Class_bg();
							Class_av.field_g_380.field_n_547 = class_dx;
							class_dx.method_g_es(Class_av.field_g_380,
									(-950045437 * Class_av.field_e_388),
									2137464504);
						}
						if (Class_av.field_g_380 != null) {
							if ((Class_av.field_g_380.field_d_546[i]) != null) {
								throw new IllegalArgumentException();
							}
							Class_av.field_g_380.field_d_546[i] = class_af_21_;
						}
						class_af = class_af_21_;
					} catch (final Throwable throwable_22_) {
						return new Class_av();
					}
					return class_af;
				}
				return class_bt;
			}
			throw new IllegalArgumentException();
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.v()");
		}
	}

	public int getShort() {
		int i_23_;
		try {
			position += -1371713378;
			i_23_ = ((buffer[(-1485345105 * position) - 1] & 0xff) + ((buffer[(position * -1485345105) - 2] & 0xff) << 8));
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.p()");
		}
		return i_23_;
	}

	public int getMediumInt(final int i) {
		int i_24_;
		try {
			position += -2057570067;
			i_24_ = ((buffer[(-1485345105 * position) - 1] & 0xff)
					+ ((buffer[(position * -1485345105) - 2] & 0xff) << 8) + ((buffer[(position * -1485345105) - 3] & 0xff) << 16));
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.b()");
		}
		return i_24_;
	}

	public int getInt() {
		int i_25_;
		try {
			position += 1551540540;
			i_25_ = (((buffer[(-1485345105 * position) - 4] & 0xff) << 24)
					+ ((buffer[(position * -1485345105) - 3] & 0xff) << 16)
					+ ((buffer[(-1485345105 * position) - 2] & 0xff) << 8) + (buffer[(position * -1485345105) - 1] & 0xff));
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.t()");
		}
		return i_25_;
	}

	public void putMedium(final int i, final int i_26_) {
		try {
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) (i >> 16);
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) (i >> 8);
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) i;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.y()");
		}
	}

	public String method_i_String(final int i) {
		String string;
		try {
			if (buffer[-1485345105 * position] == 0) {
				position += -685856689;
				return null;
			}
			string = getString();
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.i()");
		}
		return string;
	}

	public String method_ak_String(final int i) {
		String string;
		try {
			final byte i_27_ = buffer[((position += -685856689) * -1485345105) - 1];
			if (i_27_ != 0) {
				throw new IllegalStateException("");
			}
			final int i_28_ = -1485345105 * position;
			while (buffer[((position += -685856689) * -1485345105) - 1] != 0) {
				/* empty */
			}
			final int i_29_ = (position * -1485345105) - i_28_ - 1;
			string = i_29_ == 0 ? "" : GameMessage.method_e_String(buffer,
					i_28_, i_29_, -457868473);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.ak()");
		}
		return string;
	}

	public String method_ae_String(final byte i) {
		String string;
		try {
			final byte i_30_ = buffer[((position += -685856689) * -1485345105) - 1];
			if (i_30_ != 0) {
				throw new IllegalStateException("");
			}
			final int i_31_ = method_ab_int(1670041244);
			if (((-1485345105 * position) + i_31_) > buffer.length) {
				throw new IllegalStateException("");
			}
			final String string_32_ = Varp.method_n_String(buffer, position
					* -1485345105, i_31_, 1865304130);
			position += -685856689 * i_31_;
			string = string_32_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.ae()");
		}
		return string;
	}

	public int method_al_int(final byte i) {
		int i_33_;
		try {
			final int i_34_ = buffer[position * -1485345105] & 0xff;
			i_33_ = (i_34_ < 128 ? get() - 64
					: getShort() - 49152);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.al()");
		}
		return i_33_;
	}

	public int getSmart(final byte i) {
		int i_35_;
		try {
			final int i_36_ = buffer[position * -1485345105] & 0xff;
			i_35_ = (i_36_ < 128 ? get()
					: getShort() - 32768);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.ar()");
		}
		return i_35_;
	}

	public int getShort(final byte i) {
		position += -1371713378;// that obfuscation rofl
		int i_38_ = (((buffer[(-1485345105 * position) - 2] & 0xff) << 8) + (buffer[(position * -1485345105) - 1] & 0xff));
		if (i_38_ > 32767) {
			i_38_ -= 65536;
		}
		return i_38_;
	}

	public void decodeXTEA(final int[] is, final int i) {
		try {
			final int i_39_ = (-1485345105 * position) / 8;
			position = 0;
			for (int i_40_ = 0; i_40_ < i_39_; i_40_++) {
				int i_41_ = getInt();
				int i_42_ = getInt();
				int i_43_ = 0;
				final int i_44_ = -1640531527;
				int i_45_ = 32;
				while (i_45_-- > 0) {
					i_41_ += ((((i_42_ << 4) ^ (i_42_ >>> 5)) + i_42_) ^ (i_43_ + is[i_43_ & 0x3]));
					i_43_ += i_44_;
					i_42_ += ((((i_41_ << 4) ^ (i_41_ >>> 5)) + i_41_) ^ (is[(i_43_ >>> 11) & 0x3] + i_43_));
				}
				position -= -1191886216;
				putInt(i_41_);
				putInt(i_42_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.ao()");
		}
	}

	public void method_ac_void(final int[] is, final byte i) {
		try {
			final int i_46_ = (position * -1485345105) / 8;
			position = 0;
			for (int i_47_ = 0; i_47_ < i_46_; i_47_++) {
				int i_48_ = getInt();
				int i_49_ = getInt();
				int i_50_ = -957401312;
				final int i_51_ = -1640531527;
				int i_52_ = 32;
				while (i_52_-- > 0) {
					i_49_ -= ((i_48_ + ((i_48_ << 4) ^ (i_48_ >>> 5))) ^ (i_50_ + is[(i_50_ >>> 11) & 0x3]));
					i_50_ -= i_51_;
					i_48_ -= ((((i_49_ << 4) ^ (i_49_ >>> 5)) + i_49_) ^ (i_50_ + is[i_50_ & 0x3]));
				}
				position -= -1191886216;
				putInt(i_48_);
				putInt(i_49_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.ac()");
		}
	}

	public void encodeXTEA(final int[] is, final int i, final int i_53_,
			final int i_54_) {
		try {
			final int i_55_ = position * -1485345105;
			position = -685856689 * i;
			final int i_56_ = (i_53_ - i) / 8;
			for (int i_57_ = 0; i_57_ < i_56_; i_57_++) {
				int i_58_ = getInt();
				int i_59_ = getInt();
				int i_60_ = 0;
				final int i_61_ = -1640531527;
				int i_62_ = 32;
				while (i_62_-- > 0) {
					i_58_ += ((((i_59_ << 4) ^ (i_59_ >>> 5)) + i_59_) ^ (i_60_ + is[i_60_ & 0x3]));
					i_60_ += i_61_;
					i_59_ += ((((i_58_ << 4) ^ (i_58_ >>> 5)) + i_58_) ^ (i_60_ + is[(i_60_ >>> 11) & 0x3]));
				}
				position -= -1191886216;
				putInt(i_58_);
				putInt(i_59_);
			}
			position = -685856689 * i_55_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.az()");
		}
	}

	public void encodeRSA(final BigInteger biginteger,
			final BigInteger biginteger_63_, final byte i) {
		try {
			final int i_64_ = position * -1485345105;
			position = 0;
			final byte[] is = new byte[i_64_];
			method_ax_void(is, 0, i_64_);
			final BigInteger biginteger_65_ = new BigInteger(is);
			final BigInteger biginteger_66_ = biginteger_65_;// .modPow(biginteger,
																// biginteger_63_);
			final byte[] is_67_ = biginteger_66_.toByteArray();
			position = 0;
			putShort(is_67_.length);
			write(is_67_, 0, is_67_.length, -1166888012);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.aa()");
		}
	}

	public int method_an_int(final int i, final byte i_68_) {
		int i_69_;
		try {
			final byte[] is = buffer;
			final int i_70_ = position * -1485345105;
			int i_71_ = -1;
			for (int i_72_ = i; i_72_ < i_70_; i_72_++) {
				i_71_ = (i_71_ >>> 8)
						^ field_z_1630[(i_71_ ^ is[i_72_]) & 0xff];
			}
			i_71_ ^= 0xffffffff;
			putInt(i_71_);
			i_69_ = i_71_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.an()");
		}
		return i_69_;
	}

	public boolean method_aw_boolean(final byte i) {
		boolean bool;
		try {
			position -= 1551540540;
			final byte[] is = buffer;
			final int i_73_ = position * -1485345105;
			int i_74_ = -1;
			for (int i_75_ = 0; i_75_ < i_73_; i_75_++) {
				i_74_ = (i_74_ >>> 8)
						^ field_z_1630[(i_74_ ^ is[i_75_]) & 0xff];
			}
			i_74_ ^= 0xffffffff;
			final int i_76_ = getInt();
			if (i_76_ == i_74_) {
				return true;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.aw()");
		}
		return bool;
	}

	public void putByteC(final int i) {
		try {
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) (0 - i);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.ah()");
		}
	}

	public void putByteS(final int i, final int i_78_) {
		try {
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) (128 - i);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.aq()");
		}
	}

	public int getByteA() {
		int i_79_;
		try {
			i_79_ = (buffer[((position += -685856689) * -1485345105) - 1] - 128) & 0xff;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.ay()");
		}
		return i_79_;
	}

	public int getByteS() {
		int i_80_;
		try {
			i_80_ = ((128 - (buffer[((position += -685856689) * -1485345105) - 1])) & 0xff);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.aj()");
		}
		return i_80_;
	}

	public void putWord64(final long l) {
		try {
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) (int) (l >> 56);
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) (int) (l >> 48);
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) (int) (l >> 40);
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) (int) (l >> 32);
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) (int) (l >> 24);
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) (int) (l >> 16);
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) (int) (l >> 8);
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) (int) l;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.f()");
		}
	}

	public byte method_af_byte(final short i) {
		byte i_81_;
		try {
			i_81_ = (byte) (128 - buffer[((position += -685856689) * -1485345105) - 1]);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.af()");
		}
		return i_81_;
	}

	public void putLEInt(final int i, final byte i_82_) {
		try {
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) i;
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) (i >> 8);
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) (i >> 16);
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) (i >> 24);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.bd()");
		}
	}

	public void putShortA(final int i, final byte i_83_) {
		try {
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) (i >> 8);
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) (128 + i);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.av()");
		}
	}

	public void putLEShortA(final int i, final int i_84_) {
		try {
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) (128 + i);
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) (i >> 8);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.bs()");
		}
	}

	public int getLEShort() {
		int i_85_;
		try {
			position += -1371713378;
			i_85_ = (((buffer[(position * -1485345105) - 1] & 0xff) << 8) + (buffer[(-1485345105 * position) - 2] & 0xff));
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.bo()");
		}
		return i_85_;
	}

	public int getLEShortA() {
		int i_86_;
		try {
			position += -1371713378;
			i_86_ = (((buffer[(position * -1485345105) - 2] - 128) & 0xff) + ((buffer[(-1485345105 * position) - 1] & 0xff) << 8));
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.bm()");
		}
		return i_86_;
	}

	public int method_bj_int(final byte i) {
		int i_87_;
		try {
			position += -1371713378;
			int i_88_ = (((buffer[(-1485345105 * position) - 2] & 0xff) << 8) + ((buffer[(position * -1485345105) - 1] - 128) & 0xff));
			if (i_88_ > 32767) {
				i_88_ -= 65536;
			}
			i_87_ = i_88_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.bj()");
		}
		return i_87_;
	}

	public int method_ba_int(final int i) {
		int i_89_;
		try {
			position += -1371713378;
			int i_90_ = (((buffer[(-1485345105 * position) - 1] & 0xff) << 8) + ((buffer[(-1485345105 * position) - 2] - 128) & 0xff));
			if (i_90_ > 32767) {
				i_90_ -= 65536;
			}
			i_89_ = i_90_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.ba()");
		}
		return i_89_;
	}

	public void method_br_void(final int i, final int i_91_) {// if i had to  guess itd be leint but check server to make sure
		try {
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) (i >> 8);
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) (i >> 16);
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) i;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.br()");
		}
	}

	public void putInt1(final int i, final int i_92_) {
		try {
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) (i >> 8);
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) i;
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) (i >> 24);
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) (i >> 16);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.bn()");
		}
	}

	public void putBEInt(final int i, final int i_93_) {
		try {
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) (i >> 16);
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) (i >> 24);
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) i;
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) (i >> 8);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.bu()");
		}
	}

	public int getLargeSmart() {
		int i_94_;
		try {
			i_94_ = (buffer[position * -1485345105] < 0 ? getInt() & 0x7fffffff
					: getShort());
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.as()");
		}
		return i_94_;
	}

	public int getInt1() {
		int i_95_;
		try {
			position += 1551540540;
			i_95_ = ((buffer[(position * -1485345105) - 3] & 0xff)
					+ ((buffer[(-1485345105 * position) - 2] & 0xff) << 24)
					+ ((buffer[(position * -1485345105) - 1] & 0xff) << 16) + ((buffer[(-1485345105 * position) - 4] & 0xff) << 8));
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.bp()");
		}
		return i_95_;
	}
	
	public void getInReverse(final byte[] is, final int i, final int i_96_) {
		try {
			for (int i_98_ = (i_96_ + i) - 1; i_98_ >= i; i_98_--) {
				is[i_98_] = (buffer[((position += -685856689) * -1485345105) - 1]);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.bz()");
		}
	}

	public void putLEShort(final int i, final byte i_99_) {
		try {
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) i;
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) (i >> 8);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.au()");
		}
	}

	static int index = 0;
	
	public String getString() {
		String string;
		try {
			final int i_100_ = -1485345105 * position;
			while (buffer[((position += -685856689) * -1485345105) - 1] != 0) {
				// empty 
			}
			final int i_101_ = (position * -1485345105) - i_100_ - 1;
			string = (i_101_ == 0 ? "" : GameMessage.method_e_String(buffer,
					i_100_, i_101_, -100790773));
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.ad()");
		}
		return string;
	}
	
	public void write(final byte[] is, final int i, final int i_102_,
			final int i_103_) {
		try {
			for (int i_104_ = i; i_104_ < (i + i_102_); i_104_++) {
				buffer[((position += -685856689) * -1485345105) - 1] = is[i_104_];
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.q()");
		}
	}

	public byte method_ag_byte(final short i) {
		byte i_105_;
		try {
			i_105_ = (byte) ((buffer[((position += -685856689) * -1485345105) - 1]) - 128);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.ag()");
		}
		return i_105_;
	}

	public void writeShortAt(final int i, final int i_106_) {
		try {
			buffer[(-1485345105 * position) - i - 2] = (byte) (i >> 8);
			buffer[(position * -1485345105) - i - 1] = (byte) i;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.x()");
		}
	}

	public void method_at_void(final int[] is, final int i, final int i_107_,
			final byte i_108_) {
		try {
			final int i_109_ = position * -1485345105;
			position = i * -685856689;
			final int i_110_ = (i_107_ - i) / 8;
			for (int i_111_ = 0; i_111_ < i_110_; i_111_++) {
				int i_112_ = getInt();
				int i_113_ = getInt();
				int i_114_ = -957401312;
				final int i_115_ = -1640531527;
				int i_116_ = 32;
				while (i_116_-- > 0) {
					i_113_ -= ((i_112_ + ((i_112_ << 4) ^ (i_112_ >>> 5))) ^ (is[(i_114_ >>> 11) & 0x3] + i_114_));
					i_114_ -= i_115_;
					i_112_ -= ((i_113_ + ((i_113_ << 4) ^ (i_113_ >>> 5))) ^ (is[i_114_ & 0x3] + i_114_));
				}
				position -= -1191886216;
				putInt(i_112_);
				putInt(i_113_);
			}
			position = i_109_ * -685856689;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.at()");
		}
	}

	public Buffer(final int i) {
		buffer = Class_dm.method_n_byteArray(i, (byte) -62);
		position = 0;
	}

	public void method_u_void(final CharSequence charsequence, final int i) {
		try {
			final int i_117_ = charsequence.length();
			int i_118_ = 0;
			for (int i_119_ = 0; i_119_ < i_117_; i_119_++) {
				final char c = charsequence.charAt(i_119_);
				if (c <= '\u007f') {
					i_118_++;
				} else if (c <= '\u07ff') {
					i_118_ += 2;
				} else {
					i_118_ += 3;
				}
			}
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) 0;
			method_s_void(i_118_, (byte) -13);
			i_118_ = position;
			final byte[] is = buffer;
			final int i_120_ = -1485345105 * position;
			final int i_121_ = charsequence.length();
			int i_122_ = i_120_;
			for (int i_123_ = 0; i_123_ < i_121_; i_123_++) {
				final int i_124_ = charsequence.charAt(i_123_);
				if (i_124_ <= 127) {
					is[i_122_++] = (byte) i_124_;
				} else if (i_124_ <= 2047) {
					is[i_122_++] = (byte) (0xc0 | (i_124_ >> 6));
					is[i_122_++] = (byte) (0x80 | (i_124_ & 0x3f));
				} else {
					is[i_122_++] = (byte) (0xe0 | (i_124_ >> 12));
					is[i_122_++] = (byte) (0x80 | ((i_124_ >> 6) & 0x3f));
					is[i_122_++] = (byte) (0x80 | (i_124_ & 0x3f));
				}
			}
			final int i_125_ = i_122_ - i_120_;
			position = i_118_ + (-685856689 * i_125_);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.u()");
		}
	}

	public int getByteC() {
		int i_126_;
		try {
			i_126_ = (0 - buffer[(((position += -685856689) * -1485345105) - 1)]) & 0xff;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.am()");
		}
		return i_126_;
	}

	public void putSmart(final int i) {
		try {
			if ((i >= 0) && (i < 128)) {
				put(i);
			} else if ((i >= 0) && (i < 32768)) {
				putShort(32768 + i);
			} else {
				throw new IllegalArgumentException();
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.j()");
		}
	}

	public Buffer(final byte[] is) {
		buffer = is;
		position = 0;
	}
	
	   public int getUByte() {
		      return this.buffer[this.position++] & 255;
		   }

	public void putByteA(final int i) {
		try {
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) (i + 128);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.ai()");
		}
	}

	public int getInt2(final byte i) {
		int i_129_;// did i refactor these in other clent? yea
		try {// can u find out what type of int this is from looking at
				// refactored?
			position += 1551540540;
			i_129_ = (((buffer[(position * -1485345105) - 4] & 0xff) << 16)
					+ ((buffer[(position * -1485345105) - 3] & 0xff) << 24)
					+ ((buffer[(-1485345105 * position) - 1] & 0xff) << 8) + (buffer[(-1485345105 * position) - 2] & 0xff));
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.bt()");
		}
		return i_129_;
	}

	public byte getSigned() {
		byte i_130_;
		try {
			i_130_ = buffer[((position += -685856689) * -1485345105) - 1];
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.c()");
		}
		return i_130_;
	}

	public long getLong() {
		long l;
		try {
			final long l_131_ = getInt() & 0xffffffffL;
			final long l_132_ = getInt() & 0xffffffffL;
			l = (l_131_ << 32) + l_132_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.w()");
		}
		return l;
	}

	public int getLEInt() {
		int i_133_;
		try {
			position += 1551540540;
			i_133_ = ((buffer[(-1485345105 * position) - 4] & 0xff)
					+ ((buffer[(-1485345105 * position) - 3] & 0xff) << 8)
					+ ((buffer[(position * -1485345105) - 1] & 0xff) << 24) + ((buffer[(position * -1485345105) - 2] & 0xff) << 16));
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.bq()");
		}
		return i_133_;
	}

	public int method_ab_int(final int i) {
		int i_134_;
		try {
			int i_135_ = buffer[((position += -685856689) * -1485345105) - 1];
			int i_136_ = 0;
			for (/**/; i_135_ < 0; i_135_ = (buffer[((position += -685856689) * -1485345105) - 1])) {
				i_136_ = (i_136_ | (i_135_ & 0x7f)) << 7;
			}
			i_134_ = i_136_ | i_135_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.ab()");
		}
		return i_134_;
	}

	public byte method_ap_byte(final int i) {
		byte i_137_;
		try {
			i_137_ = (byte) (0 - buffer[((position += -685856689) * -1485345105) - 1]);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.ap()");
		}
		return i_137_;
	}

	static final boolean method_ds_boolean(final Widget widget, final int i) {
		do {
			try {
				final int i_138_ = widget.contentType * -1489583413;
				if (i_138_ == 205) {// sec i forgot name of field
					client.field_cv_2733 = 658425546;
					return true;
				}
				if ((i_138_ >= 300) && (i_138_ <= 313)) {
					final int i_139_ = (i_138_ - 300) / 2;
					final int i_140_ = i_138_ & 0x1;
					client.playerDesignComposite.method_d_void(i_139_,
							i_140_ == 1, 1315462812);
				}
				if ((i_138_ >= 314) && (i_138_ <= 323)) {
					final int i_141_ = (i_138_ - 314) / 2;
					final int i_142_ = i_138_ & 0x1;
					client.playerDesignComposite.method_z_void(i_141_,
							i_142_ == 1, 1772932398);
				}
				if (i_138_ == 324) {
					client.playerDesignComposite
							.method_y_void(false, 302941269);
				}
				if (i_138_ == 325) {
					client.playerDesignComposite
							.method_y_void(true, 1414564076);
				}
				if (i_138_ != 326) {
					break;
				}
				client.encryptedBuffer.writeOpcode(233);
				client.playerDesignComposite.method_e_void(client.encryptedBuffer,
						(short) 128);
			} catch (final RuntimeException runtimeexception) {
				throw GameCanvas.error(runtimeexception, "dl.ds()");
			}
			return true;
		} while (false);
		return false;
	}

	static final void method_a_void(final SceneGraph scenegraph,
			final CollisionMap[] collisionmaps, final int i) {
		try {
			for (int i_143_ = 0; i_143_ < 4; i_143_++) {
				for (int i_144_ = 0; i_144_ < 104; i_144_++) {
					for (int i_145_ = 0; i_145_ < 104; i_145_++) {
						if ((Region.sceneFlags[i_143_][i_144_][i_145_] & 0x1) == 1) {
							int i_146_ = i_143_;
							if ((Region.sceneFlags[1][i_144_][i_145_] & 0x2) == 2) {
								i_146_ = i_143_ - 1;
							}
							if (i_146_ >= 0) {
								collisionmaps[i_146_].method_y_void(i_144_,
										i_145_, 1662591965);
							}
						}
					}
				}
			}
			Region.field_w_1003 += ((int) (Math.random() * 5.0) - 2)
					* -1172707873;
			if ((Region.field_w_1003 * -832301537) < -8) {
				Region.field_w_1003 = 791728392;
			}
			if ((Region.field_w_1003 * -832301537) > 8) {
				Region.field_w_1003 = -791728392;
			}
			Region.field_i_992 += ((int) (Math.random() * 5.0) - 2)
					* -782306289;
			if ((Region.field_i_992 * -2142930193) < -16) {
				Region.field_i_992 = -368001264;
			}
			if ((-2142930193 * Region.field_i_992) > 16) {
				Region.field_i_992 = 368001264;
			}
			for (int i_147_ = 0; i_147_ < 4; i_147_++) {
				final byte[][] is = Region.field_m_1007[i_147_];
				final int i_148_ = (int) Math.sqrt(5100.0);
				final int i_149_ = (i_148_ * 768) >> 8;
				for (int i_150_ = 1; i_150_ < 103; i_150_++) {
					for (int i_151_ = 1; i_151_ < 103; i_151_++) {
						final int i_152_ = (Region.heightMaps[i_147_][i_151_ + 1][i_150_] - (Region.heightMaps[i_147_][i_151_ - 1][i_150_]));
						final int i_153_ = (Region.heightMaps[i_147_][i_151_][i_150_ + 1] - (Region.heightMaps[i_147_][i_151_][i_150_ - 1]));
						final int i_154_ = (int) Math.sqrt((i_153_ * i_153_)
								+ 65536 + (i_152_ * i_152_));
						final int i_155_ = (i_152_ << 8) / i_154_;
						final int i_156_ = 65536 / i_154_;
						final int i_157_ = (i_153_ << 8) / i_154_;
						final int i_158_ = 96 + (((-50 * i_157_)
								+ (i_155_ * -50) + (i_156_ * -10)) / i_149_);
						final int i_159_ = ((is[i_151_][i_150_] >> 1)
								+ (is[i_151_][1 + i_150_] >> 3)
								+ (is[i_151_ + 1][i_150_] >> 3)
								+ (is[i_151_ - 1][i_150_] >> 2) + (is[i_151_][i_150_ - 1] >> 2));
						Class_ge.field_a_2977[i_151_][i_150_] = i_158_ - i_159_;
					}
				}
				for (int i_160_ = 0; i_160_ < 104; i_160_++) {
					Npc.field_h_291[i_160_] = 0;
					Region.field_l_1006[i_160_] = 0;
					Class_bh.field_u_558[i_160_] = 0;
					Class_cw.field_q_1412[i_160_] = 0;
					Class_bh.field_k_564[i_160_] = 0;
				}
				for (int i_161_ = -5; i_161_ < 109; i_161_++) {
					for (int i_162_ = 0; i_162_ < 104; i_162_++) {
						final int i_163_ = i_161_ + 5;
						if ((i_163_ >= 0) && (i_163_ < 104)) {
							final int i_164_ = ((Bindable.field_y_1701[i_147_][i_163_][i_162_]) & 0xff);
							if (i_164_ > 0) {
								final FloorOverlay class_aa = WidgetNode.getOverlay(i_164_ - 1);
								Npc.field_h_291[i_162_] += -1714919267
										* class_aa.field_y_3;
								Region.field_l_1006[i_162_] += -1946461629
										* class_aa.field_e_11;
								Class_bh.field_u_558[i_162_] += class_aa.field_g_5
										* -1620713145;
								Class_cw.field_q_1412[i_162_] += class_aa.field_f_0
										* -1215220479;
								Class_bh.field_k_564[i_162_]++;
							}
						}
						final int i_165_ = i_161_ - 5;
						if ((i_165_ >= 0) && (i_165_ < 104)) {
							final int i_166_ = ((Bindable.field_y_1701[i_147_][i_165_][i_162_]) & 0xff);
							if (i_166_ > 0) {
								final FloorOverlay class_aa = WidgetNode
										.getOverlay(i_166_ - 1);
								Npc.field_h_291[i_162_] -= class_aa.field_y_3
										* -1714919267;
								Region.field_l_1006[i_162_] -= class_aa.field_e_11
										* -1946461629;
								Class_bh.field_u_558[i_162_] -= -1620713145
										* class_aa.field_g_5;
								Class_cw.field_q_1412[i_162_] -= class_aa.field_f_0
										* -1215220479;
								Class_bh.field_k_564[i_162_]--;
							}
						}
					}
					if ((i_161_ >= 1) && (i_161_ < 103)) {
						int i_167_ = 0;
						int i_168_ = 0;
						int i_169_ = 0;
						int i_170_ = 0;
						int i_171_ = 0;
						int i_172_ = -5;
						for (/**/; i_172_ < 109; i_172_++) {
							final int i_173_ = 5 + i_172_;
							if ((i_173_ >= 0) && (i_173_ < 104)) {
								i_167_ += Npc.field_h_291[i_173_];
								i_168_ += Region.field_l_1006[i_173_];
								i_169_ += Class_bh.field_u_558[i_173_];
								i_170_ += Class_cw.field_q_1412[i_173_];
								i_171_ += Class_bh.field_k_564[i_173_];
							}
							final int i_174_ = i_172_ - 5;
							if ((i_174_ >= 0) && (i_174_ < 104)) {
								i_167_ -= Npc.field_h_291[i_174_];
								i_168_ -= Region.field_l_1006[i_174_];
								i_169_ -= Class_bh.field_u_558[i_174_];
								i_170_ -= Class_cw.field_q_1412[i_174_];
								i_171_ -= Class_bh.field_k_564[i_174_];
							}
							if ((i_172_ >= 1) && (i_172_ < 103)) {
								if (client.field_u_2784
										&& ((Region.sceneFlags[0][i_161_][i_172_] & 0x2) == 0)) {
									if (((Region.sceneFlags[i_147_][i_161_][i_172_]) & 0x10) != 0) {
										continue;
									}
									int i_175_;
									if (((Region.sceneFlags[i_147_][i_161_][i_172_]) & 0x8) != 0) {
										i_175_ = 0;
									} else if ((i_147_ > 0)
											&& (((Region.sceneFlags[1][i_161_][i_172_]) & 0x2) != 0)) {
										i_175_ = i_147_ - 1;
									} else {
										i_175_ = i_147_;
									}
									if (i_175_ != (client.field_cs_2739 * 544143533)) {
										continue;
									}
								}
								if (i_147_ < (-470415013 * Region.field_z_993)) {
									Region.field_z_993 = i_147_ * 1110114003;
								}
								final int i_176_ = ((Bindable.field_y_1701[i_147_][i_161_][i_172_]) & 0xff);
								final int i_177_ = ((Region.field_e_994[i_147_][i_161_][i_172_]) & 0xff);
								if ((i_176_ > 0) || (i_177_ > 0)) {
									final int i_178_ = (Region.heightMaps[i_147_][i_161_][i_172_]);
									final int i_179_ = (Region.heightMaps[i_147_][1 + i_161_][i_172_]);
									final int i_180_ = (Region.heightMaps[i_147_][1 + i_161_][1 + i_172_]);
									final int i_181_ = (Region.heightMaps[i_147_][i_161_][1 + i_172_]);
									final int i_182_ = (Class_ge.field_a_2977[i_161_][i_172_]);
									final int i_183_ = (Class_ge.field_a_2977[1 + i_161_][i_172_]);
									final int i_184_ = (Class_ge.field_a_2977[1 + i_161_][1 + i_172_]);
									final int i_185_ = (Class_ge.field_a_2977[i_161_][i_172_ + 1]);
									int i_186_ = -1;
									int i_187_ = -1;
									if (i_176_ > 0) {
										int i_188_ = (i_167_ * 256) / i_170_;
										final int i_189_ = i_168_ / i_171_;
										int i_190_ = i_169_ / i_171_;
										i_186_ = (Class_d.method_j_int(i_188_,
												i_189_, i_190_, -1596426931));
										i_188_ = ((Region.field_w_1003 * -832301537) + i_188_) & 0xff;
										i_190_ += (-2142930193 * Region.field_i_992);
										if (i_190_ < 0) {
											i_190_ = 0;
										} else if (i_190_ > 255) {
											i_190_ = 255;
										}
										i_187_ = (Class_d.method_j_int(i_188_,
												i_189_, i_190_, -2102502865));
									}
									if (i_147_ > 0) {
										boolean bool = true;
										if ((i_176_ == 0)
												&& ((Class_df.field_g_1610[i_147_][i_161_][i_172_]) != 0)) {
											bool = false;
										}
										if (i_177_ > 0) {
											final int i_191_ = i_177_ - 1;
											FloorUnderlay underlay = ((FloorUnderlay) (FloorUnderlay.field_d_69
													.method_n_gb(i_191_)));
											FloorUnderlay class_ah_192_;
											if (underlay != null) {
												class_ah_192_ = underlay;
											} else {
												final byte[] is_193_ = (FloorUnderlay.field_n_73 .getArchive(4, i_191_));
												underlay = new FloorUnderlay();
												if (is_193_ != null) {
													underlay.method_d_void((new Buffer(is_193_)), i_191_, 1301998322);
												}
												underlay.method_n_void(-1544944956);
												FloorUnderlay.field_d_69
														.method_z_void(
																underlay,
																i_191_);
												class_ah_192_ = underlay;
											}
											if (!class_ah_192_.field_e_71) {
												bool = false;
											}
										}
										if (bool && (i_179_ == i_178_)
												&& (i_180_ == i_178_)
												&& (i_181_ == i_178_)) {
											Friend.field_x_1092[i_147_][i_161_][i_172_] |= 0x924;
										}
									}
									int i_194_ = 0;
									if (i_187_ != -1) {
										i_194_ = (Rasterizer3D.field_ad_1156[(Item
												.method_x_int(i_187_, 96,
														(byte) 120))]);
									}
									if (i_177_ == 0) {
										scenegraph.method_g_void(i_147_,
												i_161_, i_172_, 0, 0, -1,
												i_178_, i_179_, i_180_, i_181_,
												(Item.method_x_int(i_186_,
														i_182_, (byte) 74)),
												(Item.method_x_int(i_186_,
														i_183_, (byte) 91)),
												(Item.method_x_int(i_186_,
														i_184_, (byte) 21)),
												(Item.method_x_int(i_186_,
														i_185_, (byte) 61)), 0,
												0, 0, 0, i_194_, 0);
									} else {
										final int i_195_ = ((Class_df.field_g_1610[i_147_][i_161_][i_172_]) + 1);
										final byte i_196_ = (ClanMember.field_f_808[i_147_][i_161_][i_172_]);
										final int i_197_ = i_177_ - 1;
										FloorUnderlay class_ah = ((FloorUnderlay) (FloorUnderlay.field_d_69
												.method_n_gb(i_197_)));
										FloorUnderlay class_ah_198_;
										if (class_ah != null) {
											class_ah_198_ = class_ah;
										} else {
											final byte[] is_199_ = (FloorUnderlay.field_n_73
													.getArchive(4,
															i_197_));
											class_ah = new FloorUnderlay();
											if (is_199_ != null) {
												class_ah.method_d_void(
														new Buffer(is_199_),
														i_197_, 1301998322);
											}
											class_ah.method_n_void(1269632960);
											FloorUnderlay.field_d_69.method_z_void(
													class_ah, i_197_);
											class_ah_198_ = class_ah;
										}
										int i_200_ = (307621159 * class_ah_198_.field_y_82);
										int i_201_;
										int i_202_;
										if (i_200_ >= 0) {
											i_202_ = (Rasterizer3D.field_ak_1157
													.method_d_int(i_200_,
															-759323297));
											i_201_ = -1;
										} else if ((class_ah_198_.field_z_70 * -975377899) == 16711935) {
											i_201_ = -2;
											i_200_ = -1;
											i_202_ = -2;
										} else {
											i_201_ = (Class_d
													.method_j_int(
															(-2030006561 * (class_ah_198_.field_f_74)),
															191673783 * (class_ah_198_.field_m_75),
															(class_ah_198_.field_a_76 * -8030465),
															-1955372401));
											final int i_203_ = (((-832301537 * Region.field_w_1003) + (class_ah_198_.field_f_74 * -2030006561)) & 0xff);
											int i_204_ = ((-8030465 * class_ah_198_.field_a_76) + (Region.field_i_992 * -2142930193));
											if (i_204_ < 0) {
												i_204_ = 0;
											} else if (i_204_ > 255) {
												i_204_ = 255;
											}
											i_202_ = (Class_d
													.method_j_int(
															i_203_,
															191673783 * (class_ah_198_.field_m_75),
															i_204_, -1867605474));
										}
										int i_205_ = 0;
										if (i_202_ != -2) {
											i_205_ = (Rasterizer3D.field_ad_1156[(VarpBit
													.method_r_int(i_202_, 96,
															(byte) 7))]);
										}
										if ((class_ah_198_.field_g_81 * -1556569973) != -1) {
											final int i_206_ = (((-832301537 * Region.field_w_1003) + (-980229867 * (class_ah_198_.field_h_77))) & 0xff);
											int i_207_ = ((-1555373057 * class_ah_198_.field_u_72) + (Region.field_i_992 * -2142930193));
											if (i_207_ < 0) {
												i_207_ = 0;
											} else if (i_207_ > 255) {
												i_207_ = 255;
											}
											i_202_ = (Class_d
													.method_j_int(
															i_206_,
															-630708431
																	* (class_ah_198_.field_l_78),
															i_207_, -1645867027));
											i_205_ = (Rasterizer3D.field_ad_1156[(VarpBit
													.method_r_int(i_202_, 96,
															(byte) 7))]);
										}
										scenegraph.method_g_void(i_147_,
												i_161_, i_172_, i_195_, i_196_,
												i_200_, i_178_, i_179_, i_180_,
												i_181_, (Item.method_x_int(
														i_186_, i_182_,
														(byte) 81)), (Item
														.method_x_int(i_186_,
																i_183_,
																(byte) 18)),
												(Item.method_x_int(i_186_,
														i_184_, (byte) 90)),
												(Item.method_x_int(i_186_,
														i_185_, (byte) 117)),
												VarpBit.method_r_int(i_201_,
														i_182_, (byte) 7),
												VarpBit.method_r_int(i_201_,
														i_183_, (byte) 7),
												VarpBit.method_r_int(i_201_,
														i_184_, (byte) 7),
												VarpBit.method_r_int(i_201_,
														i_185_, (byte) 7),
												i_194_, i_205_);
									}
								}
							}
						}
					}
				}
				for (int i_208_ = 1; i_208_ < 103; i_208_++) {
					for (int i_209_ = 1; i_209_ < 103; i_209_++) {
						int i_210_;
						if ((Region.sceneFlags[i_147_][i_209_][i_208_] & 0x8) != 0) {
							i_210_ = 0;
						} else if ((i_147_ > 0)
								&& ((Region.sceneFlags[1][i_209_][i_208_] & 0x2) != 0)) {
							i_210_ = i_147_ - 1;
						} else {
							i_210_ = i_147_;
						}
						scenegraph
								.method_e_void(i_147_, i_209_, i_208_, i_210_);
					}
				}
				Bindable.field_y_1701[i_147_] = null;
				Region.field_e_994[i_147_] = null;
				Class_df.field_g_1610[i_147_] = null;
				ClanMember.field_f_808[i_147_] = null;
				Region.field_m_1007[i_147_] = null;
			}
			scenegraph.method_ar_void(-50, -10, -50);
			for (int i_211_ = 0; i_211_ < 104; i_211_++) {
				for (int i_212_ = 0; i_212_ < 104; i_212_++) {
					if ((Region.sceneFlags[1][i_211_][i_212_] & 0x2) == 2) {
						scenegraph.method_z_void(i_211_, i_212_);
					}
				}
			}
			int i_213_ = 1;
			int i_214_ = 2;
			int i_215_ = 4;
			for (int i_216_ = 0; i_216_ < 4; i_216_++) {
				if (i_216_ > 0) {
					i_213_ <<= 3;
					i_214_ <<= 3;
					i_215_ <<= 3;
				}
				for (int i_217_ = 0; i_217_ <= i_216_; i_217_++) {
					for (int i_218_ = 0; i_218_ <= 104; i_218_++) {
						for (int i_219_ = 0; i_219_ <= 104; i_219_++) {
							if ((Friend.field_x_1092[i_217_][i_219_][i_218_] & i_213_) != 0) {
								int i_220_ = i_218_;
								int i_221_ = i_218_;
								int i_222_ = i_217_;
								int i_223_ = i_217_;
								for (/**/; i_220_ > 0; i_220_--) {
									if (((Friend.field_x_1092[i_217_][i_219_][i_220_ - 1]) & i_213_) == 0) {
										break;
									}
								}
								for (/**/; i_221_ < 104; i_221_++) {
									if (((Friend.field_x_1092[i_217_][i_219_][1 + i_221_]) & i_213_) == 0) {
										break;
									}
								}
								while_25_: for (/**/; i_222_ > 0; i_222_--) {
									for (int i_224_ = i_220_; i_224_ <= i_221_; i_224_++) {
										if (((Friend.field_x_1092[i_222_ - 1][i_219_][i_224_]) & i_213_) == 0) {
											break while_25_;
										}
									}
								}
								while_26_: for (/**/; i_223_ < i_216_; i_223_++) {
									for (int i_225_ = i_220_; i_225_ <= i_221_; i_225_++) {
										if (((Friend.field_x_1092[i_223_ + 1][i_219_][i_225_]) & i_213_) == 0) {
											break while_26_;
										}
									}
								}
								final int i_226_ = ((1 + (i_221_ - i_220_)) * ((1 + i_223_) - i_222_));
								if (i_226_ >= 8) {
									final int i_227_ = 240;
									final int i_228_ = ((Region.heightMaps[i_223_][i_219_][i_220_]) - i_227_);
									final int i_229_ = (Region.heightMaps[i_222_][i_219_][i_220_]);
									SceneGraph.method_y_void(i_216_, 1,
											128 * i_219_, i_219_ * 128,
											128 * i_220_,
											(128 + (i_221_ * 128)), i_228_,
											i_229_);
									for (int i_230_ = i_222_; i_230_ <= i_223_; i_230_++) {
										for (int i_231_ = i_220_; i_231_ <= i_221_; i_231_++) {
											Friend.field_x_1092[i_230_][i_219_][i_231_] &= i_213_ ^ 0xffffffff;
										}
									}
								}
							}
							if ((Friend.field_x_1092[i_217_][i_219_][i_218_] & i_214_) != 0) {
								int i_232_ = i_219_;
								int i_233_ = i_219_;
								int i_234_ = i_217_;
								int i_235_ = i_217_;
								for (/**/; i_232_ > 0; i_232_--) {
									if (((Friend.field_x_1092[i_217_][i_232_ - 1][i_218_]) & i_214_) == 0) {
										break;
									}
								}
								for (/**/; i_233_ < 104; i_233_++) {
									if (((Friend.field_x_1092[i_217_][1 + i_233_][i_218_]) & i_214_) == 0) {
										break;
									}
								}
								while_27_: for (/**/; i_234_ > 0; i_234_--) {
									for (int i_236_ = i_232_; i_236_ <= i_233_; i_236_++) {
										if (((Friend.field_x_1092[i_234_ - 1][i_236_][i_218_]) & i_214_) == 0) {
											break while_27_;
										}
									}
								}
								while_28_: for (/**/; i_235_ < i_216_; i_235_++) {
									for (int i_237_ = i_232_; i_237_ <= i_233_; i_237_++) {
										if (((Friend.field_x_1092[1 + i_235_][i_237_][i_218_]) & i_214_) == 0) {
											break while_28_;
										}
									}
								}
								final int i_238_ = (((1 + i_235_) - i_234_) * (1 + (i_233_ - i_232_)));
								if (i_238_ >= 8) {
									final int i_239_ = 240;
									final int i_240_ = ((Region.heightMaps[i_235_][i_232_][i_218_]) - i_239_);
									final int i_241_ = (Region.heightMaps[i_234_][i_232_][i_218_]);
									SceneGraph.method_y_void(i_216_, 2,
											128 * i_232_,
											(128 + (128 * i_233_)),
											128 * i_218_, i_218_ * 128, i_240_,
											i_241_);
									for (int i_242_ = i_234_; i_242_ <= i_235_; i_242_++) {
										for (int i_243_ = i_232_; i_243_ <= i_233_; i_243_++) {
											Friend.field_x_1092[i_242_][i_243_][i_218_] &= i_214_ ^ 0xffffffff;
										}
									}
								}
							}
							if ((Friend.field_x_1092[i_217_][i_219_][i_218_] & i_215_) != 0) {
								int i_244_ = i_219_;
								int i_245_ = i_219_;
								int i_246_ = i_218_;
								int i_247_ = i_218_;
								for (/**/; i_246_ > 0; i_246_--) {
									if (((Friend.field_x_1092[i_217_][i_219_][i_246_ - 1]) & i_215_) == 0) {
										break;
									}
								}
								for (/**/; i_247_ < 104; i_247_++) {
									if (((Friend.field_x_1092[i_217_][i_219_][i_247_ + 1]) & i_215_) == 0) {
										break;
									}
								}
								while_29_: for (/**/; i_244_ > 0; i_244_--) {
									for (int i_248_ = i_246_; i_248_ <= i_247_; i_248_++) {
										if (((Friend.field_x_1092[i_217_][i_244_ - 1][i_248_]) & i_215_) == 0) {
											break while_29_;
										}
									}
								}
								while_30_: for (/**/; i_245_ < 104; i_245_++) {
									for (int i_249_ = i_246_; i_249_ <= i_247_; i_249_++) {
										if (((Friend.field_x_1092[i_217_][i_245_ + 1][i_249_]) & i_215_) == 0) {
											break while_30_;
										}
									}
								}
								if ((((i_245_ - i_244_) + 1) * (1 + (i_247_ - i_246_))) >= 4) {
									final int i_250_ = (Region.heightMaps[i_217_][i_244_][i_246_]);
									SceneGraph.method_y_void(i_216_, 4,
											i_244_ * 128, (i_245_ * 128) + 128,
											i_246_ * 128, (128 * i_247_) + 128,
											i_250_, i_250_);
									for (int i_251_ = i_244_; i_251_ <= i_245_; i_251_++) {
										for (int i_252_ = i_246_; i_252_ <= i_247_; i_252_++) {
											Friend.field_x_1092[i_217_][i_251_][i_252_] &= i_215_ ^ 0xffffffff;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dl.a()");
		}
	}

	static long method_n_long(final int i) {
		do {
			try {
				try {
					final URL url = new URL("http://community.salve-ps.com/index.php?app=core&module=global&section=lostpass");
					GameObject.browseURL("http://community.salve-ps.com/index.php?app=core&module=global&section=lostpass", true, false, -1043454110);
					
					final URLConnection urlconnection = url.openConnection();
					urlconnection.setRequestProperty("connection", "close");
					urlconnection.setDoInput(true);
					urlconnection.setDoOutput(true);
					urlconnection.setConnectTimeout(5000);
					final OutputStreamWriter outputstreamwriter = new OutputStreamWriter(
							urlconnection.getOutputStream());
					outputstreamwriter.write("data1=req");
					outputstreamwriter.flush();
					final InputStream inputstream = urlconnection
							.getInputStream();
					final Buffer rsbytebuffer = new Buffer(new byte[1000]);
					do {
						final int i_253_ = inputstream.read(
								rsbytebuffer.buffer,
								(rsbytebuffer.position * -1485345105),
								(1000 - (rsbytebuffer.position * -1485345105)));
						if (i_253_ == -1) {
							rsbytebuffer.position = 0;
							final long l = rsbytebuffer
									.getLong();
							return l;
						}
						rsbytebuffer.position += i_253_ * -685856689;
					} while ((rsbytebuffer.position * -1485345105) < 1000);
				} catch (final Exception exception) {
					break;
				}
				return 0L;
			} catch (final RuntimeException runtimeexception) {
				throw GameCanvas.error(runtimeexception, "dl.n()");
			}
		} while (false);
		return 0L;
	}
}
