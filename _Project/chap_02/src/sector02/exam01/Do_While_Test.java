package sector02.exam01;

public class Do_While_Test {

	public static void main(String[] args) {
		
		//*	1)	1 ~ 100 까지 합을 출력..
		int sum = 0;
		int i = 1;
		
		do
		{
			sum += i;
			++i;
		}
		while( i <= 100 );
		
		System.out.println("1 ~ " + ( i - 1 ) + " 까지 합 : " + sum);
		
		//*/
		//*/
		
	}
}
