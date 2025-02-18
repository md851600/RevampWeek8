package Feb2025;

public class StringTest {

	public static void main(String[] args) {
		String exclaim = addExclamationPoint("hot dogs");
		System.out.println(exclaim);
	}
	
	public static String addExclamationPoint(String s) {
		return s+"!";
	}
}
