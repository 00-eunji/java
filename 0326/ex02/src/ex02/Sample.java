package ex02;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		// �л��� ��������Ʈ �����ϱ�
		Scanner s=new Scanner(System.in);
		boolean run=true;
		int [] scores = null; //�ʱ�ȭ��, ���� �𸣱� ������ null�� ����
		
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("-----------------------------------------------");
			
			System.out.print("����>");
			int menu=s.nextInt();
			
			
			switch(menu) {
				case 1: //�л��� �Է�
					System.out.print("1.�л���>");
					int count=s.nextInt();
					scores=new int[count];
					break;
				case 2: //�л� ���� �Է�
					for(int i=0; i<=scores.length-1; i++) {
						System.out.print("����[" + i + "]>");
						scores[i]=s.nextInt();
					}//for
					break;
				case 3://��������Ʈ ���
					for(int i=0; i<=scores.length-1; i++) {
						System.out.println("����[" + i + "]>" + scores[i]);
					}
					break;
				case 4: //���� �м� ���
					int sum=0; //while �� �ȿ� �� �־�� �м��� �� ���� �ʱ�ȭ�Ǽ� ���� ����
					int max=0;
					double avg=0;
					for(int i=0; i<=scores.length-1; i++) {
						sum = sum + scores[i];
						avg= (double)sum/scores.length;
						if(scores[i]>max) {
							max=scores[i];
						}//if
					}//for
					System.out.println("�ְ�����:" + max);
					System.out.println("�������:" + avg);
					break;
				case 5:
					run=false;
					System.out.print("���α׷� ����");
					break;
				default:
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}//switch
			
			
		}//while
		
		
		
		
		
		
		
		
		
		
		
	}//main method

}//Sample
