package test.main;

public class MainClass06 {
	public static void main(String[] args) {
		System.out.println("Main method is started.");
		// java에서 메소드 { } 안에서 만드는 변수를 지역 변수라고 함 , in main method
		// java에서는 전역변수라는 개념이 없음, 지역 변수 아니면 필드(아직 안배움)
		// variables에 보이는 변수들은 L, local이라고 표시되어 있다.
		
		int num1;
		String name1;
		// 이 변수들은 아직 안 만들어졌기 때문에, 참조할 수가 없다.
		
		System.out.println("Main method is finished.");
		
		
	}
}
