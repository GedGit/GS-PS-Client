/* Class_ah - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.RandomAccessFile;

public class FloorUnderlay extends CacheableNode {
	static final int field_q_68 = 11;
	public static NodeCache field_d_69 = new NodeCache(64);
	public int field_z_70 = 0;
	public boolean field_e_71 = true;
	public int field_u_72;
	public static FileStore field_n_73;
	public int field_f_74;
	public int field_m_75;
	public int field_a_76;
	public int field_h_77;
	public int field_l_78;
	static final int field_ar_79 = 33;
	static final int field_ac_80 = 37;
	public int field_g_81 = -136496931;
	public int field_y_82 = -1739895447;
	static final int field_bm_83 = 70;
	static Class_du field_po_84;

	public void method_n_void(final int i) {
		try {
			if ((field_g_81 * -1556569973) != -1) {
				method_y_void(field_g_81 * -1556569973, (short) 355);
				field_h_77 = -1153112797 * field_f_74;
				field_l_78 = field_m_75 * -917913241;
				field_u_72 = -891720447 * field_a_76;
			}
			method_y_void(field_z_70 * -975377899, (short) 355);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ah.n()");
		}
	}

	public void method_d_void(final Buffer rsbytebuffer, final int i, final int i_0_) {
		try {
			for (;;) {
				final int i_1_ = rsbytebuffer.get();
				if (i_1_ == 0) {
					break;
				}
				method_z_void(rsbytebuffer, i_1_, i, (byte) -11);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ah.d()");
		}
	}

	void method_y_void(final int i, final short i_2_) {
		try {
			final double d = ((i >> 16) & 0xff) / 256.0;
			final double d_3_ = ((i >> 8) & 0xff) / 256.0;
			final double d_4_ = (i & 0xff) / 256.0;
			double d_5_ = d;
			if (d_3_ < d) {
				d_5_ = d_3_;
			}
			if (d_4_ < d_5_) {
				d_5_ = d_4_;
			}
			double d_6_ = d;
			if (d_3_ > d) {
				d_6_ = d_3_;
			}
			if (d_4_ > d_6_) {
				d_6_ = d_4_;
			}
			double d_7_ = 0.0;
			double d_8_ = 0.0;
			final double d_9_ = (d_5_ + d_6_) / 2.0;
			if (d_6_ != d_5_) {
				if (d_9_ < 0.5) {
					d_8_ = (d_6_ - d_5_) / (d_5_ + d_6_);
				}
				if (d_9_ >= 0.5) {
					d_8_ = (d_6_ - d_5_) / (2.0 - d_6_ - d_5_);
				}
				if (d_6_ == d) {
					d_7_ = (d_3_ - d_4_) / (d_6_ - d_5_);
				} else if (d_3_ == d_6_) {
					d_7_ = ((d_4_ - d) / (d_6_ - d_5_)) + 2.0;
				} else if (d_6_ == d_4_) {
					d_7_ = 4.0 + ((d - d_3_) / (d_6_ - d_5_));
				}
			}
			d_7_ /= 6.0;
			field_f_74 = (int) (d_7_ * 256.0) * -1075925729;
			field_m_75 = (int) (256.0 * d_8_) * -504285177;
			field_a_76 = 2083096831 * (int) (d_9_ * 256.0);
			if ((field_m_75 * 191673783) < 0) {
				field_m_75 = 0;
			} else if ((field_m_75 * 191673783) > 255) {
				field_m_75 = 256298745;
			}
			if ((-8030465 * field_a_76) < 0) {
				field_a_76 = 0;
			} else if ((field_a_76 * -8030465) > 255) {
				field_a_76 = -1386252799;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ah.y()");
		}
	}

	static boolean method_z_boolean(final File file, final boolean bool, final int i) {
		do {
			try {
				try {
					final RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
					final int i_10_ = randomaccessfile.read();
					randomaccessfile.seek(0L);
					randomaccessfile.write(i_10_);
					randomaccessfile.seek(0L);
					randomaccessfile.close();
					if (bool) {
						file.delete();
					}
				} catch (final Exception exception) {
					break;
				}
				return true;
			} catch (final RuntimeException runtimeexception) {
				throw GameCanvas.error(runtimeexception, "ah.z()");
			}
		} while (false);
		return false;
	}

	void method_z_void(final Buffer rsbytebuffer, final int i, final int i_11_, final byte i_12_) {
		do {
			try {
				if (i == 1) {
					field_z_70 = rsbytebuffer.getMediumInt(-1862087750) * 723948861;
				} else if (i == 2) {
					field_y_82 = rsbytebuffer.get() * 1739895447;
				} else if (i == 5) {
					field_e_71 = false;
				} else if (i == 7) {
					field_g_81 = rsbytebuffer.getMediumInt(307794468) * 136496931;
				} else if (i != 8) {
					break;
				}
			} catch (final RuntimeException runtimeexception) {
				throw GameCanvas.error(runtimeexception, "ah.z()");
			}
		} while (false);
	}

	static final void method_cf_void(final int i) {
		try {
			boolean bool = false;
			while (!bool) {
				bool = true;
				for (int i_13_ = 0; i_13_ < ((-224642011 * client.currentMenuSize) - 1); i_13_++) {
					if ((client.field_ik_2832[i_13_] < 1000) && (client.field_ik_2832[1 + i_13_] > 1000)) {
						final String string = client.menuOptions[i_13_];
						client.menuOptions[i_13_] = client.menuOptions[1 + i_13_];
						client.menuOptions[i_13_ + 1] = string;
						final String string_14_ = client.menuActions[i_13_];
						client.menuActions[i_13_] = client.menuActions[i_13_ + 1];
						client.menuActions[1 + i_13_] = string_14_;
						int i_15_ = client.field_ik_2832[i_13_];
						client.field_ik_2832[i_13_] = client.field_ik_2832[i_13_ + 1];
						client.field_ik_2832[1 + i_13_] = i_15_;
						i_15_ = client.field_is_2830[i_13_];
						client.field_is_2830[i_13_] = client.field_is_2830[i_13_ + 1];
						client.field_is_2830[1 + i_13_] = i_15_;
						i_15_ = client.field_io_2831[i_13_];
						client.field_io_2831[i_13_] = client.field_io_2831[1 + i_13_];
						client.field_io_2831[i_13_ + 1] = i_15_;
						i_15_ = client.field_il_2833[i_13_];
						client.field_il_2833[i_13_] = client.field_il_2833[i_13_ + 1];
						client.field_il_2833[i_13_ + 1] = i_15_;
						bool = false;
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ah.cf()");
		}
	}
}
