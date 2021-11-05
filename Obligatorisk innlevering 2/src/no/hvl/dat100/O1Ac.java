package no.hvl.dat100;

public class O1Ac {

	public static void main(String[] args) {
		int [] helTabell = {1,3,5,9,16};
		int summere = summer(helTabell);
		System.out.println(summere);
		
		
		
//		summer(null);
		
	}
//	
//		int[] tabell1 = {12,14,16,18};
//		int[] nyTabell = summer(tabell1);
		
	
//	public static int summer(int[] tabell) {
//		int[] tabell1 = {1,3,5,9,10};
//		int sum = 0;
//		for(int i = 0; i < tabell1.length; i++) {
//			sum = sum + tabell1[i];
//			System.out.println(sum);
//		}
//		return sum;
//	}
	
	public static int summer(int[] tabell) { 
		int i = 0; 
		int sum = 0;
		while(i<tabell.length) {
			sum += tabell[i];
			i++;
		}
		return sum;
	}
	
//	public static int summer(int[] tabell) {
//		int tall = 0;
//		for(int nyTabell: tabell) {
//			tall = tall + nyTabell;
//			System.out.println(tall);
//		}
//		return tall;
//	}
	
	
		
}
