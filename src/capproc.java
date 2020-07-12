import java.util.Scanner;
public class capproc 
{
	public static void main(String[] args)
	{
		try (Scanner mpt = new Scanner (System.in))
		{
			int t;
			double p;
			double r;
			double cap;
			System.out.println("Ну че там с деньгами?: ");
			p = mpt.nextDouble();
			System.out.println("На сколько лет: ");
			t = mpt.nextInt();
			System.out.println("Какой процент: ");
			r = mpt.nextDouble();
			double step = r * t;
			cap = (Math.pow(p, step));
			System.out.println("Капитал прожиточного минимума: " + cap + " рублей.");
		}
	}
}
