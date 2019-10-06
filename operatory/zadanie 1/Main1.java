
public class Main1 {

	public static void main(String[] args) {
		boolean first; 
		boolean second;
		first = true;
		second = false;
		boolean isFirstEqualSecond;
		isFirstEqualSecond = first == second;
		System.out.println(isFirstEqualSecond);
		second = true;
		isFirstEqualSecond = first == second;
		System.out.println(isFirstEqualSecond);
	}

}
