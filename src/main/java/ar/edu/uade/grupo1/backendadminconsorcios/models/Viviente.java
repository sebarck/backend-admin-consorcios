package ar.edu.uade.grupo1.backendadminconsorcios.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Viviente extends Persona {
    private ObjectId idViviente;
    private Propiedad propiedad;

}
