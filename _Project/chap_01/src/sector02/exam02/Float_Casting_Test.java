package sector02.exam02;

public class Float_Casting_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//	정수끼리의 연산 결과는 정수이므로
		//	소수점 이하 수치가 제거 됨..
		int val1 = 10;
		int val2 = val1 / 4;
		System.out.println(val2);
		
		
		//	컴파일 에러 발생!!
		//	ㄴ	상수는 형변환이 되지 않음..
		//	int tmp = 10 / 4.0f;
		float doubleVal = 10 / 4f;
		System.out.println(doubleVal);
		
		
		//	강제 형변환을 통해
		//	실수 데이터로 관리 가능..
		//	ㄴ	피연산자중 최소 하나만 변환시키면 됨..
		int x = 1;
		int y = 2;
		float z = (float)x / y;
		System.out.println(z);
		
	}

}
