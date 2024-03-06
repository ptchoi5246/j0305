package t3_constructor;

public class Test03Run {
	public static void main(String[] args) {
		Test03 t3_1 = new Test03();
		Test03 t3_2 = new Test03(100);
		
		System.out.println("t3_1.atom : " +t3_1.atom);
		System.out.println("t3_2.atom : " +t3_2.atom);
		//atom의 값이 30이니까 둘다 30으로 출력 //전역변수
		
		t3_1.atom = 500; //전역변수의 개념이 아님 //heap에 새로운 방이 만들어짐
		System.out.println("t3_1.atom : " +t3_1.atom); //500
		System.out.println("t3_2.atom : " +t3_2.atom); //30
		//heap에 t3_1 생성 - atom = 30
		//heap에 t3_2 new 생성 - atom = 30
		//t3_1.atom 500 변경 = 30 -> 500으로 변경
		//t3_2.atom은 전혀 영향을 받지 않는다.
		System.out.println();
		
		t3_2.atom = 600; //별도의 방
		System.out.println("t3_1.atom : " +t3_1.atom); //500
		System.out.println("t3_2.atom : " +t3_2.atom); //600
		System.out.println();
		
		Test03 t3_3 = new Test03(10, 20);
		System.out.println("t3_3.atom : " +t3_3.atom); //10
		System.out.println("t3_3.atom2 : " +t3_3.atom2); //20
		System.out.println();
		//매개변수를 통해서 값을 입력하는 방법
		//많이 사용
		
		
		t3_3.atom = -100;
		t3_3.atom2 = -200;
		System.out.println("t3_3.atom : " +t3_3.atom); //-100
		System.out.println("t3_3.atom2 : " +t3_3.atom2); //-200
		System.out.println();
		//필드 통해서 직접 값을 주는 방법
		//편하다 / 해커들에게 당하기 쉽다
		//절대 사용하면 안 된다!!!!!
		
		Test03 t3_4 = new Test03(70, 3.14);
		System.out.println("t3_4.atom : " +t3_4.atom); //70
		System.out.println("t3_4.atom3 : " +t3_4.atom3); //3.14
		System.out.println();
		
		
		
		
		
	}
}
