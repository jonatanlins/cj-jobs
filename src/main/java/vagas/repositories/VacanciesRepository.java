package vagas.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import vagas.models.Vacancies;

public interface VacanciesRepository extends MongoRepository<Vacancies, String> {

}