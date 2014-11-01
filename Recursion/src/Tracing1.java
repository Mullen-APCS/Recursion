
public class Tracing1
	{
	public static void main(String[] args)
		{
		System.out.println(trace(5));
		}
	
	public static int trace(int n)
		{
		if(n <= 1)
			{
			return 1;
			}
		else
			{
			int subproblem = trace(n - 2);
			return subproblem + n;
			}
		}
	}
