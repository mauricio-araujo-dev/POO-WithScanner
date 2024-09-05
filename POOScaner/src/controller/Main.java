package controller;
//import java.util.Scanner;

import model.Computador;


public class Main {

	public static void main(String[] args) {
		
//		Remover a "/" da linha de baixo
//		Scanner sc = new Scanner(System.in);
				
		
		// COMPUTADOR 1
			Computador c1 = new Computador();
				c1.setAno(2022);
				c1.setMarca("Lenovo");
				c1.setModelo("Ideapad");
				c1.setPreco(2500);
				c1.setSituacao("Desligado");
			
			
			// CASO QUISER USAR SCANNER - Remover as "/" no início de cada linha
//			System.out.println("Digite as informações do Computador: ");
//			System.out.print("\nAno:");
//			c1.setAno(sc.nextInt());
//			System.out.print("\nMarca:");
//			c1.setMarca(sc.next());
//			System.out.print("\nModelo:");
//			c1.setModelo(sc.next());
//			System.out.print("\nPreço:");
//			c1.setPreco(sc.nextDouble());
//			System.out.print("\nSituação (Ligado/Desligado):");
//			c1.setSituacao(sc.next());
//			System.out.println(" ");
			
		// COMPUTADOR 2
		
			Computador c2 = new Computador();
				c2.setAno(2020);
				c2.setMarca("Asus");
				c2.setModelo("Vivobook");
				c2.setPreco(3000);
				c2.setSituacao("Desligado");
			
			// CASO QUISER USAR SCANNER - Remover as "/" no início de cada linha
//			System.out.println("Digite as informações do Computador: ");
//			System.out.print("\nAno:");
//			c2.setAno(sc.nextInt());
//			System.out.print("\nMarca:");
//			c2.setMarca(sc.next());
//			System.out.print("\nModelo:");
//			c2.setModelo(sc.next());
//			System.out.print("\nPreço:");
//			c2.setPreco(sc.nextDouble());
//			System.out.print("\nSituação (Ligado/Desligado):");
//			c2.setSituacao(sc.next());		
//			System.out.println(" ");
			
			
		// COMPUTADOR 3
			Computador c3 = new Computador("Dell" , "Inspiron" , 2019 , 3700 , "Ligado");
			
		// COMPUTADOR 4
			Computador c4 = new Computador("Acer" , "Nitro" , 2023 , 4100 , "Desligado");
			
			
			c1.imprimir();
			c2.imprimir();
			c3.imprimir();
			c4.imprimir();
			
//		sc.close();
		
	}

}
