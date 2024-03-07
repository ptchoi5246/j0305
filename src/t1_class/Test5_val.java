package t1_class;

public class Test5_val {
	//main 밖에서 변수 선언 - 필드
	public static void main(String[] args) {
		int su1 = 100, su3; //전역 변수 global vaiable
		
		for(int i=0; i<5; i++) {
			int su2 = 200 *i; //지역변수 local variable // for블록 안에서만 
			System.out.println(su1 + su2);
		}
		//su3 = su1 + su2;
	}
}
