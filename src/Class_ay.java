import java.util.LinkedList;

/* Class_ay - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_ay extends CacheableNode {
	public int[] field_a_449;
	public static NodeCache field_d_450 = new NodeCache(64);
	public char field_z_451;
	public char field_y_452;
	public String field_e_453 = "null";
	public int field_g_454;
	static Class_hd p12Full;
	public int[] field_m_456;
	public static final int field_cw_457 = 112;
	public String[] field_h_458;
	public static FileStore field_n_459;
	public static final int field_af_460 = 202;
	static int field_pt_461;
	public int field_f_462 = 0;

	static final void method_ab_void(final Actor character, final int i) {
		try {
			if ((-2063870277 * character.field_bx_249) != 0) {
				if (((character.interactingIndex * -313868667) != -1)
						&& ((character.interactingIndex * -313868667) < 32768)) {
					final Npc npc = client.npcs[-313868667 * (character.interactingIndex)];
					if (npc != null) {
						final int i_0_ = ((character.worldPosX * -2103184911) - (npc.worldPosX * -2103184911));
						final int i_1_ = ((character.worldPosY * 2088773389) - (2088773389 * npc.worldPosY));
						if ((i_0_ != 0) || (i_1_ != 0)) {
							character.orientation = ((int) (Math.atan2(i_0_, i_1_) * 325.949) & 0x7ff) * -1265583369;
						}
					}
				}
				if ((-313868667 * character.interactingIndex) >= 32768) {
					int i_2_ = ((character.interactingIndex * -313868667) - 32768);
					if ((-901432633 * client.myPlayerIndex) == i_2_) {
						i_2_ = 2047;
					}
					final Player player = client.localPlayers[i_2_];
					if (player != null) {
						final int i_3_ = ((character.worldPosX * -2103184911) - (player.worldPosX * -2103184911));
						final int i_4_ = ((2088773389 * character.worldPosY) - (2088773389 * player.worldPosY));
						if ((i_3_ != 0) || (i_4_ != 0)) {
							character.orientation = ((int) (Math.atan2(i_3_, i_4_) * 325.949) & 0x7ff) * -1265583369;
						}
					}
				}
				if ((((-882707473 * character.focalX) != 0) || ((-1124207539 * character.focalY) != 0))
						&& (((character.queueXPos * 1937318741) == 0) || ((-384433537 * character.field_cj_272) > 0))) {
					final int i_5_ = ((character.worldPosX * -2103184911) - ((character.focalX * -658703424)
							- (981747392 * Class_q.originX) - (Class_q.originX * 981747392)));
					final int i_6_ = ((character.worldPosY * 2088773389) - ((1065161536 * character.focalY)
							- (Class_gf.originY * 1088508992) - (1088508992 * Class_gf.originY)));
					if ((i_5_ != 0) || (i_6_ != 0)) {
						character.orientation = ((int) (Math.atan2(i_5_, i_6_) * 325.949) & 0x7ff) * -1265583369;
					}
					character.focalX = 0;
					character.focalY = 0;
				}
				final int i_7_ = (((character.orientation * 414328519) - (character.field_b_217 * -2023015971))
						& 0x7ff);
				if (i_7_ != 0) {
					character.field_bi_266 += -1569026727;
					if (i_7_ > 1024) {
						character.field_b_217 -= (character.field_bx_249 * 1592993143);
						boolean bool = true;
						if ((i_7_ < (character.field_bx_249 * -2063870277))
								|| (i_7_ > (2048 - ((character.field_bx_249) * -2063870277)))) {
							character.field_b_217 = (1344832243 * character.orientation);
							bool = false;
						}
						if (((character.standAnimation * -385188719) == (-1720610647 * character.field_af_226))
								&& (((1360194281 * character.field_bi_266) > 25) || bool)) {
							if ((character.standTurnAnimation * -1123198529) != -1) {
								character.field_af_226 = (character.standTurnAnimation * -186658777);
							} else {
								character.field_af_226 = (character.field_ae_223 * -216013657);
							}
						}
					} else {
						character.field_b_217 += (1592993143 * character.field_bx_249);
						boolean bool = true;
						if ((i_7_ < (-2063870277 * character.field_bx_249))
								|| (i_7_ > (2048 - ((character.field_bx_249) * -2063870277)))) {
							character.field_b_217 = (1344832243 * character.orientation);
							bool = false;
						}
						if (((character.field_af_226 * -1720610647) == (character.standAnimation * -385188719))
								&& (((character.field_bi_266 * 1360194281) > 25) || bool)) {
							if ((-2034433597 * character.field_ak_222) != -1) {
								character.field_af_226 = (459507339 * character.field_ak_222);
							} else {
								character.field_af_226 = (-216013657 * character.field_ae_223);
							}
						}
					}
					character.field_b_217 = ((-2023015971 * character.field_b_217) & 0x7ff) * 1256908405;
				} else {
					character.field_bi_266 = 0;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ay.ab()");
		}
	}

	public void method_n_void(final Buffer rsbytebuffer, final byte i) {
		// try {
		// for (;;) {

		while (true) {
			final int var2 = rsbytebuffer.get();
			if (var2 == 0) {
				this.method740();
				break;
			}
			method_d_void(rsbytebuffer, var2, 1992382639);
		}
	}
	// catch (final RuntimeException runtimeexception) {
	// throw GameCanvas.error(runtimeexception, "ay.n()");
	// }
	// }

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void method740() {
		if (this.field_f_462 == 1124) {
			LinkedList var1 = new LinkedList();
			var1.add(Integer.valueOf(12695));
			var1.add(Integer.valueOf(12905));
			var1.add(Integer.valueOf(2446));
			var1.add(Integer.valueOf(12625));
			var1.add(Integer.valueOf(11936));
			var1.add(Integer.valueOf(385));
			var1.add(Integer.valueOf(3144));
			var1.add(Integer.valueOf(8013));
			var1.add(Integer.valueOf(1523));
			var1.add(Integer.valueOf(12642));
			var1.add(Integer.valueOf(2550));
			var1.add(Integer.valueOf(2572));
			var1.add(Integer.valueOf(6731));
			var1.add(Integer.valueOf(6733));
			var1.add(Integer.valueOf(6735));
			var1.add(Integer.valueOf(6737));
			var1.add(Integer.valueOf(11770));
			var1.add(Integer.valueOf(11771));
			var1.add(Integer.valueOf(11772));
			var1.add(Integer.valueOf(11773));
			var1.add(Integer.valueOf(11090));
			var1.add(Integer.valueOf(1725));
			var1.add(Integer.valueOf(1727));
			var1.add(Integer.valueOf(1729));
			var1.add(Integer.valueOf(1731));
			var1.add(Integer.valueOf(1478));
			var1.add(Integer.valueOf(11978));
			var1.add(Integer.valueOf(6585));
			var1.add(Integer.valueOf(12002));
			var1.add(Integer.valueOf(11128));
			var1.add(Integer.valueOf(7458));
			var1.add(Integer.valueOf(7459));
			var1.add(Integer.valueOf(7460));
			var1.add(Integer.valueOf(7461));
			var1.add(Integer.valueOf(7462));
			var1.add(Integer.valueOf(8847));
			var1.add(Integer.valueOf(8848));
			var1.add(Integer.valueOf(8849));
			var1.add(Integer.valueOf(8850));
			var1.add(Integer.valueOf(12954));
			var1.add(Integer.valueOf(2412));
			var1.add(Integer.valueOf(2413));
			var1.add(Integer.valueOf(2414));
			var1.add(Integer.valueOf(6570));
			var1.add(Integer.valueOf(13280));
			var1.add(Integer.valueOf(13329));
			var1.add(Integer.valueOf(13331));
			var1.add(Integer.valueOf(13333));
			var1.add(Integer.valueOf(13335));
			var1.add(Integer.valueOf(13337));
			var1.add(Integer.valueOf(13124));
			var1.add(Integer.valueOf(3840));
			var1.add(Integer.valueOf(3842));
			var1.add(Integer.valueOf(3844));
			var1.add(Integer.valueOf(12608));
			var1.add(Integer.valueOf(12610));
			var1.add(Integer.valueOf(12612));
			var1.add(Integer.valueOf(2415));
			var1.add(Integer.valueOf(2416));
			var1.add(Integer.valueOf(2417));
			var1.add(Integer.valueOf(11663));
			var1.add(Integer.valueOf(11664));
			var1.add(Integer.valueOf(11665));
			var1.add(Integer.valueOf(13072));
			var1.add(Integer.valueOf(8839));
			var1.add(Integer.valueOf(13073));
			var1.add(Integer.valueOf(8840));
			var1.add(Integer.valueOf(8842));
			var1.add(Integer.valueOf(10547));
			var1.add(Integer.valueOf(10548));
			var1.add(Integer.valueOf(10549));
			var1.add(Integer.valueOf(10550));
			var1.add(Integer.valueOf(10551));
			var1.add(Integer.valueOf(10555));
			var1.add(Integer.valueOf(4151));
			var1.add(Integer.valueOf(12006));
			var1.add(Integer.valueOf(11808));
			var1.add(Integer.valueOf(11806));
			var1.add(Integer.valueOf(11804));
			var1.add(Integer.valueOf(11802));
			var1.add(Integer.valueOf(13271));
			var1.add(Integer.valueOf(4153));
			var1.add(Integer.valueOf(6528));
			var1.add(Integer.valueOf(6525));
			var1.add(Integer.valueOf(1249));
			var1.add(Integer.valueOf(11791));
			var1.add(Integer.valueOf(861));
			var1.add(Integer.valueOf(12788));
			var1.add(Integer.valueOf(11785));
			var1.add(Integer.valueOf(11235));
			var1.add(Integer.valueOf(11832));
			var1.add(Integer.valueOf(11834));
			var1.add(Integer.valueOf(11826));
			var1.add(Integer.valueOf(11828));
			var1.add(Integer.valueOf(11830));
			var1.add(Integer.valueOf(6918));
			var1.add(Integer.valueOf(6916));
			var1.add(Integer.valueOf(6924));
			var1.add(Integer.valueOf(6920));
			var1.add(Integer.valueOf(6922));
			var1.add(Integer.valueOf(12829));
			var1.add(Integer.valueOf(11283));
			var1.add(Integer.valueOf(11924));
			var1.add(Integer.valueOf(11926));
			var1.add(Integer.valueOf(4224));
			var1.add(Integer.valueOf(11840));
			var1.add(Integer.valueOf(2577));
			var1.add(Integer.valueOf(13227));
			var1.add(Integer.valueOf(13229));
			var1.add(Integer.valueOf(13231));
			var1.add(Integer.valueOf(6889));
			var1.add(Integer.valueOf(6914));
			var1.add(Integer.valueOf(6328));
			var1.add(Integer.valueOf(2581));
			var1.add(Integer.valueOf(4708));
			var1.add(Integer.valueOf(4712));
			var1.add(Integer.valueOf(4714));
			var1.add(Integer.valueOf(4710));
			var1.add(Integer.valueOf(4716));
			var1.add(Integer.valueOf(4720));
			var1.add(Integer.valueOf(4722));
			var1.add(Integer.valueOf(4718));
			var1.add(Integer.valueOf(4724));
			var1.add(Integer.valueOf(4728));
			var1.add(Integer.valueOf(4730));
			var1.add(Integer.valueOf(4726));
			var1.add(Integer.valueOf(4745));
			var1.add(Integer.valueOf(4749));
			var1.add(Integer.valueOf(4751));
			var1.add(Integer.valueOf(4747));
			var1.add(Integer.valueOf(4753));
			var1.add(Integer.valueOf(4757));
			var1.add(Integer.valueOf(4759));
			var1.add(Integer.valueOf(4755));
			var1.add(Integer.valueOf(4732));
			var1.add(Integer.valueOf(4736));
			var1.add(Integer.valueOf(4738));
			var1.add(Integer.valueOf(4734));
			var1.add(Integer.valueOf(1038));
			var1.add(Integer.valueOf(1040));
			var1.add(Integer.valueOf(1042));
			var1.add(Integer.valueOf(1044));
			var1.add(Integer.valueOf(1046));
			var1.add(Integer.valueOf(1048));
			var1.add(Integer.valueOf(11862));
			var1.add(Integer.valueOf(11863));
			var1.add(Integer.valueOf(12399));
			var1.add(Integer.valueOf(1053));
			var1.add(Integer.valueOf(1055));
			var1.add(Integer.valueOf(1057));
			var1.add(Integer.valueOf(11847));
			var1.add(Integer.valueOf(1050));
			var1.add(Integer.valueOf(13343));
			var1.add(Integer.valueOf(13344));
			var1.add(Integer.valueOf(1419));
			var1.add(Integer.valueOf(12845));
			var1.add(Integer.valueOf(9920));
			var1.add(Integer.valueOf(9925));
			var1.add(Integer.valueOf(9924));
			var1.add(Integer.valueOf(9923));
			var1.add(Integer.valueOf(9922));
			var1.add(Integer.valueOf(9921));
			var1.add(Integer.valueOf(13283));
			var1.add(Integer.valueOf(13284));
			var1.add(Integer.valueOf(13285));
			var1.add(Integer.valueOf(13286));
			var1.add(Integer.valueOf(13287));
			var1.add(Integer.valueOf(6665));
			var1.add(Integer.valueOf(6666));
			var1.add(Integer.valueOf(4566));
			var1.add(Integer.valueOf(11919));
			var1.add(Integer.valueOf(12956));
			var1.add(Integer.valueOf(12957));
			var1.add(Integer.valueOf(12958));
			var1.add(Integer.valueOf(12959));
			var1.add(Integer.valueOf(1037));
			var1.add(Integer.valueOf(13182));
			var1.add(Integer.valueOf(4565));
			var1.add(Integer.valueOf(12887));
			var1.add(Integer.valueOf(12888));
			var1.add(Integer.valueOf(12889));
			var1.add(Integer.valueOf(12890));
			var1.add(Integer.valueOf(12891));
			var1.add(Integer.valueOf(12353));
			var1.add(Integer.valueOf(12434));
			var1.add(Integer.valueOf(12337));
			var1.add(Integer.valueOf(12892));
			var1.add(Integer.valueOf(12893));
			var1.add(Integer.valueOf(12894));
			var1.add(Integer.valueOf(12895));
			var1.add(Integer.valueOf(12896));
			var1.add(Integer.valueOf(7537));
			var1.add(Integer.valueOf(8929));
			var1.add(Integer.valueOf(2997));
			var1.add(Integer.valueOf(8924));
			var1.add(Integer.valueOf(8925));
			var1.add(Integer.valueOf(8926));
			var1.add(Integer.valueOf(8927));
			var1.add(Integer.valueOf(8950));
			var1.add(Integer.valueOf(12412));
			var1.add(Integer.valueOf(12355));
			var1.add(Integer.valueOf(2631));
			var1.add(Integer.valueOf(2639));
			var1.add(Integer.valueOf(2641));
			var1.add(Integer.valueOf(12325));
			var1.add(Integer.valueOf(12323));
			var1.add(Integer.valueOf(12321));
			var1.add(Integer.valueOf(2643));
			var1.add(Integer.valueOf(11280));
			var1.add(Integer.valueOf(12319));
			var1.add(Integer.valueOf(12249));
			var1.add(Integer.valueOf(12251));
			var1.add(Integer.valueOf(12361));
			var1.add(Integer.valueOf(12428));
			var1.add(Integer.valueOf(12245));
			var1.add(Integer.valueOf(12430));
			var1.add(Integer.valueOf(12359));
			var1.add(Integer.valueOf(12540));
			var1.add(Integer.valueOf(2645));
			var1.add(Integer.valueOf(2647));
			var1.add(Integer.valueOf(2649));
			var1.add(Integer.valueOf(12299));
			var1.add(Integer.valueOf(12301));
			var1.add(Integer.valueOf(12303));
			var1.add(Integer.valueOf(12305));
			var1.add(Integer.valueOf(12307));
			var1.add(Integer.valueOf(10316));
			var1.add(Integer.valueOf(10318));
			var1.add(Integer.valueOf(10322));
			var1.add(Integer.valueOf(10324));
			var1.add(Integer.valueOf(12375));
			var1.add(Integer.valueOf(12377));
			var1.add(Integer.valueOf(12379));
			var1.add(Integer.valueOf(12373));
			var1.add(Integer.valueOf(12363));
			var1.add(Integer.valueOf(12365));
			var1.add(Integer.valueOf(12367));
			var1.add(Integer.valueOf(12369));
			var1.add(Integer.valueOf(12371));
			var1.add(Integer.valueOf(12518));
			var1.add(Integer.valueOf(12522));
			var1.add(Integer.valueOf(12524));
			var1.add(Integer.valueOf(12526));
			var1.add(Integer.valueOf(12528));
			var1.add(Integer.valueOf(12530));
			var1.add(Integer.valueOf(12532));
			var1.add(Integer.valueOf(12534));
			var1.add(Integer.valueOf(12536));
			var1.add(Integer.valueOf(12528));
			var1.add(Integer.valueOf(12849));
			var1.add(Integer.valueOf(12757));
			var1.add(Integer.valueOf(12759));
			var1.add(Integer.valueOf(12761));
			var1.add(Integer.valueOf(12763));
			var1.add(Integer.valueOf(12769));
			var1.add(Integer.valueOf(12771));
			var1.add(Integer.valueOf(12802));
			var1.add(Integer.valueOf(12798));
			var1.add(Integer.valueOf(9244));
			var1.add(Integer.valueOf(9243));
			var1.add(Integer.valueOf(892));
			var1.add(Integer.valueOf(11212));
			var1.add(Integer.valueOf(4740));
			var1.add(Integer.valueOf(868));
			var1.add(Integer.valueOf(811));
			var1.add(Integer.valueOf(10034));
			this.field_f_462 = var1.size() * 504895135;
			this.field_m_456 = new int[var1.size()];
			this.field_a_449 = new int[var1.size()];

			for (int var2 = 0; var2 < var1.size(); ++var2) {
				this.field_m_456[var2] = var2;
				this.field_a_449[var2] = ((Integer) var1.get(var2)).intValue();
			}
		}

	}

	void method_d_void(final Buffer rsbytebuffer, final int i, final int i_9_) {
		try {
			if (i == 1) {
				field_z_451 = (char) rsbytebuffer.get();
			} else if (i == 2) {
				field_y_452 = (char) rsbytebuffer.get();
			} else if (i == 3) {
				field_e_453 = rsbytebuffer.getString();
			} else if (i == 4) {
				field_g_454 = rsbytebuffer.getInt() * -326361625;
			} else if (i == 5) {
				field_f_462 = rsbytebuffer.getShort() * 1947694829;
				field_m_456 = new int[field_f_462 * -798271771];
				field_h_458 = new String[-798271771 * field_f_462];
				for (int i_10_ = 0; i_10_ < (field_f_462 * -798271771); i_10_++) {
					field_m_456[i_10_] = rsbytebuffer.getInt();
					field_h_458[i_10_] = rsbytebuffer.getString();
				}
			} else if (i == 6) {
				field_f_462 = rsbytebuffer.getShort() * 1947694829;
				field_m_456 = new int[-798271771 * field_f_462];
				field_a_449 = new int[-798271771 * field_f_462];
				for (int i_11_ = 0; i_11_ < (-798271771 * field_f_462); i_11_++) {
					field_m_456[i_11_] = rsbytebuffer.getInt();
					field_a_449[i_11_] = rsbytebuffer.getInt();
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ay.d()");
		}
	}

	static final void npcScreenPos(final Actor character, final int i, final int i_12_) {
		try {
			Class_fm.translateToCamera((-2103184911 * character.worldPosX), (character.worldPosY * 2088773389), i);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ay.bo()");
		}
	}

	public static int method_e_int(int i, int i_13_, final int i_14_) {
		int i_15_;
		try {
			int i_16_ = 0;
			for (/**/; i_13_ > 0; i_13_--) {
				i_16_ = (i_16_ << 1) | (i & 0x1);
				i >>>= 1;
			}
			i_15_ = i_16_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ay.e()");
		}
		return i_15_;
	}

	static void method_y_void(final int i, final boolean bool, final int i_17_, final boolean bool_18_,
			final int i_19_) {
		try {
			if (World.worlds != null) {
				Actor.method_e_void(0, World.worlds.length - 1, i, bool, i_17_, bool_18_, (short) -818);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ay.y()");
		}
	}

	public static int nameHash(final CharSequence charsequence, final int i) {
		int i_20_;
		try {
			final int i_21_ = charsequence.length();
			int i_22_ = 0;
			for (int i_23_ = 0; i_23_ < i_21_; i_23_++) {
				i_22_ = (((i_22_ << 5) - i_22_)
						+ MachineInformationNode.method_n_byte(charsequence.charAt(i_23_), (byte) 32));
			}
			i_20_ = i_22_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ay.e()");
		}
		return i_20_;
	}
}
