import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Hashtable;

/**
 * The settings class will manage all settings stored by the client. The client
 * will refer to, change, and remove settings as it needs to. Adding a new
 * client setting is extremely easy and changing them is even easier due to the
 * fact that the Settings class will remove old or nulled settings still stored
 * in the settings file, and it verifies each setting to make sure it's a
 * legitimate setting (to check if you still require the usage of that setting).
 * 
 * @author Galkon
 *
 */
public class ClientSettings {

	/**
	 * The settings stored created and stored by the client.
	 */
	public static Hashtable<String, Object> settings = new Hashtable<String, Object>();

	/**
	 * The values of the settings.
	 */
	public static Object[][] settingValues = {

			{ "client_zoom_1", client.field_oq_2945 }, { "client_zoom_2", client.field_oc_2946 } };

	/**
	 * Creates a setting for the specified name and object.
	 * 
	 * @param name
	 * @param object
	 */
	public static void createSetting(String name, Object object) {
		if (!verify(name)) {
			return;
		}
		settings.put(name, (short) object);
	}

	/**
	 * Returns the object for the specified name.
	 * 
	 * @param name
	 * @return
	 */
	public static Object getSetting(String name) {
		if (!verify(name)) {
			return null;
		}
		return settings.get(name);
	}

	/**
	 * Changes the specified setting by removing it then re-adding the new values.
	 * 
	 * @param name
	 * @param object
	 */
	public static void changeSetting(String name, Object object) {
		if (!verify(name)) {
			return;
		}
		settings.remove(name);
		settings.put(name, (short) object);
		System.out.println("changing client setting "+name+" to "+(short) object);
		save();
	}

	/**
	 * Toggles the specified setting (only works for booleans).
	 * 
	 * @param name
	 */
	public static void toggleSetting(String name) {
		if (settings.get(name) instanceof Boolean) {
			changeSetting(name, !(Boolean) settings.get(name));
		}
	}

	/**
	 * Verifies that the specified name is a defined setting.
	 * 
	 * @param name
	 * @return
	 */
	public static boolean verify(String name) {
		for (int index = 0; index < settingValues.length; index++) {
			String nameValue = (String) settingValues[index][0];
			if (nameValue.equalsIgnoreCase(name)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Creates the default settings.
	 */
	public static void createDefaults() {
		for (int index = 0; index < settingValues.length; index++) {
			createSetting((String) settingValues[index][0], settingValues[index][1]);
		}
		save();
	}
	
	public static boolean isLoaded = false;

	/**
	 * Loads and creates the settings from the settings file.
	 */
	public static void load() {
		try {
			if (!new File(Class_ed.cache_dir + "/Salve-PS/" + FILE).exists()) {
				createDefaults();
				return;
			}
			RandomAccessFile in = new RandomAccessFile(Class_ed.cache_dir + "/Salve-PS/" + FILE, "rw");
			int size = in.readShort();
			if (size != settingValues.length) {
				createDefaults();
			}
			if (!isLoaded)
				isLoaded = true;
			for (int index = 0; index < size; index++) {
				String name = in.readUTF();
				Object object = null;
				int type = in.readByte();
				if (type == 0) {
					object = in.readBoolean();
				} else if (type == 1) {
					object = in.readShort();
				} else if (type == 2) {
					object = in.readUTF();
				}
				if (size == settingValues.length) {
					createSetting(name, object);
				} else {
					changeSetting(name, object);
				}
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Saves the settings to the settings file.
	 */
	public static void save() {
		try {
			RandomAccessFile out = new RandomAccessFile(Class_ed.cache_dir + "/Salve-PS/" + FILE, "rw");
			out.writeShort(settings.size());
			for (int index = 0; index < settingValues.length; index++) {
				String name = (String) settingValues[index][0];
				Object object = settings.get(name);
				if (object == null) {
					object = settingValues[index][1];
				}
				out.writeUTF(name);
				if (object instanceof Boolean) {
					out.writeByte(0);
					out.writeBoolean((Boolean) object);
				} else if (object instanceof Short) {
					out.writeByte(1);
					out.writeInt((short) object);
				} else if (object instanceof String) {
					out.writeByte(2);
					out.writeUTF((String) object);
				}
			}
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * The settings file name.
	 */
	public final static String FILE = "settings";

}