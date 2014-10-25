public class Anagram
	{
	public static void main(String args[])
		{
		permuteString("", "1234");
		}

	public static void permuteString(String beginningString, String endingString)
		{
		if (endingString.length() <= 1)
			System.out.println(beginningString + endingString);
		else
			for (int i = 0; i < endingString.length(); i++)
				{
				String tempString = endingString.substring(0, i)
							+ endingString.substring(i + 1);
				permuteString(beginningString + endingString.charAt(i),
							tempString);
				}
		}
	}