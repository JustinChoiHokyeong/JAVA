package test.main;


//1. 객체를 생성하는데 필요한 클래스 import
import test.mypac.Calculator;

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 * 만일 프로그래밍의 목적이 '계산'이라면?
		 * 
		 * - 계산기능을 수행할 수 있는 객체가 필요하다.
		 * - 계산기능을 수행할 수 있는 객체를 생성해서 heap 영역에 올려놓고
		 * - 참조값을 이용해서 계산을 해야한다.
		 * 
		 * 다른 패키지에 있는(다른 공간에 있는) 클래스를 사용하려면 import 해야 한다.
		 * */
		
		//2. 객체를 생성한다. 
		// new : 사용할 수 있는 '실체'를 만드는 작업(class 자체는 설계도일뿐)
		Calculator cal=new Calculator(); 
		// 만들면 heap에 저장되고, 이 위치는 참조값으로 바뀜
		// cal의 타입은 Calculator 타입이며, 해당 클래스명을 그대로 갖고 온 것이다.
		cal.exec();
		
		// void : 어떤 값도 리턴하지 않는다, 콜(동작)만 시키고 끝이다. 데이터 타입 x
		
		//Calculator 객체의 brand 필드 참조하기
		String a=cal.brand;  // 참조된 값을 변수에 대입하기
		
	
	}

}
