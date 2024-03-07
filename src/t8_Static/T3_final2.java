package t8_Static;

public class T3_final2 {
	final String nation = "Korea"; //final ~ : 값을 고정시키겠다. 변경 불가
	final String jumin;
	String name;
	
	// public T3_final2() {}//기본 생성자	

	T3_final2(String jumin){ //jumin 생성자 //final 선언으로 값을 입력한 상태로 사용 가능
		this.jumin = jumin; 
	}
	
	public String getNation() {
		return nation;
	}	
}

//final을 주면 값을 입력하는 기회를 1번 밖에 안 준다.
//(값을 입력하는 방법 - 세터, 생성자)
//생성자로 값을 입력하는 방법을 사용한다.
