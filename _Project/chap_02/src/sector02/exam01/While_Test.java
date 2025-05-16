package sector02.exam01;

public class While_Test {

	public static void main(String[] args) {
		
		//*	1)	기본적인 while문 사용방식..
		
		int i = 1;
		while( i <= 10 )
		{
			System.out.println(i);
			++i;
		}	
		//*/
		
		
		/*	2)	1 ~ 100 까지 합을 출력..
		int sum = 0;
		int i = 1;
		
		while( i <= 100 )
		{
			sum += i;
			++i;
		}
		
		System.out.println("1 ~ " + ( i - 1 ) + " 까지 합 : " + sum);
		
		//*/
	}
}
