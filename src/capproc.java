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
			System.out.println("�� �� ��� � ��������?: ");
			p = mpt.nextDouble();
			System.out.println("�� ������� ���: ");
			t = mpt.nextInt();
			System.out.println("����� �������: ");
			r = mpt.nextDouble();
			double step = r * t;
			cap = (Math.pow(p, step));
			System.out.println("������� ������������ ��������: " + cap + " ������.");
		}
	}
}
