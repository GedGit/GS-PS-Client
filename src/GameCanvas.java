/* Class_eu - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

@SuppressWarnings("serial")
public final class GameCanvas extends Canvas {
	public static int field_d_2228;
	Component field_n_2229;
	static final int field_g_2230 = 6;
	static int field_ib_2231;
	public static final int field_ft_2232 = 176;
	static int field_nc_2233;

	@Override
	public final void update(final Graphics graphics) {
		try {
			this.field_n_2229.update(graphics);
		} catch (final RuntimeException runtimeexception) {
			throw error(runtimeexception, "eu.update()");
		}
	}

	@Override
	public final void paint(final Graphics graphics) {
		try {
			this.field_n_2229.paint(graphics);
		} catch (final RuntimeException runtimeexception) {
			throw error(runtimeexception, "eu.paint()");
		}
	}

	GameCanvas(final Component component) {
		this.field_n_2229 = component;
	}

	public static ClientError error(final Throwable throwable, final String string) {
		ClientError class_er;
		try {
			ClientError class_er_0_;
			if (throwable instanceof ClientError) {
				class_er_0_ = (ClientError) throwable;
				class_er_0_.field_y_2208 = new StringBuilder(class_er_0_.field_y_2208).append(' ').append(string).toString();
			} else {
				class_er_0_ = new ClientError(throwable, string);
			}
			class_er = class_er_0_;
		} catch (final RuntimeException runtimeexception) {
			throw error(runtimeexception, "eu.d()");
		}
		return class_er;
	}

    static final void method_ch_void(final Player other, final int i, final int i_1_, final int i_2_, final byte i_3_) {
        try {
            if ((other != Class_ci.myPlayer) && ((-224642011 * client.currentMenuSize) < 400)) {
                String string;
             /*   if ((2057928353 * other.totalLevel) == 0) {
                    string = other.name + Class_ck.method_cx_String(other.combatLevel * 2052698405, 2052698405 * (Class_ci.myPlayer.combatLevel), (byte) 90) + " " + Class_d.field_y_857 + MenuText.field_fs_1939 + other.combatLevel * 2052698405 + Class_d.field_e_855;
                } else {
                    string = other.name + " " + Class_d.field_y_857 + MenuText.field_fx_1940 + 2057928353 * other.totalLevel + Class_d.field_e_855;
                }*/

                if(2057928353 * other.totalLevel * -539000905 == 0) {
                    string = other.tags[0] + other.name + other.tags[1] + Class_ck.method_cx_String(other.combatLevel * 2052698405, 2052698405 * (Class_ci.myPlayer.combatLevel), (byte) 90) + " " + Class_d.field_y_857 + MenuText.field_fs_1939 + other.combatLevel * 2052698405 + Class_d.field_e_855 + other.tags[2];
                } else {
                    string = other.tags[0] + other.name + other.tags[1] + " " + Class_d.field_y_857 + MenuText.field_fs_1939 + other.combatLevel * 2052698405 + Class_d.field_e_855 + other.tags[2];
                }

                if ((client.selectedOptionType * -1595363093) == 1) {
                    Class_dr.method_ce_void(MenuText.USE, client.field_it_2841 + " " + Class_d.field_g_858 + " " + Class_r.colorString(16777215) + string, 14, i, i_1_, i_2_, 1172020980);
                } else if (client.isOptionSelected) {
                    if (((field_ib_2231 * 475607145) & 0x8) == 8) {
                        Class_dr.method_ce_void(client.field_in_2845, client.selectedOption + " " + Class_d.field_g_858 + " " + Class_r.colorString(16777215) + string, 15, i, i_1_, i_2_, -2070117365);
                    }
                } else {
                    for (int slot = 7; slot >= 0; slot--) {
                        if (client.playerOptions[slot] != null) {
                            int var5 = 0;

                            if (client.playerOptions[slot].equalsIgnoreCase(MenuText.ATTACK)) {
                                if (client.field_ai_2895 == Class_v.aClass87_957) {
                                    continue;
                                }

                                label96:
                                {
                                    if (Class_v.field_d_1441 != client.field_ai_2895) {
                                        if (Class_v.field_n_1442 != client.field_ai_2895 || other.field_v_1561 * -1226262297 <= Class_ci.myPlayer.field_v_1561 * -1226262297) {
                                            break label96;
                                        }
                                    }
                                    var5 = 2000;
                                }

                                if (Class_ci.myPlayer.field_v_1561 * -1226262297 != 0) {
                                    if (other.field_v_1561 * -1226262297 != 0) {
                                        if (Class_ci.myPlayer.field_v_1561 * -1226262297 == other.field_v_1561 * -1226262297) {
                                            var5 = 2000;
                                        } else {
                                            var5 = 0;
                                        }
                                    }
                                }
                            } else if (client.field_hf_2706[slot]) {
                                var5 = 2000;
                            }
                            final int i_6_ = var5 + client.field_ho_2815[slot];
                            Class_dr.method_ce_void(client.playerOptions[slot], Class_r.colorString(16777215) + string, i_6_, i, i_1_, i_2_, -1012895869);
                        }
                    }
                }
                for (int slot = 0; slot < (-224642011 * client.currentMenuSize); slot++) {
                    if (client.field_ik_2832[slot] == 23) {
                        client.menuOptions[slot] = Class_r.colorString(16777215) + string;
                        break;
                    }
                }
            }
        } catch (final RuntimeException runtimeexception) {
            throw error(runtimeexception, "eu.ch()");
        }
    }
}
