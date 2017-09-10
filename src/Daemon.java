/* Class_dx - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.URL;

public class Daemon implements Runnable {
	public static String operatingSystem;
	Interface_ap field_z_1744;
	Class_es field_y_1745 = null;
	Class_es field_e_1746 = null;
	static final int field_a_1747 = 1;
	boolean field_f_1748 = false;
	public EventQueue eventQueue;
	Thread thread;
	static final int field_l_1751 = 3;
	public static final int field_fc_1752 = 215;
	static final int field_lz_1753 = 2;

	final Class_es method_y_es(final int i, final int i_0_, final int i_1_, final Object object, final byte i_2_) {
		try {
			final Class_es class_es = new Class_es();
			class_es.field_g_2218 = i * 2008864699;
			class_es.field_f_2219 = i_0_;
			class_es.field_m_2220 = object;
			synchronized (this) {
				if (this.field_e_1746 != null) {
					this.field_e_1746.field_n_2214 = class_es;
					this.field_e_1746 = class_es;
				} else {
					this.field_e_1746 = this.field_y_1745 = class_es;
				}
				notify();
				final Class_es class_es_3_ = class_es;
				return class_es_3_;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dx.y()");
		}
	}

	public final Class_es method_f_es(final int i, final short i_4_) {
		Class_es class_es;
		try {
			class_es = method_y_es(3, i, 0, null, (byte) -81);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dx.f()");
		}
		return class_es;
	}

	public final Class_es method_e_es(final String string, final int i, final int i_5_) {
		Class_es class_es;
		try {
			class_es = method_y_es(1, i, 0, string, (byte) 20);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dx.e()");
		}
		return class_es;
	}

	public final Class_es method_g_es(final Runnable runnable, final int i, final int i_6_) {
		Class_es class_es;
		try {
			class_es = method_y_es(2, i, 0, runnable, (byte) -4);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dx.g()");
		}
		return class_es;
	}

	static void method_dn_void(final Widget widget, final byte i) {
		try {
			if ((client.field_la_2893 * 1354751213) == (2087695785 * widget.field_ew_2643)) {
				client.field_li_2835[1477697569 * widget.field_eh_2569] = true;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dx.dn()");
		}
	}

	public final Class_es method_m_es(final URL url, final byte i) {
		Class_es class_es;
		try {
			class_es = method_y_es(4, 0, 0, url, (byte) -40);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dx.m()");
		}
		return class_es;
	}

	Daemon() {
		operatingSystem = "Unknown";
		Class_hm.field_d_3087 = "1.1";
		try {
			operatingSystem = System.getProperty("java.vendor");
			Class_hm.field_d_3087 = System.getProperty("java.version");
		} catch (final Exception exception) {
			/* empty */
		}
		try {
			eventQueue = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (final Throwable throwable) {
			/* empty */
		}
		this.field_f_1748 = false;
		this.thread = new Thread(this);
		this.thread.setPriority(10);
		this.thread.setDaemon(true);
		this.thread.start();
	}

	final void method_z_void(final int i) {
		try {
			synchronized (this) {
				this.field_f_1748 = true;
				notifyAll();
			}
			try {
				this.thread.join();
			} catch (final InterruptedException interruptedexception) {
				/* empty */
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dx.z()");
		}
	}

	@Override
	public final void run() {
		try {
			for (;;) {
				Class_es class_es;
				synchronized (this) {
					for (;;) {
						if (this.field_f_1748) {
							return;
						}
						if (this.field_y_1745 != null) {
							class_es = this.field_y_1745;
							this.field_y_1745 = (this.field_y_1745.field_n_2214);
							if (this.field_y_1745 == null) {
								this.field_e_1746 = null;
							}
							break;
						}
						try {
							this.wait();
						} catch (final InterruptedException interruptedexception) {
							/* empty */
						}
					}
				}
				try {
					final int i = class_es.field_g_2218 * 1979602291;
					if (i == 1) {
						class_es.field_a_2213 = (new java.net.Socket(InetAddress.getByName((String) (class_es.field_m_2220)), class_es.field_f_2219));
					} else if (i == 2) {
						final Thread thread = new Thread((Runnable) class_es.field_m_2220);
						thread.setDaemon(true);
						thread.start();
						thread.setPriority(class_es.field_f_2219);
						class_es.field_a_2213 = thread;
					} else if (i == 4) {
						class_es.field_a_2213 = new DataInputStream(((URL) (class_es.field_m_2220)).openStream());
					} else if (i == 3) {
						final String string = new StringBuilder(String.valueOf((class_es.field_f_2219 >> 24) & 0xff)).append(".").append((class_es.field_f_2219 >> 16) & 0xff).append(".").append((class_es.field_f_2219 >> 8) & 0xff).append(".").append(class_es.field_f_2219 & 0xff).toString();
						class_es.field_a_2213 = InetAddress.getByName(string).getHostName();
					}
					class_es.field_e_2217 = 1;
				} catch (final ThreadDeath threaddeath) {
					throw threaddeath;
				} catch (final Throwable throwable) {
					class_es.field_e_2217 = 2;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dx.run()");
		}
	}

	public final Interface_ap method_a_ap(final int i) {
		Interface_ap interface_ap;
		try {
			interface_ap = this.field_z_1744;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dx.a()");
		}
		return interface_ap;
	}
}
