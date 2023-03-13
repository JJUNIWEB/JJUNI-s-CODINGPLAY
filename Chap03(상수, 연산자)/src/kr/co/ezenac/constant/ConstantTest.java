package kr.co.ezenac.constant;

/*
 * 	상수(constant)
 * 		- 상수는 변하지 않는 수
 * 		- 원주율 3.14, 1년 12개월 등
 * 		- final 예약어 사용하여 선언
 * 		- 상수를 사용하면 변하지 않는 값을 반복하여 사용할 때 의미있는 문자로 인식할 수 있음
 * 		- 만약 값을 변경하더라도 선언한 부분만 변경하면 되므로 여러부분을 수정할 필요가 없음
 */

public class ConstantTest {

	public static void main(String[] args) {
		
		final int MAX_NUM = 100;    // 선언과 동시에 초기화
		final int MIN_NUM;          // 선언만 하기
		
		MIN_NUM = 60;               // 나중에 초기화, 딱 한번 가능
		
		int myScore = 50;
		
		if(myScore < MIN_NUM) {
			System.out.println("당신의 학점은 F입니다.");
		}

	}

}
