package wyjatki;

public class DzialanieWyjatkow3 {
	
	static void metoda(String s) {
		
		System.out.println("poczatek metody, s = " + s);
		
		try {
			int x = s.length();
			System.out.println("dlugosc napisu: " + x);
			
			int y = 7 / x;
			System.out.println("wynik dzielenia " + y);
			
			char c = s.charAt(5);
			System.out.println("szósta litera " + c);
		} finally {
			System.out.println("FINALLY w metodzie");
		}		
		
		System.out.println("koniec metody");
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("poczatek main");
		
		//metoda("ala");
		try {
			metoda("ala");
			//metoda(null);
			//metoda("");
			//metoda("aleksandra");
			
			System.out.println("przed catchem");
			
		} catch (NullPointerException e) {
			System.out.println("wyłapałem NPE");
		} catch (Exception e) {
			System.out.println("wylapalem inny wyjatek: " + e);
		} finally {
			System.out.println("FINALLY w main"); //fragment programu, ktory sie wykona niezaleznie czy byl wyjatek czy nie
		}
		
		System.out.println("koniec main");
	}
}
