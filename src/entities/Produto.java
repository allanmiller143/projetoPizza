package entities;

public class Produto {
	
	private String nome;
	protected double preco;
	
    public Produto() {
	}
    
    public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	    
    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String associarIntComNome(int sabor) {
		return null;
	}
	
	public String mostraCardapio() {
		return null;
	}
	
	public double precoDaPizza(int ingredientes) {
	    return  0.0;
	}
	
	
	

}
