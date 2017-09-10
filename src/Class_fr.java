/* Class_fr - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_fr {
	Buffer field_n_2459;
	int[] field_z_2460;
	static final int field_k_2461 = 3;
	int[] field_y_2462;
	int[] field_e_2463;
	int[] field_g_2464;
	int field_f_2465;
	static final int field_m_2466 = 500000;
	long field_a_2467;
	static final int field_l_2468 = 0;
	int field_d_2469;
	static final int field_u_2470 = 1;
	static final int field_q_2471 = 2;
	static final byte[] field_h_2472 = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0,
		0, 0, 0, 0, 0, 0, 0, 0, 0 };

	int method_y_int() {
		return this.field_y_2462.length;
	}

	void method_n_void(final byte[] is) {
		this.field_n_2459.buffer = is;
		this.field_n_2459.position = 1731367702;
		final int i = this.field_n_2459.getShort();
		this.field_d_2469 = this.field_n_2459.getShort();
		this.field_f_2465 = 500000;
		this.field_z_2460 = new int[i];
		int i_0_ = 0;
		while (i_0_ < i) {
			final int i_1_ = this.field_n_2459.getInt();
			final int i_2_ = this.field_n_2459.getInt();
			if (i_1_ == 1297379947) {
				this.field_z_2460[i_0_] = (this.field_n_2459.position * -1485345105);
				i_0_++;
			}
			this.field_n_2459.position += i_2_ * -685856689;
		}
		this.field_a_2467 = 0L;
		this.field_y_2462 = new int[i];
		for (i_0_ = 0; i_0_ < i; i_0_++) {
			this.field_y_2462[i_0_] = this.field_z_2460[i_0_];
		}
		this.field_e_2463 = new int[i];
		this.field_g_2464 = new int[i];
	}

	void method_d_void() {
		this.field_n_2459.buffer = null;
		this.field_z_2460 = null;
		this.field_y_2462 = null;
		this.field_e_2463 = null;
		this.field_g_2464 = null;
	}

	void method_f_void() {
		this.field_n_2459.position = 685856689;
	}

	void method_e_void(final int i) {
		this.field_n_2459.position = this.field_y_2462[i] * -685856689;
	}

	Class_fr() {
		this.field_n_2459 = new Buffer(null);
	}

	int method_a_int(final int i) {
		final int i_3_ = method_h_int(i);
		return i_3_;
	}

	void method_m_void(final int i) {
		final int i_4_ = this.field_n_2459.method_ab_int(1670041244);
		this.field_e_2463[i] += i_4_;
	}

	int method_l_int(final int i, final int i_5_) {
		if (i_5_ == 255) {
			final int i_6_ = this.field_n_2459.get();
			int i_7_ = this.field_n_2459.method_ab_int(1670041244);
			if (i_6_ == 47) {
				this.field_n_2459.position += i_7_ * -685856689;
				return 1;
			}
			if (i_6_ == 81) {
				final int i_8_ = this.field_n_2459.getMediumInt(-1316342348);
				i_7_ -= 3;
				final int i_9_ = this.field_e_2463[i];
				this.field_a_2467 += (long) i_9_ * (long) (this.field_f_2465 - i_8_);
				this.field_f_2465 = i_8_;
				this.field_n_2459.position += i_7_ * -685856689;
				return 2;
			}
			this.field_n_2459.position += i_7_ * -685856689;
			return 3;
		}
		final byte i_10_ = field_h_2472[i_5_ - 128];
		int i_11_ = i_5_;
		if (i_10_ >= 1) {
			i_11_ = i_5_ | (this.field_n_2459.get() << 8);
		}
		if (i_10_ >= 2) {
			i_11_ |= (this.field_n_2459.get() << 16);
		}
		return i_11_;
	}

	long method_u_long(final int i) {
		return (this.field_a_2467 + ((long) i * (long) this.field_f_2465));
	}

	int method_q_int() {
		final int i = this.field_y_2462.length;
		int i_12_ = -1;
		int i_13_ = 2147483647;
		for (int i_14_ = 0; i_14_ < i; i_14_++) {
			if ((this.field_y_2462[i_14_] >= 0) && (this.field_e_2463[i_14_] < i_13_)) {
				i_12_ = i_14_;
				i_13_ = this.field_e_2463[i_14_];
			}
		}
		return i_12_;
	}

	boolean method_k_boolean() {
		final int i = this.field_y_2462.length;
		for (int i_15_ = 0; i_15_ < i; i_15_++) {
			if (this.field_y_2462[i_15_] >= 0) {
				return false;
			}
		}
		return true;
	}

	void method_x_void(final long l) {
		this.field_a_2467 = l;
		final int i = this.field_y_2462.length;
		for (int i_16_ = 0; i_16_ < i; i_16_++) {
			this.field_e_2463[i_16_] = 0;
			this.field_g_2464[i_16_] = 0;
			this.field_n_2459.position = this.field_z_2460[i_16_] * -685856689;
			method_m_void(i_16_);
			this.field_y_2462[i_16_] = this.field_n_2459.position * -1485345105;
		}
	}

	int method_h_int(final int i) {
		final int i_17_ = (this.field_n_2459.buffer[this.field_n_2459.position * -1485345105]);
		int i_18_;
		if (i_17_ < 0) {
			i_18_ = i_17_ & 0xff;
			this.field_g_2464[i] = i_18_;
			this.field_n_2459.position += -685856689;
		} else {
			i_18_ = this.field_g_2464[i];
		}
		if ((i_18_ != 240) && (i_18_ != 247)) {
			return method_l_int(i, i_18_);
		}
		final int i_19_ = this.field_n_2459.method_ab_int(1670041244);
		if ((i_18_ == 247) && (i_19_ > 0)) {
			final int i_20_ = ((this.field_n_2459.buffer[(this.field_n_2459.position * -1485345105)]) & 0xff);
			if (((i_20_ >= 241) && (i_20_ <= 243)) || (i_20_ == 246) || (i_20_ == 248) || ((i_20_ >= 250) && (i_20_ <= 252)) || (i_20_ == 254)) {
				this.field_n_2459.position += -685856689;
				this.field_g_2464[i] = i_20_;
				return method_l_int(i, i_20_);
			}
		}
		this.field_n_2459.position += i_19_ * -685856689;
		return 0;
	}

	boolean method_z_boolean() {
		if (this.field_n_2459.buffer != null) {
			return true;
		}
		return false;
	}

	void method_g_void(final int i) {
		this.field_y_2462[i] = this.field_n_2459.position * -1485345105;
	}

	Class_fr(final byte[] is) {
		this.field_n_2459 = new Buffer(null);
		method_n_void(is);
	}
}
