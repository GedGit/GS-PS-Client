/* Class_ef - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class MachineInformationNode extends Node {
	int field_ar_2074;
	static final int field_d_2075 = 1;
	int field_as_2076;
	static final int field_e_2077 = 4;
	int field_g_2078;
	static final int field_k_2079 = 7;
	static final int field_j_2080 = 10;
	static final int field_q_2081 = 6;
	int field_ap_2082;
	int field_aj_2083;
	static final int field_v_2084 = 21;
	boolean field_ao_2085;
	static final int field_m_2086 = 1;
	static final int field_t_2087 = 26;
	int field_w_2088;
	int field_al_2089;
	static final int field_p_2090 = 23;
	static final int field_z_2091 = 2;
	boolean bit64;
	int field_bs_2093;
	int field_ac_2094;
	int field_at_2095;
	int field_an_2096;
	int field_aw_2097;
	String field_ai_2098;
	String field_ah_2099;
	String field_aq_2100;
	String field_ay_2101;
	int field_am_2102;
	static final int field_n_2103 = 6;
	int field_ag_2104;
	int field_ab_2105;
	static final int field_b_2106 = 25;
	String field_au_2107;
	int[] field_av_2108 = new int[3];
	String field_af_2109;

	void method_n_void(final int i) {
		try {
			if (this.field_ai_2098.length() > 40) {
				this.field_ai_2098 = this.field_ai_2098.substring(0, 40);
			}
			if (this.field_ah_2099.length() > 40) {
				this.field_ah_2099 = this.field_ah_2099.substring(0, 40);
			}
			if (this.field_aq_2100.length() > 10) {
				this.field_aq_2100 = this.field_aq_2100.substring(0, 10);
			}
			if (this.field_ay_2101.length() > 10) {
				this.field_ay_2101 = this.field_ay_2101.substring(0, 10);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ef.n()");
		}
	}

	public int method_z_int(final byte i) {
		int i_0_;
		try {
			final int i_1_ = 38;
			int i_2_ = i_1_ + Class_d.method_h_int(this.field_ai_2098, 801007009);
			i_2_ += Class_d.method_h_int(this.field_ah_2099, -734934214);
			i_2_ += Class_d.method_h_int(this.field_aq_2100, 1425799435);
			i_2_ += Class_d.method_h_int(this.field_ay_2101, 1268708034);
			i_2_ += Class_d.method_h_int(this.field_af_2109, -1876704199);
			i_2_ += Class_d.method_h_int(this.field_au_2107, 278232822);
			i_0_ = i_2_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ef.z()");
		}
		return i_0_;
	}

	public MachineInformationNode(final boolean bool) {
		if (bool) {
			if (Class_ed.field_c_2067.startsWith("win")) {
				this.field_g_2078 = -920959229;
			} else if (Class_ed.field_c_2067.startsWith("mac")) {
				this.field_g_2078 = -1841918458;
			} else if (Class_ed.field_c_2067.startsWith("linux")) {
				this.field_g_2078 = 1532089609;
			} else {
				this.field_g_2078 = 611130380;
			}
			String string;
			try {
				string = System.getProperty("os.arch").toLowerCase();
			} catch (final Exception exception) {
				string = "";
			}
			String string_3_;
			try {
				string_3_ = System.getProperty("os.version").toLowerCase();
			} catch (final Exception exception) {
				string_3_ = "";
			}
			String javaVendor = "Unknown";
			String javaVersion = "1.1";
			try {
				javaVendor = System.getProperty("java.vendor");
				javaVersion = System.getProperty("java.version");
			} catch (final Exception exception) {
				/* empty */
			}
			if (!string.startsWith("amd64") && !string.startsWith("x86_64")) {
				this.bit64 = false;
			} else {
				this.bit64 = true;
			}
			if ((-1537680469 * this.field_g_2078) == 1) {
				if (string_3_.indexOf("4.0") != -1) {
					this.field_w_2088 = 303136803;
				} else if (string_3_.indexOf("4.1") != -1) {
					this.field_w_2088 = 606273606;
				} else if (string_3_.indexOf("4.9") != -1) {
					this.field_w_2088 = 909410409;
				} else if (string_3_.indexOf("5.0") != -1) {
					this.field_w_2088 = 1212547212;
				} else if (string_3_.indexOf("5.1") != -1) {
					this.field_w_2088 = 1515684015;
				} else if (string_3_.indexOf("5.2") != -1) {
					this.field_w_2088 = -1869872872;
				} else if (string_3_.indexOf("6.0") != -1) {
					this.field_w_2088 = 1818820818;
				} else if (string_3_.indexOf("6.1") != -1) {
					this.field_w_2088 = 2121957621;
				} else if (string_3_.indexOf("6.2") != -1) {
					this.field_w_2088 = -1566736069;
				} else if (string_3_.indexOf("6.3") != -1) {
					this.field_w_2088 = -1263599266;
				}
			} else if ((this.field_g_2078 * -1537680469) == 2) {
				if (string_3_.indexOf("10.4") != -1) {
					this.field_w_2088 = 1767768764;
				} else if (string_3_.indexOf("10.5") != -1) {
					this.field_w_2088 = 2070905567;
				} else if (string_3_.indexOf("10.6") != -1) {
					this.field_w_2088 = -1920924926;
				} else if (string_3_.indexOf("10.7") != -1) {
					this.field_w_2088 = -1617788123;
				} else if (string_3_.indexOf("10.8") != -1) {
					this.field_w_2088 = -1314651320;
				} else if (string_3_.indexOf("10.9") != -1) {
					this.field_w_2088 = -1011514517;
				} else if (string_3_.indexOf("10.10") != -1) {
					this.field_w_2088 = -708377714;
				}
			}
			if (javaVendor.toLowerCase().indexOf("sun") != -1) {
				this.field_al_2089 = 2108539441;
			} else if (javaVendor.toLowerCase().indexOf("microsoft") != -1) {
				this.field_al_2089 = -77888414;
			} else if (javaVendor.toLowerCase().indexOf("apple") != -1) {
				this.field_al_2089 = 2030651027;
			} else if (javaVendor.toLowerCase().indexOf("oracle") != -1) {
				this.field_al_2089 = 1952762613;
			} else {
				this.field_al_2089 = -155776828;
			}
			int i = 2;
			int i_6_ = 0;
			try {
				for (/**/; i < javaVersion.length(); i++) {
					final int i_7_ = javaVersion.charAt(i);
					if ((i_7_ < 48) || (i_7_ > 57)) {
						break;
					}
					i_6_ = (i_7_ - 48) + (i_6_ * 10);
				}
			} catch (final Exception exception) {
				/* empty */
			}
			this.field_ar_2074 = 1345647519 * i_6_;
			i = javaVersion.indexOf('.', 2) + 1;
			i_6_ = 0;
			try {
				for (/**/; i < javaVersion.length(); i++) {
					final int i_8_ = javaVersion.charAt(i);
					if ((i_8_ < 48) || (i_8_ > 57)) {
						break;
					}
					i_6_ = (10 * i_6_) + (i_8_ - 48);
				}
			} catch (final Exception exception) {
				/* empty */
			}
			this.field_as_2076 = i_6_ * 2067925501;
			i = javaVersion.indexOf('_', 4) + 1;
			i_6_ = 0;
			try {
				for (/**/; i < javaVersion.length(); i++) {
					final int i_9_ = javaVersion.charAt(i);
					if ((i_9_ < 48) || (i_9_ > 57)) {
						break;
					}
					i_6_ = (i_6_ * 10) + (i_9_ - 48);
				}
			} catch (final Exception exception) {
				/* empty */
			}
			this.field_ab_2105 = -127097949 * i_6_;
			this.field_ao_2085 = false;
			this.field_ac_2094 = (((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1) * 989544529);
			if ((this.field_ar_2074 * 855599199) > 3) {
				this.field_at_2095 = Runtime.getRuntime().availableProcessors() * -1360127305;
			} else {
				this.field_at_2095 = 0;
			}
			this.field_an_2096 = 0;
		}
		if (this.field_ai_2098 == null) {
			this.field_ai_2098 = "";
		}
		if (this.field_ah_2099 == null) {
			this.field_ah_2099 = "";
		}
		if (this.field_aq_2100 == null) {
			this.field_aq_2100 = "";
		}
		if (this.field_ay_2101 == null) {
			this.field_ay_2101 = "";
		}
		if (this.field_af_2109 == null) {
			this.field_af_2109 = "";
		}
		if (this.field_au_2107 == null) {
			this.field_au_2107 = "";
		}
		method_n_void(-2138192850);
	}

	public void encode(final Buffer rsbytebuffer) {
		try {// O
			rsbytebuffer.put(6);
			rsbytebuffer.put((-1537680469 * this.field_g_2078));
			rsbytebuffer.put(this.bit64 ? 1 : 0);
			rsbytebuffer.put((this.field_w_2088 * 1899179915));
			rsbytebuffer.put((-1033349423 * this.field_al_2089));
			rsbytebuffer.put((this.field_ar_2074 * 855599199));
			rsbytebuffer.put((-727114923 * this.field_as_2076));
			rsbytebuffer.put((661039115 * this.field_ab_2105));
			rsbytebuffer.put(this.field_ao_2085 ? 1 : 0);
			rsbytebuffer.putShort((this.field_ac_2094 * 1583745201));
			rsbytebuffer.put((this.field_at_2095 * 1604051719));
			rsbytebuffer.putMedium((498731921 * this.field_an_2096), -400363052);
			rsbytebuffer.putShort((this.field_aw_2097 * 210173863));
			rsbytebuffer.putNT0String(this.field_ai_2098, 1083556392);
			rsbytebuffer.putNT0String(this.field_ah_2099, 666693297);
			rsbytebuffer.putNT0String(this.field_aq_2100, 694220570);
			rsbytebuffer.putNT0String(this.field_ay_2101, -978098576);
			rsbytebuffer.put((this.field_aj_2083 * -381637955));
			rsbytebuffer.putShort((196666355 * this.field_am_2102));
			rsbytebuffer.putNT0String(this.field_af_2109, 180193052);
			rsbytebuffer.putNT0String(this.field_au_2107, -1500659524);
			rsbytebuffer.put((this.field_ag_2104 * -956764379));
			rsbytebuffer.put((528909171 * this.field_ap_2082));
			for (final int element : this.field_av_2108) {
				rsbytebuffer.putInt((element));
			}
			rsbytebuffer.putInt((this.field_bs_2093 * 2000890903));
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ef.d()");
		}
	}

	public static int method_n_int(final int i, final int i_11_, int i_12_, final byte i_13_) {
		int i_14_;
		try {
			i_12_ &= 0x3;
			i_14_ = (i_12_ == 0 ? i : i_12_ == 1 ? i_11_ : i_12_ == 2 ? 7 - i : 7 - i_11_);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ef.n()");
		}
		return i_14_;
	}

	public static byte method_n_byte(final char c, final byte i) {
		byte i_15_;
		try {
			byte i_16_;
			if (((c <= 0) || (c >= '\u0080')) && ((c < '\u00a0') || (c > '\u00ff'))) {
				if (c == '\u20ac') {
					i_16_ = (byte) -128;
				} else if (c == '\u201a') {
					i_16_ = (byte) -126;
				} else if (c == '\u0192') {
					i_16_ = (byte) -125;
				} else if (c == '\u201e') {
					i_16_ = (byte) -124;
				} else if (c == '\u2026') {
					i_16_ = (byte) -123;
				} else if (c == '\u2020') {
					i_16_ = (byte) -122;
				} else if (c == '\u2021') {
					i_16_ = (byte) -121;
				} else if (c == '\u02c6') {
					i_16_ = (byte) -120;
				} else if (c == '\u2030') {
					i_16_ = (byte) -119;
				} else if (c == '\u0160') {
					i_16_ = (byte) -118;
				} else if (c == '\u2039') {
					i_16_ = (byte) -117;
				} else if (c == '\u0152') {
					i_16_ = (byte) -116;
				} else if (c == '\u017d') {
					i_16_ = (byte) -114;
				} else if (c == '\u2018') {
					i_16_ = (byte) -111;
				} else if (c == '\u2019') {
					i_16_ = (byte) -110;
				} else if (c == '\u201c') {
					i_16_ = (byte) -109;
				} else if (c == '\u201d') {
					i_16_ = (byte) -108;
				} else if (c == '\u2022') {
					i_16_ = (byte) -107;
				} else if (c == '\u2013') {
					i_16_ = (byte) -106;
				} else if (c == '\u2014') {
					i_16_ = (byte) -105;
				} else if (c == '\u02dc') {
					i_16_ = (byte) -104;
				} else if (c == '\u2122') {
					i_16_ = (byte) -103;
				} else if (c == '\u0161') {
					i_16_ = (byte) -102;
				} else if (c == '\u203a') {
					i_16_ = (byte) -101;
				} else if (c == '\u0153') {
					i_16_ = (byte) -100;
				} else if (c == '\u017e') {
					i_16_ = (byte) -98;
				} else if (c == '\u0178') {
					i_16_ = (byte) -97;
				} else {
					i_16_ = (byte) 63;
				}
			} else {
				i_16_ = (byte) c;
			}
			i_15_ = i_16_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ef.n()");
		}
		return i_15_;
	}
}
