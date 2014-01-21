package recursion.control;

public class Recursion
	
{
	private int fibonacci(int currentNumber)
	{
		int fibNumber = 0;
		
		if(currentNumber >= 0)
			{
				if(currentNumber <= 0)
					{
						return 1;
					}
				else
					{
						return fibonacci(currentNumber -1) + fibonacci(currentNumber -2);
					}
			}
		
		return fibNumber;
	}
	
	private double factorial(int currentNumber)
	{
		double factorialNumber = 0;
		
		if(currentNumber >= 0)
			{
				if (currentNumber == 0)
					{
						return 1;
					}
				else
					{
						return (currentNumber * factorial(currentNumber - 1));
					}
			}
		
		
		return factorialNumber;
	}
	
	public void start()
	{
		System.out.println("Prepare for LAG!\n");
		
		for(int count = 1; count < 171; count++)
			{
				System.out.println(factorial(count));
			}
	}

}
