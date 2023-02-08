package lezione0802;

public class StringMethodsExercise {

	public static void main(String[] args) {
		//Inizializziamo una stringa
		String inputString = "Hello World!";
		
		System.out.println("La lunghezza della stringa è: "+ inputString.length());
		
		//CharAt
		char c = inputString.charAt(5);
		System.out.println("Il carattere in posizione 5 è: "+ c);
		
		//Substring
		String subString = inputString.substring(3,7);
		System.out.println("La sotto stringa è: " + subString);
		
		//IndexOf della sotto stringa
		int index = inputString.indexOf(subString);
		System.out.println("Indice della prima occorenza della stringa: " + index);
		

	}

}
