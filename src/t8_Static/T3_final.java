package t8_Static;

public class T3_final {
	final String nation = "Korea"; //final ~ : 값을 고정시키겠다. 변경 불가
	String jumin;
	String name;
	
	public T3_final() {}//기본 생성자
	
//	T3_final(String nation){ //String nation 생성자를 변경하겠다.
//		this.nation = nation; //불가능
//	}
	
	T3_final(String jumin){ //jumin 생성자
		this.jumin = jumin; 
	}
	
	public String getNation() {
		return nation;
	}
	
	
}
