package baekjoonEX2;

import java.util.Scanner;

public class Test10093 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		//스캐너 생성
		long a = sc.nextLong();				//long 타입 a 변수 받기
		long b = sc.nextLong();				//long 타입 b 변수 받기
		if(a>b) {							//a가 b보다 크면
			System.out.println(a-b-1);		//a와b사이 숫자 개수
			for(long i = b+1; i<a; i++) {	//a와b사이 숫자 체크
				System.out.print(i+" ");	//a와b사이 숫자 출력
			}
		}
		if(b>a) {							//b가 a보다 크면
			System.out.println(b-a-1);		//b와 a사이 숫자 개수
			for(long i = a+1; i<b; i++) {	//b와 a사이 숫자 체크
				System.out.print(i+" ");	//b와 a사이 숫자 출력
			}
		}
		if(a==b) {							//a b가 같으면
			System.out.println(0);			//0출력
		}
	}
}
