package com.poo.jobs.api.services;

import java.util.List;

import com.poo.jobs.api.models.Vacancies;

public interface VacanciesInterface {

   List<Vacancies> listAll();

   Vacancies create(Vacancies vacancies);

   Vacancies search(String id);

   Vacancies update(Vacancies vacancies);

   void delete(String id);

}