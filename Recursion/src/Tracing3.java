
public class Tracing3
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
			return trace(y - 1, x) + x;
			}
		}
	}
	
