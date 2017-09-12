
/* Class_gr - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Comparator;

@SuppressWarnings("rawtypes")
final class NpcDefinitions implements Comparator {

	public static int totalConfigFiles;
	public static int audioSampleRate;
	public static final int field_n_3039 = 8;
	static int i2 = 0;

	public static NpcComposite getNpcComposite(final int id) {
		NpcComposite npcdef;
		try {
			NpcComposite npcdef_1_ = (NpcComposite) NpcComposite.field_z_465.method_n_gb(id);
			if (npcdef_1_ != null)
				return npcdef_1_;
			final byte[] is = NpcComposite.field_n_479.getArchive(9, id);
			npcdef_1_ = new NpcComposite();
			npcdef_1_.id = id * -449317387;
			if (is != null)
				npcdef_1_.method_z_void(new Buffer(is), (short) -16764);
			npcdef_1_.method_d_void(-1053451984);

			if (id == 401) {
				npcdef_1_.name = "Turael - Beginner";
			}
			if (id == 402) {
				npcdef_1_.name = "Mazchna - Easy";
			}
			if (id == 404) {
				npcdef_1_.name = "Chaeldar - Easy";
			}
			if (id == 403) {
				npcdef_1_.name = "Vannaka";
			}
			if (id == 6798) {
				npcdef_1_.name = "Steve - Hard";
			}
			if (id == 6797) {
				npcdef_1_.name = "Nieve - Boss Task";
			}
			if (id == 3369) {
				npcdef_1_.name = "<img=10> Juan";
			}
			if (id == 317) {
				npcdef_1_.name = "<img=3> Paul";
			}
			if (id == 311) {
				npcdef_1_.name = "<img=2> Adam";
			}
			if (id == 560) {
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[2] = "Trade";
			}
			if (id == 276) {
				npcdef_1_.name = ClientLoaderOLD.NAME + " Advisor";
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[0] = "Talk-to";
				npcdef_1_.actions[2] = "Claim Vote -";
				npcdef_1_.actions[3] = "Vote Point Store -";
				npcdef_1_.actions[4] = "Loyalty Point Store -";
			}
			if (id == 315) {
				npcdef_1_.name = "<img=43> Emblem Trader";
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[0] = "Talk to";
			}
			if (id == 534) {
				npcdef_1_.name = "Thessalia";
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[0] = "Outfits -";
				npcdef_1_.actions[2] = "Trade -";
			}
			if (id == 4159) {
				npcdef_1_.name = "Teleporter";
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[0] = "View Locations -";
				npcdef_1_.actions[2] = "Previous Location -";
			}
			if (id == 1152) {
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[0] = "Trade -";
				npcdef_1_.actions[2] = "Heal-me -";
			}
			if (id == 5419) {
				npcdef_1_.name = "Estate Agent";
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[2] = "Talk-to";
				npcdef_1_.actions[3] = "Turn-in";
			}
			if (id == 508 || id == 509 || id == 514 || id == 515) {
				npcdef_1_.actions = new String[5];
				npcdef_1_.name = "General Store";
				npcdef_1_.actions[0] = "Trade -";
				npcdef_1_.actions[2] = "Tools -";
				npcdef_1_.actions[3] = "Supplies -";
			}
			if (id == 6904 || id == 535) {
				npcdef_1_.name = "Melee Shop";
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[0] = "Weapons -";
				npcdef_1_.actions[3] = "Equipment -";
			}
			if (id == 7492) {
				npcdef_1_.name = "Ranged Shop";
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[0] = "Weapons -";
				npcdef_1_.actions[3] = "Equipment -";
			}
			if (id == 4474) {
				npcdef_1_.name = "Blood money exchange";
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[0] = "Trade -";
			}
			if (id == 7608) {
				npcdef_1_.name = "Magic Shop";
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[0] = "Weapons -";
				npcdef_1_.actions[2] = "Equipment -";
				npcdef_1_.actions[3] = "Teleports -";
				npcdef_1_.actions[4] = "Runes -";
			}
			if ((id >= 2127 && id <= 2129) || (id >= 7337 && id <= 7350))
				npcdef_1_.actions[3] = "Metamorphosis";

			if (id == 311) {
				npcdef_1_.name = "Ironman advisor";
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[0] = "Talk-to";
				npcdef_1_.actions[2] = "Open shop -";
				npcdef_1_.actions[3] = "Claim armour -";
			}

			if (id == 2108) { // wise old man
				npcdef_1_.name = "Wise Old Man";
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[0] = "Hoods -";
				npcdef_1_.actions[2] = "Skillcapes -";
				npcdef_1_.actions[3] = "Skillcapes (t) -";
				npcdef_1_.actions[4] = "Max Cape -";
			}

			if (id == 5449) { // bob barter (herbs)
				npcdef_1_.name = "Bob Barter";
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[0] = "Decant Potions -";
			}

			if (id == 2470 // lilly potion shop @ warr guild
					|| id == 1767 // void knight fletching shop
					|| id == 1768 // void knight general shop
					|| id == 1765 // void knight magic shop
					|| id == 7374 // ignisia wintertodt rewards shop
					|| id == 3247 // wizards guild magic store
					|| id == 1601 // mage banks rune store
					|| id == 1049 // faladors mace shop
					|| id == 1050 // faladors chainmail shop
					|| id == 1028 // port sarims battleaxe shop
					|| id == 1052 // port sarims magic shop
					|| id == 1025 // port sarims jewellery shop
					|| id == 1027 // port sarims fish shop
					|| id == 1026 // port sarims food shop
					|| id == 523 // champ guild rune store
					|| id == 522 // champ guild vailaines champ store
					|| id == 4754 // nardah adventurer store
					|| id == 4761 // nardah rokuh chocolate store
					|| id == 524 // barb village peksa's helm store
					|| id == 1176 // ardougne zenesha's platebody store
					|| id == 1602 // mage bank chamber guardian
					|| id == 7240 // zeah wc guild perrys axe shop
			) {
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[0] = "Trade -";
			}

			if (id == 3248) { // wizard distentor
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[0] = "Teleport -";
			}

			if (id == 0) { // tool leprechaun
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[0] = "Talk-to";
				npcdef_1_.actions[2] = "Exchange";
				npcdef_1_.actions[3] = "Teleport";
			}

			if (id == 3231) { // ellis hide tanner
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[0] = "Tan hides -";
			}

			if (id == 5527) { // twiggy o korn achievements
				npcdef_1_.name = "Achievement O'Korn";
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[0] = "Talk-to";
				npcdef_1_.actions[2] = "Open list -";
				npcdef_1_.actions[3] = "Open shop -";
			}

			NpcComposite.field_z_465.method_z_void(npcdef_1_, id);
			npcdef = npcdef_1_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "gr.n()");
		}
		return npcdef;
	}

	int method_n_int(final Class_gg class_gg, final Class_gg class_gg_2_, final int i) {
		int i_3_;
		try {
			i_3_ = (((-1815249599 * class_gg.field_z_3003.field_y_3081) < (class_gg_2_.field_z_3003.field_y_3081
					* -1815249599)) ? -1
							: ((class_gg.field_z_3003.field_y_3081
									* -1815249599) == (class_gg_2_.field_z_3003.field_y_3081 * -1815249599)) ? 0 : 1);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "gr.n()");
		}
		return i_3_;
	}

	@Override
	public int compare(final Object object, final Object object_4_) {
		int i;
		try {
			i = method_n_int((Class_gg) object, (Class_gg) object_4_, -1570217209);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "gr.compare()");
		}
		return i;
	}

	@Override
	public boolean equals(final Object object) {
		boolean bool;
		try {
			bool = super.equals(object);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "gr.equals()");
		}
		return bool;
	}
}
