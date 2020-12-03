package ar.edu.uade.grupo1.backendadminconsorcios.controllers;

import ar.edu.uade.grupo1.backendadminconsorcios.models.Inspector;
import ar.edu.uade.grupo1.backendadminconsorcios.repositories.InspectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/inspectores")
public class InspectorController {

    @Autowired
    InspectorRepository inspectorRepository;

    @GetMapping
    public Iterable<Inspector> getAllInspectores() { return inspectorRepository.findAll(); }

    @PostMapping
    public Inspector addNewInspector(@RequestBody Inspector inspector) {
        inspectorRepository.save(inspector);
        return inspector;
    }
}
