/* Renderable - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Renderable extends CacheableNode {
	protected static int field_qa_763;
	static int field_fn_764;
	static final int field_cq_765 = 105;
	public int modelHeight = 1372986568;

	protected Model getModel() {
		return null;
	}

	void method_o_void(final int i, final int i_0_, final int i_1_, final int i_2_, final int i_3_, final int i_4_, final int i_5_, final int i_6_, final int i_7_) {
		try {
			final Model onscreenmodel = getModel();
			if (onscreenmodel != null) {
				modelHeight = 1 * onscreenmodel.modelHeight;
				onscreenmodel.method_o_void(i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "cb.o()");
		}
	}

	public static synchronized long getCurrentTime(final int i) {
		long l;
		try {
			final long l_8_ = System.currentTimeMillis();
			if (l_8_ < (-5856097605140330637L * Class_dg.field_n_1611)) {
				Class_dg.field_d_1616 += (5537043670534184147L * ((-5856097605140330637L * Class_dg.field_n_1611) - l_8_));
			}
			Class_dg.field_n_1611 = l_8_ * -8689294799168916037L;
			l = (-2645442824276223141L * Class_dg.field_d_1616) + l_8_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "cb.n()");
		}
		return l;
	}

	static void method_d_void(final byte i) {
		try {
			if (Class_ax.field_n_441) {
				Class_ax.field_z_427 = null;
				Class_ax.field_y_416 = null;
				Class_eg.field_e_2114 = null;
				Class_v.field_g_1446 = null;
				ImageColorModel.field_f_541 = null;
				Class_ax.field_m_419 = null;
				Class_ax.field_a_420 = null;
				Class_ax.field_h_421 = null;
				Friend.field_l_1095 = null;
				Class_al.background = null;
				Class_i.flags = null;
				Class_a.arrows = null;
				Class_ax.stars = null;
				Class_ey.field_bo_2262 = null;
				Class_du.field_c_1720 = null;
				Item.field_p_43 = null;
				ISAACCipher.field_o_1659 = null;
				Menu.field_v_1537 = null;
				Class_al.field_w_182 = null;
				SceneTile.field_i_1122 = null;
				Class_o.field_ad_1236 = null;
				Class_h.field_ak_1026 = null;
				Class_fa.field_e_2278 = 1243386265;
				Region.field_g_1012 = null;
				Class_eb.field_f_1772 = -877461501;
				Npc.field_m_298 = -85078463;
				Class_eh.field_a_2122 = 0;
				Class_e.field_l_932 = false;
				Class_de.field_h_1599 = 2049577394;
				GroundItem.method_d_void(true, 2118697276);
				Class_ax.field_n_441 = false;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "cb.d()");
		}
	}

	protected Renderable() {
		/* empty */
	}

	static void method_cw_void(final int i, final String string, final byte i_9_) {
		try {
			boolean bool = false;
			for (int i_10_ = 0; i_10_ < (client.localPlayerCount * 2000365659); i_10_++) {
				final Player player = client.localPlayers[client.playerIndexArray[i_10_]];
				if (player.name.contains("<col")) {
					player.name = player.name.substring(12);
				}
				if ((player != null) && (player.name != null) && player.name.equalsIgnoreCase(string)) {
					if (i == 1) {
						client.encryptedBuffer.writeOpcode(250);
						client.encryptedBuffer.putByteS(0, 1928380133);
						client.encryptedBuffer.putLEShortA((client.playerIndexArray[i_10_]), 520236428);
					} else if (i == 4) {
						client.encryptedBuffer.writeOpcode(111);
						client.encryptedBuffer.putShortA((client.playerIndexArray[i_10_]), (byte) -115);
						client.encryptedBuffer.putByteC(0);
					} else if (i == 6) {
						client.encryptedBuffer.writeOpcode(28);
						client.encryptedBuffer.putByteS(0, 475011493);
						client.encryptedBuffer.putShortA((client.playerIndexArray[i_10_]), (byte) -27);
					} else if (i == 7) {
						client.encryptedBuffer.writeOpcode(137);
						client.encryptedBuffer.putShort((client.playerIndexArray[i_10_]));
						client.encryptedBuffer.putByteS(0, 769643388);
					}
					bool = true;
					break;
				}
			}
			if (!bool) {
				GameStub.sendMessage(4, "", new StringBuilder(MenuText.field_ef_1932).append(string).toString());
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "cb.cw()");
		}
	}

	static Class_v[] method_n_vArray(final int i) {
		Class_v[] class_vs;
		try {
			class_vs = new Class_v[] { Class_v.field_z_1447, Class_v.field_d_1441, Class_v.field_n_1442, Class_v.aClass87_957 };
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "cb.n()");
		}
		return class_vs;
	}
}
