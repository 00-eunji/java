package ex04;

public class Sample {

	public static void main(String[] args) {
		// 자동형변환 (작은것 -> 큰것)
		char charValue='A';
		
		
		int intValue = charValue;
		System.out.println(intValue);
		
		double doubleValue = charValue;
		System.out.println(doubleValue);

		intValue=100;
		
		doubleValue=intValue;
		System.out.println(doubleValue);
		
		
		//강제형변환 (큰것 -> 작은것)
		intValue = 68;
		
		charValue = (char)intValue;
		System.out.println(charValue);
		
		doubleValue = 100.5;
		
		intValue=(int)doubleValue;
		System.out.println(intValue);
		
		int kor=95, eng=100;
		double avg=(double)(kor+eng)/2;
		System.out.println(avg);
		// 괄호 더블 하기 전엔 97 -> 둘다 정수이기 때문에 소숫점 자리는 삭제되서 나온다
		// (double)을 하면 실수로 강제형변환이 되어 값이 97.5로 변경되어 나온다.
		
		
		for(char i='A'; i<='Z'; i++) {
			intValue = i;
			System.out.println(i + ":" + intValue);
			
			
		}
		
		
	}

}
