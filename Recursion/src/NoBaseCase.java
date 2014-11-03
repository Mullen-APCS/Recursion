public class NoBaseCase
	{
	public static void main(String[] args)
		{
		System.out.println(run(1));
		}

	public static int run(int x)
	   {
	   return run(x + 1);
	   }
	}

	
