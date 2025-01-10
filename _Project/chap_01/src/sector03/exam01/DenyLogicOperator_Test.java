//=========================================================
package sector03.exam01;
//=========================================================
/*
	논리 부정 연산자 ( ! )
	
	-	논리 데이터를 반전시킴..
	
		ㄴ	true -> false
			false -> true
			
	-	주요 용도..
	
		-	조건문과 반복문에서 실행의 흐름을
	 		제어할때 주로 사용..
	 	
	 	-	토글 기능..
	 		ㄴ	두가지 상태( true / false )를
	 			번갈아가며 변경..

*/
//=========================================================
public class DenyLogicOperator_Test {

	public static void main(String[] args) {
		
		boolean isPlay = true;
		System.out.println( "isPlay = " + isPlay );
		
		
		isPlay = !isPlay;
		System.out.println( "isPlay = " + isPlay );
		
		
		isPlay = !isPlay;
		System.out.println( "isPlay = " + isPlay );		
		
	}

}
//=========================================================