package test.main;

public class MainClass {
	// MainClass.java의 파일명과 코드 상의 클래스 이름은 같아야 한다.
	// 패키지도 마찬가지이다.
	public static void main(String[] args) {
		System.out.println("Main method is started.");
		int num1=10; // integer : 정수
		double num2=10.1;
		boolean isRun=true;
		String myName="CHOI";
		// 스트링은 예약어가 아니기 때문에 다르게 표시된다.
		
		// 자바에서는 어떤 타입을 넣을지 정해야 한다.
		// dataType identifier(식별자,변수명) =(operator) value; 의 형태를 가짐
//		자바가 자바스크립트보다 엄격한 문법을 갖고 있다.
//		자바스크립트는 웹브라우저 연결을 유지시켜야 하기 때문에 
//		태생부터 느슨하게 만들어진 것
//		문법이 느슨하면 그럴듯해보지만 나중에 예상치못한 오류가 발생할 수 있다.
		
//		정적 타입이라 변수의 타입을 변경할 수 없다. 선언할 때 정해진 타입만 가능
//		단, 정수는 실수에 포함되기 때문에 가능하다.
//		데이터 타입은 사용자 정의로도 만들어서 가능하다. 대신 기본 데이터 타입은 정해져있음
		
		num1=20;
		num2=20.2;
		isRun=false;
		myName="happy";
		
		System.out.println("Main method is finished.");
		
	}

}
