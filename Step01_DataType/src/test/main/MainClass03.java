package test.main;

public class MainClass03 {
	/*
	 * 2. 논리형(boolean)
	 * true, false 두 가지 중 하나이다
	 * true, false를 직접 쓰거나, 비교연산 혹은 논리 연산의 결과로 얻어낼 수 있다.
	 * 참과 거짓을 나타내는 데이터 타입
	
	 * */
	public static void main(String[] args) {
		//논리형 변수 선언과 동시에 값 대입하기
		boolean isRun=true;
		if(isRun) {
			System.out.println("Run!");
		}
		
		//비교 연산의 결과로 얻어진 boolean 값 담기
		boolean isGreater=10>1;
		//논리 연산의 결과로 얻어진 boolean 값 담기
		// false or true = true
		// false and true = false
		boolean result=true||false;
		
		//한번 선언한 변수는 다시 선언할 수 없다.
		//boolean result=false;
		result=false; //변수에 다른 값을 대입할 수 있다.(동일한 type인 경우)
		// result=10 처럼, 다른 type 값은 변수에 담을 수 없다.
		
	}
}
