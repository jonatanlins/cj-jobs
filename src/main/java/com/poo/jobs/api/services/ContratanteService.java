package com.poo.jobs.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poo.jobs.api.models.Contratante;
import com.poo.jobs.api.repositories.ContratanteRepository;

@Service
public class ContratanteService implements ContratanteInterface {

   @Autowired
   private ContratanteRepository contratanteRepository;

   @Override
   public List<Contratante> listAll() {
      return this.contratanteRepository.findAll();
   }

   @Override
   public Contratante create(Contratante contratante) {
      return this.contratanteRepository.save(contratante);
   }

   @Override
   public Contratante search(String id) {
      return this.contratanteRepository.findById(id).orElse(null);
   }

   @Override
   public Contratante update(Contratante contratante) {
      return this.contratanteRepository.save(contratante);
   }

   @Override
   public void delete(String id) {
      this.contratanteRepository.deleteById(id);
   }

}
