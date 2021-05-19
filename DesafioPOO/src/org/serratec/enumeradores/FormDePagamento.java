package org.serratec.enumeradores;

public enum FormDePagamento {
	CARTAODECREDITO("Cartão de débito"),CARTAODEDÉBITO("Cartão de débito"),PIX("Pix"),BOLETO("Boleto"),PICPAY("PicPay");

private final String nome;

private FormDePagamento(String nome) {
	this.nome = nome;
}

public String getNome() {
	return nome;
}
	
	
}
