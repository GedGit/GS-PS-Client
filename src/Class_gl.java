/* Class_gl - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_gl {
	int[] field_n_3024;

	public int method_n_int(final int i) {
		final int i_0_ = (this.field_n_3024.length >> 1) - 1;
		int i_1_ = i & i_0_;
		for (;;) {
			final int i_2_ = this.field_n_3024[i_1_ + i_1_ + 1];
			if (i_2_ == -1) {
				return -1;
			}
			if (this.field_n_3024[i_1_ + i_1_] == i) {
				return i_2_;
			}
			i_1_ = (i_1_ + 1) & i_0_;
		}
	}

	public Class_gl(final int[] is) {
		int i;
		for (i = 1; i <= (is.length + (is.length >> 1)); i <<= 1) {
			/* empty */
		}
		this.field_n_3024 = new int[i + i];
		for (int i_3_ = 0; i_3_ < (i + i); i_3_++) {
			this.field_n_3024[i_3_] = -1;
		}
		int i_4_ = 0;
		while (i_4_ < is.length) {
			int i_5_;
			for (i_5_ = is[i_4_] & (i - 1); this.field_n_3024[i_5_ + i_5_ + 1] != -1; i_5_ = (i_5_ + 1) & (i - 1)) {
				/* empty */
			}
			this.field_n_3024[i_5_ + i_5_] = is[i_4_];
			this.field_n_3024[i_5_ + i_5_ + 1] = i_4_++;
		}
	}
}
