package sector02.exam02;

public class Int_Casting_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte a = 10;
		byte b = 20;
		
		//	컴파일 에러 발생!!!
		//byte c = a + b;
		int c = a + b;
		
		System.out.println( c );
		
		
		//	피연산자가 변수가 아니므로
		//	int 타입으로 변환되지 않음..
		byte d = 10 + 20;
		System.out.println( d );
		
		
		char charVal1 = 'A';
		char charVal2 = 1;
		
		//	컴파일 에러 발생!!!		
		//char charVal3 = charVal1 + charVal2;
		
		int intVal = charVal1 + charVal2;
		System.out.println( "유니코드 : " + intVal );
		System.out.println( "출력 문자 : " + (char)intVal );
		
		

		//	무조건 int 로 변환되는게 아니라
		//	더 큰 타입으로 변환됨..
		byte val1 = 10;
		int val2 = 100;
		long val3 = 1000L;
		//	컴파일 에러 발생!!!
		//int tot = val1 + val2 + val3;
		long tot = val1 + val2 + val3;
		System.out.println( tot );
		
		
		//	연산의 최적화를 위해서 정수끼리의 연산이
		//	필요할땐 int 타입의 변수를 이용..
		int a2 = 100;
		int b2 = 200;
		int c2 = a2 + b2;
		System.out.println( c2 );

	}

}
