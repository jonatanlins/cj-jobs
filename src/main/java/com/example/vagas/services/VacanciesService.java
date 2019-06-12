package com.example.vagas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vagas.models.Vacancies;
import com.example.vagas.repositories.VacanciesRepository;
import com.example.vagas.services.VacanciesInterface;

@Service
public class VacanciesService implements VacanciesInterface {

   @Autowired
   private VacanciesRepository vacanciesRespository;

   @Override
   public List<Vacancies> listAll() {
      return this.vacanciesRespository.findAll();
   }

   @Override
   public Vacancies create(Vacancies vacancies) {
      return this.vacanciesRespository.save(vacancies);
   }

   @Override
   public Vacancies search(String id) {

      return this.vacanciesRespository.findById(id).orElse(null);
   }

   @Override
   public Vacancies update(Vacancies vacancies) {
      return this.vacanciesRespository.save(vacancies);
   }

   @Override
   public void delete(String id) {
      this.vacanciesRespository.deleteById(id);
   }

}