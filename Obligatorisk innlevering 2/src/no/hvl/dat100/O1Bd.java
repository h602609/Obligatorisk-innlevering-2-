package no.hvl.dat100;

public class O1Bd {

	public static void main(String[] args) {
		 int[][] variabel = { { 1, 2},  { 1, 2 } };
		 int[][] variabel2 = { { 1, 2},  { 1, 2 } };
		 boolean ny = erLik(variabel, variabel2);
		 
		

	}



public static boolean erLik(int[][] a, int[][] b) {

	// TODO
	boolean like = true;
	
	int m = a.length;
	int n = b.length;
	
	for (int i = 0; i < m && like; i++) {
		for (int j = 0; j < n && like; j++) {
			if (a[i][j] != b[i][j]) {
				like = false;
			}

		}

	}

	return like;
}
}
