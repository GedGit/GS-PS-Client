/* DynamicGameObject - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

public class GameObject extends Renderable {
	static final int field_c_1413 = 20;
	static Widget field_ir_1414;
	int field_z_1415;
	int field_y_1416;
	int x;
	int y;
	AnimationSequence field_f_1419;
	static final int field_gt_1420 = 2048;
	int field_a_1421;
	int field_d_1422;
	int field_n_1423;
	int field_m_1424;
	static Index configIndex;

	static final void method_dv_void(final String string, final byte i) {
		try {
			if (string != null) {
				if ((((1944416787 * client.friendListSize) < 200) || ((client.field_hq_2873 * -126301797) == 1)) && ((client.friendListSize * 1944416787) < 400)) {
					final String string_0_ = Class_bg.method_d_String(string, Class_fd.field_h_2308, 2062539166);
					if (string_0_ != null) {
						for (int i_1_ = 0; i_1_ < (1944416787 * client.friendListSize); i_1_++) {
							final Friend class_j = client.friends[i_1_];
							final String string_2_ = Class_bg.method_d_String((class_j.name), (Class_fd.field_h_2308), -1129381070);
							if ((string_2_ != null) && string_2_.equals(string_0_)) {
								GameStub.sendMessage(30, "", new StringBuilder(string).append(MenuText.field_fh_1817).toString());
								return;
							}
							if (class_j.displayName != null) {
								final String string_3_ = (Class_bg.method_d_String(class_j.displayName, Class_fd.field_h_2308, 1830185734));
								if ((string_3_ != null) && string_3_.equals(string_0_)) {
									GameStub.sendMessage(30, "", new StringBuilder(string).append(MenuText.field_fh_1817).toString());
									return;
								}
							}
						}
						for (int i_4_ = 0; i_4_ < (-1756810877 * client.field_pa_2851); i_4_++) {
							final Ignore class_m = client.ignores[i_4_];
							final String string_5_ = Class_bg.method_d_String((class_m.name), (Class_fd.field_h_2308), 2105514306);
							if ((string_5_ != null) && string_5_.equals(string_0_)) {
								GameStub.sendMessage(30, "", new StringBuilder(MenuText.field_fa_1955).append(string).append(MenuText.field_fg_2052).toString());
								return;
							}
							if (class_m.previousName != null) {
								final String string_6_ = (Class_bg.method_d_String(class_m.previousName, Class_fd.field_h_2308, 1733796071));
								if ((string_6_ != null) && string_6_.equals(string_0_)) {
									GameStub.sendMessage(30, "", new StringBuilder(MenuText.field_fa_1955).append(string).append(MenuText.field_fg_2052).toString());
									return;
								}
							}
						}
						if (Class_ci.myPlayer.name.contains("<col")) {
							Class_ci.myPlayer.name = Class_ci.myPlayer.name.substring(12);
						}
						if (Class_bg.method_d_String(Class_ci.myPlayer.name, Class_fd.field_h_2308, -1692780213).equals(string_0_)) {
							GameStub.sendMessage(30, "", MenuText.field_fb_2051);
						} else {
							client.encryptedBuffer.writeOpcode(128);
							final SecureBuffer class_dc = client.encryptedBuffer;
							final int i_7_ = string.length() + 1;
							class_dc.put(i_7_);
							client.encryptedBuffer.putNT0String(string, (byte) 5);// friends list stuff
						}
					}
				} else {
					GameStub.sendMessage(30, "", MenuText.field_fn_1949);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "u.dv()");
		}
	}

	public static void browseURL(final String string, final boolean bool, final boolean bool_8_, final int si) {
		try {
			Class_v.openURL(string, bool, "openjs", bool_8_, -623872885);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "u.n()");
		}
	}

	GameObject(final int i, final int i_9_, final int i_10_, final int i_11_, final int i_12_, final int i_13_, final int i_14_, final boolean bool, final Renderable renderable) {
		this.field_n_1423 = i * 1553911021;
		this.field_d_1422 = -2131769969 * i_9_;
		this.field_z_1415 = i_10_ * 1007559127;
		this.field_y_1416 = -1466563261 * i_11_;
		this.x = -698849583 * i_12_;
		this.y = 1658409525 * i_13_;
		if (i_14_ != -1) {
			this.field_f_1419 = OnDemandNode.getAnimationSequence(i_14_);
			this.field_m_1424 = 0;
			this.field_a_1421 = (client.currentCycle * 1845002935) - -371240485;
			if (((this.field_f_1419.field_v_208 * 1865833167) == 0) && (renderable != null) && (renderable instanceof GameObject)) {
				final GameObject dynamicgameobject_15_ = (GameObject) renderable;
				if (dynamicgameobject_15_.field_f_1419 == this.field_f_1419) {
					this.field_m_1424 = (dynamicgameobject_15_.field_m_1424) * 1;
					this.field_a_1421 = (dynamicgameobject_15_.field_a_1421) * 1;
					return;
				}
			}
			if (bool && ((1680412203 * (this.field_f_1419.field_h_199)) != -1)) {
				this.field_m_1424 = ((int) (Math.random() * (this.field_f_1419.cycle).length) * 182519797);
				this.field_a_1421 -= ((int) (Math.random() * (this.field_f_1419.frames[1343892573 * this.field_m_1424])) * -371240485);
			}
		}
	}

	@Override
	protected final Model getModel() {
		Model onscreenmodel;
		try {
			if (this.field_f_1419 != null) {
				int i_16_ = ((client.currentCycle * 303796053) - (this.field_a_1421 * 1071268435));
				if ((i_16_ > 100) && ((1680412203 * (this.field_f_1419.field_h_199)) > 0)) {
					i_16_ = 100;
				}
				while (i_16_ > (this.field_f_1419.frames[(this.field_m_1424 * 1343892573)])) {
					i_16_ -= (this.field_f_1419.frames[(1343892573 * this.field_m_1424)]);
					this.field_m_1424 += 182519797;
					if ((1343892573 * this.field_m_1424) >= (this.field_f_1419.cycle).length) {
						this.field_m_1424 -= 477674535 * (this.field_f_1419.field_h_199);
						if (((1343892573 * this.field_m_1424) < 0) || ((this.field_m_1424 * 1343892573) >= (this.field_f_1419.cycle).length)) {
							this.field_f_1419 = null;
							break;
						}
					}
				}
				this.field_a_1421 = ((303796053 * client.currentCycle) - i_16_) * -371240485;
			}
			ObjectComposite objectdef = Class_cj.getObjectComposite((this.field_n_1423 * -283676443));
			if (objectdef.childrenIds != null) {
				objectdef = objectdef.method_u_at((byte) 1);
			}
			if (objectdef == null) {
				return null;
			}
			int width;
			int length;
			if (((1532715495 * this.field_z_1415) != 1) && ((this.field_z_1415 * 1532715495) != 3)) {
				width = 211338481 * objectdef.width;
				length = 1201809627 * objectdef.length;
			} else {
				width = 1201809627 * objectdef.length;
				length = 211338481 * objectdef.width;
			}
			final int i_19_ = (-874008015 * this.x) + (width >> 1);
			final int i_20_ = (this.x * -874008015) + ((width + 1) >> 1);
			final int i_21_ = (-653201379 * this.y) + (length >> 1);
			final int i_22_ = ((1 + length) >> 1) + (-653201379 * this.y);
			final int[][] is = (Region.heightMaps[-1865306261 * this.field_y_1416]);
			final int i_23_ = ((is[i_20_][i_22_] + is[i_19_][i_22_] + is[i_19_][i_21_] + is[i_20_][i_21_]) >> 2);
			final int i_24_ = ((width << 6) + ((this.x * -874008015) << 7));
			final int i_25_ = ((length << 6) + ((this.y * -653201379) << 7));
			onscreenmodel = (objectdef.method_h_cg(this.field_d_1422 * 149666159, this.field_z_1415 * 1532715495, is, i_24_, i_23_, i_25_, this.field_f_1419, this.field_m_1424 * 1343892573, -26834787));
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "u.d()");
		}
		return onscreenmodel;
	}

	static String method_z_String(Throwable throwable, final byte i) throws IOException {
		try {
			String string;
			if (throwable instanceof ClientError) {
				final ClientError class_er = (ClientError) throwable;
				string = new StringBuilder(class_er.field_y_2208).append(" | ").toString();
				throwable = class_er.field_e_2206;
			} else {
				string = "";
			}
			final StringWriter stringwriter = new StringWriter();
			final PrintWriter printwriter = new PrintWriter(stringwriter);
			throwable.printStackTrace(printwriter);
			printwriter.close();
			final String string_26_ = stringwriter.toString();
			final BufferedReader bufferedreader = new BufferedReader(new StringReader(string_26_));
			final String string_27_ = bufferedreader.readLine();
			for (;;) {
				String string_28_ = bufferedreader.readLine();
				if (string_28_ == null) {
					string = new StringBuilder(string).append("| ").append(string_27_).toString();
					return string;
				}
				final int i_29_ = string_28_.indexOf('(');
				final int i_30_ = string_28_.indexOf(')', 1 + i_29_);
				if ((i_29_ >= 0) && (i_30_ >= 0)) {
					String string_31_ = string_28_.substring(i_29_ + 1, i_30_);
					final int i_32_ = string_31_.indexOf(".java:");
					if (i_32_ >= 0) {
						string_31_ = new StringBuilder(string_31_.substring(0, i_32_)).append(string_31_.substring(5 + i_32_)).toString();
						string = new StringBuilder(string).append(string_31_).append(' ').toString();
						continue;
					}
					string_28_ = string_28_.substring(0, i_29_);
				}
				string_28_ = string_28_.trim();
				string_28_ = string_28_.substring(string_28_.lastIndexOf(' ') + 1);
				string_28_ = string_28_.substring(string_28_.lastIndexOf('\t') + 1);
				string = new StringBuilder(string).append(string_28_).append(' ').toString();
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "u.z()");
		}
	}

	public static final Rasterizer2D method_l_bx(final int i, final int i_33_, final int i_34_, final int i_35_, int i_36_, final boolean bool, final byte i_37_) {
		Rasterizer2D class_bx;
		try {
			if (i_33_ == -1) {
				i_36_ = 0;
			} else if ((i_36_ == 2) && (i_33_ != 1)) {
				i_36_ = 1;
			}
			final long l = (((long) i_35_ << 42) + ((long) i_36_ << 40) + ((long) i_34_ << 38) + ((long) i_33_ << 16) + i);
			if (!bool) {
				final Rasterizer2D class_bx_38_ = (Rasterizer2D) ItemComposite.field_h_112.method_n_gb(l);
				if (class_bx_38_ != null) {
					return class_bx_38_;
				}
			}
			ItemComposite itemdef = ItemDefinitions.getItemComposite(i);
			if ((i_33_ > 1) && (itemdef.field_ai_143 != null)) {
				int i_39_ = -1;
				for (int i_40_ = 0; i_40_ < 10; i_40_++) {
					if ((i_33_ >= itemdef.field_ah_129[i_40_]) && (itemdef.field_ah_129[i_40_] != 0)) {
						i_39_ = itemdef.field_ai_143[i_40_];
					}
				}
				if (i_39_ != -1) {
					itemdef = ItemDefinitions.getItemComposite(i_39_);
				}
			}
			final Model onscreenmodel = itemdef.method_a_cg(1, 2061372605);
			if (onscreenmodel == null) {
				return null;
			}
			Rasterizer2D class_bx_41_ = null;
			if ((-1058124419 * itemdef.field_ay_146) != -1) {
				class_bx_41_ = method_l_bx(583137811 * itemdef.field_aq_125, 10, 1, 0, 0, true, (byte) 103);
				if (class_bx_41_ == null) {
					return null;
				}
			} else if ((itemdef.field_bo_155 * -836212347) != -1) {
				class_bx_41_ = method_l_bx(129958571 * itemdef.field_bs_154, i_33_, i_34_, i_35_, 0, false, (byte) 43);
				if (class_bx_41_ == null) {
					return null;
				}
			}
			final int[] is = Rasterizer.pixels;
			final int i_42_ = Rasterizer.width;
			final int i_43_ = Rasterizer.height;
			final int[] is_44_ = new int[4];
			Rasterizer.method_ca_void(is_44_);
			final Rasterizer2D class_bx_45_ = new Rasterizer2D(36, 32);
			Rasterizer.init(class_bx_45_.field_n_681, 36, 32);
			Rasterizer.method_ch_void();
			Rasterizer3D.method_n_void();
			Rasterizer3D.method_y_void(16, 16);
			Rasterizer3D.field_y_1140 = false;
			int i_46_ = 580942495 * itemdef.field_v_120;
			if (bool) {
				i_46_ = (int) (1.5 * i_46_);
			} else if (i_34_ == 2) {
				i_46_ *= 1.04;
			}
			final int i_47_ = ((Rasterizer3D.SINE[2131723587 * itemdef.xan2d] * i_46_) >> 16);
			final int i_48_ = ((Rasterizer3D.COSINE[2131723587 * itemdef.xan2d] * i_46_) >> 16);
			onscreenmodel.method_m_void();
			onscreenmodel.method_c_void(0, -294570033 * itemdef.yan2d, 595196205 * itemdef.zan2d, 2131723587 * itemdef.xan2d, itemdef.xOf2d * -921084623, (((-1707560315 * onscreenmodel.modelHeight) / 2) + i_47_ + (itemdef.yOf2d * 1015339425)), (i_48_ + (1015339425 * itemdef.yOf2d)));
			if ((itemdef.field_bo_155 * -836212347) != -1) {
				class_bx_41_.rasterize(0, 0);
			}
			if (i_34_ >= 1) {
				class_bx_45_.method_m_void(1);
			}
			if (i_34_ >= 2) {
				class_bx_45_.method_m_void(16777215);
			}
			if (i_35_ != 0) {
				class_bx_45_.method_a_void(i_35_);
			}
			Rasterizer.init(class_bx_45_.field_n_681, 36, 32);
			if ((-1058124419 * itemdef.field_ay_146) != -1) {
				class_bx_41_.rasterize(0, 0);
			}
			if ((i_36_ == 1) || ((i_36_ == 2) && ((itemdef.stackable * 1537303969) == 1))) {
				final Class_hd class_hd = FloorOverlay.field_l_6;
				String string;
				if (i_33_ < 100000) {
					string = new StringBuilder("<col=ffff00>").append(i_33_).append("</col>").toString();
				} else if (i_33_ < 10000000) {
					string = new StringBuilder("<col=ffffff>").append(i_33_ / 1000).append(MenuText.field_fp_1947).append("</col>").toString();
				} else {
					string = new StringBuilder("<col=00ff80>").append(i_33_ / 1000000).append(MenuText.field_fy_2021).append("</col>").toString();
				}
				class_hd.method_a_void(string, 0, 9, 16776960, 1);
			}
			if (!bool) {
				ItemComposite.field_h_112.method_z_void(class_bx_45_, l);
			}
			Rasterizer.init(is, i_42_, i_43_);
			Rasterizer.method_cv_void(is_44_);
			Rasterizer3D.method_n_void();
			Rasterizer3D.field_y_1140 = true;
			class_bx = class_bx_45_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "u.l()");
		}
		return class_bx;
	}

	public static void method_n_void(final FileStore class_fs, final FileStore class_fs_49_, final boolean bool, final Class_hd class_hd, final byte i) {
		try {
			ItemComposite.configArchiveRef = class_fs;
			ItemComposite.field_e_150 = class_fs_49_;
			Class_fk.field_g_2387 = bool;
			ItemComposite.field_f_109 = (ItemComposite.configArchiveRef.method_q_int(10, -1693825759) * 1817063075);
			FloorOverlay.field_l_6 = class_hd;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "u.n()");
		}
	}
}
