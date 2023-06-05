package baekjoonEX1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test2309 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[9];		// 크기가 9인 배열 생성
		int sum = 0;				// sum 초기화
		
		for(int i = 0; i<9; i++) {
			arr[i] = Integer.parseInt(br.readLine());	// 9명의 난쟁이 키 받아 배열의 저장
			sum+=arr[i];								// 저장하면서 sum의 계속 더함
		}
		for(int i = 0; i<8; i++) {
			for(int j = i+1; j<9; j++) {
				if(sum - arr[i] - arr[j] == 100) {			//sum에서 두명의 키를 뺐을때 100이라면
					arr[i] = 0;							//그 배열의 값 = 0
					arr[j] = 0;							//그 배열의 값 = 0
					Arrays.sort(arr);					//2개의 배열 값 뺀 후의 배열 오름차순 정렬
					for(int k = 2; k<9; k++) {			
						System.out.println(arr[k]);		//오름차순으로 정렬된 배열 출력
					}
					return;
				}
			}
		}
		
	}

}
