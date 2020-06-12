import java.util.Scanner;

// Question 2 part a
// Takes a user inputed integer value and stimulates the motion of a random walk printing the location at each step and the final euclidean distance
public class RandomWalker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer value for the number of steps it should walk: ");
		int N = sc.nextInt();
		sc.close();
		
		// Initialize starting point
		int x = 0; 
		int y = 0;
		System.out.println("(" + x + "," + y + ")" );
		
		for (int a = N; a > 0; a--) {
			double r = Math.random();
			// North
			if (r < 0.25) { y = y +1; } 
			// South
			else if ( r  < 0.5) { y = y-1; }
			// East 
			else if (r  < 0.75) { x = x + 1; }
			// West
			else if (r < 1.00) { x = x -1;}
			
			System.out.println("(" + x + "," + y + ")" );
		
		}
		System.out.println("Euclidean Distance: " + (Math.pow(x, 2) + Math.pow(y, 2)));
	}

}

