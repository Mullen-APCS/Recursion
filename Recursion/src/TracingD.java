
public class TracingD
	{
	
	public static void main(String[] args)
		{
		System.out.println(trace(4, 3));
		}
	
	public static int trace(int x, int y)
		{
		if(y < 1)
			{
			return x;
			}
		else
			{
			return x + trace(x, y - 2);
			}
		}
	}
