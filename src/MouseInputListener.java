/* Class_ek - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseInputListener implements MouseListener, MouseMotionListener, FocusListener {
	public static volatile int field_d_2150 = 0;
	public static long field_r_2151 = 0L;
	static volatile int field_z_2152 = 0;
	static volatile int mouseX = 647801581;
	static volatile int mouseY = 1339431805;
	public static int field_f_2155 = 0;
	public static int field_m_2156 = 0;
	public static int field_a_2157 = 0;
	public static int field_x_2158 = 0;
	static volatile int pressX = 0;
	static volatile int pressY = 0;
	static volatile long lastClickTime = 0L;
	public static int field_q_2162 = 0;
	public static MouseInputListener instance = new MouseInputListener();
	public static int field_k_2164 = 0;
	static volatile int field_y_2165 = 0;

	@Override
	public final synchronized void mousePressed(final MouseEvent mouseevent) {
		try {
			if (instance != null) {
				field_d_2150 = 0;
				pressX = mouseevent.getX() * -634468831;
				pressY = mouseevent.getY() * -20843829;
				lastClickTime = (Renderable.getCurrentTime(483538387) * -2849510597840479921L);
				if (mouseevent.isAltDown()) {
					field_y_2165 = 2030584196;
					field_z_2152 = -1783426524;
				} else if (mouseevent.isMetaDown()) {
					field_y_2165 = -1132191550;
					field_z_2152 = 1255770386;
				} else {
					field_y_2165 = -566095775;
					field_z_2152 = -1519598455;
				}
			}
			if (mouseevent.isPopupTrigger()) {
				mouseevent.consume();
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ek.mousePressed()");
		}
	}

	@Override
	public final synchronized void mouseReleased(final MouseEvent mouseevent) {
		try {
			if (instance != null) {
				field_d_2150 = 0;
				field_z_2152 = 0;
			}
			if (mouseevent.isPopupTrigger()) {
				mouseevent.consume();
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ek.mouseReleased()");
		}
	}

	@Override
	public final void mouseClicked(final MouseEvent mouseevent) {
		try {
			if (mouseevent.isPopupTrigger()) {
				mouseevent.consume();
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ek.mouseClicked()");
		}
	}

	@Override
	public final synchronized void mouseExited(final MouseEvent mouseevent) {
		try {
			if (instance != null) {
				field_d_2150 = 0;
				mouseX = 647801581;
				mouseY = 1339431805;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ek.mouseExited()");
		}
	}

	@Override
	public final synchronized void mouseMoved(final MouseEvent mouseevent) {
		try {
			if (instance != null) {
				field_d_2150 = 0;
				mouseX = mouseevent.getX() * -647801581;
				mouseY = mouseevent.getY() * -1339431805;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ek.mouseMoved()");
		}
	}

	@Override
	public final void focusGained(final FocusEvent focusevent) {
		/* empty */
	}

	@Override
	public final synchronized void focusLost(final FocusEvent focusevent) {
		try {
			if (instance != null) {
				field_z_2152 = 0;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ek.focusLost()");
		}
	}

	@Override
	public final synchronized void mouseDragged(final MouseEvent mouseevent) {
		try {
			int x = mouseevent.getX() * -647801581;
			int y = mouseevent.getY() * -1339431805;
			if (instance != null) {
				field_d_2150 = 0;
				mouseX = x;
				mouseY = y;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ek.mouseDragged()");
		}
	}

	public static Settings[] getClientParameters() {
		Settings[] class_fis;
		try {
			class_fis = (new Settings[] { Settings.field_g_2368, Settings.field_e_2362, Settings.field_u_2369, Settings.field_h_2367, Settings.field_l_2361, Settings.field_z_2364, Settings.field_m_2365, Settings.field_k_2370, Settings.field_x_2372, Settings.field_y_2359, Settings.field_q_2363, Settings.field_f_2358, Settings.field_d_2360, Settings.field_n_2371, Settings.field_a_2366 });
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ek.n()");
		}
		return class_fis;
	}

	@Override
	public final synchronized void mouseEntered(final MouseEvent mouseevent) {
		try {
			if (instance != null) {
				field_d_2150 = 0;
				mouseX = mouseevent.getX() * -647801581;
				mouseY = mouseevent.getY() * -1339431805;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ek.mouseEntered()");
		}
	}

	MouseInputListener() {
		/* empty */
	}

	static World method_a_t(final int i) {
		World worldinfo;
		try {
			worldinfo = (((World.field_f_1392 * -80444989) < (World.totalWorlds * 1998006609)) ? (World.worlds[((World.field_f_1392 += 1816098539) * -80444989) - 1]) : null);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ek.a()");
		}
		return worldinfo;
	}
}
