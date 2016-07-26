package codechef;

import java.math.BigInteger;
import java.util.Scanner;

// Chef and dual palindromes
public class Question1 {
	static int b1;
	static int b2;
	static int index;
	static int count;
	static int incr;

	static int solve() {
		incr = Math.min(b1, b2);
		for ( BigInteger no = new BigInteger("1");no.compareTo(BigInteger.valueOf((long) Math.pow(2, 60)))==-1 ;no=no.add(new BigInteger("1")) ) {
			/*
			if (palindrome(no.toString(b1))
					&& palindrome(no.toString(b2))) {
				System.out.println("Palindrome " + no);
				++count;
				if (count <= 1000) {
					result[index++] = no.longValue();
				} else
					return 1000;
			}
			*/
		}
		return count;
	}

	private static boolean palindrome(String bigInteger) {
		// TODO Auto-generated method stub
		String rev=new StringBuilder(bigInteger).reverse().toString();
		if(rev.compareTo(bigInteger)==0)
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
			index = 0;
			count = 0;
			if (solve() > 0)
				display(result);
           }
	}

	private static void display(long[] result) {
		// TODO Auto-generated method stub
		for (int i = 0; i < (count > 1000 ? count - 1 : count); i++)
			System.out.println(result[i]);
	}
}
