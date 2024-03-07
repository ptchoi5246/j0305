package t1_class;

public class Test4{
	public static void main(String[] args) {
		Test1 t1 = new Test1(); //Test01 객체 생성 - 힙 메모리에 올라왔다
		//나는 heap 메모리에 있는 Test01 클래스를 t1이라 부르고 사용하겠다.
		Test1 t2 = new Test1();
		//같은 설계도로 t1, t2 설정
		//Test01 : 설계도, t1 : 101호, t2 : 102호
		//new 붙이면 heap에 다르게 저장, 즉 t1과 t2는 다르다.
		
		if(t1 == t2) { //== 수치, 값, 주소 비교
			System.out.println("t1 객체와 t2객체는 서로 같은 객체 입니다.");
		}
		else {
			System.out.println("t1 객체와 t2객체는 서로 다른 객체 입니다."); //출력 //주소값이 다르기 때문			
		}
		
		Test1 t3;
		t3 = t1; //같은 곳을 가르키는 것. 얕은 복사
		if(t1 == t3) {
			System.out.println("t1 객체와 t3객체는 서로 같은 객체 입니다."); //출력 같은 주소값을 가르킨다. ; 얕은 복사
		}
		else {
			System.out.println("t1 객체와 t3객체는 서로 다른 객체 입니다.");			
		}
		
		Test1 t4 = null; //객체의 초기값에는 null 입력 가능
		if(t1 == t4) {
			System.out.println("t1 객체와 t4객체는 서로 같은 객체 입니다.");
		}
		else {
			System.out.println("t1 객체와 t4객체는 서로 다른 객체 입니다."); //출력 t1의 객체값을 준게 아니기 때문에 다른 객체.			
		}
		
		//null비교 시는 '== / !=='로 비교해야한다. 아래는 실행오류 발생
//		if(t4.equals(null)) { //객체의 값 비교 .equals -> 오류 NullPointerException; 아무것도 없는거랑 .equals로 비교할 수 없다.
//			System.out.println("t4는 null입니다.");
//		}
//		else {
//			System.out.println("t4는 null이 아닙니다.");
//		}
		
		if(t4 == null) {
			System.out.println("t4는 null입니다.");
		}
		else {
			System.out.println("t4는 null이 아닙니다.");
		}
		
	}
}
//원본 설계도(class)가 있어야지 Test01 생성할 수 있따. 