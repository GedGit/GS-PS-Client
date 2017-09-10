/* Class_fc - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_fc {
	static final int field_ls_2298 = 1;
	public static final short[][] field_d_2299 = { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 },
		{ 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 },
		{ 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574, 17050 } };
	public static final short[] field_z_2300 = { -10304, 9104, -1, -1, -1 };
	public static final short[][] field_y_2301 = { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 },
		{ 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };
	public static final int field_bn_2302 = 157;
	static final int field_ns_2303 = 2;
	public static final short[] field_n_2304 = { 6798, 8741, 25238, 4626, 4550 };
	public static final int field_ca_2305 = 160;
	public static final int field_ao_2306 = 241;

	public static final void sleep(final long l) {
		try {
			if (l > 0L) {
				if (0L == (l % 10L)) {
					Class_o.sleep(l - 1L);
					Class_o.sleep(1L);
				} else {
					Class_o.sleep(l);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fc.n()");
		}
	}

	Class_fc() throws Throwable {
		throw new Error();
	}
}
