package t8_Static;

public class T4_staticFinal {
	static final String NATION = "Korea"; //final ~ : 값을 고정시키겠다. 변경 불가
	// static : 자주 써서 메소드 영역에 저장, static final = 상수, 변수의 이름 무조건 대문자!!!
	final String jumin;
	String name;
	
	T4_staticFinal(String jumin){ //jumin 생성자 //final 선언으로 값을 입력한 상태로 사용 가능
		this.jumin = jumin; 
	}
	
	public String getNation() {
		return NATION;
	}	

}
