package com.example.vagas.services;

import java.util.List;

import com.example.vagas.models.Vacancies;

public interface VacanciesInterface {

   List<Vacancies> listAll();

   Vacancies create(Vacancies vacancies);

   Vacancies search(String id);

   Vacancies update(Vacancies vacancies);

   void delete(String id);

}