/* CollisionMap - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CollisionMap {
	static final int field_u_3123 = 2048;
	static final int field_e_3124 = 16;
	static final int field_z_3125 = 4;
	static final int field_n_3126 = 1;
	static final int field_g_3127 = 32;
	static final int field_f_3128 = 64;
	static final int field_d_3129 = 2;
	static final int field_a_3130 = 256;
	static final int field_m_3131 = 128;
	static final int field_x_3132 = 16384;
	static final int field_s_3133 = 131072;
	static final int field_v_3134 = 262144;
	public int[][] flags;
	int field_i_3136 = 0;
	int field_ad_3137 = 0;
	int field_ak_3138;
	int field_ae_3139;
	static final int field_c_3140 = 2097152;

	public void reset() {
		try {
			for (int i_0_ = 0; i_0_ < (-2125229381 * this.field_ak_3138); i_0_++) {
				for (int i_1_ = 0; i_1_ < (this.field_ae_3139 * 454840615); i_1_++) {
					if ((i_0_ != 0) && (i_1_ != 0) && (i_0_ < ((-2125229381 * this.field_ak_3138) - 5)) && (i_1_ < ((454840615 * this.field_ae_3139) - 5))) {
						flags[i_0_][i_1_] = 16777216;
					} else {
						flags[i_0_][i_1_] = 16777215;
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "hx.n()");
		}
	}

	public void setCollisionFlags(int x, int y, final int i_3_, final int i_4_, final boolean bool, final byte i_5_) {
		try {
			x -= this.field_i_3136 * 1080111751;
			y -= 393067337 * this.field_ad_3137;
			if (i_3_ == 0) {
				if (i_4_ == 0) {
					setFlag(x, y, 128);
					setFlag(x - 1, y, 8);
				}
				if (i_4_ == 1) {
					setFlag(x, y, 2);
					setFlag(x, 1 + y, 32);
				}
				if (i_4_ == 2) {
					setFlag(x, y, 8);
					setFlag(1 + x, y, 128);
				}
				if (i_4_ == 3) {
					setFlag(x, y, 32);
					setFlag(x, y - 1, 2);
				}
			}
			if ((i_3_ == 1) || (i_3_ == 3)) {
				if (i_4_ == 0) {
					setFlag(x, y, 1);
					setFlag(x - 1, 1 + y, 16);
				}
				if (i_4_ == 1) {
					setFlag(x, y, 4);
					setFlag(x + 1, y + 1, 64);
				}
				if (i_4_ == 2) {
					setFlag(x, y, 16);
					setFlag(1 + x, y - 1, 1);
				}
				if (i_4_ == 3) {
					setFlag(x, y, 64);
					setFlag(x - 1, y - 1, 4);
				}
			}
			if (i_3_ == 2) {
				if (i_4_ == 0) {
					setFlag(x, y, 130);
					setFlag(x - 1, y, 8);
					setFlag(x, 1 + y, 32);
				}
				if (i_4_ == 1) {
					setFlag(x, y, 10);
					setFlag(x, 1 + y, 32);
					setFlag(x + 1, y, 128);
				}
				if (i_4_ == 2) {
					setFlag(x, y, 40);
					setFlag(1 + x, y, 128);
					setFlag(x, y - 1, 2);
				}
				if (i_4_ == 3) {
					setFlag(x, y, 160);
					setFlag(x, y - 1, 2);
					setFlag(x - 1, y, 8);
				}
			}
			if (bool) {
				if (i_3_ == 0) {
					if (i_4_ == 0) {
						setFlag(x, y, 65536);
						setFlag(x - 1, y, 4096);
					}
					if (i_4_ == 1) {
						setFlag(x, y, 1024);
						setFlag(x, y + 1, 16384);
					}
					if (i_4_ == 2) {
						setFlag(x, y, 4096);
						setFlag(1 + x, y, 65536);
					}
					if (i_4_ == 3) {
						setFlag(x, y, 16384);
						setFlag(x, y - 1, 1024);
					}
				}
				if ((i_3_ == 1) || (i_3_ == 3)) {
					if (i_4_ == 0) {
						setFlag(x, y, 512);
						setFlag(x - 1, y + 1, 8192);
					}
					if (i_4_ == 1) {
						setFlag(x, y, 2048);
						setFlag(x + 1, 1 + y, 32768);
					}
					if (i_4_ == 2) {
						setFlag(x, y, 8192);
						setFlag(x + 1, y - 1, 512);
					}
					if (i_4_ == 3) {
						setFlag(x, y, 32768);
						setFlag(x - 1, y - 1, 2048);
					}
				}
				if (i_3_ == 2) {
					if (i_4_ == 0) {
						setFlag(x, y, 66560);
						setFlag(x - 1, y, 4096);
						setFlag(x, 1 + y, 16384);
					}
					if (i_4_ == 1) {
						setFlag(x, y, 5120);
						setFlag(x, y + 1, 16384);
						setFlag(1 + x, y, 65536);
					}
					if (i_4_ == 2) {
						setFlag(x, y, 20480);
						setFlag(x + 1, y, 65536);
						setFlag(x, y - 1, 1024);
					}
					if (i_4_ == 3) {// gotta make sure this method and other method are identical i believe xd
						setFlag(x, y, 81920);
						setFlag(x, y - 1, 1024);
						setFlag(x - 1, y, 4096);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "hx.d()");
		}
	}

	public void method_z_void(int i, int i_6_, final int i_7_, final int i_8_, final boolean bool, final int i_9_) {
		try {
			int i_10_ = 256;
			if (bool) {
				i_10_ += 131072;
			}
			i -= this.field_i_3136 * 1080111751;
			i_6_ -= this.field_ad_3137 * 393067337;
			for (int i_11_ = i; i_11_ < (i_7_ + i); i_11_++) {
				if ((i_11_ >= 0) && (i_11_ < (-2125229381 * (this.field_ak_3138)))) {
					for (int i_12_ = i_6_; i_12_ < (i_6_ + i_8_); i_12_++) {
						if ((i_12_ >= 0) && (i_12_ < (this.field_ae_3139 * 454840615))) {
							setFlag(i_11_, i_12_, i_10_);
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "hx.z()");
		}
	}

	public void method_e_void(int i, int i_13_, final int i_14_) {
		try {
			i -= this.field_i_3136 * 1080111751;
			i_13_ -= this.field_ad_3137 * 393067337;
			flags[i][i_13_] |= 0x40000;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "hx.e()");
		}
	}

	void setFlag(final int i, final int i_15_, final int i_16_) {
		try {
			flags[i][i_15_] |= i_16_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "hx.g()");
		}
	}

	void unsetFlag(final int i, final int i_18_, final int i_19_, final int i_20_) {
		try {
			flags[i][i_18_] &= i_19_ ^ 0xffffffff;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "hx.a()");
		}
	}

	public void method_h_void(int i, int i_21_, final byte i_22_) {
		try {
			i -= this.field_i_3136 * 1080111751;
			i_21_ -= 393067337 * this.field_ad_3137;
			flags[i][i_21_] &= ~0x40000;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "hx.h()");
		}
	}

	public CollisionMap(final int i, final int i_23_) {
		this.field_ak_3138 = i * -1358634381;
		this.field_ae_3139 = i_23_ * -1933308265;
		flags = (new int[-2125229381 * this.field_ak_3138][this.field_ae_3139 * 454840615]);
		reset();
	}

	public void method_y_void(int i, int i_24_, final int i_25_) {
		try {
			i -= 1080111751 * this.field_i_3136;
			i_24_ -= 393067337 * this.field_ad_3137;
			flags[i][i_24_] |= 0x200000;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "hx.y()");
		}
	}

	public void method_m_void(int i, int i_26_, int i_27_, int i_28_, final int i_29_, final boolean bool, final int i_30_) {
		try {
			int i_31_ = 256;
			if (bool) {
				i_31_ += 131072;
			}
			i -= this.field_i_3136 * 1080111751;
			i_26_ -= this.field_ad_3137 * 393067337;
			if ((i_29_ == 1) || (i_29_ == 3)) {
				final int i_32_ = i_27_;
				i_27_ = i_28_;
				i_28_ = i_32_;
			}
			for (int i_33_ = i; i_33_ < (i + i_27_); i_33_++) {
				if ((i_33_ >= 0) && (i_33_ < (this.field_ak_3138 * -2125229381))) {
					for (int i_34_ = i_26_; i_34_ < (i_28_ + i_26_); i_34_++) {
						if ((i_34_ >= 0) && (i_34_ < (this.field_ae_3139 * 454840615))) {
							unsetFlag(i_33_, i_34_, i_31_, -2003866773);
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "hx.m()");
		}
	}

	public void method_f_void(int i, int i_35_, final int i_36_, final int i_37_, final boolean bool, final int i_38_) {
		try {
			i -= this.field_i_3136 * 1080111751;
			i_35_ -= this.field_ad_3137 * 393067337;
			if (i_36_ == 0) {
				if (i_37_ == 0) {
					unsetFlag(i, i_35_, 128, -1533223936);
					unsetFlag(i - 1, i_35_, 8, -709872866);
				}
				if (i_37_ == 1) {
					unsetFlag(i, i_35_, 2, 1841023833);
					unsetFlag(i, 1 + i_35_, 32, -12108103);
				}
				if (i_37_ == 2) {
					unsetFlag(i, i_35_, 8, -915292443);
					unsetFlag(i + 1, i_35_, 128, -73274320);
				}
				if (i_37_ == 3) {
					unsetFlag(i, i_35_, 32, -977566022);
					unsetFlag(i, i_35_ - 1, 2, 1564498371);
				}
			}
			if ((i_36_ == 1) || (i_36_ == 3)) {
				if (i_37_ == 0) {
					unsetFlag(i, i_35_, 1, 179441238);
					unsetFlag(i - 1, i_35_ + 1, 16, -233035930);
				}
				if (i_37_ == 1) {
					unsetFlag(i, i_35_, 4, 1278576249);
					unsetFlag(1 + i, i_35_ + 1, 64, 8305940);
				}
				if (i_37_ == 2) {
					unsetFlag(i, i_35_, 16, 982473710);
					unsetFlag(i + 1, i_35_ - 1, 1, 454272542);
				}
				if (i_37_ == 3) {
					unsetFlag(i, i_35_, 64, -1282749604);
					unsetFlag(i - 1, i_35_ - 1, 4, -406630026);
				}
			}
			if (i_36_ == 2) {
				if (i_37_ == 0) {
					unsetFlag(i, i_35_, 130, 1001447960);
					unsetFlag(i - 1, i_35_, 8, -1084782841);
					unsetFlag(i, i_35_ + 1, 32, 592559091);
				}
				if (i_37_ == 1) {
					unsetFlag(i, i_35_, 10, -1464868354);
					unsetFlag(i, 1 + i_35_, 32, -1177432563);
					unsetFlag(i + 1, i_35_, 128, -1235116002);
				}
				if (i_37_ == 2) {
					unsetFlag(i, i_35_, 40, -263254366);
					unsetFlag(1 + i, i_35_, 128, 1577260561);
					unsetFlag(i, i_35_ - 1, 2, -132199975);
				}
				if (i_37_ == 3) {
					unsetFlag(i, i_35_, 160, 1914181811);
					unsetFlag(i, i_35_ - 1, 2, -1092488295);
					unsetFlag(i - 1, i_35_, 8, -1080448152);
				}
			}
			if (bool) {
				if (i_36_ == 0) {
					if (i_37_ == 0) {
						unsetFlag(i, i_35_, 65536, 1979369045);
						unsetFlag(i - 1, i_35_, 4096, 57164644);
					}
					if (i_37_ == 1) {
						unsetFlag(i, i_35_, 1024, 856391390);
						unsetFlag(i, 1 + i_35_, 16384, 1604120583);
					}
					if (i_37_ == 2) {
						unsetFlag(i, i_35_, 4096, -1747778258);
						unsetFlag(1 + i, i_35_, 65536, 1638053921);
					}
					if (i_37_ == 3) {
						unsetFlag(i, i_35_, 16384, -1908846015);
						unsetFlag(i, i_35_ - 1, 1024, 222723142);
					}
				}
				if ((i_36_ == 1) || (i_36_ == 3)) {
					if (i_37_ == 0) {
						unsetFlag(i, i_35_, 512, -1901436196);
						unsetFlag(i - 1, 1 + i_35_, 8192, -1820283354);
					}
					if (i_37_ == 1) {
						unsetFlag(i, i_35_, 2048, 2012972900);
						unsetFlag(1 + i, i_35_ + 1, 32768, 44117196);
					}
					if (i_37_ == 2) {
						unsetFlag(i, i_35_, 8192, 1711530155);
						unsetFlag(i + 1, i_35_ - 1, 512, 1304073730);
					}
					if (i_37_ == 3) {
						unsetFlag(i, i_35_, 32768, -1412572740);
						unsetFlag(i - 1, i_35_ - 1, 2048, -944808817);
					}
				}
				if (i_36_ == 2) {
					if (i_37_ == 0) {
						unsetFlag(i, i_35_, 66560, 1825861300);
						unsetFlag(i - 1, i_35_, 4096, 806876052);
						unsetFlag(i, 1 + i_35_, 16384, 1662783626);
					}
					if (i_37_ == 1) {
						unsetFlag(i, i_35_, 5120, -1705091371);
						unsetFlag(i, 1 + i_35_, 16384, 455341539);
						unsetFlag(i + 1, i_35_, 65536, -18843636);
					}
					if (i_37_ == 2) {
						unsetFlag(i, i_35_, 20480, 262777056);
						unsetFlag(i + 1, i_35_, 65536, -1347471051);
						unsetFlag(i, i_35_ - 1, 1024, 587571698);
					}
					if (i_37_ == 3) {
						unsetFlag(i, i_35_, 81920, 194403301);
						unsetFlag(i, i_35_ - 1, 1024, 1468317602);
						unsetFlag(i - 1, i_35_, 4096, -948134507);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "hx.f()");
		}
	}
}
