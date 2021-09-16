package main;

public class Solution {
	  int countryTotal;
void testArea(int[][]a, int[][]b, int i, int j) {        //  Tests A matrix's neighbor elements for equality, 
	                                                     // if the neighbor elements A matrix are equal changes B matrix current element to -1 
	if(b[i][j] == -1) return;

	 b[i][j] = -1;

	 if(i+1 <a.length )

		   if(a[i+1][j] == a[i][j]) testArea(a, b, i+1, j);

		 if(i-1 >= 0)

		   if(a[i-1][j] == a[i][j]) testArea(a, b, i-1, j);

		 if(j+1 < a[0].length)

		   if(a[i][j+1] == a[i][j]) testArea(a, b, i, j+1);

		 if(j-1 >= 0)

		   if(a[i][j-1] == a[i][j]) testArea(a, b, i, j-1);
		 
		 

}

	public Solution(int[][] a) {
		int n=a.length;
		int m=a[0].length;
		int ta[][]=new int[n][m];
				
		for(int i=0; i<n; i++)		
	   for(int j = 0; j<m; j++) {         //  Checks A matrix  neighbor elements for equality by B. If B >=0 adds new country

		    
			if (ta[i][j] >=0) {
				
		 testArea(a, ta, i, j);
		 countryTotal++;               
		     }
			
	}
	
		
	
}
}
