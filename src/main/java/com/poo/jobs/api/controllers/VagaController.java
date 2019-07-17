package com.poo.jobs.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poo.jobs.api.models.Vaga;
import com.poo.jobs.api.services.VagaInterface;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping(path = "/vagas")
public class VagaController {

	@Autowired
	private VagaInterface vagaInterface;

	@GetMapping
	public ResponseEntity<List<Vaga>> listAll() {
		return ResponseEntity.ok(this.vagaInterface.listAll());
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity<Vaga> search(@PathVariable(name = "id") String id) {
		return ResponseEntity.ok(this.vagaInterface.search(id));
	}

	@PostMapping
	public ResponseEntity<Vaga> create(@RequestBody Vaga vacancies) {
		return ResponseEntity.ok(this.vagaInterface.create(vacancies));
	}

	@PutMapping(path = "/{id}")
	public ResponseEntity<Vaga> update(@PathVariable(name = "id") String id, @RequestBody Vaga cliente) {
		cliente.setId(id);
		return ResponseEntity.ok(this.vagaInterface.update(cliente));
	}

	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Integer> delete(@PathVariable(name = "id") String id) {
		this.vagaInterface.delete(id);
		return ResponseEntity.ok(1);
	}

}