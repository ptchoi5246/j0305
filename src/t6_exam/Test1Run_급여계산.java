package t6_exam;
/*
 * 
 사원코드(no), 사원명(name), 직급코드(code), 초과시간(overTime)을 입력받아서 -객체식으로 바꿔서
 실수령액(netpay)을 계산하시오.
 직급코드 : 부장-B/b, 과장-K/k, 대리-D/d, 사원-S/s //toUpperCase, toLowerCase 사용
 1시간당 초과수당(sudang)은 25000원이다.
 공제액(gongje)은 (본봉(bonbong)+초과수당)의 10%로 한다.
 본봉 : 부장-5000000, 과장-4000000, 대리-3000000, 사원-2000000
 실수령액 = 본봉 + 수당 - 공제액
 계산부는 비즈니스로직으로 처리(서비스 객체를 사용)
 *///변수만 따로 관리하는 VO 만들기
public class Test1Run_급여계산 {
	public static void main(String[] args) {
		
	}
}

//여기서 입력을 받고 비즈니스로직에서 계산을 하고 출력은 비즈니스로직, 여기 상관없음
//작업 계속 할지 안 할지 물어보기