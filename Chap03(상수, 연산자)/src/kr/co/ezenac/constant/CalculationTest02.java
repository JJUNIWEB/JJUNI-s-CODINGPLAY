package kr.co.ezenac.constant;

public class CalculationTest02 {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		int result1 = num1 + num2;
		
		long num3 = 1;
		long num4 = 2;
		long result2 = num3 + num4;
		
		long result3 = num1 + num3;		//자동 형변환
		
		float num5 = 1.0f;
		float num6 = 2.0f;
		float result4 = num5 + num6;
		
		double num7 = 1.0;
		double num8 = 2.0;
		double result5 = num7 + num8;
		
		double result6 = num5 + num7;		//자동 형변환
	}

}
