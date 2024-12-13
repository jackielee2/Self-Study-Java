package sector02.exam02;

public class Casting_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	자동 타입 변환.. -------------------------
		byte byteVal = 10;
		int intVal = byteVal;
		System.out.println( "intVal : " + intVal );
		
		char charVal = 'A';
		intVal = charVal;
		System.out.println( "charVal : " + charVal );
		System.out.println( "A의 유니코드 : " + intVal );
		
		intVal = 10;
		long longVal = intVal;
		System.out.println( "longVal : " + longVal );
		
		longVal = 100;
		float floatVal = longVal;
		System.out.println( "floatVal : " + floatVal );
		
		double doubleVal = floatVal;
		System.out.println( "doubleVal : " + doubleVal );
		
		/*
		byte a = 65;
		char b = a;
		System.out.println( "a : " + doubleVal );
		//*/
		
		System.out.println( );
		
		//	강제 타입 변환.. -------------------------
		int intVal2 = 44032;
		char charVal2 = (char)intVal2;
		System.out.println( "charVal2 : " + charVal2 );
		
		long longVal2 = 500;
		intVal2 = (int)longVal2;
		System.out.println( "intVal2 : " + intVal2 );
		
		double doubleVal2 = 3.14;
		intVal2 = (int)doubleVal2;
		System.out.println( "intVal2 : " + intVal2 );
		
	}

}
