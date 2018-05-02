import java.util.ArrayList;
public class Parkgaragelevel1 {

	public static void main(String[] args) {

		int parkplaetze = 3;
		int Autos = 4;
		int[] Preis = {8, 6, 3};
		
		int maxAutoWarteliste = 0;
		ArrayList <Integer> warteliste = new ArrayList();
		String parken = "10 -10 8 -8 6 -6 1 -1";
		String[] parkvorgaenge = parken.split(" ");
		int maxAutosInGarage = 0;
		int autosInGarage = 0;
		int umsatz = 0;

		for (int a = 0; a < parkvorgaenge.length; a++) {
			int auto = Integer.parseInt(parkvorgaenge[a]);
			if (auto < 0) {
				System.out.println("Auto parkt aus...." + auto);
				if (warteliste.contains((Integer)auto)) {
					warteliste.remove((Integer)auto);
					maxAutoWarteliste--;
					umsatz += Preis[autosInGarage-1];
				} else {
					autosInGarage--;
				}
			} else if (auto > 0 && parkplaetze <= autosInGarage) {
				warteliste.add(Integer.parseInt(parkvorgaenge[a]));
				maxAutoWarteliste++;;
				System.out.println(warteliste);
				
			} else {
				System.out.println("Auto parkt ein..." + auto);
				autosInGarage++;
				umsatz += Preis[autosInGarage-1] ;

			}

			if (maxAutosInGarage < autosInGarage) {
				maxAutosInGarage = autosInGarage;
			}
		}
		System.out.println("Es sind maxautos " + maxAutosInGarage + " und maxwartes " +  maxAutoWarteliste + warteliste + " Umsatz: " +umsatz);

	}

}