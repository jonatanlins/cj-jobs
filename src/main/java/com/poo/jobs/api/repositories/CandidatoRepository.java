package com.poo.jobs.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.poo.jobs.api.models.Candidato;

public interface CandidatoRepository extends MongoRepository<Candidato, String> {

}