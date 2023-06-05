package baekjoonEX1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test10807 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int arr[] = new int[a];
		int cnt = 0;
		
		for(int i = 0; i<a; i++) {
			arr[i] = scan.nextInt();
		}
		int v = scan.nextInt();
		
		for(int j = 0; j<a; j++) {
			if(arr[j] == v)
				cnt++;
		}
		System.out.println(cnt);

	}
}
