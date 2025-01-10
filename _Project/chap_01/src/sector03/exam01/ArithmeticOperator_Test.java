//==============================================================================
/*
	산술 연산자..
	
	-	사칙연산과 나머지 연산을 포함한
		5개의 연산자..
		
		ㄴ	+, -, *, /, %..
		
		
	-	boolean 타입을 제외한
		모든 기본 타입에 사용..
		
		
	-	피연산자들의 타입이 동일하지
	 	않은 경우 적용되는 규칙..
	 	
	 	1)	피연산자들의 타입이
	 	 	byte, short, char 인 경우..
	 	 	
	 	 	-	모두 int 타입으로 변환한 후
	 	 	 	연산을 수행..
	 	 	 	
	 	 	 	예)	byte + byte ---> int + int = int
	 	 	 	
	 	 	 	
	 	 2)	피연산자들이 모두 정수 타입이며
	 	 	long 타입이 포함된 경우..
	 	 	
	 	 	-	모두 long 타입으로 변환한 후
	 	 		연산을 수행..
	 	 		
	 	 		예)	int + long ---> long + long = long
	 	 		
	 	 
 		3)	피연산자 중 실수 타입이 있는 경우..
 				( float, double )
 				
 			-	허용 범위가 큰 실수 타입으로 변환한 후
 				연산을 수행..
 				
 				예)	int + double ---> double + double = double

		
*/
//==============================================================================
package sector03.exam01;
//==============================================================================
public class ArithmeticOperator_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//--------------------------------
		//	int로 산술연산 중 형변환..
		byte byte1 = 1;
		byte byte2 = 2;
		//byte byte3 = byte1 + byte2;	//	---	( X )
		int int3 = byte1 + byte2;		//	---	( O )
		
		//--------------------------------
		int int1 = 10;
		int int2 = 4;
		int res = int1 / int2;
		System.out.println("10 / 4 = " + res );
		
		double res2 = int1 / int2;	//	( int1 / int2 )의 연산 결과는 정수.. 	
		System.out.println("10 / 4 = " + res2 );
		
		
		//--------------------------------
		//	5칙 연산..
		int v1 = 5;
		int v2 = 2;
		int res3 = v1 + v2;
		System.out.println("res3 = " + res3 );
		
		res3 = v1 - v2;
		System.out.println("res3 = " + res3 );
		
		res3 = v1 * v2;
		System.out.println("res3 = " + res3 );
		
		res3 = v1 / v2;
		System.out.println("res3 = " + res3 );
				
		res3 = v1 % v2;
		System.out.println("res3 = " + res3 );
				
		double res4 = (double)v1 / v2;
		System.out.println("res3 = " + res4 );
		
		
		//--------------------------------
		//	char 타입도 정수 타입이므로
		//	산술 연산이 가능..
		//	-	산술 연산 과정에서 int 타입으로
		//		변환됨..
		//		-	유니코드 정보..
		char c1 = 'A' + 1;	//	리터럴( 상수 )간의 연산은
							//	컴파일 단계에서 수행되므로
							//	타입 변환이 없음..
		char c2 = 'A';
		System.out.println("c1 : " + c1 );
		System.out.println("c2 : " + c2 );
		
		//char c3 = c2 + 1;	//	---	( X )
							//		ㄴ	char 타입인 c2가 
							//			산술 연산 과정에서
							//			int로 변환..
		char c3 = (char)(c2 + 1);	
		//int c3 = c2 + 1;
		System.out.println("c3 : " + c3 );
		
	}

}
//==============================================================================