package test.main;

public class MainClass05 {
/*
 * String type - 문자열을 다룰때 사용하는 데이터 타입이다.
 * */	
	public static void main(String[] args) {
		// "KIM"이라는 String type 객체를 heap 영역에 만들고 그 참조값을 변수에 담기
		String name="KIM";
		// name 안에 있는 참조값을 tmp 변수에 복사해주기(=은 대입연산자,대응시켜주는 역할임)
		// id값이 나오는 게 바로 참조 데이터 타입이다. 
		// 직접 데이터를 갖고 있는 것이 아니고, heap영역의 참조값을 들고 있기 때문에
		// 사물함 영역에 만들어지는 무언가가 객체라고 한다. 따라서 그 객체의 참조값을 갖고 있는 것임
		
		String tmp=name;
		// "MONEY"라는 String type 객체를 heap 영역에 만들고 그 참조값을 name 변수에 덮어쓰기
		name="MONEY";
		// name 변수를 비우기 (null은 참조 데이터 type이 담길 수 있는 빈 공간을 의미한다)
		name=null;
		
		
	}
}
