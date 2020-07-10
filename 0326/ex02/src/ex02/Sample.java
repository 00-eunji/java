package ex02;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		// 학생별 점수리스트 제작하기
		Scanner s=new Scanner(System.in);
		boolean run=true;
		int [] scores = null; //초기화값, 값을 모르기 때문에 null로 지정
		
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");
			
			System.out.print("선택>");
			int menu=s.nextInt();
			
			
			switch(menu) {
				case 1: //학생수 입력
					System.out.print("1.학생수>");
					int count=s.nextInt();
					scores=new int[count];
					break;
				case 2: //학생 점수 입력
					for(int i=0; i<=scores.length-1; i++) {
						System.out.print("점수[" + i + "]>");
						scores[i]=s.nextInt();
					}//for
					break;
				case 3://점수리스트 출력
					for(int i=0; i<=scores.length-1; i++) {
						System.out.println("점수[" + i + "]>" + scores[i]);
					}
					break;
				case 4: //점수 분석 출력
					int sum=0; //while 문 안에 들어가 있어야 분석할 때 마다 초기화되서 값이 나옴
					int max=0;
					double avg=0;
					for(int i=0; i<=scores.length-1; i++) {
						sum = sum + scores[i];
						avg= (double)sum/scores.length;
						if(scores[i]>max) {
							max=scores[i];
						}//if
					}//for
					System.out.println("최고점수:" + max);
					System.out.println("평균점수:" + avg);
					break;
				case 5:
					run=false;
					System.out.print("프로그램 종료");
					break;
				default:
					System.out.println("잘못 입력하셨습니다.");
			}//switch
			
			
		}//while
		
		
		
		
		
		
		
		
		
		
		
	}//main method

}//Sample
