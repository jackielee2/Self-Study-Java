package sector01.exam03;

public class Var_Init_Error {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//	-	한글도 변수명으로 사용이
		//		가능하지만 권장하지는 않음..		
		
		
		//	변수 선언..
		//	-	에러 발생!!!
		//int 데이터;
		
		int 데이터 = 5;
		
		int 결과 = 데이터 + 10;
		
		System.out.println( 결과 );

	}

}
