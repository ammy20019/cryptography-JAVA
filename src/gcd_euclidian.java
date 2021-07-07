import java.util.*;
import java.lang.*;

class gcd_euclidian
{
	public static int gcd(int a, int b)
	{
		if (a == 0)
			return b;
		
		return gcd(b%a, a);
	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int a = sc.nextInt();
		System.out.println("Enter 2nd Number");
		int b = sc.nextInt();
		int g;
		g = gcd(a, b);
		System.out.println("GCD(" + a + " , " + b+ ") = " + g);

	}
}

