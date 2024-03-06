package t3_constructor;

public class Test04_2Run {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(system.in)
		Test04_1 t4_1 = new Test04_1("그랜져"); //생성자 __ =new 생성자(생성자 이름 = 클래스 이름)(필드)
		System.out.println("모델명 : " + t4_1.model); //출력 (String model = "그랜저")
		System.out.println("색상 : " + t4_1.color); // ("흰색")
		System.out.println("최대속도 : " + t4_1.speed); //("250")
		System.out.println();
				
		Test04_2 t4_2 = new Test04_2("제네시스", "은색");
		System.out.println("모델명 : " + t4_2.model);
		System.out.println("색상 : " + t4_2.color);
		System.out.println("최대속도 : " + t4_2.speed);
		System.out.println();
		
		Test04_2 t4_3 = new Test04_2("렉서스", "빨강색", 300);
		System.out.println("모델명 : " + t4_3.model);
		System.out.println("색상 : " + t4_3.color);
		System.out.println("최대속도 : " + t4_3.speed);	
		
	}
}
