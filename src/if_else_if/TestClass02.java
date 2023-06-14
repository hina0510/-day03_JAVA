package if_else_if;

import java.util.Scanner;

public class TestClass02 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num, pri;
	System.out.print("커피 몇 잔? : ");
	num = sc.nextInt();
	if(num>10) {
		pri = (num-10)*1500+10*2000;
	}else {
		pri = num*2000;
	}System.out.println(num+" : "+pri);
	
	System.out.print("수 입력 : ");
	num = sc.nextInt();
	if(num==0) {
		System.out.println("잘못 입력");
	}else if(num%3==0 && num%4==0) {
		System.out.println("3의 배수이면서 4의 배수");
	}else if(num%3==0) {
		System.out.println("3의 배수");
	}else if(num%4==0) {
		System.out.println("4의 배수");
	}else {
		System.out.println("3의 배수도 4의 배수도 해당 안됨");
	}
}
}
