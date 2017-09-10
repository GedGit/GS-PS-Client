/* Class_ev - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Class_ev {
	static int menuHeight;
	public static OnDemandNode field_k_2235;
	static final int field_lu_2236 = 7680;
	public static final char[] field_n_2237 = { '\u20ac', '\0', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020', '\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\0', '\u017d', '\0', '\0', '\u2018', '\u2019', '\u201c', '\u201d', '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122', '\u0161', '\u203a', '\u0153', '\0', '\u017e', '\u0178' };

	public static void method_e_void(final int i, final int i_0_) {
		try {
			if ((i != -1) && Class_ge.isInterfaceLoaded[i]) {
				Widget.field_z_2666.method_x_void(i, 350023659);
				if (Widget.widgets[i] != null) {
					boolean bool = true;
					for (int i_1_ = 0; i_1_ < Widget.widgets[i].length; i_1_++) {
						if (Widget.widgets[i][i_1_] != null) {
							if ((Widget.widgets[i][i_1_].type * 876728889) != 2) {
								Widget.widgets[i][i_1_] = null;
							} else {
								bool = false;
							}
						}
					}
					if (bool) {
						Widget.widgets[i] = null;
					}
					Class_ge.isInterfaceLoaded[i] = false;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ev.e()");
		}
	}

	Class_ev() throws Throwable {
		throw new Error();
	}

	public static void method_z_void(final SecureBuffer class_dc, final short i) {
		try {
			final ItemDefinitions class_gk = (ItemDefinitions) Class_gt.field_n_3046.method_d_ga();
			if (class_gk != null) {
				final int i_2_ = -1485345105 * class_dc.position;
				class_dc.putInt((-1931319283 * class_gk.field_n_3022));
				for (int i_3_ = 0; i_3_ < (class_gk.field_d_3017 * -1071276893); i_3_++) {
					if (class_gk.field_y_3019[i_3_] != 0) {
						class_dc.put((class_gk.field_y_3019[i_3_]));
					} else {
						try {
							final int i_4_ = class_gk.field_z_3016[i_3_];
							if (i_4_ == 0) {
								final Field field = class_gk.field_e_3020[i_3_];
								final int i_5_ = field.getInt(null);
								class_dc.put(0);
								class_dc.putInt(i_5_);
							} else if (i_4_ == 1) {
								final Field field = class_gk.field_e_3020[i_3_];
								field.setInt(null, (class_gk.field_g_3023[i_3_]));
								class_dc.put(0);
							} else if (i_4_ == 2) {
								final Field field = class_gk.field_e_3020[i_3_];
								final int i_6_ = field.getModifiers();
								class_dc.put(0);
								class_dc.putInt(i_6_);
							}
							if (i_4_ == 3) {
								final Method method = class_gk.field_f_3021[i_3_];
								final byte[][] is = class_gk.field_m_3018[i_3_];
								final Object[] objects = new Object[is.length];
								for (int i_7_ = 0; i_7_ < is.length; i_7_++) {
									final ObjectInputStream objectinputstream = (new ObjectInputStream(new ByteArrayInputStream(is[i_7_])));
									objects[i_7_] = objectinputstream.readObject();
								}
								final Object object = method.invoke(null, objects);
								if (object == null) {
									class_dc.put(0);
								} else if (object instanceof Number) {
									class_dc.put(1);
									class_dc.putWord64(((Number) object).longValue());
								} else if (object instanceof String) {
									class_dc.put(2);
									class_dc.putNT0String((String) object, (byte) 100);
								} else {
									class_dc.put(4);
								}
							} else if (i_4_ == 4) {
								final Method method = class_gk.field_f_3021[i_3_];
								final int i_8_ = method.getModifiers();
								class_dc.put(0);
								class_dc.putInt(i_8_);
							}
						} catch (final ClassNotFoundException classnotfoundexception) {
							class_dc.put(-10);
						} catch (final InvalidClassException invalidclassexception) {
							class_dc.put(-11);
						} catch (final StreamCorruptedException streamcorruptedexception) {
							class_dc.put(-12);
						} catch (final OptionalDataException optionaldataexception) {
							class_dc.put(-13);
						} catch (final IllegalAccessException illegalaccessexception) {
							class_dc.put(-14);
						} catch (final IllegalArgumentException illegalargumentexception) {
							class_dc.put(-15);
						} catch (final InvocationTargetException invocationtargetexception) {
							class_dc.put(-16);
						} catch (final SecurityException securityexception) {
							class_dc.put(-17);
						} catch (final IOException ioexception) {
							class_dc.put(-18);
						} catch (final NullPointerException nullpointerexception) {
							class_dc.put(-19);
						} catch (final Exception exception) {
							class_dc.put(-20);
						} catch (final Throwable throwable) {
							class_dc.put(-21);
						}
					}
				}
				class_dc.method_an_int(i_2_, (byte) 29);
				class_gk.removeLink();
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ev.z()");
		}
	}
}
