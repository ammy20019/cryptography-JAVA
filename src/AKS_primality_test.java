import java.util.*;
class AKS_primality_test {

	static long c[] = new long[100];

	static void coef(int n)
	{
		c[0] = 1;
		for (int i = 0; i < n; c[0] = -c[0], i++) {
			c[1 + i] = 1;

			for (int j = i; j > 0; j--)
				c[j] = c[j - 1] - c[j];
		}
	}


	static boolean isPrime(int n)
	{

		coef(n);
		c[0]++;
		c[n]--;

		int i = n;
		while ((i--) > 0 && c[i] % n == 0)
			;
		return i < 0;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want to test");
		int n = sc.nextInt();
		if (isPrime(n))
			System.out.println("This is a Prime");
		else
			System.out.println("Not Prime");
	}
}

