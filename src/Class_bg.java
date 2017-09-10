/* Class_bg - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_bg implements Runnable {
	volatile boolean field_z_545 = false;
	volatile Class_av[] field_d_546 = new Class_av[2];
	Daemon field_n_547;
	volatile boolean field_y_548 = false;
	static final int field_az_549 = 38;
	static final int field_h_550 = 2;
	public static final int field_a_551 = 12;
	public static final int field_aw_552 = 250;
	static Class_au field_na_553;
	public static final int field_bi_554 = 230;
	static final int field_v_555 = 19;

	static String method_el_String(final Widget widget, final byte i) {
		String string;
		try {
			string = (WidgetNode.method_z_int(Class_db.method_en_int(widget, -1781722013), -1977245782) == 0 ? null : ((widget.field_cc_2673 != null) && (widget.field_cc_2673.trim().length() != 0)) ? widget.field_cc_2673 : null);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "bg.el()");
		}
		return string;
	}

	@Override
	public void run() {
		try {
			this.field_y_548 = true;
			try {
				try {
					while (!this.field_z_545) {
						for (int i = 0; i < 2; i++) {
							final Class_av class_av = this.field_d_546[i];
							if (class_av != null) {
								class_av.method_p_void(-344271207);
							}
						}
						Class_fc.sleep(10L);
						final Daemon class_dx = this.field_n_547;
						if (class_dx.eventQueue != null) {
							for (int i = 0; (i < 50) && (class_dx.eventQueue.peekEvent() != null); i++) {
								Class_fc.sleep(1L);
							}
						}
					}
				} catch (final Exception exception) {
					Class_cw.method_n_void(null, exception, 714866471);
					this.field_y_548 = false;
					this.field_y_548 = false;
					return;
				}
				this.field_y_548 = false;
			} catch (final RuntimeException object) {
				this.field_y_548 = false;
				throw object;
			}
			this.field_y_548 = false;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "bg.run()");
		}
	}

	Class_bg() {
		/* empty */
	}

	public static String method_d_String(final CharSequence charsequence, final Class_gf class_gf, final int i) {
		do {
			String string;
			try {
				if (charsequence == null) {
					return null;
				}
				int i_0_ = 0;
				int i_1_;
				for (i_1_ = charsequence.length(); i_0_ < i_1_; i_0_++) {
					if (!FileStore.method_n_boolean(charsequence.charAt(i_0_), (byte) 2)) {
						break;
					}
				}
				for (/**/; ((i_1_ > i_0_) && FileStore.method_n_boolean(charsequence.charAt(i_1_ - 1), (byte) 2)); i_1_--) {
					/* empty */
				}
				final int i_2_ = i_1_ - i_0_;
				if (i_2_ < 1) {
					break;
				}
				int i_3_;
				if (class_gf == null) {
					i_3_ = 12;
				} else {
					switch (class_gf.field_h_2991 * -570110745) {
					case 3:
						i_3_ = 20;
						break;
					default:
						i_3_ = 12;
					}
				}
				if (i_2_ > i_3_) {
					break;
				}
				final StringBuilder stringbuilder = new StringBuilder(i_2_);
				for (int i_4_ = i_0_; i_4_ < i_1_; i_4_++) {
					final char c = charsequence.charAt(i_4_);
					boolean bool;
					if (java.lang.Character.isISOControl(c)) {
						bool = false;
					} else if (GameMessage.method_f_boolean(c, -1289391889)) {
						bool = true;
					} else {
						char[] cs = Class_eg.UNICODE_CHARS;
						int i_5_ = 0;
						while_22_: for (;;) {
							if (i_5_ >= cs.length) {
								cs = Class_eg.SPECIAL_CHARS;
								for (i_5_ = 0; i_5_ < cs.length; i_5_++) {
									final char c_6_ = cs[i_5_];
									if (c == c_6_) {
										bool = true;
										break while_22_;
									}
								}
								bool = false;
								break;
							}
							final char c_7_ = cs[i_5_];
							if (c == c_7_) {
								bool = true;
								break;
							}
							i_5_++;
						}
					}
					if (bool) {
						final char c_8_ = ClanMember.method_z_char(c, 2011638554);
						if (c_8_ != 0) {
							stringbuilder.append(c_8_);
						}
					}
				}
				if (stringbuilder.length() == 0) {
					return null;
				}
				string = stringbuilder.toString();
			} catch (final RuntimeException runtimeexception) {
				throw GameCanvas.error(runtimeexception, "bg.d()");
			}
			return string;
		} while (false);
		return null;
	}

	static Sprite[] method_n_beArray(final FileStore class_fs, final int i, final int i_9_, final int i_10_) {
		Sprite[] class_bes;
		try {
			class_bes = (!Region.method_h_boolean(class_fs, i, i_9_, 1079958178) ? null : ObjectComposite.method_a_beArray(248498315));
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "bg.n()");
		}
		return class_bes;
	}
	
	//i know why, its mod_icons.dat includes all the images lol i know but the problem is that we gotta find out how to add onto that file xd or we could be super ghetto like 317s but thats gay xd

	static void method_n_void(final int i) {
		try {
			for (Class_o class_o = (Class_o) Class_o.field_n_1232.method_f_ga(); class_o != null; class_o = (Class_o) Class_o.field_n_1232.method_a_ga()) {
				if (class_o.field_a_1222 != null) {
					field_na_553.method_d_void(class_o.field_a_1222);
					class_o.field_a_1222 = null;
				}
				if (class_o.field_k_1234 != null) {
					field_na_553.method_d_void(class_o.field_k_1234);
					class_o.field_k_1234 = null;
				}
			}
			Class_o.field_n_1232.method_n_void();
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "bg.n()");
		}
	}
}
