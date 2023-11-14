package atividadeFilha_Pilha;
import java.util.Scanner;
import java.util.Stack;

public class Lista2Ex2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int opcao;
		String nomeDoLivro;
		Stack<String> livros = new Stack<String>();
		
		do {
			
		System.out.println("\n\t\tLivraria do tutu");
		System.out.println("\n*******************************************************");
		System.out.println("\n(1) Adicionar livros na pilha");
		System.out.println("\n(2) Listar os livros");
		System.out.println("\n(3) Retirar livros");
		System.out.println("\n(0) Sair");
		System.out.println("\n*******************************************************");
		System.out.println("\nEscolha a opção ");
		opcao = leia.nextInt();
		
		
		switch (opcao) {
		case 1:
			leia.nextLine();
			System.out.println("\nDigite o nome do livro: ");
			nomeDoLivro=leia.nextLine();			
			livros.add(nomeDoLivro);
			
			System.out.println("\n");
			System.out.println("\n");
			System.out.println("\n");
			
			
			System.out.println("\n Novo livro na pilha: "+nomeDoLivro);
			System.out.println("\n");
			System.out.println("\n");
			break;
		
		case 2:
			System.out.println(livros);
			
			if (livros.isEmpty()) {
				System.out.println("A pilha está vazia, insira novos livros.");
				System.out.println("");
				System.out.println("");
				System.out.println("");
			}
			break;
			
		case 3:
			if (livros.isEmpty()) {
				System.out.println("\nA pilha de livros está vazia. Coloque novos livros!");
				System.out.println("");
				System.out.println("\n");
				System.out.println("\n");
			}else {
				livros.pop();
				System.out.println("\nUm livro foi retirado da pilha! Nova pilha: "+livros);
				System.out.println("");
				System.out.println("\n");
				System.out.println("\n");
			}
			break;
			
		case 0:
			System.out.println("\nAté a próxima!");
			
				
			
			
		}
		}while (opcao!=0);
		
		
		
		
		
		

	}

}
