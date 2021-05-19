package org.serratec.classes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.serratec.enumeradores.FormDePagamento;

public class Empresa {

	private String nome;
	private Endereco endereco;
	private List<Pedido> listPedidos = new ArrayList<>();

	public Empresa(String nome, Endereco endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Pedido> getListPedidos() {
		return listPedidos;
	}

	public void setListPedidos(List<Pedido> listPedidos) {
		this.listPedidos = listPedidos;
	}

	public double calcularValorFaturado(LocalDate inicio, LocalDate fim) {
		int a = inicio.getDayOfMonth();
		int b = fim.getDayOfMonth();
		double valorFaturado = 0.0;

		for (Pedido pedido : listPedidos) {
			if (pedido.getData().getDayOfMonth() >= a && pedido.getData().getDayOfMonth() <= b) {
				valorFaturado += pedido.getValorTotal();

			} else {
				return 0.0;
			}

		}
		return valorFaturado;
	}

	public String formaPagamentoMaisUtilizada() {
		

		if (Pedido.ContPP > Pedido.contPix&&Pedido.ContPP > Pedido.contCD&&Pedido.ContPP > Pedido.contCC&&Pedido.ContPP > Pedido.ContBol) {
			return FormDePagamento.PICPAY.getNome();
		} else if (Pedido.contCC > Pedido.ContPP&&Pedido.contCC > Pedido.contPix&&Pedido.contCC > Pedido.contCD&&Pedido.contCC > Pedido.ContBol) {
			return FormDePagamento.CARTAODECREDITO.getNome();
		}else if (Pedido.contCD>Pedido.ContPP&&Pedido.contCD>Pedido.contPix&&Pedido.contCD>Pedido.contCC&&Pedido.contCD>Pedido.ContBol) {
			return FormDePagamento.CARTAODEDÉBITO.getNome();
				
		} else if (Pedido.ContBol>Pedido.contCC&&Pedido.ContBol>Pedido.contCD&&Pedido.ContBol>Pedido.contPix&&Pedido.ContBol>Pedido.ContPP) {
			return FormDePagamento.BOLETO.getNome();
		}else if (Pedido.contPix>Pedido.ContBol&&Pedido.contPix>Pedido.contCC&&Pedido.contPix>Pedido.contCD&&Pedido.contPix>Pedido.ContPP) {
			return FormDePagamento.PIX.getNome();
		} else {
			return "";
		}

	}
	public double lucroPorFormaPagamento(FormDePagamento forma) {
		if (forma==FormDePagamento.PIX) {
			return Pedido.valorTotalPix;
		} else if (forma==FormDePagamento.PICPAY) {
			return Pedido.valorTotalPP;
		} else if (forma==FormDePagamento.CARTAODEDÉBITO) {
			return Pedido.valorTotalCD;
		}else if (forma==FormDePagamento.CARTAODECREDITO) {
			return Pedido.valorTotalCC;
		}else if (forma==FormDePagamento.BOLETO) {
			return Pedido.valorTotalBol;
		} else {
			return 0;
		}
	}
	public void imprimirRelatorio(Cliente c) {
		System.out.println("*************************************************************************");
		System.out.println("**************************  "+this.getNome()+"  *************************");
		System.out.println("*************************************************************************");
		LocalDateTime agora = LocalDateTime.now();
		DateTimeFormatter formatoBarra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
		System.out.println("\nData e hora da geração: "+agora.format(formatoBarra)+" "+agora.format(formatoHora));
		
		System.out.println("\n\n\nCliente");
		System.out.println("\n_______________________________________________________________________");
		System.out.println("\nNome: "+c.getNome());
		System.out.println("\nCep: "+c.getEndereco().getCep());
		System.out.println("\nEndereço: "+c.getEndereco());
		System.out.println("\nReferência: ");
	}
}