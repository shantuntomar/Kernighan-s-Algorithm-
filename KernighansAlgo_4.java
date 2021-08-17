// this algo. is use to count the number of set bits in a binary number 
import java.util.*;

class KernighansAlgo_4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number ");
		int num = sc.nextInt();

		//logic 
		int count = 0;

		while( num != 0) {
			
			int rsb = (num & (-num));
			num -= rsb;
			count++;
		}

		System.out.println("the number of set bits are " + count);
	}
}



