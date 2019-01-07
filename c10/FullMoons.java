import java.util.*;

class FullMoons {
	static int DAY_IM = 1000 * 60 * 60 * 24;

	public static void main(String[] args) {
		Calendar c =  Calendar.getInstance(TimeZone.getTimeZone("MST"));
		c.set(2004,0,7,15,40);
		long day1 = c.getTimeInMillis();
		
		for (int i = 0; i < 3; i++) {
			day1 += (DAY_IM  * 29.52);
			c.setTimeInMillis(day1);
			System.out.println(String.format("Полнолуние было в %tc", c));
		}
	}
}