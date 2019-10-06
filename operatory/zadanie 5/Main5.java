
public class Main5 {

	public static void main(String[] args) {
		int a = 1;
		int b;
// wynik 2
		System.out.println(++a);
// wynik 2
		System.out.println(a++);
//wynik 3
		System.out.println(a);
//wynik 3
		b=a++;
		System.out.println(b);
		b=++a;
// wynik 6
		System.out.println(++a);
	}

}
