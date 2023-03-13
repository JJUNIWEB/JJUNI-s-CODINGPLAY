package kr.co.ezenac.operator;

public class SignOperatorTest {

	public static void main(String[] args) {
		
		short num1 = 5;
		System.out.println(+num1);	//불필요한 +연산
		System.out.println(-num1);	//부호를 바꿔서 얻은 결과 출력
		System.out.println(num1);	//num1값은 변하지 않음
		
		short num2 = 7;
		short num3 = (short)(+num2);	//형변환하지 않으면 오류 발생 (연산이 이루어짐)
		short num4 = (short)(-num2);
		System.out.println(num3);
		System.out.println(num4);
	}

}
