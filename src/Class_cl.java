/* Class_cl - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.util.Calendar;
import java.util.TimeZone;

public class Class_cl {
	static final int field_ks_1082 = 31;
	static final String[] field_d_1083 = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
	static final String[][] field_n_1084 = { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "M\u00c3\u00a4r", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };
	static Calendar field_z_1085;
	protected static String field_qk_1086;

	static {
		Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
		field_z_1085 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	}

	Class_cl() throws Throwable {
		throw new Error();
	}

	public static int getStringLength(final String string, final byte i) {
		int i_0_;
		try {
			i_0_ = string.length() + 1;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "cl.m()");
		}
		return i_0_;
	}

	public static String stringToLong(long l) {
		do {
			String string;
			try {
				if ((l <= 0L) || (l >= 6582952005840035281L)) {
					break;
				}
				if ((l % 37L) == 0L) {
					return null;
				}
				int i = 0;
				for (long l_1_ = l; 0L != l_1_; l_1_ /= 37L) {
					i++;
				}
				final StringBuilder stringbuilder = new StringBuilder(i);
				while (0L != l) {
					final long l_2_ = l;
					l /= 37L;
					stringbuilder.append(Class_ei.field_n_2127[(int) (l_2_ - (l * 37L))]);
				}
				string = stringbuilder.reverse().toString();
			} catch (final RuntimeException runtimeexception) {
				throw GameCanvas.error(runtimeexception, "cl.n()");
			}
			return string;
		} while (false);
		return null;
	}

	static final void method_br_void(final boolean bool, final int i) {
		do {
			try {
				Class_db.method_p_void(996785827);
				client.field_ca_2726 += -365264899;
				if (((2068763989 * client.field_ca_2726) >= 50) || bool) {
					client.field_ca_2726 = 0;
					if (!client.field_cm_2737 && (Class_cx.connection != null)) {
						client.encryptedBuffer.writeOpcode(132);
						try {
							Class_cx.connection.put(client.encryptedBuffer.buffer, 0, (client.encryptedBuffer.position * -1485345105), 93957415);
							client.encryptedBuffer.position = 0;
						} catch (final IOException ioexception) {
							client.field_cm_2737 = true;
							break;
						}
					}
				}
				break;
			} catch (final RuntimeException runtimeexception) {
				throw GameCanvas.error(runtimeexception, "cl.br()");
			}
		} while (false);
	}
}
