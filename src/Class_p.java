/* Class_p - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Comparator;

@SuppressWarnings("rawtypes")
final class Class_p implements Comparator {
	static final int field_p_1245 = 21;
	final boolean val$preferOwnWorld;
	static final int field_ba_1246 = 1006;
	static String field_ah_1247;
	static final int field_bw_1248 = 69;
	public static final int field_g_1249 = 8;
	public static final int field_ck_1250 = 132;
	public static final int field_fp_1251 = 48;
	public static final int field_dz_1252 = 249;

	@Override
	public boolean equals(final Object object) {
		boolean bool;
		try {
			bool = super.equals(object);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "p.equals()");
		}
		return bool;
	}

	@Override
	public int compare(final Object object, final Object object_0_) {
		int i;
		try {
			i = method_n_int((Class_gg) object, (Class_gg) object_0_, -1230838737);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "p.compare()");
		}
		return i;
	}

	Class_p(final boolean bool) {
		val$preferOwnWorld = bool;
	}

	int method_n_int(final Class_gg class_gg, final Class_gg class_gg_1_, final int i) {
		int i_2_;
		try {
			if ((class_gg_1_.field_n_3000 * 1411512875) == (class_gg.field_n_3000 * 1411512875)) {
				return 0;
			}
			if (this.val$preferOwnWorld) {
				if ((client.currentWorld * 1536832127) == (class_gg.field_n_3000 * 1411512875)) {
					return -1;
				}
				if ((1536832127 * client.currentWorld) == (class_gg_1_.field_n_3000 * 1411512875)) {
					return 1;
				}
			}
			i_2_ = ((class_gg.field_n_3000 * 1411512875) < (class_gg_1_.field_n_3000 * 1411512875)) ? -1 : 1;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "p.n()");
		}
		return i_2_;
	}

	static final void method_e_void(final byte[] is, final int i, final int i_3_, final int i_4_, final int i_5_, final int i_6_, final int i_7_, final int i_8_, final CollisionMap[] collisionmaps, final byte i_9_) {
		try {
			for (int i_10_ = 0; i_10_ < 8; i_10_++) {
				for (int i_11_ = 0; i_11_ < 8; i_11_++) {
					if (((i_10_ + i_3_) > 0) && ((i_10_ + i_3_) < 103) && ((i_4_ + i_11_) > 0) && ((i_4_ + i_11_) < 103)) {
						collisionmaps[i].flags[i_10_ + i_3_][i_4_ + i_11_] &= ~0x1000000;
					}
				}
			}
			final Buffer rsbytebuffer = new Buffer(is);
			for (int i_12_ = 0; i_12_ < 4; i_12_++) {
				for (int i_13_ = 0; i_13_ < 64; i_13_++) {
					for (int i_14_ = 0; i_14_ < 64; i_14_++) {
						if ((i_5_ == i_12_) && (i_13_ >= i_6_) && (i_13_ < (i_6_ + 8)) && (i_14_ >= i_7_) && (i_14_ < (i_7_ + 8))) {
							GameMessage.method_g_void(rsbytebuffer, i, i_3_ + MachineInformationNode.method_n_int(i_13_ & 0x7, i_14_ & 0x7, i_8_, (byte) 73), i_4_ + Class_am.method_d_int(i_13_ & 0x7, i_14_ & 0x7, i_8_, (byte) -14), 0, 0, i_8_, -2110868691);
						} else {
							GameMessage.method_g_void(rsbytebuffer, 0, -1, -1, 0, 0, 0, -679802268);
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "p.e()");
		}
	}
}
