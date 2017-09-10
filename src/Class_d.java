/* Class_d - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_d {
	static String field_n_854 = "true";
	static String field_e_855 = ")";
	static String field_z_856 = "|";
	static String field_y_857 = " (";
	static String field_g_858 = "->";
	static String field_d_859 = ",";
	static String field_f_860 = "<br>";
	static String field_m_861 = "</col>";
	static Rasterizer2D[] headicons_prayer;
	static int cameraZ;

	public static int method_h_int(final String string, final int i) {
		int i_0_;
		try {
			i_0_ = string.length() + 2;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "d.h()");
		}
		return i_0_;
	}

	Class_d() throws Throwable {
		throw new Error();
	}

	static final void method_m_void(final int i, final int i_1_, final int i_2_, final int i_3_, final int i_4_, final int i_5_, final SceneGraph scenegraph, final CollisionMap collisionmap, final int i_6_) {
		try {
			if (client.field_u_2784 && ((Region.sceneFlags[0][i_1_][i_2_] & 0x2) == 0)) {
				if ((Region.sceneFlags[i][i_1_][i_2_] & 0x10) != 0) {
					return;
				}
				int i_7_;
				if ((Region.sceneFlags[i][i_1_][i_2_] & 0x8) != 0) {
					i_7_ = 0;
				} else if ((i > 0) && ((Region.sceneFlags[1][i_1_][i_2_] & 0x2) != 0)) {
					i_7_ = i - 1;
				} else {
					i_7_ = i;
				}
				if (i_7_ != (544143533 * client.field_cs_2739)) {
					return;
				}
			}
			if (i < (-470415013 * Region.field_z_993)) {
				Region.field_z_993 = i * 1110114003;
			}
			final ObjectComposite objectdef = Class_cj.getObjectComposite(i_3_);
			int i_8_;
			int i_9_;
			if ((i_4_ != 1) && (i_4_ != 3)) {
				i_8_ = objectdef.width * 211338481;
				i_9_ = objectdef.length * 1201809627;
			} else {
				i_8_ = 1201809627 * objectdef.length;
				i_9_ = objectdef.width * 211338481;
			}
			int i_10_;
			int i_11_;
			if ((i_1_ + i_8_) <= 104) {
				i_10_ = i_1_ + (i_8_ >> 1);
				i_11_ = i_1_ + ((1 + i_8_) >> 1);
			} else {
				i_10_ = i_1_;
				i_11_ = 1 + i_1_;
			}
			int i_12_;
			int i_13_;
			if ((i_9_ + i_2_) <= 104) {
				i_12_ = i_2_ + (i_9_ >> 1);
				i_13_ = ((1 + i_9_) >> 1) + i_2_;
			} else {
				i_12_ = i_2_;
				i_13_ = i_2_ + 1;
			}
			final int[][] is = Region.heightMaps[i];
			final int i_14_ = ((is[i_11_][i_13_] + is[i_11_][i_12_] + is[i_10_][i_12_] + is[i_10_][i_13_]) >> 2);
			final int i_15_ = (i_1_ << 7) + (i_8_ << 6);
			final int i_16_ = (i_9_ << 6) + (i_2_ << 7);
			int i_17_ = 1073741824 + (i_2_ << 7) + i_1_ + (i_3_ << 14);
			if ((154452619 * objectdef.field_p_314) == 0) {
				i_17_ -= -2147483648;
			}
			int i_18_ = (i_4_ << 6) + i_5_;
			if ((700665437 * objectdef.field_ai_354) == 1) {
				i_18_ += 256;
			}
			if (objectdef.method_q_boolean((byte) -31)) {
				Class_ab.method_z_void(i, i_1_, i_2_, objectdef, i_4_, -1674729496);
			}
			if (i_5_ == 22) {
				if (!client.field_u_2784 || ((objectdef.field_p_314 * 154452619) != 0) || ((objectdef.field_v_328 * -812798571) == 1) || objectdef.field_an_352) {
					Renderable renderable;
					if (((objectdef.field_w_337 * -353798667) == -1) && (objectdef.childrenIds == null)) {
						renderable = objectdef.method_m_cb(22, i_4_, is, i_15_, i_14_, i_16_, (byte) 32);
					} else {
						renderable = new GameObject(i_3_, 22, i_4_, i, i_1_, i_2_, (objectdef.field_w_337 * -353798667), true, null);
					}
					scenegraph.method_f_void(i, i_1_, i_2_, i_14_, renderable, i_17_, i_18_);
					if (((-812798571 * objectdef.field_v_328) == 1) && (collisionmap != null)) {
						collisionmap.method_e_void(i_1_, i_2_, -2116538881);
					}
				}
			} else if ((i_5_ != 10) && (i_5_ != 11)) {
				if (i_5_ >= 12) {
					Renderable renderable;
					if (((objectdef.field_w_337 * -353798667) == -1) && (objectdef.childrenIds == null)) {
						renderable = objectdef.method_m_cb(i_5_, i_4_, is, i_15_, i_14_, i_16_, (byte) 32);
					} else {
						renderable = new GameObject(i_3_, i_5_, i_4_, i, i_1_, i_2_, (objectdef.field_w_337 * -353798667), true, null);
					}
					scenegraph.method_l_boolean(i, i_1_, i_2_, i_14_, 1, 1, renderable, 0, i_17_, i_18_);
					if ((i_5_ >= 12) && (i_5_ <= 17) && (i_5_ != 13) && (i > 0)) {
						Friend.field_x_1092[i][i_1_][i_2_] |= 0x924;
					}
					if (((-812798571 * objectdef.field_v_328) != 0) && (collisionmap != null)) {
						collisionmap.method_z_void(i_1_, i_2_, i_8_, i_9_, objectdef.field_c_341, 1513010085);
					}
				} else if (i_5_ == 0) {
					Renderable renderable;
					if (((objectdef.field_w_337 * -353798667) == -1) && (objectdef.childrenIds == null)) {
						renderable = objectdef.method_m_cb(0, i_4_, is, i_15_, i_14_, i_16_, (byte) 32);
					} else {
						renderable = new GameObject(i_3_, 0, i_4_, i, i_1_, i_2_, (objectdef.field_w_337 * -353798667), true, null);
					}
					scenegraph.method_a_void(i, i_1_, i_2_, i_14_, renderable, null, Region.field_v_997[i_4_], 0, i_17_, i_18_);
					if (i_4_ == 0) {
						if (objectdef.field_as_334) {
							Region.field_m_1007[i][i_1_][i_2_] = (byte) 50;
							Region.field_m_1007[i][i_1_][i_2_ + 1] = (byte) 50;
						}
						if (objectdef.field_t_336) {
							Friend.field_x_1092[i][i_1_][i_2_] |= 0x249;
						}
					} else if (i_4_ == 1) {
						if (objectdef.field_as_334) {
							Region.field_m_1007[i][i_1_][1 + i_2_] = (byte) 50;
							Region.field_m_1007[i][1 + i_1_][1 + i_2_] = (byte) 50;
						}
						if (objectdef.field_t_336) {
							Friend.field_x_1092[i][i_1_][i_2_ + 1] |= 0x492;
						}
					} else if (i_4_ == 2) {
						if (objectdef.field_as_334) {
							Region.field_m_1007[i][i_1_ + 1][i_2_] = (byte) 50;
							Region.field_m_1007[i][1 + i_1_][i_2_ + 1] = (byte) 50;
						}
						if (objectdef.field_t_336) {
							Friend.field_x_1092[i][i_1_ + 1][i_2_] |= 0x249;
						}
					} else if (i_4_ == 3) {
						if (objectdef.field_as_334) {
							Region.field_m_1007[i][i_1_][i_2_] = (byte) 50;
							Region.field_m_1007[i][i_1_ + 1][i_2_] = (byte) 50;
						}
						if (objectdef.field_t_336) {
							Friend.field_x_1092[i][i_1_][i_2_] |= 0x492;
						}
					}
					if (((objectdef.field_v_328 * -812798571) != 0) && (collisionmap != null)) {
						collisionmap.setCollisionFlags(i_1_, i_2_, i_5_, i_4_, objectdef.field_c_341, (byte) -27);
					}
					if ((objectdef.field_i_339 * -990255167) != 16) {
						scenegraph.method_j_void(i, i_1_, i_2_, (objectdef.field_i_339 * -990255167));
					}
				} else if (i_5_ == 1) {
					Renderable renderable;
					if (((-353798667 * objectdef.field_w_337) == -1) && (objectdef.childrenIds == null)) {
						renderable = objectdef.method_m_cb(1, i_4_, is, i_15_, i_14_, i_16_, (byte) 32);
					} else {
						renderable = new GameObject(i_3_, 1, i_4_, i, i_1_, i_2_, (-353798667 * objectdef.field_w_337), true, null);
					}
					scenegraph.method_a_void(i, i_1_, i_2_, i_14_, renderable, null, Region.field_c_998[i_4_], 0, i_17_, i_18_);
					if (objectdef.field_as_334) {
						if (i_4_ == 0) {
							Region.field_m_1007[i][i_1_][i_2_ + 1] = (byte) 50;
						} else if (i_4_ == 1) {
							Region.field_m_1007[i][1 + i_1_][1 + i_2_] = (byte) 50;
						} else if (i_4_ == 2) {
							Region.field_m_1007[i][1 + i_1_][i_2_] = (byte) 50;
						} else if (i_4_ == 3) {
							Region.field_m_1007[i][i_1_][i_2_] = (byte) 50;
						}
					}
					if (((objectdef.field_v_328 * -812798571) != 0) && (collisionmap != null)) {
						collisionmap.setCollisionFlags(i_1_, i_2_, i_5_, i_4_, objectdef.field_c_341, (byte) -10);
					}
				} else if (i_5_ == 2) {
					final int i_19_ = (i_4_ + 1) & 0x3;
					Renderable renderable;
					Renderable renderable_20_;
					if (((-353798667 * objectdef.field_w_337) == -1) && (objectdef.childrenIds == null)) {
						renderable = objectdef.method_m_cb(2, i_4_ + 4, is, i_15_, i_14_, i_16_, (byte) 32);
						renderable_20_ = objectdef.method_m_cb(2, i_19_, is, i_15_, i_14_, i_16_, (byte) 32);
					} else {
						renderable = new GameObject(i_3_, 2, i_4_ + 4, i, i_1_, i_2_, (objectdef.field_w_337 * -353798667), true, null);
						renderable_20_ = new GameObject(i_3_, 2, i_19_, i, i_1_, i_2_, (-353798667 * objectdef.field_w_337), true, null);
					}
					scenegraph.method_a_void(i, i_1_, i_2_, i_14_, renderable, renderable_20_, Region.field_v_997[i_4_], Region.field_v_997[i_19_], i_17_, i_18_);
					if (objectdef.field_t_336) {
						if (i_4_ == 0) {
							Friend.field_x_1092[i][i_1_][i_2_] |= 0x249;
							Friend.field_x_1092[i][i_1_][i_2_ + 1] |= 0x492;
						} else if (i_4_ == 1) {
							Friend.field_x_1092[i][i_1_][1 + i_2_] |= 0x492;
							Friend.field_x_1092[i][1 + i_1_][i_2_] |= 0x249;
						} else if (i_4_ == 2) {
							Friend.field_x_1092[i][1 + i_1_][i_2_] |= 0x249;
							Friend.field_x_1092[i][i_1_][i_2_] |= 0x492;
						} else if (i_4_ == 3) {
							Friend.field_x_1092[i][i_1_][i_2_] |= 0x492;
							Friend.field_x_1092[i][i_1_][i_2_] |= 0x249;
						}
					}
					if (((objectdef.field_v_328 * -812798571) != 0) && (collisionmap != null)) {
						collisionmap.setCollisionFlags(i_1_, i_2_, i_5_, i_4_, objectdef.field_c_341, (byte) -42);
					}
					if ((objectdef.field_i_339 * -990255167) != 16) {
						scenegraph.method_j_void(i, i_1_, i_2_, (-990255167 * objectdef.field_i_339));
					}
				} else if (i_5_ == 3) {
					Renderable renderable;
					if (((objectdef.field_w_337 * -353798667) == -1) && (objectdef.childrenIds == null)) {
						renderable = objectdef.method_m_cb(3, i_4_, is, i_15_, i_14_, i_16_, (byte) 32);
					} else {
						renderable = new GameObject(i_3_, 3, i_4_, i, i_1_, i_2_, (objectdef.field_w_337 * -353798667), true, null);
					}
					scenegraph.method_a_void(i, i_1_, i_2_, i_14_, renderable, null, Region.field_c_998[i_4_], 0, i_17_, i_18_);
					if (objectdef.field_as_334) {
						if (i_4_ == 0) {
							Region.field_m_1007[i][i_1_][i_2_ + 1] = (byte) 50;
						} else if (i_4_ == 1) {
							Region.field_m_1007[i][i_1_ + 1][1 + i_2_] = (byte) 50;
						} else if (i_4_ == 2) {
							Region.field_m_1007[i][i_1_ + 1][i_2_] = (byte) 50;
						} else if (i_4_ == 3) {
							Region.field_m_1007[i][i_1_][i_2_] = (byte) 50;
						}
					}
					if (((objectdef.field_v_328 * -812798571) != 0) && (collisionmap != null)) {
						collisionmap.setCollisionFlags(i_1_, i_2_, i_5_, i_4_, objectdef.field_c_341, (byte) -54);
					}
				} else if (i_5_ == 9) {
					Renderable renderable;
					if (((-353798667 * objectdef.field_w_337) == -1) && (objectdef.childrenIds == null)) {
						renderable = objectdef.method_m_cb(i_5_, i_4_, is, i_15_, i_14_, i_16_, (byte) 32);
					} else {
						renderable = new GameObject(i_3_, i_5_, i_4_, i, i_1_, i_2_, (objectdef.field_w_337 * -353798667), true, null);
					}
					scenegraph.method_l_boolean(i, i_1_, i_2_, i_14_, 1, 1, renderable, 0, i_17_, i_18_);
					if (((-812798571 * objectdef.field_v_328) != 0) && (collisionmap != null)) {
						collisionmap.method_z_void(i_1_, i_2_, i_8_, i_9_, objectdef.field_c_341, 172305954);
					}
					if ((-990255167 * objectdef.field_i_339) != 16) {
						scenegraph.method_j_void(i, i_1_, i_2_, (-990255167 * objectdef.field_i_339));
					}
				} else if (i_5_ == 4) {
					Renderable renderable;
					if (((objectdef.field_w_337 * -353798667) == -1) && (objectdef.childrenIds == null)) {
						renderable = objectdef.method_m_cb(4, i_4_, is, i_15_, i_14_, i_16_, (byte) 32);
					} else {
						renderable = new GameObject(i_3_, 4, i_4_, i, i_1_, i_2_, (-353798667 * objectdef.field_w_337), true, null);
					}
					scenegraph.method_h_void(i, i_1_, i_2_, i_14_, renderable, null, Region.field_v_997[i_4_], 0, 0, 0, i_17_, i_18_);
				} else if (i_5_ == 5) {
					int i_21_ = 16;
					final int i_22_ = scenegraph.method_ad_int(i, i_1_, i_2_);
					if (i_22_ != 0) {
						i_21_ = (Class_cj.getObjectComposite((i_22_ >> 14) & 0x7fff).field_i_339 * -990255167);
					}
					Renderable renderable;
					if (((objectdef.field_w_337 * -353798667) == -1) && (objectdef.childrenIds == null)) {
						renderable = objectdef.method_m_cb(4, i_4_, is, i_15_, i_14_, i_16_, (byte) 32);
					} else {
						renderable = new GameObject(i_3_, 4, i_4_, i, i_1_, i_2_, (objectdef.field_w_337 * -353798667), true, null);
					}
					scenegraph.method_h_void(i, i_1_, i_2_, i_14_, renderable, null, Region.field_v_997[i_4_], 0, i_21_ * Region.field_p_999[i_4_], i_21_ * Region.field_o_996[i_4_], i_17_, i_18_);
				} else if (i_5_ == 6) {
					int i_23_ = 8;
					final int i_24_ = scenegraph.method_ad_int(i, i_1_, i_2_);
					if (i_24_ != 0) {
						i_23_ = ((Class_cj.getObjectComposite((i_24_ >> 14) & 0x7fff).field_i_339 * -990255167) / 2);
					}
					Renderable renderable;
					if (((-353798667 * objectdef.field_w_337) == -1) && (objectdef.childrenIds == null)) {
						renderable = objectdef.method_m_cb(4, i_4_ + 4, is, i_15_, i_14_, i_16_, (byte) 32);
					} else {
						renderable = new GameObject(i_3_, 4, i_4_ + 4, i, i_1_, i_2_, (objectdef.field_w_337 * -353798667), true, null);
					}
					scenegraph.method_h_void(i, i_1_, i_2_, i_14_, renderable, null, 256, i_4_, i_23_ * Region.field_b_1001[i_4_], Region.field_t_1002[i_4_] * i_23_, i_17_, i_18_);
				} else if (i_5_ == 7) {
					final int i_25_ = (i_4_ + 2) & 0x3;
					Renderable renderable;
					if (((objectdef.field_w_337 * -353798667) == -1) && (objectdef.childrenIds == null)) {
						renderable = objectdef.method_m_cb(4, i_25_ + 4, is, i_15_, i_14_, i_16_, (byte) 32);
					} else {
						renderable = new GameObject(i_3_, 4, i_25_ + 4, i, i_1_, i_2_, (-353798667 * objectdef.field_w_337), true, null);
					}
					scenegraph.method_h_void(i, i_1_, i_2_, i_14_, renderable, null, 256, i_25_, 0, 0, i_17_, i_18_);
				} else if (i_5_ == 8) {
					int i_26_ = 8;
					final int i_27_ = scenegraph.method_ad_int(i, i_1_, i_2_);
					if (i_27_ != 0) {
						i_26_ = ((Class_cj.getObjectComposite((i_27_ >> 14) & 0x7fff).field_i_339 * -990255167) / 2);
					}
					final int i_28_ = (2 + i_4_) & 0x3;
					Renderable renderable;
					Renderable renderable_29_;
					if (((objectdef.field_w_337 * -353798667) == -1) && (objectdef.childrenIds == null)) {
						renderable = objectdef.method_m_cb(4, 4 + i_4_, is, i_15_, i_14_, i_16_, (byte) 32);
						renderable_29_ = objectdef.method_m_cb(4, 4 + i_28_, is, i_15_, i_14_, i_16_, (byte) 32);
					} else {
						renderable = new GameObject(i_3_, 4, 4 + i_4_, i, i_1_, i_2_, (objectdef.field_w_337 * -353798667), true, null);
						renderable_29_ = new GameObject(i_3_, 4, 4 + i_28_, i, i_1_, i_2_, (-353798667 * objectdef.field_w_337), true, null);
					}
					scenegraph.method_h_void(i, i_1_, i_2_, i_14_, renderable, renderable_29_, 256, i_4_, Region.field_b_1001[i_4_] * i_26_, Region.field_t_1002[i_4_] * i_26_, i_17_, i_18_);
				}
			} else {
				Renderable renderable;
				if (((-353798667 * objectdef.field_w_337) == -1) && (objectdef.childrenIds == null)) {
					renderable = objectdef.method_m_cb(10, i_4_, is, i_15_, i_14_, i_16_, (byte) 32);
				} else {
					renderable = new GameObject(i_3_, 10, i_4_, i, i_1_, i_2_, (-353798667 * objectdef.field_w_337), true, null);
				}
				if ((renderable != null) && scenegraph.method_l_boolean(i, i_1_, i_2_, i_14_, i_8_, i_9_, renderable, i_5_ == 11 ? 256 : 0, i_17_, i_18_) && objectdef.field_as_334) {
					int i_30_ = 15;
					if (renderable instanceof Model) {
						i_30_ = ((Model) renderable).method_h_int() / 4;
						if (i_30_ > 30) {
							i_30_ = 30;
						}
					}
					for (int i_31_ = 0; i_31_ <= i_8_; i_31_++) {
						for (int i_32_ = 0; i_32_ <= i_9_; i_32_++) {
							if (i_30_ > (Region.field_m_1007[i][i_1_ + i_31_][i_2_ + i_32_])) {
								Region.field_m_1007[i][i_1_ + i_31_][(i_32_ + i_2_)] = (byte) i_30_;
							}
						}
					}
				}
				if (((-812798571 * objectdef.field_v_328) != 0) && (collisionmap != null)) {
					collisionmap.method_z_void(i_1_, i_2_, i_8_, i_9_, objectdef.field_c_341, -360946087);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "d.m()");
		}
	}

	public static boolean method_e_boolean(final int i, final int i_33_) {
		boolean bool;
		try {
			if (((i >> 28) & 0x1) != 0) {
				return true;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "d.e()");
		}
		return bool;
	}

	static final void handleNpcUpdateFlags(final int i) {
		try {
			for (int i_34_ = 0; i_34_ < (client.field_gr_2808 * 2070991001); i_34_++) {
				final int i_35_ = client.playersNeedUpdating[i_34_];
				final Npc npc = client.npcs[i_35_];
				final int i_36_ = client.inbound.get();
				if ((i_36_ & 0x10) != 0) {// hitsplat 1
					final int i_37_ = client.inbound.getByteC();
					final int i_38_ = client.inbound.get();
					npc.method_q_void(i_37_, i_38_, 303796053 * client.currentCycle, -1681582333);
					npc.hpBarExpire = (client.currentCycle * -1709484279) + 1958775900;
					npc.currentHp = (client.inbound.getLEShort() * -1867660669);
					npc.maxHp = (client.inbound.getShort() * -1364704921);
				}
				if ((i_36_ & 0x2) != 0) {// graphics
					npc.gfxId = (client.inbound.getShort() * 166388535);
					final int i_39_ = client.inbound.getLEInt();
					npc.field_bu_255 = (i_39_ >> 16) * 1077750705;
					npc.field_bn_254 = (((client.currentCycle * 303796053) + (i_39_ & 0xffff)) * -313561965);
					npc.field_br_239 = 0;
					npc.field_bd_264 = 0;
					if ((npc.field_bn_254 * 640586139) > (303796053 * client.currentCycle)) {
						npc.field_br_239 = 689549715;
					}
					if (65535 == (npc.gfxId * 1625440903)) {
						npc.gfxId = -166388535;
					}
				}
				if ((i_36_ & 0x80) != 0) {// morph npc
					npc.composite = NpcDefinitions.getNpcComposite(client.inbound.getLEShort());
					npc.size = 831705667 * npc.composite.occupiedTiles;
					npc.field_bx_249 = npc.composite.field_ax_492 * 988160639;
					npc.field_ae_223 = npc.composite.field_q_475 * 54155165;
					npc.turnAnimation = -296529403 * npc.composite.turnAnimation;
					npc.walkAnimation = -268205719 * npc.composite.walkAnimation;
					npc.turn180 = npc.composite.turn180 * -1109178395;
					npc.standAnimation = npc.composite.standAnimation * -424451523;
					npc.standTurnAnimation = npc.composite.field_l_484 * 1385619595;
					npc.field_ak_222 = 1924762163 * npc.composite.field_u_474;
				}
				if ((i_36_ & 0x40) != 0) {// hitsplat 2
					final int i_40_ = client.inbound.getByteC();
					final int i_41_ = client.inbound.getByteA();
					npc.method_q_void(i_40_, i_41_, client.currentCycle * 303796053, -658333234);
					npc.hpBarExpire = (client.currentCycle * -1709484279) + 1958775900;
					npc.currentHp = (client.inbound.getLEShort() * -1867660669);
					npc.maxHp = (client.inbound.getLEShortA() * -1364704921);
				}
				if ((i_36_ & 0x20) != 0) {// animation
					int i_42_ = client.inbound.getLEShortA();
					if (i_42_ == 65535) {
						i_42_ = -1;
					}
					final int i_43_ = client.inbound.get();
					if ((i_42_ == (npc.animation * 1529361367)) && (i_42_ != -1)) {
						final int i_44_ = ((OnDemandNode.getAnimationSequence(i_42_).field_v_208) * 1865833167);
						if (i_44_ == 1) {
							npc.field_bo_247 = 0;
							npc.field_bw_248 = 0;
							npc.animationDelay = i_43_ * -1653847103;
							npc.field_bj_250 = 0;
						}
						if (i_44_ == 2) {
							npc.field_bj_250 = 0;
						}
					} else if ((i_42_ == -1) || ((1529361367 * npc.animation) == -1) || (((OnDemandNode.getAnimationSequence(i_42_).field_q_194) * -2041641799) >= ((OnDemandNode.getAnimationSequence(npc.animation * 1529361367).field_q_194) * -2041641799))) {
						npc.animation = -1176932377 * i_42_;
						npc.field_bo_247 = 0;
						npc.field_bw_248 = 0;
						npc.animationDelay = i_43_ * -1653847103;
						npc.field_bj_250 = 0;
						npc.queueYPos = 1690814653 * npc.queueXPos;
					}
				}
				if ((i_36_ & 0x4) != 0) {// face coordinate
					npc.focalX = (client.inbound.getShortA() * 1117690639);
					npc.focalY = (client.inbound.getLEShortA() * -1473616763);
				}
				if ((i_36_ & 0x8) != 0) {// interacting entity
					npc.interactingIndex = (client.inbound.getShortA() * 2044561997);
					if ((npc.interactingIndex * -313868667) == 65535) {
						npc.interactingIndex = -2044561997;
					}
				}
				if ((i_36_ & 0x1) != 0) {// force talk
					npc.speech = client.inbound.getString();
					npc.field_az_231 = -1262432292;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "d.bx()");
		}
	}

	static void method_d_void(final int i, final int i_45_, final int i_46_) {
		try {
			final int[] is = new int[4];
			final int[] is_47_ = new int[4];
			is[0] = i;
			is_47_[0] = i_45_;
			int i_48_ = 1;
			for (int i_49_ = 0; i_49_ < 4; i_49_++) {
				if (World.field_a_1394[i_49_] != i) {
					is[i_48_] = World.field_a_1394[i_49_];
					is_47_[i_48_] = World.field_m_1393[i_49_];
					i_48_++;
				}
			}
			World.field_a_1394 = is;
			World.field_m_1393 = is_47_;
			VarpBit.method_z_void(World.worlds, 0, World.worlds.length - 1, World.field_a_1394, World.field_m_1393);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "d.d()");
		}
	}

	static int method_g_int(final int i) {
		int i_51_;
		try {
			final GameMessage gamemessage = ((GameMessage) Class_l.gameMessagesTable.method_n_ga(i));
			i_51_ = (gamemessage == null ? -1 : (gamemessage.next == Class_l.field_z_1131.field_n_3036) ? -1 : -1471797213 * ((GameMessage) gamemessage.next).field_n_307);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "d.g()");
		}
		return i_51_;
	}

	public static void method_d_void(final int i) {
		try {
			if (KeyFocusListener.instance != null) {
				final KeyFocusListener class_dp = KeyFocusListener.instance;
				synchronized (class_dp) {
					KeyFocusListener.instance = null;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "d.d()");
		}
	}

	static final int method_j_int(final int i, int i_52_, final int i_53_, final int i_54_) {
		int i_55_;
		try {
			if (i_53_ > 179) {
				i_52_ /= 2;
			}
			if (i_53_ > 192) {
				i_52_ /= 2;
			}
			if (i_53_ > 217) {
				i_52_ /= 2;
			}
			if (i_53_ > 243) {
				i_52_ /= 2;
			}
			final int i_56_ = (i_53_ / 2) + ((i_52_ / 32) << 7) + ((i / 4) << 10);
			i_55_ = i_56_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "d.j()");
		}
		return i_55_;
	}
}
