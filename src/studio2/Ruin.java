package studio2;

public class Ruin {

	public static void main(String[] args) {
		int startAmount = 5;
		double winChance = 0.5;
		int winLimit = 15;
		int time = 0;

		
		int x = startAmount;
		while ((x < winLimit) && (x > 0))
		{
			double machine = (double)(Math.random()) ;
			time = time + 1;
			
		if (machine > winChance)
			
		{ x=x - 1;

		}
		
		if (machine < winChance)
		{x = x + 1;
		
		}
		}
		System.out.println(time);
	}
}
		
	

	


	
