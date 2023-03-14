package baekjoonEX0;

import java.util.Scanner;

public class Test2480 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int price;
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if(a==b && b==c && a==c) {
			price = 10000+a*1000;
			System.out.println(price);
		}
		else if(a==b || a==c) {
			price = 1000+a*100;
			System.out.println(price);
		}
		else if(b==c){
			price = 1000+b*100;
			System.out.println(price);
		}
		else {
			System.out.println((Math.max(a, Math.max(b, c))*100));
		}
	}
}
