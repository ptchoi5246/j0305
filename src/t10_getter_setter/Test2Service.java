package t10_getter_setter;

public class Test2Service {

	public String sexGenderCheck(int sex) {
		if(sex == 1 || sex == 3 ) return "남자";
		else return "여자";
	}
		
}
