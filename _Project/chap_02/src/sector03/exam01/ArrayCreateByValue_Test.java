package sector03.exam01;

public class ArrayCreateByValue_Test {

	public static void main(String[] args)
	{
		int[] scores = { 80, 90, 85 };
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0;		
		for( int i = 0; i < 3; ++i )
			sum += scores[i];		
		System.out.println("총합 : " + sum);

		double avg = (double)sum / 3;
		System.out.println("평균 : " + avg);
		System.out.println();
	
	}
	
}
