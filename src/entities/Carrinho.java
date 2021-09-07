package entities;

import java.util.ArrayList;
import java.util.List;

import servico.Entrega;

public class Carrinho {

	private double valorTotal;
	private List<Produto> list = new ArrayList<>();
	private Entrega entrega;

	public Carrinho() {
	}

	public Carrinho(double valorTotal, Entrega entrega) {
		this.valorTotal = valorTotal;
		this.entrega = entrega;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public List<Produto> getList() {
		return list;
	}

	public Entrega getEntrega() {
		return entrega;
	}

	public void setEntrega(Entrega entrega) {
		this.entrega = entrega;
	}

	public void addProduto(Produto produto) {
		list.add(produto);
	}

	public void addremove(Produto produto) {
		list.remove(produto);
	}

	public double total() {
		for (Produto x : list) {
		valorTotal += x.getPreco();
		}
		return valorTotal;
	}

	public String toString(int i) {
		return list.get(i).getNome() + ",  r$ " + list.get(i).preco +" reais";
	}
	
}
