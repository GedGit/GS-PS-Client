/* Class_di - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

public class AllocatedBuffer extends AbstractBuffer {
	ByteBuffer buffer;

	@Override
	void put(final byte[] data) {
		try {
			this.buffer = ByteBuffer.allocateDirect(data.length);
			this.buffer.position(0);
			this.buffer.put(data);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "di.d()");
		}
	}

	@Override
	byte[] get() {
		byte[] is;
		try {
			final byte[] tmp = new byte[this.buffer.capacity()];
			this.buffer.position(0);
			this.buffer.get(tmp);
			is = tmp;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "di.n()");
		}
		return is;
	}

	AllocatedBuffer() {
		/* empty */
	}
}
