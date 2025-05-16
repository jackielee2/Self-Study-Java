package sector02.exam01;

public class For_Test_1 {

	public static void main(String[] args) {
		
		/*	1)	기본적인 for문 사용방식..
		for( int i = 1; i <= 10; ++i )
			System.out.println(i);
		//*/
		
		
		/*	2)	초기화 식이 필요 없는 경우..
		int j = 1;
		for( ; j <= 100; ++j )
		{
			System.out.print( j );
			System.out.print(" ");
		}
		//*/
		
		
		/*	3)	1 ~ 100까지 합을 출력..
		int sum = 0;
		for( int i = 1; i <= 100; ++i )
			sum += i;
		
		System.out.println("1 ~ 100까지 합 : " + sum);
		//*/
		
		/*	4-1)	잘못 구현된 예..
		int sum = 0;
		for( int i = 1; i <= 100; ++i )
			sum += i;
		
		System.out.println("1 ~ " + (i-1) + " 까지 합 : " + sum);
		
		//*/
		
		/*	4-2)	수정..
		int i = 0;
		int sum = 0;
		for( i = 1; i <= 100; ++i )
			sum += i;
				
		System.out.println("1 ~ " + (i-1) + " 까지 합 : " + sum);
				
		//*/
	}
}
