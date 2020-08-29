package ar.edu.uade.grupo1.backendadminconsorcios.models;

import org.springframework.data.annotation.Id;
import java.util.List;

public class Propietario extends Persona {
    @Id private String idPropietario;
    private List<Propiedad> propiedades;
}
