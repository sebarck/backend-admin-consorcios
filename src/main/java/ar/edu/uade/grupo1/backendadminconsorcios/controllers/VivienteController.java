package ar.edu.uade.grupo1.backendadminconsorcios.controllers;

import ar.edu.uade.grupo1.backendadminconsorcios.models.Viviente;
import ar.edu.uade.grupo1.backendadminconsorcios.repositories.VivienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/vivientes")
public class VivienteController {
    @Autowired
    private VivienteRepository vivienteRepository;

    @GetMapping
    public Iterable<Viviente> getAllVivientes() {
        return vivienteRepository.findAll();
    }

    @PostMapping(value = "/")
    public Viviente addNewViviente(@RequestBody Viviente viviente) {
        vivienteRepository.save(viviente);
        return viviente;
    }
}
