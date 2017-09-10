/* Socket - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class Socket implements Runnable {
	InputStream field_n_2167;
	OutputStream field_d_2168;
	boolean field_y_2169 = false;
	byte[] field_f_2170;
	Daemon field_e_2171;
	java.net.Socket clientSocket;
	Class_es field_g_2173;
	int field_m_2174 = 0;
	int field_a_2175 = 0;
	boolean field_h_2176 = false;
	static final int field_w_2177 = 25;

	public void close(final int i) {
		try {
			if (!this.field_y_2169) {
				synchronized (this) {
					this.field_y_2169 = true;
					notifyAll();
				}
				if (this.field_g_2173 != null) {
					while (this.field_g_2173.field_e_2217 == 0) {
						Class_fc.sleep(1L);
					}
					if (this.field_g_2173.field_e_2217 == 1) {
						try {
							((Thread) this.field_g_2173.field_a_2213).join();
						} catch (final InterruptedException interruptedexception) {
							/* empty */
						}
					}
				}
				this.field_g_2173 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "em.z()");
		}
	}

	public int read(final int i) throws IOException {
		int i_0_;
		try {
			i_0_ = (this.field_y_2169 ? 0 : this.field_n_2167.read());
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "em.y()");
		}
		return i_0_;
	}

	public int available(final byte i) throws IOException {
		int i_1_;
		try {
			i_1_ = (this.field_y_2169 ? 0 : this.field_n_2167.available());
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "em.e()");
		}
		return i_1_;
	}

	public void read(final byte[] is, int i, int i_2_) throws IOException {
		//new Throwable().printStackTrace();
		try {
			if (!this.field_y_2169) {
				int i_4_;
				for (/**/; i_2_ > 0; i_2_ -= i_4_) {
					i_4_ = this.field_n_2167.read(is, i, i_2_);
					if (i_4_ <= 0) {
						throw new EOFException();
					}
					i += i_4_;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "em.g()");
		}
	}

	public void put(final byte[] buffer, final int i, final int i_5_, final int i_6_) throws IOException {
		try {
			if (!this.field_y_2169) {
				if (this.field_h_2176) {
					this.field_h_2176 = false;
					throw new IOException();
				}
				if (this.field_f_2170 == null) {
					this.field_f_2170 = new byte[5000];
				}
				synchronized (this) {
					for (int i_7_ = 0; i_7_ < i_5_; i_7_++) {
						this.field_f_2170[this.field_a_2175 * -1230763345] = buffer[i + i_7_];
						this.field_a_2175 = ((((-1230763345 * this.field_a_2175) + 1) % 5000) * 960990287);
						if ((-1230763345 * this.field_a_2175) == ((4900 + (-1567164385 * this.field_m_2174)) % 5000)) {
							throw new IOException();
						}
					}
					if (this.field_g_2173 == null) {
						this.field_g_2173 = this.field_e_2171.method_g_es(this, 3, 1923261294);
					}
					notifyAll();
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "em.f()");
		}
	}

	@Override
	public void run() {
		try {
			try {
				for (;;) {
					int i;
					int i_8_;
					synchronized (this) {
						if ((this.field_m_2174 * -1567164385) == (this.field_a_2175 * -1230763345)) {
							if (this.field_y_2169) {
								break;
							}
							try {
								this.wait();
							} catch (final InterruptedException interruptedexception) {
								/* empty */
							}
						}
						i = this.field_m_2174 * -1567164385;
						if ((this.field_a_2175 * -1230763345) >= (this.field_m_2174 * -1567164385)) {
							i_8_ = ((-1230763345 * this.field_a_2175) - (this.field_m_2174 * -1567164385));
						} else {
							i_8_ = 5000 - (-1567164385 * this.field_m_2174);
						}
					}
					if (i_8_ > 0) {
						try {
							this.field_d_2168.write(this.field_f_2170, i, i_8_);
						} catch (final IOException ioexception) {
							this.field_h_2176 = true;
						}
						this.field_m_2174 = (((i_8_ + (this.field_m_2174 * -1567164385)) % 5000) * 1236960223);
						try {
							if ((-1230763345 * this.field_a_2175) == (this.field_m_2174 * -1567164385)) {
								this.field_d_2168.flush();
							}
						} catch (final IOException ioexception) {
							this.field_h_2176 = true;
						}
					}
				}
				try {
					if (this.field_n_2167 != null) {
						this.field_n_2167.close();
					}
					if (this.field_d_2168 != null) {
						this.field_d_2168.close();
					}
					if (this.clientSocket != null) {
						this.clientSocket.close();
					}
				} catch (final IOException ioexception) {
					/* empty */
				}
				this.field_f_2170 = null;
			} catch (final Exception exception) {
				Class_cw.method_n_void(null, exception, 2132845718);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "em.run()");
		}
	}

	@Override
	protected void finalize() {
		try {
			close(-398330733);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "em.finalize()");
		}
	}

	static void method_h_void(final int i, final int i_9_) {
		try {
			if (i != (824045845 * client.status)) {
				if ((824045845 * client.status) == 0) {
					ClientScript.method_ro_void(2073695318);
				}
				if ((i == 20) || (i == 40) || (i == 45)) {
					client.loginStage = 0;
					client.field_bg_2896 = 0;
					client.field_bv_2721 = 0;
				}
				if ((i != 20) && (i != 40) && (WidgetNode.field_cq_796 != null)) {
					WidgetNode.field_cq_796.close(-2050168961);
					WidgetNode.field_cq_796 = null;
				}
				if ((824045845 * client.status) == 25) {
					client.field_dl_2744 = 0;
					client.field_dg_2740 = 0;
					client.field_do_2741 = -1071062537;
					client.field_dy_2742 = 0;
					client.field_di_2743 = 1760762443;
				}
				if ((i != 5) && (i != 10)) {
					if (i == 20) {
						Region.method_n_void(ObjectComposite.canvas, Class_cr.huffmanIndex, Class_cj.spriteIndex, true, ((824045845 * client.status) == 11 ? 4 : 0), 1454433911);
					} else if (i == 11) {
						Region.method_n_void(ObjectComposite.canvas, Class_cr.huffmanIndex, Class_cj.spriteIndex, false, 4, -224388081);
					} else {
						Renderable.method_d_void((byte) 126);
					}
				} else {
					Region.method_n_void(ObjectComposite.canvas, Class_cr.huffmanIndex, Class_cj.spriteIndex, true, 0, 1970855309);
				}
				client.status = i * 746509885;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "em.h()");
		}
	}

	public Socket(final java.net.Socket socket_10_, final Daemon class_dx) throws IOException {
		this.field_e_2171 = class_dx;
		this.clientSocket = socket_10_;
		this.clientSocket.setSoTimeout(30000);
		this.clientSocket.setTcpNoDelay(true);
		this.field_n_2167 = this.clientSocket.getInputStream();
		this.field_d_2168 = this.clientSocket.getOutputStream();
	}

	static void method_b_void(final int i, final int i_11_) {
		try {
			if ((i == -1) && !client.field_np_2928) {
				Class_dw.method_z_void((byte) 55);
			} else if ((i != -1) && (i != (1897970477 * client.field_nh_2927)) && ((1614344149 * client.field_ne_2926) != 0) && !client.field_np_2928) {
				final Index class_fx = World.musicIndex1;
				final int i_12_ = client.field_ne_2926 * 1614344149;
				Class_fa.field_e_2278 = 1243386265;
				Region.field_g_1012 = class_fx;
				Class_eb.field_f_1772 = 877461501 * i;
				Npc.field_m_298 = 0;
				Class_eh.field_a_2122 = -1099365411 * i_12_;
				Class_e.field_l_932 = false;
				Class_de.field_h_1599 = 2049577394;
			}
			client.field_nh_2927 = 1433291941 * i;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "em.b()");
		}
	}
}
