public class TracingB
	{
	public static void main(String[] args)
		{
		System.out.println(trace(7));
		}
	
	public static int trace(int n)
		{
		if(n <= 1)
			{
			return 1;
			}
		else
			{
			return n + trace(n - 3);;
			}
		}
	}