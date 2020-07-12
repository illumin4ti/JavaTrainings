public class celd 
{
	public static void main(String[] args)
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int ost = a % b;
		boolean cel;
		cel = (ost == 0);
		System.out.println(cel);
	}
}
