/* Class_ba - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_ba extends Class_bn {
	int field_y_503;
	public int field_z_504;
	public int field_n_505;
	public byte[] field_d_506;
	public boolean field_e_507;

	Class_ba(final int i, final byte[] is, final int i_0_, final int i_1_, final boolean bool) {
		field_n_505 = i;
		field_d_506 = is;
		field_z_504 = i_0_;
		this.field_y_503 = i_1_;
		field_e_507 = bool;
	}

	Class_ba(final int i, final byte[] is, final int i_2_, final int i_3_) {
		field_n_505 = i;
		field_d_506 = is;
		field_z_504 = i_2_;
		this.field_y_503 = i_3_;
	}

	public Class_ba method_n_ba(final Class_bh class_bh) {
		field_d_506 = class_bh.method_n_byteArray(field_d_506, -1096412408);
		field_n_505 = class_bh.method_d_int(field_n_505, (byte) -7);
		if (field_z_504 == this.field_y_503) {
			field_z_504 = this.field_y_503 = class_bh.method_z_int(field_z_504, 1188203183);
		} else {
			field_z_504 = class_bh.method_z_int(field_z_504, 126004931);
			this.field_y_503 = class_bh.method_z_int(this.field_y_503, 2146591462);
			if (field_z_504 == this.field_y_503) {
				field_z_504--;
			}
		}
		return this;
	}
}
