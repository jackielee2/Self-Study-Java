//=========================================================
/*
		논리 연산자 ( &, &&, |, ||, ^, ! )
		
		
		-	피연산자는 [ boolean ] 타입만 가능..
		
		
			논리곱 ( AND )
			==================================
			A..		|	B..		|	& 또는 &&..
			==================================
			true..	|	true..	|	true..
			true..	|	false..	|	false..		
			false..	|	true..	|	false..
			false..	|	false..	|	false..
			==================================
			
			*	&&과 &의 차이..
				
				-	&&..
					
					ㄴ	앞의 피연산자가 false 라면
					  	뒤에 피연산자를 평가하지 않고
					  	바로 false 반환..
					  	
				-	&..
				
					ㄴ	두 피연산자 모두를 평가해서
						결과를 산출..
						
				**	& 보다 &&가 더 효율적..
		
			
			
			논리합 ( OR )
			==================================
			A..		|	B..		|	| 또는 ||..
			==================================
			true..	|	true..	|	true..
			true..	|	false..	|	true..		
			false..	|	true..	|	true..
			false..	|	false..	|	false..
			==================================
			
			
			베타적 논리합 ( OR )
			===============================
			A..		|	B..		|	^
			===============================
			true..	|	true..	|	false..
			true..	|	false..	|	true..		
			false..	|	true..	|	true..
			false..	|	false..	|	false..
			===============================
			
			
			논리 부정 ( NOT )
			===========================
			true..	|		|	false..
			--------|	!	|----------
			false..	|		|	true..
			===========================
			
			
		-	주로 조건문, 반복문 등의
		 	흐름 제어문에서 사용..
		
		
*/
//=========================================================
package sector03.exam01;

import java.io.CharConversionException;

//=========================================================
public class LogicalOperator_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int charCode = 'A';
		
		if( ( 65 <= charCode ) & ( charCode <= 90 ) )
			System.out.println("대문자");
		
		if( ( 97 <= charCode ) & ( charCode <= 122 ) )
			System.out.println("소문자");
		
		if( !( charCode < 48 ) && !( charCode > 57 ) )
			System.out.println("0 ~ 9 사이 숫자");
		
		//----------------------------------------
		
		int val = 6;
		
		if( ( val % 2 == 0 ) |
			( val % 3 == 0 ) )
			System.out.println("2 또는 3의 배수..");
		
		if( ( val % 2 == 0 ) ||
			( val % 3 == 0 ) )
			System.out.println("2 또는 3의 배수..");

	}

}
//=========================================================