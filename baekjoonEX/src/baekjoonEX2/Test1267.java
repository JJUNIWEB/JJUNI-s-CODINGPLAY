package baekjoonEX2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test1267 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M_sum = 0;		
		int Y_sum = 0;	
		int sec = 0;		
		
		// 통화의 개수
		for(int i = 0; i<N; i++) {		
			sec = Integer.parseInt(st.nextToken());
			M_sum += ((sec / 60) + 1) *15;	//M요금제 금액 계산
			Y_sum += ((sec / 30) + 1) *10;	//Y요금제 금액 계산
		}
		// 두 요금제 비교
		if(Y_sum == M_sum) {				
			System.out.println("Y M " + Y_sum); 
		}
		else if(Y_sum > M_sum) {
			System.out.println("M " + M_sum);
		}
		else if(Y_sum < M_sum) {
			System.out.println("Y " + Y_sum);
		}
		
	}
}
