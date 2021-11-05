package no.hvl.dat100;

public class O1Ag {

	public static void main(String[] args) {
		int[] enTabell = {1,2,14,16};
		boolean sort = erSortert(enTabell);
		System.out.println(sort);
	}
	public static boolean erSortert (int[] tabell) {
		boolean sortert = true;
		int lengde = tabell.length;
		
		int i = 0;
		
		while ((i < lengde - 1) && sortert) {
			if(!(tabell[i] <= tabell[i + 1])) {
				sortert = false;
				
			} 
			i++;
		}
		return sortert;
		
	}
	
}
