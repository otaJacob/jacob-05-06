

package atv05do06;

import java.util.Random;

public class atv4 {

	public static void main(String[] args) {
		int size = 3;
		int[][] matrixA = new int[size][size];
		int[][] matrixB = new int[size][size];
		int[][] matrixC = new int[size][size];

		fillMatrixWithRandomValues(matrixA);
		fillMatrixWithRandomValues(matrixB);
		multiplyAndPrintMatrices(matrixA, matrixB, matrixC, "MATRIZ C");
	}

	private static void fillMatrixWithRandomValues(int[][] matrix) {
		Random random = new Random();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = random.nextInt(11);  
			}
		}
	}

	private static void multiplyAndPrintMatrices(int[][] matrixA, int[][] matrixB, int[][] matrixC, String matrixName) {
		System.out.println("Valores da " + matrixName + ":");
		for (int i = 0; i < matrixA.length; i++) {
			for (int j = 0; j < matrixA[i].length; j++) {
				matrixC[i][j] = matrixA[i][j] * matrixB[i][j];
				System.out.println("Posição [" + i + "][" + j + "] = " + matrixC[i][j]);
			}
		}
	}
}


