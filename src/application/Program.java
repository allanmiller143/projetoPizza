package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Bebida;
import entities.Carrinho;
import entities.Pizza;
import entities.Produto;
import servico.Entrega;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Carrinho c = new Carrinho();
		Produto pizza = new Pizza();
		Produto bebida = new Bebida();
		Entrega entrega = new Entrega();
		
		List<String> ingredientesExtras = new ArrayList<String>();
		
		System.out.println("CARDAPIO DE PIZZAS: ");
		System.out.println(pizza.mostraCardapio());
		
		System.out.print("quantas pizzas serão pedidas: ");
		int n = sc.nextInt();
        sc.nextLine();
		// LEITURA DE DADOS : PEDIDO DE PIZZAS.
		
        for (int i = 0; i < n; i++) {
    			System.out.println((i+1) + "° pedido: ");
    			System.out.print("sabor da pizza: ");
    			int saborTemporario = sc.nextInt();
    			String sabor = pizza.associarIntComNome(saborTemporario);
    			
    			System.out.print("deseja adicionar algum ingrediente(s/n):  ");
    			char x = sc.next().charAt(0);
    			double preco = 0;
    			
    			if (x == 'n') {
    				 preco = pizza.precoDaPizza(0);
    				 pizza = new Pizza(sabor, preco, 0);
    				 c.addProduto(pizza);
    				 System.out.println(pizza.getPreco());
    				 sc.nextLine();
    				
    			} else if(x =='s'){
    				
    				System.out.print("quantos ingredientes: ");
    				int ingredientes = sc.nextInt();
    					sc.nextLine();
    				
    					for(int j = 1;j <=ingredientes; j++) {
    					System.out.print("ingrediente " + j + ": " );			
    					String ingredientesExtras1 = sc.nextLine();	
    					ingredientesExtras.add(ingredientesExtras1);
    				    }	
    			    preco = pizza.precoDaPizza(ingredientes);
    				pizza = new Pizza(sabor, preco , ingredientes);
    				
    				c.addProduto(pizza);
                    System.out.println(pizza.getPreco());
    				
    			}

		}

		// LEITURA DE DADOS: PEDIDO DE BEBIDA.
		System.out.print("deseja pedir alguma bebida: ");
		char x = sc.next().charAt(0);
		
		if (x == 's') {	
			System.out.println();
			System.out.println("CARDAPIO DE BEBIDAS: ");
			System.out.println(bebida.mostraCardapio());
		    System.out.print("quantidade: ");
		    n = sc.nextInt();
		
		    for(int i =1;i<=n;i++) {
		    	System.out.print("bebida "+i+": ");
		    	int bebidaTemporaria = sc.nextInt();
		    	String bebida1 = bebida.associarIntComNome(bebidaTemporaria);
		    	bebida = new Bebida(bebida1,8,1);
		    	c.addProduto(bebida);
		    }
					
		}

		// LEITURA DE DADOS: ENTREGA?

		System.out.print("delivery:(s/n): ");
		x = sc.next().charAt(0);
		Date horaDoPedido = new Date();

		double total = 0;
		if (x == 's') {
			System.out.print("endereco: ");
			sc.nextLine();
			String endereco = sc.nextLine();
			System.out.print("numero: ");
			int numeroDaCasa = sc.nextInt(); 
			entrega = new Entrega(5.00, endereco, numeroDaCasa, horaDoPedido);
			total = c.total() + 5;
		System.out.println(entrega);	
		} else {
			entrega = new Entrega(horaDoPedido);
			total = c.total();
		}
		
		
		System.out.println("LISTA DE PEDIDOS: ");
		for(Produto produto : c.getList()) {
			System.out.println(produto.getNome() + "- r$ " + produto.getPreco());
		}

		
		System.out.println("total a ser pago:" + total );

		sc.close();
	}

}
