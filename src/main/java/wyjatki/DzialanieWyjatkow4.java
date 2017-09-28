package wyjatki;

public class DzialanieWyjatkow4 {
	
	static void metoda(String s) {
		
		System.out.println("poczatek metody, s = " + s);
		
		try {
			int x = s.length();
			System.out.println("dlugosc napisu: " + x);
			
			int y = 7 / x;
			System.out.println("wynik dzielenia " + y);
			
			char c = s.charAt(3);
			System.out.println("szósta litera " + c);
			
			switch (s) {
			case "ERROR":
				int[] t = new int[1000000000]; //spowoduje brak pamieci
				break;
			case "WYJATEK" :
				throw new IllegalArgumentException("moj wyjatek ");
			case "EXIT" :
				System.exit(0);
			case "RETURN" :
				return;
				

			}
		} finally {
			System.out.println("FINALLY w metodzie");
			throw new RuntimeException("wyjatek wyrzucony w FINALLY");
		}		
		
		//System.out.println("koniec metody");
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("poczatek main");
		
		//metoda("ala");
		try {
			//metoda("ala");
			//metoda(null);
			//metoda("");
			//metoda("aleksandra");
			//metoda("ERROR");
			//metoda("WYJATEK");
			//metoda("EXIT");
			metoda("RETURN");
			
			System.out.println("przed catchem");
			
		} catch (NullPointerException e) {
			System.out.println("wyłapałem NPE");
		} catch (Exception e) {
			System.out.println("wylapalem inny wyjatek: " + e);
		}
		catch (Throwable e) {
			System.out.println("wylapalem inny wyjatek: " + e);
		}
		finally {
			System.out.println("FINALLY w main"); //fragment programu, ktory sie wykona niezaleznie czy byl wyjatek czy nie
		}
		
		System.out.println("koniec main");
	}
}
