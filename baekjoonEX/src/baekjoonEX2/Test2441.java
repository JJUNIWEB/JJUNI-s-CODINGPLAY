package baekjoonEX2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2441 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		//N번째 줄까지 별 찍기(오른쪽 기준 거꾸로)
		for(int i = 0; i<N; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int k = i; k<N; k++) {
				System.out.print("*");
			}
			System.out.println();	
				
		}
	}

}
