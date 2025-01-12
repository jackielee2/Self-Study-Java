package sector01.exam01;

public class If_Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//*	1)	if	-------------------------
		int score = 93;
		System.out.println("현재 점수 : " + score);
		if( score >= 90 )
		{
			System.out.println("점수가 90점보다 큽니다..");
			System.out.println("A 등급입니다..");
		}
		
		if( score < 90 )
		{
			System.out.println("점수가 90점보다 작습니다..");
			System.out.println("B 등급입니다..");
		}
		System.out.println("");
		//*/
		
		
		
		//*	2)	if - else	-------------------------		
		score = 85;
		System.out.println("현재 점수 : " + score);
		if( score >= 90 )
		{
			System.out.println("점수가 90점보다 큽니다..");
			System.out.println("A 등급입니다..");
		}		
		else
		{
			System.out.println("점수가 90점보다 작습니다..");
			System.out.println("B 등급입니다..");
		}
		System.out.println("");
		//*/
		
		
		
		//*	3)	if - else if - else	-------------------------		
		score = 75;
		System.out.println("현재 점수 : " + score);
		if( score >= 90 )
		{
			System.out.println("점수가 90점보다 큽니다..");
			System.out.println("A 등급입니다..");
		}		
		else if( score > 80 )
		{
			System.out.println("점수가 90점보다 작고 80점보다 큽니다..");
			System.out.println("B 등급입니다..");
			
		} else if( score > 70 )
		{
			System.out.println("점수가 80점보다 작고 70점보다 큽니다..");
			System.out.println("C 등급입니다..");
			
		}else
		{
			System.out.println("점수가 70점 이하입니다..");
			System.out.println("C 등급입니다..");
			
		}
			
		System.out.println("");
		//*/
		

	}

}
