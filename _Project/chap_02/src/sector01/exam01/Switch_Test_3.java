package sector01.exam01;

public class Switch_Test_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//*-------------------------------------
		//	알파벳 대소문자에 관계없이 처리.. 
		
		char grade = 'B';

		switch( grade )
		{
			case 'A':
			case 'a':
				System.out.println("우수 회원..");
				break;
				
			case 'B':
			case 'b':
				System.out.println("일반 회원..");
				break;
				
			default:
				System.out.println("게스트..");
				break;
				
		}//	switch( grade )
		
		/*-------------------------------------
		String pos = "과장";
		
		switch( pos )
		{
		case "부장":
			System.out.println("월급 : 700 만원");
			break;
			
		case "차장":
			System.out.println("월급 : 600 만원");
			break;
			
		case "과장":
			System.out.println("월급 : 500 만원");
			break;
			
		default:
			System.out.println("월급 : 400 만원 이하..");
			break;
		
		}
		
		//*/
	}

}
