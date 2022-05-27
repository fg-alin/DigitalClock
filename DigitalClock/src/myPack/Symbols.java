package myPack;

public class Symbols {

	private char[][] matrix = new char[3][4];

	public Symbols() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				matrix[i][j] = ' ';
			}
		}
	}

	public char[][] dots() {
		char pct[][] = new char[3][3];
		pct = matrix;

		pct[1][1] = pct[2][1] = 'o';

		return pct;
	}

	public char[][] one() {
		char unu[][] = new char[3][4];
		unu = matrix;

		unu[1][2] = unu[2][2] = '|';

		return unu;
	}

	public char[][] two() {
		char doi[][] = new char[3][4];
		doi = matrix;

		doi[0][1] = doi[0][2] = doi[1][1] = doi[1][2] = doi[2][1] = doi[2][2] = '_';
		doi[1][3] = doi[2][0] = '|';

		return doi;
	}

	public char[][] three() {
		char trei[][] = new char[3][4];
		trei = matrix;

		trei[0][1] = trei[0][2] = trei[1][1] = trei[1][2] = trei[2][1] = trei[2][2] = '_';
		trei[1][3] = trei[2][3] = '|';

		return trei;
	}

	public char[][] four() {
		char patru[][] = new char[3][4];
		patru = matrix;

		patru[1][1] = patru[1][2] = '_';
		patru[1][0] = patru[2][3] = '|';

		return patru;
	}

	public char[][] five() {
		char cinci[][] = new char[3][4];
		cinci = matrix;

		cinci[0][1] = cinci[0][2] = cinci[1][1] = cinci[1][2] = cinci[2][1] = cinci[2][2] = '_';
		cinci[1][0] = cinci[2][3] = '|';

		return cinci;
	}

	public char[][] six() {
		char sase[][] = new char[3][4];
		sase = matrix;

		sase[0][1] = sase[0][2] = sase[1][1] = sase[1][2] = sase[2][1] = sase[2][2] = '_';
		sase[2][0] = sase[2][3] = sase[1][0] = '|';

		return sase;
	}

	public char[][] seven() {
		char sapte[][] = new char[3][4];
		sapte = matrix;

		sapte[0][1] = sapte[0][2] = '_';
		sapte[1][3] = sapte[2][3] = '|';

		return sapte;
	}

	public char[][] eight() {
		char opt[][] = new char[3][4];
		opt = matrix;

		opt[0][1] = opt[0][2] = opt[1][1] = opt[1][2] = opt[2][1] = opt[2][2] = '_';
		opt[1][3] = opt[2][3] = opt[1][0] = opt[2][0] = '|';

		return opt;
	}

	public char[][] nine() {
		char noua[][] = new char[3][4];
		noua = matrix;

		noua[0][1] = noua[0][2] = noua[1][1] = noua[1][2] = noua[2][1] = noua[2][2] = '_';
		noua[1][3] = noua[2][3] = noua[1][0] = '|';

		return noua;
	}

	public char[][] zero() {
		char zero[][] = new char[3][4];
		zero = matrix;

		zero[0][1] = zero[0][2] = zero[2][1] = zero[2][2] = '_';
		zero[1][3] = zero[2][3] = zero[1][0] = zero[2][0] = '|';

		return zero;
	}
}
