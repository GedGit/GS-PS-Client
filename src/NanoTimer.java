/* Class_ee - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class NanoTimer extends Timer {
	long start = System.nanoTime() * -276776236655481331L;

	@Override
	public void reset() {
		try {
			this.start = System.nanoTime() * -276776236655481331L;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ee.d()");
		}
	}

	NanoTimer() {
		/* empty */
	}

	@Override
	int getDelay(final int i, final int i_0_, final byte i_1_) {
		int i_2_;
		try {
			final long l = 1000000L * i_0_;
			long l_3_ = ((3193683218089611461L * this.start) - System.nanoTime());
			if (l_3_ < l) {
				l_3_ = l;
			}
			Class_fc.sleep(l_3_ / 1000000L);
			final long l_4_ = System.nanoTime();
			int i_5_ = 0;
			while (i_5_ < 10) {
				if ((i_5_ >= 1) && ((3193683218089611461L * this.start) >= l_4_)) {
					break;
				}
				i_5_++;
				this.start += i * -1288573543218553536L;
			}
			if ((3193683218089611461L * this.start) < l_4_) {
				this.start = -276776236655481331L * l_4_;
			}
			i_2_ = i_5_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ee.z()");
		}
		return i_2_;
	}
}
