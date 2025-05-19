package sector03.exam01;

public class String_Test {

	public static void main(String[] args) {
		
		String name1 = "홍길동";
		String name2 = "홍길동";
		
		//	참조( 주소 ) 비교..
		if( name1 == name2 )
			System.out.println("주소가 같음");
		else
			System.out.println("주소가 다름");
		
		//	문자열 비교..
		if( name1.equals(name2) )
			System.out.println("문자열이 같음");
		else
			System.out.println("문자열이 다름");
		
		System.out.println("-----------------------");
		
		String name3 = new String("홍길동");
		String name4 = new String("홍길동");
		
		//	참조( 주소 ) 비교..
		if( name3 == name4 )
			System.out.println("주소가 같음");
		else
			System.out.println("주소가 다름");
		
		//	문자열 비교..
		if( name3.equals(name4) )
			System.out.println("문자열이 같음");
		else
			System.out.println("문자열이 다름");
		
		
		
	}
}
