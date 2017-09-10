

/* Class_b - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ClanMember extends Node {
	int world;
	String formattedName;
	public static final int field_bp_806 = 9;
	String name;
	static byte[][][] field_f_808;
	static final int field_aq_809 = 45;
	public static final int field_ev_810 = 32;
	public static final int field_j_811 = 128;
	public static final int field_dm_812 = 224;
	static final int field_az_813 = 0;
	byte rank;

	static final void renderRegion(final boolean bool, final int i) {
		try {
			client.inDynamicRegion = bool;
			if (!client.inDynamicRegion) {
				final int i_0_ = client.inbound.getLEShortA();
				int i_1_ = (((1815751203 * client.current_packet_size) - (client.inbound.position * -1485345105)) / 16);
				Class_dd.loaded_xteas = new int[i_1_][4];
				for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
					for (int i_3_ = 0; i_3_ < 4; i_3_++) {
						Class_dd.loaded_xteas[i_2_][i_3_] = client.inbound.getInt();
					}
				}
				final int i_4_ = client.inbound.getLEShort();
				final int i_5_ = client.inbound.getByteC();
				final int i_6_ = client.inbound.getShortA();
				final int i_7_ = client.inbound.getLEShortA();
				
				GameMessage.loadedRegionIds = new int[i_1_];
				Projectile.mapIndices = new int[i_1_];
				ItemComposite.landscapeIndices = new int[i_1_];
				Script.mapDataBuffer = new byte[i_1_][];
				Class_w.landscapeDataBuffer = new byte[i_1_][];
				boolean bool_8_ = false;
				if ((((i_6_ / 8) == 48) || ((i_6_ / 8) == 49)) && ((i_7_ / 8) == 48)) {
					bool_8_ = true;
				}
				if (((i_6_ / 8) == 48) && ((i_7_ / 8) == 148)) {
					bool_8_ = true;
				}
				i_1_ = 0;
				for (int i_9_ = (i_6_ - 6) / 8; i_9_ <= ((i_6_ + 6) / 8); i_9_++) {
					for (int i_10_ = (i_7_ - 6) / 8; i_10_ <= ((i_7_ + 6) / 8); i_10_++) {
						final int i_11_ = (i_9_ << 8) + i_10_;
						//System.out.println("Region: " + i_11_);
						if (!bool_8_ || ((i_10_ != 49) && (i_10_ != 149) && (i_10_ != 147) && (i_9_ != 50) && ((i_9_ != 49) || (i_10_ != 47)))) {
							GameMessage.loadedRegionIds[i_1_] = i_11_;
							Projectile.mapIndices[i_1_] = (ItemContainer.terrainIndex.getByName(new StringBuilder("m").append(i_9_).append("_").append(i_10_).toString()));
							ItemComposite.landscapeIndices[i_1_] = (ItemContainer.terrainIndex.getByName(new StringBuilder("l").append(i_9_).append("_").append(i_10_).toString()));
							i_1_++;
						}
					}
				}
				Class_ae.method_ba_void(i_6_, i_7_, i_5_, i_0_, i_4_, -1868898070);
			} else {
				client.inbound.startBitMode();
				for (int i_12_ = 0; i_12_ < 4; i_12_++) {
					for (int i_13_ = 0; i_13_ < 13; i_13_++) {
						for (int i_14_ = 0; i_14_ < 13; i_14_++) {
							final int i_15_ = client.inbound.getBits(1);
							if (i_15_ == 1) {
								client.copiedRegionChunks[i_12_][i_13_][i_14_] = client.inbound.getBits(26);
							} else {
								client.copiedRegionChunks[i_12_][i_13_][i_14_] = -1;
							}
						}
					}
				}
				client.inbound.endBitMode();
				int i_16_ = (((1815751203 * client.current_packet_size) - (-1485345105 * client.inbound.position)) / 16);
				Class_dd.loaded_xteas = new int[i_16_][4];
				for (int i_17_ = 0; i_17_ < i_16_; i_17_++) {
					for (int i_18_ = 0; i_18_ < 4; i_18_++) {
						Class_dd.loaded_xteas[i_17_][i_18_] = client.inbound.getInt1();
					}
				}
				final int i_19_ = client.inbound.getShortA();
				final int i_20_ = client.inbound.get();
				final int i_21_ = client.inbound.getShortA();
				final int i_22_ = client.inbound.getShortA();
				final int i_23_ = client.inbound.getShort();
				GameMessage.loadedRegionIds = new int[i_16_];
				Projectile.mapIndices = new int[i_16_];
				ItemComposite.landscapeIndices = new int[i_16_];
				Script.mapDataBuffer = new byte[i_16_][];
				Class_w.landscapeDataBuffer = new byte[i_16_][];
				i_16_ = 0;
				for (int i_24_ = 0; i_24_ < 4; i_24_++) {
					for (int i_25_ = 0; i_25_ < 13; i_25_++) {
						for (int i_26_ = 0; i_26_ < 13; i_26_++) {
							final int i_27_ = (client.copiedRegionChunks[i_24_][i_25_][i_26_]);
							if (i_27_ != -1) {
								final int i_28_ = (i_27_ >> 14) & 0x3ff;
								final int i_29_ = (i_27_ >> 3) & 0x7ff;
								int i_30_ = ((i_28_ / 8) << 8) + (i_29_ / 8);
								for (int i_31_ = 0; i_31_ < i_16_; i_31_++) {
									if (GameMessage.loadedRegionIds[i_31_] == i_30_) {
										i_30_ = -1;
										break;
									}
								}
								if (i_30_ != -1) {
									GameMessage.loadedRegionIds[i_16_] = i_30_;
									final int i_32_ = (i_30_ >> 8) & 0xff;
									final int i_33_ = i_30_ & 0xff;
									Projectile.mapIndices[i_16_] = (ItemContainer.terrainIndex.getByName(new StringBuilder("m").append(i_32_).append("_").append(i_33_).toString()));
									ItemComposite.landscapeIndices[i_16_] = (ItemContainer.terrainIndex.getByName(new StringBuilder("l").append(i_32_).append("_").append(i_33_).toString()));
									i_16_++;
								}
							}
						}
					}
				}
				Class_ae.method_ba_void(i_21_, i_23_, i_20_, i_19_, i_22_, -1779130470);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "b.bj()");
		}
	}

	static char method_z_char(final char c, final int i) {
		char c_34_;
		try {
			switch (c) {
			case ' ':
			case '-':
			case '_':
			case '\u00a0':
				return '_';
			case '#':
			case '[':
			case ']':
				return c;
			case '\u00c0':
			case '\u00c1':
			case '\u00c2':
			case '\u00c3':
			case '\u00c4':
			case '\u00e0':
			case '\u00e1':
			case '\u00e2':
			case '\u00e3':
			case '\u00e4':
				return 'a';
			case '\u00c7':
			case '\u00e7':
				return 'c';
			case '\u00c8':
			case '\u00c9':
			case '\u00ca':
			case '\u00cb':
			case '\u00e8':
			case '\u00e9':
			case '\u00ea':
			case '\u00eb':
				return 'e';
			case '\u00cd':
			case '\u00ce':
			case '\u00cf':
			case '\u00ed':
			case '\u00ee':
			case '\u00ef':
				return 'i';
			case '\u00d1':
			case '\u00f1':
				return 'n';
			case '\u00d2':
			case '\u00d3':
			case '\u00d4':
			case '\u00d5':
			case '\u00d6':
			case '\u00f2':
			case '\u00f3':
			case '\u00f4':
			case '\u00f5':
			case '\u00f6':
				return 'o';
			case '\u00d9':
			case '\u00da':
			case '\u00db':
			case '\u00dc':
			case '\u00f9':
			case '\u00fa':
			case '\u00fb':
			case '\u00fc':
				return 'u';
			case '\u00df':
				return 'b';
			case '\u00ff':
			case '\u0178':
				return 'y';
			default:
				c_34_ = java.lang.Character.toLowerCase(c);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "b.z()");
		}
		return c_34_;
	}

	ClanMember() {
		/* empty */
	}
}
