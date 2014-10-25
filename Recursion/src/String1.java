
public class String1
	{
	
	public static void main(String[] args)
		{
		System.out.println(recur("bat"));
		}
	
	public static String recur(String s)
		{
		if(s.length() > 0)
			{
			return recur(s.substring(0,s.length()-1)) +
			          s.charAt(s.length()-1);
			}
		
		return "";
		}
	}
	