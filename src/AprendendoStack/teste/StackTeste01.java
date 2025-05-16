package AprendendoStack.teste;

import java.util.Stack;

public class StackTeste01 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Elemento no topo: " + stack.peek());
        System.out.println("Stack: " + stack);
        System.out.println("Elemento removido: " + stack.pop());  //Remove o topo da lista(Ultimo elemento adc)
        System.out.println("Elemento no topo: " + stack.peek()); //Pega sem remover o ultimo elemento
        System.out.println("Stack: " + stack);

        System.out.println("Posição do número '10': " + stack.search(10));
        System.out.println("Posição do número '100'(Não contem no Stack): " + stack.search(100));//Search retorna -1 caso não esteja presente


    }
}
