/* Class_ak - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.IOException;

public final class GroundItem extends Renderable {
	boolean nonStackable = false;
	int field_d_160;
	int y;
	int duration;
	int field_f_163;
	int field_z_164;
	AnimationSequence field_y_165;
	int id = 0;
	static final int field_q_167 = 13;
	int x;
	static Widget field_u_169;
	static final int field_o_170 = 22;
	static final int field_c_171 = 22;
	static final int field_i_172 = 1;
	int plane = 0;

	final void method_n_void(final int i, final int i_0_) {
		try {
			if (!this.nonStackable) {
				this.plane += i * -1867593887;
				while ((939924641 * this.plane) > (this.field_y_165.frames[2094035089 * this.id])) {
					this.plane -= ((this.field_y_165.frames[2094035089 * this.id]) * -1867593887);
					this.id += 809586801;
					if ((2094035089 * this.id) >= this.field_y_165.cycle.length) {
						this.nonStackable = true;
						break;
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ak.n()");
		}
	}

	GroundItem(final int i, final int i_1_, final int i_2_, final int i_3_, final int i_4_, final int i_5_, final int i_6_) {
		this.x = -770205621 * i;
		this.y = -1089592165 * i_1_;
		this.duration = i_2_ * -2135778893;
		this.field_f_163 = -1301988595 * i_3_;
		this.field_z_164 = i_4_ * 1238853133;
		this.field_d_160 = (i_5_ + i_6_) * -429726245;
		final int i_7_ = (Class_l.getSpotAnimation(this.x * 966095203).field_f_399 * 1956440953);
		if (i_7_ != -1) {
			this.nonStackable = false;
			this.field_y_165 = OnDemandNode.getAnimationSequence(i_7_);
		} else {
			this.nonStackable = true;
		}
	}

	static void method_d_void(final File file, final File file_8_, final int i) {
		do {
			try {
				try {
					final SeekableFile class_hh = new SeekableFile(Class_ge.field_y_2979, "rw", 10000L);
					final Buffer rsbytebuffer = new Buffer(500);
					rsbytebuffer.put(3);
					rsbytebuffer.put(file_8_ != null ? 1 : 0);
					rsbytebuffer.method_u_void(file.getPath(), -113951119);
					if (file_8_ != null) {
						rsbytebuffer.method_u_void(file_8_.getPath(), -1307224229);
					}
					class_hh.method_d_void(rsbytebuffer.buffer, 0, (-1485345105 * rsbytebuffer.position), (byte) 51);
					class_hh.close();
				} catch (final IOException ioexception) {
					ioexception.printStackTrace();
					break;
				}
				break;
			} catch (final RuntimeException runtimeexception) {
				throw GameCanvas.error(runtimeexception, "ak.d()");
			}
		} while (false);
	}

	@Override
	protected final Model getModel() {
		Model onscreenmodel;
		try {
			final SpotAnim spotanim = Class_l.getSpotAnimation((this.x * 966095203));
			Model onscreenmodel_9_;
			if (!this.nonStackable) {
				onscreenmodel_9_ = spotanim.method_y_cg((this.id * 2094035089), 915601585);
			} else {
				onscreenmodel_9_ = spotanim.method_y_cg(-1, 949653183);
			}
			onscreenmodel = onscreenmodel_9_ == null ? null : onscreenmodel_9_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ak.d()");
		}
		return onscreenmodel;
	}

	public static void method_d_void(final boolean bool, final int i) {
		do {
			try {
				if (Class_et.connection != null) {
					try {
						final Buffer rsbytebuffer = new Buffer(4);
						rsbytebuffer.put(bool ? 2 : 3);
						rsbytebuffer.putMedium(0, 510354421);
						Class_et.connection.put((rsbytebuffer.buffer), 0, 4, 93957415);
					} catch (final IOException ioexception) {
						try {
							Class_et.connection.close(-1328543427);
						} catch (final Exception exception) {
							/* empty */
						}
						Class_fq.field_t_2451 += 1072263357;
						Class_et.connection = null;
						break;
					}
				}
				break;
			} catch (final RuntimeException runtimeexception) {
				throw GameCanvas.error(runtimeexception, "ak.d()");
			}
		} while (false);
	}
}
