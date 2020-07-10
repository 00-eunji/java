package ex04;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		//배열 (참조타입)
		/*
		int[] d= {90,89,100,88,73};
		int sum=0;
		
		for(int i=0; i<=d.length-1; i+=1) {
			System.out.println(i + "번째: " + d[i]);
			sum=sum + d[i];
		}
		System.out.println("합계: " + sum);
		double avg=(double)sum/d.length;
		System.out.println("평균: " + avg);
		*/
		
		Scanner s=new Scanner(System.in);
		int[] num=new int[5];
		int sum=0;
		
		for(int i=0; i<=num.length-1; i++) {
			System.out.print(i + "번째 값?");
			num[i]=s.nextInt();
			sum=sum+num[i];
		}
		
		System.out.println("합계: " + sum);
		
		
		
		
		
		
		
		
		
	}// main method

}// Sample
