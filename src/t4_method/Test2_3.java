package t4_method;

public class Test2_3 {
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
	
	void add(int su1, int su2) { 
		//return su1 + su2;
		prn(su1, su2, (su1+su2), "+");
	}
	
	//빼기 (sub)
	void sub(int su1, int su2) {
		int res = su1-su2;
		prn(su1, su2, res, "-");
	}
	
	//곱하기 (mul)
	void mul(int su1, int su2) {
		int res = su1 * su2;
		prn(su1, su2, res, "*");		
	}
	
	//나누기 (div) 몫은 소수점 1자리까지
	double div(int su1, int su2) {
		return su1 / su2;
	}
	
	void prn(int su1, int su2, int res, String operator) {
		System.out.println(su1 + operator +su2+ " = " + res);
	}
	
	
	
}
