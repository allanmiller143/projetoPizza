package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.exceptions.DomainException;

public class Pizza extends Produto {

	Scanner sc = new Scanner(System.in);
	
	private List<String> ingredientes = new ArrayList<>();

	public Pizza() {
	}

	public Pizza(String nome, double preco, int ingredientes) {
		super(nome, preco);	
	}
	
	public Pizza(String nome, double preco) {
		super(nome, preco);
	}

	public List<String> getIngredientes(int i) {
		return ingredientes;
	}
	
	@Override
	public double precoDaPizza(int ingredientes) {
	    if(ingredientes ==0) {
	    	return preco =  15;
	    }
		else if  (ingredientes == 1) {
			return preco = 20;
		} else if (ingredientes <= 3) {
			return preco = 23;
		} else {
			return preco = 25;
		}
	}
	
	@Override
	public String montaProduto() throws DomainException {
		System.out.print("sabor: ");
		int nomeTemporario = sc.nextInt();
		sc.nextLine();
		nome = associarIntComNome(nomeTemporario) ;
		
		if(nomeTemporario < 1 || nomeTemporario >7) {
			throw new DomainException("valores invalidos!!!");
		}
		
		System.out.print("deseja adicionar algum ingrediente(s/n):  ");
		char x = sc.next().charAt(0);
		
		if (x == 'n') {
			 preco = 15;			
		
		} else if(x =='s'){
			
			System.out.print("quantos ingredientes: ");
			    int ingredientesExtras = sc.nextInt();
			    sc.nextLine();
			    if(ingredientesExtras < 1 ) {
					throw new DomainException("valores invalidos!!!");
				}
				for(int i = 1;i <=ingredientesExtras; i++) {
				System.out.print("ingrediente " + i + ": " );			
				String y = sc.nextLine();
				ingredientes.add(y);
			    }	
		    preco = precoDaPizza(ingredientesExtras);
		    }
		return "Pizza: " + nome +", r$ "+ preco + " reais.";  
		
	}

	@Override
	public String mostraCardapio() {
		return "1° mussarela: queijo mussarela e tomate em rodelas. \n"
				+ "2° holandeza: mussarela, atum, requeijão e cebola \n"
				+ "3° calabreza: queijo mussarela, calabreza e cebola \n"
				+ "4° Pão de alho: alho, requeijão, queijo e salsinha.\n"
				+ "5° frango catupiry: queijo muçarela, frango, catupiry, sálvia e molho de tomate\n"
				+ "6° marguerita:  manjericão, rodelas de tomate fresco, azeitona, queijo muçarela e orégano salpicado\n"
				+ "7° portuguesa: queijo, azeitona verde ou preta, ovo cozido, presunto cozido, cebola, ervilha, molho de tomate e azeite.\n"
               ;
	}
	

	@Override
	public String associarIntComNome(int sabor) {
		if (sabor == 1) {
		return "pizza de mussarela";
		} else if (sabor == 2) {
			return "pizza holandeza";
		} else if (sabor == 3) {
			return "pizza de calabreza";
		} else if (sabor == 4) {
			return "pizza de pão de olho";
		} else if (sabor == 5) {
			return "pizza de frango catupiry";
		} else if (sabor == 6) {
			return "pizza marguerita";
		} else if (sabor ==7){
			return "pizza portuguesa";
		} else {
			return null;
		}
	}
}
