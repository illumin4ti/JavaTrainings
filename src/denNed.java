import java.util.Scanner;
public class denNed 
{
	public static void main(String[] args)
	{
		try (Scanner data = new Scanner(System.in))
		{
			int d, m, y, dn;
			System.out.println("Day is: ");
			d = data.nextInt();
			System.out.println("Month is: ");
			m = data.nextInt();
			System.out.println("Year is: ");
			y = data.nextInt();
			if ((d > 1) && (d < 30) && (m > 1) && (m <12) || (y % 4 == 0) && (m == 2) && (d > 1) && (d <=29) || (d > 1) && (d <= 31) && (m == 1) ||  (d > 1) && (d <= 31) && (m == 3) ||  (d > 1) && (d <= 31) && (m == 5) ||  (d > 1) && (d <= 31) && (m == 7) ||  (d > 1) && (d <= 31) && (m == 8) ||  (d > 1) && (d <= 31) && (m == 10) ||  (d > 1) && (d <= 31) && (m == 12) || (y % 4 == 0) && (m == 1) && (d > 1) && (d <=31) || (y % 4 == 0) && (m == 3) && (d > 1) && (d <=31) || (y % 4 == 0) && (m == 5) && (d > 1) && (d <=31) || (y % 4 == 0) && (m == 7) && (d > 1) && (d <=31) || (y % 4 == 0) && (m == 7) && (d > 1) && (d <=31) || (y % 4 == 0) && (m == 8) && (d > 1) && (d <=31) || (y % 4 == 0) && (m == 10) && (d > 1) && (d <=31) || ((y % 4 == 0) && (m == 12) && (d > 1) && (d <=31)));
			{
				int y0 = (y - (14 - m) / 12);
				int x = ((y0 + y0) / (4 - y0) / (100 + y0) / 400);
				int m0 = ((m + 12) * ((14 - m) / 12) - 2);
				dn = (d + x + (31 * m0) / 12 % 7);
			}
			if (dn == 1)
			{
				System.out.println("Monday");
			}
			else if (dn == 2)
			{
				System.out.println("Tuesday");
			}
			else if (dn == 3)
			{
				System.out.println("Wendesday");
			}
			else if (dn == 4)
			{
				System.out.println("Thursday");
			}
			else if (dn == 5)
			{
				System.out.println("Friday");
			}
			else if (dn == 6)
			{
				System.out.println("Saturday");
			}
			else if (dn == 0)
			{
				System.out.println("Sunday");
			}
		}
	}
}
