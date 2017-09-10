
/* Class_gh - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Comparator;

@SuppressWarnings("rawtypes")
final class Class_gh implements Comparator {
	public static final int field_ey_3005 = 39;
	static Index cs2Index;
	public static final int field_n_3007 = 1;
	public static final int field_fm_3008 = 202;
	static final int field_h_3009 = 512;

	int method_n_int(final Class_gg class_gg, final Class_gg class_gg_0_, final int i) {
		int i_1_;
		try {
			i_1_ = (((class_gg.field_z_3003.field_z_3083 * 168550371) < (class_gg_0_.field_z_3003.field_z_3083
					* 168550371)) ? -1
							: ((168550371 * class_gg_0_.field_z_3003.field_z_3083) == (168550371
									* class_gg.field_z_3003.field_z_3083)) ? 0 : 1);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "gh.n()");
		}
		return i_1_;
	}

	@Override
	public int compare(final Object object, final Object object_2_) {
		int i;
		try {
			i = method_n_int((Class_gg) object, (Class_gg) object_2_, 2064406847);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "gh.compare()");
		}
		return i;
	}

	@Override
	public boolean equals(final Object object) {
		boolean bool;
		try {
			bool = super.equals(object);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "gh.equals()");
		}
		return bool;
	}

	public static int method_n_int(final CharSequence charsequence, final CharSequence charsequence_3_, final int i,
			final int i_4_) {
		try {
			final int i_5_ = charsequence.length();
			final int i_6_ = charsequence_3_.length();
			int i_7_ = 0;
			int i_8_ = 0;
			int i_9_ = 0;
			int i_10_ = 0;
			while (((i_7_ - i_9_) < i_5_) || ((i_8_ - i_10_) < i_6_)) {
				if ((i_7_ - i_9_) >= i_5_) {
					return -1;
				}
				if ((i_8_ - i_10_) >= i_6_) {
					return 1;
				}
				char c;
				if (i_9_ != 0) {
					c = (char) i_9_;
				} else {
					c = charsequence.charAt(i_7_++);
				}
				char c_11_;
				if (i_10_ != 0) {
					c_11_ = (char) i_10_;
				} else {
					c_11_ = charsequence_3_.charAt(i_8_++);
				}
				int i_12_;
				if (c == '\u00c6') {
					i_12_ = 69;
				} else if (c == '\u00e6') {
					i_12_ = 101;
				} else if (c == '\u00df') {
					i_12_ = 115;
				} else if (c == '\u0152') {
					i_12_ = 69;
				} else if (c == '\u0153') {
					i_12_ = 101;
				} else {
					i_12_ = 0;
				}
				i_9_ = i_12_;
				int i_13_;
				if (c_11_ == '\u00c6') {
					i_13_ = 69;
				} else if (c_11_ == '\u00e6') {
					i_13_ = 101;
				} else if (c_11_ == '\u00df') {
					i_13_ = 115;
				} else if (c_11_ == '\u0152') {
					i_13_ = 69;
				} else if (c_11_ == '\u0153') {
					i_13_ = 101;
				} else {
					i_13_ = 0;
				}
				i_10_ = i_13_;
				c = Class_o.method_d_char(c, i, -1180996074);
				c_11_ = Class_o.method_d_char(c_11_, i, -1180996074);
				if ((c_11_ != c) && (java.lang.Character.toUpperCase(c) != java.lang.Character.toUpperCase(c_11_))) {
					c = java.lang.Character.toLowerCase(c);
					c_11_ = java.lang.Character.toLowerCase(c_11_);
					if (c != c_11_) {
						return (Class_i.method_z_int(c, i, (byte) 90) - Class_i.method_z_int(c_11_, i, (byte) 2));
					}
				}
			}
			final int i_14_ = Math.min(i_5_, i_6_);
			for (int i_15_ = 0; i_15_ < i_14_; i_15_++) {
				char c = charsequence.charAt(i_15_);
				char c_16_ = charsequence_3_.charAt(i_15_);
				if ((c_16_ != c) && (java.lang.Character.toUpperCase(c) != java.lang.Character.toUpperCase(c_16_))) {
					c = java.lang.Character.toLowerCase(c);
					c_16_ = java.lang.Character.toLowerCase(c_16_);
					if (c_16_ != c) {
						return (Class_i.method_z_int(c, i, (byte) 109) - Class_i.method_z_int(c_16_, i, (byte) 87));
					}
				}
			}
			final int i_17_ = i_5_ - i_6_;
			if (i_17_ != 0) {
				return i_17_;
			}
			for (int i_18_ = 0; i_18_ < i_14_; i_18_++) {
				final char c = charsequence.charAt(i_18_);
				final char c_19_ = charsequence_3_.charAt(i_18_);
				if (c_19_ != c) {
					return (Class_i.method_z_int(c, i, (byte) 122) - Class_i.method_z_int(c_19_, i, (byte) 66));
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "gh.n()");
		}
		return 0;
	}
}
