package ex01;

public class Sample {

	public static void main(String[] args) {
		// 조건문 생성하기
		/*	
		int score = 60;
			System.out.println("점수는 " + score + "점 입니다.");
			
			if(score >= 90) {
				System.out.println("등급은 A입니다.");
			}
			else if (score>=80){
				System.out.println("등급은 B입니다.");
			}	
			else if(score>=70) {
				System.out.println("등급은 C입니다.");
			}
			else {
				System.out.println("등급은 F입니다.");
			}
			
		// 사원의 실적이 100만원 이상이면 최우수,
		// 50만원 이상이면 우수, 30만원 이상이면 보통 출력
			
		int sale=120;
		System.out.println("실적은 " + sale + "만원 입니다.");
		
		if(sale>=100) {
			System.out.println("최우수입니다.");
		}
		else if (sale>=50) {
			System.out.println("우수입니다.");
		}
		else if (sale>=30) {
			System.out.println("보통입니다.");
		}
			*/
		
		// 중첩 if문
		int score = 47;
		String grade="";
		
		
		if (score>=90) {
			if(score>=95) {
				grade="A+";
			}else {
				grade="A0";
			}
		}else if(score>=80) {
			if(score>=85) {
				grade="B+";
			}else {
				grade="B0";
			} 
		}else if(score>=70) {
			if(score>=75) {
					grade="C+";
			}else {
				grade="C0";
			}
		}else {
			grade="F";
		}
		
		System.out.println("등급은 " + grade + "입니다.");
		
		
		
		
	
	} // main
} //sample

		

