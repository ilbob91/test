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

	public static boolean isPalindromo(String ss) {
		
		ss = ss.replaceAll("\\s", "");
		int i = ss.length() - 1;
		int j = 0;
			while (i > j) {
				if (ss.charAt(i) != ss.charAt(j)) {
					return false;
				}
				i--;
				j++;
			}
			return true;
		}
	

}
