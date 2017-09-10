/* Class_fx - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.CRC32;

public class Index extends FileStore {
	int field_ak_2525;
	Class_du field_p_2526;
	int field_o_2527;
	volatile boolean field_b_2528 = false;
	boolean field_t_2529 = false;
	volatile boolean[] field_w_2530;
	int field_ae_2531 = -1791137111;
	int field_ad_2532;
	static CRC32 field_i_2533 = new CRC32();
	Class_du field_c_2534;

	public int method_ch_int(final byte i) {
		int i_0_;
		try { 
			if (this.field_b_2528) {
				return 100;
			}
			if (this.field_l_2483 != null) {
				return 99;
			}
			int i_1_ = ZipInflater.method_y_int(255, (this.field_o_2527 * 848619653), 1174102781);
			if (i_1_ >= 100) {
				i_1_ = 99;
			}
			i_0_ = i_1_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fx.ch()");
		}
		return i_0_;
	}

	public Index(final Class_du class_du, final Class_du class_du_2_, final int i, final boolean bool, final boolean bool_3_, final boolean bool_4_) {
		super(bool, bool_3_);
		this.field_c_2534 = class_du;
		this.field_p_2526 = class_du_2_;
		this.field_o_2527 = -1841115059 * i;
		this.field_t_2529 = bool_4_;
		final int i_5_ = this.field_o_2527 * 848619653;
		if (Class_fq.field_c_2450 != null) {
			Class_fq.field_c_2450.position = 865683851 + (i_5_ * -1191886216);
			final int i_6_ = Class_fq.field_c_2450.getInt();
			final int i_7_ = Class_fq.field_c_2450.getInt();
			method_cx_void(i_6_, i_7_, 1439029357);
		} else {
			SceneTile.method_z_void(null, 255, 255, 0, (byte) 0, true, 1744874634);
			Class_fq.field_p_2436[i_5_] = this;
		}
	}

	@Override
	void method_l_void(final int i, final int i_8_) {
		try {
			if ((this.field_c_2534 != null) && (this.field_w_2530 != null) && this.field_w_2530[i]) {
				SceneObject.method_y_void(i, (this.field_c_2534), this, -1562339832);
			} else {
				SceneTile.method_z_void(this, (this.field_o_2527 * 848619653), i, this.field_e_2493[i], (byte) 2, true, 1287429990);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fx.l()");
		}
	}

	void method_cy_void(final int i, final byte[] is, final boolean bool, final boolean bool_9_, final int i_10_) {
		try {
			if (bool) {
				if (this.field_b_2528) {
					throw new RuntimeException();
				}
				if (this.field_p_2526 != null) {
					ItemContainer.method_z_void((this.field_o_2527 * 848619653), is, this.field_p_2526, -1560515786);
				}
				decodeReferenceTable(is, (short) 8216);
				method_cd_void(-1660068856);
			} else {
				is[is.length - 2] = (byte) (this.field_g_2478[i] >> 8);
				is[is.length - 1] = (byte) this.field_g_2478[i];
				if (this.field_c_2534 != null) {
					ItemContainer.method_z_void(i, is, this.field_c_2534, -1560515786);
					this.field_w_2530[i] = true;
				}
				if (bool_9_) {
					this.field_l_2483[i] = Class_a.getCachedObject(is, false);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fx.cy()");
		}
	}

	public void method_cm_void(final Class_du class_du, final int i, final byte[] is, final boolean bool, final int i_11_) {
		try {
			if (this.field_p_2526 == class_du) {
				if (this.field_b_2528) {
					throw new RuntimeException();
				}
				if (is == null) {
					SceneTile.method_z_void(this, 255, 848619653 * (this.field_o_2527), (this.field_ad_2532 * -330665683), (byte) 0, true, 1681545094);
				} else {
					field_i_2533.reset();
					field_i_2533.update(is, 0, is.length);
					final int i_12_ = (int) field_i_2533.getValue();
					final Buffer rsbytebuffer = (new Buffer(Class_h.decompress(is, -380063226)));
					final int i_13_ = rsbytebuffer.get();
					if ((i_13_ != 5) && (i_13_ != 6)) {
						throw new RuntimeException(new StringBuilder(String.valueOf(i_13_)).append(",").append(848619653 * (this.field_o_2527)).append(",").append(i).toString());
					}
					int i_14_ = 0;
					if (i_13_ >= 6) {
						i_14_ = rsbytebuffer.getInt();
					}
					if (((this.field_ad_2532 * -330665683) != i_12_) || (i_14_ != (this.field_ak_2525 * 1418060103))) {
						SceneTile.method_z_void(this, 255, 848619653 * this.field_o_2527, -330665683 * this.field_ad_2532, (byte) 0, true, 1220957555);
					} else {
						decodeReferenceTable(is, (short) 8216);
						method_cd_void(-1660068856);
					}
				}
			} else {
				if (!bool && (i == (this.field_ae_2531 * 1491936871))) {
					this.field_b_2528 = true;
				}
				if ((is == null) || (is.length <= 2)) {
					this.field_w_2530[i] = false;
					if (this.field_t_2529 || bool) {
						SceneTile.method_z_void(this, this.field_o_2527 * 848619653, i, this.field_e_2493[i], (byte) 2, bool, 1337054487);
					}
				} else {
					field_i_2533.reset();
					field_i_2533.update(is, 0, is.length - 2);
					final int i_15_ = (int) field_i_2533.getValue();
					final int i_16_ = ((is[is.length - 1] & 0xff) + ((is[is.length - 2] & 0xff) << 8));
					if ((this.field_e_2493[i] != i_15_) || (this.field_g_2478[i] != i_16_)) {
						this.field_w_2530[i] = false;
						if (this.field_t_2529 || bool) {
							SceneTile.method_z_void(this, this.field_o_2527 * 848619653, i, this.field_e_2493[i], (byte) 2, bool, 1627032296);
						}
					} else {
						this.field_w_2530[i] = true;
						if (bool) {
							this.field_l_2483[i] = Class_a.getCachedObject(is, false);
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fx.cm()");
		}
	}

	@Override
	void method_d_void(final int i, final byte i_17_) {
		try {
			final int i_18_ = 848619653 * this.field_o_2527;
			final long l = (i_18_ << 16) + i;
			final OnDemandNode class_ff = (OnDemandNode) Class_fq.field_a_2438.method_n_ga(l);
			if (class_ff == null) {
				if (i_17_ <= 14) {
					return;
				}
			} else {
				Class_fq.field_m_2437.update(class_ff);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fx.d()");
		}
	}

	int method_ci_int(final int i, final int i_19_) {
		int i_20_;
		try {
			i_20_ = (this.field_l_2483[i] != null ? 100 : this.field_w_2530[i] ? 100 : ZipInflater.method_y_int((this.field_o_2527) * 848619653, i, 1174102781));
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fx.ci()");
		}
		return i_20_;
	}

	void method_cx_void(final int i, final int i_21_, final int i_22_) {
		try {
			this.field_ad_2532 = 1503004325 * i;
			this.field_ak_2525 = i_21_ * -1476560777;
			if (this.field_p_2526 != null) {
				SceneObject.method_y_void(848619653 * (this.field_o_2527), (this.field_p_2526), this, -2023859680);
			} else {
				SceneTile.method_z_void(this, 255, (this.field_o_2527 * 848619653), (-330665683 * this.field_ad_2532), (byte) 0, true, 1903734064);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fx.cx()");
		}
	}

	void method_cd_void(final int i) {
		try {
			this.field_w_2530 = new boolean[this.field_l_2483.length];
			for (int i_23_ = 0; i_23_ < this.field_w_2530.length; i_23_++) {
				this.field_w_2530[i_23_] = false;
			}
			if (this.field_c_2534 == null) {
				this.field_b_2528 = true;
			} else {
				this.field_ae_2531 = -1791137111;
				for (int i_24_ = 0; i_24_ < this.field_w_2530.length; i_24_++) {
					if (this.field_f_2479[i_24_] > 0) {
						final Class_du class_du = this.field_c_2534;
						final Class_fk class_fk = new Class_fk();
						class_fk.field_n_2385 = -1760870949;
						class_fk.id = i_24_;
						class_fk.field_z_2383 = class_du;
						class_fk.field_y_2386 = this;
						final NodeDeque deque = Class_ft.field_n_2495;
						synchronized (deque) {
							Class_ft.field_n_2495.add(class_fk);
						}
						SceneObject.method_e_void(-954088499);
						this.field_ae_2531 = 1791137111 * i_24_;
					}
				}
				if ((this.field_ae_2531 * 1491936871) == -1) {
					this.field_b_2528 = true;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fx.cd()");
		}
	}

	public int getCompletion(final int i) {
		int i_25_;
		try {
			int i_26_ = 0;
			int i_27_ = 0;
			for (int i_28_ = 0; i_28_ < this.field_l_2483.length; i_28_++) {
				if (this.field_f_2479[i_28_] > 0) {
					i_26_ += 100;
					i_27_ += method_ci_int(i_28_, -1902854);
				}
			}
			if (i_26_ == 0) {
				return 100;
			}
			final int i_29_ = (100 * i_27_) / i_26_;
			i_25_ = i_29_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fx.cp()");
		}
		return i_25_;
	}

	public static void method_d_void(final FileStore class_fs, final int file, final int i_30_, final int i_31_, final boolean bool, final int i_32_) {
		try {
			Class_fa.field_e_2278 = 1243386265;
			Region.field_g_1012 = class_fs;
			Class_eb.field_f_1772 = file * 877461501;
			Npc.field_m_298 = i_30_ * 85078463;
			Class_eh.field_a_2122 = -1099365411 * i_31_;
			Class_e.field_l_932 = bool;
			Class_de.field_h_1599 = 95001744;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fx.d()");
		}
	}
}
