package sector01.exam01;

public class Switch_Test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	8 ~ 11사이의 시간 뽑기..
		int time = (int) (Math.random() * 4) + 8;
		
		switch( time )
		{
		case 8:
			System.out.println("출근");
			
		case 9:
			System.out.println("회의");
						
		case 10:
			System.out.println("업무");
			
		default:
			System.out.println("외근");
		}
		
	}

}
