import java.util.Scanner;

// Question 2 part b
// generates a visual representation of the random walker using STD Draw library
public class RandomWalker2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer value for the number of steps it should walk: ");
		int N = sc.nextInt();
		sc.close();
		
		// Initialize starting point
		StdDraw.setPenColor(StdDraw.DARK_GRAY);
		StdDraw.filledSquare(N,N, 2*N);
		
		int x = N;
		int y = N;
		StdDraw.setXscale(0, 2*N);
		StdDraw.setYscale(0, 2*N);
		StdDraw.enableDoubleBuffering();
		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.filledSquare(x,y,0.48);
		StdDraw.show();
 		StdDraw.pause(200);
		
		System.out.println("(" + x + "," + y + ")" );
	
		for (int a = N; a > 0; a--) {
			double r = Math.random();
			// North
			if (r < 0.25) {
				StdDraw.setPenColor(StdDraw.WHITE);
				StdDraw.filledSquare(x,y,0.48);
				StdDraw.show();
		 		StdDraw.pause(200);
				y = y + 1; } 
			// South
			else if ( r  < 0.5) { 
				StdDraw.setPenColor(StdDraw.WHITE);
				StdDraw.filledSquare(x,y,0.48); 
				StdDraw.show();
		 		StdDraw.pause(200);
		 		y = y-1; }
			// East 
			else if (r  < 0.75) { 
				StdDraw.setPenColor(StdDraw.WHITE);
				StdDraw.filledSquare(x,y,0.48);
				StdDraw.show();
		 		StdDraw.pause(200);
		 		x = x + 1; }
			// West
			else if (r < 1.00) { 
				StdDraw.setPenColor(StdDraw.WHITE);
				StdDraw.filledSquare(x,y,0.48);
				StdDraw.show();
		 		StdDraw.pause(200);
				x = x -1;}
			
			
			System.out.println("(" + x + "," + y + ")" );
			StdDraw.setPenColor(StdDraw.BLUE);
			StdDraw.filledSquare(x,y,0.48);
			StdDraw.show();
	 		StdDraw.pause(200);
		
		}
		
		System.out.println("Euclidean Distance: " + (Math.pow(x, 2) + Math.pow(y, 2)));
	}

}
