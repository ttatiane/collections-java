package stack_devmedia;

import java.util.Random;
import java.util.Stack;

public class StackRandomProgram {

	public static void main(String[] args) {
		
		// instanciando objeto da classe Stack
		Stack<Integer> pilha = new Stack<>();
		
		// instanciando objeto para gerar números randômicos
		Random random = new Random();
		
		System.out.println("Inserindo na pilha: ");
		System.out.println("-------------------");
		// alimenta pilha com número inteiro aleatório
		for (int i = 0; i < 10; i++) {
			System.out.println("	" + pilha.push(random.nextInt(20)));
		}
		
		System.out.println("\nRetirando da pilha: ");
		System.out.println("-------------------");
		// retirando elementos aleatórios da pilha
		for (int i = 0; i < 10; i++) {
			System.out.println("	" + pilha.pop());
		}
		
	}//main(-)

}//class(-)
