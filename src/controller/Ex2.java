package controller;

public class Ex2 {
	public Ex2() {
		super();
	}
	
	public int repetido(int numero1, int numero2) {
		int contador;
			if(numero1 == 0) return 0; //condi��o de parada se n�o chegar a zero, finaliza
				if(numero1 % 10 == numero2) { //comparar os 2 �ltimos algarismos do n�mero N, se os dois for igual a Z, incremento o contador
					contador = 1;
				}else {
					contador = 0;
		}
					return contador + repetido(numero1 /10, numero2); //divide N por 10 (eliminando assim o �ltimo d�gito)
	
	
	}
}