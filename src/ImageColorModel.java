/* Class_bf - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.IOException;

public final class ImageColorModel extends Class_bi implements ImageProducer, ImageObserver {
	ImageConsumer consumer;
	static final int field_ax_540 = 35;
	static Rasterizer2D field_f_541;
	static int field_iu_542;
	public static final int field_al_543 = 49;
	ColorModel model;

	@Override
	final void draw(final int i, final int i_0_, final Component component, final int i_1_) {
		try {
			width = i * -335332855;
			this.height = 309365921 * i_0_;
			pixels = new int[(i * i_0_) + 1];
			this.model = new DirectColorModel(32, 16711680, 65280, 255);
			image = component.createImage(this);
			render();
			component.prepareImage(image, this);
			render();
			component.prepareImage(image, this);
			render();
			component.prepareImage(image, this);
			init();
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "bf.n()");
		}
	}

	@Override
	public final void drawGraphics(final Graphics graphics, final int i, final int i_2_, final byte i_3_) {
		try {
			render();
			graphics.drawImage(image, i, i_2_, this);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "bf.d()");
		}
	}

	ImageColorModel() {
		/* empty */
	}

	@Override
	public synchronized void removeConsumer(final ImageConsumer imageconsumer) {
		try {
			if (imageconsumer == this.consumer) {
				this.consumer = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "bf.removeConsumer()");
		}
	}

	@Override
	public final void method_z_void(final Graphics graphics, final int i, final int i_4_, final int i_5_, final int i_6_, final int i_7_) {
		try {
			method_e_void(i, i_4_, i_5_, i_6_, 2065892272);
			final Shape shape = graphics.getClip();
			graphics.clipRect(i, i_4_, i_5_, i_6_);
			graphics.drawImage(image, 0, 0, this);
			graphics.setClip(shape);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "bf.z()");
		}
	}

	@Override
	public synchronized boolean isConsumer(final ImageConsumer imageconsumer) {
		boolean bool;
		try {
			if (this.consumer == imageconsumer) {
				return true;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "bf.isConsumer()");
		}
		return bool;
	}

	synchronized void render() {
		try {
			if (this.consumer != null) {
				this.consumer.setPixels(0, 0, -2078510023 * width, 160454497 * this.height, this.model, pixels, 0, -2078510023 * width);
				this.consumer.imageComplete(2);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "bf.y()");
		}
	}

	@Override
	public boolean imageUpdate(final Image image, final int i, final int i_8_, final int i_9_, final int i_10_, final int i_11_) {
		return true;
	}

	@Override
	public synchronized void addConsumer(final ImageConsumer imageconsumer) {
		try {
			this.consumer = imageconsumer;
			imageconsumer.setDimensions(width * -2078510023, (160454497 * this.height));
			imageconsumer.setProperties(null);
			imageconsumer.setColorModel(this.model);
			imageconsumer.setHints(14);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "bf.addConsumer()");
		}
	}

	@Override
	public void startProduction(final ImageConsumer imageconsumer) {
		try {
			addConsumer(imageconsumer);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "bf.startProduction()");
		}
	}

	@Override
	public void requestTopDownLeftRightResend(final ImageConsumer imageconsumer) {
		/* empty */
	}

	synchronized void method_e_void(final int i, final int i_12_, final int i_13_, final int i_14_, final int i_15_) {
		try {
			if (this.consumer != null) {
				this.consumer.setPixels(i, i_12_, i_13_, i_14_, this.model, pixels, (i_12_ * -2078510023 * width) + i, -2078510023 * width);
				this.consumer.imageComplete(2);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "bf.e()");
		}
	}

	public static void method_g_void(final Buffer rsbytebuffer, final int i) {
		try {
			final byte[] is = new byte[24];
			try {
				Class_ed.field_l_2069.method_d_void(0L);
				Class_ed.field_l_2069.method_y_void(is, (short) 11967);
				int i_16_;
				for (i_16_ = 0; (i_16_ < 24) && (is[i_16_] == 0); i_16_++) {
					/* empty */
				}
				if (i_16_ >= 24) {
					throw new IOException();
				}
			} catch (final Exception exception) {
				for (int i_17_ = 0; i_17_ < 24; i_17_++) {
					is[i_17_] = (byte) -1;
				}
			}
			rsbytebuffer.write(is, 0, 24, -1689165002);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "bf.g()");
		}
	}

	public static String method_n_String(final CharSequence charsequence, final int i) {
		String string;
		try {
			final int i_18_ = charsequence.length();
			final StringBuilder stringbuilder = new StringBuilder(i_18_);
			for (int i_19_ = 0; i_19_ < i_18_; i_19_++) {
				final char c = charsequence.charAt(i_19_);
				if (((c < 'a') || (c > 'z')) && ((c < 'A') || (c > 'Z')) && ((c < '0') || (c > '9')) && (c != '.') && (c != '-') && (c != '*') && (c != '_')) {
					if (c == ' ') {
						stringbuilder.append('+');
					} else {
						final int i_20_ = MachineInformationNode.method_n_byte(c, (byte) -39);
						stringbuilder.append('%');
						int i_21_ = (i_20_ >> 4) & 0xf;
			if (i_21_ >= 10) {
				stringbuilder.append((char) (55 + i_21_));
			} else {
				stringbuilder.append((char) (i_21_ + 48));
			}
			i_21_ = i_20_ & 0xf;
			if (i_21_ >= 10) {
				stringbuilder.append((char) (i_21_ + 55));
			} else {
				stringbuilder.append((char) (i_21_ + 48));
			}
					}
				} else {
					stringbuilder.append(c);
				}
			}
			string = stringbuilder.toString();
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "bf.n()");
		}
		return string;
	}
}
