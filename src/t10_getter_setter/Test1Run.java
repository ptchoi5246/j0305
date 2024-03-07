package t10_getter_setter;

public class Test1Run {
	public static void main(String[] args) {
		Test1 test1 = new Test1();
		
		System.out.println("name : " + test1.getName());
		
		//test1.name = "김말숙"; //필드를 통해서는 값을 바꿀 수 없음
		test1.setName("김말숙"); //세터를 통해서 값을 바꿀 수 있음
		System.out.println("name2 : " + test1.getName());
		
		test1.setAge(10);
		System.out.println("age : " + test1.getAge());
		
		//false를 여자로, true를 남자로
		test1.setGender(false);
		System.out.println("gender : " + test1.getSex());
	
	}

}
