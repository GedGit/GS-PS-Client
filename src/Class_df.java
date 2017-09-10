/* Class_df - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_df {
	static final int field_hw_1605 = 8;
	public static final int field_e_1606 = 6;
	public static final int field_a_1607 = 1024;
	static final int field_m_1608 = 16384;
	public static final int field_av_1609 = 66;
	static byte[][][] field_g_1610;

	public static int method_z_int(final int i) {
		int i_0_;
		try {
			i_0_ = ((MouseInputListener.field_d_2150 += 2041506967) * -1323085017) - 1;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "df.z()");
		}
		return i_0_;
	}

	public static boolean method_m_boolean(final int i, final int i_1_) {
		boolean bool;
		try {
			if (((i >> 31) & 0x1) != 0) {
				return true;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "df.m()");
		}
		return bool;
	}

	public static Rasterizer2D[] getSpriteArray(final FileStore sprites, final String string, final String string_2_, final int i) {
		Rasterizer2D[] class_bxes;
		try {
			final int i_3_ = sprites.getByName(string);
			final int i_4_ = sprites.getFileIndex(i_3_, string_2_);
			class_bxes = Class_eo.method_d_bxArray(sprites, i_3_, i_4_, -434182517);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "df.g()");
		}
		return class_bxes;
	}

	Class_df() throws Throwable {
		throw new Error();
	}

	static final void method_t_void(final Widget widget, final int i, final int i_5_, final short i_6_) {
		try {
			if ((((345141143 * client.field_nk_2925) == 0) || ((345141143 * client.field_nk_2925) == 3)) && (((MouseInputListener.field_q_2162 * 1159182273) == 1) || (!Class_al.field_aw_178 && ((MouseInputListener.field_q_2162 * 1159182273) == 4)))) {
				final Class_fp class_fp = widget.method_x_fp((byte) -95);
				if (class_fp != null) {
					int i_7_ = (2117517719 * MouseInputListener.field_k_2164) - i;
					int i_8_ = (MouseInputListener.field_x_2158 * 1750309931) - i_5_;
					if (class_fp.method_n_boolean(i_7_, i_8_, -1778404163)) {
						i_7_ -= (class_fp.field_n_2427 * -821941733) / 2;
						i_8_ -= (1159260577 * class_fp.field_d_2424) / 2;
						final int i_9_ = (((1814938795 * client.miniMapOffset) + (client.miniMapAngle * -2037472027)) & 0x7ff);
						int i_10_ = Rasterizer3D.SINE[i_9_];
						int i_11_ = Rasterizer3D.COSINE[i_9_];
						i_10_ = ((i_10_ * (256 + (client.miniMapScale * -1606807399))) >> 8);
						i_11_ = (((client.miniMapScale * -1606807399) + 256) * i_11_) >> 8;
						final int i_12_ = ((i_8_ * i_10_) + (i_7_ * i_11_)) >> 11;
						final int i_13_ = ((i_11_ * i_8_) - (i_10_ * i_7_)) >> 11;
						final int i_14_ = (((Class_ci.myPlayer.worldPosX * -2103184911) + i_12_) >> 7);
						final int i_15_ = (((Class_ci.myPlayer.worldPosY * 2088773389) - i_13_) >> 7);
						client.encryptedBuffer.writeOpcode(161);
						client.encryptedBuffer.put(18);
						client.encryptedBuffer.putShort(i_15_ + (Class_gf.originY * -1593604783));
						client.encryptedBuffer.putLEShortA(i_14_ + (1693061403 * Class_q.originX), 2023486668);
						client.encryptedBuffer.putByteA((KeyFocusListener.field_cn_1676[82] ? KeyFocusListener.field_cn_1676[81] ? 2 : 1 : 0));
						client.encryptedBuffer.put(i_7_);
						client.encryptedBuffer.put(i_8_);
						client.encryptedBuffer.putShort((-2037472027 * (client.miniMapAngle)));
						client.encryptedBuffer.put(57);
						client.encryptedBuffer.put(1814938795 * client.miniMapOffset);
						client.encryptedBuffer.put((client.miniMapScale * -1606807399));
						client.encryptedBuffer.put(89);
						client.encryptedBuffer.putShort((Class_ci.myPlayer.worldPosX * -2103184911));
						client.encryptedBuffer.putShort((2088773389 * Class_ci.myPlayer.worldPosY));
						client.encryptedBuffer.put(63);
						client.field_mk_2923 = i_14_ * -652317981;
						client.field_mn_2924 = -1028068353 * i_15_;
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "df.t()");
		}
	}
}
