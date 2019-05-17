package stack;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {

		Stack<String> pilha = new Stack<>();
		
		System.out.println("\nStatus:");
		System.out.println("   ...Inserindo 3 elementos na pilha...");
		pilha.push("O Pequeno Principe");
		pilha.push("O Hobbit");
		pilha.push("Dom Quixote");
		
		System.out.println("\nConsultando valores...");	//consulta
		for (int i = 0; i < 3; i++) {
			System.out.println("   " + pilha.elementAt(i));
		}
		
		System.out.println("\nRetirando valores...");		//remove
		for (int i = 0; i < 3; i++) {
			System.out.println("   " + pilha.pop());	
		}
		
		System.out.println("\nStatus:");
		if (pilha.empty()) {
			System.out.println("   ...Pilha se encontra vazia!");
		}
		
	}//main(-)

}//class(-)
