package ex05;

public class Sample {

	public static void main(String[] args) {
		// 성적표 제작하기
		String [] name= {"오은지", "김은지", "최은지", "반평균"};
		int [] kor= {90,95,70};
		int [] eng= {90,95,70};
		int [] mat= {90,95,70};
		int [] tot= new int[3];
		double[] avg= new double[3];
		int sumKor=0;
		int sumEng=0;
		int sumMat=0;
		int avgAvg=0;
		
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<=2; i++) {
			tot[i]= kor[i] + eng[i] + mat[i];
			avg[i]= tot[i]/3.;
			sumKor=sumKor+ kor[i];
			sumEng=sumEng+ eng[i];
			sumMat=sumMat+ mat[i];
			avgAvg=avgAvg+ (int)avg[i];
			
			System.out.println(name[i] + "\t" + kor[i] + "\t" + eng[i] 
					+ "\t" + mat[i] + "\t" + tot[i] + "\t" + avg[i]);
			
		}
		System.out.println("--------------------------------------------");
		System.out.println("반평균"+ "\t" + sumKor/3 + "\t" + sumEng/3 + 
							"\t" + sumMat/3 + "\t\t" + avgAvg/3);
			
		
		

	} //main method

} //Sample
