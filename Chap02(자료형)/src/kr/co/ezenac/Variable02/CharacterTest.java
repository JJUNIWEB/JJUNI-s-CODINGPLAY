package kr.co.ezenac.Variable02;

public class CharacterTest {

	public static void main(String[] args) {
		char ch1 = 'A'; // 자바가 인코딩함
		System.out.println(ch1);
		
		char ch2 = 67; // 10진수로 직접 문자의 값을 넣어줌
		System.out.println(ch2);
		
		char ch3 = 0x25; //16진수로(앞에 0x) 직접 문자의 값을 넣어줌
		System.out.println(ch3);
		
		char ch4 = 0b0000000001000001; //2진수로(앞에 0b) 직접 문자의 값을 넣어줌
		System.out.println(ch4);
		
		//char ch5 = -66; //음수는 대입 불가함
		
		char ch6 = '한';
		System.out.println(ch6);
		
		char ch7 = '\uD55C'; //유니코드로 직접 값을 넣어줌

	}

}
