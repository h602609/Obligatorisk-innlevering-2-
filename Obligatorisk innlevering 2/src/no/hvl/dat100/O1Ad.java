package no.hvl.dat100;

public class O1Ad {

	public static void main(String[] args) {
		int[] enTabell = {1,2,3,4,5,6};
		boolean nyTall = finnesTall(enTabell,3);

	}
	
	public static boolean finnesTall (int[] tabell, int tall) {
		boolean nyTabell = false;
		int i = 0; 
		
		while (i < tabell.length && (!nyTabell)) {
			if(tabell[i] == tall) {
				nyTabell = true;
			}
			i++;
		}
		return nyTabell;
	}
	
}
