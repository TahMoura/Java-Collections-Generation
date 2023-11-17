package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Cores {

	public static void main(String[] args) {
		
		int i=0;
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList<>();
		
		System.out.println("Sistema para Adicionar Cores"
				+ "\n********************************************");
		
		for(i = 0; i < 5; i++) {
			System.out.print("Digite a " + (i+1) + "ª cor que você quer adicionar: ");
			String cor = scan.nextLine();
			cores.add(cor);
		}
		
		System.out.println("\n********************************************\nVamos ver uma Lista com as cores que você digitou:\n");
		for (String cor: cores) {
			System.out.println(cor);
		}
		
		Collections.sort(cores);
		System.out.println("\n********************************************\nAgora, vamos ver uma lista com todas as cores que foram adicionadas ordenadas em ordem crescente:\n");
		for (String cor: cores) {
			System.out.println(cor);
		}
		
		
	

	}

}
