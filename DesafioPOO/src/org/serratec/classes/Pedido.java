package org.serratec.classes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.serratec.enumeradores.FormDePagamento;

public class Pedido {
	private int numero;
	private LocalDate data;
	private List<Produto> listProdutos = new ArrayList<>();
	private Cliente cliente;
	private double valorFrete;
	private double desconto;
	private FormDePagamento formaDePagamento;
	private double valorTotal;
	protected static int contCC = 0, contCD = 0, contPix = 0, ContBol = 0, ContPP = 0;
	protected static double valorTotalCC = 0, valorTotalCD = 0, valorTotalPix = 0, valorTotalBol = 0, valorTotalPP = 0;

	public Pedido(int numero, LocalDate data, Cliente cliente, double valorFrete, double desconto,
			FormDePagamento formaDePagamento) {
		super();
		this.numero = numero;
		this.data = data;
		this.cliente = cliente;
		this.valorFrete = valorFrete;
		this.desconto = desconto;
		this.formaDePagamento = formaDePagamento;
		if (formaDePagamento == FormDePagamento.CARTAODECREDITO) {
			contCC++;

		} else if (formaDePagamento == FormDePagamento.CARTAODEDÉBITO) {
			contCD++;

		} else if (formaDePagamento == FormDePagamento.PIX) {
			contPix++;

		} else if (formaDePagamento == FormDePagamento.PICPAY) {
			ContPP++;

		} else if (formaDePagamento == FormDePagamento.BOLETO) {
			ContBol++;

		}

	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public List<Produto> getListProdutos() {
		return listProdutos;
	}

	public void setListProdutos(List<Produto> listProdutos) {
		this.listProdutos = listProdutos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(double valorFrete) {
		this.valorFrete = valorFrete;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public FormDePagamento getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(FormDePagamento formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public void calcularTotal(List<Produto> lista) {

		for (Produto produto : lista) {
			this.valorTotal += produto.getValor();
		}
		this.valorTotal -= this.valorTotal * this.getDesconto();

		if (formaDePagamento == FormDePagamento.CARTAODECREDITO) {
			valorTotalCC += this.getValorTotal();
		} else if (formaDePagamento == FormDePagamento.CARTAODEDÉBITO) {

			valorTotalCD += this.getValorTotal();
		} else if (formaDePagamento == FormDePagamento.PIX) {

			valorTotalPix += this.getValorTotal();
		} else if (formaDePagamento == FormDePagamento.PICPAY) {

			valorTotalPP += this.getValorTotal();
		} else if (formaDePagamento == FormDePagamento.BOLETO) {

			valorTotalBol += this.getValorTotal();
		}
	}

}
