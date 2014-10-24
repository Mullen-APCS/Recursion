
public class Exponent
	{
	public static void main(String[] args)
		{
		System.out.println(power(2, 3));
		}
	
	public static int power(int base, int exponent)
		{
		if(exponent == 0)
			{
			return 1;
			}
		else
			{
			int subproblem = power(base, exponent - 1);
			return base * subproblem;
			}
		}
	}

	
