public class abb 
{
	public static void main(String[] args)
	{
		boolean a = false;
		boolean b = false;
		System.out.println(! ((a && b) && (a || b)) || ((a && b) || ! ((a || b))));
	}
}
