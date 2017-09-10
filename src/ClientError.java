/* Class_er - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;

public class ClientError extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static Applet field_n_2205;
	Throwable field_e_2206;
	public static String field_d_2207;
	String field_y_2208;
	static int clientVersion;
	static Build build; 
	public static final int field_cw_2211 = 179;
	static final int field_r_2212 = 32768;

	ClientError(final Throwable throwable, final String string) {
		this.field_y_2208 = string;
		this.field_e_2206 = throwable;
	}

	static final int method_l_int(final int i, final int i_0_, final int i_1_, final int i_2_) {
		int i_3_;
		try {
			final int i_4_ = i / i_1_;
			final int i_5_ = i & (i_1_ - 1);
			final int i_6_ = i_0_ / i_1_;
			final int i_7_ = i_0_ & (i_1_ - 1);
			final int i_8_ = SceneObject.method_q_int(i_4_, i_6_, (short) 22264);
			final int i_9_ = SceneObject.method_q_int(1 + i_4_, i_6_, (short) -4290);
			final int i_10_ = SceneObject.method_q_int(i_4_, 1 + i_6_, (short) -8273);
			final int i_11_ = SceneObject.method_q_int(1 + i_4_, 1 + i_6_, (short) 7588);
			final int i_12_ = Class_ae.method_u_int(i_8_, i_9_, i_5_, i_1_, 1412526723);
			final int i_13_ = Class_ae.method_u_int(i_10_, i_11_, i_5_, i_1_, -1926765042);
			i_3_ = Class_ae.method_u_int(i_12_, i_13_, i_7_, i_1_, 747236340);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "er.l()");
		}
		return i_3_;
	}
}
