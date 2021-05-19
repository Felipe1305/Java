package org.serratec.classes;

public class Cliente {
 private String nome;
 private String email;
 private String celular;
 private String cpfouCnpj;
 private Endereco endereco;
 
public Cliente(String nome, String email, String celular, String cpfouCnpj, Endereco endereco) {
	super();
	this.nome = nome;
	this.email = email;
	this.celular = celular;
	this.cpfouCnpj = cpfouCnpj;
	this.endereco = endereco;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getCelular() {
	return celular;
}

public void setCelular(String celular) {
	this.celular = celular;
}

public String getCpfouCnpj() {
	return cpfouCnpj;
}

public void setCpfouCnpj(String cpfouCnpj) {
	this.cpfouCnpj = cpfouCnpj;
}

public Endereco getEndereco() {
	return endereco;
}

public void setEndereco(Endereco endereco) {
	this.endereco = endereco;
}
 
 
}
