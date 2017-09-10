/* Class_h - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Font;
import java.math.BigInteger;
import java.util.ArrayList;

public class Class_h {
	static final BigInteger field_g_1021 = (new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683"));
	static final String field_d_1022 = "services";
	static final String field_z_1023 = "passwordchoice.ws";
	static final int field_y_1024 = 1000;
	static final BigInteger field_e_1025 = (new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049"));
	static int[] field_ak_1026;
	static final int field_f_1027 = 2;
	static final int field_af_1028 = 51;
	protected static Font field_qz_1029;
	static final int field_s_1031 = 0;

	static final void method_ah_void(final int i) {
		try {
			if ((client.rootInterfaceId * -374264803) != -1) {
				final int i_0_ = client.rootInterfaceId * -374264803;
				if (Class_fz.loadWidget(i_0_, -1421120441)) {
					Class_cq.method_dw_void(Widget.widgets[i_0_], -1, -1783544678);
				}
			}
			for (int i_1_ = 0; i_1_ < (998139771 * client.field_lx_2892); i_1_++) {
				if (client.field_li_2835[i_1_]) {
					client.field_lt_2719[i_1_] = true;
				}
				client.field_lg_2939[i_1_] = client.field_li_2835[i_1_];
				client.field_li_2835[i_1_] = false;
			}
			client.field_la_2893 = -1147037943 * client.currentCycle;
			client.field_id_2836 = -2014421019;
			client.field_iv_2837 = -735544561;
			Class_fn.field_gd_2411 = null;
			if ((-374264803 * client.rootInterfaceId) != -1) {
				client.field_lx_2892 = 0;
				final int i_2_ = client.rootInterfaceId * -374264803;
				final int i_3_ = -1236640339 * Boundary.clientWidth;
				final int i_4_ = Projectile.clientHeight * -1483492575;
				if (!Class_fz.loadWidget(i_2_, 202508905)) {
					for (int i_5_ = 0; i_5_ < 100; i_5_++) {
						client.field_li_2835[i_5_] = true;
					}
				} else {
					Region.field_ke_1008 = null;
					Class_o.method_cy_void(Widget.widgets[i_2_], -1, 0, 0, i_3_, i_4_, 0, 0, -1, -379100767);
					if (Region.field_ke_1008 != null) {
						Class_o.method_cy_void(Region.field_ke_1008, -1412584499, 0, 0, i_3_, i_4_, (1100366009 * Class_a.field_kl_795), (-236630477 * Region.field_kx_1013), -1, -379100767);
						Region.field_ke_1008 = null;
					}
				}
			}
			
			ArrayList<XPDrop> currentDrops = new ArrayList<XPDrop>(client.DROPS);
			for(XPDrop drop : currentDrops) {
				if(!drop.isFinished()) {
					drop.processXPDrop();
				} else {
					client.DROPS.remove(drop);
				}
			}
			Rasterizer.method_cf_void();
			if (!client.isMenuOpen) {
				if ((233912851 * client.field_id_2836) != -1) {
					Class_ck.method_bc_void(233912851 * client.field_id_2836, 1111682065 * client.field_iv_2837, 110530126);
				}
			} else {
				Bindable.method_be_void(-1867557245);
			}
			if ((client.field_lv_2901 * -1787689871) == 3) {
				for (int i_6_ = 0; i_6_ < (client.field_lx_2892 * 998139771); i_6_++) {
					if (client.field_lg_2939[i_6_]) {
						Rasterizer.fillAlphaRect(client.field_lw_2960[i_6_], client.field_lq_2898[i_6_], client.field_lc_2941[i_6_], client.field_le_2900[i_6_], 16711935, 128);
					} else if (client.field_lt_2719[i_6_]) {
						Rasterizer.fillAlphaRect(client.field_lw_2960[i_6_], client.field_lq_2898[i_6_], client.field_lc_2941[i_6_], client.field_le_2900[i_6_], 16711680, 128);
					}
				}
			}
			final int i_7_ = 250114511 * Class_ed.plane;
			final int i_8_ = -2103184911 * Class_ci.myPlayer.worldPosX;
			final int i_9_ = 2088773389 * Class_ci.myPlayer.worldPosY;
			final int i_10_ = client.field_ej_2761 * -1720212425;
			for (Class_o class_o = (Class_o) Class_o.field_n_1232.method_f_ga(); class_o != null; class_o = (Class_o) Class_o.field_n_1232.method_a_ga()) {
				if (((class_o.field_m_1228 * -840141801) != -1) || (class_o.field_u_1227 != null)) {
					int i_11_ = 0;
					if (i_8_ > (class_o.field_z_1225 * -1563573011)) {
						i_11_ += i_8_ - (-1563573011 * class_o.field_z_1225);
					} else if (i_8_ < (class_o.field_y_1223 * -686895023)) {
						i_11_ += ((-686895023 * class_o.field_y_1223) - i_8_);
					}
					if (i_9_ > (468599769 * class_o.field_g_1229)) {
						i_11_ += i_9_ - (468599769 * class_o.field_g_1229);
					} else if (i_9_ < (class_o.field_e_1224 * -1529238767)) {
						i_11_ += ((class_o.field_e_1224 * -1529238767) - i_9_);
					}
					if (((i_11_ - 64) <= (class_o.field_f_1231 * 2046362851)) && ((client.field_nm_2918 * -630818465) != 0) && ((-102305297 * class_o.field_d_1226) == i_7_)) {
						i_11_ -= 64;
						if (i_11_ < 0) {
							i_11_ = 0;
						}
						final int i_12_ = ((((class_o.field_f_1231 * 2046362851) - i_11_) * client.field_nm_2918 * -630818465) / (class_o.field_f_1231 * 2046362851));
						if (class_o.field_a_1222 == null) {
							if ((-840141801 * class_o.field_m_1228) >= 0) {
								final Class_bo class_bo = (Class_bo.method_n_bo(Class_dw.soundFXIndex1, (-840141801 * class_o.field_m_1228), 0));
								if (class_bo != null) {
									final Class_ba class_ba = (class_bo.method_d_ba().method_n_ba(Class_v.field_ny_1445));
									final Class_bd class_bd = Class_bd.method_z_bd(class_ba, 100, i_12_);
									class_bd.method_h_void(-1);
									Class_bg.field_na_553.method_n_void(class_bd);
									class_o.field_a_1222 = class_bd;
								}
							}
						} else {
							class_o.field_a_1222.method_u_void(i_12_);
						}
						if (class_o.field_k_1234 == null) {
							if ((class_o.field_u_1227 != null) && (((class_o.field_q_1233 -= i_10_ * -1915527009) * 2472799) <= 0)) {
								final int i_13_ = (int) (Math.random() * (class_o.field_u_1227).length);
								final Class_bo class_bo = Class_bo.method_n_bo((Class_dw.soundFXIndex1), (class_o.field_u_1227[i_13_]), 0);
								if (class_bo != null) {
									final Class_ba class_ba = (class_bo.method_d_ba().method_n_ba(Class_v.field_ny_1445));
									final Class_bd class_bd = Class_bd.method_z_bd(class_ba, 100, i_12_);
									class_bd.method_h_void(0);
									Class_bg.field_na_553.method_n_void(class_bd);
									class_o.field_k_1234 = class_bd;
									class_o.field_q_1233 = (((-590944531 * (class_o.field_h_1230)) + (int) (Math.random() * (((class_o.field_l_1221) * 398192145) - (-590944531 * (class_o.field_h_1230))))) * -1915527009);
								}
							}
						} else {
							class_o.field_k_1234.method_u_void(i_12_);
							if (!class_o.field_k_1234.hasPrev()) {
								class_o.field_k_1234 = null;
							}
						}
					} else {
						if (class_o.field_a_1222 != null) {
							Class_bg.field_na_553.method_d_void(class_o.field_a_1222);
							class_o.field_a_1222 = null;
						}
						if (class_o.field_k_1234 != null) {
							Class_bg.field_na_553.method_d_void(class_o.field_k_1234);
							class_o.field_k_1234 = null;
						}
					}
				}
			}
			client.field_ej_2761 = 0;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "h.ah()");
		}
	}

    static final byte[] decompress(final byte[] is, final int i) {
        try {
            final Buffer buffer = new Buffer(is);
            final int compression = buffer.get();
            final int decompressed = buffer.getInt();
            if ((decompressed >= 0) && (((FileStore.field_j_2489 * -1520379317) == 0) || (decompressed <= (-1520379317 * FileStore.field_j_2489)))) {
                if (compression == 0) {
                    final byte[] tmp = new byte[decompressed];
                    buffer.method_ax_void(tmp, 0, decompressed);
                    return tmp;
                }
                final int i_17_ = buffer.getInt();

                if (i_17_ >= 2000000) {
                    return new byte[100];
                }

                if ((i_17_ >= 0) && (((-1520379317 * FileStore.field_j_2489) == 0) || (i_17_ <= (-1520379317 * FileStore.field_j_2489)))) {
                    final byte[] data = new byte[i_17_];
                    if (compression == 1) {
                        Class_dy.method_n_int(data, i_17_, is, decompressed, 9);
                    } else {
                        FileStore.INFLATER.inflate(buffer, data);
                    }
                    return data;
                }
            }
            return new byte[100];
        } catch (final RuntimeException runtimeexception) {
            throw GameCanvas.error(runtimeexception, "h.t()");
        }
    }

	static final void method_z_void(final int i, final int i_19_, final int i_20_, final int i_21_, final byte i_22_) {
		try {
			for (int i_23_ = i_19_; i_23_ <= (i_21_ + i_19_); i_23_++) {
				for (int i_24_ = i; i_24_ <= (i + i_20_); i_24_++) {
					if ((i_24_ >= 0) && (i_24_ < 104) && (i_23_ >= 0) && (i_23_ < 104)) {
						Region.field_m_1007[0][i_24_][i_23_] = (byte) 127;
						if ((i_24_ == i) && (i_24_ > 0)) {
							Region.heightMaps[0][i_24_][i_23_] = Region.heightMaps[0][i_24_ - 1][i_23_];
						}
						if ((i_24_ == (i_20_ + i)) && (i_24_ < 103)) {
							Region.heightMaps[0][i_24_][i_23_] = Region.heightMaps[0][1 + i_24_][i_23_];
						}
						if ((i_19_ == i_23_) && (i_23_ > 0)) {
							Region.heightMaps[0][i_24_][i_23_] = Region.heightMaps[0][i_24_][i_23_ - 1];
						}
						if ((i_23_ == (i_19_ + i_21_)) && (i_23_ < 103)) {
							Region.heightMaps[0][i_24_][i_23_] = Region.heightMaps[0][i_24_][1 + i_23_];
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "h.z()");
		}
	}

	Class_h() throws Throwable {
		throw new Error();
	}
}
