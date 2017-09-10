
/* InterfacePositionNode - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;
import java.util.Date;

public class Menu extends Node {
	static final int field_s_1533 = 2340;
	int field_d_1534;
	boolean field_z_1535 = false;
	static final int field_y_1536 = 4; 
	static int[] field_v_1537;
	static int cameraX;
	static Class_es field_cz_1539;
	static final int field_j_1540 = 18;
	int interfaceId;
	static Class_es field_ay_1542;
	static Widget field_im_1543;

	static ClientScript getClientScript(final int id) {
		ClientScript script = (ClientScript) ClientScript.field_n_838.method_n_gb(id);
		if (script != null) {
			return script;
		}
		final byte[] data = Class_gh.cs2Index.getArchive(id, 0);
		if (data == null) {
			return null;
		}
		script = new ClientScript();
		final Buffer rsbytebuffer = new Buffer(data);
		rsbytebuffer.position = (rsbytebuffer.buffer.length - 12) * -685856689;
		final int i_2_ = rsbytebuffer.getInt();
		script.intLen = rsbytebuffer.getShort() * -353966995;
		script.strLen = rsbytebuffer.getShort() * -26961485;
		script.field_f_835 = rsbytebuffer.getShort() * 2031267371;
		script.field_m_837 = rsbytebuffer.getShort() * -1299787017;
		rsbytebuffer.position = 0;
		rsbytebuffer.method_i_String(-2147483648);
		script.instructions = new int[i_2_];
		script.intOp = new int[i_2_];
		script.strings = new String[i_2_];
		int i_3_ = 0;
		// System.out.println("Script "+id+" -> ");
		while ((-1485345105 * rsbytebuffer.position) < (rsbytebuffer.buffer.length - 12)) {// this
																							// method
																							// sets
																							// up
																							// the
																							// cs2
																							// stack
			final int i_4_ = rsbytebuffer.getShort();
			// System.out.println("I4: " + i_4_);
			// if (script.strings[i_3_].contains("286,764")) {
			// System.out.println("Found");
			// }
			if (i_4_ == 3) {
				script.strings[i_3_] = rsbytebuffer.getString();
				if (script.strings[i_3_].equals("World ")) {
					script.strings[i_3_] = "                                      World ";
				}
				if (script.strings[i_3_].equals("Offline")) {
					script.strings[i_3_] = "                                     Offline";
				}
			} else if ((i_4_ < 100) && (i_4_ != 21) && (i_4_ != 38) && (i_4_ != 39)) {
				script.intOp[i_3_] = rsbytebuffer.getInt();
			} else {
				script.intOp[i_3_] = rsbytebuffer.get();
				// System.out.println(script.intOp[i_3_]);
			}
			script.instructions[i_3_++] = i_4_;
		}
		// System.out.println("end");
		ClientScript.field_n_838.method_z_void(script, id);
		return script;
	}

	static String method_cm_String(String string, final Widget widget, final byte i) {
		String string_5_;
		try {
			if (string.indexOf("%") != -1) {
				for (int i_6_ = 1; i_6_ <= 5; i_6_++) {
					for (;;) {
						final int i_7_ = string.indexOf(new StringBuilder("%").append(i_6_).toString());
						if (i_7_ == -1) {
							break;
						}
						final String string_8_ = string.substring(0, i_7_);
						final int i_9_ = Friend.method_dj_int(widget, i_6_ - 1, -1038502530);
						String string_10_;
						if (i_9_ < 999999999) {
							string_10_ = Integer.toString(i_9_);
						} else {
							string_10_ = "*";
						}
						string = new StringBuilder(string_8_).append(string_10_).append(string.substring(i_7_ + 2))
								.toString();
					}
				}
				for (;;) {
					final int i_11_ = string.indexOf("%dns");
					if (i_11_ == -1) {
						break;
					}
					String string_12_ = "";
					if (client.field_an_2713 != null) {
						string_12_ = GameMessage.method_n_String((client.field_an_2713.field_f_2219), -2132822638);
						if (client.field_an_2713.field_a_2213 != null) {
							string_12_ = (String) client.field_an_2713.field_a_2213;
						}
					}
					string = new StringBuilder(string.substring(0, i_11_)).append(string_12_)
							.append(string.substring(4 + i_11_)).toString();
				}
			}
			string_5_ = string;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "y.cm()");
		}
		return string_5_;
	}

	private static final String[][] WORLD_LIST = new String[][] {

			{ Settings.IP, ClientLoaderOLD.NAME + " Economy" },
			{ Settings.IP, ClientLoaderOLD.NAME + " Development" } };

	static World world = new World();

	public static final void writeWorldList() {
		try {
			RandomAccessFile raf = new RandomAccessFile(new File("C:/worldlist.ws"), "rw");
			int worlds = 2;// 2
			int length = 11 * WORLD_LIST.length;
			for (String[] info : WORLD_LIST) {
				length += info[0].length() + info.length;
				length += info[1].length();

			}

			raf.writeInt(length);
			raf.writeShort(worlds);
			for (int i = 0; i < worlds; i++) {
				raf.writeShort(i + 1);// world id 1
				raf.writeInt(0x1);// mask trying to get writeString method
				writeString(WORLD_LIST[i][0], raf);// o ye
				writeString(WORLD_LIST[i][1], raf);
				raf.writeByte(0); // country
				raf.writeShort(1);// players
			}
			raf.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void writeString(String string, RandomAccessFile raf) throws IOException {
		raf.write(string.getBytes());
		raf.writeByte(0);
	}

	@SuppressWarnings("unused")
	private static boolean called = true;

	static boolean method_n_boolean(final int i) {
		do {
			try {
				try {
					// writeWorldList();

					if (Class_fp.field_h_2429 == null) {
						Class_fp.field_h_2429 = new Class_s(SpotAnim.daemon, new URL(ItemContainer.WORLD_LIST_URL));
						break;
					}
					final byte[] data = Class_fp.field_h_2429.getWorldList();
					if (data == null) {
						break;
					}
					final Buffer buffer = new Buffer(data);
					World.totalWorlds = buffer.getShort() * -1000751183;
					World.worlds = new World[World.totalWorlds * 1998006609];
					for (int i_13_ = 0; i_13_ < (World.totalWorlds * 1998006609); i_13_++) {
						final World world = World.worlds[i_13_] = new World();
						world.id = (buffer.getShort() * 1597132653);
						world.mask = (buffer.getInt() * 1507407349);
						world.address = buffer.getString();
						world.activity = buffer.getString();
						world.country = buffer.get() * 712333125;
						world.players = buffer.getShort((byte) 8) * 285017275;
						world.field_j_1404 = i_13_ * -275918915;
					}
					VarpBit.method_z_void(World.worlds, 0, World.worlds.length - 1, World.field_a_1394,
							World.field_m_1393);
					Class_fp.field_h_2429 = null;
				} catch (final Exception exception) {
					exception.printStackTrace();
					Class_fp.field_h_2429 = null;
					break;
				}
				return true;
			} catch (final RuntimeException runtimeexception) {
				throw GameCanvas.error(runtimeexception, "y.n()");
			}
		} while (false);
		return false;
	}

	static void handleCS2Script(final Script script, final int i) {
		try {
			final Object[] parameters = script.parameters;
			final int i_15_ = ((Integer) parameters[0]).intValue();
			ClientScript cscript = getClientScript(i_15_);
			if (cscript != null) {
				int position = 0;
				int i_17_ = 0;
				int opcode = -1;
				int[] insn = cscript.instructions;
				int[] iop = cscript.intOp;
				int instruction = -1;
				Class_ab.field_a_20 = 0;
				try {
					Class_ab.cs2Integers = (new int[-979319451 * cscript.intLen]);
					int numIndex = 0;
					Item.cs2Strings = (new String[cscript.strLen * -997474949]);
					int strIndex = 0;
					for (int index = 1; index < parameters.length; index++) {
						if (parameters[index] instanceof Integer) {
							int param = ((Integer) parameters[index]).intValue();
							if (param == -2147483647) {
								param = (script.field_y_1198 * -410422657);
							}
							if (-2147483646 == param) {
								param = (-1830052233 * script.field_e_1196);
							}
							if (-2147483645 == param) {
								param = (script.parent != null ? -560181405 * (script.parent.uid) : -1);
							}
							if (-2147483644 == param) {
								param = (-1301973517 * script.field_g_1197);
							}
							if (param == -2147483643) {
								param = (script.parent != null ? (script.parent.field_k_2544) * -2038048459 : -1);
							}
							if (param == -2147483642) {
								param = (script.field_f_1195 != null ? -560181405 * (script.field_f_1195.uid) : -1);
							}
							if (param == -2147483641) {
								param = (script.field_f_1195 != null ? -2038048459 * (script.field_f_1195.field_k_2544)
										: -1);
							}
							if (param == -2147483640) {
								param = (-2090819967 * script.keyCode);
							}
							if (param == -2147483639) {
								param = (script.keyChar * -2106709251);
							}
							Class_ab.cs2Integers[numIndex++] = param;
						} else if (parameters[index] instanceof String) {
							String string = (String) parameters[index];
							if (string.equals("event_opbase"))
								string = script.field_h_1201;
							Item.cs2Strings[strIndex++] = string;
						}
					}
					int i_25_ = 0;
					Class_ab.field_x_16 = 1510199735 * script.field_l_1206;
					while_3_: for (;;) {
						if (++i_25_ > i) {
							throw new RuntimeException();
						}
						instruction = insn[++opcode];
						if (instruction < 100) {
							if (instruction == 0) {
								Class_ab.intStack[position++] = iop[opcode];
								// System.out.println(Class_ab.intStack[position
								// - 1]);
								continue;
							}
							if (instruction == 1) {
								final int i_26_ = iop[opcode];
								Class_ab.intStack[position++] = Class_fv.configs[i_26_];
								// System.out.println("Config : "+i_26_+",
								// "+Class_ab.intStack[position - 1]);
								continue;
							}
							if (instruction == 2) {
								final int i_27_ = iop[opcode];
								Class_fv.configs[i_27_] = Class_ab.intStack[--position];
								Class_cw.handleConfig(i_27_);
								continue;
							}
							if (instruction == 3) {
								Class_ab.strStack[i_17_++] = cscript.strings[opcode];
								continue;
							}
							if (instruction == 6) {
								opcode += iop[opcode];
								continue;
							}
							if (instruction == 7) {
								position -= 2;
								if (Class_ab.intStack[position] != Class_ab.intStack[1 + position]) {
									opcode += iop[opcode];
								}
								continue;
							}
							if (instruction == 8) {
								position -= 2;
								if (Class_ab.intStack[position + 1] == Class_ab.intStack[position]) {
									opcode += iop[opcode];
								}
								continue;
							}
							if (instruction == 9) {
								position -= 2;
								if (Class_ab.intStack[position] < Class_ab.intStack[1 + position]) {
									opcode += iop[opcode];
								}
								continue;
							}
							if (instruction == 10) {
								position -= 2;
								if (Class_ab.intStack[position] > Class_ab.intStack[1 + position]) {
									opcode += iop[opcode];
								}
								continue;
							}
							if (instruction == 21) {
								if ((-941111507 * Class_ab.field_a_20) != 0) {
									final Class_k class_k = (Class_ab.field_h_21[((Class_ab.field_a_20 -= -67952475)
											* -941111507)]);
									cscript = class_k.field_n_1128;
									insn = cscript.instructions;
									iop = cscript.intOp;
									opcode = (class_k.field_d_1124 * 137024579);
									Class_ab.cs2Integers = class_k.field_z_1127;
									Item.cs2Strings = class_k.field_y_1126;
								} else {
									return;
								}
								continue;
							}
							if (instruction == 25) {
								final int i_28_ = iop[opcode];
								Class_ab.intStack[position++] = Class_s.method_n_int(i_28_, (byte) -63);
								continue;
							}
							if (instruction == 27) {
								final int op = iop[opcode];
								int value = Class_ab.intStack[--position];
								final VarpBit class_aq = Class_de.getVarpBit(op);
								final int cfg = -1163604713 * class_aq.config;
								final int least = -376031909 * class_aq.leastSignificant;
								final int most = 1426513595 * class_aq.mostSignificant;
								int i_34_ = Class_fv.field_n_2508[most - least];
								if ((value < 0) || (value > i_34_)) {
									value = 0;
								}
								i_34_ <<= least;
								Class_fv.configs[cfg] = ((Class_fv.configs[cfg] & (i_34_ ^ 0xffffffff))
										| ((value << least) & i_34_));
								continue;
							}
							if (instruction == 31) {// LTE
								position -= 2;
								if (Class_ab.intStack[position] <= Class_ab.intStack[position + 1]) {
									opcode += iop[opcode];
								}
								continue;
							}
							if (instruction == 32) { // GTE
								position -= 2;
								if (Class_ab.intStack[position] >= Class_ab.intStack[1 + position]) {
									opcode += iop[opcode];
								}
								continue;
							}
							if (instruction == 33) {
								Class_ab.intStack[position++] = Class_ab.cs2Integers[iop[opcode]];
								continue;
							}
							if (instruction == 34) {
								Class_ab.cs2Integers[iop[opcode]] = Class_ab.intStack[--position];
								continue;
							}
							if (instruction == 35) {
								Class_ab.strStack[i_17_++] = Item.cs2Strings[iop[opcode]];
								continue;
							}
							if (instruction == 36) {
								Item.cs2Strings[iop[opcode]] = Class_ab.strStack[--i_17_];
								continue;
							}
							if (instruction == 37) {
								final int i_35_ = iop[opcode];
								i_17_ -= i_35_;
								final String[] strings = Class_ab.strStack;
								String string;
								if (i_35_ == 0) {
									string = "";
								} else if (i_35_ == 1) {
									final String string_36_ = strings[i_17_];
									if (string_36_ == null) {
										string = "null";
									} else {
										string = string_36_.toString();
									}
								} else {
									final int i_37_ = i_35_ + i_17_;
									int i_38_ = 0;
									for (int i_39_ = i_17_; i_39_ < i_37_; i_39_++) {
										final String string_40_ = strings[i_39_];
										if (string_40_ == null) {
											i_38_ += 4;
										} else {
											i_38_ += string_40_.length();
										}
									}
									final StringBuilder stringbuilder = new StringBuilder(i_38_);
									for (int i_41_ = i_17_; i_41_ < i_37_; i_41_++) {
										final String string_42_ = strings[i_41_];
										if (string_42_ == null) {
											stringbuilder.append("null");
										} else {
											stringbuilder.append((CharSequence) string_42_);
										}
									}
									string = stringbuilder.toString();
								}
								final String string_43_ = string;
								Class_ab.strStack[i_17_++] = string_43_;
								continue;
							}
							if (instruction == 38) {
								position--;
								continue;
							}
							if (instruction == 39) {
								i_17_--;
								continue;
							}
							if (instruction == 40) {
								final int i_44_ = iop[opcode];
								final ClientScript class_c_45_ = getClientScript(i_44_);
								final int[] is_46_ = (new int[-979319451 * (class_c_45_.intLen)]);
								final String[] strings = (new String[-997474949 * (class_c_45_.strLen)]);
								for (int i_47_ = 0; (i_47_ < (class_c_45_.field_f_835 * 650289283)); i_47_++) {
									is_46_[i_47_] = (Class_ab.intStack[((position
											- (650289283 * (class_c_45_.field_f_835))) + i_47_)]);
								}
								for (int i_48_ = 0; (i_48_ < (687574727 * (class_c_45_.field_m_837))); i_48_++) {
									strings[i_48_] = (Class_ab.strStack[(i_17_
											- ((class_c_45_.field_m_837) * 687574727)) + i_48_]);
								}
								position -= (class_c_45_.field_f_835 * 650289283);
								i_17_ -= (class_c_45_.field_m_837 * 687574727);
								final Class_k class_k = new Class_k();
								class_k.field_n_1128 = cscript;
								class_k.field_d_1124 = -481224597 * opcode;
								class_k.field_z_1127 = Class_ab.cs2Integers;
								class_k.field_y_1126 = Item.cs2Strings;
								Class_ab.field_h_21[((Class_ab.field_a_20 += -67952475) * -941111507) - 1] = class_k;
								cscript = class_c_45_;
								insn = cscript.instructions;
								iop = cscript.intOp;
								opcode = -1;
								Class_ab.cs2Integers = is_46_;
								Item.cs2Strings = strings;
								continue;
							}
							if (instruction == 42) {
								Class_ab.intStack[position++] = client.field_kd_2885[iop[opcode]];
								continue;
							}
							if (instruction == 43) {
								client.field_kd_2885[iop[opcode]] = Class_ab.intStack[--position];
								continue;
							}
							if (instruction == 44) {
								final int i_49_ = iop[opcode] >> 16;
								final int i_50_ = iop[opcode] & 0xffff;
								final int i_51_ = Class_ab.intStack[--position];
								if ((i_51_ < 0) || (i_51_ > 5000)) {
									throw new RuntimeException();
								}
								Class_ab.field_e_29[i_49_] = i_51_;
								int i_52_ = -1;
								if (i_50_ == 105) {
									i_52_ = 0;
								}
								for (int i_53_ = 0; i_53_ < i_51_; i_53_++) {
									Class_ab.field_g_17[i_49_][i_53_] = i_52_;
								}
								continue;
							}
							if (instruction == 45) {
								final int i_54_ = iop[opcode];
								final int i_55_ = Class_ab.intStack[--position];
								if ((i_55_ < 0) || (i_55_ >= Class_ab.field_e_29[i_54_])) {
									throw new RuntimeException();
								}
								Class_ab.intStack[position++] = Class_ab.field_g_17[i_54_][i_55_];
								continue;
							}
							if (instruction == 46) {
								final int i_56_ = iop[opcode];
								position -= 2;
								final int i_57_ = Class_ab.intStack[position];
								if ((i_57_ < 0) || (i_57_ >= Class_ab.field_e_29[i_56_])) {
									throw new RuntimeException();
								}
								Class_ab.field_g_17[i_56_][i_57_] = Class_ab.intStack[position + 1];
								continue;
							}
							if (instruction == 47) {
								String string = client.field_kz_2779[iop[opcode]];
								if (string == null) {
									string = "null";
								}
								Class_ab.strStack[i_17_++] = string;
								continue;
							}
							if (instruction == 48) {
								client.field_kz_2779[iop[opcode]] = Class_ab.strStack[--i_17_];
								continue;
							}
						}
						boolean bool;
						if (iop[opcode] == 1) {
							bool = true;
						} else {
							bool = false;
						}
						if (instruction < 1000) {
							if (instruction == 100) {
								position -= 3;
								final int i_58_ = Class_ab.intStack[position];
								final int i_59_ = Class_ab.intStack[1 + position];
								final int i_60_ = Class_ab.intStack[2 + position];
								if (i_59_ == 0) {
									throw new RuntimeException();
								}
								final Widget widget = Class_en.getWidgetByUID(i_58_, (short) 10001);
								if (widget.components == null) {
									widget.components = new Widget[1 + i_60_];
								}
								if (widget.components.length <= i_60_) {
									final Widget[] widgets = new Widget[1 + i_60_];
									for (int component = 0; component < widget.components.length; component++) {
										widgets[component] = widget.components[component];
									}
									widget.components = widgets;
								}
								if ((i_60_ > 0) && (widget.components[i_60_ - 1] == null)) {
									throw new RuntimeException(
											new StringBuilder().append("").append(i_60_ - 1).toString());
								}
								final Widget widget_62_ = new Widget();
								widget_62_.type = i_59_ * 381451273;
								widget_62_.parentId = ((widget_62_.uid = 1 * widget.uid) * -2034174603);
								widget_62_.field_k_2544 = 1256091933 * i_60_;
								widget_62_.interactive = true;
								widget.components[i_60_] = widget_62_;
								if (bool) {
									GroundItem.field_u_169 = widget_62_;
								} else {
									Class_al.field_l_183 = widget_62_;
								}
								Daemon.method_dn_void(widget, (byte) 42);
								continue;
							}
							if (instruction == 101) {
								final Widget widget = (bool ? GroundItem.field_u_169 : Class_al.field_l_183);
								final Widget widget_63_ = Class_en.getWidgetByUID((widget.uid * -560181405),
										(short) 24406);
								widget_63_.components[(-2038048459 * widget.field_k_2544)] = null;
								Daemon.method_dn_void(widget_63_, (byte) -24);
								continue;
							}
							if (instruction == 102) {
								final Widget widget = Class_en.getWidgetByUID((Class_ab.intStack[--position]),
										(short) 3233);
								widget.components = null;
								Daemon.method_dn_void(widget, (byte) -12);
								continue;
							}
							if (instruction == 200) {
								position -= 2;
								final int i_64_ = Class_ab.intStack[position];
								final int i_65_ = Class_ab.intStack[position + 1];
								final Widget widget = Class_ge.method_z_fy(i_64_, i_65_, (byte) 8);
								if ((widget != null) && (i_65_ != -1)) {
									Class_ab.intStack[position++] = 1;
									if (bool) {
										GroundItem.field_u_169 = widget;
									} else {
										Class_al.field_l_183 = widget;
									}
								} else {
									Class_ab.intStack[position++] = 0;
								}
								continue;
							}
							if (instruction == 201) {
								final Widget widget = Class_en.getWidgetByUID((Class_ab.intStack[--position]),
										(short) 7428);
								if (widget != null) {
									Class_ab.intStack[position++] = 1;
									if (bool) {
										GroundItem.field_u_169 = widget;
									} else {
										Class_al.field_l_183 = widget;
									}
								} else {
									Class_ab.intStack[position++] = 0;
								}
								continue;
							}
						} else if (((instruction >= 1000) && (instruction < 1100))
								|| ((instruction >= 2000) && (instruction < 2100))) {
							int i_66_ = -1;
							Widget widget;
							if (instruction >= 2000) {
								instruction -= 1000;
								i_66_ = Class_ab.intStack[--position];
								widget = Class_en.getWidgetByUID(i_66_, (short) 15463);
							} else {
								widget = (bool ? GroundItem.field_u_169 : Class_al.field_l_183);
							}
							if (instruction == 1000) {
								position -= 4;
								widget.x = Class_ab.intStack[position] * 92497491;
								widget.y = (Class_ab.intStack[1 + position] * 1473849385);
								widget.field_s_2549 = (Class_ab.intStack[2 + position] * 1336778791);
								widget.field_v_2550 = (1794210161 * Class_ab.intStack[3 + position]);
								Daemon.method_dn_void(widget, (byte) 80);
								Class_dd.method_cp_void(widget, -685856689);
								if ((i_66_ != -1) && ((876728889 * widget.type) == 0)) {
									Class_bk.method_cg_void((Widget.widgets[i_66_ >> 16]), widget, false, -65892605);
								}
								continue;
							}
							if (instruction == 1001) {
								position -= 4;
								widget.width = 815176681 * Class_ab.intStack[position];
								widget.height = (531456857 * Class_ab.intStack[position + 1]);
								widget.field_c_2551 = (Class_ab.intStack[position + 2] * -1560126681);
								widget.field_p_2622 = (Class_ab.intStack[position + 3] * -1313646431);
								Daemon.method_dn_void(widget, (byte) 9);
								Class_dd.method_cp_void(widget, -685856689);
								if ((i_66_ != -1) && ((widget.type * 876728889) == 0)) {
									Class_bk.method_cg_void((Widget.widgets[i_66_ >> 16]), widget, false, -1466325480);
								}
								continue;
							}
							if (instruction == 1003) {
								final boolean bool_67_ = Class_ab.intStack[--position] == 1;
								if (widget.isHidden != bool_67_) {
									widget.isHidden = bool_67_;
									Daemon.method_dn_void(widget, (byte) -36);
								}
								continue;
							}
							if (instruction == 1005) {
								widget.field_ex_2620 = Class_ab.intStack[--position] == 1;
								continue;
							}
						} else if (((instruction >= 1100) && (instruction < 1200))
								|| ((instruction >= 2100) && (instruction < 2200))) {
							int i_68_ = -1;
							Widget widget;
							if (instruction >= 2000) {
								instruction -= 1000;
								i_68_ = Class_ab.intStack[--position];
								widget = Class_en.getWidgetByUID(i_68_, (short) 7446);
							} else {
								widget = (bool ? GroundItem.field_u_169 : Class_al.field_l_183);
							}
							if (instruction == 1100) {
								position -= 2;
								widget.field_ab_2565 = -937249833 * Class_ab.intStack[position];
								if ((widget.field_ab_2565 * 440856551) > ((widget.field_ac_2567 * -450552547)
										- (widget.onScreenWidth * 1367496319))) {
									widget.field_ab_2565 = ((-345982373 * widget.field_ac_2567)
											- (widget.onScreenWidth * 1271886249));
								}
								if ((440856551 * widget.field_ab_2565) < 0) {
									widget.field_ab_2565 = 0;
								}
								widget.verticalScrollPos = (Class_ab.intStack[position + 1] * -1907925241);
								if ((-854204745 * widget.verticalScrollPos) > ((widget.field_az_2568 * 2133987947)
										- (widget.onScreenHeight * -1643237919))) {
									widget.verticalScrollPos = ((-2065615379 * widget.field_az_2568)
											- (483442727 * widget.onScreenHeight));
								}
								if ((-854204745 * widget.verticalScrollPos) < 0) {
									widget.verticalScrollPos = 0;
								}
								Daemon.method_dn_void(widget, (byte) -13);
								continue;
							}
							if (instruction == 1101) {
								widget.field_at_2617 = (Class_ab.intStack[--position] * 1917719447);
								Daemon.method_dn_void(widget, (byte) 17);
								continue;
							}
							if (instruction == 1102) {
								widget.field_ai_2573 = Class_ab.intStack[--position] == 1;
								Daemon.method_dn_void(widget, (byte) -71);
								continue;
							}
							if (instruction == 1103) {
								widget.alpha = (Class_ab.intStack[--position] * -521870011);
								Daemon.method_dn_void(widget, (byte) 65);
								continue;
							}
							if (instruction == 1104) {
								widget.field_aq_2654 = Class_ab.intStack[--position] * -78721693;
								Daemon.method_dn_void(widget, (byte) -8);
								continue;
							}
							if (instruction == 1105) {
								widget.disabledSpriteId = (Class_ab.intStack[--position] * -1581632181);
								Daemon.method_dn_void(widget, (byte) 101);
								continue;
							}
							if (instruction == 1106) {
								widget.field_ag_2579 = Class_ab.intStack[--position] * 384222729;
								Daemon.method_dn_void(widget, (byte) -10);
								continue;
							}
							if (instruction == 1107) {
								widget.field_ap_2580 = Class_ab.intStack[--position] == 1;
								Daemon.method_dn_void(widget, (byte) 89);
								continue;
							}
							if (instruction == 1108) {
								widget.mediaType = 1215472543;
								widget.mediaId = (Class_ab.intStack[--position] * 1030350029);
								Daemon.method_dn_void(widget, (byte) -46);
								continue;
							}
							if (instruction == 1109) {
								position -= 6;
								widget.field_bd_2591 = 296936143 * Class_ab.intStack[position];
								widget.field_bn_2641 = (-2114506549 * Class_ab.intStack[1 + position]);
								widget.field_bu_2670 = (584534109 * Class_ab.intStack[2 + position]);
								widget.field_bq_2590 = (Class_ab.intStack[position + 3] * 1360083929);
								widget.field_bp_2595 = (-1572194549 * Class_ab.intStack[4 + position]);
								widget.field_bt_2596 = (Class_ab.intStack[5 + position] * 1396515701);
								Daemon.method_dn_void(widget, (byte) -45);
								continue;
							}
							if (instruction == 1110) {
								final int i_69_ = Class_ab.intStack[--position];
								if (i_69_ != (widget.field_ba_2589 * 793412913)) {
									widget.field_ba_2589 = 931705809 * i_69_;
									widget.field_eq_2664 = 0;
									widget.field_en_2665 = 0;
									Daemon.method_dn_void(widget, (byte) 16);
								}
								continue;
							}
							if (instruction == 1111) {
								widget.field_bg_2668 = Class_ab.intStack[--position] == 1;
								Daemon.method_dn_void(widget, (byte) -35);
								continue;
							}
							if (instruction == 1112) {
								final String string = Class_ab.strStack[--i_17_];
								if (!string.equals(widget.defaultText)) {
									widget.defaultText = string;
									Daemon.method_dn_void(widget, (byte) 122);
								}
								continue;
							}
							if (instruction == 1113) {// change widget font
								widget.field_bh_2601 = Class_ab.intStack[--position] * 488789145;
								Daemon.method_dn_void(widget, (byte) -55);
								continue;
							}
							if (instruction == 1114) {
								position -= 3;
								widget.field_bx_2605 = Class_ab.intStack[position] * -909926385;
								widget.field_bc_2606 = (Class_ab.intStack[position + 1] * -1542011721);
								widget.field_bi_2604 = (Class_ab.intStack[2 + position] * 1887238417);
								Daemon.method_dn_void(widget, (byte) -4);
								continue;
							}
							if (instruction == 1115) {
								widget.field_be_2647 = Class_ab.intStack[--position] == 1;
								Daemon.method_dn_void(widget, (byte) 12);
								continue;
							}
							if (instruction == 1116) {
								widget.field_af_2581 = (Class_ab.intStack[--position] * -1940676927);
								Daemon.method_dn_void(widget, (byte) -10);
								continue;
							}
							if (instruction == 1117) {
								widget.field_au_2582 = Class_ab.intStack[--position] * -52053961;
								Daemon.method_dn_void(widget, (byte) 28);
								continue;
							}
							if (instruction == 1118) {
								widget.field_av_2583 = Class_ab.intStack[--position] == 1;
								Daemon.method_dn_void(widget, (byte) 24);
								continue;
							}
							if (instruction == 1119) {
								widget.field_bs_2584 = Class_ab.intStack[--position] == 1;
								Daemon.method_dn_void(widget, (byte) 2);
								continue;
							}
							if (instruction == 1120) {
								position -= 2;
								widget.field_ac_2567 = -320303819 * Class_ab.intStack[position];
								widget.field_az_2568 = (1355221571 * Class_ab.intStack[1 + position]);
								Daemon.method_dn_void(widget, (byte) -22);
								if ((i_68_ != -1) && ((widget.type * 876728889) == 0)) {
									Class_bk.method_cg_void((Widget.widgets[i_68_ >> 16]), widget, false, -1806982743);
								}
								continue;
							}
							if (instruction == 1121) {
								Class_ge.method_cn_void(widget.uid * -560181405, -2038048459 * widget.field_k_2544,
										2076054665);
								client.field_jd_2762 = widget;
								Daemon.method_dn_void(widget, (byte) 46);
								continue;
							}
							if (instruction == 1122) {
								position -= 1;
								widget.field_ac_2567 = Class_ab.intStack[position] * -1218445549;
								Daemon.method_dn_void(widget, (byte) 46);
								continue;
							}
						} else if (((instruction >= 1200) && (instruction < 1300))
								|| ((instruction >= 2200) && (instruction < 2300))) {
							Widget widget;
							if (instruction >= 2000) {
								instruction -= 1000;
								widget = Class_en.getWidgetByUID((Class_ab.intStack[--position]), (short) 6111);
							} else {
								widget = (bool ? GroundItem.field_u_169 : Class_al.field_l_183);
							}
							Daemon.method_dn_void(widget, (byte) 68);
							if ((instruction == 1200) || (instruction == 1205) || (instruction == 1212)) {
								position -= 2;
								final int i_70_ = Class_ab.intStack[position];
								final int i_71_ = Class_ab.intStack[1 + position];
								widget.itemId = i_70_ * 1368818521;
								widget.field_ek_2663 = i_71_ * -1280327945;
								final ItemComposite itemdef = ItemDefinitions.getItemComposite(i_70_);
								widget.field_bu_2670 = 1466122583 * itemdef.xan2d;
								widget.field_bq_2590 = 1771307895 * itemdef.yan2d;
								widget.field_bp_2595 = itemdef.zan2d * 1002987503;
								widget.field_bd_2591 = 215587999 * itemdef.xOf2d;
								widget.field_bn_2641 = itemdef.yOf2d * 25019051;
								widget.field_bt_2596 = -1996568661 * itemdef.field_v_120;
								if (instruction == 1205) {
									widget.field_bv_2600 = 0;
								} else if ((instruction == 1212) | ((1537303969 * itemdef.stackable) == 1)) {
									widget.field_bv_2600 = 1720055021;
								} else {
									widget.field_bv_2600 = -854857254;
								}
								if ((widget.field_bz_2637 * -20011083) > 0) {
									widget.field_bt_2596 = (1396515701 * ((widget.field_bt_2596 * -1345676384)
											/ (-20011083 * widget.field_bz_2637)));
								} else if ((widget.width * 1744956505) > 0) {
									widget.field_bt_2596 = (1396515701
											* ((widget.field_bt_2596 * -1345676384) / (1744956505 * widget.width)));
								}
								continue;
							}
							if (instruction == 1201) {
								widget.mediaType = -1864022210;
								widget.mediaId = (Class_ab.intStack[--position] * 1030350029);
								continue;
							}
							if (instruction == 1202) {
								widget.mediaType = -648549667;
								widget.mediaId = (Class_ci.myPlayer.composite.method_a_int((short) 2400) * 1030350029);
								continue;
							}
						} else if (((instruction >= 1300) && (instruction < 1400))
								|| ((instruction >= 2300) && (instruction < 2400))) {
							Widget widget;
							if (instruction >= 2000) {
								instruction -= 1000;
								widget = Class_en.getWidgetByUID((Class_ab.intStack[--position]), (short) 12028);
							} else {
								widget = (bool ? GroundItem.field_u_169 : Class_al.field_l_183);
							}
							if (instruction == 1300) {
								final int i_72_ = Class_ab.intStack[--position] - 1;
								if ((i_72_ < 0) || (i_72_ > 9)) {
									i_17_--;
								} else {
									widget.method_j_void(i_72_, (Class_ab.strStack[--i_17_]), 630777305);
								}
								continue;
							}
							if (instruction == 1301) {
								position -= 2;
								final int i_73_ = Class_ab.intStack[position];
								final int i_74_ = Class_ab.intStack[position + 1];
								widget.root = Class_ge.method_z_fy(i_73_, i_74_, (byte) -11);
								continue;
							}
							if (instruction == 1302) {
								widget.field_ce_2672 = Class_ab.intStack[--position] == 1;
								continue;
							}
							if (instruction == 1303) {
								widget.field_cn_2618 = Class_ab.intStack[--position] * 879151757;
								continue;
							}
							if (instruction == 1304) {
								widget.field_cf_2619 = (Class_ab.intStack[--position] * -528271109);
								continue;
							}
							if (instruction == 1305) {
								widget.interactionOption = Class_ab.strStack[--i_17_];
								continue;
							}
							if (instruction == 1306) {
								widget.field_cc_2673 = Class_ab.strStack[--i_17_];
								continue;
							}
							if (instruction == 1307) {
								widget.actions = null;
								continue;
							}
						} else {
							if (((instruction >= 1400) && (instruction < 1500))
									|| ((instruction >= 2400) && (instruction < 2500))) {
								Widget widget;
								if (instruction >= 2000) {
									instruction -= 1000;
									widget = Class_en.getWidgetByUID((Class_ab.intStack[--position]), (short) 11576);
								} else {
									widget = (bool ? GroundItem.field_u_169 : Class_al.field_l_183);
								}
								String string = Class_ab.strStack[--i_17_];
								int[] is_75_ = null;
								if ((string.length() > 0) && (string.charAt(string.length() - 1) == 'Y')) {
									int i_76_ = Class_ab.intStack[--position];
									if (i_76_ > 0) {
										is_75_ = new int[i_76_];
										while (i_76_-- > 0) {
											is_75_[i_76_] = Class_ab.intStack[--position];
										}
									}
									string = string.substring(0, (string.length() - 1));
								}
								Object[] objects_77_ = new Object[string.length() + 1];
								for (int i_78_ = objects_77_.length - 1; i_78_ >= 1; i_78_--) {
									if (string.charAt(i_78_ - 1) == 's') {
										objects_77_[i_78_] = Class_ab.strStack[--i_17_];
									} else {
										objects_77_[i_78_] = new Integer(Class_ab.intStack[--position]);
									}
								}
								final int i_79_ = Class_ab.intStack[--position];
								if (i_79_ != -1) {
									objects_77_[0] = new Integer(i_79_);
								} else {
									objects_77_ = null;
								}
								if (instruction == 1400) {
									widget.field_ch_2624 = objects_77_;
								}
								if (instruction == 1401) {
									widget.field_cm_2627 = objects_77_;
								}
								if (instruction == 1402) {
									widget.field_cy_2592 = objects_77_;
								}
								if (instruction == 1403) {
									widget.field_cd_2674 = objects_77_;
								}
								if (instruction == 1404) {
									widget.field_cp_2630 = objects_77_;
								}
								if (instruction == 1405) {
									widget.field_cg_2599 = objects_77_;
								}
								if (instruction == 1406) {
									widget.field_cl_2634 = objects_77_;
								}
								if (instruction == 1407) {
									widget.field_cs_2635 = objects_77_;
									widget.field_dt_2628 = is_75_;
								}
								if (instruction == 1408) {
									widget.field_di_2535 = objects_77_;
								}
								if (instruction == 1409) {
									widget.field_dl_2642 = objects_77_;
								}
								if (instruction == 1410) {
									widget.field_cr_2632 = objects_77_;
								}
								if (instruction == 1411) {
									widget.field_cx_2625 = objects_77_;
								}
								if (instruction == 1412) {
									widget.field_ci_2629 = objects_77_;
								}
								if (instruction == 1414) {
									widget.field_dj_2593 = objects_77_;
									widget.field_dg_2608 = is_75_;
								}
								if (instruction == 1415) {
									widget.field_do_2639 = objects_77_;
									widget.field_dy_2640 = is_75_;
								}
								if (instruction == 1416) {
									widget.field_ck_2633 = objects_77_;
								}
								if (instruction == 1417) {
									widget.field_dq_2613 = objects_77_;
								}
								if (instruction == 1418) {
									widget.field_dm_2644 = objects_77_;
								}
								if (instruction == 1419) {
									widget.field_dc_2594 = objects_77_;
								}
								if (instruction == 1420) {
									widget.field_dn_2646 = objects_77_;
								}
								if (instruction == 1421) {
									widget.field_df_2570 = objects_77_;
								}
								if (instruction == 1422) {
									widget.field_dk_2648 = objects_77_;
								}
								if (instruction == 1423) {
									widget.field_dr_2649 = objects_77_;
								}
								if (instruction == 1424) {
									widget.field_dw_2575 = objects_77_;
								}
								if (instruction == 1425) {
									widget.field_dd_2667 = objects_77_;
								}
								if (instruction == 1426) {
									widget.field_db_2653 = objects_77_;
								}
								if (instruction == 1427) {
									widget.field_da_2651 = objects_77_;
								}
								widget.scripted = true;
								continue;
							}
							if (instruction < 1600) {
								final Widget widget = (bool ? GroundItem.field_u_169 : Class_al.field_l_183);
								if (instruction == 1500) {
									Class_ab.intStack[position++] = widget.onScreenX * -948813497;
									continue;
								}
								if (instruction == 1501) {
									Class_ab.intStack[position++] = -1698637507 * widget.onScreenY;
									continue;
								}
								if (instruction == 1502) {
									Class_ab.intStack[position++] = 1367496319 * widget.onScreenWidth;
									continue;
								}
								if (instruction == 1503) {
									Class_ab.intStack[position++] = -1643237919 * widget.onScreenHeight;
									continue;
								}
								if (instruction == 1504) {
									Class_ab.intStack[position++] = widget.isHidden ? 1 : 0;
									continue;
								}
								if (instruction == 1505) {
									Class_ab.intStack[position++] = widget.parentId * -1405313417;
									continue;
								}
							} else if (instruction < 1700) {
								final Widget widget = (bool ? GroundItem.field_u_169 : Class_al.field_l_183);
								if (instruction == 1600) {
									Class_ab.intStack[position++] = 440856551 * widget.field_ab_2565;
									continue;
								}
								if (instruction == 1601) {
									Class_ab.intStack[position++] = (widget.verticalScrollPos * -854204745);
									continue;
								}
								if (instruction == 1602) {
									Class_ab.strStack[i_17_++] = widget.defaultText;
									continue;
								}
								if (instruction == 1603) {
									Class_ab.intStack[position++] = widget.field_ac_2567 * -450552547;
									continue;
								}
								if (instruction == 1604) {
									Class_ab.intStack[position++] = 2133987947 * widget.field_az_2568;
									continue;
								}
								if (instruction == 1605) {
									Class_ab.intStack[position++] = widget.field_bt_2596 * -42052387;
									continue;
								}
								if (instruction == 1606) {
									Class_ab.intStack[position++] = 646892533 * widget.field_bu_2670;
									continue;
								}
								if (instruction == 1607) {
									Class_ab.intStack[position++] = 457530531 * widget.field_bp_2595;
									continue;
								}
								if (instruction == 1608) {
									Class_ab.intStack[position++] = widget.field_bq_2590 * -1210215319;
									continue;
								}
								if (instruction == 1609) {
									Class_ab.intStack[position++] = widget.alpha * -1452546675;
									continue;
								}
							} else if (instruction < 1800) {
								final Widget widget = (bool ? GroundItem.field_u_169 : Class_al.field_l_183);
								if (instruction == 1700) {
									Class_ab.intStack[position++] = widget.itemId * 1464571113;
									continue;
								}
								if (instruction == 1701) {
									if ((1464571113 * widget.itemId) != -1) {
										Class_ab.intStack[position++] = (1425564359 * widget.field_ek_2663);
									} else {
										Class_ab.intStack[position++] = 0;
									}
									continue;
								}
								if (instruction == 1702) {
									Class_ab.intStack[position++] = widget.field_k_2544 * -2038048459;
									continue;
								}
							} else if (instruction < 1900) {
								final Widget widget = (bool ? GroundItem.field_u_169 : Class_al.field_l_183);
								if (instruction == 1800) {
									Class_ab.intStack[position++] = (WidgetNode
											.method_z_int((Class_db.method_en_int(widget, -1493490880)), -1977245782));
									continue;
								}
								if (instruction == 1801) {
									int i_80_ = Class_ab.intStack[--position];
									i_80_--;
									if ((widget.actions == null) || (i_80_ >= widget.actions.length)
											|| (widget.actions[i_80_] == null)) {
										Class_ab.strStack[i_17_++] = "";
									} else {
										Class_ab.strStack[i_17_++] = widget.actions[i_80_];
									}
									continue;
								}
								if (instruction == 1802) {
									if (widget.interactionOption == null) {
										Class_ab.strStack[i_17_++] = "";
									} else {
										Class_ab.strStack[i_17_++] = widget.interactionOption;
									}
									continue;
								}
							} else if (((instruction >= 1900) && (instruction < 2000))
									|| ((instruction >= 2900) && (instruction < 3000))) {
								Widget widget;
								if (instruction >= 2000) {
									instruction -= 1000;
									widget = Class_en.getWidgetByUID((Class_ab.intStack[--position]), (short) 6181);
								} else {
									widget = (bool ? GroundItem.field_u_169 : Class_al.field_l_183);
								}
								if (instruction == 1927) {
									if ((-1620392869 * Class_ab.field_x_16) >= 10) {
										throw new RuntimeException();
									}
									if (widget.field_da_2651 != null) {
										final Script class_n_81_ = new Script();
										class_n_81_.parent = widget;
										class_n_81_.parameters = widget.field_da_2651;
										class_n_81_.field_l_1206 = (-1207507259 + (Class_ab.field_x_16 * -1682646009));
										client.field_kp_2888.add(script);
									} else {
										return;
									}
									continue;
								}
							} else if (instruction < 2600) {
								final Widget widget = Class_en.getWidgetByUID((Class_ab.intStack[--position]),
										(short) 32598);
								if (instruction == 2500) {
									Class_ab.intStack[position++] = -948813497 * widget.onScreenX;
									continue;
								}
								if (instruction == 2501) {
									Class_ab.intStack[position++] = -1698637507 * widget.onScreenY;
									continue;
								}
								if (instruction == 2502) {
									Class_ab.intStack[position++] = 1367496319 * widget.onScreenWidth;
									continue;
								}
								if (instruction == 2503) {
									Class_ab.intStack[position++] = -1643237919 * widget.onScreenHeight;
									continue;
								}
								if (instruction == 2504) {
									Class_ab.intStack[position++] = widget.isHidden ? 1 : 0;
									continue;
								}
								if (instruction == 2505) {
									Class_ab.intStack[position++] = widget.parentId * -1405313417;
									continue;
								}
							} else if (instruction < 2700) {
								final Widget widget = Class_en.getWidgetByUID((Class_ab.intStack[--position]),
										(short) 24345);
								if (instruction == 2600) {
									Class_ab.intStack[position++] = widget.field_ab_2565 * 440856551;
									continue;
								}
								if (instruction == 2601) {
									Class_ab.intStack[position++] = (-854204745 * widget.verticalScrollPos);
									continue;
								}
								if (instruction == 2602) {
									Class_ab.strStack[i_17_++] = widget.defaultText;
									continue;
								}
								if (instruction == 2603) {
									Class_ab.intStack[position++] = -450552547 * widget.field_ac_2567;
									continue;
								}
								if (instruction == 2604) {
									Class_ab.intStack[position++] = widget.field_az_2568 * 2133987947;
									continue;
								}
								if (instruction == 2605) {
									Class_ab.intStack[position++] = -42052387 * widget.field_bt_2596;
									continue;
								}
								if (instruction == 2606) {
									Class_ab.intStack[position++] = 646892533 * widget.field_bu_2670;
									continue;
								}
								if (instruction == 2607) {
									Class_ab.intStack[position++] = widget.field_bp_2595 * 457530531;
									continue;
								}
								if (instruction == 2608) {
									Class_ab.intStack[position++] = -1210215319 * widget.field_bq_2590;
									continue;
								}
								if (instruction == 2609) {
									Class_ab.intStack[position++] = -1452546675 * widget.alpha;
									continue;
								}
							} else if (instruction < 2800) {
								if (instruction == 2700) {
									final Widget widget = Class_en.getWidgetByUID((Class_ab.intStack[--position]),
											(short) 9341);
									Class_ab.intStack[position++] = 1464571113 * widget.itemId;
									continue;
								}
								if (instruction == 2701) {
									final Widget widget = Class_en.getWidgetByUID((Class_ab.intStack[--position]),
											(short) 22747);
									if ((1464571113 * widget.itemId) != -1) {
										Class_ab.intStack[position++] = (1425564359 * widget.field_ek_2663);
									} else {
										Class_ab.intStack[position++] = 0;
									}
									continue;
								}
								if (instruction == 2702) {
									final int i_82_ = Class_ab.intStack[--position];
									final Menu interfacepositionnode = ((Menu) client.menuTable.method_n_ga(i_82_));
									if (interfacepositionnode != null) {
										Class_ab.intStack[position++] = 1;
									} else {
										Class_ab.intStack[position++] = 0;
									}
									continue;
								}
								if (instruction == 2706) {
									Class_ab.intStack[position++] = client.rootInterfaceId * -374264803;
									continue;
								}
							} else if (instruction < 2900) {
								final Widget widget = Class_en.getWidgetByUID((Class_ab.intStack[--position]),
										(short) 11196);
								if (instruction == 2800) {
									Class_ab.intStack[position++] = (WidgetNode
											.method_z_int((Class_db.method_en_int(widget, -1481855866)), -1977245782));
									continue;
								}
								if (instruction == 2801) {
									int i_83_ = Class_ab.intStack[--position];
									i_83_--;
									if ((widget.actions == null) || (i_83_ >= widget.actions.length)
											|| (widget.actions[i_83_] == null)) {
										Class_ab.strStack[i_17_++] = "";
									} else {
										Class_ab.strStack[i_17_++] = widget.actions[i_83_];
									}
									continue;
								}
								if (instruction == 2802) {
									if (widget.interactionOption == null) {
										Class_ab.strStack[i_17_++] = "";
									} else {
										Class_ab.strStack[i_17_++] = widget.interactionOption;
									}
									continue;
								}
							} else if (instruction < 3200) {
								if (instruction == 3100) {
									final String string = Class_ab.strStack[--i_17_];
									GameStub.sendMessage(0, "", string);
									continue;
								}
								if (instruction == 3101) {
									position -= 2;
									Vector3.animatePlayer(Class_ci.myPlayer, Class_ab.intStack[position],
											Class_ab.intStack[position + 1], (byte) -49);
									continue;
								}
								if (instruction == 3103) {
									client.encryptedBuffer.writeOpcode(199);
									for (Menu interfacepositionnode = ((Menu) client.menuTable
											.method_y_ga()); interfacepositionnode != null; interfacepositionnode = ((Menu) client.menuTable
													.method_e_ga())) {
										if (((1041023801 * (interfacepositionnode.field_d_1534)) == 0)
												|| ((1041023801 * (interfacepositionnode.field_d_1534)) == 3)) {
											client.method_db_void(interfacepositionnode, true);
										}
									}
									if (client.field_jd_2762 != null) {
										Daemon.method_dn_void(client.field_jd_2762, (byte) 24);
										client.field_jd_2762 = null;
									}
									continue;
								}
								if (instruction == 3104) {
									final String string = Class_ab.strStack[--i_17_];
									int i_84_ = 0;
									if (Ignore.method_d_boolean(string, (short) 16966)) {
										final int i_85_ = Class_w.method_y_int(string, 10, true, (byte) 42);
										i_84_ = i_85_;
									}
									client.encryptedBuffer.writeOpcode(64);
									client.encryptedBuffer.putInt(i_84_);
									continue;
								}
								if (instruction == 3105) {
									final String string = Class_ab.strStack[--i_17_];
									client.encryptedBuffer.writeOpcode(2);
									client.encryptedBuffer.put(string.length() + 1);
									client.encryptedBuffer.putNT0String(string, (byte) 71);
									continue;
								}
								if (instruction == 3106) {
									final String string = Class_ab.strStack[--i_17_];
									client.encryptedBuffer.writeOpcode(157);
									client.encryptedBuffer.put(string.length() + 1);
									client.encryptedBuffer.putNT0String(string, (byte) -61);
									continue;
								}
								if (instruction == 3107) {
									final int i_86_ = Class_ab.intStack[--position];
									final String string = Class_ab.strStack[--i_17_];
									Renderable.method_cw_void(i_86_, string, (byte) -115);
									continue;
								}
								if (instruction == 3108) {
									position -= 3;
									final int i_87_ = Class_ab.intStack[position];
									final int i_88_ = Class_ab.intStack[position + 1];
									final int i_89_ = Class_ab.intStack[2 + position];
									final Widget widget = Class_en.getWidgetByUID(i_89_, (short) 8473);
									Class_fl.method_dl_void(widget, i_87_, i_88_, 2120077844);
									continue;
								}
								if (instruction == 3109) {
									position -= 2;
									final int i_90_ = Class_ab.intStack[position];
									final int i_91_ = Class_ab.intStack[position + 1];
									final Widget widget = (bool ? GroundItem.field_u_169 : Class_al.field_l_183);
									Class_fl.method_dl_void(widget, i_90_, i_91_, 1500632328);
									continue;
								}
								if (instruction == 3110) {
									Class_al.field_aw_178 = Class_ab.intStack[--position] == 1;
									continue;
								}
								if (instruction == 3111) {
									Class_ab.intStack[position++] = (Class_w.field_pz_1501.hideRoofTops) ? 1 : 0;
									continue;
								}
								if (instruction == 3112) {
									Class_w.field_pz_1501.hideRoofTops = Class_ab.intStack[--position] == 1;
									Class_bh.method_z_void(-840141801);
									continue;
								}
								if (instruction == 3113) {
									final String string = Class_ab.strStack[--i_17_];
									final boolean bool_92_ = Class_ab.intStack[--position] == 1;
									GameObject.browseURL(string, bool_92_, false, -434578785);
									continue;
								}
								if (instruction == 3115) {
									final int i_93_ = Class_ab.intStack[--position];
									client.encryptedBuffer.writeOpcode(206);
									client.encryptedBuffer.putShort(i_93_);
									continue;
								}
							} else if (instruction < 3300) {
								if (instruction == 3200) {
									position -= 3;
									final int i_94_ = Class_ab.intStack[position];
									final int i_95_ = Class_ab.intStack[position + 1];
									final int i_96_ = Class_ab.intStack[position + 2];
									if (((1804964747 * client.field_ng_2929) != 0) && (i_95_ != 0)
											&& ((-1735289853 * client.field_nb_2931) < 50)) {
										client.field_nq_2932[(-1735289853 * client.field_nb_2931)] = i_94_;
										client.field_nx_2933[((client.field_nb_2931) * -1735289853)] = i_95_;
										client.field_nj_2967[((client.field_nb_2931) * -1735289853)] = i_96_;
										client.field_no_2936[((client.field_nb_2931) * -1735289853)] = null;
										client.field_nu_2935[((client.field_nb_2931) * -1735289853)] = 0;
										client.field_nb_2931 += -405227861;
									}
									continue;
								}
								if (instruction == 3201) {
									Socket.method_b_void((Class_ab.intStack[--position]), -613952308);
									continue;
								}
								if (instruction == 3202) {
									position -= 2;
									final int i_97_ = Class_ab.intStack[position];
									if (((client.field_ne_2926 * 1614344149) != 0) && (i_97_ != -1)) {
										Index.method_d_void(Class_gt.musicIndex2, i_97_, 0,
												1614344149 * client.field_ne_2926, false, 824045845);
										client.field_np_2928 = true;
									}
									continue;
								}
							} else if (instruction < 3400) {
								if (instruction == 3300) {
									Class_ab.intStack[position++] = client.currentCycle * 303796053;
									continue;
								}
								if (instruction == 3301) {
									position -= 2;
									final int i_99_ = Class_ab.intStack[position];
									final int i_100_ = Class_ab.intStack[1 + position];
									Class_ab.intStack[position++] = Class_dv.method_n_int(i_99_, i_100_, 1517315282);
									continue;
								}
								if (instruction == 3302) {
									position -= 2;
									final int i_101_ = Class_ab.intStack[position];
									final int i_102_ = Class_ab.intStack[position + 1];
									Class_ab.intStack[position++] = Class_cc.method_d_int(i_101_, i_102_, -1057386778);
									continue;
								}
								if (instruction == 3303) {
									position -= 2;
									final int i_103_ = Class_ab.intStack[position];
									final int i_104_ = Class_ab.intStack[1 + position];
									final int[] is_105_ = Class_ab.intStack;
									final int i_106_ = position++;
									final ItemContainer itemcontainer = ((ItemContainer) ItemContainer.itemContainerTable
											.method_n_ga(i_103_));
									int i_107_;
									if (itemcontainer == null) {
										i_107_ = 0;
									} else if (i_104_ == -1) {
										i_107_ = 0;
									} else {
										int i_108_ = 0;
										for (int i_109_ = 0; (i_109_ < itemcontainer.amts.length); i_109_++) {
											if (itemcontainer.ids[i_109_] == i_104_) {
												i_108_ += (itemcontainer.amts[i_109_]);
											}
										}
										i_107_ = i_108_;
									}
									is_105_[i_106_] = i_107_;
									continue;
								}
								if (instruction == 3304) {
									final int i_110_ = Class_ab.intStack[--position];
									final int[] is_111_ = Class_ab.intStack;
									final int i_112_ = position++;
									Class_am class_am = ((Class_am) Class_am.field_d_189.method_n_gb(i_110_));
									Class_am class_am_113_;
									if (class_am != null) {
										class_am_113_ = class_am;
									} else {
										final byte[] is_114_ = (Class_cw.field_n_1407.getArchive(5, i_110_));
										class_am = new Class_am();
										if (is_114_ != null) {
											class_am.method_n_void(new Buffer(is_114_), -960554005);
										}
										Class_am.field_d_189.method_z_void(class_am, i_110_);
										class_am_113_ = class_am;
									}
									is_111_[i_112_] = (-859437333 * class_am_113_.field_z_190);
									continue;
								}
								if (instruction == 3305) {
									final int i_115_ = Class_ab.intStack[--position];
									Class_ab.intStack[position++] = (client.playerStatsCurrentLevel[i_115_]);
									continue;
								}
								if (instruction == 3306) {
									final int i_116_ = Class_ab.intStack[--position];
									Class_ab.intStack[position++] = client.playerStatsLevel[i_116_];
									continue;
								}
								if (instruction == 3307) {
									final int i_117_ = Class_ab.intStack[--position];
									Class_ab.intStack[position++] = client.playerStatsExp[i_117_];
									continue;
								}
								if (instruction == 3308) {
									final int i_118_ = 250114511 * Class_ed.plane;
									final int i_119_ = (((-2103184911 * (Class_ci.myPlayer.worldPosX)) >> 7)
											+ (Class_q.originX * 1693061403));
									final int i_120_ = ((((Class_ci.myPlayer.worldPosY) * 2088773389) >> 7)
											+ (Class_gf.originY * -1593604783));
									Class_ab.intStack[position++] = ((i_119_ << 14) + (i_118_ << 28) + i_120_);
									continue;
								}
								if (instruction == 3309) {
									final int i_121_ = Class_ab.intStack[--position];
									Class_ab.intStack[position++] = (i_121_ >> 14) & 0x3fff;
									continue;
								}
								if (instruction == 3310) {
									final int i_122_ = Class_ab.intStack[--position];
									Class_ab.intStack[position++] = i_122_ >> 28;
									continue;
								}
								if (instruction == 3311) {
									final int i_123_ = Class_ab.intStack[--position];
									Class_ab.intStack[position++] = i_123_ & 0x3fff;
									continue;
								}
								if (instruction == 3312) {
									Class_ab.intStack[position++] = client.onMembersWorld ? 1 : 0;
									continue;
								}
								if (instruction == 3313) {
									position -= 2;
									final int i_124_ = 32768 + Class_ab.intStack[position];
									final int i_125_ = Class_ab.intStack[1 + position];
									Class_ab.intStack[position++] = Class_dv.method_n_int(i_124_, i_125_, 1517315282);
									continue;
								}
								if (instruction == 3314) {
									position -= 2;
									final int i_126_ = 32768 + Class_ab.intStack[position];
									final int i_127_ = Class_ab.intStack[1 + position];
									Class_ab.intStack[position++] = Class_cc.method_d_int(i_126_, i_127_, -1741891583);
									continue;
								}
								if (instruction == 3315) {
									position -= 2;
									final int i_128_ = 32768 + Class_ab.intStack[position];
									final int i_129_ = Class_ab.intStack[position + 1];
									final int[] is_130_ = Class_ab.intStack;
									final int i_131_ = position++;
									final ItemContainer itemcontainer = ((ItemContainer) ItemContainer.itemContainerTable
											.method_n_ga(i_128_));
									int i_132_;
									if (itemcontainer == null) {
										i_132_ = 0;
									} else if (i_129_ == -1) {
										i_132_ = 0;
									} else {
										int i_133_ = 0;
										for (int i_134_ = 0; (i_134_ < itemcontainer.amts.length); i_134_++) {
											if (i_129_ == itemcontainer.ids[i_134_]) {
												i_133_ += (itemcontainer.amts[i_134_]);
											}
										}
										i_132_ = i_133_;
									}
									is_130_[i_131_] = i_132_;
									continue;
								}
								if (instruction == 3316) {
									if ((client.myPermissions * -1069253877) >= 2) {
										Class_ab.intStack[position++] = (-1069253877 * client.myPermissions);
									} else {
										Class_ab.intStack[position++] = 0;
									}
									continue;
								}
								if (instruction == 3317) {
									Class_ab.intStack[position++] = client.field_ax_2703 * 1027594079;
									continue;
								}
								if (instruction == 3318) {
									Class_ab.intStack[position++] = client.currentWorld * 1536832127;
									continue;
								}
								if (instruction == 3321) {
									Class_ab.intStack[position++] = 158338671 * client.runEnergy;
									continue;
								}
								if (instruction == 3322) {
									Class_ab.intStack[position++] = -1702839345 * client.weight;
									continue;
								}
								if (instruction == 3323) {
									if (client.field_jq_2699) {
										Class_ab.intStack[position++] = 1;
									} else {
										Class_ab.intStack[position++] = 0;
									}
									continue;
								}
								if (instruction == 3324) {
									Class_ab.intStack[position++] = (-1483883627 * client.currentWorldMask);
									continue;
								}
							} else if (instruction < 3500) {
								if (instruction == 3400) {
									position -= 2;
									final int i_135_ = Class_ab.intStack[position];
									final int i_136_ = Class_ab.intStack[position + 1];
									Class_ay class_ay = ((Class_ay) Class_ay.field_d_450.method_n_gb(i_135_));
									Class_ay class_ay_137_;
									if (class_ay != null) {
										class_ay_137_ = class_ay;

									} else {
										final byte[] is_138_ = (Class_ay.field_n_459.getArchive(8, i_135_));
										class_ay = new Class_ay();
										if (is_138_ != null) {
											class_ay.method_n_void(new Buffer(is_138_), (byte) -6);
										}
										class_ay.field_f_462 = i_135_;
										Class_ay.field_d_450.method_z_void(class_ay, i_135_);
										class_ay_137_ = class_ay;
									}
									class_ay = class_ay_137_;
									if (class_ay.field_y_452 != 0) {
										/* empty */
									}
									for (int i_139_ = 0; (i_139_ < (class_ay.field_f_462 * -798271771)); i_139_++) {
										if (class_ay.field_m_456[i_139_] == i_136_) {
											Class_ab.strStack[i_17_++] = class_ay.field_h_458[i_139_];
											class_ay = null;
											break;
										}
									}
									if (class_ay != null) {
										Class_ab.strStack[i_17_++] = class_ay.field_e_453;
									}
									continue;
								}
								if (instruction == 3408) {
									position -= 4;
									final int i_140_ = Class_ab.intStack[position];
									final int i_141_ = Class_ab.intStack[position + 1];
									final int i_142_ = Class_ab.intStack[position + 2];
									final int i_143_ = Class_ab.intStack[3 + position];
									Class_ay class_ay = ((Class_ay) Class_ay.field_d_450.method_n_gb(i_142_));
									Class_ay class_ay_144_;
									if (class_ay != null) {
										class_ay_144_ = class_ay;
									} else {
										final byte[] is_145_ = (Class_ay.field_n_459.getArchive(8, i_142_));
										class_ay = new Class_ay();
										if (is_145_ != null) {
											class_ay.method_n_void(new Buffer(is_145_), (byte) -9);
										}
										Class_ay.field_d_450.method_z_void(class_ay, i_142_);
										class_ay_144_ = class_ay;
									}
									class_ay = class_ay_144_;
									if ((class_ay.field_z_451 != i_140_) || (i_141_ != class_ay.field_y_452)) {
										if (i_141_ == 115) {
											Class_ab.strStack[i_17_++] = "null";
										} else {
											Class_ab.intStack[position++] = 0;
										}
									} else {
										for (int i_146_ = 0; i_146_ < (class_ay.field_f_462 * -798271771); i_146_++) {
											if (class_ay.field_m_456[i_146_] == i_143_) {
												if (i_141_ == 115) {
													Class_ab.strStack[i_17_++] = (class_ay.field_h_458[i_146_]);
												} else {
													Class_ab.intStack[position++] = (class_ay.field_a_449[i_146_]);
												}
												class_ay = null;
												break;
											}
										}
										if (class_ay != null) {
											if (i_141_ == 115) {
												Class_ab.strStack[i_17_++] = class_ay.field_e_453;
											} else {
												Class_ab.intStack[position++] = (1290511831 * class_ay.field_g_454);
											}
										}
									}
									continue;
								}
							} else if (instruction < 3700) {
								if (instruction == 3600) {
									if ((client.field_ol_2957 * 2061146161) == 0) {
										Class_ab.intStack[position++] = -2;
									} else if ((2061146161 * client.field_ol_2957) == 1) {
										Class_ab.intStack[position++] = -1;
									} else {
										Class_ab.intStack[position++] = (1944416787 * client.friendListSize);
									}
									continue;
								}
								if (instruction == 3601) {
									final int i_147_ = Class_ab.intStack[--position];
									if (((client.field_ol_2957 * 2061146161) == 2)
											&& (i_147_ < (1944416787 * client.friendListSize))) {
										Class_ab.strStack[i_17_++] = (client.friends[i_147_].name);
										Class_ab.strStack[i_17_++] = (client.friends[i_147_].displayName);
									} else {
										Class_ab.strStack[i_17_++] = "";
										Class_ab.strStack[i_17_++] = "";
									}
									continue;
								}
								if (instruction == 3602) {
									final int i_148_ = Class_ab.intStack[--position];
									if (((client.field_ol_2957 * 2061146161) == 2)
											&& (i_148_ < (1944416787 * client.friendListSize))) {
										Class_ab.intStack[position++] = (client.friends[i_148_].world) * -533307325;
									} else {
										Class_ab.intStack[position++] = 0;
									}
									continue;
								}
								if (instruction == 3603) {
									final int i_149_ = Class_ab.intStack[--position];
									if (((client.field_ol_2957 * 2061146161) == 2)
											&& (i_149_ < (client.friendListSize * 1944416787))) {
										Class_ab.intStack[position++] = (-1262232867
												* ((client.friends[i_149_]).clanRank));
									} else {
										Class_ab.intStack[position++] = 0;
									}
									continue;
								}
								if (instruction == 3604) {
									final String string = Class_ab.strStack[--i_17_];
									final int i_150_ = Class_ab.intStack[--position];
									Projectile.method_ek_void(string, i_150_, (byte) 2);
									continue;
								}
								if (instruction == 3605) {
									final String string = Class_ab.strStack[--i_17_];
									GameObject.method_dv_void(string, (byte) -31);
									continue;
								}
								if (instruction == 3606) {
									final String string = Class_ab.strStack[--i_17_];
									Script.method_eu_void(string, (byte) 7);
									continue;
								}
								if (instruction == 3607) {
									final String string = Class_ab.strStack[--i_17_];
									if (string != null) {
										if ((((-1756810877 * client.field_pa_2851) >= 100)
												&& ((-126301797 * client.field_hq_2873) != 1))
												|| ((-1756810877 * client.field_pa_2851) >= 400)) {
											GameStub.sendMessage(31, "", MenuText.field_fe_2044);
										} else {
											final String string_151_ = (Class_bg.method_d_String(string,
													Class_fd.field_h_2308, 314974630));
											if (string_151_ != null) {
												for (int i_152_ = 0; (i_152_ < (-1756810877
														* (client.field_pa_2851))); i_152_++) {
													final Ignore class_m = (client.ignores[i_152_]);
													final String string_153_ = (Class_bg.method_d_String((class_m.name),
															(Class_fd.field_h_2308), 1735955255));
													if ((string_153_ != null) && (string_153_.equals(string_151_))) {
														GameStub.sendMessage(31, "", new StringBuilder().append(string)
																.append(MenuText.field_fu_1952).toString());
														continue while_3_;
													}
													if ((class_m.previousName) != null) {
														final String string_154_ = (Class_bg.method_d_String(
																(class_m.previousName), (Class_fd.field_h_2308),
																1210571986));
														if ((string_154_ != null)
																&& (string_154_.equals(string_151_))) {
															GameStub.sendMessage(31, "",
																	new StringBuilder().append(string)
																			.append(MenuText.field_fu_1952).toString());
															continue while_3_;
														}
													}
												}
												for (int i_155_ = 0; (i_155_ < (1944416787
														* (client.friendListSize))); i_155_++) {
													final Friend class_j = (client.friends[i_155_]);
													final String string_156_ = (Class_bg.method_d_String((class_j.name),
															(Class_fd.field_h_2308), -1462114822));
													if ((string_156_ != null) && (string_156_.equals(string_151_))) {
														GameStub.sendMessage(31, "",
																new StringBuilder().append(MenuText.field_fo_1957)
																		.append(string).append(MenuText.field_fj_1958)
																		.toString());
														continue while_3_;
													}
													if ((class_j.displayName) != null) {
														final String string_157_ = (Class_bg.method_d_String(
																(class_j.displayName), (Class_fd.field_h_2308),
																-28802854));
														if ((string_157_ != null)
																&& (string_157_.equals(string_151_))) {
															GameStub.sendMessage(31, "",
																	new StringBuilder().append(MenuText.field_fo_1957)
																			.append(string)
																			.append(MenuText.field_fj_1958).toString());
															continue while_3_;
														}
													}
												}
												if (Class_bg
														.method_d_String((Class_ci.myPlayer.name),
																Class_fd.field_h_2308, 2093038832)
														.equals(string_151_)) {
													GameStub.sendMessage(31, "", (MenuText.CANNOT_ADD_SELF));
												} else {
													client.encryptedBuffer.writeOpcode(179);
													final SecureBuffer class_dc = client.encryptedBuffer;
													final int i_158_ = string.length() + 1;
													class_dc.put(i_158_);
													client.encryptedBuffer.putNT0String(string, (byte) -28);
												}
											}
										}
									}
									continue;
								}
								if (instruction == 3608) {
									final String string = Class_ab.strStack[--i_17_];
									if (string != null) {
										final String string_159_ = (Class_bg.method_d_String(string,
												Class_fd.field_h_2308, -1134709127));
										if (string_159_ != null) {
											for (int i_160_ = 0; (i_160_ < (-1756810877
													* client.field_pa_2851)); i_160_++) {
												final Ignore class_m = (client.ignores[i_160_]);
												final String string_161_ = (class_m.name);
												final String string_162_ = (Class_bg.method_d_String(string_161_,
														Class_fd.field_h_2308, -1226435676));
												boolean bool_163_;
												if ((string == null) || (string_161_ == null)) {
													bool_163_ = false;
												} else if (string.startsWith("#") || (string_161_.startsWith("#"))) {
													bool_163_ = (string.equals(string_161_));
												} else {
													bool_163_ = (string_159_.equals(string_162_));
												}
												if (bool_163_) {
													client.field_pa_2851 -= -177969877;
													for (int i_164_ = i_160_; (i_164_ < ((client.field_pa_2851)
															* -1756810877)); i_164_++) {
														client.ignores[i_164_] = (client.ignores[1 + i_164_]);
													}
													client.field_ka_2880 = (client.field_kj_2850 * -62874977);
													client.encryptedBuffer.writeOpcode(180);
													final SecureBuffer class_dc = client.encryptedBuffer;
													final int i_165_ = string.length() + 1;
													class_dc.put(i_165_);
													client.encryptedBuffer.putNT0String(string, (byte) -4);
													break;
												}
											}
										}
									}
									continue;
								}
								if (instruction == 3609) {
									String string = Class_ab.strStack[--i_17_];
									final Permissions[] class_ews = Permissions.getPrivileges();
									for (final Permissions class_ew : class_ews) {
										if ((class_ew.ordinal * 1941325631) != -1) {
											final String string_167_ = string;
											final int i_168_ = (1941325631 * class_ew.ordinal);
											final String string_169_ = new StringBuilder().append("<img=")
													.append(i_168_).append(">").toString();
											if (string_167_.startsWith(string_169_)) {
												string = (string.substring(6
														+ Integer.toString((class_ew.ordinal) * 1941325631).length()));
												break;
											}
										}
									}
									Class_ab.intStack[position++] = ((GameStub.method_dx_boolean(string, false,
											1882277377)) ? 1 : 0);
									continue;
								}
								if (instruction == 3611) {
									if (client.channelName != null) {
										Class_ab.strStack[i_17_++] = (Class_cq.method_z_String(client.channelName,
												(byte) 33));
									} else {
										Class_ab.strStack[i_17_++] = "";
									}
									continue;
								}
								if (instruction == 3612) {
									if (client.channelName != null) {
										Class_ab.intStack[position++] = (-603301767 * Class_ci.clanSize);
									} else {
										Class_ab.intStack[position++] = 0;
									}
									continue;
								}
								if (instruction == 3613) {
									final int i_170_ = Class_ab.intStack[--position];
									if ((client.channelName != null) && (i_170_ < (Class_ci.clanSize * -603301767))) {
										Class_ab.strStack[i_17_++] = (Class_dd.field_mq_1588[i_170_].name);
									} else {
										Class_ab.strStack[i_17_++] = "";
									}
									continue;
								}
								if (instruction == 3614) {
									final int i_171_ = Class_ab.intStack[--position];
									if ((client.channelName != null) && (i_171_ < (Class_ci.clanSize * -603301767))) {
										Class_ab.intStack[position++] = (1232440621
												* ((Class_dd.field_mq_1588[i_171_]).world));
									} else {
										Class_ab.intStack[position++] = 0;
									}
									continue;
								}
								if (instruction == 3615) {
									final int i_172_ = Class_ab.intStack[--position];
									if ((client.channelName != null) && (i_172_ < (Class_ci.clanSize * -603301767))) {
										Class_ab.intStack[position++] = (Class_dd.field_mq_1588[i_172_].rank);
									} else {
										Class_ab.intStack[position++] = 0;
									}
									continue;
								}
								if (instruction == 3616) {
									Class_ab.intStack[position++] = ItemContainer.inChannelFlag;
									continue;
								}
								if (instruction == 3617) {
									final String string = Class_ab.strStack[--i_17_];
									Class_fq.method_eq_void(string, 1962104536);
									continue;
								}
								if (instruction == 3618) {
									Class_ab.intStack[position++] = SpotAnim.myClanRank;
									continue;
								}
								if (instruction == 3619) {
									final String string = Class_ab.strStack[--i_17_];
									if (!string.equals("")) {
										client.encryptedBuffer.writeOpcode(241);
										final SecureBuffer class_dc = client.encryptedBuffer;
										final int i_173_ = string.length() + 1;
										class_dc.put(i_173_);
										client.encryptedBuffer.putNT0String(string, (byte) 50);
									}
									continue;
								}
								if (instruction == 3620) {
									client.encryptedBuffer.writeOpcode(241);
									client.encryptedBuffer.put(0);
									continue;
								}
								if (instruction == 3621) {
									if ((2061146161 * client.field_ol_2957) == 0) {
										Class_ab.intStack[position++] = -1;
									} else {
										Class_ab.intStack[position++] = (-1756810877 * client.field_pa_2851);
									}
									continue;
								}
								if (instruction == 3622) {
									final int i_174_ = Class_ab.intStack[--position];
									if (((client.field_ol_2957 * 2061146161) != 0)
											&& (i_174_ < (-1756810877 * client.field_pa_2851))) {
										Class_ab.strStack[i_17_++] = (client.ignores[i_174_].name);
										Class_ab.strStack[i_17_++] = (client.ignores[i_174_].previousName);
									} else {
										Class_ab.strStack[i_17_++] = "";
										Class_ab.strStack[i_17_++] = "";
									}
									continue;
								}
								if (instruction == 3623) {
									String string = Class_ab.strStack[--i_17_];
									final String string_175_ = string;
									final String string_176_ = "<img=0>";
									do {
										if (!string_175_.startsWith(string_176_)) {
											final String string_177_ = string;
											final String string_178_ = "<img=1>";
											if (!string_177_.startsWith(string_178_)) {
												break;
											}
										}
										string = string.substring(7);
									} while (false);
									Class_ab.intStack[position++] = (Class_r.isIgnored(string) ? 1 : 0);
									continue;
								}
								if (instruction == 3624) {
									final int i_179_ = Class_ab.intStack[--position];
									if ((Class_dd.field_mq_1588 != null) && (i_179_ < (Class_ci.clanSize * -603301767))
											&& (Class_dd.field_mq_1588[i_179_].name
													.equalsIgnoreCase(Class_ci.myPlayer.name))) {
										Class_ab.intStack[position++] = 1;
									} else {
										Class_ab.intStack[position++] = 0;
									}
									continue;
								}
								if (instruction == 3625) {
									if (client.clanOwner != null) {
										Class_ab.strStack[i_17_++] = (Class_cq.method_z_String(client.clanOwner,
												(byte) 4));
									} else {
										Class_ab.strStack[i_17_++] = "";
									}
									continue;
								}
							} else if (instruction < 4000) {
								if (instruction == 3903) {
									final int i_180_ = Class_ab.intStack[--position];
									Class_ab.intStack[position++] = client.field_pb_2965[i_180_]
											.method_y_int(1254557840);
									continue;
								}
								if (instruction == 3904) {
									final int i_181_ = Class_ab.intStack[--position];
									Class_ab.intStack[position++] = 149031053
											* (client.field_pb_2965[i_181_].field_d_3086);
									continue;
								}
								if (instruction == 3905) {
									final int i_182_ = Class_ab.intStack[--position];
									Class_ab.intStack[position++] = 168550371
											* (client.field_pb_2965[i_182_].field_z_3083);
									continue;
								}
								if (instruction == 3906) {
									final int i_183_ = Class_ab.intStack[--position];
									Class_ab.intStack[position++] = (client.field_pb_2965[i_183_].field_y_3081)
											* -1815249599;
									continue;
								}
								if (instruction == 3907) {
									final int i_184_ = Class_ab.intStack[--position];
									Class_ab.intStack[position++] = (client.field_pb_2965[i_184_].field_e_3085)
											* 1588711409;
									continue;
								}
								if (instruction == 3908) {
									final int i_185_ = Class_ab.intStack[--position];
									Class_ab.intStack[position++] = (client.field_pb_2965[i_185_].field_g_3084)
											* 147150953;
									continue;
								}
								if (instruction == 3910) {
									final int i_186_ = Class_ab.intStack[--position];
									final int i_187_ = client.field_pb_2965[i_186_].method_z_int(-684596110);
									Class_ab.intStack[position++] = i_187_ == 0 ? 1 : 0;
									continue;
								}
								if (instruction == 3911) {
									final int i_188_ = Class_ab.intStack[--position];
									final int i_189_ = client.field_pb_2965[i_188_].method_z_int(1611490731);
									Class_ab.intStack[position++] = i_189_ == 2 ? 1 : 0;
									continue;
								}
								if (instruction == 3912) {
									final int i_190_ = Class_ab.intStack[--position];
									final int i_191_ = client.field_pb_2965[i_190_].method_z_int(977855599);
									Class_ab.intStack[position++] = i_191_ == 5 ? 1 : 0;
									continue;
								}
								if (instruction == 3913) {
									final int i_192_ = Class_ab.intStack[--position];
									final int i_193_ = client.field_pb_2965[i_192_].method_z_int(687089547);
									Class_ab.intStack[position++] = i_193_ == 1 ? 1 : 0;
									continue;
								}
								if (instruction == 3914) {
									final boolean bool_194_ = Class_ab.intStack[--position] == 1;
									if (Npc.field_pe_292 != null) {
										Npc.field_pe_292.method_n_void(Class_hq.field_y_3092, bool_194_, 1663822592);
									}
									continue;
								}
								if (instruction == 3915) {
									final boolean bool_195_ = Class_ab.intStack[--position] == 1;
									if (Npc.field_pe_292 != null) {
										Npc.field_pe_292.method_n_void(Class_hq.field_z_3091, bool_195_, -120491462);
									}
									continue;
								}
								if (instruction == 3916) {
									position -= 2;
									final boolean bool_196_ = Class_ab.intStack[position] == 1;
									final boolean bool_197_ = Class_ab.intStack[position + 1] == 1;
									if (Npc.field_pe_292 != null) {
										Npc.field_pe_292.method_n_void(new Class_p(bool_197_), bool_196_, -1770062014);
									}
									continue;
								}
								if (instruction == 3917) {
									final boolean bool_198_ = Class_ab.intStack[--position] == 1;
									if (Npc.field_pe_292 != null) {
										Npc.field_pe_292.method_n_void(Class_hq.field_d_3093, bool_198_, -1278754655);
									}
									continue;
								}
								if (instruction == 3918) {
									final boolean bool_199_ = Class_ab.intStack[--position] == 1;
									if (Npc.field_pe_292 != null) {
										Npc.field_pe_292.method_n_void(Class_hq.field_e_3090, bool_199_, -1449984752);
									}
									continue;
								}
								if (instruction == 3919) {
									Class_ab.intStack[position++] = (Npc.field_pe_292 == null ? 0
											: Npc.field_pe_292.field_n_3089.size());
									continue;
								}
								if (instruction == 3920) {
									final int i_200_ = Class_ab.intStack[--position];
									final Class_gg class_gg = ((Class_gg) Npc.field_pe_292.field_n_3089.get(i_200_));
									Class_ab.intStack[position++] = class_gg.field_n_3000 * 1411512875;
									continue;
								}
								if (instruction == 3921) {
									final int i_201_ = Class_ab.intStack[--position];
									final Class_gg class_gg = ((Class_gg) Npc.field_pe_292.field_n_3089.get(i_201_));
									Class_ab.strStack[i_17_++] = class_gg.method_n_String(299363503);
									continue;
								}
								if (instruction == 3922) {
									final int i_202_ = Class_ab.intStack[--position];
									final Class_gg class_gg = ((Class_gg) Npc.field_pe_292.field_n_3089.get(i_202_));
									Class_ab.strStack[i_17_++] = class_gg.method_d_String((byte) -35);
									continue;
								}
								if (instruction == 3923) {
									final int i_203_ = Class_ab.intStack[--position];
									final Class_gg class_gg = ((Class_gg) Npc.field_pe_292.field_n_3089.get(i_203_));
									final long l = (Renderable.getCurrentTime(737502684)
											- (FileStore.field_pr_2492 * 6190760556081792035L)
											- (7907452213849456665L * class_gg.field_d_2998));
									final int i_204_ = (int) (l / 3600000L);
									final int i_205_ = (int) ((l - i_204_ * 3600000) / 60000L);
									final int i_206_ = (int) ((l - 3600000 * i_204_ - i_205_ * 60000) / 1000L);
									final String string = new StringBuilder().append(i_204_).append(":")
											.append(i_205_ / 10).append(i_205_ % 10).append(":").append(i_206_ / 10)
											.append(i_206_ % 10).toString();
									Class_ab.strStack[i_17_++] = string;
									continue;
								}
								if (instruction == 3924) {
									final int i_207_ = Class_ab.intStack[--position];
									final Class_gg class_gg = ((Class_gg) Npc.field_pe_292.field_n_3089.get(i_207_));
									Class_ab.intStack[position++] = (class_gg.field_z_3003.field_y_3081 * -1815249599);
									continue;
								}
								if (instruction == 3925) {
									final int i_208_ = Class_ab.intStack[--position];
									final Class_gg class_gg = ((Class_gg) Npc.field_pe_292.field_n_3089.get(i_208_));
									Class_ab.intStack[position++] = 168550371 * (class_gg.field_z_3003.field_z_3083);
									continue;
								}
								if (instruction == 3926) {
									final int i_209_ = Class_ab.intStack[--position];
									final Class_gg class_gg = ((Class_gg) Npc.field_pe_292.field_n_3089.get(i_209_));
									Class_ab.intStack[position++] = 149031053 * (class_gg.field_z_3003.field_d_3086);
									continue;
								}
							} else if (instruction < 4100) {
								if (instruction == 4000) {// int addition lol
									position -= 2;
									final int i_210_ = Class_ab.intStack[position];
									final int i_211_ = Class_ab.intStack[1 + position];
									Class_ab.intStack[position++] = i_210_ + i_211_;
									continue;
								}
								if (instruction == 4001) {// subtraction
									position -= 2;
									final int i_212_ = Class_ab.intStack[position];
									final int i_213_ = Class_ab.intStack[1 + position];
									Class_ab.intStack[position++] = i_212_ - i_213_;
									continue;
								}
								if (instruction == 4002) {// multiplication
									position -= 2;
									final int i_214_ = Class_ab.intStack[position];
									final int i_215_ = Class_ab.intStack[position + 1];
									Class_ab.intStack[position++] = i_214_ * i_215_;
									continue;
								}
								if (instruction == 4003) {// division
									position -= 2;
									final int i_216_ = Class_ab.intStack[position];
									final int i_217_ = Class_ab.intStack[1 + position];
									Class_ab.intStack[position++] = i_216_ / i_217_;
									continue;
								}
								if (instruction == 4004) {
									final int i_218_ = Class_ab.intStack[--position];
									Class_ab.intStack[position++] = (int) (Math.random() * i_218_);
									continue;
								}
								if (instruction == 4005) {
									final int i_219_ = Class_ab.intStack[--position];
									Class_ab.intStack[position++] = (int) (Math.random() * (1 + i_219_));
									continue;
								}
								if (instruction == 4006) {
									position -= 5;
									final int i_220_ = Class_ab.intStack[position];
									final int i_221_ = Class_ab.intStack[position + 1];
									final int i_222_ = Class_ab.intStack[2 + position];
									final int i_223_ = Class_ab.intStack[position + 3];
									final int i_224_ = Class_ab.intStack[4 + position];
									Class_ab.intStack[position++] = (((i_224_ - i_222_) * (i_221_ - i_220_))
											/ (i_223_ - i_222_)) + i_220_;
									continue;
								}
								if (instruction == 4007) {
									position -= 2;
									final int i_225_ = Class_ab.intStack[position];
									final int i_226_ = Class_ab.intStack[position + 1];
									Class_ab.intStack[position++] = ((i_225_ * i_226_) / 100) + i_225_;
									continue;
								}
								if (instruction == 4008) {
									position -= 2;
									final int i_227_ = Class_ab.intStack[position];
									final int i_228_ = Class_ab.intStack[1 + position];
									Class_ab.intStack[position++] = i_227_ | (1 << i_228_);
									continue;
								}
								if (instruction == 4009) {
									position -= 2;
									final int i_229_ = Class_ab.intStack[position];
									final int i_230_ = Class_ab.intStack[1 + position];
									Class_ab.intStack[position++] = i_229_ & (-1 - (1 << i_230_));
									continue;
								}
								if (instruction == 4010) {
									position -= 2;
									final int i_231_ = Class_ab.intStack[position];
									final int i_232_ = Class_ab.intStack[1 + position];
									Class_ab.intStack[position++] = (i_231_ & (1 << i_232_)) != 0 ? 1 : 0;
									continue;
								}
								if (instruction == 4011) {
									position -= 2;
									final int i_233_ = Class_ab.intStack[position];
									final int i_234_ = Class_ab.intStack[1 + position];
									Class_ab.intStack[position++] = i_233_ % i_234_;
									continue;
								}
								if (instruction == 4012) {
									position -= 2;
									final int i_235_ = Class_ab.intStack[position];
									final int i_236_ = Class_ab.intStack[position + 1];
									if (i_235_ == 0) {
										Class_ab.intStack[position++] = 0;
									} else {
										Class_ab.intStack[position++] = (int) Math.pow(i_235_, i_236_);
									}
									continue;
								}
								if (instruction == 4013) {
									position -= 2;
									final int i_237_ = Class_ab.intStack[position];
									final int i_238_ = Class_ab.intStack[1 + position];
									if (i_237_ == 0) {
										Class_ab.intStack[position++] = 0;
									} else if (i_238_ == 0) {
										Class_ab.intStack[position++] = 2147483647;
									} else {
										Class_ab.intStack[position++] = (int) (Math.pow(i_237_, 1.0 / i_238_));
									}
									continue;
								}
								if (instruction == 4014) {
									position -= 2;
									final int i_239_ = Class_ab.intStack[position];
									final int i_240_ = Class_ab.intStack[position + 1];
									Class_ab.intStack[position++] = i_239_ & i_240_;
									continue;
								}
								if (instruction == 4015) {
									position -= 2;
									final int i_241_ = Class_ab.intStack[position];
									final int i_242_ = Class_ab.intStack[1 + position];
									Class_ab.intStack[position++] = i_241_ | i_242_;
									continue;
								}
							} else if (instruction < 4200) {
								if (instruction == 4100) {
									final String string = Class_ab.strStack[--i_17_];
									final int i_243_ = Class_ab.intStack[--position];
									Class_ab.strStack[i_17_++] = new StringBuilder().append(string).append(i_243_)
											.toString();
									continue;
								}
								if (instruction == 4101) {
									i_17_ -= 2;
									final String string = Class_ab.strStack[i_17_];
									final String string_244_ = Class_ab.strStack[i_17_ + 1];
									Class_ab.strStack[i_17_++] = new StringBuilder().append(string).append(string_244_)
											.toString();
									continue;
								}
								if (instruction == 4102) {
									final String string = Class_ab.strStack[--i_17_];
									final int i_245_ = Class_ab.intStack[--position];
									final String[] strings = Class_ab.strStack;
									final int i_246_ = i_17_++;
									final String string_247_ = string;
									String string_248_;
									if (i_245_ < 0) {
										string_248_ = Integer.toString(i_245_);
									} else {
										int i_249_ = i_245_;
										String string_250_;
										if (i_249_ < 0) {
											string_250_ = Integer.toString(i_249_, 10);
										} else {
											int i_251_ = 2;
											int i_252_ = i_249_ / 10;
											while (i_252_ != 0) {
												i_252_ /= 10;
												i_251_++;
											}
											final char[] cs = new char[i_251_];
											cs[0] = '+';
											for (int i_253_ = i_251_ - 1; i_253_ > 0; i_253_--) {
												final int i_254_ = i_249_;
												i_249_ /= 10;
												final int i_255_ = i_254_ - (10 * i_249_);
												if (i_255_ >= 10) {
													cs[i_253_] = (char) (87 + i_255_);
												} else {
													cs[i_253_] = (char) (48 + i_255_);
												}
											}
											string_250_ = new String(cs);
										}
										string_248_ = string_250_;
									}
									strings[i_246_] = new StringBuilder().append(string_247_).append(string_248_)
											.toString();
									continue;
								}
								if (instruction == 4103) {
									final String string = Class_ab.strStack[--i_17_];
									Class_ab.strStack[i_17_++] = string.toLowerCase();
									continue;
								}
								if (instruction == 4104) {
									final int i_256_ = Class_ab.intStack[--position];
									final long l = 86400000L * (i_256_ + 11745L);
									Class_ab.CALENDAR.setTime(new Date(l));
									final int i_257_ = Class_ab.CALENDAR.get(5);
									final int i_258_ = Class_ab.CALENDAR.get(2);
									final int i_259_ = Class_ab.CALENDAR.get(1);
									Class_ab.strStack[i_17_++] = new StringBuilder().append(i_257_).append("-")
											.append(Class_ab.MONTHS[i_258_]).append("-").append(i_259_).toString();
									continue;
								}
								if (instruction == 4105) {
									i_17_ -= 2;
									final String string = Class_ab.strStack[i_17_];
									final String string_260_ = Class_ab.strStack[1 + i_17_];
									if ((Class_ci.myPlayer.composite != null) && (Class_ci.myPlayer.composite.male)) {
										Class_ab.strStack[i_17_++] = string_260_;
									} else {
										Class_ab.strStack[i_17_++] = string;
									}
									continue;
								}
								if (instruction == 4106) {
									final int i_261_ = Class_ab.intStack[--position];
									Class_ab.strStack[i_17_++] = Integer.toString(i_261_);
									continue;
								}
								if (instruction == 4107) {
									i_17_ -= 2;
									final int[] is_262_ = Class_ab.intStack;
									final int i_263_ = position++;
									final int i_264_ = (Class_gh.method_n_int(Class_ab.strStack[i_17_],
											Class_ab.strStack[i_17_ + 1], client.hideWorldList * -1485158959,
											1910735783));
									int i_265_;
									if (i_264_ > 0) {
										i_265_ = 1;
									} else if (i_264_ < 0) {
										i_265_ = -1;
									} else {
										i_265_ = 0;
									}
									is_262_[i_263_] = i_265_;
									continue;
								}
								if (instruction == 4108) {
									final String string = Class_ab.strStack[--i_17_];
									position -= 2;
									final int i_266_ = Class_ab.intStack[position];
									final int i_267_ = Class_ab.intStack[position + 1];
									final byte[] is_268_ = (Projectile.fontIndex.getArchive(i_267_, 0));
									final Class_hd class_hd = new Class_hd(is_268_);
									Class_ab.intStack[position++] = class_hd.method_f_int(string, i_266_);
									continue;
								}
								if (instruction == 4109) {
									final String string = Class_ab.strStack[--i_17_];
									position -= 2;
									final int i_269_ = Class_ab.intStack[position];
									final int i_270_ = Class_ab.intStack[1 + position];
									final byte[] is_271_ = (Projectile.fontIndex.getArchive(i_270_, 0));
									final Class_hd class_hd = new Class_hd(is_271_);
									Class_ab.intStack[position++] = class_hd.method_g_int(string, i_269_);
									continue;
								}
								if (instruction == 4110) {
									i_17_ -= 2;
									final String string = Class_ab.strStack[i_17_];
									final String string_272_ = Class_ab.strStack[i_17_ + 1];
									if (Class_ab.intStack[--position] == 1) {
										Class_ab.strStack[i_17_++] = string;
									} else {
										Class_ab.strStack[i_17_++] = string_272_;
									}
									continue;
								}
								if (instruction == 4111) {
									final String string = Class_ab.strStack[--i_17_];
									Class_ab.strStack[i_17_++] = TypeFace.method_m_String(string);
									continue;
								}
								if (instruction == 4112) {
									final String string = Class_ab.strStack[--i_17_];
									final int i_273_ = Class_ab.intStack[--position];
									Class_ab.strStack[i_17_++] = new StringBuilder().append(string)
											.append((char) i_273_).toString();
									continue;
								}
								if (instruction == 4113) {
									final int i_274_ = Class_ab.intStack[--position];
									Class_ab.intStack[position++] = ((Class_eh.method_h_boolean((char) i_274_,
											-161751113)) ? 1 : 0);
									continue;
								}
								if (instruction == 4114) {
									final int i_275_ = Class_ab.intStack[--position];
									Class_ab.intStack[position++] = ((GameMessage.method_f_boolean((char) i_275_,
											-1834697455)) ? 1 : 0);
									continue;
								}
								if (instruction == 4115) {
									final int i_276_ = Class_ab.intStack[--position];
									final int[] is_277_ = Class_ab.intStack;
									final int i_278_ = position++;
									final char c = (char) i_276_;
									final boolean bool_279_ = (((c >= 'A') && (c <= 'Z'))
											|| ((c >= 'a') && (c <= 'z')));
									is_277_[i_278_] = bool_279_ ? 1 : 0;
									continue;
								}
								if (instruction == 4116) {
									final int i_280_ = Class_ab.intStack[--position];
									final int[] is_281_ = Class_ab.intStack;
									final int i_282_ = position++;
									final char c = (char) i_280_;
									final boolean bool_283_ = (c >= '0') && (c <= '9');
									is_281_[i_282_] = bool_283_ ? 1 : 0;
									continue;
								}
								if (instruction == 4117) {
									final String string = Class_ab.strStack[--i_17_];
									if (string != null) {
										Class_ab.intStack[position++] = string.length();
									} else {
										Class_ab.intStack[position++] = 0;
									}
									continue;
								}
								if (instruction == 4118) {
									final String string = Class_ab.strStack[--i_17_];
									position -= 2;
									final int i_284_ = Class_ab.intStack[position];
									final int i_285_ = Class_ab.intStack[position + 1];
									Class_ab.strStack[i_17_++] = string.substring(i_284_, i_285_);
									continue;
								}
								if (instruction == 4119) {
									final String string = Class_ab.strStack[--i_17_];
									final StringBuilder stringbuilder = new StringBuilder(string.length());
									boolean bool_286_ = false;
									for (int i_287_ = 0; i_287_ < string.length(); i_287_++) {
										final char c = string.charAt(i_287_);
										if (c == '<') {
											bool_286_ = true;
										} else if (c == '>') {
											bool_286_ = false;
										} else if (!bool_286_) {
											stringbuilder.append(c);
										}
									}
									Class_ab.strStack[i_17_++] = stringbuilder.toString();
									continue;
								}
								if (instruction == 4120) {
									final String string = Class_ab.strStack[--i_17_];
									final int i_288_ = Class_ab.intStack[--position];
									Class_ab.intStack[position++] = string.indexOf(i_288_);
									continue;
								}
								if (instruction == 4121) {
									i_17_ -= 2;
									final String string = Class_ab.strStack[i_17_];
									final String string_289_ = Class_ab.strStack[1 + i_17_];
									final int i_290_ = Class_ab.intStack[--position];
									Class_ab.intStack[position++] = string.indexOf(string_289_, i_290_);
									continue;
								}
							} else if (instruction < 4300) {
								if (instruction == 4200) {
									final int i_291_ = Class_ab.intStack[--position];
									Class_ab.strStack[i_17_++] = (ItemDefinitions.getItemComposite(i_291_).name);
									continue;
								}
								if (instruction == 4201) {
									position -= 2;
									final int i_292_ = Class_ab.intStack[position];
									final int i_293_ = Class_ab.intStack[position + 1];
									final ItemComposite itemdef = ItemDefinitions.getItemComposite(i_292_);
									if ((i_293_ >= 1) && (i_293_ <= 5) && (itemdef.groundOptions[i_293_ - 1] != null)) {
										Class_ab.strStack[i_17_++] = itemdef.groundOptions[i_293_ - 1];
									} else {
										Class_ab.strStack[i_17_++] = "";
									}
									continue;
								}
								if (instruction == 4202) {
									position -= 2;
									final int i_294_ = Class_ab.intStack[position];
									final int i_295_ = Class_ab.intStack[1 + position];
									final ItemComposite itemdef = ItemDefinitions.getItemComposite(i_294_);
									if ((i_295_ >= 1) && (i_295_ <= 5) && (itemdef.invOptions[i_295_ - 1] != null)) {  
										Class_ab.strStack[i_17_++] = itemdef.invOptions[i_295_ - 1];
									} else {
										Class_ab.strStack[i_17_++] = "";
									}
									continue;
								}
								if (instruction == 4203) {
									final int i_296_ = Class_ab.intStack[--position];
									Class_ab.intStack[position++] = ((ItemDefinitions.getItemComposite(i_296_).cost)
											* -1548814399);
									continue;
								}
								if (instruction == 4204) {
									final int i_297_ = Class_ab.intStack[--position];
									Class_ab.intStack[position++] = ((ItemDefinitions.getItemComposite(i_297_).stackable)
											* 1537303969) == 1 ? 1 : 0;
									continue;
								}
								if (instruction == 4205) {
									final int i_298_ = Class_ab.intStack[--position];
									final ItemComposite itemdef = ItemDefinitions.getItemComposite(i_298_);
									if (((-1058124419 * itemdef.field_ay_146) == -1)
											&& ((583137811 * itemdef.field_aq_125) >= 0)) {
										Class_ab.intStack[position++] = 583137811 * itemdef.field_aq_125;
									} else {
										Class_ab.intStack[position++] = i_298_;
									}
									continue;
								}
								if (instruction == 4206) {
									final int i_299_ = Class_ab.intStack[--position];
									final ItemComposite itemdef = ItemDefinitions.getItemComposite(i_299_);
									if (((itemdef.field_ay_146 * -1058124419) >= 0)
											&& ((itemdef.field_aq_125 * 583137811) >= 0)) {
										Class_ab.intStack[position++] = itemdef.field_aq_125 * 583137811;
									} else {
										Class_ab.intStack[position++] = i_299_;
									}
									continue;
								}
								if (instruction == 4207) {
									final int i_300_ = Class_ab.intStack[--position];
									Class_ab.intStack[position++] = ((ItemDefinitions.getItemComposite(i_300_).members) ? 1
											: 0);
									continue;
								}
								if (instruction == 4210) {
									final String string = Class_ab.strStack[--i_17_];
									final int i_301_ = Class_ab.intStack[--position];
									String string_302_ = string;
									final boolean bool_303_ = i_301_ == 1;
									string_302_ = string_302_.toLowerCase();
									short[] is_304_ = new short[16];
									int i_305_ = 0;
									while_2_: do {
										for (int i_306_ = 0; i_306_ < (ItemComposite.field_f_109
												* -1407781621); i_306_++) {
											final ItemComposite itemdef = (ItemDefinitions.getItemComposite(i_306_));
											if ((!bool_303_ || itemdef.field_av_153)
													&& ((-1058124419 * itemdef.field_ay_146) == -1)
													&& (itemdef.name.toLowerCase().indexOf(string_302_) != -1)) {
												if (i_305_ >= 250) {
													Class_ay.field_pt_461 = 1703107915;
													Class_du.field_pp_1718 = null;
													break while_2_;
												}
												if (i_305_ >= is_304_.length) {
													final short[] is_307_ = (new short[(is_304_.length * 2)]);
													for (int i_308_ = 0; i_308_ < i_305_; i_308_++) {
														is_307_[i_308_] = is_304_[i_308_];
													}
													is_304_ = is_307_;
												}
												is_304_[i_305_++] = (short) i_306_;
											}
										}
										Class_du.field_pp_1718 = is_304_;
										Class_fb.field_pn_2281 = 0;
										Class_ay.field_pt_461 = i_305_ * -1703107915;
										final String[] strings = (new String[(2141109149 * Class_ay.field_pt_461)]);
										for (int i_309_ = 0; (i_309_ < (2141109149
												* Class_ay.field_pt_461)); i_309_++) {
											strings[i_309_] = (ItemDefinitions.getItemComposite(is_304_[i_309_]).name);
										}
										final short[] is_310_ = Class_du.field_pp_1718;
										ItemComposite.method_n_void(strings, is_310_, 0, (strings.length - 1),
												(byte) -75);
									} while (false);
									Class_ab.intStack[position++] = Class_ay.field_pt_461 * 2141109149;
									continue;
								}
								if (instruction == 4211) {
									if ((Class_du.field_pp_1718 == null) || ((Class_fb.field_pn_2281
											* 972908809) >= (2141109149 * Class_ay.field_pt_461))) {
										Class_ab.intStack[position++] = -1;
									} else {
										Class_ab.intStack[position++] = (Class_du.field_pp_1718[(((Class_fb.field_pn_2281 += -1306593991)
												* 972908809) - 1)]) & 0xffff;
									}
									continue;
								}
								if (instruction == 4212) {
									Class_fb.field_pn_2281 = 0;
									continue;
								}
							} else if (instruction < 5100) {
								if (instruction == 5000) {
									Class_ab.intStack[position++] = 1614021205 * client.field_ly_2725;
									continue;
								}
								if (instruction == 5001) {
									position -= 3;
									client.field_ly_2725 = (10021629 * Class_ab.intStack[position]);
									Class_cx.field_lj_1431 = Class_ae.method_d_db((Class_ab.intStack[position + 1]),
											327238364);
									if (Class_cx.field_lj_1431 == null) {
										Class_cx.field_lj_1431 = Class_db.field_d_1568;
									}
									client.field_lh_2908 = (Class_ab.intStack[2 + position] * -317796335);
									client.encryptedBuffer.writeOpcode(51);
									client.encryptedBuffer.put(client.field_ly_2725 * 1614021205);
									client.encryptedBuffer.put((Class_cx.field_lj_1431.field_y_1565 * -2094882735));
									client.encryptedBuffer.put(-699653903 * client.field_lh_2908);
									continue;
								}
								if (instruction == 5002) {
									final String string = Class_ab.strStack[--i_17_];
									position -= 2;
									final int i_311_ = Class_ab.intStack[position];
									final int i_312_ = Class_ab.intStack[position + 1];
									client.encryptedBuffer.writeOpcode(40);
									client.encryptedBuffer.put(Class_cl.getStringLength(string, (byte) 1) + 2);
									client.encryptedBuffer.putNT0String(string, (byte) 20);
									client.encryptedBuffer.put(i_311_ - 1);
									client.encryptedBuffer.put(i_312_);
									continue;
								}
								if (instruction == 5003) {
									position -= 2;
									final int i_313_ = Class_ab.intStack[position];
									final int i_314_ = Class_ab.intStack[position + 1];
									final Class_i class_i = ((Class_i) Class_l.field_n_1130
											.get(Integer.valueOf(i_313_)));
									final GameMessage gamemessage = class_i.method_d_as(i_314_, -1490535717);
									final GameMessage gamemessage_315_ = gamemessage;
									if (gamemessage_315_ != null) {
										Class_ab.intStack[position++] = (gamemessage_315_.field_n_307) * -1471797213;
										Class_ab.intStack[position++] = 424036437 * (gamemessage_315_.field_d_301);
										Class_ab.strStack[i_17_++] = (gamemessage_315_.owner != null
												? gamemessage_315_.owner : "");
										Class_ab.strStack[i_17_++] = ((gamemessage_315_.message2 != null)
												? gamemessage_315_.message2 : "");
										Class_ab.strStack[i_17_++] = ((gamemessage_315_.message != null)
												? gamemessage_315_.message : "");
									} else {
										Class_ab.intStack[position++] = -1;
										Class_ab.intStack[position++] = 0;
										Class_ab.strStack[i_17_++] = "";
										Class_ab.strStack[i_17_++] = "";
										Class_ab.strStack[i_17_++] = "";
									}
									continue;
								}
								if (instruction == 5004) {
									final int i_316_ = Class_ab.intStack[--position];
									final GameMessage gamemessage = Class_ci.method_y_as(i_316_, -117673388);
									if (gamemessage != null) {
										Class_ab.intStack[position++] = -50294215 * gamemessage.type;
										Class_ab.intStack[position++] = (gamemessage.field_d_301) * 424036437;
										Class_ab.strStack[i_17_++] = ((gamemessage.owner) != null ? (gamemessage.owner)
												: "");
										Class_ab.strStack[i_17_++] = ((gamemessage.message2) != null
												? (gamemessage.message2) : "");
										Class_ab.strStack[i_17_++] = ((gamemessage.message) != null
												? (gamemessage.message) : "");
									} else {
										Class_ab.intStack[position++] = -1;
										Class_ab.intStack[position++] = 0;
										Class_ab.strStack[i_17_++] = "";
										Class_ab.strStack[i_17_++] = "";
										Class_ab.strStack[i_17_++] = "";
									}
									continue;
								}
								if (instruction == 5005) {
									if (Class_cx.field_lj_1431 == null) {
										Class_ab.intStack[position++] = -1;
									} else {
										Class_ab.intStack[position++] = (Class_cx.field_lj_1431.field_y_1565)
												* -2094882735;
									}
									continue;
								}
								if (instruction == 5008) {
									String string = Class_ab.strStack[--i_17_];
									final int i_317_ = Class_ab.intStack[--position];
									String string_318_ = string.toLowerCase();
									int i_319_ = 0;
									if (string_318_.startsWith(MenuText.field_fm_1959)) {
										i_319_ = 0;
										string = (string.substring(MenuText.field_fm_1959.length()));
									} else if (string_318_.startsWith(MenuText.CHAT_FX_RED)) {
										i_319_ = 1;
										string = (string.substring(MenuText.CHAT_FX_RED.length()));
									} else if (string_318_.startsWith(MenuText.field_fz_1963)) {
										i_319_ = 2;
										string = (string.substring(MenuText.field_fz_1963.length()));
									} else if (string_318_.startsWith(MenuText.field_gp_1965)) {
										i_319_ = 3;
										string = (string.substring(MenuText.field_gp_1965.length()));
									} else if (string_318_.startsWith(MenuText.field_go_1918)) {
										i_319_ = 4;
										string = (string.substring(MenuText.field_go_1918.length()));
									} else if (string_318_.startsWith(MenuText.field_gi_1969)) {
										i_319_ = 5;
										string = (string.substring(MenuText.field_gi_1969.length()));
									} else if (string_318_.startsWith(MenuText.field_gw_1891)) {
										i_319_ = 6;
										string = (string.substring(MenuText.field_gw_1891.length()));
									} else if (string_318_.startsWith(MenuText.field_gn_1973)) {
										i_319_ = 7;
										string = (string.substring(MenuText.field_gn_1973.length()));
									} else if (string_318_.startsWith(MenuText.field_gd_1975)) {
										i_319_ = 8;
										string = (string.substring(MenuText.field_gd_1975.length()));
									} else if (string_318_.startsWith(MenuText.field_gu_1977)) {
										i_319_ = 9;
										string = (string.substring(MenuText.field_gu_1977.length()));
									} else if (string_318_.startsWith(MenuText.CHAT_FX_GLOW2)) {
										i_319_ = 10;
										string = (string.substring(MenuText.CHAT_FX_GLOW2.length()));
									} else if (string_318_.startsWith(MenuText.field_gy_1981)) {
										i_319_ = 11;
										string = (string.substring(MenuText.field_gy_1981.length()));
									} else if ((-1485158959 * client.hideWorldList) != 0) {
										if (string_318_.startsWith(MenuText.field_fw_1960)) {
											i_319_ = 0;
											string = (string.substring(MenuText.field_fw_1960.length()));
										} else if (string_318_.startsWith(MenuText.field_fi_1962)) {
											i_319_ = 1;
											string = (string.substring(MenuText.field_fi_1962.length()));
										} else if (string_318_.startsWith(MenuText.field_gl_2047)) {
											i_319_ = 2;
											string = (string.substring(MenuText.field_gl_2047.length()));
										} else if (string_318_.startsWith(MenuText.field_gx_1966)) {
											i_319_ = 3;
											string = (string.substring(MenuText.field_gx_1966.length()));
										} else if (string_318_.startsWith(MenuText.field_gj_2011)) {
											i_319_ = 4;
											string = (string.substring(MenuText.field_gj_2011.length()));
										} else if (string_318_.startsWith(MenuText.field_gv_1970)) {
											i_319_ = 5;
											string = (string.substring(MenuText.field_gv_1970.length()));
										} else if (string_318_.startsWith(MenuText.field_gq_1972)) {
											i_319_ = 6;
											string = (string.substring(MenuText.field_gq_1972.length()));
										} else if (string_318_.startsWith(MenuText.CHAT_FX_FLASH2)) {
											i_319_ = 7;
											string = (string.substring(MenuText.CHAT_FX_FLASH2.length()));
										} else if (string_318_.startsWith(MenuText.field_gb_1901)) {
											i_319_ = 8;
											string = (string.substring(MenuText.field_gb_1901.length()));
										} else if (string_318_.startsWith(MenuText.field_gm_1978)) {
											i_319_ = 9;
											string = (string.substring(MenuText.field_gm_1978.length()));
										} else if (string_318_.startsWith(MenuText.field_ga_1980)) {
											i_319_ = 10;
											string = (string.substring(MenuText.field_ga_1980.length()));
										} else if (string_318_.startsWith(MenuText.field_gk_1822)) {
											i_319_ = 11;
											string = (string.substring(MenuText.field_gk_1822.length()));
										}
									}
									string_318_ = string.toLowerCase();
									int i_320_ = 0;
									if (string_318_.startsWith(MenuText.CHAT_FX_WAVE)) {
										i_320_ = 1;
										string = (string.substring(MenuText.CHAT_FX_WAVE.length()));
									} else if (string_318_.startsWith(MenuText.field_ge_1985)) {
										i_320_ = 2;
										string = (string.substring(MenuText.field_ge_1985.length()));
									} else if (string_318_.startsWith(MenuText.field_gs_1987)) {
										i_320_ = 3;
										string = (string.substring(MenuText.field_gs_1987.length()));
									} else if (string_318_.startsWith(MenuText.field_gh_1875)) {
										i_320_ = 4;
										string = (string.substring(MenuText.field_gh_1875.length()));
									} else if (string_318_.startsWith(MenuText.field_hc_1856)) {
										i_320_ = 5;
										string = (string.substring(MenuText.field_hc_1856.length()));
									} else if ((client.hideWorldList * -1485158959) != 0) {
										if (string_318_.startsWith(MenuText.field_gf_1984)) {
											i_320_ = 1;
											string = (string.substring(MenuText.field_gf_1984.length()));
										} else if (string_318_.startsWith(MenuText.field_gg_1986)) {
											i_320_ = 2;
											string = (string.substring(MenuText.field_gg_1986.length()));
										} else if (string_318_.startsWith(MenuText.field_gr_1883)) {
											i_320_ = 3;
											string = (string.substring(MenuText.field_gr_1883.length()));
										} else if (string_318_.startsWith(MenuText.field_hg_1990)) {
											i_320_ = 4;
											string = (string.substring(MenuText.field_hg_1990.length()));
										} else if (string_318_.startsWith(MenuText.field_hl_1992)) {
											i_320_ = 5;
											string = (string.substring(MenuText.field_hl_1992.length()));
										}
									}
									client.encryptedBuffer.writeOpcode(55);
									client.encryptedBuffer.put(0);
									final int i_321_ = (client.encryptedBuffer.position * -1485345105);
									client.encryptedBuffer.put(i_317_);
									client.encryptedBuffer.put(i_319_);
									client.encryptedBuffer.put(i_320_);
									final SecureBuffer class_dc = client.encryptedBuffer;
									final byte[] is_323_ = (Class_cj.encodeRS2String(string, (byte) 9));
									class_dc.putSmart(is_323_.length);
									class_dc.position += (Class_hk.field_n_3080.method_n_int(is_323_, 0, is_323_.length,
											class_dc.buffer, (class_dc.position * -1485345105), -475262210))
											* -685856689;
									client.encryptedBuffer.putByteAt(
											(client.encryptedBuffer.position * -1485345105) - i_321_, (byte) 56);
									continue;
								}
								if (instruction == 5009) {
									i_17_ -= 2;
									final String string = Class_ab.strStack[i_17_];
									final String string_324_ = Class_ab.strStack[1 + i_17_];
									client.encryptedBuffer.writeOpcode(171);
									client.encryptedBuffer.putShort(0);
									final int i_325_ = (client.encryptedBuffer.position * -1485345105);
									client.encryptedBuffer.putNT0String(string, (byte) -44);
									final SecureBuffer class_dc = client.encryptedBuffer;
									final byte[] is_327_ = (Class_cj.encodeRS2String(string_324_, (byte) 9));
									class_dc.putSmart(is_327_.length);
									class_dc.position += (Class_hk.field_n_3080.method_n_int(is_327_, 0, is_327_.length,
											class_dc.buffer, (-1485345105 * class_dc.position), 1414923908))
											* -685856689;
									client.encryptedBuffer.writeShortAt(
											((-1485345105 * client.encryptedBuffer.position) - i_325_), 155054767);
									continue;
								}
								if (instruction == 5015) {
									String string;
									if ((Class_ci.myPlayer != null) && (Class_ci.myPlayer.name != null)) {
										string = (Class_ci.myPlayer.name);
									} else {
										string = "";
									}
									Class_ab.strStack[i_17_++] = string;
									continue;
								}
								if (instruction == 5016) {
									Class_ab.intStack[position++] = -699653903 * client.field_lh_2908;
									continue;
								}
								if (instruction == 5017) {
									final int i_328_ = Class_ab.intStack[--position];
									Class_ab.intStack[position++] = AbstractBuffer.method_e_int(i_328_);
									continue;
								}
								if (instruction == 5018) {
									final int i_329_ = Class_ab.intStack[--position];
									final int[] is_330_ = Class_ab.intStack;
									final int i_331_ = position++;
									final GameMessage gamemessage = ((GameMessage) Class_l.gameMessagesTable
											.method_n_ga(i_329_));
									int i_332_;
									if (gamemessage == null) {
										i_332_ = -1;
									} else if (gamemessage.prev == (Class_l.field_z_1131.field_n_3036)) {
										i_332_ = -1;
									} else {
										i_332_ = (-1471797213 * (((GameMessage) gamemessage.prev).field_n_307));
									}
									is_330_[i_331_] = i_332_;
									continue;
								}
								if (instruction == 5019) {
									final int i_333_ = Class_ab.intStack[--position];
									Class_ab.intStack[position++] = Class_d.method_g_int(i_333_);
									continue;
								}
								if (instruction == 5020) {
									final String string = Class_ab.strStack[--i_17_];
									Bindable.method_i_void(string, -180974743);
									continue;
								}
								if (instruction == 5021) {
									client.field_ln_2909 = Class_ab.strStack[--i_17_].toLowerCase().trim();
									continue;
								}
								if (instruction == 5022) {
									Class_ab.strStack[i_17_++] = client.field_ln_2909;
									continue;
								}
							}
						}
						if (instruction < 5400) {
							if (instruction == 5306) {
								Class_ab.intStack[position++] = Class_dj.method_ac_int((byte) 56);
								continue;
							}
							if (instruction == 5307) {
								final int i_334_ = Class_ab.intStack[--position];
								if ((i_334_ == 1) || (i_334_ == 2)) {
									ItemContainer.method_az_void(i_334_, 1597405571);
								}
								continue;
							}
							if (instruction == 5308) {
								Class_ab.intStack[position++] = (-483902041 * (Class_w.field_pz_1501.field_e_792));
								continue;
							}
							if (instruction == 5309) {
								final int i_335_ = Class_ab.intStack[--position];
								if ((i_335_ == 1) || (i_335_ == 2)) {
									Class_w.field_pz_1501.field_e_792 = -1932223977 * i_335_;
									Class_bh.method_z_void(-840141801);
								}
								continue;
							}
						}
						if ((instruction < 5600) && (instruction == 5504)) {
							position -= 2;
							final int i_336_ = Class_ab.intStack[position];
							final int i_337_ = Class_ab.intStack[position + 1];
							if (!client.field_nf_2937) {
								client.field_ft_2707 = 1142925941 * i_336_;
								client.miniMapAngle = -1179748115 * i_337_;
							}
						} else if (instruction < 5700) {
							if (instruction == 5630) {// added for 88
								client.field_cv_2733 = 658425546;
								continue;
							}
						} else {
							if (instruction < 6300) {
								if (instruction == 6200) {
									position -= 2;
									client.field_og_2866 = (short) Class_ab.intStack[position];
									if (client.field_og_2866 <= 0) {
										client.field_og_2866 = (short) 256;
									}
									client.field_on_2785 = (short) (Class_ab.intStack[1 + position]);
									if (client.field_on_2785 <= 0) {
										client.field_on_2785 = (short) 205;
									}
									continue;
								}
								// Client Zoom
								if (instruction == 6201) {
									position -= 2;
									client.field_oq_2945 = (short) Class_ab.intStack[position];
									if (client.field_oq_2945 <= 0) {
										client.field_oq_2945 = (short) 256;
									}
									client.field_oc_2946 = (short) (Class_ab.intStack[position + 1]);
									if (client.field_oc_2946 <= 0) {
										client.field_oc_2946 = (short) 320;
									}
									//ClientSettings.changeSetting("client_zoom_1", client.field_oq_2945);
									//ClientSettings.changeSetting("client_zoom_2", client.field_oc_2946);
									continue;
								}
								if (instruction == 6202) {
									position -= 4;
									client.field_ot_2715 = (short) Class_ab.intStack[position];
									if (client.field_ot_2715 <= 0) {
										client.field_ot_2715 = (short) 1;
									}
									client.field_os_2948 = (short) (Class_ab.intStack[position + 1]);
									if (client.field_os_2948 <= 0) {
										client.field_os_2948 = (short) 32767;
									} else if (client.field_os_2948 < client.field_ot_2715) {
										client.field_os_2948 = client.field_ot_2715;
									}
									client.field_oy_2949 = (short) (Class_ab.intStack[position + 2]);
									if (client.field_oy_2949 <= 0) {
										client.field_oy_2949 = (short) 1;
									}
									client.field_ob_2813 = (short) (Class_ab.intStack[3 + position]);
									if (client.field_ob_2813 <= 0) {
										client.field_ob_2813 = (short) 32767;
									} else if (client.field_ob_2813 < client.field_oy_2949) {
										client.field_ob_2813 = client.field_oy_2949;
									}
									continue;
								}
								if (instruction == 6203) {
									if (client.field_jm_2869 != null) {
										ObjectComposite.method_ay_void(0, 0,
												1367496319 * (client.field_jm_2869.onScreenWidth),
												(client.field_jm_2869.onScreenHeight) * -1643237919, false, (byte) 94);
										Class_ab.intStack[position++] = client.field_om_2953 * 659941927;
										Class_ab.intStack[position++] = client.field_ou_2820 * 549621553;
									} else {
										Class_ab.intStack[position++] = -1;
										Class_ab.intStack[position++] = -1;
									}
									continue;
								}
								// Mousewheel zoom
								if (instruction == 6204) {
									Class_ab.intStack[position++] = client.field_oq_2945;
									Class_ab.intStack[position++] = client.field_oc_2946;
									continue;
								}
								if (instruction == 6205) {
									Class_ab.intStack[position++] = client.field_og_2866;
									Class_ab.intStack[position++] = client.field_on_2785;
									continue;
								}
							}
							if (instruction >= 6600) {
								break;
							}
							if (instruction == 6500) {
								Class_ab.intStack[position++] = method_n_boolean(65280) ? 1 : 0;
							} else if (instruction == 6501) {
								final World worldinfo = Class_dm.method_m_t((short) 1500);
								if (worldinfo != null) {
									Class_ab.intStack[position++] = -1909124507 * worldinfo.id;
									Class_ab.intStack[position++] = (worldinfo.mask * -1273754019);
									Class_ab.strStack[i_17_++] = worldinfo.activity;
									Class_ab.intStack[position++] = (worldinfo.country * 1232511885);
									Class_ab.intStack[position++] = (worldinfo.players * -318332813);
									Class_ab.strStack[i_17_++] = worldinfo.address;
								} else {
									Class_ab.intStack[position++] = -1;
									Class_ab.intStack[position++] = 0;
									Class_ab.strStack[i_17_++] = "";
									Class_ab.intStack[position++] = 0;
									Class_ab.intStack[position++] = 0;
									Class_ab.strStack[i_17_++] = "";
								}
							} else if (instruction == 6502) {
								final World worldinfo = MouseInputListener.method_a_t(1683983883);
								if (worldinfo != null) {
									Class_ab.intStack[position++] = (worldinfo.id * -1909124507);
									Class_ab.intStack[position++] = (-1273754019 * worldinfo.mask);
									Class_ab.strStack[i_17_++] = worldinfo.activity;
									Class_ab.intStack[position++] = (worldinfo.country * 1232511885);
									Class_ab.intStack[position++] = (worldinfo.players * -318332813);
									Class_ab.strStack[i_17_++] = worldinfo.address;
								} else {
									Class_ab.intStack[position++] = -1;
									Class_ab.intStack[position++] = 0;
									Class_ab.strStack[i_17_++] = "";
									Class_ab.intStack[position++] = 0;
									Class_ab.intStack[position++] = 0;
									Class_ab.strStack[i_17_++] = "";
								}
							} else if (instruction == 6506) {
								final int i_338_ = Class_ab.intStack[--position];
								World worldinfo = null;
								for (int i_339_ = 0; (i_339_ < (World.totalWorlds * 1998006609)); i_339_++) {
									if ((-1909124507 * (World.worlds[i_339_]).id) == i_338_) {
										worldinfo = World.worlds[i_339_];
										break;
									}
								}
								if (worldinfo != null) {
									Class_ab.intStack[position++] = -1909124507 * worldinfo.id;
									Class_ab.intStack[position++] = (worldinfo.mask * -1273754019);
									Class_ab.strStack[i_17_++] = worldinfo.activity;
									Class_ab.intStack[position++] = 1232511885 * (worldinfo.country);
									Class_ab.intStack[position++] = (worldinfo.players * -318332813);
									Class_ab.strStack[i_17_++] = worldinfo.address;
								} else {
									Class_ab.intStack[position++] = -1;
									Class_ab.intStack[position++] = 0;
									Class_ab.strStack[i_17_++] = "";
									Class_ab.intStack[position++] = 0;
									Class_ab.intStack[position++] = 0;
									Class_ab.strStack[i_17_++] = "";
								}
							} else if (instruction == 6507) {
								position -= 4;
								final int i_340_ = Class_ab.intStack[position];
								final boolean bool_341_ = Class_ab.intStack[1 + position] == 1;
								final int i_342_ = Class_ab.intStack[2 + position];
								final boolean bool_343_ = Class_ab.intStack[position + 3] == 1;
								Class_ay.method_y_void(i_340_, bool_341_, i_342_, bool_343_, -1173808601);
							} else {
								if (instruction != 6511) {
									break;
								}
								final int i_344_ = Class_ab.intStack[--position];
								if ((i_344_ >= 0) && (i_344_ < (1998006609 * World.totalWorlds))) {
									final World worldinfo = World.worlds[i_344_];
									Class_ab.intStack[position++] = (worldinfo.id * -1909124507);
									Class_ab.intStack[position++] = (-1273754019 * worldinfo.mask);
									Class_ab.strStack[i_17_++] = worldinfo.activity;
									Class_ab.intStack[position++] = (worldinfo.country * 1232511885);
									Class_ab.intStack[position++] = -318332813 * (worldinfo.players);
									Class_ab.strStack[i_17_++] = worldinfo.address;
								} else {
									Class_ab.intStack[position++] = -1;
									Class_ab.intStack[position++] = 0;
									Class_ab.strStack[i_17_++] = "";
									Class_ab.intStack[position++] = 0;
									Class_ab.intStack[position++] = 0;
									Class_ab.strStack[i_17_++] = "";
								}
							}
						}
					}
					throw new IllegalStateException();
				} catch (final Exception exception) {
					final StringBuilder stringbuilder = new StringBuilder(30);
					stringbuilder.append("").append(cscript.id).append(" ");
					for (int i_345_ = (Class_ab.field_a_20 * -941111507) - 1; i_345_ >= 0; i_345_--) {
						stringbuilder.append("").append(Class_ab.field_h_21[i_345_].field_n_1128.id).append(" ");
					}
					stringbuilder.append("").append(instruction);
					Class_cw.method_n_void(stringbuilder.toString(), exception, -498489243);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, new StringBuilder().append("y.n(").append(')').toString());
		}
	}

	Menu() {
		/* empty */
	}
}
