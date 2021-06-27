package chapter18divideandconquer;

public class ExponentialDivideAndConquer {
	public static double exponenial(double x, int n) {
		if (n == 0)
			return 1.0;
		double half = exponenial(x, n / 2);
		if (n % 2 == 0)
			return half * half;
		else if (n > 0)
			return half * half * x;
		else
			return half * half / x;
	}

	public static void main(String[] args) {
		System.out.println(exponenial(2, 3));
	}
}
