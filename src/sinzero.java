public class sinzero 
{
	public static void main(String[] args)
	{
		int cock = (int) (Math.random() * 100);
		System.out.println(cock);
		double a = Math.sin(cock);
		double b = Math.cos(cock);
		System.out.println(Math.pow(a, 2) + Math.pow(b, 2));
	}
}
