package t10_getter_setter;

public class Test1 {
	
	private String name = "홍길동";
	private int age;
	private boolean gender;
	private String address;
	
	private String sex;
	
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
		if(age >= 20) this.age = age;
		//else this.age = 0 //유효성 검사
		else System.out.println("미성년자는 가입 하실 수 없습니다.");
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
	public String getSex() {
		if(gender) return "남자";
		else return"여자";				
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
}
