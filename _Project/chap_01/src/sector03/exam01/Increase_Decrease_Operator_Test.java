//=========================================================
/*
	증감 연산자 ( ++, -- )
	
	-	변수의 값을 1 증가 또는 감소..
	
	-	boolean 타입을 제외한
	 	모든 기본 타입의
	 	피연산자에 사용 가능..
	 	
	-	전치 / 후치 증감..
	 
	 	-	전치..
	 		ㄴ	다른 연산을 수행하기 전에
	 			먼저 증감을 진행..
	 			
	 	-	후치..
	 		ㄴ	다른 연산을 수행한 후에
	 			증감을 진행..
	
	 -	연산속도..
	 
	 	-	[ ++i ] == [ i = i + 1 ] < [ i += 1 ]	
	 

*/
//=========================================================
package sector03.exam01;

public class Increase_Decrease_Operator_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("--------------------------------");
		x++;
		++x;
		System.out.println("x = " + x);
		
		
		
		System.out.println("--------------------------------");
		y--;
		--y;
		System.out.println("y = " + y);
		
		
		
		System.out.println("--------------------------------");
		z = x++;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		
		System.out.println("--------------------------------");
		z = ++x;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		
		
		System.out.println("--------------------------------");
		z = ++x + y++;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("y = " + y);

	}

}
//=========================================================
/*
	[ 참고 ]
	
		JAVA 5일차 - 연산자
		https://breakthedays.tistory.com/11

*/
//=========================================================