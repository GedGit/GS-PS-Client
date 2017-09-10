/* Class_fq - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.CRC32;

public class Class_fq {
	public static int field_b_2431 = 0;
	public static long field_z_2432;
	public static int field_d_2433 = 0;
	public static Buffer field_r_2434;
	public static NodeMultiSet priorityRequests = new NodeMultiSet(32);
	static Index[] field_p_2436 = new Index[256];
	public static NodeQueue field_m_2437 = new NodeQueue();
	public static NodeMultiSet field_a_2438 = new NodeMultiSet(4096);
	public static int field_j_2439 = 0;
	public static NodeMultiSet field_l_2440 = new NodeMultiSet(4096);
	public static int delayedRequests = 0;
	static boolean field_q_2442;
	public static Buffer js5Buffer = new Buffer(8);
	static Class_av field_nt_2444;
	public static NodeMultiSet field_y_2445 = new NodeMultiSet(4096);
	static CRC32 field_v_2446 = new CRC32();
	public static int urgentRequests = 0;
	public static int field_h_2448 = 0;
	public static byte field_o_2449 = 0;
	static Buffer field_c_2450;
	public static int field_t_2451 = 0;
	static final int field_bs_2452 = 67;
	public static final int field_fe_2453 = 64;
	public static final int field_eq_2454 = 52;
	public static final int field_en_2455 = 212;
	public static int field_e_2456 = 0;
	public static final int field_es_2457 = 166;
	static final int field_oz_2458 = 400;

	static final void method_eq_void(final String string, final int i) {
		try {
			if (Class_dd.field_mq_1588 != null) {
				client.encryptedBuffer.writeOpcode(204);
				client.encryptedBuffer.put(Class_cl.getStringLength(string, (byte) 1));
				client.encryptedBuffer.putNT0String(string, (byte) -70);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fq.eq()");
		}
	}

	Class_fq() throws Throwable {
		throw new Error();
	}
}
