package ex04;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		//�迭 (����Ÿ��)
		/*
		int[] d= {90,89,100,88,73};
		int sum=0;
		
		for(int i=0; i<=d.length-1; i+=1) {
			System.out.println(i + "��°: " + d[i]);
			sum=sum + d[i];
		}
		System.out.println("�հ�: " + sum);
		double avg=(double)sum/d.length;
		System.out.println("���: " + avg);
		*/
		
		Scanner s=new Scanner(System.in);
		int[] num=new int[5];
		int sum=0;
		
		for(int i=0; i<=num.length-1; i++) {
			System.out.print(i + "��° ��?");
			num[i]=s.nextInt();
			sum=sum+num[i];
		}
		
		System.out.println("�հ�: " + sum);
		
		
		
		
		
		
		
		
		
	}// main method

}// Sample
