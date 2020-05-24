
public class BasicExceptionHandling {

	public static void main(String[] args) {
		try {
		String str = null;
		System.out.println(str.toUpperCase());
		}
		catch(NullPointerException e) {
			System.out.println("Null pointer exception caused: " + e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Inside exception block");
		}
	}
}

