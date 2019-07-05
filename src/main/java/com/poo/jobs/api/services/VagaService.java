package com.poo.jobs.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poo.jobs.api.models.Vaga;
import com.poo.jobs.api.repositories.VagaRepository;
import com.poo.jobs.api.services.VagaInterface;

@Service
public class VagaService implements VagaInterface {

   @Autowired
   private VagaRepository vagaRespository;

   @Override
   public List<Vaga> listAll() {
      return this.vagaRespository.findAll();
   }

   @Override
   public Vaga create(Vaga vaga) {
      return this.vagaRespository.save(vaga);
   }

   @Override
   public Vaga search(String id) {

      return this.vagaRespository.findById(id).orElse(null);
   }

   @Override
   public Vaga update(Vaga vaga) {
      return this.vagaRespository.save(vaga);
   }

   @Override
   public void delete(String id) {
      this.vagaRespository.deleteById(id);
   }

}