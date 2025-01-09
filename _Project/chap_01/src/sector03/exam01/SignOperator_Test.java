//=========================================================
/*
	부호 연산자..
	
	-	양수 및 음수( 또는 부호 반전 )를
	 	표시하는 +, -..
	 	
	-	boolean, char을 제외한
		나머지 기본 타입에 사용 가능..
		
	-	주요 기능..
	
		-	부호 역할..	
			-	정수 및 실수 리터럴에 사용..
			
		-	부호 반전..		
			-	변수에 '-'를 이용하면
				부호 반전..
				
			-	'+'는 부호 유지..
				ㄴ	생략 가능..
				
	-	주의..
	
		-	부호 연산자의 결과는 int 타입..
		
			예)	byte b = 100;
				byte c = -b;	<--- ( X )
				
				byte b = 100;
				int d = -b;		<--- ( O )
*/
//=========================================================
package sector03.exam01;

public class SignOperator_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = -100;
		int res1 = +x;
		int res2 = -x;
		System.out.println("result 1 = " + res1);
		System.out.println("result 2 = " + res2);
		
		
		byte b = 100;
		//byte res3 = -b;	//	--	( X )
		int res3 = -b;
		System.out.println("result 3 = " + res3);

	}

}
//=========================================================