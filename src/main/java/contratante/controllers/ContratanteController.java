package contratante.controllers;

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

import contratante.models.Contratante;
import contratante.services.ContratanteInterface;

@RestController
@RequestMapping(path = "/api/Contratante")
public class ContratanteController {

   @Autowired
   private ContratanteInterface contratanteInterface;

   @GetMapping
   public ResponseEntity<List<Contratante>> listAll() {
      return ResponseEntity.ok(this.contratanteInterface.listAll());
   }

   @GetMapping(path = "/{id}")
   public ResponseEntity<Contratante> search(@PathVariable(name = "id") String id) {
      return ResponseEntity.ok(this.contratanteInterface.search(id));
   }

   @PostMapping
   public ResponseEntity<Contratante> create(@RequestBody Contratante contratante) {
      return ResponseEntity.ok(this.contratanteInterface.create(contratante));
   }

   @PutMapping(path = "/{id}")
   public ResponseEntity<Contratante> update(@PathVariable(name = "id") String id, @RequestBody Contratante cliente) {
      cliente.setId(id);
      return ResponseEntity.ok(this.contratanteInterface.update(cliente));
   }

   @DeleteMapping(path = "/{id}")
   public ResponseEntity<Integer> delete(@PathVariable(name = "id") String id) {
      this.contratanteInterface.delete(id);
      return ResponseEntity.ok(1);
   }

}