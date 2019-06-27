package candidato.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import candidato.models.Candidato;
import candidato.repositories.CandidatoRepository;
import candidato.services.CandidatoInterface;

@Service
public class CandidatoService implements CandidatoInterface {

   @Autowired
   private CandidatoRepository candidatoRepository;

   @Override
   public List<Candidato> listAll() {
      return this.candidatoRepository.findAll();
   }

   @Override
   public Candidato create(Candidato candidato) {
      return this.candidatoRepository.save(candidato);
   }

   @Override
   public Candidato search(String id) {
      return this.candidatoRepository.findById(id).orElse(null);
   }

   @Override
   public Candidato update(Candidato contratante) {
      return this.candidatoRepository.save(contratante);
   }

   @Override
   public void delete(String id) {
      this.candidatoRepository.deleteById(id);
   }

}