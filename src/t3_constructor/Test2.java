package t3_constructor;

public class Test2 {
	//기본 생성자 ::내용 없을 때
	Test2() {} //생성자
	
	Test2(int su1) {} //오버 로딩	
	//사용자가 생성자를 만들면 컴파일러는 기본 생성자를 만들지 않는다.
	
	Test2(int su1, int su2) {} //오버 로딩	
	//(int atom1, atom2) 같은 타입 int , int 2개가 있기 때문에 오버로딩 안된다.
	//변수 명은 상관 없음.
	//Test02(int atom1, int atom2){} // 에러
	
	Test2(int su1, double su2) {} //오버 로딩
	
	Test2(double su2, int su1) {} //오버 로딩
	
	//타입, 순서, 갯수에 따라서 다르다	
}
