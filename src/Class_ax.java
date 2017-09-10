/* Class_ax - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_ax {
	static int field_d_415 = 0;
	static Sprite field_y_416;
	static int field_t_417 = 0;
	static Sprite[] stars;
	static Sprite field_m_419;
	static Sprite[] field_a_420;
	static Sprite field_h_421;
	static int field_ae_422 = 0;
	static int[] field_s_423 = new int[256];
	public static final int field_fz_424 = 161;
	static int field_ax_425 = 0;
	static int field_b_426 = 0;
	static Sprite field_z_427;
	static String field_am_428 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00c2\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
	static int field_al_429 = 0;
	static int field_as_430 = -1331433186;
	static String updateStatusText = "";
	static int loginScreenStatus = 0;
	static String loginResponseMessage = "";
	static String loginResponseMessage1 = "";
	static String loginResponseMessage2 = "";
	static String username = "";
	static String password = "";
	static Class_ez field_aw_438 = Class_ez.field_z_2271;
	static boolean field_aq_439 = true;
	static int field_r_440 = (1408190063 * field_d_415) + 60243526;
	static boolean field_n_441;
	static String field_aj_442 = "1234567890";
	static boolean field_ap_443 = false;
	static int field_ar_444 = 0;
	static int field_bw_445 = -1206921623;
	static final int field_q_446 = 2;
	public static final int field_dj_447 = 118;
	static int loginScreenSelectedFieldId = 0;

	public static void playTune(final FileStore store, final String name, final String string_0_, final int i, final boolean bool, final byte i_1_) {
		try {
			final int file = store.getByName(name);
			final int member = store.getFileIndex(file, string_0_);
			Index.method_d_void(store, file, member, i, bool, 824045845);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ax.n()");
		}
	}

	Class_ax() throws Throwable {
		throw new Error();
	}
}
