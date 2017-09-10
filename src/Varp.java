/* Class_ag - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Varp extends CacheableNode {
	public int value = 0;
	public static NodeCache field_z_61 = new NodeCache(64);
	static int field_s_62;
	static FileStore field_n_63;
	static MachineInformationNode machineInformation;
	static FileStore field_e_65;
	static int field_nz_66;
	public static final int field_ec_67 = 111;

	void method_z_void(final Buffer rsbytebuffer, final int i) {
		try {
			for (;;) {
				final int i_0_ = rsbytebuffer.get();
				if (i_0_ == 0) {
					break;
				}
				method_y_void(rsbytebuffer, i_0_, 1276204695);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ag.z()");
		}
	}

	void method_y_void(final Buffer rsbytebuffer, final int i, final int i_1_) {
		try {
			if (i == 5) {
				value = rsbytebuffer.getShort() * -556888661;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ag.y()");
		}
	}

	public static boolean method_d_boolean(final byte i) {
		boolean bool;
		try {
			final ItemDefinitions class_gk = (ItemDefinitions) Class_gt.field_n_3046.method_d_ga();
			if (class_gk != null) {
				return true;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ag.d()");
		}
		return bool;
	}

	static int method_n_int(final byte i) {
		int i_2_;
		try {
			i_2_ = (((Class_l.gameMessageCounter += -1079787177) * -1879262617) - 1);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ag.n()");
		}
		return i_2_;
	}

	static final void method_dq_void(final byte i) {
		try {
			Daemon.method_dn_void(client.field_jt_2801, (byte) 73);
			SceneObject.field_kn_935 += -1073810353;
			if (client.field_jc_2868 && client.field_ji_2766) {
				int i_3_ = MouseInputListener.field_m_2156 * 1515107729;
				int i_4_ = -2089478689 * MouseInputListener.field_a_2157;
				i_3_ -= client.field_jr_2862 * -47430253;
				i_4_ -= 1314055393 * client.field_jn_2863;
				if (i_3_ < (client.field_jv_2938 * 1377090055)) {
					i_3_ = client.field_jv_2938 * 1377090055;
				}
				if (((1367496319 * client.field_jt_2801.onScreenWidth) + i_3_) > ((client.field_jj_2861.onScreenWidth * 1367496319) + (1377090055 * client.field_jv_2938))) {
					i_3_ = (((1377090055 * client.field_jv_2938) + (1367496319 * client.field_jj_2861.onScreenWidth)) - (client.field_jt_2801.onScreenWidth * 1367496319));
				}
				if (i_4_ < (client.field_jw_2886 * 1248838539)) {
					i_4_ = 1248838539 * client.field_jw_2886;
				}
				if ((i_4_ + (client.field_jt_2801.onScreenHeight * -1643237919)) > ((-1643237919 * client.field_jj_2861.onScreenHeight) + (1248838539 * client.field_jw_2886))) {
					i_4_ = (((client.field_jj_2861.onScreenHeight * -1643237919) + (1248838539 * client.field_jw_2886)) - (client.field_jt_2801.onScreenHeight * -1643237919));
				}
				final int i_5_ = i_3_ - (-1374162489 * client.field_jf_2834);
				final int i_6_ = i_4_ - (-950814063 * client.field_jl_2734);
				final int i_7_ = client.field_jt_2801.field_cn_2618 * -2020407227;
				if (((-472669521 * SceneObject.field_kn_935) > (client.field_jt_2801.field_cf_2619 * -1334963661)) && ((i_5_ > i_7_) || (i_5_ < -i_7_) || (i_6_ > i_7_) || (i_6_ < -i_7_))) {
					client.field_jz_2871 = true;
				}
				final int i_8_ = ((client.field_jj_2861.field_ab_2565 * 440856551) + (i_3_ - (1377090055 * client.field_jv_2938)));
				final int i_9_ = ((i_4_ - (client.field_jw_2886 * 1248838539)) + (client.field_jj_2861.verticalScrollPos * -854204745));
				if ((client.field_jt_2801.field_cg_2599 != null) && client.field_jz_2871) {
					final Script class_n = new Script();
					class_n.parent = client.field_jt_2801;
					class_n.field_y_1198 = i_8_ * -996127361;
					class_n.field_e_1196 = -1439458489 * i_9_;
					class_n.parameters = client.field_jt_2801.field_cg_2599;
					Menu.handleCS2Script(class_n, 200000);
				}
				if ((MouseInputListener.field_f_2155 * 2143958423) == 0) {
					if (client.field_jz_2871) {
						if (client.field_jt_2801.field_cr_2632 != null) {
							final Script class_n = new Script();
							class_n.parent = client.field_jt_2801;
							class_n.field_y_1198 = -996127361 * i_8_;
							class_n.field_e_1196 = -1439458489 * i_9_;
							class_n.field_f_1195 = client.field_jp_2827;
							class_n.parameters = client.field_jt_2801.field_cr_2632;
							Menu.handleCS2Script(class_n, 200000);
						}
						if (client.field_jp_2827 != null) {
							Widget widget = client.field_jt_2801;
							final int i_10_ = Class_db.method_en_int(widget, -2089950461);
							final int i_11_ = (i_10_ >> 17) & 0x7;
							final int i_12_ = i_11_;
							Widget widget_13_;
							if (i_11_ == 0) {
								widget_13_ = null;
							} else {
								int i_14_ = 0;
								for (;;) {
									if (i_14_ >= i_12_) {
										widget_13_ = widget;
										break;
									}
									widget = Class_en.getWidgetByUID((-1405313417 * (widget.parentId)), (short) 18816);
									if (widget == null) {
										widget_13_ = null;
										break;
									}
									i_14_++;
								}
							}
							if (widget_13_ != null) {
								client.encryptedBuffer.writeOpcode(59);
								client.encryptedBuffer.putLEShortA((client.field_jp_2827.field_k_2544 * -2038048459), -1052645811);
								client.encryptedBuffer.putLEShort((-2038048459 * client.field_jt_2801.field_k_2544), (byte) 2);
								client.encryptedBuffer.putLEShort(1464571113 * client.field_jt_2801.itemId, (byte) 2);
								client.encryptedBuffer.putLEInt((client.field_jt_2801.uid * -560181405), (byte) 0);
								client.encryptedBuffer.putShortA(1464571113 * client.field_jp_2827.itemId, (byte) -98);
								client.encryptedBuffer.putInt1((-560181405 * client.field_jp_2827.uid), -1721734508);
							}
						}
					} else if ((((client.field_hs_2855 * -367274921) == 1) || (Class_fk.method_ct_boolean((client.currentMenuSize * -224642011) - 1, (byte) -25))) && ((client.currentMenuSize * -224642011) > 2)) {
						Class_ed.method_cb_void(((client.field_jr_2862 * -47430253) + (client.field_jf_2834 * -1374162489)), ((client.field_jn_2863 * 1314055393) + (-950814063 * client.field_jl_2734)), (byte) 1);
					} else if ((client.currentMenuSize * -224642011) > 0) {
						ZipInflater.method_dc_void(((-1374162489 * client.field_jf_2834) + (client.field_jr_2862 * -47430253)), ((-950814063 * client.field_jl_2734) + (1314055393 * client.field_jn_2863)), 1253436975);
					}
					client.field_jt_2801 = null;
				}
			} else if ((-472669521 * SceneObject.field_kn_935) > 1) {
				client.field_jt_2801 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ag.dq()");
		}
	}

	public static String method_n_String(final byte[] is, final int i, final int i_15_, final int i_16_) {
		String string;
		try {
			final char[] cs = new char[i_15_];
			int i_17_ = 0;
			int i_18_ = i;
			final int i_19_ = i + i_15_;
			while (i_18_ < i_19_) {
				final int i_20_ = is[i_18_++] & 0xff;
				int i_21_;
				if (i_20_ < 128) {
					if (i_20_ == 0) {
						i_21_ = 65533;
					} else {
						i_21_ = i_20_;
					}
				} else if (i_20_ < 192) {
					i_21_ = 65533;
				} else if (i_20_ < 224) {
					if ((i_18_ < i_19_) && ((is[i_18_] & 0xc0) == 128)) {
						i_21_ = ((i_20_ & 0x1f) << 6) | (is[i_18_++] & 0x3f);
						if (i_21_ < 128) {
							i_21_ = 65533;
						}
					} else {
						i_21_ = 65533;
					}
				} else if (i_20_ < 240) {
					if (((i_18_ + 1) < i_19_) && ((is[i_18_] & 0xc0) == 128) && ((is[i_18_ + 1] & 0xc0) == 128)) {
						i_21_ = (((i_20_ & 0xf) << 12) | ((is[i_18_++] & 0x3f) << 6) | (is[i_18_++] & 0x3f));
						if (i_21_ < 2048) {
							i_21_ = 65533;
						}
					} else {
						i_21_ = 65533;
					}
				} else if (i_20_ < 248) {
					if (((i_18_ + 2) < i_19_) && ((is[i_18_] & 0xc0) == 128) && ((is[i_18_ + 1] & 0xc0) == 128) && ((is[2 + i_18_] & 0xc0) == 128)) {
						i_21_ = (((i_20_ & 0x7) << 18) | ((is[i_18_++] & 0x3f) << 12) | ((is[i_18_++] & 0x3f) << 6) | (is[i_18_++] & 0x3f));
						if ((i_21_ >= 65536) && (i_21_ <= 1114111)) {
							i_21_ = 65533;
						} else {
							i_21_ = 65533;
						}
					} else {
						i_21_ = 65533;
					}
				} else {
					i_21_ = 65533;
				}
				cs[i_17_++] = (char) i_21_;
			}
			string = new String(cs, 0, i_17_);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ag.n()");
		}
		return string;
	}

	Varp() {
		/* empty */
	}
}
