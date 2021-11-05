package no.hvl.dat100;

public class O1Af {

	public static void main(String[] args) {
		int[] enTabell = {-1,-2,-3,1,2,3,4,5,6};
		 reverser(enTabell);
		

	}
	public static int[] reverser (int[] tabell) {
		int lengde = tabell.length;
		int[] nytabell = new int[lengde];
		
		for (int i = 0; i < lengde; i++) {
			nytabell[i] = tabell[lengde-1-i];
			System.out.println(tabell[i]);
			
		}
		return nytabell;
	}

}
