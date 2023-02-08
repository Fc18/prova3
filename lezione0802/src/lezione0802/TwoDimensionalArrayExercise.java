package lezione0802;

public class TwoDimensionalArrayExercise {

	public static void main(String[] args) {
		//Dichiarazione arra 2d
		int[][] array = new int[5][5];
		
		int valore = 1;
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				array[i][j] = valore;
				valore++;
			}
		}
		
		//Stampa dell'array
		for(int i=0; i<array.length; i++) {
			System.out.println("Riga: " + i);
			for(int j=0; j<array[i].length; j++) {
				System.out.println("Colonna: " + j + " - " + array[i][j]);
			}
		}
		
		//Somma elementi
		int somma = 0;
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				somma+=array[i][j];
			}
		}
		
		System.out.println("La somma degli elementi è: " + somma);

	}

}
