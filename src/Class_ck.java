/* Class_ck - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class_ck {
	int field_r_1032;
	final int field_d_1033 = 16;
	public static final int field_bl_1034 = 131;
	public static final int field_gz_1035 = 177;
	final int field_e_1036 = 50;
	int field_p_1037;
	byte[] field_f_1038;
	final int field_y_1039 = 6;
	int field_a_1040;
	int field_u_1041;
	int field_l_1042 = 0;
	int field_c_1043;
	int field_q_1044;
	byte field_k_1045;
	int field_x_1046;
	byte[] field_h_1047;
	int field_j_1048;
	final int field_g_1049 = 18002;
	int field_v_1050;
	int[] field_o_1051 = new int[256];
	final int field_z_1052 = 258;
	int field_m_1053 = 0;
	int field_b_1054;
	int[] field_t_1055 = new int[257];
	final int field_n_1056 = 4096;
	boolean[] field_ad_1057 = new boolean[256];
	boolean[] field_ak_1058 = new boolean[16];
	int field_s_1059;
	byte[] field_ax_1060 = new byte[4096];
	int[] field_al_1061 = new int[16];
	byte[] field_ar_1062 = new byte[18002];
	byte[] field_as_1063 = new byte[18002];
	byte[][] field_ab_1064 = new byte[6][258];
	int[][] field_ao_1065 = new int[6][258];
	int[][] field_ac_1066 = new int[6][258];
	int[][] field_az_1067 = new int[6][258];
	int[] field_at_1068 = new int[6];
	int field_aa_1069;
	static final int field_be_1070 = 15;
	int field_i_1071;
	byte[] field_ae_1072 = new byte[256];

	Class_ck() {
		/* empty */
	}

	static final void method_bc_void(final int i, final int i_0_, final int i_1_) {
		try {
			if (((-224642011 * client.currentMenuSize) >= 2) || ((client.selectedOptionType * -1595363093) != 0) || client.isOptionSelected) {
				String string;
				if (((client.selectedOptionType * -1595363093) == 1) && ((client.currentMenuSize * -224642011) < 2)) {
					string = new StringBuilder(MenuText.USE).append(MenuText.field_fq_1943).append(client.field_it_2841).append(" ").append(Class_d.field_g_858).toString();
				} else if (client.isOptionSelected && ((client.currentMenuSize * -224642011) < 2)) {
					string = new StringBuilder(client.field_in_2845).append(MenuText.field_fq_1943).append(client.selectedOption).append(" ").append(Class_d.field_g_858).toString();
				} else {
					final int i_2_ = (client.currentMenuSize * -224642011) - 1;
					String string_3_;
					if (client.menuOptions[i_2_].length() > 0) {
						string_3_ = new StringBuilder(client.menuActions[i_2_]).append(MenuText.field_fq_1943).append(client.menuOptions[i_2_]).toString();
					} else {
						string_3_ = client.menuActions[i_2_];
					}
					string = string_3_;
				}
				if ((-224642011 * client.currentMenuSize) > 2) {
					string = new StringBuilder(string).append(Class_r.colorString(16777215)).append(" ").append('/').append(" ").append((-224642011 * client.currentMenuSize) - 2).append(MenuText.field_ev_1911).toString();
				}
				IdentityKit.b12Full.drawString(string, 4 + i, i_0_ + 15, 16777215, 0, ((303796053 * client.currentCycle) / 1000));
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ck.bc()");
		}
	}

	static final String method_cx_String(final int i, final int i_4_, final byte i_5_) {
		String string;
		try {
			final int i_6_ = i_4_ - i;
			string = (i_6_ < -9 ? Class_r.colorString(16711680) : i_6_ < -6 ? Class_r.colorString(16723968) : i_6_ < -3 ? Class_r.colorString(16740352) : i_6_ < 0 ? Class_r.colorString(16756736) : i_6_ > 9 ? Class_r.colorString(65280) : i_6_ > 6 ? Class_r.colorString(4259584) : i_6_ > 3 ? Class_r.colorString(
					8453888) : i_6_ > 0 ? Class_r.colorString(12648192) : Class_r.colorString(16776960));
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ck.cx()");
		}
		return string;
	}
}
