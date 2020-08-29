package ar.edu.uade.grupo1.backendadminconsorcios.models;

import org.springframework.data.annotation.Id;

public class Viviente extends Persona {
    @Id private String idViviente;
    private Propiedad propiedad;

}
