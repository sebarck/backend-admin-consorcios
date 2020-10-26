package ar.edu.uade.grupo1.backendadminconsorcios.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "propiedades")
public class Propiedad {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true)
    private int id;

    @JoinColumn(name = "id_edificio", nullable = false)
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Edificio edificio;

    @Column(name = "piso")
    private int piso;

    @Column(name = "unidad")
    private String unidad;

    @OneToMany(mappedBy = "propiedad", cascade = CascadeType.ALL)
    private List<Viviente> vivientes;

    @JoinColumn(name = "id_propietario", nullable = false)
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Propietario propietario;
}
