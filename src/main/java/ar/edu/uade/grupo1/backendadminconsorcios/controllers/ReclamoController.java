package ar.edu.uade.grupo1.backendadminconsorcios.controllers;

import ar.edu.uade.grupo1.backendadminconsorcios.models.Reclamo;
import ar.edu.uade.grupo1.backendadminconsorcios.repositories.ReclamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping(path = "/reclamos")
public class ReclamoController {
    @Autowired
    ReclamoRepository reclamoRepository;

    @GetMapping
    public Iterable<Reclamo> getAllReclamos() {
        return reclamoRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Reclamo findReclamosById(@PathVariable(name = "id") int id) {
        return reclamoRepository.findReclamosById(id);
    }

    @PostMapping
    public Reclamo addNewReclamo(@RequestBody Reclamo reclamo) {
        reclamo.setEstado("NUEVO");
        reclamo.setFechaCreacion(LocalDateTime.now());
        reclamoRepository.save(reclamo);
        return reclamo;
    }

    @PostMapping(path = "/aprobaciones/{id}")
    public Reclamo approveReclamo(@PathVariable(name = "id") int id) {
        Reclamo reclamo = reclamoRepository.findReclamosById(id);
        reclamo.setEstado("APROBADO");
        reclamoRepository.save(reclamo);
        return reclamo;
    }

    @PostMapping(path = "/rechazos/{id}")
    public Reclamo rejectReclamo(@PathVariable(name = "id") int id) {
        Reclamo reclamo = reclamoRepository.findReclamosById(id);
        reclamo.setEstado("RECHAZADO");
        reclamoRepository.save(reclamo);
        return reclamo;
    }

    @PostMapping(path = "/inspecciones/{id}")
    public Reclamo inspectReclamo(@PathVariable(name = "id") int id) {
        Reclamo reclamo = reclamoRepository.findReclamosById(id);
        reclamo.setEstado("PENDIENTE APROBACION");
        reclamoRepository.save(reclamo);
        return reclamo;
    }

    @GetMapping(path = "/viviente/{id}")
    public List<Reclamo> findReclamosByIdViviente(@PathVariable(name = "id") int id) {
        return reclamoRepository.findReclamosByVivienteId(id);
    }

}
