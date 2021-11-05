package no.hvl.dat100;

public class O1Ah {

	public static void main(String[] args) {
		int[] nyTabell1 = {1,2,3,4,5,6,7};
		int[] nyTabell2 = {1,2,3,4,5,6,7};
		settSammen(nyTabell1, nyTabell2);

	}
	
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int lengde1 = tabell1.length;
		int lengde2 = tabell2.length;
		
		int [] tabell3 = new int[lengde1 + lengde2];
		
		for(int i = 0; i < lengde1; i++) {
			tabell3[i] = tabell1[i];
			System.out.println(tabell3[i]);
			
		}
		
		for (int i = 0; i < lengde2; i++) {
			tabell3[lengde1 + i] = tabell2[i];
			System.out.println(tabell3[i]);
		}
		return tabell3;
	}

}
