package kr.co.ezenac.constant;

public class TypeConversion01 {
	
	public static void main(String[] args) {
		
		int num1 = 1;		// int형 리터럴 상수 1을 int형 변수 num1에 대입
		byte num2 = 1;		// int형 리터럴 상수 1을 byte형 변수 num2에 대입
							// 4바이트 크기를 1바이트 크기의 공간에 대입 (자동형변환)
		
		byte num3 = 127;
		byte num4 = (byte) 128;			// 명시적 형변환, 원래 값이 훼손됨
		
		System.out.println("num3 : " + num3);
		System.out.println("num4 : " + num4);
		
	}
}
