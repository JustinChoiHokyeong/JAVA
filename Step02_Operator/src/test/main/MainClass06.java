package test.main;
/*
 *  6. 3항 연산자 테스트
 */
public class MainClass06 {
   public static void main(String[] args) {
      boolean isWait=false;
      // isWait 이 true 면 "기다려요" 가 대입되고 false 면 "기다리지 않아요" 가 대입된다.
      String result = isWait ? "기다려요" : "기다리지 않아요";
      // 3개 항을 연산함 _ ? _ : _
    
      
      System.out.println(result);
      
      //위의 3항 연산자는 아래와 같이 if ~ else 문과 같은 로직이다. 
      String result2=null;
      if(isWait) {
         result2="기다려요";
      }else {
         result2="기다리지 않아요";
      }
      // 어떤 값이 반환되느냐에 따라 선언하는 변수의 데이터 타입이 달라진다.
      // : 양쪽 좌우는 같은 데이터 타입이어야 한다.
      System.out.println(result2);   
   }
}