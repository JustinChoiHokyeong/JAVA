package test.main;

public class MainClass08 {
	public static void main(String[] args) {
		
/*
 * java에서 기본 데이터 타입 8개를 제외한 나머지는 
 * 모두 참조 데이터 타입이다.
 * 
 * 참조 데이터 타입 객체는 heap영역(사물함 영역)에 만들어진다.
 * 모든 객체는 저장소(필드)와 기능(메소드)로 구성되어 있을 수 있다.
 * 어떤 저장소와 어떤 기능을 가지게 될지는 
 * 해당 타입 객체가 어떻게 설계되었냐에 따라 다르다.
 * 
 * 참조값에 .을 찍으면 저장소(필드)를 참조하거나 기능(메소드)을 사용할 수 있다.
 * 참조값에 .을 찍으면 필드를 참조하거나 메소드를 호출할 수 있다.
 * 메소드 호출은 javascript에서 함수 호출과 유사하다.
 * */		
		
		String str="health";
		//해당 문자열의 길이를 대응시킴
		int result=str.length();
		System.out.println(result);
		//해당 인덱스에 위치하는 char 데이터를 대응시킴
		//. 찍었을 때 설명에서 인덱스는 int로 제시하라고 알려줌
		char result2=str.charAt(0);
		System.out.println(result2);
		String result3=str.toLowerCase();
		System.out.println(result3);
		
		// 1.
		String str2=str.toUpperCase();
		// 2.
		String greet="Hello! mimi, Bye! mimi";
		String greet2=greet.replace("mimi", "mama");
		// 3.
		String message="My name is Kimgura.";
		boolean isStart=message.startsWith("My");
		// 호출하고 반환되는 값의 데이터 타입과 대응되는 변수의 테이터 타입은
		// 똑같이 설정해야 한다.
		// 4.
		int index=message.indexOf("i");
		
		
	}

}
