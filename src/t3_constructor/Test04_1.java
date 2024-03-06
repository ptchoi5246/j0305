package t3_constructor;

public class Test04_1 { //필드로 먼저 사용할 단어 먼저 만들고 생성자 변수로 준다.
	//필드
	String model;
	String color = "블랙";
	int speed;
	
	Test04_1(String model) { //#1
		this.model = model;
		this.color = "흰색";
		this.speed = 250;
	}
	
	Test04_1(String model, String color) { //#2
		this.model = model;
		this.color = color;
		this.speed = 250;
	}
	
	Test04_1(String model, String color, int speed) { //#3
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
	

	
	
	
	
	
}
