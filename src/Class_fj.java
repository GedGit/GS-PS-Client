/* Class_fj - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Container;
import java.awt.Insets;

public class Class_fj extends Class_bu {
	NodeDeque field_d_2376 = new NodeDeque();
	Class_fg field_n_2377;
	Class_au field_z_2378 = new Class_au();
	public static final int field_e_2379 = 100;
	public static final int field_am_2380 = 196;
	static final int field_bq_2381 = 83;
	public static final int field_b_2382 = 19136776;

	Class_fj(final Class_fg class_fg) {
		this.field_n_2377 = class_fg;
	}

	@Override
	protected int method_m_int() {
		return 0;
	}

	@Override
	protected void method_a_void(final int[] is, final int i, final int i_0_) {
		try {
			this.field_z_2378.method_a_void(is, i, i_0_);
			for (Class_fm class_fm = (Class_fm) this.field_d_2376.method_f_ga(); class_fm != null; class_fm = ((Class_fm) this.field_d_2376.method_a_ga())) {
				if (!this.field_n_2377.method_af_boolean(class_fm, (byte) 66)) {
					int i_1_ = i;
					int i_2_ = i_0_;
					do {
						if (i_2_ <= (class_fm.field_c_2408 * 289598729)) {
							method_n_void(class_fm, is, i_1_, i_2_, i_1_ + i_2_, 65280);
							class_fm.field_c_2408 -= i_2_ * -1274629831;
							break;
						}
						method_n_void(class_fm, is, i_1_, (289598729 * class_fm.field_c_2408), i_2_ + i_1_, 65280);
						i_1_ += class_fm.field_c_2408 * 289598729;
						i_2_ -= 289598729 * class_fm.field_c_2408;
					} while (!this.field_n_2377.method_au_boolean(class_fm, is, i_1_, i_2_, (byte) -106));
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fj.a()");
		}
	}

	@Override
	protected void method_l_void(final int i) {
		try {
			this.field_z_2378.method_l_void(i);
			for (Class_fm class_fm = (Class_fm) this.field_d_2376.method_f_ga(); class_fm != null; class_fm = ((Class_fm) this.field_d_2376.method_a_ga())) {
				if (!this.field_n_2377.method_af_boolean(class_fm, (byte) 47)) {
					int i_3_ = i;
					do {
						if (i_3_ <= (289598729 * class_fm.field_c_2408)) {
							method_d_void(class_fm, i_3_, -1292978403);
							class_fm.field_c_2408 -= -1274629831 * i_3_;
							break;
						}
						method_d_void(class_fm, (289598729 * class_fm.field_c_2408), -1292978403);
						i_3_ -= 289598729 * class_fm.field_c_2408;
					} while (!this.field_n_2377.method_au_boolean(class_fm, null, 0, i_3_, (byte) 20));
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fj.l()");
		}
	}

	void method_n_void(final Class_fm class_fm, final int[] is, int i, int i_4_, final int i_5_, final int i_6_) {
		try {
			if ((((this.field_n_2377.field_c_2341[-843828363 * class_fm.field_n_2401]) & 0x4) != 0) && ((1912998185 * class_fm.field_x_2405) < 0)) {
				final int i_7_ = ((this.field_n_2377.field_w_2346[class_fm.field_n_2401 * -843828363]) / (-1281893659 * NpcDefinitions.audioSampleRate));
				for (;;) {
					final int i_8_ = (((1048575 + i_7_) - (1342842853 * class_fm.field_o_2393)) / i_7_);
					if (i_8_ > i_4_) {
						class_fm.field_o_2393 += i_4_ * i_7_ * -834552339;
						break;
					}
					class_fm.field_v_2407.method_a_void(is, i, i_8_);
					i += i_8_;
					i_4_ -= i_8_;
					class_fm.field_o_2393 += -834552339 * ((i_7_ * i_8_) - 1048576);
					int i_9_ = (NpcDefinitions.audioSampleRate * -1281893659) / 100;
					final int i_10_ = 262144 / i_7_;
					if (i_10_ < i_9_) {
						i_9_ = i_10_;
					}
					final Class_bd class_bd = class_fm.field_v_2407;
					if ((this.field_n_2377.field_b_2344[-843828363 * class_fm.field_n_2401]) == 0) {
						class_fm.field_v_2407 = Class_bd.method_y_bd((class_fm.field_z_2391), class_bd.method_t_int(), class_bd.method_x_int(), class_bd.method_r_int());
					} else {
						class_fm.field_v_2407 = Class_bd.method_y_bd((class_fm.field_z_2391), class_bd.method_t_int(), 0, class_bd.method_r_int());
						this.field_n_2377.method_s_void(class_fm, (class_fm.field_d_2390.field_z_2283[(-1281329883 * class_fm.field_g_2394)]) < 0, -1870813993);
						class_fm.field_v_2407.method_c_void(i_9_, class_bd.method_x_int());
					}
					if ((class_fm.field_d_2390.field_z_2283[class_fm.field_g_2394 * -1281329883]) < 0) {
						class_fm.field_v_2407.method_h_void(-1);
					}
					class_bd.method_o_void(i_9_);
					class_bd.method_a_void(is, i, i_5_ - i);
					if (class_bd.method_i_boolean()) {
						this.field_z_2378.method_n_void(class_bd);
					}
				}
			}
			class_fm.field_v_2407.method_a_void(is, i, i_4_);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fj.n()");
		}
	}

	void method_d_void(final Class_fm class_fm, int i, final int i_11_) {
		try {
			if ((((this.field_n_2377.field_c_2341[class_fm.field_n_2401 * -843828363]) & 0x4) != 0) && ((class_fm.field_x_2405 * 1912998185) < 0)) {
				final int i_12_ = ((this.field_n_2377.field_w_2346[-843828363 * class_fm.field_n_2401]) / (-1281893659 * NpcDefinitions.audioSampleRate));
				final int i_13_ = (((i_12_ + 1048575) - (1342842853 * class_fm.field_o_2393)) / i_12_);
				class_fm.field_o_2393 = (((i * i_12_) + (1342842853 * class_fm.field_o_2393)) & 0xfffff) * -834552339;
				if (i_13_ <= i) {
					if ((this.field_n_2377.field_b_2344[-843828363 * class_fm.field_n_2401]) == 0) {
						class_fm.field_v_2407 = Class_bd.method_y_bd((class_fm.field_z_2391), class_fm.field_v_2407.method_t_int(), class_fm.field_v_2407.method_x_int(), class_fm.field_v_2407.method_r_int());
					} else {
						class_fm.field_v_2407 = Class_bd.method_y_bd((class_fm.field_z_2391), class_fm.field_v_2407.method_t_int(), 0, class_fm.field_v_2407.method_r_int());
						this.field_n_2377.method_s_void(class_fm, (class_fm.field_d_2390.field_z_2283[(class_fm.field_g_2394 * -1281329883)]) < 0, -585931645);
					}
					if ((class_fm.field_d_2390.field_z_2283[-1281329883 * class_fm.field_g_2394]) < 0) {
						class_fm.field_v_2407.method_h_void(-1);
					}
					i = ((1342842853 * class_fm.field_o_2393) / i_12_);
				}
			}
			class_fm.field_v_2407.method_l_void(i);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fj.d()");
		}
	}

	@Override
	protected Class_bu method_g_bu() {
		Class_bu class_bu;
		try {
			final Class_fm class_fm = (Class_fm) this.field_d_2376.method_f_ga();
			class_bu = (class_fm == null ? null : class_fm.field_v_2407 != null ? (Class_bu) class_fm.field_v_2407 : method_f_bu());
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fj.g()");
		}
		return class_bu;
	}

	@Override
	protected Class_bu method_f_bu() {
		Class_bd class_bd;
		try {
			Class_fm class_fm;
			do {
				class_fm = (Class_fm) this.field_d_2376.method_a_ga();
				if (class_fm == null) {
					return null;
				}
			} while (class_fm.field_v_2407 == null);
			class_bd = class_fm.field_v_2407;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fj.f()");
		}
		return class_bd;
	}

	static void method_l_void(final byte[] is, final byte i) {
		try {
			final Buffer rsbytebuffer = new Buffer(is);
			rsbytebuffer.position = -685856689 * (is.length - 2);
			Class_bk.field_n_583 = rsbytebuffer.getShort() * 467432923;
			Class_bk.field_y_579 = new int[298614355 * Class_bk.field_n_583];
			Class_bk.field_e_580 = new int[Class_bk.field_n_583 * 298614355];
			Class_fv.field_g_2506 = new int[Class_bk.field_n_583 * 298614355];
			Class_bk.field_f_581 = new int[298614355 * Class_bk.field_n_583];
			Class_bk.field_a_585 = new byte[Class_bk.field_n_583 * 298614355][];
			rsbytebuffer.position = ((is.length - 7 - (-1906052456 * Class_bk.field_n_583)) * -685856689);
			GameCanvas.field_d_2228 = rsbytebuffer.getShort() * -897268263;
			Class_bk.field_z_584 = rsbytebuffer.getShort() * 60685047;
			final int i_14_ = (rsbytebuffer.get() & 0xff) + 1;
			for (int i_15_ = 0; i_15_ < (Class_bk.field_n_583 * 298614355); i_15_++) {
				Class_bk.field_y_579[i_15_] = rsbytebuffer.getShort();
			}
			for (int i_16_ = 0; i_16_ < (Class_bk.field_n_583 * 298614355); i_16_++) {
				Class_bk.field_e_580[i_16_] = rsbytebuffer.getShort();
			}
			for (int i_17_ = 0; i_17_ < (298614355 * Class_bk.field_n_583); i_17_++) {
				Class_fv.field_g_2506[i_17_] = rsbytebuffer.getShort();
			}
			for (int i_18_ = 0; i_18_ < (Class_bk.field_n_583 * 298614355); i_18_++) {
				Class_bk.field_f_581[i_18_] = rsbytebuffer.getShort();
			}
			rsbytebuffer.position = (is.length - 7 - (Class_bk.field_n_583 * -1906052456) - ((i_14_ - 1) * 3)) * -685856689;
			Class_l.field_m_1134 = new int[i_14_];
			for (int i_19_ = 1; i_19_ < i_14_; i_19_++) {
				Class_l.field_m_1134[i_19_] = rsbytebuffer.getMediumInt(1736422448);
				if (Class_l.field_m_1134[i_19_] == 0) {
					Class_l.field_m_1134[i_19_] = 1;
				}
			}
			rsbytebuffer.position = 0;
			for (int i_20_ = 0; i_20_ < (298614355 * Class_bk.field_n_583); i_20_++) {
				final int i_21_ = Class_fv.field_g_2506[i_20_];
				final int i_22_ = Class_bk.field_f_581[i_20_];
				final int i_23_ = i_21_ * i_22_;
				final byte[] is_24_ = new byte[i_23_];
				Class_bk.field_a_585[i_20_] = is_24_;
				final int i_25_ = rsbytebuffer.get();
				if (i_25_ == 0) {
					for (int i_26_ = 0; i_26_ < i_23_; i_26_++) {
						is_24_[i_26_] = rsbytebuffer.getSigned();
					}
				} else if (i_25_ == 1) {
					for (int i_27_ = 0; i_27_ < i_21_; i_27_++) {
						for (int i_28_ = 0; i_28_ < i_22_; i_28_++) {
							is_24_[i_27_ + (i_21_ * i_28_)] = rsbytebuffer.getSigned();
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fj.l()");
		}
	}

	static void method_an_void(final int i) {
		try {
			final client var_client = client.instance;
			synchronized (var_client) {
				final Container container = client.instance.method_rm_Container(-1879170546);
				if (container != null) {
					Class_dw.field_qf_1737 = (Math.max(container.getSize().width, -1356770131 * Class_cx.field_qp_1434) * -1852646029);
					Renderable.field_qa_763 = (Math.max(container.getSize().height, -1773356969 * Class_cw.field_qu_1409) * 2028890201);
					if (container == Class_ci.field_qb_982) {
						final Insets insets = Class_ci.field_qb_982.getInsets();
						Class_dw.field_qf_1737 -= (insets.left + insets.right) * -1852646029;
						Renderable.field_qa_763 -= 2028890201 * (insets.bottom + insets.top);
					}
					if ((Class_dw.field_qf_1737 * -1364750405) <= 0) {
						Class_dw.field_qf_1737 = -1852646029;
					}
					if ((Renderable.field_qa_763 * 526016489) <= 0) {
						Renderable.field_qa_763 = 2028890201;
					}
					if (Class_dj.method_ac_int((byte) 63) == 1) {
						Boundary.clientWidth = 964570763 * client.field_lm_2904;
						Projectile.clientHeight = client.field_lb_2950 * -1034468333;
					} else {
						Boundary.clientWidth = Math.min(-1364750405 * Class_dw.field_qf_1737, 7680) * -2134569435;
						Projectile.clientHeight = Math.min(Renderable.field_qa_763 * 526016489, 2160) * 298684641;
					}
					GameStub.field_qw_2145 = (288185379 * (((Class_dw.field_qf_1737 * -1364750405) - (Boundary.clientWidth * -1236640339)) / 2));
					GameStub.field_qs_2139 = 0;
					ObjectComposite.canvas.setSize((Boundary.clientWidth * -1236640339), (-1483492575 * Projectile.clientHeight));
					Class_s.field_qj_1361 = KeyFocusListener.method_ax_bi((Boundary.clientWidth * -1236640339), (-1483492575 * Projectile.clientHeight), ObjectComposite.canvas, (byte) 0);
					if (container == Class_ci.field_qb_982) {
						final Insets insets = Class_ci.field_qb_982.getInsets();
						ObjectComposite.canvas.setLocation((1328296843 * GameStub.field_qw_2145) + insets.left, insets.top + (487934209 * GameStub.field_qs_2139));
					} else {
						ObjectComposite.canvas.setLocation((1328296843 * GameStub.field_qw_2145), (487934209 * GameStub.field_qs_2139));
					}
					Friend.method_aw_void(-1867975181);
					if ((client.rootInterfaceId * -374264803) != -1) {
						NpcComposite.method_ci_void(true, 1316140956);
					}
					Class_de.method_ai_void(-1246697462);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fj.an()");
		}
	}
}
