package ex04;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		// ���°��� ����Ʈ �����ϱ�
		
		Scanner s=new Scanner(System.in);
		boolean run=true;
		String [] number= new String[100]; //���¹�ȣ
		String [] name= new String[100]; //������
		int [] balance= new int[100]; // �ܾ�
		int count=0; //���� ����
		
		while(run) {
			System.out.println("----------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("----------------------------------------");
			
			System.out.print("����>");
			int menu=s.nextInt();
			int i=0;
			String num= null;
			
			switch(menu) {
			case 1://���»���
				System.out.println("-----------------------------");
				System.out.println("���»���");
				System.out.println("-----------------------------");
				
				System.out.print("���¹�ȣ>");
				number[count]=s.next();
				System.out.print("������>");
				name[count]=s.next();
				System.out.print("�ʱ��Աݾ�>");
				balance[count]=s.nextInt();
				System.out.print("���: ���°� �����Ǿ����ϴ�. \n");
				count= count+1; //���� ���� 1 ����
				break;
				
			case 2://���¸��
				for(i=0; i<=count-1; i++) {
					System.out.println(number[i] + "\t" + name[i] + "\t" + balance[i]);
				}
				System.out.println();
				break;
				
			case 3://����
				System.out.println("-----------------------------");
				System.out.println("����");
				System.out.println("-----------------------------");
				
				System.out.print("���¹�ȣ>");
				num=s.next(); // �ӱ��� ���¹�ȣ (�� ���¿� �񱳴���� �� ����)
				System.out.print("���ݾ�>");
				int input=s.nextInt();
				
				boolean find=false;
					for(i=0; i<=count-1; i++) {
						if(number[i].equals(num)) { //�� ���¿� �Ա��� ���°� ���� ��
						balance[i]=balance[i]+input; //�⺻�׿��� �Աݾ� ���ϱ�
						System.out.println("�ܾ�:" + balance[i]);
						find=true;
					}
				}
				if(find) {
					System.out.println("������ �����߽��ϴ�. \n");
				} else {
					System.out.println("���°� �����ϴ�. \n"); 
					}
				break;
			case 4://���
				System.out.println("------------------------------");
				System.out.println("���");
				System.out.println("------------------------------");
				
				
				System.out.print("���¹�ȣ>");
				num=s.next(); // �Ա��� ���¹�ȣ (�� ���¿� �񱳴���� �� ����)
				for(i=0; i<=count-1; i++) {
				if(number[i].equals(num)) {
					System.out.print("��ݾ�>");
					int output=s.nextInt(); //��ݾ� �������ֱ�
					balance[i]=balance[i]-output; //�Ѿ׿��� ��ݾ� ����
					System.out.println("��ݿ� �����߽��ϴ�. \n");
				}
				}
				break;
				
			case 5://����
				run=false;
				System.out.println("���α׷��� �����մϴ�.");
				break;
				
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			
			}//switch
			
			
			
		}//while
	

	}

}
