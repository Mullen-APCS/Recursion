
public class OddDigitCounter
	{

	public static void main(String[] args)
		{
		System.out.println(countOddDigits(234567));
		}
	
	public static int countOddDigits(int num)
		{
		if(num > 0)
			{
			int digit = num % 10;
			if(digit % 2 == 1)
				{
				return 1 + countOddDigits(num/10);
				}
			
			return 0 + countOddDigits(num/10);
			}
		
		else
			{
			return 0;
			}
		}
	}
	
