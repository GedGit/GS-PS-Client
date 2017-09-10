/* SpotAnim - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class SpotAnim extends CacheableNode {
	short[] recol_d;
	public static FileStore field_d_394;
	int gfxId;
	public static FileStore field_n_396;
	int field_k_397 = 0;
	public static final int field_db_398 = 153;
	public int field_f_399 = 1105293623;
	public static NodeCache field_z_400 = new NodeCache(64);
	public static NodeCache field_y_401 = new NodeCache(30);
	short[] retex_s;
	short[] retex_d;
	int field_u_404 = -522447488;
	int field_q_405 = 1201803904;
	int model;
	int field_x_407 = 0;
	int field_r_408 = 0;
	static int regionX;
	static final int field_an_410 = 4;
	static final int field_o_411 = 24;
	static byte myClanRank;
	public static Daemon daemon;
	short[] recol_s;

	void method_d_void(final Buffer rsbytebuffer, final int i) {
		try {
			for (;;) {
				final int i_0_ = rsbytebuffer.get();
				if (i_0_ == 0) {
					break;
				}
				method_z_void(rsbytebuffer, i_0_, 978446535);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "aw.d()");
		}
	}

	void method_z_void(final Buffer rsbytebuffer, final int i, final int i_1_) {
		try {
			if (i == 1) {
				this.model = rsbytebuffer.getShort() * -608668405;
			} else if (i == 2) {
				field_f_399 = rsbytebuffer.getShort() * -1105293623;
			} else if (i == 4) {
				this.field_u_404 = rsbytebuffer.getShort() * -1044269013;
			} else if (i == 5) {
				this.field_q_405 = rsbytebuffer.getShort() * 479151141;
			} else if (i == 6) {
				this.field_k_397 = rsbytebuffer.getShort() * 274607901;
			} else if (i == 7) {
				this.field_x_407 = rsbytebuffer.get() * -975710755;
			} else if (i == 8) {
				this.field_r_408 = rsbytebuffer.get() * 839688959;
			} else if (i == 40) {
				final int i_2_ = rsbytebuffer.get();
				this.recol_s = new short[i_2_];
				this.recol_d = new short[i_2_];
				for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
					this.recol_s[i_3_] = (short) rsbytebuffer.getShort();
					this.recol_d[i_3_] = (short) rsbytebuffer.getShort();
				}
			} else if (i == 41) {
				final int i_4_ = rsbytebuffer.get();
				this.retex_s = new short[i_4_];
				this.retex_d = new short[i_4_];
				for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
					this.retex_s[i_5_] = (short) rsbytebuffer.getShort();
					this.retex_d[i_5_] = (short) rsbytebuffer.getShort();
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "aw.z()");
		}
	}

	public final Model method_y_cg(final int i, final int i_6_) {
		Model onscreenmodel;
		try {
			Model onscreenmodel_7_ = ((Model) field_y_401.method_n_gb((this.gfxId) * -2143532351));
			if (onscreenmodel_7_ == null) {
				final OffScreenModel rsmodel = OffScreenModel.getModel(field_d_394, (1845538467 * this.model), 0);
				if (rsmodel == null) {
					return null;
				}
				if (this.recol_s != null) {
					for (int i_8_ = 0; i_8_ < this.recol_s.length; i_8_++) {
						rsmodel.recolor((this.recol_s[i_8_]), (this.recol_d[i_8_]));
					}
				}
				if (this.retex_s != null) {
					for (int i_9_ = 0; i_9_ < this.retex_s.length; i_9_++) {
						rsmodel.retexture((this.retex_s[i_9_]), (this.retex_d[i_9_]));
					}
				}
				onscreenmodel_7_ = rsmodel.method_ad_cg((this.field_x_407 * 411642485) + 64, (this.field_r_408 * 589978879) + 850, -30, -50, -30);
				field_y_401.method_z_void(onscreenmodel_7_, this.gfxId * -2143532351);
			}
			Model onscreenmodel_10_;
			if (((field_f_399 * 1956440953) != -1) && (i != -1)) {
				onscreenmodel_10_ = OnDemandNode.getAnimationSequence(field_f_399 * 1956440953).method_f_cg(onscreenmodel_7_, i, (byte) 1);
			} else {
				onscreenmodel_10_ = onscreenmodel_7_.method_y_cg(true);
			}
			if (((940131971 * this.field_u_404) != 128) || ((this.field_q_405 * 166672301) != 128)) {
				onscreenmodel_10_.method_v_void(this.field_u_404 * 940131971, this.field_q_405 * 166672301, 940131971 * this.field_u_404);
			}
			if ((this.field_k_397 * 658639669) != 0) {
				if ((this.field_k_397 * 658639669) == 90) {
					onscreenmodel_10_.method_k_void();
				}
				if ((658639669 * this.field_k_397) == 180) {
					onscreenmodel_10_.method_k_void();
					onscreenmodel_10_.method_k_void();
				}
				if ((658639669 * this.field_k_397) == 270) {
					onscreenmodel_10_.method_k_void();
					onscreenmodel_10_.method_k_void();
					onscreenmodel_10_.method_k_void();
				}
			}
			onscreenmodel = onscreenmodel_10_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "aw.y()");
		}
		return onscreenmodel;
	}

	SpotAnim() {
		/* empty */
	}

	static final void parseCoordPackets(final int i) {
		try {
			if ((2043934659 * client.currentOpcode) == 127) {
				final int i_11_ = client.inbound.get();
				final int i_12_ = ((i_11_ >> 4) & 0x7) + (-1687774233 * Class_bi.localCoordinateX);
				final int i_13_ = (NpcComposite.localCoordinateY * -6324029) + (i_11_ & 0x7);
				final int i_14_ = client.inbound.getShort();
				final int i_15_ = client.inbound.getShort();
				final int i_16_ = client.inbound.getShort();
				if ((i_12_ >= 0) && (i_13_ >= 0) && (i_12_ < 104) && (i_13_ < 104)) {
					final NodeDeque deque = (client.groundItemsDeque[Class_ed.plane * 250114511][i_12_][i_13_]);
					if (deque != null) {
						for (Item grounditem = (Item) deque.method_f_ga(); grounditem != null; grounditem = (Item) deque.method_a_ga()) {
							if (((1499483327 * grounditem.id) == (i_14_ & 0x7fff)) && ((899943275 * (grounditem.amount)) == i_15_)) {
								grounditem.amount = 734972227 * i_16_;
								break;
							}
						}
						Npc.drawGroundItems(i_12_, i_13_, -2018483881);
					}
				}
			} else if ((client.currentOpcode * 2043934659) == 25) {//animate object
				final int skip = client.inbound.getByteC();
				final int i_18_ = ((skip >> 4) & 0x7) + (Class_bi.localCoordinateX * -1687774233);
				final int i_19_ = (NpcComposite.localCoordinateY * -6324029) + (skip & 0x7);
				final int animationId = client.inbound.getShort();
				final int objType = client.inbound.getByteS();
				int type = objType >> 2;
				final int i_23_ = objType & 0x3;
				final int objectType = client.objectTypes[type];
				if ((i_18_ >= 0) && (i_19_ >= 0) && (i_18_ < 103) && (i_19_ < 103)) {
					if (objectType == 0) {// if we sned 0 it creates a new boundary object at the given location
						final Boundary boundaryobject = Class_ae.sceneGraph.getBoundaryAt((Class_ed.plane * 250114511), i_18_, i_19_);
						if (boundaryobject != null) {
							final int i_25_ = (((-832076175 * boundaryobject.uid) >> 14) & 0x7fff);
							if (type == 2) {
								boundaryobject.renderable1 = new GameObject(i_25_, 2, i_23_ + 4, (Class_ed.plane * 250114511), i_18_, i_19_, animationId, false, (boundaryobject.renderable1));
								boundaryobject.renderable2 = new GameObject(i_25_, 2, (1 + i_23_) & 0x3, (250114511 * Class_ed.plane), i_18_, i_19_, animationId, false, (boundaryobject.renderable2));
							} else {
								boundaryobject.renderable1 = new GameObject(i_25_, type, i_23_, (250114511 * Class_ed.plane), i_18_, i_19_, animationId, false, (boundaryobject.renderable1));
							}
						}
					}
					if (objectType == 1) {// if its 1 it gets flagged as a wall decoration like something u can hang on wall like picture probably (never tried htis on rsps but im just going with what it looks like will happen)
						final WallDecoration walldecoration = Class_ae.sceneGraph.getWallAt((250114511 * (Class_ed.plane)), i_18_, i_19_);
						if (walldecoration != null) {
							final int i_26_ = (((walldecoration.uid * -298307543) >> 14) & 0x7fff);
							if ((type != 4) && (type != 5)) {// 1 sec
								if (type == 6) {
									walldecoration.renderable2 = (new GameObject(i_26_, 4, i_23_ + 4, 250114511 * Class_ed.plane, i_18_, i_19_, animationId, false, walldecoration.renderable2));
								} else if (type == 7) {
									walldecoration.renderable2 = (new GameObject(i_26_, 4, 4 + ((i_23_ + 2) & 0x3), Class_ed.plane * 250114511, i_18_, i_19_, animationId, false, walldecoration.renderable2));
								} else if (type == 8) {
									walldecoration.renderable2 = (new GameObject(i_26_, 4, 4 + i_23_, Class_ed.plane * 250114511, i_18_, i_19_, animationId, false, walldecoration.renderable2));
									walldecoration.renderable1 = (new GameObject(i_26_, 4, ((i_23_ + 2) & 0x3) + 4, 250114511 * Class_ed.plane, i_18_, i_19_, animationId, false, walldecoration.renderable1));
								}
							} else {
								walldecoration.renderable2 = new GameObject(i_26_, 4, i_23_, (Class_ed.plane * 250114511), i_18_, i_19_, animationId, false, (walldecoration.renderable2));
							}
						}
					}
					if (objectType == 2) {// interactable object for sure but dont really get the point of this type atm.
						final SceneObject interactableobject = Class_ae.sceneGraph.getSceneObject((Class_ed.plane * 250114511), i_18_, i_19_);
						if (type == 11) {
							type = 10;
						}
						if (interactableobject != null) {
							interactableobject.renderable = (new GameObject((((interactableobject.uid * -1513499455) >> 14) & 0x7fff), type, i_23_, 250114511 * Class_ed.plane, i_18_, i_19_, animationId, false, interactableobject.renderable));
						}
					}
					if (objectType == 3) {
						final GroundDecoration grounddecoration = Class_ae.sceneGraph.getGroundObject((250114511 * (Class_ed.plane)), i_18_, i_19_);
						if (grounddecoration != null) {
							grounddecoration.renderable = (new GameObject((((grounddecoration.uid * 840235263) >> 14) & 0x7fff), 22, i_23_, Class_ed.plane * 250114511, i_18_, i_19_, animationId, false, grounddecoration.renderable));
						}
					}
				}
			} else if ((2043934659 * client.currentOpcode) == 239) {//still gfx?
				final int i_27_ = client.inbound.get();
				int i_28_ = (Class_bi.localCoordinateX * -1687774233) + ((i_27_ >> 4) & 0x7);
				int i_29_ = (-6324029 * NpcComposite.localCoordinateY) + (i_27_ & 0x7);
				final int i_30_ = client.inbound.getShort();
				final int i_31_ = client.inbound.get();
				final int i_32_ = client.inbound.getShort();
				if ((i_28_ >= 0) && (i_29_ >= 0) && (i_28_ < 104) && (i_29_ < 104)) {
					i_28_ = 64 + (128 * i_28_);
					i_29_ = 64 + (128 * i_29_);
					final GroundItem class_ak = new GroundItem(i_30_, 250114511 * Class_ed.plane, i_28_, i_29_, (Class_q.getTileHeight(i_28_, i_29_, (Class_ed.plane * 250114511)) - i_31_), i_32_, 303796053 * client.currentCycle);
					client.field_ha_2823.add(class_ak);
				}
			} else {
				if ((2043934659 * client.currentOpcode) == 95) {
					int i_33_ = client.inbound.method_af_byte((short) 1139);
					int i_34_ = client.inbound.method_ag_byte((short) -16566);
					final int i_35_ = client.inbound.getLEShort();
					final int i_36_ = client.inbound.getByteC();
					final int i_37_ = i_36_ >> 2;
				final int i_38_ = i_36_ & 0x3;
				final int i_39_ = client.objectTypes[i_37_];
				final int i_40_ = client.inbound.getLEShort();
				int i_41_ = client.inbound.method_af_byte((short) -6697);
				int i_42_ = client.inbound.method_ap_byte(1012612093);
				final int i_43_ = client.inbound.getLEShort();
				final int i_44_ = client.inbound.getByteC();
				final int i_45_ = ((-1687774233 * Class_bi.localCoordinateX) + ((i_44_ >> 4) & 0x7));
				final int i_46_ = (-6324029 * NpcComposite.localCoordinateY) + (i_44_ & 0x7);
				final int i_47_ = client.inbound.getShort();
				Player player;
				if ((client.myPlayerIndex * -901432633) == i_43_) {
					player = Class_ci.myPlayer;
				} else {
					player = client.localPlayers[i_43_];
				}
				if (player != null) {
					final ObjectComposite objectdef = Class_cj.getObjectComposite(i_35_);
					int i_48_;
					int i_49_;
					if ((i_38_ != 1) && (i_38_ != 3)) {
						i_48_ = 211338481 * objectdef.width;
						i_49_ = 1201809627 * objectdef.length;
					} else {
						i_48_ = objectdef.length * 1201809627;
						i_49_ = 211338481 * objectdef.width;
					}
					final int i_50_ = (i_48_ >> 1) + i_45_;
					final int i_51_ = ((i_48_ + 1) >> 1) + i_45_;
					final int i_52_ = (i_49_ >> 1) + i_46_;
					final int i_53_ = ((1 + i_49_) >> 1) + i_46_;
					final int[][] is = Region.heightMaps[250114511 * Class_ed.plane];
					final int i_54_ = ((is[i_51_][i_53_] + is[i_51_][i_52_] + is[i_50_][i_52_] + is[i_50_][i_53_]) >> 2);
					final int i_55_ = (i_45_ << 7) + (i_48_ << 6);
					final int i_56_ = (i_49_ << 6) + (i_46_ << 7);
					final Model onscreenmodel = objectdef.method_a_cg(i_37_, i_38_, is, i_55_, i_54_, i_56_, -237478892);
					if (onscreenmodel != null) {
						Class_fp.registerGameObject(250114511 * Class_ed.plane, i_45_, i_46_, i_39_, -1, 0, 0, 1 + i_40_, i_47_ + 1, (byte) 90);
						player.field_m_1551 = -1334699327 * ((303796053 * client.currentCycle) + i_40_);
						player.field_a_1564 = ((i_47_ + (client.currentCycle * 303796053)) * -1537721821);
						player.screenModel = onscreenmodel;
						player.field_h_1553 = (i_45_ * 1342804608) + (i_48_ * 671402304);
						player.field_u_1555 = (737331776 * i_49_) + (i_46_ * 1474663552);
						player.field_l_1562 = 988469309 * i_54_;
						if (i_33_ > i_34_) {
							final int i_57_ = i_33_;
							i_33_ = i_34_;
							i_34_ = i_57_;
						}
						if (i_42_ > i_41_) {
							final int i_58_ = i_42_;
							i_42_ = i_41_;
							i_41_ = i_58_;
						}
						player.field_k_1563 = 1603066981 * (i_33_ + i_45_);
						player.field_r_1552 = (i_45_ + i_34_) * 755672829;
						player.field_x_1554 = -1775347881 * (i_42_ + i_46_);
						player.field_j_1560 = (i_46_ + i_41_) * 544246511;
					}
				}
				}
				if ((2043934659 * client.currentOpcode) == 49) {
					final int i_59_ = client.inbound.get();
					int i_60_ = ((-1687774233 * Class_bi.localCoordinateX) + ((i_59_ >> 4) & 0x7));
					int i_61_ = (NpcComposite.localCoordinateY * -6324029) + (i_59_ & 0x7);
					int i_62_ = (i_60_ + client.inbound.getSigned());
					int id = (i_61_ + client.inbound.getSigned());
					final int i_64_ = client.inbound.getShort((byte) -70);
					final int i_65_ = client.inbound.getShort();
					final int i_66_ = client.inbound.get() * 4;
					final int i_67_ = client.inbound.get() * 4;
					final int i_68_ = client.inbound.getShort();
					final int i_69_ = client.inbound.getShort();
					final int i_70_ = client.inbound.get();
					final int i_71_ = client.inbound.get();
					if ((i_60_ >= 0) && (i_61_ >= 0) && (i_60_ < 104) && (i_61_ < 104) && (i_62_ >= 0) && (id >= 0) && (i_62_ < 104) && (id < 104) && (i_65_ != 65535)) {
						i_60_ = (128 * i_60_) + 64;
						i_61_ = (128 * i_61_) + 64;
						i_62_ = (i_62_ * 128) + 64;
						id = (128 * id) + 64;
						final Projectile class_f = (new Projectile(i_65_, 250114511 * Class_ed.plane, i_60_, i_61_, Class_q.getTileHeight(i_60_, i_61_, (250114511 * Class_ed.plane)) - i_66_, i_68_ + (client.currentCycle * 303796053), (client.currentCycle * 303796053) + i_69_, i_70_, i_71_, i_64_, i_67_));
						class_f.method_n_void(i_62_, id, Class_q.getTileHeight(i_62_, id, Class_ed.plane * 250114511) - i_67_, (303796053 * client.currentCycle) + i_68_, 1854840880);
						client.activeProjectiles.add(class_f);
					}
				} else if ((2043934659 * client.currentOpcode) == 241) {
					final int i_72_ = client.inbound.get();
					final int i_73_ = ((Class_bi.localCoordinateX * -1687774233) + ((i_72_ >> 4) & 0x7));
					final int i_74_ = (i_72_ & 0x7) + (-6324029 * NpcComposite.localCoordinateY);
					final int i_75_ = client.inbound.get();
					final int type = i_75_ >> 2;
					final int rotation = i_75_ & 0x3;
					final int i_78_ = client.objectTypes[type];
					if ((i_73_ >= 0) && (i_74_ >= 0) && (i_73_ < 104) && (i_74_ < 104)) {
						Class_fp.registerGameObject(Class_ed.plane * 250114511, i_73_, i_74_, i_78_, -1, type, rotation, 0, -1, (byte) 10);
					}
				} else if ((client.currentOpcode * 2043934659) == 215) {
					final int id = client.inbound.getShort();
					final int i_80_ = client.inbound.getByteS();
					final int x = (((i_80_ >> 4) & 0x7) + (Class_bi.localCoordinateX * -1687774233));
					final int y = (i_80_ & 0x7) + (-6324029 * NpcComposite.localCoordinateY);
					final int i_83_ = client.inbound.getByteA();
					final int type = i_83_ >> 2;
					final int i_85_ = i_83_ & 0x3;
				
					final int i_86_ = client.objectTypes[type];
					if ((x >= 0) && (y >= 0) && (x < 104) && (y < 104)) {
						Class_fp.registerGameObject(250114511 * Class_ed.plane, x, y, i_86_, id, type, i_85_, 0, -1, (byte) -47);
					}
				} else if ((2043934659 * client.currentOpcode) == 205) {
					final int i_87_ = client.inbound.get();
					final int i_88_ = (((i_87_ >> 4) & 0x7) + (Class_bi.localCoordinateX * -1687774233));
					final int i_89_ = (-6324029 * NpcComposite.localCoordinateY) + (i_87_ & 0x7);
					final int i_90_ = client.inbound.getShort();
					final int i_91_ = client.inbound.getLEShortA();
					if ((i_88_ >= 0) && (i_89_ >= 0) && (i_88_ < 104) && (i_89_ < 104)) {
						final Item grounditem = new Item();
						grounditem.id = 703669055 * i_91_;
						grounditem.amount = i_90_ * 734972227;
						if ((client.groundItemsDeque[Class_ed.plane * 250114511][i_88_][i_89_]) == null) {
							client.groundItemsDeque[Class_ed.plane * 250114511][i_88_][i_89_] = new NodeDeque();
						}
						client.groundItemsDeque[250114511 * Class_ed.plane][i_88_][i_89_].add(grounditem);
						Npc.drawGroundItems(i_88_, i_89_, -1327859402);
					}
				} else {
					if ((client.currentOpcode * 2043934659) == 116) {
						final int i_92_ = client.inbound.get();
						final int i_93_ = ((-1687774233 * Class_bi.localCoordinateX) + ((i_92_ >> 4) & 0x7));
						final int i_94_ = (i_92_ & 0x7) + (NpcComposite.localCoordinateY * -6324029);
						final int i_95_ = client.inbound.getShort();
						final int i_96_ = client.inbound.get();
						final int i_97_ = (i_96_ >> 4) & 0xf;
						final int i_98_ = i_96_ & 0x7;
						final int i_99_ = client.inbound.get();
						if ((i_93_ >= 0) && (i_94_ >= 0) && (i_93_ < 104) && (i_94_ < 104)) {
							final int i_100_ = 1 + i_97_;
							if ((Class_ci.myPlayer.walkQueueX[0] >= (i_93_ - i_100_)) && (Class_ci.myPlayer.walkQueueX[0] <= (i_100_ + i_93_)) && (Class_ci.myPlayer.walkQueueY[0] >= (i_94_ - i_100_)) && (Class_ci.myPlayer.walkQueueY[0] <= (i_100_ + i_94_)) && ((client.field_nm_2918 * -630818465) != 0) && (i_98_ > 0) && ((-1735289853 * client.field_nb_2931) < 50)) {
								client.field_nq_2932[(-1735289853 * client.field_nb_2931)] = i_95_;
								client.field_nx_2933[(-1735289853 * client.field_nb_2931)] = i_98_;
								client.field_nj_2967[(client.field_nb_2931 * -1735289853)] = i_99_;
								client.field_no_2936[(client.field_nb_2931 * -1735289853)] = null;
								client.field_nu_2935[(-1735289853 * client.field_nb_2931)] = i_97_ + (i_94_ << 8) + (i_93_ << 16);
								client.field_nb_2931 += -405227861;
							}
						}
					}
					if ((client.currentOpcode * 2043934659) == 83) {
						final int i_101_ = client.inbound.getByteC();
						final int i_102_ = ((Class_bi.localCoordinateX * -1687774233) + ((i_101_ >> 4) & 0x7));
						final int i_103_ = (i_101_ & 0x7) + (-6324029 * NpcComposite.localCoordinateY);
						final int i_104_ = client.inbound.getLEShort();
						if ((i_102_ >= 0) && (i_103_ >= 0) && (i_102_ < 104) && (i_103_ < 104)) {
							final NodeDeque deque = (client.groundItemsDeque[250114511 * Class_ed.plane][i_102_][i_103_]);
							if (deque != null) {
								for (Item grounditem = (Item) deque.method_f_ga(); grounditem != null; grounditem = (Item) deque.method_a_ga()) {
									if ((grounditem.id * 1499483327) == (i_104_ & 0x7fff)) {
										grounditem.removeLink();
										break;
									}
								}
								if (deque.method_f_ga() == null) {
									client.groundItemsDeque[250114511 * Class_ed.plane][i_102_][i_103_] = null;
								}
								Npc.drawGroundItems(i_102_, i_103_, -1799415073);
							}
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "aw.bp()");
		}
	}
}
