package candidato.services;

import java.util.List;

import candidato.models.Candidato;

public interface CandidatoInterface {

	List<Candidato> listAll();

	Candidato create(Candidato candidato);

	Candidato search(String id);

	Candidato update(Candidato candidato);

	void delete(String id);

}
