//# This program simulates a digital clock. It prints to the console the current time (in winter-hour).  

package myPack;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Symbols cifra0 = new Symbols();

		Printing afis = new Printing();

		int secunde = 1;
		while (secunde <= 15) { // It's printing for 15 seconds!

			Time calc = new Time();
			String tab = calc.getTablou();

			afis.liniarPrint(afis.inIntOutMat(tab.charAt(0)), afis.inIntOutMat(tab.charAt(1)), cifra0.dots(),
					afis.inIntOutMat(tab.charAt(2)), afis.inIntOutMat(tab.charAt(3)), cifra0.dots(),
					afis.inIntOutMat(tab.charAt(4)), afis.inIntOutMat(tab.charAt(5)));

			Thread.sleep(1000);

			secunde++;
		}

	}
}
