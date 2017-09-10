/* Class_fv - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_fv {
	static final int field_l_2502 = 4;
	public static int[] configValues;
	public static final int field_cy_2504 = 33;
	public static int[] configs;
	public static int[] field_g_2506;
	public static final int field_p_2507 = 117;
	public static int[] field_n_2508 = new int[32];

	static {
		int i = 2;
		for (int i_0_ = 0; i_0_ < 32; i_0_++) {
			field_n_2508[i_0_] = i - 1;
			i += i;
		}
		configValues = new int[2000];
		configs = new int[2000];
	}

	Class_fv() throws Throwable {
		throw new Error();
	}
}
