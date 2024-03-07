package t10_getter_setter;

import java.util.Scanner;

/*
	'성명/나이/지역/성별'을 입력받아 정보를 '저장/출력'하고자 한다.
	나이는 15세 이상 70세 미만인 사람만 가입할 수 있고. //게터세터
	주소의 입력시'외국인'은 0으로 입력된다. //내국인1 boolean
	성별은 '남자는 1,3' '여자는 2,4'로 입력처리 후 저장은 '남자/여자'로 저장한다. //게터세터

 */
public class Test2Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Test2VO vo = new Test2VO(); //vo로 입력 받으려고 객체 생성
				
		System.out.print("이름을 입력하세요~!  ");
		vo.setName(sc.next());
		
		System.out.print("나이를 입력하세요~!  "); //나이 조건이 있으니
		vo.setAge(sc.nextInt()); //vo.setAge로 가기
		
		System.out.print("주소를 입력하세요~! (외국인은 0) ");
		vo.setAddress(sc.next());
		
		Test2Service service = new Test2Service();
		System.out.println("성별을 입력하세요~! (남자: 1,3 / 여자: 2,4");
		int sex = sc.nextInt(); //sex가 남잔지 여잔지 체크 해야한다 - service
		
		//이해안됨
		//String gender =  service.setGenderCheck(sex); //서비스 객체 바로 만들기
		//서비스에서 분석한걸 가져와서 gender에 넣어야한다
		vo.setStrGender(service.sexGenderCheck(sex));
		//vo에 담아둔 StrGender 가져오기
		
		System.out.println("===> 등록된 신상정보 입니다.");
		System.out.println("성명 : " + vo.getName()); //받을 때는 getter로 받는다
		System.out.println("나이 : " + vo.getAge());
		System.out.println("주소 : " + vo.getAddress());
		//System.out.println("성별 : " + gender);//성별은 gender로 받았기에 gender
		//vo에 gender가 없으니까 gender 추가해줘야한다.
		System.out.println("성별 : " + vo.getStrGender());		
		
		sc.close();		
	}
}
