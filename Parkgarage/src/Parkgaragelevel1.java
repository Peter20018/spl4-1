
public class Parkgaragelevel1 {

	public static void main(String[] args) {
		int parkplaetze = 10;
		int autos = 4;
		String parken = "6 2 -6 3 4 -3 -4 -2";
		String[] parken1 = parken.split(" ");
		int anzhinein = 0;
		int anzhinaus = 0;
		int glchzt = 0;
		for (int i = 0; i < parken1.length; i++) {
			if (Integer.parseInt(parken1[i]) > 0) {
				anzhinein++;
				try {
					if (Integer.parseInt(parken1[i-1])>0) {
					glchzt = glchzt+1;
					}
				} catch (Exception ArrayIndexOutOfBoundsException) {
					glchzt = 0;
				}
			} else if (Integer.parseInt(parken1[i]) < 0) {
				anzhinaus++;
			}
		}
		int sum = anzhinein - anzhinaus;
		System.out.println("Die Anzahl der Parkenden Autos beträgt: " + sum + "Es waren insgesamt " + anzhinein + " Autos in der Garage. Es waren maximal "+ glchzt +" Autos gleichzeitig in der Garage.");
	}

}
