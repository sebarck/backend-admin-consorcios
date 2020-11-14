package ar.edu.uade.grupo1.backendadminconsorcios.controllers;

import ar.edu.uade.grupo1.backendadminconsorcios.models.Reclamo;
import ar.edu.uade.grupo1.backendadminconsorcios.repositories.ReclamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping(path = "/reclamos")
public class ReclamoController {
    @Autowired
    ReclamoRepository reclamoRepository;

    @GetMapping
    public Iterable<Reclamo> getAllReclamos() {
        return reclamoRepository.findAll();
    }

    @PostMapping
    public Reclamo addNewReclamo(@RequestBody Reclamo reclamo) {
        reclamo.setEstado("NUEVO");
        reclamo.setFechaCreacion(LocalDateTime.now());
        reclamoRepository.save(reclamo);
        return reclamo;
    }

    @GetMapping(path = "/viviente/{id}")
    public Iterable<Reclamo> findReclamosByIdViviente(@PathVariable(name = "id") int id) {
        return reclamoRepository.findReclamosByVivienteId(id);
    }


}
