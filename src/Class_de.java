/* Class_de - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.File;
import java.util.Hashtable;

public class Class_de {
	static Class_av field_nn_1594;
	static File field_d_1595;
	static boolean field_n_1596 = false;
	public static final int field_cc_1597 = 88;
	public static final int field_ad_1598 = 116;
	public static int field_h_1599;
	static final int field_i_1600 = 26;
	public static final int field_bm_1601 = 43;
	public static final int field_df_1602 = 194;
	static Rasterizer2D mapedge;
	static Hashtable<Object, Object> field_z_1604 = new Hashtable<Object, Object>(16);

	Class_de() throws Throwable {
		throw new Error();
	}

	static void method_ai_void(final int i) {
		do {
			try {
				final int i_0_ = 1328296843 * GameStub.field_qw_2145;
				final int i_1_ = GameStub.field_qs_2139 * 487934209;
				final int i_2_ = ((-1364750405 * Class_dw.field_qf_1737) - (-1236640339 * Boundary.clientWidth) - i_0_);
				final int i_3_ = ((526016489 * Renderable.field_qa_763) - (-1483492575 * Projectile.clientHeight) - i_1_);
				if ((i_0_ > 0) || (i_2_ > 0) || (i_1_ > 0) || (i_3_ > 0)) {
					try {
						final Container container = client.instance.method_rm_Container(-1959092538);
						int i_4_ = 0;
						int i_5_ = 0;
						if (Class_ci.field_qb_982 == container) {
							final Insets insets = Class_ci.field_qb_982.getInsets();
							i_4_ = insets.left;
							i_5_ = insets.top;
						}
						final Graphics graphics = container.getGraphics();
						graphics.setColor(Color.black);
						if (i_0_ > 0) {
							graphics.fillRect(i_4_, i_5_, i_0_, (526016489 * Renderable.field_qa_763));
						}
						if (i_1_ > 0) {
							graphics.fillRect(i_4_, i_5_, (Class_dw.field_qf_1737 * -1364750405), i_1_);
						}
						if (i_2_ > 0) {
							graphics.fillRect((((-1364750405 * Class_dw.field_qf_1737) + i_4_) - i_2_), i_5_, i_2_, (526016489 * Renderable.field_qa_763));
						}
						if (i_3_ > 0) {
							graphics.fillRect(i_4_, (((526016489 * Renderable.field_qa_763) + i_5_) - i_3_), (Class_dw.field_qf_1737 * -1364750405), i_3_);
						}
					} catch (final Exception exception) {
						break;
					}
				}
				break;
			} catch (final RuntimeException runtimeexception) {
				throw GameCanvas.error(runtimeexception, "de.ai()");
			}
		} while (false);
	}

	public static VarpBit getVarpBit(final int i) {
		VarpBit class_aq;
		try {
			VarpBit class_aq_7_ = (VarpBit) VarpBit.field_d_282.method_n_gb(i);
			if (class_aq_7_ != null) {
				return class_aq_7_;
			}
			final byte[] is = Class_hc.field_n_3064.getArchive(14, i);
			class_aq_7_ = new VarpBit();
			if (is != null) {
				class_aq_7_.method_d_void(new Buffer(is), 192338017);
			}
			VarpBit.field_d_282.method_z_void(class_aq_7_, i);
			class_aq = class_aq_7_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "de.n()");
		}
		return class_aq;
	}
}
