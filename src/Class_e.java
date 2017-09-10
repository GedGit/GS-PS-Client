/* Class_e - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

public class Class_e {
	static final int field_v_930 = 20;
	static final BigInteger RSA_EXPONENT = new BigInteger("10001", 16);
	public static boolean field_l_932;
	static final BigInteger RSA_MODULUS = (new BigInteger("b0ff4517e425e64339e935dee9bd13a46fbe5492a7f8a255129abdacb603308d4e8ead77cc83310e14b034b6cc0dab3b128e2cea550dce86cb749ffffabc98e4eaba1d11d960b7f904dcc2e1b3b380f5c133ffd0a39d3fa8073f2ae9c8aa86301873c3e99e89567d14f73cf7c64cb6bc1e6247cf037f921e0aff30663bd716fd", 16));
	public static final int field_fk_934 = 44;

	static final void method_av_void(final byte i) {
		try {
			client.field_gk_2804 = 0;
			final int i_0_ = ((1693061403 * Class_q.originX) + ((Class_ci.myPlayer.worldPosX * -2103184911) >> 7));
			final int i_1_ = ((Class_gf.originY * -1593604783) + ((Class_ci.myPlayer.worldPosY * 2088773389) >> 7));
			if ((i_0_ >= 3053) && (i_0_ <= 3156) && (i_1_ >= 3056) && (i_1_ <= 3136)) {
				client.field_gk_2804 = -1846818523;
			}
			if ((i_0_ >= 3072) && (i_0_ <= 3118) && (i_1_ >= 9492) && (i_1_ <= 9535)) {
				client.field_gk_2804 = -1846818523;
			}
			if (((client.field_gk_2804 * -801822035) == 1) && (i_0_ >= 3139) && (i_0_ <= 3199) && (i_1_ >= 3008) && (i_1_ <= 3062)) {
				client.field_gk_2804 = 0;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "e.av()");
		}
	}

	static final Menu method_dd_y(final int i, final int i_2_, final int i_3_, final int i_4_) {
		Menu interfacepositionnode;
		try {
			final Menu interfacepositionnode_5_ = new Menu();
			interfacepositionnode_5_.interfaceId = -340297413 * i_2_;
			interfacepositionnode_5_.field_d_1534 = i_3_ * -637060343;
			client.menuTable.method_d_void(interfacepositionnode_5_, i);
			if (Class_fz.loadWidget(i_2_, 1911990064)) {
				final Widget[] widgets = Widget.widgets[i_2_];
				for (final Widget widget2 : widgets) {
					final Widget widget = widget2;
					if (widget != null) {
						widget.field_eq_2664 = 0;
						widget.field_en_2665 = 0;
					}
				}
			}
			final Widget widget = Class_en.getWidgetByUID(i, (short) 7784);
			Daemon.method_dn_void(widget, (byte) 5);
			if (client.field_jd_2762 != null) {
				Daemon.method_dn_void(client.field_jd_2762, (byte) -9);
				client.field_jd_2762 = null;
			}
			Actor.method_cc_void();
			Class_bk.method_cg_void(Widget.widgets[i >> 16], widget, false, -339369074);
			Class_et.method_d_void(i_2_, 1236900615);
			if ((-374264803 * client.rootInterfaceId) != -1) {
				final int i_7_ = -374264803 * client.rootInterfaceId;
				if (Class_fz.loadWidget(i_7_, 838219705)) {
					Class_dg.method_di_void(Widget.widgets[i_7_], 1, 1337430586);
				}
			}
			interfacepositionnode = interfacepositionnode_5_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "e.dd()");
		}
		return interfacepositionnode;
	}

	public static boolean method_d_boolean(final int i, final int i_8_, final byte i_9_) {
		boolean bool;
		try {
			if (((i >> (1 + i_8_)) & 0x1) != 0) {
				return true;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "e.d()");
		}
		return bool;
	}

	Class_e() throws Throwable {
		throw new Error();
	}
}
