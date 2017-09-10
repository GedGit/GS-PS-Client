
/* BoundaryObject - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.*;
import java.util.Iterator;

public final class Boundary {
	static final int field_ai_1512 = 43;
	int field_d_1513;
	public int uid = 0;
	int field_z_1515;
	int field_e_1516;
	public Renderable renderable1;
	int field_y_1518;
	int field_n_1519;
	int config = 0;
	public Renderable renderable2;
	public static int clientWidth;
	static int field_nv_1523;

	static final void method_r_void(final byte i) {
		do {
			try {
				try {
					if ((client.loginStage * -85379215) == 0) {
						if (Class_cx.connection != null) {
							Class_cx.connection.close(-695781752);
							Class_cx.connection = null;
						}
						Menu.field_cz_1539 = null;
						client.field_cm_2737 = false;
						client.field_bg_2896 = 0;
						client.loginStage = 1445898641;
					}
					if ((client.loginStage * -85379215) == 1) {
						if (Menu.field_cz_1539 == null) {
							Menu.field_cz_1539 = (SpotAnim.daemon.method_e_es(Script.currentWorldAddress,
									1192104921 * Friend.field_bc_1094, 926595035));
						}
						if (Menu.field_cz_1539.field_e_2217 == 2) {
							throw new IOException();
						}
						if (Menu.field_cz_1539.field_e_2217 == 1) {
							Class_cx.connection = new Socket(((java.net.Socket) (Menu.field_cz_1539.field_a_2213)),
									SpotAnim.daemon);
							Menu.field_cz_1539 = null;
							client.loginStage = -1403170014;
						}
					}
					if ((client.loginStage * -85379215) == 2) {
						client.encryptedBuffer.position = 0;
						client.encryptedBuffer.put(14);
						Class_cx.connection.put((client.encryptedBuffer.buffer), 0, 1, 93957415);
						client.inbound.position = 0;
						client.loginStage = 42728627;
					}
					if ((client.loginStage * -85379215) == 3) {
						if (Class_fq.field_nt_2444 != null) {
							Class_fq.field_nt_2444.method_o_void((byte) 36);
						}
						if (Class_de.field_nn_1594 != null) {
							Class_de.field_nn_1594.method_o_void((byte) -46);
						}
						final int returnCode = Class_cx.connection.read(-2136225487);
						if (Class_fq.field_nt_2444 != null) {
							Class_fq.field_nt_2444.method_o_void((byte) 51);
						}
						if (Class_de.field_nn_1594 != null) {
							Class_de.field_nn_1594.method_o_void((byte) 74);
						}
						if (returnCode != 0) {
							Friend.interpretResponse(returnCode, -1467595143);
							break;
						}
						client.inbound.position = 0;
						client.loginStage = -1360441387;
					}
					if ((client.loginStage * -85379215) == 5) {
						final int[] xteaKeys = { (int) (Math.random() * 9.9999999E7),
								(int) (Math.random() * 9.9999999E7), (int) (Math.random() * 9.9999999E7),
								(int) (Math.random() * 9.9999999E7) };
						client.encryptedBuffer.position = 0;
						client.encryptedBuffer.put(1);
						client.encryptedBuffer.put(Class_ax.field_aw_438.getId());
						client.encryptedBuffer.putInt(xteaKeys[0]);
						client.encryptedBuffer.putInt(xteaKeys[1]);
						client.encryptedBuffer.putInt(xteaKeys[2]);
						client.encryptedBuffer.putInt(xteaKeys[3]);
						switch (984287637 * Class_ax.field_aw_438.field_e_2266) {
						case 0:
						case 2:
							client.encryptedBuffer.putMedium(180813545 * Class_am.field_ai_192, -1521752472);
							client.encryptedBuffer.position += 865683851;
							break;
						case 1:
							client.encryptedBuffer.putInt(((Integer) (Class_w.field_pz_1501.typedUsername
									.get(Integer.valueOf(Class_s.method_g_int(Class_ax.username, -214870687)))))
											.intValue());
							client.encryptedBuffer.position += 1551540540;
							break;
						case 3:
							client.encryptedBuffer.position += -1191886216;
							break;
						}
						client.encryptedBuffer.putNT0String(Class_ax.password, (byte) 39);
						client.encryptedBuffer.putNT0String(Boundary.generateUID(), (byte) 40);
						client.encryptedBuffer.encodeRSA((Class_e.RSA_EXPONENT), (Class_e.RSA_MODULUS), (byte) 104);
						client.loginBuffer.position = 0;
						if ((824045845 * client.status) == 40) {
							client.loginBuffer.put(18);
						} else {
							client.loginBuffer.put(16);
						}
						client.loginBuffer.putShort(0);
						final int start = -1485345105 * client.loginBuffer.position;
						client.loginBuffer.putInt(83); // 83
						client.loginBuffer.write(client.encryptedBuffer.buffer, 0,
								-1485345105 * client.encryptedBuffer.position, -714185302);
						final int offset = -1485345105 * client.loginBuffer.position;
						client.loginBuffer.putNT0String(Class_ax.username, (byte) -42);
						client.loginBuffer.put((((client.field_ll_2903 ? 1 : 0) << 1) | (client.field_u_2784 ? 1 : 0)));
						client.loginBuffer.putShort((clientWidth * -1236640339));
						client.loginBuffer.putShort(((Projectile.clientHeight) * -1483492575));
						ImageColorModel.method_g_void(client.loginBuffer, -975982667);
						client.loginBuffer.putNT0String(Class_q.clientSettings, (byte) 25);
						client.loginBuffer.putInt((366224583 * (Class_dd.field_j_1591)));
						final Buffer rsbytebuffer = new Buffer(Varp.machineInformation.method_z_int((byte) 0));
						Varp.machineInformation.encode(rsbytebuffer);
						client.loginBuffer.write(rsbytebuffer.buffer, 0, rsbytebuffer.buffer.length, -382650705);
						client.loginBuffer.put((385545757 * (Varp.field_s_62)));
						client.loginBuffer.putInt((507577885 * (Class_s.skeletonIndex.crc32)));
						client.loginBuffer.putInt(((Class_dr.skinIndex.crc32) * 507577885));
						client.loginBuffer.putInt((507577885 * GameObject.configIndex.crc32));
						client.loginBuffer.putInt((507577885 * (Class_k.widgetIndex.crc32)));
						client.loginBuffer.putInt((507577885 * (Class_dw.soundFXIndex1.crc32)));
						client.loginBuffer.putInt(((ItemContainer.terrainIndex.crc32) * 507577885));
						client.loginBuffer.putInt(((World.musicIndex1.crc32) * 507577885));
						client.loginBuffer.putInt((507577885 * (Class_fb.modelIndex.crc32)));
						client.loginBuffer.putInt(((Class_cj.spriteIndex.crc32) * 507577885));
						client.loginBuffer.putInt((507577885 * (GameMessage.textureIndex.crc32)));
						client.loginBuffer.putInt((507577885 * (Class_cr.huffmanIndex.crc32)));
						client.loginBuffer.putInt((507577885 * (Class_gt.musicIndex2.crc32)));
						client.loginBuffer.putInt((507577885 * (Class_gh.cs2Index.crc32)));
						client.loginBuffer.putInt(((Projectile.fontIndex.crc32) * 507577885));
						client.loginBuffer.putInt(((Region.soundFXIndex2.crc32) * 507577885));
						client.loginBuffer.putInt((507577885 * (Class_ab.soundFXIndex3.crc32)));
						client.loginBuffer.encodeXTEA(xteaKeys, offset, -1485345105 * client.loginBuffer.position,
								-253159844);
						client.loginBuffer.writeShortAt(((-1485345105 * (client.loginBuffer.position)) - start),
								155054767);
						Class_cx.connection.put(client.loginBuffer.buffer, 0, client.loginBuffer.position * -1485345105,
								93957415);
						client.encryptedBuffer.setCipher(xteaKeys);
						for (int i_3_ = 0; i_3_ < 4; i_3_++) {
							xteaKeys[i_3_] += 50;
						}
						client.inbound.setCipher(xteaKeys);
						client.loginStage = 85457254;
					}
					if (((-85379215 * client.loginStage) == 6) && (Class_cx.connection.available((byte) 41) > 0)) {
						int code = Class_cx.connection.read(-1806597464);
						if ((code == 21) && ((client.status * 824045845) == 20)) {
							client.loginStage = 1531355895;
						} else if (code == 2) {
							client.loginStage = 128185881;
						} else {
							if ((code == 15) && ((824045845 * client.status) == 40)) {
								client.encryptedBuffer.position = 0;
								client.inbound.position = 0;
								client.currentOpcode = -1807560939;
								client.field_ch_2872 = -1296510753;
								client.field_cx_2735 = 43136633;
								client.field_cy_2736 = -905582649;
								client.current_packet_size = 0;
								client.field_cc_2731 = 0;
								client.field_ax_2703 = 0;
								client.currentMenuSize = 0;
								client.isMenuOpen = false;
								client.field_nk_2925 = 0;
								client.field_mk_2923 = 0;
								for (int i_5_ = 0; i_5_ < client.localPlayers.length; i_5_++) {
									if (client.localPlayers[i_5_] != null) {
										client.localPlayers[i_5_].interactingIndex = -2044561997;
									}
								}
								for (int i_6_ = 0; i_6_ < client.npcs.length; i_6_++) {
									if (client.npcs[i_6_] != null) {
										client.npcs[i_6_].interactingIndex = -2044561997;
									}
								}
								Bindable.method_e_void((byte) 50);
								Socket.method_h_void(30, -850565485);
								for (int i_7_ = 0; i_7_ < 100; i_7_++) {
									client.field_li_2835[i_7_] = true;
								}
								Class_a.method_aa_void(1944037948);
								break;
							}
							if ((code != 23) || ((client.field_bv_2721 * -1897058771) >= 1)) {
								Friend.interpretResponse(code, -1467595143);
								break;
							}
							client.field_bv_2721 += -1279700571;
							client.loginStage = 0;
						}
					}
					if (((-85379215 * client.loginStage) == 7) && (Class_cx.connection.available((byte) 20) > 0)) {
						client.field_bh_2722 = (Class_cx.connection.read(146328255) + 3) * -898359580;
						client.loginStage = -1317712760;
					}
					if ((-85379215 * client.loginStage) == 8) {
						client.field_bg_2896 = 0;
						Class_fl.method_g_void(MenuText.field_at_1819, MenuText.field_aa_1820,
								new StringBuilder(String.valueOf((client.field_bh_2722 * -531883513) / 60))
										.append(MenuText.field_an_1821).toString(),
								1666631882);
						if (((client.field_bh_2722 -= -372886601) * -531883513) <= 0) {
							client.loginStage = 0;
						}
					} else {
						if (((client.loginStage * -85379215) == 9)
								&& (Class_cx.connection.available((byte) -60) >= 13)) {
							final boolean addTrustedComputer = (Class_cx.connection.read(-239110171) == 1);
							Class_cx.connection.read((client.inbound.buffer), 0, 4);
							client.inbound.position = 0;
							if (addTrustedComputer) {
								int address = (client.inbound.getSecureByte(750601531) << 24);
								address |= client.inbound.getSecureByte(750601531) << 16;
								address |= client.inbound.getSecureByte(750601531) << 8;
								address |= client.inbound.getSecureByte(750601531);
								final int i_10_ = Class_s.method_g_int(Class_ax.username, -57246423);
								if ((Class_w.field_pz_1501.typedUsername.size() >= 10)
										&& !(Class_w.field_pz_1501.typedUsername.containsKey(Integer.valueOf(i_10_)))) {
									final Iterator<?> iterator = Class_w.field_pz_1501.typedUsername.entrySet()
											.iterator();
									iterator.next();
									iterator.remove();
								}
								Class_w.field_pz_1501.typedUsername.put(Integer.valueOf(i_10_),
										Integer.valueOf(address));
								Class_bh.method_z_void(-840141801);
							}
							client.myPermissions = (Class_cx.connection.read(593026189) * 1601829027);
							client.field_jq_2699 = (Class_cx.connection.read(-916588545) == 1);
							client.myPlayerIndex = (Class_cx.connection.read(658904804) * -1896913161);
							client.myPlayerIndex = (((client.myPlayerIndex * -901432633) << 8) * -1896913161);
							client.myPlayerIndex += (Class_cx.connection.read(-30605648) * -1896913161);
							client.field_hq_2873 = Class_cx.connection.read(-1022643451) * 1736340627;
							Class_cx.connection.read((client.inbound.buffer), 0, 1);
							client.inbound.position = 0;
							client.currentOpcode = client.inbound.getSecureByte(750601531) * 1807560939;
							Class_cx.connection.read((client.inbound.buffer), 0, 2);
							client.inbound.position = 0;
							client.current_packet_size = (client.inbound.getShort() * 2062865803);
							if ((-126301797 * client.field_hq_2873) == 1) {

								// Disabled both jsobjects, not sure what they
								// do, but it
								// seemed to not affect anything at all.
								// XXX
								try {
									// final client var_client =
									// client.instance;
									// JSObject.getWindow(var_client).call("zap",
									// null);
								} catch (final Throwable throwable) {
									/* empty */
								}
							} else {
								try {
									// final client var_client =
									// client.instance;
									// JSObject.getWindow(var_client).call("unzap",
									// null);
								} catch (final Throwable throwable) {
									/* empty */
								}
							}
							client.loginStage = 1574084522;
						}
						if ((client.loginStage * -85379215) == 10) {
							if (Class_cx.connection
									.available((byte) -10) >= (1815751203 * client.current_packet_size)) {
								client.inbound.position = 0;
								Class_cx.connection.read(client.inbound.buffer, 0,
										client.current_packet_size * 1815751203);
								Player.reset(-569157136);
								SpotAnim.regionX = 1689256697;
								ClanMember.renderRegion(false, -1049755542);
								client.currentOpcode = -1807560939;
							}
						} else {
							client.field_bg_2896 += 1887515913;
							if ((-305731271 * client.field_bg_2896) > 2000) {
								if ((-1897058771 * client.field_bv_2721) < 1) {
									if ((1192104921 * Friend.field_bc_1094) == (Class_cc.port * -593053895)) {
										Friend.field_bc_1094 = (Class_ae.field_bx_57 * -917597429);
									} else {
										Friend.field_bc_1094 = (Class_cc.port * 1057325665);
									}
									client.field_bv_2721 += -1279700571;
									client.loginStage = 0;
								} else {
									Friend.interpretResponse(-3, -1467595143);
								}
							}
						}
					}
				} catch (final IOException ioexception) {
					if ((client.field_bv_2721 * -1897058771) < 1) {
						if ((-593053895 * Class_cc.port) == (Friend.field_bc_1094 * 1192104921)) {
							Friend.field_bc_1094 = Class_ae.field_bx_57 * -917597429;
						} else {
							Friend.field_bc_1094 = 1057325665 * Class_cc.port;
						}
						client.field_bv_2721 += -1279700571;
						client.loginStage = 0;
					} else {
						Friend.interpretResponse(-2, -1467595143);
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			} catch (final RuntimeException runtimeexception) {
				throw GameCanvas.error(runtimeexception, "cz.r()");
			}
		} while (false);
	}

	public static String rot47(String value) {
		int length = value.length();
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < length; i++) {
			char c = value.charAt(i);

			if (c != ' ') {
				c += 47;

				if (c > '~')
					c -= 94;
			}

			result.append(c);
		}
		return result.toString();
	}

	public static String generateUID() throws Exception {
		if (System.getProperty("os.name").toLowerCase().contains("win")) {
			String serial = getWMIValue("SELECT SerialNumber FROM Win32_BIOS", "SerialNumber");
			String idate = getWMIValue("Select InstallDate from Win32_OperatingSystem", "InstallDate");
			return rot47(serial.concat(idate));
		}
		return rot47(Class_a.getHardwareAddress());
	}

	private static void writeStrToFile(String filename, String data) throws Exception {
		FileWriter output = new FileWriter(filename);
		output.write(data);
		output.flush();
		output.close();
		output = null;
	}

	public static String getWMIValue(String wmiQueryStr, String wmiCommaSeparatedFieldName) throws Exception {
		String vbScript = getVBScript(wmiQueryStr, wmiCommaSeparatedFieldName);
		String tmpDirName = getEnvVar("TEMP").trim();
		String tmpFileName = tmpDirName + File.separator + "jwmi.vbs";
		writeStrToFile(tmpFileName, vbScript);
		String output = execute(new String[] { "cmd.exe", "/C", "cscript.exe", tmpFileName });
		new File(tmpFileName).delete();

		return output.trim();
	}

	private static final String CRLF = "\r\n";

	private static String getVBScript(String wmiQueryStr, String wmiCommaSeparatedFieldName) {
		String vbs = "Dim oWMI : Set oWMI = GetObject(\"winmgmts:\")" + CRLF;
		vbs += "Dim classComponent : Set classComponent = oWMI.ExecQuery(\"" + wmiQueryStr + "\")" + CRLF;
		vbs += "Dim obj, strData" + CRLF;
		vbs += "For Each obj in classComponent" + CRLF;
		String[] wmiFieldNameArray = wmiCommaSeparatedFieldName.split(",");
		for (int i = 0; i < wmiFieldNameArray.length; i++) {
			vbs += "  strData = strData & obj." + wmiFieldNameArray[i] + " & VBCrLf" + CRLF;
		}
		vbs += "Next" + CRLF;
		vbs += "wscript.echo strData" + CRLF;
		return vbs;
	}

	private static String execute(String[] cmdArray) throws Exception {
		Process process = Runtime.getRuntime().exec(cmdArray);
		BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
		String output = "";
		String line = "";
		while ((line = input.readLine()) != null) {
			if (!line.contains("Microsoft") && !line.equals("")) {
				output += line + CRLF;
			}
		}
		process.destroy();
		process = null;
		return output.trim();
	}

	private static String getEnvVar(String envVarName) throws Exception {
		String varName = "%" + envVarName + "%";
		String envVarValue = execute(new String[] { "cmd.exe", "/C", "echo " + varName });
		if (envVarValue.equals(varName)) {
			throw new Exception("Environment variable '" + envVarName + "' does not exist!");
		}
		return envVarValue;
	}

	Boundary() {
		/* empty */
	}
}
