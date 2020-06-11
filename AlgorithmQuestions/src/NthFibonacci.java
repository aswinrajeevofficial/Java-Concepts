
public class NthFibonacci {

	public static int fib(int n) {
		if(n == 2)
			return 1;
		else if(n == 1)
			return 0;
		else 
			return fib(n-1) + fib(n-2);
	}
	
	public static void main(String[] args) {
		int n = 10;
		System.out.println(n + "th fibonacci number is: " + fib(n));
	}
}
