package ex03;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		boolean run= true;
		int speed= 0;
		int keyCode=0;
		
		while(run) {
				System.out.println("-------------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("-------------------");
				System.out.print("선택: ");
				int menu=s.nextInt();
			
		
			
			switch(menu) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				run=false;
				System.out.println("프로그램 종료");
			}//switch menu
			
		}//while
		
		
		
	}//main method

}//sample

