package t8_Static;

public class T4_staticFinalRun {
	public static void main(String[] args) {
		T4_staticFinal t4 = new T4_staticFinal("1234-1234");
		System.out.println("국가명 : " + t4.NATION); //직접 필드 접근
		System.out.println("국가명 : " + T4_staticFinal.NATION); //클래스 이름.nation으로 불러야한다.
		System.out.println("주민번호 : " + t4.jumin);
		System.out.println("성명 : " + t4.name);
		System.out.println("국적(메소드호출) : " + t4.getNation()); //메소드 접근
		System.out.println();
	}
}
