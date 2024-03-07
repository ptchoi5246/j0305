package t8_Static;
//원 넓이 구하기
public class T1 {
	// 인스턴스 필드
	//double pi = 3.141592; //변수에서 필드가 되면서 전역변수
	//고정되는 값은 무조건 대문자로 쓰기 !관례! ex. enum : MONDAY TUESDAY WENDSEDAY...
	
	//정적 필드 
	public static double pi = Math.PI;
	
	
	// 정적 메소드
	static double circleArea(int r) {
		double res = r * r * pi;
		return res;
	}
}
