import java.util.Scanner;
public class dates 
{
	public static void main(String[] args)
	{
		try (Scanner month = new Scanner (System.in)){
			int m;
			int d;
			Boolean cal;;
			System.out.println("Day is: ");
			d = month.nextInt();
			System.out.println("Month is: ");
			m = month.nextInt();
			cal = ((m < 6) || ((m == 6) && (d <= 20)));
			System.out.println(cal);
		}
	}
}
