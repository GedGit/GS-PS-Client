/* Class_am - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

public class Class_am extends CacheableNode {
	static final int field_h_188 = 8;
	public static NodeCache field_d_189 = new NodeCache(64);
	public int field_z_190 = 0;
	static File field_e_191;
	static int field_ai_192;
	public static final int field_er_193 = 218;

	void method_d_void(final Buffer rsbytebuffer, final int i, final int i_0_) {
		try {
			if (i == 2) {
				field_z_190 = rsbytebuffer.getShort() * -745442877;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "am.d()");
		}
	}

	public void method_n_void(final Buffer rsbytebuffer, final int i) {
		try {
			for (;;) {
				final int i_1_ = rsbytebuffer.get();
				if (i_1_ == 0) {
					break;
				}
				method_d_void(rsbytebuffer, i_1_, -2007846920);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "am.n()");
		}
	}

	public static int method_d_int(final int i, final int i_2_, int i_3_, final byte i_4_) {
		int i_5_;
		try {
			i_3_ &= 0x3;
			i_5_ = (i_3_ == 0 ? i_2_ : i_3_ == 1 ? 7 - i : i_3_ == 2 ? 7 - i_2_ : i);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "am.d()");
		}
		return i_5_;
	}
}
