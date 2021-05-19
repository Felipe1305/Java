package org.serratec.classes;

import org.serratec.enumeradores.Categoria;

public class Produto {
	private int codigo;
	private String descricao;
	private Categoria categoria;
	private int quantidade;
	private double valor;
	private double desconto;
	public Produto(int codigo, String descricao, Categoria categoria, int quantidade, double valor, double desconto) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.categoria = categoria;
		this.quantidade = quantidade;
		this.valor = valor;
		this.desconto = desconto;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	
	
}
