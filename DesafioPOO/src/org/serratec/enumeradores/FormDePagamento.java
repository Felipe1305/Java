package org.serratec.enumeradores;

public enum FormDePagamento {
	CARTAODECREDITO("Cart�o de d�bito"),CARTAODED�BITO("Cart�o de d�bito"),PIX("Pix"),BOLETO("Boleto"),PICPAY("PicPay");

private final String nome;

private FormDePagamento(String nome) {
	this.nome = nome;
}

public String getNome() {
	return nome;
}
	
	
}
