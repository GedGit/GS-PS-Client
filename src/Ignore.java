/* Class_m - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Ignore {
	String previousName;
	String name;
	static final int field_mj_1164 = 128;
	static final int field_b_1165 = 23;
	static final int field_as_1166 = 38;
	static final int field_t_1167 = 24;

	static final void method_cu_void(final Class_ae class_ae, final int i, final int i_0_, final int i_1_) {
		try {
			Class_ey.method_cq_void(class_ae.field_n_52 * -339429689, class_ae.field_d_48 * -1250700061, -354131893 * class_ae.field_z_49, class_ae.field_y_50 * 893320981, class_ae.field_e_51, class_ae.field_e_51, i, i_0_, -1995366409);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "m.cu()");
		}
	}

	public static boolean method_d_boolean(final CharSequence charsequence, final short i) {
		boolean bool;
		try {
			boolean bool_2_ = false;
			boolean bool_3_ = false;
			int i_4_ = 0;
			final int i_5_ = charsequence.length();
			int i_6_ = 0;
			boolean bool_7_;
			for (/**/; true; i_6_++) {
				if (i_6_ >= i_5_) {
					bool_7_ = bool_3_;
					break;
				}
				final int i_8_ = charsequence.charAt(i_6_);
				if (i_6_ == 0) {
					if (i_8_ == 45) {
						bool_2_ = true;
						continue;
					}
					if (i_8_ == 43) {
						continue;
					}
				}
				int i_9_;
				if ((i_8_ >= 48) && (i_8_ <= 57)) {
					i_9_ = i_8_ - 48;
				} else if ((i_8_ >= 65) && (i_8_ <= 90)) {
					i_9_ = i_8_ - 55;
				} else {
					if ((i_8_ < 97) || (i_8_ > 122)) {
						bool_7_ = false;
						break;
					}
					i_9_ = i_8_ - 87;
				}
				if (i_9_ >= 10) {
					bool_7_ = false;
					break;
				}
				if (bool_2_) {
					i_9_ = -i_9_;
				}
				final int i_10_ = i_9_ + (i_4_ * 10);
				if (i_4_ != (i_10_ / 10)) {
					bool_7_ = false;
					break;
				}
				i_4_ = i_10_;
				bool_3_ = true;
			}
			bool = bool_7_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "m.d()");
		}
		return bool;
	}

	Ignore() {
		/* empty */
	}

	public static int method_e_int(final boolean bool, final boolean bool_11_, final short i) {
		int i_12_;
		try {
			int i_13_ = 0;
			if (bool) {
				i_13_ += ((Class_fq.field_e_2456 * 936085691) + (Class_fq.urgentRequests * 787891823));
			}
			if (bool_11_) {
				i_13_ += ((Class_fq.delayedRequests * -1501974469) + (2079901649 * Class_fq.field_h_2448));
			}
			i_12_ = i_13_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "m.e()");
		}
		return i_12_;
	}
}
