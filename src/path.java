import java.util.Scanner;
public class path 
{
	public static void main(String[] args)
	{
		try (Scanner num = new Scanner (System.in)) {
			double x0;
			double v0;
			double t;
			final double G = 9.80665;
			System.out.println("Position is: ");
			x0 = num.nextDouble();
			System.out.println("Time is: ");
			t = num.nextDouble();
			System.out.println("Velocity is: ");
			v0 = num.nextDouble();
			double dist = ((x0 + (v0 * t) - (G * (Math.sqrt(t))) / 2));
			System.out.println(dist);
		}
	}
}
