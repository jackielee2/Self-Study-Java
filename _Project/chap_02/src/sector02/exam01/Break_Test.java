package sector02.exam01;

public class Break_Test {

	public static void main(String[] args) {
		
		//*	1)	기본 사용방식..
		while( true )
		{
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
			
			if( num == 3 )
				break;		
		}
		
		System.out.println("프로그램 종료..");
		//*/
		
		
		
		/*	2-1)	중첩 반복문에서 break..
		
		for( char upper = 'A'; upper <= 'Z'; ++upper )
		{
			for( char lower = 'a'; lower <= 'z'; ++lower )
			{
				System.out.println(upper + " - " + lower);
				if( lower == 'g')
					break;
				
			}//	for( char lower = 'A'; lower <= 'Z'; ++lower )
			System.out.println();
			
		}//	for( char upper = 'A'; upper <= 'Z'; ++upper )

		//*/
		
		
		
		/*	2-2)	중첩 반복문에서 break..
		
		Outter:for( char upper = 'A'; upper <= 'Z'; ++upper )
		{
			for( char lower = 'a'; lower <= 'z'; ++lower )
			{
				System.out.println(upper + " - " + lower);
				if( lower == 'g')
					break Outter;
				
			}//	for( char lower = 'A'; lower <= 'Z'; ++lower )
			System.out.println();
			
		}//	for( char upper = 'A'; upper <= 'Z'; ++upper )

		//*/
	}
}
