package ex08;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
			System.out.println("�����Է�>");
			int num=scanner.nextInt();
			int sum=0;
			
			while(num!=0) {
				for(int i=0; i<=num; i++) {
					sum= sum+i;
				}
				System.out.println("1~" + "������ �հ�=" + sum + "\n");
				sum=0;
				System.out.print("�����Է�>");
				num=scanner.nextInt();
			}
		System.out.println("���α׷� ����");
			
			
			
	}
	
}

