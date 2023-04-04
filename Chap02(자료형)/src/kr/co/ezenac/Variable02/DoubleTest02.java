package kr.co.ezenac.Variable02;

public class DoubleTest02 {

	public static void main(String[] args) {
		
		double Num = 0.0;
		
		for(int i=0; i<1000; i=i+1) {
			Num = Num + 0.1;
			System.out.println(Num);
		}
		
	}

}
