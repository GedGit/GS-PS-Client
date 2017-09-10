
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.*;
import java.net.URL;
import java.util.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;

import loader.AppletStubContext;

/**
 * The main applet class for those who cannot read :P
 * 
 * @author Vichy
 */
public class ClientLoaderOLD {

	/**
	 * Naming our client 
	 */
	public static final String NAME = "Salve-PS";

	/**
	 * And an IP to connect to..
	 */
	public static String IP = Settings.LOCAL_HOST ? "127.0.0.1" : "144.217.242.115"; 

	/**
	 * Should we hide the world list?
	 */
	public static final int WORLD_LIST = 1; // 0 enabled / 1 disabled

	/**
	 * Defining the client parameters via properties
	 */
	public static Properties client_parameters = new Properties();

	/**
	 * World ID
	 */
	public static int WORLD_ID;

	/**
	 * Initiating the Java frame
	 */
	public JFrame frame;

	/**
	 * The thing that starts the app :O
	 * 
	 * @param args
	 *            arguments given
	 */
	public static void main(final String[] args) {
		new ClientLoaderOLD(1); // 1 is world id
	}

	/**
	 * World bits(Param 4)
	 * 
	 * Default; 0
	 * 
	 * Deadman; 536870913
	 * 
	 * PvP; 1029
	 * 
	 * Bounty Hunter; 33
	 * 
	 * Tournament world; 33554433
	 */
	public ClientLoaderOLD(final int var1) {
		try {
			WORLD_ID = var1;
			client_parameters.put("11", "false");
			client_parameters.put("image", "http://www.runescape.com/img/rsp777/oldschool_ani.gif");
			client_parameters.put("12", "1"); // wid
			client_parameters.put("13", "ElZAIrq5NpKN6D3mDdihco3oPeYN2KFy2DCquj7JMmECPmLrDP3Bnw");
			client_parameters.put("code", "client.class");
			client_parameters.put("14", "true");
			client_parameters.put("15", "0");
			client_parameters.put("archive", "gamepack_2039435.jar");
			client_parameters.put("java_arguments",
					"-Xmx256m -Xss2m -Dsun.java2d.noddraw=true -XX:CompileThreshold=1500 -Xincgc -XX:+UseConcMarkSweepGC -XX:+UseParNewGC");
			client_parameters.put("separate_jvm", "true");
			client_parameters.put("haveie6", "true");
			client_parameters.put("boxbgcolor", "black");
			client_parameters.put("1", "0");
			client_parameters.put("2", String.valueOf(Settings.PORT));
			client_parameters.put("3", "http://127.0.0.1:8080/");// worldlist.ws
			client_parameters.put("4", "33");// 0 33
			client_parameters.put("centerimage", "true");
			client_parameters.put("5", "0");
			client_parameters.put("6", "");
			client_parameters.put("7", "0");
			client_parameters.put("8", "true");
			client_parameters.put("9", "5");
			client_parameters.put("boxborder", "false");
			client_parameters.put("10", ".runescape.com");

			final AppletStubContext stub = AppletStubContext.create(client_parameters, new URL("http://" + IP));
			final Applet app = (Applet) Class.forName("client").newInstance();
			app.setStub(stub);
			app.init();
			app.start();

			app.setPreferredSize(Settings.LOCAL_HOST ? new Dimension(1200, 703) : new Dimension(755, 504));

			/*
			 * Initialize our look and feel
			 */
			// UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			// JFrame.setDefaultLookAndFeelDecorated(true);
			JPopupMenu.setDefaultLightWeightPopupEnabled(false);

			UIManager.put("InternalFrame.activeTitleBackground", new ColorUIResource(Color.black));
			UIManager.put("InternalFrame.activeTitleForeground", new ColorUIResource(Color.WHITE));
			UIManager.put("InternalFrame.titleFont", new Font("Dialog", Font.PLAIN, 11));

			frame = new JFrame(NAME);
			frame.setLayout(new BorderLayout());

			try {
				if (!Settings.LOCAL_HOST) {
					URL localURL = new URL("http://salve-ps.com/favicon.png");
					BufferedImage localBufferedImage = ImageIO.read(localURL);
					frame.setIconImage(localBufferedImage);
				} else {
					Image icon = Toolkit.getDefaultToolkit().getImage("favicon.png");
					frame.setIconImage(icon);
				}
			} catch (Exception localException) {
				Image icon = Toolkit.getDefaultToolkit().getImage("favicon.png");
				frame.setIconImage(icon);
			}

			frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

			/*
			 * Add our window listener to check when the x is clicked
			 */
			frame.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent we) {
					String options[] = { "Yes", "No" };
					int userPrompt = JOptionPane.showOptionDialog(null, "Are you sure you wish to exit?", NAME,
							JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]);
					if (userPrompt == JOptionPane.YES_OPTION)
						System.exit(0);
				}

				@Override
				public void windowGainedFocus(WindowEvent e) {
					frame.requestFocusInWindow();
					frame.requestFocus();
				}

			});

			frame.getContentPane().add(app, "Center");

			frame.pack();

			frame.setVisible(true);

			frame.setLocationRelativeTo(null);

		} catch (final Exception var4) {
			var4.printStackTrace();
		}

	}

	/**
	 * Loads custom sprites.
	 * 
	 * @param file
	 *            the sprite file
	 * @return the sprite
	 * @throws IOException
	 *             if doesn't exist / can't load
	 */
	public static Sprite loadSprite(String file) throws IOException {
		Sprite sprite = new Sprite();
		BufferedImage bufferedImage = ImageIO.read(ClientLoaderOLD.class.getResourceAsStream("/" + file));
		sprite.spriteWidth = sprite.field_z_533 = bufferedImage.getWidth();
		sprite.spriteHeight = sprite.field_y_534 = bufferedImage.getHeight();
		sprite.field_e_535 = sprite.field_g_537 = 0;
		int[] size = new int[bufferedImage.getWidth() * bufferedImage.getHeight()];
		bufferedImage.getRGB(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), size, 0,
				bufferedImage.getWidth());
		sprite.field_n_531 = new byte[bufferedImage.getWidth() * bufferedImage.getHeight()];
		sprite.field_d_538 = new int[255];
		byte var4 = 0;
		int var8 = var4 + 1;
		sprite.field_d_538[var4] = 1;

		for (int var5 = 0; var5 < sprite.field_n_531.length; ++var5) {
			int var6 = size[var5] & 16777215;
			if (var6 == 16711935)
				sprite.field_n_531[var5] = 0;
			else {
				int var7 = Arrays.binarySearch(sprite.field_d_538, var6);
				if (var7 < 0) {
					var7 = var8;
					sprite.field_d_538[var8++] = var6;
				}
				sprite.field_n_531[var5] = (byte) var7;
			}
		}
		return sprite;
	}

	/**
	 * Reads an array of bytes
	 * 
	 * @param file
	 *            the file to read from
	 * @return the bytes array
	 */
	public static byte[] loadBytes(String file) {
		InputStream is = ClientLoaderOLD.class.getResourceAsStream("/" + file);
		try {
			return getBytesFromInputStream(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;

	}

	/**
	 * Reads byte array from the input stream
	 * 
	 * @param is
	 *            the inputstream
	 * @return the byte array
	 * @throws IOException
	 *             if can't read
	 */
	public static byte[] getBytesFromInputStream(InputStream is) throws IOException {
		try (ByteArrayOutputStream os = new ByteArrayOutputStream();) {
			byte[] buffer = new byte[0xFFFF];
			for (int len; (len = is.read(buffer)) != -1;)
				os.write(buffer, 0, len);
			os.flush();
			return os.toByteArray();
		}
	}

	/**
	 * ----------------------------- WARNING ---------------------------- To add
	 * more sprites - place new image names IN FRONT of every other sprite. else
	 * you'll be in big trouble ;).
	 */
	public static String[] chat_icons = new String[] { "announcementBlue", "announcementRed", "bloodMoney", "bounty1",
			"bounty2", "bounty3", "bounty4", "bounty5", "bountyHiscore", "clue_scroll", "youtuber", "donator1",
			"donator2", "donator3", "donator4", "donator5", "donator6", "grand_exchange", "helper", "kills", "pet_icon",
			"play_time", "players_on", "question", "shield", "skotizo", "skull", "slayer_icon", "sword", "tele_icon",
			"vote_ticket", "youtuber" };

	/**
	 * Opens the web browser with a specified URL
	 * 
	 * @param URL
	 *            the URL to open
	 */
	public void openURL(String URL) {
		GameObject.browseURL(URL, true, false, -434578785);
	}
}