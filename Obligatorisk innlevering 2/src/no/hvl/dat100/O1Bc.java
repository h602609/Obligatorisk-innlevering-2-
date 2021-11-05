package no.hvl.dat100;

public class O1Bc {



public static void main(String[] args) {
	int[][] variabel = { { 1, 2},  { 1, 2 } };
		int[][] resultat = skaler(1, variabel);
	
	
}


public static int[][] skaler(int tall, int[][] matrise) {
	
	// TODO
	int m = matrise.length;
	int n = matrise[0].length;
	
	int[][] nymatrise = new int[m][n];

	for (int i = 0; i < m; i++) {
		for (int j = 0; j < n; j++) {
			nymatrise[i][j] = tall * matrise[i][j];

		}
	}
	
	return nymatrise;

	
}
}