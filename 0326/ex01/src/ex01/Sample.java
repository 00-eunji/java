package ex01;

public class Sample {

	public static void main(String[] args) {
		
		// �迭�� �ִ� �����͵鿡 ���� ��հ��� �ִ밪 ���ϱ�
		
		int [] num= {98,50,40,88,55,30,42,52};
		int sum=0;
		int max=0;
		int min=99999; //���� ���� ���� 0�̱� ������ ���� ū ���� ����
		
		for(int i=0; i<=num.length-1; i++) {
			sum = sum + num[i];
			if(num[i]>max) {
				max=num[i];
			}//if
			if(num[i]<min) {
				min=num[i];
			}
			
		}//for
		
		double avg= (double)sum/num.length;
		System.out.println("���: " + avg);
		System.out.println("�ִ밪: " + max);
		System.out.println("�ּڰ�: " + min);
		
		
		
		
		
		
		
		
		
		
		
		
		

	} // main method

} //Sample
