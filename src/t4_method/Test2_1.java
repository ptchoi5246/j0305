package t4_method;

public class Test2_1 {
	void mod1() {
		System.out.println("안녕 :)");
	}
	
	int mod2(int su1) { //리턴 타입 int - return 값 무조건 있어야한다.
		//return 10;
		return su1; //return 리턴 타입에 맞춰서 작성
	}
		
	int mod1(int su1) { //8-11 오버로딩(메소드의 매개변수의 타입, 갯수, 순서가 다른 것)
		return su1;
	}
		
//	int mod1() { //int mod1()오류 : int가 리턴타입
//		return 10;
//	}
	
	int add(int su1, int su2) { 
		return su1 + su2;
	}
	
	//빼기 (sub)
	int sub(int su1, int su2) {
		return su1 - su2;
	}
	
	//곱하기 (mul)
	int mul(int su1, int su2) {
		return su1 * su2;
	}
	
	//나누기 (div)
	double div(int su1, int su2) {
		return su1 / su2;
	}
	
	
	
	
	
}
