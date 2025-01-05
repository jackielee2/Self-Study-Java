//========================================================================
package sector02.exam03;
//========================================================================
public class ContinueKeyCodeRead_Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		int keyCode;
		
		while( true )
		{
			keyCode = System.in.read();
			
			System.out.println( "keyCode : " + keyCode );
		}

	}

}
//========================================================================
/*
	-	결과 분석..
	
		-	while( true )로 인하여
			무한 반복처리..
			
			ㄴ	반복을 강제로 종료하려면
				콘솔창의 빨간 버튼을 클릭..
				
		-	더이상 키코드를 읽어올 수 없을때까지
			계속 읽기를 반복..
		
*/
//========================================================================