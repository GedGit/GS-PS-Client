/* Class_l - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Graphics;
import java.util.HashMap;
import java.util.Map;

public class Class_l {
	static final IterableHashTable gameMessagesTable = new IterableHashTable(1024);
	static final Map<Integer, Class_i> field_n_1130 = new HashMap<Integer, Class_i>();
	static final IterableNode field_z_1131 = new IterableNode();
	static Class_ae field_ie_1132;
	static int gameMessageCounter = 0;
	public static int[] field_m_1134;
	public static final int field_ag_1135 = 57;
	static final int field_u_1136 = 5;

	public static SpotAnim getSpotAnimation(final int i) {
		SpotAnim spotanim;
		try {
			SpotAnim spotanim_1_ = (SpotAnim) SpotAnim.field_z_400.method_n_gb(i);
			if (spotanim_1_ != null) {
				return spotanim_1_;
			}
			final byte[] is = SpotAnim.field_n_396.getArchive(13, i);
			spotanim_1_ = new SpotAnim();
			spotanim_1_.gfxId = -901036735 * i;
			if (is != null) {
				spotanim_1_.method_d_void(new Buffer(is), 530128471);
			}
			SpotAnim.field_z_400.method_z_void(spotanim_1_, i);
			spotanim = spotanim_1_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "l.n()");
		}
		return spotanim;
	}

	Class_l() throws Throwable {
		throw new Error();
	}

	static final void method_bn_void(final int i, final int i_2_) {
		try {
			final int[] is = Class_a.field_mp_793.field_n_681;
			final int i_3_ = is.length;
			for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
				is[i_4_] = 0;
			}
			for (int i_5_ = 1; i_5_ < 103; i_5_++) {
				int i_6_ = 24628 + (2048 * (103 - i_5_));
				for (int i_7_ = 1; i_7_ < 103; i_7_++) {
					if ((Region.sceneFlags[i][i_7_][i_5_] & 0x18) == 0) {
						Class_ae.sceneGraph.method_ao_void(is, i_6_, 512, i, i_7_, i_5_);
					}
					if ((i < 3) && ((Region.sceneFlags[i + 1][i_7_][i_5_] & 0x8) != 0)) {
						Class_ae.sceneGraph.method_ao_void(is, i_6_, 512, 1 + i, i_7_, i_5_);
					}
					i_6_ += 4;
				}
			}
			final int i_8_ = ((((238 + (int) (Math.random() * 20.0)) - 10) << 16) + (((238 + (int) (Math.random() * 20.0)) - 10) << 8) + ((238 + (int) (Math.random() * 20.0)) - 10));
			final int i_9_ = ((238 + (int) (Math.random() * 20.0)) - 10) << 16;
			Class_a.field_mp_793.method_d_void();
			for (int i_10_ = 1; i_10_ < 103; i_10_++) {
				for (int i_11_ = 1; i_11_ < 103; i_11_++) {
					if ((Region.sceneFlags[i][i_11_][i_10_] & 0x18) == 0) {
						Class_db.method_bu_void(i, i_11_, i_10_, i_8_, i_9_, -887051476);
					}
					if ((i < 3) && ((Region.sceneFlags[i + 1][i_11_][i_10_] & 0x8) != 0)) {
						Class_db.method_bu_void(i + 1, i_11_, i_10_, i_8_, i_9_, -887051476);
					}
				}
			}
			client.field_mm_2717 = 0;
			for (int i_12_ = 0; i_12_ < 104; i_12_++) {
				for (int i_13_ = 0; i_13_ < 104; i_13_++) {
					int i_14_ = Class_ae.sceneGraph.method_ax_int((250114511 * Class_ed.plane), i_12_, i_13_);
					if (i_14_ != 0) {
						i_14_ = (i_14_ >> 14) & 0x7fff;
				final int i_15_ = ((Class_cj.getObjectComposite(i_14_).field_ax_342) * 638728973);
				if (i_15_ >= 0) {
					int i_16_ = i_12_;
					int i_17_ = i_13_;
					if ((i_15_ != 22) && (i_15_ != 29) && (i_15_ != 34) && (i_15_ != 36) && (i_15_ != 46) && (i_15_ != 47) && (i_15_ != 48)) {
						final int[][] is_18_ = (client.collisionMaps[Class_ed.plane * 250114511].flags);
						for (int i_19_ = 0; i_19_ < 10; i_19_++) {
							final int i_20_ = (int) (Math.random() * 4.0);
							if ((i_20_ == 0) && (i_16_ > 0) && (i_16_ > (i_12_ - 3)) && ((is_18_[i_16_ - 1][i_17_] & 0x1240108) == 0)) {
								i_16_--;
							}
							if ((i_20_ == 1) && (i_16_ < 103) && (i_16_ < (3 + i_12_)) && ((is_18_[1 + i_16_][i_17_] & 0x1240180) == 0)) {
								i_16_++;
							}
							if ((i_20_ == 2) && (i_17_ > 0) && (i_17_ > (i_13_ - 3)) && ((is_18_[i_16_][i_17_ - 1] & 0x1240102) == 0)) {
								i_17_--;
							}
							if ((i_20_ == 3) && (i_17_ < 103) && (i_17_ < (i_13_ + 3)) && ((is_18_[i_16_][i_17_ + 1] & 0x1240120) == 0)) {
								i_17_++;
							}
						}
					}
					client.field_mi_2922[(916003575 * client.field_mm_2717)] = Class_ed.mapfunction[i_15_];
					client.field_mu_2920[(client.field_mm_2717 * 916003575)] = i_16_;
					client.field_mr_2921[(916003575 * client.field_mm_2717)] = i_17_;
					client.field_mm_2717 += -1683503417;
				}
					}
				}
			}
			Class_s.field_qj_1361.init();
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "l.bn()");
		}
	}

	static final void method_by_void(final int i, final int i_21_, final int i_22_, final int i_23_, final int i_24_, final int i_25_, final int i_26_, final byte i_27_) {
		try {
			if ((i_22_ >= 1) && (i_23_ >= 1) && (i_22_ <= 102) && (i_23_ <= 102)) {
				if (!client.field_u_2784 || ((250114511 * Class_ed.plane) == i)) {
					int i_28_ = 0;
					if (i_21_ == 0) {
						i_28_ = Class_ae.sceneGraph.method_ad_int(i, i_22_, i_23_);
					}
					if (i_21_ == 1) {
						i_28_ = Class_ae.sceneGraph.method_ak_int(i, i_22_, i_23_);
					}
					if (i_21_ == 2) {
						i_28_ = Class_ae.sceneGraph.method_ae_int(i, i_22_, i_23_);
					}
					if (i_21_ == 3) {
						i_28_ = Class_ae.sceneGraph.method_ax_int(i, i_22_, i_23_);
					}
					if (i_28_ != 0) {
						final int i_31_ = Class_ae.sceneGraph.method_al_int(i, i_22_, i_23_, i_28_);
						final int i_32_ = (i_28_ >> 14) & 0x7fff;
			final int i_33_ = i_31_ & 0x1f;
			final int i_34_ = (i_31_ >> 6) & 0x3;
			if (i_21_ == 0) {
				Class_ae.sceneGraph.method_s_void(i, i_22_, i_23_);
				final ObjectComposite objectdef = Class_cj.getObjectComposite(i_32_);
				if ((-812798571 * objectdef.field_v_328) != 0) {
					client.collisionMaps[i].method_f_void(i_22_, i_23_, i_33_, i_34_, objectdef.field_c_341, -1028068353);
				}
			}
			if (i_21_ == 1) {
				Class_ae.sceneGraph.method_v_void(i, i_22_, i_23_);
			}
			if (i_21_ == 2) {
				Class_ae.sceneGraph.method_c_void(i, i_22_, i_23_);
				final ObjectComposite objectdef = Class_cj.getObjectComposite(i_32_);
				if (((i_22_ + (211338481 * objectdef.width)) > 103) || ((i_23_ + (objectdef.width * 211338481)) > 103) || ((i_22_ + (1201809627 * objectdef.length)) > 103) || (((1201809627 * objectdef.length) + i_23_) > 103)) {
					return;
				}
				if ((-812798571 * objectdef.field_v_328) != 0) {
					client.collisionMaps[i].method_m_void(i_22_, i_23_, objectdef.width * 211338481, objectdef.length * 1201809627, i_34_, objectdef.field_c_341, -1235905000);
				}
			}
			if (i_21_ == 3) {
				Class_ae.sceneGraph.method_p_void(i, i_22_, i_23_);
				final ObjectComposite objectdef = Class_cj.getObjectComposite(i_32_);
				if ((objectdef.field_v_328 * -812798571) == 1) {
					client.collisionMaps[i].method_h_void(i_22_, i_23_, (byte) 69);
				}
			}
					}
					if (i_24_ >= 0) {
						int i_35_ = i;
						if ((i < 3) && ((Region.sceneFlags[1][i_22_][i_23_] & 0x2) == 2)) {
							i_35_ = i + 1;
						}
						final SceneGraph scenegraph = Class_ae.sceneGraph;
						final CollisionMap collisionmap = client.collisionMaps[i];
						final ObjectComposite objectdef = Class_cj.getObjectComposite(i_24_);
						int i_36_;
						int i_37_;
						if ((i_25_ != 1) && (i_25_ != 3)) {
							i_36_ = 211338481 * objectdef.width;
							i_37_ = 1201809627 * objectdef.length;
						} else {
							i_36_ = objectdef.length * 1201809627;
							i_37_ = objectdef.width * 211338481;
						}
						int i_38_;
						int i_39_;
						if ((i_22_ + i_36_) <= 104) {
							i_38_ = i_22_ + (i_36_ >> 1);
							i_39_ = ((1 + i_36_) >> 1) + i_22_;
						} else {
							i_38_ = i_22_;
							i_39_ = 1 + i_22_;
						}
						int i_40_;
						int i_41_;
						if ((i_37_ + i_23_) <= 104) {
							i_40_ = i_23_ + (i_37_ >> 1);
							i_41_ = i_23_ + ((i_37_ + 1) >> 1);
						} else {
							i_40_ = i_23_;
							i_41_ = 1 + i_23_;
						}
						final int[][] is = Region.heightMaps[i_35_];
						final int i_42_ = ((is[i_39_][i_41_] + is[i_38_][i_40_] + is[i_39_][i_40_] + is[i_38_][i_41_]) >> 2);
						final int i_43_ = (i_36_ << 6) + (i_22_ << 7);
						final int i_44_ = (i_23_ << 7) + (i_37_ << 6);
						int i_45_ = (1073741824 + (i_23_ << 7) + i_22_ + (i_24_ << 14));
						if ((objectdef.field_p_314 * 154452619) == 0) {
							i_45_ -= -2147483648;
						}
						int i_46_ = i_26_ + (i_25_ << 6);
						if ((objectdef.field_ai_354 * 700665437) == 1) {
							i_46_ += 256;
						}
						if (i_26_ == 22) {
							Renderable renderable;
							if (((-353798667 * objectdef.field_w_337) == -1) && (objectdef.childrenIds == null)) {
								renderable = objectdef.method_a_cg(22, i_25_, is, i_43_, i_42_, i_44_, 442228513);
							} else {
								renderable = new GameObject(i_24_, 22, i_25_, i_35_, i_22_, i_23_, (-353798667 * (objectdef.field_w_337)), true, null);
							}
							scenegraph.method_f_void(i, i_22_, i_23_, i_42_, renderable, i_45_, i_46_);
							if ((objectdef.field_v_328 * -812798571) == 1) {
								collisionmap.method_e_void(i_22_, i_23_, -1794983953);
							}
						} else if ((i_26_ != 10) && (i_26_ != 11)) {
							if (i_26_ >= 12) {
								Renderable renderable;
								if (((-353798667 * objectdef.field_w_337) == -1) && (objectdef.childrenIds == null)) {
									renderable = objectdef.method_a_cg(i_26_, i_25_, is, i_43_, i_42_, i_44_, 1328279330);
								} else {
									renderable = new GameObject(i_24_, i_26_, i_25_, i_35_, i_22_, i_23_, ((objectdef.field_w_337) * -353798667), true, null);
								}
								scenegraph.method_l_boolean(i, i_22_, i_23_, i_42_, 1, 1, renderable, 0, i_45_, i_46_);
								if ((objectdef.field_v_328 * -812798571) != 0) {
									collisionmap.method_z_void(i_22_, i_23_, i_36_, i_37_, (objectdef.field_c_341), -582889433);
								}
							} else if (i_26_ == 0) {
								Renderable renderable;
								if (((objectdef.field_w_337 * -353798667) == -1) && (objectdef.childrenIds == null)) {
									renderable = objectdef.method_a_cg(0, i_25_, is, i_43_, i_42_, i_44_, 846307227);
								} else {
									renderable = (new GameObject(i_24_, 0, i_25_, i_35_, i_22_, i_23_, -353798667 * objectdef.field_w_337, true, null));
								}
								scenegraph.method_a_void(i, i_22_, i_23_, i_42_, renderable, null, (Region.field_v_997[i_25_]), 0, i_45_, i_46_);
								if ((objectdef.field_v_328 * -812798571) != 0) {
									collisionmap.setCollisionFlags(i_22_, i_23_, i_26_, i_25_, (objectdef.field_c_341), (byte) -48);
								}
							} else if (i_26_ == 1) {
								Renderable renderable;
								if (((objectdef.field_w_337 * -353798667) == -1) && (objectdef.childrenIds == null)) {
									renderable = objectdef.method_a_cg(1, i_25_, is, i_43_, i_42_, i_44_, 2033178828);
								} else {
									renderable = new GameObject(i_24_, 1, i_25_, i_35_, i_22_, i_23_, ((objectdef.field_w_337) * -353798667), true, null);
								}
								scenegraph.method_a_void(i, i_22_, i_23_, i_42_, renderable, null, (Region.field_c_998[i_25_]), 0, i_45_, i_46_);
								if ((-812798571 * objectdef.field_v_328) != 0) {
									collisionmap.setCollisionFlags(i_22_, i_23_, i_26_, i_25_, (objectdef.field_c_341), (byte) -54);
								}
							} else if (i_26_ == 2) {
								final int i_47_ = (i_25_ + 1) & 0x3;
								Renderable renderable;
								Renderable renderable_48_;
								if (((objectdef.field_w_337 * -353798667) == -1) && (objectdef.childrenIds == null)) {
									renderable = objectdef.method_a_cg(2, i_25_ + 4, is, i_43_, i_42_, i_44_, 685315064);
									renderable_48_ = objectdef.method_a_cg(2, i_47_, is, i_43_, i_42_, i_44_, 1437451104);
								} else {
									renderable = new GameObject(i_24_, 2, i_25_ + 4, i_35_, i_22_, i_23_, ((objectdef.field_w_337) * -353798667), true, null);
									renderable_48_ = (new GameObject(i_24_, 2, i_47_, i_35_, i_22_, i_23_, -353798667 * objectdef.field_w_337, true, null));
								}
								scenegraph.method_a_void(i, i_22_, i_23_, i_42_, renderable, renderable_48_, Region.field_v_997[i_25_], Region.field_v_997[i_47_], i_45_, i_46_);
								if ((objectdef.field_v_328 * -812798571) != 0) {
									collisionmap.setCollisionFlags(i_22_, i_23_, i_26_, i_25_, (objectdef.field_c_341), (byte) -75);
								}
							} else if (i_26_ == 3) {
								Renderable renderable;
								if (((objectdef.field_w_337 * -353798667) == -1) && (objectdef.childrenIds == null)) {
									renderable = objectdef.method_a_cg(3, i_25_, is, i_43_, i_42_, i_44_, 1605601685);
								} else {
									renderable = new GameObject(i_24_, 3, i_25_, i_35_, i_22_, i_23_, ((objectdef.field_w_337) * -353798667), true, null);
								}
								scenegraph.method_a_void(i, i_22_, i_23_, i_42_, renderable, null, (Region.field_c_998[i_25_]), 0, i_45_, i_46_);
								if ((-812798571 * objectdef.field_v_328) != 0) {
									collisionmap.setCollisionFlags(i_22_, i_23_, i_26_, i_25_, (objectdef.field_c_341), (byte) -21);
								}
							} else if (i_26_ == 9) {
								Renderable renderable;
								if (((-353798667 * objectdef.field_w_337) == -1) && (objectdef.childrenIds == null)) {
									renderable = objectdef.method_a_cg(i_26_, i_25_, is, i_43_, i_42_, i_44_, 1711038061);
								} else {
									renderable = new GameObject(i_24_, i_26_, i_25_, i_35_, i_22_, i_23_, ((objectdef.field_w_337) * -353798667), true, null);
								}
								scenegraph.method_l_boolean(i, i_22_, i_23_, i_42_, 1, 1, renderable, 0, i_45_, i_46_);
								if ((objectdef.field_v_328 * -812798571) != 0) {
									collisionmap.method_z_void(i_22_, i_23_, i_36_, i_37_, (objectdef.field_c_341), 845873745);
								}
							} else if (i_26_ == 4) {
								Renderable renderable;
								if (((objectdef.field_w_337 * -353798667) == -1) && (objectdef.childrenIds == null)) {
									renderable = objectdef.method_a_cg(4, i_25_, is, i_43_, i_42_, i_44_, 971301424);
								} else {
									renderable = (new GameObject(i_24_, 4, i_25_, i_35_, i_22_, i_23_, -353798667 * objectdef.field_w_337, true, null));
								}
								scenegraph.method_h_void(i, i_22_, i_23_, i_42_, renderable, null, (Region.field_v_997[i_25_]), 0, 0, 0, i_45_, i_46_);
							} else if (i_26_ == 5) {
								int i_49_ = 16;
								final int i_50_ = scenegraph.method_ad_int(i, i_22_, i_23_);
								if (i_50_ != 0) {
									i_49_ = (Class_cj.getObjectComposite((i_50_ >> 14) & 0x7fff).field_i_339) * -990255167;
								}
								Renderable renderable;
								if (((-353798667 * objectdef.field_w_337) == -1) && (objectdef.childrenIds == null)) {
									renderable = objectdef.method_a_cg(4, i_25_, is, i_43_, i_42_, i_44_, 1686021398);
								} else {
									renderable = new GameObject(i_24_, 4, i_25_, i_35_, i_22_, i_23_, ((objectdef.field_w_337) * -353798667), true, null);
								}
								scenegraph.method_h_void(i, i_22_, i_23_, i_42_, renderable, null, Region.field_v_997[i_25_], 0, Region.field_p_999[i_25_] * i_49_, i_49_ * Region.field_o_996[i_25_], i_45_, i_46_);
							} else if (i_26_ == 6) {
								int i_51_ = 8;
								final int i_52_ = scenegraph.method_ad_int(i, i_22_, i_23_);
								if (i_52_ != 0) {
									i_51_ = ((Class_cj.getObjectComposite((i_52_ >> 14) & 0x7fff).field_i_339) * -990255167) / 2;
								}
								Renderable renderable;
								if (((objectdef.field_w_337 * -353798667) == -1) && (objectdef.childrenIds == null)) {
									renderable = objectdef.method_a_cg(4, i_25_ + 4, is, i_43_, i_42_, i_44_, 897324987);
								} else {
									renderable = (new GameObject(i_24_, 4, i_25_ + 4, i_35_, i_22_, i_23_, -353798667 * objectdef.field_w_337, true, null));
								}
								scenegraph.method_h_void(i, i_22_, i_23_, i_42_, renderable, null, 256, i_25_, Region.field_b_1001[i_25_] * i_51_, i_51_ * Region.field_t_1002[i_25_], i_45_, i_46_);
							} else if (i_26_ == 7) {
								final int i_53_ = (2 + i_25_) & 0x3;
								Renderable renderable;
								if (((objectdef.field_w_337 * -353798667) == -1) && (objectdef.childrenIds == null)) {
									renderable = objectdef.method_a_cg(4, 4 + i_53_, is, i_43_, i_42_, i_44_, 2076975453);
								} else {
									renderable = (new GameObject(i_24_, 4, 4 + i_53_, i_35_, i_22_, i_23_, -353798667 * objectdef.field_w_337, true, null));
								}
								scenegraph.method_h_void(i, i_22_, i_23_, i_42_, renderable, null, 256, i_53_, 0, 0, i_45_, i_46_);
							} else if (i_26_ == 8) {
								int i_54_ = 8;
								final int i_55_ = scenegraph.method_ad_int(i, i_22_, i_23_);
								if (i_55_ != 0) {
									i_54_ = ((Class_cj.getObjectComposite((i_55_ >> 14) & 0x7fff).field_i_339) * -990255167) / 2;
								}
								final int i_56_ = (i_25_ + 2) & 0x3;
								Renderable renderable;
								Renderable renderable_57_;
								if (((-353798667 * objectdef.field_w_337) == -1) && (objectdef.childrenIds == null)) {
									renderable = objectdef.method_a_cg(4, 4 + i_25_, is, i_43_, i_42_, i_44_, 2010018365);
									renderable_57_ = objectdef.method_a_cg(4, i_56_ + 4, is, i_43_, i_42_, i_44_, 1993198574);
								} else {
									renderable = new GameObject(i_24_, 4, 4 + i_25_, i_35_, i_22_, i_23_, ((objectdef.field_w_337) * -353798667), true, null);
									renderable_57_ = (new GameObject(i_24_, 4, i_56_ + 4, i_35_, i_22_, i_23_, -353798667 * objectdef.field_w_337, true, null));
								}
								scenegraph.method_h_void(i, i_22_, i_23_, i_42_, renderable, renderable_57_, 256, i_25_, i_54_ * Region.field_b_1001[i_25_], Region.field_t_1002[i_25_] * i_54_, i_45_, i_46_);
							}
						} else {
							Renderable renderable;
							if (((objectdef.field_w_337 * -353798667) == -1) && (objectdef.childrenIds == null)) {
								renderable = objectdef.method_a_cg(10, i_25_, is, i_43_, i_42_, i_44_, 1164871409);
							} else {
								renderable = new GameObject(i_24_, 10, i_25_, i_35_, i_22_, i_23_, ((objectdef.field_w_337) * -353798667), true, null);
							}
							if (renderable != null) {
								scenegraph.method_l_boolean(i, i_22_, i_23_, i_42_, i_36_, i_37_, renderable, (i_26_ == 11 ? 256 : 0), i_45_, i_46_);
							}
							if ((objectdef.field_v_328 * -812798571) != 0) {
								collisionmap.method_z_void(i_22_, i_23_, i_36_, i_37_, (objectdef.field_c_341), 485248280);
							}
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "l.by()");
		}
	}

	static final void method_aq_void(final String string, final boolean bool, final int i) {
		try {
			final int i_58_ = 4;
			final int i_59_ = i_58_ + 6;
			final int i_60_ = i_58_ + 6;
			final int i_61_ = Class_ay.p12Full.method_g_int(string, 250);
			final int i_62_ = Class_ay.p12Full.method_f_int(string, 250) * 13;
			Rasterizer.fillRect(i_59_ - i_58_, i_60_ - i_58_, i_58_ + i_61_ + i_58_, i_62_ + i_58_ + i_58_, 0);
			Rasterizer.drawRect(i_59_ - i_58_, i_60_ - i_58_, i_58_ + i_61_ + i_58_, i_58_ + i_58_ + i_62_, 16777215);
			Class_ay.p12Full.method_u_int(string, i_59_, i_60_, i_61_, i_62_, 16777215, -1, 1, 1, 0);
			Class_s.method_bb_void(i_59_ - i_58_, i_60_ - i_58_, i_58_ + i_58_ + i_61_, i_58_ + i_62_ + i_58_, -1084898504);
			if (bool) {
				try {
					final Graphics graphics = ObjectComposite.canvas.getGraphics();
					Class_s.field_qj_1361.drawGraphics(graphics, 0, 0, (byte) 1);
				} catch (final Exception exception) {
					ObjectComposite.canvas.repaint();
				}
			} else {
				Class_cc.method_bl_void(i_59_, i_60_, i_61_, i_62_, -1288719224);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "l.aq()");
		}
	}

	public static String method_m_String(final String string, final int i) {
		String string_63_;
		try {
			final int i_64_ = string.length();
			final char[] cs = new char[i_64_];
			int i_65_ = 2;
			for (int i_66_ = 0; i_66_ < i_64_; i_66_++) {
				char c = string.charAt(i_66_);
				if (i_65_ == 0) {
					c = java.lang.Character.toLowerCase(c);
				} else if ((i_65_ == 2) || java.lang.Character.isUpperCase(c)) {
					c = Class_bk.method_d_char(c, -498556758);
				}
				if (java.lang.Character.isLetter(c)) {
					i_65_ = 0;
				} else if ((c != '.') && (c != '?') && (c != '!')) {
					if (java.lang.Character.isSpaceChar(c)) {
						if (i_65_ != 2) {
							i_65_ = 1;
						}
					} else {
						i_65_ = 1;
					}
				} else {
					i_65_ = 2;
				}
				cs[i_66_] = c;
			}
			string_63_ = new String(cs);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "l.m()");
		}
		return string_63_;
	}
}
