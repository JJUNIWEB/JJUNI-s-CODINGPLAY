package baekjoonEX01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test10804 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int [21];		// 크기 21인 정수형 배열 생성
		
		for(int i = 1; i<21; i++) {
			arr[i] = i;					//arr 배열 1번부터 20번까지 1 ~ 20 대입
		}
		for(int i = 0; i<10; i++) {
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(tk.nextToken());		// 10개 구간중 시작 위치 a
			int b = Integer.parseInt(tk.nextToken());		// 10개 구간중 시작 위치 b
			
			int mid = (b - a) / 2;				//
			
			for(int j = 0; j<=mid; j++) {			// 이 구간이 잘 이해가 안됨 끝까지 물고 이해할거임
				int tmp = arr[a + j];
				arr[a + j] = arr[b - j];
				arr[b - j] = tmp;				//
			}
		}
		for(int i = 1; i<21; i++) {
			System.out.print(arr[i]+" ");		//현재 저장된 arr배열 순번 1 ~ 20 까지 출력
		}
		
	}

}
