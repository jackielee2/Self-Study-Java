//====================================================================
/*
	문자 결합 연산자 ( + )
	
	-	[ + ] 연산자는 피연산자 중
	 	하나가 문자열이면 다른 피연산자를
	 	문자열로 변환하고 서로 연결시킴..
	 	
	 	예)	String str1 = "JDK" + 21;
	 		String str2 = str1 + " Study!!";
	 		
	 -	연산 방향..
	 
	 	ㄴ	--->
	 	
	 	예)	"JDK" + 21 + 0.5;
	 		
	 		ㄴ	"JDK21" + 0.5
	 		
	 		ㄴ	"JDK210.5"
	 		
	 		
	 		21 + 0.5 + "JDK"
	 		
	 		ㄴ	21.5 + "JDK"
	 		
	 		ㄴ	"21.5JDK"
		
*/
//====================================================================
package sector03.exam01;
//====================================================================
public class StringConcat_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "JDK" + 21;
		String str2 = str1 + " Study!!";
		System.out.println(str2);

		String str3 = "JDK" + 21 + 0.5;
		System.out.println(str3);
		
		String str4 = 21 + 0.5 + "JDK";
		System.out.println(str4);
	}

}
//====================================================================