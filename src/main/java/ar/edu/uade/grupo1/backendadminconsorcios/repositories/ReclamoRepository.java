package ar.edu.uade.grupo1.backendadminconsorcios.repositories;

import ar.edu.uade.grupo1.backendadminconsorcios.models.Reclamo;
import ar.edu.uade.grupo1.backendadminconsorcios.models.Viviente;
import org.springframework.data.repository.CrudRepository;

public interface ReclamoRepository extends CrudRepository <Reclamo, Integer> {

    Iterable<Reclamo> findReclamosByVivienteId(int idViviente);
}