package t8_Static;

public class T2_staticBlock {
	int field1; //인스턴스 필드
	static int field2; //정적 static 필드
	
	void method1() {} //인스턴스 메소드
	static void method2() {} //정적 메소드
	
	//정적 static 블록 static만 관리
	static {
		
		field2 = 200; //따로 field2만 관리하겠다.
		method2(); //복잡한 수식을 사용
		
		//field1 //에러; 정적 static 블록은 정적 static만 관리
		//method1()
	}

}
