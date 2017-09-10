/* Class_cu - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Skeleton {
	int[] field_f_1341;
	static int[] field_d_1342 = new int[500];
	static int[] field_z_1343 = new int[500];
	WidgetNode field_e_1344 = null;
	int[] field_a_1345;
	int field_g_1346 = -1;
	static int[] field_n_1347 = new int[500];
	int[] field_m_1348;
	int[] field_h_1349;
	static int[] field_y_1350 = new int[500];
	boolean field_l_1351 = false;

	Skeleton(final byte[] is, final WidgetNode class_cd) {
		this.field_e_1344 = class_cd;
		final Buffer rsbytebuffer = new Buffer(is);
		final Buffer rsbytebuffer_0_ = new Buffer(is);
		rsbytebuffer.position = -1371713378;
		final int i = rsbytebuffer.get();
		int i_1_ = -1;
		int i_2_ = 0;
		rsbytebuffer_0_.position = ((rsbytebuffer.position * -1485345105) + i) * -685856689;
		for (int i_3_ = 0; i_3_ < i; i_3_++) {
			final int i_4_ = rsbytebuffer.get();
			if (i_4_ > 0) {
				if ((this.field_e_1344.field_z_801[i_3_]) != 0) {
					for (int i_5_ = i_3_ - 1; i_5_ > i_1_; i_5_--) {
						if ((this.field_e_1344.field_z_801[i_5_]) == 0) {
							field_n_1347[i_2_] = i_5_;
							field_d_1342[i_2_] = 0;
							field_z_1343[i_2_] = 0;
							field_y_1350[i_2_] = 0;
							i_2_++;
							break;
						}
					}
				}
				field_n_1347[i_2_] = i_3_;
				int i_6_ = 0;
				if ((this.field_e_1344.field_z_801[i_3_]) == 3) {
					i_6_ = 128;
				}
				if ((i_4_ & 0x1) != 0) {
					field_d_1342[i_2_] = rsbytebuffer_0_.method_al_int((byte) -18);
				} else {
					field_d_1342[i_2_] = i_6_;
				}
				if ((i_4_ & 0x2) != 0) {
					field_z_1343[i_2_] = rsbytebuffer_0_.method_al_int((byte) -85);
				} else {
					field_z_1343[i_2_] = i_6_;
				}
				if ((i_4_ & 0x4) != 0) {
					field_y_1350[i_2_] = rsbytebuffer_0_.method_al_int((byte) -26);
				} else {
					field_y_1350[i_2_] = i_6_;
				}
				i_1_ = i_3_;
				i_2_++;
				if ((this.field_e_1344.field_z_801[i_3_]) == 5) {
					this.field_l_1351 = true;
				}
			}
		}
		if ((rsbytebuffer_0_.position * -1485345105) != is.length) {
			throw new RuntimeException();
		}
		this.field_g_1346 = i_2_;
		this.field_f_1341 = new int[i_2_];
		this.field_m_1348 = new int[i_2_];
		this.field_a_1345 = new int[i_2_];
		this.field_h_1349 = new int[i_2_];
		for (int i_7_ = 0; i_7_ < i_2_; i_7_++) {
			this.field_f_1341[i_7_] = field_n_1347[i_7_];
			this.field_m_1348[i_7_] = field_d_1342[i_7_];
			this.field_a_1345[i_7_] = field_z_1343[i_7_];
			this.field_h_1349[i_7_] = field_y_1350[i_7_];
		}
	}
}
