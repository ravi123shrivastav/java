package uncodemy;

public class class23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num, sroot, rerr;
		for(num = 1.0; num < 25; num++) 
		{
			sroot = Math.sqrt(num);
		System.out.println("Square root of " + num + " is " + sroot);
		// compute rounding error 
		rerr = num - (sroot * sroot);
		System.out.println("Rounding error is " + rerr); 
		System.out.println();
		}
	}

}
