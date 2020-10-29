package ar.edu.uade.grupo1.backendadminconsorcios.controllers;

import ar.edu.uade.grupo1.backendadminconsorcios.models.Edificio;
import ar.edu.uade.grupo1.backendadminconsorcios.repositories.EdificioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/edificios")
public class EdificioController {
    @Autowired
    EdificioRepository edificioRepository;

    @GetMapping
    public Iterable<Edificio> getAllEdificios() {
        return edificioRepository.findAll();
    }

    @PostMapping(value = "/")
    public Edificio addNewEdificio(@RequestBody Edificio edificio) {
        edificioRepository.save(edificio);
        return edificio;
    }
}
