package ar.edu.uade.grupo1.backendadminconsorcios.controllers;

import ar.edu.uade.grupo1.backendadminconsorcios.models.Reclamo;
import ar.edu.uade.grupo1.backendadminconsorcios.repositories.ReclamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/reclamos")
public class ReclamoController {
    @Autowired
    ReclamoRepository reclamoRepository;

    @GetMapping
    public Iterable<Reclamo> getAllReclamos() {
        return reclamoRepository.findAll();
    }

    @PostMapping(value = "/")
    public Reclamo addNewReclamo(@RequestBody Reclamo reclamo) {
        reclamoRepository.save(reclamo);
        return reclamo;
    }
}
