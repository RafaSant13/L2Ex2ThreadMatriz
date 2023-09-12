package controller;

public class ThreadMatriz extends Thread{

	int[] vetor;
	int linha;
	
	public ThreadMatriz(int[] vetor, int linha) {
		this.vetor = vetor;
		this.linha = linha;
	}
	
	public void run() {
		calc();
	}

	private void calc() {
		int soma = 0;
		for (int i : vetor) {
			soma = soma + i;
		}
		System.out.println("Soma da linha "+linha+" = "+soma);
		
	}

}
