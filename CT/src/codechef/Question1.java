package codechef;

import java.math.BigInteger;
import java.util.Scanner;

// Chef and dual palindromes
public class Question1 {
	static int b1;
	static int b2;
    static long inc;
    
	static int solve(long no, int index, int count) {

		if (no < Math.pow(2, 60)) {
			if (palindrome(new BigInteger(Long.toString(no, b1)))
					&& palindrome(new BigInteger(Long.toString(no, b2)))) {
				System.out.println("Palindrome " + no);
                     ++count;
				if (count > 1000) 
					return 1000;
			   result[index++] = no;
                    
				inc=no;
			}
			else
				inc=Math.min(b1, b2);
			return count+solve(no+inc,index,count);
		}
		
		return count;
	}

	private static boolean palindrome(BigInteger bigInteger) {
		// TODO Auto-generated method stub
		BigInteger x;
		BigInteger r = new BigInteger("0");
		BigInteger tmp = bigInteger;
		while (!bigInteger.equals(new BigInteger("0"))) {
			x = bigInteger.mod(new BigInteger("10"));
			r = r.multiply(new BigInteger("10")).add(x);
			bigInteger = bigInteger.divide(new BigInteger("10"));
		}

		if (r.equals(tmp))
			return true;

		return false;

	}

	static long result[];
	private static Scanner sc;

	public static void main(String args[]) {

		sc = new Scanner(System.in);
		int no;
		

		no = sc.nextInt();
		for (int i = 0; i < no; i++) {
			result = new long[1000];
			b1 = sc.nextInt();
			b2 = sc.nextInt();
			if (solve(1, 0, 0) > 0)
				display(result);

		}
	}

	private static void display(long[] result) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 1000 && result[i] != 0; i++)
			System.out.println(result[i]);
	}
}
