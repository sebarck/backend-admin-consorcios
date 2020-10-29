package ar.edu.uade.grupo1.backendadminconsorcios.controllers;

import ar.edu.uade.grupo1.backendadminconsorcios.models.Propiedad;
import ar.edu.uade.grupo1.backendadminconsorcios.repositories.PropiedadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/propiedades")
public class PropiedadController {
    @Autowired
    PropiedadRepository propiedadRepository;

    @GetMapping
    public Iterable<Propiedad> getAllPropiedades() {
        return propiedadRepository.findAll();
    }

    @PostMapping(value = "/")
    public Propiedad addNewPropiedad(@RequestBody Propiedad propiedad) {
        propiedadRepository.save(propiedad);
        return propiedad;
    }

}
