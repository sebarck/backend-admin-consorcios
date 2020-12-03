package ar.edu.uade.grupo1.backendadminconsorcios.controllers;

import ar.edu.uade.grupo1.backendadminconsorcios.models.Reclamo;
import ar.edu.uade.grupo1.backendadminconsorcios.repositories.ReclamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

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

    @PostMapping(path = "/aprobaciones/{idReclamo}")
    public Reclamo approveReclamo(@PathVariable(name = "idReclamo") int id, @RequestBody Reclamo newReclamo) {
        Reclamo reclamo = reclamoRepository.findReclamosById(id);
        reclamo.setNotas(newReclamo.getNotas());
        reclamo.setFechaResolucion(newReclamo.getFechaResolucion());
        reclamo.setEstado("APROBADO");
        reclamoRepository.save(reclamo);
        return reclamo;
    }

    @PostMapping(path = "/rechazos/{idReclamo}")
    public Reclamo rejectReclamo(@PathVariable(name = "idReclamo") int id, @RequestBody Reclamo newReclamo) {
        Reclamo reclamo = reclamoRepository.findReclamosById(id);
        reclamo.setNotas(newReclamo.getNotas());
        reclamo.setEstado("RECHAZADO");
        reclamoRepository.save(reclamo);
        return reclamo;
    }

    @PostMapping(path = "/inspecciones/{idReclamo}")
    public Reclamo inspectReclamo(@PathVariable(name = "idReclamo") int id, @RequestBody Reclamo newReclamo) {
        Reclamo reclamo = reclamoRepository.findReclamosById(id);
        reclamo.setevidencias(newReclamo.getevidencias());
        reclamo.setNotas(newReclamo.getNotas());
        reclamo.setEstado("VALIDADO");
        reclamoRepository.save(reclamo);
        return reclamo;
    }

    @GetMapping(path = "/viviente/{idViviente}")
    public List<Reclamo> findReclamosByIdViviente(
            @PathVariable(name = "idViviente") int id,
            @RequestParam (required = false) Optional<String> estado
    ) {
        if (estado.isPresent()) {
            return reclamoRepository.findReclamosByVivienteIdAndEstado(id, estado);
        } else {
            return reclamoRepository.findReclamosByVivienteId(id);
        }
    }

    @GetMapping(path = "/administrador/{idEdificio}")
    public List<Reclamo> findReclamosByIdEdificio(
            @PathVariable(name = "idEdificio") int idEdificio,
            @RequestParam (required = false) Optional<String> estado
    ) {
        if (estado.isPresent()) {
            return reclamoRepository.findReclamosByEdificioIdAndEstado(idEdificio, estado);
        } else {
            return reclamoRepository.findReclamosByEdificioId(idEdificio);
        }
    }

    @GetMapping(path = "/inspector/{idInspector}")
    public List<Reclamo> findReclamosByIdInspector(
            @PathVariable(name = "idInspector") int idInspector,
            @RequestParam (required = false) Optional<String> estado
    ) {
        if (estado.isPresent()) {
            return reclamoRepository.findReclamosByInspectorIdAndEstado(idInspector, estado);
        } else {
            return reclamoRepository.findReclamosByInspectorId(idInspector);
        }
    }



}
