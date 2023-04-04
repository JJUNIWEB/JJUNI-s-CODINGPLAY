package kr.co.ezenac.operator;

public class AssignmentTest {

	public static void main(String[] args) {
		
		short num = 10;
		num += 77L;			//강제 형변환 필요하지 않음, 형변환없이 연산 수행됨
		System.out.println(num);
		
		num =(short)(num + 77L);	//형변환 필요
		System.out.println(num);

	}

}
