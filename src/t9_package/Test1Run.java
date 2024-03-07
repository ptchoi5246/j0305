package t9_package;

import t4_method.Calculator; //다른 패키지에 있는 클래스 불러올 때 import
import t4_method.Test2_1;
import t4_method.Test3_1;
//단점 : 불러올 게 많으면 import 많아짐

//import t4_method.*; //패키지의 전체 모든 클래스를 참조하겠다.
//시간 메모리가 너무 많이 사용된다. 별로 추천하지 않는다. 참조를 많이 해야한다면 사용 가능

public class Test1Run {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		
		// System.out.println(t1.no); //private로 적었기 때문에 불러올 수가 없다.
		System.out.println("1.번호 : " + t1.getNo());
		System.out.println("1.성명 : " + t1.getName());
		
		t1.setNo(10);
		t1.setName("홍길동");
		System.out.println("2.번호 : " + t1.getNo());
		System.out.println("2.성명 : " + t1.getName());
		
		System.out.println("t8_Static.T1의 PI : " + t8_Static.T1.pi);
		//public 추가해주면 불러올 수 있다.
		//접근 제한자 : private, public
		//접근 제한자를 작성하지 않으면 기본으로 default가 붙는다.
		//private : 가장 폐쇄적, 자기 클래스 안에서만 사용 가능
		//default : 자기 패키지 안에서만 사용 가능
		//public : 모두 다 허용, 완전히 free, 완벽하게 공개
		
		//t7_instance.Test1.pi - 인스턴스여서 바로 불러올 수가 없다 -> 객체 생성
		t7_instance.Test1 t7 = new t7_instance.Test1();
		System.out.println("t7_instance.Test1의 PI : " + t7.pi);
		
		new Calculator(); //위에 import가 있어서 바로 객체 생성 가능
		new Test2_1(); // ctrl + shift + /O Organize imports
		new Test3_1(); // ctrl + space	
		
	}	
}
