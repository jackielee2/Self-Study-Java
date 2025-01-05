package sector02.exam03;

public class Q_Stop_Test {

	public static void main(String[] args) throws Exception	{
		// TODO Auto-generated method stub
		
		int keyCode;
		
		while(true)
		{
			keyCode = System.in.read();
			
			System.out.println( "keyCode : " + keyCode );
			
			//	'q'
			if( keyCode == 113 )
				break;
		}
		
		System.out.println( "Finish!!" );
		
	}
}
