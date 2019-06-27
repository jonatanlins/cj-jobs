package contratante.services;

import java.util.List;

import contratante.models.Contratante;

public interface ContratanteInterface {

	List<Contratante> listAll();

	Contratante create(Contratante contratante);

	Contratante search(String id);

	Contratante update(Contratante contratante);

	void delete(String id);

}
