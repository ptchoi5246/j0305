package t6_exam;

public class Test_format {
	public static void main(String[] args) {
		
		int su = 1234000;
		double su2 = 1234000.123;
		String su3 = "1234000"; //문자형식의 숫자 -> 숫자로 바꿔서 연산을 시켜야 한다. refer Class
		
		System.out.printf("금액 : %,d\n", su); //String에서 제공해주는 객체방식
		//돈 ,를 사용하고 싶으면 println 대신에 printf
		
		System.out.printf("금액 : %,10d\n", su); //전체 10자리 정수d
		System.out.println();
		
		System.out.printf("금액 : %,15.2f\n", su2); //전체 15자리 실수 f중에서 소수점은 2자리
		
		System.out.println(String.format("%,10d", su));
		//String.format %,10d : 10자리 확보,쉼표를 넣어라
		System.out.println(String.format("%,15d", su));
		
		System.out.println(String.format("%,15d", Integer.parseInt(su3))); //에러 
		//int의 레퍼 형식 Integer.parstInt(su3) 문자형식의 숫자 su3를 정수로 변환한다 
		
		
	}
}
