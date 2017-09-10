/* Class_fg - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_fg extends Class_bu {
	int[] field_a_2328 = new int[16];
	int field_d_2329 = -171062016;
	int field_z_2330 = 461057216;
	int[] field_y_2331 = new int[16];
	int[] field_m_2332 = new int[16];
	int[] field_g_2333 = new int[16];
	int[] field_f_2334 = new int[16];
	int[] field_e_2335 = new int[16];
	int[] field_h_2336 = new int[16];
	long field_as_2337;
	int[] field_l_2338 = new int[16];
	int[] field_u_2339 = new int[16];
	int field_al_2340;
	int[] field_c_2341 = new int[16];
	int[] field_p_2342 = new int[16];
	int[] field_o_2343 = new int[16];
	int[] field_b_2344 = new int[16];
	NodeMultiSet field_n_2345 = new NodeMultiSet(128);
	int[] field_w_2346 = new int[16];
	boolean field_ae_2347;
	Class_fm[][] field_ad_2348 = new Class_fm[16][128];
	static final int field_x_2349 = 4;
	Class_fj field_ab_2350 = new Class_fj(this);
	int field_ax_2351;
	long field_ar_2352;
	Class_fr field_ak_2353 = new Class_fr();
	Class_fm[][] field_i_2354 = new Class_fm[16][128];
	int[] field_t_2355 = new int[16];

	public synchronized void method_n_void(final int i, final int i_0_) {
		try {
			this.field_d_2329 = i * -856306227;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fg.n()");
		}
	}

	void method_aw_void(final int i, final byte i_1_) {
		try {
			if ((this.field_c_2341[i] & 0x4) != 0) {
				for (Class_fm class_fm = ((Class_fm) this.field_ab_2350.field_d_2376.method_f_ga()); class_fm != null; class_fm = ((Class_fm) this.field_ab_2350.field_d_2376.method_a_ga())) {
					if (i == (-843828363 * class_fm.field_n_2401)) {
						class_fm.field_o_2393 = 0;
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fg.aw()");
		}
	}

	public synchronized boolean method_z_boolean(final Class_fu class_fu, final FileStore class_fs, final Class_bw class_bw, final int i, final int i_2_) {
		boolean bool;
		try {
			class_fu.method_d_void();
			boolean bool_3_ = true;
			int[] is = null;
			if (i > 0) {
				is = new int[] { i };
			}
			for (Class_gi class_gi = (Class_gi) class_fu.field_n_2500.method_y_ga(); class_gi != null; class_gi = (Class_gi) class_fu.field_n_2500.method_e_ga()) {
				final int i_4_ = (int) class_gi.id;
				Class_fb class_fb = (Class_fb) this.field_n_2345.method_n_ga(i_4_);
				if (class_fb == null) {
					class_fb = NpcComposite.method_n_fb(class_fs, i_4_, -912682884);
					if (class_fb == null) {
						bool_3_ = false;
						continue;
					}
					this.field_n_2345.method_d_void(class_fb, i_4_);
				}
				if (!class_fb.method_d_boolean(class_bw, class_gi.field_n_3010, is, 1707258446)) {
					bool_3_ = false;
				}
			}
			if (bool_3_) {
				class_fu.method_z_void();
			}
			bool = bool_3_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fg.z()");
		}
		return bool;
	}

	int method_d_int(final byte i) {
		int i_5_;
		try {
			i_5_ = this.field_d_2329 * -1787042043;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fg.d()");
		}
		return i_5_;
	}

	synchronized void method_e_void(final byte i) {
		try {
			for (Class_fb class_fb = (Class_fb) this.field_n_2345.method_y_ga(); class_fb != null; class_fb = (Class_fb) this.field_n_2345.method_e_ga()) {
				class_fb.removeLink();
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fg.e()");
		}
	}

	public synchronized void method_h_void(final Class_fu class_fu, final boolean bool, final int i) {
		try {
			method_u_void(1668019000);
			this.field_ak_2353.method_n_void(class_fu.field_d_2501);
			this.field_ae_2347 = bool;
			this.field_ar_2352 = 0L;
			final int i_6_ = this.field_ak_2353.method_y_int();
			for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
				this.field_ak_2353.method_e_void(i_7_);
				this.field_ak_2353.method_m_void(i_7_);
				this.field_ak_2353.method_g_void(i_7_);
			}
			this.field_ax_2351 = this.field_ak_2353.method_q_int() * -76810329;
			this.field_al_2340 = ((this.field_ak_2353.field_e_2463[1709522967 * this.field_ax_2351]) * -1957027237);
			this.field_as_2337 = ((this.field_ak_2353.method_u_long(2054307283 * this.field_al_2340)) * -8247113359931208011L);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fg.h()");
		}
	}

	public synchronized void method_u_void(final int i) {
		try {
			this.field_ak_2353.method_d_void();
			method_i_void(-1916535073);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fg.u()");
		}
	}

	public synchronized boolean method_q_boolean(final int i) {
		boolean bool;
		try {
			bool = this.field_ak_2353.method_z_boolean();
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fg.q()");
		}
		return bool;
	}

	public synchronized void method_k_void(final int i, final int i_8_, final byte i_9_) {
		try {
			method_x_void(i, i_8_, 1733306349);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fg.k()");
		}
	}

	void method_x_void(final int i, final int i_10_, final int i_11_) {
		try {
			this.field_f_2334[i] = i_10_;
			this.field_a_2328[i] = i_10_ & ~0x7f;
			method_r_void(i, i_10_, (byte) 109);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fg.x()");
		}
	}

	void method_r_void(final int i, final int i_12_, final byte i_13_) {
		try {
			if (i_12_ != this.field_m_2332[i]) {
				this.field_m_2332[i] = i_12_;
				for (int i_14_ = 0; i_14_ < 128; i_14_++) {
					this.field_ad_2348[i][i_14_] = null;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fg.r()");
		}
	}

	void method_j_void(final int i, final int i_15_, final int i_16_, final int i_17_) {
		try {
			method_v_void(i, i_15_, 64, (byte) 75);
			if ((this.field_c_2341[i] & 0x2) != 0) {
				for (Class_fm class_fm = ((Class_fm) this.field_ab_2350.field_d_2376.method_m_ga()); class_fm != null; class_fm = ((Class_fm) this.field_ab_2350.field_d_2376.method_h_ga())) {
					if (((-843828363 * class_fm.field_n_2401) == i) && ((1912998185 * class_fm.field_x_2405) < 0)) {
						this.field_i_2354[i][-1281329883 * class_fm.field_g_2394] = null;
						this.field_i_2354[i][i_15_] = class_fm;
						final int i_18_ = ((-1572218935 * class_fm.field_a_2389) + ((class_fm.field_h_2392 * -1357178619 * 982626219 * class_fm.field_l_2399) >> 12));
						class_fm.field_a_2389 += ((i_15_ - (-1281329883 * class_fm.field_g_2394)) << 8) * -1934232967;
						class_fm.field_h_2392 = (847170509 * (i_18_ - (class_fm.field_a_2389 * -1572218935)));
						class_fm.field_l_2399 = 1026568192;
						class_fm.field_g_2394 = i_15_ * 703897261;
						return;
					}
				}
			}
			final Class_fb class_fb = ((Class_fb) this.field_n_2345.method_n_ga(this.field_m_2332[i]));
			if (class_fb != null) {
				final Class_ba class_ba = class_fb.field_d_2282[i_15_];
				if (class_ba != null) {
					final Class_fm class_fm = new Class_fm();
					class_fm.field_n_2401 = -727530275 * i;
					class_fm.field_d_2390 = class_fb;
					class_fm.field_z_2391 = class_ba;
					class_fm.field_y_2396 = class_fb.field_g_2286[i_15_];
					class_fm.field_e_2397 = (-1190659317 * class_fb.field_f_2287[i_15_]);
					class_fm.field_g_2394 = i_15_ * 703897261;
					class_fm.field_f_2395 = (((i_16_ * i_16_ * -1717871541 * class_fb.field_n_2284 * class_fb.field_y_2297[i_15_]) + 1024) >> 11) * 455941889;
					class_fm.field_m_2398 = ((class_fb.field_e_2295[i_15_] & 0xff) * -1254743289);
					class_fm.field_a_2389 = -1934232967 * ((i_15_ << 8) - ((class_fb.field_z_2283[i_15_]) & 0x7fff));
					class_fm.field_u_2400 = 0;
					class_fm.field_q_2403 = 0;
					class_fm.field_k_2402 = 0;
					class_fm.field_x_2405 = 948657383;
					class_fm.field_r_2404 = 0;
					if (this.field_b_2344[i] == 0) {
						class_fm.field_v_2407 = Class_bd.method_y_bd(class_ba, method_am_int(class_fm, 1695010562), method_aj_int(class_fm, 1970150883), method_ag_int(class_fm, (byte) -52));
					} else {
						class_fm.field_v_2407 = Class_bd.method_y_bd(class_ba, method_am_int(class_fm, 137561481), 0, method_ag_int(class_fm, (byte) -52));
						method_s_void(class_fm, (class_fb.field_z_2283[i_15_]) < 0, 1545840667);
					}
					if (class_fb.field_z_2283[i_15_] < 0) {
						class_fm.field_v_2407.method_h_void(-1);
					}
					if ((-847611741 * class_fm.field_e_2397) >= 0) {
						final Class_fm class_fm_19_ = (this.field_ad_2348[i][(class_fm.field_e_2397 * -847611741)]);
						if ((class_fm_19_ != null) && ((class_fm_19_.field_x_2405 * 1912998185) < 0)) {
							this.field_i_2354[i][(-1281329883 * class_fm_19_.field_g_2394)] = null;
							class_fm_19_.field_x_2405 = 0;
						}
						this.field_ad_2348[i][class_fm.field_e_2397 * -847611741] = class_fm;
					}
					this.field_ab_2350.field_d_2376.add(class_fm);
					this.field_i_2354[i][i_15_] = class_fm;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fg.j()");
		}
	}

	void method_s_void(final Class_fm class_fm, final boolean bool, final int i) {
		try {
			int i_20_ = class_fm.field_z_2391.field_d_506.length;
			int i_21_;
			if (bool && class_fm.field_z_2391.field_e_507) {
				final int i_22_ = ((i_20_ + i_20_) - class_fm.field_z_2391.field_z_504);
				i_21_ = (int) (((long) (this.field_b_2344[(class_fm.field_n_2401 * -843828363)]) * (long) i_22_) >> 6);
				i_20_ <<= 8;
				if (i_21_ >= i_20_) {
					i_21_ = (i_20_ + i_20_) - 1 - i_21_;
					class_fm.field_v_2407.method_s_void(true);
				}
			} else {
				i_21_ = (int) (((long) i_20_ * (long) (this.field_b_2344[(class_fm.field_n_2401 * -843828363)])) >> 6);
			}
			class_fm.field_v_2407.method_j_void(i_21_);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fg.s()");
		}
	}

	void method_p_void(final int i, final int i_23_, final byte i_24_) {
		/* empty */
	}

	void method_o_void(final int i, final int i_25_, final short i_26_) {
		try {
			this.field_h_2336[i] = i_25_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fg.o()");
		}
	}

	void method_b_void(final int i, final byte i_27_) {
		try {
			for (Class_fm class_fm = (Class_fm) this.field_ab_2350.field_d_2376.method_f_ga(); class_fm != null; class_fm = (Class_fm) this.field_ab_2350.field_d_2376.method_a_ga()) {
				if ((i < 0) || ((-843828363 * class_fm.field_n_2401) == i)) {
					if (class_fm.field_v_2407 != null) {
						class_fm.field_v_2407.method_o_void((-1281893659 * NpcDefinitions.audioSampleRate) / 100);
						if (class_fm.field_v_2407.method_i_boolean()) {
							this.field_ab_2350.field_z_2378.method_n_void(class_fm.field_v_2407);
						}
						class_fm.method_n_void((byte) -34);
					}
					if ((class_fm.field_x_2405 * 1912998185) < 0) {
						this.field_i_2354[class_fm.field_n_2401 * -843828363][-1281329883 * class_fm.field_g_2394] = null;
					}
					class_fm.removeLink();
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fg.b()");
		}
	}

	void method_t_void(int i, final byte i_28_) {
		try {
			if (i >= 0) {
				this.field_y_2331[i] = 12800;
				this.field_e_2335[i] = 8192;
				this.field_g_2333[i] = 16383;
				this.field_h_2336[i] = 8192;
				this.field_l_2338[i] = 0;
				this.field_u_2339[i] = 8192;
				method_an_void(i, (byte) 84);
				method_aw_void(i, (byte) 20);
				this.field_c_2341[i] = 0;
				this.field_p_2342[i] = 32767;
				this.field_o_2343[i] = 256;
				this.field_b_2344[i] = 0;
				method_aq_void(i, 8192, -1820497449);
			} else {
				for (i = 0; i < 16; i++) {
					method_t_void(i, (byte) 120);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fg.t()");
		}
	}

	void method_w_void(final int i, final short i_29_) {
		try {
			for (Class_fm class_fm = (Class_fm) this.field_ab_2350.field_d_2376.method_f_ga(); class_fm != null; class_fm = (Class_fm) this.field_ab_2350.field_d_2376.method_a_ga()) {
				if (((i < 0) || (i == (-843828363 * class_fm.field_n_2401))) && ((1912998185 * class_fm.field_x_2405) < 0)) {
					this.field_i_2354[class_fm.field_n_2401 * -843828363][-1281329883 * class_fm.field_g_2394] = null;
					class_fm.field_x_2405 = 0;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fg.w()");
		}
	}

	void method_i_void(final int i) {
		try {
			method_b_void(-1, (byte) -2);
			method_t_void(-1, (byte) 94);
			for (int i_30_ = 0; i_30_ < 16; i_30_++) {
				this.field_m_2332[i_30_] = this.field_f_2334[i_30_];
			}
			for (int i_31_ = 0; i_31_ < 16; i_31_++) {
				this.field_a_2328[i_31_] = this.field_f_2334[i_31_] & ~0x7f;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fg.i()");
		}
	}

	void method_ah_void(final int i, final int i_32_) {
		try {
			int i_33_ = i & 0xf0;
			if (i_33_ == 128) {
				final int i_34_ = i & 0xf;
				final int i_35_ = (i >> 8) & 0x7f;
			final int i_36_ = (i >> 16) & 0x7f;
				method_v_void(i_34_, i_35_, i_36_, (byte) 48);
			} else if (i_33_ == 144) {
				final int i_37_ = i & 0xf;
				final int i_38_ = (i >> 8) & 0x7f;
				final int i_39_ = (i >> 16) & 0x7f;
					if (i_39_ > 0) {
						method_j_void(i_37_, i_38_, i_39_, 1197142385);
					} else {
						method_v_void(i_37_, i_38_, 64, (byte) 14);
					}
			} else if (i_33_ == 160) {
				final int i_40_ = i & 0xf;
				final int i_41_ = (i >> 8) & 0x7f;
				final int i_42_ = (i >> 16) & 0x7f;
				method_c_void(i_40_, i_41_, i_42_, -237973579);
			} else if (i_33_ == 176) {
				final int i_43_ = i & 0xf;
				final int i_44_ = (i >> 8) & 0x7f;
				final int i_45_ = (i >> 16) & 0x7f;
				if (i_44_ == 0) {
					this.field_a_2328[i_43_] = ((i_45_ << 14) + (this.field_a_2328[i_43_] & ~0x1fc000));
				}
				if (i_44_ == 32) {
					this.field_a_2328[i_43_] = ((this.field_a_2328[i_43_] & ~0x3f80) + (i_45_ << 7));
				}
				if (i_44_ == 1) {
					this.field_l_2338[i_43_] = ((this.field_l_2338[i_43_] & ~0x3f80) + (i_45_ << 7));
				}
				if (i_44_ == 33) {
					this.field_l_2338[i_43_] = i_45_ + (this.field_l_2338[i_43_] & ~0x7f);
				}
				if (i_44_ == 5) {
					this.field_u_2339[i_43_] = ((this.field_u_2339[i_43_] & ~0x3f80) + (i_45_ << 7));
				}
				if (i_44_ == 37) {
					this.field_u_2339[i_43_] = ((this.field_u_2339[i_43_] & ~0x7f) + i_45_);
				}
				if (i_44_ == 7) {
					this.field_y_2331[i_43_] = ((this.field_y_2331[i_43_] & ~0x3f80) + (i_45_ << 7));
				}
				if (i_44_ == 39) {
					this.field_y_2331[i_43_] = i_45_ + (this.field_y_2331[i_43_] & ~0x7f);
				}
				if (i_44_ == 10) {
					this.field_e_2335[i_43_] = (i_45_ << 7) + (this.field_e_2335[i_43_] & ~0x3f80);
				}
				if (i_44_ == 42) {
					this.field_e_2335[i_43_] = i_45_ + (this.field_e_2335[i_43_] & ~0x7f);
				}
				if (i_44_ == 11) {
					this.field_g_2333[i_43_] = (i_45_ << 7) + (this.field_g_2333[i_43_] & ~0x3f80);
				}
				if (i_44_ == 43) {
					this.field_g_2333[i_43_] = i_45_ + (this.field_g_2333[i_43_] & ~0x7f);
				}
				if (i_44_ == 64) {
					if (i_45_ >= 64) {
						this.field_c_2341[i_43_] |= 0x1;
					} else {
						this.field_c_2341[i_43_] &= ~0x1;
					}
				}
				if (i_44_ == 65) {
					if (i_45_ >= 64) {
						this.field_c_2341[i_43_] |= 0x2;
					} else {
						method_an_void(i_43_, (byte) 122);
						this.field_c_2341[i_43_] &= ~0x2;
					}
				}
				if (i_44_ == 99) {
					this.field_p_2342[i_43_] = ((this.field_p_2342[i_43_] & 0x7f) + (i_45_ << 7));
				}
				if (i_44_ == 98) {
					this.field_p_2342[i_43_] = ((this.field_p_2342[i_43_] & 0x3f80) + i_45_);
				}
				if (i_44_ == 101) {
					this.field_p_2342[i_43_] = ((i_45_ << 7) + 16384 + (this.field_p_2342[i_43_] & 0x7f));
				}
				if (i_44_ == 100) {
					this.field_p_2342[i_43_] = ((this.field_p_2342[i_43_] & 0x3f80) + 16384 + i_45_);
				}
				if (i_44_ == 120) {
					method_b_void(i_43_, (byte) 87);
				}
				if (i_44_ == 121) {
					method_t_void(i_43_, (byte) 101);
				}
				if (i_44_ == 123) {
					method_w_void(i_43_, (short) 3168);
				}
				if (i_44_ == 6) {
					final int i_46_ = this.field_p_2342[i_43_];
					if (i_46_ == 16384) {
						this.field_o_2343[i_43_] = ((i_45_ << 7) + (this.field_o_2343[i_43_] & ~0x3f80));
					}
				}
				if (i_44_ == 38) {
					final int i_47_ = this.field_p_2342[i_43_];
					if (i_47_ == 16384) {
						this.field_o_2343[i_43_] = ((this.field_o_2343[i_43_] & ~0x7f) + i_45_);
					}
				}
				if (i_44_ == 16) {
					this.field_b_2344[i_43_] = (i_45_ << 7) + (this.field_b_2344[i_43_] & ~0x3f80);
				}
				if (i_44_ == 48) {
					this.field_b_2344[i_43_] = ((this.field_b_2344[i_43_] & ~0x7f) + i_45_);
				}
				if (i_44_ == 81) {
					if (i_45_ >= 64) {
						this.field_c_2341[i_43_] |= 0x4;
					} else {
						method_aw_void(i_43_, (byte) 81);
						this.field_c_2341[i_43_] &= ~0x4;
					}
				}
				if (i_44_ == 17) {
					method_aq_void(i_43_, ((i_45_ << 7) + (this.field_t_2355[i_43_] & ~0x3f80)), -1927853613);
				}
				if (i_44_ == 49) {
					method_aq_void(i_43_, (this.field_t_2355[i_43_] & ~0x7f) + i_45_, -1906261813);
				}
			} else if (i_33_ == 192) {
				final int i_48_ = i & 0xf;
				final int i_49_ = (i >> 8) & 0x7f;
					method_r_void(i_48_, i_49_ + this.field_a_2328[i_48_], (byte) 125);
			} else if (i_33_ == 208) {
				final int i_50_ = i & 0xf;
				final int i_51_ = (i >> 8) & 0x7f;
					method_p_void(i_50_, i_51_, (byte) 42);
			} else if (i_33_ == 224) {
				final int i_52_ = i & 0xf;
				final int i_53_ = ((i >> 8) & 0x7f) + ((i >> 9) & 0x3f80);
				method_o_void(i_52_, i_53_, (short) -8127);
			} else {
				i_33_ = i & 0xff;
				if (i_33_ == 255) {
					method_i_void(-1874295155);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fg.ah()");
		}
	}

	int method_am_int(final Class_fm class_fm, final int i) {
		int i_54_;
		try {
			int i_55_ = (((class_fm.field_l_2399 * 982626219 * class_fm.field_h_2392 * -1357178619) >> 12) + (-1572218935 * class_fm.field_a_2389));
			i_55_ += ((this.field_o_2343[class_fm.field_n_2401 * -843828363]) * ((this.field_h_2336[class_fm.field_n_2401 * -843828363]) - 8192)) >> 12;
					final Class_fo class_fo = class_fm.field_y_2396;
					if (((class_fo.field_m_2416 * 1017855601) > 0) && (((class_fo.field_f_2419 * -1876403331) > 0) || ((this.field_l_2338[-843828363 * class_fm.field_n_2401]) > 0))) {
						int i_56_ = (class_fo.field_f_2419 * -1876403331) << 2;
						final int i_57_ = (class_fo.field_a_2421 * -744151293) << 1;
						if ((class_fm.field_j_2409 * 139132847) < i_57_) {
							i_56_ = ((i_56_ * class_fm.field_j_2409 * 139132847) / i_57_);
						}
						i_56_ += ((this.field_l_2338[class_fm.field_n_2401 * -843828363]) >> 7);
						final double d = Math.sin(((-511189059 * class_fm.field_s_2406) & 0x1ff) * 0.01227184630308513);
						i_55_ += (int) (d * i_56_);
					}
					final int i_58_ = (int) ((((class_fm.field_z_2391.field_n_505) * 256 * Math.pow(2.0, i_55_ * 3.255208333333333E-4)) / (NpcDefinitions.audioSampleRate * -1281893659)) + 0.5);
					i_54_ = i_58_ < 1 ? 1 : i_58_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fg.am()");
		}
		return i_54_;
	}

	int method_ag_int(final Class_fm class_fm, final byte i) {
		int i_59_;
		try {
			final int i_60_ = (this.field_e_2335[-843828363 * class_fm.field_n_2401]);
			i_59_ = (i_60_ < 8192 ? ((i_60_ * class_fm.field_m_2398 * 612358839) + 32) >> 6 : 16384 - ((((128 - (class_fm.field_m_2398 * 612358839)) * (16384 - i_60_)) + 32) >> 6));
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fg.ag()");
		}
		return i_59_;
	}

	@Override
	protected synchronized Class_bu method_g_bu() {
		Class_fj class_fj;
		try {
			class_fj = this.field_ab_2350;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fg.g()");
		}
		return class_fj;
	}

	@Override
	protected synchronized int method_m_int() {
		return 0;
	}

	@Override
	protected synchronized void method_a_void(final int[] is, int i, int i_61_) {
		try {
			if (this.field_ak_2353.method_z_boolean()) {
				final int i_62_ = (((this.field_ak_2353.field_d_2469) * -355531437 * this.field_z_2330) / (-1281893659 * NpcDefinitions.audioSampleRate));
				do {
					final long l = (((long) i_62_ * (long) i_61_) + (8019424889361888937L * this.field_ar_2352));
					if (((5778339895948930973L * this.field_as_2337) - l) >= 0L) {
						this.field_ar_2352 = 3071821727111024025L * l;
						break;
					}
					final int i_63_ = (int) (((i_62_ + ((this.field_as_2337 * 5778339895948930973L) - (8019424889361888937L * this.field_ar_2352))) - 1L) / i_62_);
					this.field_ar_2352 += (long) i_63_ * (long) i_62_ * 3071821727111024025L;
					this.field_ab_2350.method_a_void(is, i, i_63_);
					i += i_63_;
					i_61_ -= i_63_;
					method_ap_void(-875692135);
				} while (this.field_ak_2353.method_z_boolean());
			}
			this.field_ab_2350.method_a_void(is, i, i_61_);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fg.a()");
		}
	}

	@Override
	protected synchronized void method_l_void(int i) {
		try {
			if (this.field_ak_2353.method_z_boolean()) {
				final int i_64_ = (((this.field_ak_2353.field_d_2469) * -355531437 * this.field_z_2330) / (-1281893659 * NpcDefinitions.audioSampleRate));
				do {
					final long l = (((long) i_64_ * (long) i) + (8019424889361888937L * this.field_ar_2352));
					if (((5778339895948930973L * this.field_as_2337) - l) >= 0L) {
						this.field_ar_2352 = l * 3071821727111024025L;
						break;
					}
					final int i_65_ = (int) (((i_64_ + ((5778339895948930973L * this.field_as_2337) - (this.field_ar_2352 * 8019424889361888937L))) - 1L) / i_64_);
					this.field_ar_2352 += (long) i_64_ * (long) i_65_ * 3071821727111024025L;
					this.field_ab_2350.method_l_void(i_65_);
					i -= i_65_;
					method_ap_void(-391863640);
				} while (this.field_ak_2353.method_z_boolean());
			}
			this.field_ab_2350.method_l_void(i);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fg.l()");
		}
	}

	void method_ap_void(final int i) {
		try {
			int i_66_ = 1709522967 * this.field_ax_2351;
			int i_67_ = 2054307283 * this.field_al_2340;
			long l = this.field_as_2337 * 5778339895948930973L;
			while ((this.field_al_2340 * 2054307283) == i_67_) {
				while ((this.field_ak_2353.field_e_2463[i_66_]) == i_67_) {
					this.field_ak_2353.method_e_void(i_66_);
					final int i_68_ = this.field_ak_2353.method_a_int(i_66_);
					if (i_68_ == 1) {
						this.field_ak_2353.method_f_void();
						this.field_ak_2353.method_g_void(i_66_);
						if (this.field_ak_2353.method_k_boolean()) {
							if (!this.field_ae_2347 || (i_67_ == 0)) {
								method_i_void(-1040134345);
								this.field_ak_2353.method_d_void();
								return;
							}
							this.field_ak_2353.method_x_void(l);
						}
						break;
					}
					if ((i_68_ & 0x80) != 0) {
						method_ah_void(i_68_, 635869241);
					}
					this.field_ak_2353.method_m_void(i_66_);
					this.field_ak_2353.method_g_void(i_66_);
				}
				i_66_ = this.field_ak_2353.method_q_int();
				i_67_ = (this.field_ak_2353.field_e_2463[i_66_]);
				l = this.field_ak_2353.method_u_long(i_67_);
			}
			this.field_ax_2351 = -76810329 * i_66_;
			this.field_al_2340 = i_67_ * -1957027237;
			this.field_as_2337 = -8247113359931208011L * l;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fg.ap()");
		}
	}

	boolean method_au_boolean(final Class_fm class_fm, final int[] is, final int i, final int i_69_, final byte i_70_) {
		try {
			class_fm.field_c_2408 = -1274629831 * ((NpcDefinitions.audioSampleRate * -1281893659) / 100);
			if (((1912998185 * class_fm.field_x_2405) >= 0) && ((class_fm.field_v_2407 == null) || class_fm.field_v_2407.method_w_boolean())) {
				class_fm.method_n_void((byte) -10);
				class_fm.removeLink();
				if (((-847611741 * class_fm.field_e_2397) > 0) && (class_fm == (this.field_ad_2348[class_fm.field_n_2401 * -843828363][(class_fm.field_e_2397 * -847611741)]))) {
					this.field_ad_2348[class_fm.field_n_2401 * -843828363][class_fm.field_e_2397 * -847611741] = null;
				}
				return true;
			}
			int i_71_ = class_fm.field_l_2399 * 982626219;
			if (i_71_ > 0) {
				i_71_ -= (int) ((16.0 * Math.pow(2.0, ((this.field_u_2339[(-843828363 * (class_fm.field_n_2401))]) * 4.921259842519685E-4))) + 0.5);
				if (i_71_ < 0) {
					i_71_ = 0;
				}
				class_fm.field_l_2399 = i_71_ * 142856963;
			}
			class_fm.field_v_2407.method_b_void(method_am_int(class_fm, 1220733393));
			final Class_fo class_fo = class_fm.field_y_2396;
			boolean bool = false;
			class_fm.field_j_2409 += 1971042127;
			class_fm.field_s_2406 += class_fo.field_m_2416 * 36469445;
			final double d = (5.086263020833333E-6 * ((((-1281329883 * (class_fm.field_g_2394)) - 60) << 8) + ((982626219 * class_fm.field_l_2399 * -1357178619 * class_fm.field_h_2392) >> 12)));
			if ((1348154747 * class_fo.field_z_2418) > 0) {
				if ((1536257307 * class_fo.field_g_2420) > 0) {
					class_fm.field_u_2400 += (int) ((128.0 * Math.pow(2.0, (1536257307 * (class_fo.field_g_2420) * d))) + 0.5) * 1784621939;
				} else {
					class_fm.field_u_2400 += 798341504;
				}
			}
			if (class_fo.field_n_2415 != null) {
				if ((1076202935 * class_fo.field_y_2413) > 0) {
					class_fm.field_q_2403 += (int) ((128.0 * Math.pow(2.0, (1076202935 * (class_fo.field_y_2413) * d))) + 0.5) * -1670332659;
				} else {
					class_fm.field_q_2403 += 945784448;
				}
				for (/**/; (((-1711980875 * class_fm.field_k_2402) < (class_fo.field_n_2415.length - 2)) && ((2016028613 * class_fm.field_q_2403) > (((class_fo.field_n_2415[(-1711980875 * class_fm.field_k_2402) + 2]) & 0xff) << 8))); class_fm.field_k_2402 += 59014970) {
					/* empty */
				}
				if (((class_fm.field_k_2402 * -1711980875) == (class_fo.field_n_2415.length - 2)) && ((class_fo.field_n_2415[((-1711980875 * class_fm.field_k_2402) + 1)]) == 0)) {
					bool = true;
				}
			}
			if (((1912998185 * class_fm.field_x_2405) >= 0) && (class_fo.field_d_2414 != null) && (((this.field_c_2341[-843828363 * class_fm.field_n_2401]) & 0x1) == 0)
					&& (((class_fm.field_e_2397 * -847611741) < 0) || (class_fm != (this.field_ad_2348[class_fm.field_n_2401 * -843828363][(-847611741 * class_fm.field_e_2397)])))) {
				if ((1430340651 * class_fo.field_e_2417) > 0) {
					class_fm.field_x_2405 += (int) ((128.0 * (Math.pow(2.0, d * (1430340651 * (class_fo.field_e_2417))))) + 0.5) * -948657383;
				} else {
					class_fm.field_x_2405 += -1169060736;
				}
				for (/**/; (((class_fm.field_r_2404 * 967128577) < (class_fo.field_d_2414.length - 2)) && ((class_fm.field_x_2405 * 1912998185) > (((class_fo.field_d_2414[2 + (967128577 * class_fm.field_r_2404)]) & 0xff) << 8))); class_fm.field_r_2404 += -1417833470) {
					/* empty */
				}
				if ((class_fo.field_d_2414.length - 2) == (967128577 * class_fm.field_r_2404)) {
					bool = true;
				}
			}
			if (bool) {
				class_fm.field_v_2407.method_o_void(class_fm.field_c_2408 * 289598729);
				if (is != null) {
					class_fm.field_v_2407.method_a_void(is, i, i_69_);
				} else {
					class_fm.field_v_2407.method_l_void(i_69_);
				}
				if (class_fm.field_v_2407.method_i_boolean()) {
					this.field_ab_2350.field_z_2378.method_n_void(class_fm.field_v_2407);
				}
				class_fm.method_n_void((byte) -85);
				if ((class_fm.field_x_2405 * 1912998185) >= 0) {
					class_fm.removeLink();
					if (((class_fm.field_e_2397 * -847611741) > 0) && (class_fm == (this.field_ad_2348[(class_fm.field_n_2401 * -843828363)][(class_fm.field_e_2397 * -847611741)]))) {
						this.field_ad_2348[-843828363 * class_fm.field_n_2401][-847611741 * class_fm.field_e_2397] = null;
					}
				}
				return true;
			}
			class_fm.field_v_2407.method_p_void(289598729 * class_fm.field_c_2408, method_aj_int(class_fm, 163262830), method_ag_int(class_fm, (byte) 81));
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fg.au()");
		}
		return false;
	}

	void method_an_void(final int i, final byte i_72_) {
		try {
			if ((this.field_c_2341[i] & 0x2) != 0) {
				for (Class_fm class_fm = ((Class_fm) this.field_ab_2350.field_d_2376.method_f_ga()); class_fm != null; class_fm = ((Class_fm) this.field_ab_2350.field_d_2376.method_a_ga())) {
					if ((i == (-843828363 * class_fm.field_n_2401)) && ((this.field_i_2354[i][(class_fm.field_g_2394 * -1281329883)]) == null) && ((1912998185 * class_fm.field_x_2405) < 0)) {
						class_fm.field_x_2405 = 0;
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fg.an()");
		}
	}

	void method_c_void(final int i, final int i_73_, final int i_74_, final int i_75_) {
		/* empty */
	}

	boolean method_af_boolean(final Class_fm class_fm, final byte i) {
		do {
			try {
				if (class_fm.field_v_2407 != null) {
					break;
				}
				if ((class_fm.field_x_2405 * 1912998185) >= 0) {
					class_fm.removeLink();
					if (((-847611741 * class_fm.field_e_2397) > 0) && ((this.field_ad_2348[class_fm.field_n_2401 * -843828363][class_fm.field_e_2397 * -847611741]) == class_fm)) {
						this.field_ad_2348[-843828363 * class_fm.field_n_2401][class_fm.field_e_2397 * -847611741] = null;
					}
				}
			} catch (final RuntimeException runtimeexception) {
				throw GameCanvas.error(runtimeexception, "fg.af()");
			}
			return true;
		} while (false);
		return false;
	}

	public synchronized void method_y_void(final int i) {
		try {
			for (Class_fb class_fb = (Class_fb) this.field_n_2345.method_y_ga(); class_fb != null; class_fb = (Class_fb) this.field_n_2345.method_e_ga()) {
				class_fb.method_z_void(1415908890);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fg.y()");
		}
	}

	int method_aj_int(final Class_fm class_fm, final int i) {
		int i_76_;
		try {
			final Class_fo class_fo = class_fm.field_y_2396;
			int i_77_ = ((4096 + ((this.field_y_2331[-843828363 * class_fm.field_n_2401]) * (this.field_g_2333[class_fm.field_n_2401 * -843828363]))) >> 13);
			i_77_ = ((i_77_ * i_77_) + 16384) >> 15;
			i_77_ = (16384 + (i_77_ * class_fm.field_f_2395 * 1871962369)) >> 15;
			i_77_ = ((128 + (i_77_ * -1787042043 * this.field_d_2329)) >> 8);
			if ((1348154747 * class_fo.field_z_2418) > 0) {
				i_77_ = (int) ((i_77_ * Math.pow(0.5, (1008529851 * (class_fm.field_u_2400) * 1.953125E-5 * ((class_fo.field_z_2418) * 1348154747)))) + 0.5);
			}
			if (class_fo.field_n_2415 != null) {
				final int i_78_ = 2016028613 * class_fm.field_q_2403;
				int i_79_ = (class_fo.field_n_2415[(-1711980875 * class_fm.field_k_2402) + 1]);
				if ((class_fm.field_k_2402 * -1711980875) < (class_fo.field_n_2415.length - 2)) {
					final int i_80_ = ((class_fo.field_n_2415[-1711980875 * class_fm.field_k_2402]) & 0xff) << 8;
					final int i_81_ = (((class_fo.field_n_2415[((class_fm.field_k_2402 * -1711980875) + 2)]) & 0xff) << 8);
					i_79_ += (((class_fo.field_n_2415[((-1711980875 * class_fm.field_k_2402) + 3)]) - i_79_) * (i_78_ - i_80_)) / (i_81_ - i_80_);
				}
				i_77_ = (32 + (i_79_ * i_77_)) >> 6;
			}
			if (((1912998185 * class_fm.field_x_2405) > 0) && (class_fo.field_d_2414 != null)) {
				final int i_82_ = class_fm.field_x_2405 * 1912998185;
				int i_83_ = (class_fo.field_d_2414[1 + (class_fm.field_r_2404 * 967128577)]);
				if ((967128577 * class_fm.field_r_2404) < (class_fo.field_d_2414.length - 2)) {
					final int i_84_ = (((class_fo.field_d_2414[967128577 * class_fm.field_r_2404]) & 0xff) << 8);
					final int i_85_ = (((class_fo.field_d_2414[((class_fm.field_r_2404 * 967128577) + 2)]) & 0xff) << 8);
					i_83_ += (((class_fo.field_d_2414[3 + (967128577 * class_fm.field_r_2404)]) - i_83_) * (i_82_ - i_84_)) / (i_85_ - i_84_);
				}
				i_77_ = (32 + (i_77_ * i_83_)) >> 6;
			}
			i_76_ = i_77_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fg.aj()");
		}
		return i_76_;
	}

	void method_v_void(final int i, final int i_86_, final int i_87_, final byte i_88_) {
		try {
			final Class_fm class_fm = this.field_i_2354[i][i_86_];
			if (class_fm != null) {
				this.field_i_2354[i][i_86_] = null;
				if ((this.field_c_2341[i] & 0x2) != 0) {
					for (Class_fm class_fm_89_ = ((Class_fm) this.field_ab_2350.field_d_2376.method_f_ga()); class_fm_89_ != null; class_fm_89_ = ((Class_fm) this.field_ab_2350.field_d_2376.method_a_ga())) {
						if (((class_fm.field_n_2401 * -843828363) == (class_fm_89_.field_n_2401 * -843828363)) && ((1912998185 * class_fm_89_.field_x_2405) < 0) && (class_fm_89_ != class_fm)) {
							class_fm.field_x_2405 = 0;
							break;
						}
					}
				} else {
					class_fm.field_x_2405 = 0;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fg.v()");
		}
	}

	void method_aq_void(final int i, final int i_90_, final int i_91_) {
		try {
			this.field_t_2355[i] = i_90_;
			this.field_w_2346[i] = (int) ((2097152.0 * Math.pow(2.0, 5.4931640625E-4 * i_90_)) + 0.5);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fg.aq()");
		}
	}

	@Override
	protected synchronized Class_bu method_f_bu() {
		return null;
	}

	public Class_fg() {
		method_i_void(-777551073);
	}
}
