package t6_exam;

import java.util.Scanner;

public class Test_objRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Test_objService service = new Test_objService();
		Test_objVO[] data = new Test_objVO[100]; //배열 생성
		
		int cnt = 0; //배열 0번째부터 시작
				
		while(true) { //반복되는 객체가 다르기 때문에 while 안에서 새로운 객체 만들어야 한다.
			
			Test_objVO vo = new Test_objVO();
			System.out.println("아이디를 입력하세요~!  ");
			vo.setMid(sc.next()); //mid는 vo에 저장되어 있으니까 vo. 부르고 (sc.해당 변수형태)
			System.out.println("비밀번호를 입력하세요~!  ");
			vo.setPwd(sc.next()); 
			System.out.println("이름을 입력하세요~!  ");
			vo.setName(sc.next()); 
			System.out.println("나이를 입력하세요~!  ");
			vo.setAge(sc.nextInt());
			
			//처리할 내용들을 service 객체에서 처리시켜 준다.
			//성인인지 아닌지 구별하기 위해서 service
			vo.setAdult(service.adultCheck(vo.getAge())); //다시한번 더 확인해보기
			
			//처리된 자료를 배열에 저장한다
			data[cnt] = vo; //배열 이름은 data[몇번째] = vo에 담겨있따  
			cnt++; //횟수 반복
			
			System.out.println("계속 하시겠습니까? (Y/N)");
			String yn = sc.next().toUpperCase(); //입력받은 문자를 무조건 대문자료 변형한다
			if(yn.equals("N")) break; //탈출구			
		}
		//배열에 저장된 자료를 출력처리한다. service에서 출력한다.
		service.memberPrint(data, cnt); //service에 멤버 프린트 생성
		
		
		sc.close();
	}
}
