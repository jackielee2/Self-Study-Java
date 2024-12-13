package sector02.exam01;

public class Float_Double_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	에러 발생..
		//	float float1 = 3.14;		
		float float1 = 3.14f;
		System.out.println( float1 );
		double double1 = 3.14;
		System.out.println( double1 );
		
		//	정밀도 확인..
		float float2 = 0.1234567890123456789f;
		System.out.println( float2 );
		double double2 = 0.1234567890123456789;
		System.out.println( double2 );
		
		
		//	가수/지수 사용..
		float float3 = 3e6f;
		System.out.println( float3 );
		double double3 = 3e6;
		System.out.println( double3 );
		double double4 = 3e-3;
		System.out.println( double4 );
		
	}

}
