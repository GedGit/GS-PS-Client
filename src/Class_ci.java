/* Class_ci - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

public class Class_ci extends CacheableNode {
	protected static Frame field_qb_982;
	Skeleton[] skeletons;
	static final int field_a_984 = 2;
	static final int field_aa_985 = 48;
	static final int field_z_986 = 3;
	static final int field_r_987 = 17;
	public static final int field_dt_988 = 89;
	static int clanSize;
	static Player myPlayer;

	public Class_ci(final FileStore class_fs, final FileStore class_fs_0_, final int i, final boolean bool) {
		final NodeDeque deque = new NodeDeque();
		final int i_1_ = class_fs.method_q_int(i, -1940125661);
		this.skeletons = new Skeleton[i_1_];
		final int[] is = class_fs.method_u_intArray(i, -1242313424);
		for (int i_2_ = 0; i_2_ < is.length; i_2_++) {
			final byte[] is_3_ = class_fs.getArchive(i, is[i_2_]);
			WidgetNode class_cd = null;
			final int i_4_ = ((is_3_[0] & 0xff) << 8) | (is_3_[1] & 0xff);
			WidgetNode class_cd_5_ = (WidgetNode) deque.method_f_ga();
			while_12_: do {
				for (;;) {
					if (class_cd_5_ == null) {
						break while_12_;
					}
					if (i_4_ == (-982242473 * class_cd_5_.field_n_800)) {
						break;
					}
					class_cd_5_ = (WidgetNode) deque.method_a_ga();
				}
				class_cd = class_cd_5_;
			} while (false);
			if (class_cd == null) {
				byte[] is_6_;
				if (bool) {
					is_6_ = class_fs_0_.getChildData(0, i_4_);
				} else {
					is_6_ = class_fs_0_.getChildData(i_4_, 0);
				}
				class_cd = new WidgetNode(i_4_, is_6_);
				deque.add(class_cd);
			}
			this.skeletons[is[i_2_]] = new Skeleton(is_3_, class_cd);
		}
	}

	public boolean method_n_boolean(final int i, final int i_7_) {
		boolean bool;
		try {
			bool = this.skeletons[i].field_l_1351;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ci.n()");
		}
		return bool;
	}

	static GameMessage method_y_as(final int i, final int i_8_) {
		GameMessage gamemessage;
		try {
			gamemessage = ((GameMessage) Class_l.gameMessagesTable.method_n_ga(i));
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ci.y()");
		}
		return gamemessage;
	}

	static final void updateLocalNPCs(final int i) {
		try {
			client.inbound.startBitMode();
			final int localNpcs = client.inbound.getBits(8);
			if (localNpcs < (client.localNpcCount * 1308149425)) {
				for (int i_10_ = localNpcs; i_10_ < (client.localNpcCount * 1308149425); i_10_++) {
					client.localPlayerIndices[((client.localEntityAmount += 1307805913) * -696223895) - 1] = client.npcIndexArray[i_10_];
				}
			}
			if (localNpcs > (client.localNpcCount * 1308149425)) {
				throw new RuntimeException("");
			}
			client.localNpcCount = 0;
			for (int local = 0; local < localNpcs; local++) {
				final int index = client.npcIndexArray[local];
				final Npc npc = client.npcs[index];
				final int i_13_ = client.inbound.getBits(1);
				if (i_13_ == 0) {
					client.npcIndexArray[((client.localNpcCount += -991444399) * 1308149425) - 1] = index;
					npc.cycle = 260564055 * client.currentCycle;
				} else {
					final int moveType = client.inbound.getBits(2);
					if (moveType == 0) {// npc didn't move
						client.npcIndexArray[((client.localNpcCount += -991444399) * 1308149425) - 1] = index;
						npc.cycle = 260564055 * client.currentCycle;
						client.playersNeedUpdating[((client.field_gr_2808 += 990413737) * 2070991001) - 1] = index;
					} else if (moveType == 1) {
						client.npcIndexArray[((client.localNpcCount += -991444399) * 1308149425) - 1] = index;
						npc.cycle = client.currentCycle * 260564055;
						final int direction = client.inbound.getBits(3);
						npc.moveInDirection(direction, false);
						final int updateRequiredBit = client.inbound.getBits(1);
						if (updateRequiredBit == 1) {
							client.playersNeedUpdating[(((client.field_gr_2808 += 990413737) * 2070991001) - 1)] = index;
						}
					} else if (moveType == 2) {
						client.npcIndexArray[((client.localNpcCount += -991444399) * 1308149425) - 1] = index;
						npc.cycle = client.currentCycle * 260564055;
						final int i_17_ = client.inbound.getBits(3);
						npc.moveInDirection(i_17_, true);
						final int i_18_ = client.inbound.getBits(3);
						npc.moveInDirection(i_18_, true);
						final int i_19_ = client.inbound.getBits(1);
						if (i_19_ == 1) {
							client.playersNeedUpdating[(((client.field_gr_2808 += 990413737) * 2070991001) - 1)] = index;
						}
					} else if (moveType == 3) {
						client.localPlayerIndices[((client.localEntityAmount += 1307805913) * -696223895) - 1] = index;
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ci.bk()");
		}
	}
}
