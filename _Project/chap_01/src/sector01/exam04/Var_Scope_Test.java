package sector01.exam04;

public class Var_Scope_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int v1 = 15;
				
		//{
			int v2;
			v2 = v1 - 10;
		//}
		
		//	에러 발생!!!
		int v3 = v1 + v2 + 5;
	
		System.out.println("v3 = " + v3);

	}

}
