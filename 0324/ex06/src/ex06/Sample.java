package ex06;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		//for1();
		//for2();
		//for3();
		//for4();
		System.out.print("1:100합계 2:짝수합계 3:홀수합계");
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		switch(number) {
		case 1:
			for2();
			
			break;
		case 2:
			for3();
			break;
		case 3:
			for4();
		}
		
	}//main method

	//for1	5까지 반복 출력
	public static void for1() {
		System.out.println("****예제1****");
		for(int i=0; i<=50; i+=1) { //i++와 i=i+1과 i+=1 같다
			System.out.println(i);
		}
		
	}//for1
	
	
	//for2	1~100까지 합을 출력
	public static void for2() {
		System.out.println("****예제2****");
		int sum=0;
		for(int i=1; i<=100; i++) {
			sum= sum + i;
		}
		System.out.println("1~100까지의 합계:" + sum);
	}
	
	
	//for3	0~100까지의 짝수의 합 출력
	public static void for3() {
		System.out.println("****예제3****");
		int sum=0;
		for(int i=0; i<=100; i+=2) {
			sum= sum + i;
			}
		System.out.println("0~100까지의 짝수의 합계:" + sum);
		}
	
	//for4	1~100까지의 홀수의 합 출력
	public static void for4() {
		System.out.println("****예제4****");
		int sum=0;
		for(int i=1; i<=100; i+=2) {
			sum= sum + i;
			}
		System.out.println("1~100까지의 홀수의 합계:" + sum);
		}
	
	
	
}//Sample
