package sector03.exam01;

public class ArrayLength_Test {

	public static void main(String[] args)
	{
		int[] scores = { 80, 90, 85 };
		
		int sum = 0;
		for( int i = 0; i < scores.length; ++i )
			sum += scores[i];
		
		System.out.println("총합 : " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);
		
	}

}
