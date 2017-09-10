/* Class_dc - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public final class SecureBuffer extends Buffer {
	static final int field_ax_1575 = 5;
	static final int[] field_m_1576 = { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1 };
	int field_a_1577;
	static final int field_ay_1578 = 54;
	ISAACCipher cipher;
	static final int field_ar_1580 = 37;
	public static final int field_cz_1581 = 38;

	public void writeOpcode(final int i) {
		try {
			buffer[((position += -685856689) * -1485345105) - 1] = (byte) i;
			//buffer[((position += -685856689) * -1485345105) - 1] = (byte) (i + this.isaacCipher.next(1251299976));
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dc.hp()");
		}
	}

	public void setCipher(final int[] is) {
		try {
			this.cipher = new ISAACCipher(is);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dc.hi()");
		}
	}

	public int getSecureByte(final int i) {
		int i_1_;
		try {
			i_1_ = (buffer[((position += -685856689) * -1485345105) - 1]) & 0xFF; //- this.field_f_1579.method_n_int(-467119536)) & 0xff;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dc.hr()");
		}
		return i_1_;
	}

	public void startBitMode() {
		try {
			this.field_a_1577 = 618067096 * position;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dc.ic()");
		}
	}

	public int getBits(int i) {
		int i_3_;
		try {
			int i_4_ = (-1328192267 * this.field_a_1577) >> 3;
			int i_5_ = 8 - ((this.field_a_1577 * -1328192267) & 0x7);
			int i_6_ = 0;
			this.field_a_1577 += 404039517 * i;
			for (/**/; i > i_5_; i_5_ = 8) {
				i_6_ += (buffer[i_4_++] & field_m_1576[i_5_]) << (i - i_5_);
				i -= i_5_;
			}
			if (i == i_5_) {
				i_6_ += buffer[i_4_] & field_m_1576[i_5_];
			} else {
				i_6_ += (buffer[i_4_] >> (i_5_ - i)) & field_m_1576[i];
			}
			i_3_ = i_6_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dc.iz()");
		}
		return i_3_;
	}

	public void endBitMode() {
		try {
			position = (-685856689 * (((-1328192267 * this.field_a_1577) + 7) / 8));
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dc.ih()");
		}
	}

	public int availableBits(final int size) {
		int i_8_;
		try {
			i_8_ = (8 * size) - (this.field_a_1577 * -1328192267);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dc.is()");
		}
		return i_8_;
	}

	public SecureBuffer(final int i) {
		super(i);
	}

	public static void unbindMouse(final Component component) {
		try {
			component.removeMouseListener(MouseInputListener.instance);
			component.removeMouseMotionListener(MouseInputListener.instance);
			component.removeFocusListener(MouseInputListener.instance);
			MouseInputListener.field_z_2152 = 0;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dc.n()");
		}
	}
}
