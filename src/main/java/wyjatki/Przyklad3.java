package wyjatki;

public class Przyklad3 {

	public static void main(String[] args) {
		
		Konto konto = new Konto(1, 1000);
		System.out.println(konto);
		
		konto.wplata(500);
		System.out.println(konto);
		
		konto.wplata(300);
		System.out.println(konto);
		
		try {
			konto.wyplata(2000);
		} catch (BrakSrodkow e) {
			System.out.println("BRAK ŚRODKÓW - saldo ujemne");
		}
		System.out.println(konto);
	}
}
