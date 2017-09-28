package wyjatki;

public class Przyklad2 {

	public static void main(String[] args) {
		
		Konto konto = new Konto(1, 1000);
		System.out.println(konto);
		
		try {
			konto.wplata(500);
			System.out.println(konto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println("wplata ujemna");
			konto.wplata(-300);
			System.out.println(konto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
