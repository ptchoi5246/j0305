package t3_constructor;

public class Test5VO {

//private 접근 제한자
//:: 값을 변경하는 방법 -생성자(처음에 한번만 값을 준다. 생성자로 변경 불가 - 객체를 새로 만들어야 한다. :: 변경되지 않는 값일 때 사용)
//게터 세터
	private String name;
	private String mid;
	private String password;
	private int age;
	private boolean gender;
	private String address;
	
	//기본 생성자 constructor
	public Test5VO() {}
	//사용자 생성자를 만들면 기본 생성자 무조건 먼저 만들어두기!!!
	
	//처음에 값을 주고 들어가고 싶다. 생성자
	//생성자 Generate Constructor using Field
	public Test5VO(String name, String mid, String password, int age, boolean gender, String address) {
		this.name = name;
		this.mid = mid;
		this.password = password;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}
	//단점 : 사용자가 생성자를 만들었기 때문에 기본 생성자가 없다.
	
	//생성자가 2개이기에 생성자 오버로딩
	//생성자 : public 클래스 이름 (객체 이름)
	
	
	
	//세터: 저장, 게터:읽어올 때 ::필드의 값을 저장하거나 읽어올 때 사용
	//필드의 값을 함부로 변경 못 시키게 하거나, 필드의 값을 꺼내갈 때 그대로 내보내지 않고 변경해서 내보낼 때
	//유효성 검사 ex)은행 계좌 - 마이너스 금액 못 넣게 함, 회원가입 - 미성년자 가입 불가
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
