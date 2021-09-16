package main;

import java.util.Scanner;

public class CountOfCountries {
    static short N = 7;
    static short M = 3;
    static int i;
	static int j;
    static int A[][] = new int[N][M];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
		 
		    System.out.println("Enter the elements of A matrix");    // Input elements of A matrix map
		    for (i = 0; i < N; i++)
		        for (j = 0; j < M; j++) {
		        	System.out.print("A["+i+","+j+"]=");
		          A[i][j] = in.nextInt();
		          		        }
		    
		    Solution count=new Solution(A);                 // Check for solution of count of countries
		    
		    System.out.println("Number of countries: "+ count.countryTotal);        // Returns number of countries
		    
		    

		 
	}

}
