package t3_constructor;

public class Test3 {
	//기본 생성자 ::내용 없을 때
	Test3() {} //생성자 #1
	
	int atom = 30; //atom 필드 = 초기값 있다. 0 //전역변수
	int atom2;
	double atom3;
	
	Test3(int su1) { //오버 로딩	#2
		System.out.println("su1 :  " + su1);//실행내용 작성		
	}
	//사용자가 생성자를 만들면 컴파일러는 기본 생성자를 만들지 않는다.
	
	Test3(int su1, int su2) { //오버 로딩 #3
		atom = su1;
		atom2 = su2;	
	}
	//(int atom1, atom2) 같은 타입 int , int 2개가 있기 때문에 오버로딩 안된다.
	//변수 명은 상관 없음.
	//Test02(int atom1, int atom2){} // 에러
	
	Test3(int atom, double atom3) { //오버 로딩 #4
		this.atom = atom; //this. 내 클래스에 있는 필드 atom
		this.atom3 = atom3;
	}
	//atom 필드에 값을 넣어서 객체를 생셩하려고 만든게 객체의 목적
	//Test03 안에서의 int atom이 {atom}
	
	Test3(double su2, int su1) {} //오버 로딩
	
	//타입, 순서, 갯수에 따라서 다르다	
}
