package t3_constructor;

public class Test04_2 { //필드로 먼저 사용할 단어 먼저 만들고 생성자 변수로 준다.
	
	String model;
	String color = "블랙";
	int speed;
	//가장 외부에서 많이 받아서 필드에 넣는 것만 살린다. 나머지는 줄인다.
	
	Test04_2(String model) { //#1
		this(model, "흰색", 250);
	}
	
	Test04_2(String model, String color) { //#2
		this(model, color, 250);
	} //스피드만 정해져 있고 모델과 컬러는 Run에서 받는다.
	//Run에서 받는건 바로 밑에 있다.
	//this. 현재 클래스의 필드 Field
	//this() 현재 클래스의 생성자 Constructure
	
	Test04_2(String model, String color, int speed) { //#3
		this.model = model;
		this.color = color;
		this.speed = speed;
		//Run에서 모델, 색상, 속도 입력 받음
	}	
}
