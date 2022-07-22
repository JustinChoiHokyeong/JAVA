package test.main;

public class MainClass04 {
	/*
	 * 2. 문자형(char)
	 * 65,536가지의 코드값을 가질 수 있다.
	 * (내부적으로 short 타입 데이터를 가질 것이다, 갯수 범위가 딱 맞음)
	 * 전 세계에서 사용하는 모든 문자 1글자를 표현할 수 있다.
	 * single quotation을 이용해서 만든다.
	 * */
	
	public static void main(String[] args) {
		System.out.println("Main method is started.");
		//char 형 변수 선언과 동시에 값 대입하기
		char ch1='a';
		char ch2='b';
		char ch3='c';
		char ch4='가';
		char ch5='나';
		char ch6='다';
		char ch7='@';
		
		// 파일을 수정하면 파일명에 * 생겼다가, 저장하면 사라진다. 
		
		//정수값에 1:1 대응되는 char값이 존재한다(약속되어 있다)
		int code1=ch1;
		int code2=ch2;
		int code3=ch3;
		int code4=ch4;
		int code5=ch5;
		int code6=ch6;
		int code7=ch7;
		
		//존재하는 모든 문자 하나하나의 코드값(고유의 숫자)이 
		//순서대로 다 기록되어 있기 때문에
		//컴퓨터가 사용자에게 다양한 문자를 인식해서 출력해줄 수 있는 것이다.
		

	}
}
