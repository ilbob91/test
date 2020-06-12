import java.util.Scanner;



public class TestMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("inserisci una stringa");
		String string = s.nextLine();
		if (isPalindromo(string)) {
			System.out.println("è palindromo");
		} else {
			System.out.println("non è palindromo");
		}

	}

	public static boolean isPalindromo(String frase) {
		
		frase = frase.replaceAll("\\s", "");
		int ultimaLettera = frase.length() - 1;
		int primaLettera = 0;
			while (ultimaLettera > primaLettera) {
				if (frase.charAt(ultimaLettera) != frase.charAt(primaLettera)) {
					return false;
				}
				ultimaLettera--;
				primaLettera++;
			}
			return true;
		}
	

}
