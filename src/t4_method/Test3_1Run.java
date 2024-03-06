package t4_method;
//배열 객체 넘기기 //동질성의 자료의 집단
public class Test3_1Run {
	public static void main(String[] args) {
		
		int[] su = {90,80,100,70,60}; //배열
		
		Test3_1 t3 = new Test3_1();
		
		int res = t3.hap(su);
		System.out.println("총합 : " +res);
		System.out.println();
		
		res = t3.sum(su);
		System.out.println("총합2 : " +res);
		
		t3.hap(new int[] {1,2,3,4,5,});
		System.out.println("총합3 : " +res);
		
		t3.sum(new int[] {1,2,3,4,5,});
		System.out.println("총합4 : " +res);
		
		//res = t3.hap{(1,2,3,4,5)}; //오류	
		//res = t3.hap(1,2,3,4,5); //오류
		res = t3.sum(1,2,3,4,5); //15
		System.out.println("총합5 : " +res);		
	}
	
}


//private static int hap() { //메모리 메소드 영역에 만들어짐 자주 쓰는 애들 올려두기
	//}
	//static 정적인, 자주 쓰는 
	//static 메인에서 만들면 무조건 static으로 만들어진다.
	