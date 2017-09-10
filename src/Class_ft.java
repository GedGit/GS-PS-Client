
/* Class_ft - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Class_ft implements Runnable {
	public static NodeDeque field_n_2495 = new NodeDeque();
	public static int field_z_2496 = 0;
	public static NodeDeque field_d_2497 = new NodeDeque();
	public static Object field_y_2498 = new Object();
	public static final int field_fr_2499 = 241;

	@Override
	public void run() {
		try {
			try {
				for (;;) {
					NodeDeque deque = field_n_2495;
					Class_fk class_fk;
					synchronized (deque) {
						class_fk = (Class_fk) field_n_2495.method_f_ga();
					}
					if (class_fk != null) {
						do {
							if ((-569870765 * class_fk.field_n_2385) == 0) {
								class_fk.field_z_2383.method_d_boolean((int) class_fk.id, class_fk.field_d_2384,
										class_fk.field_d_2384.length, -1548289854);
								deque = field_n_2495;
								synchronized (deque) {
									class_fk.removeLink();
									break;
								}
							}
							if ((class_fk.field_n_2385 * -569870765) == 1) {
								class_fk.field_d_2384 = (class_fk.field_z_2383.read((int) class_fk.id, (byte) -122));
								deque = field_n_2495;
								synchronized (deque) {
									field_d_2497.add(class_fk);
								}
							}
						} while (false);
						final Object object = field_y_2498;
						synchronized (object) {
							if ((-1646797879 * field_z_2496) <= 1) {
								field_z_2496 = 0;
								field_y_2498.notifyAll();
							} else {
								field_z_2496 = 980741016;
								continue;
							}
							break;
						}
					}
					Class_fc.sleep(100L);
					final Object object = field_y_2498;
					synchronized (object) {
						if ((-1646797879 * field_z_2496) <= 1) {
							field_z_2496 = 0;
							field_y_2498.notifyAll();
							break;
						}
						field_z_2496 -= -1759302023;
					}
				}
			} catch (final Exception exception) {
				Class_cw.method_n_void(null, exception, 449061456);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ft.run()");
		}
	}

	Class_ft() {
		/* empty */
	}

	public static Sprite method_e_be(final FileStore class_fs, final String string, final String string_0_,
			final int i) {
		Sprite class_be;
		try {
			final int i_1_ = class_fs.getByName(string);
			final int i_2_ = class_fs.getFileIndex(i_1_, string_0_);
			Sprite class_be_3_;
			if (!Region.method_h_boolean(class_fs, i_1_, i_2_, 1079958178)) {
				class_be_3_ = null;
			} else {
				final Sprite class_be_4_ = new Sprite();
				class_be_4_.spriteWidth = GameCanvas.field_d_2228 * -1808307607;
				class_be_4_.spriteHeight = -1626806585 * Class_bk.field_z_584;
				class_be_4_.field_e_535 = Class_bk.field_y_579[0];
				class_be_4_.field_g_537 = Class_bk.field_e_580[0];
				class_be_4_.field_z_533 = Class_fv.field_g_2506[0];
				class_be_4_.field_y_534 = Class_bk.field_f_581[0];
				class_be_4_.field_d_538 = Class_l.field_m_1134;
				class_be_4_.field_n_531 = Class_bk.field_a_585[0];
				ItemComposite.method_u_void(-1231170034);
				class_be_3_ = class_be_4_;
			}
			class_be = class_be_3_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ft.e()");
		}
		return class_be;
	}

	@SuppressWarnings("rawtypes")
	public static void method_y_void(final Buffer rsbytebuffer, final int i, final short i_5_) {
		try {
			final ItemDefinitions class_gk = new ItemDefinitions();
			class_gk.field_d_3017 = rsbytebuffer.get() * -1244924149;
			class_gk.field_n_3022 = rsbytebuffer.getInt() * 446965445;
			class_gk.field_z_3016 = new int[class_gk.field_d_3017 * -1071276893];
			class_gk.field_y_3019 = new int[-1071276893 * class_gk.field_d_3017];
			class_gk.field_e_3020 = new Field[-1071276893 * class_gk.field_d_3017];
			class_gk.field_g_3023 = new int[-1071276893 * class_gk.field_d_3017];
			class_gk.field_f_3021 = new Method[-1071276893 * class_gk.field_d_3017];
			class_gk.field_m_3018 = (new byte[-1071276893 * class_gk.field_d_3017][][]);
			for (int i_6_ = 0; i_6_ < (-1071276893 * class_gk.field_d_3017); i_6_++) {
				try {
					final int i_7_ = rsbytebuffer.get();
					if ((i_7_ != 0) && (i_7_ != 1) && (i_7_ != 2)) {
						if ((i_7_ == 3) || (i_7_ == 4)) {
							final String string = rsbytebuffer.getString();
							final String string_8_ = rsbytebuffer.getString();
							final int i_9_ = rsbytebuffer.get();
							final String[] strings = new String[i_9_];
							for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
								strings[i_10_] = rsbytebuffer.getString();
							}
							final String string_11_ = rsbytebuffer.getString();
							final byte[][] is = new byte[i_9_][];
							if (i_7_ == 3) {
								for (int i_12_ = 0; i_12_ < i_9_; i_12_++) {
									final int i_13_ = rsbytebuffer.getInt();
									is[i_12_] = new byte[i_13_];
									rsbytebuffer.method_ax_void(is[i_12_], 0, i_13_);
								}
							}
							class_gk.field_z_3016[i_6_] = i_7_;
							final Class[] var_classes = new Class[i_9_];
							for (int i_14_ = 0; i_14_ < i_9_; i_14_++) {
								var_classes[i_14_] = Class_en.method_e_Class(strings[i_14_], 525270390);
							}
							final Class var_class = Class_en.method_e_Class(string_11_, 525270390);
							if (Class_en.method_e_Class(string, 525270390).getClassLoader() == null) {
								throw new SecurityException();
							}
							final Method[] methods = Class_en.method_e_Class(string, 525270390).getDeclaredMethods();
							final Method[] methods_15_ = methods;
							for (final Method method : methods_15_) {
								if (method.getName().equals(string_8_)) {
									final Class[] var_classes_17_ = method.getParameterTypes();
									if (var_classes_17_.length == var_classes.length) {
										boolean bool = true;
										for (int i_18_ = 0; i_18_ < var_classes.length; i_18_++) {
											if (var_classes_17_[i_18_] != var_classes[i_18_]) {
												bool = false;
												break;
											}
										}
										if (bool && (var_class == method.getReturnType())) {
											class_gk.field_f_3021[i_6_] = method;
										}
									}
								}
							}
							class_gk.field_m_3018[i_6_] = is;
						}
					} else {
						final String string = rsbytebuffer.getString();
						final String string_19_ = rsbytebuffer.getString();
						int i_20_ = 0;
						if (i_7_ == 1) {
							i_20_ = rsbytebuffer.getInt();
						}
						class_gk.field_z_3016[i_6_] = i_7_;
						class_gk.field_g_3023[i_6_] = i_20_;
						if (Class_en.method_e_Class(string, 525270390).getClassLoader() == null) {
							throw new SecurityException();
						}
						class_gk.field_e_3020[i_6_] = Class_en.method_e_Class(string, 525270390)
								.getDeclaredField(string_19_);
					}
				} catch (final ClassNotFoundException classnotfoundexception) {
					class_gk.field_y_3019[i_6_] = -1;
				} catch (final SecurityException securityexception) {
					class_gk.field_y_3019[i_6_] = -2;
				} catch (final NullPointerException nullpointerexception) {
					class_gk.field_y_3019[i_6_] = -3;
				} catch (final Exception exception) {
					class_gk.field_y_3019[i_6_] = -4;
				} catch (final Throwable throwable) {
					class_gk.field_y_3019[i_6_] = -5;
				}
			}
			Class_gt.field_n_3046.method_n_void(class_gk);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ft.y()");
		}
	}
}
