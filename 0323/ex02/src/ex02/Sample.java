package ex02;

public class Sample {

	public static void main(String[] args) {
		//실수형 변수 float [eng_name]
		//float num1 = 10.5f;
		//float num2 = 20.3f;
		double num1 = 10;
		double num2 = 20.3;
		double num3 = num1 + num2;
		double num4 = num2 - num1;
		double num5 = num1 * num2;
		double num6 = num2 / num1;
		System.out.println("num1 + num2=" + num3);
		System.out.println("num2 - num1=" + num4);
		System.out.println("num1 * num2=" + num5);
		System.out.println("num2 / num1=" + num6);

		
		//반지름이 5인 원의 넓이
		int r=5;
		double area=r * r * 3.14;
		System.out.println("반지름이" + r + "인 원의 넓이=" + area);

	}

}
