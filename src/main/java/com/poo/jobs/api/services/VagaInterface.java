package com.poo.jobs.api.services;

import java.util.List;

import com.poo.jobs.api.models.Vaga;

public interface VagaInterface {

   List<Vaga> listAll();

   Vaga create(Vaga vaga);

   Vaga search(String id);

   Vaga update(Vaga vaga);

   void delete(String id);

}