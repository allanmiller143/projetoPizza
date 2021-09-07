package entities;

import java.util.Scanner;

import entities.exceptions.DomainException;

public class Bebida extends Produto {

	Scanner sc = new Scanner(System.in);

	public Bebida() {

	}

	public Bebida(String nome, double preco) {
		super(nome, preco);

	}

	@Override
	public String mostraCardapio() {
		return "Todas as bebidas custam 8 reais \n"+"1° cola-cola (1 litro) \n" + "2° fanta (1 litro) \n" + "3° guarana (1 litro)\n"
				+ "4° suco de maracuja (jarra)\n" + "5° suco de acerola (jarra)\n" + "6° suco de laranja (jarra)\n";
	}

	@Override
	public String associarIntComNome(int sabor) {
		if (sabor == 1) {
			return "coca-cola";
		} else if (sabor == 2) {
			return "fanta";
		} else if (sabor == 3) {
			return "guarana";
		} else if (sabor == 4) {
			return "suco de maracuja";
		} else if (sabor == 5) {
			return "suco de acerola";
		} else if (sabor == 6) {
			return "suco de laranja";
	    }
	
	    	return null;
	}
	

	@Override
	public String montaProduto() throws DomainException {
		int nomeTemporarioo = sc.nextInt();
		if(nomeTemporarioo < 1 || nomeTemporarioo >6) {
			throw new DomainException("valores invalidos!!!");
		}
		nome = associarIntComNome(nomeTemporarioo);
		preco = 8;
		return "bebida: " + nome + ", r$ " + preco + " reais.";

	}
}
