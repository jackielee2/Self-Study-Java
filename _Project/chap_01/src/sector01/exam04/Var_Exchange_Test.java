//=============================================================
//	x, y의 값을 서로
//	교환하고자 하는 프로그램..
//=============================================================
package sector01.exam04;

public class Var_Exchange_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 3;
		int y = 4;
		
		System.out.println( "x : " + x + ", y : " + y);
		
		//	임시 변수 사용!!!
		int tmp = x;
		
		x = y;
		y = tmp;
		System.out.println( "x : " + x + ", y : " + y);

	}

}
//=============================================================