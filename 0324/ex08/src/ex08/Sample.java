package ex08;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
			System.out.println("숫자입력>");
			int num=scanner.nextInt();
			int sum=0;
			
			while(num!=0) {
				for(int i=0; i<=num; i++) {
					sum= sum+i;
				}
				System.out.println("1~" + "까지의 합계=" + sum + "\n");
				sum=0;
				System.out.print("숫자입력>");
				num=scanner.nextInt();
			}
		System.out.println("프로그램 종료");
			
			
			
	}
	
}

