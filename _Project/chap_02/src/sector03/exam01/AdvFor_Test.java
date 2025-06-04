package sector03.exam01;

public class AdvFor_Test {

	public static void main(String[] args)
	{
		int[] scores = { 80, 90, 75, 60, 85 };
		
		int sum = 0;
		for( int score : scores )
			sum += score;		
		System.out.println("총합 = " + sum);
		
		
		double avg = (double)sum / scores.length;
		System.out.println("평균 = " + avg);
		
	}

}
