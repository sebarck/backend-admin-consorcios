package ar.edu.uade.grupo1.backendadminconsorcios.models;

import java.util.List;

public class Edificio {
    private String calle;
    private int altura;
    private String barrio;
    private String provincia;
    private String codigoPostal;
    private List<Propiedad> propiedades;
    private Administrador administrador;
}
