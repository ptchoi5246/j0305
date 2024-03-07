package t7_instance;

public class Test1Run {
	public static void main(String[] args) {
		Test1 t1 = new Test1(); //인스턴스 객체 생성해서 불러 쓸 수 있게 t1으로 부름
		
		System.out.println("pi : " + t1.pi); //pi는 Test1 클래스에 있기 때문에 t1.pi로 부른다
		
		double area = t1.circleArea(10);
		System.out.println("반지름 10인 원넓이?  " + area );
		//System.out.println("반지름 10인 원넓이?  " + t1.circleArea(int r :10)); 이렇게 작성해도 되는데 t1.circleArea를 area로 뺀다
		
		
	}
}
