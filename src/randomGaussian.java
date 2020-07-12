public class randomGaussian 
{
	public static void main(String[] args)
	{
		int u, v;
		double r;
		u = (int) Math.random();
		v = (int) Math.random();
		r = (Math.sin(2 * (Math.PI * v)) * (Math.abs(-2 * Math.log(u) * 0.5))); //хуета блядь
		System.out.println(r);
	}
}
