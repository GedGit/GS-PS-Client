
/* NpcDef - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class NpcComposite extends CacheableNode {
	public static final int field_cq_463 = 140;
	public static FileStore field_d_464;
	public static NodeCache field_z_465 = new NodeCache(64);
	public static NodeCache field_y_466 = new NodeCache(50);
	public int id;
	public boolean field_ac_468 = false;
	public int occupiedTiles = -1667593647;
	int[] field_m_470;
	public int[] childrenIds;
	public int standAnimation = 1783950779;
	int field_ar_473 = -511689567;
	public int field_u_474 = -1178703977;
	public int field_q_475 = 1126542837;
	public int turnAnimation = 1751530229;
	public int walkAnimation = -1224746669;
	int field_as_478 = -962894489;
	public static FileStore field_n_479;
	short[] field_s_480;
	short[] field_v_481;
	short[] field_c_482;
	public String name = "null";
	public int field_l_484 = 26557539;
	public int field_b_485 = 686030963;
	int field_t_486 = 1417800832;
	int field_w_487 = -1563662720;
	public int field_ae_488 = -956277931;
	int field_ad_489 = 0;
	public int field_az_490 = 1571313634;
	int[] field_a_491;
	public int field_ax_492 = -568835680;
	int field_ak_493 = 0;
	public boolean field_o_494 = true;
	public boolean field_i_495 = false;
	public boolean field_ab_496 = true;
	public boolean field_ao_497 = true;
	static final int field_aj_498 = 48;
	public int turn180 = -527739087;
	static int localCoordinateY;
	public String[] actions = new String[5];
	short[] field_j_502;

	static Class_fb method_n_fb(final FileStore class_fs, final int i, final int i_0_) {
		Class_fb class_fb;
		try {
			final byte[] is = class_fs.method_m_byteArray(i, (short) 238);
			class_fb = is == null ? null : new Class_fb(is);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "az.n()");
		}
		return class_fb;
	}

	void method_d_void(final int i) {
		/* empty */
	}
	static int i2 = 0;

	void method_z_void(final Buffer rsbytebuffer, final short i) {
		try {
			for (;;) {
				final int i_1_ = rsbytebuffer.get();
				if (i_1_ == 0) {
					break;
				}
				method_y_void(rsbytebuffer, i_1_, (byte) -46);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "az.z()");
		}
	}

	void method_y_void(final Buffer rsbytebuffer, final int i, final byte i_2_) {
		try {
			if (i == 1) {
				final int i_3_ = rsbytebuffer.get();
				this.field_m_470 = new int[i_3_];
				for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
					this.field_m_470[i_4_] = rsbytebuffer.getShort();
				}
			} else if (i == 2) {
				name = rsbytebuffer.getString();
			} else if (i == 12) {
				occupiedTiles = rsbytebuffer.get() * -1667593647;
			} else if (i == 13) {
				standAnimation = rsbytebuffer.getShort() * -1783950779;
			} else if (i == 14) {
				field_q_475 = rsbytebuffer.getShort() * -1126542837;
			} else if (i == 15) {
				field_l_484 = rsbytebuffer.getShort() * -26557539;
			} else if (i == 16) {
				field_u_474 = rsbytebuffer.getShort() * 1178703977;
			} else if (i == 17) {
				field_q_475 = rsbytebuffer.getShort() * -1126542837;
				turnAnimation = rsbytebuffer.getShort() * -1751530229;
				walkAnimation = rsbytebuffer.getShort() * 1224746669;
				turn180 = rsbytebuffer.getShort() * 527739087;
			} else if ((i >= 30) && (i < 35)) {
				actions[i - 30] = rsbytebuffer.getString();
				if (actions[i - 30].equalsIgnoreCase(MenuText.HIDDEN)) {
					actions[i - 30] = null;
				}
			} else if (i == 40) {
				final int i_5_ = rsbytebuffer.get();
				this.field_j_502 = new short[i_5_];
				this.field_s_480 = new short[i_5_];
				for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
					this.field_j_502[i_6_] = (short) rsbytebuffer.getShort();
					this.field_s_480[i_6_] = (short) rsbytebuffer.getShort();
				}
			} else if (i == 41) {
				final int i_7_ = rsbytebuffer.get();
				this.field_v_481 = new short[i_7_];
				this.field_c_482 = new short[i_7_];
				for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
					this.field_v_481[i_8_] = (short) rsbytebuffer.getShort();
					this.field_c_482[i_8_] = (short) rsbytebuffer.getShort();
				}
			} else if (i == 60) {
				final int i_9_ = rsbytebuffer.get();
				this.field_a_491 = new int[i_9_];
				for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
					this.field_a_491[i_10_] = rsbytebuffer.getShort();
				}
			} else if (i == 93) {
				field_o_494 = false;
			} else if (i == 95) {
				field_b_485 = rsbytebuffer.getShort() * -686030963;
			} else if (i == 97) {
				this.field_t_486 = rsbytebuffer.getShort() * 413729753;
			} else if (i == 98) {
				this.field_w_487 = rsbytebuffer.getShort() * 658872525;
			} else if (i == 99) {
				field_i_495 = true;
			} else if (i == 100) {
				this.field_ad_489 = rsbytebuffer.getSigned() * 1214895505;
			} else if (i == 101) {
				this.field_ak_493 = rsbytebuffer.getSigned() * 879262775;
			} else if (i == 102) {
				field_ae_488 = rsbytebuffer.getShort() * 956277931;
			} else if (i == 103) {
				field_ax_492 = rsbytebuffer.getShort() * -2031042035;
			} else if (i == 106) {
				this.field_ar_473 = rsbytebuffer.getShort() * 511689567;
				if ((44259487 * this.field_ar_473) == 65535) {
					this.field_ar_473 = -511689567;
				}
				this.field_as_478 = rsbytebuffer.getShort() * 962894489;
				if ((-1199236695 * this.field_as_478) == 65535) {
					this.field_as_478 = -962894489;
				}
				final int i_11_ = rsbytebuffer.get();
				childrenIds = new int[1 + i_11_];
				for (int i_12_ = 0; i_12_ <= i_11_; i_12_++) {
					childrenIds[i_12_] = rsbytebuffer.getShort();
					if (65535 == childrenIds[i_12_]) {
						childrenIds[i_12_] = -1;
					}
				}
			} else if (i == 107) {
				field_ab_496 = false;
			} else if (i == 109) {
				field_ao_497 = false;
			} else if (i == 111) {
				field_ac_468 = true;
			} else if (i == 112) {
				field_az_490 = rsbytebuffer.get() * 1627198463;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "az.y()");
		}
	}

	public final Model method_e_cg(final AnimationSequence class_an, final int i, final AnimationSequence class_an_13_, final int i_14_, final int i_15_) {
		Model onscreenmodel;
		try {
			if (childrenIds != null) {
				final NpcComposite npcdef_16_ = method_f_az(896489241);
				return (npcdef_16_ == null ? null : npcdef_16_.method_e_cg(class_an, i, class_an_13_, i_14_, -896271800));
			}
			Model onscreenmodel_17_ = ((Model) field_y_466.method_n_gb(id * 384781917));
			if (onscreenmodel_17_ == null) {
				boolean bool = false;
				for (int i_18_ = 0; i_18_ < this.field_m_470.length; i_18_++) {
					if (!field_d_464.method_e_boolean((this.field_m_470[i_18_]), 0, 1477783099)) {
						bool = true;
					}
				}
				if (bool) {
					return null;
				}
				final OffScreenModel[] rsmodels = new OffScreenModel[this.field_m_470.length];
				for (int i_19_ = 0; i_19_ < this.field_m_470.length; i_19_++) {
					rsmodels[i_19_] = OffScreenModel.getModel(field_d_464, (this.field_m_470[i_19_]), 0);
				}
				OffScreenModel rsmodel;
				if (rsmodels.length == 1) {
					rsmodel = rsmodels[0];
				} else {
					rsmodel = new OffScreenModel(rsmodels, rsmodels.length);
				}
				if (this.field_j_502 != null) {
					for (int i_20_ = 0; i_20_ < this.field_j_502.length; i_20_++) {
						rsmodel.recolor((this.field_j_502[i_20_]), (this.field_s_480[i_20_]));
					}
				}
				if (this.field_v_481 != null) {
					for (int i_21_ = 0; i_21_ < this.field_v_481.length; i_21_++) {
						rsmodel.retexture((this.field_v_481[i_21_]), (this.field_c_482[i_21_]));
					}
				}
				onscreenmodel_17_ = rsmodel.method_ad_cg((-1482454159 * (this.field_ad_489)) + 64, 850 + (this.field_ak_493 * 207871907), -30, -50, -30);
				field_y_466.method_z_void(onscreenmodel_17_, id * 384781917);
			}
			Model onscreenmodel_22_;
			if ((class_an != null) && (class_an_13_ != null)) {
				onscreenmodel_22_ = class_an.method_m_cg(onscreenmodel_17_, i, class_an_13_, i_14_, (byte) -18);
			} else if (class_an != null) {
				onscreenmodel_22_ = class_an.method_e_cg(onscreenmodel_17_, i, 924828625);
			} else if (class_an_13_ != null) {
				onscreenmodel_22_ = class_an_13_.method_e_cg(onscreenmodel_17_, i_14_, 1360955369);
			} else {
				onscreenmodel_22_ = onscreenmodel_17_.method_z_cg(true);
			}
			if (((556878953 * this.field_t_486) != 128) || ((this.field_w_487 * 176428037) != 128)) {
				onscreenmodel_22_.method_v_void(556878953 * this.field_t_486, 176428037 * this.field_w_487, 556878953 * this.field_t_486);
			}
			onscreenmodel = onscreenmodel_22_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "az.e()");
		}
		return onscreenmodel;
	}

	public final OffScreenModel method_g_cy(final short i) {
		OffScreenModel rsmodel;
		try {
			if (childrenIds != null) {
				final NpcComposite npcdef_23_ = method_f_az(-195155380);
				return (npcdef_23_ == null ? null : npcdef_23_.method_g_cy((short) 10719));
			}
			if (this.field_a_491 == null) {
				return null;
			}
			boolean bool = false;
			for (int i_24_ = 0; i_24_ < this.field_a_491.length; i_24_++) {
				if (!field_d_464.method_e_boolean((this.field_a_491[i_24_]), 0, 955915002)) {
					bool = true;
				}
			}
			if (bool) {
				return null;
			}
			final OffScreenModel[] rsmodels = new OffScreenModel[this.field_a_491.length];
			for (int i_25_ = 0; i_25_ < this.field_a_491.length; i_25_++) {
				rsmodels[i_25_] = OffScreenModel.getModel(field_d_464, this.field_a_491[i_25_], 0);
			}
			OffScreenModel rsmodel_26_;
			if (rsmodels.length == 1) {
				rsmodel_26_ = rsmodels[0];
			} else {
				rsmodel_26_ = new OffScreenModel(rsmodels, rsmodels.length);
			}
			if (this.field_j_502 != null) {
				for (int i_27_ = 0; i_27_ < this.field_j_502.length; i_27_++) {
					rsmodel_26_.recolor((this.field_j_502[i_27_]), (this.field_s_480[i_27_]));
				}
			}
			if (this.field_v_481 != null) {
				for (int i_28_ = 0; i_28_ < this.field_v_481.length; i_28_++) {
					rsmodel_26_.retexture((this.field_v_481[i_28_]), (this.field_c_482[i_28_]));
				}
			}
			rsmodel = rsmodel_26_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "az.g()");
		}
		return rsmodel;
	}

	public final NpcComposite method_f_az(final int i) {
		NpcComposite npcdef_29_;
		try {
			int i_30_ = -1;
			if ((44259487 * this.field_ar_473) != -1) {
				i_30_ = Class_s.method_n_int((this.field_ar_473 * 44259487), (byte) -127);
			} else if ((this.field_as_478 * -1199236695) != -1) {
				i_30_ = (Class_fv.configs[this.field_as_478 * -1199236695]);
			}
			npcdef_29_ = (((i_30_ >= 0) && (i_30_ < childrenIds.length) && (childrenIds[i_30_] != -1)) ? NpcDefinitions.getNpcComposite(childrenIds[i_30_]) : null);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "az.f()");
		}
		return npcdef_29_;
	}

	public static void method_n_void(final FileStore class_fs, final int i) {
		try {
			FloorOverlay.field_n_4 = class_fs;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "az.n()");
		}
	}

	public boolean method_m_boolean(final byte i) {
		boolean bool;
		try {
			if (childrenIds == null) {
				return true;
			}
			int i_31_ = -1;
			if ((this.field_ar_473 * 44259487) != -1) {
				i_31_ = Class_s.method_n_int((44259487 * this.field_ar_473), (byte) -113);
			} else if ((this.field_as_478 * -1199236695) != -1) {
				i_31_ = (Class_fv.configs[-1199236695 * this.field_as_478]);
			}
			if ((i_31_ >= 0) && (i_31_ < childrenIds.length) && (childrenIds[i_31_] != -1)) {
				return true;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "az.m()");
		}
		return bool;
	}

	NpcComposite() {
		/* empty */
	}

	static final void method_ci_void(final boolean bool, final int i) {
		try {
			final int i_32_ = client.rootInterfaceId * -374264803;
			final int i_33_ = Boundary.clientWidth * -1236640339;
			final int i_34_ = -1483492575 * Projectile.clientHeight;
			if (Class_fz.loadWidget(i_32_, 1176513528)) {
				ClientScript.method_cr_void(Widget.widgets[i_32_], -1, i_33_, i_34_, bool, (byte) -85);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "az.ci()");
		}
	}

	static final void updateLocalPlayers(final int i) {
		try {
			final int playerSize = client.inbound.getBits(8);
			if (playerSize < (client.localPlayerCount * 2000365659)) {
				for (int i_36_ = playerSize; i_36_ < (client.localPlayerCount * 2000365659); i_36_++) {
					client.localPlayerIndices[((client.localEntityAmount += 1307805913) * -696223895) - 1] = client.playerIndexArray[i_36_];
				}
			}
			if (playerSize > (2000365659 * client.localPlayerCount)) {
				throw new RuntimeException("");
			}
			client.localPlayerCount = 0;
			for (int i_37_ = 0; i_37_ < playerSize; i_37_++) {
				final int i_38_ = client.playerIndexArray[i_37_];
				final Player player = client.localPlayers[i_38_];
				final int i_39_ = client.inbound.getBits(1);
				if (i_39_ == 0) {
					client.playerIndexArray[((client.localPlayerCount += -674379821) * 2000365659) - 1] = i_38_;
					player.cycle = 260564055 * client.currentCycle;
				} else {
					final int i_40_ = client.inbound.getBits(2);
					if (i_40_ == 0) {
						client.playerIndexArray[((client.localPlayerCount += -674379821) * 2000365659) - 1] = i_38_;
						player.cycle = client.currentCycle * 260564055;
						client.playersNeedUpdating[((client.field_gr_2808 += 990413737) * 2070991001) - 1] = i_38_;
					} else if (i_40_ == 1) {
						client.playerIndexArray[((client.localPlayerCount += -674379821) * 2000365659) - 1] = i_38_;
						player.cycle = client.currentCycle * 260564055;
						final int i_41_ = client.inbound.getBits(3);
						player.moveInDirection(i_41_, false);
						final int i_42_ = client.inbound.getBits(1);
						if (i_42_ == 1) {
							client.playersNeedUpdating[(((client.field_gr_2808 += 990413737) * 2070991001) - 1)] = i_38_;
						}
					} else if (i_40_ == 2) {
						client.playerIndexArray[((client.localPlayerCount += -674379821) * 2000365659) - 1] = i_38_;
						player.cycle = client.currentCycle * 260564055;
						final int i_43_ = client.inbound.getBits(3);
						player.moveInDirection(i_43_, true);
						final int i_44_ = client.inbound.getBits(3);
						player.moveInDirection(i_44_, true);
						final int i_45_ = client.inbound.getBits(1);
						if (i_45_ == 1) {
							client.playersNeedUpdating[(((client.field_gr_2808 += 990413737) * 2070991001) - 1)] = i_38_;
						}
					} else if (i_40_ == 3) {
						client.localPlayerIndices[((client.localEntityAmount += 1307805913) * -696223895) - 1] = i_38_;
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "az.bv()");
		}
	}
}
