/*
 * LIFO (Last in, First out) = Pilha (stack)
 */
package stack;

public class Program {

	public static void main(String[] args) {
		
		//declarando e instanciando objeto
		Stack mystack1 = new Stack();
		Stack mystack2 = new Stack();
		
		//inserindo 10 elementos na pilha de cada objeto
		for (int i = 0; i < 10; i++) mystack1.push(i);	
		for (int i = 10; i < 20; i++) mystack2.push(i);
		
		//removendo e exibindo os elementos da pilha de cada objeto
		System.out.println("Pilha em mystack1:");
		for (int i = 0; i < 10; i++) {
			System.out.println(mystack1.pop());
		}
		
		System.out.println("Pilha em mystack2:");
		for (int i = 0; i < 10; i++) {
			System.out.println(mystack2.pop());
		}
		
	}//main(-)

}//class(-)
