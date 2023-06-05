package baekjoonEX1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test10871 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(br.readLine(), " ");	// 공백을 기준으로 분리 
		
		int N = Integer.parseInt(tk.nextToken());
		int X = Integer.parseInt(tk.nextToken());
		
		StringBuilder sb = new StringBuilder();
		
		tk = new StringTokenizer(br.readLine(), " "); //공백을 기준으로 분리
		
		for(int i = 0; i<N; i++) {							//i=0부터 N보다 작을 때까지 1씩 증가시키면서
			int value = Integer.parseInt(tk.nextToken()); 	//value값 공백을 기준으로 분리
			
			if(value < X)						//분리된 값 하나씩 반환하면서
				sb.append(value).append(' ');	//X보다 작으면 출력
		}
			System.out.println(sb);
		

	}

}
