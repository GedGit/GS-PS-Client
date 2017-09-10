/* Class_aq - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class VarpBit extends CacheableNode {
	public int config;
	static final int field_s_279 = 18;
	public int leastSignificant;
	public int mostSignificant;
	public static NodeCache field_d_282 = new NodeCache(64);
	static final int field_ak_283 = 29;
	static final int field_am_284 = 55;
	public static final int field_ar_285 = 83;
	public static final int field_an_286 = 136;
	public static final int field_ei_287 = 150;
	public static final int field_n_288 = 83;
	static final int field_bm_289 = 1004;

	void method_z_void(final Buffer rsbytebuffer, final int i, final int i_0_) {
		try {
			if (i == 1) {
				config = rsbytebuffer.getShort() * -225363289;
				leastSignificant = rsbytebuffer.get() * -1847135533;
				mostSignificant = rsbytebuffer.get() * -400312717;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "aq.z()");
		}
	}

	static Class_db[] method_n_dbArray(final int i) {
		Class_db[] class_dbs;
		try {
			class_dbs = new Class_db[] { Class_db.field_z_1567, Class_db.field_d_1568, Class_db.field_n_1571 };
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "aq.n()");
		}
		return class_dbs;
	}

	static final int method_r_int(final int i, int i_1_, final byte i_2_) {
		int i_3_;
		try {
			if (i == -2) {
				return 12345678;
			}
			if (i == -1) {
				if (i_1_ < 2) {
					i_1_ = 2;
				} else if (i_1_ > 126) {
					i_1_ = 126;
				}
				return i_1_;
			}
			i_1_ = ((i & 0x7f) * i_1_) / 128;
			if (i_1_ < 2) {
				i_1_ = 2;
			} else if (i_1_ > 126) {
				i_1_ = 126;
			}
			i_3_ = i_1_ + (i & 0xff80);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "aq.r()");
		}
		return i_3_;
	}

	void method_d_void(final Buffer rsbytebuffer, final int i) {
		try {
			for (;;) {
				final int i_4_ = rsbytebuffer.get();
				if (i_4_ == 0) {
					break;
				}
				method_z_void(rsbytebuffer, i_4_, 421675319);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "aq.d()");
		}
	}

	static final void method_cs_void(final Widget widget, final int i, final int i_5_, final int i_6_, final int i_7_, final int i_8_, final int i_9_, final byte i_10_) {
		try {
			if (client.field_et_2767) {
				client.field_eg_2829 = -2042368544;
			} else {
				client.field_eg_2829 = 0;
			}
			client.field_et_2767 = false;
			if (((MouseInputListener.field_f_2155 * 2143958423) == 1) || (!Class_al.field_aw_178 && ((MouseInputListener.field_f_2155 * 2143958423) == 4))) {
				if ((i_8_ >= i) && (i_8_ < (i + 16)) && (i_9_ >= i_5_) && (i_9_ < (i_5_ + 16))) {
					widget.verticalScrollPos -= 958233628;
					Daemon.method_dn_void(widget, (byte) -23);
				} else if ((i_8_ >= i) && (i_8_ < (i + 16)) && (i_9_ >= ((i_6_ + i_5_) - 16)) && (i_9_ < (i_5_ + i_6_))) {
					widget.verticalScrollPos += 958233628;
					Daemon.method_dn_void(widget, (byte) -69);
				} else if ((i_8_ >= (i - (client.field_eg_2829 * -336715889))) && (i_8_ < ((client.field_eg_2829 * -336715889) + 16 + i)) && (i_9_ >= (16 + i_5_)) && (i_9_ < ((i_6_ + i_5_) - 16))) {
					int i_11_ = ((i_6_ - 32) * i_6_) / i_7_;
					if (i_11_ < 8) {
						i_11_ = 8;
					}
					final int i_12_ = i_9_ - i_5_ - 16 - (i_11_ / 2);
					final int i_13_ = i_6_ - 32 - i_11_;
					widget.verticalScrollPos = -1907925241 * ((i_12_ * (i_7_ - i_6_)) / i_13_);
					Daemon.method_dn_void(widget, (byte) -73);
					client.field_et_2767 = true;
				}
			}
			if ((-1665577433 * client.field_kg_2887) != 0) {
				final int i_14_ = widget.onScreenWidth * 1367496319;
				if ((i_8_ >= (i - i_14_)) && (i_9_ >= i_5_) && (i_8_ < (16 + i)) && (i_9_ <= (i_5_ + i_6_))) {
					widget.verticalScrollPos += client.field_kg_2887 * 651521789;
					Daemon.method_dn_void(widget, (byte) -17);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "aq.cs()");
		}
	}

	static void method_z_void(final World[] worldinfos, final int i, final int i_15_, final int[] is, final int[] is_16_) {
		try {
			if (i < i_15_) {
				int i_18_ = i - 1;
				int i_19_ = 1 + i_15_;
				final int i_20_ = (i_15_ + i) / 2;
				final World worldinfo = worldinfos[i_20_];
				worldinfos[i_20_] = worldinfos[i];
				worldinfos[i] = worldinfo;
				while (i_18_ < i_19_) {
					boolean bool = true;
					do {
						i_19_--;
						int i_21_ = 0;
						while_6_: do {
							int i_22_;
							int i_23_;
							for (;;) {
								if (i_21_ >= 4) {
									break while_6_;
								}
								if (is[i_21_] == 2) {
									i_22_ = (worldinfos[i_19_].field_j_1404) * 1235248021;
									i_23_ = 1235248021 * (worldinfo.field_j_1404);
								} else if (is[i_21_] == 1) {
									i_22_ = (worldinfos[i_19_].players) * -318332813;
									i_23_ = (worldinfo.players * -318332813);
									if ((i_22_ == -1) && (is_16_[i_21_] == 1)) {
										i_22_ = 2001;
									}
									if ((i_23_ == -1) && (is_16_[i_21_] == 1)) {
										i_23_ = 2001;
									}
								} else if (is[i_21_] == 3) {
									i_22_ = worldinfos[i_19_].isMembers() ? 1 : 0;
									i_23_ = (worldinfo.isMembers() ? 1 : 0);
								} else {
									i_22_ = (worldinfos[i_19_].id) * -1909124507;
									i_23_ = -1909124507 * worldinfo.id;
								}
								if (i_23_ != i_22_) {
									break;
								}
								if (i_21_ == 3) {
									bool = false;
								}
								i_21_++;
							}
							if (((is_16_[i_21_] != 1) || (i_22_ <= i_23_)) && ((is_16_[i_21_] != 0) || (i_22_ >= i_23_))) {
								bool = false;
							}
						} while (false);
					} while (bool);
					bool = true;
					do {
						i_18_++;
						int i_24_ = 0;
						while_7_: do {
							int i_25_;
							int i_26_;
							for (;;) {
								if (i_24_ >= 4) {
									break while_7_;
								}
								if (is[i_24_] == 2) {
									i_25_ = (worldinfos[i_18_].field_j_1404) * 1235248021;
									i_26_ = (worldinfo.field_j_1404 * 1235248021);
								} else if (is[i_24_] == 1) {
									i_25_ = (-318332813 * (worldinfos[i_18_].players));
									i_26_ = (worldinfo.players * -318332813);
									if ((i_25_ == -1) && (is_16_[i_24_] == 1)) {
										i_25_ = 2001;
									}
									if ((i_26_ == -1) && (is_16_[i_24_] == 1)) {
										i_26_ = 2001;
									}
								} else if (is[i_24_] == 3) {
									i_25_ = worldinfos[i_18_].isMembers() ? 1 : 0;
									i_26_ = (worldinfo.isMembers() ? 1 : 0);
								} else {
									i_25_ = (-1909124507 * (worldinfos[i_18_].id));
									i_26_ = (worldinfo.id * -1909124507);
								}
								if (i_25_ != i_26_) {
									break;
								}
								if (i_24_ == 3) {
									bool = false;
								}
								i_24_++;
							}
							if (((is_16_[i_24_] != 1) || (i_25_ >= i_26_)) && ((is_16_[i_24_] != 0) || (i_25_ <= i_26_))) {
								bool = false;
							}
						} while (false);
					} while (bool);
					if (i_18_ < i_19_) {
						final World worldinfo_27_ = worldinfos[i_18_];
						worldinfos[i_18_] = worldinfos[i_19_];
						worldinfos[i_19_] = worldinfo_27_;
					}
				}
				method_z_void(worldinfos, i, i_19_, is, is_16_);
				method_z_void(worldinfos, i_19_ + 1, i_15_, is, is_16_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "aq.z()");
		}
	}

	VarpBit() {
		/* empty */
	}

	static final void method_ad_void(final int i) {
		try {
			int i_28_ = 64 + (-819667840 * Boundary.field_nv_1523);
			int i_29_ = (Class_eb.field_ni_1778 * 670003840) + 64;
			int i_30_ = (Class_q.getTileHeight(i_28_, i_29_, 250114511 * Class_ed.plane) - (GameCanvas.field_nc_2233 * -1244812605));
			if ((Menu.cameraX * 548221253) < i_28_) {
				Menu.cameraX += (((-1351165661 * Class_bw.field_nd_677 * (i_28_ - (548221253 * Menu.cameraX))) / 1000) + (Varp.field_nz_66 * -1622947595)) * -1316111987;
				if ((Menu.cameraX * 548221253) > i_28_) {
					Menu.cameraX = -1316111987 * i_28_;
				}
			}
			if ((548221253 * Menu.cameraX) > i_28_) {
				Menu.cameraX -= (((Varp.field_nz_66 * -1622947595) + ((((548221253 * Menu.cameraX) - i_28_) * Class_bw.field_nd_677 * -1351165661) / 1000)) * -1316111987);
				if ((548221253 * Menu.cameraX) < i_28_) {
					Menu.cameraX = i_28_ * -1316111987;
				}
			}
			if ((Class_d.cameraZ * 424565779) < i_30_) {
				Class_d.cameraZ += 963104283 * ((-1622947595 * Varp.field_nz_66) + ((Class_bw.field_nd_677 * -1351165661 * (i_30_ - (424565779 * Class_d.cameraZ))) / 1000));
				if ((Class_d.cameraZ * 424565779) > i_30_) {
					Class_d.cameraZ = i_30_ * 963104283;
				}
			}
			if ((Class_d.cameraZ * 424565779) > i_30_) {
				Class_d.cameraZ -= (((Class_bw.field_nd_677 * -1351165661 * ((424565779 * Class_d.cameraZ) - i_30_)) / 1000) + (-1622947595 * Varp.field_nz_66)) * 963104283;
				if ((424565779 * Class_d.cameraZ) < i_30_) {
					Class_d.cameraZ = i_30_ * 963104283;
				}
			}
			if ((1900802031 * GameMessage.cameraY) < i_29_) {
				GameMessage.cameraY += (((-1351165661 * Class_bw.field_nd_677 * (i_29_ - (GameMessage.cameraY * 1900802031))) / 1000) + (-1622947595 * Varp.field_nz_66)) * -563011825;
				if ((GameMessage.cameraY * 1900802031) > i_29_) {
					GameMessage.cameraY = i_29_ * -563011825;
				}
			}
			if ((GameMessage.cameraY * 1900802031) > i_29_) {
				GameMessage.cameraY -= (-563011825 * ((-1622947595 * Varp.field_nz_66) + ((((GameMessage.cameraY * 1900802031) - i_29_) * -1351165661 * Class_bw.field_nd_677) / 1000)));
				if ((GameMessage.cameraY * 1900802031) < i_29_) {
					GameMessage.cameraY = i_29_ * -563011825;
				}
			}
			i_28_ = 64 + (Class_al.field_nw_187 * -676481920);
			i_29_ = (-1727579008 * Class_a.field_nl_785) + 64;
			i_30_ = (Class_q.getTileHeight(i_28_, i_29_, 250114511 * Class_ed.plane) - (Class_db.field_or_1573 * -1697420449));
			final int i_31_ = i_28_ - (Menu.cameraX * 548221253);
			final int i_32_ = i_30_ - (424565779 * Class_d.cameraZ);
			final int i_33_ = i_29_ - (GameMessage.cameraY * 1900802031);
			final int i_34_ = (int) Math.sqrt((i_31_ * i_31_) + (i_33_ * i_33_));
			int i_35_ = ((int) (Math.atan2(i_32_, i_34_) * 325.949) & 0x7ff);
			final int i_36_ = ((int) (Math.atan2(i_31_, i_33_) * -325.949) & 0x7ff);
			if (i_35_ < 128) {
				i_35_ = 128;
			}
			if (i_35_ > 383) {
				i_35_ = 383;
			}
			if ((World.cameraPitch * 633664789) < i_35_) {
				World.cameraPitch += (-1018842563 * ((Class_r.field_ox_1336 * 1295084677) + (((i_35_ - (World.cameraPitch * 633664789)) * IdentityKit.field_oa_100 * 1727544587) / 1000)));
				if ((World.cameraPitch * 633664789) > i_35_) {
					World.cameraPitch = -1018842563 * i_35_;
				}
			}
			if ((633664789 * World.cameraPitch) > i_35_) {
				World.cameraPitch -= -1018842563 * (((IdentityKit.field_oa_100 * 1727544587 * ((World.cameraPitch * 633664789) - i_35_)) / 1000) + (Class_r.field_ox_1336 * 1295084677));
				if ((World.cameraPitch * 633664789) < i_35_) {
					World.cameraPitch = i_35_ * -1018842563;
				}
			}
			int i_37_ = i_36_ - (FloorOverlay.cameraYaw * -467172345);
			if (i_37_ > 1024) {
				i_37_ -= 2048;
			}
			if (i_37_ < -1024) {
				i_37_ += 2048;
			}
			if (i_37_ > 0) {
				FloorOverlay.cameraYaw += (((IdentityKit.field_oa_100 * 1727544587 * i_37_) / 1000) + (Class_r.field_ox_1336 * 1295084677)) * 732473783;
				FloorOverlay.cameraYaw = ((FloorOverlay.cameraYaw * -467172345) & 0x7ff) * 732473783;
			}
			if (i_37_ < 0) {
				FloorOverlay.cameraYaw -= (((-i_37_ * 1727544587 * IdentityKit.field_oa_100) / 1000) + (1295084677 * Class_r.field_ox_1336)) * 732473783;
				FloorOverlay.cameraYaw = ((-467172345 * FloorOverlay.cameraYaw) & 0x7ff) * 732473783;
			}
			int i_38_ = i_36_ - (FloorOverlay.cameraYaw * -467172345);
			if (i_38_ > 1024) {
				i_38_ -= 2048;
			}
			if (i_38_ < -1024) {
				i_38_ += 2048;
			}
			if (((i_38_ < 0) && (i_37_ > 0)) || ((i_38_ > 0) && (i_37_ < 0))) {
				FloorOverlay.cameraYaw = 732473783 * i_36_;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "aq.ad()");
		}
	}
}
