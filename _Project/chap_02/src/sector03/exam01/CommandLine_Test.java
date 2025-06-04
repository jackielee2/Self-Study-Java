package sector03.exam01;

/*
	커맨드 라인 매개변수 입력 방법..
	
	[ 메뉴 ]
	> [ Rum ]
	> [ Run Configuration ]
	> [ (x) = Arguments ]
	> [ Program arguments ]
	> 10 20 입력..
	> [ Apply ] 클릭 후 실행..

*/


public class CommandLine_Test {

	public static void main(String[] args)
	{
		if( args.length != 2 )
		{
			System.out.println("명령 라인에 입력된 인자의 수가 부족합니다.");
			
			//	프로그램 강제 종료..
			System.exit(0);
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}

}
