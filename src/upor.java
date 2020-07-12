import java.util.Scanner;
public class upor 
{
	public static void main(String[] args)
	{
		try (Scanner num = new Scanner(System.in))
		{
			double x, y, z;
			System.out.println("First number is: ");
			x = num.nextDouble();
			System.out.println("Second number is: ");
			y = num.nextDouble();
			System.out.println("Third number is: ");
			z = num.nextDouble();
			boolean por;
			por = ((x > y) && (y > z) || (z>y) && (y > x));
			System.out.println(por);
		}
	}
}
