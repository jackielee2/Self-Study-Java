package sector01.exam01;

public class If_Test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	Math.random()..
		//	-	0.0 과 1.0 사이에 속하는
		//		double 타입의 난수 하나를 반환..
		//
		//		ㄴ	0.0 포함, 1.0 제외..
		//
		//
		//	(int)( Math.random() * 6 ) + 1;
		//	-	0 <= x && x <= 6 사이 난수 반환..
		int num = (int)( Math.random() * 6 ) + 1;
		
		if( num == 1 )
			System.out.println("1");
		else if( num == 2 )
			System.out.println("2");
		else if( num == 3 )
			System.out.println("3");
		else if( num == 4 )
			System.out.println("4");
		else if( num == 5 )
			System.out.println("5");
		else
			System.out.println("6");
	}

}
