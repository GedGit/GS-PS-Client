/* Class_hf - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.IOException;

public class CacheFile {
	long field_l_3065;
	long field_h_3066;
	SeekableFile field_n_3067;
	int field_y_3068;
	byte[] field_e_3069;
	long field_g_3070 = -1763073620490038329L;
	int field_f_3071 = 0;
	long field_m_3072;
	long field_a_3073;
	long field_z_3074 = -8690866267302936921L;
	byte[] field_d_3075;
//.
	public void method_n_void(final byte i) throws IOException {
		try {
			method_m_void(1737194529);
			this.field_n_3067.close();
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "hf.n()");
		}
	}

	public void method_d_void(final long l) throws IOException {
		try {
			if (l < 0L) {
				throw new IOException("");
			}
			this.field_m_3072 = -9115564401749782563L * l;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "hf.d()");
		}
	}

	public long method_z_long(final byte i) {
		long l;
		try {
			l = 5779395909820254587L * this.field_h_3066;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "hf.z()");
		}
		return l;
	}

	public void method_y_void(final byte[] is, final short i) throws IOException {
		try {
			method_e_void(is, 0, is.length, -554313380);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "hf.y()");
		}
	}

	void method_g_void(final short i) throws IOException {
		try {
			this.field_y_3068 = 0;
			if ((-2963029767198228363L * this.field_m_3072) != (7524191669441510565L * this.field_l_3065)) {
				this.field_n_3067.method_n_void(-2963029767198228363L * this.field_m_3072);
				this.field_l_3065 = this.field_m_3072 * 2025318983741774737L;
			}
			this.field_z_3074 = 2426921488455671213L * this.field_m_3072;
			int i_0_;
			for (/**/; ((this.field_y_3068 * 1776278797) < this.field_d_3075.length); this.field_y_3068 += 1976515013 * i_0_) {
				i_0_ = (this.field_n_3067.read(this.field_d_3075, 1776278797 * this.field_y_3068, (this.field_d_3075.length - (1776278797 * this.field_y_3068))));
				if (i_0_ == -1) {
					break;
				}
				this.field_l_3065 += i_0_ * 1437282467914304301L;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "hf.g()");
		}
	}

	void method_m_void(final int i) throws IOException {
		try {
			if (-1L != (this.field_g_3070 * 2711266842777911817L)) {
				if ((7524191669441510565L * this.field_l_3065) != (2711266842777911817L * this.field_g_3070)) {
					this.field_n_3067.method_n_void(2711266842777911817L * this.field_g_3070);
					this.field_l_3065 = (-6936981705291792747L * this.field_g_3070);
				}
				this.field_n_3067.method_d_void(this.field_e_3069, 0, 879850891 * this.field_f_3071, (byte) 73);
				this.field_l_3065 += (3706762280983454319L * this.field_f_3071);
				if ((this.field_l_3065 * 7524191669441510565L) > (this.field_a_3073 * -1901759971665304189L)) {
					this.field_a_3073 = (this.field_l_3065 * 6987455525454259383L);
				}
				long l = -1L;
				long l_1_ = -1L;
				if (((2711266842777911817L * this.field_g_3070) >= (7328062903978686185L * this.field_z_3074)) && ((2711266842777911817L * this.field_g_3070) < (this.field_y_3068 * 1776278797 + (this.field_z_3074 * 7328062903978686185L)))) {
					l = this.field_g_3070 * 2711266842777911817L;
				} else if (((7328062903978686185L * this.field_z_3074) >= (2711266842777911817L * this.field_g_3070)) && ((this.field_z_3074 * 7328062903978686185L) < (879850891 * this.field_f_3071 + (this.field_g_3070 * 2711266842777911817L)))) {
					l = 7328062903978686185L * this.field_z_3074;
				}
				if ((((2711266842777911817L * this.field_g_3070) + this.field_f_3071 * 879850891) > (7328062903978686185L * this.field_z_3074))
						&& (((2711266842777911817L * this.field_g_3070) + this.field_f_3071 * 879850891) <= (this.field_y_3068 * 1776278797 + (this.field_z_3074 * 7328062903978686185L)))) {
					l_1_ = (879850891 * this.field_f_3071 + (2711266842777911817L * this.field_g_3070));
				} else if (((this.field_y_3068 * 1776278797 + (this.field_z_3074 * 7328062903978686185L)) > (2711266842777911817L * this.field_g_3070))
						&& ((this.field_y_3068 * 1776278797 + (7328062903978686185L * this.field_z_3074)) <= ((this.field_g_3070 * 2711266842777911817L) + this.field_f_3071 * 879850891))) {
					l_1_ = (1776278797 * this.field_y_3068 + (7328062903978686185L * this.field_z_3074));
				}
				if ((l > -1L) && (l_1_ > l)) {
					final int i_2_ = (int) (l_1_ - l);
					System.arraycopy(this.field_e_3069, (int) (l - (2711266842777911817L * (this.field_g_3070))), this.field_d_3075, (int) (l - (7328062903978686185L * (this.field_z_3074))), i_2_);
				}
				this.field_g_3070 = -1763073620490038329L;
				this.field_f_3071 = 0;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "hf.m()");
		}
	}

	public void method_f_void(final byte[] is, int i, int i_3_, final byte i_4_) throws IOException {
		try {
			try {
				if ((i_3_ + (this.field_m_3072 * -2963029767198228363L)) > (this.field_h_3066 * 5779395909820254587L)) {
					this.field_h_3066 = ((-2963029767198228363L * this.field_m_3072) + i_3_) * -3381304930087342669L;
				}
				if ((-1L != (2711266842777911817L * this.field_g_3070)) && (((this.field_m_3072 * -2963029767198228363L) < (2711266842777911817L * this.field_g_3070)) || ((this.field_m_3072 * -2963029767198228363L) > ((this.field_g_3070 * 2711266842777911817L) + 879850891 * this.field_f_3071)))) {
					method_m_void(1737194529);
				}
				if (((2711266842777911817L * this.field_g_3070) != -1L) && (((-2963029767198228363L * this.field_m_3072) + i_3_) > (this.field_e_3069.length + (2711266842777911817L * this.field_g_3070)))) {
					final int i_5_ = (int) (this.field_e_3069.length - ((this.field_m_3072 * -2963029767198228363L) - (2711266842777911817L * this.field_g_3070)));
					System.arraycopy(is, i, this.field_e_3069, (int) ((-2963029767198228363L * this.field_m_3072) - (2711266842777911817L * (this.field_g_3070))), i_5_);
					this.field_m_3072 += -9115564401749782563L * i_5_;
					i += i_5_;
					i_3_ -= i_5_;
					this.field_f_3071 = -1520399837 * this.field_e_3069.length;
					method_m_void(1737194529);
				}
				if (i_3_ <= this.field_e_3069.length) {
					if (i_3_ > 0) {
						if ((this.field_g_3070 * 2711266842777911817L) == -1L) {
							this.field_g_3070 = (2545328028233594381L * this.field_m_3072);
						}
						System.arraycopy(is, i, this.field_e_3069, (int) ((this.field_m_3072 * -2963029767198228363L) - (2711266842777911817L * (this.field_g_3070))), i_3_);
						this.field_m_3072 += i_3_ * -9115564401749782563L;
						if (((this.field_m_3072 * -2963029767198228363L) - (2711266842777911817L * this.field_g_3070)) > 879850891 * this.field_f_3071) {
							this.field_f_3071 = (-1520399837 * (int) ((this.field_m_3072 * -2963029767198228363L) - (this.field_g_3070 * 2711266842777911817L)));
						}
					}
				} else {
					if ((7524191669441510565L * this.field_l_3065) != (-2963029767198228363L * this.field_m_3072)) {
						this.field_n_3067.method_n_void(this.field_m_3072 * -2963029767198228363L);
						this.field_l_3065 = (2025318983741774737L * this.field_m_3072);
					}
					this.field_n_3067.method_d_void(is, i, i_3_, (byte) 15);
					this.field_l_3065 += 1437282467914304301L * i_3_;
					if ((this.field_l_3065 * 7524191669441510565L) > (this.field_a_3073 * -1901759971665304189L)) {
						this.field_a_3073 = (6987455525454259383L * this.field_l_3065);
					}
					long l = -1L;
					long l_6_ = -1L;
					if (((this.field_m_3072 * -2963029767198228363L) >= (this.field_z_3074 * 7328062903978686185L)) && ((-2963029767198228363L * this.field_m_3072) < ((7328062903978686185L * this.field_z_3074) + 1776278797 * this.field_y_3068))) {
						l = (this.field_m_3072 * -2963029767198228363L);
					} else if (((this.field_z_3074 * 7328062903978686185L) >= (-2963029767198228363L * this.field_m_3072)) && ((this.field_z_3074 * 7328062903978686185L) < ((this.field_m_3072 * -2963029767198228363L) + i_3_))) {
						l = (7328062903978686185L * this.field_z_3074);
					}
					if (((i_3_ + (this.field_m_3072 * -2963029767198228363L)) > (7328062903978686185L * this.field_z_3074)) && ((i_3_ + (-2963029767198228363L * this.field_m_3072)) <= ((7328062903978686185L * this.field_z_3074) + this.field_y_3068 * 1776278797))) {
						l_6_ = (-2963029767198228363L * this.field_m_3072) + i_3_;
					} else if (((this.field_y_3068 * 1776278797 + (this.field_z_3074 * 7328062903978686185L)) > (this.field_m_3072 * -2963029767198228363L)) && (((7328062903978686185L * this.field_z_3074) + this.field_y_3068 * 1776278797) <= (i_3_ + (-2963029767198228363L * this.field_m_3072)))) {
						l_6_ = ((this.field_z_3074 * 7328062903978686185L) + this.field_y_3068 * 1776278797);
					}
					if ((l > -1L) && (l_6_ > l)) {
						final int i_7_ = (int) (l_6_ - l);
						System.arraycopy(is, (int) ((l + i) - (-2963029767198228363L * (this.field_m_3072))), this.field_d_3075, (int) (l - (7328062903978686185L * (this.field_z_3074))), i_7_);
					}
					this.field_m_3072 += -9115564401749782563L * i_3_;
				}
			} catch (final IOException ioexception) {
				this.field_l_3065 = -1437282467914304301L;
				throw ioexception;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "hf.f()");
		}
	}

	public void method_e_void(final byte[] is, int i, int i_8_, final int i_9_) throws IOException {
		try {
			try {
				if ((i + i_8_) > is.length) {
					throw new ArrayIndexOutOfBoundsException((i_8_ + i) - is.length);
				}
				if (((2711266842777911817L * this.field_g_3070) != -1L) && ((-2963029767198228363L * this.field_m_3072) >= (this.field_g_3070 * 2711266842777911817L)) && ((i_8_ + (-2963029767198228363L * this.field_m_3072)) <= (879850891 * this.field_f_3071 + (this.field_g_3070 * 2711266842777911817L)))) {
					System.arraycopy(this.field_e_3069, (int) ((-2963029767198228363L * this.field_m_3072) - (this.field_g_3070 * 2711266842777911817L)), is, i, i_8_);
					this.field_m_3072 += i_8_ * -9115564401749782563L;
					return;
				}
				final long l = this.field_m_3072 * -2963029767198228363L;
				final int i_10_ = i_8_;
				if (((this.field_m_3072 * -2963029767198228363L) >= (7328062903978686185L * this.field_z_3074)) && ((-2963029767198228363L * this.field_m_3072) < ((this.field_z_3074 * 7328062903978686185L) + 1776278797 * this.field_y_3068))) {
					int i_11_ = (int) (1776278797 * this.field_y_3068 - ((-2963029767198228363L * this.field_m_3072) - (this.field_z_3074 * 7328062903978686185L)));
					if (i_11_ > i_8_) {
						i_11_ = i_8_;
					}
					System.arraycopy(this.field_d_3075, (int) ((-2963029767198228363L * this.field_m_3072) - (7328062903978686185L * (this.field_z_3074))), is, i, i_11_);
					this.field_m_3072 += i_11_ * -9115564401749782563L;
					i += i_11_;
					i_8_ -= i_11_;
				}
				if (i_8_ > this.field_d_3075.length) {
					this.field_n_3067.method_n_void(-2963029767198228363L * this.field_m_3072);
					this.field_l_3065 = (2025318983741774737L * this.field_m_3072);
					int i_12_;
					for (/**/; i_8_ > 0; i_8_ -= i_12_) {
						i_12_ = this.field_n_3067.read(is, i, i_8_);
						if (i_12_ == -1) {
							break;
						}
						this.field_l_3065 += 1437282467914304301L * i_12_;
						this.field_m_3072 += i_12_ * -9115564401749782563L;
						i += i_12_;
					}
				} else if (i_8_ > 0) {
					method_g_void((short) 32664);
					int i_13_ = i_8_;
					if (i_8_ > (1776278797 * this.field_y_3068)) {
						i_13_ = this.field_y_3068 * 1776278797;
					}
					System.arraycopy(this.field_d_3075, 0, is, i, i_13_);
					i += i_13_;
					i_8_ -= i_13_;
					this.field_m_3072 += -9115564401749782563L * i_13_;
				}
				if ((this.field_g_3070 * 2711266842777911817L) != -1L) {
					if (((this.field_g_3070 * 2711266842777911817L) > (this.field_m_3072 * -2963029767198228363L)) && (i_8_ > 0)) {
						int i_14_ = ((int) ((this.field_g_3070 * 2711266842777911817L) - (-2963029767198228363L * this.field_m_3072)) + i);
						if (i_14_ > (i + i_8_)) {
							i_14_ = i + i_8_;
						}
						while (i < i_14_) {
							is[i++] = (byte) 0;
							i_8_--;
							this.field_m_3072 += -9115564401749782563L;
						}
					}
					long l_15_ = -1L;
					long l_16_ = -1L;
					if (((this.field_g_3070 * 2711266842777911817L) >= l) && ((this.field_g_3070 * 2711266842777911817L) < (l + i_10_))) {
						l_15_ = (2711266842777911817L * this.field_g_3070);
					} else if ((l >= (this.field_g_3070 * 2711266842777911817L)) && (l < ((this.field_g_3070 * 2711266842777911817L) + 879850891 * (this.field_f_3071)))) {
						l_15_ = l;
					}
					if ((((2711266842777911817L * this.field_g_3070) + 879850891 * this.field_f_3071) > l) && (((2711266842777911817L * this.field_g_3070) + 879850891 * this.field_f_3071) <= (l + i_10_))) {
						l_16_ = (this.field_f_3071 * 879850891 + (2711266842777911817L * this.field_g_3070));
					} else if (((l + i_10_) > (this.field_g_3070 * 2711266842777911817L)) && ((i_10_ + l) <= (this.field_f_3071 * 879850891 + (this.field_g_3070 * 2711266842777911817L)))) {
						l_16_ = l + i_10_;
					}
					if ((l_15_ > -1L) && (l_16_ > l_15_)) {
						final int i_17_ = (int) (l_16_ - l_15_);
						System.arraycopy(this.field_e_3069, (int) (l_15_ - ((this.field_g_3070) * 2711266842777911817L)), is, i + (int) (l_15_ - l), i_17_);
						if (l_16_ > (-2963029767198228363L * this.field_m_3072)) {
							i_8_ -= l_16_ - (this.field_m_3072 * -2963029767198228363L);
							this.field_m_3072 = l_16_ * -9115564401749782563L;
						}
					}
				}
			} catch (final IOException ioexception) {
				this.field_l_3065 = -1437282467914304301L;
				throw ioexception;
			}
			if (i_8_ > 0) {
				throw new EOFException();
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "hf.e()");
		}
	}

	public CacheFile(final SeekableFile class_hh, final int i, final int i_18_) throws IOException {
		this.field_n_3067 = class_hh;
		this.field_h_3066 = ((this.field_a_3073 = class_hh.length() * 1319573186683539755L) * 186734711846633881L);
		this.field_d_3075 = new byte[i];
		this.field_e_3069 = new byte[i_18_];
		this.field_m_3072 = 0L;
	}
}
