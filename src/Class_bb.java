/* Class_bb - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public final class Class_bb extends Class_bi {
	Component field_n_508;

	@Override
	public final void drawGraphics(final Graphics graphics, final int i, final int i_0_, final byte i_1_) {
		try {
			graphics.drawImage(image, i, i_0_, this.field_n_508);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "bb.d()");
		}
	}

	@Override
	public final void method_z_void(final Graphics graphics, final int i, final int i_2_, final int i_3_, final int i_4_, final int i_5_) {
		try {
			final Shape shape = graphics.getClip();
			graphics.clipRect(i, i_2_, i_3_, i_4_);
			graphics.drawImage(image, 0, 0, this.field_n_508);
			graphics.setClip(shape);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "bb.z()");
		}
	}

	@Override
	final void draw(final int i, final int i_6_, final Component component, final int i_7_) {
		try {
			width = i * -335332855;
			this.height = 309365921 * i_6_;
			pixels = new int[1 + (i_6_ * i)];
			final DataBufferInt databufferint = new DataBufferInt(pixels, pixels.length);
			final DirectColorModel directcolormodel = new DirectColorModel(32, 16711680, 65280, 255);
			final WritableRaster writableraster = Raster.createWritableRaster((directcolormodel.createCompatibleSampleModel(width * -2078510023, 160454497 * (this.height))), databufferint, null);
			image = new BufferedImage(directcolormodel, writableraster, false, new Hashtable<Object, Object>());
			this.field_n_508 = component;
			init();
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "bb.n()");
		}
	}

	Class_bb() {
		/* empty */
	}
}
