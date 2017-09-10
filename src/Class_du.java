/* Class_du - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.IOException;

public final class Class_du {
	static short[] field_pp_1718;
	CacheFile field_z_1719 = null;
	static int[] field_c_1720;
	int field_y_1721;
	int field_e_1722 = -1105532136;
	static byte[] field_n_1723 = new byte[520];
	CacheFile field_d_1724 = null;
	public static final int field_du_1725 = 5;

	public byte[] read(final int i, final byte i_0_) {
		try {
			final CacheFile class_hf = this.field_z_1719;
			synchronized (class_hf) {
				while_32_: do {
					do {
						byte[] is;
						try {
							if (this.field_d_1724.method_z_long((byte) 60) < 6 + (6 * i)) {
								return null;
							}
							this.field_d_1724.method_d_void(i * 6);
							this.field_d_1724.method_e_void(field_n_1723, 0, 6, -239887586);
							final int i_1_ = ((field_n_1723[2] & 0xff) + ((field_n_1723[0] & 0xff) << 16) + ((field_n_1723[1] & 0xff) << 8));
							int i_2_ = ((field_n_1723[5] & 0xff) + ((field_n_1723[4] & 0xff) << 8) + ((field_n_1723[3] & 0xff) << 16));
							if ((i_1_ < 0) || (i_1_ > (-1656543137 * this.field_e_1722))) {
								break while_32_;
							}
							if ((i_2_ <= 0) || (i_2_ > (this.field_z_1719.method_z_long((byte) 49) / 520L))) {
								break;
							}
							final byte[] is_3_ = new byte[i_1_];
							int i_4_ = 0;
							int i_5_ = 0;
							while (i_4_ < i_1_) {
								if (i_2_ == 0) {
									return null;
								}
								this.field_z_1719.method_d_void(i_2_ * 520);
								int i_6_ = i_1_ - i_4_;
								if (i_6_ > 512) {
									i_6_ = 512;
								}
								this.field_z_1719.method_e_void(field_n_1723, 0, i_6_ + 8, -312326478);
								final int i_7_ = (((field_n_1723[0] & 0xff) << 8) + (field_n_1723[1] & 0xff));
								final int i_8_ = ((field_n_1723[3] & 0xff) + ((field_n_1723[2] & 0xff) << 8));
								final int i_9_ = ((field_n_1723[6] & 0xff) + ((field_n_1723[5] & 0xff) << 8) + ((field_n_1723[4] & 0xff) << 16));
								final int i_10_ = field_n_1723[7] & 0xff;
								if ((i != i_7_) || (i_5_ != i_8_) || (i_10_ != (1359695561 * (this.field_y_1721)))) {
									return null;
								}
								if ((i_9_ < 0) || (i_9_ > (this.field_z_1719.method_z_long((byte) 71) / 520L))) {
									return null;
								}
								for (int i_11_ = 0; i_11_ < i_6_; i_11_++) {
									is_3_[i_4_++] = field_n_1723[8 + i_11_];
								}
								i_2_ = i_9_;
								i_5_++;
							}
							final byte[] is_12_ = is_3_;
							is = is_12_;
						} catch (final IOException ioexception) {
							return null;
						}
						return is;
					} while (false);
					return null;
				} while (false);
			return null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "du.n()");
		}
	}

	public boolean method_d_boolean(final int i, final byte[] is, final int i_13_, final int i_14_) {
		try {
			final CacheFile class_hf = this.field_z_1719;
			synchronized (class_hf) {
				if ((i_13_ >= 0) && (i_13_ <= (this.field_e_1722 * -1656543137))) {
					boolean bool = method_z_boolean(i, is, i_13_, true, (byte) 7);
					if (!bool) {
						bool = method_z_boolean(i, is, i_13_, false, (byte) 29);
					}
					final boolean bool_15_ = bool;
					return bool_15_;
				}
				throw new IllegalArgumentException();
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "du.d()");
		}
	}

	public Class_du(final int i, final CacheFile class_hf, final CacheFile class_hf_16_, final int i_17_) {
		this.field_y_1721 = 1242311545 * i;
		this.field_z_1719 = class_hf;
		this.field_d_1724 = class_hf_16_;
		this.field_e_1722 = i_17_ * 35730335;
	}

	boolean method_z_boolean(final int i, final byte[] is, final int i_18_, boolean bool, final byte i_19_) {
		try {
			final CacheFile class_hf = this.field_z_1719;
			synchronized (class_hf) {
				boolean bool_20_;
				try {
					int i_21_;
					if (bool) {
						if (this.field_d_1724.method_z_long((byte) 31) < (i * 6) + 6) {
							return false;
						}
						this.field_d_1724.method_d_void(6 * i);
						this.field_d_1724.method_e_void(field_n_1723, 0, 6, 671378089);
						i_21_ = ((field_n_1723[5] & 0xff) + ((field_n_1723[4] & 0xff) << 8) + ((field_n_1723[3] & 0xff) << 16));
						if ((i_21_ <= 0) || (i_21_ > (this.field_z_1719.method_z_long((byte) 55) / 520L))) {
							return false;
						}
					} else {
						i_21_ = (int) ((this.field_z_1719.method_z_long((byte) 64) + 519L) / 520L);
						if (i_21_ == 0) {
							i_21_ = 1;
						}
					}
					field_n_1723[0] = (byte) (i_18_ >> 16);
					field_n_1723[1] = (byte) (i_18_ >> 8);
					field_n_1723[2] = (byte) i_18_;
					field_n_1723[3] = (byte) (i_21_ >> 16);
					field_n_1723[4] = (byte) (i_21_ >> 8);
					field_n_1723[5] = (byte) i_21_;
					this.field_d_1724.method_d_void(6 * i);
					this.field_d_1724.method_f_void(field_n_1723, 0, 6, (byte) 73);
					int i_22_ = 0;
					int i_23_ = 0;
					while (i_22_ < i_18_) {
						int i_24_ = 0;
						if (bool) {
							this.field_z_1719.method_d_void(520 * i_21_);
							try {
								this.field_z_1719.method_e_void(field_n_1723, 0, 8, -2000046043);
							} catch (final EOFException eofexception) {
								break;
							}
							final int i_25_ = ((field_n_1723[1] & 0xff) + ((field_n_1723[0] & 0xff) << 8));
							final int i_26_ = ((field_n_1723[3] & 0xff) + ((field_n_1723[2] & 0xff) << 8));
							i_24_ = (((field_n_1723[4] & 0xff) << 16) + ((field_n_1723[5] & 0xff) << 8) + (field_n_1723[6] & 0xff));
							final int i_27_ = field_n_1723[7] & 0xff;
							if ((i_25_ != i) || (i_23_ != i_26_) || ((this.field_y_1721 * 1359695561) != i_27_)) {
								return false;
							}
							if ((i_24_ < 0) || (i_24_ > (this.field_z_1719.method_z_long((byte) 101) / 520L))) {
								return false;
							}
						}
						if (i_24_ == 0) {
							bool = false;
							i_24_ = (int) ((this.field_z_1719.method_z_long((byte) 22) + 519L) / 520L);
							if (i_24_ == 0) {
								i_24_++;
							}
							if (i_21_ == i_24_) {
								i_24_++;
							}
						}
						if ((i_18_ - i_22_) <= 512) {
							i_24_ = 0;
						}
						field_n_1723[0] = (byte) (i >> 8);
						field_n_1723[1] = (byte) i;
						field_n_1723[2] = (byte) (i_23_ >> 8);
						field_n_1723[3] = (byte) i_23_;
						field_n_1723[4] = (byte) (i_24_ >> 16);
						field_n_1723[5] = (byte) (i_24_ >> 8);
						field_n_1723[6] = (byte) i_24_;
						field_n_1723[7] = (byte) (1359695561 * this.field_y_1721);
						this.field_z_1719.method_d_void(i_21_ * 520);
						this.field_z_1719.method_f_void(field_n_1723, 0, 8, (byte) 92);
						int i_28_ = i_18_ - i_22_;
						if (i_28_ > 512) {
							i_28_ = 512;
						}
						this.field_z_1719.method_f_void(is, i_22_, i_28_, (byte) 109);
						i_22_ += i_28_;
						i_21_ = i_24_;
						i_23_++;
					}
					bool_20_ = true;
				} catch (final IOException ioexception) {
					return false;
				}
				final boolean bool_29_ = bool_20_;
				return bool_29_;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "du.z()");
		}
	}

	static final void method_al_void(final Actor character, final short i) {
		try {
			final int i_30_ = ((-408703439 * character.forcedToSpeed) - (client.currentCycle * 303796053));
			final int i_31_ = ((-2135025024 * character.forcedFirstX) + (-1401454912 * character.size));
			final int i_32_ = ((character.forcedFirstY * 1555031168) + (character.size * -1401454912));
			character.worldPosX += (((i_31_ - (character.worldPosX * -2103184911)) / i_30_) * -585310447);
			character.worldPosY += (((i_32_ - (2088773389 * character.worldPosY)) / i_30_) * 359464901);
			character.field_cj_272 = 0;
			if ((-900700599 * character.forcedDirection) == 0) {
				character.orientation = 1122753536;
			}
			if ((character.forcedDirection * -900700599) == 1) {
				character.orientation = 1684130304;
			}
			if ((character.forcedDirection * -900700599) == 2) {
				character.orientation = 0;
			}
			if ((-900700599 * character.forcedDirection) == 3) {
				character.orientation = 561376768;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "du.al()");
		}
	}

	static Timer newTimer() {
		MillisecondTimer class_eq;
		do {
			try {
				NanoTimer class_ee;
				try {
					class_ee = new NanoTimer();
				} catch (final Throwable throwable) {
					class_eq = new MillisecondTimer();
					break;
				}
				return class_ee;
			} catch (final RuntimeException runtimeexception) {
				throw GameCanvas.error(runtimeexception, "du.n()");
			}
		} while (false);
		return class_eq;
	}
}
