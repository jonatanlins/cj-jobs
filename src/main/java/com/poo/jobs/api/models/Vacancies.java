package com.poo.jobs.api.models;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Vacancies {

  @Id
  private String id;
  @Indexed(unique = true)
  private String cnpj;
  private String descricao;
  private String nome;
  private String cargaHoraria;
  private String salario;
  private Date dataCriacao = new Date();

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCargaHoraria() {
    return cargaHoraria;
  }

  public void setCargaHoraria(String CH) {
    this.cargaHoraria = CH;
  }

  public String getSalario() {
    return salario;
  }

  public void setSalario(String salario) {
    this.salario = salario;
  }

  public Date getDataCriacao() {
    return dataCriacao;
  }

  public void setCriacao(Date createAt) {
    this.dataCriacao = new Date();
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

}
