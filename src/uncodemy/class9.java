package uncodemy;

public class class9 {

	public static void main(String[] args) {
		// WAP to find the greater value among 3 double variables
        double a = 12, b = 1, c = 112, m;
        
        if ((a > b) && (a > c)) {
        	m = a;
        }
        else if (b > c) {
        	m = b;
        } else {
        	m = c;
        }
       
       System.out.println("the greatest value among 3 double variables" + m);

   }
	
}
