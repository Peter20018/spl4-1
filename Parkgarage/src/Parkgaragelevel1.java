import java.util.ArrayList;
public class Parkgaragelevel1 {

	public static void main(String[] args) {

		int parkplaetze = 2;
		int Autos = 4;
		int maxAutoWarteliste = 0;
		ArrayList <Integer> warteliste = new ArrayList();
		String parken = "1 2 -1 3 4 -3 -4 -2";
		String[] parkvorgaenge = parken.split(" ");
		int maxAutosInGarage = 0;
		int autosInGarage = 0;

		for (int a = 0; a < parkvorgaenge.length; a++) {

			int auto = Integer.parseInt(parkvorgaenge[a]);

			if (auto < 0) {
				System.out.println("Auto parkt aus...." + auto);
				if (warteliste.contains((Integer)auto)) {
					warteliste.remove((Integer)auto);
					maxAutoWarteliste--;
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

			}

			if (maxAutosInGarage < autosInGarage) {
				maxAutosInGarage = autosInGarage;
			}
		}
		System.out.println("Es sind maxautos " + maxAutosInGarage + " und maxwartes " +  maxAutoWarteliste + warteliste);

	}

}