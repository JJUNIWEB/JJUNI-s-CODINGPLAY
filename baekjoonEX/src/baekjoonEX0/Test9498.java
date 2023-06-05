package baekjoonEX0;

import java.util.Scanner;

public class Test9498 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		scan.close();
		
		System.out.println((a>=90)?"A": (a>=80)?"B": (a>=70)?"C": (a>=60)?"D": "F");

}
}