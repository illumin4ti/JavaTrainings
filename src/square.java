import java.util.Scanner;
public class square
{
	public static void main(String[] args)
	{
		try (Scanner sq = new Scanner(System.in))
		{
			int d, b;
			System.out.println("ƒлина: ");
			d = sq.nextInt();
			System.out.println("Ўирина: ");
			b = sq.nextInt();
			for (int i = 0; i < d; i++) 
			{
				System.out.print("*");
			}
			for (int i = 0; i < b; i++);
			System.out.println("*");
		}
	}
}
