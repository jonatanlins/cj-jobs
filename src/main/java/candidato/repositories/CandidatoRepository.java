package candidato.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import candidato.models.Candidato;

public interface CandidatoRepository extends MongoRepository<Candidato, String> {

}