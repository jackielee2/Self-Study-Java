package sector02.exam01;

public class For_Test_2 {

	public static void main(String[] args) {
		
		//*	1)	중첩 for문..

		//	외부 for문..
		for( int i = 2; i <= 9; ++i )
		{
			System.out.println("*** " + i + "단 ***");
			
			for( int j = 1; j <= 9; ++j )
			{
				System.out.println(i + " x " + j + " = " + ( i * j ) );
				
			}//	for( int j = 1; j <= 9; ++j )
			
			System.out.println();
		
		}//	for( int i = 2; i <= 9; ++i )		
		//*/
	}
}
