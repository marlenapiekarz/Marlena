
public class Main5 {

	public static void main(String[] args) {
	int resultFor = 0;
	int resultWhile = 0;
	for (int i = 1; i <= 10; i++) {    
	resultFor = resultFor + i;
	}
	System.out.println(resultFor);

	int i = 1;
	while (i <= 10) {    
	resultWhile = resultWhile + i;	
	    i++;	
	}
	System.out.println(resultWhile);	
	}

}
