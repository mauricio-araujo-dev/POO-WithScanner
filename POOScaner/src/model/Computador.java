package model;

public class Computador {

	private String marca;
	private String modelo;
	private int ano;
	private double preco;
	private String situacao;
	
	public void imprimir() {
		System.out.println("\n--- Informações do Computador ---");
		System.out.println("Marca: "+this.getMarca());
		System.out.println("Modelo: "+this.getModelo());
		System.out.println("Ano: "+this.getAno());
		System.out.println("Preço: R$"+this.getPreco());
		System.out.println("Situação: "+this.getSituacao());
	}

	public Computador(String marca, String modelo, int ano, double preco, String situacao) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.preco = preco;
		this.situacao = situacao;
	}

	public Computador() {
		super();
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
		
}