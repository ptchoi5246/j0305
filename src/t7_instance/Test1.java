package t7_instance;
//원 넓이 구하기
public class Test1 {
	// 인스턴스 필드
	//double pi = 3.141592; //변수에서 필드가 되면서 전역변수
	public double pi = Math.PI;
	//고정되는 값은 무조건 대문자로 쓰기 !관례! ex. enum : MONDAY TUESDAY WENDSEDAY...
	
	// 인스턴스 메소드
	double circleArea(int r) {
		double res = r * r * pi;
		return res;
	}
}
