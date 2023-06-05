package baekjoonEX1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test10808 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String pi = br.readLine();
		
		int[] arr = new int[26];
		
		for(int i = 0; i<pi.length(); i++) {
			char c = pi.charAt(i);
			arr[c - 97]++;
			
		}
		for(int i = 0; i<26; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
