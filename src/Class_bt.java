/* Class_bt - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class Class_bt extends Class_av {
	int field_ax_653;
	SourceDataLine dataLine;
	AudioFormat format;
	byte[] field_al_656;

	@Override
	void method_n_void(final Component component) {
		try {
			this.format = new AudioFormat(NpcDefinitions.audioSampleRate * -1281893659, 16, Class_i.field_y_1073 ? 2 : 1, true, false);
			this.field_al_656 = new byte[256 << (Class_i.field_y_1073 ? 2 : 1)];
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "bt.n()");
		}
	}

	@Override
	void method_e_void() {
		try {
			if (this.dataLine != null) {
				this.dataLine.close();
				this.dataLine = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "bt.e()");
		}
	}

	@Override
	void method_d_void(final int i) throws LineUnavailableException {
		try {
			try {
				final DataLine.Info info = (new DataLine.Info(javax.sound.sampled.SourceDataLine.class, this.format, i << (Class_i.field_y_1073 ? 2 : 1)));
				this.dataLine = (SourceDataLine) AudioSystem.getLine(info);
				this.dataLine.open();
				this.dataLine.start();
				this.field_ax_653 = -512783633 * i;
			} catch (final LineUnavailableException lineunavailableexception) {
				if (Class_cq.method_d_int(i, 1575525017) != 1) {
					method_d_void(Class_bi.method_z_int(i, -1449483244));
				} else {
					this.dataLine = null;
					throw lineunavailableexception;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "bt.d()");
		}
	}

	@Override
	int method_z_int() {
		int i;
		try {
			i = ((this.field_ax_653 * 1625744399) - (this.dataLine.available() >> (Class_i.field_y_1073 ? 2 : 1)));
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "bt.z()");
		}
		return i;
	}

	@Override
	void method_y_void() {
		int i = 256;
		if (Class_i.field_y_1073) {
			i <<= 1;
		}
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			int i_1_ = this.field_a_374[i_0_];
			if (((8388608 + i_1_) & ~0xffffff) != 0) {
				i_1_ = 0x7fffff ^ (i_1_ >> 31);
			}
		this.field_al_656[2 * i_0_] = (byte) (i_1_ >> 8);
		this.field_al_656[(i_0_ * 2) + 1] = (byte) (i_1_ >> 16);
		}
		this.dataLine.write(this.field_al_656, 0, i << 1);
	}

	Class_bt() {
		/* empty */
	}

	@Override
	void method_g_void() {
		try {
			this.dataLine.flush();
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "bt.g()");
		}
	}
}
