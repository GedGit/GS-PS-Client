/* Class_hh - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class SeekableFile {
	long field_d_3076;
	RandomAccessFile file;
	long field_z_3078;
	static final int field_q_3079 = 10;

	final void method_n_void(final long l) throws IOException {
		try {
			this.file.seek(l);
			this.field_z_3078 = l * -5695864625380546377L;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "hh.n()");
		}
	}

	public final void method_d_void(final byte[] is, final int i, final int i_0_, final byte i_1_) throws IOException {
		try {
			if ((i_0_ + (this.field_z_3078 * 9002024595339130119L)) > (this.field_d_3076 * 6413002925485828561L)) {
				this.file.seek(((this.field_d_3076) * 6413002925485828561L) + 1L);
				this.file.write(1);
				throw new EOFException();
			}
			this.file.write(is, i, i_0_);
			this.field_z_3078 += i_0_ * -5695864625380546377L;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "hh.d()");
		}
	}

	public final void close() throws IOException {
		try {
			if (this.file != null) {
				this.file.close();
				this.file = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "hh.z()");
		}
	}

	public final long length() throws IOException {
		long l;
		try {
			l = this.file.length();
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "hh.y()");
		}
		return l;
	}

	public SeekableFile(final File file, final String string, long l) throws IOException {
		if (l == -1L) {
			l = 9223372036854775807L;
		}
		if (file.length() >= l) {
			file.delete();
		}
		this.file = new RandomAccessFile(file, string);
		this.field_d_3076 = -5489589361513509071L * l;
		this.field_z_3078 = 0L;
		final int i = this.file.read();
		if ((i != -1) && !string.equals("r")) {
			this.file.seek(0L);
			this.file.write(i);
		}
		this.file.seek(0L);
	}

	@Override
	protected void finalize() throws Throwable {
		try {
			if (this.file != null) {
				close();
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "hh.finalize()");
		}
	}

	public final int read(final byte[] is, final int i, final int i_2_) throws IOException {
		int i_4_;
		try {
			final int i_5_ = this.file.read(is, i, i_2_);
			if (i_5_ > 0) {
				this.field_z_3078 += -5695864625380546377L * i_5_;
			}
			i_4_ = i_5_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "hh.e()");
		}
		return i_4_;
	}
}
