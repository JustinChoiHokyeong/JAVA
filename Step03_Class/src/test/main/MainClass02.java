package test.main;

import test.mypac.Calculator;
import test.mypac.Car;

public class MainClass02 {
	public static void main(String[] args) {
		// 달리는 기능을 Car 객체가 가지고 있다.
		// class 자체는 실체가 없는 설계도에 불과하다, 따라서 new를 해줘야 한다.
		
		// new Car().drive(); 하면 새로운 카를 만들고 1번만 쓰고 사라지는 것(1회용)
		// 만들어서 여러 번 쓰고 싶다면, 
		Car c1=new Car();
		c1.drive();
		c1.drive();
		c1.drive();
		
		// 위에서 달린 차의 이름을 carName 이라는 지역변수에 담아 보세요.
		String carName=c1.name;
		
	}

}

