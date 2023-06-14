package if_;

import java.util.Scanner;

public class TestClass04 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num, num1, num2, num3;
	System.out.print("수 입력 : ");
	num = input.nextInt();
	if(num%3==0)
		System.out.println(num+"는 3의 배수");
	
	System.out.print("수 입력 : ");
	num1 = input.nextInt();
	num2 = input.nextInt();
	num3 = input.nextInt();
	if (num1>num2 && num1>num3)
		System.out.println("큰 수 : "+num1);
	if (num2>num1 && num2>num3)
		System.out.println("큰 수 : "+num2);
	if (num3>num1 && num3>num2)
		System.out.println("큰 수 : "+num3);
	
	System.out.print("수 입력 : ");
	num1 = input.nextInt();
	num2 = input.nextInt();
	if(num1>num2 && num1%2==0)
		System.out.println("큰 수 이자 짝수 : "+num1);
	if(num2>num1 && num2%2==0)
		System.out.println("큰 수 이자 짝수 : "+num2);
}
}
