package sector02.exam02;

public class String_To_Primitive_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	문자열	--->	기본 타입..
		int intVal = Integer.parseInt("10");
		//	에러 발생!!
		//int intVal = Integer.parseInt("a10");
		//int intVal = Integer.parseInt("#10");
		//int intVal = Integer.parseInt("가10");
		System.out.println( intVal );
		
		double doubleVal = Double.parseDouble("3.14");
		System.out.println( doubleVal );
		
		boolean boolVal = Boolean.parseBoolean("true");
		System.out.println( boolVal );
		
		
		//	기본 타입	---> 	문자열..
		String str = String.valueOf(10);
		System.out.println( str );
		
		str = String.valueOf(3.14);
		System.out.println( str );
		
		str = String.valueOf(false);
		System.out.println( str );
		
	}

}
