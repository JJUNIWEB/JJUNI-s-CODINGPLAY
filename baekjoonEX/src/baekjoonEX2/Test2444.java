package baekjoonEX2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2444 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 1; i<=N; i++) {
			for(int j = i; j<=N-1; j++) {
				System.out.print(" ");
				}
			for(int k = 1; k<2*i; k++ ) {
				System.out.print("*");
				}
				System.out.println();
			}
		for(int i = 1; i<N; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print(" ");
			}
			for(int k = 1 ; k<(2*N)-(2*i); k++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}


