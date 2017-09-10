/* Class_dr - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_dr {
	static Index skinIndex;
	static final int field_ae_1697 = 30;
	static final int field_at_1698 = 39;
	public static final int field_bx_1699 = 35;
	public static final int field_y_1700 = 5;

	static boolean method_n_boolean(final int i, final int i_0_, final int i_1_) {
		boolean bool;
		try {
			if ((i == 4) && (i_0_ == 8)) {
				return false;
			}
			bool = true;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dr.n()");
		}
		return bool;
	}

	Class_dr() throws Throwable {
		throw new Error();
	}

	static final void method_ce_void(String action, final String name, final int i, final int i_3_, final int i_4_,
			final int i_5_, final int i_6_) {
		try {
			if (!client.isMenuOpen && ((client.currentMenuSize * -224642011) < 500)) {
				if (action.equalsIgnoreCase("minigames"))
					action = "Salve-PS Dashboard"; 

				client.menuActions[client.currentMenuSize * -224642011] = action;
				client.menuActions[client.currentMenuSize * -224642011] = action;
				client.menuOptions[client.currentMenuSize * -224642011] = name;
				client.field_ik_2832[-224642011 * client.currentMenuSize] = i;
				client.field_il_2833[-224642011 * client.currentMenuSize] = i_3_; 
				client.field_is_2830[client.currentMenuSize * -224642011] = i_4_;
				client.field_io_2831[-224642011 * client.currentMenuSize] = i_5_;
				client.currentMenuSize += -1850638419;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dr.ce()");
		}
	}
}
