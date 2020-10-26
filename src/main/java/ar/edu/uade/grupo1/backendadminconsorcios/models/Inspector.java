package ar.edu.uade.grupo1.backendadminconsorcios.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "inspectores")
public class Inspector extends Persona {

    @Column(name = "especialidades")
    private String especialidades;

    @OneToMany(mappedBy = "inspector", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Edificio> edificios;
}
