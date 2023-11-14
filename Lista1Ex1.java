package atividadeFilha_Pilha;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Lista1Ex1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int opcao;
		Queue<String> fila = new LinkedList<String>();
		
		do {
			
		System.out.println("\n\t\tFila do Banco");
		System.out.println("\n*******************************************************");
		System.out.println("\n(1) Adicionar clientes na fila");
		System.out.println("\n(2) Listar os clientes");
		System.out.println("\n(3) Retirar cliente");
		System.out.println("\n(0) Sair");
		System.out.println("\n*******************************************************");
		System.out.println("\nEscolha a opção ");
		
				
		
		
		
		opcao = leia.nextInt();
		
		
		switch (opcao) {
		case 1:
			System.out.println("\nDigite o nome do cliente: ");
			fila.add(leia.next());
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			
			
			System.out.println("\n Novo cliente na fila: "+fila);
			break;
		
		case 2:
			System.out.println(fila);
			if (fila.isEmpty()) {
				System.out.println("A fila está vazia. Novos clientes são necessários");
				System.out.println("");
				System.out.println("");
				System.out.println("");
			}
			
			break;
			
		case 3:
			if (fila.isEmpty()) {
				System.out.println("A fila está vazia. Novos clientes são necessários");
				System.out.println("");
				System.out.println("");
				System.out.println("");
			}else {
				fila.remove();
				System.out.println("Um cliente foi chamado, nova fila: "+fila);
				System.out.println("");
				System.out.println("");
				System.out.println("");
				break;
			}
		case 0:
			System.out.println("Até a próxima!");
			
			break;
			
			default: System.out.println("Erro!");
			
		}
		}while (opcao!=0);
		
		
		
		
		
		

	}

}
