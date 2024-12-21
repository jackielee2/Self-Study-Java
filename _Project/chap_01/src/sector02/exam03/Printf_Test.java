package sector02.exam03;

public class Printf_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int val = 123;
		System.out.printf("가격 : %d원\n", val);
		System.out.printf("가격 : %6d원\n", val);
		System.out.printf("가격 : %-6d원\n", val);
		System.out.printf("가격 : %06d원\n", val);

		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이 : %10.2f\n", 10, area);
		
		int number = 1;
		String name = "홍길동";
		String job = "의적";
		System.out.printf("%6d | %-10s | %10s\n", number, name, job);
		
	}

}
