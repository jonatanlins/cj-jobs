package com.example.vagas.vagas.repositories;

import com.example.vagas.vagas.models.Vacancies;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface VacanciesRepository extends MongoRepository<Vacancies, String> {

}