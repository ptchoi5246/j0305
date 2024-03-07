package t11_Singleton;

public class SingletonRun {
	public static void main(String[] args) {
		// new Singleton(); //private 때문에 생성할 수 없다.
		
		Singleton.getInstance(); //객체 이름으로 생성 가능
		
		
	}
}
