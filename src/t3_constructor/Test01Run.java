package t3_constructor;

public class Test01Run {
	public static void main(String[] args) {
		Test01 t1 = new Test01(); //참조타입
		
		System.out.println("t1 : " + t1);
		//t1 : t3_constructor.Test01@15db9742
		// @ 뒤는 메모리 주소 / 16진수
		
		System.out.println("t1 : " + t1.toString()); //다음주에 object 객체
		
	}
}
