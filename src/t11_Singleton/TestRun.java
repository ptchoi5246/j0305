package t11_Singleton;

public class TestRun {
	public static void main(String[] args) {
		Singleton mbc = Singleton.getInstance();
		Singleton kbs = Singleton.getInstance();
		//mbc kbs 같은 객체
		Singleton sbs = Singleton.getInstance();
		
		//객체생성 : new - > 다른 객체
		//Singletone 객체 만들지 않는다. static - 메모리에 올라간다. new 때문에 만들어져있다.
		
		if(mbc == kbs) System.out.println("mbc와 kbs는 서로 같은 객체를 가리키고 있습니다."); //출력
		else System.out.println("mbc와 kbs는 서로 다른 객체를 가리키고 있습니다.");
		
		if(mbc == sbs) System.out.println("mbc와 sbs는 서로 같은 객체를 가리키고 있습니다."); //출력
		else System.out.println("mbc와 sbs는 서로 다른 객체를 가리키고 있습니다.");
		
	}
}
