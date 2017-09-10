/* Class_db - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_db {
	public final int field_y_1565;
	static FileStore field_g_1566;
	static final Class_db field_z_1567 = new Class_db(2);
	public static final Class_db field_d_1568 = new Class_db(1);
	public static final int field_x_1569 = 99;
	static final int field_u_1570 = 7;
	static final Class_db field_n_1571 = new Class_db(0);
	public static final int field_ek_1572 = 45;
	static int field_or_1573;
	public static final int field_w_1574 = 19136896;

	Class_db(final int i) {
		field_y_1565 = i * -776296271;
	}

	static final void method_bu_void(final int i, final int i_0_, final int i_1_, final int i_2_, final int i_3_, final int i_4_) {
		try {
			int i_5_ = Class_ae.sceneGraph.method_ad_int(i, i_0_, i_1_);
			if (i_5_ != 0) {
				final int i_6_ = Class_ae.sceneGraph.method_al_int(i, i_0_, i_1_, i_5_);
				final int i_7_ = (i_6_ >> 6) & 0x3;
				final int i_8_ = i_6_ & 0x1f;
				int i_9_ = i_2_;
				if (i_5_ > 0) {
					i_9_ = i_3_;
				}
				final int[] is = Class_a.field_mp_793.field_n_681;
				final int i_10_ = (4 * i_0_) + 24624 + ((103 - i_1_) * 2048);
				final int i_11_ = (i_5_ >> 14) & 0x7fff;
				final ObjectComposite objectdef = Class_cj.getObjectComposite(i_11_);
				if ((-390817969 * objectdef.field_al_343) != -1) {
					final Sprite class_be = (Class_et.mapscene[objectdef.field_al_343 * -390817969]);
					if (class_be != null) {
						final int i_12_ = (((845353924 * objectdef.width) - class_be.field_z_533) / 2);
						final int i_13_ = (((objectdef.length * 512271212) - class_be.field_y_534) / 2);
						class_be.render((4 * i_0_) + 48 + i_12_, (i_13_ + 48 + ((104 - i_1_ - (1201809627 * objectdef.length)) * 4)));
					}
				} else {
					if ((i_8_ == 0) || (i_8_ == 2)) {
						if (i_7_ == 0) {
							is[i_10_] = i_9_;
							is[512 + i_10_] = i_9_;
							is[1024 + i_10_] = i_9_;
							is[1536 + i_10_] = i_9_;
						} else if (i_7_ == 1) {
							is[i_10_] = i_9_;
							is[i_10_ + 1] = i_9_;
							is[2 + i_10_] = i_9_;
							is[3 + i_10_] = i_9_;
						} else if (i_7_ == 2) {
							is[i_10_ + 3] = i_9_;
							is[3 + i_10_ + 512] = i_9_;
							is[3 + i_10_ + 1024] = i_9_;
							is[1536 + i_10_ + 3] = i_9_;
						} else if (i_7_ == 3) {
							is[i_10_ + 1536] = i_9_;
							is[1537 + i_10_] = i_9_;
							is[1538 + i_10_] = i_9_;
							is[3 + i_10_ + 1536] = i_9_;
						}
					}
					if (i_8_ == 3) {
						if (i_7_ == 0) {
							is[i_10_] = i_9_;
						} else if (i_7_ == 1) {
							is[i_10_ + 3] = i_9_;
						} else if (i_7_ == 2) {
							is[3 + i_10_ + 1536] = i_9_;
						} else if (i_7_ == 3) {
							is[i_10_ + 1536] = i_9_;
						}
					}
					if (i_8_ == 2) {
						if (i_7_ == 3) {
							is[i_10_] = i_9_;
							is[512 + i_10_] = i_9_;
							is[i_10_ + 1024] = i_9_;
							is[1536 + i_10_] = i_9_;
						} else if (i_7_ == 0) {
							is[i_10_] = i_9_;
							is[i_10_ + 1] = i_9_;
							is[2 + i_10_] = i_9_;
							is[3 + i_10_] = i_9_;
						} else if (i_7_ == 1) {
							is[3 + i_10_] = i_9_;
							is[i_10_ + 3 + 512] = i_9_;
							is[3 + i_10_ + 1024] = i_9_;
							is[3 + i_10_ + 1536] = i_9_;
						} else if (i_7_ == 2) {
							is[i_10_ + 1536] = i_9_;
							is[1537 + i_10_] = i_9_;
							is[1538 + i_10_] = i_9_;
							is[1536 + i_10_ + 3] = i_9_;
						}
					}
				}
			}
			i_5_ = Class_ae.sceneGraph.method_ae_int(i, i_0_, i_1_);
			if (i_5_ != 0) {
				final int i_14_ = Class_ae.sceneGraph.method_al_int(i, i_0_, i_1_, i_5_);
				final int i_15_ = (i_14_ >> 6) & 0x3;
				final int i_16_ = i_14_ & 0x1f;
				final int i_17_ = (i_5_ >> 14) & 0x7fff;
				final ObjectComposite objectdef = Class_cj.getObjectComposite(i_17_);
				if ((-390817969 * objectdef.field_al_343) != -1) {
					final Sprite class_be = (Class_et.mapscene[-390817969 * objectdef.field_al_343]);
					if (class_be != null) {
						final int i_18_ = (((objectdef.width * 845353924) - class_be.field_z_533) / 2);
						final int i_19_ = (((objectdef.length * 512271212) - class_be.field_y_534) / 2);
						class_be.render(i_18_ + (4 * i_0_) + 48, ((104 - i_1_ - (objectdef.length * 1201809627)) * 4) + 48 + i_19_);
					}
				} else if (i_16_ == 9) {
					int i_20_ = 15658734;
					if (i_5_ > 0) {
						i_20_ = 15597568;
					}
					final int[] is = Class_a.field_mp_793.field_n_681;
					final int i_21_ = (i_0_ * 4) + 24624 + ((103 - i_1_) * 2048);
					if ((i_15_ != 0) && (i_15_ != 2)) {
						is[i_21_] = i_20_;
						is[513 + i_21_] = i_20_;
						is[i_21_ + 1024 + 2] = i_20_;
						is[1536 + i_21_ + 3] = i_20_;
					} else {
						is[i_21_ + 1536] = i_20_;
						is[i_21_ + 1024 + 1] = i_20_;
						is[512 + i_21_ + 2] = i_20_;
						is[i_21_ + 3] = i_20_;
					}
				}
			}
			i_5_ = Class_ae.sceneGraph.method_ax_int(i, i_0_, i_1_);
			if (i_5_ != 0) {
				final int i_22_ = (i_5_ >> 14) & 0x7fff;
				final ObjectComposite objectdef = Class_cj.getObjectComposite(i_22_);
				if ((-390817969 * objectdef.field_al_343) != -1) {
					final Sprite class_be = (Class_et.mapscene[-390817969 * objectdef.field_al_343]);
					if (class_be != null) {
						final int i_23_ = (((845353924 * objectdef.width) - class_be.field_z_533) / 2);
						final int i_24_ = (((512271212 * objectdef.length) - class_be.field_y_534) / 2);
						class_be.render(48 + (i_0_ * 4) + i_23_, (i_24_ + (4 * (104 - i_1_ - (objectdef.length * 1201809627))) + 48));
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "db.bu()");
		}
	}

	static final void method_p_void(final int i) {
		try {
			if (Class_de.field_nn_1594 != null) {
				Class_de.field_nn_1594.method_p_void(-344271207);
			}
			if (Class_fq.field_nt_2444 != null) {
				Class_fq.field_nt_2444.method_p_void(-344271207);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "db.p()");
		}
	}

	static int method_en_int(final Widget widget, final int i) {
		int i_25_;
		try {
			final WidgetOptionNode widgetoptionmasknode = ((WidgetOptionNode) (client.widgetOptionTable.method_n_ga(((long) (-560181405 * widget.uid) << 32) + (widget.field_k_2544 * -2038048459))));
			i_25_ = (widgetoptionmasknode != null ? widgetoptionmasknode.mask : 1810784985 * widget.field_cu_2650);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "db.en()");
		}
		return i_25_;
	}
}
