package com.poo.jobs.api.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Contratante {

	@Id
 	private String cnpj;
	private String nome;
	private String email;
	private String telefone;
//	private int senha;
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

/*	public int getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha.hashCode();
	}
*/
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}