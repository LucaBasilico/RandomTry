package it.RandomTry;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insersci l'intervallo che vuoi analizzare da 1 a ...");
		int edgeNumber = sc.nextInt();
		
		System.out.println("Quanti tentativi vuoi fare? Inserisci il numero di tentativi che vuoi provare");
		int tryNumber = sc.nextInt();
		
		System.out.println("Scegli il numero che vuoi cercare:");
		int chooseNumber = sc.nextInt();
		
		RandomTry randtry = new RandomTry(edgeNumber, tryNumber, chooseNumber);
		randtry.trakDown();
		
		System.out.println("A fronte di "+randtry.getTryNumber()+" e un confine stabilito a "+randtry.getEdgeNumber());
		System.out.println("Il numero è stato trovato "+randtry.getTrySuccess()+" volte");
		System.out.println("Il numero non è stato trovato "+randtry.getTryFailed()+" volte");
		
	}

}
