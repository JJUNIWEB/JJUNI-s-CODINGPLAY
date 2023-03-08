package kr.co.ezenac.consoleinputoutput;

public class PrintfTest {

	public static void main(String[] args) {
		
		String name = "Sun shin Lee";
		int age = 40;
		double height = 180.3;
		
		System.out.printf("%s의 나이는 %d이고, 키는 %f입니다.\n", name, age, height);
		System.out.printf("%s의 나이는 %d이고, 키는 %.2f입니다.\n", name, age, height);
	}

}
