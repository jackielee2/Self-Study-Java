package sector02.exam02;

public class String_Plus_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//	숫자 덧셈 연산..
		int val = 10 + 2 + 8;
		System.out.println("val : " + val);
				
		//	문자열 결합 연산..		
		String str1 = 10 + 2 + "8";
		System.out.println("str1 : " + str1);
		
		str1 = 10 + "2" + 8;
		System.out.println("str1 : " + str1);
		
		str1 = "10" + 2 + 8;
		System.out.println("str1 : " + str1);
		
		str1 = "10" + (2 + 8);
		System.out.println("str1 : " + str1);

	}

}
