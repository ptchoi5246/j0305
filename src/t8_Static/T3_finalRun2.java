package t8_Static;

public class T3_finalRun2 {
	public static void main(String[] args) {		
		
		T3_final2 t3_2 = new T3_final2("123456-2345678");
		System.out.println("t3_2.jumin : " + t3_2.jumin);
		System.out.println("name1 : " + t3_2.name);
		
		//t3_2.jumin = 456789-1234567; //불가, final로 값을 입력했기 때문에
		
		t3_2.name = "홍길동";
		System.out.println("name2 : " + t3_2.name);
		
		t3_2.name = "홍길창";
		System.out.println("name3 : " + t3_2.name);
		
		
	}
}

