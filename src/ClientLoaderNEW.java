
import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.KeyboardFocusManager;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.Properties;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ColorUIResource;

import loader.AppletStubContext;

/**
 * The main applet class for those who cannot read :P
 * 
 * @author Vichy
 */
public class ClientLoaderNEW implements ActionListener {

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
	 * Our jpanel for the menu bar
	 */
	private JPanel menuPanel;

	/**
	 * The thing that starts the app :O
	 * 
	 * @param args
	 *            arguments given
	 */
	public static void main(final String[] args) {
		new ClientLoaderNEW(1); // 1 is world id
	}

	/**
	 * Initiating the client with all parameters we've set. World bits(Param 4)
	 * 
	 * default: 0; deadman 536870913; pvp: 1029; bounty hunter: 33; tournament:
	 * 33554433
	 */
	public ClientLoaderNEW(final int var1) {
		try {
			WORLD_ID = var1;
			client_parameters.put("11", "false");
			client_parameters.put("image", "http://www.runescape.com/img/rsp777/oldschool_ani.gif");
			client_parameters.put("12", "1"); // world id
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
			client_parameters.put("4", "0"); // world type param
			client_parameters.put("centerimage", "true");
			client_parameters.put("5", "0");
			client_parameters.put("6", "");
			client_parameters.put("7", "0");
			client_parameters.put("8", "true");
			client_parameters.put("9", "5");
			client_parameters.put("boxborder", "false");
			client_parameters.put("10", ".runescape.com");

			final AppletStubContext stub = AppletStubContext.create(client_parameters,
					new URL("http://" + Settings.IP));
			final Applet app = (Applet) Class.forName("client").newInstance(); 
			app.setStub(stub);
			app.init();
			app.start();

			app.setPreferredSize(Settings.LOCAL_HOST ? new Dimension(1200, 703) : new Dimension(755, 504));

			JPopupMenu.setDefaultLightWeightPopupEnabled(false);

			UIManager.put("InternalFrame.activeTitleBackground", new ColorUIResource(Color.black));
			UIManager.put("InternalFrame.activeTitleForeground", new ColorUIResource(Color.WHITE));
			UIManager.put("InternalFrame.titleFont", new Font("Dialog", Font.PLAIN, 11));

			frame = new JFrame(Settings.NAME);
			frame.setLayout(new BorderLayout());

			try {
				if (!Settings.LOCAL_HOST) {
					URL localURL = new URL("http://salve-ps.com/favicon.png");
					BufferedImage localBufferedImage = ImageIO.read(localURL);
					frame.setIconImage(localBufferedImage);
				} else {
					Image icon = Toolkit.getDefaultToolkit().getImage("./favicon.png");
					frame.setIconImage(icon);
				}
			} catch (Exception localException) {
				Image icon = Toolkit.getDefaultToolkit().getImage("./favicon.png");
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
					int userPrompt = JOptionPane.showOptionDialog(null, "Are you sure you wish to exit?", Settings.NAME,
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

			/*
			 * Initialize our menu bar to be displayed on top
			 */
			initializeMenuBar();

			frame.pack();

			frame.setVisible(true);

			frame.setLocationRelativeTo(null);

		} catch (final Exception var4) {
			var4.printStackTrace();
		}

	}

	/**
	 * Initializes the menu bar
	 */
	public void initializeMenuBar() {

		/*
		 * Initialize our menu panel to hold our menu buttons
		 */
		menuPanel = new JPanel();

		/*
		 * Set the menu panel as non focusable
		 */
		menuPanel.setFocusable(false);

		/*
		 * Disable focus traversal keys
		 */
		menuPanel.setFocusTraversalKeysEnabled(false);

		menuPanel.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, null);
		menuPanel.setFocusTraversalKeys(KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS, null);

		/*
		 * Create our buttons
		 */
		JButton homeButton = createButton("Website", "home_icon.png", "Open the " + Settings.NAME + " homepage.");
		JButton forumButton = createButton("Forums", "forum_icon.png", "Open the " + Settings.NAME + " forums.");
		JButton storeButton = createButton("Donate", "store_icon.png",
				"Open the official " + Settings.NAME + " store.");
		JButton voteButton = createButton("Vote", "vote_icon.png",
				"Open the official " + Settings.NAME + " voting page.");
		JButton hiscoresButton = createButton("Hiscores", "hiscore_icon.png",
				"Open the official " + Settings.NAME + " Hiscores.");
		JButton updatesButton = createButton("Updates", "updates_icon.png",
				"View all server updates!.");
		JButton discordButton = createButton("Discord", "discord_icon.png",
				"Open the official " + Settings.NAME + " Discord channel.");

		/*
		 * Add our buttons to the menu panel
		 */
		menuPanel.add(homeButton);
		menuPanel.add(forumButton);
		menuPanel.add(storeButton);
		menuPanel.add(voteButton);
		menuPanel.add(hiscoresButton);
		menuPanel.add(updatesButton);
		menuPanel.add(discordButton);

		/*
		 * Add our menu panel to our frame
		 */
		frame.getContentPane().add(menuPanel, BorderLayout.NORTH);
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
		BufferedImage bufferedImage = ImageIO.read(ClientLoaderNEW.class.getResourceAsStream("/" + file));
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
		InputStream is = ClientLoaderNEW.class.getResourceAsStream("/" + file);
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
		GameObject.browseURL(URL, true, false, -1);
	}

	/**
	 * The action listener for the menu panel buttons
	 */
	@Override
	public void actionPerformed(ActionEvent evt) {
		String cmd = evt.getActionCommand();
		try {
			if (cmd != null) {
				System.out.println("Opening " + cmd + "...");
				switch (cmd) {
				case "Website":
					openURL("http://salve-ps.com");
					break;
				case "Forums":
					openURL("http://community.salve-ps.com");
					break;
				case "Donate":
					openURL("http://salve-ps.com/store");
					break;
				case "Hiscores":
					openURL("http://salve-ps.com/hiscores");
					break;
				case "Vote":
					openURL("http://salve-ps.com/vote");
					break;
				case "Discord":
					openURL("https://discord.gg/2Km8jKs");
					break;
				case "Updates":
					openURL("http://community.salve-ps.com/index.php?/forum/4-salve-updates/");
					break;
				}

			}
		} catch (Exception e) {
		}
	}

	/**
	 * Creates a button on the menu panel
	 * 
	 * @param title
	 *            The Title of the button
	 * @param image
	 *            The image to display
	 * @param tooltip
	 *            The tooltip when hovering over the button
	 * @return The created button
	 */
	private JButton createButton(String title, String image, String tooltip) {
		final JButton button = new JButton(title);
		if (image != null) {
			Image img = ResourceLoader.loadImage(image);
			if (img != null) {
				ImageIcon icon = new ImageIcon(img);
				if (icon != null)
					button.setIcon(icon);
			}
		}
		button.addActionListener(this);
		if (tooltip != null)
			button.setToolTipText(tooltip);
		button.setFocusable(false);
		button.setContentAreaFilled(false);
		button.setFont(new Font("Dialog", Font.PLAIN, 11));
		button.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button.setForeground(Color.BLACK);
		button.setBorder(new EmptyBorder(1, 1, 3, 1));
		button.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				button.setContentAreaFilled(true);
				button.setBackground(Color.decode("0xd7e5f1"));
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				button.setBackground(UIManager.getColor("control"));
				button.setContentAreaFilled(false);
			}
		});
		return button;
	}
}