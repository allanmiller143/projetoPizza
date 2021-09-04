package entities;

public class Bebida extends Produto {
	
    private int qtd;
    
    public Bebida() {
	
	}
	public Bebida(String nome, double preco, int qtd) {
		super(nome, preco);
		this.qtd = qtd;
	}
    
	@Override
	public String mostraCardapio() {
		return "1° cola-cola (1 litro) \n"
				+ "2° fanta (1 litro) \n"
				+ "3° guarana (1 litro)\n"
				+ "4° suco de maracuja (jarra)\n"
				+ "5° suco de acerola (jarra)\n"
				+ "6° suco de laranja (jarra)\n";			
	}
	
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
		} else 
			return "suco de laranja";
		
	}
	
	
	
}
