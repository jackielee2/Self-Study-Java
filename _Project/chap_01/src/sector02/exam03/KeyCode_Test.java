//=========================================================================
package sector02.exam03;
//=========================================================================
public class KeyCode_Test {

	//	throws Exception..
	//	ㄴ	System.in.read()에 대한 예외처리..
	//	ㄴ	단순히 모니터에 예외 내용을 출력..
	//	ㄴ	예외처리..
	//		ㄴ	프로그래머가 예기치못한
	//			예외의 발생에 미리 대처하는
	//			코드를 작성하는 것..
	//		ㄴ	목적..
	//			ㄴ	실행중인 프로그램의 비정상적인
	//				종료를 막고, 상태를 정상상태로
	//				유지하는 것..
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);
		
		//*
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);
		//*/

	}

}
//=========================================================================
/*
 	실행)
 	  	a
		keyCode : 97
		keyCode : 13
		keyCode : 10
		
		
	-	결과 분석..
	
	
		-	System.in.read() 실행..
		
			1)	알파벳 'a' 입력 후 [ 엔터키 ] 입력..
		
			2)	입력된 키들에 대한 키코드를 하나씩 읽어옴..
		
			3)	'a'에 대한 키코드 97을 읽어옴..
		
			4)	[ 엔터키 ]에 대한 키코드 읽어옴..
			
			 	ㄴ	엔터키 = 캐리지 리턴 	+ 	라인피드..
			 				( CR : 13 )		( LF : 10 )
			 				
			 	ㄴ	엔터키에 대한 키코드를 얻기위해
			 		System.in.read() 두번 실행..
	
*/
//=========================================================================
/*

	[ 참고 ]
	
		예외처리(exception handling)
		https://catsbi.oopy.io/92cfa202-b357-4d47-8de2-b9b3968dfb2e

*/
//=========================================================================