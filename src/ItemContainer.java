/* ItemContainer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ItemContainer extends Node {
	static String WORLD_LIST_URL;
	int[] ids = { -1 };
	int[] amts = new int[1];
	static Index terrainIndex;
	static NodeMultiSet itemContainerTable = new NodeMultiSet(32);
	static byte inChannelFlag;
	static final int field_oh_1530 = 5;
	public static final int field_bq_1531 = 147;
	public static final int field_cg_1532 = 79;

	static void method_az_void(final int i, final int i_0_) {
		try {
			client.field_lk_2947 = 0L;
			if (i >= 2) {
				client.field_ll_2903 = true;
			} else {
				client.field_ll_2903 = false;
			}
			Class_fj.method_an_void(-807331044);
			if ((client.status * 824045845) >= 25) {
				Class_a.method_aa_void(1615472501);
			}
			GameStub.field_qq_2143 = true;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "x.az()");
		}
	}

	ItemContainer() {
		/* empty */
	}

	static void method_z_void(final int i, final byte[] is, final Class_du class_du, final int i_1_) {
		try {
			final Class_fk class_fk = new Class_fk();
			class_fk.field_n_2385 = 0;
			class_fk.id = i;
			class_fk.field_d_2384 = is;
			class_fk.field_z_2383 = class_du;
			final NodeDeque deque = Class_ft.field_n_2495;
			synchronized (deque) {
				Class_ft.field_n_2495.add(class_fk);
			}
			SceneObject.method_e_void(-1119288531);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "x.z()");
		}
	}

	static void method_o_void(final AnimationSequence class_an, final int i, final int i_2_, final int i_3_, final int i_4_) {
		try {
			if (((-1735289853 * client.field_nb_2931) < 50) && ((client.field_nm_2918 * -630818465) != 0) && (class_an.field_a_201 != null) && (i < class_an.field_a_201.length)) {
				final int i_5_ = class_an.field_a_201[i];
				if (i_5_ != 0) {
					final int i_6_ = i_5_ >> 8;
			final int i_7_ = (i_5_ >> 4) & 0x7;
			final int i_8_ = i_5_ & 0xf;
			client.field_nq_2932[client.field_nb_2931 * -1735289853] = i_6_;
			client.field_nx_2933[client.field_nb_2931 * -1735289853] = i_7_;
			client.field_nj_2967[-1735289853 * client.field_nb_2931] = 0;
			client.field_no_2936[client.field_nb_2931 * -1735289853] = null;
			final int i_9_ = (i_2_ - 64) / 128;
			final int i_10_ = (i_3_ - 64) / 128;
			client.field_nu_2935[client.field_nb_2931 * -1735289853] = (i_10_ << 8) + (i_9_ << 16) + i_8_;
			client.field_nb_2931 += -405227861;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "x.o()");
		}
	}
}
