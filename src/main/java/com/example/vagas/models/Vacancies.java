package com.example.vagas.models;

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
  private String description;
  private String job;
  private String scheduleWork;
  private String salary;
  private Date createAt = new Date();

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }

  public String getScheduleWork() {
    return scheduleWork;
  }

  public void setScheduleWork(String scheduleWork) {
    this.scheduleWork = scheduleWork;
  }

  public String getSalary() {
    return salary;
  }

  public void setSalary(String salary) {
    this.salary = salary;
  }

  public Date getCreateAt() {
    return createAt;
  }

  public void setCreateAt(Date createAt) {
    this.createAt = new Date();
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

}
