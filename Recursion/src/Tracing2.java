
public class Tracing2
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
			return trace(x, y - 2) + x;
			}
		}

	}
