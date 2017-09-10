/* Class_cc - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_cc implements Interface_cn {
	static final int field_mo_767 = 512;
	NodeDeque field_d_768 = new NodeDeque();
	int field_z_769;
	int field_y_770 = 0;
	static int port;
	int field_g_772 = -605405824;
	FileStore field_f_773;
	double field_e_774 = 1.0;
	public static final int field_m_775 = 7;
	Class_bl[] field_n_776;
	public static final int field_q_777 = 32;
	public static final int field_h_778 = 4;
	static int field_iw_779;

	static boolean method_ca_boolean(final int i, final byte i_0_) {
		boolean bool;
		try {
			if ((i != 57) && (i != 58) && (i != 1007) && (i != 25) && (i != 30)) {
				return false;
			}
			bool = true;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "cc.ca()");
		}
		return bool;
	}

	@Override
	public int[] method_n_intArray(final int i, final int i_1_) {
		do {
			int[] is;
			try {
				final Class_bl class_bl = this.field_n_776[i];
				if (class_bl == null) {
					break;
				}
				if (class_bl.field_q_599 != null) {
					this.field_d_768.method_z_void(class_bl);
					class_bl.field_k_600 = true;
					return class_bl.field_q_599;
				}
				final boolean bool = class_bl.method_n_boolean(this.field_e_774, 1364912819 * (this.field_g_772), this.field_f_773);
				if (!bool) {
					break;
				}
				if ((1401937925 * this.field_y_770) == 0) {
					final Class_bl class_bl_2_ = ((Class_bl) this.field_d_768.method_g_ga());
					class_bl_2_.method_d_void();
				} else {
					this.field_y_770 -= -364778291;
				}
				this.field_d_768.method_z_void(class_bl);
				class_bl.field_k_600 = true;
				is = class_bl.field_q_599;
			} catch (final RuntimeException runtimeexception) {
				throw GameCanvas.error(runtimeexception, "cc.n()");
			}
			return is;
		} while (false);
		return null;
	}

	@Override
	public int method_d_int(final int i, final int i_3_) {
		int i_4_;
		try {
			i_4_ = (this.field_n_776[i] != null ? this.field_n_776[i].field_e_591 : 0);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "cc.d()");
		}
		return i_4_;
	}

	@Override
	public boolean method_z_boolean(final int i, final short i_5_) {
		boolean bool;
		try {
			bool = this.field_n_776[i].field_g_592;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "cc.z()");
		}
		return bool;
	}

	@Override
	public boolean method_y_boolean(final int i, final int i_6_) {
		boolean bool;
		try {
			if ((this.field_g_772 * 1364912819) == 64) {
				return true;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "cc.y()");
		}
		return bool;
	}

	public void method_r_void(final double d) {
		try {
			this.field_e_774 = d;
			method_j_void(1180734072);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "cc.r()");
		}
	}

	public void method_s_void(final int i, final int i_7_) {
		try {
			for (final Class_bl element : this.field_n_776) {
				final Class_bl class_bl = element;
				if ((class_bl != null) && (class_bl.field_l_597 != 0) && class_bl.field_k_600) {
					class_bl.method_z_void(i);
					class_bl.field_k_600 = false;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "cc.s()");
		}
	}

	public Class_cc(final FileStore class_fs, final FileStore class_fs_9_, final int i, final double d, final int i_10_) {
		this.field_f_773 = class_fs_9_;
		this.field_z_769 = i * -504296379;
		this.field_y_770 = this.field_z_769 * -1443898647;
		this.field_e_774 = d;
		this.field_g_772 = i_10_ * 1136120955;
		final int[] is = class_fs.method_u_intArray(0, -1650572501);
		final int i_11_ = is.length;
		this.field_n_776 = new Class_bl[class_fs.method_q_int(0, -1666027924)];
		for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
			final Buffer rsbytebuffer = new Buffer(class_fs.getArchive(0, is[i_12_]));
			this.field_n_776[is[i_12_]] = new Class_bl(rsbytebuffer);
		}
	}

	public void method_j_void(final int i) {
		try {
			for (final Class_bl element : this.field_n_776) {
				if (element != null) {
					element.method_d_void();
				}
			}
			this.field_d_768 = new NodeDeque();
			this.field_y_770 = -1443898647 * this.field_z_769;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "cc.j()");
		}
	}

	static int method_d_int(final int i, final int i_14_, final int i_15_) {
		int i_16_;
		try {
			final ItemContainer itemcontainer = ((ItemContainer) ItemContainer.itemContainerTable.method_n_ga(i));
			i_16_ = (itemcontainer == null ? 0 : ((i_14_ >= 0) && (i_14_ < itemcontainer.amts.length)) ? itemcontainer.amts[i_14_] : 0);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "cc.d()");
		}
		return i_16_;
	}

	static final void method_do_void(final int i, final int i_17_, final int i_18_, final int i_19_, final int i_20_, final int i_21_, final int i_22_, final int i_23_) {
		try {
			if (Class_fz.loadWidget(i, -749653924)) {
				Friend.method_dy_void(Widget.widgets[i], -1, i_17_, i_18_, i_19_, i_20_, i_21_, i_22_, 155526686);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "cc.do()");
		}
	}

	static final void method_bl_void(final int i, final int i_24_, final int i_25_, final int i_26_, final int i_27_) {
		try {
			for (int i_28_ = 0; i_28_ < (998139771 * client.field_lx_2892); i_28_++) {
				if (((client.field_lc_2941[i_28_] + client.field_lw_2960[i_28_]) > i) && (client.field_lw_2960[i_28_] < (i + i_25_)) && ((client.field_le_2900[i_28_] + client.field_lq_2898[i_28_]) > i_24_) && (client.field_lq_2898[i_28_] < (i_26_ + i_24_))) {
					client.field_lt_2719[i_28_] = true;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "cc.bl()");
		}
	}
}
