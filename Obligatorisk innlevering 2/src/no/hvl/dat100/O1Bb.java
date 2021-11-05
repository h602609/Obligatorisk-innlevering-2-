package no.hvl.dat100;

public class O1Bb {

	public static void main(String[] args) {

		int[][] variabel = { { 1, 2},  { 1, 2 } };
		tilStreng(variabel);
		
		
	}
	
	public static String tilStreng(int[][] matrise) {

		// TODO
		String str = "";
		
		for (int i = 0; i < matrise.length; i++) {
			
			for (int j = 0; j < matrise[i].length; j++) {
				str = str + matrise[i][j] + " ";
			}
			
			str = str + "\n";
		}
		
		return str;
		
	}
}
