public class Parkgaragelevel1 {

	public static void main(String[] args) {

		int parkpleatze = 100;
		int Autos = 20;
		String parken = "19 -19 11 -11 1 -1 17 -17 10 7 -10 -7 3 14 -14 -3 13 -13 4 12 20 18 6 16 -18 -12 -16 5 -5 -20 -6 -4 8 15 -8 2 -15 9 -2 -9";
		String[] parkvorgaenge = parken.split(" ");
		int maxAutosInGarage = 0;
		int autosInGarage = 0;

		for (int a = 0; a < parkvorgaenge.length; a++) {

			int auto = Integer.parseInt(parkvorgaenge[a]);

			if (auto < 0) {
				System.out.println("Auto parkt aus...." + auto);
				autosInGarage--;

			} else {
				System.out.println("Auto park ein..." + auto);
				autosInGarage++;

			}

			if (maxAutosInGarage < autosInGarage) {
				maxAutosInGarage = autosInGarage;

			}

		}
		System.out.println("Es sind" +maxAutosInGarage);

	}

}