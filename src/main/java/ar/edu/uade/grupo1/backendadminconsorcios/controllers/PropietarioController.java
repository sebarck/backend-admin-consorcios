package ar.edu.uade.grupo1.backendadminconsorcios.controllers;

import ar.edu.uade.grupo1.backendadminconsorcios.models.Propietario;
import ar.edu.uade.grupo1.backendadminconsorcios.repositories.PropietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/propietarios")
public class PropietarioController {
    @Autowired
    private PropietarioRepository propietarioRepository;

    @GetMapping
    public Iterable<Propietario> getAllPropietarios() {
        return propietarioRepository.findAll();
    }

    @PostMapping
    public Propietario addNewPropietario(@RequestBody Propietario propietario) {
        propietarioRepository.save(propietario);
        return propietario;
    }
}