/* Class_ca - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Vector3 {
	public static final int field_bj_750 = 31;
	static final int field_al_751 = 32;
	int z;
	int magnitude;
	public static final int field_ff_754 = 158;
	static int field_fv_755;
	public static final int field_bb_756 = 98;
	static final int field_b_757 = 24;
	int y;
	int x;
	static final int field_am_760 = 47;
	public static final int field_fo_761 = 29;
	static final int field_j_762 = 256;

	Vector3() {
		/* empty */
	}

	Vector3(final Vector3 class_ca_0_) {
		this.x = class_ca_0_.x * 1;
		this.y = 1 * class_ca_0_.y;
		this.z = 1 * class_ca_0_.z;
		this.magnitude = 1 * class_ca_0_.magnitude;
	}

	static void animatePlayer(final Player player, final int animation, final int delay, final byte i_2_) {
		try {
			if (((1529361367 * player.animation) == animation) && (animation != -1)) {
				final int i_3_ = (OnDemandNode.getAnimationSequence(animation).field_v_208 * 1865833167);
				if (i_3_ == 1) {
					player.field_bo_247 = 0;
					player.field_bw_248 = 0;
					player.animationDelay = delay * -1653847103;
					player.field_bj_250 = 0;
				}
				if (i_3_ == 2) {
					player.field_bj_250 = 0;
				}
			} else if ((animation == -1) || ((player.animation * 1529361367) == -1) || ((OnDemandNode.getAnimationSequence(animation).field_q_194 * -2041641799) >= ((OnDemandNode.getAnimationSequence(1529361367 * player.animation).field_q_194) * -2041641799))) {
				player.animation = animation * -1176932377;
				player.field_bo_247 = 0;
				player.field_bw_248 = 0;
				player.animationDelay = -1653847103 * delay;
				player.field_bj_250 = 0;
				player.queueYPos = 1690814653 * player.queueXPos;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ca.ao()");
		}
	}
}
