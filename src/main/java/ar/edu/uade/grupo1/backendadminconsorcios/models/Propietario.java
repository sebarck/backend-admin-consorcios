package ar.edu.uade.grupo1.backendadminconsorcios.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "propietarios")
public class Propietario extends Persona {

    @OneToMany(mappedBy = "propietario", cascade = CascadeType.ALL)
    private List<Propiedad> propiedades;

    @OneToMany(mappedBy = "propietario", cascade = CascadeType.ALL)
    private List<Reclamo> reclamos;
}
