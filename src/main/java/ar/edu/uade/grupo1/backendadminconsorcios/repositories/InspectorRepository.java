package ar.edu.uade.grupo1.backendadminconsorcios.repositories;

import ar.edu.uade.grupo1.backendadminconsorcios.models.Inspector;
import org.springframework.data.repository.CrudRepository;

public interface InspectorRepository extends CrudRepository <Inspector, Integer> {

    Inspector findInspectorByUsuarioId(int idUsuario);
}
