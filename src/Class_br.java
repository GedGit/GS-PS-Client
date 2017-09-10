/* Class_br - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_br {
	static float field_m_630;
	static final int field_d_631 = 4;
	int[][][] field_z_632 = new int[2][2][4];
	static final float field_h_633 = 100.0F;
	int[][][] field_y_634 = new int[2][2][4];
	int[] field_e_635 = new int[2];
	static int[][] field_f_636 = new int[2][8];
	static float[][] field_g_637 = new float[2][8];
	static int field_a_638;
	int[] field_n_639 = new int[2];
	static final float field_l_640 = 8.0F;
	static final float field_u_641 = 32.703197F;

	float method_n_float(final int i, final int i_0_, final float f) {
		float f_1_ = (this.field_y_634[i][0][i_0_] + (f * (this.field_y_634[i][1][i_0_] - this.field_y_634[i][0][i_0_])));
		f_1_ *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0, -f_1_ / 20.0F);
	}

	static float method_d_float(final float f) {
		final float f_2_ = 32.703197F * (float) Math.pow(2.0, f);
		return (f_2_ * 3.1415927F) / 11025.0F;
	}

	float method_z_float(final int i, final int i_3_, final float f) {
		float f_4_ = (this.field_z_632[i][0][i_3_] + (f * (this.field_z_632[i][1][i_3_] - this.field_z_632[i][0][i_3_])));
		f_4_ *= 1.2207031E-4F;
		return method_d_float(f_4_);
	}

	final void method_e_void(final Buffer rsbytebuffer, final Class_bs class_bs) {
		final int i = rsbytebuffer.get();
		this.field_n_639[0] = i >> 4;
		this.field_n_639[1] = i & 0xf;
		if (i != 0) {
			this.field_e_635[0] = rsbytebuffer.getShort();
			this.field_e_635[1] = rsbytebuffer.getShort();
			final int i_5_ = rsbytebuffer.get();
			for (int i_6_ = 0; i_6_ < 2; i_6_++) {
				for (int i_7_ = 0; i_7_ < this.field_n_639[i_6_]; i_7_++) {
					this.field_z_632[i_6_][0][i_7_] = rsbytebuffer.getShort();
					this.field_y_634[i_6_][0][i_7_] = rsbytebuffer.getShort();
				}
			}
			for (int i_8_ = 0; i_8_ < 2; i_8_++) {
				for (int i_9_ = 0; i_9_ < this.field_n_639[i_8_]; i_9_++) {
					if ((i_5_ & (1 << (i_8_ * 4) << i_9_)) != 0) {
						this.field_z_632[i_8_][1][i_9_] = rsbytebuffer.getShort();
						this.field_y_634[i_8_][1][i_9_] = rsbytebuffer.getShort();
					} else {
						this.field_z_632[i_8_][1][i_9_] = this.field_z_632[i_8_][0][i_9_];
						this.field_y_634[i_8_][1][i_9_] = this.field_y_634[i_8_][0][i_9_];
					}
				}
			}
			if ((i_5_ != 0) || (this.field_e_635[1] != this.field_e_635[0])) {
				class_bs.method_d_void(rsbytebuffer);
			}
		} else {
			final int[] is = this.field_e_635;
			this.field_e_635[1] = 0;
			is[0] = 0;
		}
	}

	Class_br() {
		/* empty */
	}

	int method_y_int(final int i, final float f) {
		if (i == 0) {
			float f_10_ = (this.field_e_635[0] + ((this.field_e_635[1] - this.field_e_635[0]) * f));
			f_10_ *= 0.0030517578F;
			field_m_630 = (float) Math.pow(0.1, f_10_ / 20.0F);
			field_a_638 = (int) (field_m_630 * 65536.0F);
		}
		if (this.field_n_639[i] == 0) {
			return 0;
		}
		float f_11_ = method_n_float(i, 0, f);
		field_g_637[i][0] = -2.0F * f_11_ * (float) Math.cos(method_z_float(i, 0, f));
		field_g_637[i][1] = f_11_ * f_11_;
		for (int i_12_ = 1; i_12_ < this.field_n_639[i]; i_12_++) {
			f_11_ = method_n_float(i, i_12_, f);
			final float f_13_ = (-2.0F * f_11_ * (float) Math.cos(method_z_float(i, i_12_, f)));
			final float f_14_ = f_11_ * f_11_;
			field_g_637[i][(i_12_ * 2) + 1] = field_g_637[i][(i_12_ * 2) - 1] * f_14_;
			field_g_637[i][i_12_ * 2] = ((field_g_637[i][(i_12_ * 2) - 1] * f_13_) + (field_g_637[i][(i_12_ * 2) - 2] * f_14_));
			for (int i_15_ = (i_12_ * 2) - 1; i_15_ >= 2; i_15_--) {
				field_g_637[i][i_15_] += ((field_g_637[i][i_15_ - 1] * f_13_) + (field_g_637[i][i_15_ - 2] * f_14_));
			}
			field_g_637[i][1] += (field_g_637[i][0] * f_13_) + f_14_;
			field_g_637[i][0] += f_13_;
		}
		if (i == 0) {
			for (int i_16_ = 0; i_16_ < (this.field_n_639[0] * 2); i_16_++) {
				field_g_637[0][i_16_] *= field_m_630;
			}
		}
		for (int i_17_ = 0; i_17_ < (this.field_n_639[i] * 2); i_17_++) {
			field_f_636[i][i_17_] = (int) (field_g_637[i][i_17_] * 65536.0F);
		}
		return this.field_n_639[i] * 2;
	}
}
