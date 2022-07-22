package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("Main method is started.");
		
		int kor=95;
		int eng=100;
		double avg=(kor+eng)/2.0;
		System.out.println("average : "+avg);
		// 정수끼리 연산하면 정수밖에 안나온다
		// 연산에 참여하는 값 중 하나를 실수로 만들면 결과도 실수로 나온다.
		// 여기서는 나누는 값을 실수로 바꿨다.
	}
}
