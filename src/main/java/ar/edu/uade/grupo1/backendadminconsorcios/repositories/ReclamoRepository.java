package ar.edu.uade.grupo1.backendadminconsorcios.repositories;

import ar.edu.uade.grupo1.backendadminconsorcios.models.Reclamo;
import ar.edu.uade.grupo1.backendadminconsorcios.models.Viviente;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ReclamoRepository extends CrudRepository <Reclamo, Integer> {

    Reclamo findReclamosById(int idReclamo);

    List<Reclamo> findReclamosByVivienteId(int idViviente);

    List<Reclamo> findReclamosByVivienteIdAndEstado(int idViviente, Optional<String> estado);

    List<Reclamo> findReclamosByAdministradorId(int idAdministrador);

    List<Reclamo> findReclamosByAdministradorIdAndEstado(int idAdministrador, Optional<String> estado);

    List<Reclamo> findReclamosByInspectorId(int idInspector);

    List<Reclamo> findReclamosByInspectorIdAndEstado(int idInspector, Optional<String> estado);
}