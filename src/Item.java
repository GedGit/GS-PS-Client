/* GroundItem - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Item extends Renderable {
	public static final int field_s_40 = 2;
	int amount;
	int id;
	static int[] field_p_43;
	static final int field_m_44 = 3;
	static final int field_as_45 = 34;
	static String[] cs2Strings;

	@Override
	protected final Model getModel() {
		Model onscreenmodel;
		try {
			onscreenmodel = (ItemDefinitions.getItemComposite(1499483327 * this.id).method_a_cg(this.amount * 899943275, 1654519761));
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ad.d()");
		}
		return onscreenmodel;
	}

	static final int method_x_int(final int i, int i_0_, final byte i_1_) {
		int i_2_;
		try {
			if (i == -1) {
				return 12345678;
			}
			i_0_ = ((i & 0x7f) * i_0_) / 128;
			if (i_0_ < 2) {
				i_0_ = 2;
			} else if (i_0_ > 126) {
				i_0_ = 126;
			}
			i_2_ = i_0_ + (i & 0xff80);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ad.x()");
		}
		return i_2_;
	}

	static String getWebLink(String subdomain, final boolean secure) {
		String string_3_;
		try {
			final String protocol = secure ? "https://" : "http://";
			if ((1548930135 * client.game_mode) == 1) {
				subdomain = new StringBuilder(subdomain).append("-wtrc").toString();
			} else if ((1548930135 * client.game_mode) == 2) {
				subdomain = new StringBuilder(subdomain).append("-wtqa").toString();
			} else if ((client.game_mode * 1548930135) == 3) {
				subdomain = new StringBuilder(subdomain).append("-wtwip").toString();
			} else if ((client.game_mode * 1548930135) == 5) {
				subdomain = new StringBuilder(subdomain).append("-wti").toString();
			} else if ((client.game_mode * 1548930135) == 4) {
				subdomain = "local";
			}
			String settings = "";
			if (Class_q.clientSettings != null) {
				settings = new StringBuilder("/p=").append(Class_q.clientSettings).toString();
			}
			final String domain = "runescape.com";
			string_3_ = new StringBuilder(protocol).append(subdomain).append(".").append(domain).append("/l=").append(-1485158959 * client.hideWorldList).append("/a=").append(366224583 * Class_dd.field_j_1591).append(settings).append("/").toString();
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ad.es()");
		}
		return string_3_;
	}

	Item() {
		/* empty */
	}
}
