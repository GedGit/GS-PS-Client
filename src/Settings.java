/* Class_fi - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Settings {

	/**
	 * Giving it a port.
	 */
	public static final int PORT = 43594;

	/**
	 * Telling the client if we're going to be forever alone or not.
	 */
	public static final boolean LOCAL_HOST = true;

	/** 
	 * Naming our frame & cache.
	 */
	public static final String NAME = "Salve-PS - ALPHA";

	/**
	 * And an IP to connect to..
	 */
	public static String IP = Settings.LOCAL_HOST ? "127.0.0.1" : "144.217.242.115"; 

	/**
	 * Should we hide the world list?
	 */
	public static final int WORLD_LIST = 1; // 0 enabled / 1 disabled

	/**
	 * Parameters
	 */
	static final Settings field_f_2358 = new Settings("14", "14");
	static final Settings field_y_2359 = new Settings("9", "9");
	static final Settings field_d_2360 = new Settings("15", "15");
	static final Settings field_l_2361 = new Settings("13", "13");
	static final Settings field_e_2362 = new Settings("11", "11");
	public static final Settings field_q_2363 = new Settings("6", "6");
	static final Settings field_z_2364 = new Settings("7", "7");
	static final Settings field_m_2365 = new Settings("5", "5");
	static final Settings field_a_2366 = new Settings("3", "3");
	static final Settings field_h_2367 = new Settings("4", "4");
	static final Settings field_g_2368 = new Settings("12", "12");
	static final Settings field_u_2369 = new Settings("1", "1");
	public static final Settings field_k_2370 = new Settings("10", "10");
	static final Settings field_n_2371 = new Settings("8", "8");
	static final Settings field_x_2372 = new Settings("2", "2");
	public final String key;
	public static final int field_at_2374 = 43;
	static final int field_w_2375 = 4;

	/**
	 * Constructing parameters
	 * 
	 * @param string
	 * @param string_0_
	 */
	Settings(final String string, final String string_0_) {
		key = string_0_;
	}
}
