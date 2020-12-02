package ar.edu.uade.grupo1.backendadminconsorcios.repositories;

import ar.edu.uade.grupo1.backendadminconsorcios.models.Viviente;
import org.springframework.data.repository.CrudRepository;

public interface VivienteRepository extends CrudRepository <Viviente, Integer> {

    Viviente findVivienteByUsuarioId(int idUsuario);
}
