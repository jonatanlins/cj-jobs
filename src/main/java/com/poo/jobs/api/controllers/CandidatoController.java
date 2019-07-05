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

import com.poo.jobs.api.models.Candidato;
import com.poo.jobs.api.services.CandidatoInterface;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping(path = "/api/candidato")
public class CandidatoController {

	@Autowired
	private CandidatoInterface candidatoInterface;

	@GetMapping
	public ResponseEntity<List<Candidato>> listAll() {
		return ResponseEntity.ok(this.candidatoInterface.listAll());
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity<Candidato> search(@PathVariable(name = "id") String id) {
		return ResponseEntity.ok(this.candidatoInterface.search(id));
	}

	@PostMapping
	public ResponseEntity<Candidato> create(@RequestBody Candidato contratante) {
		return ResponseEntity.ok(this.candidatoInterface.create(contratante));
	}

	@PutMapping(path = "/{id}")
	public ResponseEntity<Candidato> update(@PathVariable(name = "id") String id, @RequestBody Candidato cliente) {
		cliente.setCpf(id);
		return ResponseEntity.ok(this.candidatoInterface.update(cliente));
	}

	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Integer> delete(@PathVariable(name = "id") String id) {
		this.candidatoInterface.delete(id);
		return ResponseEntity.ok(1);
	}

}