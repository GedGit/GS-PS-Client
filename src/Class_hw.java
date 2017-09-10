/* Class_hw - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class_hw {
	public static final int field_n_3117 = 1;
	public static final int field_g_3118 = 33554432;
	public static final int field_z_3119 = 4;
	public static final int field_y_3120 = 8;
	public static final int field_e_3121 = 1024;
	public static final int field_d_3122 = 2;

	static final void method_bf_void(final boolean bool, final byte i) {
		client.localEntityAmount = 0;
		client.field_gr_2808 = 0;
		Class_ci.updateLocalNPCs(-991298274);
		MillisecondTimer.updateNpcs(bool, 495123047);
		Class_d.handleNpcUpdateFlags(-44750568);//so this aint fixed 
		for (int index = 0; index < (-696223895 * client.localEntityAmount); index++) {
			final int i_1_ = client.localPlayerIndices[index];
			if ((-542884301 * client.npcs[i_1_].cycle) != (client.currentCycle * 303796053)) {
				client.npcs[i_1_].composite = null;
				client.npcs[i_1_] = null;
			}
		}
		if ((-1485345105 * client.inbound.position) != (client.current_packet_size * 1815751203)) {
			throw new RuntimeException(new StringBuilder(String.valueOf(-1485345105 * (client.inbound.position))).append(Class_d.field_d_859).append(1815751203 * client.current_packet_size).toString());
		}
		for (int i_2_ = 0; i_2_ < (client.localNpcCount * 1308149425); i_2_++) {
			if (client.npcs[client.npcIndexArray[i_2_]] == null) {
				throw new RuntimeException(new StringBuilder(String.valueOf(i_2_)).append(Class_d.field_d_859).append(client.localNpcCount * 1308149425).toString());
			}
		}
	}

	Class_hw() throws Throwable {
		throw new Error();
	}
}
