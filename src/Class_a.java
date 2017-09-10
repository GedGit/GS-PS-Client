/* Class_a - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Class_a {
	public static final int field_i_780 = 27;
	static final int field_d_781 = 10;
	boolean hideRoofTops;
	boolean field_y_783;
	static final int field_mb_784 = 1536;
	static int field_nl_785;
	public static final int field_fq_786 = 114;
	static final int field_an_787 = 41;
	static Sprite[] arrows;
	static int field_n_789 = -529640452;
	LinkedHashMap<Integer, Integer> typedUsername;
	static final int field_mz_791 = 24624;
	int field_e_792;
	static Rasterizer2D field_mp_793;
	static Widget field_gz_794;
	static int field_kl_795;

	private static final Pattern ADDRESS_PATTERN = Pattern.compile("^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$");

	public static String getHardwareAddress() throws UnknownHostException, SocketException {

		Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
		while(networkInterfaces.hasMoreElements()) {
			NetworkInterface network = networkInterfaces.nextElement();
			byte[] mac = network.getHardwareAddress();

			if (mac == null) {
				continue;
			}

			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < mac.length; i++)
			{
				sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? ":" : ""));
			}
			String macString = sb.toString();
			if (!ADDRESS_PATTERN.matcher(macString).matches())
				continue;
			return macString;
		}
		return null;
	}

	void method_n_void(final boolean bool, final int i) {
		/* empty */
	}

	Class_a(final Buffer rsbytebuffer) {
		this.typedUsername = new LinkedHashMap<Integer, Integer>();
		this.field_e_792 = -1932223977;
		if ((rsbytebuffer != null) && (rsbytebuffer.buffer != null)) {
			final int i = rsbytebuffer.get();
			if ((i >= 0) && (i <= (371944191 * field_n_789))) {
				if (rsbytebuffer.get() == 1) {
					this.hideRoofTops = true;
				}
				if (i > 1) {
					this.field_y_783 = rsbytebuffer.get() == 1;
				}
				if (i > 3) {
					this.field_e_792 = rsbytebuffer.get() * -1932223977;
				}
				if (i > 2) {
					final int i_0_ = rsbytebuffer.get();
					for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
						final int i_2_ = rsbytebuffer.getInt();
						final int i_3_ = rsbytebuffer.getInt();
						this.typedUsername.put(Integer.valueOf(i_2_), Integer.valueOf(i_3_));
					}
				}
			} else {
				method_n_void(true, -283265387);
			}
		} else {
			method_n_void(true, -1955557346);
		}
	}

	Class_a() {
		this.typedUsername = new LinkedHashMap<Integer, Integer>();
		this.field_e_792 = -1932223977;
		method_n_void(true, 638370472);
	}

	Buffer method_d_dl(final int i) {
		Buffer rsbytebuffer;
		try {
			final Buffer rsbytebuffer_4_ = new Buffer(100);
			rsbytebuffer_4_.put(371944191 * field_n_789);
			rsbytebuffer_4_.put(this.hideRoofTops ? 1 : 0);
			rsbytebuffer_4_.put(this.field_y_783 ? 1 : 0);
			rsbytebuffer_4_.put((-483902041 * this.field_e_792));
			rsbytebuffer_4_.put(this.typedUsername.size());
			final Iterator<?> iterator = this.typedUsername.entrySet().iterator();
			while (iterator.hasNext()) {
				final Map.Entry<?, ?> entry = (Map.Entry<?, ?>) iterator.next();
				rsbytebuffer_4_.putInt(((Integer) entry.getKey()).intValue());
				rsbytebuffer_4_.putInt(((Integer) entry.getValue()).intValue());
			}
			rsbytebuffer = rsbytebuffer_4_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "a.d()");
		}
		return rsbytebuffer;
	}

	static final void method_cj_void(final byte i) {
		try {
			FloorUnderlay.method_cf_void(-2131831600);
			if ((field_gz_794 == null) && (client.field_jt_2801 == null)) {
				int i_5_ = MouseInputListener.field_q_2162 * 1159182273;
				if (client.isMenuOpen) {
					if ((i_5_ != 1) && (Class_al.field_aw_178 || (i_5_ != 4))) {
						final int i_6_ = MouseInputListener.field_m_2156 * 1515107729;
						final int i_7_ = MouseInputListener.field_a_2157 * -2089478689;
						if ((i_6_ < ((-1281966953 * Class_fm.menuX) - 10)) || (i_6_ > (10 + (Class_eh.menuWidth * -1031757099) + (Class_fm.menuX * -1281966953))) || (i_7_ < ((Class_dw.menuY * 770559729) - 10)) || (i_7_ > (10 + (Class_dw.menuY * 770559729) + (-13989543 * Class_ev.menuHeight)))) {
							client.isMenuOpen = false;
							Class_s.method_bb_void(Class_fm.menuX * -1281966953, Class_dw.menuY * 770559729, Class_eh.menuWidth * -1031757099, -13989543 * Class_ev.menuHeight, -1084898504);
						}
					}
					if ((i_5_ == 1) || (!Class_al.field_aw_178 && (i_5_ == 4))) {
						final int i_8_ = Class_fm.menuX * -1281966953;
						final int i_9_ = 770559729 * Class_dw.menuY;
						final int i_10_ = -1031757099 * Class_eh.menuWidth;
						final int i_11_ = 2117517719 * MouseInputListener.field_k_2164;
						final int i_12_ = MouseInputListener.field_x_2158 * 1750309931;
						int i_13_ = -1;
						for (int i_14_ = 0; i_14_ < (-224642011 * client.currentMenuSize); i_14_++) {
							final int i_15_ = (31 + i_9_ + (((-224642011 * client.currentMenuSize) - 1 - i_14_) * 15));
							if ((i_11_ > i_8_) && (i_11_ < (i_8_ + i_10_)) && (i_12_ > (i_15_ - 13)) && (i_12_ < (3 + i_15_))) {
								i_13_ = i_14_;
							}
						}
						if (i_13_ != -1) {
							GameStub.method_cz_void(i_13_, (byte) 23);
						}
						client.isMenuOpen = false;
						Class_s.method_bb_void(Class_fm.menuX * -1281966953, Class_dw.menuY * 770559729, (-1031757099 * Class_eh.menuWidth), Class_ev.menuHeight * -13989543, -1084898504);
					}
				} else {
					if (((i_5_ == 1) || (!Class_al.field_aw_178 && (i_5_ == 4))) && ((client.currentMenuSize * -224642011) > 0)) {
						final int i_16_ = (client.field_ik_2832[(client.currentMenuSize * -224642011) - 1]);
						if ((i_16_ == 39) || (i_16_ == 40) || (i_16_ == 41) || (i_16_ == 42) || (i_16_ == 43) || (i_16_ == 33) || (i_16_ == 34) || (i_16_ == 35) || (i_16_ == 36) || (i_16_ == 37) || (i_16_ == 38) || (i_16_ == 1005)) {
							final int i_17_ = (client.field_is_2830[(client.currentMenuSize * -224642011) - 1]);
							final int i_18_ = (client.field_io_2831[(client.currentMenuSize * -224642011) - 1]);
							final Widget widget = Class_en.getWidgetByUID(i_18_, (short) 20852);
							if ((Class_d.method_e_boolean(Class_db.method_en_int(widget, -1902387813), 307362021)) || (Class_cj.method_g_boolean(Class_db.method_en_int(widget, -2066597927), (byte) 55))) {
								if ((field_gz_794 != null) && !client.field_ga_2802 && ((client.field_hs_2855 * -367274921) != 1) && !(Class_fk.method_ct_boolean(((client.currentMenuSize * -224642011) - 1), (byte) 14)) && ((-224642011 * client.currentMenuSize) > 0)) {
									ZipInflater.method_dc_void(1510902421 * client.field_gu_2799, client.field_gm_2800 * -1214524079, 2121851375);
								}
								client.field_ga_2802 = false;
								client.field_gy_2803 = 0;
								if (field_gz_794 != null) {
									Daemon.method_dn_void(field_gz_794, (byte) -27);
								}
								field_gz_794 = Class_en.getWidgetByUID(i_18_, (short) 22140);
								client.field_gb_2798 = 1085977495 * i_17_;
								client.field_gu_2799 = MouseInputListener.field_k_2164 * 1764916347;
								client.field_gm_2800 = MouseInputListener.field_x_2158 * -962090309;
								if ((-224642011 * client.currentMenuSize) > 0) {
									Class_cq.method_dm_void(((-224642011 * client.currentMenuSize) - 1), (byte) 1);
								}
								Daemon.method_dn_void(field_gz_794, (byte) -3);
								return;
							}
						}
					}
					if (((i_5_ == 1) || (!Class_al.field_aw_178 && (i_5_ == 4))) && ((((-367274921 * client.field_hs_2855) == 1) && ((client.currentMenuSize * -224642011) > 2)) || (Class_fk.method_ct_boolean((-224642011 * client.currentMenuSize) - 1, (byte) -15)))) {
						i_5_ = 2;
					}
					if (((i_5_ == 1) || (!Class_al.field_aw_178 && (i_5_ == 4))) && ((-224642011 * client.currentMenuSize) > 0)) {
						GameStub.method_cz_void((client.currentMenuSize * -224642011) - 1, (byte) 23);
					}
					if ((i_5_ == 2) && ((-224642011 * client.currentMenuSize) > 0)) {
						Class_ed.method_cb_void((2117517719 * MouseInputListener.field_k_2164), (MouseInputListener.field_x_2158 * 1750309931), (byte) 1);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "a.cj()");
		}
	}

	static void method_aa_void(final int i) {
		try {
			client.encryptedBuffer.writeOpcode(129);
			client.encryptedBuffer.put(Class_dj.method_ac_int((byte) 13));
			client.encryptedBuffer.putShort((Boundary.clientWidth * -1236640339));
			client.encryptedBuffer.putShort(Projectile.clientHeight * -1483492575);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "a.aa()");
		}
	}

	public static Object getCachedObject(final byte[] data, final boolean copy) {
		byte[] result;
		try {
			if (data == null) {
				return null;
			}
			do {
				if ((data.length > 136) && !AbstractBuffer.field_d_1627) {
					AllocatedBuffer class_di;
					try {
						final AllocatedBuffer class_di_20_ = new AllocatedBuffer();
						class_di_20_.put(data);
						class_di = class_di_20_;
					} catch (final Throwable throwable) {
						AbstractBuffer.field_d_1627 = true;
						break;
					}
					return class_di;
				}
			} while (false);
			result = copy ? MillisecondTimer.arraycopy(data, (byte) 14) : data;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "a.a()");
		}
		return result;
	}
}
