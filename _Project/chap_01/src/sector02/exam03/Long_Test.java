package sector02.exam03;

public class Long_Test {
	public static void main(String[] args) {
		
		long var1 = 10;
		System.out.println(var1);
		
		long var2 = 20L;
		System.out.println(var2);
		
		//	컴파일 에러..
		//	ㄴ	The literal 1000000000000 of type int is out of range
		//	L	int 타입으로 간주..
		//long var3 = 1000000000000;
		long var3 = 1000000000000L;		
		System.out.println(var3);
	} 
}