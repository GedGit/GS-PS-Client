/* Class_bi - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

public abstract class Class_bi {
	int height;
	public static final int field_m_567 = 128;
	static final int field_a_568 = 7;
	public Image image;
	static final int field_aw_570 = 42;
	static final int field_l_571 = 11;
	static int localCoordinateX;
	public int width;
	public int[] pixels;
	public static final int field_bh_575 = 204;

	public static int method_z_int(int i, final int i_0_) {
		int i_1_;
		try {
			i = --i | (i >>> 1);
			i |= i >>> 2;
			i |= i >>> 4;
			i |= i >>> 8;
			i |= i >>> 16;
			i_1_ = 1 + i;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "bi.z()");
		}
		return i_1_;
	}

	abstract void draw(int i, int i_2_, Component component, int i_3_);

	public abstract void method_z_void(Graphics graphics, int i, int i_4_, int i_5_, int i_6_, int i_7_);

	public abstract void drawGraphics(Graphics graphics, int i, int i_8_, byte i_9_);

	Class_bi() {
		/* empty */
	}

	public final void init() {
		try {
			Rasterizer.init(pixels, width * -2078510023, 160454497 * this.height);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "bi.al()");
		}
	}

	public static boolean method_n_boolean(final int i) {
		do {
			try {
				final long l = Renderable.getCurrentTime(483140491);
				int i_10_ = (int) (l - (Class_fq.field_z_2432 * 5546104946486137463L));
				Class_fq.field_z_2432 = 7406610225566820167L * l;
				if (i_10_ > 200) {
					i_10_ = 200;
				}
				Class_fq.field_d_2433 += -489973299 * i_10_;
				if (((Class_fq.delayedRequests * -1501974469) == 0) && ((Class_fq.urgentRequests * 787891823) == 0) && ((2079901649 * Class_fq.field_h_2448) == 0) && ((936085691 * Class_fq.field_e_2456) == 0)) {
					return true;
				}
				if (Class_et.connection == null) {
					return false;
				}
				try {
					if ((-1725760763 * Class_fq.field_d_2433) > 30000) {
						throw new IOException();
					}
					for (/**/; (787891823 * Class_fq.urgentRequests) < 20; Class_fq.urgentRequests += -275785585) {
						if ((936085691 * Class_fq.field_e_2456) <= 0) {
							break;
						}
						final OnDemandNode request = (OnDemandNode) Class_fq.field_y_2445.method_y_ga();
						final Buffer buffer = new Buffer(4);
						buffer.put(1);
						buffer.putMedium((int) request.id, 1009101812);
						Class_et.connection.put((buffer.buffer), 0, 4, 93957415);
						Class_fq.priorityRequests.method_d_void(request, request.id);
						Class_fq.field_e_2456 -= 1175813235;
					}
					
					for (/**/; (((Class_fq.delayedRequests * -1501974469) < 20) && ((2079901649 * Class_fq.field_h_2448) > 0)); Class_fq.delayedRequests += 1578477811) {
						final OnDemandNode request = (OnDemandNode) Class_fq.field_m_2437.head();
						final Buffer rsbytebuffer = new Buffer(4);
						rsbytebuffer.put(0);
						rsbytebuffer.putMedium((int) request.id, 1049993291);
						
						Class_et.connection.put((rsbytebuffer.buffer), 0, 4, 93957415);
						request.update();
						Class_fq.field_l_2440.method_d_void(request, request.id);
						Class_fq.field_h_2448 -= 879161649;
					}
					
					for (int i_11_ = 0; i_11_ < 100; i_11_++) {
						final int remaining = Class_et.connection.available((byte) -7);
						if (remaining < 0) {
							throw new IOException();
						}
						if (remaining == 0) {
							break;
						}
						Class_fq.field_d_2433 = 0;
						int i_13_ = 0;
						if (Class_ev.field_k_2235 == null) {
							i_13_ = 8;
						} else if ((-1674225911 * Class_fq.field_j_2439) == 0) {
							i_13_ = 1;
						}
						
						if (i_13_ > 0) {
							int i_14_ = i_13_ - (Class_fq.js5Buffer.position * -1485345105);
							if (i_14_ > remaining) {
								i_14_ = remaining;
							}
							Class_et.connection.read(Class_fq.js5Buffer.buffer, (Class_fq.js5Buffer.position * -1485345105), i_14_);
							if (Class_fq.field_o_2449 != 0) {
								for (int i_15_ = 0; i_15_ < i_14_; i_15_++) {
									Class_fq.js5Buffer.buffer[i_15_ + ((Class_fq.js5Buffer.position) * -1485345105)] ^= Class_fq.field_o_2449;
								}
							}
							Class_fq.js5Buffer.position += i_14_ * -685856689;
							if ((-1485345105 * Class_fq.js5Buffer.position) < i_13_) {
								break;
							}
							if (Class_ev.field_k_2235 == null) {
								Class_fq.js5Buffer.position = 0;
								final int i_16_ = Class_fq.js5Buffer.get();
								final int i_17_ = Class_fq.js5Buffer.getShort();
								final int i_18_ = Class_fq.js5Buffer.get();
								final int i_19_ = Class_fq.js5Buffer.getInt();
								final long id = i_17_ + (i_16_ << 16);
								OnDemandNode class_ff = (OnDemandNode) Class_fq.priorityRequests.method_n_ga(id);
								Class_fq.field_q_2442 = true;
								if (class_ff == null) {
									class_ff = (OnDemandNode) Class_fq.field_l_2440.method_n_ga(id);
									Class_fq.field_q_2442 = false;
								}
								if (class_ff == null) {
									throw new IOException();
								}
								final int i_21_ = i_18_ == 0 ? 5 : 9;
								Class_ev.field_k_2235 = class_ff;
								Class_fq.field_r_2434 = new Buffer((Class_ev.field_k_2235.field_z_2321) + i_19_ + i_21_);
								Class_fq.field_r_2434.put(i_18_);
								Class_fq.field_r_2434.putInt(i_19_);
								Class_fq.field_j_2439 = -1474610744;
								Class_fq.js5Buffer.position = 0;
							} else if ((-1674225911 * Class_fq.field_j_2439) == 0) {
								if (Class_fq.js5Buffer.buffer[0] == -1) {
									Class_fq.field_j_2439 = 352544569;
									Class_fq.js5Buffer.position = 0;
								} else {
									Class_ev.field_k_2235 = null;
								}
							}
						} else {
							final int i_22_ = (Class_fq.field_r_2434.buffer.length - (Class_ev.field_k_2235.field_z_2321));
							int i_23_ = 512 - (Class_fq.field_j_2439 * -1674225911);
							if (i_23_ > (i_22_ - (Class_fq.field_r_2434.position * -1485345105))) {
								i_23_ = i_22_ - ((Class_fq.field_r_2434.position) * -1485345105);
							}
							if (i_23_ > remaining) {
								i_23_ = remaining;
							}
							Class_et.connection.read(Class_fq.field_r_2434.buffer, (Class_fq.field_r_2434.position * -1485345105), i_23_);
							if (Class_fq.field_o_2449 != 0) {
								for (int i_24_ = 0; i_24_ < i_23_; i_24_++) {
									Class_fq.field_r_2434.buffer[i_24_ + ((Class_fq.field_r_2434.position) * -1485345105)] ^= Class_fq.field_o_2449;
								}
							}
							Class_fq.field_r_2434.position += i_23_ * -685856689;
							Class_fq.field_j_2439 += i_23_ * 352544569;
							if ((Class_fq.field_r_2434.position * -1485345105) == i_22_) {
								if (Class_ev.field_k_2235.id == 16711935L) {
									Class_fq.field_c_2450 = Class_fq.field_r_2434;
									for (int i_25_ = 0; i_25_ < 256; i_25_++) {
										final Index class_fx = Class_fq.field_p_2436[i_25_];
										if (class_fx != null) {
											Class_fq.field_c_2450.position = ((-1191886216 * i_25_) + 865683851);
											final int i_26_ = (Class_fq.field_c_2450.getInt());
											final int i_27_ = (Class_fq.field_c_2450.getInt());
											class_fx.method_cx_void(i_26_, i_27_, 1313077542);
										}
									}
								} else {
									Class_fq.field_v_2446.reset();
									Class_fq.field_v_2446.update(Class_fq.field_r_2434.buffer, 0, i_22_);
									final int i_28_ = (int) Class_fq.field_v_2446.getValue();
									if (i_28_ != ((Class_ev.field_k_2235.field_d_2320) * 1027734669)) {
										try {
											Class_et.connection.close(1434520118);
										} catch (final Exception exception) {
											/* empty */
										}
										Class_fq.field_b_2431 += 2110214265;
										Class_et.connection = null;
										Class_fq.field_o_2449 = (byte) (int) ((Math.random() * 255.0) + 1.0);
										return false;
									}
									Class_fq.field_b_2431 = 0;
									Class_fq.field_t_2451 = 0;
									Class_ev.field_k_2235.field_n_2323.method_cy_void((int) (Class_ev.field_k_2235.id & 0xffffL), Class_fq.field_r_2434.buffer, 16711680L == (Class_ev.field_k_2235.id & 0xff0000L), Class_fq.field_q_2442, 1260334966);
								}
								Class_ev.field_k_2235.removeLink();
								if (Class_fq.field_q_2442) {
									Class_fq.urgentRequests -= -275785585;
								} else {
									Class_fq.delayedRequests -= 1578477811;
								}
								Class_fq.field_j_2439 = 0;
								Class_ev.field_k_2235 = null;
								Class_fq.field_r_2434 = null;
							} else {
								if ((-1674225911 * Class_fq.field_j_2439) != 512) {
									break;
								}
								Class_fq.field_j_2439 = 0;
							}
						}
					}
				} catch (final IOException ioexception) {
					try {
						Class_et.connection.close(-334523290);
					} catch (final Exception exception) {
						/* empty */
					}
					Class_fq.field_t_2451 += 1072263357;
					Class_et.connection = null;
					break;
				}
				return true;
			} catch (final RuntimeException runtimeexception) {
				throw GameCanvas.error(runtimeexception, "bi.n()");
			}
		} while (false);
		return false;
	}
}
