/* Class_ds - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public abstract class Bindable {
	static byte[][][] field_y_1701;
	public static final int field_d_1702 = 13;
	public static char field_cf_1703;
	static String[] field_r_1704;
	static final int field_ae_1705 = 4;
	public static Class_fu field_u_1706;
	public static final int field_f_1707 = 16;
	public static final int field_z_1708 = 2;
	static final int field_k_1709 = 6;

	static void method_e_void(final byte i) {
		try {
			ItemContainer.itemContainerTable = new NodeMultiSet(32);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ds.e()");
		}
	}

	public abstract void bind(Component component);

	public abstract void unbind(Component component);

	Bindable() {
		/* empty */
	}

	public static void unbindKeyboard(final Component component, final int i) {
		try {
			component.removeKeyListener(KeyFocusListener.instance);
			component.removeFocusListener(KeyFocusListener.instance);
			KeyFocusListener.field_cv_1686 = 578854117;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ds.n()");
		}
	}

	static final void method_be_void(final int i) {
		try {
			final int i_0_ = Class_fm.menuX * -1281966953;
			final int i_1_ = Class_dw.menuY * 770559729;
			final int i_2_ = Class_eh.menuWidth * -1031757099;
			final int i_3_ = -13989543 * Class_ev.menuHeight;
			final int i_4_ = 6116423;
			Rasterizer.fillRect(i_0_, i_1_, i_2_, i_3_, i_4_);
			Rasterizer.fillRect(1 + i_0_, i_1_ + 1, i_2_ - 2, 16, 0);
			Rasterizer.drawRect(i_0_ + 1, 18 + i_1_, i_2_ - 2, i_3_ - 19, 0);
			IdentityKit.b12Full.method_a_void(MenuText.field_eg_1936, 3 + i_0_, i_1_ + 14, i_4_, -1);
			final int i_5_ = MouseInputListener.field_m_2156 * 1515107729;
			final int i_6_ = MouseInputListener.field_a_2157 * -2089478689;
			for (int i_7_ = 0; i_7_ < (client.currentMenuSize * -224642011); i_7_++) {
				final int i_8_ = 31 + i_1_ + (15 * ((client.currentMenuSize * -224642011) - 1 - i_7_));
				int i_9_ = 16777215;
				if ((i_5_ > i_0_) && (i_5_ < (i_2_ + i_0_)) && (i_6_ > (i_8_ - 13)) && (i_6_ < (3 + i_8_))) {
					i_9_ = 16776960;
				}
				final Class_hd class_hd = IdentityKit.b12Full;
				String string;
				if (client.menuOptions[i_7_].length() > 0) {
					string = new StringBuilder(client.menuActions[i_7_]).append(MenuText.field_fq_1943).append(client.menuOptions[i_7_]).toString();
				} else {
					string = client.menuActions[i_7_];
				}
				class_hd.method_a_void(string, i_0_ + 3, i_8_, i_9_, 0);
			}
			Class_cc.method_bl_void(-1281966953 * Class_fm.menuX, 770559729 * Class_dw.menuY, -1031757099 * Class_eh.menuWidth, Class_ev.menuHeight * -13989543, -1487976279);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ds.be()");
		}
	}

	public abstract int method_y_int();

	static final void method_i_void(final String string, final int i) {
		try {
			if (string.equalsIgnoreCase("toggleroof")) {
				Class_w.field_pz_1501.hideRoofTops = !Class_w.field_pz_1501.hideRoofTops;
				Class_bh.method_z_void(-840141801);
				if (Class_w.field_pz_1501.hideRoofTops) {
					GameStub.sendMessage(99, "", "Roofs are now all hidden");
				} else {
					GameStub.sendMessage(99, "", "Roofs will only be removed selectively");
				}
			}
			if (string.equalsIgnoreCase("displayfps")) {
				client.field_ae_2702 = !client.field_ae_2702;
			}
			if ((-1069253877 * client.myPermissions) >= 0) {
				if (string.equalsIgnoreCase("fpson")) {
					client.field_ae_2702 = true;
				}
				if (string.equalsIgnoreCase("fpsoff")) {
					client.field_ae_2702 = false;
				}
				if (string.equalsIgnoreCase("gc")) {
					System.gc();
				}
				if (string.equalsIgnoreCase("clientdrop")) {
					if ((-874319047 * client.field_cv_2733) > 0) {
						AbstractBuffer.closeSession();
					} else {
						Socket.method_h_void(40, -1036402515);
						WidgetNode.field_cq_796 = Class_cx.connection;
						Class_cx.connection = null;
					}
				}
				if (string.equalsIgnoreCase("errortest") && ((1548930135 * client.game_mode) == 2)) {
					throw new RuntimeException();
				}
			}
			client.encryptedBuffer.writeOpcode(235);
			client.encryptedBuffer.put(string.length() + 1);
			client.encryptedBuffer.putNT0String(string, (byte) -3);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ds.i()");
		}
	}
}
