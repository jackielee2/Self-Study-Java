package sector02.exam01;

public class Continue_Test {

	public static void main(String[] args) {
		
		//*	1)	기본 사용방식..
		for( int i = 1; i <= 10; ++i )
		{
			//	짝수는 패스..
			if( i % 2 == 0 )
				continue;
			
			System.out.println(i);
		}
		//*/
		
	}
}
