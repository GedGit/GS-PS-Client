/* Class_gg - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_gg {
	public static final int field_gl_2997 = 6;
	public final long field_d_2998;
	String field_y_2999;
	public final int field_n_3000;
	String field_e_3001;
	static final int field_m_3002 = 8;
	public final Class_hl field_z_3003;
	public static final int field_g_3004 = 32;

	public String method_d_String(final byte i) {
		String string;
		try {
			string = this.field_e_3001;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "gg.d()");
		}
		return string;
	}

	static Index newIndex(final int i, final boolean bool, final boolean bool_0_, final boolean bool_1_) {
		Index class_fx;
		try {
			Class_du class_du = null;
			if (Class_ed.mainDatFile != null) {
				class_du = new Class_du(i, Class_ed.mainDatFile, Class_ed.cacheIndices[i], 1000000);
			}
			class_fx = new Index(class_du, FloorUnderlay.field_po_84, i, bool, bool_0_, bool_1_);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "gg.x()");
		}
		return class_fx;
	}

	Class_gg(final Buffer rsbytebuffer, final byte i, final int i_3_) {
		this.field_y_2999 = rsbytebuffer.getString();
		this.field_e_3001 = rsbytebuffer.getString();
		field_n_3000 = rsbytebuffer.getShort() * -1232800637;
		field_d_2998 = rsbytebuffer.getLong() * 5098714207125756969L;
		final int i_4_ = rsbytebuffer.getInt();
		final int i_5_ = rsbytebuffer.getInt();
		field_z_3003 = new Class_hl();
		field_z_3003.method_e_void(2, (byte) 73);
		field_z_3003.method_g_void(i, -1583747375);
		field_z_3003.field_z_3083 = i_4_ * 1522556363;
		field_z_3003.field_y_3081 = 2143687361 * i_5_;
		field_z_3003.field_e_3085 = 0;
		field_z_3003.field_g_3084 = 0;
		field_z_3003.field_d_3086 = i_3_ * -1406993851;
	}

	public String method_n_String(final int i) {
		String string;
		try {
			string = this.field_y_2999;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "gg.n()");
		}
		return string;
	}
}
