package com.poo.jobs.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.poo.jobs.api.models.Contratante;

public interface ContratanteRepository extends MongoRepository<Contratante, String> {

}