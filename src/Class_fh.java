/* Class_fh - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class Class_fh {
	public static final int field_d_2356 = 9;
	static final int field_y_2357 = 3;

	Class_fh() throws Throwable {
		throw new Error();
	}

	static final int getLoginCode(final long l, final String string, final int i) {
		do {
			try {
				final Random random = new Random();
				final Buffer rsbytebuffer = new Buffer(128);
				final Buffer rsbytebuffer_0_ = new Buffer(128);
				final int[]  is = { random.nextInt(), random.nextInt(), (int) (l >> 32), (int) l };
				rsbytebuffer.put(10);
				for (int i_1_ = 0; i_1_ < 4; i_1_++) {
					rsbytebuffer.putInt(random.nextInt());
				}
				rsbytebuffer.putInt(is[0]);
				rsbytebuffer.putInt(is[1]);//where tf did that class go
				rsbytebuffer.putWord64(l);//so this isnt the login block?
				rsbytebuffer.putWord64(0L);//gonna rename these in buffer?
				for (int i_2_ = 0; i_2_ < 4; i_2_++) {
					rsbytebuffer.putInt(random.nextInt());
				}
				rsbytebuffer.encodeRSA(Class_h.field_e_1025, Class_h.field_g_1021, (byte) 104);
				rsbytebuffer_0_.put(10);
				for (int i_3_ = 0; i_3_ < 3; i_3_++) {
					rsbytebuffer_0_.putInt(random.nextInt());
				}
				rsbytebuffer_0_.putWord64(random.nextLong());
				rsbytebuffer_0_.method_g_void(random.nextLong());// tbh idk what this is lol, maybe its putWord64 and other is osmething else, im confused gotta look at other buffer after
				ImageColorModel.method_g_void(rsbytebuffer_0_, -1424606021);
				rsbytebuffer_0_.putWord64(random.nextLong());
				rsbytebuffer_0_.encodeRSA(Class_h.field_e_1025, Class_h.field_g_1021, (byte) 104);
				int i_4_ = Class_cl.getStringLength(string, (byte) 1);
				if ((i_4_ % 8) != 0) {// lol no idea what this buffer is for
					i_4_ += 8 - (i_4_ % 8);
				}
				final Buffer rsbytebuffer_5_ = new Buffer(i_4_);
				rsbytebuffer_5_.putNT0String(string, (byte) 25);
				rsbytebuffer_5_.position = -685856689 * i_4_;
				rsbytebuffer_5_.decodeXTEA(is, -1350765221);
				Buffer rsbytebuffer_6_ = (new Buffer((rsbytebuffer_5_.position * -1485345105) + (rsbytebuffer_0_.position * -1485345105) + (rsbytebuffer.position * -1485345105) + 5));
				rsbytebuffer_6_.put(2);
				rsbytebuffer_6_.put((-1485345105 * rsbytebuffer.position));
				rsbytebuffer_6_.write(rsbytebuffer.buffer, 0, (-1485345105 * rsbytebuffer.position), -169177086);
				rsbytebuffer_6_.put((rsbytebuffer_0_.position * -1485345105));
				rsbytebuffer_6_.write(rsbytebuffer_0_.buffer, 0, (-1485345105 * rsbytebuffer_0_.position), -1169309740);
				rsbytebuffer_6_.putShort((rsbytebuffer_5_.position * -1485345105));
				rsbytebuffer_6_.write(rsbytebuffer_5_.buffer, 0, (-1485345105 * rsbytebuffer_5_.position), 697156069);
				final byte[] is_7_ = rsbytebuffer_6_.buffer;
				final String string_8_ = Class_dg.method_n_String(is_7_, 0, is_7_.length, -1803111322);
				final String string_9_ = string_8_;
				try {
					final URL url = new URL("");
					GameObject.browseURL("http://community.salve-ps.com/index.php?app=core&module=global&section=lostpass", true, false, -1043454110);
					final URLConnection urlconnection = url.openConnection();
					urlconnection.setDoInput(true);
					urlconnection.setDoOutput(true);
					urlconnection.setConnectTimeout(5000);
					final OutputStreamWriter outputstreamwriter = new OutputStreamWriter(urlconnection.getOutputStream());
					outputstreamwriter.write(new StringBuilder("data2=").append(ImageColorModel.method_n_String(string_9_, 1590292814)).append("&dest=").append(ImageColorModel.method_n_String("passwordchoice.ws", 2121907766)).toString());
					outputstreamwriter.flush();
					final InputStream inputstream = urlconnection.getInputStream();
					rsbytebuffer_6_ = new Buffer(new byte[1000]);
					do {
						final int i_10_ = inputstream.read(rsbytebuffer_6_.buffer, (rsbytebuffer_6_.position * -1485345105), 1000 - (-1485345105 * (rsbytebuffer_6_.position)));
						if (i_10_ == -1) {
							outputstreamwriter.close();
							inputstream.close();
							String string_11_ = new String(rsbytebuffer_6_.buffer);
							if (string_11_.startsWith("OFFLINE")) {
								return 4;
							}
							if (string_11_.startsWith("WRONG")) {
								return 7;
							}
							if (string_11_.startsWith("RELOAD")) {
								return 3;
							}
							if (string_11_.startsWith("Not permitted for social network accounts.")) {
								return 6;
							}
							rsbytebuffer_6_.method_ac_void(is, (byte) 14);
							for (/**/; (((-1485345105 * rsbytebuffer_6_.position) > 0) && ((rsbytebuffer_6_.buffer[(-1485345105 * rsbytebuffer_6_.position) - 1]) == 0)); rsbytebuffer_6_.position -= -685856689) {
								/* empty */
							}
							string_11_ = new String(rsbytebuffer_6_.buffer, 0, (rsbytebuffer_6_.position * -1485345105));
							boolean bool;
							do {
								if (string_11_ == null) {
									bool = false;
								} else {
									try {
										new URL(string_11_);
									} catch (final MalformedURLException malformedurlexception) {
										bool = false;
										break;
									}
									bool = true;
								}
							} while (false);
							if (bool) {
								GameObject.browseURL(string_11_, true, false, -1609740179);
								return 2;
							}
							return 5;
						}
						rsbytebuffer_6_.position += i_10_ * -685856689;
					} while ((rsbytebuffer_6_.position * -1485345105) < 1000);
				} catch (final Throwable throwable) {
					throwable.printStackTrace();
					break;
				}
				return 5;
			} catch (final RuntimeException runtimeexception) {
				throw GameCanvas.error(runtimeexception, "fh.d()");
			}
		} while (false);
		return 5;
	}
}
