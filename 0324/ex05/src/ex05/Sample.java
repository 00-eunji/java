package ex05;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		//switch();
		//sungjuck();
		sungjuck1();
		
		
		
		
		
	}// main method

	
	public static void switch1() {
		System.out.println("switch 예제");
		
		
		Scanner scanner=new Scanner (System.in); //Scanner도 class이기 때문에 대문자로 시작함
		System.out.println("시간입력>");
		int time= scanner.nextInt(); //키보드에서 데이터 입력

		switch(time) {
		case 9:
			System.out.println("회의를 합니다.");
			break;
		case 8:
			System.out.println("출근을 합니다.");
			break;
		case 11:
			System.out.println("업무를 봅니다.");
			break;
		default:
			System.out.println("외근을 합니다.");
		}
		
		
		
	} //method2
	
	public static void sungjuck() {
		System.out.println("****성적계산****");
		Scanner scanner=new Scanner(System.in);
		System.out.print("국어>");
		int kor=scanner.nextInt();
		System.out.print("수학>");
		int mat=scanner.nextInt();
		System.out.print("영어>");
		int eng=scanner.nextInt();
		
		int tot= kor + mat + eng;
		System.out.println("총점>" + tot);
		double avg= (double)tot/3;
		System.out.println("평균>" + avg);
		
		
	} //sungjuck
	
	public static void sungjuck1() {
		Scanner s=new Scanner(System.in); // 키보드 입력
		System.out.print("점수>");
		int score= s.nextInt();
		if(score>=90) {
			System.out.println("학점은 A");
		}else if(score>=80) {
			System.out.println("학점은 B");
		}else if(score>=70) {
			System.out.println("학점은 C");
		}
	}//sungjuck1
	
	
	
}//sample
