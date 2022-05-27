package myPack;

public class Time {

	private String tabTime = new String();

	public double nrDays() {
		double durataZile = System.currentTimeMillis() / 1000.0 / 3600.0 / 24.0;
		return durataZile;
	}

	public double subunit(double nr) {
		return nr - Math.floor(nr);
	}

	public String floorString(double nr) {
		Integer intObj = (int) (nr - subunit(nr));
		return intObj.toString();
	}

	private double nrHours = subunit(nrDays()) * 24;
	private double nrMinutes = subunit(nrHours) * 60;
	private double nrSeconds = subunit(nrMinutes) * 60;

	public void adaugaCuZero(String s) {
		if (s.length() == 1) {
			tabTime += "0";
		}
		tabTime += s;
	}

	public String getTablou() {

		Integer ora = (int) Math.floor(nrHours) + 2; // GMT +2 (Bucharest). For summer-hour, we need to add 1 more hour
		if (ora.equals(25))
			ora = 1;

		this.adaugaCuZero(ora.toString());
		this.adaugaCuZero(floorString(nrMinutes));
		this.adaugaCuZero(floorString(nrSeconds));

		return tabTime;
	}
}
