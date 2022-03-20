package minimo_para_validar;

import java.util.Scanner;

public class minimo_para_validar {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean infoValida = false;
		 String nome;
		 int idade; 
		 double salario;
		                      // verifica se o nome tem menos que 3 caracteres 
		do {
			System.out.println("Entre com nome");
			
			nome = scan.next();
			
			if (nome.length() >=3) {
				infoValida = true;
			} else {
				System.out.println("Nome precisa no mínimo 3 caracteres.");
			}
		} while (!infoValida);
		
		infoValida = false;
		                        // verifica se a idade tem 0 a 150//
		
		do {
			System.out.println("Entre com Idade");
			
			idade = scan.nextInt();
			 
			if (idade >= 0 && idade <=120) {
				infoValida = true;
			} else {
				System.out.println("idade precisa ser entre 0 e 150.");
			}
		} while (!infoValida);
		
		infoValida = false;
		                            // verifica se o salario//
		do {
			System.out.println("Entre com salário:");
			
			salario = scan.nextDouble();
			 
			if (salario > 0) {
				infoValida = true;
			} else {
				System.out.println("salario precisa ser maior que 0");
			}
		} while (!infoValida);
		
		System.out.println("Seguinte informação foram validadas!");
		
		System.out.println("Nome:" +  nome);
		System.out.println("idade:" +  idade);
		System.out.println("salario:" +  salario);
		
		scan.close(); 
	}

}
