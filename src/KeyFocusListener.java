
/* Class_dp - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class KeyFocusListener implements KeyListener, FocusListener {

	static final int field_m_1667 = 6;
	static final int field_z_1668 = 1;
	static final int field_y_1669 = 2;
	static final int field_e_1670 = 3;
	static final int field_g_1671 = 4;
	static final int field_ad_1672 = 32;
	static final int field_k_1673 = 12;
	static final int field_x_1674 = 16;
	static final int field_o_1675 = 23;
	public static boolean[] field_cn_1676 = new boolean[112];
	public static int field_cp_1677 = 0;
	static final int field_ab_1678 = 39;
	static final int field_ah_1679 = 52;
	public static int field_ci_1680 = 0;
	public static final int field_bt_1681 = 85;
	static final int field_cu_1682 = 104;
	public static int[] field_cr_1683 = { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86,
			-1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1,
			-1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52,
			53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231,
			227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1,
			-1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
	public static final int field_br_1684 = 73;
	static final int field_ae_1685 = 34;
	public static int field_cv_1686 = 0;
	public static int field_ca_1687 = 0;
	public static int field_cm_1688 = 0;
	public static int[] field_cc_1689 = new int[128];
	static int[] field_cx_1690 = new int[128];
	public static int field_cd_1691 = 0;
	static char[] field_ch_1692 = new char[128];
	public static KeyFocusListener instance = new KeyFocusListener();
	public static volatile int field_cg_1694 = 0;
	public static int[] field_cy_1695 = new int[128];

	@Override
	public final synchronized void keyReleased(final KeyEvent keyevent) {
		try {
			if (instance != null) {
				field_cg_1694 = 0;
				int i = keyevent.getKeyCode();

				if (i == KeyEvent.VK_SHIFT) {
					client.shiftDown = false;
					return;
				}
				
				if ((i >= 0) && (i < field_cr_1683.length)) {
					i = field_cr_1683[i] & ~0x80;
				} else {
					i = -1;
				}
				
				if (((field_cv_1686 * -587710701) >= 0) && (i >= 0)) {
					field_cc_1689[field_cv_1686 * -587710701] = i ^ 0xffffffff;
					field_cv_1686 = -578854117 * (((field_cv_1686 * -587710701) + 1) & 0x7f);
					if ((field_ca_1687 * -10599963) == (field_cv_1686 * -587710701)) {
						field_cv_1686 = 578854117;
					}
				}
			}
			keyevent.consume();
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dp.keyReleased()");
		}
	}

	@Override
	public final void keyTyped(final KeyEvent keyevent) {
		try {
			if (instance != null) {
				final char c = keyevent.getKeyChar();
				if ((c != 0) && ('\uffff' != c)) {
					boolean bool;
					while_31_: do {
						if (((c <= 0) || (c >= '\u0080')) && ((c < '\u00a0') || (c > '\u00ff'))) {
							if (c != 0) {
								final char[] cs = Class_ev.field_n_2237;
								for (int i = 0; i < cs.length; i++) {
									final char c_0_ = cs[i];
									if (c == c_0_) {
										bool = true;
										break while_31_;
									}
								}
							}
							bool = false;
						} else {
							bool = true;
						}
					} while (false);
					if (bool) {
						final int i = ((-42041831 * field_ci_1680) + 1) & 0x7f;
						if (i != (-589726947 * field_cd_1691)) {

							field_cx_1690[-42041831 * field_ci_1680] = -1;
							field_ch_1692[field_ci_1680 * -42041831] = c;
							field_ci_1680 = -2067136983 * i;
						}
					}
				}
			}
			keyevent.consume();
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dp.keyTyped()");
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
				field_cv_1686 = 578854117;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dp.focusLost()");
		}
	}

	KeyFocusListener() {
		/* empty */
	}

	public static Class_bi method_ax_bi(final int i, final int i_1_, final Component component, final byte i_2_) {
		ImageColorModel class_bf;
		do {
			try {
				Class_bb class_bb;
				try {
					final Class_bb class_bb_3_ = new Class_bb();
					class_bb_3_.draw(i, i_1_, component, 1824708337);
					class_bb = class_bb_3_;
				} catch (final Throwable throwable) {
					final ImageColorModel class_bf_4_ = new ImageColorModel();
					class_bf_4_.draw(i, i_1_, component, 1751916211);
					class_bf = class_bf_4_;
					break;
				}
				return class_bb;
			} catch (final RuntimeException runtimeexception) {
				throw GameCanvas.error(runtimeexception, "dp.ax()");
			}
		} while (false);
		return class_bf;
	}

	@Override
	public final synchronized void keyPressed(final KeyEvent keyevent) {
		try {
			if (instance != null) {
				field_cg_1694 = 0;
				int i = keyevent.getKeyCode();
				
				if (i == KeyEvent.VK_SHIFT) {
					client.shiftDown = true;
					return;
				}
				
				if ((i >= 0) && (i < field_cr_1683.length)) {
					i = field_cr_1683[i];
					if ((i & 0x80) != 0) {
						i = -1;
					}
				} else {
					i = -1;
				}
				if (i == 1)
					i = 13;
				else if (i == 5)
					i = 1;
				else if (i == 2)
					i = 4;
				else if (i == 3)
					i = 5;
				else if (i == 4)
					i = 6;
				else if (i == 6)
					i = 2;
				if (((field_cv_1686 * -587710701) >= 0) && (i >= 0)) {
					field_cc_1689[field_cv_1686 * -587710701] = i;
					field_cv_1686 = (((-587710701 * field_cv_1686) + 1) & 0x7f) * -578854117;
					if ((field_cv_1686 * -587710701) == (-10599963 * field_ca_1687)) {
						field_cv_1686 = 578854117;
					}
				}
				if (i >= 0) {
					final int i_5_ = (1 + (field_ci_1680 * -42041831)) & 0x7f;
					if ((field_cd_1691 * -589726947) != i_5_) {
						field_cx_1690[field_ci_1680 * -42041831] = i;
						field_ch_1692[field_ci_1680 * -42041831] = '\0';
						field_ci_1680 = -2067136983 * i_5_;
					}
				}
				final int i_6_ = keyevent.getModifiers();
				if (((i_6_ & 0xa) != 0) || (i == 85) || (i == 10)) {
					keyevent.consume();
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dp.keyPressed()");
		}
	}
}
