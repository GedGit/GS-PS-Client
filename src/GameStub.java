/* Class_ej - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.applet.Applet;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;

public abstract class GameStub extends Applet implements Runnable, FocusListener, WindowListener {
	
	private static final long serialVersionUID = 1L;
	protected static long[] field_qo_2131 = new long[32];
	static int field_pg_2132 = 0;
	static long field_pq_2133 = 0L;
	protected static boolean field_qt_2134 = false;
	static boolean field_pi_2135 = false;
	static int field_ph_2136 = -816440340;
	static int field_px_2137 = -1636113635;
	protected static int field_qd_2138 = 0;
	protected static int field_qs_2139 = 0;
	protected static long[] field_qh_2140 = new long[32];
	boolean errorThrown = false;
	static volatile long field_qi_2142 = 0L;
	protected static volatile boolean field_qq_2143 = true;
	static int field_qy_2144 = 262812196;
	protected static int field_qw_2145 = 0;
	protected static volatile boolean field_qr_2146 = false;
	static volatile boolean field_rf_2147 = true;
	static GameStub stub = null;
	static final int field_au_2149 = 65;

	final synchronized void method_rk_void(final int i) {
		try {
			if (!field_pi_2135) {
				field_pi_2135 = true;
				try {
					ObjectComposite.canvas.removeFocusListener(this);
				} catch (final Exception exception) {
					/* empty */
				}
				try {
					method_a_void((byte) -26);
				} catch (final Exception exception) {
					/* empty */
				}
				if (Class_ci.field_qb_982 != null) {
					try {
						System.exit(0);
					} catch (final Throwable throwable) {
						/* empty */
					}
				}
				if (SpotAnim.daemon != null) {
					try {
						SpotAnim.daemon.method_z_void(1536079838);
					} catch (final Exception exception) {
						/* empty */
					}
				}
				method_z_void((byte) 22);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ej.rk()");
		}
	}

	protected final boolean isValidHost() {
		while_24_:
		do {
			while_23_:
			do {
				do {
					try {
						String string = getDocumentBase().getHost().toLowerCase();
						if (string.equals("jagex.com") || string.endsWith(".jagex.com")) {
							break while_24_;
						}
						if (string.equals("runescape.com") || string.endsWith(".runescape.com")) {
							break while_23_;
						}
						if (string.endsWith(ClientLoaderOLD.IP)) {
							return true;
						}
						if (string.endsWith("192.168.4.")) {
							return true;
						}
						error("invalidhost");
					} catch (final RuntimeException runtimeexception) {
						throw GameCanvas.error(runtimeexception, "ej.rc()");
					}
					return false;
				} while (false);
			} while (false);
			return true;
		} while (false);
		return true;
	}

	@Override
	public void run() {
		try {
			try {
				if (Daemon.operatingSystem != null) {
					final String string = Daemon.operatingSystem.toLowerCase();
					if ((string.indexOf("sun") != -1) || (string.indexOf("apple") != -1)) {
						final String string_0_ = Class_hm.field_d_3087;
						if (string_0_.equals("1.1") || string_0_.startsWith("1.1.") || string_0_.equals("1.2") || string_0_.startsWith("1.2.") || string_0_.equals("1.3") || string_0_.startsWith("1.3.") || string_0_.equals("1.4") || string_0_.startsWith("1.4.") || string_0_.equals("1.5") || string_0_.startsWith("1.5.") || string_0_.equals("1.6.0")) {
							error("wrongjava");
							return;
						}
						if (string_0_.startsWith("1.6.0_")) {
							int i;
							for (i = 6; i < string_0_.length(); i++) {
								final char c = string_0_.charAt(i);
								final boolean bool = (c >= '0') && (c <= '9');
								if (!bool) {
									break;
								}
							}
							final String string_1_ = string_0_.substring(6, i);
							if (Ignore.method_d_boolean(string_1_, (short) 8438)) {
								final int i_2_ = Class_w.method_y_int(string_1_, 10, true, (byte) 30);
								if (i_2_ < 10) {
									error("wrongjava");
									return;
								}
							}
						}
						field_px_2137 = 409366417;
					}
				}
				setFocusCycleRoot(true);
				method_ry_void((byte) -16);
				method_g_void(-2056811690);
				Class_cp.timer = Class_du.newTimer();
				while ((0L == (4518134178759438303L * field_pq_2133)) || (Renderable.getCurrentTime(1607190145) < (4518134178759438303L * field_pq_2133))) {
					SceneObject.field_pf_950 = ((Class_cp.timer.getDelay(110486783 * field_ph_2136, field_px_2137 * 600241973, (byte) 90)) * -1984229951);
					for (int i = 0; i < (SceneObject.field_pf_950 * -1226440127); i++) {
						method_ra_void(1349356328);
					}
					method_rt_void(2123965641);
					final Daemon class_dx = SpotAnim.daemon;
					final java.awt.Canvas canvas = ObjectComposite.canvas;
					if (class_dx.eventQueue != null) {
						for (int i = 0; ((i < 50) && (class_dx.eventQueue.peekEvent() != null)); i++) {
							Class_fc.sleep(1L);
						}
						if (canvas != null) {
							class_dx.eventQueue.postEvent(new ActionEvent(canvas, 1001, "dummy"));
						}
					}
				}
			} catch (final Exception exception) {
				Class_cw.method_n_void(null, exception, -927714818);
				error("crash");
			}
			method_rk_void(425517323);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ej.run()");
		}
	}

	void method_ra_void(final int i) {
		try {
			final long l = Renderable.getCurrentTime(1657100523);
			final long l_3_ = field_qh_2140[1337359197 * Class_s.field_qv_1363];
			field_qh_2140[Class_s.field_qv_1363 * 1337359197] = l;
			Class_s.field_qv_1363 = ((1 + (Class_s.field_qv_1363 * 1337359197)) & 0x1f) * -84102923;
			if ((l_3_ != 0L) && (l <= l_3_)) {
				/* empty */
			}
			synchronized (this) {
				Class_gf.field_rd_2987 = field_rf_2147;
			}
			process();
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ej.ra()");
		}
	}

	void method_rt_void(final int i) {
		try {
			final Container container = method_rm_Container(-2036331333);
			final long l = Renderable.getCurrentTime(63311482);
			final long l_4_ = field_qo_2131[281034703 * Timer.field_ql_1617];
			field_qo_2131[281034703 * Timer.field_ql_1617] = l;
			Timer.field_ql_1617 = 913860399 * ((1 + (Timer.field_ql_1617 * 281034703)) & 0x1f);
			if ((l_4_ != 0L) && (l > l_4_)) {
				final int i_5_ = (int) (l - l_4_);
				field_qd_2138 = (((i_5_ >> 1) + 32000) / i_5_) * -1806265463;
			}
			if ((((field_qy_2144 += -1296554499) * -401285291) - 1) > 50) {
				field_qy_2144 -= -403215510;
				field_qq_2143 = true;
				ObjectComposite.canvas.setSize((Boundary.clientWidth * -1236640339), Projectile.clientHeight * -1483492575);
				ObjectComposite.canvas.setVisible(true);
				if (container == Class_ci.field_qb_982) {
					final Insets insets = Class_ci.field_qb_982.getInsets();
					ObjectComposite.canvas.setLocation(insets.left + (field_qw_2145 * 1328296843), ((field_qs_2139 * 487934209) + insets.top));
				} else {
					ObjectComposite.canvas.setLocation(1328296843 * field_qw_2145, 487934209 * field_qs_2139);
				}
			}
			method_m_void(1310786141);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ej.rt()");
		}
	}

	protected abstract void method_g_void(int i);

	@Override
	public void stop() {
		try {
			if ((stub == this) && !field_pi_2135) {
				field_pq_2133 = ((Renderable.getCurrentTime(837913890) + 4000L) * 3056623957079395359L);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ej.stop()");
		}
	}

	@Override
	public void start() {
		try {
			if ((this == stub) && !field_pi_2135) {
				field_pq_2133 = 0L;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ej.start()");
		}
	}

	@Override
	public final void update(final Graphics graphics) {
		try {
			paint(graphics);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ej.update()");
		}
	}

	@Override
	public final synchronized void paint(final Graphics graphics) {
		try {
			if ((this == stub) && !field_pi_2135) {
				field_qq_2143 = true;
				if ((Class_hm.field_d_3087 != null) && Class_hm.field_d_3087.startsWith("1.5") && ((Renderable.getCurrentTime(1747386793) - (field_qi_2142 * -5159917000096714787L)) > 1000L)) {
					final Rectangle rectangle = graphics.getClipBounds();
					if ((rectangle == null) || ((rectangle.width >= (Boundary.clientWidth * -1236640339)) && (rectangle.height >= (-1483492575 * Projectile.clientHeight)))) {
						field_qr_2146 = true;
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ej.paint()");
		}
	}

	protected final synchronized void method_ry_void(final byte i) {
		try {
			final Container container = method_rm_Container(-2042688307);
			if (ObjectComposite.canvas != null) {
				ObjectComposite.canvas.removeFocusListener(this);
				container.remove(ObjectComposite.canvas);
			}
			Boundary.clientWidth = Math.max(container.getWidth(), Class_cx.field_qp_1434 * -1356770131) * -2134569435;
			Projectile.clientHeight = Math.max(container.getHeight(), Class_cw.field_qu_1409 * -1773356969) * 298684641;
			if (Class_ci.field_qb_982 != null) {
				final Insets insets = Class_ci.field_qb_982.getInsets();
				Boundary.clientWidth -= (insets.left + insets.right) * -2134569435;
				Projectile.clientHeight -= (insets.bottom + insets.top) * 298684641;
			}
			ObjectComposite.canvas = new GameCanvas(this);
			container.add(ObjectComposite.canvas);
			ObjectComposite.canvas.setSize((-1236640339 * Boundary.clientWidth), Projectile.clientHeight * -1483492575);
			ObjectComposite.canvas.setVisible(true);
			if (container == Class_ci.field_qb_982) {
				final Insets insets = Class_ci.field_qb_982.getInsets();
				ObjectComposite.canvas.setLocation((insets.left + (field_qw_2145 * 1328296843)), (insets.top + (487934209 * field_qs_2139)));
			} else {
				ObjectComposite.canvas.setLocation(1328296843 * field_qw_2145, field_qs_2139 * 487934209);
			}
			ObjectComposite.canvas.addFocusListener(this);
			ObjectComposite.canvas.requestFocus();
			field_qq_2143 = true;
			final Class_bi class_bi = KeyFocusListener.method_ax_bi((-1236640339 * Boundary.clientWidth), -1483492575 * Projectile.clientHeight, ObjectComposite.canvas, (byte) 0);
			if (Class_s.field_qj_1361 != null) {
				Class_s.field_qj_1361.drawGraphics(class_bi.image.getGraphics(), 0, 0, (byte) 1);
			}
			Class_s.field_qj_1361 = class_bi;
			field_qr_2146 = false;
			field_qi_2142 = Renderable.getCurrentTime(160487414) * 6160156680228593781L;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ej.ry()");
		}
	}

	@Override
	public final void focusLost(final FocusEvent focusevent) {
		try {
			field_rf_2147 = false;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ej.focusLost()");
		}
	}

	@Override
	public final void windowClosed(final WindowEvent windowevent) {
		/* empty */
	}

	@Override
	public final void windowClosing(final WindowEvent windowevent) {
		try {
			destroy();
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ej.windowClosing()");
		}
	}

	@Override
	public final void windowDeactivated(final WindowEvent windowevent) {
		/* empty */
	}

	@Override
	public final void windowDeiconified(final WindowEvent windowevent) {
		/* empty */
	}

	protected final void setDimensions(final int i, final int i_6_, final int i_7_) {
		do {
			try {
				try {
					if (stub != null) {
						field_pg_2132 += 365152961;
						if ((-301742783 * field_pg_2132) >= 3) {
							error("alreadyloaded");
						} else {
							getAppletContext().showDocument(getDocumentBase(), "_self");
						}
					} else {
						stub = this;
						Boundary.clientWidth = i * -2134569435;
						Projectile.clientHeight = i_6_ * 298684641;
						ClientError.clientVersion = i_7_ * 88914331;
						ClientError.field_n_2205 = this;
						if (SpotAnim.daemon == null) {
							SpotAnim.daemon = new Daemon();
						}
						SpotAnim.daemon.method_g_es(this, 1, 1958265519);
					}
				} catch (final Exception exception) {
					Class_cw.method_n_void(null, exception, 1845087712);
					error("crash");
					break;
				}
				break;
			} catch (final RuntimeException runtimeexception) {
				throw GameCanvas.error(runtimeexception, "ej.ru()");
			}
		} while (false);
	}

	@Override
	public abstract void init();

	protected abstract void process();

	protected abstract void method_m_void(int i);

	protected abstract void method_a_void(byte i);

	protected void error(final String string) {
		do {
			try {
				if (!this.errorThrown) {
					this.errorThrown = true;
					System.out.println(new StringBuilder("error_game_").append(string).toString());
					try {
						getAppletContext().showDocument(new URL(getCodeBase(), new StringBuilder("error_game_").append(string).append(".ws").toString()), "_self");
					} catch (final Exception exception) {
						break;
					}
				}
				break;
			} catch (final RuntimeException runtimeexception) {
				throw GameCanvas.error(runtimeexception, "ej.rv()");
			}
		} while (false);
	}

	protected Container method_rm_Container(final int i) {
		Container container;
		try {
			container = (Class_ci.field_qb_982 != null ? (Container) Class_ci.field_qb_982 : this);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ej.rm()");
		}
		return container;
	}

	protected Dimension method_rl_Dimension(final int i) {
		Dimension dimension;
		try {
			final Container container = method_rm_Container(-1807387386);
			int i_9_ = Math.max(container.getWidth(), Class_cx.field_qp_1434 * -1356770131);
			int i_10_ = Math.max(container.getHeight(), Class_cw.field_qu_1409 * -1773356969);
			if (Class_ci.field_qb_982 != null) {
				final Insets insets = Class_ci.field_qb_982.getInsets();
				i_9_ -= insets.left + insets.right;
				i_10_ -= insets.top + insets.bottom;
			}
			dimension = new Dimension(i_9_, i_10_);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ej.rl()");
		}
		return dimension;
	}

	protected GameStub() {
		/* empty */
	}

	@Override
	public final void focusGained(final FocusEvent focusevent) {
		try {
			field_rf_2147 = true;
			field_qq_2143 = true;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ej.focusGained()");
		}
	}

	@Override
	public final void windowIconified(final WindowEvent windowevent) {
		/* empty */
	}

	@Override
	public final void windowOpened(final WindowEvent windowevent) {
		/* empty */
	}

	static void sendMessage(final int i, final String string, final String string_11_) {
		try {
			IdentityKit.method_z_void(i, string, string_11_, null, -1957976047);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ej.d()");
		}
	}

	@Override
	public final void windowActivated(final WindowEvent windowevent) {
		/* empty */
	}

	static boolean method_dx_boolean(final String string, final boolean bool, final int i) {
		do {
			try {
				if (string == null) {
					return false;
				}
				final String string_13_ = Class_bg.method_d_String(string, Class_fd.field_h_2308, -1919673684);
				for (int i_14_ = 0; i_14_ < (client.friendListSize * 1944416787); i_14_++) {
					if ((string_13_.equalsIgnoreCase(Class_bg.method_d_String(((client.friends[i_14_]).name), Class_fd.field_h_2308, 1715002662))) && (!bool || (((client.friends[i_14_].world) * -533307325) != 0))) {
						return true;
					}
				}
				if (!string_13_.equalsIgnoreCase(Class_bg.method_d_String((Class_ci.myPlayer.name), Class_fd.field_h_2308, -494637130))) {
					break;
				}
			} catch (final RuntimeException runtimeexception) {
				// TODO Proper fix throw GameCanvas.method_d_er(runtimeexception, "ej.dx()");
			}
			return true;
		} while (false);
		return false;
	}

	protected abstract void method_z_void(byte i);

	@Override
	public void destroy() {
		try {
			if ((this == stub) && !field_pi_2135) {
				field_pq_2133 = (Renderable.getCurrentTime(1197008032) * 3056623957079395359L);
				Class_fc.sleep(5000L);
				method_rk_void(-1861424387);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ej.destroy()");
		}
	}

	static final void method_du_void(final int i, final int i_15_, final int i_16_, final int i_17_, final Rasterizer2D class_bx, final Class_fp class_fp, final short i_18_) {
		try {
			final int i_19_ = (i_17_ * i_17_) + (i_16_ * i_16_);
			if ((i_19_ > 4225) && (i_19_ < 90000)) {
				final int i_20_ = (((client.miniMapOffset * 1814938795) + (client.miniMapAngle * -2037472027)) & 0x7ff);
				int i_21_ = Rasterizer3D.SINE[i_20_];
				int i_22_ = Rasterizer3D.COSINE[i_20_];
				i_21_ = (i_21_ * 256) / (256 + (-1606807399 * client.miniMapScale));
				i_22_ = (i_22_ * 256) / (256 + (client.miniMapScale * -1606807399));
				final int i_23_ = ((i_16_ * i_22_) + (i_21_ * i_17_)) >> 16;
				final int i_24_ = ((i_17_ * i_22_) - (i_21_ * i_16_)) >> 16;
				final double d = Math.atan2(i_23_, i_24_);
				final int i_25_ = (int) (Math.sin(d) * 63.0);
				final int i_26_ = (int) (Math.cos(d) * 57.0);
				Class_de.mapedge.method_t_void((i + 94 + i_25_ + 4) - 10, (83 + i_15_) - i_26_ - 20, 20, 20, 15, 15, d, 256);
			} else {
				ItemDefinitions.method_de_void(i, i_15_, i_16_, i_17_, class_bx, class_fp, 1530824255);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ej.du()");
		}
	}

	static final void method_cz_void(final int i, final byte i_27_) {
		try {
			if (i >= 0) {
				final int i_28_ = client.field_is_2830[i];
				final int i_29_ = client.field_io_2831[i];
				final int i_30_ = client.field_ik_2832[i];
				final int i_31_ = client.field_il_2833[i];
				final String string = client.menuActions[i];
				final String string_32_ = client.menuOptions[i];
				Class_ey.method_cq_void(i_28_, i_29_, i_30_, i_31_, string, string_32_, 2117517719 * MouseInputListener.field_k_2164, MouseInputListener.field_x_2158 * 1750309931, -1995366409);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ej.cz()");
		}
	}
}
