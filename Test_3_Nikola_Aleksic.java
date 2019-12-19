
import java.util.Scanner;

public class Test_3_Nikola_Aleksic {

	public static void naplata (Double racun, Double novac) {
		double kusur;
		if (racun>=novac) System.out.println("Nema dovoljno novca da namiri racun");
		else {
			kusur = novac - racun;
			System.out.println("Potrebno je vratiti kusur u iznosu od " + kusur + " ceskih kruna");
		}
	}
	
	public static void main(String[] args) {

		/*
		Zadatak 1 
		Napisati program na programskom jeziku Java koji ima sledece funkcionalnosti za potrebe 
		ugostiteljskog objekta:

		Program sadrzi meni koji ima sledece opcije:
		0 - Izlaz
		1 - Dodavanje cene na racun
		2 - Naplata racuna

		Ukoliko korisnik unese opciju 0 program se zavrsava.

		Ukoliko korisnik unese opciju 1 program pita korisnika da unese cenu proizvoda i ta cena 
		se dodaje na racun korisnika.

		Ukoliko korisnik unese opciju 2 program pita korisnika da unese kolicinu novca za naplatu 
		racuna i poziva metodu naplati(double iznosRacuna, double novac).
		Metoda naplati  ako korisnik unese vrednost manju od vrednosti racuna ispisuje gresku, a 
		ukoliko korisnik unese vrednost vecu ili jednaku od cene racuna ispisuje kusur.
		Nakon obrade racun se stornira to jest postavlja na nulu. Zatim se ponovo ispisuje meni.


		***NAPOMENA***
		U svom folderu napraviti folder pod nazivom “Test 3” i unutra staviti fajl sa kodom
		*/
		
		Scanner sc = new Scanner(System.in);
		int opcija;
		double cena;
		double racun=0;
		double novac;
		
		do {
			System.out.println("");
			System.out.print("Unesite opciju za rad");
			System.out.print("     0 - izlaz     1 - Dodavanje cene na racun     2 - Naplata racuna ");
			while (!sc.hasNextInt()) {
				System.out.println("Pogresan unos, unesite ponovo ");
				sc.hasNext();
			}
			opcija = sc.nextInt();
			
			if(opcija == 0) {
				System.out.println("Kraj programa");
				break;
			}
			
			switch (opcija) {
			
			case 1: {
				System.out.println("Unesite cenu za dodavanje :");
				cena = sc.nextDouble();
				if (cena<=0) {
					System.out.println("Cena ne moze biti negativna, povratak na glavni meni");
					continue;
				}
				else {
				racun = racun + cena;
				System.out.println("trenutni racun je:" + racun);
				continue;
				}
			}
			case 2: {
				if (racun == 0) {
					System.out.println("Racun je 0, nema nista za naplatu");
					continue;
				}
				System.out.println("Unesite kolicinu novca za placanje: ");
				novac = sc.nextDouble();
				naplata(racun, novac);
				racun = 0;
				continue;
			}
			
			default: System.out.println("Greska! Unesite broj opcije od 1 do 3"); break;
			} 	
		} while(opcija >= 1);
	}
}
