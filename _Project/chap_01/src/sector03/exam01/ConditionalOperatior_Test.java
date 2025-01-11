//=========================================================
package sector03.exam01;
//=========================================================
public class ConditionalOperatior_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 85;
		
		char grade = ( score > 90 ) ? 'A' : 'B';

		System.out.println( score + "점은 " + grade + "등급입니다..");
						
		/*
		if( score > 90 )
			grade = 'A';
		else
			grade = 'B';
	
		System.out.println( score + "점은 " + grade + "등급입니다..");
		//*/

	}

}
//=========================================================