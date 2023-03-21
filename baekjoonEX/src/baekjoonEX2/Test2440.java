package baekjoonEX2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2440 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		//N번째 줄 까지 별 찍기(거꾸로)
		for(int i = 0; i<N; i++) {
			for(int j = i+1; j<=N; j++) {
			System.out.print("*");
		}		
			System.out.println();
	}

	}
}
