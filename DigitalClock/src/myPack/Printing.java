package myPack;

public class Printing {

	public void printMatrix(char[][] matrice3x4) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(matrice3x4[i][j]);
			}

		}
	}

	public void liniarPrint(char[][] m1, char[][] m2, char[][] m3, char[][] m4, char[][] m5, char[][] m6, char[][] m7,
			char[][] m8) {

		char[][] finalMatrix = new char[3][30];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 30; j++) {

				if (j >= 0 && j < 4)
					finalMatrix[i][j] = m1[i][j];
				if (j >= 4 && j < 8)
					finalMatrix[i][j] = m2[i][j - 4];
				if (j >= 8 && j < 11)
					finalMatrix[i][j] = m3[i][j - 8];
				if (j >= 11 && j < 15)
					finalMatrix[i][j] = m4[i][j - 11];
				if (j >= 15 && j < 19)
					finalMatrix[i][j] = m5[i][j - 15];
				if (j >= 19 && j < 22)
					finalMatrix[i][j] = m6[i][j - 19];
				if (j >= 22 && j < 26)
					finalMatrix[i][j] = m7[i][j - 22];
				if (j >= 26 && j < 30)
					finalMatrix[i][j] = m8[i][j - 26];
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 30; j++) {

				System.out.print(finalMatrix[i][j]);
			}
			System.out.println();
		}

	}

	public char[][] inIntOutMat(char cifra) {

		Symbols cif = new Symbols();

		switch (cifra) {

		case '1':
			return cif.one();
		case '2':
			return cif.two();
		case '3':
			return cif.three();
		case '4':
			return cif.four();
		case '5':
			return cif.five();
		case '6':
			return cif.six();
		case '7':
			return cif.seven();
		case '8':
			return cif.eight();
		case '9':
			return cif.nine();
		case '0':
			return cif.zero();
		}

		return cif.zero();
	}

}
