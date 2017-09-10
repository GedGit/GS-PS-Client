/* Class_af - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public class Class_af extends Class_av {
	int field_d_58;
	static Interface_ap field_n_59;

	@Override
	void method_n_void(final Component component) throws Exception {
		field_n_59.method_n_void(component, NpcDefinitions.audioSampleRate * -1281893659, Class_i.field_y_1073, -737403428);
	}

	@Override
	void method_d_void(final int i) throws Exception {
		field_n_59.method_d_void(this.field_d_58, i, (short) 20712);
	}

	@Override
	int method_z_int() {
		return field_n_59.method_z_int(this.field_d_58, 1573312002);
	}

	@Override
	void method_g_void() {
		field_n_59.method_g_void(this.field_d_58, 775148158);
	}

	Class_af(final Daemon class_dx, final int i) {
		field_n_59 = class_dx.method_a_ap(-165056436);
		this.field_d_58 = i;
	}

	@Override
	void method_e_void() {
		field_n_59.method_e_void(this.field_d_58, (byte) -28);
	}

	@Override
	void method_y_void() {
		field_n_59.method_y_void(this.field_d_58, this.field_a_374, -370592298);
	}
}
