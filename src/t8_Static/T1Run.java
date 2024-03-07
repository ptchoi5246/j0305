package t8_Static;

public class T1Run {
	public static void main(String[] args) {
		T1 t1 = new T1(); //인스턴스 객체 생성해서 불러 쓸 수 있게 t1으로 부름
		
		System.out.println("pi : " + t1.pi); //pi는 T1 클래스에 있기 때문에 t1.pi로 부른다 //인스턴스 필드
		
		double area = t1.circleArea(10); //인스턴스 필드
		System.out.println("반지름 10인 원넓이?  " + area );
		//System.out.println("반지름 10인 원넓이?  " + t1.ci );
		
		double area2 = T1.circleArea(20); //static 필드를 부를 때는 클래스이름.부를 이름
		System.out.println("반지름 20인 원넓이는? " + area2);
	}
}
