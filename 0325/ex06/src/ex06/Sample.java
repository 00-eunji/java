package ex06;

public class Sample {

	public static void main(String[] args) {
		// 매출 보고서 만들기
		String [] name = {"냉장고", "세탁기", "에어컨"};
		int [] amount = {2,3,5};
		int [] price = {300,100,150};
		int [] sum= new int[3];
		String [] remark = new String[3];
		int tot= 0;
		
		System.out.println("***************매출보고서**************");
		System.out.println("------------------------------------");
		
		System.out.println("상품명" + "\t" + "수량" + "\t" + "단가" + 
							"\t" +"금액" + "\t" + "비고");
		System.out.println("------------------------------------");
		
		for(int i=0; i<=2; i++) {
			sum[i] = amount[i] * price[i];
			tot= tot + sum[i];
			
			if(sum[i]>=700) {
				remark[i]="최우수";
			} else if (sum[i]>=500) {
				remark[i]="우수";
			} else {
				remark[i]="보통";
			}
			
			System.out.println(name[i] + "\t" + amount[i] + "\t" + price[i] + 
								"\t" + sum[i] + "\t" + remark[i]);
		}//for
		
		System.out.println("------------------------------------");
		System.out.println("매출합계" + "\t\t\t" + tot);
		System.out.println("------------------------------------");

		
	}//main

}
