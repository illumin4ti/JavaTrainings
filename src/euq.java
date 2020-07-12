public class euq
{
	public static void main(String[] args)
	{
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);
		double sum =((Math.sqrt(x - 0)) + (Math.sqrt(y - 0)));
		double dist = Math.pow(sum, 0.5);
		System.out.println(dist);
	}
}