package entities;


public class Pizza extends Produto {

	private int ingredientes;

	public Pizza() {
	}

	public Pizza(String nome, double preco, int ingredientes) {
		super(nome, preco);
		this.ingredientes = 0;
	}	public Pizza(String nome, double preco) {
		super(nome, preco);
	}

	public int getIngredientes() {
		return ingredientes;
	}

	public void adicinaIngredientes(int ingredientes) {
		this.ingredientes += ingredientes;
	}

	public void removeIngredientes(int ingredientes) {
		this.ingredientes += ingredientes;
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
	public String mostraCardapio() {
		return "1� mussarela: queijo mussarela e tomate em rodelas. \n"
				+ "2� holandeza: mussarela, atum, requeij�o e cebola \n"
				+ "3� calabreza: queijo mussarela, calabreza e cebola \n"
				+ "4� P�o de alho: alho, requeij�o, queijo e salsinha.\n"
				+ "5� frango catupiry: queijo mu�arela, frango, catupiry, s�lvia e molho de tomate\n"
				+ "6� marguerita:  manjeric�o, rodelas de tomate fresco, azeitona, queijo mu�arela e or�gano salpicado\n"
				+ "7� portuguesa: queijo, azeitona verde ou preta, ovo cozido, presunto cozido, cebola, ervilha, molho de tomate e azeite.\n";
	}

	@Override
	public String associarIntComNome(int sabor) {
		if (sabor == 1) {
			return "mussarela";
		} else if (sabor == 2) {
			return "holandeza";
		} else if (sabor == 3) {
			return "calabreza";
		} else if (sabor == 4) {
			return "p�o de olho";
		} else if (sabor == 5) {
			return "frango catupiry";
		} else if (sabor == 6) {
			return "marguerita";
		} else
			return "portuguesa";

	}

}
