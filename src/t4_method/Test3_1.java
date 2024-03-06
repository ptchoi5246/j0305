package t4_method;
//배열 객체 넘기기 //동질성의 자료의 집단
public class Test3_1 {

	public int hap(int[] su) {
		int hap = 0;
		for(int i=0; i<su.length; i++) {
			hap += su[i];
		}
		return hap;
	}

	public int sum(int ... su) { //여러개의 값이 같을 떄 ... 사용
		int sum = 0;
		for(int i=0; i<su.length; i++) {
			sum += su[i];
		}
		return sum;
	}

	
}
