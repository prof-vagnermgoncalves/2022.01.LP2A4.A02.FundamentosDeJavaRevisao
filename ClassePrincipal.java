import java.util.*;
//import java.util.Scanner;

public class ClassePrincipal
{
	public static void main(String[] args)
	{
		boolean continuar = true;
		String nome;
		short idade;		
		float altura, peso;
		
		Scanner scan = new Scanner(System.in);
		
		while(continuar)
		{
			System.out.print("Digite o seu nome: ");
			nome = scan.nextLine();
			
			System.out.print("Digite a sua idade: ");
			idade = scan.nextShort();
			
			System.out.print("Digite a sua altura: ");
			altura = scan.nextFloat();
			
			System.out.print("Digite o seu peso: ");
			peso = scan.nextFloat();
			
			System.out.println("Os dados digitados foram: " +
				nome + ", " + idade + "anos , " +
				altura + "m, " + peso + "kg.");
				
			IMC calculadoraIMC = new IMC(altura, peso);
			
			System.out.println("O IMC calculado é: " +
				calculadoraIMC.calcular());
			
			System.out.println("A situação é: " +
				calculadoraIMC.obterSituacao());
				
			System.out.println("Deseja continuar (true/false)?");
			continuar = scan.nextBoolean();
			
			scan.nextLine();	
		}
		
		scan.close();
		
		/*
		IMC calculadoraIMC;
		calculadoraIMC = new IMC(1.8f, 100.0f);
		
		float valorIMC = calculadoraIMC.calcular();
		
		System.out.println("O IMC calculado é " + valorIMC);
		*/
		
		/*
		System.out.println("Olá, mundo!");
		
		System.out.println("O primeiro argumento é " + args[0]);
		
		System.out.println("O segundo argumento é " + args[1]);
		
		System.out.println("O terceiro argumento é " + args[2]);
		*/
	}
}