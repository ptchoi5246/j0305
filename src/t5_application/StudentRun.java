package t5_application;

import java.util.Scanner;
//실행객체
public class StudentRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //입력 받기 위해 Scanner
		//변수 객체
		int no;
		String name;
		int age;
		boolean gender;
		String job;
		int choice; //성별 입력값을 위한 변수
		
		System.out.print("번호를 입력하세요~!  ");
		no = sc.nextInt(); //입력한 값 그대로
		
		System.out.print("이름를 입력하세요~!  ");
		name = sc.next(); //입력한 값 그대로
		
		System.out.print("나이를 입력하세요~!  ");
		age = sc.nextInt(); //입력한 값 그대로
		
		System.out.print("성별를 입력하세요~!(1:남자, 2:여자)  ");
		choice = sc.nextInt(); //성별은 boolean 숫자로 입력 받으니까 choice
		if(choice == 1) gender = true; //남자
		else gender = false; //여자
		
		System.out.print("직업을 입력하세요~!  ");
		job = sc.next();
				
		StudentService service = new StudentService(); //객체생성
		service.print(no,name,age,gender,job);///service의 print를 불러온다.
		
		
		System.out.println("수고하셨습니다.");
		
		sc.close();
				
	}
}
