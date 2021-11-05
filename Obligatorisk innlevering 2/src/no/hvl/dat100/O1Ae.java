package no.hvl.dat100;

public class O1Ae {

	public static void main(String[] args) {
		int[] nyTabell = {1,2,3,4,5};
		
		posisjonTall(nyTabell, 8);

	}
	
	public static int posisjonTall (int[] tabell, int tall) {
		
		int posisjon = -1;
		int i = 0;
		
		while (i < tabell.length && (posisjon == -1)) {
			if (tabell[i] == tall) {
				posisjon = i;
			}
			i++;
		}
		System.out.println(i);
		return posisjon;
	}

}
