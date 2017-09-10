/* Class_ex - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Build {
	
	static final Build LIVE = new Build("LIVE", 0);
	static final Build BUILD_LIVE = new Build("BUILDLIVE", 3);
	final int id;
	static final Build WIP = new Build("WIP", 2); 
	static final Build RC = new Build("RC", 1);
	public final String type; 
	public static final int field_ej_2258 = 121;

	Build(final String string, final int i) {
		type = string;
		id = i * 665546361;
	}
}
