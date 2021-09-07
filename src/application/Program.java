package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Bebida;
import entities.Carrinho;
import entities.Pizza;
import entities.Produto;
import entities.exceptions.DomainException;
import servico.Entrega;

public class Program {

	public static void main(String[] args) throws DomainException {
		Scanner sc = new Scanner(System.in);

		Carrinho c = new Carrinho();
		Produto pizza = new Pizza();
		Produto bebida = new Bebida();
		Entrega entrega = new Entrega();

		System.out.println("CARDAPIO DE PIZZAS: ");
		System.out.println(pizza.mostraCardapio());

		try {
		
		System.out.print("quantas pizzas serão pedidas: ");
		int n = sc.nextInt();
		sc.nextLine();
		// LEITURA DE DADOS : PEDIDO DE PIZZAS.

		for (int i = 1; i <= n; i++) {
			System.out.print(i + "° pizza, ");
			pizza = new Pizza();
			pizza.montaProduto();
			c.addProduto(pizza);
		}

		// LEITURA DE DADOS: PEDIDO DE BEBIDA.

		System.out.println();
		System.out.println("CARDAPIO DE BEBIDAS:");
		System.out.println(bebida.mostraCardapio());
		System.out.println("deseja pedir alguma bebida(s/n)? ");
		char x = sc.next().charAt(0);

		

		if (x == 's') {
			System.out.print("quantas bebidas: ");
		    int qtd = sc.nextInt();
			
			for (int i = 1; i <= qtd; i++) {
				System.out.print(i + "°bebida: ");
				bebida = new Bebida();
				bebida.montaProduto();
				c.addProduto(bebida);

			}
		}

		// É DELIVERY?.

		System.out.print("delivery(s/n): ");
		x = sc.next().charAt(0);

		if (x == 's') {
			entrega.montaEntrega();
		}

		// lista de pedidos e valor total.

		System.out.println("lista de pedidos: ");
		for (int i = 0; i < c.getList().size(); i++) {
			System.out.println("produto " + (i + 1) + ": " + c.toString(i));
        }
			if (x == 's') {
				System.out.println("total: r$ " + (c.total() + 5));
			} else {
				System.out.println("total: r$ " + c.total());
			}
			sc.close();
		}
		catch(DomainException e) {
			System.out.println(e.getMessage());
		}
		
		catch(InputMismatchException e) {
			System.out.println("erro inesperado!!!");
		}
	}
}
