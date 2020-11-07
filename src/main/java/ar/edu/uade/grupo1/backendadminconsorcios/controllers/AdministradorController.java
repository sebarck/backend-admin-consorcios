package ar.edu.uade.grupo1.backendadminconsorcios.controllers;

import ar.edu.uade.grupo1.backendadminconsorcios.models.Administrador;
import ar.edu.uade.grupo1.backendadminconsorcios.repositories.AdministradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/administradores")
public class AdministradorController {
    @Autowired
    private AdministradorRepository administradorRepository;

    @GetMapping
    public Iterable<Administrador> getAllAdministradores() {
        return administradorRepository.findAll();
    }

    @PostMapping
    public Administrador addNewAdministrador(@RequestBody Administrador administrador) {
        administradorRepository.save(administrador);
        return administrador;
    }
}