package kr.co.ezenac.consoleinputoutput;

import java.util.Scanner;

public class ScannerTest03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("윤현우 진도준 진양철 서민영 이렇게 입력하고 엔터를 누르세요.");
		//nextline() : 입력된 값을 enter가 입력될 때 한 번에 줄 단위로 입력받음
		String name1 = sc.nextLine();		//줄단위 입력 처리
		
		System.out.println("윤현우 진도준 진양철 서민영 이렇게 입력하고 엔터를 누르세요.");
		//next() : 입력받은 값을 일단 버퍼에 넣고 공백(스페이스)이나 탭으로 구분하여 입력구분 처리함
		String name2 = sc.next();
		String name3 = sc.next();
		String name4 = sc.next();
		String name5 = sc.next();				//공백이나 탭 단위 처리
		
		System.out.printf("[%s] [%s] [%s] [%s] [%s]", name1, name2, name3, name4, name5);
		
		
		sc.close();
	}

}
