package contratante.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import contratante.models.Contratante;

public interface ContratanteRepository extends MongoRepository<Contratante, String> {

}