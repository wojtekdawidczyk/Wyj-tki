package wyjatki;

public class DzialanieWyjatkow {
	
	static void metoda(String s) {
		
		System.out.println("poczatek metody, s = "+s);
		
		int x = s.length();
		System.out.println("dlugosc napisu: "+x);
		
		System.out.println("koniec metody");
		
	}
	
	public static void main(String[] args) {
		System.out.println("poczatek main");
		
		//metoda("ala");
		metoda(null);
		
		System.out.println("koniec main");
	}

}
