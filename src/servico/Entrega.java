package servico;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Entrega {
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	
	private double precoDaEntrega;
	private String endereco;
	private  int numeroDaCasa;
	private Date momentoDoPedido;
	
	public Entrega() {
	}
	
	public Entrega(double precoDaEntrega, String endereco, int numeroDaCasa, Date momentoDoPedido) {
		super();
		this.precoDaEntrega = precoDaEntrega;
		this.endereco = endereco;
		this.numeroDaCasa = numeroDaCasa;
		this.momentoDoPedido = momentoDoPedido;
	}
	
	public Entrega(Date momentoDoPedido) {
		this.momentoDoPedido = momentoDoPedido;
	}

	public int getNumeroDaCasa() {
		return numeroDaCasa;
	}

	public void setNumeroDaCasa(int numeroDaCasa) {
		this.numeroDaCasa = numeroDaCasa;
	}

	public double getPrecoDaEntrega() {
		return precoDaEntrega;
	}

	public void setPrecoDaEntrega(double precoDaEntrega) {
		this.precoDaEntrega = precoDaEntrega;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Date getMomentoDoPedido() {
		return momentoDoPedido;
	}

	public void setMomentoDoPedido(Date momentoDoPedido) {
		this.momentoDoPedido = momentoDoPedido;
	}

	
	public String toString() {
		return "momento do pedido - " + sdf.format(momentoDoPedido) + ", endereco: " + endereco + "n° " + numeroDaCasa;
	}
	
	

	
	
}
