package com.example.vagas.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.vagas.models.Vacancies;

public interface VacanciesRepository extends MongoRepository<Vacancies, String> {

}