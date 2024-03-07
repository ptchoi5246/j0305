package t2_field;

public class Test1run {
	public static void main(String[] args) {
		Test1 t1 = new Test1(); //Test01 객체를 불러씀
		
		System.out.println(t1.su1); //0 //기본 타입 int su1 에 초기값을 안 주면 에러 but 필드 int su1은 참조타입 기본값 0
		System.out.println(t1.su2); //100
		System.out.println(t1.d1); //
		System.out.println(t1.d2); //
		System.out.println(t1.l1); //
		System.out.println(t1.l2); //
		System.out.println();
		
		Test2 t2 = new Test2();
		System.out.println("t2 : " +t2.name);
		
		Test2 t3 = new Test2();
		System.out.println("t3 : " +t3.name);
		t3.name = "김말숙";
		System.out.println("t3 : " +t3.name);
		
	}
}
//설계도는 한개만 놔두고 객체는 여러개를 만들어서 마구 꾸밀 수 있다.
