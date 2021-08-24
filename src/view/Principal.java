package view;

import javax.swing.JOptionPane;

import controller.Ex2;

public class Principal {
	public static void main(String args[]) {
		Ex2 cd = new Ex2();
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		
			if(numero1 >= 10 && numero1 < 999999 && numero2 >= 0 && numero2 < 10) {
				int resultado = cd.repetido(numero1,  numero2);
					if(resultado < 2) {
			System.out.println("O Número " + numero2 + ", Aparece:" + resultado + " vez");
			
			}else {
				System.out.println("O Número " + numero2 + ", Aparece: " + resultado + " vezes");
			}	
					
					}else {
			System.out.println("O primeiro numero precisa ser maior ou igual a 10 e menor que 999999. E o segundo numero precisa ser maior ou igual a zero e menor que 10");
		}
	}
}