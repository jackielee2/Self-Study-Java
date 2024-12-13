package sector02.exam01;

public class Byte_Test {
	
	public static void main(String[] args) {
		
		byte var1 = -128;
		System.out.println(var1);
		
		byte var2 = -30;
		System.out.println(var2);
		
		byte var3 = 0;
		System.out.println(var3);
		
		byte var4 = 30;
		System.out.println(var4);
		
		//	컴파일 에러 발생..
		//	ㄴ	(Type mismatch: cannot covert from int to byte)
		//byte var5 = 128; 
		byte var5 = 127;
		System.out.println(var5);
	} 

}