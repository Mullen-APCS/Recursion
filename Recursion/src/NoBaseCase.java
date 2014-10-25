public class NoBaseCase
	{
	public static void main(String[] args)
		{
		System.out.println(run(1));
		}

	public static int run(int x)
	   {
	   int subproblem = run(x + 1);
	   return subproblem;
	   }
	}

	
