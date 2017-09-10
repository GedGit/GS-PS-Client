/* Class_cd - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
 

 
public class WidgetNode extends Node {
    static Socket field_cq_796;
    int field_d_797;
    static final int field_ic_798 = 500;
    int[][] field_y_799;
    int field_n_800;
    int[] field_z_801;
    public static final int field_i_802 = 64;
    static final int field_lr_803 = 100;
 
    public static int method_z_int(final int i, final int i_0_) {
        int i_1_;
        try {
            i_1_ = (i >> 11) & 0x3f;
        } catch (final RuntimeException runtimeexception) {
            throw GameCanvas.error(runtimeexception, "cd.z()");
        }
        return i_1_;
    }
 
    WidgetNode(final int i, final byte[] is) {
        this.field_n_800 = -1815613337 * i;
        final Buffer rsbytebuffer = new Buffer(is);
        this.field_d_797 = rsbytebuffer.get() * 2114293777;
        this.field_z_801 = new int[this.field_d_797 * 2012045553];
        this.field_y_799 = new int[2012045553 * this.field_d_797][];
        for (int i_2_ = 0; i_2_ < (this.field_d_797 * 2012045553); i_2_++) {
            this.field_z_801[i_2_] = rsbytebuffer.get();
        }
        for (int i_3_ = 0; i_3_ < (2012045553 * this.field_d_797); i_3_++) {
            this.field_y_799[i_3_] = new int[rsbytebuffer.get()];
        }
        for (int i_4_ = 0; i_4_ < (2012045553 * this.field_d_797); i_4_++) {
            for (int i_5_ = 0; i_5_ < this.field_y_799[i_4_].length; i_5_++) {
                this.field_y_799[i_4_][i_5_] = rsbytebuffer.get();
            }
        }
    }
 
    public static FloorOverlay getOverlay(final int i) {
        FloorOverlay class_aa;
        try {
            FloorOverlay class_aa_7_ = (FloorOverlay) FloorOverlay.field_d_1.method_n_gb(i);
            if (class_aa_7_ != null) {
                return class_aa_7_;
            }
            final byte[] is = FloorOverlay.field_n_4.getArchive(1, i);
            class_aa_7_ = new FloorOverlay();
            if (is != null) {
                class_aa_7_.method_y_void(new Buffer(is), i, (byte) -43);
            }
            class_aa_7_.method_z_void(1062070385);
            FloorOverlay.field_d_1.method_z_void(class_aa_7_, i);
            class_aa = class_aa_7_;
        } catch (final RuntimeException runtimeexception) {
            throw GameCanvas.error(runtimeexception, "cd.d()");
        }
        return class_aa;
    }
 
    @SuppressWarnings("unused")
	static final void method_af_void(final Actor character, final int i, final int i_8_, final int i_9_, final int i_10_, final int i_11_, final byte i_12_) {
        try {
            if ((character != null) && character.method_z_boolean(1969071428)) {
                if (character instanceof Npc) {
                    NpcComposite npcdef = ((Npc) character).composite;
                    if (npcdef.childrenIds != null) {
                        npcdef = npcdef.method_f_az(140133229);
                    }
                    if (npcdef == null) {
                        return;
                    }
                }
                if (i < (2000365659 * client.localPlayerCount)) {
                    int i_13_ = 30;
                    final Player player = (Player) character;
                    if (player.spotAnimating) {
                        return;
                    }
                    if (((-645129583 * player.prayerIcon) != -1) || ((player.skullIcon * 1764087165) != -1)) {
                        Class_ay.npcScreenPos(character, (15 + (-312217531 * (character.field_bf_215))), -1057470711);
                        if ((client.field_gp_2790 * 813575719) > -1) {
                            if ((-645129583 * player.prayerIcon) != -1) {
                                Class_cq.headicons_pk[(player.prayerIcon * -645129583)].rasterize(((i_8_ + (813575719 * client.field_gp_2790)) - 12), (((1411957327 * client.field_gx_2704) + i_9_) - i_13_));
                                i_13_ += 25;
                            }
                            if ((player.skullIcon * 1764087165) != -1) {
                                Class_d.headicons_prayer[(player.skullIcon * 1764087165)].rasterize(((i_8_ + (client.field_gp_2790 * 813575719)) - 12), ((i_9_ + (client.field_gx_2704 * 1411957327)) - i_13_));
                                i_13_ += 25;
                            }
                        }
                    }
                    if ((i >= 0) && ((client.hintMarkerType * 237348707) == 10) && ((-618750031 * client.hintMarkerPlayerIndex) == client.playerIndexArray[i])) {
                        Class_ay.npcScreenPos(character, (-312217531 * (character.field_bf_215)) + 15, 1107816280);
                        if ((client.field_gp_2790 * 813575719) > -1) {
                            IdentityKit.headicons_hint[1].rasterize((i_8_ + (813575719 * client.field_gp_2790)) - 12, ((i_9_ + (client.field_gx_2704 * 1411957327)) - i_13_));
                        }
                    }
                } else {
                    NpcComposite npcdef = ((Npc) character).composite;
                    if (npcdef.childrenIds != null) {
                        npcdef = npcdef.method_f_az(78352096);
                    }
                    if (((npcdef.field_ae_488 * -959498749) >= 0) && ((-959498749 * npcdef.field_ae_488) < Class_d.headicons_prayer.length)) {
                        Class_ay.npcScreenPos(character, (15 + (-312217531 * (character.field_bf_215))), -1040300804);
                        if ((813575719 * client.field_gp_2790) > -1) {
                            Class_d.headicons_prayer[npcdef.field_ae_488 * -959498749].rasterize((i_8_ + (client.field_gp_2790 * 813575719)) - 12, (((client.field_gx_2704 * 1411957327) + i_9_) - 30));
                        }
                    }
                    if (((client.hintMarkerType * 237348707) == 1) && ((-1218882453 * client.hintMarkerNpcIndex) == (client.npcIndexArray[i - (2000365659 * client.localPlayerCount)])) && (((client.currentCycle * 303796053) % 20) < 10)) {
                        Class_ay.npcScreenPos(character, (((character.field_bf_215) * -312217531) + 15), 1232116579);
                        if ((client.field_gp_2790 * 813575719) > -1) {
                            IdentityKit.headicons_hint[0].rasterize((i_8_ + (813575719 * client.field_gp_2790)) - 12, ((i_9_ + (1411957327 * client.field_gx_2704)) - 28));
                        }
                    }
                }
                if ((character.speech != null)
                        && ((i >= (client.localPlayerCount * 2000365659)) || (!character.field_ac_230 && (((client.field_ly_2725 * 1614021205) == 4) || (!character.isAutoTalking && (((client.field_ly_2725 * 1614021205) == 0) || ((client.field_ly_2725 * 1614021205) == 3) || (((1614021205 * client.field_ly_2725) == 1) && (GameStub.method_dx_boolean((((Player) character).name),
                                false, 1728586719))))))))) {
                    Class_ay.npcScreenPos(character, (-312217531 * (character.field_bf_215)), 714877674);
                    if (((813575719 * client.field_gp_2790) > -1) && ((client.field_fb_2897 * -1231218743) < (1700484107 * client.field_fr_2876))) {
                        client.field_fj_2783[(-1231218743 * client.field_fb_2897)] = (IdentityKit.b12Full.getTextWidth(character.speech)) / 2;
                        client.field_fo_2782[(-1231218743 * client.field_fb_2897)] = IdentityKit.b12Full.field_f_3101;
                        client.field_fa_2867[(-1231218743 * client.field_fb_2897)] = client.field_gp_2790 * 813575719;
                        client.field_fg_2781[(-1231218743 * client.field_fb_2897)] = 1411957327 * client.field_gx_2704;
                        client.field_fm_2718[(client.field_fb_2897 * -1231218743)] = (character.field_at_232 * -1674450775);
                        client.field_fw_2765[(client.field_fb_2897 * -1231218743)] = (1394917235 * character.field_aa_233);
                        client.field_fd_2786[(client.field_fb_2897 * -1231218743)] = (character.field_az_231 * 1533298799);
                        client.field_fi_2787[(client.field_fb_2897 * -1231218743)] = character.speech;
                        client.field_fb_2897 += -226053511;
                    }
                }
                if ((30350573 * character.hpBarExpire) > (303796053 * client.currentCycle)) {
                    Class_ay.npcScreenPos(character, ((character.field_bf_215) * -312217531) + 15, 1813695426);
                    if ((813575719 * client.field_gp_2790) > -1) {
                        int i_14_;
                        if (i < (2000365659 * client.localPlayerCount)) {
                            i_14_ = 30;
                        } else {
                            final NpcComposite npcdef = ((Npc) character).composite;
                            i_14_ = -713888769 * npcdef.field_az_490;
                        }
                        int i_15_ = ((character.currentHp * -366076885 * i_14_) / (character.maxHp * 1250314839));
                        if (i_15_ > i_14_) {
                            i_15_ = i_14_;
                        } else if ((i_15_ == 0) && ((-366076885 * character.currentHp) > 0)) {
                            i_15_ = 1;
                        }
                        Rasterizer.fillRect(((i_8_ + (client.field_gp_2790 * 813575719)) - (i_14_ / 2)), ((1411957327 * client.field_gx_2704) + i_9_) - 3, i_15_, 5, 65280);
                        Rasterizer.fillRect(i_15_ + ((i_8_ + (client.field_gp_2790 * 813575719)) - (i_14_ / 2)), (i_9_ + (1411957327 * client.field_gx_2704)) - 3, i_14_ - i_15_, 5, 16711680);
                        if (character instanceof Player) {
                            Player player = (Player) character;
                        } else if (character instanceof Npc) {
                            Npc npc = (Npc) character;
                            int npcInteracting = (npc.interactingIndex * -313868667) > 32768 ? (npc.interactingIndex * -313868667)  - 32768 : (npc.interactingIndex * -313868667);
                            int playerIndex = client.myPlayerIndex * -901432633;
                            int npcId = npc.composite.id * 384781917;
                            if (npcInteracting == playerIndex || (npcId == 2042 || npcId == 2043 || npcId == 2044) && playerIndex == 1) {
//                          Rasterizer.drawRect(5, 20, 100, 65, 0);
//                          Rasterizer.fillAlphaRect(5, 20, 100, 65, 0, 30);
//                          Class_ay.p12Full.drawString(npc.composite.name, 30, 35, 0xffffff, 0, ((303796053 * client.currentCycle) / 1000));
//                          Class_ay.p12Full.drawString(npc.currentHp * -366076885 + " / " + npc.maxHp * 1250314839, 32, 56, 0xffffff, 0, ((303796053 * client.currentCycle) / 1000));
 
                                int curHp = npc.currentHp * -366076885;
                                int maxHp = npc.maxHp * 1250314839;
                                int den = maxHp == 0 ? 1 : maxHp;
                                int spriteWidth = 105;
                                int width = (curHp * spriteWidth) / den;
 
                                if (width > spriteWidth) {
                                    width = spriteWidth;
                                }
 
 
                                String hpString = curHp + " / " + maxHp;
                                String npcName = npc.composite.name;
 
                                if (npcName.length() > 10) {
                                    npcName = npcName.substring(0, 10) + "...";
                                }
 
                                //  DrawingArea.fillRect(1, 115, 65, 0,20);
                                Rasterizer.drawRect(0, 20, 116, 56, 1);
                                Rasterizer.fillAlphaRect(0, 20, 115, 55, 1, 60);
                                Rasterizer.fillAlphaRect(6, 45, width, 13, 0x009933, 80);
                                Rasterizer.fillAlphaRect(6 + width, 45, (spriteWidth - width), 13, 0xCC0000, 80);//red
                                IdentityKit.b12Full.drawString(npcName, 30, 41, 0xffffff, 0, ((303796053 * client.currentCycle) / 1000));
                                client.p11Full.drawString(hpString, (spriteWidth / 2) - hpString.length(), 56, 0xffffff, 0, ((303796053 * client.currentCycle) / 1000));
//                          DrawingArea.drawPixels(13, 45, 6, 0x009933, width);
//                          DrawingArea.drawPixels(13, 45, 6 + width, 0xCC0000, (spriteWidth - width));
                            }
                        }
                    }
                }
                for (int i_16_ = 0; i_16_ < 4; i_16_++) {
                    if (character.field_ah_236[i_16_] > (303796053 * client.currentCycle)) {
                        Class_ay.npcScreenPos(character, (((character.field_bf_215) * -312217531) / 2), 1569740484);
                        if ((813575719 * client.field_gp_2790) > -1) {
                            if (i_16_ == 1) {
                                client.field_gx_2704 -= 1167957420;
                            }
                            if (i_16_ == 2) {
                                client.field_gp_2790 -= -223627303;
                                client.field_gx_2704 -= 583978710;
                            }
                            if (i_16_ == 3) {
                                client.field_gp_2790 += -223627303;
                                client.field_gx_2704 -= 583978710;
                            }
                            Class_cp.hitmarks[character.field_ai_235[i_16_]].rasterize((i_8_ + (client.field_gp_2790 * 813575719)) - 12, (((1411957327 * client.field_gx_2704) + i_9_) - 12));
                            client.p11Full.drawCenteredString(Integer.toString(character.field_aw_234[i_16_]), ((813575719 * client.field_gp_2790) + i_8_) - 1, 3 + (1411957327 * client.field_gx_2704) + i_9_, 16777215, 0);
                        }
                    }
                }
            }
        } catch (final RuntimeException runtimeexception) {
            throw GameCanvas.error(runtimeexception, "cd.af()");
        }
    }
}