package genericUtilities;

import java.util.Random;

public class JavaUtility {
	public int getRandomNumber() {
		Random ran = new Random();
		int random = ran.nextInt(10000);
		return random;
}
}
