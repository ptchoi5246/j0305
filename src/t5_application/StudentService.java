package t5_application;
//서비스객체
public class StudentService {
	//void 객체
	void print(int no, String name, int age, boolean gender, String job) {
		//ServiceRun :: service.print(no,name,age,gender,job);
		
		//성별
		String genderOk = genderCheck(gender); //메소드();
		
		String ageOk;
		if(ageCheck(age)) ageOk = "성인";//boolean ageOk = ageCheck(age);
		else ageOk = "미성년";
		
		//최종 출력
		System.out.println("번호:"+no+", 성명:"+name+", 나이:"+age+", 성별:"+genderOk+", 직업:"+job+", 비고:" +ageOk);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//여기서부터 이해 불가,,,,
	//성별 비교
	String genderCheck(boolean gender) {
		String res = "";
		if(gender) res = "남자";
		else res = "여자";
		return res;
	}
	
	//나이 비교 - 성년, 미성년
	boolean ageCheck(int age) {
		if(age>=20) return true;
		else return false;		
	}
	
}
