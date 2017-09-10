/* Class_bo - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_bo {
	Class_by[] field_d_610 = new Class_by[10];
	static final int field_n_611 = 22050;
	int field_z_612;
	int field_y_613;

	public static Class_bo method_n_bo(final FileStore class_fs, final int i, final int i_0_) {
		final byte[] is = class_fs.getArchive(i, i_0_);
		return is == null ? null : new Class_bo(new Buffer(is));
	}

	public Class_ba method_d_ba() {
		final byte[] is = method_y_byteArray();
		return new Class_ba(22050, is, (22050 * this.field_z_612) / 1000, (22050 * this.field_y_613) / 1000);
	}

	Class_bo(final Buffer rsbytebuffer) {
		for (int i = 0; i < 10; i++) {
			final int i_1_ = rsbytebuffer.get();
			if (i_1_ != 0) {
				rsbytebuffer.position -= -685856689;
				this.field_d_610[i] = new Class_by();
				this.field_d_610[i].method_z_void(rsbytebuffer);
			}
		}
		this.field_z_612 = rsbytebuffer.getShort();
		this.field_y_613 = rsbytebuffer.getShort();
	}

	final byte[] method_y_byteArray() {
		int i = 0;
		for (int i_2_ = 0; i_2_ < 10; i_2_++) {
			if ((this.field_d_610[i_2_] != null) && (((this.field_d_610[i_2_].field_r_705) + (this.field_d_610[i_2_].field_j_706)) > i)) {
				i = ((this.field_d_610[i_2_].field_r_705) + (this.field_d_610[i_2_].field_j_706));
			}
		}
		if (i == 0) {
			return new byte[0];
		}
		final int i_3_ = (22050 * i) / 1000;
		final byte[] is = new byte[i_3_];
		for (int i_4_ = 0; i_4_ < 10; i_4_++) {
			if (this.field_d_610[i_4_] != null) {
				final int i_5_ = (((this.field_d_610[i_4_].field_r_705) * 22050) / 1000);
				final int i_6_ = (((this.field_d_610[i_4_].field_j_706) * 22050) / 1000);
				final int[] is_7_ = (this.field_d_610[i_4_].method_n_intArray(i_5_, (this.field_d_610[i_4_].field_r_705)));
				for (int i_8_ = 0; i_8_ < i_5_; i_8_++) {
					int i_9_ = is[i_8_ + i_6_] + (is_7_[i_8_] >> 8);
					if (((i_9_ + 128) & ~0xff) != 0) {
						i_9_ = (i_9_ >> 31) ^ 0x7f;
					}
		is[i_8_ + i_6_] = (byte) i_9_;
				}
			}
		}
		return is;
	}

	public final int method_z_int() {
		int i = 9999999;
		for (int i_10_ = 0; i_10_ < 10; i_10_++) {
			if ((this.field_d_610[i_10_] != null) && (((this.field_d_610[i_10_].field_j_706) / 20) < i)) {
				i = (this.field_d_610[i_10_].field_j_706) / 20;
			}
		}
		if ((this.field_z_612 < this.field_y_613) && ((this.field_z_612 / 20) < i)) {
			i = this.field_z_612 / 20;
		}
		if ((i != 9999999) && (i != 0)) {
			for (int i_11_ = 0; i_11_ < 10; i_11_++) {
				if (this.field_d_610[i_11_] != null) {
					this.field_d_610[i_11_].field_j_706 -= i * 20;
				}
			}
			if (this.field_z_612 < this.field_y_613) {
				this.field_z_612 -= i * 20;
				this.field_y_613 -= i * 20;
			}
			return i;
		}
		return 0;
	}
}
