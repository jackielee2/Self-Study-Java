//==================================================================
package sector02.exam03;
//==================================================================
/*
	-	System.in.read()의 단점..
	
		ㄴ	키코드를 하나씩 읽기 때문에
			2개 이상의 키가 조합된
			한글과 같은 단어를 읽을 수 없음..
			
		ㄴ	키보드로부터 입력된 내용을
		 	통 문자열로 읽지 못함..
		 	
	 	ㄴ	Scanner 클래스로 보완 가능..
	 		ㄴ	 java.util.Scanner 패키지 필요..
*/
//==================================================================
import java.util.Scanner;
//==================================================================
public class Scanner_Test {

	public static void main(String[] args) throws Exception	{
		// TODO Auto-generated method stub
		
		//	시스템의 입력 장치로부터 읽어오는
		//	Scanner를 생성..
		Scanner scanner = new Scanner(System.in);
		
		String inputData;
		
		while(true)
		{
			//	Scanner.nextLine()
			//	-	엔터키가 입력되기 전까지 대기상태가 되며,
			//		엔터키가 입력되면 입력된 모든 내용을
			//		문자열로 읽음..
			inputData = scanner.nextLine();
			
			System.out.println("입력된 문자열 : \"" + inputData + "\"");
			
			//	문자열이 동일한지 비교..
			if( inputData.equals("q"))
				break;
			
		}//	while(true)
		
		System.out.println( "Finish!!" );
		
	}
}
//==================================================================