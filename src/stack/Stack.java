package stack;

public class Stack {

	int[] stck = new int[10];
	int index;
	
	//instancia o objeto e inicializa topo da pilha vazia
	public Stack() {
		index = -1; 
	}
	
	//insere um elemento na pilha
	void push(int item) {
		if (index == 9) {
			System.out.println("A pilha está cheia.");
		} else {
			stck[++index] = item;
		}
	}
	
	//retirar um elemento da pilha
	int pop() {
		if (index < 0) {
			System.out.println("A pilha está vazia.");
			return 0;
		} else {
			return stck[index--];
		}
	}
	

}//class(-)
