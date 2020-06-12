import java.util.Scanner;

// Question 2 part c

public class RandomWalker3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer value for the number of steps it should walk: ");
		int N = sc.nextInt();
		System.out.println("Enter the nummber of trials: ");
		int trials = sc.nextInt();
		sc.close();
		
		
		int x = 0; 
		int y = 0;
		double sum_squared_distances = 0;
		
		for (int t = 0; t < trials; t ++) {	
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
			
				
			}
			sum_squared_distances = Math.pow(x , 2) + Math.pow(y, 2);
		}
	 double mean_sq = sum_squared_distances / trials;
	 System.out.println("Mean Squared Distance: " + mean_sq);
	// As N increases the mean squared distance increases 
	// As number of trials increases the accuracy of mean squared distances increases
	}

}

