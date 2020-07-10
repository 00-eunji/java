package ex02;

public class Sample {

	public static void main(String[] args) {
		// 이름: 홍길동, 국어:nn 수학:nn 영어:nn 합계:nn 평균:nn 등급:n
		String name="오은지";
		int kor=50, eng=90, mat=75;
		int tot=kor+eng+mat;
		double avg=tot/3;
		String grade="";
		
		if(avg>=90) {
			if (avg>=95) {
				grade="A+";
			}else {
				grade="A-";
			}
		}else if(avg>=80) {
			if (avg>=85) {
				grade="B+";
			}else {
				grade="B-";
			}
		}else if(avg>=70) {
			if (avg>=75) {
				grade="C+";
			} else {
				grade="C-";
			}
		}else {
			grade="F";
		}
		
		//성적 출력
		System.out.println("이름: " + name);
		System.out.println("국어: " + kor);
		System.out.println("수학: " + mat);
		System.out.println("영어: " + eng);
		System.out.println("합계: " + tot);
		System.out.println("평균: " + avg);
		System.out.println("등급은 " + grade + "입니다.");
		
		
		
		
		
		
		
	} // main 

}// sample
