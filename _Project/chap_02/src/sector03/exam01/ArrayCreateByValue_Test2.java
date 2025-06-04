package sector03.exam01;

public class ArrayCreateByValue_Test2 {

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
		System.out.println();

		//	error!!!
		//int sum2 = add ({ 80, 90, 85 });
		int sum2 = add ( new int[]{ 80, 90, 85 });
		System.out.println("총합 : " + sum2);
	
	}
	
	public static int add( int[] scores )
	{
		int sum = 0;
		
		for( int i = 0; i < 3; ++i )
			sum += scores[i];		
		
		return sum;
	}

}
