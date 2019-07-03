package com.poo.jobs.api.services;

import java.util.List;

import com.poo.jobs.api.models.Candidato;

public interface CandidatoInterface {

	List<Candidato> listAll();

	Candidato create(Candidato candidato);

	Candidato search(String id);

	Candidato update(Candidato candidato);

	void delete(String id);

}
