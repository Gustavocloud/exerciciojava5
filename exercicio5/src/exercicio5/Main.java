package exercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo,tendo uma duração mínima de 1 hora e máxima de 24 horas.

	
	   Scanner sc = new Scanner(System.in);
	   
	   int A, B;
	   int duracao;
	   
	   
	   System.out.println("Digite o horario de inicio da partida:");
	    A = sc.nextInt();
	    
	   System.out.println("Digite o horario de termino da partida:");
	    B = sc.nextInt();
    	   
	   if (A<B) {
		   duracao= B - A;
	   
	}
	   else {
		   duracao = 24 - A + B;
		   
		   System.out.println("o jogo durou:" + duracao + "Horas");
	   }
	   
	   
	   
	   sc.close();
	}
	
}
    	   
    	   
    	   
	   
	    
	   
	   

