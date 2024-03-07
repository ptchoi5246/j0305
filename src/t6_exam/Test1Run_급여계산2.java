package t6_exam;

import java.util.Scanner;

/*
  사원코드(no), 사원명(name),직급코드(code)와 초과시간(overTime)을 입력받아서 실수령액(netpay)을 계산하시오.
  직급코드 : 부장-B/b, 과장-K/k, 대리-D/d, 사원-S/s
  1시간당 초과수당(sudang)은 25000원이다.
  공제액(gongje)은 (본봉(bonbong)+초과수당)의 10%로 한다.
  본봉 : 부장:5000000, 과장:4000000, 대리:3000000, 사원:2000000
  실수령액 = 본봉 + 수당 - 공제액
  계산부는 비즈니스로직으로 처리(서비스객체를 사용)
*/
public class Test1Run_급여계산2 { //배열 사용 :: 한개씩 출력되지 않고 전체 자료를 다 받고 저장하고 마지막에 전체적으로 출력
//	static Test1VO[] data = new Test1VO[100];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Test1Service2 service = new Test1Service2();
		Test1VO[] data = new Test1VO[100]; //배열 사용 :: 여러 사람을 저장해서 한 번에 처리하기 위해 //같은 성질을 가진 변수를 하나로 묶어쓰면 좋다.
		//배열 data VO배열(한 줄을 같은 성격으로 만듬) 
		int cnt = 0; //전체인원
		
		while(true) {//반복문
			Test1VO vo = new Test1VO(); //while문 안에 VO 객체 생성 - 각자 다른 객체 생성 ex)게시판 글만들기
			System.out.print("사원코드를 숫자로 입력하세요 ==> ");
			vo.setNo(sc.next());
			System.out.print("사원명을 입력하세요 ==> ");
			vo.setName(sc.next());
			while(true) {
				char jikkubCode;
				System.out.print("직급코드를 입력하세요(B(부장), K(과장), D(대리), S(사원) ==> ");
				jikkubCode = sc.next().toUpperCase().charAt(0);
				if(jikkubCode == 'B' || jikkubCode == 'K' || jikkubCode == 'D' || jikkubCode == 'S') {
					vo.setCode(jikkubCode);
					break;
				}
			}
			System.out.print("초과시간을 입력하세요 ==> ");
			vo.setOverTime(sc.nextInt());
	
			// 입력받은 자료들로 급여 계산하기
			service.netPayCalculate(vo);
			
  		// 처리된 자료들을 배열에 저장하기
			data[cnt] = vo; //배열이름 data[_번째 : cnt] = vo 객체  //추가됨 //무조건 세터 사용!!!!!
			cnt++; //1개 처리 - 2개 처리 - 3개 처리 ...
			
			System.out.print("작업을 계속하시겠습니까?(Y/N) ");
			String yn = sc.next();
			if(yn.toUpperCase().charAt(0) == 'N') break;
		}
		// 출력하기
		service.netpayPrint(data, cnt); //바깥으로 빼기 : 다 넣어야지 출력 가능/ (data.length)가 되면 저장소 갯수만큼 출력 / :: data 건수만큼만 출력하세요
		
		sc.close();
	}
}
//한줄을 다 같은 성격으로 만듬 -> VO 객체
// 홍길동 김말숙 이기자 설계도만 같을뿐 각자 다 다른 객체
