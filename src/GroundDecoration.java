/* GroundDecoration - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class GroundDecoration {
	static final int field_x_845 = 8;
	int config;
	int field_y_847;
	public Renderable renderable;
	public int uid;
	int field_n_850;
	int field_d_851;
	public static final int field_dq_852 = 59;
	public static final int field_h_853 = 13;

	static final int method_h_int(final int i, final int i_0_, final int i_1_) {
		int i_2_;
		try {
			int i_3_ = ((ClientError.method_l_int(45365 + i, i_0_ + 91923, 4, 440064304) - 128) + ((ClientError.method_l_int(i + 10294, i_0_ + 37821, 2, 736205296) - 128) >> 1) + ((ClientError.method_l_int(i, i_0_, 1, 1550834222) - 128) >> 2));
			i_3_ = 35 + (int) (i_3_ * 0.3);
			if (i_3_ < 10) {
				i_3_ = 10;
			} else if (i_3_ > 60) {
				i_3_ = 60;
			}
			i_2_ = i_3_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "cf.h()");
		}
		return i_2_;
	}

	static final void handlePlayerUpdateFlags(final int i) {
		try {
			for (int i_4_ = 0; i_4_ < (client.field_gr_2808 * 2070991001); i_4_++) {
				final int index = client.playersNeedUpdating[i_4_];
				final Player player = client.localPlayers[index];
				int flags = client.inbound.get();
				if ((flags & 0x80) != 0) {
					flags += client.inbound.get() << 8;
				}
				if ((flags & 0x200) != 0) {
					final int i_7_ = client.inbound.getLEShort();
					final int i_8_ = client.inbound.get();
					player.method_q_void(i_7_, i_8_, 303796053 * client.currentCycle, -1833607954);
					player.hpBarExpire = 1958775900 + (client.currentCycle * -1709484279);
					player.currentHp = (client.inbound.getByteC() * -1867660669);
					player.maxHp = (client.inbound.getByteC() * -1364704921);
				}
				if ((flags & 0x10) != 0) {// chat
					final int i_9_ = client.inbound.getLEShort();

					int perms = client.inbound.getByteC();

					System.out.println("MY PERMS: "+perms);
					final Permissions permission = ((Permissions) (Friend.identify(Permissions.getPrivileges(), perms)));
					final boolean autoTalking = client.inbound.getByteA() == 1;
					final int i_10_ = client.inbound.getByteC();
					final int i_11_ = -1485345105 * client.inbound.position;
					if ((player.name != null) && (player.composite != null)) {
						boolean bool_12_ = false;
						if (permission.ignorable && Class_r.isIgnored((player.name))) {
							bool_12_ = true;
						}
						if (!bool_12_ && ((-801822035 * client.field_gk_2804) == 0) && !player.spotAnimating) {
							client.field_aa_2749.position = 0;
							client.inbound.getReverseA(client.field_aa_2749.buffer, 0, i_10_, 1418704368);
							client.field_aa_2749.position = 0;
							final String string = (TypeFace.method_m_String(Class_l.method_m_String(Class_cx.method_n_String((client.field_aa_2749), -1557449899), 573901825)));
							player.speech = string.trim();
							player.field_at_232 = -263898215 * (i_9_ >> 8);
							player.field_aa_233 = (i_9_ & 0xff) * -580944453;
							player.field_az_231 = -1893648438;
							player.isAutoTalking = autoTalking;
							player.field_ac_230 = ((player != Class_ci.myPlayer) && permission.ignorable && ("" != client.field_ln_2909) && (string.toLowerCase().indexOf(client.field_ln_2909) == -1));
							int messageType;
							if (permission.overridesSettings) {
								messageType = autoTalking ? 91 : 1;
							} else {
								messageType = autoTalking ? 90 : 2;
							}
							if ((permission.ordinal * 1941325631) != -1) {
								final int rights = 1941325631 * permission.ordinal;
								final String string_15_ = new StringBuilder("<img=").append(rights).append(">").toString();
								GameStub.sendMessage(messageType, new StringBuilder(string_15_).append(player.name).toString(), string);
							} else
								GameStub.sendMessage(messageType, player.name, string);
						}
					}
					client.inbound.position = -685856689 * (i_10_ + i_11_);
				}
				if ((flags & 0x8) != 0) {
					final int i_16_ = client.inbound.getLEShort();
					final int i_17_ = client.inbound.get();
					player.method_q_void(i_16_, i_17_, 303796053 * client.currentCycle, 872567333);
					player.hpBarExpire = (-1709484279 * client.currentCycle) + 1958775900;
					player.currentHp = (client.inbound.getByteS() * -1867660669);
					player.maxHp = (client.inbound.get() * -1364704921);
				}
				if ((flags & 0x4) != 0) {
					int i_18_ = client.inbound.getShort();
					if (i_18_ == 65535) {
						i_18_ = -1;
					}
					final int i_19_ = client.inbound.getByteS();
					Vector3.animatePlayer(player, i_18_, i_19_, (byte) 9);
				}
				if ((flags & 0x40) != 0) {// force chat
					player.speech = client.inbound.getString();
					if (player.speech.charAt(0) == '~') {
						player.speech = player.speech.substring(1);
						GameStub.sendMessage(2, player.name, player.speech);
					} else if (player == Class_ci.myPlayer) {
						GameStub.sendMessage(2, player.name, player.speech);
					}
					player.isAutoTalking = false;
					player.field_at_232 = 0;
					player.field_aa_233 = 0;
					player.field_az_231 = -1893648438;
				}
				if ((flags & 0x400) != 0) {// gfx
					player.gfxId = (client.inbound.getShort() * 166388535);
					final int i_20_ = client.inbound.getInt();
					player.field_bu_255 = 1077750705 * (i_20_ >> 16);
					player.field_bn_254 = (((i_20_ & 0xffff) + (client.currentCycle * 303796053)) * -313561965);
					player.field_br_239 = 0;
					player.field_bd_264 = 0;
					if ((640586139 * player.field_bn_254) > (303796053 * client.currentCycle)) {
						player.field_br_239 = 689549715;
					}
					if ((1625440903 * player.gfxId) == 65535) {
						player.gfxId = -166388535;
					}
				}
				if ((flags & 0x1) != 0) {// appearance
					
					final int blockOffset = client.inbound.getByteC();
					
					final byte[] tmp = new byte[blockOffset];
					final Buffer buffer = new Buffer(tmp);
					client.inbound.getInReverse(tmp, 0, blockOffset);
					client.APPEARANCES[index] = buffer;
					player.decodeAppearance(buffer, 10209464);
				}
				if ((flags & 0x2) != 0) { // interacting entity
					player.interactingIndex = (client.inbound.getShortA() * 2044561997);
					if ((-313868667 * player.interactingIndex) == 65535) {
						player.interactingIndex = -2044561997;
					}
				}

                if ((flags & 0x800) != 0) { // user tag mask
                    for(int j = 0; j < 3; j++) {
                        player.tags[j] = client.inbound.getString();
                    }
                }

				if ((flags & 0x20) != 0) {// face coordinate
					player.focalX = (client.inbound.getShortA() * 1117690639);
					player.focalY = (client.inbound.getShortA() * -1473616763);
				}
				if ((flags & 0x100) != 0) {// force movement
					player.forcedFirstX = (client.inbound.getByteC() * 617805341);
					player.forcedFirstY = (client.inbound.getByteC() * 1278536313);
					player.forcedSecondX = (client.inbound.getByteC() * 1730953493);
					player.forcedSecondY = (client.inbound.getByteC() * -1760059475);
					player.forcedToSpeed = (client.inbound.getLEShortA() + (303796053 * client.currentCycle)) * 17230545;
					player.forcedReturnSpeed = (client.inbound.getShortA() + (client.currentCycle * 303796053)) * 1964220715;
					player.forcedDirection = (client.inbound.getByteA() * -995333127);
					player.queueXPos = 1628553725;
					player.queueYPos = 0;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "cf.bh()");
		}
	}

	GroundDecoration() {
		/* empty */
	}
}
