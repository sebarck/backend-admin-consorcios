package ar.edu.uade.grupo1.backendadminconsorcios.repositories;

import ar.edu.uade.grupo1.backendadminconsorcios.models.Reclamo;
import ar.edu.uade.grupo1.backendadminconsorcios.models.Viviente;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReclamoRepository extends CrudRepository <Reclamo, Integer> {

    Reclamo findReclamosById(int idReclamo);

    List<Reclamo> findReclamosByVivienteId(int idViviente);
}