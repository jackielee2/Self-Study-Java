package sector01.exam04;

public class Var_Use_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//	변수 사용 예1)
		//	-	값의 대입..
		int hour = 3;
		int min = 5;
		
		//	변수 사용 예2)
		//	-	저장된 값을 불러옴..
		System.out.println( hour + "시간 " + min + "분");
		
		int totalMin = (hour * 60) + min;
		System.out.println("총 " + totalMin + "분");
		
		
		//	변수 사용 예3)
		//	-	값의 복사..
		int hour2 = hour;
		int min2 = min;
		System.out.println( hour2 + "시간 " + min2 + "분");

	}

}
