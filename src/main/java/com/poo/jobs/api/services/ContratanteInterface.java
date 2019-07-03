package com.poo.jobs.api.services;

import java.util.List;

import com.poo.jobs.api.models.Contratante;

public interface ContratanteInterface {

	List<Contratante> listAll();

	Contratante create(Contratante contratante);

	Contratante search(String id);

	Contratante update(Contratante contratante);

	void delete(String id);

}
