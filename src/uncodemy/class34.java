package uncodemy;

public class class34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i <= 25; i++) {
			
		System.out.print("Factors of " + i + ": ");
		for(int j = 1; j < i; j++)
		if((i%j) == 0) 
		System.out.print(j + " "); 
		System.out.println();
			}
	}

}
