package ex01;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		//method1();
		//method2();
		//method3();
		boolean run=true;
		while (run) {
		System.out.println("원하는 메뉴를 고르세요.");
		System.out.println("[1]성적 프로그램");
		System.out.println("[2]원의 넓이 구하기");
		System.out.println("[3]삼각형의 넓이 구하기");
		System.out.println("[4]프로그램 종료");
		
		Scanner s=new Scanner(System.in);
		int menu=s.nextInt();
		
		switch (menu) {
		case 1:
			method1();
			break;
		case 2:
			method2();
			break;
		case 3:
			method3();
			break;
		case 4:
			System.out.println("프로그램을 종료합니다.");
		default:
			System.out.println("선택을 잘못하셨습니다.");
		} 
		
		}//while
		
	}//main method

	public static void method1() {

		// 이름, 국어, 영어, 수학 키보드에서 입력
		// 총점, 평균 출력
		
		Scanner s=new Scanner(System.in);
		System.out.print("이름: ");
		String name=s.next();
		
		System.out.print("국어: ");
		int kor=s.nextInt();
		
		System.out.print("영어: ");
		int eng=s.nextInt();
		
		System.out.print("수학: ");
		int mat=s.nextInt();
		
		int tot= kor + eng + mat;
		double avg= (double)tot/3;
		
		System.out.println("총점: " + tot);
		System.out.println("평균: " + avg);
	
	}//method1
	
	public static void method2() {
		
		//원의 반지름을 입력받아 원의 넓이를 구한다.
		//반지름이 0이면 프로그램 종료
		
		boolean run=true; //실행이 true 값이면
		while(run) {
			Scanner s=new Scanner(System.in);
			
			System.out.print("원의 반지름: ");
			int r= s.nextInt();
			double area= r * r* 3.14;
			
			System.out.println("원의 넓이: " + area);
		
			if(r==0) {
				System.out.println("프로그램 종료");
				run=false;
			}
		}
	
		
	}//method2

	public static void method3() {
		
		//삼각형의 높이와 밑변을 키보드에서 입력
		//삼각형의 넓이를 구하여 출력한다.
		
		Scanner s=new Scanner(System.in);
		boolean run=true;
			
		while(run) {
			System.out.println("삼각형 넓이를 구하라(y/n)");
			String q=s.next();
			
			if(q.equals("y") || q.equals("Y")) {// ||: 또는 / equals 값을 구하는 명령어
			
				System.out.print("삼각형의 높이: ");
				int h=s.nextInt();
				
				System.out.print("삼각형의 밑변: ");
				int w=s.nextInt();
				
				double area= h * w * 1/2.; //숫자에 . 을 붙이면 실수로 자동 변환
				
				System.out.println("삼각형의 넓이: " + area);
			}else if (q.equals("n") || q.equals("N")) {
				run=false;
				System.out.println("프로그램 종료");
			}else {
				System.out.println("잘못 입력했습니다.");
			}
		}
		
		
		
	}//method3


}// Sample
