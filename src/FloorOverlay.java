/* Class_aa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class FloorOverlay extends CacheableNode {
	public int field_f_0;
	public static NodeCache field_d_1 = new NodeCache(64);
	public static final int field_bw_2 = 16;
	public int field_y_3;
	static FileStore field_n_4;
	public int field_g_5;
	static Class_hd field_l_6;
	public static final int field_da_7 = 245;
	static Bindable field_ky_8;
	static int cameraYaw;
	int field_z_10 = 0;
	public int field_e_11;
	public static final int field_eo_12 = 65;
	public static final int field_fx_13 = 183;

	void method_z_void(final int i) {
		try {
			method_g_void(this.field_z_10 * 113306717, 454840615);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "aa.z()");
		}
	}

	void method_y_void(final Buffer rsbytebuffer, final int i, final byte i_0_) {
		try {
			for (;;) {
				final int i_1_ = rsbytebuffer.get();
				if (i_1_ == 0) {
					break;
				}
				method_e_void(rsbytebuffer, i_1_, i, 2101376358);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "aa.y()");
		}
	}

	void method_e_void(final Buffer rsbytebuffer, final int i, final int i_2_, final int i_3_) {
		try {
			if (i == 1) {
				this.field_z_10 = rsbytebuffer.getMediumInt(-931539598) * 705710069;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "aa.e()");
		}
	}

	void method_g_void(final int i, final int i_4_) {
		try {
			final double d = ((i >> 16) & 0xff) / 256.0;
			final double d_5_ = ((i >> 8) & 0xff) / 256.0;
			final double d_6_ = (i & 0xff) / 256.0;
			double d_7_ = d;
			if (d_5_ < d) {
				d_7_ = d_5_;
			}
			if (d_6_ < d_7_) {
				d_7_ = d_6_;
			}
			double d_8_ = d;
			if (d_5_ > d) {
				d_8_ = d_5_;
			}
			if (d_6_ > d_8_) {
				d_8_ = d_6_;
			}
			double d_9_ = 0.0;
			double d_10_ = 0.0;
			final double d_11_ = (d_8_ + d_7_) / 2.0;
			if (d_8_ != d_7_) {
				if (d_11_ < 0.5) {
					d_10_ = (d_8_ - d_7_) / (d_8_ + d_7_);
				}
				if (d_11_ >= 0.5) {
					d_10_ = (d_8_ - d_7_) / (2.0 - d_8_ - d_7_);
				}
				if (d == d_8_) {
					d_9_ = (d_5_ - d_6_) / (d_8_ - d_7_);
				} else if (d_8_ == d_5_) {
					d_9_ = ((d_6_ - d) / (d_8_ - d_7_)) + 2.0;
				} else if (d_6_ == d_8_) {
					d_9_ = 4.0 + ((d - d_5_) / (d_8_ - d_7_));
				}
			}
			d_9_ /= 6.0;
			field_e_11 = 803488363 * (int) (d_10_ * 256.0);
			field_g_5 = -685934473 * (int) (d_11_ * 256.0);
			if ((-1946461629 * field_e_11) < 0) {
				field_e_11 = 0;
			} else if ((field_e_11 * -1946461629) > 255) {
				field_e_11 = -1268897643;
			}
			if ((-1620713145 * field_g_5) < 0) {
				field_g_5 = 0;
			} else if ((field_g_5 * -1620713145) > 255) {
				field_g_5 = 1180368521;
			}
			if (d_11_ > 0.5) {
				field_f_0 = (int) (512.0 * (1.0 - d_11_) * d_10_) * -798504191;
			} else {
				field_f_0 = -798504191 * (int) (d_10_ * d_11_ * 512.0);
			}
			if ((-1215220479 * field_f_0) < 1) {
				field_f_0 = -798504191;
			}
			field_y_3 = ((int) (d_9_ * (-1215220479 * field_f_0)) * 1383161269);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "aa.g()");
		}
	}

	FloorOverlay() {
		/* empty */
	}
}
