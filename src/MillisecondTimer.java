/* Class_eq - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class MillisecondTimer extends Timer {
	long start = Renderable.getCurrentTime(1375155712) * -8989285757311255745L;
	long[] field_n_2199 = new long[10];
	int field_z_2200 = -789359025;
	int field_d_2201 = -1977152256;
	int field_e_2202 = 0;
	int field_g_2203;
	public static final int field_ds_2204 = 46;

	@Override
	int getDelay(final int i, final int i_0_, final byte i_1_) {
		int i_2_;
		try {
			final int i_3_ = -462225467 * this.field_d_2201;
			final int i_4_ = 2044199087 * this.field_z_2200;
			this.field_d_2201 = -572144836;
			this.field_z_2200 = -789359025;
			this.start = Renderable.getCurrentTime(386271761) * -8989285757311255745L;
			if (0L == (this.field_n_2199[this.field_g_2203 * 1608193619])) {
				this.field_d_2201 = i_3_ * 227157773;
				this.field_z_2200 = i_4_ * -789359025;
			} else if ((169156857743111359L * this.start) > (this.field_n_2199[1608193619 * this.field_g_2203])) {
				this.field_d_2201 = 227157773 * (int) (i * 2560 / ((this.start * 169156857743111359L) - (this.field_n_2199[(this.field_g_2203 * 1608193619)])));
			}
			if ((-462225467 * this.field_d_2201) < 25) {
				this.field_d_2201 = 1383977029;
			}
			if ((this.field_d_2201 * -462225467) > 256) {
				this.field_d_2201 = -1977152256;
				this.field_z_2200 = (int) (i - (((169156857743111359L * this.start) - (this.field_n_2199[1608193619 * (this.field_g_2203)])) / 10L)) * -789359025;
			}
			if ((this.field_z_2200 * 2044199087) > i) {
				this.field_z_2200 = i * -789359025;
			}
			this.field_n_2199[(this.field_g_2203 * 1608193619)] = 169156857743111359L * this.start;
			this.field_g_2203 = ((((1608193619 * this.field_g_2203) + 1) % 10) * -1892573733);
			if ((this.field_z_2200 * 2044199087) > 1) {
				for (int i_5_ = 0; i_5_ < 10; i_5_++) {
					if (this.field_n_2199[i_5_] != 0L) {
						this.field_n_2199[i_5_] += this.field_z_2200 * 2044199087;
					}
				}
			}
			if ((2044199087 * this.field_z_2200) < i_0_) {
				this.field_z_2200 = -789359025 * i_0_;
			}
			Class_fc.sleep(this.field_z_2200 * 2044199087);
			int i_6_ = 0;
			for (/**/; (1627969037 * this.field_e_2202) < 256; this.field_e_2202 += this.field_d_2201 * 1786043033) {
				i_6_++;
			}
			this.field_e_2202 = -793351995 * ((1627969037 * this.field_e_2202) & 0xff);
			i_2_ = i_6_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "eq.z()");
		}
		return i_2_;
	}

	static final void updateNpcs(final boolean biggerViewport, final int i) {
		try {
			while (client.inbound.availableBits((client.current_packet_size * 1815751203)) >= 27) {
				final int index = client.inbound.getBits(15);
				if (index == 32767) {
					break;
				}
				boolean newNpc = false;
				if (client.npcs[index] == null) {
					client.npcs[index] = new Npc();
					newNpc = true;
				}
				final Npc npc = client.npcs[index];
				client.npcIndexArray[((client.localNpcCount += -991444399) * 1308149425) - 1] = index;
				npc.cycle = client.currentCycle * 260564055;
				int dy;
				if (biggerViewport) {
					dy = client.inbound.getBits(8);
					if (dy > 127) {
						dy -= 256;// here
					}
				} else {
					dy = client.inbound.getBits(5);
					if (dy > 15) {
						dy -= 32;// 5 bits it does a subtract ion of 2^5 just somethin i noticed lol
					}
				}
				int dx;
				if (biggerViewport) {
					dx = client.inbound.getBits(8);
					if (dx > 127) {
						dx -= 256;
					}
				} else {
					dx = client.inbound.getBits(5);
					if (dx > 15) {
						dx -= 32;
					}
				}
				final int updateRequiredBit = client.inbound.getBits(1);
				if (updateRequiredBit == 1) {
					client.playersNeedUpdating[((client.field_gr_2808 += 990413737) * 2070991001) - 1] = index;
				}
				final int teleportBit = client.inbound.getBits(1); 
				npc.composite = NpcDefinitions.getNpcComposite(client.inbound.getBits(14));
				final int orientation = (client.DIRECTIONS[client.inbound.getBits(3)]);
				if (newNpc) {
					npc.orientation = ((npc.field_b_217 = orientation * 1256908405) * -2133891525);
				}
				npc.size = 831705667 * npc.composite.occupiedTiles;
				npc.field_bx_249 = 988160639 * npc.composite.field_ax_492;
				if ((npc.field_bx_249 * -2063870277) == 0) {
					npc.field_b_217 = 0;
				}
				npc.field_ae_223 = npc.composite.field_q_475 * 54155165;
				npc.turnAnimation = -296529403 * npc.composite.turnAnimation;
				npc.walkAnimation = npc.composite.walkAnimation * -268205719;
				npc.turn180 = -1109178395 * npc.composite.turn180;
				npc.standAnimation = npc.composite.standAnimation * -424451523;
				npc.standTurnAnimation = npc.composite.field_l_484 * 1385619595;
				npc.field_ak_222 = npc.composite.field_u_474 * 1924762163;
				npc.move(dx + (Class_ci.myPlayer.walkQueueX[0]), (Class_ci.myPlayer.walkQueueY[0] + dy), teleportBit == 1);
			}
			client.inbound.endBitMode();
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "eq.bi()");
		}
	}

	@Override
	public void reset() {
		try {
			for (int i_14_ = 0; i_14_ < 10; i_14_++) {
				this.field_n_2199[i_14_] = 0L;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "eq.d()");
		}
	}

	MillisecondTimer() {
		for (int i = 0; i < 10; i++) {
			this.field_n_2199[i] = this.start * 169156857743111359L;
		}
	}

	@SuppressWarnings("rawtypes")
	static String method_f_String(final byte i) {
		String string;
		try {
			String string_15_ = "";
			final Iterator iterator = Class_l.gameMessagesTable.iterator();
			while (iterator.hasNext()) {
				final GameMessage gamemessage = (GameMessage) iterator.next();
				string_15_ = new StringBuilder(string_15_).append(gamemessage.owner).append(':').append(gamemessage.message).append('\n').toString();
			}
			string = string_15_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "eq.f()");
		}
		return string;
	}

	public static int method_y_int(final CharSequence charsequence, final int i, final int i_16_, final byte[] is, final int i_17_, final int i_18_) {
		int i_19_;
		try {
			final int i_20_ = i_16_ - i;
			for (int i_21_ = 0; i_21_ < i_20_; i_21_++) {
				final char c = charsequence.charAt(i_21_ + i);
				if (((c <= 0) || (c >= '\u0080')) && ((c < '\u00a0') || (c > '\u00ff'))) {
					if (c == '\u20ac') {
						is[i_21_ + i_17_] = (byte) -128;
					} else if (c == '\u201a') {
						is[i_17_ + i_21_] = (byte) -126;
					} else if (c == '\u0192') {
						is[i_21_ + i_17_] = (byte) -125;
					} else if (c == '\u201e') {
						is[i_21_ + i_17_] = (byte) -124;
					} else if (c == '\u2026') {
						is[i_17_ + i_21_] = (byte) -123;
					} else if (c == '\u2020') {
						is[i_17_ + i_21_] = (byte) -122;
					} else if (c == '\u2021') {
						is[i_21_ + i_17_] = (byte) -121;
					} else if (c == '\u02c6') {
						is[i_21_ + i_17_] = (byte) -120;
					} else if (c == '\u2030') {
						is[i_21_ + i_17_] = (byte) -119;
					} else if (c == '\u0160') {
						is[i_21_ + i_17_] = (byte) -118;
					} else if (c == '\u2039') {
						is[i_21_ + i_17_] = (byte) -117;
					} else if (c == '\u0152') {
						is[i_17_ + i_21_] = (byte) -116;
					} else if (c == '\u017d') {
						is[i_21_ + i_17_] = (byte) -114;
					} else if (c == '\u2018') {
						is[i_17_ + i_21_] = (byte) -111;
					} else if (c == '\u2019') {
						is[i_21_ + i_17_] = (byte) -110;
					} else if (c == '\u201c') {
						is[i_21_ + i_17_] = (byte) -109;
					} else if (c == '\u201d') {
						is[i_17_ + i_21_] = (byte) -108;
					} else if (c == '\u2022') {
						is[i_17_ + i_21_] = (byte) -107;
					} else if (c == '\u2013') {
						is[i_21_ + i_17_] = (byte) -106;
					} else if (c == '\u2014') {
						is[i_21_ + i_17_] = (byte) -105;
					} else if (c == '\u02dc') {
						is[i_17_ + i_21_] = (byte) -104;
					} else if (c == '\u2122') {
						is[i_17_ + i_21_] = (byte) -103;
					} else if (c == '\u0161') {
						is[i_17_ + i_21_] = (byte) -102;
					} else if (c == '\u203a') {
						is[i_21_ + i_17_] = (byte) -101;
					} else if (c == '\u0153') {
						is[i_17_ + i_21_] = (byte) -100;
					} else if (c == '\u017e') {
						is[i_21_ + i_17_] = (byte) -98;
					} else if (c == '\u0178') {
						is[i_17_ + i_21_] = (byte) -97;
					} else {
						is[i_21_ + i_17_] = (byte) 63;
					}
				} else {
					is[i_21_ + i_17_] = (byte) c;
				}
			}
			i_19_ = i_20_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "eq.y()");
		}
		return i_19_;
	}

	static byte[] arraycopy(final byte[] is, final byte i) {
		byte[] is_22_;
		try {
			final int i_23_ = is.length;
			final byte[] is_24_ = new byte[i_23_];
			System.arraycopy(is, 0, is_24_, 0, i_23_);
			is_22_ = is_24_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "eq.l()");
		}
		return is_22_;
	}
}
