package ar.edu.uade.grupo1.backendadminconsorcios.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "administradores")
public class Administrador extends Persona {

    @OneToMany(mappedBy = "administrador", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Edificio> edificios;
}
