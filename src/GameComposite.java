/* Class_ea - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class GameComposite implements Identifiable {
	public static final GameComposite OLDSCAPE = new GameComposite("oldscape", "RuneScape 2007", 5);
	static final GameComposite STELLAR_DAWN = new GameComposite("stellardawn", "Stellar Dawn", 1);
	static final GameComposite GAME4 = new GameComposite("game4", "Game 4", 3);
	static final GameComposite RUNESCAPE = new GameComposite("runescape", "RuneScape", 0);
	static final GameComposite GAME5 = new GameComposite("game5", "Game 5", 4);
	public final String codename;
	static final GameComposite GAME3 = new GameComposite("game3", "Game 3", 2);
	final int id;
	public static final int field_l_1770 = 13;
	static final int field_ag_1771 = 49;

	@Override
	public int getId() {
		int i_0_;
		try {
			i_0_ = this.id * 2131169311;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "ea.d()");
		}
		return i_0_;
	}

	GameComposite(final String string, final String string_1_, final int i) {
		codename = string;
		id = -949720097 * i;
	}
}
