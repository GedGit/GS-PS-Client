/* Class_dk - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class AbstractBuffer {
	static boolean field_d_1627 = false;

	abstract byte[] get();

	static int method_e_int(final int i) {
		int i_1_;
		try {
			final Class_i class_i = (Class_i) Class_l.field_n_1130.get(Integer.valueOf(i));
			i_1_ = class_i == null ? 0 : class_i.length();
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dk.e()");
		}
		return i_1_;
	}

	AbstractBuffer() {
		/* empty */
	}

	abstract void put(byte[] is);

	static final void closeSession() {
		try {
			if (Class_cx.connection != null) {
				Class_cx.connection.close(-1331206580);
				Class_cx.connection = null;
			}
			Class_q.method_c_void(1389332329);
			Class_ae.sceneGraph.method_n_void();
			for (int z = 0; z < 4; z++) {
				client.collisionMaps[z].reset();
			}
			System.gc();
			Class_fa.field_e_2278 = 1243386265;
			Region.field_g_1012 = null;
			Class_eb.field_f_1772 = -877461501;
			Npc.field_m_298 = -85078463;
			Class_eh.field_a_2122 = 0;
			Class_e.field_l_932 = false;
			Class_de.field_h_1599 = 2049577394;
			client.field_nh_2927 = -1433291941;
			client.field_np_2928 = false;
			Class_bg.method_n_void(-2091620817);
			Socket.method_h_void(10, -897839722);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dk.v()");
		}
	}
}
