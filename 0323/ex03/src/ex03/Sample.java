package ex03;

public class Sample {

	public static void main(String[] args) {
		// 문자형 변수 char [eng_name]
		// char엔 문자 하나만 저장 가능 'ㅁ'
		// string 여러문자로 저장할 때 "ㅁㅁㅁ"
		char  a='A';
		String name= "홍길동";
		System.out.println("반:" + a);
		System.out.println("이름:" + name);
		
		int kor=85, eng=95, mat=89;
		double tot=kor + eng + mat;
		double avg=tot/3;
		System.out.println("국어:" + kor);
		System.out.println("영어:" + eng);
		System.out.println("수학:" + mat);
		System.out.println("합계:" + tot);
		System.out.println("평균:" + avg);

		
		//논리형 변수
		boolean stop=true;
		stop=false;
		System.out.println("stop:" + stop);
	}

}
