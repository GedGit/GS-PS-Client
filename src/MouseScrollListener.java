/* Class_el - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class MouseScrollListener extends Bindable implements MouseWheelListener {
	int position = 0;

	@Override
	public void bind(final Component component) {
		try {
			component.addMouseWheelListener(this);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "el.d()");
		}
	}

	@Override
	public synchronized int method_y_int() {
		int i_0_;
		try {
			final int i_1_ = 439717439 * this.position;
			this.position = 0;
			i_0_ = i_1_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "el.y()");
		}
		return i_0_;
	}

	@Override
	public synchronized void mouseWheelMoved(final MouseWheelEvent mousewheelevent) {
		try {
			this.position += mousewheelevent.getWheelRotation() * 966484415;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "el.mouseWheelMoved()");
		}
	}

	MouseScrollListener() {
		/* empty */
	}

	@Override
	public void unbind(final Component component) {
		try {
			component.removeMouseWheelListener(this);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "el.z()");
		}
	}
}
