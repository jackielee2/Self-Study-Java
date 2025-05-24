package sector03.exam01;

public class MainStrArrArgument_Test {
	
	public static void main(String[] args) {
		
		if( args.length != 2)
		{
			System.out.println("매개 변수의 수가 부족합니다..");
			System.exit(0);
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
		
		/*
			명령 프롬프트 실행..
				
				jdk 8 이전..
					java sector03.exam01.MainStrArrArgument_Test 10 20
					
				jdk 11 이후..
					java -p . -m chap02/sector03.exam01.MainStrArrArgument_Test 10 20
		*/
		
	}

}
