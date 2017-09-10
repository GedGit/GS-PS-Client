/* Class_av - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public class Class_av {
	Class_bu[] field_ae_371 = new Class_bu[8];
	static final int field_b_372 = 8;
	int field_x_373;
	int[] field_a_374;
	Class_bu field_h_375;
	int field_l_376 = -198516576;
	static final int field_o_377 = 3;
	int field_q_378;
	int field_k_379;
	static Class_bg field_g_380;
	long field_r_381 = 0L;
	int field_j_382 = 0;
	int field_s_383 = 0;
	int field_v_384 = 0;
	long field_c_385 = 0L;
	boolean field_p_386 = true;
	static final int field_f_387 = 256;
	static int field_e_388;
	long field_u_389 = Renderable.getCurrentTime(845666397) * 599364458193328561L;
	Class_bu[] field_ak_390 = new Class_bu[8];
	int field_ad_391 = 0;
	static Socket field_am_392;

	public final synchronized void method_c_void(final Class_bu class_bu, final int i) {
		try {
			this.field_h_375 = class_bu;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "av.c()");
		}
	}

	void method_e_void() {
		/* empty */
	}

	public final synchronized void method_b_void(final int i) {
		do {
			try {
				this.field_p_386 = true;
				try {
					method_g_void();
				} catch (final Exception exception) {
					method_e_void();
					this.field_r_381 = ((Renderable.getCurrentTime(475457325) + 2000L) * -1386164457619694291L);
					break;
				}
				break;
			} catch (final RuntimeException runtimeexception) {
				throw GameCanvas.error(runtimeexception, "av.b()");
			}
		} while (false);
	}

	final void method_w_void(final int i, final int i_0_) {
		try {
			this.field_ad_391 -= i * -287244289;
			if ((287244287 * this.field_ad_391) < 0) {
				this.field_ad_391 = 0;
			}
			if (this.field_h_375 != null) {
				this.field_h_375.method_l_void(i);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "av.w()");
		}
	}

	final void method_i_void(final int[] is, final int i) {
		int i_1_ = i;
		if (Class_i.field_y_1073) {
			i_1_ = i << 1;
		}
		Class_dq.method_h_void(is, 0, i_1_);
		this.field_ad_391 -= i * -287244289;
		if ((this.field_h_375 != null) && ((287244287 * this.field_ad_391) <= 0)) {
			this.field_ad_391 += -287244289 * ((-1281893659 * NpcDefinitions.audioSampleRate) >> 4);
			ItemComposite.method_ad_void(this.field_h_375, -1111376616);
			method_ak_void(this.field_h_375, this.field_h_375.method_ay_int(), -1937270632);
			int i_2_ = 0;
			int i_3_ = 255;
			int i_4_ = 7;
			while_11_: while (i_3_ != 0) {
				int i_5_;
				int i_6_;
				if (i_4_ < 0) {
					i_5_ = i_4_ & 0x3;
					i_6_ = -(i_4_ >> 2);
				} else {
					i_5_ = i_4_;
					i_6_ = 0;
				}
				for (int i_7_ = (i_3_ >>> i_5_) & 0x11111111; i_7_ != 0; i_7_ >>>= 4) {
					if ((i_7_ & 0x1) != 0) {
						i_3_ &= (1 << i_5_) ^ 0xffffffff;
						Class_bu class_bu = null;
						Class_bu class_bu_8_ = this.field_ak_390[i_5_];
						while (class_bu_8_ != null) {
							final Class_bn class_bn = class_bu_8_.field_s_659;
							if ((class_bn != null) && (class_bn.field_g_609 > i_6_)) {
								i_3_ |= 1 << i_5_;
								class_bu = class_bu_8_;
								class_bu_8_ = class_bu_8_.field_r_658;
							} else {
								class_bu_8_.field_v_660 = true;
								final int i_9_ = class_bu_8_.method_m_int();
								i_2_ += i_9_;
								if (class_bn != null) {
									class_bn.field_g_609 += i_9_;
								}
								if (i_2_ >= (-531178035 * this.field_l_376)) {
									break while_11_;
								}
								Class_bu class_bu_10_ = class_bu_8_.method_g_bu();
								if (class_bu_10_ != null) {
									final int i_11_ = class_bu_8_.field_j_657;
									for (/**/; class_bu_10_ != null; class_bu_10_ = class_bu_8_.method_f_bu()) {
										method_ak_void(class_bu_10_, (i_11_ * class_bu_10_.method_ay_int()) >> 8, -468680535);
									}
								}
								final Class_bu class_bu_12_ = class_bu_8_.field_r_658;
								class_bu_8_.field_r_658 = null;
								if (class_bu == null) {
									this.field_ak_390[i_5_] = class_bu_12_;
								} else {
									class_bu.field_r_658 = class_bu_12_;
								}
								if (class_bu_12_ == null) {
									this.field_ae_371[i_5_] = class_bu;
								}
								class_bu_8_ = class_bu_12_;
							}
						}
					}
					i_5_ += 4;
					i_6_++;
				}
				i_4_--;
			}
			for (i_4_ = 0; i_4_ < 8; i_4_++) {
				Class_bu class_bu = this.field_ak_390[i_4_];
				final Class_bu[] class_bus = this.field_ak_390;
				this.field_ae_371[i_4_] = null;
				class_bus[i_4_] = null;
				Class_bu class_bu_13_;
				for (/**/; class_bu != null; class_bu = class_bu_13_) {
					class_bu_13_ = class_bu.field_r_658;
					class_bu.field_r_658 = null;
				}
			}
		}
		if ((287244287 * this.field_ad_391) < 0) {
			this.field_ad_391 = 0;
		}
		if (this.field_h_375 != null) {
			this.field_h_375.method_a_void(is, 0, i);
		}
		this.field_u_389 = Renderable.getCurrentTime(-339882833) * 599364458193328561L;
	}

	final void method_ak_void(final Class_bu class_bu, final int i, final int i_14_) {
		try {
			final int i_15_ = i >> 5;
		final Class_bu class_bu_16_ = this.field_ae_371[i_15_];
		if (class_bu_16_ == null) {
			this.field_ak_390[i_15_] = class_bu;
		} else {
			class_bu_16_.field_r_658 = class_bu;
		}
		this.field_ae_371[i_15_] = class_bu;
		class_bu.field_j_657 = i;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "av.ak()");
		}
	}

	void method_d_void(final int i) throws Exception {
		/* empty */
	}

	int method_z_int() throws Exception {
		int i;
		try {
			i = this.field_q_378 * -650778973;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "av.z()");
		}
		return i;
	}

	public final void method_o_void(final byte i) {
		try {
			this.field_p_386 = true;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "av.o()");
		}
	}

	void method_g_void() throws Exception {
		/* empty */
	}

	void method_y_void() throws Exception {
		/* empty */
	}

	Class_av() {
		/* empty */
	}

	public final synchronized void method_t_void(final int i) {
		try {
			if (field_g_380 != null) {
				boolean bool = true;
				for (int i_17_ = 0; i_17_ < 2; i_17_++) {
					if (this == field_g_380.field_d_546[i_17_]) {
						field_g_380.field_d_546[i_17_] = null;
					}
					if (field_g_380.field_d_546[i_17_] != null) {
						bool = false;
					}
				}
				if (bool) {
					field_g_380.field_z_545 = true;
					while (field_g_380.field_y_548) {
						Class_fc.sleep(50L);
					}
					field_g_380 = null;
				}
			}
			method_e_void();
			this.field_a_374 = null;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "av.t()");
		}
	}

	static final void method_bs_void(final int i, final int i_18_, final int i_19_, final int i_20_, final byte i_21_) {
		try {
			if ((-521735249 * client.field_gv_2795) == 1) {
				client.cross[(497183439 * client.field_gi_2856) / 100].rasterize((1797580775 * client.field_go_2792) - 8, (client.field_gj_2793 * 1828889005) - 8);
			}
			if ((client.field_gv_2795 * -521735249) == 2) {
				client.cross[4 + ((client.field_gi_2856 * 497183439) / 100)].rasterize((1797580775 * client.field_go_2792) - 8, (client.field_gj_2793 * 1828889005) - 8);
			}
			Class_e.method_av_void((byte) -114);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "av.bs()");
		}
	}

	public final synchronized void method_p_void(final int i) {
		try {
			if (this.field_a_374 != null) {
				long l = Renderable.getCurrentTime(2084754372);
				try {
					if ((3990257214781717157L * this.field_r_381) != 0L) {
						if (l < (this.field_r_381 * 3990257214781717157L)) {
							return;
						}
						method_d_void(this.field_q_378 * -650778973);
						this.field_r_381 = 0L;
						this.field_p_386 = true;
					}
					int i_22_ = method_z_int();
					if (((-1131945929 * this.field_v_384) - i_22_) > (this.field_j_382 * 2130407189)) {
						this.field_j_382 = ((this.field_v_384 * -1131945929) - i_22_) * 1654548541;
					}
					int i_23_ = ((1804096755 * this.field_x_373) + (966943345 * this.field_k_379));
					if ((i_23_ + 256) > 16384) {
						i_23_ = 16128;
					}
					if ((256 + i_23_) > (this.field_q_378 * -650778973)) {
						this.field_q_378 += 66333696;
						if ((-650778973 * this.field_q_378) > 16384) {
							this.field_q_378 = 1061339136;
						}
						method_e_void();
						method_d_void(-650778973 * this.field_q_378);
						i_22_ = 0;
						this.field_p_386 = true;
						if ((i_23_ + 256) > (this.field_q_378 * -650778973)) {
							i_23_ = ((this.field_q_378 * -650778973) - 256);
							this.field_x_373 = 795141179 * (i_23_ - (966943345 * (this.field_k_379)));
						}
					}
					for (/**/; i_22_ < i_23_; i_22_ += 256) {
						method_i_void(this.field_a_374, 256);
						method_y_void();
					}
					if (l > (-1487039566013165769L * this.field_c_385)) {
						if (!this.field_p_386) {
							if (((this.field_j_382 * 2130407189) == 0) && ((this.field_s_383 * 914109897) == 0)) {
								method_e_void();
								this.field_r_381 = -1386164457619694291L * (l + 2000L);
								return;
							}
							this.field_x_373 = Math.min((this.field_s_383 * 914109897), (this.field_j_382 * 2130407189)) * 795141179;
							this.field_s_383 = -114129683 * this.field_j_382;
						} else {
							this.field_p_386 = false;
						}
						this.field_j_382 = 0;
						this.field_c_385 = -6201777567831992697L * (l + 2000L);
					}
					this.field_v_384 = i_22_ * -66202233;
				} catch (final Exception exception) {
					method_e_void();
					this.field_r_381 = -1386164457619694291L * (2000L + l);
				}
				try {
					if (l > ((this.field_u_389 * -1928282580450078895L) + 500000L)) {
						l = (-1928282580450078895L * this.field_u_389);
					}
					for (/**/; l > ((-1928282580450078895L * this.field_u_389) + 5000L); this.field_u_389 += (256000 / (-1281893659 * NpcDefinitions.audioSampleRate) * 599364458193328561L)) {
						method_w_void(256, 2126745418);
					}
				} catch (final Exception exception) {
					this.field_u_389 = 599364458193328561L * l;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "av.p()");
		}
	}

	void method_n_void(final Component component) throws Exception {
		/* empty */
	}

	public static void method_n_void(final FileStore class_fs, final FileStore class_fs_24_, final boolean bool, final int i) {
		try {
			ObjectComposite.configArchiveRef = class_fs;
			ObjectComposite.field_z_315 = class_fs_24_;
			ObjectComposite.field_n_347 = bool;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "av.n()");
		}
	}
}
