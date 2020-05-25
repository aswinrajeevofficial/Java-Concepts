import java.util.Collection;
import java.util.List;

public class ThreadImplementationTwo implements Runnable{
	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			int fact = 1;
			fact = fact * i;
			System.out.print(fact + "-");
		}		
	}
	
	public static void main(String[] args) {
		ThreadImplementationTwo thread2Obj = new ThreadImplementationTwo();
		Thread thread2 = new Thread(thread2Obj);
		thread2.start();
	}
}
