package kr.co.ezenac.constant;

public class TypeConversion02 {

	public static void main(String[] args) {
		
		byte bNum = 10;
		int iNum = bNum;
		System.out.println("iNum: " + iNum);
		
		int iNum1 = 20;
		float fNum = iNum1;
		System.out.println("fNum: " + fNum);
		
		iNum = 128;
		bNum = (byte)iNum;
		System.out.println("bNum: " + bNum);
		
		double dNum = 3.14;
		int iNum2 = (int)dNum;
		System.out.println("iNum2: " + iNum2);
	}

}
