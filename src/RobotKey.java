import java.awt.Robot;
import java.awt.event.KeyEvent;

public class RobotKey {

	private Robot robot;

	public RobotKey(int key) {
		try {
			robot = new Robot();
			int k = getKey(key);
			robot.keyPress(k);
			robot.keyRelease(k);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static int getKey(int key) {
		switch (key) {
		case 1:
			return KeyEvent.VK_F1;
		case 2:
			return KeyEvent.VK_F2;
		case 3:
			return KeyEvent.VK_F3;
		case 4:
			return KeyEvent.VK_F4;
		case 5:
			return KeyEvent.VK_F5;
		}
		return 0;
	}

}
