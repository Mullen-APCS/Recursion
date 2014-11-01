
public class TracingC
	{
	public static void main(String[] args)
		{
		System.out.println(trace(4, 4));
		}
	
	public static int trace(int x, int y)
		{
		if(x == 0)
			{
			return x;
			}
		else
			{
			int subproblem = trace(y - 1, x);
			return subproblem + x;
			}
		}
	}
	
