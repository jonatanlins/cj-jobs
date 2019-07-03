package com.poo.jobs.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.poo.jobs.api.models.Vacancies;

public interface VacanciesRepository extends MongoRepository<Vacancies, String> {

}