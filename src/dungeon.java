import java.util.Scanner;
public class dungeon 
{
	public static void main(String[] args)
	{
		try (Scanner bucks = new Scanner (System.in)) {
			int cost;
			System.out.println("What is cost of fisting? ");
			cost = bucks.nextInt();
			System.out.println("Fisting is " + cost + " bucks");
		}
	}
}
