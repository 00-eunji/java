package ex04;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		// 계좌관리 리스트 제작하기
		
		Scanner s=new Scanner(System.in);
		boolean run=true;
		String [] number= new String[100]; //계좌번호
		String [] name= new String[100]; //계좌주
		int [] balance= new int[100]; // 잔액
		int count=0; //계좌 갯수
		
		while(run) {
			System.out.println("----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------");
			
			System.out.print("선택>");
			int menu=s.nextInt();
			int i=0;
			String num= null;
			
			switch(menu) {
			case 1://계좌생성
				System.out.println("-----------------------------");
				System.out.println("계좌생성");
				System.out.println("-----------------------------");
				
				System.out.print("계좌번호>");
				number[count]=s.next();
				System.out.print("계좌주>");
				name[count]=s.next();
				System.out.print("초기입금액>");
				balance[count]=s.nextInt();
				System.out.print("결과: 계좌가 생성되었습니다. \n");
				count= count+1; //계좌 숫자 1 증가
				break;
				
			case 2://계좌목록
				for(i=0; i<=count-1; i++) {
					System.out.println(number[i] + "\t" + name[i] + "\t" + balance[i]);
				}
				System.out.println();
				break;
				
			case 3://예금
				System.out.println("-----------------------------");
				System.out.println("예금");
				System.out.println("-----------------------------");
				
				System.out.print("계좌번호>");
				num=s.next(); // 임금할 계좌번호 (본 계좌와 비교대상이 될 계좌)
				System.out.print("예금액>");
				int input=s.nextInt();
				
				boolean find=false;
					for(i=0; i<=count-1; i++) {
						if(number[i].equals(num)) { //본 계좌와 입금할 계좌가 같을 때
						balance[i]=balance[i]+input; //기본액에서 입금액 더하기
						System.out.println("잔액:" + balance[i]);
						find=true;
					}
				}
				if(find) {
					System.out.println("예금이 성공했습니다. \n");
				} else {
					System.out.println("계좌가 없습니다. \n"); 
					}
				break;
			case 4://출금
				System.out.println("------------------------------");
				System.out.println("출금");
				System.out.println("------------------------------");
				
				
				System.out.print("계좌번호>");
				num=s.next(); // 입금할 계좌번호 (본 계좌와 비교대상이 될 계좌)
				for(i=0; i<=count-1; i++) {
				if(number[i].equals(num)) {
					System.out.print("출금액>");
					int output=s.nextInt(); //출금액 선언해주기
					balance[i]=balance[i]-output; //총액에서 출금액 빼기
					System.out.println("출금에 성공했습니다. \n");
				}
				}
				break;
				
			case 5://종료
				run=false;
				System.out.println("프로그램을 종료합니다.");
				break;
				
			default:
				System.out.println("잘못입력하셨습니다.");
			
			}//switch
			
			
			
		}//while
	

	}

}
