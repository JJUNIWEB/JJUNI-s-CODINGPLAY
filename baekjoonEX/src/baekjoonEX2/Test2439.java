package baekjoonEX2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2439 {

	public static void main(String[] args) throws NumberFormatException, IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		for(int i = 1; i<=N; i++) {
			for(int j = N-1; j >=i; j--) {
			System.out.print(" ");
			}
			for (int k = 1; k<=i; k++) {
			System.out.print("*");
			}
			System.out.println();
		}

	}

}
