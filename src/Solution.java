import java.util.Scanner;
public class Solution {
    public static String repeatStr(final int repeat, final String string) {
     
        try (Scanner xyu = new Scanner(System.in)) {
			int count = xyu.nextInt();
			String scr = xyu.next();
			for (int i = 0; i < count; i++) {
				System.out.println(scr);
			}
			return scr;
		}
    }
}