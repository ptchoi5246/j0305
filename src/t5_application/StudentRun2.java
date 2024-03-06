package t5_application;

import java.util.Scanner;
//실행객체
public class StudentRun2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //입력 받기 위해 Scanner
		
		StudentVO vo = new StudentVO();//입력객체 생성
		
		//자료를 담아놓는 메소드가 필요하다
		
		
		System.out.print("번호를 입력하세요~!  "); //세터 객체
		vo.setNo(sc.nextInt());//객체 값 저장 //private 해도 getter setter 접근 가능
		// vo.no = sc.nextInt(); 가능하다 but private int no - 불가능
		//필드에 직접적인 값 주는거 해커들 때문에 굉장히 위험하다 **접근제한자
		
		System.out.print("이름를 입력하세요~!  ");
		vo.setName(sc.next());
		
		System.out.print("나이를 입력하세요~!  ");
		vo.setAge(sc.nextInt());
		
		System.out.print("성별를 입력하세요~!(1:남자, 2:여자)  ");
		int choice = sc.nextInt();
		if(choice == 1) vo.setGender(true);
		else vo.setGender(false);				
		
//		choice = sc.nextInt(); //성별은 boolean 숫자로 입력 받으니까 choice
//		if(choice == 1) gender = true; //남자
//		else gender = false; //여자
		
		System.out.print("직업을 입력하세요~!  ");
		vo.setJob(sc.next());
		
		StudentService2 service = new StudentService2(); //객체생성 //처리 서비스객체
		service.print(vo);//vo에 모든 객체들이 저장되어 있다.
		
		
		System.out.println("수고하셨습니다.");
		
		sc.close();
				
	}
}
