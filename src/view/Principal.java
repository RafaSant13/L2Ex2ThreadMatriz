package view;

import controller.ThreadMatriz;

public class Principal {

	public static void main(String[] args) {
		int [][] matriz = new int [3][5];
		int i, j;
		for (i=0;i<3;i++) {
			for (j=0;j<5;j++) {
				matriz[i][j] = (int)((Math.random()*100)+1);
			}
		}
		
		int[]linha1 = new int [5];
		int[]linha2 = new int [5];
		int[]linha3 = new int [5];
		
		for (i=0;i<5;i++) {
			linha1[i] = matriz[0][i];
		}
		for (i=0;i<5;i++) {
			linha2[i] = matriz[1][i];
		}
		for (i=0;i<5;i++) {
			linha3[i] = matriz[2][i];
		}
		
		Thread Linha1 = new ThreadMatriz(linha1, 1);
		Thread Linha2 = new ThreadMatriz(linha2, 2);
		Thread Linha3 = new ThreadMatriz(linha3, 3);
		
		Linha1.start();
		Linha2.start();
		Linha3.start();
	}

}
