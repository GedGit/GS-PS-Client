/* Class_f - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Projectile extends Renderable {
	int field_g_952;
	double field_r_953;
	int field_z_954;
	int field_y_955;
	int field_e_956;
	double field_q_957;
	int field_n_958;
	int field_m_959;
	int field_a_960;
	int field_h_961;
	int field_l_962;
	double field_v_963;
	public static final int field_bd_964 = 80;
	double field_k_965;
	double field_x_966;
	int field_w_967 = 0;
	double field_j_968;
	double field_s_969;
	boolean field_u_970 = false;
	int field_d_971;
	int field_p_972;
	double field_c_973;
	AnimationSequence field_b_974;
	int field_o_975;
	int field_t_976 = 0;
	static Index fontIndex;
	static int[] mapIndices;
	int field_f_979;
	public static final int field_az_980 = 229;
	protected static int clientHeight;

	static final String method_cd_String(final int i, final int i_0_) {
		String string;
		try {
			String string_1_ = Integer.toString(i);
			for (int i_2_ = string_1_.length() - 3; i_2_ > 0; i_2_ -= 3) {
				string_1_ = new StringBuilder(string_1_.substring(0, i_2_)).append(Class_d.field_d_859).append(string_1_.substring(i_2_)).toString();
			}
			string = (string_1_.length() > 9 ? new StringBuilder(" ").append(Class_r.colorString(65408)).append(string_1_.substring(0, string_1_.length() - 8)).append(MenuText.field_ff_1944).append(" ").append(Class_d.field_y_857).append(string_1_).append(Class_d.field_e_855).append(Class_d.field_m_861).toString() : string_1_.length() > 6 ? new StringBuilder(" ")
			.append(Class_r.colorString(16777215)).append(string_1_.substring(0, string_1_.length() - 4)).append(MenuText.field_fc_1946).append(" ").append(Class_d.field_y_857).append(string_1_).append(Class_d.field_e_855).append(Class_d.field_m_861).toString() : new StringBuilder(" ").append(Class_r.colorString(16776960)).append(string_1_)
			.append(Class_d.field_m_861).toString());
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "f.cd()");
		}
		return string;
	}

	final void method_z_void(final int i, final int i_3_) {
		try {
			this.field_u_970 = true;
			this.field_q_957 += i * this.field_r_953;
			this.field_k_965 += i * this.field_j_968;
			this.field_x_966 += ((this.field_v_963 * i) + (0.5 * this.field_c_973 * i * i));
			this.field_v_963 += i * this.field_c_973;
			this.field_p_972 = (((int) (Math.atan2(this.field_r_953, this.field_j_968) * 325.949) + 1024) & 0x7ff) * 1449420239;
			this.field_o_975 = ((int) (Math.atan2(this.field_v_963, this.field_s_969) * 325.949) & 0x7ff) * -2035130057;
			if (this.field_b_974 != null) {
				this.field_w_967 += -1257777089 * i;
				while ((1464342463 * this.field_w_967) > (this.field_b_974.frames[this.field_t_976 * 1850858543])) {
					this.field_w_967 -= (-1257777089 * (this.field_b_974.frames[1850858543 * this.field_t_976]));
					this.field_t_976 += -248190257;
					if ((1850858543 * this.field_t_976) >= this.field_b_974.cycle.length) {
						this.field_t_976 -= (this.field_b_974.field_h_199 * -538852667);
						if (((1850858543 * this.field_t_976) < 0) || ((this.field_t_976 * 1850858543) >= (this.field_b_974.cycle).length)) {
							this.field_t_976 = 0;
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "f.z()");
		}
	}

	Projectile(final int i, final int i_4_, final int i_5_, final int i_6_, final int i_7_, final int i_8_, final int i_9_, final int i_10_, final int i_11_, final int i_12_, final int i_13_) {
		this.field_n_958 = 1972291305 * i;
		this.field_d_971 = -1249743405 * i_4_;
		this.field_z_954 = i_5_ * -576703175;
		this.field_y_955 = i_6_ * -1398497335;
		this.field_e_956 = i_7_ * -396889003;
		this.field_f_979 = i_8_ * 709555957;
		this.field_m_959 = i_9_ * -9713941;
		this.field_a_960 = 1313709083 * i_10_;
		this.field_h_961 = i_11_ * -1061190887;
		this.field_l_962 = -188464303 * i_12_;
		this.field_g_952 = -1262945365 * i_13_;
		this.field_u_970 = false;
		final int i_14_ = (Class_l.getSpotAnimation(621834585 * this.field_n_958).field_f_399 * 1956440953);
		if (i_14_ != -1) {
			this.field_b_974 = OnDemandNode.getAnimationSequence(i_14_);
		} else {
			this.field_b_974 = null;
		}
	}

	final void method_n_void(final int shootX, final int shootY, final int i_16_, final int i_17_, final int i_18_) {
		try {
			if (!this.field_u_970) {
				final double d = shootX - (-1952962295 * this.field_z_954);
				final double d_19_ = shootY - (this.field_y_955 * 1877846649);
				final double d_20_ = Math.sqrt((d_19_ * d_19_) + (d * d));
				this.field_q_957 = (((this.field_h_961 * 1738352937 * d) / d_20_) + this.field_z_954 * -1952962295);
				this.field_k_965 = (((this.field_h_961 * 1738352937 * d_19_) / d_20_) + this.field_y_955 * 1877846649);
				this.field_x_966 = -947033859 * this.field_e_956;
			}
			final double d = (1 + (-1151487549 * this.field_m_959)) - i_17_;
			this.field_r_953 = (shootX - this.field_q_957) / d;
			this.field_j_968 = (shootY - this.field_k_965) / d;
			this.field_s_969 = Math.sqrt((this.field_r_953 * this.field_r_953) + (this.field_j_968 * this.field_j_968));
			if (!this.field_u_970) {
				this.field_v_963 = (-this.field_s_969 * Math.tan(0.02454369 * (1518001683 * (this.field_a_960))));
			}
			this.field_c_973 = (2.0 * (i_16_ - this.field_x_966 - (this.field_v_963 * d))) / (d * d);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "f.n()");
		}
	}

	@Override
	protected final Model getModel() {
		Model onscreenmodel;
		try {
			final SpotAnim spotanim = Class_l.getSpotAnimation(this.field_n_958 * 621834585);
			final Model model = spotanim.method_y_cg((1850858543 * this.field_t_976), 1135095345);
			if (model == null) {
				return null;
			}
			model.method_j_void(this.field_o_975 * -1118493561);
			onscreenmodel = model;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "f.d()");
		}
		return onscreenmodel;
	}

	static final void method_ek_void(final String string, final int i, final byte i_22_) {
		try {
			client.encryptedBuffer.writeOpcode(29);
			final SecureBuffer class_dc = client.encryptedBuffer;
			final int i_23_ = string.length() + 1;
			class_dc.put(1 + i_23_);
			client.encryptedBuffer.putNT0String(string, (byte) -90);
			client.encryptedBuffer.putByteS(i, 89959979);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "f.ek()");
		}
	}
}
