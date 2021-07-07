import java.util.*;
import java.io.*;

class multiplicative_inverse_euclidian {

	static void modInverse(int a, int m)
	{
		int g = gcd(a, m);
		if (g != 1)
			System.out.println("Inverse doesn't exist");
		else
		{
			System.out.println(
				"Modular multiplicative inverse is "
				+ power(a, m - 2, m));
		}
	}

	static int power(int x, int y, int m)
	{
		if (y == 0)
			return 1;
		int p = power(x, y / 2, m) % m;
		p = (int)((p * (long)p) % m);
		if (y % 2 == 0)
			return p;
		else
			return (int)((x * (long)p) % m);
	}

	static int gcd(int a, int b)
	{
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}
	public static void main(String args[])
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter 1st Number");
	 int a = sc.nextInt();
	 System.out.println("Enter 2nd Number");
	 int m = sc.nextInt();
	 
		modInverse(a, m);
	}
}

