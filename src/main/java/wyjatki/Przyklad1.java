package wyjatki;

public class Przyklad1 {

	public static void main(String[] args) {
		
		Konto konto = new Konto(1, 1000);
		System.out.println(konto);
		
		konto.wplata(500);
		System.out.println(konto);
		
		System.out.println("wplata ujemna");
		konto.wplata(-300);
		System.out.println(konto);
		
		
		
	}
}
