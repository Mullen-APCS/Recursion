
public class String2
	{
	
	public static void main(String[] args)
		{
		System.out.println(recur("bat"));
		}
	
	public static String recur(String s)
		{
		if(s.length() > 0)
			{
			return s.charAt(s.length()-1) + recur(s.substring(0,s.length()-1));
			}
		
		return "";
		}
	}