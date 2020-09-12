package ar.edu.uade.grupo1.backendadminconsorcios.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import java.util.List;

public class Propietario extends Persona {
    private ObjectId idPropietario;
    private List<Propiedad> propiedades;
}
