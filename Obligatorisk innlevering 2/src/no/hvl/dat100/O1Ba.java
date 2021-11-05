package no.hvl.dat100;
 
public class O1Ba {
	
	
	 public static void main(String[] args) {
		 int[][] variabel = { { 1, 2},  { 1, 2 } };
			skrivUt(variabel);
	 
	 
	 }
		
		

	
	
  public static void skrivUt(int[][] matrise) {
		
		// TODO
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				System.out.print(matrise[i][j] + " ");
			}
			System.out.println();
		}
	}
		
	}
		
	