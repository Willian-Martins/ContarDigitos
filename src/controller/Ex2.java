package controller;

public class Ex2 {
	public Ex2() {
		super();
	}
	
	public int repetido(int numero1, int numero2) {
		int contador;
			if(numero1 == 0) return 0; //condição de parada se não chegar a zero, finaliza
				if(numero1 % 10 == numero2) { //comparar os 2 últimos algarismos do número N, se os dois for igual a Z, incremento o contador
					contador = 1;
				}else {
					contador = 0;
		}
					return contador + repetido(numero1 /10, numero2); //divide N por 10 (eliminando assim o último dígito)
	
	
	}
}