public class Permissions implements Identifiable {

	public static final Permissions NORMAL_PLAYER = new Permissions(0, -1, false, true);

	public static final Permissions MODERATOR = new Permissions(1, 0, true, true);

	public static final Permissions ADMINISTRATOR = new Permissions(2, 1, true, false);

	public static final Permissions IRON_MAN = new Permissions(3, 2, false, true);

	public static final Permissions ULTIMATE_IRON_MAN = new Permissions(4, 3, false, true);

	public static final Permissions HARDCORE_IRON_MAN = new Permissions(5, 10, false, true);

	public static final Permissions SHIT_1 = new Permissions(6, 10, false, true);

	public static final Permissions SHIT_2 = new Permissions(7, 10, false, true);

	public static final Permissions SHIT_3 = new Permissions(8, 10, false, true);

	public static final Permissions SHIT_4 = new Permissions(9, 10, false, true);

	public static final Permissions PVP = new Permissions(10, 9, false, true);

	public static final Permissions HELPER = new Permissions(11, 33, false, true);

	public static final Permissions YOUTUBER = new Permissions(12, 41, false, true);

	public static final Permissions BRONZE_MEMBER = new Permissions(13, 40, false, true);

	public static final Permissions SILVER_MEMBER = new Permissions(14, 39, false, true);

	public static final Permissions GOLD_MEMBER = new Permissions(15, 38, false, true);

	public static final Permissions PLATINUM_MEMBER = new Permissions(16, 37, false, true);

	public static final Permissions DIAMOND_MEMBER = new Permissions(17, 36, false, true);

	public static final Permissions COM = new Permissions(18, 50, false, true);

	public static final Permissions DEV = new Permissions(19, 1, true, false);

	public final int level;
	public final int ordinal;

	public final boolean ignorable;
	public final boolean overridesSettings;

	Permissions(final int i, final int ord, final boolean bool_2_, final boolean ignore) {
		level = -1260508621 * i;
		ordinal = -1889457985 * ord;
		overridesSettings = bool_2_;
		ignorable = ignore;
	}

	public static Permissions[] getPrivileges() {
		return new Permissions[] { Permissions.NORMAL_PLAYER, Permissions.MODERATOR, Permissions.ADMINISTRATOR,
				Permissions.IRON_MAN, Permissions.ULTIMATE_IRON_MAN, Permissions.HARDCORE_IRON_MAN, Permissions.SHIT_1,
				Permissions.SHIT_2, Permissions.SHIT_3, Permissions.SHIT_4, Permissions.PVP, Permissions.HELPER,
				Permissions.YOUTUBER, Permissions.BRONZE_MEMBER, Permissions.SILVER_MEMBER, Permissions.GOLD_MEMBER,
				Permissions.PLATINUM_MEMBER, Permissions.DIAMOND_MEMBER, Permissions.COM, Permissions.DEV };
	}

	@Override
	public int getId() {
		return this.level * -440344325;
	}
}
