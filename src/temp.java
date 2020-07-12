import java.util.Scanner;
public class temp 
{
	public static void main(String[] args)
	{
		try (Scanner data = new Scanner (System.in))
		{
			double t;
			double v;
			System.out.println("Temperature is: ");
			t = data.nextDouble();
			System.out.println("Velocity is: ");
			v = data.nextDouble();
			if ((t <= 50) && (v > 3) && (v < 120))
			{
				double w;
				w = (35.74 + (0.6215 * t) + ((0.4275 * t) - 35.75) * (Math.pow(v, 0.16)));
				System.out.println(w);
			}
			else System.out.println("Incorrect data");
		}
	}
}
