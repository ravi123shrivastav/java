package uncodemy;

import java.io.IOException;

public class class16 {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
	            throws IOException {
			char ch,
			answer = 'K';

			System.out.println("I'm thinking of a letter between A and Z.");
			System.out.print("Can you guess it: ");

			ch = (char) System.in.read(); // get a char

			if(ch == answer)
			System.out.println("** Right **");
			else {
			System.out.print("...Sorry, you're ");

			// a nested if

			if(ch < answer)
			System.out.println("too low");
			else
			System.out.println("too high");
	}

}
}