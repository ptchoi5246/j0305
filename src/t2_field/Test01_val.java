package t2_field;

public class Test01_val {
	//main 밖에서 변수 선언 - 필드
	int su3 = 10; //필드: 완벽한 전역변수
	public void atom() { //메소드에만 void 작성할 수 있음 //atom 메소드
		int su1 = 100; //전역 변수 global vaiable
		
		for(int i=0; i<5; i++) {
			int su2 = 200 *i; //지역변수 local variable // for블록 안에서만 
			System.out.println(su1 + su2);
		}
		su3 += su1;
		System.out.println("su3 :  " + su3); //main이 없어서 출력 불가
	}
 	
	
	
}
