public class maxmin 
{
	public static void main(String[] args)
	{
		int n = 5;
		double [] array = new double[n];
		for (int i = 0; i < array.length; i ++)
		{
			array[i] = Math.random();
		}
		double max = array[0];
		double min = array[0];
		double sr = 0;
		for (int i = 0; i < array.length; i ++) 
		{
			System.out.println(array[i]);
			if (max < array[i])
				max = array[i];
			if (min > array[i])
				min = array[i];
			sr += array[i]/array.length;
		}
		System.out.println("Minimal number is: " + min);
		System.out.println("Maximal number is: " + max);
		System.out.println("Average number is: " + sr);
	}
}
