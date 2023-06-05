package baekjoonEX0;

import java.util.Scanner;

public class Test2753 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		if(a%4 ==0) {
			if(a%100 !=0 || a%400 == 0) {
				System.out.println("1");
				return;
			}
		}
		System.out.println("0");
		
	}

}
