/* Class_hl - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_hl {
	public int field_y_3081;
	byte field_n_3082;
	public int field_z_3083;
	public int field_g_3084;
	public int field_e_3085;
	public int field_d_3086;

	void method_d_void(final Integer integer, final byte i) {
		/* empty */
	}

	public Class_hl(final Buffer rsbytebuffer, final boolean bool) {
		this.field_n_3082 = rsbytebuffer.getSigned();
		field_d_3086 = rsbytebuffer.getShort() * -1406993851;
		field_z_3083 = rsbytebuffer.getInt() * 1522556363;
		field_y_3081 = rsbytebuffer.getInt() * 2143687361;
		field_e_3085 = rsbytebuffer.getInt() * 1001734417;
		field_g_3084 = rsbytebuffer.getInt() * 1371387865;
		if (bool) {
			method_d_void(Class_eb.method_n_Integer(rsbytebuffer, (short) 13016), (byte) 0);
		}
	}

	void method_e_void(final int i, final byte i_0_) {
		try {
			this.field_n_3082 &= ~0x7;
			this.field_n_3082 = (byte) (this.field_n_3082 | (i & 0x7));
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "hl.e()");
		}
	}

	void method_g_void(final int i, final int i_1_) {
		try {
			this.field_n_3082 &= ~0x8;
			if (i == 1) {
				this.field_n_3082 = (byte) (this.field_n_3082 | 0x8);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "hl.g()");
		}
	}

	public int method_y_int(final int i) {
		int i_2_;
		try {
			i_2_ = (this.field_n_3082 & 0x8) == 8 ? 1 : 0;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "hl.y()");
		}
		return i_2_;
	}

	public Class_hl() {
		/* empty */
	}

	public int method_z_int(final int i) {
		int i_3_;
		try {
			i_3_ = this.field_n_3082 & 0x7;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "hl.z()");
		}
		return i_3_;
	}
}
