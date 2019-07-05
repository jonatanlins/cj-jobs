package com.poo.jobs.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.poo.jobs.api.models.Vaga;

public interface VagaRepository extends MongoRepository<Vaga, String> {

}