package test.main;

import test.mypac.Member;

public class MainClass03 {
	public static void main(String[] args) {
		
		System.out.println("Main Method is started.");
//		new Member + 콘트롤 + 스페이바 해서 찾아서 엔터 누르면 자동으로 수입됨
		Member mem1 = new Member();
		mem1.num=1;
		mem1.name="KIM";
		mem1.addr="GANGNAM";
		// num, name, addr 는 필드에다 저장함
		
		Member mem2 = new Member();
		mem2.num=2;
		mem2.name="CHOI";
		mem2.addr="SONGPA";
	}

}
