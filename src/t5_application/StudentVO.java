package t5_application;
//변수 객체 //Value Object VO //데이터를 담아놓고 들고 옮기는 객체 //데이터 베이스의 자료를 저장
//Data Transfer Object DTO //데이터를 담아놓고 들고 옮기는 객체 //데이터 베이스의 자료를 넣을 때 읽을 때 변환해서 가지고 다니는 객체
public class StudentVO {
	//필드를 관리하는 객체
	private int no; //접근제한자 private
	String name;
	int age;
	boolean gender;
	String job;
	
	//게터 세터 source 단축기 사용해서 바로 만들기
	//VO에서는 무조건 게터 세터 만들어 놓기
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	//값을 받는 메소드 만들기
	//받는건 받기만 하면 된다.(리턴타입 없다) set 저장 객체이름 :: 'setter'
	//읽는건 읽고나서 돌려줘야한다.(리턴타입 있다) get 읽어오기 객체이름 :: 'getter'
	
//	void setNo(int no) { //번호 저장 메소드 만들기 //저장 - 리턴타입 없다 - void
//		this.no = no; //번호 저장하는 세터		
//	}
//	
//	int getNo() { //번호 게터 받는게 없어서 ()
//		return no; //return this.no = no;
//	}
//	
//	void setName(String name) { //이름 저장 메소드 만들기
//		this.name = name;
//	}
//	
//	String getName() { //이름 게터
//		return name;
//	}
	
//	public int getNo() {
//		return no;
//	}
//	public void setNo(int no) {
//		this.no = no;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public boolean isGender() { //boolean 타입의 getter는 get 대신에 is //isGender
//		return gender;
//	}
//	public void setGender(boolean gender) {
//		this.gender = gender;
//	}
//	public String getJob() {
//		return job;
//	}
//	public void setJob(String job) {
//		this.job = job;
//	}	
	
	
	
	
	
	
	
}
//값을 관리하는 VO 객체