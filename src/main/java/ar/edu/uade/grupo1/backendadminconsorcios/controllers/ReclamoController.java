package ar.edu.uade.grupo1.backendadminconsorcios.controllers;

import ar.edu.uade.grupo1.backendadminconsorcios.models.Reclamo;
import ar.edu.uade.grupo1.backendadminconsorcios.repositories.ReclamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reclamos")
public class ReclamoController {
    @Autowired
    ReclamoRepository repository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Reclamo> getAllReclamos() {
        return repository.findAll();
    }
}
