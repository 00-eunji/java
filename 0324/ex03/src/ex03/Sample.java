package ex03;

public class Sample {

	public static void main(String[] args) {
		// 실습
		String name="냉장고";
		int price=100;
		int num=2;
		int tot=price*num;
		String remark="";
		
		// 판매액이 1000이상이면 최우수
		//		   500이상이면 우수
		//		   500미만이면 보통
		
		if(tot>=1000) {
			remark="최우수"; 
		} else if(tot>=500) {
			remark="우수";
		} else {
			remark="보통";
		}
		
		//판매 결과 출력하기
		System.out.println("이름은 " + name + " 입니다.");
		System.out.println("가격은 " + price + "원 입니다 ");
		System.out.println("판매 수량은 " + num + "개 입니다.");
		System.out.println("판매액은 " + tot + "원 입니다.");
		System.out.println("등급은 " + remark + " 입니다.");

		
	}

}
