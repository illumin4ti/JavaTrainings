import java.util.Scanner;
public class Maskify {
    public static String maskify(String str) {
    	try (Scanner number = new Scanner(System.in)) {
			String cardNumber = number.next();
			char[] cN = new char [cardNumber.length()];
			for (int i = 0; i < cardNumber.length(); i++) {
				cN[i] = str.charAt(i);
			}
			for (int i = 0; i < (cardNumber.length() - 3); i++) {
				cN[i] = '#';
			}
			System.out.println(cardNumber);
			String maskNumber = new String(cN);
			System.out.println(maskNumber);
		}
    	throw new UnsupportedOperationException("Unimplemented");
    }
}
