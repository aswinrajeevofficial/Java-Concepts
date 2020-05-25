
public class ThreadImplementationOne extends Thread {

	public void run() {
		for(int i = 0; i < 1000; i++) {
			int fact = 1;
			fact = fact * i;
			System.out.print(fact + " ");
		}
	}
	
	public static void main(String[] args) {
		ThreadImplementationOne thread1 = new ThreadImplementationOne();
		thread1.start();
	}
}
