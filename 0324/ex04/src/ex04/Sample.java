package ex04;

public class Sample {

	public static void main(String[] args) throws Exception{
		// Switch문 
		int num=8;				
		switch(num) {
			case 1:
				System.out.println("1번이 나왔습니다.");
				System.out.println("--------------");
			case 2:
				System.out.println("2번이 나왔습니다.");
				break;
			case 3:
				System.out.println("3번이 나왔습니다.");
				break;
			case 4:
				System.out.println("4번이 나왔습니다.");
				break;
			case 5:
				System.out.println("5번이 나왔습니다.");
				break;
			case 6:
				System.out.println("6번이 나왔습니다.");
				break;
			default:
				System.out.println("번호가 틀렸습니다.");
		}

		
	}

}
