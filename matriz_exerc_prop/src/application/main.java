package application;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		int number = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == number) {

					System.out.println("Position: " + i + "," + j);
					if (j > 0) {
						System.out.println("Left: " + (mat[i][j - 1]));
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + (mat[i][j + 1]));
					}
					if (i > 0) {
						System.out.println("Up: " + (mat[i - 1][j]));
					}
					if (i < mat.length -1) {
						System.out.println("Down: " + (mat[i + 1][j]));
					}

				}
			}
		}

		sc.close();
	}

}

/**
 * 3 4 10 8 15 12 21 11 23 8 14 5 13 19 8
 */
