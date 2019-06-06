package com.example.vagas.vagas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.vagas.vagas.models.Vacancies;
import com.example.vagas.vagas.services.VacanciesInterface;

@RestController
@RequestMapping(path = "/api/vacancies")
public class VacanciesController {

   @Autowired
   private VacanciesInterface vacanciesInterface;

   @GetMapping
   public ResponseEntity<List<Vacancies>> listAll() {
      return ResponseEntity.ok(this.vacanciesInterface.listAll());
   }

   @GetMapping(path = "/{id}")
   public ResponseEntity<Vacancies> search(@PathVariable(name = "id") String id) {
      return ResponseEntity.ok(this.vacanciesInterface.search(id));
   }

   @PostMapping
   public ResponseEntity<Vacancies> create(@RequestBody Vacancies vacancies) {
      return ResponseEntity.ok(this.vacanciesInterface.create(vacancies));
   }

   @PutMapping(path = "/{id}")
   public ResponseEntity<Vacancies> update(@PathVariable(name = "id") String id, @RequestBody Vacancies cliente) {
      cliente.setId(id);
      return ResponseEntity.ok(this.vacanciesInterface.update(cliente));
   }

   @DeleteMapping(path = "/{id}")
   public ResponseEntity<Integer> delete(@PathVariable(name = "id") String id) {
      this.vacanciesInterface.delete(id);
      return ResponseEntity.ok(1);
   }

}