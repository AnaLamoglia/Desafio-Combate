package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Digite os dados do primeiro campeão: ");
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Vida inicial: ");
		int vidaInicial = sc.nextInt();
		
		System.out.print("Ataque: ");
		int ataque = sc.nextInt();
		
		System.out.print("Armadura: ");
		int armadura = sc.nextInt();
		
		Champion primeiroCampeao = new Champion(name, vidaInicial, ataque, armadura);
		
		System.out.println();
	    System.out.println("Digite os dados do segundo campeão: ");
	    
	    sc.nextLine();
		System.out.print("Name: ");
		name = sc.nextLine();
		
		System.out.print("Vida inicial: ");
		vidaInicial = sc.nextInt();
		
		System.out.print("Ataque: ");
		ataque = sc.nextInt();
		
		System.out.print("Armadura: ");
		armadura = sc.nextInt();
		
		Champion segundoCampeao = new Champion(name, vidaInicial, ataque, armadura);
	    
		System.out.println();		
		System.out.print("Quantos turnos você deseja executar? ");
		int turnos = sc.nextInt();
		
		for (int turnoAtual = 1; turnoAtual <= turnos; turnoAtual++) {
			System.out.println();
		    System.out.printf("Resultado do turno %d : \n", turnoAtual);
		    // primeiro ataca o segundo
		    primeiroCampeao.takeDamage(segundoCampeao);
		    
		    // segundo ataca o primeiro
		    segundoCampeao.takeDamage(primeiroCampeao);
		    
			System.out.println(primeiroCampeao.status());
			System.out.println(segundoCampeao.status());
			System.out.println();
			
			if (primeiroCampeao.getLife()<= 0 || segundoCampeao.getLife() <= 0) 
				break;
		}
		
	
		System.out.println();
		System.out.println("FIM DO COMBATE ");
		
		sc.close();
	}

}
