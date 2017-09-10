/* GroundTile - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class SceneTile extends Node {
	Class_cq field_e_1097;
	int field_d_1098;
	SceneTile floorDecoration;
	int field_z_1100;
	int field_n_1101;
	Class_cv boundary;
	Boundary boundaryObject;
	WallDecoration wallDecoration;
	GroundDecoration playerUpdateBlockHandler;
	boolean field_s_1106;
	int field_l_1107;
	int field_v_1108;
	Class_cx field_h_1109;
	int field_k_1110 = 0;
	int field_x_1111;
	SceneObject[] interactableObjects = new SceneObject[5];
	boolean field_j_1113;
	int field_p_1114;
	int[] field_q_1115 = new int[5];
	boolean field_r_1116;
	int field_c_1117;
	int field_o_1118;
	int field_y_1119;
	static final int field_bo_1120 = 68;
	static final int field_bh_1121 = 87;
	static int[] field_i_1122;

	SceneTile(final int i, final int i_0_, final int i_1_) {
		this.field_z_1100 = (this.field_n_1101 = -147349365 * i) * -1974676903;
		this.field_d_1098 = -1478901605 * i_0_;
		this.field_y_1119 = -2040222097 * i_1_;
	}

	static void method_z_void(final Index class_fx, final int i, final int i_2_, final int i_3_, final byte i_4_, final boolean bool, final int i_5_) {
		try {
			final long l = (i << 16) + i_2_;
			OnDemandNode class_ff = (OnDemandNode) Class_fq.field_y_2445.method_n_ga(l);
			if (class_ff == null) {
				class_ff = (OnDemandNode) Class_fq.priorityRequests.method_n_ga(l);
				if (class_ff == null) {
					class_ff = (OnDemandNode) Class_fq.field_a_2438.method_n_ga(l);
					if (class_ff != null) {
						if (bool) {
							class_ff.update();
							Class_fq.field_y_2445.method_d_void(class_ff, l);
							Class_fq.field_h_2448 -= 879161649;
							Class_fq.field_e_2456 += 1175813235;
						}
					} else {
						if (!bool) {
							class_ff = ((OnDemandNode) Class_fq.field_l_2440.method_n_ga(l));
							if (class_ff != null) {
								return;
							}
						}
						class_ff = new OnDemandNode();
						class_ff.field_n_2323 = class_fx;
						class_ff.field_d_2320 = i_3_ * -2094913979;
						class_ff.field_z_2321 = i_4_;
						if (bool) {
							Class_fq.field_y_2445.method_d_void(class_ff, l);
							Class_fq.field_e_2456 += 1175813235;
						} else {
							Class_fq.field_m_2437.method_n_void(class_ff);
							Class_fq.field_a_2438.method_d_void(class_ff, l);
							Class_fq.field_h_2448 += 879161649;
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "cm.z()");
		}
	}

	static void method_e_void(final int i) {
		do {
			try {
				try {
					final File file = new File(Class_ed.cache_dir, "random.dat");
					if (file.exists()) {
						Class_ed.field_l_2069 = new CacheFile(new SeekableFile(file, "rw", 25L), 24, 0);
					} else {
						while_13_: for (int i_6_ = 0; i_6_ < Class_ed.field_j_2065.length; i_6_++) {
							for (int i_7_ = 0; i_7_ < Bindable.field_r_1704.length; i_7_++) {
								final File file_8_ = new File(new StringBuilder(Bindable.field_r_1704[i_7_]).append(Class_ed.field_j_2065[i_6_]).append(File.separatorChar).append("random.dat").toString());
								if (file_8_.exists()) {
									Class_ed.field_l_2069 = new CacheFile(new SeekableFile(file_8_, "rw", 25L), 24, 0);
									break while_13_;
								}
							}
						}
					}
					if (Class_ed.field_l_2069 == null) {
						final RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
						final int i_9_ = randomaccessfile.read();
						randomaccessfile.seek(0L);
						randomaccessfile.write(i_9_);
						randomaccessfile.seek(0L);
						randomaccessfile.close();
						Class_ed.field_l_2069 = new CacheFile(new SeekableFile(file, "rw", 25L), 24, 0);
					}
				} catch (final IOException ioexception) {
					break;
				}
				break;
			} catch (final RuntimeException runtimeexception) {
				throw GameCanvas.error(runtimeexception, "cm.e()");
			}
		} while (false);
	}

	static void method_n_void(final int i) {
		try {
			Region.field_z_993 = -1767863399;
			Bindable.field_y_1701 = new byte[4][104][104];
			Region.field_e_994 = new byte[4][104][104];
			Class_df.field_g_1610 = new byte[4][104][104];
			ClanMember.field_f_808 = new byte[4][104][104];
			Friend.field_x_1092 = new int[4][105][105];
			Region.field_m_1007 = new byte[4][105][105];
			Class_ge.field_a_2977 = new int[105][105];
			Npc.field_h_291 = new int[104];
			Region.field_l_1006 = new int[104];
			Class_bh.field_u_558 = new int[104];
			Class_cw.field_q_1412 = new int[104];
			Class_bh.field_k_564 = new int[104];
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "cm.n()");
		}
	}
}
