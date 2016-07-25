package codechef;

import java.math.BigInteger;
import java.util.Scanner;

// Chef and dual palindromes
public class Question1 {

	static int solve(int b1,int b2)
	{
		int count = 0,index=0;
		for(long i=11;i<Math.pow(2,20);i++)
		{
			
				if(palindrome(new BigInteger(Long.toString(i,b1))) && palindrome(new BigInteger(Long.toString(i,b2))))
			     {
					System.out.println("Palindrome "+i);

					  ++count;
					  if(count<=1000)
			           result[index++]=i;
					  else
						  break;
			    
			     }
		}
		if(count<=1000)
			return 0;
		return 1000;
	}
	
	private static boolean palindrome(BigInteger bigInteger) {
		// TODO Auto-generated method stub
		BigInteger x;
		BigInteger r = new BigInteger("0");
		BigInteger tmp=bigInteger;
		while(!bigInteger.equals(new BigInteger("0")))
		{
			x=bigInteger.mod(new BigInteger("10"));
			r=r.multiply(new BigInteger("10")).add(x);
			bigInteger=bigInteger.divide(new BigInteger("10"));
		}
		 
        
		if(r.equals(tmp))
			

			return true;
		
		return false;
		
	}

	static long result[];
	private static Scanner sc;
	public static void main(String args[])
	{
		
		sc = new Scanner(System.in);
		int no;
		
		no=sc.nextInt();
		for(int i=0;i<no;i++)
		{
			result=new long[1000];
			if(solve(sc.nextInt(),sc.nextInt())>0)
				display(result);
				
		}
	}
	private static void display(long[] result2) {
		// TODO Auto-generated method stub
		for(int i=0;i<1000;i++)
			System.out.println(result2[i]);
	}
}
