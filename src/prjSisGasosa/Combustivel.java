package prjSisGasosa;

public class Combustivel {
	
	private String nome;
	private double precoCusto;
	private double qtde;
	private double precoVenda;
	
	/*
	 *              FUNÇÕES GETTERS
	 */
	
	public String getNome(){
		return nome;
	}
	
	public double getPrecoCusto(){
		return precoCusto;
	}
	
	public double getQtde(){
		return qtde;
	}
	
	public double getPrecoVenda(){
		return precoVenda;
	}
	
	/*
	 *            FUNÇÕES SETTERS
	 */
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setPrecoCusto(double precoCusto){
		this.precoCusto = precoCusto;
	}
	
	public void setQtde(double qtde){
		this.qtde = qtde;
	}
	
	public void setPrecoVenda(double precoVenda){
		this.precoVenda = precoVenda;
	}
	
	public String toString(){
		return nome + ", Preço de venda: " + precoVenda;
	}
	
	public void reajustaPrecoVenda(double percentual){
		double valorReajuste = precoVenda * (percentual /100);
		setPrecoVenda(precoVenda +  valorReajuste);
	}

}
