package baekjoonEX2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2445 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());	// N 정수로 입력받기
		
		
		for(int i = 1; i<=N; i++) {		// i = 1부터 N보다 작거나 같을때까지 i 1씩 증가하면서 반복
			for(int j = 1; j<=i; j++) {	// j = 1부터 i보다 작거나 같을때까지 j 1씩 증가하면서 
				System.out.print("*");	// * 출력 반복
			}
			for(int k = 1; k<=2*(N-i); k++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i<N; i++) {
			for(int j = i; j<N; j++) {
				System.out.print("*");
			}
			for(int k = 1; k<=2*i; k++) {
				System.out.print(" ");
			}
			for(int j = N-i; j>=1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
